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
import java.util.zip.CRC32;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;
import sign.signlink;

@OriginalClass("client")
public class client extends class3 {

    @OriginalMember(owner = "client", name = "M", descriptor = "[I")
    private int[] field179 = new int[5];

    @OriginalMember(owner = "client", name = "N", descriptor = "Ljava/lang/String;")
    private String field180 = "";

    @OriginalMember(owner = "client", name = "O", descriptor = "Ljava/lang/String;")
    private String field181 = "";

    @OriginalMember(owner = "client", name = "P", descriptor = "Z")
    private volatile boolean field182 = false;

    @OriginalMember(owner = "client", name = "S", descriptor = "Z")
    private boolean field185 = false;

    @OriginalMember(owner = "client", name = "W", descriptor = "I")
    private int field189 = 348;

    @OriginalMember(owner = "client", name = "db", descriptor = "[I")
    private int[] field196 = new int[50];

    @OriginalMember(owner = "client", name = "eb", descriptor = "B")
    private byte field197 = 21;

    @OriginalMember(owner = "client", name = "hb", descriptor = "[[I")
    private int[][] field200 = new int[104][104];

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field203 = 2;

    @OriginalMember(owner = "client", name = "lb", descriptor = "I")
    private int field204 = -1;

    @OriginalMember(owner = "client", name = "mb", descriptor = "[I")
    private int[] field205 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "ub", descriptor = "[[I")
    private int[][] field213 = new int[104][104];

    @OriginalMember(owner = "client", name = "vb", descriptor = "LGLMIQHJI;")
    private class21 field214 = class21.method232((byte) 0, 1);

    @OriginalMember(owner = "client", name = "xb", descriptor = "Z")
    private boolean field216 = false;

    @OriginalMember(owner = "client", name = "yb", descriptor = "LVLLJSJTJ;")
    private class54 field217 = new class54((byte) 3);

    @OriginalMember(owner = "client", name = "zb", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field218 = new CRC32();

    @OriginalMember(owner = "client", name = "Ab", descriptor = "[B")
    private byte[] field219 = new byte[16384];

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field220 = -1;

    @OriginalMember(owner = "client", name = "Cb", descriptor = "I")
    private int field221 = -558;

    @OriginalMember(owner = "client", name = "Db", descriptor = "[I")
    private int[] field222 = new int[151];

    @OriginalMember(owner = "client", name = "Kb", descriptor = "Z")
    private boolean field229 = false;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "Z")
    private boolean field238 = false;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "Z")
    private boolean field240 = false;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field242 = 3;

    @OriginalMember(owner = "client", name = "ac", descriptor = "B")
    private byte field245 = 4;

    @OriginalMember(owner = "client", name = "cc", descriptor = "Z")
    private boolean field247 = false;

    @OriginalMember(owner = "client", name = "nc", descriptor = "I")
    private int field258 = -16642;

    @OriginalMember(owner = "client", name = "oc", descriptor = "Z")
    private boolean field259 = false;

    @OriginalMember(owner = "client", name = "pc", descriptor = "[LVUMXQDFQ;")
    private class57[] field260 = new class57[13];

    @OriginalMember(owner = "client", name = "rc", descriptor = "I")
    private int field262 = -1;

    @OriginalMember(owner = "client", name = "yc", descriptor = "LGLMIQHJI;")
    private class21 field269 = class21.method232((byte) 0, 1);

    @OriginalMember(owner = "client", name = "zc", descriptor = "[I")
    private int[] field270 = new int[100];

    @OriginalMember(owner = "client", name = "Ac", descriptor = "[Ljava/lang/String;")
    private String[] field271 = new String[100];

    @OriginalMember(owner = "client", name = "Bc", descriptor = "[Ljava/lang/String;")
    private String[] field272 = new String[100];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "I")
    private int field273 = 19571;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "Z")
    public boolean field275 = true;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "I")
    private int field284 = -1;

    @OriginalMember(owner = "client", name = "Sc", descriptor = "Z")
    private volatile boolean field289 = false;

    @OriginalMember(owner = "client", name = "Tc", descriptor = "I")
    private int field290 = -1;

    @OriginalMember(owner = "client", name = "Xc", descriptor = "Ljava/lang/String;")
    private String field294 = "";

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field295 = -1;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "[Ljava/lang/String;")
    private String[] field296 = new String[5];

    @OriginalMember(owner = "client", name = "ad", descriptor = "[Z")
    private boolean[] field297 = new boolean[5];

    @OriginalMember(owner = "client", name = "fd", descriptor = "I")
    private int field302 = 128;

    @OriginalMember(owner = "client", name = "jd", descriptor = "I")
    private final int field306 = 100;

    @OriginalMember(owner = "client", name = "kd", descriptor = "[I")
    private int[] field307 = new int[100];

    @OriginalMember(owner = "client", name = "ld", descriptor = "[[I")
    private int[][] field308 = new int[104][104];

    @OriginalMember(owner = "client", name = "md", descriptor = "Ljava/lang/String;")
    private String field309 = "";

    @OriginalMember(owner = "client", name = "nd", descriptor = "Ljava/lang/String;")
    private String field310 = "";

    @OriginalMember(owner = "client", name = "rd", descriptor = "I")
    private int field314 = 2;

    @OriginalMember(owner = "client", name = "vd", descriptor = "[I")
    private int[] field318 = new int[1000];

    @OriginalMember(owner = "client", name = "wd", descriptor = "[I")
    private int[] field319 = new int[1000];

    @OriginalMember(owner = "client", name = "xd", descriptor = "[I")
    private int[] field320 = new int[50];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field323 = true;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Z")
    private volatile boolean field324 = false;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "[J")
    private long[] field330 = new long[100];

    @OriginalMember(owner = "client", name = "Ld", descriptor = "Z")
    private boolean field334 = false;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "LGLMIQHJI;")
    private class21 field338 = class21.method232((byte) 0, 1);

    @OriginalMember(owner = "client", name = "Sd", descriptor = "Z")
    private boolean field341 = false;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Z")
    private boolean field342 = false;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "[I")
    private int[] field343 = new int[200];

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field345 = 1;

    @OriginalMember(owner = "client", name = "de", descriptor = "LVLLJSJTJ;")
    private class54 field352 = new class54((byte) 3);

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private int[] field353 = new int[class67.field1656];

    @OriginalMember(owner = "client", name = "ge", descriptor = "[LINVDQNJU;")
    private class26[] field355 = new class26[100];

    @OriginalMember(owner = "client", name = "me", descriptor = "Z")
    private boolean field361 = false;

    @OriginalMember(owner = "client", name = "ne", descriptor = "[I")
    private int[] field362 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "oe", descriptor = "[I")
    private int[] field363 = new int[151];

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field364 = 7759444;

    @OriginalMember(owner = "client", name = "se", descriptor = "[I")
    private int[] field367 = new int[33];

    @OriginalMember(owner = "client", name = "xe", descriptor = "Z")
    private boolean field372 = false;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    private int field373 = 5063219;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "I")
    private int field377 = -73;

    @OriginalMember(owner = "client", name = "De", descriptor = "Ljava/lang/String;")
    private String field378 = "";

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field379 = 926;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "[LINVDQNJU;")
    private class26[] field381 = new class26[20];

    @OriginalMember(owner = "client", name = "Pe", descriptor = "B")
    private byte field390 = 2;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field391 = 2048;

    @OriginalMember(owner = "client", name = "Re", descriptor = "I")
    private int field392 = 2047;

    @OriginalMember(owner = "client", name = "Se", descriptor = "[LPASMQFXV;")
    private class43[] field393 = new class43[this.field391];

    @OriginalMember(owner = "client", name = "Ue", descriptor = "[I")
    public int[] field395 = new int[this.field391];

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field397 = new int[this.field391];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[LGLMIQHJI;")
    private class21[] field398 = new class21[this.field391];

    @OriginalMember(owner = "client", name = "Ze", descriptor = "[I")
    private int[] field400 = new int[class67.field1656];

    @OriginalMember(owner = "client", name = "af", descriptor = "[I")
    private int[] field401 = new int[33];

    @OriginalMember(owner = "client", name = "bf", descriptor = "LVLLJSJTJ;")
    private class54 field402 = new class54((byte) 3);

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    private int field403 = 78;

    @OriginalMember(owner = "client", name = "ef", descriptor = "B")
    private byte field405 = 6;

    @OriginalMember(owner = "client", name = "ff", descriptor = "[I")
    private int[] field406 = new int[5];

    @OriginalMember(owner = "client", name = "of", descriptor = "Z")
    private boolean field414 = false;

    @OriginalMember(owner = "client", name = "qf", descriptor = "Z")
    private boolean field416 = false;

    @OriginalMember(owner = "client", name = "zf", descriptor = "I")
    private int field425 = -1;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field426 = -1;

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field427 = -1;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "B")
    private byte field430 = -86;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "Z")
    private boolean field432 = false;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "Z")
    private boolean field433 = true;

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[I")
    private int[] field436 = new int[256];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "I")
    private int field437 = 32009;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "LGLMIQHJI;")
    private class21 field438 = new class21(new byte[5000], -49015);

    @OriginalMember(owner = "client", name = "Nf", descriptor = "[LQDXHSLSL;")
    private class46[] field439 = new class46[16384];

    @OriginalMember(owner = "client", name = "Pf", descriptor = "[I")
    public int[] field441 = new int[16384];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[LVUMXQDFQ;")
    private class57[] field446 = new class57[100];

    @OriginalMember(owner = "client", name = "Vf", descriptor = "Z")
    private boolean field447 = false;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "B")
    private byte field450 = 3;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field451 = -1;

    @OriginalMember(owner = "client", name = "bg", descriptor = "[LEMCOJCFH;")
    private class14[] field453 = new class14[4];

    @OriginalMember(owner = "client", name = "cg", descriptor = "Z")
    public boolean field454 = false;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[LVUMXQDFQ;")
    private class57[] field456 = new class57[2];

    @OriginalMember(owner = "client", name = "pg", descriptor = "[I")
    private int[] field467 = new int[2000];

    @OriginalMember(owner = "client", name = "qg", descriptor = "[[[I")
    private int[][][] field468 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "sg", descriptor = "I")
    private int field470 = 1;

    @OriginalMember(owner = "client", name = "tg", descriptor = "[I")
    private int[] field471 = new int[500];

    @OriginalMember(owner = "client", name = "ug", descriptor = "[I")
    private int[] field472 = new int[500];

    @OriginalMember(owner = "client", name = "vg", descriptor = "[I")
    private int[] field473 = new int[500];

    @OriginalMember(owner = "client", name = "wg", descriptor = "[I")
    private int[] field474 = new int[500];

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field476 = 504;

    @OriginalMember(owner = "client", name = "zg", descriptor = "B")
    private byte field477 = 6;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "Z")
    private boolean field479 = true;

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[Ljava/lang/String;")
    private String[] field486 = new String[200];

    @OriginalMember(owner = "client", name = "Lg", descriptor = "B")
    private byte field489 = -50;

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[I")
    private int[] field490 = new int[5];

    @OriginalMember(owner = "client", name = "Ng", descriptor = "[I")
    private int[] field491 = new int[9];

    @OriginalMember(owner = "client", name = "Og", descriptor = "[I")
    public int[] field492 = new int[2000];

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field493 = -47865;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "I")
    private int field494 = -1;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "Ljava/lang/String;")
    private String field500 = "";

    @OriginalMember(owner = "client", name = "Zg", descriptor = "I")
    private int field503 = 5;

    @OriginalMember(owner = "client", name = "lh", descriptor = "B")
    private byte field515 = 68;

    @OriginalMember(owner = "client", name = "mh", descriptor = "[I")
    private int[] field516 = new int[5];

    @OriginalMember(owner = "client", name = "nh", descriptor = "Z")
    private boolean field517 = false;

    @OriginalMember(owner = "client", name = "ph", descriptor = "I")
    private int field519 = 2;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    public int[] field527 = new int[1000];

    @OriginalMember(owner = "client", name = "Bh", descriptor = "Ljava/lang/String;")
    private String field531 = "";

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field532 = 3353893;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "B")
    private byte field534 = -13;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "Z")
    private boolean field535 = false;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "[LINVDQNJU;")
    private class26[] field539 = new class26[20];

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field543 = -1;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "Z")
    private boolean field544 = false;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "[J")
    private long[] field550 = new long[200];

    @OriginalMember(owner = "client", name = "Xh", descriptor = "[[[LVLLJSJTJ;")
    private class54[][][] field553 = new class54[4][104][104];

    @OriginalMember(owner = "client", name = "Yh", descriptor = "Z")
    private boolean field554 = true;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field557 = 2;

    @OriginalMember(owner = "client", name = "ci", descriptor = "I")
    private int field558 = 1;

    @OriginalMember(owner = "client", name = "di", descriptor = "B")
    private byte field559 = 39;

    @OriginalMember(owner = "client", name = "ji", descriptor = "Z")
    private boolean field565 = false;

    @OriginalMember(owner = "client", name = "mi", descriptor = "Z")
    private boolean field568 = true;

    @OriginalMember(owner = "client", name = "oi", descriptor = "[I")
    private final int[] field570 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "pi", descriptor = "Z")
    private boolean field571 = false;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field582 = -1;

    @OriginalMember(owner = "client", name = "Di", descriptor = "[I")
    private int[] field585 = new int[5];

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field586 = 2;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field587 = 7;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Z")
    private boolean field592 = false;

    @OriginalMember(owner = "client", name = "Li", descriptor = "Ljava/lang/String;")
    private String field593 = "";

    @OriginalMember(owner = "client", name = "Mi", descriptor = "[LVSBCWAVP;")
    public class56[] field594 = new class56[5];

    @OriginalMember(owner = "client", name = "Ni", descriptor = "[I")
    private int[] field595 = new int[4000];

    @OriginalMember(owner = "client", name = "Oi", descriptor = "[I")
    private int[] field596 = new int[4000];

    @OriginalMember(owner = "client", name = "Pi", descriptor = "[I")
    private int[] field597 = new int[50];

    @OriginalMember(owner = "client", name = "Qi", descriptor = "[Z")
    private boolean[] field598 = new boolean[5];

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field605 = 2301979;

    @OriginalMember(owner = "client", name = "Yi", descriptor = "Z")
    private boolean field606 = false;

    @OriginalMember(owner = "client", name = "Zi", descriptor = "Z")
    private boolean field607 = false;

    @OriginalMember(owner = "client", name = "aj", descriptor = "[I")
    private int[] field608 = new int[class67.field1656];

    @OriginalMember(owner = "client", name = "dj", descriptor = "Z")
    private boolean field611 = false;

    @OriginalMember(owner = "client", name = "ej", descriptor = "I")
    private int field612 = -1;

    @OriginalMember(owner = "client", name = "mj", descriptor = "B")
    private byte field620 = 116;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private int field622 = 68;

    @OriginalMember(owner = "client", name = "pj", descriptor = "LUSEDZXXV;")
    private class52 field623 = new class52();

    @OriginalMember(owner = "client", name = "qj", descriptor = "Z")
    private boolean field624 = true;

    @OriginalMember(owner = "client", name = "tj", descriptor = "[LINVDQNJU;")
    private class26[] field627 = new class26[1000];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[LINVDQNJU;")
    private class26[] field628 = new class26[8];

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field629 = 9;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field633 = 50;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "[I")
    private int[] field634 = new int[this.field633];

    @OriginalMember(owner = "client", name = "Bj", descriptor = "[I")
    private int[] field635 = new int[this.field633];

    @OriginalMember(owner = "client", name = "Cj", descriptor = "[I")
    private int[] field636 = new int[this.field633];

    @OriginalMember(owner = "client", name = "Dj", descriptor = "[I")
    private int[] field637 = new int[this.field633];

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[I")
    private int[] field638 = new int[this.field633];

    @OriginalMember(owner = "client", name = "Fj", descriptor = "[I")
    private int[] field639 = new int[this.field633];

    @OriginalMember(owner = "client", name = "Gj", descriptor = "[I")
    private int[] field640 = new int[this.field633];

    @OriginalMember(owner = "client", name = "Hj", descriptor = "[Ljava/lang/String;")
    private String[] field641 = new String[this.field633];

    @OriginalMember(owner = "client", name = "Jj", descriptor = "[Ljava/lang/String;")
    private String[] field643 = new String[500];

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[I")
    private int[] field644 = new int[7];

    @OriginalMember(owner = "client", name = "tb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field212 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private static int field230 = 10;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "Z")
    private static boolean field232 = true;

    @OriginalMember(owner = "client", name = "hc", descriptor = "Ljava/lang/String;")
    private static String field252 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";

    @OriginalMember(owner = "client", name = "qc", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field261 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");

    @OriginalMember(owner = "client", name = "Wc", descriptor = "B")
    private static byte field293 = 64;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[I")
    public static final int[] field315 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[I")
    private static int[] field346 = new int[99];

    @OriginalMember(owner = "client", name = "pf", descriptor = "[[I")
    public static final int[][] field415;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "I")
    private static int field533;

    @OriginalMember(owner = "client", name = "li", descriptor = "I")
    private static int field567;

    @OriginalMember(owner = "client", name = "ni", descriptor = "[I")
    public static int[] field569;

    @OriginalMember(owner = "client", name = "K", descriptor = "I")
    private static int field177;

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field178;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client", name = "U", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "V", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field190;

    @OriginalMember(owner = "client", name = "bb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "fb", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private static int field201;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "ob", descriptor = "I")
    private int field207;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "rb", descriptor = "I")
    private int field210;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field228;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    public static int field231;

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    public static int field234;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field239;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field243;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client", name = "bc", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client", name = "gc", descriptor = "I")
    private int field251;

    @OriginalMember(owner = "client", name = "lc", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "sc", descriptor = "I")
    private int field263;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private static int field274;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private static int field277;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field278;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field279;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "I")
    private static int field286;

    @OriginalMember(owner = "client", name = "Qc", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field288;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private static int field298;

    @OriginalMember(owner = "client", name = "ed", descriptor = "I")
    private static int field301;

    @OriginalMember(owner = "client", name = "gd", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client", name = "hd", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client", name = "id", descriptor = "I")
    private int field305;

    @OriginalMember(owner = "client", name = "qd", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client", name = "td", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client", name = "ud", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client", name = "yd", descriptor = "I")
    private int field321;

    @OriginalMember(owner = "client", name = "zd", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    public static int field332;

    @OriginalMember(owner = "client", name = "Kd", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "Md", descriptor = "I")
    private static int field335;

    @OriginalMember(owner = "client", name = "Nd", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private int field337;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "I")
    private int field339;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "I")
    private int field340;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private static int field354;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client", name = "ie", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client", name = "ke", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client", name = "le", descriptor = "I")
    private int field360;

    @OriginalMember(owner = "client", name = "qe", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field369;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private int field371;

    @OriginalMember(owner = "client", name = "ze", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client", name = "Be", descriptor = "I")
    private int field376;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "I")
    private int field380;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "Le", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "Me", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client", name = "Te", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private static int field408;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field409;

    @OriginalMember(owner = "client", name = "lf", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client", name = "mf", descriptor = "I")
    private int field412;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "rf", descriptor = "I")
    private int field417;

    @OriginalMember(owner = "client", name = "sf", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client", name = "tf", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client", name = "uf", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client", name = "Df", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "If", descriptor = "I")
    private static int field434;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "Of", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private int field469;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "I")
    public int field481;

    @OriginalMember(owner = "client", name = "Eg", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client", name = "Fg", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client", name = "Gg", descriptor = "I")
    private int field484;

    @OriginalMember(owner = "client", name = "Hg", descriptor = "I")
    private static int field485;

    @OriginalMember(owner = "client", name = "Jg", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client", name = "Kg", descriptor = "I")
    private static int field488;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field498;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private int field499;

    @OriginalMember(owner = "client", name = "Xg", descriptor = "I")
    private int field501;

    @OriginalMember(owner = "client", name = "Yg", descriptor = "I")
    private static int field502;

    @OriginalMember(owner = "client", name = "jh", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "kh", descriptor = "I")
    private int field514;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "vh", descriptor = "I")
    private static int field525;

    @OriginalMember(owner = "client", name = "wh", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client", name = "yh", descriptor = "I")
    public int field528;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    public int field529;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "I")
    private static int field530;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field541;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field549;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "Wh", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client", name = "ai", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client", name = "ti", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client", name = "ui", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "vi", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client", name = "wi", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field579;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private static int field584;

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private static int field589;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "I")
    private static int field599;

    @OriginalMember(owner = "client", name = "Si", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client", name = "Ti", descriptor = "I")
    private int field601;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "I")
    private int field603;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client", name = "fj", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client", name = "jj", descriptor = "I")
    private static int field617;

    @OriginalMember(owner = "client", name = "rj", descriptor = "I")
    private int field625;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field626;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field632;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field642;

    @OriginalMember(owner = "client", name = "Pj", descriptor = "I")
    public static int field649;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "J")
    public long field241;

    @OriginalMember(owner = "client", name = "gf", descriptor = "J")
    private long field407;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "J")
    private long field536;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "J")
    private long field538;

    @OriginalMember(owner = "client", name = "bj", descriptor = "J")
    private long field609;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "LDBRMEPJQ;")
    private class11 field442;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "LDBRMEPJQ;")
    private class11 field443;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "LDBRMEPJQ;")
    private class11 field444;

    @OriginalMember(owner = "client", name = "Tf", descriptor = "LDBRMEPJQ;")
    private class11 field445;

    @OriginalMember(owner = "client", name = "ic", descriptor = "LINVDQNJU;")
    private class26 field253;

    @OriginalMember(owner = "client", name = "tc", descriptor = "LINVDQNJU;")
    private class26 field264;

    @OriginalMember(owner = "client", name = "uc", descriptor = "LINVDQNJU;")
    private class26 field265;

    @OriginalMember(owner = "client", name = "vc", descriptor = "LINVDQNJU;")
    private class26 field266;

    @OriginalMember(owner = "client", name = "wc", descriptor = "LINVDQNJU;")
    private class26 field267;

    @OriginalMember(owner = "client", name = "xc", descriptor = "LINVDQNJU;")
    private class26 field268;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "LINVDQNJU;")
    private class26 field291;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "LINVDQNJU;")
    private class26 field292;

    @OriginalMember(owner = "client", name = "wf", descriptor = "LINVDQNJU;")
    private class26 field422;

    @OriginalMember(owner = "client", name = "xf", descriptor = "LINVDQNJU;")
    private class26 field423;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "LINVDQNJU;")
    private class26 field542;

    @OriginalMember(owner = "client", name = "kj", descriptor = "LINVDQNJU;")
    private class26 field618;

    @OriginalMember(owner = "client", name = "lj", descriptor = "LINVDQNJU;")
    private class26 field619;

    @OriginalMember(owner = "client", name = "nj", descriptor = "LINVDQNJU;")
    private class26 field621;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LLJVKCVYD;")
    private class34 field431;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LLNOSHUMO;")
    private class35 field195;

    @OriginalMember(owner = "client", name = "Y", descriptor = "LNUXCAHZM;")
    private class41 field191;

    @OriginalMember(owner = "client", name = "Z", descriptor = "LNUXCAHZM;")
    private class41 field192;

    @OriginalMember(owner = "client", name = "ab", descriptor = "LNUXCAHZM;")
    private class41 field193;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "LNUXCAHZM;")
    private class41 field348;

    @OriginalMember(owner = "client", name = "ae", descriptor = "LNUXCAHZM;")
    private class41 field349;

    @OriginalMember(owner = "client", name = "be", descriptor = "LNUXCAHZM;")
    private class41 field350;

    @OriginalMember(owner = "client", name = "ce", descriptor = "LNUXCAHZM;")
    private class41 field351;

    @OriginalMember(owner = "client", name = "fg", descriptor = "LNUXCAHZM;")
    private class41 field457;

    @OriginalMember(owner = "client", name = "gg", descriptor = "LNUXCAHZM;")
    private class41 field458;

    @OriginalMember(owner = "client", name = "hg", descriptor = "LNUXCAHZM;")
    private class41 field459;

    @OriginalMember(owner = "client", name = "ig", descriptor = "LNUXCAHZM;")
    private class41 field460;

    @OriginalMember(owner = "client", name = "jg", descriptor = "LNUXCAHZM;")
    private class41 field461;

    @OriginalMember(owner = "client", name = "kg", descriptor = "LNUXCAHZM;")
    private class41 field462;

    @OriginalMember(owner = "client", name = "lg", descriptor = "LNUXCAHZM;")
    private class41 field463;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LNUXCAHZM;")
    private class41 field464;

    @OriginalMember(owner = "client", name = "ng", descriptor = "LNUXCAHZM;")
    private class41 field465;

    @OriginalMember(owner = "client", name = "ah", descriptor = "LNUXCAHZM;")
    private class41 field504;

    @OriginalMember(owner = "client", name = "bh", descriptor = "LNUXCAHZM;")
    private class41 field505;

    @OriginalMember(owner = "client", name = "ch", descriptor = "LNUXCAHZM;")
    private class41 field506;

    @OriginalMember(owner = "client", name = "dh", descriptor = "LNUXCAHZM;")
    private class41 field507;

    @OriginalMember(owner = "client", name = "eh", descriptor = "LNUXCAHZM;")
    private class41 field508;

    @OriginalMember(owner = "client", name = "fh", descriptor = "LNUXCAHZM;")
    private class41 field509;

    @OriginalMember(owner = "client", name = "gh", descriptor = "LNUXCAHZM;")
    private class41 field510;

    @OriginalMember(owner = "client", name = "hh", descriptor = "LNUXCAHZM;")
    private class41 field511;

    @OriginalMember(owner = "client", name = "ih", descriptor = "LNUXCAHZM;")
    private class41 field512;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "LPASMQFXV;")
    public static class43 field588;

    @OriginalMember(owner = "client", name = "nb", descriptor = "LQLFNWQSF;")
    private class47 field206;

    @OriginalMember(owner = "client", name = "dc", descriptor = "LVUMXQDFQ;")
    private class57 field248;

    @OriginalMember(owner = "client", name = "ec", descriptor = "LVUMXQDFQ;")
    private class57 field249;

    @OriginalMember(owner = "client", name = "fc", descriptor = "LVUMXQDFQ;")
    private class57 field250;

    @OriginalMember(owner = "client", name = "od", descriptor = "LVUMXQDFQ;")
    private class57 field311;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LVUMXQDFQ;")
    private class57 field312;

    @OriginalMember(owner = "client", name = "He", descriptor = "LVUMXQDFQ;")
    private class57 field382;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "LVUMXQDFQ;")
    private class57 field383;

    @OriginalMember(owner = "client", name = "Je", descriptor = "LVUMXQDFQ;")
    private class57 field384;

    @OriginalMember(owner = "client", name = "qh", descriptor = "LVUMXQDFQ;")
    private class57 field520;

    @OriginalMember(owner = "client", name = "rh", descriptor = "LVUMXQDFQ;")
    private class57 field521;

    @OriginalMember(owner = "client", name = "sh", descriptor = "LVUMXQDFQ;")
    private class57 field522;

    @OriginalMember(owner = "client", name = "th", descriptor = "LVUMXQDFQ;")
    private class57 field523;

    @OriginalMember(owner = "client", name = "uh", descriptor = "LVUMXQDFQ;")
    private class57 field524;

    @OriginalMember(owner = "client", name = "ei", descriptor = "LVUMXQDFQ;")
    private class57 field560;

    @OriginalMember(owner = "client", name = "fi", descriptor = "LVUMXQDFQ;")
    private class57 field561;

    @OriginalMember(owner = "client", name = "gi", descriptor = "LVUMXQDFQ;")
    private class57 field562;

    @OriginalMember(owner = "client", name = "hi", descriptor = "LVUMXQDFQ;")
    private class57 field563;

    @OriginalMember(owner = "client", name = "ii", descriptor = "LVUMXQDFQ;")
    private class57 field564;

    @OriginalMember(owner = "client", name = "wj", descriptor = "LVUMXQDFQ;")
    private class57 field630;

    @OriginalMember(owner = "client", name = "xj", descriptor = "LVUMXQDFQ;")
    private class57 field631;

    @OriginalMember(owner = "client", name = "xg", descriptor = "LWTODRXXL;")
    public class61 field475;

    @OriginalMember(owner = "client", name = "ag", descriptor = "LXRWUKRPO;")
    private class65 field452;

    @OriginalMember(owner = "client", name = "gb", descriptor = "LBPJMPIUS;")
    private class6 field199;

    @OriginalMember(owner = "client", name = "sb", descriptor = "Ljava/lang/String;")
    public String field211;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "Ljava/lang/String;")
    private String field223;

    @OriginalMember(owner = "client", name = "re", descriptor = "Ljava/lang/String;")
    private String field366;

    @OriginalMember(owner = "client", name = "vf", descriptor = "Ljava/lang/String;")
    public String field421;

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Ljava/net/Socket;")
    private Socket field448;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "Z")
    private static boolean field233;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "Z")
    private static boolean field329;

    @OriginalMember(owner = "client", name = "df", descriptor = "Z")
    public static boolean field404;

    @OriginalMember(owner = "client", name = "ki", descriptor = "Z")
    public static boolean field566;

    @OriginalMember(owner = "client", name = "cj", descriptor = "Z")
    private static boolean field610;

    @OriginalMember(owner = "client", name = "jc", descriptor = "[I")
    private int[] field254;

    @OriginalMember(owner = "client", name = "kc", descriptor = "[I")
    private int[] field255;

    @OriginalMember(owner = "client", name = "cd", descriptor = "[I")
    private int[] field299;

    @OriginalMember(owner = "client", name = "dd", descriptor = "[I")
    private int[] field300;

    @OriginalMember(owner = "client", name = "qi", descriptor = "[I")
    private int[] field572;

    @OriginalMember(owner = "client", name = "ri", descriptor = "[I")
    private int[] field573;

    @OriginalMember(owner = "client", name = "si", descriptor = "[I")
    private int[] field574;

    @OriginalMember(owner = "client", name = "gj", descriptor = "[I")
    private int[] field614;

    @OriginalMember(owner = "client", name = "hj", descriptor = "[I")
    private int[] field615;

    @OriginalMember(owner = "client", name = "ij", descriptor = "[I")
    private int[] field616;

    @OriginalMember(owner = "client", name = "Lj", descriptor = "[I")
    private int[] field645;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[I")
    private int[] field646;

    @OriginalMember(owner = "client", name = "Nj", descriptor = "[I")
    private int[] field647;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "[I")
    private int[] field648;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "[LVUMXQDFQ;")
    private class57[] field478;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[[B")
    private byte[][] field257;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "[[B")
    private byte[][] field347;

    @OriginalMember(owner = "client", name = "kf", descriptor = "[[[B")
    private byte[][][] field410;

    @OriginalMember(owner = "client", name = "Oc", descriptor = "[[[I")
    private int[][][] field285;

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field230 = Integer.parseInt(this.getParameter("nodeid"));
        field231 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method89(0);
        } else {
            method42(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field232 = false;
        } else {
            field232 = true;
        }
        this.method15(765, field293, 503);
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)V")
    public final void method32(boolean arg0) {
        int var2 = this.field545 * 128 + 64;
        int var3 = this.field546 * 128 + 64;
        int var4 = this.method119(var3, this.field581, var2, -23) - this.field547;
        if (this.field224 < var2) {
            this.field224 += (var2 - this.field224) * this.field549 / 1000 + this.field548;
            if (this.field224 > var2) {
                this.field224 = var2;
            }
        }
        if (this.field224 > var2) {
            this.field224 -= (this.field224 - var2) * this.field549 / 1000 + this.field548;
            if (this.field224 < var2) {
                this.field224 = var2;
            }
        }
        if (this.field225 < var4) {
            this.field225 += (var4 - this.field225) * this.field549 / 1000 + this.field548;
            if (this.field225 > var4) {
                this.field225 = var4;
            }
        }
        if (this.field225 > var4) {
            this.field225 -= (this.field225 - var4) * this.field549 / 1000 + this.field548;
            if (this.field225 < var4) {
                this.field225 = var4;
            }
        }
        if (this.field226 < var3) {
            this.field226 += (var3 - this.field226) * this.field549 / 1000 + this.field548;
            if (this.field226 > var3) {
                this.field226 = var3;
            }
        }
        if (this.field226 > var3) {
            this.field226 -= (this.field226 - var3) * this.field549 / 1000 + this.field548;
            if (this.field226 < var3) {
                this.field226 = var3;
            }
        }
        int var5 = this.field576 * 128 + 64;
        int var6 = this.field577 * 128 + 64;
        int var7 = this.method119(var6, this.field581, var5, -23) - this.field578;
        int var8 = var5 - this.field224;
        int var9 = var7 - this.field225;
        int var10 = var6 - this.field226;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        if (arg0) {
            this.field386 = -1;
        }
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field227 < var12) {
            this.field227 += (var12 - this.field227) * this.field580 / 1000 + this.field579;
            if (this.field227 > var12) {
                this.field227 = var12;
            }
        }
        if (this.field227 > var12) {
            this.field227 -= (this.field227 - var12) * this.field580 / 1000 + this.field579;
            if (this.field227 < var12) {
                this.field227 = var12;
            }
        }
        int var14 = var13 - this.field228;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field228 += this.field580 * var14 / 1000 + this.field579;
            this.field228 &= 2047;
        }
        if (var14 < 0) {
            this.field228 -= -var14 * this.field580 / 1000 + this.field579;
            this.field228 &= 2047;
        }
        int var15 = var13 - this.field228;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field228 = var13;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method33(long arg0, boolean arg1) {
        if (!arg1) {
            this.field375 = !this.field375;
        }
        if (arg0 != 0L) {
            if (this.field183 >= 100 && this.field613 != 1) {
                this.method155(true, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
            } else if (this.field183 >= 200) {
                this.method155(true, "Your friendlist is full. Max of 100 for free users, and 200 for members", "", 0);
            } else {
                String var4 = class70.method587(class70.method584(arg0, 803), true);
                for (int var5 = 0; var5 < this.field183; ++var5) {
                    if (this.field550[var5] == arg0) {
                        this.method155(true, var4 + " is already on your friend list", "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field194; ++var6) {
                    if (this.field330[var6] == arg0) {
                        this.method155(true, "Please remove " + var4 + " from your ignore list first", "", 0);
                        return;
                    }
                }
                if (!var4.equals(field588.field1094)) {
                    this.field486[this.field183] = var4;
                    this.field550[this.field183] = arg0;
                    this.field343[this.field183] = 0;
                    ++this.field183;
                    this.field447 = true;
                    this.field214.method233(77, 0);
                    this.field214.method240(arg0, 7);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)V")
    public final void method34(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field272[var5] != null) {
                int var6 = this.field270[var5];
                int var7 = 70 - var4 * 14 + this.field186 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field271[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field552 == 0 || this.field552 == 1 && this.method56(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7 && !var8.equals(field588.field1094)) {
                        if (this.field337 >= 1) {
                            this.field643[this.field551] = "Report abuse @whi@" + var8;
                            this.field473[this.field551] = 811;
                            ++this.field551;
                        }
                        this.field643[this.field551] = "Add ignore @whi@" + var8;
                        this.field473[this.field551] = 694;
                        ++this.field551;
                        this.field643[this.field551] = "Add friend @whi@" + var8;
                        this.field473[this.field551] = 730;
                        ++this.field551;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field288 == 0 && (var6 == 7 || this.field380 == 0 || this.field380 == 1 && this.method56(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        if (this.field337 >= 1) {
                            this.field643[this.field551] = "Report abuse @whi@" + var8;
                            this.field473[this.field551] = 811;
                            ++this.field551;
                        }
                        this.field643[this.field551] = "Add ignore @whi@" + var8;
                        this.field473[this.field551] = 694;
                        ++this.field551;
                        this.field643[this.field551] = "Add friend @whi@" + var8;
                        this.field473[this.field551] = 730;
                        ++this.field551;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field278 == 0 || this.field278 == 1 && this.method56(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field643[this.field551] = "Accept trade @whi@" + var8;
                        this.field473[this.field551] = 757;
                        ++this.field551;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field288 == 0 && this.field380 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field278 == 0 || this.field278 == 1 && this.method56(var8, false))) {
                    if (arg1 > var7 - 14 && arg1 <= var7) {
                        this.field643[this.field551] = "Accept challenge @whi@" + var8;
                        this.field473[this.field551] = 709;
                        ++this.field551;
                    }
                    ++var4;
                }
            }
        }
        if (arg2 != 0) {
            this.field273 = this.field199.method29();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BI)V")
    public final void method35(byte arg0, int arg1) {
        int var3 = class4.field95[arg1].field103;
        if (arg0 != 2) {
            this.field341 = !this.field341;
        }
        if (var3 != 0) {
            int var4 = this.field492[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class9.method181(0.9D, true);
                }
                if (var4 == 2) {
                    class9.method181(0.8D, true);
                }
                if (var4 == 3) {
                    class9.method181(0.7D, true);
                }
                if (var4 == 4) {
                    class9.method181(0.6D, true);
                }
                class2.field38.method287();
                this.field247 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field568;
                if (var4 == 0) {
                    this.method76(this.field568, (byte) 2, 0);
                    this.field568 = true;
                }
                if (var4 == 1) {
                    this.method76(this.field568, (byte) 2, -400);
                    this.field568 = true;
                }
                if (var4 == 2) {
                    this.method76(this.field568, (byte) 2, -800);
                    this.field568 = true;
                }
                if (var4 == 3) {
                    this.method76(this.field568, (byte) 2, -1200);
                    this.field568 = true;
                }
                if (var4 == 4) {
                    this.field568 = false;
                }
                if (this.field568 != var5 && !field233) {
                    if (this.field568) {
                        this.field322 = this.field204;
                        this.field323 = true;
                        this.field195.method365(2, this.field322);
                    } else {
                        this.method109(7);
                    }
                    this.field244 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field624 = true;
                    this.method69(15546, 0);
                }
                if (var4 == 1) {
                    this.field624 = true;
                    this.method69(15546, -400);
                }
                if (var4 == 2) {
                    this.field624 = true;
                    this.method69(15546, -800);
                }
                if (var4 == 3) {
                    this.field624 = true;
                    this.method69(15546, -1200);
                }
                if (var4 == 4) {
                    this.field624 = false;
                }
            }
            if (var3 == 5) {
                this.field333 = var4;
            }
            if (var3 == 6) {
                this.field331 = var4;
            }
            if (var3 == 8) {
                this.field288 = var4;
                this.field606 = true;
            }
            if (var3 == 9) {
                this.field626 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field182) {
            this.method63(0);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method36(byte arg0) {
        int var2 = this.field496;
        int var3 = this.field497;
        int var4 = this.field498;
        int var5 = this.field499;
        int var6 = 6116423;
        class50.method478(var4, var2, var6, var3, var5, (byte) 1);
        class50.method478(var4 - 2, var2 + 1, 0, var3 + 1, 16, (byte) 1);
        class50.method479(0, var5 - 19, var4 - 2, var3 + 18, 4, var2 + 1);
        this.field444.method194((byte) 22, "Choose Option", var6, var2 + 3, var3 + 14);
        int var7 = super.field79;
        int var8 = super.field80;
        if (this.field495 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field495 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field495 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field551; ++var9) {
            int var10 = (this.field551 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field444.method198(this.field643[var9], var10, true, true, var2 + 3, var11);
        }
        if (arg0 != -46) {
            this.field214.method234(70);
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method37(int arg0) {
        if (this.field602 == 0) {
            this.field643[0] = "Cancel";
            this.field473[0] = 1545;
            this.field551 = 1;
            this.method94(249);
            this.field187 = 0;
            if (super.field79 > 4 && super.field80 > 4 && super.field79 < 516 && super.field80 < 338) {
                if (this.field220 != -1) {
                    this.method122(4, 0, 4, this.field229, class52.field1306[this.field220], super.field79, super.field80);
                } else {
                    this.method151(0);
                }
            }
            if (this.field239 != this.field187) {
                this.field239 = this.field187;
            }
            this.field187 = 0;
            if (arg0 >= 0) {
                this.field386 = this.field269.method244();
            }
            if (super.field79 > 553 && super.field80 > 205 && super.field79 < 743 && super.field80 < 466) {
                if (this.field262 != -1) {
                    this.method122(553, 0, 205, this.field229, class52.field1306[this.field262], super.field79, super.field80);
                } else if (this.field362[this.field242] != -1) {
                    this.method122(553, 0, 205, this.field229, class52.field1306[this.field362[this.field242]], super.field79, super.field80);
                }
            }
            if (this.field283 != this.field187) {
                this.field447 = true;
                this.field283 = this.field187;
            }
            this.field187 = 0;
            if (super.field79 > 17 && super.field80 > 357 && super.field79 < 496 && super.field80 < 453) {
                if (this.field582 != -1) {
                    this.method122(17, 0, 357, this.field229, class52.field1306[this.field582], super.field79, super.field80);
                } else if (super.field80 < 434 && super.field79 < 426) {
                    this.method34(super.field79 - 17, super.field80 - 357, 0);
                }
            }
            if (this.field582 != -1 && this.field484 != this.field187) {
                this.field606 = true;
                this.field484 = this.field187;
            }
            boolean var2 = false;
            while (!var2) {
                var2 = true;
                for (int var3 = 0; var3 < this.field551 - 1; ++var3) {
                    if (this.field473[var3] < 1000 && this.field473[var3 + 1] > 1000) {
                        String var4 = this.field643[var3];
                        this.field643[var3] = this.field643[var3 + 1];
                        this.field643[var3 + 1] = var4;
                        int var5 = this.field473[var3];
                        this.field473[var3] = this.field473[var3 + 1];
                        this.field473[var3 + 1] = var5;
                        int var6 = this.field471[var3];
                        this.field471[var3] = this.field471[var3 + 1];
                        this.field471[var3 + 1] = var6;
                        int var7 = this.field472[var3];
                        this.field472[var3] = this.field472[var3 + 1];
                        this.field472[var3 + 1] = var7;
                        int var8 = this.field474[var3];
                        this.field474[var3] = this.field474[var3 + 1];
                        this.field474[var3 + 1] = var8;
                        var2 = false;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method38(byte arg0, long arg1) {
        if (arg0 != 5) {
            this.method19();
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field183; ++var4) {
                if (this.field550[var4] == arg1) {
                    --this.field183;
                    this.field447 = true;
                    for (int var5 = var4; var5 < this.field183; ++var5) {
                        this.field486[var5] = this.field486[var5 + 1];
                        this.field343[var5] = this.field343[var5 + 1];
                        this.field550[var5] = this.field550[var5 + 1];
                    }
                    this.field214.method233(54, 0);
                    this.field214.method240(arg1, 7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method39(boolean arg0) {
        if (!arg0) {
            while (true) {
                int var2;
                do {
                    while (true) {
                        var2 = this.method18(false);
                        if (var2 == -1) {
                            return;
                        }
                        if (this.field220 != -1 && this.field612 == this.field220) {
                            if (var2 == 8 && this.field500.length() > 0) {
                                this.field500 = this.field500.substring(0, this.field500.length() - 1);
                            }
                            break;
                        }
                        if (this.field414) {
                            if (var2 >= 32 && var2 <= 122 && this.field378.length() < 80) {
                                this.field378 = this.field378 + (char) var2;
                                this.field606 = true;
                            }
                            if (var2 == 8 && this.field378.length() > 0) {
                                this.field378 = this.field378.substring(0, this.field378.length() - 1);
                                this.field606 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                this.field414 = false;
                                this.field606 = true;
                                if (this.field256 == 1) {
                                    long var3 = class70.method583(this.field378);
                                    this.method33(var3, true);
                                }
                                if (this.field256 == 2 && this.field183 > 0) {
                                    long var5 = class70.method583(this.field378);
                                    this.method38((byte) 5, var5);
                                }
                                if (this.field256 == 3 && this.field378.length() > 0) {
                                    this.field214.method233(242, 0);
                                    this.field214.method234(0);
                                    int var7 = this.field214.field818;
                                    this.field214.method240(this.field538, 7);
                                    class32.method344(this.field378, 24891, this.field214);
                                    this.field214.method243(550, this.field214.field818 - var7);
                                    this.field378 = class32.method345(this.field378, this.field377);
                                    this.field378 = class25.method298(this.field378, this.field377);
                                    this.method155(true, this.field378, class70.method587(class70.method584(this.field538, 803), true), 6);
                                    if (this.field380 == 2) {
                                        this.field380 = 1;
                                        this.field240 = true;
                                        this.field214.method233(52, 0);
                                        this.field214.method234(this.field552);
                                        this.field214.method234(this.field380);
                                        this.field214.method234(this.field278);
                                    }
                                }
                                if (this.field256 == 4 && this.field194 < 100) {
                                    long var8 = class70.method583(this.field378);
                                    this.method163(var8, 7);
                                }
                                if (this.field256 == 5 && this.field194 > 0) {
                                    long var10 = class70.method583(this.field378);
                                    this.method154(var10, this.field642);
                                }
                            }
                        } else if (this.field399 == 1) {
                            if (var2 >= 48 && var2 <= 57 && this.field531.length() < 10) {
                                this.field531 = this.field531 + (char) var2;
                                this.field606 = true;
                            }
                            if (var2 == 8 && this.field531.length() > 0) {
                                this.field531 = this.field531.substring(0, this.field531.length() - 1);
                                this.field606 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field531.length() > 0) {
                                    int var12 = 0;
                                    try {
                                        var12 = Integer.parseInt(this.field531);
                                    } catch (Exception var22) {
                                    }
                                    this.field214.method233(183, 0);
                                    this.field214.method238(var12);
                                }
                                this.field399 = 0;
                                this.field606 = true;
                            }
                        } else if (this.field399 == 2) {
                            if (var2 >= 32 && var2 <= 122 && this.field531.length() < 12) {
                                this.field531 = this.field531 + (char) var2;
                                this.field606 = true;
                            }
                            if (var2 == 8 && this.field531.length() > 0) {
                                this.field531 = this.field531.substring(0, this.field531.length() - 1);
                                this.field606 = true;
                            }
                            if (var2 == 13 || var2 == 10) {
                                if (this.field531.length() > 0) {
                                    this.field214.method233(49, 0);
                                    this.field214.method240(class70.method583(this.field531), 7);
                                }
                                this.field399 = 0;
                                this.field606 = true;
                            }
                        } else if (this.field582 == -1) {
                            if (var2 >= 32 && var2 <= 122 && this.field294.length() < 80) {
                                this.field294 = this.field294 + (char) var2;
                                this.field606 = true;
                            }
                            if (var2 == 8 && this.field294.length() > 0) {
                                this.field294 = this.field294.substring(0, this.field294.length() - 1);
                                this.field606 = true;
                            }
                            if ((var2 == 13 || var2 == 10) && this.field294.length() > 0) {
                                if (this.field337 == 2) {
                                    if (this.field294.equals("::clientdrop")) {
                                        this.method52(0);
                                    }
                                    if (this.field294.equals("::lag")) {
                                        this.method134(40926);
                                    }
                                    if (this.field294.equals("::prefetchmusic")) {
                                        for (int var13 = 0; var13 < this.field195.method374(2, false); ++var13) {
                                            this.field195.method373(2, 0, (byte) 1, var13);
                                        }
                                    }
                                    if (this.field294.equals("::fpson")) {
                                        field566 = true;
                                    }
                                    if (this.field294.equals("::fpsoff")) {
                                        field566 = false;
                                    }
                                    if (this.field294.equals("::noclip")) {
                                        for (int var14 = 0; var14 < 4; ++var14) {
                                            for (int var15 = 1; var15 < 103; ++var15) {
                                                for (int var16 = 1; var16 < 103; ++var16) {
                                                    this.field453[var14].field749[var15][var16] = 0;
                                                }
                                            }
                                        }
                                    }
                                }
                                if (this.field294.startsWith("::")) {
                                    this.field214.method233(150, 0);
                                    this.field214.method234(this.field294.length() - 1);
                                    this.field214.method241(this.field294.substring(2));
                                } else {
                                    String var17 = this.field294.toLowerCase();
                                    byte var18 = 0;
                                    if (var17.startsWith("yellow:")) {
                                        var18 = 0;
                                        this.field294 = this.field294.substring(7);
                                    } else if (var17.startsWith("red:")) {
                                        var18 = 1;
                                        this.field294 = this.field294.substring(4);
                                    } else if (var17.startsWith("green:")) {
                                        var18 = 2;
                                        this.field294 = this.field294.substring(6);
                                    } else if (var17.startsWith("cyan:")) {
                                        var18 = 3;
                                        this.field294 = this.field294.substring(5);
                                    } else if (var17.startsWith("purple:")) {
                                        var18 = 4;
                                        this.field294 = this.field294.substring(7);
                                    } else if (var17.startsWith("white:")) {
                                        var18 = 5;
                                        this.field294 = this.field294.substring(6);
                                    } else if (var17.startsWith("flash1:")) {
                                        var18 = 6;
                                        this.field294 = this.field294.substring(7);
                                    } else if (var17.startsWith("flash2:")) {
                                        var18 = 7;
                                        this.field294 = this.field294.substring(7);
                                    } else if (var17.startsWith("flash3:")) {
                                        var18 = 8;
                                        this.field294 = this.field294.substring(7);
                                    } else if (var17.startsWith("glow1:")) {
                                        var18 = 9;
                                        this.field294 = this.field294.substring(6);
                                    } else if (var17.startsWith("glow2:")) {
                                        var18 = 10;
                                        this.field294 = this.field294.substring(6);
                                    } else if (var17.startsWith("glow3:")) {
                                        var18 = 11;
                                        this.field294 = this.field294.substring(6);
                                    }
                                    String var19 = this.field294.toLowerCase();
                                    byte var20 = 0;
                                    if (var19.startsWith("wave:")) {
                                        var20 = 1;
                                        this.field294 = this.field294.substring(5);
                                    } else if (var19.startsWith("wave2:")) {
                                        var20 = 2;
                                        this.field294 = this.field294.substring(6);
                                    } else if (var19.startsWith("shake:")) {
                                        var20 = 3;
                                        this.field294 = this.field294.substring(6);
                                    } else if (var19.startsWith("scroll:")) {
                                        var20 = 4;
                                        this.field294 = this.field294.substring(7);
                                    } else if (var19.startsWith("slide:")) {
                                        var20 = 5;
                                        this.field294 = this.field294.substring(6);
                                    }
                                    this.field214.method233(85, 0);
                                    this.field214.method234(0);
                                    int var21 = this.field214.field818;
                                    this.field214.method260(-42019, var18);
                                    this.field214.method262(0, var20);
                                    this.field438.field818 = 0;
                                    class32.method344(this.field294, 24891, this.field438);
                                    this.field214.method279(this.field438.field817, 0, this.field438.field818, this.field537);
                                    this.field214.method243(550, this.field214.field818 - var21);
                                    this.field294 = class32.method345(this.field294, this.field377);
                                    this.field294 = class25.method298(this.field294, this.field377);
                                    field588.field1503 = this.field294;
                                    field588.field1487 = var18;
                                    field588.field1504 = var20;
                                    field588.field1483 = 150;
                                    if (this.field337 == 2) {
                                        this.method155(true, field588.field1503, "@cr2@" + field588.field1094, 2);
                                    } else if (this.field337 == 1) {
                                        this.method155(true, field588.field1503, "@cr1@" + field588.field1094, 2);
                                    } else {
                                        this.method155(true, field588.field1503, field588.field1094, 2);
                                    }
                                    if (this.field552 == 2) {
                                        this.field552 = 3;
                                        this.field240 = true;
                                        this.field214.method233(52, 0);
                                        this.field214.method234(this.field552);
                                        this.field214.method234(this.field380);
                                        this.field214.method234(this.field278);
                                    }
                                }
                                this.field294 = "";
                                this.field606 = true;
                            }
                        }
                    }
                } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
                if (this.field500.length() < 12) {
                    this.field500 = this.field500 + (char) var2;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)I")
    public final int method40(boolean arg0) {
        if (!arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        int var3 = 3;
        if (this.field227 < 310) {
            int var4 = this.field224 >> 7;
            int var5 = this.field226 >> 7;
            int var6 = field588.field1506 >> 7;
            int var7 = field588.field1507 >> 7;
            if ((this.field410[this.field581][var4][var5] & 4) != 0) {
                var3 = this.field581;
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
                    if ((this.field410[this.field581][var4][var5] & 4) != 0) {
                        var3 = this.field581;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field410[this.field581][var4][var5] & 4) != 0) {
                            var3 = this.field581;
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
                    if ((this.field410[this.field581][var4][var5] & 4) != 0) {
                        var3 = this.field581;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field410[this.field581][var4][var5] & 4) != 0) {
                            var3 = this.field581;
                        }
                    }
                }
            }
        }
        if ((this.field410[this.field581][field588.field1506 >> 7][field588.field1507 >> 7] & 4) != 0) {
            var3 = this.field581;
        }
        return var3;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)I")
    public final int method41(boolean arg0) {
        int var2 = this.method119(this.field226, this.field581, this.field224, -23);
        if (!arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        return var2 - this.field225 < 800 && (this.field410[this.field581][this.field224 >> 7][this.field226 >> 7] & 4) != 0 ? this.field581 : 3;
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)V")
    public static final void method42(boolean arg0) {
        class47.field1147 = false;
        if (!arg0) {
            field610 = !field610;
        }
        class9.field666 = false;
        field233 = false;
        class63.field1601 = false;
        class48.field1242 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LGLMIQHJI;IB)V")
    private final void method43(class21 arg0, int arg1, byte arg2) {
        int var4 = arg0.method255(8, true);
        if (var4 < this.field394) {
            for (int var5 = var4; var5 < this.field394; ++var5) {
                this.field527[this.field526++] = this.field395[var5];
            }
        }
        if (var4 > this.field394) {
            signlink.reporterror(this.field180 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field394 = 0;
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field395[var6];
                class43 var8 = this.field393[var7];
                int var9 = arg0.method255(1, true);
                if (var9 == 0) {
                    this.field395[this.field394++] = var7;
                    var8.field1501 = field332;
                } else {
                    int var10 = arg0.method255(2, true);
                    if (var10 == 0) {
                        this.field395[this.field394++] = var7;
                        var8.field1501 = field332;
                        this.field397[this.field396++] = var7;
                    } else if (var10 == 1) {
                        this.field395[this.field394++] = var7;
                        var8.field1501 = field332;
                        int var11 = arg0.method255(3, true);
                        var8.method544(false, var11, 908);
                        int var12 = arg0.method255(1, true);
                        if (var12 == 1) {
                            this.field397[this.field396++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field395[this.field394++] = var7;
                        var8.field1501 = field332;
                        int var13 = arg0.method255(3, true);
                        var8.method544(true, var13, 908);
                        int var14 = arg0.method255(3, true);
                        var8.method544(true, var14, 908);
                        int var15 = arg0.method255(1, true);
                        if (var15 == 1) {
                            this.field397[this.field396++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field527[this.field526++] = var7;
                    }
                }
            }
            if (arg2 == 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method44(int arg0) {
        byte[] var2 = this.field452.method581("title.dat", (byte[]) null);
        class26 var3 = new class26(var2, this);
        this.field507.method393(1);
        var3.method329(0, 0, (byte) -73);
        this.field508.method393(1);
        var3.method329(-637, 0, (byte) -73);
        this.field504.method393(1);
        var3.method329(-128, 0, (byte) -73);
        this.field505.method393(1);
        var3.method329(-202, -371, (byte) -73);
        this.field506.method393(1);
        var3.method329(-202, -171, (byte) -73);
        this.field509.method393(1);
        var3.method329(0, -265, (byte) -73);
        this.field510.method393(1);
        var3.method329(-562, -265, (byte) -73);
        this.field511.method393(1);
        var3.method329(-128, -171, (byte) -73);
        this.field512.method393(1);
        var3.method329(-562, -171, (byte) -73);
        int[] var4 = new int[var3.field895];
        for (int var5 = 0; var5 < var3.field896; ++var5) {
            for (int var10 = 0; var10 < var3.field895; ++var10) {
                var4[var10] = var3.field894[var3.field895 * var5 + (var3.field895 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field895; ++var11) {
                var3.field894[var3.field895 * var5 + var11] = var4[var11];
            }
        }
        this.field507.method393(1);
        var3.method329(382, 0, (byte) -73);
        this.field508.method393(1);
        var3.method329(-255, 0, (byte) -73);
        this.field504.method393(1);
        var3.method329(254, 0, (byte) -73);
        this.field505.method393(1);
        var3.method329(180, -371, (byte) -73);
        this.field506.method393(1);
        var3.method329(180, -171, (byte) -73);
        this.field509.method393(1);
        var3.method329(382, -265, (byte) -73);
        this.field510.method393(1);
        var3.method329(-180, -265, (byte) -73);
        this.field511.method393(1);
        var3.method329(254, -171, (byte) -73);
        this.field512.method393(1);
        var3.method329(-180, -171, (byte) -73);
        class26 var6 = new class26(this.field452, "logo", 0);
        this.field504.method393(1);
        var6.method331(382 - var6.field895 / 2 - 128, 272, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (arg0 < 6 || arg0 > 6) {
            this.field386 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method45(int arg0, int arg1) {
        if (arg0 >= 0) {
            if (this.field399 != 0) {
                this.field399 = 0;
                this.field606 = true;
            }
            int var3 = this.field471[arg0];
            int var4 = this.field472[arg0];
            int var5 = this.field473[arg0];
            int var6 = this.field474[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (var5 == 750) {
                boolean var7 = this.method48(0, 0, 0, 2, false, (byte) 6, 0, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                if (!var7) {
                    this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                }
                this.field279 = super.field86;
                this.field280 = super.field87;
                this.field282 = 2;
                this.field281 = 0;
                this.field214.method233(5, 0);
                this.field214.method235(var6);
                this.field214.method269(8, this.field369 + var4);
                this.field214.method235(this.field368 + var3);
            }
            if (var5 == 111) {
                field525 += this.field368;
                if (field525 >= 50) {
                    this.field214.method233(163, 0);
                    this.field214.method237(7412244);
                    field525 = 0;
                }
                this.method65(var6, var4, 9, var3);
                this.field214.method233(194, 0);
                this.field214.method270(var6 >> 14 & 32767, (byte) 3);
                this.field214.method271(-14666, this.field368 + var3);
                this.field214.method270(this.field369 + var4, (byte) 3);
            }
            if (var5 == 294) {
                this.field214.method233(66, 0);
                this.field214.method271(-14666, var4);
                this.field214.method269(8, this.field209);
                this.field214.method270(var3, (byte) 3);
                this.field214.method269(8, var6);
                this.field325 = 0;
                this.field326 = var4;
                this.field327 = var3;
                this.field328 = 2;
                if (class52.field1306[var4].field1346 == this.field220) {
                    this.field328 = 1;
                }
                if (class52.field1306[var4].field1346 == this.field582) {
                    this.field328 = 3;
                }
            }
            if (var5 == 610) {
                if (!this.field432) {
                    this.field206.method449(true, super.field87 - 4, super.field86 - 4);
                } else {
                    this.field206.method449(true, var4 - 4, var3 - 4);
                }
            }
            if (var5 == 1297) {
                class2 var9 = class2.method4(var6);
                String var10;
                if (var9.field51 != null) {
                    var10 = new String(var9.field51);
                } else {
                    var10 = "It's a " + var9.field37 + ".";
                }
                this.method155(true, var10, "", 0);
            }
            if (var5 == 137) {
                this.field214.method233(83, 0);
                this.field214.method235(var4);
                class52 var11 = class52.field1306[var4];
                if (var11.field1338 != null && var11.field1338[0][0] == 5) {
                    int var12 = var11.field1338[0][1];
                    if (this.field492[var12] != var11.field1355[0]) {
                        this.field492[var12] = var11.field1355[0];
                        this.method35((byte) 2, var12);
                        this.field447 = true;
                    }
                }
            }
            if (var5 == 806 && !this.field611) {
                this.field214.method233(105, 0);
                this.field214.method235(var4);
                this.field611 = true;
            }
            if (var5 == 532) {
                field298 += var3;
                if (field298 >= 100) {
                    this.field214.method233(58, 0);
                    this.field214.method235(10898);
                    field298 = 0;
                }
                this.field214.method233(100, 0);
                this.field214.method235(var3);
                this.field214.method235(var6);
                this.field214.method271(-14666, var4);
                this.field325 = 0;
                this.field326 = var4;
                this.field327 = var3;
                this.field328 = 2;
                if (class52.field1306[var4].field1346 == this.field220) {
                    this.field328 = 1;
                }
                if (class52.field1306[var4].field1346 == this.field582) {
                    this.field328 = 3;
                }
            }
            if (var5 == 630) {
                ++field286;
                if (field286 >= 96) {
                    this.field214.method233(139, 0);
                    this.field214.method234(169);
                    field286 = 0;
                }
                this.field214.method233(239, 0);
                this.field214.method271(-14666, var4);
                this.field214.method269(8, var3);
                this.field214.method271(-14666, var6);
                this.field325 = 0;
                this.field326 = var4;
                this.field327 = var3;
                this.field328 = 2;
                if (class52.field1306[var4].field1346 == this.field220) {
                    this.field328 = 1;
                }
                if (class52.field1306[var4].field1346 == this.field582) {
                    this.field328 = 3;
                }
            }
            if (var5 == 1714) {
                int var13 = var6 >> 14 & 32767;
                class48 var14 = class48.method472(var13);
                String var15;
                if (var14.field1257 != null) {
                    var15 = new String(var14.field1257);
                } else {
                    var15 = "It's a " + var14.field1247 + ".";
                }
                this.method155(true, var15, "", 0);
            }
            if (var5 == 873) {
                class46 var16 = this.field439[var6];
                if (var16 != null) {
                    this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var16.field1522[0], field588.field1522[0], var16.field1523[0]);
                    this.field279 = super.field86;
                    this.field280 = super.field87;
                    this.field282 = 2;
                    this.field281 = 0;
                    this.field214.method233(220, 0);
                    this.field214.method235(this.field209);
                    this.field214.method235(var6);
                }
            }
            if (var5 == 959) {
                this.field417 = 1;
                this.field418 = var3;
                this.field419 = var4;
                this.field420 = var6;
                this.field421 = class2.method4(var6).field37;
                this.field208 = 0;
                this.field447 = true;
            } else {
                if (var5 == 730 || var5 == 694 || var5 == 994 || var5 == 759) {
                    String var17 = this.field643[arg0];
                    int var18 = var17.indexOf("@whi@");
                    if (var18 != -1) {
                        long var19 = class70.method583(var17.substring(var18 + 5).trim());
                        if (var5 == 730) {
                            this.method33(var19, true);
                        }
                        if (var5 == 694) {
                            this.method163(var19, 7);
                        }
                        if (var5 == 994) {
                            this.method38((byte) 5, var19);
                        }
                        if (var5 == 759) {
                            this.method154(var19, this.field642);
                        }
                    }
                }
                if (var5 == 482) {
                    class52 var21 = class52.field1306[var4];
                    this.field208 = 1;
                    this.field209 = var4;
                    this.field210 = var21.field1341;
                    this.field417 = 0;
                    this.field447 = true;
                    String var22 = var21.field1302;
                    if (var22.indexOf(" ") != -1) {
                        var22 = var22.substring(0, var22.indexOf(" "));
                    }
                    String var23 = var21.field1302;
                    if (var23.indexOf(" ") != -1) {
                        var23 = var23.substring(var23.indexOf(" ") + 1);
                    }
                    this.field211 = var22 + " " + var21.field1316 + " " + var23;
                    if (this.field210 == 16) {
                        this.field447 = true;
                        this.field242 = 3;
                        this.field372 = true;
                    }
                } else {
                    if (var5 == 818) {
                        class46 var24 = this.field439[var6];
                        if (var24 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var24.field1522[0], field588.field1522[0], var24.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(7, 0);
                            this.field214.method235(this.field419);
                            this.field214.method269(8, this.field420);
                            this.field214.method269(8, this.field418);
                            this.field214.method270(var6, (byte) 3);
                        }
                    }
                    if (var5 == 401) {
                        class43 var25 = this.field393[var6];
                        if (var25 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var25.field1522[0], field588.field1522[0], var25.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(28, 0);
                            this.field214.method271(-14666, var6);
                        }
                    }
                    if (var5 == 8) {
                        this.field214.method233(72, 0);
                        this.field214.method271(-14666, var3);
                        this.field214.method270(var6, (byte) 3);
                        this.field214.method235(var4);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 302) {
                        String var26 = this.field643[arg0];
                        int var27 = var26.indexOf("@whi@");
                        if (var27 != -1) {
                            long var28 = class70.method583(var26.substring(var27 + 5).trim());
                            int var30 = -1;
                            for (int var31 = 0; var31 < this.field183; ++var31) {
                                if (this.field550[var31] == var28) {
                                    var30 = var31;
                                    break;
                                }
                            }
                            if (var30 != -1 && this.field343[var30] > 0) {
                                this.field606 = true;
                                this.field399 = 0;
                                this.field414 = true;
                                this.field378 = "";
                                this.field256 = 3;
                                this.field538 = this.field550[var30];
                                this.field593 = "Enter message to send to " + this.field486[var30];
                            }
                        }
                    }
                    if (var5 == 915) {
                        class43 var32 = this.field393[var6];
                        if (var32 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var32.field1522[0], field588.field1522[0], var32.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(75, 0);
                            this.field214.method269(8, var6);
                        }
                    }
                    if (var5 == 51) {
                        this.field214.method233(83, 0);
                        this.field214.method235(var4);
                        class52 var33 = class52.field1306[var4];
                        if (var33.field1338 != null && var33.field1338[0][0] == 5) {
                            int var34 = var33.field1338[0][1];
                            this.field492[var34] = 1 - this.field492[var34];
                            this.method35((byte) 2, var34);
                            this.field447 = true;
                        }
                    }
                    if (var5 == 708) {
                        this.field214.method233(182, 0);
                        this.field214.method269(8, var4);
                        this.field214.method235(var3);
                        this.field214.method271(-14666, var6);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 751) {
                        class43 var35 = this.field393[var6];
                        if (var35 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var35.field1522[0], field588.field1522[0], var35.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(98, 0);
                            this.field214.method235(this.field209);
                            this.field214.method271(-14666, var6);
                        }
                    }
                    if (var5 == 247) {
                        boolean var36 = this.method48(0, 0, 0, 2, false, (byte) 6, 0, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        if (!var36) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        }
                        this.field279 = super.field86;
                        this.field280 = super.field87;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field214.method233(171, 0);
                        this.field214.method271(-14666, this.field369 + var4);
                        this.field214.method271(-14666, var6);
                        this.field214.method235(this.field368 + var3);
                    }
                    if (var5 == 236) {
                        this.method140(0);
                    }
                    if (var5 == 1101) {
                        class46 var38 = this.field439[var6];
                        if (var38 != null) {
                            class36 var39 = var38.field1140;
                            if (var39.field1039 != null) {
                                var39 = var39.method383(-23798);
                            }
                            if (var39 != null) {
                                String var40;
                                if (var39.field1047 != null) {
                                    var40 = new String(var39.field1047);
                                } else {
                                    var40 = "It's a " + var39.field1014 + ".";
                                }
                                this.method155(true, var40, "", 0);
                            }
                        }
                    }
                    if (var5 == 516) {
                        boolean var41 = this.method48(0, 0, 0, 2, false, (byte) 6, 0, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        if (!var41) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        }
                        this.field279 = super.field86;
                        this.field280 = super.field87;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field214.method233(184, 0);
                        this.field214.method271(-14666, var6);
                        this.field214.method271(-14666, this.field209);
                        this.field214.method270(this.field368 + var3, (byte) 3);
                        this.field214.method235(this.field369 + var4);
                    }
                    if (var5 == 811) {
                        String var43 = this.field643[arg0];
                        int var44 = var43.indexOf("@whi@");
                        if (var44 != -1) {
                            if (this.field220 == -1) {
                                this.method140(0);
                                this.field500 = var43.substring(var44 + 5).trim();
                                this.field565 = false;
                                for (int var45 = 0; var45 < class52.field1306.length; ++var45) {
                                    if (class52.field1306[var45] != null && class52.field1306[var45].field1350 == 600) {
                                        this.field612 = this.field220 = class52.field1306[var45].field1346;
                                        break;
                                    }
                                }
                            } else {
                                this.method155(true, "Please close the interface you have open before using 'report abuse'", "", 0);
                            }
                        }
                    }
                    if (var5 == 686) {
                        this.method65(var6, var4, 9, var3);
                        this.field214.method233(168, 0);
                        this.field214.method235(this.field368 + var3);
                        this.field214.method271(-14666, var6 >> 14 & 32767);
                        this.field214.method271(-14666, this.field369 + var4);
                    }
                    if (var5 == 337) {
                        class46 var46 = this.field439[var6];
                        if (var46 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var46.field1522[0], field588.field1522[0], var46.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(2, 0);
                            this.field214.method271(-14666, var6);
                        }
                    }
                    if (var5 == 262 && this.method65(var6, var4, 9, var3)) {
                        this.field214.method233(204, 0);
                        this.field214.method269(8, this.field368 + var3);
                        this.field214.method235(this.field369 + var4);
                        this.field214.method235(this.field418);
                        this.field214.method269(8, this.field420);
                        this.field214.method271(-14666, this.field419);
                        this.field214.method235(var6 >> 14 & 32767);
                    }
                    if (var5 == 903) {
                        this.field214.method233(40, 0);
                        this.field214.method235(var6);
                        this.field214.method270(var4, (byte) 3);
                        this.field214.method269(8, var3);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 355) {
                        this.field214.method233(109, 0);
                        this.field214.method270(var6, (byte) 3);
                        this.field214.method269(8, var4);
                        this.field214.method270(var3, (byte) 3);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 16 && this.method65(var6, var4, 9, var3)) {
                        this.field214.method233(170, 0);
                        this.field214.method270(var6 >> 14 & 32767, (byte) 3);
                        this.field214.method269(8, this.field209);
                        this.field214.method270(this.field368 + var3, (byte) 3);
                        this.field214.method269(8, this.field369 + var4);
                    }
                    if (var5 == 448) {
                        class43 var47 = this.field393[var6];
                        if (var47 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var47.field1522[0], field588.field1522[0], var47.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(248, 0);
                            this.field214.method270(this.field419, (byte) 3);
                            this.field214.method271(-14666, this.field420);
                            this.field214.method271(-14666, this.field418);
                            this.field214.method270(var6, (byte) 3);
                        }
                    }
                    if (var5 == 321) {
                        boolean var48 = this.method48(0, 0, 0, 2, false, (byte) 6, 0, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        if (!var48) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        }
                        this.field279 = super.field86;
                        this.field280 = super.field87;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field214.method233(190, 0);
                        this.field214.method269(8, this.field368 + var3);
                        this.field214.method269(8, this.field369 + var4);
                        this.field214.method235(var6);
                    }
                    if (var5 == 677) {
                        class46 var50 = this.field439[var6];
                        if (var50 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var50.field1522[0], field588.field1522[0], var50.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(207, 0);
                            this.field214.method271(-14666, var6);
                        }
                    }
                    if (var5 == 331) {
                        class46 var51 = this.field439[var6];
                        if (var51 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var51.field1522[0], field588.field1522[0], var51.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(94, 0);
                            this.field214.method270(var6, (byte) 3);
                        }
                    }
                    if (var5 == 820) {
                        class43 var52 = this.field393[var6];
                        if (var52 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var52.field1522[0], field588.field1522[0], var52.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(88, 0);
                            this.field214.method269(8, var6);
                        }
                    }
                    if (var5 == 132) {
                        this.field214.method233(195, 0);
                        this.field214.method269(8, var6);
                        this.field214.method235(var4);
                        this.field214.method269(8, var3);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 1463) {
                        class2 var53 = class2.method4(var6);
                        class52 var54 = class52.field1306[var4];
                        String var55;
                        if (var54 != null && var54.field1363[var3] >= 100000) {
                            var55 = var54.field1363[var3] + " x " + var53.field37;
                        } else if (var53.field51 != null) {
                            var55 = new String(var53.field51);
                        } else {
                            var55 = "It's a " + var53.field37 + ".";
                        }
                        this.method155(true, var55, "", 0);
                    }
                    if (var5 == 30) {
                        class46 var56 = this.field439[var6];
                        if (var56 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var56.field1522[0], field588.field1522[0], var56.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(251, 0);
                            this.field214.method271(-14666, var6);
                        }
                    }
                    if (var5 == 992) {
                        boolean var57 = this.method48(0, 0, 0, 2, false, (byte) 6, 0, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        if (!var57) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        }
                        this.field279 = super.field86;
                        this.field280 = super.field87;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field214.method233(15, 0);
                        this.field214.method270(this.field420, (byte) 3);
                        this.field214.method271(-14666, this.field419);
                        this.field214.method269(8, this.field369 + var4);
                        this.field214.method269(8, this.field368 + var3);
                        this.field214.method269(8, this.field418);
                        this.field214.method269(8, var6);
                    }
                    if (var5 == 41) {
                        class46 var59 = this.field439[var6];
                        if (var59 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var59.field1522[0], field588.field1522[0], var59.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(249, 0);
                            this.field214.method271(-14666, var6);
                        }
                    }
                    if (var5 == 391) {
                        this.method65(var6, var4, 9, var3);
                        this.field214.method233(107, 0);
                        this.field214.method235(this.field368 + var3);
                        this.field214.method271(-14666, var6 >> 14 & 32767);
                        this.field214.method235(this.field369 + var4);
                    }
                    if (var5 == 12) {
                        boolean var60 = this.method48(0, 0, 0, 2, false, (byte) 6, 0, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        if (!var60) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        }
                        this.field279 = super.field86;
                        this.field280 = super.field87;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field214.method233(222, 0);
                        this.field214.method271(-14666, this.field368 + var3);
                        this.field214.method235(this.field369 + var4);
                        this.field214.method235(var6);
                    }
                    if (var5 == 416) {
                        ++field599;
                        if (field599 >= 91) {
                            this.field214.method233(210, 0);
                            this.field214.method234(234);
                            field599 = 0;
                        }
                        this.field214.method233(18, 0);
                        this.field214.method235(var6);
                        this.field214.method235(var3);
                        this.field214.method271(-14666, var4);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 766) {
                        class43 var62 = this.field393[var6];
                        if (var62 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var62.field1522[0], field588.field1522[0], var62.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            if ((var6 & 3) == 0) {
                                ++field488;
                            }
                            if (field488 >= 79) {
                                this.field214.method233(79, 0);
                                this.field214.method237(12768835);
                                field488 = 0;
                            }
                            this.field214.method233(96, 0);
                            this.field214.method269(8, var6);
                        }
                    }
                    if (var5 == 485) {
                        this.field214.method233(84, 0);
                        this.field214.method235(var3);
                        this.field214.method235(this.field420);
                        this.field214.method271(-14666, this.field418);
                        this.field214.method269(8, var4);
                        this.field214.method235(var6);
                        this.field214.method271(-14666, this.field419);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 612) {
                        class52 var63 = class52.field1306[var4];
                        boolean var64 = true;
                        if (var63.field1350 > 0) {
                            var64 = this.method137(true, var63);
                        }
                        if (var64) {
                            this.field214.method233(83, 0);
                            this.field214.method235(var4);
                        }
                    }
                    if (var5 == 757 || var5 == 709) {
                        String var65 = this.field643[arg0];
                        int var66 = var65.indexOf("@whi@");
                        if (var66 != -1) {
                            String var67 = var65.substring(var66 + 5).trim();
                            String var68 = class70.method587(class70.method584(class70.method583(var67), 803), true);
                            boolean var69 = false;
                            for (int var70 = 0; var70 < this.field394; ++var70) {
                                class43 var71 = this.field393[this.field395[var70]];
                                if (var71 != null && var71.field1094 != null && var71.field1094.equalsIgnoreCase(var68)) {
                                    this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var71.field1522[0], field588.field1522[0], var71.field1523[0]);
                                    if (var5 == 757) {
                                        if ((var6 & 3) == 0) {
                                            ++field488;
                                        }
                                        if (field488 >= 79) {
                                            this.field214.method233(79, 0);
                                            this.field214.method237(12768835);
                                            field488 = 0;
                                        }
                                        this.field214.method233(96, 0);
                                        this.field214.method269(8, this.field395[var70]);
                                    }
                                    if (var5 == 709) {
                                        this.field214.method233(123, 0);
                                        this.field214.method235(this.field395[var70]);
                                    }
                                    var69 = true;
                                    break;
                                }
                            }
                            if (!var69) {
                                this.method155(true, "Unable to find " + var68, "", 0);
                            }
                        }
                    }
                    if (var5 == 10) {
                        this.field214.method233(32, 0);
                        this.field214.method271(-14666, var3);
                        this.field214.method235(var4);
                        this.field214.method235(var6);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 237) {
                        this.method65(var6, var4, 9, var3);
                        this.field214.method233(138, 0);
                        this.field214.method235(var6 >> 14 & 32767);
                        this.field214.method270(this.field368 + var3, (byte) 3);
                        this.field214.method269(8, this.field369 + var4);
                    }
                    if (var5 == 375) {
                        this.field214.method233(216, 0);
                        this.field214.method235(var4);
                        this.field214.method235(var6);
                        this.field214.method270(var3, (byte) 3);
                        this.field325 = 0;
                        this.field326 = var4;
                        this.field327 = var3;
                        this.field328 = 2;
                        if (class52.field1306[var4].field1346 == this.field220) {
                            this.field328 = 1;
                        }
                        if (class52.field1306[var4].field1346 == this.field582) {
                            this.field328 = 3;
                        }
                    }
                    if (var5 == 801) {
                        boolean var72 = this.method48(0, 0, 0, 2, false, (byte) 6, 0, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        if (!var72) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var3, field588.field1522[0], var4);
                        }
                        this.field279 = super.field86;
                        this.field280 = super.field87;
                        this.field282 = 2;
                        this.field281 = 0;
                        this.field214.method233(6, 0);
                        this.field214.method235(this.field368 + var3);
                        this.field214.method269(8, var6);
                        this.field214.method270(this.field369 + var4, (byte) 3);
                    }
                    if (var5 == 1938) {
                        ++field485;
                        if (field485 >= 134) {
                            this.field214.method233(119, 0);
                            this.field214.method234(190);
                            field485 = 0;
                        }
                        this.method65(var6, var4, 9, var3);
                        this.field214.method233(152, 0);
                        this.field214.method269(8, this.field368 + var3);
                        this.field214.method270(this.field369 + var4, (byte) 3);
                        this.field214.method270(var6 >> 14 & 32767, (byte) 3);
                    }
                    if (var5 == 380) {
                        class43 var74 = this.field393[var6];
                        if (var74 != null) {
                            this.method48(1, 0, 0, 2, false, (byte) 6, 1, 0, field588.field1523[0], var74.field1522[0], field588.field1522[0], var74.field1523[0]);
                            this.field279 = super.field86;
                            this.field280 = super.field87;
                            this.field282 = 2;
                            this.field281 = 0;
                            this.field214.method233(123, 0);
                            this.field214.method235(var6);
                        }
                    }
                    this.field417 = 0;
                    if (arg1 != 13626) {
                        this.field437 = this.field199.method29();
                    }
                    this.field208 = 0;
                    this.field447 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method46(byte arg0) {
        class15 var2 = (class15) this.field352.method528();
        if (arg0 == 5) {
            boolean var3 = false;
        } else {
            this.field553 = null;
        }
        while (var2 != null) {
            if (this.field581 == var2.field754 && !var2.field751) {
                if (field332 >= var2.field752) {
                    var2.method218(this.field188, 0);
                    if (var2.field751) {
                        var2.method555();
                    } else {
                        this.field206.method422(var2.field754, false, -1, false, var2, var2.field756, var2.field755, 0, 60, var2.field757);
                    }
                }
            } else {
                var2.method555();
            }
            var2 = (class15) this.field352.method530(true);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method47(byte arg0, boolean arg1) {
        this.method138((byte) 0);
        if (arg0 == 124) {
            this.field506.method393(1);
            this.field630.method542(0, 272, 0);
            short var3 = 360;
            short var4 = 200;
            if (this.field449 == 0) {
                int var5 = var4 / 2 + 80;
                this.field442.method191(var3 / 2, var5, 7711145, this.field195.field973, 0, true);
                int var6 = var4 / 2 - 20;
                this.field444.method191(var3 / 2, var6, 16776960, "Welcome to RuneScape", 0, true);
                int var17 = var6 + 30;
                int var7 = var3 / 2 - 80;
                int var8 = var4 / 2 + 20;
                this.field631.method542(var7 - 73, 272, var8 - 20);
                this.field444.method191(var7, var8 + 5, 16777215, "New User", 0, true);
                int var9 = var3 / 2 + 80;
                this.field631.method542(var9 - 73, 272, var8 - 20);
                this.field444.method191(var9, var8 + 5, 16777215, "Existing User", 0, true);
            }
            if (this.field449 == 2) {
                int var10 = var4 / 2 - 40;
                if (this.field309.length() > 0) {
                    this.field444.method191(var3 / 2, var10 - 15, 16776960, this.field309, 0, true);
                    this.field444.method191(var3 / 2, var10, 16776960, this.field310, 0, true);
                    var10 += 30;
                } else {
                    this.field444.method191(var3 / 2, var10 - 7, 16776960, this.field310, 0, true);
                    var10 += 30;
                }
                this.field444.method198("Username: " + this.field180 + (this.field555 == 0 & field332 % 40 < 20 ? "@yel@|" : ""), var10, true, true, var3 / 2 - 90, 16777215);
                var10 += 15;
                this.field444.method198("Password: " + class70.method588(0, this.field181) + (this.field555 == 1 & field332 % 40 < 20 ? "@yel@|" : ""), var10, true, true, var3 / 2 - 88, 16777215);
                var10 += 15;
                if (!arg1) {
                    int var11 = var3 / 2 - 80;
                    int var12 = var4 / 2 + 50;
                    this.field631.method542(var11 - 73, 272, var12 - 20);
                    this.field444.method191(var11, var12 + 5, 16777215, "Login", 0, true);
                    int var13 = var3 / 2 + 80;
                    this.field631.method542(var13 - 73, 272, var12 - 20);
                    this.field444.method191(var13, var12 + 5, 16777215, "Cancel", 0, true);
                }
            }
            if (this.field449 == 3) {
                this.field444.method191(var3 / 2, var4 / 2 - 60, 16776960, "Create a free account", 0, true);
                int var14 = var4 / 2 - 35;
                this.field444.method191(var3 / 2, var14, 16777215, "To create a new account you need to", 0, true);
                int var18 = var14 + 15;
                this.field444.method191(var3 / 2, var18, 16777215, "go back to the main RuneScape webpage", 0, true);
                int var19 = var18 + 15;
                this.field444.method191(var3 / 2, var19, 16777215, "and choose the red 'create account'", 0, true);
                int var20 = var19 + 15;
                this.field444.method191(var3 / 2, var20, 16777215, "button at the top right of that page.", 0, true);
                int var21 = var20 + 15;
                int var15 = var3 / 2;
                int var16 = var4 / 2 + 50;
                this.field631.method542(var15 - 73, 272, var16 - 20);
                this.field444.method191(var15, var16 + 5, 16777215, "Cancel", 0, true);
            }
            this.field506.method394(super.field71, 202, 171, -47890);
            if (this.field247) {
                this.field247 = false;
                this.field504.method394(super.field71, 128, 0, -47890);
                this.field505.method394(super.field71, 202, 371, -47890);
                this.field509.method394(super.field71, 0, 265, -47890);
                this.field510.method394(super.field71, 562, 265, -47890);
                this.field511.method394(super.field71, 128, 171, -47890);
                this.field512.method394(super.field71, 562, 171, -47890);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZBIIIIII)Z")
    public final boolean method48(int arg0, int arg1, int arg2, int arg3, boolean arg4, byte arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field213[var15][var35] = 0;
                this.field308[var15][var35] = 99999999;
            }
        }
        int var16 = arg10;
        int var17 = arg8;
        if (arg5 != 6) {
            this.method19();
        }
        this.field213[arg10][arg8] = 99;
        this.field308[arg10][arg8] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field595[var18] = arg10;
        int var36 = var18 + 1;
        this.field596[var18] = arg8;
        boolean var20 = false;
        int var21 = this.field595.length;
        int[][] var22 = this.field453[this.field581].field749;
        while (var36 != var19) {
            var16 = this.field595[var19];
            var17 = this.field596[var19];
            var19 = (var19 + 1) % var21;
            if (arg9 == var16 && arg11 == var17) {
                var20 = true;
                break;
            }
            if (arg1 != 0) {
                if ((arg1 < 5 || arg1 == 10) && this.field453[this.field581].method214(arg11, var17, var16, arg9, arg2, arg1 - 1, 38743)) {
                    var20 = true;
                    break;
                }
                if (arg1 < 10 && this.field453[this.field581].method215(arg9, 635, var17, var16, arg1 - 1, arg2, arg11)) {
                    var20 = true;
                    break;
                }
            }
            if (arg6 != 0 && arg0 != 0 && this.field453[this.field581].method216(true, arg11, arg7, arg0, var16, arg6, var17, arg9)) {
                var20 = true;
                break;
            }
            int var34 = this.field308[var16][var17] + 1;
            if (var16 > 0 && this.field213[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field595[var36] = var16 - 1;
                this.field596[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field213[var16 - 1][var17] = 2;
                this.field308[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field213[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field595[var36] = var16 + 1;
                this.field596[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field213[var16 + 1][var17] = 8;
                this.field308[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field213[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field595[var36] = var16;
                this.field596[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field213[var16][var17 - 1] = 1;
                this.field308[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field213[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field595[var36] = var16;
                this.field596[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field213[var16][var17 + 1] = 4;
                this.field308[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field213[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field595[var36] = var16 - 1;
                this.field596[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field213[var16 - 1][var17 - 1] = 3;
                this.field308[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field213[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field595[var36] = var16 + 1;
                this.field596[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field213[var16 + 1][var17 - 1] = 9;
                this.field308[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field213[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field595[var36] = var16 - 1;
                this.field596[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field213[var16 - 1][var17 + 1] = 6;
                this.field308[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field213[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field595[var36] = var16 + 1;
                this.field596[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field213[var16 + 1][var17 + 1] = 12;
                this.field308[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field501 = 0;
        if (!var20) {
            if (arg4) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg9 - var24; var25 <= arg9 + var24; ++var25) {
                        for (int var26 = arg11 - var24; var26 <= arg11 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field308[var25][var26] < var23) {
                                var23 = this.field308[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field501 = 1;
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
        this.field595[var27] = var16;
        int var37 = var27 + 1;
        this.field596[var27] = var17;
        int var28;
        int var29 = var28 = this.field213[var16][var17];
        while (arg10 != var16 || arg8 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field595[var37] = var16;
                this.field596[var37++] = var17;
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
            var29 = this.field213[var16][var17];
        }
        if (var37 <= 0) {
            if (arg3 == 1) {
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
            int var31 = this.field595[var37];
            int var32 = this.field596[var37];
            ++field502;
            if (field502 >= 89) {
                this.field214.method233(135, 0);
                this.field214.method238(0);
                field502 = 0;
            }
            if (arg3 == 0) {
                this.field214.method233(19, 0);
                this.field214.method234(var30 + var30 + 3);
            }
            if (arg3 == 1) {
                this.field214.method233(76, 0);
                this.field214.method234(var30 + var30 + 3 + 14);
            }
            if (arg3 == 2) {
                this.field214.method233(233, 0);
                this.field214.method234(var30 + var30 + 3);
            }
            this.field214.method261(true, super.field89[5] == 1 ? 1 : 0);
            this.field214.method270(this.field368 + var31, (byte) 3);
            this.field214.method270(this.field369 + var32, (byte) 3);
            this.field540 = this.field595[0];
            this.field541 = this.field596[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field214.method234(this.field595[var37] - var31);
                this.field214.method260(-42019, this.field596[var37] - var32);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIILUSEDZXXV;IIZI)V")
    public final void method49(int arg0, boolean arg1, int arg2, int arg3, class52 arg4, int arg5, int arg6, boolean arg7, int arg8) {
        if (this.field342) {
            this.field625 = 32;
        } else {
            this.field625 = 0;
        }
        this.field342 = false;
        if (!arg1) {
            this.field377 = 197;
        }
        if (arg3 >= arg0 && arg3 < arg0 + 16 && arg8 >= arg2 && arg8 < arg2 + 16) {
            arg4.field1354 -= this.field376 * 4;
            if (arg7) {
                this.field447 = true;
                return;
            }
        } else if (arg3 >= arg0 && arg3 < arg0 + 16 && arg8 >= arg2 + arg6 - 16 && arg8 < arg2 + arg6) {
            arg4.field1354 += this.field376 * 4;
            if (arg7) {
                this.field447 = true;
                return;
            }
        } else {
            if (arg3 < arg0 - this.field625 || arg3 >= arg0 + 16 + this.field625 || arg8 < arg2 + 16 || arg8 >= arg2 + arg6 - 16 || this.field376 <= 0) {
                return;
            }
            int var10 = (arg6 - 32) * arg6 / arg5;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg8 - arg2 - 16 - var10 / 2;
            int var12 = arg6 - 32 - var10;
            arg4.field1354 = (arg5 - arg6) * var11 / var12;
            if (arg7) {
                this.field447 = true;
            }
            this.field342 = true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method50(int arg0) {
        if (arg0 < 4 || arg0 > 4) {
            this.field553 = null;
        }
        while (true) {
            class38 var2 = this.field195.method371();
            if (var2 == null) {
                return;
            }
            if (var2.field1064 == 0) {
                class53.method498(var2.field1066, var2.field1068, 1);
                if ((this.field195.method358(var2.field1066, 16501) & 98) != 0) {
                    this.field447 = true;
                    if (this.field582 != -1) {
                        this.field606 = true;
                    }
                }
            }
            if (var2.field1064 == 1 && var2.field1068 != null) {
                class51.method486(false, var2.field1068);
            }
            if (var2.field1064 == 2 && this.field322 == var2.field1066 && var2.field1068 != null) {
                this.method51(this.field323, this.field450, var2.field1068);
            }
            if (var2.field1064 == 3 && this.field276 == 1) {
                for (int var3 = 0; var3 < this.field347.length; ++var3) {
                    if (this.field615[var3] == var2.field1066) {
                        this.field347[var3] = var2.field1068;
                        if (var2.field1068 == null) {
                            this.field615[var3] = -1;
                        }
                        break;
                    }
                    if (this.field616[var3] == var2.field1066) {
                        this.field257[var3] = var2.field1068;
                        if (var2.field1068 == null) {
                            this.field616[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1064 == 93 && this.field195.method369((byte) -7, var2.field1066)) {
                class63.method564(this.field195, this.field476, new class21(var2.field1068, -49015));
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZB[B)V")
    public final void method51(boolean arg0, byte arg1, byte[] arg2) {
        if (arg1 != 3) {
            this.field314 = -357;
        }
        signlink.midifade = arg0 ? 1 : 0;
        signlink.midisave(arg2, arg2.length);
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method52(int arg0) {
        if (this.field389 > 0) {
            this.method78(348);
        } else {
            this.field350.method393(1);
            this.field443.method190(1, 144, 257, "Connection lost", 0);
            this.field443.method190(1, 143, 256, "Connection lost", 16777215);
            this.field443.method190(1, 159, 257, "Please wait - attempting to reestablish", 0);
            this.field443.method190(1, 158, 256, "Please wait - attempting to reestablish", 16777215);
            this.field350.method394(super.field71, 4, 4, -47890);
            this.field287 = 0;
            if (arg0 != 0) {
                this.field189 = -365;
            }
            this.field540 = 0;
            class34 var2 = this.field431;
            this.field454 = false;
            this.field409 = 0;
            this.method87(this.field180, this.field181, true);
            if (!this.field454) {
                this.method78(348);
            }
            try {
                var2.method351();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIZII)V")
    public final void method53(int arg0, int arg1, int arg2, int arg3, boolean arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg3 & 2047;
        if (arg4) {
            field567 = 380;
        }
        int var10 = 0;
        int var11 = 0;
        int var12 = arg2;
        if (var8 != 0) {
            int var13 = class53.field1442[var8];
            int var14 = class53.field1443[var8];
            int var15 = var11 * var14 - arg2 * var13 >> 16;
            var12 = var11 * var13 + arg2 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class53.field1442[var9];
            int var17 = class53.field1443[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field224 = arg1 - var10;
        this.field225 = arg5 - var11;
        this.field226 = arg0 - var12;
        this.field227 = arg6;
        this.field228 = arg3;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILGLMIQHJI;B)V")
    private final void method54(int arg0, class21 arg1, byte arg2) {
        if (arg2 == 6) {
            boolean var4 = false;
        } else {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        while (arg1.field819 + 10 < arg0 * 8) {
            int var6 = arg1.method255(11, true);
            if (var6 == 2047) {
                break;
            }
            if (this.field393[var6] == null) {
                this.field393[var6] = new class43();
                if (this.field398[var6] != null) {
                    this.field393[var6].method405(0, this.field398[var6]);
                }
            }
            this.field395[this.field394++] = var6;
            class43 var7 = this.field393[var6];
            var7.field1501 = field332;
            int var8 = arg1.method255(1, true);
            if (var8 == 1) {
                this.field397[this.field396++] = var6;
            }
            int var9 = arg1.method255(5, true);
            if (var9 > 15) {
                var9 -= 32;
            }
            int var10 = arg1.method255(1, true);
            int var11 = arg1.method255(5, true);
            if (var11 > 15) {
                var11 -= 32;
            }
            var7.method546(field588.field1523[0] + var11, var10 == 1, 453, field588.field1522[0] + var9);
        }
        arg1.method256(-88);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILGLMIQHJI;)V")
    private final void method55(boolean arg0, int arg1, class21 arg2) {
        if (!arg0) {
            for (int var4 = 0; var4 < this.field396; ++var4) {
                int var5 = this.field397[var4];
                class46 var6 = this.field439[var5];
                int var7 = arg2.method244();
                if ((var7 & 32) != 0) {
                    int var8 = arg2.method244();
                    int var9 = arg2.method264(3);
                    var6.method547(var9, field332, 500, var8);
                    var6.field1529 = field332 + 300;
                    var6.field1530 = arg2.method264(3);
                    var6.field1531 = arg2.method264(3);
                }
                if ((var7 & 8) != 0) {
                    var6.field1503 = arg2.method251();
                    var6.field1483 = 100;
                }
                if ((var7 & 1) != 0) {
                    var6.field1490 = arg2.method272((byte) -116);
                    int var10 = arg2.method278(0);
                    var6.field1494 = var10 >> 16;
                    var6.field1493 = (var10 & 65535) + field332;
                    var6.field1491 = 0;
                    var6.field1492 = 0;
                    if (var6.field1493 > field332) {
                        var6.field1491 = -1;
                    }
                    if (var6.field1490 == 65535) {
                        var6.field1490 = -1;
                    }
                }
                if ((var7 & 16) != 0) {
                    var6.field1480 = arg2.method246();
                    var6.field1481 = arg2.method273(this.field207);
                }
                if ((var7 & 2) != 0) {
                    var6.field1140 = class36.method380(arg2.method274((byte) -81));
                    var6.field1532 = var6.field1140.field1037;
                    var6.field1496 = var6.field1140.field1026;
                    var6.field1516 = var6.field1140.field1012;
                    var6.field1517 = var6.field1140.field1041;
                    var6.field1518 = var6.field1140.field1046;
                    var6.field1519 = var6.field1140.field1021;
                    var6.field1484 = var6.field1140.field1038;
                }
                if ((var7 & 4) != 0) {
                    int var11 = arg2.method274((byte) -81);
                    if (var11 == 65535) {
                        var11 = -1;
                    }
                    int var12 = arg2.method264(3);
                    if (var6.field1524 == var11 && var11 != -1) {
                        int var13 = class59.field1538[var11].field1552;
                        if (var13 == 1) {
                            var6.field1525 = 0;
                            var6.field1526 = 0;
                            var6.field1527 = var12;
                            var6.field1528 = 0;
                        }
                        if (var13 == 2) {
                            var6.field1528 = 0;
                        }
                    } else if (var11 == -1 || var6.field1524 == -1 || class59.field1538[var11].field1546 >= class59.field1538[var6.field1524].field1546) {
                        var6.field1524 = var11;
                        var6.field1525 = 0;
                        var6.field1526 = 0;
                        var6.field1527 = var12;
                        var6.field1528 = 0;
                        var6.field1505 = var6.field1489;
                    }
                }
                if ((var7 & 64) != 0) {
                    var6.field1486 = arg2.method246();
                    if (var6.field1486 == 65535) {
                        var6.field1486 = -1;
                    }
                }
                if ((var7 & 128) != 0) {
                    int var14 = arg2.method263(0);
                    int var15 = arg2.method265(535);
                    var6.method547(var15, field332, 500, var14);
                    var6.field1529 = field332 + 300;
                    var6.field1530 = arg2.method244();
                    var6.field1531 = arg2.method263(0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Z)Z")
    public final boolean method56(String arg0, boolean arg1) {
        if (arg0 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field183; ++var3) {
                if (arg0.equalsIgnoreCase(this.field486[var3])) {
                    return true;
                }
            }
            if (arg1) {
                this.field386 = this.field269.method244();
            }
            return arg0.equalsIgnoreCase(field588.field1094);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)Z")
    public final boolean method57(boolean arg0) {
        if (!arg0) {
            this.field586 = -192;
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method58(boolean arg0) {
        if (this.field551 >= 2 || this.field417 != 0 || this.field208 != 0) {
            this.field454 &= arg0;
            String var2;
            if (this.field417 == 1 && this.field551 < 2) {
                var2 = "Use " + this.field421 + " with...";
            } else if (this.field208 == 1 && this.field551 < 2) {
                var2 = this.field211 + "...";
            } else {
                var2 = this.field643[this.field551 - 1];
            }
            if (this.field551 > 2) {
                var2 = var2 + "@whi@ / " + (this.field551 - 2) + " more options";
            }
            this.field444.method199(field332 / 1000, true, 15, var2, this.field375, 4, 16777215);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLUSEDZXXV;)V")
    public final void method59(byte arg0, class52 arg1) {
        if (this.field245 == arg0) {
            boolean var3 = false;
        } else {
            this.field214.method234(50);
        }
        int var4 = arg1.field1350;
        if ((var4 < 1 || var4 > 100) && (var4 < 701 || var4 > 800)) {
            if (var4 >= 101 && var4 <= 200 || var4 >= 801 && var4 <= 900) {
                int var6 = this.field183;
                if (this.field184 != 2) {
                    var6 = 0;
                }
                if (var4 > 800) {
                    var4 -= 701;
                } else {
                    var4 -= 101;
                }
                if (var4 >= var6) {
                    arg1.field1361 = "";
                    arg1.field1340 = 0;
                } else {
                    if (this.field343[var4] == 0) {
                        arg1.field1361 = "@red@Offline";
                    } else if (this.field343[var4] == field230) {
                        arg1.field1361 = "@gre@World-" + (this.field343[var4] - 9);
                    } else {
                        arg1.field1361 = "@yel@World-" + (this.field343[var4] - 9);
                    }
                    arg1.field1340 = 1;
                }
            } else if (var4 == 203) {
                int var7 = this.field183;
                if (this.field184 != 2) {
                    var7 = 0;
                }
                arg1.field1317 = var7 * 15 + 20;
                if (arg1.field1317 <= arg1.field1345) {
                    arg1.field1317 = arg1.field1345 + 1;
                }
            } else if (var4 >= 401 && var4 <= 500) {
                var4 -= 401;
                if (var4 == 0 && this.field184 == 0) {
                    arg1.field1361 = "Loading ignore list";
                    arg1.field1340 = 0;
                } else if (var4 == 1 && this.field184 == 0) {
                    arg1.field1361 = "Please wait...";
                    arg1.field1340 = 0;
                } else {
                    int var8 = this.field194;
                    if (this.field184 == 0) {
                        var8 = 0;
                    }
                    if (var4 >= var8) {
                        arg1.field1361 = "";
                        arg1.field1340 = 0;
                    } else {
                        arg1.field1361 = class70.method587(class70.method584(this.field330[var4], 803), true);
                        arg1.field1340 = 1;
                    }
                }
            } else if (var4 == 503) {
                arg1.field1317 = this.field194 * 15 + 20;
                if (arg1.field1317 <= arg1.field1345) {
                    arg1.field1317 = arg1.field1345 + 1;
                }
            } else if (var4 == 327) {
                arg1.field1304 = 150;
                arg1.field1305 = (int) (Math.sin((double) field332 / 40.0D) * 256.0D) & 2047;
                if (this.field517) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field644[var9];
                        if (var16 >= 0 && !class18.field779[var16].method223(this.field390)) {
                            return;
                        }
                    }
                    this.field517 = false;
                    class53[] var10 = new class53[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field644[var12];
                        if (var15 >= 0) {
                            var10[var11++] = class18.field779[var15].method224((byte) 4);
                        }
                    }
                    class53 var13 = new class53(var11, var10, -11616);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field585[var14] != 0) {
                            var13.method514(field415[var14][0], field415[var14][this.field585[var14]]);
                            if (var14 == 1) {
                                var13.method514(field315[0], field315[this.field585[var14]]);
                            }
                        }
                    }
                    var13.method507(0);
                    var13.method508(999, class59.field1538[field588.field1484].field1540[0]);
                    var13.method517(64, 850, -30, -50, -30, true);
                    arg1.field1320 = 5;
                    arg1.field1321 = 0;
                    class52.method495((byte) -117, var13, 5, 0);
                }
            } else if (var4 == 324) {
                if (this.field618 == null) {
                    this.field618 = arg1.field1319;
                    this.field619 = arg1.field1344;
                }
                if (this.field554) {
                    arg1.field1319 = this.field619;
                } else {
                    arg1.field1319 = this.field618;
                }
            } else if (var4 == 325) {
                if (this.field618 == null) {
                    this.field618 = arg1.field1319;
                    this.field619 = arg1.field1344;
                }
                if (this.field554) {
                    arg1.field1319 = this.field618;
                } else {
                    arg1.field1319 = this.field619;
                }
            } else if (var4 == 600) {
                arg1.field1361 = this.field500;
                if (field332 % 20 < 10) {
                    arg1.field1361 = arg1.field1361 + "|";
                } else {
                    arg1.field1361 = arg1.field1361 + " ";
                }
            } else {
                if (var4 == 613) {
                    if (this.field337 >= 1) {
                        if (this.field565) {
                            arg1.field1330 = 16711680;
                            arg1.field1361 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg1.field1330 = 16777215;
                            arg1.field1361 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg1.field1361 = "";
                    }
                }
                if (var4 == 650 || var4 == 655) {
                    if (this.field321 != 0) {
                        String var17;
                        if (this.field336 == 0) {
                            var17 = "earlier today";
                        } else if (this.field336 == 1) {
                            var17 = "yesterday";
                        } else {
                            var17 = this.field336 + " days ago";
                        }
                        arg1.field1361 = "You last logged in " + var17 + " from: " + signlink.dns;
                    } else {
                        arg1.field1361 = "";
                    }
                }
                if (var4 == 651) {
                    if (this.field243 == 0) {
                        arg1.field1361 = "0 unread messages";
                        arg1.field1330 = 16776960;
                    }
                    if (this.field243 == 1) {
                        arg1.field1361 = "1 unread message";
                        arg1.field1330 = 65280;
                    }
                    if (this.field243 > 1) {
                        arg1.field1361 = this.field243 + " unread messages";
                        arg1.field1330 = 65280;
                    }
                }
                if (var4 == 652) {
                    if (this.field513 == 201) {
                        if (this.field198 == 1) {
                            arg1.field1361 = "@yel@This is a non-members world: @whi@Since you are a member we";
                        } else {
                            arg1.field1361 = "";
                        }
                    } else if (this.field513 == 200) {
                        arg1.field1361 = "You have not yet set any password recovery questions.";
                    } else {
                        String var18;
                        if (this.field513 == 0) {
                            var18 = "Earlier today";
                        } else if (this.field513 == 1) {
                            var18 = "Yesterday";
                        } else {
                            var18 = this.field513 + " days ago";
                        }
                        arg1.field1361 = var18 + " you changed your recovery questions";
                    }
                }
                if (var4 == 653) {
                    if (this.field513 == 201) {
                        if (this.field198 == 1) {
                            arg1.field1361 = "@whi@recommend you use a members world instead. You may use";
                        } else {
                            arg1.field1361 = "";
                        }
                    } else if (this.field513 == 200) {
                        arg1.field1361 = "We strongly recommend you do so now to secure your account.";
                    } else {
                        arg1.field1361 = "If you do not remember making this change then cancel it immediately";
                    }
                }
                if (var4 == 654) {
                    if (this.field513 == 201) {
                        if (this.field198 == 1) {
                            arg1.field1361 = "@whi@this world but member benefits are unavailable whilst here.";
                        } else {
                            arg1.field1361 = "";
                        }
                    } else if (this.field513 == 200) {
                        arg1.field1361 = "Do this from the 'account management' area on our front webpage";
                    } else {
                        arg1.field1361 = "Do this from the 'account management' area on our front webpage";
                    }
                }
            }
        } else if (var4 == 1 && this.field184 == 0) {
            arg1.field1361 = "Loading friend list";
            arg1.field1340 = 0;
        } else if (var4 == 1 && this.field184 == 1) {
            arg1.field1361 = "Connecting to friendserver";
            arg1.field1340 = 0;
        } else if (var4 == 2 && this.field184 != 2) {
            arg1.field1361 = "Please wait...";
            arg1.field1340 = 0;
        } else {
            int var5 = this.field183;
            if (this.field184 != 2) {
                var5 = 0;
            }
            if (var4 > 700) {
                var4 -= 601;
            } else {
                --var4;
            }
            if (var4 >= var5) {
                arg1.field1361 = "";
                arg1.field1340 = 0;
            } else {
                arg1.field1361 = this.field486[var4];
                arg1.field1340 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILGLMIQHJI;)V")
    private final void method60(int arg0, int arg1, class21 arg2) {
        for (int var4 = 0; var4 < this.field396; ++var4) {
            int var5 = this.field397[var4];
            class43 var6 = this.field393[var5];
            int var7 = arg2.method244();
            if ((var7 & 1) != 0) {
                var7 += arg2.method244() << 8;
            }
            this.method153(arg2, var7, var5, var6, (byte) 68);
        }
        if (arg1 != -23557) {
            this.field386 = arg2.method244();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method61(byte arg0) {
        if (arg0 != -69) {
            this.field386 = -1;
        }
        if (field233 && this.field276 == 2 && class63.field1599 != this.field581) {
            this.field350.method393(1);
            this.field443.method190(1, 151, 257, "Loading - please wait.", 0);
            this.field443.method190(1, 150, 256, "Loading - please wait.", 16777215);
            this.field350.method394(super.field71, 4, 4, -47890);
            this.field276 = 1;
            this.field536 = System.currentTimeMillis();
        }
        if (this.field276 == 1) {
            int var2 = this.method62(this.field586);
            if (var2 != 0 && System.currentTimeMillis() - this.field536 > 360000L) {
                signlink.reporterror(this.field180 + " glcfb " + this.field609 + "," + var2 + "," + field233 + "," + this.field594[0] + "," + this.field195.method366() + "," + this.field581 + "," + this.field428 + "," + this.field429);
                this.field536 = System.currentTimeMillis();
            }
        }
        if (this.field276 == 2 && this.field581 != this.field295) {
            this.field295 = this.field581;
            this.method71(this.field581, this.field430);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)I")
    public final int method62(int arg0) {
        if (arg0 < this.field586 || arg0 > this.field586) {
            this.field553 = null;
        }
        for (int var2 = 0; var2 < this.field347.length; ++var2) {
            if (this.field347[var2] == null && this.field615[var2] != -1) {
                return -1;
            }
            if (this.field257[var2] == null && this.field616[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field347.length; ++var4) {
            byte[] var5 = this.field257[var4];
            if (var5 != null) {
                int var6 = (this.field614[var4] >> 8) * 64 - this.field368;
                int var7 = (this.field614[var4] & 255) * 64 - this.field369;
                if (this.field607) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class63.method574(var5, var6, (byte) 7, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field571) {
            return -4;
        } else {
            this.field276 = 2;
            class63.field1599 = this.field581;
            this.method97((byte) 112);
            this.field214.method233(238, 0);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)V")
    public final void method63(int arg0) {
        this.field324 = true;
        if (arg0 != 0) {
            this.field386 = this.field269.method244();
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field289) {
                ++this.field583;
                this.method129(true);
                this.method129(true);
                this.method64(9);
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
        this.field324 = false;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method64(int arg0) {
        short var2 = 256;
        if (this.field482 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field482 > 768) {
                    this.field645[var3] = this.method105(-43, 1024 - this.field482, this.field647[var3], this.field646[var3]);
                } else if (this.field482 > 256) {
                    this.field645[var3] = this.field647[var3];
                } else {
                    this.field645[var3] = this.method105(-43, 256 - this.field482, this.field646[var3], this.field647[var3]);
                }
            }
        } else if (this.field483 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field483 > 768) {
                    this.field645[var4] = this.method105(-43, 1024 - this.field483, this.field648[var4], this.field646[var4]);
                } else if (this.field483 > 256) {
                    this.field645[var4] = this.field648[var4];
                } else {
                    this.field645[var4] = this.method105(-43, 256 - this.field483, this.field646[var4], this.field648[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field645[var5] = this.field646[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field507.field1087[var6] = this.field422.field894[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field436[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field254[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field645[var26];
                    int var30 = this.field507.field1087[var8];
                    this.field507.field1087[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field507.method394(super.field71, 0, 0, -47890);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field508.field1087[var10] = this.field423.field894[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field436[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field254[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field645[var18];
                    int var22 = this.field508.field1087[var16];
                    this.field508.field1087[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field508.method394(super.field71, 637, 0, -47890);
        if (arg0 != 9) {
            this.field433 = !this.field433;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)Z")
    public final boolean method65(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field206.method441(this.field581, arg3, arg1, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method48(0, var7 + 1, var8, 2, false, (byte) 6, 0, 0, field588.field1523[0], arg3, field588.field1522[0], arg1);
            } else {
                class48 var9 = class48.method472(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field1230;
                    var11 = var9.field1262;
                } else {
                    var10 = var9.field1262;
                    var11 = var9.field1230;
                }
                int var12 = var9.field1250;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method48(var11, 0, 0, 2, false, (byte) 6, var10, var12, field588.field1523[0], arg3, field588.field1522[0], arg1);
            }
            this.field279 = super.field86;
            this.field280 = super.field87;
            this.field282 = 2;
            this.field281 = 0;
            if (arg2 < 9 || arg2 > 9) {
                this.field553 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUSEDZXXV;Z)Z")
    public final boolean method66(class52 arg0, boolean arg1) {
        if (arg1) {
            throw new NullPointerException();
        } else {
            int var3 = arg0.field1350;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field643[this.field551] = "Remove @whi@" + arg0.field1361;
                    this.field473[this.field551] = 759;
                    ++this.field551;
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
                this.field643[this.field551] = "Remove @whi@" + this.field486[var3];
                this.field473[this.field551] = 994;
                ++this.field551;
                this.field643[this.field551] = "Message @whi@" + this.field486[var3];
                this.field473[this.field551] = 302;
                ++this.field551;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I)V")
    public final void method21(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field431 != null) {
                this.field431.method351();
            }
        } catch (Exception var2) {
        }
        this.field431 = null;
        this.method109(7);
        if (this.field475 != null) {
            this.field475.field1582 = false;
        }
        this.field475 = null;
        this.field195.method368();
        this.field195 = null;
        this.field438 = null;
        this.field214 = null;
        this.field338 = null;
        this.field269 = null;
        this.field614 = null;
        this.field347 = null;
        this.field257 = null;
        this.field615 = null;
        this.field616 = null;
        this.field285 = null;
        this.field410 = null;
        this.field206 = null;
        this.field453 = null;
        this.field213 = null;
        this.field308 = null;
        this.field595 = null;
        this.field596 = null;
        this.field219 = null;
        this.field348 = null;
        this.field349 = null;
        this.field350 = null;
        this.field351 = null;
        this.field191 = null;
        this.field192 = null;
        this.field193 = null;
        this.field457 = null;
        this.field458 = null;
        this.field459 = null;
        this.field460 = null;
        this.field461 = null;
        this.field462 = null;
        this.field463 = null;
        this.field464 = null;
        this.field465 = null;
        this.field248 = null;
        this.field249 = null;
        this.field250 = null;
        this.field382 = null;
        this.field383 = null;
        this.field384 = null;
        this.field260 = null;
        this.field560 = null;
        this.field561 = null;
        this.field562 = null;
        this.field563 = null;
        this.field564 = null;
        this.field520 = null;
        this.field521 = null;
        this.field522 = null;
        this.field523 = null;
        this.field524 = null;
        this.field253 = null;
        this.field539 = null;
        this.field381 = null;
        this.field628 = null;
        this.field264 = null;
        this.field265 = null;
        this.field266 = null;
        this.field267 = null;
        this.field268 = null;
        this.field446 = null;
        this.field355 = null;
        this.field385 += arg0;
        this.field200 = null;
        this.field393 = null;
        this.field395 = null;
        this.field397 = null;
        this.field398 = null;
        this.field527 = null;
        this.field439 = null;
        this.field441 = null;
        this.field553 = null;
        this.field217 = null;
        this.field402 = null;
        this.field352 = null;
        this.field471 = null;
        this.field472 = null;
        this.field473 = null;
        this.field474 = null;
        this.field643 = null;
        this.field492 = null;
        this.field318 = null;
        this.field319 = null;
        this.field627 = null;
        this.field542 = null;
        this.field486 = null;
        this.field550 = null;
        this.field343 = null;
        this.field507 = null;
        this.field508 = null;
        this.field504 = null;
        this.field505 = null;
        this.field506 = null;
        this.field509 = null;
        this.field510 = null;
        this.field511 = null;
        this.field512 = null;
        this.method124(0);
        class48.method467(2);
        class36.method384(2);
        class2.method3(2);
        class40.field1074 = null;
        class18.field779 = null;
        class52.field1306 = null;
        class17.field767 = null;
        class59.field1538 = null;
        class64.field1620 = null;
        class64.field1632 = null;
        class4.field95 = null;
        super.field72 = null;
        class43.field1122 = null;
        class9.method172(2);
        class47.method410(2);
        class53.method496(2);
        class51.method487(2);
        System.gc();
        if (class62.field1590) {
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)V")
    public final void method67(boolean arg0) {
        this.field454 &= arg0;
        this.field630 = new class57(this.field452, "titlebox", 0);
        this.field631 = new class57(this.field452, "titlebutton", 0);
        this.field478 = new class57[12];
        int var2 = 0;
        try {
            var2 = Integer.parseInt(this.getParameter("fl_icon"));
        } catch (Exception var19) {
        }
        if (var2 == 0) {
            for (int var3 = 0; var3 < 12; ++var3) {
                this.field478[var3] = new class57(this.field452, "runes", var3);
            }
        } else {
            for (int var4 = 0; var4 < 12; ++var4) {
                this.field478[var4] = new class57(this.field452, "runes", (var4 & 3) + 12);
            }
        }
        this.field422 = new class26(128, 265);
        this.field423 = new class26(128, 265);
        for (int var5 = 0; var5 < 33920; ++var5) {
            this.field422.field894[var5] = this.field507.field1087[var5];
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field423.field894[var6] = this.field508.field1087[var6];
        }
        this.field646 = new int[256];
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field646[var7] = var7 * 262144;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field646[var8 + 64] = var8 * 1024 + 16711680;
        }
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field646[var9 + 128] = var9 * 4 + 16776960;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field646[var10 + 192] = 16777215;
        }
        this.field647 = new int[256];
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field647[var11] = var11 * 1024;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field647[var12 + 64] = var12 * 4 + 65280;
        }
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field647[var13 + 128] = var13 * 262144 + 65535;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field647[var14 + 192] = 16777215;
        }
        this.field648 = new int[256];
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field648[var15] = var15 * 4;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field648[var16 + 64] = var16 * 262144 + 255;
        }
        for (int var17 = 0; var17 < 64; ++var17) {
            this.field648[var17 + 128] = var17 * 1024 + 16711935;
        }
        for (int var18 = 0; var18 < 64; ++var18) {
            this.field648[var18 + 192] = 16777215;
        }
        this.field645 = new int[256];
        this.field299 = new int[32768];
        this.field300 = new int[32768];
        this.method115(this.field620, (class57) null);
        this.field254 = new int[32768];
        this.field255 = new int[32768];
        this.method26((byte) 62, 10, "Connecting to fileserver");
        if (!this.field289) {
            this.field182 = true;
            this.field289 = true;
            this.method25(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILGLMIQHJI;B)V")
    private final void method68(int arg0, class21 arg1, byte arg2) {
        arg1.method254(this.field477);
        int var4 = arg1.method255(8, true);
        if (var4 < this.field440) {
            for (int var5 = var4; var5 < this.field440; ++var5) {
                this.field527[this.field526++] = this.field441[var5];
            }
        }
        if (var4 > this.field440) {
            signlink.reporterror(this.field180 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field440 = 0;
            if (arg2 == 9) {
                boolean var6 = false;
            } else {
                this.field214.method234(122);
            }
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field441[var7];
                class46 var9 = this.field439[var8];
                int var10 = arg1.method255(1, true);
                if (var10 == 0) {
                    this.field441[this.field440++] = var8;
                    var9.field1501 = field332;
                } else {
                    int var11 = arg1.method255(2, true);
                    if (var11 == 0) {
                        this.field441[this.field440++] = var8;
                        var9.field1501 = field332;
                        this.field397[this.field396++] = var8;
                    } else if (var11 == 1) {
                        this.field441[this.field440++] = var8;
                        var9.field1501 = field332;
                        int var12 = arg1.method255(3, true);
                        var9.method544(false, var12, 908);
                        int var13 = arg1.method255(1, true);
                        if (var13 == 1) {
                            this.field397[this.field396++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field441[this.field440++] = var8;
                        var9.field1501 = field332;
                        int var14 = arg1.method255(3, true);
                        var9.method544(true, var14, 908);
                        int var15 = arg1.method255(3, true);
                        var9.method544(true, var15, 908);
                        int var16 = arg1.method255(1, true);
                        if (var16 == 1) {
                            this.field397[this.field396++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field527[this.field526++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != 15546) {
            this.field207 = this.field199.method29();
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)Ljava/lang/String;")
    public final String method70(int arg0) {
        if (arg0 != -14660) {
            this.field386 = -1;
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field74 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IB)V")
    public final void method71(int arg0, byte arg1) {
        int[] var3 = this.field542.field894;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field410[arg0][var24][var6] & 24) == 0) {
                    this.field206.method446(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field410[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field206.method446(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field542.method326(1);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field410[arg0][var22][var9] & 24) == 0) {
                    this.method165(-508, var7, var9, var8, var22, arg0);
                }
                if (arg0 < 3 && (this.field410[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method165(-508, var7, var9, var8, var22, arg0 + 1);
                }
            }
        }
        this.field350.method393(1);
        this.field317 = 0;
        if (this.field430 != arg1) {
            this.field377 = -268;
        }
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field206.method440(this.field581, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class48.method472(var13).field1226;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field453[this.field581].field749;
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
                        this.field627[this.field317] = this.field355[var14];
                        this.field318[this.field317] = var15;
                        this.field319[this.field317] = var16;
                        ++this.field317;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILWAJZGBEE;)V")
    public final void method72(int arg0, int arg1, class58 arg2) {
        this.method73(arg2.field1506, arg2.field1507, 190, arg1);
        if (this.field629 == arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)V")
    public final void method73(int arg0, int arg1, int arg2, int arg3) {
        if (arg0 >= 128 && arg1 >= 128 && arg0 <= 13056 && arg1 <= 13056) {
            int var5 = this.method119(arg1, this.field581, arg0, -23) - arg3;
            int var6 = arg0 - this.field224;
            int var7 = var5 - this.field225;
            int var8 = arg1 - this.field226;
            int var9 = 39 / arg2;
            int var10 = class53.field1442[this.field227];
            int var11 = class53.field1443[this.field227];
            int var12 = class53.field1442[this.field228];
            int var13 = class53.field1443[this.field228];
            int var14 = var6 * var13 + var8 * var12 >> 16;
            int var15 = var8 * var13 - var6 * var12 >> 16;
            int var17 = var7 * var11 - var10 * var15 >> 16;
            int var18 = var7 * var10 + var11 * var15 >> 16;
            if (var18 >= 50) {
                this.field425 = (var14 << 9) / var18 + class9.field671;
                this.field426 = (var17 << 9) / var18 + class9.field672;
            } else {
                this.field425 = -1;
                this.field426 = -1;
            }
        } else {
            this.field425 = -1;
            this.field426 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method74(int arg0) {
        if (arg0 >= 0) {
            this.field553 = null;
        }
        for (int var2 = 0; var2 < this.field190; ++var2) {
            if (this.field597[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field320[var2] == this.field284 && this.field196[var2] == this.field494) {
                        if (!this.method57(true)) {
                            var3 = true;
                        }
                    } else {
                        class21 var4 = class8.method167(this.field196[var2], -740, this.field320[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field818 / 22) > (long) (this.field178 / 22) + this.field407) {
                            this.field178 = var4.field818;
                            this.field407 = System.currentTimeMillis();
                            if (this.method107(44339, var4.field817, var4.field818)) {
                                this.field284 = this.field320[var2];
                                this.field494 = this.field196[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field597[var2] != -5) {
                    this.field597[var2] = -5;
                } else {
                    --this.field190;
                    for (int var6 = var2; var6 < this.field190; ++var6) {
                        this.field320[var6] = this.field320[var6 + 1];
                        this.field196[var6] = this.field196[var6 + 1];
                        this.field597[var6] = this.field597[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field597[var2]--;
            }
        }
        if (this.field244 > 0) {
            this.field244 -= 20;
            if (this.field244 < 0) {
                this.field244 = 0;
            }
            if (this.field244 == 0 && this.field568 && !field233) {
                this.field322 = this.field204;
                this.field323 = true;
                this.field195.method365(2, this.field322);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method75(int arg0, int arg1) {
        if (arg1 != 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZBI)V")
    public final void method76(boolean arg0, byte arg1, int arg2) {
        if (arg1 == 2) {
            boolean var4 = false;
        } else {
            this.field189 = -405;
        }
        signlink.midivol = arg2;
        if (arg0) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILGLMIQHJI;I)V")
    private final void method77(int arg0, class21 arg1, int arg2) {
        this.field526 = 0;
        this.field396 = 0;
        this.method68(arg2, arg1, (byte) 9);
        this.method136(arg2, arg1, false);
        if (arg0 <= 0) {
            this.field214.method234(76);
        }
        this.method55(false, arg2, arg1);
        for (int var4 = 0; var4 < this.field526; ++var4) {
            int var6 = this.field527[var4];
            if (field332 != this.field439[var6].field1501) {
                this.field439[var6].field1140 = null;
                this.field439[var6] = null;
            }
        }
        if (arg1.field818 != arg2) {
            signlink.reporterror(this.field180 + " size mismatch in getnpcpos - pos:" + arg1.field818 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field440; ++var5) {
                if (this.field439[this.field441[var5]] == null) {
                    signlink.reporterror(this.field180 + " null entry in npc list - pos:" + var5 + " size:" + this.field440);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method22(int arg0) {
        if (arg0 != 1) {
            this.field553 = null;
        }
        if (!this.field535 && !this.field334 && !this.field544) {
            ++field234;
            if (!this.field454) {
                this.method47((byte) 124, false);
            } else {
                this.method148((byte) -113);
            }
            this.field376 = 0;
        } else {
            this.method116(-38814);
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method78(int arg0) {
        try {
            if (this.field431 != null) {
                this.field431.method351();
            }
        } catch (Exception var3) {
        }
        this.field431 = null;
        this.field454 = false;
        this.field449 = 0;
        this.field180 = "";
        this.field181 = "";
        if (arg0 > 0) {
            this.method133((byte) 110);
            this.field206.method411(true);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field453[var2].method205();
            }
            System.gc();
            this.method109(7);
            this.field204 = -1;
            this.field322 = -1;
            this.field244 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZZ)V")
    public final void method79(boolean arg0, boolean arg1) {
        if (field588.field1506 >> 7 == this.field540 && field588.field1507 >> 7 == this.field541) {
            this.field540 = 0;
        }
        int var3 = this.field394;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class43 var5;
            int var6;
            if (arg0) {
                var5 = field588;
                var6 = this.field392 << 14;
            } else {
                var5 = this.field393[this.field395[var4]];
                var6 = this.field395[var4] << 14;
            }
            if (var5 != null && var5.method404((byte) 4)) {
                var5.field1117 = false;
                if ((field233 && this.field394 > 50 || this.field394 > 200) && !arg0 && var5.field1533 == var5.field1484) {
                    var5.field1117 = true;
                }
                int var7 = var5.field1506 >> 7;
                int var8 = var5.field1507 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field1116 != null && field332 >= var5.field1111 && field332 < var5.field1112) {
                        var5.field1117 = false;
                        var5.field1120 = this.method119(var5.field1507, this.field581, var5.field1506, -23);
                        this.field206.method423(var5.field1101, var5.field1507, var5, this.field581, var5.field1508, false, var5.field1120, var6, var5.field1099, var5.field1100, var5.field1102, var5.field1506, 60);
                    } else {
                        if ((var5.field1506 & 127) == 64 && (var5.field1507 & 127) == 64) {
                            if (this.field200[var7][var8] == this.field374) {
                                continue;
                            }
                            this.field200[var7][var8] = this.field374;
                        }
                        var5.field1120 = this.method119(var5.field1507, this.field581, var5.field1506, -23);
                        this.field206.method422(this.field581, var5.field1500, var6, false, var5, var5.field1507, var5.field1506, var5.field1508, 60, var5.field1120);
                    }
                }
            }
        }
        if (arg1) {
            this.field386 = this.field269.method244();
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method80(int arg0) {
        this.field517 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field644[var2] = -1;
            for (int var3 = 0; var3 < class18.field778; ++var3) {
                if (!class18.field779[var3].field785 && class18.field779[var3].field780 == var2 + (this.field554 ? 0 : 7)) {
                    this.field644[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 != 2) {
            this.field503 = -158;
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    public final void method81(byte arg0) {
        this.field349.method393(1);
        if (this.field287 == 2) {
            byte[] var2 = this.field249.field1472;
            int[] var3 = class50.field1278;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field253.method335(this.field401, 0, 1, 25, 33, this.field303, this.field367, 256, 25, 0, 33);
            this.field350.method393(1);
        } else {
            int var6 = this.field518 + this.field303 & 2047;
            int var7 = field588.field1506 / 32 + 48;
            int var8 = 464 - field588.field1507 / 32;
            this.field542.method335(this.field222, 5, 1, var7, 151, var6, this.field363, this.field344 + 256, var8, 25, 146);
            this.field253.method335(this.field401, 0, 1, 25, 33, this.field303, this.field367, 256, 25, 0, 33);
            for (int var9 = 0; var9 < this.field317; ++var9) {
                int var39 = this.field318[var9] * 4 + 2 - field588.field1506 / 32;
                int var40 = this.field319[var9] * 4 + 2 - field588.field1507 / 32;
                this.method121(this.field627[var9], var40, (byte) 1, var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class54 var36 = this.field553[this.field581][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field588.field1506 / 32;
                        int var38 = var35 * 4 + 2 - field588.field1507 / 32;
                        this.method121(this.field264, var38, (byte) 1, var37);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field440; ++var11) {
                class46 var31 = this.field439[this.field441[var11]];
                if (var31 != null && var31.method404((byte) 4)) {
                    class36 var32 = var31.field1140;
                    if (var32.field1039 != null) {
                        var32 = var32.method383(-23798);
                    }
                    if (var32 != null && var32.field1013) {
                        int var33 = var31.field1506 / 32 - field588.field1506 / 32;
                        int var34 = var31.field1507 / 32 - field588.field1507 / 32;
                        this.method121(this.field265, var34, (byte) 1, var33);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field394; ++var12) {
                class43 var23 = this.field393[this.field395[var12]];
                if (var23 != null && var23.method404((byte) 4)) {
                    int var24 = var23.field1506 / 32 - field588.field1506 / 32;
                    int var25 = var23.field1507 / 32 - field588.field1507 / 32;
                    boolean var26 = false;
                    long var27 = class70.method583(var23.field1094);
                    for (int var29 = 0; var29 < this.field183; ++var29) {
                        if (this.field550[var29] == var27 && this.field343[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field588.field1103 != 0 && var23.field1103 != 0 && field588.field1103 == var23.field1103) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method121(this.field267, var25, (byte) 1, var24);
                    } else if (var30) {
                        this.method121(this.field268, var25, (byte) 1, var24);
                    } else {
                        this.method121(this.field266, var25, (byte) 1, var24);
                    }
                }
            }
            if (arg0 == 13) {
                if (this.field365 != 0 && field332 % 20 < 10) {
                    if (this.field365 == 1 && this.field251 >= 0 && this.field251 < this.field439.length) {
                        class46 var13 = this.field439[this.field251];
                        if (var13 != null) {
                            int var14 = var13.field1506 / 32 - field588.field1506 / 32;
                            int var15 = var13.field1507 / 32 - field588.field1507 / 32;
                            this.method83(this.field292, -46, var14, var15);
                        }
                    }
                    if (this.field365 == 2) {
                        int var16 = (this.field356 - this.field368) * 4 + 2 - field588.field1506 / 32;
                        int var17 = (this.field357 - this.field369) * 4 + 2 - field588.field1507 / 32;
                        this.method83(this.field292, -46, var16, var17);
                    }
                    if (this.field365 == 10 && this.field514 >= 0 && this.field514 < this.field393.length) {
                        class43 var18 = this.field393[this.field514];
                        if (var18 != null) {
                            int var19 = var18.field1506 / 32 - field588.field1506 / 32;
                            int var20 = var18.field1507 / 32 - field588.field1507 / 32;
                            this.method83(this.field292, -46, var19, var20);
                        }
                    }
                }
                if (this.field540 != 0) {
                    int var21 = this.field540 * 4 + 2 - field588.field1506 / 32;
                    int var22 = this.field541 * 4 + 2 - field588.field1507 / 32;
                    this.method121(this.field291, var22, (byte) 1, var21);
                }
                class50.method478(3, 97, 16777215, 78, 3, (byte) 1);
                this.field350.method393(1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLUSEDZXXV;)Z")
    public final boolean method82(byte arg0, class52 arg1) {
        if (arg1.field1352 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1352.length; ++var3) {
                int var4 = this.method108(var3, arg1, (byte) 63);
                int var5 = arg1.field1355[var3];
                if (arg1.field1352[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1352[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1352[var3] == 4) {
                    if (var4 == var5) {
                        return false;
                    }
                } else if (var4 != var5) {
                    return false;
                }
            }
            if (arg0 != 21) {
                throw new NullPointerException();
            } else {
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LINVDQNJU;III)V")
    public final void method83(class26 arg0, int arg1, int arg2, int arg3) {
        if (arg1 >= 0) {
            this.field553 = null;
        }
        int var5 = arg2 * arg2 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field518 + this.field303 & 2047;
            int var7 = class53.field1442[var6];
            int var8 = class53.field1443[var6];
            int var9 = var7 * 256 / (this.field344 + 256);
            int var10 = var8 * 256 / (this.field344 + 256);
            int var11 = arg2 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg2 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field621.method336(20, 256, var15 + 94 + 4 - 10, 2, 83 - var16 - 20, var13, 20, 15, 15);
        } else {
            this.method121(arg0, arg3, (byte) 1, arg2);
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method84(int arg0) {
        if (arg0 != 3) {
            this.method19();
        }
        try {
            int var2 = field588.field1506 + this.field556;
            int var3 = field588.field1507 + this.field202;
            if (this.field235 - var2 < -500 || this.field235 - var2 > 500 || this.field236 - var3 < -500 || this.field236 - var3 > 500) {
                this.field235 = var2;
                this.field236 = var3;
            }
            if (this.field235 != var2) {
                this.field235 += (var2 - this.field235) / 16;
            }
            if (this.field236 != var3) {
                this.field236 += (var3 - this.field236) / 16;
            }
            if (super.field89[1] == 1) {
                this.field304 += (-24 - this.field304) / 2;
            } else if (super.field89[2] == 1) {
                this.field304 += (24 - this.field304) / 2;
            } else {
                this.field304 /= 2;
            }
            if (super.field89[3] == 1) {
                this.field305 += (12 - this.field305) / 2;
            } else if (super.field89[4] == 1) {
                this.field305 += (-12 - this.field305) / 2;
            } else {
                this.field305 /= 2;
            }
            this.field303 = this.field304 / 2 + this.field303 & 2047;
            this.field302 += this.field305 / 2;
            if (this.field302 < 128) {
                this.field302 = 128;
            }
            if (this.field302 > 383) {
                this.field302 = 383;
            }
            int var4 = this.field235 >> 7;
            int var5 = this.field236 >> 7;
            int var6 = this.method119(this.field236, this.field581, this.field235, -23);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field581;
                        if (var10 < 3 && (this.field410[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field285[var10][var8][var9];
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
            if (var12 > this.field316) {
                this.field316 += (var12 - this.field316) / 24;
            } else if (var12 < this.field316) {
                this.field316 += (var12 - this.field316) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field588.field1506 + "," + field588.field1507 + "," + this.field235 + "," + this.field236 + "," + this.field428 + "," + this.field429 + "," + this.field368 + "," + this.field369);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (arg0 != -44097) {
            this.field386 = -1;
        }
        if (this.field449 == 0) {
            int var2 = super.field69 / 2 - 80;
            int var3 = super.field70 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field85 == 1 && super.field86 >= var2 - 75 && super.field86 <= var2 + 75 && super.field87 >= var14 - 20 && super.field87 <= var14 + 20) {
                this.field449 = 3;
                this.field555 = 0;
            }
            int var4 = super.field69 / 2 + 80;
            if (super.field85 == 1 && super.field86 >= var4 - 75 && super.field86 <= var4 + 75 && super.field87 >= var14 - 20 && super.field87 <= var14 + 20) {
                this.field309 = "";
                this.field310 = "Enter your username & password.";
                this.field449 = 2;
                this.field555 = 0;
            }
        } else if (this.field449 == 2) {
            int var5 = super.field70 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field85 == 1 && super.field87 >= var16 - 15 && super.field87 < var16) {
                this.field555 = 0;
            }
            var5 = var16 + 15;
            if (super.field85 == 1 && super.field87 >= var5 - 15 && super.field87 < var5) {
                this.field555 = 1;
            }
            var5 += 15;
            int var6 = super.field69 / 2 - 80;
            int var7 = super.field70 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field85 == 1 && super.field86 >= var6 - 75 && super.field86 <= var6 + 75 && super.field87 >= var17 - 20 && super.field87 <= var17 + 20) {
                this.field409 = 0;
                this.method87(this.field180, this.field181, false);
                if (this.field454) {
                    return;
                }
            }
            int var8 = super.field69 / 2 + 80;
            if (super.field85 == 1 && super.field86 >= var8 - 75 && super.field86 <= var8 + 75 && super.field87 >= var17 - 20 && super.field87 <= var17 + 20) {
                this.field449 = 0;
                this.field180 = "";
                this.field181 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method18(false);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field252.length(); ++var11) {
                        if (var9 == field252.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field555 == 0) {
                        if (var9 == 8 && this.field180.length() > 0) {
                            this.field180 = this.field180.substring(0, this.field180.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field555 = 1;
                        }
                        if (var10) {
                            this.field180 = this.field180 + (char) var9;
                        }
                        if (this.field180.length() > 12) {
                            this.field180 = this.field180.substring(0, 12);
                        }
                    } else if (this.field555 == 1) {
                        if (var9 == 8 && this.field181.length() > 0) {
                            this.field181 = this.field181.substring(0, this.field181.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field555 = 0;
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
            if (this.field449 == 3) {
                int var12 = super.field69 / 2;
                int var13 = super.field70 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field85 == 1 && super.field86 >= var12 - 75 && super.field86 <= var12 + 75 && super.field87 >= var18 - 20 && super.field87 <= var18 + 20) {
                    this.field449 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method86(int arg0) {
        this.field351.method393(1);
        class9.field677 = this.field572;
        this.field250.method542(0, 272, 0);
        if (this.field414) {
            this.field444.method190(1, 40, 239, this.field593, 0);
            this.field444.method190(1, 60, 239, this.field378 + "*", 128);
        } else if (this.field399 == 1) {
            this.field444.method190(1, 40, 239, "Enter amount:", 0);
            this.field444.method190(1, 60, 239, this.field531 + "*", 128);
        } else if (this.field399 == 2) {
            this.field444.method190(1, 40, 239, "Enter name:", 0);
            this.field444.method190(1, 60, 239, this.field531 + "*", 128);
        } else if (this.field223 != null) {
            this.field444.method190(1, 40, 239, this.field223, 0);
            this.field444.method190(1, 60, 239, "Click to continue", 128);
        } else if (this.field582 != -1) {
            this.method164(class52.field1306[this.field582], 0, 0, 851, 0);
        } else if (this.field543 != -1) {
            this.method164(class52.field1306[this.field543], 0, 0, 851, 0);
        } else {
            class11 var2 = this.field443;
            int var3 = 0;
            class50.method475(455, 0, 463, 77, 0);
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field272[var4] != null) {
                    int var6 = this.field270[var4];
                    int var7 = 70 - var3 * 14 + this.field186;
                    String var8 = this.field271[var4];
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
                            var2.method194((byte) 22, this.field272[var4], 0, 4, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field552 == 0 || this.field552 == 1 && this.method56(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            int var10 = 4;
                            if (var9 == 1) {
                                this.field456[0].method542(var10, 272, var7 - 12);
                                var10 += 14;
                            }
                            if (var9 == 2) {
                                this.field456[1].method542(var10, 272, var7 - 12);
                                var10 += 14;
                            }
                            var2.method194((byte) 22, var8 + ":", 0, var10, var7);
                            int var11 = var10 + var2.method192(var8, -989) + 8;
                            var2.method194((byte) 22, this.field272[var4], 255, var11, var7);
                        }
                        ++var3;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field288 == 0 && (var6 == 7 || this.field380 == 0 || this.field380 == 1 && this.method56(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            byte var12 = 4;
                            var2.method194((byte) 22, "From", 0, var12, var7);
                            int var13 = var12 + var2.method192("From ", -989);
                            if (var9 == 1) {
                                this.field456[0].method542(var13, 272, var7 - 12);
                                var13 += 14;
                            }
                            if (var9 == 2) {
                                this.field456[1].method542(var13, 272, var7 - 12);
                                var13 += 14;
                            }
                            var2.method194((byte) 22, var8 + ":", 0, var13, var7);
                            int var14 = var13 + var2.method192(var8, -989) + 8;
                            var2.method194((byte) 22, this.field272[var4], 8388608, var14, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 4 && (this.field278 == 0 || this.field278 == 1 && this.method56(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method194((byte) 22, var8 + " " + this.field272[var4], 8388736, 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 5 && this.field288 == 0 && this.field380 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method194((byte) 22, this.field272[var4], 8388608, 4, var7);
                        }
                        ++var3;
                    }
                    if (var6 == 6 && this.field288 == 0 && this.field380 < 2) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method194((byte) 22, "To " + var8 + ":", 0, 4, var7);
                            var2.method194((byte) 22, this.field272[var4], 8388608, 12 + var2.method192("To " + var8, -989), var7);
                        }
                        ++var3;
                    }
                    if (var6 == 8 && (this.field278 == 0 || this.field278 == 1 && this.method56(var8, false))) {
                        if (var7 > 0 && var7 < 110) {
                            var2.method194((byte) 22, var8 + " " + this.field272[var4], 8270336, 4, var7);
                        }
                        ++var3;
                    }
                }
            }
            class50.method474(1);
            this.field403 = var3 * 14 + 7;
            if (this.field403 < 78) {
                this.field403 = 78;
            }
            this.method101(this.field403, this.field403 - this.field186 - 77, 19571, 77, 463, 0);
            String var5;
            if (field588 != null && field588.field1094 != null) {
                var5 = field588.field1094;
            } else {
                var5 = class70.method587(this.field180, true);
            }
            var2.method194((byte) 22, var5 + ":", 0, 4, 90);
            var2.method194((byte) 22, this.field294 + "*", 255, 6 + var2.method192(var5 + ": ", -989), 90);
            class50.method481(0, 0, 479, 2, 77);
        }
        if (this.field432 && this.field495 == 2) {
            this.method36((byte) -46);
        }
        this.field351.method394(super.field71, 17, 357, -47890);
        if (arg0 == 7) {
            this.field350.method393(1);
            class9.field677 = this.field574;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method87(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field309 = "";
                this.field310 = "Connecting to server...";
                this.method47((byte) 124, true);
            }
            this.field431 = new class34(this, this.method128(field231 + 43594), 614);
            long var4 = class70.method583(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field214.field818 = 0;
            this.field214.method234(14);
            this.field214.method234(var6);
            this.field431.method355(this.field214.field817, 2, 11369, 0);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field431.method352();
            }
            int var8 = this.field431.method352();
            int var9 = var8;
            if (var8 == 0) {
                this.field431.method354(this.field269.field817, 0, 8);
                this.field269.field818 = 0;
                this.field609 = this.field269.method250(true);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field609 >> 32), (int) this.field609 };
                this.field214.field818 = 0;
                this.field214.method234(10);
                this.field214.method238(var10[0]);
                this.field214.method238(var10[1]);
                this.field214.method238(var10[2]);
                this.field214.method238(var10[3]);
                this.field214.method238(signlink.uid);
                this.field214.method241(arg0);
                this.field214.method241(arg1);
                this.field214.method259((byte) -121, field261, field212);
                this.field338.field818 = 0;
                if (arg2) {
                    this.field338.method234(18);
                } else {
                    this.field338.method234(16);
                }
                this.field338.method234(this.field214.field818 + 36 + 1 + 1 + 2);
                this.field338.method234(255);
                this.field338.method235(308);
                this.field338.method234(field233 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field338.method238(this.field491[var11]);
                }
                this.field338.method242(0, this.field214.field818, 0, this.field214.field817);
                this.field214.field822 = new class6((byte) 1, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field199 = new class6((byte) 1, var10);
                this.field431.method355(this.field338.field817, this.field338.field818, 11369, 0);
                var8 = this.field431.method352();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method87(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field337 = this.field431.method352();
                field404 = this.field431.method352() == 1;
                this.field241 = 0L;
                this.field481 = 0;
                this.field475.field1586 = 0;
                super.field76 = true;
                this.field275 = true;
                this.field454 = true;
                this.field214.field818 = 0;
                this.field269.field818 = 0;
                this.field386 = -1;
                this.field411 = -1;
                this.field412 = -1;
                this.field413 = -1;
                this.field385 = 0;
                this.field387 = 0;
                this.field466 = 0;
                this.field389 = 0;
                this.field365 = 0;
                this.field551 = 0;
                this.field432 = false;
                super.field77 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field272[var13] = null;
                }
                this.field417 = 0;
                this.field208 = 0;
                this.field276 = 0;
                this.field190 = 0;
                this.field556 = (int) (Math.random() * 100.0D) - 50;
                this.field202 = (int) (Math.random() * 110.0D) - 55;
                this.field469 = (int) (Math.random() * 80.0D) - 40;
                this.field518 = (int) (Math.random() * 120.0D) - 60;
                this.field344 = (int) (Math.random() * 30.0D) - 20;
                this.field303 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field287 = 0;
                this.field295 = -1;
                this.field540 = 0;
                this.field541 = 0;
                this.field394 = 0;
                this.field440 = 0;
                for (int var14 = 0; var14 < this.field391; ++var14) {
                    this.field393[var14] = null;
                    this.field398[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field439[var15] = null;
                }
                field588 = this.field393[this.field392] = new class43();
                this.field402.method532();
                this.field352.method532();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field553[var16][var17][var18] = null;
                        }
                    }
                }
                this.field217 = new class54((byte) 3);
                this.field184 = 0;
                this.field183 = 0;
                this.field543 = -1;
                this.field582 = -1;
                this.field220 = -1;
                this.field262 = -1;
                this.field451 = -1;
                this.field611 = false;
                this.field242 = 3;
                this.field399 = 0;
                this.field432 = false;
                this.field414 = false;
                this.field223 = null;
                this.field424 = 0;
                this.field290 = -1;
                this.field554 = true;
                this.method80(2);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field585[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field296[var20] = null;
                    this.field297[var20] = false;
                }
                field502 = 0;
                field525 = 0;
                field298 = 0;
                field286 = 0;
                field485 = 0;
                field599 = 0;
                field488 = 0;
                field201 = 0;
                field354 = 0;
                field335 = 0;
                this.method91(42263);
            } else if (var8 == 3) {
                this.field309 = "";
                this.field310 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field309 = "Your account has been disabled.";
                this.field310 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field309 = "Your account is already logged in.";
                this.field310 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field309 = "RuneScape has been updated!";
                this.field310 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field309 = "This world is full.";
                this.field310 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field309 = "Unable to connect.";
                this.field310 = "Login server offline.";
            } else if (var8 == 9) {
                this.field309 = "Login limit exceeded.";
                this.field310 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field309 = "Unable to connect.";
                this.field310 = "Bad session id.";
            } else if (var8 == 11) {
                this.field310 = "Login server rejected session.";
                this.field310 = "Please try again.";
            } else if (var8 == 12) {
                this.field309 = "You need a members account to login to this world.";
                this.field310 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field309 = "Could not complete login.";
                this.field310 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field309 = "The server is being updated.";
                this.field310 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field454 = true;
                this.field214.field818 = 0;
                this.field269.field818 = 0;
                this.field386 = -1;
                this.field411 = -1;
                this.field412 = -1;
                this.field413 = -1;
                this.field385 = 0;
                this.field387 = 0;
                this.field466 = 0;
                this.field551 = 0;
                this.field432 = false;
                this.field536 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field309 = "Login attempts exceeded.";
                this.field310 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field309 = "You are standing in a members-only area.";
                this.field310 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field309 = "Invalid loginserver requested";
                this.field310 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field409 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field409;
                            this.method87(arg0, arg1, arg2);
                        } else {
                            this.field309 = "No response from loginserver";
                            this.field310 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field309 = "No response from server";
                        this.field310 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field309 = "Unexpected server response";
                    this.field310 = "Please try using a different world.";
                }
            } else {
                for (int var21 = this.field431.method352(); var21 >= 0; --var21) {
                    this.field309 = "You have only just left another world";
                    this.field310 = "Your profile will be transferred in: " + var21 + " seconds";
                    this.method47((byte) 124, true);
                    try {
                        Thread.sleep(1000L);
                    } catch (Exception var23) {
                    }
                }
                this.method87(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field309 = "";
            this.field310 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIZIIII)V")
    private final void method88(int arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7, int arg8, int arg9) {
        class13 var11 = null;
        for (class13 var12 = (class13) this.field217.method528(); var12 != null; var12 = (class13) this.field217.method530(true)) {
            if (var12.field728 == arg0 && var12.field730 == arg4 && var12.field731 == arg1 && var12.field729 == arg6) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class13();
            var11.field728 = arg0;
            var11.field729 = arg6;
            var11.field730 = arg4;
            var11.field731 = arg1;
            this.method114(var11, 7);
            this.field217.method525(var11);
        }
        var11.field735 = arg3;
        var11.field737 = arg2;
        var11.field736 = arg7;
        var11.field738 = arg8;
        var11.field727 = arg9;
        this.field454 &= arg5;
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public static final void method89(int arg0) {
        if (arg0 == 0) {
            class47.field1147 = true;
            class9.field666 = true;
            field233 = true;
            class63.field1601 = true;
            class48.field1242 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IB)V")
    public final void method90(int arg0, byte arg1) {
        class52 var3 = class52.field1306[arg0];
        for (int var4 = 0; var4 < var3.field1325.length && var3.field1325[var4] != -1; ++var4) {
            class52 var5 = class52.field1306[var3.field1325[var4]];
            if (var5.field1327 == 1) {
                this.method90(var5.field1358, (byte) -97);
            }
            var5.field1318 = 0;
            var5.field1309 = 0;
        }
        if (arg1 != -97) {
            this.field214.method234(145);
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method91(int arg0) {
        if (this.field351 == null) {
            this.method124(0);
            super.field72 = null;
            this.field504 = null;
            this.field505 = null;
            this.field506 = null;
            this.field507 = null;
            this.field508 = null;
            this.field509 = null;
            this.field510 = null;
            this.field511 = null;
            this.field512 = null;
            this.field351 = new class41(96, 479, true, this.method24(-51));
            this.field349 = new class41(156, 172, true, this.method24(-51));
            class50.method476(-371);
            this.field249.method542(0, 272, 0);
            this.field348 = new class41(261, 190, true, this.method24(-51));
            if (arg0 != 42263) {
                field610 = !field610;
            }
            this.field350 = new class41(334, 512, true, this.method24(-51));
            class50.method476(-371);
            this.field191 = new class41(50, 496, true, this.method24(-51));
            this.field192 = new class41(37, 269, true, this.method24(-51));
            this.field193 = new class41(45, 249, true, this.method24(-51));
            this.field247 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)Z")
    public final boolean method92(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class52 var5 = class52.field1306[arg0];
        for (int var6 = 0; var6 < var5.field1325.length && var5.field1325[var6] != -1; ++var6) {
            class52 var7 = class52.field1306[var5.field1325[var6]];
            if (var7.field1327 == 1) {
                var4 |= this.method92(var7.field1358, arg1, 0);
            }
            if (var7.field1327 == 6 && (var7.field1342 != -1 || var7.field1343 != -1)) {
                boolean var8 = this.method82(this.field197, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1343;
                } else {
                    var9 = var7.field1342;
                }
                if (var9 != -1) {
                    class59 var10 = class59.field1538[var9];
                    var7.field1309 += arg1;
                    while (var7.field1309 > var10.method549(var7.field1318, 0)) {
                        var7.field1309 -= var10.method549(var7.field1318, 0) + 1;
                        ++var7.field1318;
                        if (var7.field1318 >= var10.field1539) {
                            var7.field1318 -= var10.field1543;
                            if (var7.field1318 < 0 || var7.field1318 >= var10.field1539) {
                                var7.field1318 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
        }
        this.field385 += arg2;
        return var4;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        this.field348.method393(1);
        class9.field677 = this.field573;
        this.field248.method542(0, 272, 0);
        if (this.field262 != -1) {
            this.method164(class52.field1306[this.field262], 0, 0, 851, 0);
        } else if (this.field362[this.field242] != -1) {
            this.method164(class52.field1306[this.field362[this.field242]], 0, 0, 851, 0);
        }
        if (this.field432 && this.field495 == 1) {
            this.method36((byte) -46);
        }
        this.field348.method394(super.field71, 553, 205, -47890);
        if (!arg0) {
            this.field350.method393(1);
            class9.field677 = this.field574;
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method94(int arg0) {
        if (arg0 > 0) {
            if (this.field288 != 0) {
                int var2 = 0;
                if (this.field466 != 0) {
                    var2 = 1;
                }
                for (int var3 = 0; var3 < 100; ++var3) {
                    if (this.field272[var3] != null) {
                        int var4 = this.field270[var3];
                        String var5 = this.field271[var3];
                        boolean var6 = false;
                        if (var5 != null && var5.startsWith("@cr1@")) {
                            var5 = var5.substring(5);
                            boolean var7 = true;
                        }
                        if (var5 != null && var5.startsWith("@cr2@")) {
                            var5 = var5.substring(5);
                            boolean var8 = true;
                        }
                        if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field380 == 0 || this.field380 == 1 && this.method56(var5, false))) {
                            int var9 = 329 - var2 * 13;
                            if (super.field79 > 4 && super.field80 - 4 > var9 - 10 && super.field80 - 4 <= var9 + 3) {
                                int var10 = this.field443.method192("From:  " + var5 + this.field272[var3], -989) + 25;
                                if (var10 > 450) {
                                    var10 = 450;
                                }
                                if (super.field79 < var10 + 4) {
                                    if (this.field337 >= 1) {
                                        this.field643[this.field551] = "Report abuse @whi@" + var5;
                                        this.field473[this.field551] = 2811;
                                        ++this.field551;
                                    }
                                    this.field643[this.field551] = "Add ignore @whi@" + var5;
                                    this.field473[this.field551] = 2694;
                                    ++this.field551;
                                    this.field643[this.field551] = "Add friend @whi@" + var5;
                                    this.field473[this.field551] = 2730;
                                    ++this.field551;
                                }
                            }
                            ++var2;
                            if (var2 >= 5) {
                                return;
                            }
                        }
                        if ((var4 == 5 || var4 == 6) && this.field380 < 2) {
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

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method95(boolean arg0) {
        int var2 = 5;
        this.field491[8] = 0;
        if (arg0) {
            field434 = -119;
        }
        int var3 = 0;
        while (this.field491[8] == 0) {
            String var4 = "Unknown problem";
            this.method26((byte) 62, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method120("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 308);
                class21 var6 = new class21(new byte[40], -49015);
                var5.readFully(var6.field817, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field491[var7] = var6.method249();
                }
                int var8 = var6.method249();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field491[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field491[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field491[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field491[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field491[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field491[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method26((byte) 62, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method26((byte) 62, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field185 = !this.field185;
            }
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method96(boolean arg0) {
        if (arg0) {
            this.field214.method234(119);
        }
        if (this.field287 == 0) {
            if (super.field85 == 1) {
                int var2 = super.field86 - 25 - 550;
                int var3 = super.field87 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field518 + this.field303 & 2047;
                    int var5 = class9.field675[var4];
                    int var6 = class9.field676[var4];
                    int var7 = (this.field344 + 256) * var5 >> 8;
                    int var8 = (this.field344 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field588.field1506 + var9 >> 7;
                    int var12 = field588.field1507 - var10 >> 7;
                    boolean var13 = this.method48(0, 0, 0, 1, true, (byte) 6, 0, 0, field588.field1523[0], var11, field588.field1522[0], var12);
                    if (var13) {
                        this.field214.method234(var2);
                        this.field214.method234(var3);
                        this.field214.method235(this.field303);
                        this.field214.method234(57);
                        this.field214.method234(this.field518);
                        this.field214.method234(this.field344);
                        this.field214.method234(89);
                        this.field214.method235(field588.field1506);
                        this.field214.method235(field588.field1507);
                        this.field214.method234(this.field501);
                        this.field214.method234(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    public final void method97(byte arg0) {
        try {
            this.field295 = -1;
            this.field352.method532();
            this.field402.method532();
            class9.method175((byte) 6);
            this.method133((byte) 110);
            this.field206.method411(true);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field453[var2].method205();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field410[var3][var4][var5] = 0;
                    }
                }
            }
            class63 var6 = new class63(154, this.field285, 104, 104, this.field410);
            int var7 = this.field347.length;
            class63.field1601 = class47.field1147;
            for (int var8 = 0; var8 < var7; ++var8) {
                int var9 = this.field614[var8] >> 8;
                int var10 = this.field614[var8] & 255;
                if (var9 == 33 && var10 >= 71 && var10 <= 73) {
                    class63.field1601 = false;
                }
            }
            if (class63.field1601) {
                this.field206.method412(this.field379, this.field581);
            } else {
                this.field206.method412(this.field379, 0);
            }
            this.field214.method233(158, 0);
            if (!this.field607) {
                for (int var11 = 0; var11 < var7; ++var11) {
                    int var12 = (this.field614[var11] >> 8) * 64 - this.field368;
                    int var13 = (this.field614[var11] & 255) * 64 - this.field369;
                    byte[] var14 = this.field347[var11];
                    if (var14 != null) {
                        var6.method573(this.field453, (this.field429 - 6) * 8, var13, var12, var14, -27, (this.field428 - 6) * 8);
                    }
                }
                for (int var15 = 0; var15 < var7; ++var15) {
                    int var16 = (this.field614[var15] >> 8) * 64 - this.field368;
                    int var17 = (this.field614[var15] & 255) * 64 - this.field369;
                    byte[] var18 = this.field347[var15];
                    if (var18 == null && this.field429 < 800) {
                        var6.method565(64, var17, false, 64, var16);
                    }
                }
                this.field214.method233(158, 0);
                for (int var19 = 0; var19 < var7; ++var19) {
                    byte[] var20 = this.field257[var19];
                    if (var20 != null) {
                        int var21 = (this.field614[var19] >> 8) * 64 - this.field368;
                        int var22 = (this.field614[var19] & 255) * 64 - this.field369;
                        var6.method561(this.field558, var21, this.field453, this.field206, var20, var22);
                    }
                }
            }
            if (this.field607) {
                int var23 = 0;
                label250: while (true) {
                    if (var23 >= 4) {
                        for (int var33 = 0; var33 < 13; ++var33) {
                            for (int var34 = 0; var34 < 13; ++var34) {
                                int var35 = this.field468[0][var33][var34];
                                if (var35 == -1) {
                                    var6.method565(8, var34 * 8, false, 8, var33 * 8);
                                }
                            }
                        }
                        this.field214.method233(158, 0);
                        int var36 = 0;
                        while (true) {
                            if (var36 >= 4) {
                                break label250;
                            }
                            for (int var37 = 0; var37 < 13; ++var37) {
                                for (int var38 = 0; var38 < 13; ++var38) {
                                    int var39 = this.field468[var36][var37][var38];
                                    if (var39 != -1) {
                                        int var40 = var39 >> 24 & 3;
                                        int var41 = var39 >> 1 & 3;
                                        int var42 = var39 >> 14 & 1023;
                                        int var43 = var39 >> 3 & 2047;
                                        int var44 = (var42 / 8 << 8) + var43 / 8;
                                        for (int var45 = 0; var45 < this.field614.length; ++var45) {
                                            if (this.field614[var45] == var44 && this.field257[var45] != null) {
                                                var6.method559(var38 * 8, var41, var37 * 8, var36, this.field257[var45], (var42 & 7) * 8, var40, (var43 & 7) * 8, this.field453, this.field206, -14);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ++var36;
                        }
                    }
                    for (int var24 = 0; var24 < 13; ++var24) {
                        for (int var25 = 0; var25 < 13; ++var25) {
                            int var26 = this.field468[var23][var24][var25];
                            if (var26 != -1) {
                                int var27 = var26 >> 24 & 3;
                                int var28 = var26 >> 1 & 3;
                                int var29 = var26 >> 14 & 1023;
                                int var30 = var26 >> 3 & 2047;
                                int var31 = (var29 / 8 << 8) + var30 / 8;
                                for (int var32 = 0; var32 < this.field614.length; ++var32) {
                                    if (this.field614[var32] == var31 && this.field347[var32] != null) {
                                        var6.method575(var25 * 8, var23, var27, (byte) 4, (var30 & 7) * 8, var28, var24 * 8, this.field453, (var29 & 7) * 8, this.field347[var32]);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var23;
                }
            }
            this.field214.method233(158, 0);
            var6.method558(this.field453, this.field206, 0);
            this.field350.method393(1);
            this.field214.method233(158, 0);
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method131(var46, var47);
                }
            }
            this.method127(false);
        } catch (Exception var60) {
        }
        class48.field1260.method287();
        if (super.field74 != null) {
            this.field214.method233(134, 0);
            this.field214.method238(1057001181);
        }
        if (field233 && signlink.cache_dat != null) {
            int var49 = this.field195.method374(0, false);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field195.method358(var50, 16501);
                if ((var51 & 121) == 0) {
                    class53.method499((byte) -49, var50);
                }
            }
        }
        System.gc();
        class9.method176(0, 20);
        this.field195.method361(true);
        int var52 = (this.field428 - 6) / 8 - 1;
        int var53 = (this.field428 + 6) / 8 + 1;
        int var54 = (this.field429 - 6) / 8 - 1;
        int var55 = (this.field429 + 6) / 8 + 1;
        if (this.field416) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field195.method376(-33346, var57, 0, var56);
                    if (var58 != -1) {
                        this.field195.method360(var58, 3, 5);
                    }
                    int var59 = this.field195.method376(-33346, var57, 1, var56);
                    if (var59 != -1) {
                        this.field195.method360(var59, 3, 5);
                    }
                }
            }
        }
        if (arg0 != 112) {
            this.field587 = this.field199.method29();
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(III)Ljava/lang/String;")
    public static final String method98(int arg0, int arg1, int arg2) {
        if (arg0 < 2 || arg0 > 2) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = arg2 - arg1;
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

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    private final void method99(boolean arg0) {
        if (!arg0) {
            this.field214.method234(53);
        }
        if (this.field276 == 2) {
            for (class13 var2 = (class13) this.field217.method528(); var2 != null; var2 = (class13) this.field217.method530(true)) {
                if (var2.field727 > 0) {
                    --var2.field727;
                }
                if (var2.field727 == 0) {
                    if (var2.field732 < 0 || class63.method576(var2.field732, this.field534, var2.field734)) {
                        this.method161(var2.field734, var2.field733, var2.field729, var2.field730, var2.field728, var2.field732, var2.field731, -23974);
                        var2.method555();
                    }
                } else {
                    if (var2.field738 > 0) {
                        --var2.field738;
                    }
                    if (var2.field738 == 0 && var2.field730 >= 1 && var2.field731 >= 1 && var2.field730 <= 102 && var2.field731 <= 102 && (var2.field735 < 0 || class63.method576(var2.field735, this.field534, var2.field737))) {
                        this.method161(var2.field737, var2.field736, var2.field729, var2.field730, var2.field728, var2.field735, var2.field731, -23974);
                        var2.field738 = -1;
                        if (var2.field735 == var2.field732 && var2.field732 == -1) {
                            var2.method555();
                        } else if (var2.field735 == var2.field732 && var2.field736 == var2.field733 && var2.field737 == var2.field734) {
                            var2.method555();
                        }
                    }
                }
            }
            ++field530;
            if (field530 > 126) {
                field530 = 0;
                this.field214.method233(46, 0);
                this.field214.method234(132);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method100(int arg0) {
        if (this.field602 == 0) {
            int var2 = super.field85;
            if (arg0 < 1 || arg0 > 1) {
                this.field386 = this.field269.method244();
            }
            if (this.field208 == 1 && super.field86 >= 516 && super.field87 >= 160 && super.field86 <= 765 && super.field87 <= 205) {
                var2 = 0;
            }
            if (this.field432) {
                if (var2 != 1) {
                    int var3 = super.field79;
                    int var4 = super.field80;
                    if (this.field495 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field495 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field495 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field496 - 10 || var3 > this.field498 + this.field496 + 10 || var4 < this.field497 - 10 || var4 > this.field499 + this.field497 + 10) {
                        this.field432 = false;
                        if (this.field495 == 1) {
                            this.field447 = true;
                        }
                        if (this.field495 == 2) {
                            this.field606 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field496;
                    int var6 = this.field497;
                    int var7 = this.field498;
                    int var8 = super.field86;
                    int var9 = super.field87;
                    if (this.field495 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field495 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field495 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field551; ++var11) {
                        int var12 = (this.field551 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method45(var10, 13626);
                    }
                    this.field432 = false;
                    if (this.field495 == 1) {
                        this.field447 = true;
                    }
                    if (this.field495 == 2) {
                        this.field606 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field551 > 0) {
                    int var13 = this.field473[this.field551 - 1];
                    if (var13 == 355 || var13 == 416 || var13 == 630 || var13 == 708 || var13 == 903 || var13 == 375 || var13 == 10 || var13 == 132 || var13 == 532 || var13 == 8 || var13 == 959 || var13 == 1463) {
                        int var14 = this.field471[this.field551 - 1];
                        int var15 = this.field472[this.field551 - 1];
                        class52 var16 = class52.field1306[var15];
                        if (var16.field1331 || var16.field1322) {
                            this.field592 = false;
                            this.field263 = 0;
                            this.field600 = var15;
                            this.field601 = var14;
                            this.field602 = 2;
                            this.field603 = super.field86;
                            this.field604 = super.field87;
                            if (class52.field1306[var15].field1346 == this.field220) {
                                this.field602 = 1;
                            }
                            if (class52.field1306[var15].field1346 == this.field582) {
                                this.field602 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field333 == 1 || this.method139(this.field551 - 1, (byte) 39)) && this.field551 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field551 > 0) {
                    this.method45(this.field551 - 1, 13626);
                }
                if (var2 != 2 || this.field551 <= 0) {
                    return;
                }
                this.method159(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method101(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (this.field273 != arg2) {
            this.method19();
        }
        this.field311.method542(arg4, 272, arg5);
        this.field312.method542(arg4, 272, arg3 + arg5 - 16);
        class50.method478(16, arg4, this.field605, arg5 + 16, arg3 - 32, (byte) 1);
        int var7 = (arg3 - 32) * arg3 / arg0;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg1 / (arg0 - arg3);
        class50.method478(16, arg4, this.field373, arg5 + 16 + var8, var7, (byte) 1);
        class50.method483(5, this.field364, arg5 + 16 + var8, arg4, var7);
        class50.method483(5, this.field364, arg5 + 16 + var8, arg4 + 1, var7);
        class50.method481(arg4, this.field364, 16, 2, arg5 + 16 + var8);
        class50.method481(arg4, this.field364, 16, 2, arg5 + 17 + var8);
        class50.method483(5, this.field532, arg5 + 16 + var8, arg4 + 15, var7);
        class50.method483(5, this.field532, arg5 + 17 + var8, arg4 + 14, var7 - 1);
        class50.method481(arg4, this.field532, 16, 2, arg5 + 15 + var8 + var7);
        class50.method481(arg4 + 1, this.field532, 15, 2, arg5 + 14 + var8 + var7);
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)Z")
    public final boolean method102(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field431 == null) {
            return false;
        } else {
            try {
                int var3 = this.field431.method353();
                if (var3 == 0) {
                    return false;
                }
                if (this.field386 == -1) {
                    this.field431.method354(this.field269.field817, 0, 1);
                    this.field386 = this.field269.field817[0] & 255;
                    if (this.field199 != null) {
                        this.field386 = this.field386 - this.field199.method29() & 255;
                    }
                    this.field385 = class19.field787[this.field386];
                    --var3;
                }
                if (this.field385 == -1) {
                    if (var3 <= 0) {
                        return false;
                    }
                    this.field431.method354(this.field269.field817, 0, 1);
                    this.field385 = this.field269.field817[0] & 255;
                    --var3;
                }
                if (this.field385 == -2) {
                    if (var3 <= 1) {
                        return false;
                    }
                    this.field431.method354(this.field269.field817, 0, 2);
                    this.field269.field818 = 0;
                    this.field385 = this.field269.method246();
                    var3 -= 2;
                }
                if (var3 < this.field385) {
                    return false;
                }
                this.field269.field818 = 0;
                this.field431.method354(this.field269.field817, 0, this.field385);
                this.field387 = 0;
                this.field413 = this.field412;
                this.field412 = this.field411;
                this.field411 = this.field386;
                if (this.field386 == 45) {
                    this.field447 = true;
                    int var4 = this.field269.method246();
                    class52 var5 = class52.field1306[var4];
                    while (this.field269.field818 < this.field385) {
                        int var6 = this.field269.method258();
                        int var7 = this.field269.method246();
                        int var8 = this.field269.method244();
                        if (var8 == 255) {
                            var8 = this.field269.method249();
                        }
                        if (var6 >= 0 && var6 < var5.field1348.length) {
                            var5.field1348[var6] = var7;
                            var5.field1363[var6] = var8;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 57) {
                    int var9 = this.field269.method276(0);
                    this.field543 = var9;
                    this.field606 = true;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 96) {
                    int var10 = this.field269.method274((byte) -81);
                    int var11 = this.field269.method274((byte) -81);
                    class52 var12 = class52.field1306[var10];
                    if (var12 != null && var12.field1327 == 0) {
                        if (var11 < 0) {
                            var11 = 0;
                        }
                        if (var11 > var12.field1317 - var12.field1345) {
                            var11 = var12.field1317 - var12.field1345;
                        }
                        var12.field1354 = var11;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 240) {
                    String var13 = this.field269.method251();
                    int var14 = this.field269.method274((byte) -81);
                    class52.field1306[var14].field1361 = var13;
                    if (this.field362[this.field242] == class52.field1306[var14].field1346) {
                        this.field447 = true;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 208) {
                    int var15 = this.field269.method274((byte) -81);
                    int var16 = this.field269.method272((byte) -116);
                    int var17 = this.field269.method272((byte) -116);
                    int var18 = this.field269.method273(this.field207);
                    class52.field1306[var16].field1304 = var15;
                    class52.field1306[var16].field1305 = var18;
                    class52.field1306[var16].field1303 = var17;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 77) {
                    this.field414 = false;
                    this.field399 = 1;
                    this.field531 = "";
                    this.field606 = true;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 186) {
                    this.field414 = false;
                    this.field399 = 2;
                    this.field531 = "";
                    this.field606 = true;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 39) {
                    int var19 = this.field269.method274((byte) -81);
                    int var20 = this.field269.method274((byte) -81);
                    if (this.field582 != -1) {
                        this.field582 = -1;
                        this.field606 = true;
                    }
                    if (this.field399 != 0) {
                        this.field399 = 0;
                        this.field606 = true;
                    }
                    this.field220 = var20;
                    this.field262 = var19;
                    this.field447 = true;
                    this.field372 = true;
                    this.field611 = false;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 25) {
                    int var21 = this.field269.method274((byte) -81);
                    int var22 = this.field269.method264(3);
                    if (var21 == 65535) {
                        var21 = -1;
                    }
                    this.field362[var22] = var21;
                    this.field447 = true;
                    this.field372 = true;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 160) {
                    byte var23 = this.field269.method268(35432);
                    int var24 = this.field269.method274((byte) -81);
                    this.field467[var24] = var23;
                    if (this.field492[var24] != var23) {
                        this.field492[var24] = var23;
                        this.method35((byte) 2, var24);
                        this.field447 = true;
                        if (this.field543 != -1) {
                            this.field606 = true;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 88) {
                    this.field552 = this.field269.method244();
                    this.field380 = this.field269.method244();
                    this.field278 = this.field269.method244();
                    this.field240 = true;
                    this.field606 = true;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 74) {
                    int var25 = this.field269.method274((byte) -81);
                    boolean var26 = this.field269.method244() == 1;
                    class52.field1306[var25].field1313 = var26;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 191) {
                    this.field466 = this.field269.method273(this.field207) * 30;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 18) {
                    for (int var27 = 0; var27 < this.field393.length; ++var27) {
                        if (this.field393[var27] != null) {
                            this.field393[var27].field1524 = -1;
                        }
                    }
                    for (int var28 = 0; var28 < this.field439.length; ++var28) {
                        if (this.field439[var28] != null) {
                            this.field439[var28].field1524 = -1;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 0) {
                    int var29 = this.field269.method273(this.field207);
                    this.method90(var29, (byte) -97);
                    if (this.field262 != -1) {
                        this.field262 = -1;
                        this.field447 = true;
                        this.field372 = true;
                    }
                    this.field582 = var29;
                    this.field606 = true;
                    this.field220 = -1;
                    this.field611 = false;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 136 || this.field386 == 50) {
                    int var30 = this.field428;
                    int var31 = this.field429;
                    if (this.field386 == 136) {
                        var30 = this.field269.method246();
                        var31 = this.field269.method272((byte) -116);
                        this.field607 = false;
                    }
                    if (this.field386 == 50) {
                        var30 = this.field269.method272((byte) -116);
                        this.field269.method254(this.field477);
                        int var32 = 0;
                        while (true) {
                            if (var32 >= 4) {
                                this.field269.method256(-88);
                                var31 = this.field269.method246();
                                this.field607 = true;
                                break;
                            }
                            for (int var33 = 0; var33 < 13; ++var33) {
                                for (int var34 = 0; var34 < 13; ++var34) {
                                    int var35 = this.field269.method255(1, true);
                                    if (var35 == 1) {
                                        this.field468[var32][var33][var34] = this.field269.method255(26, true);
                                    } else {
                                        this.field468[var32][var33][var34] = -1;
                                    }
                                }
                            }
                            ++var32;
                        }
                    }
                    if (this.field428 == var30 && this.field429 == var31 && this.field276 == 2) {
                        this.field386 = -1;
                        return true;
                    }
                    this.field428 = var30;
                    this.field429 = var31;
                    this.field368 = (this.field428 - 6) * 8;
                    this.field369 = (this.field429 - 6) * 8;
                    this.field416 = false;
                    if ((this.field428 / 8 == 48 || this.field428 / 8 == 49) && this.field429 / 8 == 48) {
                        this.field416 = true;
                    }
                    if (this.field428 / 8 == 48 && this.field429 / 8 == 148) {
                        this.field416 = true;
                    }
                    this.field276 = 1;
                    this.field536 = System.currentTimeMillis();
                    this.field350.method393(1);
                    this.field443.method190(1, 151, 257, "Loading - please wait.", 0);
                    this.field443.method190(1, 150, 256, "Loading - please wait.", 16777215);
                    this.field350.method394(super.field71, 4, 4, -47890);
                    if (this.field386 == 136) {
                        int var36 = 0;
                        int var37 = (this.field428 - 6) / 8;
                        label1095: while (true) {
                            if (var37 > (this.field428 + 6) / 8) {
                                this.field347 = new byte[var36][];
                                this.field257 = new byte[var36][];
                                this.field614 = new int[var36];
                                this.field615 = new int[var36];
                                this.field616 = new int[var36];
                                int var39 = 0;
                                int var40 = (this.field428 - 6) / 8;
                                while (true) {
                                    if (var40 > (this.field428 + 6) / 8) {
                                        break label1095;
                                    }
                                    for (int var41 = (this.field429 - 6) / 8; var41 <= (this.field429 + 6) / 8; ++var41) {
                                        this.field614[var39] = (var40 << 8) + var41;
                                        if (this.field416 && (var41 == 49 || var41 == 149 || var41 == 147 || var40 == 50 || var40 == 49 && var41 == 47)) {
                                            this.field615[var39] = -1;
                                            this.field616[var39] = -1;
                                            ++var39;
                                        } else {
                                            int var42 = this.field615[var39] = this.field195.method376(-33346, var41, 0, var40);
                                            if (var42 != -1) {
                                                this.field195.method365(3, var42);
                                            }
                                            int var43 = this.field616[var39] = this.field195.method376(-33346, var41, 1, var40);
                                            if (var43 != -1) {
                                                this.field195.method365(3, var43);
                                            }
                                            ++var39;
                                        }
                                    }
                                    ++var40;
                                }
                            }
                            for (int var38 = (this.field429 - 6) / 8; var38 <= (this.field429 + 6) / 8; ++var38) {
                                ++var36;
                            }
                            ++var37;
                        }
                    }
                    if (this.field386 == 50) {
                        int var44 = 0;
                        int[] var45 = new int[676];
                        int var46 = 0;
                        label1056: while (true) {
                            if (var46 >= 4) {
                                this.field347 = new byte[var44][];
                                this.field257 = new byte[var44][];
                                this.field614 = new int[var44];
                                this.field615 = new int[var44];
                                this.field616 = new int[var44];
                                int var54 = 0;
                                while (true) {
                                    if (var54 >= var44) {
                                        break label1056;
                                    }
                                    int var55 = this.field614[var54] = var45[var54];
                                    int var56 = var55 >> 8 & 255;
                                    int var57 = var55 & 255;
                                    int var58 = this.field615[var54] = this.field195.method376(-33346, var57, 0, var56);
                                    if (var58 != -1) {
                                        this.field195.method365(3, var58);
                                    }
                                    int var59 = this.field616[var54] = this.field195.method376(-33346, var57, 1, var56);
                                    if (var59 != -1) {
                                        this.field195.method365(3, var59);
                                    }
                                    ++var54;
                                }
                            }
                            for (int var47 = 0; var47 < 13; ++var47) {
                                for (int var48 = 0; var48 < 13; ++var48) {
                                    int var49 = this.field468[var46][var47][var48];
                                    if (var49 != -1) {
                                        int var50 = var49 >> 14 & 1023;
                                        int var51 = var49 >> 3 & 2047;
                                        int var52 = (var50 / 8 << 8) + var51 / 8;
                                        for (int var53 = 0; var53 < var44; ++var53) {
                                            if (var45[var53] == var52) {
                                                var52 = -1;
                                                break;
                                            }
                                        }
                                        if (var52 != -1) {
                                            var45[var44++] = var52;
                                        }
                                    }
                                }
                            }
                            ++var46;
                        }
                    }
                    int var60 = this.field368 - this.field370;
                    int var61 = this.field369 - this.field371;
                    this.field370 = this.field368;
                    this.field371 = this.field369;
                    for (int var62 = 0; var62 < 16384; ++var62) {
                        class46 var63 = this.field439[var62];
                        if (var63 != null) {
                            for (int var64 = 0; var64 < 10; ++var64) {
                                var63.field1522[var64] -= var60;
                                var63.field1523[var64] -= var61;
                            }
                            var63.field1506 -= var60 * 128;
                            var63.field1507 -= var61 * 128;
                        }
                    }
                    for (int var65 = 0; var65 < this.field391; ++var65) {
                        class43 var66 = this.field393[var65];
                        if (var66 != null) {
                            for (int var67 = 0; var67 < 10; ++var67) {
                                var66.field1522[var67] -= var60;
                                var66.field1523[var67] -= var61;
                            }
                            var66.field1506 -= var60 * 128;
                            var66.field1507 -= var61 * 128;
                        }
                    }
                    this.field571 = true;
                    byte var68 = 0;
                    byte var69 = 104;
                    byte var70 = 1;
                    if (var60 < 0) {
                        var68 = 103;
                        var69 = -1;
                        var70 = -1;
                    }
                    byte var71 = 0;
                    byte var72 = 104;
                    byte var73 = 1;
                    if (var61 < 0) {
                        var71 = 103;
                        var72 = -1;
                        var73 = -1;
                    }
                    for (int var74 = var68; var69 != var74; var74 += var70) {
                        for (int var75 = var71; var72 != var75; var75 += var73) {
                            int var76 = var60 + var74;
                            int var77 = var61 + var75;
                            for (int var78 = 0; var78 < 4; ++var78) {
                                if (var76 >= 0 && var77 >= 0 && var76 < 104 && var77 < 104) {
                                    this.field553[var78][var74][var75] = this.field553[var78][var76][var77];
                                } else {
                                    this.field553[var78][var74][var75] = null;
                                }
                            }
                        }
                    }
                    for (class13 var79 = (class13) this.field217.method528(); var79 != null; var79 = (class13) this.field217.method530(true)) {
                        var79.field730 -= var60;
                        var79.field731 -= var61;
                        if (var79.field730 < 0 || var79.field731 < 0 || var79.field730 >= 104 || var79.field731 >= 104) {
                            var79.method555();
                        }
                    }
                    if (this.field540 != 0) {
                        this.field540 -= var60;
                        this.field541 -= var61;
                    }
                    this.field361 = false;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 248) {
                    this.field287 = this.field269.method244();
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 55) {
                    if (this.field242 == 12) {
                        this.field447 = true;
                    }
                    this.field487 = this.field269.method247();
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 11) {
                    int var80 = this.field269.method249();
                    int var81 = this.field269.method272((byte) -116);
                    this.field467[var81] = var80;
                    if (this.field492[var81] != var80) {
                        this.field492[var81] = var80;
                        this.method35((byte) 2, var81);
                        this.field447 = true;
                        if (this.field543 != -1) {
                            this.field606 = true;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 35) {
                    int var82 = this.field269.method246();
                    int var83 = this.field269.method247();
                    class52 var84 = class52.field1306[var82];
                    var84.field1342 = var83;
                    if (var83 == -1) {
                        var84.field1318 = 0;
                        var84.field1309 = 0;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 239) {
                    int var85 = this.field269.method246();
                    int var86 = this.field269.method244();
                    int var87 = this.field269.method246();
                    if (this.field624 && !field233 && this.field190 < 50) {
                        this.field320[this.field190] = var85;
                        this.field196[this.field190] = var86;
                        this.field597[this.field190] = class8.field655[var85] + var87;
                        ++this.field190;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 185) {
                    if (this.field242 == 12) {
                        this.field447 = true;
                    }
                    this.field455 = this.field269.method244();
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 62) {
                    int var88 = this.field269.method272((byte) -116);
                    if (var88 == 65535) {
                        var88 = -1;
                    }
                    if (this.field204 != var88 && this.field568 && !field233 && this.field244 == 0) {
                        this.field322 = var88;
                        this.field323 = true;
                        this.field195.method365(2, this.field322);
                    }
                    this.field204 = var88;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 195) {
                    int var89 = this.field269.method246();
                    int var90 = this.field269.method246();
                    if (this.field568 && !field233) {
                        this.field322 = var89;
                        this.field323 = false;
                        this.field195.method365(2, this.field322);
                        this.field244 = var90;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 219) {
                    long var91 = this.field269.method250(true);
                    int var93 = this.field269.method249();
                    int var94 = this.field269.method244();
                    boolean var95 = false;
                    for (int var96 = 0; var96 < 100; ++var96) {
                        if (this.field307[var96] == var93) {
                            var95 = true;
                            break;
                        }
                    }
                    if (var94 <= 1) {
                        for (int var97 = 0; var97 < this.field194; ++var97) {
                            if (this.field330[var97] == var91) {
                                var95 = true;
                                break;
                            }
                        }
                    }
                    if (!var95 && this.field480 == 0) {
                        try {
                            this.field307[this.field575] = var93;
                            this.field575 = (this.field575 + 1) % 100;
                            String var98 = class32.method343(this.field269, this.field385 - 13, 0);
                            if (var94 != 3) {
                                var98 = class25.method298(var98, this.field377);
                            }
                            if (var94 != 2 && var94 != 3) {
                                if (var94 == 1) {
                                    this.method155(true, var98, "@cr1@" + class70.method587(class70.method584(var91, 803), true), 7);
                                } else {
                                    this.method155(true, var98, class70.method587(class70.method584(var91, 803), true), 3);
                                }
                            } else {
                                this.method155(true, var98, "@cr2@" + class70.method587(class70.method584(var91, 803), true), 7);
                            }
                        } catch (Exception var188) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 249) {
                    int var100 = this.field269.method264(3);
                    String var101 = this.field269.method251();
                    int var102 = this.field269.method265(535);
                    if (var102 >= 1 && var102 <= 5) {
                        if (var101.equalsIgnoreCase("null")) {
                            var101 = null;
                        }
                        this.field296[var102 - 1] = var101;
                        this.field297[var102 - 1] = var100 == 0;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 220) {
                    long var103 = this.field269.method250(true);
                    int var105 = this.field269.method244();
                    String var106 = class70.method587(class70.method584(var103, 803), true);
                    for (int var107 = 0; var107 < this.field183; ++var107) {
                        if (this.field550[var107] == var103) {
                            if (this.field343[var107] != var105) {
                                this.field343[var107] = var105;
                                this.field447 = true;
                                if (var105 > 0) {
                                    this.method155(true, var106 + " has logged in.", "", 5);
                                }
                                if (var105 == 0) {
                                    this.method155(true, var106 + " has logged out.", "", 5);
                                }
                            }
                            var106 = null;
                            break;
                        }
                    }
                    if (var106 != null && this.field183 < 200) {
                        this.field550[this.field183] = var103;
                        this.field486[this.field183] = var106;
                        this.field343[this.field183] = var105;
                        ++this.field183;
                        this.field447 = true;
                    }
                    boolean var108 = false;
                    while (!var108) {
                        var108 = true;
                        for (int var109 = 0; var109 < this.field183 - 1; ++var109) {
                            if (this.field343[var109] != field230 && this.field343[var109 + 1] == field230 || this.field343[var109] == 0 && this.field343[var109 + 1] != 0) {
                                int var110 = this.field343[var109];
                                this.field343[var109] = this.field343[var109 + 1];
                                this.field343[var109 + 1] = var110;
                                String var111 = this.field486[var109];
                                this.field486[var109] = this.field486[var109 + 1];
                                this.field486[var109 + 1] = var111;
                                long var112 = this.field550[var109];
                                this.field550[var109] = this.field550[var109 + 1];
                                this.field550[var109 + 1] = var112;
                                this.field447 = true;
                                var108 = false;
                            }
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 231) {
                    this.field361 = true;
                    this.field545 = this.field269.method244();
                    this.field546 = this.field269.method244();
                    this.field547 = this.field269.method246();
                    this.field548 = this.field269.method244();
                    this.field549 = this.field269.method244();
                    if (this.field549 >= 100) {
                        this.field224 = this.field545 * 128 + 64;
                        this.field226 = this.field546 * 128 + 64;
                        this.field225 = this.method119(this.field226, this.field581, this.field224, -23) - this.field547;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 85) {
                    this.field361 = true;
                    this.field576 = this.field269.method244();
                    this.field577 = this.field269.method244();
                    this.field578 = this.field269.method246();
                    this.field579 = this.field269.method244();
                    this.field580 = this.field269.method244();
                    if (this.field580 >= 100) {
                        int var114 = this.field576 * 128 + 64;
                        int var115 = this.field577 * 128 + 64;
                        int var116 = this.method119(var115, this.field581, var114, -23) - this.field578;
                        int var117 = var114 - this.field224;
                        int var118 = var116 - this.field225;
                        int var119 = var115 - this.field226;
                        int var120 = (int) Math.sqrt((double) (var117 * var117 + var119 * var119));
                        this.field227 = (int) (Math.atan2((double) var118, (double) var120) * 325.949D) & 2047;
                        this.field228 = (int) (Math.atan2((double) var117, (double) var119) * -325.949D) & 2047;
                        if (this.field227 < 128) {
                            this.field227 = 128;
                        }
                        if (this.field227 > 383) {
                            this.field227 = 383;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 156) {
                    this.field365 = this.field269.method244();
                    if (this.field365 == 1) {
                        this.field251 = this.field269.method246();
                    }
                    if (this.field365 >= 2 && this.field365 <= 6) {
                        if (this.field365 == 2) {
                            this.field359 = 64;
                            this.field360 = 64;
                        }
                        if (this.field365 == 3) {
                            this.field359 = 0;
                            this.field360 = 64;
                        }
                        if (this.field365 == 4) {
                            this.field359 = 128;
                            this.field360 = 64;
                        }
                        if (this.field365 == 5) {
                            this.field359 = 64;
                            this.field360 = 0;
                        }
                        if (this.field365 == 6) {
                            this.field359 = 64;
                            this.field360 = 128;
                        }
                        this.field365 = 2;
                        this.field356 = this.field269.method246();
                        this.field357 = this.field269.method246();
                        this.field358 = this.field269.method244();
                    }
                    if (this.field365 == 10) {
                        this.field514 = this.field269.method246();
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 223) {
                    int var121 = this.field269.method246();
                    class52 var122 = class52.field1306[var121];
                    for (int var123 = 0; var123 < var122.field1348.length; ++var123) {
                        var122.field1348[var123] = -1;
                        var122.field1348[var123] = 0;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 27) {
                    this.field290 = this.field269.method264(3);
                    if (this.field290 == this.field242) {
                        if (this.field290 == 3) {
                            this.field242 = 1;
                        } else {
                            this.field242 = 3;
                        }
                        this.field447 = true;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 225) {
                    this.field243 = this.field269.method274((byte) -81);
                    this.field513 = this.field269.method263(0);
                    this.field321 = this.field269.method249();
                    this.field198 = this.field269.method244();
                    this.field336 = this.field269.method273(this.field207);
                    if (this.field321 != 0 && this.field220 == -1) {
                        signlink.dnslookup(class70.method586(0, this.field321));
                        this.method140(0);
                        short var124 = 650;
                        if (this.field513 != 201 || this.field198 == 1) {
                            var124 = 655;
                        }
                        this.field500 = "";
                        this.field565 = false;
                        for (int var125 = 0; var125 < class52.field1306.length; ++var125) {
                            if (class52.field1306[var125] != null && class52.field1306[var125].field1350 == var124) {
                                this.field220 = class52.field1306[var125].field1346;
                                break;
                            }
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 142) {
                    int var126 = this.field269.method272((byte) -116);
                    this.method90(var126, (byte) -97);
                    if (this.field262 != -1) {
                        this.field262 = -1;
                        this.field447 = true;
                        this.field372 = true;
                    }
                    if (this.field582 != -1) {
                        this.field582 = -1;
                        this.field606 = true;
                    }
                    if (this.field399 != 0) {
                        this.field399 = 0;
                        this.field606 = true;
                    }
                    this.field220 = var126;
                    this.field611 = false;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 174) {
                    this.field361 = false;
                    for (int var127 = 0; var127 < 5; ++var127) {
                        this.field598[var127] = false;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 43) {
                    this.method78(348);
                    this.field386 = -1;
                    return false;
                }
                if (this.field386 == 38) {
                    int var128 = this.field269.method244();
                    int var129 = this.field269.method244();
                    int var130 = this.field269.method244();
                    int var131 = this.field269.method244();
                    this.field598[var128] = true;
                    this.field516[var128] = var129;
                    this.field406[var128] = var130;
                    this.field490[var128] = var131;
                    this.field179[var128] = 0;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 139) {
                    this.field613 = this.field269.method263(0);
                    this.field427 = this.field269.method274((byte) -81);
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 91) {
                    int var132 = this.field269.method275(true);
                    int var133 = this.field269.method275(true);
                    int var134 = this.field269.method273(this.field207);
                    class52 var135 = class52.field1306[var134];
                    var135.field1310 = var133;
                    var135.field1335 = var132;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 89) {
                    int var136 = this.field269.method272((byte) -116);
                    int var137 = this.field269.method272((byte) -116);
                    class52.field1306[var136].field1320 = 1;
                    class52.field1306[var136].field1321 = var137;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 86) {
                    int var138 = this.field269.method273(this.field207);
                    class52.field1306[var138].field1320 = 3;
                    if (field588.field1110 == null) {
                        class52.field1306[var138].field1321 = (field588.field1098[11] << 5) + (field588.field1098[8] << 10) + (field588.field1098[0] << 15) + (field588.field1118[0] << 25) + (field588.field1118[4] << 20) + field588.field1098[1];
                    } else {
                        class52.field1306[var138].field1321 = (int) (field588.field1110.field1043 + 305419896L);
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 115) {
                    for (int var139 = 0; var139 < this.field492.length; ++var139) {
                        if (this.field492[var139] != this.field467[var139]) {
                            this.field492[var139] = this.field467[var139];
                            this.method35((byte) 2, var139);
                            this.field447 = true;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 61) {
                    this.field194 = this.field385 / 8;
                    for (int var140 = 0; var140 < this.field194; ++var140) {
                        this.field330[var140] = this.field269.method250(true);
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 68) {
                    this.field339 = this.field269.method244();
                    this.field340 = this.field269.method265(535);
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 181) {
                    this.field184 = this.field269.method244();
                    this.field447 = true;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 169) {
                    this.method135(this.field385, this.field341, this.field269);
                    this.field571 = false;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 230) {
                    int var141 = this.field269.method273(this.field207);
                    int var142 = this.field269.method272((byte) -116);
                    int var143 = var142 >> 10 & 31;
                    int var144 = var142 >> 5 & 31;
                    int var145 = var142 & 31;
                    class52.field1306[var141].field1330 = (var145 << 3) + (var143 << 19) + (var144 << 11);
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 204) {
                    this.field424 = this.field269.method244();
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 124) {
                    this.field540 = 0;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 164) {
                    if (this.field262 != -1) {
                        this.field262 = -1;
                        this.field447 = true;
                        this.field372 = true;
                    }
                    if (this.field582 != -1) {
                        this.field582 = -1;
                        this.field606 = true;
                    }
                    if (this.field399 != 0) {
                        this.field399 = 0;
                        this.field606 = true;
                    }
                    this.field220 = -1;
                    this.field611 = false;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 158) {
                    int var146 = this.field269.method274((byte) -81);
                    int var147 = this.field269.method246();
                    int var148 = this.field269.method273(this.field207);
                    if (var147 == 65535) {
                        class52.field1306[var146].field1320 = 0;
                        this.field386 = -1;
                        return true;
                    }
                    class2 var149 = class2.method4(var147);
                    class52.field1306[var146].field1320 = 4;
                    class52.field1306[var146].field1321 = var147;
                    class52.field1306[var146].field1304 = var149.field11;
                    class52.field1306[var146].field1305 = var149.field54;
                    class52.field1306[var146].field1303 = var149.field5 * 100 / var148;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 154) {
                    this.field447 = true;
                    int var150 = this.field269.method278(0);
                    int var151 = this.field269.method264(3);
                    int var152 = this.field269.method265(535);
                    this.field608[var151] = var150;
                    this.field353[var151] = var152;
                    this.field400[var151] = 1;
                    for (int var153 = 0; var153 < 98; ++var153) {
                        if (var150 >= field346[var153]) {
                            this.field400[var151] = var153 + 2;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 161) {
                    this.field242 = this.field269.method265(535);
                    this.field447 = true;
                    this.field372 = true;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 244) {
                    this.field340 = this.field269.method244();
                    this.field339 = this.field269.method263(0);
                    for (int var154 = this.field339; var154 < this.field339 + 8; ++var154) {
                        for (int var155 = this.field340; var155 < this.field340 + 8; ++var155) {
                            if (this.field553[this.field581][var154][var155] != null) {
                                this.field553[this.field581][var154][var155] = null;
                                this.method131(var154, var155);
                            }
                        }
                    }
                    for (class13 var156 = (class13) this.field217.method528(); var156 != null; var156 = (class13) this.field217.method530(true)) {
                        if (var156.field730 >= this.field339 && var156.field730 < this.field339 + 8 && var156.field731 >= this.field340 && var156.field731 < this.field340 + 8 && this.field581 == var156.field728) {
                            var156.field727 = 0;
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 243) {
                    this.field447 = true;
                    int var157 = this.field269.method246();
                    class52 var158 = class52.field1306[var157];
                    int var159 = this.field269.method246();
                    for (int var160 = 0; var160 < var159; ++var160) {
                        var158.field1348[var160] = this.field269.method272((byte) -116);
                        int var161 = this.field269.method244();
                        if (var161 == 255) {
                            var161 = this.field269.method278(0);
                        }
                        var158.field1363[var160] = var161;
                    }
                    for (int var162 = var159; var162 < var158.field1348.length; ++var162) {
                        var158.field1348[var162] = 0;
                        var158.field1363[var162] = 0;
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 40 || this.field386 == 83 || this.field386 == 205 || this.field386 == 7 || this.field386 == 118 || this.field386 == 9 || this.field386 == 134 || this.field386 == 255 || this.field386 == 183 || this.field386 == 75 || this.field386 == 192) {
                    this.method106(this.field269, this.field386, 0);
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 177) {
                    String var163 = this.field269.method251();
                    if (var163.endsWith(":tradereq:")) {
                        String var164 = var163.substring(0, var163.indexOf(":"));
                        long var165 = class70.method583(var164);
                        boolean var167 = false;
                        for (int var168 = 0; var168 < this.field194; ++var168) {
                            if (this.field330[var168] == var165) {
                                var167 = true;
                                break;
                            }
                        }
                        if (!var167 && this.field480 == 0) {
                            this.method155(true, "wishes to trade with you.", var164, 4);
                        }
                    } else if (var163.endsWith(":duelreq:")) {
                        String var169 = var163.substring(0, var163.indexOf(":"));
                        long var170 = class70.method583(var169);
                        boolean var172 = false;
                        for (int var173 = 0; var173 < this.field194; ++var173) {
                            if (this.field330[var173] == var170) {
                                var172 = true;
                                break;
                            }
                        }
                        if (!var172 && this.field480 == 0) {
                            this.method155(true, "wishes to duel with you.", var169, 8);
                        }
                    } else if (!var163.endsWith(":chalreq:")) {
                        this.method155(true, var163, "", 0);
                    } else {
                        String var174 = var163.substring(0, var163.indexOf(":"));
                        long var175 = class70.method583(var174);
                        boolean var177 = false;
                        for (int var178 = 0; var178 < this.field194; ++var178) {
                            if (this.field330[var178] == var175) {
                                var177 = true;
                                break;
                            }
                        }
                        if (!var177 && this.field480 == 0) {
                            String var179 = var163.substring(var163.indexOf(":") + 1, var163.length() - 9);
                            this.method155(true, var179, var174, 8);
                        }
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 44) {
                    int var180 = this.field269.method274((byte) -81);
                    this.method90(var180, (byte) -97);
                    if (this.field582 != -1) {
                        this.field582 = -1;
                        this.field606 = true;
                    }
                    if (this.field399 != 0) {
                        this.field399 = 0;
                        this.field606 = true;
                    }
                    this.field262 = var180;
                    this.field447 = true;
                    this.field372 = true;
                    this.field220 = -1;
                    this.field611 = false;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 222) {
                    int var181 = this.field269.method246();
                    int var182 = this.field269.method274((byte) -81);
                    class52.field1306[var181].field1320 = 2;
                    class52.field1306[var181].field1321 = var182;
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 97) {
                    this.method77(292, this.field269, this.field385);
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 28) {
                    this.field339 = this.field269.method244();
                    this.field340 = this.field269.method265(535);
                    while (this.field269.field818 < this.field385) {
                        int var183 = this.field269.method244();
                        this.method106(this.field269, var183, 0);
                    }
                    this.field386 = -1;
                    return true;
                }
                if (this.field386 == 16) {
                    int var184 = this.field269.method275(true);
                    if (var184 >= 0) {
                        this.method90(var184, (byte) -97);
                    }
                    this.field451 = var184;
                    this.field386 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field386 + "," + this.field385 + " - " + this.field412 + "," + this.field413);
                this.method78(348);
            } catch (IOException var189) {
                this.method52(0);
            } catch (Exception var190) {
                String var186 = "T2 - " + this.field386 + "," + this.field412 + "," + this.field413 + " - " + this.field385 + "," + (field588.field1522[0] + this.field368) + "," + (field588.field1523[0] + this.field369) + " - ";
                for (int var187 = 0; var187 < this.field385 && var187 < 50; ++var187) {
                    var186 = var186 + this.field269.field817[var187] + ",";
                }
                signlink.reporterror(var186);
                this.method78(348);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method23(int arg0) {
        this.field247 = true;
        int var2 = 20 / arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LGLMIQHJI;II)V")
    private final void method103(class21 arg0, int arg1, int arg2) {
        arg0.method254(this.field477);
        int var4 = arg0.method255(1, true);
        while (arg1 >= 0) {
            this.field479 = !this.field479;
        }
        if (var4 != 0) {
            int var5 = arg0.method255(2, true);
            if (var5 == 0) {
                this.field397[this.field396++] = this.field392;
            } else if (var5 == 1) {
                int var6 = arg0.method255(3, true);
                field588.method544(false, var6, 908);
                int var7 = arg0.method255(1, true);
                if (var7 == 1) {
                    this.field397[this.field396++] = this.field392;
                }
            } else if (var5 == 2) {
                int var8 = arg0.method255(3, true);
                field588.method544(true, var8, 908);
                int var9 = arg0.method255(3, true);
                field588.method544(true, var9, 908);
                int var10 = arg0.method255(1, true);
                if (var10 == 1) {
                    this.field397[this.field396++] = this.field392;
                }
            } else if (var5 == 3) {
                int var11 = arg0.method255(7, true);
                int var12 = arg0.method255(7, true);
                this.field581 = arg0.method255(2, true);
                int var13 = arg0.method255(1, true);
                int var14 = arg0.method255(1, true);
                if (var14 == 1) {
                    this.field397[this.field396++] = this.field392;
                }
                field588.method546(var11, var13 == 1, 453, var12);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method104(boolean arg0, int arg1) {
        if (arg1 < 0) {
            for (int var3 = 0; var3 < this.field440; ++var3) {
                class46 var4 = this.field439[this.field441[var3]];
                int var5 = (this.field441[var3] << 14) + 536870912;
                if (var4 != null && var4.method404((byte) 4) && var4.field1140.field1027 == arg0) {
                    int var6 = var4.field1506 >> 7;
                    int var7 = var4.field1507 >> 7;
                    if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                        if (var4.field1532 == 1 && (var4.field1506 & 127) == 64 && (var4.field1507 & 127) == 64) {
                            if (this.field200[var6][var7] == this.field374) {
                                continue;
                            }
                            this.field200[var6][var7] = this.field374;
                        }
                        this.field206.method422(this.field581, var4.field1500, var5, false, var4, var4.field1507, var4.field1506, var4.field1508, (var4.field1532 - 1) * 64 + 60, this.method119(var4.field1507, this.field581, var4.field1506, -23));
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method105(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg1;
        if (arg0 != -43) {
            field434 = this.field199.method29();
        }
        return ((arg2 & 16711935) * arg1 + (arg3 & 16711935) * var5 & -16711936) + ((arg2 & 65280) * arg1 + (arg3 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LGLMIQHJI;II)V")
    public final void method106(class21 arg0, int arg1, int arg2) {
        this.field385 += arg2;
        if (arg1 == 83) {
            int var4 = arg0.method244();
            int var5 = (var4 >> 4 & 7) + this.field339;
            int var6 = (var4 & 7) + this.field340;
            int var7 = arg0.method246();
            int var8 = arg0.method246();
            int var9 = arg0.method246();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                class54 var10 = this.field553[this.field581][var5][var6];
                if (var10 != null) {
                    for (class39 var11 = (class39) var10.method528(); var11 != null; var11 = (class39) var10.method530(true)) {
                        if ((var7 & 32767) == var11.field1070 && var11.field1069 == var8) {
                            var11.field1069 = var9;
                            break;
                        }
                    }
                    this.method131(var5, var6);
                }
            }
        } else {
            if (arg1 == 205) {
                byte var12 = arg0.method245();
                byte var13 = arg0.method267(1);
                byte var14 = arg0.method266(4);
                byte var15 = arg0.method266(4);
                int var16 = arg0.method244();
                int var17 = (var16 >> 4 & 7) + this.field339;
                int var18 = (var16 & 7) + this.field340;
                int var19 = arg0.method264(3);
                int var20 = var19 >> 2;
                int var21 = var19 & 3;
                int var22 = this.field570[var20];
                int var23 = arg0.method272((byte) -116);
                int var24 = arg0.method272((byte) -116);
                int var25 = arg0.method273(this.field207);
                int var26 = arg0.method272((byte) -116);
                class43 var27;
                if (this.field427 == var24) {
                    var27 = field588;
                } else {
                    var27 = this.field393[var24];
                }
                if (var27 != null) {
                    class48 var28 = class48.method472(var26);
                    int var29 = this.field285[this.field581][var17][var18];
                    int var30 = this.field285[this.field581][var17 + 1][var18];
                    int var31 = this.field285[this.field581][var17 + 1][var18 + 1];
                    int var32 = this.field285[this.field581][var17][var18 + 1];
                    class53 var33 = var28.method462(var20, var21, var29, var30, var31, var32, -1);
                    if (var33 != null) {
                        this.method88(this.field581, var18, 0, -1, var17, true, var22, 0, var25 + 1, var23 + 1);
                        var27.field1111 = field332 + var25;
                        var27.field1112 = field332 + var23;
                        var27.field1116 = var33;
                        int var34 = var28.field1262;
                        int var35 = var28.field1230;
                        if (var21 == 1 || var21 == 3) {
                            var34 = var28.field1230;
                            var35 = var28.field1262;
                        }
                        var27.field1113 = var17 * 128 + var34 * 64;
                        var27.field1115 = var18 * 128 + var35 * 64;
                        var27.field1114 = this.method119(var27.field1115, this.field581, var27.field1113, -23);
                        if (var14 > var15) {
                            byte var36 = var14;
                            var14 = var15;
                            var15 = var36;
                        }
                        if (var12 > var13) {
                            byte var37 = var12;
                            var12 = var13;
                            var13 = var37;
                        }
                        var27.field1099 = var14 + var17;
                        var27.field1101 = var15 + var17;
                        var27.field1100 = var12 + var18;
                        var27.field1102 = var13 + var18;
                    }
                }
            }
            if (arg1 == 255) {
                int var38 = arg0.method272((byte) -116);
                int var39 = arg0.method265(535);
                int var40 = (var39 >> 4 & 7) + this.field339;
                int var41 = (var39 & 7) + this.field340;
                int var42 = arg0.method246();
                if (var40 >= 0 && var41 >= 0 && var40 < 104 && var41 < 104) {
                    class39 var43 = new class39();
                    var43.field1070 = var38;
                    var43.field1069 = var42;
                    if (this.field553[this.field581][var40][var41] == null) {
                        this.field553[this.field581][var40][var41] = new class54((byte) 3);
                    }
                    this.field553[this.field581][var40][var41].method525(var43);
                    this.method131(var40, var41);
                }
            } else if (arg1 == 75) {
                int var44 = arg0.method265(535);
                int var45 = var44 >> 2;
                int var46 = var44 & 3;
                int var47 = this.field570[var45];
                int var48 = arg0.method244();
                int var49 = (var48 >> 4 & 7) + this.field339;
                int var50 = (var48 & 7) + this.field340;
                if (var49 >= 0 && var50 >= 0 && var49 < 104 && var50 < 104) {
                    this.method88(this.field581, var50, var45, -1, var49, true, var47, var46, 0, -1);
                }
            } else {
                if (arg1 == 40) {
                    int var51 = arg0.method244();
                    int var52 = (var51 >> 4 & 7) + this.field339;
                    int var53 = (var51 & 7) + this.field340;
                    int var54 = arg0.method246();
                    int var55 = arg0.method244();
                    int var56 = var55 >> 4 & 15;
                    int var57 = var55 & 7;
                    if (field588.field1522[0] >= var52 - var56 && field588.field1522[0] <= var52 + var56 && field588.field1523[0] >= var53 - var56 && field588.field1523[0] <= var53 + var56 && this.field624 && !field233 && this.field190 < 50) {
                        this.field320[this.field190] = var54;
                        this.field196[this.field190] = var57;
                        this.field597[this.field190] = class8.field655[var54];
                        ++this.field190;
                    }
                }
                if (arg1 != 134) {
                    if (arg1 == 7) {
                        int var64 = arg0.method263(0);
                        int var65 = (var64 >> 4 & 7) + this.field339;
                        int var66 = (var64 & 7) + this.field340;
                        int var67 = arg0.method272((byte) -116);
                        int var68 = arg0.method246();
                        int var69 = arg0.method246();
                        if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104 && this.field427 != var69) {
                            class39 var70 = new class39();
                            var70.field1070 = var67;
                            var70.field1069 = var68;
                            if (this.field553[this.field581][var65][var66] == null) {
                                this.field553[this.field581][var65][var66] = new class54((byte) 3);
                            }
                            this.field553[this.field581][var65][var66].method525(var70);
                            this.method131(var65, var66);
                        }
                    } else if (arg1 == 192) {
                        int var71 = arg0.method272((byte) -116);
                        int var72 = arg0.method244();
                        int var73 = (var72 >> 4 & 7) + this.field339;
                        int var74 = (var72 & 7) + this.field340;
                        int var75 = arg0.method263(0);
                        int var76 = var75 >> 2;
                        int var77 = var75 & 3;
                        int var78 = this.field570[var76];
                        if (var73 >= 0 && var74 >= 0 && var73 < 104 && var74 < 104) {
                            this.method88(this.field581, var74, var76, var71, var73, true, var78, var77, 0, -1);
                        }
                    } else if (arg1 == 9) {
                        int var79 = arg0.method244();
                        int var80 = (var79 >> 4 & 7) + this.field339;
                        int var81 = (var79 & 7) + this.field340;
                        int var82 = var80 + arg0.method245();
                        int var83 = var81 + arg0.method245();
                        int var84 = arg0.method247();
                        int var85 = arg0.method246();
                        int var86 = arg0.method244() * 4;
                        int var87 = arg0.method244() * 4;
                        int var88 = arg0.method246();
                        int var89 = arg0.method246();
                        int var90 = arg0.method244();
                        int var91 = arg0.method244();
                        if (var80 >= 0 && var81 >= 0 && var80 < 104 && var81 < 104 && var82 >= 0 && var83 >= 0 && var82 < 104 && var83 < 104 && var85 != 65535) {
                            int var92 = var80 * 128 + 64;
                            int var93 = var81 * 128 + 64;
                            int var94 = var82 * 128 + 64;
                            int var95 = var83 * 128 + 64;
                            class27 var96 = new class27(this.method119(var93, this.field581, var92, -23) - var86, field332 + var88, field332 + var89, var90, -17838, var91, var93, var92, var84, this.field581, var85, var87);
                            var96.method339(var95, var94, false, this.method119(var95, this.field581, var94, -23) - var87, field332 + var88);
                            this.field402.method525(var96);
                        }
                    } else if (arg1 == 118) {
                        int var97 = arg0.method244();
                        int var98 = (var97 >> 4 & 7) + this.field339;
                        int var99 = (var97 & 7) + this.field340;
                        int var100 = arg0.method246();
                        int var101 = arg0.method244();
                        int var102 = arg0.method246();
                        if (var98 >= 0 && var99 >= 0 && var98 < 104 && var99 < 104) {
                            int var103 = var98 * 128 + 64;
                            int var104 = var99 * 128 + 64;
                            class15 var105 = new class15(var100, this.method119(var104, this.field581, var103, -23) - var101, this.field581, var104, var102, false, field332, var103);
                            this.field352.method525(var105);
                        }
                    } else if (arg1 == 183) {
                        int var106 = arg0.method264(3);
                        int var107 = var106 >> 2;
                        int var108 = var106 & 3;
                        int var109 = this.field570[var107];
                        int var110 = arg0.method265(535);
                        int var111 = (var110 >> 4 & 7) + this.field339;
                        int var112 = (var110 & 7) + this.field340;
                        int var113 = arg0.method272((byte) -116);
                        if (var111 >= 0 && var112 >= 0 && var111 < 103 && var112 < 103) {
                            int var114 = this.field285[this.field581][var111][var112];
                            int var115 = this.field285[this.field581][var111 + 1][var112];
                            int var116 = this.field285[this.field581][var111 + 1][var112 + 1];
                            int var117 = this.field285[this.field581][var111][var112 + 1];
                            if (var109 == 0) {
                                class45 var118 = this.field206.method433((byte) 4, this.field581, var111, var112);
                                if (var118 != null) {
                                    int var119 = var118.field1133 >> 14 & 32767;
                                    if (var107 == 2) {
                                        var118.field1131 = new class66(2, var115, var114, var116, 154, false, var113, var108 + 4, var117, var119);
                                        var118.field1132 = new class66(2, var115, var114, var116, 154, false, var113, var108 + 1 & 3, var117, var119);
                                    } else {
                                        var118.field1131 = new class66(var107, var115, var114, var116, 154, false, var113, var108, var117, var119);
                                    }
                                }
                            }
                            if (var109 == 1) {
                                class28 var120 = this.field206.method434(this.field581, var112, var111, (byte) 7);
                                if (var120 != null) {
                                    var120.field935 = new class66(4, var115, var114, var116, 154, false, var113, 0, var117, var120.field936 >> 14 & 32767);
                                }
                            }
                            if (var109 == 2) {
                                class5 var121 = this.field206.method435(843, this.field581, var112, var111);
                                if (var107 == 11) {
                                    var107 = 10;
                                }
                                if (var121 != null) {
                                    var121.field113 = new class66(var107, var115, var114, var116, 154, false, var113, var108, var117, var121.field121 >> 14 & 32767);
                                }
                            }
                            if (var109 == 3) {
                                class49 var122 = this.field206.method436(this.field581, 72, var112, var111);
                                if (var122 != null) {
                                    var122.field1266 = new class66(22, var115, var114, var116, 154, false, var113, var108, var117, var122.field1267 >> 14 & 32767);
                                }
                            }
                        }
                    }
                } else {
                    int var58 = arg0.method265(535);
                    int var59 = (var58 >> 4 & 7) + this.field339;
                    int var60 = (var58 & 7) + this.field340;
                    int var61 = arg0.method246();
                    if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                        class54 var62 = this.field553[this.field581][var59][var60];
                        if (var62 != null) {
                            for (class39 var63 = (class39) var62.method528(); var63 != null; var63 = (class39) var62.method530(true)) {
                                if ((var61 & 32767) == var63.field1070) {
                                    var63.method555();
                                    break;
                                }
                            }
                            if (var62.method528() == null) {
                                this.field553[this.field581][var59][var60] = null;
                            }
                            this.method131(var59, var60);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method107(int arg0, byte[] arg1, int arg2) {
        if (arg0 != 44339) {
            this.field553 = null;
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILUSEDZXXV;B)I")
    public final int method108(int arg0, class52 arg1, byte arg2) {
        if (arg2 != 63) {
            this.field622 = this.field199.method29();
        }
        if (arg1.field1338 != null && arg0 < arg1.field1338.length) {
            try {
                int[] var4 = arg1.field1338[arg0];
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
                        var9 = this.field353[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field400[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field608[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class52 var11 = class52.field1306[var4[var6++]];
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class2.field6 && (!class2.method4(var12).field55 || field232)) {
                            for (int var13 = 0; var13 < var11.field1348.length; ++var13) {
                                if (var12 + 1 == var11.field1348[var13]) {
                                    var9 += var11.field1363[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field492[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field346[this.field400[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field492[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field588.field1121;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class67.field1656; ++var14) {
                            if (class67.field1658[var14]) {
                                var9 += this.field400[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class52 var15 = class52.field1306[var4[var6++]];
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class2.field6 && (!class2.method4(var16).field55 || field232)) {
                            for (int var17 = 0; var17 < var15.field1348.length; ++var17) {
                                if (var15.field1348[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field455;
                    }
                    if (var8 == 12) {
                        var9 = this.field487;
                    }
                    if (var8 == 13) {
                        int var18 = this.field492[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class72 var21 = class72.field1710[var20];
                        int var22 = var21.field1712;
                        int var23 = var21.field1713;
                        int var24 = var21.field1714;
                        int var25 = field569[var24 - var23];
                        var9 = this.field492[var22] >> var23 & var25;
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
                        var9 = (field588.field1506 >> 7) + this.field368;
                    }
                    if (var8 == 19) {
                        var9 = (field588.field1507 >> 7) + this.field369;
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

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method109(int arg0) {
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (arg0 != 7) {
            this.field386 = this.field269.method244();
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method110(byte arg0) {
        ++this.field374;
        this.method79(true, false);
        this.method104(true, -4);
        this.method79(false, false);
        this.method104(false, -4);
        this.method117(32731);
        this.method46((byte) 5);
        if (!this.field361) {
            int var2 = this.field302;
            if (this.field316 / 256 > var2) {
                var2 = this.field316 / 256;
            }
            if (this.field598[4] && this.field406[4] + 128 > var2) {
                var2 = this.field406[4] + 128;
            }
            int var3 = this.field469 + this.field303 & 2047;
            this.method53(this.field236, this.field235, var2 * 3 + 600, var3, false, this.method119(field588.field1507, this.field581, field588.field1506, -23) - 50, var2);
        }
        int var4;
        if (!this.field361) {
            var4 = this.method40(true);
        } else {
            var4 = this.method41(true);
        }
        int var5 = this.field224;
        int var6 = this.field225;
        int var7 = this.field226;
        int var8 = this.field227;
        int var9 = this.field228;
        if (arg0 == 6) {
            boolean var10 = false;
        } else {
            for (int var11 = 1; var11 > 0; ++var11) {
            }
        }
        for (int var12 = 0; var12 < 5; ++var12) {
            if (this.field598[var12]) {
                int var14 = (int) (Math.random() * (double) (this.field516[var12] * 2 + 1) - (double) this.field516[var12] + Math.sin((double) this.field490[var12] / 100.0D * (double) this.field179[var12]) * (double) this.field406[var12]);
                if (var12 == 0) {
                    this.field224 += var14;
                }
                if (var12 == 1) {
                    this.field225 += var14;
                }
                if (var12 == 2) {
                    this.field226 += var14;
                }
                if (var12 == 3) {
                    this.field228 = this.field228 + var14 & 2047;
                }
                if (var12 == 4) {
                    this.field227 += var14;
                    if (this.field227 < 128) {
                        this.field227 = 128;
                    }
                    if (this.field227 > 383) {
                        this.field227 = 383;
                    }
                }
            }
        }
        int var13 = class9.field686;
        class53.field1437 = true;
        class53.field1440 = 0;
        class53.field1438 = super.field79 - 4;
        class53.field1439 = super.field80 - 4;
        class50.method476(-371);
        this.field206.method450(var4, this.field225, 336, this.field227, this.field228, this.field226, this.field224);
        this.field206.method425(1);
        this.method149(-590);
        this.method132(5);
        this.method118((byte) -50, var13);
        this.method113(0);
        this.field350.method394(super.field71, 4, 4, -47890);
        this.field224 = var5;
        this.field225 = var6;
        this.field226 = var7;
        this.field227 = var8;
        this.field228 = var9;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIILPASMQFXV;I)V")
    public final void method111(byte arg0, int arg1, int arg2, class43 arg3, int arg4) {
        if (arg0 != 0) {
            this.field214.method234(158);
        }
        if (field588 != arg3) {
            if (this.field551 < 400) {
                String var6;
                if (arg3.field1095 == 0) {
                    var6 = arg3.field1094 + method98(this.field314, arg3.field1121, field588.field1121) + " (level-" + arg3.field1121 + ")";
                } else {
                    var6 = arg3.field1094 + " (skill-" + arg3.field1095 + ")";
                }
                if (this.field417 == 1) {
                    this.field643[this.field551] = "Use " + this.field421 + " with @whi@" + var6;
                    this.field473[this.field551] = 448;
                    this.field474[this.field551] = arg2;
                    this.field471[this.field551] = arg4;
                    this.field472[this.field551] = arg1;
                    ++this.field551;
                } else if (this.field208 == 1) {
                    if ((this.field210 & 8) == 8) {
                        this.field643[this.field551] = this.field211 + " @whi@" + var6;
                        this.field473[this.field551] = 751;
                        this.field474[this.field551] = arg2;
                        this.field471[this.field551] = arg4;
                        this.field472[this.field551] = arg1;
                        ++this.field551;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field296[var7] != null) {
                            this.field643[this.field551] = this.field296[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field296[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field1121 > field588.field1121) {
                                    var9 = 2000;
                                }
                                if (field588.field1103 != 0 && arg3.field1103 != 0) {
                                    if (field588.field1103 == arg3.field1103) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field297[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field473[this.field551] = var9 + 380;
                            }
                            if (var7 == 1) {
                                this.field473[this.field551] = var9 + 915;
                            }
                            if (var7 == 2) {
                                this.field473[this.field551] = var9 + 401;
                            }
                            if (var7 == 3) {
                                this.field473[this.field551] = var9 + 766;
                            }
                            if (var7 == 4) {
                                this.field473[this.field551] = var9 + 820;
                            }
                            this.field474[this.field551] = arg2;
                            this.field471[this.field551] = arg4;
                            this.field472[this.field551] = arg1;
                            ++this.field551;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field551; ++var8) {
                    if (this.field473[var8] == 610) {
                        this.field643[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)V")
    public final void method112(int arg0) {
        this.field385 += arg0;
        for (int var2 = -1; var2 < this.field394; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field392;
            } else {
                var3 = this.field395[var2];
            }
            class43 var4 = this.field393[var3];
            if (var4 != null) {
                this.method142(var4, 1, -390);
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public final void method113(int arg0) {
        this.method160((byte) 5);
        if (this.field282 == 1) {
            this.field628[this.field281 / 100].method331(this.field279 - 8 - 4, 272, this.field280 - 8 - 4);
        }
        if (this.field282 == 2) {
            this.field628[this.field281 / 100 + 4].method331(this.field279 - 8 - 4, 272, this.field280 - 8 - 4);
        }
        if (this.field451 != -1) {
            this.method92(this.field451, this.field188, 0);
            this.method164(class52.field1306[this.field451], 0, 0, 851, 0);
        }
        if (this.field220 != -1) {
            this.method92(this.field220, this.field188, 0);
            this.method164(class52.field1306[this.field220], 0, 0, 851, 0);
        }
        this.method152(false);
        if (arg0 != 0) {
            this.method19();
        }
        if (!this.field432) {
            this.method37(-790);
            this.method58(true);
        } else if (this.field495 == 0) {
            this.method36((byte) -46);
        }
        if (this.field424 == 1) {
            this.field381[1].method331(472, 272, 296);
        }
        if (field566) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field67 < 15) {
                var4 = 16711680;
            }
            this.field443.method189(this.field221, var4, var3, var2, "Fps:" + super.field67);
            int var12 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field233) {
                int var8 = 16711680;
            }
            this.field443.method189(this.field221, 16776960, var12, var2, "Mem:" + var6 + "k");
            var12 += 15;
        }
        if (this.field466 != 0) {
            int var9 = this.field466 / 50;
            int var10 = var9 / 60;
            int var11 = var9 % 60;
            if (var11 < 10) {
                this.field443.method194((byte) 22, "System update in: " + var10 + ":0" + var11, 16776960, 4, 329);
            } else {
                this.field443.method194((byte) 22, "System update in: " + var10 + ":" + var11, 16776960, 4, 329);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LDSELJCMH;I)V")
    private final void method114(class13 arg0, int arg1) {
        if (arg1 >= 7 && arg1 <= 7) {
            int var3 = 0;
            int var4 = -1;
            int var5 = 0;
            int var6 = 0;
            if (arg0.field729 == 0) {
                var3 = this.field206.method437(arg0.field728, arg0.field730, arg0.field731);
            }
            if (arg0.field729 == 1) {
                var3 = this.field206.method438(arg0.field730, 6, arg0.field731, arg0.field728);
            }
            if (arg0.field729 == 2) {
                var3 = this.field206.method439(arg0.field728, arg0.field730, arg0.field731);
            }
            if (arg0.field729 == 3) {
                var3 = this.field206.method440(arg0.field728, arg0.field730, arg0.field731);
            }
            if (var3 != 0) {
                int var7 = this.field206.method441(arg0.field728, arg0.field730, arg0.field731, var3);
                var4 = var3 >> 14 & 32767;
                var5 = var7 & 31;
                var6 = var7 >> 6;
            }
            arg0.field732 = var4;
            arg0.field734 = var5;
            arg0.field733 = var6;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLVUMXQDFQ;)V")
    public final void method115(byte arg0, class57 arg1) {
        short var3 = 256;
        if (arg0 != 116) {
            field434 = this.field199.method29();
        }
        for (int var4 = 0; var4 < this.field299.length; ++var4) {
            this.field299[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field299[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field300[var16] = (this.field299[var16 - 1] + this.field299[var16 + 1] + this.field299[var16 - 128] + this.field299[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field299;
            this.field299 = this.field300;
            this.field300 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field1475; ++var8) {
                for (int var9 = 0; var9 < arg1.field1474; ++var9) {
                    if (arg1.field1472[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field1476;
                        int var11 = var8 + 16 + arg1.field1477;
                        int var12 = (var11 << 7) + var10;
                        this.field299[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method116(int arg0) {
        Graphics var2 = this.method24(-51).getGraphics();
        if (arg0 != -38814) {
            this.field433 = !this.field433;
        }
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        this.method17(1, (byte) 21);
        if (this.field334) {
            this.field289 = false;
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
        if (this.field544) {
            this.field289 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field535) {
            this.field289 = false;
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

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method117(int arg0) {
        if (arg0 != 32731) {
            field567 = 195;
        }
        for (class27 var2 = (class27) this.field402.method528(); var2 != null; var2 = (class27) this.field402.method530(true)) {
            if (this.field581 == var2.field902 && field332 <= var2.field913) {
                if (field332 >= var2.field912) {
                    if (var2.field927 > 0) {
                        class46 var3 = this.field439[var2.field927 - 1];
                        if (var3 != null && var3.field1506 >= 0 && var3.field1506 < 13312 && var3.field1507 >= 0 && var3.field1507 < 13312) {
                            var2.method339(var3.field1507, var3.field1506, false, this.method119(var3.field1507, var2.field902, var3.field1506, -23) - var2.field920, field332);
                        }
                    }
                    if (var2.field927 < 0) {
                        int var4 = -var2.field927 - 1;
                        class43 var5;
                        if (this.field427 == var4) {
                            var5 = field588;
                        } else {
                            var5 = this.field393[var4];
                        }
                        if (var5 != null && var5.field1506 >= 0 && var5.field1506 < 13312 && var5.field1507 >= 0 && var5.field1507 < 13312) {
                            var2.method339(var5.field1507, var5.field1506, false, this.method119(var5.field1507, var2.field902, var5.field1506, -23) - var2.field920, field332);
                        }
                    }
                    var2.method340(true, this.field188);
                    this.field206.method422(this.field581, false, -1, false, var2, (int) var2.field908, (int) var2.field907, var2.field903, 60, (int) var2.field909);
                }
            } else {
                var2.method555();
            }
        }
        ++field408;
        if (field408 > 86) {
            field408 = 0;
            this.field214.method233(140, 0);
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)V")
    public final void method118(byte arg0, int arg1) {
        if (this.field489 != arg0) {
            this.field386 = this.field269.method244();
        }
        if (!field233) {
            if (class9.field685[17] >= arg1) {
                class57 var3 = class9.field679[17];
                int var4 = var3.field1475 * var3.field1474 - 1;
                int var5 = this.field188 * var3.field1474 * 2;
                byte[] var6 = var3.field1472;
                byte[] var7 = this.field219;
                for (int var8 = 0; var8 <= var4; ++var8) {
                    var7[var8] = var6[var8 - var5 & var4];
                }
                var3.field1472 = var7;
                this.field219 = var6;
                class9.method179(this.field587, 17);
                ++field277;
                if (field277 > 1347) {
                    field277 = 0;
                    this.field214.method233(132, 0);
                    this.field214.method234(0);
                    int var9 = this.field214.field818;
                    this.field214.method235((int) (Math.random() * 65536.0D));
                    this.field214.method235((int) (Math.random() * 65536.0D));
                    this.field214.method234(222);
                    this.field214.method234(172);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method234(232);
                    }
                    this.field214.method235(38986);
                    this.field214.method235(3803);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method235(25132);
                    }
                    this.field214.method234(125);
                    this.field214.method234((int) (Math.random() * 256.0D));
                    this.field214.method243(550, this.field214.field818 - var9);
                }
            }
            if (class9.field685[24] >= arg1) {
                class57 var10 = class9.field679[24];
                int var11 = var10.field1475 * var10.field1474 - 1;
                int var12 = this.field188 * var10.field1474 * 2;
                byte[] var13 = var10.field1472;
                byte[] var14 = this.field219;
                for (int var15 = 0; var15 <= var11; ++var15) {
                    var14[var15] = var13[var15 - var12 & var11];
                }
                var10.field1472 = var14;
                this.field219 = var13;
                class9.method179(this.field587, 24);
                ++field584;
                if (field584 > 1503) {
                    field584 = 0;
                    this.field214.method233(126, 0);
                    this.field214.method234(0);
                    int var16 = this.field214.field818;
                    this.field214.method235((int) (Math.random() * 65536.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method235(45879);
                    }
                    this.field214.method235(49559);
                    this.field214.method235(4938);
                    this.field214.method235(15448);
                    this.field214.method234(202);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method235(8014);
                    }
                    this.field214.method234(173);
                    this.field214.method234((int) (Math.random() * 256.0D));
                    this.field214.method235((int) (Math.random() * 65536.0D));
                    this.field214.method243(550, this.field214.field818 - var16);
                }
            }
            if (class9.field685[34] >= arg1) {
                class57 var17 = class9.field679[34];
                int var18 = var17.field1475 * var17.field1474 - 1;
                int var19 = this.field188 * var17.field1474 * 2;
                byte[] var20 = var17.field1472;
                byte[] var21 = this.field219;
                for (int var22 = 0; var22 <= var18; ++var22) {
                    var21[var22] = var20[var22 - var19 & var18];
                }
                var17.field1472 = var21;
                this.field219 = var20;
                class9.method179(this.field587, 34);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IIII)I")
    public final int method119(int arg0, int arg1, int arg2, int arg3) {
        while (arg3 >= 0) {
            field567 = 84;
        }
        int var5 = arg2 >> 7;
        int var6 = arg0 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg1;
            if (arg1 < 3 && (this.field410[1][var5][var6] & 2) == 2) {
                var7 = arg1 + 1;
            }
            int var8 = arg2 & 127;
            int var9 = arg0 & 127;
            int var10 = (128 - var8) * this.field285[var7][var5][var6] + this.field285[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field285[var7][var5][var6 + 1] + this.field285[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method120(String arg0) throws IOException {
        if (!this.field185) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field448 != null) {
                try {
                    this.field448.close();
                } catch (Exception var4) {
                }
                this.field448 = null;
            }
            this.field448 = this.method128(43595);
            this.field448.setSoTimeout(10000);
            InputStream var2 = this.field448.getInputStream();
            OutputStream var3 = this.field448.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method19() {
        this.method26((byte) 62, 20, "Starting up");
        if (signlink.sunjava) {
            super.field65 = 5;
        }
        if (field329) {
            this.field535 = true;
        } else {
            field329 = true;
            boolean var1 = false;
            String var2 = this.method70(-14660);
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
            if (var2.endsWith("127.0.0.1")) {
                var1 = true;
            }
            if (!var1) {
                this.field544 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field594[var3] = new class56(var3 + 1, (byte) -31, 500000, signlink.cache_dat, signlink.cache_idx[var3]);
                    }
                }
                try {
                    this.method95(false);
                    this.field452 = this.method157("title", "title screen", field434, 1, this.field491[1], 25);
                    this.field442 = new class11("p11_full", 0, false, this.field452);
                    this.field443 = new class11("p12_full", 0, false, this.field452);
                    this.field444 = new class11("b12_full", 0, false, this.field452);
                    this.field445 = new class11("q8_full", 0, true, this.field452);
                    this.method44(6);
                    this.method67(true);
                    class65 var4 = this.method157("config", "config", field434, 2, this.field491[2], 30);
                    class65 var5 = this.method157("interface", "interface", field434, 3, this.field491[3], 35);
                    class65 var6 = this.method157("media", "2d graphics", field434, 4, this.field491[4], 40);
                    class65 var7 = this.method157("textures", "textures", field434, 6, this.field491[6], 45);
                    class65 var8 = this.method157("wordenc", "chat system", field434, 7, this.field491[7], 50);
                    class65 var9 = this.method157("sounds", "sound effects", field434, 8, this.field491[8], 55);
                    this.field410 = new byte[4][104][104];
                    this.field285 = new int[4][105][105];
                    this.field206 = new class47(104, this.field285, 4, 104, 636);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field453[var10] = new class14(585, 104, 104);
                    }
                    this.field542 = new class26(512, 512);
                    class65 var11 = this.method157("versionlist", "update list", field434, 5, this.field491[5], 60);
                    this.method26((byte) 62, 60, "Connecting to update server");
                    this.field195 = new class35();
                    this.field195.method367(var11, this);
                    class51.method485(this.field195.method377((byte) 8));
                    class53.method497(this.field195.method374(0, false), this.field195);
                    if (!field233) {
                        this.field322 = 0;
                        try {
                            this.field322 = Integer.parseInt(this.getParameter("music"));
                        } catch (Exception var70) {
                        }
                        this.field323 = true;
                        this.field195.method365(2, this.field322);
                        while (this.field195.method366() > 0) {
                            this.method50(4);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var69) {
                            }
                            if (this.field195.field987 > 3) {
                                this.method123("ondemand");
                                return;
                            }
                        }
                    }
                    this.method26((byte) 62, 65, "Requesting animations");
                    int var12 = this.field195.method374(1, false);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field195.method365(1, var13);
                    }
                    while (this.field195.method366() > 0) {
                        int var14 = var12 - this.field195.method366();
                        if (var14 > 0) {
                            this.method26((byte) 62, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method50(4);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var68) {
                        }
                        if (this.field195.field987 > 3) {
                            this.method123("ondemand");
                            return;
                        }
                    }
                    this.method26((byte) 62, 70, "Requesting models");
                    int var15 = this.field195.method374(0, false);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field195.method358(var16, 16501);
                        if ((var17 & 1) != 0) {
                            this.field195.method365(0, var16);
                        }
                    }
                    int var18 = this.field195.method366();
                    while (this.field195.method366() > 0) {
                        int var19 = var18 - this.field195.method366();
                        if (var19 > 0) {
                            this.method26((byte) 62, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method50(4);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var67) {
                        }
                    }
                    if (this.field594[0] != null) {
                        this.method26((byte) 62, 75, "Requesting maps");
                        this.field195.method365(3, this.field195.method376(-33346, 48, 0, 47));
                        this.field195.method365(3, this.field195.method376(-33346, 48, 1, 47));
                        this.field195.method365(3, this.field195.method376(-33346, 48, 0, 48));
                        this.field195.method365(3, this.field195.method376(-33346, 48, 1, 48));
                        this.field195.method365(3, this.field195.method376(-33346, 48, 0, 49));
                        this.field195.method365(3, this.field195.method376(-33346, 48, 1, 49));
                        this.field195.method365(3, this.field195.method376(-33346, 47, 0, 47));
                        this.field195.method365(3, this.field195.method376(-33346, 47, 1, 47));
                        this.field195.method365(3, this.field195.method376(-33346, 47, 0, 48));
                        this.field195.method365(3, this.field195.method376(-33346, 47, 1, 48));
                        this.field195.method365(3, this.field195.method376(-33346, 148, 0, 48));
                        this.field195.method365(3, this.field195.method376(-33346, 148, 1, 48));
                        int var20 = this.field195.method366();
                        while (this.field195.method366() > 0) {
                            int var21 = var20 - this.field195.method366();
                            if (var21 > 0) {
                                this.method26((byte) 62, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method50(4);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var66) {
                            }
                        }
                    }
                    int var22 = this.field195.method374(0, false);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field195.method358(var23, 16501);
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
                            this.field195.method373(0, 0, var25, var23);
                        }
                    }
                    this.field195.method357(field232, (byte) 54);
                    if (!field233) {
                        int var26 = this.field195.method374(2, false);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field195.method362(var27, false)) {
                                this.field195.method373(2, 0, (byte) 1, var27);
                            }
                        }
                    }
                    this.method26((byte) 62, 80, "Unpacking media");
                    this.field248 = new class57(var6, "invback", 0);
                    this.field250 = new class57(var6, "chatback", 0);
                    this.field249 = new class57(var6, "mapback", 0);
                    this.field382 = new class57(var6, "backbase1", 0);
                    this.field383 = new class57(var6, "backbase2", 0);
                    this.field384 = new class57(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field260[var28] = new class57(var6, "sideicons", var28);
                    }
                    this.field253 = new class26(var6, "compass", 0);
                    this.field621 = new class26(var6, "mapedge", 0);
                    this.field621.method328(false);
                    try {
                        for (int var29 = 0; var29 < 100; ++var29) {
                            this.field446[var29] = new class57(var6, "mapscene", var29);
                        }
                    } catch (Exception var74) {
                    }
                    try {
                        for (int var30 = 0; var30 < 100; ++var30) {
                            this.field355[var30] = new class26(var6, "mapfunction", var30);
                        }
                    } catch (Exception var73) {
                    }
                    try {
                        for (int var31 = 0; var31 < 20; ++var31) {
                            this.field539[var31] = new class26(var6, "hitmarks", var31);
                        }
                    } catch (Exception var72) {
                    }
                    try {
                        for (int var32 = 0; var32 < 20; ++var32) {
                            this.field381[var32] = new class26(var6, "headicons", var32);
                        }
                    } catch (Exception var71) {
                    }
                    this.field291 = new class26(var6, "mapmarker", 0);
                    this.field292 = new class26(var6, "mapmarker", 1);
                    for (int var33 = 0; var33 < 8; ++var33) {
                        this.field628[var33] = new class26(var6, "cross", var33);
                    }
                    this.field264 = new class26(var6, "mapdots", 0);
                    this.field265 = new class26(var6, "mapdots", 1);
                    this.field266 = new class26(var6, "mapdots", 2);
                    this.field267 = new class26(var6, "mapdots", 3);
                    this.field268 = new class26(var6, "mapdots", 4);
                    this.field311 = new class57(var6, "scrollbar", 0);
                    this.field312 = new class57(var6, "scrollbar", 1);
                    this.field560 = new class57(var6, "redstone1", 0);
                    this.field561 = new class57(var6, "redstone2", 0);
                    this.field562 = new class57(var6, "redstone3", 0);
                    this.field563 = new class57(var6, "redstone1", 0);
                    this.field563.method539(107);
                    this.field564 = new class57(var6, "redstone2", 0);
                    this.field564.method539(107);
                    this.field520 = new class57(var6, "redstone1", 0);
                    this.field520.method540((byte) 2);
                    this.field521 = new class57(var6, "redstone2", 0);
                    this.field521.method540((byte) 2);
                    this.field522 = new class57(var6, "redstone3", 0);
                    this.field522.method540((byte) 2);
                    this.field523 = new class57(var6, "redstone1", 0);
                    this.field523.method539(107);
                    this.field523.method540((byte) 2);
                    this.field524 = new class57(var6, "redstone2", 0);
                    this.field524.method539(107);
                    this.field524.method540((byte) 2);
                    for (int var34 = 0; var34 < 2; ++var34) {
                        this.field456[var34] = new class57(var6, "mod_icons", var34);
                    }
                    class26 var35 = new class26(var6, "backleft1", 0);
                    this.field457 = new class41(var35.field896, var35.field895, true, this.method24(-51));
                    var35.method329(0, 0, (byte) -73);
                    class26 var36 = new class26(var6, "backleft2", 0);
                    this.field458 = new class41(var36.field896, var36.field895, true, this.method24(-51));
                    var36.method329(0, 0, (byte) -73);
                    class26 var37 = new class26(var6, "backright1", 0);
                    this.field459 = new class41(var37.field896, var37.field895, true, this.method24(-51));
                    var37.method329(0, 0, (byte) -73);
                    class26 var38 = new class26(var6, "backright2", 0);
                    this.field460 = new class41(var38.field896, var38.field895, true, this.method24(-51));
                    var38.method329(0, 0, (byte) -73);
                    class26 var39 = new class26(var6, "backtop1", 0);
                    this.field461 = new class41(var39.field896, var39.field895, true, this.method24(-51));
                    var39.method329(0, 0, (byte) -73);
                    class26 var40 = new class26(var6, "backvmid1", 0);
                    this.field462 = new class41(var40.field896, var40.field895, true, this.method24(-51));
                    var40.method329(0, 0, (byte) -73);
                    class26 var41 = new class26(var6, "backvmid2", 0);
                    this.field463 = new class41(var41.field896, var41.field895, true, this.method24(-51));
                    var41.method329(0, 0, (byte) -73);
                    class26 var42 = new class26(var6, "backvmid3", 0);
                    this.field464 = new class41(var42.field896, var42.field895, true, this.method24(-51));
                    var42.method329(0, 0, (byte) -73);
                    class26 var43 = new class26(var6, "backhmid2", 0);
                    this.field465 = new class41(var43.field896, var43.field895, true, this.method24(-51));
                    var43.method329(0, 0, (byte) -73);
                    int var44 = (int) (Math.random() * 21.0D) - 10;
                    int var45 = (int) (Math.random() * 21.0D) - 10;
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 41.0D) - 20;
                    for (int var48 = 0; var48 < 100; ++var48) {
                        if (this.field355[var48] != null) {
                            this.field355[var48].method327(var46 + var47, var45 + var47, var44 + var47, (byte) -77);
                        }
                        if (this.field446[var48] != null) {
                            this.field446[var48].method541(var46 + var47, var45 + var47, var44 + var47, (byte) -77);
                        }
                    }
                    this.method26((byte) 62, 83, "Unpacking textures");
                    class9.method177(var7, -40255);
                    class9.method181(0.8D, true);
                    class9.method176(0, 20);
                    this.method26((byte) 62, 86, "Unpacking config");
                    class59.method548(false, var4);
                    class48.method466(var4);
                    class40.method389(false, var4);
                    class2.method12(var4);
                    class36.method381(var4);
                    class18.method221(false, var4);
                    class64.method577(false, var4);
                    class4.method27(false, var4);
                    class72.method589(false, var4);
                    class2.field15 = field232;
                    if (!field233) {
                        this.method26((byte) 62, 90, "Unpacking sounds");
                        byte[] var49 = var9.method581("sounds.dat", (byte[]) null);
                        class21 var50 = new class21(var49, -49015);
                        class8.method166(false, var50);
                    }
                    this.method26((byte) 62, 95, "Unpacking interfaces");
                    class11[] var51 = new class11[] { this.field442, this.field443, this.field444, this.field445 };
                    class52.method492(false, var6, var51, var5);
                    this.method26((byte) 62, 100, "Preparing game engine");
                    for (int var52 = 0; var52 < 33; ++var52) {
                        int var53 = 999;
                        int var54 = 0;
                        for (int var55 = 0; var55 < 34; ++var55) {
                            if (this.field249.field1472[this.field249.field1474 * var52 + var55] == 0) {
                                if (var53 == 999) {
                                    var53 = var55;
                                }
                            } else if (var53 != 999) {
                                var54 = var55;
                                break;
                            }
                        }
                        this.field401[var52] = var53;
                        this.field367[var52] = var54 - var53;
                    }
                    for (int var56 = 5; var56 < 156; ++var56) {
                        int var57 = 999;
                        int var58 = 0;
                        for (int var59 = 25; var59 < 172; ++var59) {
                            if (this.field249.field1472[this.field249.field1474 * var56 + var59] == 0 && (var59 > 34 || var56 > 34)) {
                                if (var57 == 999) {
                                    var57 = var59;
                                }
                            } else if (var57 != 999) {
                                var58 = var59;
                                break;
                            }
                        }
                        this.field222[var56 - 5] = var57 - 25;
                        this.field363[var56 - 5] = var58 - var57;
                    }
                    class9.method174(479, 238, 96);
                    this.field572 = class9.field677;
                    class9.method174(190, 238, 261);
                    this.field573 = class9.field677;
                    class9.method174(512, 238, 334);
                    this.field574 = class9.field677;
                    int[] var60 = new int[9];
                    for (int var61 = 0; var61 < 9; ++var61) {
                        int var62 = var61 * 32 + 128 + 15;
                        int var63 = var62 * 3 + 600;
                        int var64 = class9.field675[var62];
                        var60[var61] = var63 * var64 >> 16;
                    }
                    class47.method447(var60, true, 800, 500, 334, 512);
                    class25.method288(var8);
                    this.field475 = new class61(this, 76);
                    this.method25(this.field475, 10);
                    class66.field1654 = this;
                    class48.field1251 = this;
                    class36.field1030 = this;
                } catch (Exception var75) {
                    signlink.reporterror("loaderror " + this.field366 + " " + this.field435);
                    this.field334 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(LINVDQNJU;IBI)V")
    public final void method121(class26 arg0, int arg1, byte arg2, int arg3) {
        if (arg2 == 1) {
            boolean var5 = false;
        } else {
            this.field553 = null;
        }
        int var6 = this.field518 + this.field303 & 2047;
        int var7 = arg1 * arg1 + arg3 * arg3;
        if (var7 <= 6400) {
            int var8 = class53.field1442[var6];
            int var9 = class53.field1443[var6];
            int var10 = var8 * 256 / (this.field344 + 256);
            int var11 = var9 * 256 / (this.field344 + 256);
            int var12 = arg1 * var10 + arg3 * var11 >> 16;
            int var13 = arg1 * var11 - arg3 * var10 >> 16;
            if (var7 > 2500) {
                arg0.method337(this.field249, var12 + 94 - arg0.field899 / 2 + 4, 83 - var13 - arg0.field900 / 2 - 4, false);
            } else {
                arg0.method331(var12 + 94 - arg0.field899 / 2 + 4, 272, 83 - var13 - arg0.field900 / 2 - 4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIZLUSEDZXXV;II)V")
    public final void method122(int arg0, int arg1, int arg2, boolean arg3, class52 arg4, int arg5, int arg6) {
        if (arg3) {
            this.field229 = !this.field229;
        }
        if (arg4.field1327 == 0 && arg4.field1325 != null && !arg4.field1313) {
            if (arg5 >= arg0 && arg6 >= arg2 && arg5 <= arg4.field1351 + arg0 && arg6 <= arg4.field1345 + arg2) {
                int var8 = arg4.field1325.length;
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = arg4.field1362[var9] + arg0;
                    int var11 = arg4.field1339[var9] + arg2 - arg1;
                    class52 var12 = class52.field1306[arg4.field1325[var9]];
                    int var13 = var12.field1310 + var10;
                    int var14 = var12.field1335 + var11;
                    if ((var12.field1332 >= 0 || var12.field1365 != 0) && arg5 >= var13 && arg6 >= var14 && arg5 < var12.field1351 + var13 && arg6 < var12.field1345 + var14) {
                        if (var12.field1332 >= 0) {
                            this.field187 = var12.field1332;
                        } else {
                            this.field187 = var12.field1358;
                        }
                    }
                    if (var12.field1327 == 0) {
                        this.method122(var13, var12.field1354, var14, this.field229, var12, arg5, arg6);
                        if (var12.field1317 > var12.field1345) {
                            this.method49(var12.field1351 + var13, this.field433, var14, arg5, var12, var12.field1317, var12.field1345, true, arg6);
                        }
                    } else {
                        if (var12.field1340 == 1 && arg5 >= var13 && arg6 >= var14 && arg5 < var12.field1351 + var13 && arg6 < var12.field1345 + var14) {
                            boolean var15 = false;
                            if (var12.field1350 != 0) {
                                var15 = this.method66(var12, this.field259);
                            }
                            if (!var15) {
                                this.field643[this.field551] = var12.field1347;
                                this.field473[this.field551] = 612;
                                this.field472[this.field551] = var12.field1358;
                                ++this.field551;
                            }
                        }
                        if (var12.field1340 == 2 && this.field208 == 0 && arg5 >= var13 && arg6 >= var14 && arg5 < var12.field1351 + var13 && arg6 < var12.field1345 + var14) {
                            String var16 = var12.field1302;
                            if (var16.indexOf(" ") != -1) {
                                var16 = var16.substring(0, var16.indexOf(" "));
                            }
                            this.field643[this.field551] = var16 + " @gre@" + var12.field1316;
                            this.field473[this.field551] = 482;
                            this.field472[this.field551] = var12.field1358;
                            ++this.field551;
                        }
                        if (var12.field1340 == 3 && arg5 >= var13 && arg6 >= var14 && arg5 < var12.field1351 + var13 && arg6 < var12.field1345 + var14) {
                            this.field643[this.field551] = "Close";
                            this.field473[this.field551] = 236;
                            this.field472[this.field551] = var12.field1358;
                            ++this.field551;
                        }
                        if (var12.field1340 == 4 && arg5 >= var13 && arg6 >= var14 && arg5 < var12.field1351 + var13 && arg6 < var12.field1345 + var14) {
                            this.field643[this.field551] = var12.field1347;
                            this.field473[this.field551] = 51;
                            this.field472[this.field551] = var12.field1358;
                            ++this.field551;
                        }
                        if (var12.field1340 == 5 && arg5 >= var13 && arg6 >= var14 && arg5 < var12.field1351 + var13 && arg6 < var12.field1345 + var14) {
                            this.field643[this.field551] = var12.field1347;
                            this.field473[this.field551] = 137;
                            this.field472[this.field551] = var12.field1358;
                            ++this.field551;
                        }
                        if (var12.field1340 == 6 && !this.field611 && arg5 >= var13 && arg6 >= var14 && arg5 < var12.field1351 + var13 && arg6 < var12.field1345 + var14) {
                            this.field643[this.field551] = var12.field1347;
                            this.field473[this.field551] = 806;
                            this.field472[this.field551] = var12.field1358;
                            ++this.field551;
                        }
                        if (var12.field1327 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var12.field1345; ++var18) {
                                for (int var19 = 0; var19 < var12.field1351; ++var19) {
                                    int var20 = (var12.field1314 + 32) * var19 + var13;
                                    int var21 = (var12.field1308 + 32) * var18 + var14;
                                    if (var17 < 20) {
                                        var20 += var12.field1360[var17];
                                        var21 += var12.field1301[var17];
                                    }
                                    if (arg5 >= var20 && arg6 >= var21 && arg5 < var20 + 32 && arg6 < var21 + 32) {
                                        this.field590 = var17;
                                        this.field591 = var12.field1358;
                                        if (var12.field1348[var17] > 0) {
                                            class2 var22 = class2.method4(var12.field1348[var17] - 1);
                                            if (this.field417 == 1 && var12.field1307) {
                                                if (this.field419 != var12.field1358 || this.field418 != var17) {
                                                    this.field643[this.field551] = "Use " + this.field421 + " with @lre@" + var22.field37;
                                                    this.field473[this.field551] = 485;
                                                    this.field474[this.field551] = var22.field34;
                                                    this.field471[this.field551] = var17;
                                                    this.field472[this.field551] = var12.field1358;
                                                    ++this.field551;
                                                }
                                            } else if (this.field208 == 1 && var12.field1307) {
                                                if ((this.field210 & 16) == 16) {
                                                    this.field643[this.field551] = this.field211 + " @lre@" + var22.field37;
                                                    this.field473[this.field551] = 294;
                                                    this.field474[this.field551] = var22.field34;
                                                    this.field471[this.field551] = var17;
                                                    this.field472[this.field551] = var12.field1358;
                                                    ++this.field551;
                                                }
                                            } else {
                                                if (var12.field1307) {
                                                    for (int var23 = 4; var23 >= 3; --var23) {
                                                        if (var22.field33 != null && var22.field33[var23] != null) {
                                                            this.field643[this.field551] = var22.field33[var23] + " @lre@" + var22.field37;
                                                            if (var23 == 3) {
                                                                this.field473[this.field551] = 532;
                                                            }
                                                            if (var23 == 4) {
                                                                this.field473[this.field551] = 8;
                                                            }
                                                            this.field474[this.field551] = var22.field34;
                                                            this.field471[this.field551] = var17;
                                                            this.field472[this.field551] = var12.field1358;
                                                            ++this.field551;
                                                        } else if (var23 == 4) {
                                                            this.field643[this.field551] = "Drop @lre@" + var22.field37;
                                                            this.field473[this.field551] = 8;
                                                            this.field474[this.field551] = var22.field34;
                                                            this.field471[this.field551] = var17;
                                                            this.field472[this.field551] = var12.field1358;
                                                            ++this.field551;
                                                        }
                                                    }
                                                }
                                                if (var12.field1356) {
                                                    this.field643[this.field551] = "Use @lre@" + var22.field37;
                                                    this.field473[this.field551] = 959;
                                                    this.field474[this.field551] = var22.field34;
                                                    this.field471[this.field551] = var17;
                                                    this.field472[this.field551] = var12.field1358;
                                                    ++this.field551;
                                                }
                                                if (var12.field1307 && var22.field33 != null) {
                                                    for (int var24 = 2; var24 >= 0; --var24) {
                                                        if (var22.field33[var24] != null) {
                                                            this.field643[this.field551] = var22.field33[var24] + " @lre@" + var22.field37;
                                                            if (var24 == 0) {
                                                                this.field473[this.field551] = 375;
                                                            }
                                                            if (var24 == 1) {
                                                                this.field473[this.field551] = 10;
                                                            }
                                                            if (var24 == 2) {
                                                                this.field473[this.field551] = 132;
                                                            }
                                                            this.field474[this.field551] = var22.field34;
                                                            this.field471[this.field551] = var17;
                                                            this.field472[this.field551] = var12.field1358;
                                                            ++this.field551;
                                                        }
                                                    }
                                                }
                                                if (var12.field1334 != null) {
                                                    for (int var25 = 4; var25 >= 0; --var25) {
                                                        if (var12.field1334[var25] != null) {
                                                            this.field643[this.field551] = var12.field1334[var25] + " @lre@" + var22.field37;
                                                            if (var25 == 0) {
                                                                this.field473[this.field551] = 355;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field473[this.field551] = 416;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field473[this.field551] = 630;
                                                            }
                                                            if (var25 == 3) {
                                                                this.field473[this.field551] = 708;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field473[this.field551] = 903;
                                                            }
                                                            this.field474[this.field551] = var22.field34;
                                                            this.field471[this.field551] = var17;
                                                            this.field472[this.field551] = var12.field1358;
                                                            ++this.field551;
                                                        }
                                                    }
                                                }
                                                this.field643[this.field551] = "Examine @lre@" + var22.field37;
                                                this.field473[this.field551] = 1463;
                                                this.field474[this.field551] = var22.field34;
                                                this.field471[this.field551] = var17;
                                                this.field472[this.field551] = var12.field1358;
                                                ++this.field551;
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method123(String arg0) {
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

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)V")
    public final void method124(int arg0) {
        this.field289 = false;
        while (this.field324) {
            this.field289 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field630 = null;
        this.field631 = null;
        this.field478 = null;
        this.field645 = null;
        this.field646 = null;
        this.field647 = null;
        this.field648 = null;
        this.field299 = null;
        this.field300 = null;
        this.field254 = null;
        if (arg0 < 0 || arg0 > 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field255 = null;
        this.field422 = null;
        this.field423 = null;
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method125(byte arg0) {
        for (int var2 = -1; var2 < this.field394; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field392;
            } else {
                var7 = this.field395[var2];
            }
            class43 var8 = this.field393[var7];
            if (var8 != null && var8.field1483 > 0) {
                --var8.field1483;
                if (var8.field1483 == 0) {
                    var8.field1503 = null;
                }
            }
        }
        ++field301;
        if (arg0 == 7) {
            boolean var3 = false;
            if (field301 > 66) {
                field301 = 0;
                this.field214.method233(122, 0);
            }
            for (int var4 = 0; var4 < this.field440; ++var4) {
                int var5 = this.field441[var4];
                class46 var6 = this.field439[var5];
                if (var6 != null && var6.field1483 > 0) {
                    --var6.field1483;
                    if (var6.field1483 == 0) {
                        var6.field1503 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)V")
    public final void method126(boolean arg0) {
        if (this.field466 > 1) {
            --this.field466;
        }
        if (this.field389 > 0) {
            --this.field389;
        }
        for (int var2 = 0; var2 < 5 && this.method102(189); ++var2) {
        }
        if (this.field454) {
            Object var3 = this.field475.field1583;
            synchronized (this.field475.field1583) {
                if (!field404) {
                    this.field475.field1586 = 0;
                } else if (super.field85 != 0 || this.field475.field1586 >= 40) {
                    this.field214.method233(125, 0);
                    this.field214.method234(0);
                    int var4 = this.field214.field818;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field475.field1586 && var4 - this.field214.field818 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field475.field1584[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field475.field1581[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field475.field1584[var6] == -1 && this.field475.field1581[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field528 == var8 && this.field529 == var7) {
                            if (this.field481 < 2047) {
                                ++this.field481;
                            }
                        } else {
                            int var10 = var8 - this.field528;
                            this.field528 = var8;
                            int var11 = var7 - this.field529;
                            this.field529 = var7;
                            if (this.field481 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field214.method235((this.field481 << 12) + (var10 << 6) + var11);
                                this.field481 = 0;
                            } else if (this.field481 < 8) {
                                this.field214.method237((this.field481 << 19) + 8388608 + var9);
                                this.field481 = 0;
                            } else {
                                this.field214.method238((this.field481 << 19) + -1073741824 + var9);
                                this.field481 = 0;
                            }
                        }
                    }
                    this.field214.method243(550, this.field214.field818 - var4);
                    if (var5 >= this.field475.field1586) {
                        this.field475.field1586 = 0;
                    } else {
                        this.field475.field1586 -= var5;
                        for (int var12 = 0; var12 < this.field475.field1586; ++var12) {
                            this.field475.field1581[var12] = this.field475.field1581[var5 + var12];
                            this.field475.field1584[var12] = this.field475.field1584[var5 + var12];
                        }
                    }
                }
            }
            if (super.field85 != 0) {
                long var13 = (super.field88 - this.field241) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field241 = super.field88;
                int var15 = super.field87;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field86;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field85 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field214.method233(91, 0);
                this.field214.method277(true, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field237 > 0) {
                --this.field237;
            }
            if (super.field89[1] == 1 || super.field89[2] == 1 || super.field89[3] == 1 || super.field89[4] == 1) {
                this.field238 = true;
            }
            if (this.field238 && this.field237 <= 0) {
                this.field237 = 20;
                this.field238 = false;
                this.field214.method233(215, 0);
                this.field214.method271(-14666, this.field303);
                this.field214.method235(this.field302);
            }
            if (super.field76 && !this.field275) {
                this.field275 = true;
                this.field214.method233(201, 0);
                this.field214.method234(1);
            }
            if (!super.field76 && this.field275) {
                this.field275 = false;
                this.field214.method233(201, 0);
                this.field214.method234(0);
            }
            this.method61((byte) -69);
            this.method99(true);
            this.method74(-871);
            ++field617;
            if (field617 > 97) {
                field617 = 0;
                this.field214.method233(161, 0);
            }
            ++this.field387;
            if (this.field387 > 750) {
                this.method52(0);
            }
            this.method112(0);
            this.method141(-16642);
            this.method125((byte) 7);
            ++this.field188;
            if (this.field282 != 0) {
                this.field281 += 20;
                if (this.field281 >= 400) {
                    this.field282 = 0;
                }
            }
            if (this.field328 != 0) {
                ++this.field325;
                if (this.field325 >= 15) {
                    if (this.field328 == 2) {
                        this.field447 = true;
                    }
                    if (this.field328 == 3) {
                        this.field606 = true;
                    }
                    this.field328 = 0;
                }
            }
            if (this.field602 != 0) {
                ++this.field263;
                if (super.field79 > this.field603 + 5 || super.field79 < this.field603 - 5 || super.field80 > this.field604 + 5 || super.field80 < this.field604 - 5) {
                    this.field592 = true;
                }
                if (super.field78 == 0) {
                    if (this.field602 == 2) {
                        this.field447 = true;
                    }
                    if (this.field602 == 3) {
                        this.field606 = true;
                    }
                    this.field602 = 0;
                    if (this.field592 && this.field263 >= 5) {
                        this.field591 = -1;
                        this.method37(-790);
                        if (this.field600 == this.field591 && this.field601 != this.field590) {
                            class52 var20 = class52.field1306[this.field600];
                            byte var21 = 0;
                            if (this.field626 == 1 && var20.field1350 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1348[this.field590] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1322) {
                                int var22 = this.field601;
                                int var23 = this.field590;
                                var20.field1348[var23] = var20.field1348[var22];
                                var20.field1363[var23] = var20.field1363[var22];
                                var20.field1348[var22] = -1;
                                var20.field1363[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field601;
                                int var25 = this.field590;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method490(var24, this.field437, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method490(var24, this.field437, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method490(this.field601, this.field437, this.field590);
                            }
                            this.field214.method233(21, 0);
                            this.field214.method260(-42019, var21);
                            this.field214.method269(8, this.field600);
                            this.field214.method270(this.field601, (byte) 3);
                            this.field214.method235(this.field590);
                        }
                    } else if ((this.field333 == 1 || this.method139(this.field551 - 1, (byte) 39)) && this.field551 > 2) {
                        this.method159(false);
                    } else if (this.field551 > 0) {
                        this.method45(this.field551 - 1, 13626);
                    }
                    this.field325 = 10;
                    super.field85 = 0;
                }
            }
            if (class47.field1181 != -1) {
                int var26 = class47.field1181;
                int var27 = class47.field1182;
                boolean var28 = this.method48(0, 0, 0, 0, true, (byte) 6, 0, 0, field588.field1523[0], var26, field588.field1522[0], var27);
                class47.field1181 = -1;
                if (var28) {
                    this.field279 = super.field86;
                    this.field280 = super.field87;
                    this.field282 = 1;
                    this.field281 = 0;
                }
            }
            if (super.field85 == 1 && this.field223 != null) {
                this.field223 = null;
                this.field606 = true;
                super.field85 = 0;
            }
            this.method100(1);
            this.field454 &= arg0;
            this.method96(false);
            this.method156(-47865);
            this.method150(0);
            if (super.field78 == 1 || super.field85 == 1) {
                ++this.field376;
            }
            if (this.field276 == 2) {
                this.method84(3);
            }
            if (this.field276 == 2 && this.field361) {
                this.method32(false);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field179[var29]++;
            }
            this.method39(false);
            ++super.field77;
            if (super.field77 > 4500) {
                this.field389 = 250;
                super.field77 -= 500;
                this.field214.method233(203, 0);
            }
            ++this.field313;
            if (this.field313 > 500) {
                this.field313 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field556 += this.field557;
                }
                if ((var30 & 2) == 2) {
                    this.field202 += this.field203;
                }
                if ((var30 & 4) == 4) {
                    this.field469 += this.field470;
                }
            }
            if (this.field556 < -50) {
                this.field557 = 2;
            }
            if (this.field556 > 50) {
                this.field557 = -2;
            }
            if (this.field202 < -55) {
                this.field203 = 2;
            }
            if (this.field202 > 55) {
                this.field203 = -2;
            }
            if (this.field469 < -40) {
                this.field470 = 1;
            }
            if (this.field469 > 40) {
                this.field470 = -1;
            }
            ++this.field246;
            if (this.field246 > 500) {
                this.field246 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field518 += this.field519;
                }
                if ((var31 & 2) == 2) {
                    this.field344 += this.field345;
                }
            }
            if (this.field518 < -60) {
                this.field519 = 2;
            }
            if (this.field518 > 60) {
                this.field519 = -2;
            }
            if (this.field344 < -20) {
                this.field345 = 1;
            }
            if (this.field344 > 10) {
                this.field345 = -1;
            }
            ++this.field388;
            if (this.field388 > 50) {
                this.field214.method233(158, 0);
            }
            try {
                if (this.field431 != null && this.field214.field818 > 0) {
                    this.field431.method355(this.field214.field817, this.field214.field818, 11369, 0);
                    this.field214.field818 = 0;
                    this.field388 = 0;
                }
            } catch (IOException var33) {
                this.method52(0);
            } catch (Exception var34) {
                this.method78(348);
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    private final void method127(boolean arg0) {
        class13 var2 = (class13) this.field217.method528();
        if (arg0) {
            this.field214.method234(137);
        }
        while (var2 != null) {
            if (var2.field727 == -1) {
                var2.field738 = 0;
                this.method114(var2, 7);
            } else {
                var2.method555();
            }
            var2 = (class13) this.field217.method530(true);
        }
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method128(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(Z)V")
    public final void method129(boolean arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field254[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field254[var17] = 192;
        }
        if (!arg0) {
            this.field553 = null;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field255[var14] = (this.field254[var14 - 1] + this.field254[var14 + 1] + this.field254[var14 - 128] + this.field254[var14 + 128]) / 4;
            }
        }
        this.field215 += 128;
        if (this.field215 > this.field299.length) {
            this.field215 -= this.field299.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method115(this.field620, this.field478[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field255[var11 + 128] - this.field299[this.field215 + var11 & this.field299.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field254[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field436[var8] = this.field436[var8 + 1];
        }
        this.field436[var2 - 1] = (int) (Math.sin((double) field332 / 14.0D) * 16.0D + Math.sin((double) field332 / 15.0D) * 14.0D + Math.sin((double) field332 / 16.0D) * 12.0D);
        if (this.field482 > 0) {
            this.field482 -= 4;
        }
        if (this.field483 > 0) {
            this.field483 -= 4;
        }
        if (this.field482 == 0 && this.field483 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field482 = 1024;
            }
            if (var9 == 1) {
                this.field483 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method130(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        int var3 = 30 / arg1;
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

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field74 != null) {
                    return new URL("http://127.0.0.1:" + (field231 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method131(int arg0, int arg1) {
        class54 var3 = this.field553[this.field581][arg0][arg1];
        if (var3 == null) {
            this.field206.method432(this.field581, arg0, arg1);
        } else {
            int var4 = -99999999;
            class39 var5 = null;
            for (class39 var6 = (class39) var3.method528(); var6 != null; var6 = (class39) var3.method530(true)) {
                class2 var11 = class2.method4(var6.field1070);
                int var12 = var11.field57;
                if (var11.field31) {
                    var12 = (var6.field1069 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method526(-593, var5);
            class39 var7 = null;
            class39 var8 = null;
            for (class39 var9 = (class39) var3.method528(); var9 != null; var9 = (class39) var3.method530(true)) {
                if (var5.field1070 != var9.field1070 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1070 != var9.field1070 && var7.field1070 != var9.field1070 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field206.method418(this.field581, var8, var7, var5, var10, arg0, arg1, this.method119(arg1 * 128 + 64, this.field581, arg0 * 128 + 64, -23), 42605);
        }
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method132(int arg0) {
        if (this.field365 == 2) {
            this.method73((this.field356 - this.field368 << 7) + this.field359, (this.field357 - this.field369 << 7) + this.field360, 190, this.field358 * 2);
            if (arg0 < this.field503 || arg0 > this.field503) {
                this.method19();
            }
            if (this.field425 > -1 && field332 % 20 < 10) {
                this.field381[2].method331(this.field425 - 12, 272, this.field426 - 28);
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public final void method133(byte arg0) {
        class48.field1260.method287();
        class48.field1225.method287();
        class36.field1031.method287();
        class2.field24.method287();
        class2.field38.method287();
        class43.field1122.method287();
        class64.field1632.method287();
        if (arg0 != 110) {
            this.method19();
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method20(byte arg0) {
        if (arg0 != 60) {
            this.field386 = -1;
        }
        if (!this.field535 && !this.field334 && !this.field544) {
            ++field332;
            if (!this.field454) {
                this.method85(-44097);
            } else {
                this.method126(true);
            }
            this.method50(4);
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public void method134(int arg0) {
        System.out.println("============");
        if (arg0 != 40926) {
            this.field375 = !this.field375;
        }
        System.out.println("flame-cycle:" + this.field583);
        if (this.field195 != null) {
            System.out.println("Od-cycle:" + this.field195.field999);
        }
        System.out.println("loop-cycle:" + field332);
        System.out.println("draw-cycle:" + field234);
        System.out.println("ptype:" + this.field386);
        System.out.println("psize:" + this.field385);
        if (this.field431 != null) {
            this.field431.method356(40926);
        }
        super.field68 = true;
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)Ljava/awt/Component;")
    public final Component method24(int arg0) {
        while (arg0 >= 0) {
            this.method19();
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else if (super.field74 != null) {
            return super.field74;
        } else {
            return this;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZLGLMIQHJI;)V")
    private final void method135(int arg0, boolean arg1, class21 arg2) {
        this.field526 = 0;
        this.field396 = 0;
        if (arg1) {
            this.field433 = !this.field433;
        }
        this.method103(arg2, -849, arg0);
        this.method43(arg2, arg0, (byte) 0);
        this.method54(arg0, arg2, (byte) 6);
        this.method60(arg0, -23557, arg2);
        for (int var4 = 0; var4 < this.field526; ++var4) {
            int var6 = this.field527[var4];
            if (field332 != this.field393[var6].field1501) {
                this.field393[var6] = null;
            }
        }
        if (arg2.field818 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg2.field818 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field394; ++var5) {
                if (this.field393[this.field395[var5]] == null) {
                    signlink.reporterror(this.field180 + " null entry in pl list - pos:" + var5 + " size:" + this.field394);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILGLMIQHJI;Z)V")
    private final void method136(int arg0, class21 arg1, boolean arg2) {
        if (!arg2) {
            while (arg1.field819 + 21 < arg0 * 8) {
                int var4 = arg1.method255(14, true);
                if (var4 == 16383) {
                    break;
                }
                if (this.field439[var4] == null) {
                    this.field439[var4] = new class46();
                }
                class46 var5 = this.field439[var4];
                this.field441[this.field440++] = var4;
                var5.field1501 = field332;
                int var6 = arg1.method255(5, true);
                if (var6 > 15) {
                    var6 -= 32;
                }
                var5.field1140 = class36.method380(arg1.method255(12, true));
                int var7 = arg1.method255(1, true);
                int var8 = arg1.method255(1, true);
                if (var8 == 1) {
                    this.field397[this.field396++] = var4;
                }
                int var9 = arg1.method255(5, true);
                if (var9 > 15) {
                    var9 -= 32;
                }
                var5.field1532 = var5.field1140.field1037;
                var5.field1496 = var5.field1140.field1026;
                var5.field1516 = var5.field1140.field1012;
                var5.field1517 = var5.field1140.field1041;
                var5.field1518 = var5.field1140.field1046;
                var5.field1519 = var5.field1140.field1021;
                var5.field1484 = var5.field1140.field1038;
                var5.method546(field588.field1523[0] + var9, var7 == 1, 453, field588.field1522[0] + var6);
            }
            arg1.method256(-88);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLUSEDZXXV;)Z")
    public final boolean method137(boolean arg0, class52 arg1) {
        if (!arg0) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field1350;
            if (this.field184 == 2) {
                if (var3 == 201) {
                    this.field606 = true;
                    this.field399 = 0;
                    this.field414 = true;
                    this.field378 = "";
                    this.field256 = 1;
                    this.field593 = "Enter name of friend to add to list";
                }
                if (var3 == 202) {
                    this.field606 = true;
                    this.field399 = 0;
                    this.field414 = true;
                    this.field378 = "";
                    this.field256 = 2;
                    this.field593 = "Enter name of friend to delete from list";
                }
            }
            if (var3 == 205) {
                this.field389 = 250;
                return true;
            } else {
                if (var3 == 501) {
                    this.field606 = true;
                    this.field399 = 0;
                    this.field414 = true;
                    this.field378 = "";
                    this.field256 = 4;
                    this.field593 = "Enter name of player to add to list";
                }
                if (var3 == 502) {
                    this.field606 = true;
                    this.field399 = 0;
                    this.field414 = true;
                    this.field378 = "";
                    this.field256 = 5;
                    this.field593 = "Enter name of player to delete from list";
                }
                if (var3 >= 300 && var3 <= 313) {
                    int var4 = (var3 - 300) / 2;
                    int var5 = var3 & 1;
                    int var6 = this.field644[var4];
                    if (var6 != -1) {
                        while (true) {
                            if (var5 == 0) {
                                --var6;
                                if (var6 < 0) {
                                    var6 = class18.field778 - 1;
                                }
                            }
                            if (var5 == 1) {
                                ++var6;
                                if (var6 >= class18.field778) {
                                    var6 = 0;
                                }
                            }
                            if (!class18.field779[var6].field785 && class18.field779[var6].field780 == var4 + (this.field554 ? 0 : 7)) {
                                this.field644[var4] = var6;
                                this.field517 = true;
                                break;
                            }
                        }
                    }
                }
                if (var3 >= 314 && var3 <= 323) {
                    int var7 = (var3 - 314) / 2;
                    int var8 = var3 & 1;
                    int var9 = this.field585[var7];
                    if (var8 == 0) {
                        --var9;
                        if (var9 < 0) {
                            var9 = field415[var7].length - 1;
                        }
                    }
                    if (var8 == 1) {
                        ++var9;
                        if (var9 >= field415[var7].length) {
                            var9 = 0;
                        }
                    }
                    this.field585[var7] = var9;
                    this.field517 = true;
                }
                if (var3 == 324 && !this.field554) {
                    this.field554 = true;
                    this.method80(2);
                }
                if (var3 == 325 && this.field554) {
                    this.field554 = false;
                    this.method80(2);
                }
                if (var3 != 326) {
                    if (var3 == 613) {
                        this.field565 = !this.field565;
                    }
                    if (var3 >= 601 && var3 <= 612) {
                        this.method140(0);
                        if (this.field500.length() > 0) {
                            this.field214.method233(23, 0);
                            this.field214.method240(class70.method583(this.field500), 7);
                            this.field214.method234(var3 - 601);
                            this.field214.method234(this.field565 ? 1 : 0);
                        }
                    }
                    return false;
                } else {
                    this.field214.method233(43, 0);
                    this.field214.method234(this.field554 ? 0 : 1);
                    for (int var10 = 0; var10 < 7; ++var10) {
                        this.field214.method234(this.field644[var10]);
                    }
                    for (int var11 = 0; var11 < 5; ++var11) {
                        this.field214.method234(this.field585[var11]);
                    }
                    return true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method138(byte arg0) {
        if (this.field504 == null) {
            super.field72 = null;
            this.field351 = null;
            this.field349 = null;
            this.field348 = null;
            this.field350 = null;
            if (arg0 == 0) {
                boolean var2 = false;
            } else {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            this.field191 = null;
            this.field192 = null;
            this.field193 = null;
            this.field507 = new class41(265, 128, true, this.method24(-51));
            class50.method476(-371);
            this.field508 = new class41(265, 128, true, this.method24(-51));
            class50.method476(-371);
            this.field504 = new class41(171, 509, true, this.method24(-51));
            class50.method476(-371);
            this.field505 = new class41(132, 360, true, this.method24(-51));
            class50.method476(-371);
            this.field506 = new class41(200, 360, true, this.method24(-51));
            class50.method476(-371);
            this.field509 = new class41(238, 202, true, this.method24(-51));
            class50.method476(-371);
            this.field510 = new class41(238, 203, true, this.method24(-51));
            class50.method476(-371);
            this.field511 = new class41(94, 74, true, this.method24(-51));
            class50.method476(-371);
            this.field512 = new class41(94, 75, true, this.method24(-51));
            class50.method476(-371);
            if (this.field452 != null) {
                this.method44(6);
                this.method67(true);
            }
            this.field247 = true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IB)Z")
    public final boolean method139(int arg0, byte arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field473[arg0];
            if (this.field559 != arg1) {
                throw new NullPointerException();
            } else {
                if (var3 >= 2000) {
                    var3 -= 2000;
                }
                return var3 == 730;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BILjava/lang/String;)V")
    public final void method26(byte arg0, int arg1, String arg2) {
        this.field435 = arg1;
        this.field366 = arg2;
        this.method138((byte) 0);
        if (this.field452 == null) {
            super.method26((byte) 62, arg1, arg2);
        } else {
            this.field506.method393(1);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field444.method190(1, var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...", 16777215);
            int var7 = var5 / 2 - 18 - var6;
            class50.method479(9179409, 34, 304, var7, 4, var4 / 2 - 152);
            class50.method479(0, 32, 302, var7 + 1, 4, var4 / 2 - 151);
            class50.method478(arg1 * 3, var4 / 2 - 150, 9179409, var7 + 2, 30, (byte) 1);
            if (arg0 != 62) {
                this.field479 = !this.field479;
            }
            class50.method478(300 - arg1 * 3, arg1 * 3 + (var4 / 2 - 150), 0, var7 + 2, 30, (byte) 1);
            this.field444.method190(1, var5 / 2 + 5 - var6, var4 / 2, arg2, 16777215);
            this.field506.method394(super.field71, 202, 171, -47890);
            if (this.field247) {
                this.field247 = false;
                if (!this.field289) {
                    this.field507.method394(super.field71, 0, 0, -47890);
                    this.field508.method394(super.field71, 637, 0, -47890);
                }
                this.field504.method394(super.field71, 128, 0, -47890);
                this.field505.method394(super.field71, 202, 371, -47890);
                this.field509.method394(super.field71, 0, 265, -47890);
                this.field510.method394(super.field71, 562, 265, -47890);
                this.field511.method394(super.field71, 128, 171, -47890);
                this.field512.method394(super.field71, 562, 171, -47890);
            }
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method140(int arg0) {
        this.field385 += arg0;
        this.field214.method233(223, 0);
        if (this.field262 != -1) {
            this.field262 = -1;
            this.field447 = true;
            this.field611 = false;
            this.field372 = true;
        }
        if (this.field582 != -1) {
            this.field582 = -1;
            this.field606 = true;
            this.field611 = false;
        }
        this.field220 = -1;
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 308);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field230 = Integer.parseInt(arg0[0]);
                field231 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method89(0);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method42(true);
                }
                if (arg0[3].equals("free")) {
                    field232 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field232 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method14(field567, 503, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method141(int arg0) {
        for (int var2 = 0; var2 < this.field440; ++var2) {
            int var3 = this.field441[var2];
            class46 var4 = this.field439[var3];
            if (var4 != null) {
                this.method142(var4, var4.field1140.field1037, -390);
            }
        }
        if (this.field258 != arg0) {
            this.field377 = this.field199.method29();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LWAJZGBEE;II)V")
    public final void method142(class58 arg0, int arg1, int arg2) {
        if (arg0.field1506 < 128 || arg0.field1507 < 128 || arg0.field1506 >= 13184 || arg0.field1507 >= 13184) {
            arg0.field1524 = -1;
            arg0.field1490 = -1;
            arg0.field1513 = 0;
            arg0.field1514 = 0;
            arg0.field1506 = arg0.field1522[0] * 128 + arg0.field1532 * 64;
            arg0.field1507 = arg0.field1523[0] * 128 + arg0.field1532 * 64;
            arg0.method545(true);
        }
        if (field588 == arg0 && (arg0.field1506 < 1536 || arg0.field1507 < 1536 || arg0.field1506 >= 11776 || arg0.field1507 >= 11776)) {
            arg0.field1524 = -1;
            arg0.field1490 = -1;
            arg0.field1513 = 0;
            arg0.field1514 = 0;
            arg0.field1506 = arg0.field1522[0] * 128 + arg0.field1532 * 64;
            arg0.field1507 = arg0.field1523[0] * 128 + arg0.field1532 * 64;
            arg0.method545(true);
        }
        if (arg0.field1513 > field332) {
            this.method143((byte) 20, arg0);
        } else if (arg0.field1514 >= field332) {
            this.method144(arg0, 669);
        } else {
            this.method145(arg0, -272);
        }
        this.method146(arg0, 8);
        this.method147((byte) 6, arg0);
        while (arg2 >= 0) {
            this.field642 = 58;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLWAJZGBEE;)V")
    public final void method143(byte arg0, class58 arg1) {
        if (arg0 != 20) {
            field567 = this.field199.method29();
        }
        int var3 = arg1.field1513 - field332;
        int var4 = arg1.field1532 * 64 + arg1.field1509 * 128;
        int var5 = arg1.field1532 * 64 + arg1.field1511 * 128;
        arg1.field1506 += (var4 - arg1.field1506) / var3;
        arg1.field1507 += (var5 - arg1.field1507) / var3;
        arg1.field1521 = 0;
        if (arg1.field1515 == 0) {
            arg1.field1502 = 1024;
        }
        if (arg1.field1515 == 1) {
            arg1.field1502 = 1536;
        }
        if (arg1.field1515 == 2) {
            arg1.field1502 = 0;
        }
        if (arg1.field1515 == 3) {
            arg1.field1502 = 512;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LWAJZGBEE;I)V")
    public final void method144(class58 arg0, int arg1) {
        if (field332 == arg0.field1514 || arg0.field1524 == -1 || arg0.field1527 != 0 || arg0.field1526 + 1 > class59.field1538[arg0.field1524].method549(arg0.field1525, 0)) {
            int var3 = arg0.field1514 - arg0.field1513;
            int var4 = field332 - arg0.field1513;
            int var5 = arg0.field1532 * 64 + arg0.field1509 * 128;
            int var6 = arg0.field1532 * 64 + arg0.field1511 * 128;
            int var7 = arg0.field1532 * 64 + arg0.field1510 * 128;
            int var8 = arg0.field1532 * 64 + arg0.field1512 * 128;
            arg0.field1506 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1507 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1521 = 0;
        if (arg0.field1515 == 0) {
            arg0.field1502 = 1024;
        }
        if (arg0.field1515 == 1) {
            arg0.field1502 = 1536;
        }
        if (arg0.field1515 == 2) {
            arg0.field1502 = 0;
        }
        if (arg0.field1515 == 3) {
            arg0.field1502 = 512;
        }
        arg0.field1508 = arg0.field1502;
        int var9 = 75 / arg1;
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LWAJZGBEE;I)V")
    public final void method145(class58 arg0, int arg1) {
        while (arg1 >= 0) {
            this.field553 = null;
        }
        arg0.field1533 = arg0.field1484;
        if (arg0.field1489 == 0) {
            arg0.field1521 = 0;
        } else {
            if (arg0.field1524 != -1 && arg0.field1527 == 0) {
                class59 var3 = class59.field1538[arg0.field1524];
                if (arg0.field1505 > 0 && var3.field1550 == 0) {
                    ++arg0.field1521;
                    return;
                }
                if (arg0.field1505 <= 0 && var3.field1551 == 0) {
                    ++arg0.field1521;
                    return;
                }
            }
            int var4 = arg0.field1506;
            int var5 = arg0.field1507;
            int var6 = arg0.field1522[arg0.field1489 - 1] * 128 + arg0.field1532 * 64;
            int var7 = arg0.field1523[arg0.field1489 - 1] * 128 + arg0.field1532 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1502 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1502 = 1792;
                    } else {
                        arg0.field1502 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1502 = 768;
                    } else if (var5 > var7) {
                        arg0.field1502 = 256;
                    } else {
                        arg0.field1502 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1502 = 1024;
                } else {
                    arg0.field1502 = 0;
                }
                int var8 = arg0.field1502 - arg0.field1508 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1517;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1516;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1519;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1518;
                }
                if (var9 == -1) {
                    var9 = arg0.field1516;
                }
                arg0.field1533 = var9;
                int var10 = 4;
                if (arg0.field1508 != arg0.field1502 && arg0.field1486 == -1 && arg0.field1496 != 0) {
                    var10 = 2;
                }
                if (arg0.field1489 > 2) {
                    var10 = 6;
                }
                if (arg0.field1489 > 3) {
                    var10 = 8;
                }
                if (arg0.field1521 > 0 && arg0.field1489 > 1) {
                    var10 = 8;
                    --arg0.field1521;
                }
                if (arg0.field1488[arg0.field1489 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1533 == arg0.field1516 && arg0.field1520 != -1) {
                    arg0.field1533 = arg0.field1520;
                }
                if (var4 < var6) {
                    arg0.field1506 += var10;
                    if (arg0.field1506 > var6) {
                        arg0.field1506 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1506 -= var10;
                    if (arg0.field1506 < var6) {
                        arg0.field1506 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1507 += var10;
                    if (arg0.field1507 > var7) {
                        arg0.field1507 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1507 -= var10;
                    if (arg0.field1507 < var7) {
                        arg0.field1507 = var7;
                    }
                }
                if (arg0.field1506 == var6 && arg0.field1507 == var7) {
                    --arg0.field1489;
                    if (arg0.field1505 > 0) {
                        --arg0.field1505;
                        return;
                    }
                }
            } else {
                arg0.field1506 = var6;
                arg0.field1507 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LWAJZGBEE;I)V")
    public final void method146(class58 arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (arg0.field1496 != 0) {
            if (arg0.field1486 != -1 && arg0.field1486 < 32768) {
                class46 var4 = this.field439[arg0.field1486];
                if (var4 != null) {
                    int var5 = arg0.field1506 - var4.field1506;
                    int var6 = arg0.field1507 - var4.field1507;
                    if (var5 != 0 || var6 != 0) {
                        arg0.field1502 = (int) (Math.atan2((double) var5, (double) var6) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1486 >= 32768) {
                int var7 = arg0.field1486 - 32768;
                if (this.field427 == var7) {
                    var7 = this.field392;
                }
                class43 var8 = this.field393[var7];
                if (var8 != null) {
                    int var9 = arg0.field1506 - var8.field1506;
                    int var10 = arg0.field1507 - var8.field1507;
                    if (var9 != 0 || var10 != 0) {
                        arg0.field1502 = (int) (Math.atan2((double) var9, (double) var10) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1480 != 0 || arg0.field1481 != 0) && (arg0.field1489 == 0 || arg0.field1521 > 0)) {
                int var11 = arg0.field1506 - (arg0.field1480 - this.field368 - this.field368) * 64;
                int var12 = arg0.field1507 - (arg0.field1481 - this.field369 - this.field369) * 64;
                if (var11 != 0 || var12 != 0) {
                    arg0.field1502 = (int) (Math.atan2((double) var11, (double) var12) * 325.949D) & 2047;
                }
                arg0.field1480 = 0;
                arg0.field1481 = 0;
            }
            int var13 = arg0.field1502 - arg0.field1508 & 2047;
            if (var13 != 0) {
                if (var13 >= arg0.field1496 && var13 <= 2048 - arg0.field1496) {
                    if (var13 > 1024) {
                        arg0.field1508 -= arg0.field1496;
                    } else {
                        arg0.field1508 += arg0.field1496;
                    }
                } else {
                    arg0.field1508 = arg0.field1502;
                }
                arg0.field1508 &= 2047;
                if (arg0.field1533 == arg0.field1484 && arg0.field1508 != arg0.field1502) {
                    if (arg0.field1485 != -1) {
                        arg0.field1533 = arg0.field1485;
                        return;
                    }
                    arg0.field1533 = arg0.field1516;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BLWAJZGBEE;)V")
    public final void method147(byte arg0, class58 arg1) {
        if (this.field405 != arg0) {
            this.field386 = -1;
        }
        arg1.field1500 = false;
        if (arg1.field1533 != -1) {
            class59 var3 = class59.field1538[arg1.field1533];
            ++arg1.field1535;
            if (arg1.field1534 < var3.field1539 && arg1.field1535 > var3.method549(arg1.field1534, 0)) {
                arg1.field1535 = 0;
                ++arg1.field1534;
            }
            if (arg1.field1534 >= var3.field1539) {
                arg1.field1535 = 0;
                arg1.field1534 = 0;
            }
        }
        if (arg1.field1490 != -1 && field332 >= arg1.field1493) {
            if (arg1.field1491 < 0) {
                arg1.field1491 = 0;
            }
            class59 var4 = class64.field1620[arg1.field1490].field1624;
            ++arg1.field1492;
            while (arg1.field1491 < var4.field1539 && arg1.field1492 > var4.method549(arg1.field1491, 0)) {
                arg1.field1492 -= var4.method549(arg1.field1491, 0);
                ++arg1.field1491;
            }
            if (arg1.field1491 >= var4.field1539 && (arg1.field1491 < 0 || arg1.field1491 >= var4.field1539)) {
                arg1.field1490 = -1;
            }
        }
        if (arg1.field1524 != -1 && arg1.field1527 <= 1) {
            class59 var5 = class59.field1538[arg1.field1524];
            if (var5.field1550 == 1 && arg1.field1505 > 0 && arg1.field1513 <= field332 && arg1.field1514 < field332) {
                arg1.field1527 = 1;
                return;
            }
        }
        if (arg1.field1524 != -1 && arg1.field1527 == 0) {
            class59 var6 = class59.field1538[arg1.field1524];
            ++arg1.field1526;
            while (arg1.field1525 < var6.field1539 && arg1.field1526 > var6.method549(arg1.field1525, 0)) {
                arg1.field1526 -= var6.method549(arg1.field1525, 0);
                ++arg1.field1525;
            }
            if (arg1.field1525 >= var6.field1539) {
                arg1.field1525 -= var6.field1543;
                ++arg1.field1528;
                if (arg1.field1528 >= var6.field1549) {
                    arg1.field1524 = -1;
                }
                if (arg1.field1525 < 0 || arg1.field1525 >= var6.field1539) {
                    arg1.field1524 = -1;
                }
            }
            arg1.field1500 = var6.field1545;
        }
        if (arg1.field1527 > 0) {
            --arg1.field1527;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method148(byte arg0) {
        if (this.field247) {
            this.field247 = false;
            this.field457.method394(super.field71, 0, 4, -47890);
            this.field458.method394(super.field71, 0, 357, -47890);
            this.field459.method394(super.field71, 722, 4, -47890);
            this.field460.method394(super.field71, 743, 205, -47890);
            this.field461.method394(super.field71, 0, 0, -47890);
            this.field462.method394(super.field71, 516, 4, -47890);
            this.field463.method394(super.field71, 516, 205, -47890);
            this.field464.method394(super.field71, 496, 357, -47890);
            this.field465.method394(super.field71, 0, 338, -47890);
            this.field447 = true;
            this.field606 = true;
            this.field372 = true;
            this.field240 = true;
            if (this.field276 != 2) {
                this.field350.method394(super.field71, 4, 4, -47890);
                this.field349.method394(super.field71, 550, 4, -47890);
            }
            ++field589;
            if (field589 > 96) {
                field589 = 0;
                this.field214.method233(137, 0);
            }
        }
        if (this.field276 == 2) {
            this.method110((byte) 6);
        }
        if (this.field432 && this.field495 == 1) {
            this.field447 = true;
        }
        if (this.field262 != -1) {
            boolean var2 = this.method92(this.field262, this.field188, 0);
            if (var2) {
                this.field447 = true;
            }
        }
        if (this.field328 == 2) {
            this.field447 = true;
        }
        if (this.field602 == 2) {
            this.field447 = true;
        }
        if (this.field447) {
            this.method93(false);
            this.field447 = false;
        }
        ++field274;
        if (arg0 == -113) {
            if (field274 > 102) {
                field274 = 0;
                this.field214.method233(154, 0);
                this.field214.method237(4326152);
            }
            if (this.field582 == -1) {
                this.field623.field1354 = this.field403 - this.field186 - 77;
                if (super.field79 > 448 && super.field79 < 560 && super.field80 > 332) {
                    this.method49(463, this.field433, 0, super.field79 - 17, this.field623, this.field403, 77, false, super.field80 - 357);
                }
                int var3 = this.field403 - 77 - this.field623.field1354;
                if (var3 < 0) {
                    var3 = 0;
                }
                if (var3 > this.field403 - 77) {
                    var3 = this.field403 - 77;
                }
                if (this.field186 != var3) {
                    this.field186 = var3;
                    this.field606 = true;
                }
                ++field177;
                if (field177 > 1675) {
                    field177 = 0;
                    this.field214.method233(197, 0);
                    this.field214.method234(0);
                    int var4 = this.field214.field818;
                    this.field214.method234((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method234(161);
                    }
                    this.field214.method234((int) (Math.random() * 256.0D));
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method235(44879);
                    }
                    this.field214.method235((int) (Math.random() * 65536.0D));
                    this.field214.method235(9511);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method234(179);
                    }
                    this.field214.method234(141);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field214.method234(181);
                    }
                    this.field214.method235(43761);
                    this.field214.method243(550, this.field214.field818 - var4);
                }
            }
            if (this.field582 != -1) {
                boolean var5 = this.method92(this.field582, this.field188, 0);
                if (var5) {
                    this.field606 = true;
                }
            }
            if (this.field328 == 3) {
                this.field606 = true;
            }
            if (this.field602 == 3) {
                this.field606 = true;
            }
            if (this.field223 != null) {
                this.field606 = true;
            }
            if (this.field432 && this.field495 == 2) {
                this.field606 = true;
            }
            if (this.field606) {
                this.method86(7);
                this.field606 = false;
            }
            if (this.field276 == 2) {
                this.method81((byte) 13);
                this.field349.method394(super.field71, 550, 4, -47890);
            }
            if (this.field290 != -1) {
                this.field372 = true;
            }
            if (this.field372) {
                if (this.field290 != -1 && this.field290 == this.field242) {
                    this.field290 = -1;
                    this.field214.method233(189, 0);
                    this.field214.method234(this.field242);
                }
                this.field372 = false;
                this.field193.method393(1);
                this.field384.method542(0, 272, 0);
                if (this.field262 == -1) {
                    if (this.field362[this.field242] != -1) {
                        if (this.field242 == 0) {
                            this.field560.method542(22, 272, 10);
                        }
                        if (this.field242 == 1) {
                            this.field561.method542(54, 272, 8);
                        }
                        if (this.field242 == 2) {
                            this.field561.method542(82, 272, 8);
                        }
                        if (this.field242 == 3) {
                            this.field562.method542(110, 272, 8);
                        }
                        if (this.field242 == 4) {
                            this.field564.method542(153, 272, 8);
                        }
                        if (this.field242 == 5) {
                            this.field564.method542(181, 272, 8);
                        }
                        if (this.field242 == 6) {
                            this.field563.method542(209, 272, 9);
                        }
                    }
                    if (this.field362[0] != -1 && (this.field290 != 0 || field332 % 20 < 10)) {
                        this.field260[0].method542(29, 272, 13);
                    }
                    if (this.field362[1] != -1 && (this.field290 != 1 || field332 % 20 < 10)) {
                        this.field260[1].method542(53, 272, 11);
                    }
                    if (this.field362[2] != -1 && (this.field290 != 2 || field332 % 20 < 10)) {
                        this.field260[2].method542(82, 272, 11);
                    }
                    if (this.field362[3] != -1 && (this.field290 != 3 || field332 % 20 < 10)) {
                        this.field260[3].method542(115, 272, 12);
                    }
                    if (this.field362[4] != -1 && (this.field290 != 4 || field332 % 20 < 10)) {
                        this.field260[4].method542(153, 272, 13);
                    }
                    if (this.field362[5] != -1 && (this.field290 != 5 || field332 % 20 < 10)) {
                        this.field260[5].method542(180, 272, 11);
                    }
                    if (this.field362[6] != -1 && (this.field290 != 6 || field332 % 20 < 10)) {
                        this.field260[6].method542(208, 272, 13);
                    }
                }
                this.field193.method394(super.field71, 516, 160, -47890);
                this.field192.method393(1);
                this.field383.method542(0, 272, 0);
                if (this.field262 == -1) {
                    if (this.field362[this.field242] != -1) {
                        if (this.field242 == 7) {
                            this.field520.method542(42, 272, 0);
                        }
                        if (this.field242 == 8) {
                            this.field521.method542(74, 272, 0);
                        }
                        if (this.field242 == 9) {
                            this.field521.method542(102, 272, 0);
                        }
                        if (this.field242 == 10) {
                            this.field522.method542(130, 272, 1);
                        }
                        if (this.field242 == 11) {
                            this.field524.method542(173, 272, 0);
                        }
                        if (this.field242 == 12) {
                            this.field524.method542(201, 272, 0);
                        }
                        if (this.field242 == 13) {
                            this.field523.method542(229, 272, 0);
                        }
                    }
                    if (this.field362[8] != -1 && (this.field290 != 8 || field332 % 20 < 10)) {
                        this.field260[7].method542(74, 272, 2);
                    }
                    if (this.field362[9] != -1 && (this.field290 != 9 || field332 % 20 < 10)) {
                        this.field260[8].method542(102, 272, 3);
                    }
                    if (this.field362[10] != -1 && (this.field290 != 10 || field332 % 20 < 10)) {
                        this.field260[9].method542(137, 272, 4);
                    }
                    if (this.field362[11] != -1 && (this.field290 != 11 || field332 % 20 < 10)) {
                        this.field260[10].method542(174, 272, 2);
                    }
                    if (this.field362[12] != -1 && (this.field290 != 12 || field332 % 20 < 10)) {
                        this.field260[11].method542(201, 272, 2);
                    }
                    if (this.field362[13] != -1 && (this.field290 != 13 || field332 % 20 < 10)) {
                        this.field260[12].method542(226, 272, 2);
                    }
                }
                this.field192.method394(super.field71, 496, 466, -47890);
                this.field350.method393(1);
            }
            if (this.field240) {
                this.field240 = false;
                this.field191.method393(1);
                this.field382.method542(0, 272, 0);
                this.field443.method191(55, 28, 16777215, "Public chat", 0, true);
                if (this.field552 == 0) {
                    this.field443.method191(55, 41, 65280, "On", 0, true);
                }
                if (this.field552 == 1) {
                    this.field443.method191(55, 41, 16776960, "Friends", 0, true);
                }
                if (this.field552 == 2) {
                    this.field443.method191(55, 41, 16711680, "Off", 0, true);
                }
                if (this.field552 == 3) {
                    this.field443.method191(55, 41, 65535, "Hide", 0, true);
                }
                this.field443.method191(184, 28, 16777215, "Private chat", 0, true);
                if (this.field380 == 0) {
                    this.field443.method191(184, 41, 65280, "On", 0, true);
                }
                if (this.field380 == 1) {
                    this.field443.method191(184, 41, 16776960, "Friends", 0, true);
                }
                if (this.field380 == 2) {
                    this.field443.method191(184, 41, 16711680, "Off", 0, true);
                }
                this.field443.method191(324, 28, 16777215, "Trade/compete", 0, true);
                if (this.field278 == 0) {
                    this.field443.method191(324, 41, 65280, "On", 0, true);
                }
                if (this.field278 == 1) {
                    this.field443.method191(324, 41, 16776960, "Friends", 0, true);
                }
                if (this.field278 == 2) {
                    this.field443.method191(324, 41, 16711680, "Off", 0, true);
                }
                this.field443.method191(458, 33, 16777215, "Report abuse", 0, true);
                this.field191.method394(super.field71, 0, 453, -47890);
                this.field350.method393(1);
            }
            this.field188 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method149(int arg0) {
        if (arg0 >= 0) {
            this.method19();
        }
        this.field632 = 0;
        for (int var2 = -1; var2 < this.field440 + this.field394; ++var2) {
            class58 var19;
            if (var2 == -1) {
                var19 = field588;
            } else if (var2 < this.field394) {
                var19 = this.field393[this.field395[var2]];
            } else {
                var19 = this.field439[this.field441[var2 - this.field394]];
            }
            if (var19 != null && var19.method404((byte) 4)) {
                if (var19 instanceof class46) {
                    class36 var20 = ((class46) var19).field1140;
                    if (var20.field1039 != null) {
                        var20 = var20.method383(-23798);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field394) {
                    class36 var24 = ((class46) var19).field1140;
                    if (var24.field1020 >= 0 && var24.field1020 < this.field381.length) {
                        this.method72(9, var19.field1482 + 15, var19);
                        if (this.field425 > -1) {
                            this.field381[var24.field1020].method331(this.field425 - 12, 272, this.field426 - 30);
                        }
                    }
                    if (this.field365 == 1 && this.field441[var2 - this.field394] == this.field251 && field332 % 20 < 10) {
                        this.method72(9, var19.field1482 + 15, var19);
                        if (this.field425 > -1) {
                            this.field381[2].method331(this.field425 - 12, 272, this.field426 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class43 var22 = (class43) var19;
                    if (var22.field1106 != 0) {
                        this.method72(9, var19.field1482 + 15, var19);
                        if (this.field425 > -1) {
                            for (int var23 = 0; var23 < 8; ++var23) {
                                if ((var22.field1106 & 1 << var23) != 0) {
                                    this.field381[var23].method331(this.field425 - 12, 272, this.field426 - var21);
                                    var21 -= 25;
                                }
                            }
                        }
                    }
                    if (var2 >= 0 && this.field365 == 10 && this.field395[var2] == this.field514) {
                        this.method72(9, var19.field1482 + 15, var19);
                        if (this.field425 > -1) {
                            this.field381[7].method331(this.field425 - 12, 272, this.field426 - var21);
                        }
                    }
                }
                if (var19.field1503 != null && (var2 >= this.field394 || this.field552 == 0 || this.field552 == 3 || this.field552 == 1 && this.method56(((class43) var19).field1094, false))) {
                    this.method72(9, var19.field1482, var19);
                    if (this.field425 > -1 && this.field632 < this.field633) {
                        this.field637[this.field632] = this.field444.method193(var19.field1503, this.field622) / 2;
                        this.field636[this.field632] = this.field444.field720;
                        this.field634[this.field632] = this.field425;
                        this.field635[this.field632] = this.field426;
                        this.field638[this.field632] = var19.field1487;
                        this.field639[this.field632] = var19.field1504;
                        this.field640[this.field632] = var19.field1483;
                        this.field641[this.field632++] = var19.field1503;
                        if (this.field331 == 0 && var19.field1504 >= 1 && var19.field1504 <= 3) {
                            this.field636[this.field632] += 10;
                            this.field635[this.field632] += 5;
                        }
                        if (this.field331 == 0 && var19.field1504 == 4) {
                            this.field637[this.field632] = 60;
                        }
                        if (this.field331 == 0 && var19.field1504 == 5) {
                            this.field636[this.field632] += 5;
                        }
                    }
                }
                if (var19.field1529 > field332) {
                    this.method72(9, var19.field1482 + 15, var19);
                    if (this.field425 > -1) {
                        int var25 = var19.field1530 * 30 / var19.field1531;
                        if (var25 > 30) {
                            var25 = 30;
                        }
                        class50.method478(var25, this.field425 - 15, 65280, this.field426 - 3, 5, (byte) 1);
                        class50.method478(30 - var25, this.field425 - 15 + var25, 16711680, this.field426 - 3, 5, (byte) 1);
                    }
                }
                for (int var26 = 0; var26 < 4; ++var26) {
                    if (var19.field1499[var26] > field332) {
                        this.method72(9, var19.field1482 / 2, var19);
                        if (this.field425 > -1) {
                            if (var26 == 1) {
                                this.field426 -= 20;
                            }
                            if (var26 == 2) {
                                this.field425 -= 15;
                                this.field426 -= 10;
                            }
                            if (var26 == 3) {
                                this.field425 += 15;
                                this.field426 -= 10;
                            }
                            this.field539[var19.field1498[var26]].method331(this.field425 - 12, 272, this.field426 - 12);
                            this.field442.method190(1, this.field426 + 4, this.field425, String.valueOf(var19.field1497[var26]), 0);
                            this.field442.method190(1, this.field426 + 3, this.field425 - 1, String.valueOf(var19.field1497[var26]), 16777215);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field632; ++var3) {
            int var4 = this.field634[var3];
            int var5 = this.field635[var3];
            int var6 = this.field637[var3];
            int var7 = this.field636[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field635[var18] - this.field636[var18] && var5 - var7 < this.field635[var18] + 2 && var4 - var6 < this.field637[var18] + this.field634[var18] && var4 + var6 > this.field634[var18] - this.field637[var18] && this.field635[var18] - this.field636[var18] < var5) {
                        var5 = this.field635[var18] - this.field636[var18];
                        var8 = true;
                    }
                }
            }
            this.field425 = this.field634[var3];
            this.field426 = this.field635[var3] = var5;
            String var9 = this.field641[var3];
            if (this.field331 == 0) {
                int var10 = 16776960;
                if (this.field638[var3] < 6) {
                    var10 = this.field205[this.field638[var3]];
                }
                if (this.field638[var3] == 6) {
                    var10 = this.field374 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field638[var3] == 7) {
                    var10 = this.field374 % 20 < 10 ? 255 : 65535;
                }
                if (this.field638[var3] == 8) {
                    var10 = this.field374 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field638[var3] == 9) {
                    int var11 = 150 - this.field640[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field638[var3] == 10) {
                    int var12 = 150 - this.field640[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field638[var3] == 11) {
                    int var13 = 150 - this.field640[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field639[var3] == 0) {
                    this.field444.method190(1, this.field426 + 1, this.field425, var9, 0);
                    this.field444.method190(1, this.field426, this.field425, var9, var10);
                }
                if (this.field639[var3] == 1) {
                    this.field444.method195(this.field425, true, var9, this.field426 + 1, 0, this.field374);
                    this.field444.method195(this.field425, true, var9, this.field426, var10, this.field374);
                }
                if (this.field639[var3] == 2) {
                    this.field444.method196(var9, 0, false, this.field374, this.field426 + 1, this.field425);
                    this.field444.method196(var9, var10, false, this.field374, this.field426, this.field425);
                }
                if (this.field639[var3] == 3) {
                    this.field444.method197(150 - this.field640[var3], 0, this.field374, var9, this.field426 + 1, (byte) -26, this.field425);
                    this.field444.method197(150 - this.field640[var3], var10, this.field374, var9, this.field426, (byte) -26, this.field425);
                }
                if (this.field639[var3] == 4) {
                    int var14 = this.field444.method193(var9, this.field622);
                    int var15 = (150 - this.field640[var3]) * (var14 + 100) / 150;
                    class50.method475(455, this.field425 - 50, this.field425 + 50, 334, 0);
                    this.field444.method194((byte) 22, var9, 0, this.field425 + 50 - var15, this.field426 + 1);
                    this.field444.method194((byte) 22, var9, var10, this.field425 + 50 - var15, this.field426);
                    class50.method474(1);
                }
                if (this.field639[var3] == 5) {
                    int var16 = 150 - this.field640[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class50.method475(455, 0, 512, this.field426 + 5, this.field426 - this.field444.field720 - 1);
                    this.field444.method190(1, this.field426 + 1 + var17, this.field425, var9, 0);
                    this.field444.method190(1, this.field426 + var17, this.field425, var9, var10);
                    class50.method474(1);
                }
            } else {
                this.field444.method190(1, this.field426 + 1, this.field425, var9, 0);
                this.field444.method190(1, this.field426, this.field425, var9, 16776960);
            }
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method150(int arg0) {
        if (arg0 != 0) {
            this.field433 = !this.field433;
        }
        if (super.field85 == 1) {
            if (super.field86 >= 6 && super.field86 <= 106 && super.field87 >= 467 && super.field87 <= 499) {
                this.field552 = (this.field552 + 1) % 4;
                this.field240 = true;
                this.field606 = true;
                this.field214.method233(52, 0);
                this.field214.method234(this.field552);
                this.field214.method234(this.field380);
                this.field214.method234(this.field278);
            }
            if (super.field86 >= 135 && super.field86 <= 235 && super.field87 >= 467 && super.field87 <= 499) {
                this.field380 = (this.field380 + 1) % 3;
                this.field240 = true;
                this.field606 = true;
                this.field214.method233(52, 0);
                this.field214.method234(this.field552);
                this.field214.method234(this.field380);
                this.field214.method234(this.field278);
            }
            if (super.field86 >= 273 && super.field86 <= 373 && super.field87 >= 467 && super.field87 <= 499) {
                this.field278 = (this.field278 + 1) % 3;
                this.field240 = true;
                this.field606 = true;
                this.field214.method233(52, 0);
                this.field214.method234(this.field552);
                this.field214.method234(this.field380);
                this.field214.method234(this.field278);
            }
            if (super.field86 >= 412 && super.field86 <= 512 && super.field87 >= 467 && super.field87 <= 499) {
                if (this.field220 == -1) {
                    this.method140(0);
                    this.field500 = "";
                    this.field565 = false;
                    for (int var2 = 0; var2 < class52.field1306.length; ++var2) {
                        if (class52.field1306[var2] != null && class52.field1306[var2].field1350 == 600) {
                            this.field612 = this.field220 = class52.field1306[var2].field1346;
                            return;
                        }
                    }
                    return;
                }
                this.method155(true, "Please close the interface you have open before using 'report abuse'", "", 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (this.field417 == 0 && this.field208 == 0) {
            this.field643[this.field551] = "Walk here";
            this.field473[this.field551] = 610;
            this.field471[this.field551] = super.field79;
            this.field472[this.field551] = super.field80;
            ++this.field551;
        }
        int var2 = -1;
        this.field385 += arg0;
        for (int var3 = 0; var3 < class53.field1440; ++var3) {
            int var4 = class53.field1441[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field206.method441(this.field581, var5, var6, var4) >= 0) {
                    class48 var9 = class48.method472(var8);
                    if (var9.field1232 != null) {
                        var9 = var9.method468(841);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field417 == 1) {
                        this.field643[this.field551] = "Use " + this.field421 + " with @cya@" + var9.field1247;
                        this.field473[this.field551] = 262;
                        this.field474[this.field551] = var4;
                        this.field471[this.field551] = var5;
                        this.field472[this.field551] = var6;
                        ++this.field551;
                    } else if (this.field208 == 1) {
                        if ((this.field210 & 4) == 4) {
                            this.field643[this.field551] = this.field211 + " @cya@" + var9.field1247;
                            this.field473[this.field551] = 16;
                            this.field474[this.field551] = var4;
                            this.field471[this.field551] = var5;
                            this.field472[this.field551] = var6;
                            ++this.field551;
                        }
                    } else {
                        if (var9.field1237 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field1237[var10] != null) {
                                    this.field643[this.field551] = var9.field1237[var10] + " @cya@" + var9.field1247;
                                    if (var10 == 0) {
                                        this.field473[this.field551] = 237;
                                    }
                                    if (var10 == 1) {
                                        this.field473[this.field551] = 111;
                                    }
                                    if (var10 == 2) {
                                        this.field473[this.field551] = 686;
                                    }
                                    if (var10 == 3) {
                                        this.field473[this.field551] = 391;
                                    }
                                    if (var10 == 4) {
                                        this.field473[this.field551] = 1938;
                                    }
                                    this.field474[this.field551] = var4;
                                    this.field471[this.field551] = var5;
                                    this.field472[this.field551] = var6;
                                    ++this.field551;
                                }
                            }
                        }
                        this.field643[this.field551] = "Examine @cya@" + var9.field1247;
                        this.field473[this.field551] = 1714;
                        this.field474[this.field551] = var9.field1228 << 14;
                        this.field471[this.field551] = var5;
                        this.field472[this.field551] = var6;
                        ++this.field551;
                    }
                }
                if (var7 == 1) {
                    class46 var11 = this.field439[var8];
                    if (var11.field1140.field1037 == 1 && (var11.field1506 & 127) == 64 && (var11.field1507 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field440; ++var12) {
                            class46 var15 = this.field439[this.field441[var12]];
                            if (var15 != null && var11 != var15 && var15.field1140.field1037 == 1 && var11.field1506 == var15.field1506 && var11.field1507 == var15.field1507) {
                                this.method162(true, this.field441[var12], var5, var6, var15.field1140);
                            }
                        }
                        for (int var13 = 0; var13 < this.field394; ++var13) {
                            class43 var14 = this.field393[this.field395[var13]];
                            if (var14 != null && var11.field1506 == var14.field1506 && var11.field1507 == var14.field1507) {
                                this.method111((byte) 0, var6, this.field395[var13], var14, var5);
                            }
                        }
                    }
                    this.method162(true, var8, var5, var6, var11.field1140);
                }
                if (var7 == 0) {
                    class43 var16 = this.field393[var8];
                    if ((var16.field1506 & 127) == 64 && (var16.field1507 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field440; ++var17) {
                            class46 var20 = this.field439[this.field441[var17]];
                            if (var20 != null && var20.field1140.field1037 == 1 && var16.field1506 == var20.field1506 && var16.field1507 == var20.field1507) {
                                this.method162(true, this.field441[var17], var5, var6, var20.field1140);
                            }
                        }
                        for (int var18 = 0; var18 < this.field394; ++var18) {
                            class43 var19 = this.field393[this.field395[var18]];
                            if (var19 != null && var16 != var19 && var16.field1506 == var19.field1506 && var16.field1507 == var19.field1507) {
                                this.method111((byte) 0, var6, this.field395[var18], var19, var5);
                            }
                        }
                    }
                    this.method111((byte) 0, var6, var8, var16, var5);
                }
                if (var7 == 3) {
                    class54 var21 = this.field553[this.field581][var5][var6];
                    if (var21 != null) {
                        for (class39 var22 = (class39) var21.method529(22498); var22 != null; var22 = (class39) var21.method531(280)) {
                            class2 var23 = class2.method4(var22.field1070);
                            if (this.field417 == 1) {
                                this.field643[this.field551] = "Use " + this.field421 + " with @lre@" + var23.field37;
                                this.field473[this.field551] = 992;
                                this.field474[this.field551] = var22.field1070;
                                this.field471[this.field551] = var5;
                                this.field472[this.field551] = var6;
                                ++this.field551;
                            } else if (this.field208 == 1) {
                                if ((this.field210 & 1) == 1) {
                                    this.field643[this.field551] = this.field211 + " @lre@" + var23.field37;
                                    this.field473[this.field551] = 516;
                                    this.field474[this.field551] = var22.field1070;
                                    this.field471[this.field551] = var5;
                                    this.field472[this.field551] = var6;
                                    ++this.field551;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field22 != null && var23.field22[var24] != null) {
                                        this.field643[this.field551] = var23.field22[var24] + " @lre@" + var23.field37;
                                        if (var24 == 0) {
                                            this.field473[this.field551] = 750;
                                        }
                                        if (var24 == 1) {
                                            this.field473[this.field551] = 12;
                                        }
                                        if (var24 == 2) {
                                            this.field473[this.field551] = 321;
                                        }
                                        if (var24 == 3) {
                                            this.field473[this.field551] = 247;
                                        }
                                        if (var24 == 4) {
                                            this.field473[this.field551] = 801;
                                        }
                                        this.field474[this.field551] = var22.field1070;
                                        this.field471[this.field551] = var5;
                                        this.field472[this.field551] = var6;
                                        ++this.field551;
                                    } else if (var24 == 2) {
                                        this.field643[this.field551] = "Take @lre@" + var23.field37;
                                        this.field473[this.field551] = 321;
                                        this.field474[this.field551] = var22.field1070;
                                        this.field471[this.field551] = var5;
                                        this.field472[this.field551] = var6;
                                        ++this.field551;
                                    }
                                }
                                this.field643[this.field551] = "Examine @lre@" + var23.field37;
                                this.field473[this.field551] = 1297;
                                this.field474[this.field551] = var22.field1070;
                                this.field471[this.field551] = var5;
                                this.field472[this.field551] = var6;
                                ++this.field551;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(Z)V")
    public final void method152(boolean arg0) {
        this.field480 = 0;
        int var2 = (field588.field1506 >> 7) + this.field368;
        int var3 = (field588.field1507 >> 7) + this.field369;
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field480 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field480 = 1;
        }
        if (this.field480 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field480 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LGLMIQHJI;IILPASMQFXV;B)V")
    private final void method153(class21 arg0, int arg1, int arg2, class43 arg3, byte arg4) {
        if (this.field515 != arg4) {
            this.field386 = arg0.method244();
        }
        if ((arg1 & 512) != 0) {
            int var6 = arg0.method265(535);
            int var7 = arg0.method264(3);
            arg3.method547(var7, field332, 500, var6);
            arg3.field1529 = field332 + 300;
            arg3.field1530 = arg0.method264(3);
            arg3.field1531 = arg0.method264(3);
        }
        if ((arg1 & 16) != 0) {
            int var8 = arg0.method263(0);
            byte[] var9 = new byte[var8];
            class21 var10 = new class21(var9, -49015);
            arg0.method253(var9, true, 0, var8);
            this.field398[arg2] = var10;
            arg3.method405(0, var10);
        }
        if ((arg1 & 2) != 0) {
            arg3.field1503 = arg0.method251();
            if (arg3.field1503.charAt(0) == '~') {
                arg3.field1503 = arg3.field1503.substring(1);
                this.method155(true, arg3.field1503, arg3.field1094, 2);
            } else if (field588 == arg3) {
                this.method155(true, arg3.field1503, arg3.field1094, 2);
            }
            arg3.field1487 = 0;
            arg3.field1504 = 0;
            arg3.field1483 = 150;
        }
        if ((arg1 & 256) != 0) {
            arg3.field1509 = arg0.method265(535);
            arg3.field1511 = arg0.method264(3);
            arg3.field1510 = arg0.method264(3);
            arg3.field1512 = arg0.method244();
            arg3.field1513 = arg0.method246() + field332;
            arg3.field1514 = arg0.method274((byte) -81) + field332;
            arg3.field1515 = arg0.method265(535);
            arg3.method545(true);
        }
        if ((arg1 & 1024) != 0) {
            arg3.field1490 = arg0.method273(this.field207);
            int var11 = arg0.method249();
            arg3.field1494 = var11 >> 16;
            arg3.field1493 = (var11 & 65535) + field332;
            arg3.field1491 = 0;
            arg3.field1492 = 0;
            if (arg3.field1493 > field332) {
                arg3.field1491 = -1;
            }
            if (arg3.field1490 == 65535) {
                arg3.field1490 = -1;
            }
        }
        if ((arg1 & 32) != 0) {
            int var12 = arg0.method265(535);
            int var13 = arg0.method244();
            arg3.method547(var13, field332, 500, var12);
            arg3.field1529 = field332 + 300;
            arg3.field1530 = arg0.method263(0);
            arg3.field1531 = arg0.method265(535);
        }
        if ((arg1 & 4) != 0) {
            arg3.field1486 = arg0.method272((byte) -116);
            if (arg3.field1486 == 65535) {
                arg3.field1486 = -1;
            }
        }
        if ((arg1 & 128) != 0) {
            arg3.field1480 = arg0.method272((byte) -116);
            arg3.field1481 = arg0.method273(this.field207);
        }
        if ((arg1 & 64) != 0) {
            int var14 = arg0.method272((byte) -116);
            int var15 = arg0.method265(535);
            int var16 = arg0.method264(3);
            int var17 = arg0.field818;
            if (arg3.field1094 != null && arg3.field1105) {
                long var18 = class70.method583(arg3.field1094);
                boolean var20 = false;
                if (var15 <= 1) {
                    for (int var21 = 0; var21 < this.field194; ++var21) {
                        if (this.field330[var21] == var18) {
                            var20 = true;
                            break;
                        }
                    }
                }
                if (!var20 && this.field480 == 0) {
                    try {
                        this.field438.field818 = 0;
                        arg0.method280((byte) 5, this.field438.field817, var16, 0);
                        this.field438.field818 = 0;
                        String var22 = class32.method343(this.field438, var16, 0);
                        String var23 = class25.method298(var22, this.field377);
                        arg3.field1503 = var23;
                        arg3.field1487 = var14 >> 8;
                        arg3.field1504 = var14 & 255;
                        arg3.field1483 = 150;
                        if (var15 != 2 && var15 != 3) {
                            if (var15 == 1) {
                                this.method155(true, var23, "@cr1@" + arg3.field1094, 1);
                            } else {
                                this.method155(true, var23, arg3.field1094, 2);
                            }
                        } else {
                            this.method155(true, var23, "@cr2@" + arg3.field1094, 1);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg0.field818 = var16 + var17;
        }
        if ((arg1 & 8) != 0) {
            int var25 = arg0.method274((byte) -81);
            if (var25 == 65535) {
                var25 = -1;
            }
            int var26 = arg0.method244();
            if (arg3.field1524 == var25 && var25 != -1) {
                int var27 = class59.field1538[var25].field1552;
                if (var27 == 1) {
                    arg3.field1525 = 0;
                    arg3.field1526 = 0;
                    arg3.field1527 = var26;
                    arg3.field1528 = 0;
                }
                if (var27 == 2) {
                    arg3.field1528 = 0;
                    return;
                }
            } else if (var25 == -1 || arg3.field1524 == -1 || class59.field1538[var25].field1546 >= class59.field1538[arg3.field1524].field1546) {
                arg3.field1524 = var25;
                arg3.field1525 = 0;
                arg3.field1526 = 0;
                arg3.field1527 = var26;
                arg3.field1528 = 0;
                arg3.field1505 = arg3.field1489;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JI)V")
    public final void method154(long arg0, int arg1) {
        this.field385 += arg1;
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field194; ++var4) {
                if (this.field330[var4] == arg0) {
                    --this.field194;
                    this.field447 = true;
                    for (int var5 = var4; var5 < this.field194; ++var5) {
                        this.field330[var5] = this.field330[var5 + 1];
                    }
                    this.field214.method233(173, 0);
                    this.field214.method240(arg0, 7);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLjava/lang/String;Ljava/lang/String;I)V")
    public final void method155(boolean arg0, String arg1, String arg2, int arg3) {
        if (arg0) {
            if (arg3 == 0 && this.field543 != -1) {
                this.field223 = arg1;
                super.field85 = 0;
            }
            if (this.field582 == -1) {
                this.field606 = true;
            }
            for (int var5 = 99; var5 > 0; --var5) {
                this.field270[var5] = this.field270[var5 - 1];
                this.field271[var5] = this.field271[var5 - 1];
                this.field272[var5] = this.field272[var5 - 1];
            }
            this.field270[0] = arg3;
            this.field271[0] = arg2;
            this.field272[0] = arg1;
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method156(int arg0) {
        if (this.field493 != arg0) {
            field610 = !field610;
        }
        if (super.field85 == 1) {
            if (super.field86 >= 539 && super.field86 <= 573 && super.field87 >= 169 && super.field87 < 205 && this.field362[0] != -1) {
                this.field447 = true;
                this.field242 = 0;
                this.field372 = true;
            }
            if (super.field86 >= 569 && super.field86 <= 599 && super.field87 >= 168 && super.field87 < 205 && this.field362[1] != -1) {
                this.field447 = true;
                this.field242 = 1;
                this.field372 = true;
            }
            if (super.field86 >= 597 && super.field86 <= 627 && super.field87 >= 168 && super.field87 < 205 && this.field362[2] != -1) {
                this.field447 = true;
                this.field242 = 2;
                this.field372 = true;
            }
            if (super.field86 >= 625 && super.field86 <= 669 && super.field87 >= 168 && super.field87 < 203 && this.field362[3] != -1) {
                this.field447 = true;
                this.field242 = 3;
                this.field372 = true;
            }
            if (super.field86 >= 666 && super.field86 <= 696 && super.field87 >= 168 && super.field87 < 205 && this.field362[4] != -1) {
                this.field447 = true;
                this.field242 = 4;
                this.field372 = true;
            }
            if (super.field86 >= 694 && super.field86 <= 724 && super.field87 >= 168 && super.field87 < 205 && this.field362[5] != -1) {
                this.field447 = true;
                this.field242 = 5;
                this.field372 = true;
            }
            if (super.field86 >= 722 && super.field86 <= 756 && super.field87 >= 169 && super.field87 < 205 && this.field362[6] != -1) {
                this.field447 = true;
                this.field242 = 6;
                this.field372 = true;
            }
            if (super.field86 >= 540 && super.field86 <= 574 && super.field87 >= 466 && super.field87 < 502 && this.field362[7] != -1) {
                this.field447 = true;
                this.field242 = 7;
                this.field372 = true;
            }
            if (super.field86 >= 572 && super.field86 <= 602 && super.field87 >= 466 && super.field87 < 503 && this.field362[8] != -1) {
                this.field447 = true;
                this.field242 = 8;
                this.field372 = true;
            }
            if (super.field86 >= 599 && super.field86 <= 629 && super.field87 >= 466 && super.field87 < 503 && this.field362[9] != -1) {
                this.field447 = true;
                this.field242 = 9;
                this.field372 = true;
            }
            if (super.field86 >= 627 && super.field86 <= 671 && super.field87 >= 467 && super.field87 < 502 && this.field362[10] != -1) {
                this.field447 = true;
                this.field242 = 10;
                this.field372 = true;
            }
            if (super.field86 >= 669 && super.field86 <= 699 && super.field87 >= 466 && super.field87 < 503 && this.field362[11] != -1) {
                this.field447 = true;
                this.field242 = 11;
                this.field372 = true;
            }
            if (super.field86 >= 696 && super.field86 <= 726 && super.field87 >= 466 && super.field87 < 503 && this.field362[12] != -1) {
                this.field447 = true;
                this.field242 = 12;
                this.field372 = true;
            }
            if (super.field86 >= 724 && super.field86 <= 758 && super.field87 >= 466 && super.field87 < 502 && this.field362[13] != -1) {
                this.field447 = true;
                this.field242 = 13;
                this.field372 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)LXRWUKRPO;")
    public final class65 method157(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field594[0] != null) {
                var7 = this.field594[0].method533((byte) 8, arg3);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field218.reset();
            this.field218.update(var7);
            int var9 = (int) this.field218.getValue();
            if (arg4 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class65(-31558, var7);
        } else {
            int var11 = 0;
            this.field385 += arg2;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method26((byte) 62, arg5, "Requesting " + arg1);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method120(arg0 + arg4);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class21 var17 = new class21(var16, -49015);
                    var17.field818 = 3;
                    int var18 = var17.method248() + 6;
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
                            this.method26((byte) 62, arg5, "Loading " + arg1 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field594[0] != null) {
                            this.field594[0].method534(var7.length, (byte) -124, var7, arg3);
                        }
                    } catch (Exception var29) {
                        this.field594[0] = null;
                    }
                    if (var7 != null) {
                        this.field218.reset();
                        this.field218.update(var7);
                        int var24 = (int) this.field218.getValue();
                        if (arg4 != var24) {
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
                            this.method26((byte) 62, arg5, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method26((byte) 62, arg5, var12 + " - Retrying in " + var26);
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
                    this.field185 = !this.field185;
                }
            }
            return new class65(-31558, var7);
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)Ljava/lang/String;")
    public final String method158(int arg0, int arg1) {
        if (arg0 != 0) {
            this.field386 = this.field269.method244();
        }
        return arg1 < 999999999 ? String.valueOf(arg1) : "*";
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(Z)V")
    public final void method159(boolean arg0) {
        int var2 = this.field444.method192("Choose Option", -989);
        if (!arg0) {
            for (int var3 = 0; var3 < this.field551; ++var3) {
                int var11 = this.field444.method192(this.field643[var3], -989);
                if (var11 > var2) {
                    var2 = var11;
                }
            }
            var2 += 8;
            int var4 = this.field551 * 15 + 21;
            if (super.field86 > 4 && super.field87 > 4 && super.field86 < 516 && super.field87 < 338) {
                int var5 = super.field86 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field87 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field432 = true;
                this.field495 = 0;
                this.field496 = var5;
                this.field497 = var6;
                this.field498 = var2;
                this.field499 = this.field551 * 15 + 22;
            }
            if (super.field86 > 553 && super.field87 > 205 && super.field86 < 743 && super.field87 < 466) {
                int var7 = super.field86 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field87 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field432 = true;
                this.field495 = 1;
                this.field496 = var7;
                this.field497 = var8;
                this.field498 = var2;
                this.field499 = this.field551 * 15 + 22;
            }
            if (super.field86 > 17 && super.field87 > 357 && super.field86 < 496 && super.field87 < 453) {
                int var9 = super.field86 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field87 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field432 = true;
                this.field495 = 2;
                this.field496 = var9;
                this.field497 = var10;
                this.field498 = var2;
                this.field499 = this.field551 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method160(byte arg0) {
        if (this.field288 != 0) {
            class11 var2 = this.field443;
            if (arg0 == 5) {
                boolean var3 = false;
            } else {
                this.field558 = 384;
            }
            int var4 = 0;
            if (this.field466 != 0) {
                var4 = 1;
            }
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field272[var5] != null) {
                    int var6 = this.field270[var5];
                    String var7 = this.field271[var5];
                    byte var8 = 0;
                    if (var7 != null && var7.startsWith("@cr1@")) {
                        var7 = var7.substring(5);
                        var8 = 1;
                    }
                    if (var7 != null && var7.startsWith("@cr2@")) {
                        var7 = var7.substring(5);
                        var8 = 2;
                    }
                    if ((var6 == 3 || var6 == 7) && (var6 == 7 || this.field380 == 0 || this.field380 == 1 && this.method56(var7, false))) {
                        int var9 = 329 - var4 * 13;
                        byte var10 = 4;
                        var2.method194((byte) 22, "From", 0, var10, var9);
                        var2.method194((byte) 22, "From", 65535, var10, var9 - 1);
                        int var11 = var10 + var2.method192("From ", -989);
                        if (var8 == 1) {
                            this.field456[0].method542(var11, 272, var9 - 12);
                            var11 += 14;
                        }
                        if (var8 == 2) {
                            this.field456[1].method542(var11, 272, var9 - 12);
                            var11 += 14;
                        }
                        var2.method194((byte) 22, var7 + ": " + this.field272[var5], 0, var11, var9);
                        var2.method194((byte) 22, var7 + ": " + this.field272[var5], 65535, var11, var9 - 1);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 5 && this.field380 < 2) {
                        int var12 = 329 - var4 * 13;
                        var2.method194((byte) 22, this.field272[var5], 0, 4, var12);
                        var2.method194((byte) 22, this.field272[var5], 65535, 4, var12 - 1);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                    if (var6 == 6 && this.field380 < 2) {
                        int var13 = 329 - var4 * 13;
                        var2.method194((byte) 22, "To " + var7 + ": " + this.field272[var5], 0, 4, var13);
                        var2.method194((byte) 22, "To " + var7 + ": " + this.field272[var5], 65535, 4, var13 - 1);
                        ++var4;
                        if (var4 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method161(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg7 != -23974) {
            this.method19();
        }
        if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
            if (field233 && this.field581 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg2 == 0) {
                var9 = this.field206.method437(arg4, arg3, arg6);
            }
            if (arg2 == 1) {
                var9 = this.field206.method438(arg3, 6, arg6, arg4);
            }
            if (arg2 == 2) {
                var9 = this.field206.method439(arg4, arg3, arg6);
            }
            if (arg2 == 3) {
                var9 = this.field206.method440(arg4, arg3, arg6);
            }
            if (var9 != 0) {
                int var13 = this.field206.method441(arg4, arg3, arg6, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg2 == 0) {
                    this.field206.method428(arg6, -395, arg4, arg3);
                    class48 var17 = class48.method472(var14);
                    if (var17.field1236) {
                        this.field453[arg4].method210(arg3, var16, var17.field1243, arg6, true, var15);
                    }
                }
                if (arg2 == 1) {
                    this.field206.method429(arg4, arg6, 0, arg3);
                }
                if (arg2 == 2) {
                    this.field206.method430(arg6, arg4, arg3, (byte) 50);
                    class48 var18 = class48.method472(var14);
                    if (var18.field1262 + arg3 > 103 || var18.field1262 + arg6 > 103 || var18.field1230 + arg3 > 103 || var18.field1230 + arg6 > 103) {
                        return;
                    }
                    if (var18.field1236) {
                        this.field453[arg4].method211(arg3, -677, var16, var18.field1243, var18.field1230, var18.field1262, arg6);
                    }
                }
                if (arg2 == 3) {
                    this.field206.method431(arg3, arg4, arg6, false);
                    class48 var19 = class48.method472(var14);
                    if (var19.field1236 && var19.field1212) {
                        this.field453[arg4].method213(arg3, true, arg6);
                    }
                }
            }
            if (arg5 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field410[1][arg3][arg6] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                class63.method567(arg1, arg4, this.field285, 2, arg5, this.field206, var20, arg3, arg0, this.field453[arg4], arg6);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZIIILLPTCUHOU;)V")
    public final void method162(boolean arg0, int arg1, int arg2, int arg3, class36 arg4) {
        this.field454 &= arg0;
        if (this.field551 < 400) {
            if (arg4.field1039 != null) {
                arg4 = arg4.method383(-23798);
            }
            if (arg4 != null) {
                String var6 = arg4.field1014;
                if (arg4.field1015 != 0) {
                    var6 = var6 + method98(this.field314, arg4.field1015, field588.field1121) + " (level-" + arg4.field1015 + ")";
                }
                if (this.field417 == 1) {
                    this.field643[this.field551] = "Use " + this.field421 + " with @yel@" + var6;
                    this.field473[this.field551] = 818;
                    this.field474[this.field551] = arg1;
                    this.field471[this.field551] = arg2;
                    this.field472[this.field551] = arg3;
                    ++this.field551;
                } else {
                    if (this.field208 == 1) {
                        if ((this.field210 & 2) == 2) {
                            this.field643[this.field551] = this.field211 + " @yel@" + var6;
                            this.field473[this.field551] = 873;
                            this.field474[this.field551] = arg1;
                            this.field471[this.field551] = arg2;
                            this.field472[this.field551] = arg3;
                            ++this.field551;
                            return;
                        }
                    } else {
                        if (arg4.field1042 != null) {
                            for (int var7 = 4; var7 >= 0; --var7) {
                                if (arg4.field1042[var7] != null && !arg4.field1042[var7].equalsIgnoreCase("attack")) {
                                    this.field643[this.field551] = arg4.field1042[var7] + " @yel@" + var6;
                                    if (var7 == 0) {
                                        this.field473[this.field551] = 331;
                                    }
                                    if (var7 == 1) {
                                        this.field473[this.field551] = 41;
                                    }
                                    if (var7 == 2) {
                                        this.field473[this.field551] = 677;
                                    }
                                    if (var7 == 3) {
                                        this.field473[this.field551] = 30;
                                    }
                                    if (var7 == 4) {
                                        this.field473[this.field551] = 337;
                                    }
                                    this.field474[this.field551] = arg1;
                                    this.field471[this.field551] = arg2;
                                    this.field472[this.field551] = arg3;
                                    ++this.field551;
                                }
                            }
                        }
                        if (arg4.field1042 != null) {
                            for (int var8 = 4; var8 >= 0; --var8) {
                                if (arg4.field1042[var8] != null && arg4.field1042[var8].equalsIgnoreCase("attack")) {
                                    short var9 = 0;
                                    if (arg4.field1015 > field588.field1121) {
                                        var9 = 2000;
                                    }
                                    this.field643[this.field551] = arg4.field1042[var8] + " @yel@" + var6;
                                    if (var8 == 0) {
                                        this.field473[this.field551] = var9 + 331;
                                    }
                                    if (var8 == 1) {
                                        this.field473[this.field551] = var9 + 41;
                                    }
                                    if (var8 == 2) {
                                        this.field473[this.field551] = var9 + 677;
                                    }
                                    if (var8 == 3) {
                                        this.field473[this.field551] = var9 + 30;
                                    }
                                    if (var8 == 4) {
                                        this.field473[this.field551] = var9 + 337;
                                    }
                                    this.field474[this.field551] = arg1;
                                    this.field471[this.field551] = arg2;
                                    this.field472[this.field551] = arg3;
                                    ++this.field551;
                                }
                            }
                        }
                        this.field643[this.field551] = "Examine @yel@" + var6;
                        this.field473[this.field551] = 1101;
                        this.field474[this.field551] = arg1;
                        this.field471[this.field551] = arg2;
                        this.field472[this.field551] = arg3;
                        ++this.field551;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(JI)V")
    public final void method163(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field194 >= 100) {
                this.method155(true, "Your ignore list is full. Max of 100 hit", "", 0);
            } else {
                String var4 = class70.method587(class70.method584(arg0, 803), true);
                for (int var5 = 0; var5 < this.field194; ++var5) {
                    if (this.field330[var5] == arg0) {
                        this.method155(true, var4 + " is already on your ignore list", "", 0);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field183; ++var6) {
                    if (this.field550[var6] == arg0) {
                        this.method155(true, "Please remove " + var4 + " from your friend list first", "", 0);
                        return;
                    }
                }
                this.field330[this.field194++] = arg0;
                this.field447 = true;
                this.field214.method233(38, 0);
                if (arg1 != 7) {
                    this.field221 = -337;
                }
                this.field214.method240(arg0, 7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LUSEDZXXV;IIII)V")
    public final void method164(class52 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field1327 == 0 && arg0.field1325 != null) {
            if (!arg0.field1313 || this.field239 == arg0.field1358 || this.field283 == arg0.field1358 || this.field484 == arg0.field1358) {
                int var6 = class50.field1283;
                int var7 = class50.field1281;
                int var8 = class50.field1284;
                int var9 = class50.field1282;
                class50.method475(455, arg4, arg0.field1351 + arg4, arg0.field1345 + arg1, arg1);
                int var10 = arg0.field1325.length;
                if (arg3 <= 0) {
                    this.field553 = null;
                }
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg0.field1362[var11] + arg4;
                    int var13 = arg0.field1339[var11] + arg1 - arg2;
                    class52 var14 = class52.field1306[arg0.field1325[var11]];
                    int var15 = var14.field1310 + var12;
                    int var16 = var14.field1335 + var13;
                    if (var14.field1350 > 0) {
                        this.method59((byte) 4, var14);
                    }
                    if (var14.field1327 == 0) {
                        if (var14.field1354 > var14.field1317 - var14.field1345) {
                            var14.field1354 = var14.field1317 - var14.field1345;
                        }
                        if (var14.field1354 < 0) {
                            var14.field1354 = 0;
                        }
                        this.method164(var14, var16, var14.field1354, 851, var15);
                        if (var14.field1317 > var14.field1345) {
                            this.method101(var14.field1317, var14.field1354, 19571, var14.field1345, var14.field1351 + var15, var16);
                        }
                    } else if (var14.field1327 != 1) {
                        if (var14.field1327 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1345; ++var18) {
                                for (int var19 = 0; var19 < var14.field1351; ++var19) {
                                    int var20 = (var14.field1314 + 32) * var19 + var15;
                                    int var21 = (var14.field1308 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1360[var17];
                                        var21 += var14.field1301[var17];
                                    }
                                    if (var14.field1348[var17] <= 0) {
                                        if (var14.field1337 != null && var17 < 20) {
                                            class26 var30 = var14.field1337[var17];
                                            if (var30 != null) {
                                                var30.method331(var20, 272, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1348[var17] - 1;
                                        if (var20 > class50.field1283 - 32 && var20 < class50.field1284 && var21 > class50.field1281 - 32 && var21 < class50.field1282 || this.field602 != 0 && this.field601 == var17) {
                                            int var25 = 0;
                                            if (this.field417 == 1 && this.field418 == var17 && this.field419 == var14.field1358) {
                                                var25 = 16777215;
                                            }
                                            class26 var26 = class2.method5((byte) -18, var25, var24, var14.field1363[var17]);
                                            if (var26 != null) {
                                                if (this.field602 != 0 && this.field601 == var17 && this.field600 == var14.field1358) {
                                                    var22 = super.field79 - this.field603;
                                                    var23 = super.field80 - this.field604;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field263 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method333(128, var20 + var22, true, var21 + var23);
                                                    if (var21 + var23 < class50.field1281 && arg0.field1354 > 0) {
                                                        int var27 = (class50.field1281 - var21 - var23) * this.field188 / 3;
                                                        if (var27 > this.field188 * 10) {
                                                            var27 = this.field188 * 10;
                                                        }
                                                        if (var27 > arg0.field1354) {
                                                            var27 = arg0.field1354;
                                                        }
                                                        arg0.field1354 -= var27;
                                                        this.field604 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class50.field1282 && arg0.field1354 < arg0.field1317 - arg0.field1345) {
                                                        int var28 = (var21 + var23 + 32 - class50.field1282) * this.field188 / 3;
                                                        if (var28 > this.field188 * 10) {
                                                            var28 = this.field188 * 10;
                                                        }
                                                        if (var28 > arg0.field1317 - arg0.field1345 - arg0.field1354) {
                                                            var28 = arg0.field1317 - arg0.field1345 - arg0.field1354;
                                                        }
                                                        arg0.field1354 += var28;
                                                        this.field604 -= var28;
                                                    }
                                                } else if (this.field328 != 0 && this.field327 == var17 && this.field326 == var14.field1358) {
                                                    var26.method333(128, var20, true, var21);
                                                } else {
                                                    var26.method331(var20, 272, var21);
                                                }
                                                if (var26.field899 == 33 || var14.field1363[var17] != 1) {
                                                    int var29 = var14.field1363[var17];
                                                    this.field442.method194((byte) 22, method75(var29, 0), 0, var20 + 1 + var22, var21 + 10 + var23);
                                                    this.field442.method194((byte) 22, method75(var29, 0), 16776960, var20 + var22, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1327 == 3) {
                            boolean var31 = false;
                            if (this.field484 == var14.field1358 || this.field283 == var14.field1358 || this.field239 == var14.field1358) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method82(this.field197, var14)) {
                                var32 = var14.field1323;
                                if (var31 && var14.field1333 != 0) {
                                    var32 = var14.field1333;
                                }
                            } else {
                                var32 = var14.field1330;
                                if (var31 && var14.field1365 != 0) {
                                    var32 = var14.field1365;
                                }
                            }
                            if (var14.field1364 == 0) {
                                if (var14.field1329) {
                                    class50.method478(var14.field1351, var15, var32, var16, var14.field1345, (byte) 1);
                                } else {
                                    class50.method479(var32, var14.field1345, var14.field1351, var16, 4, var15);
                                }
                            } else if (var14.field1329) {
                                class50.method477(var32, var15, var14.field1351, -71, var16, 256 - (var14.field1364 & 255), var14.field1345);
                            } else {
                                class50.method480(var14.field1351, 256 - (var14.field1364 & 255), var15, false, var32, var16, var14.field1345);
                            }
                        } else if (var14.field1327 == 4) {
                            class11 var33 = var14.field1315;
                            String var34 = var14.field1361;
                            boolean var35 = false;
                            if (this.field484 == var14.field1358 || this.field283 == var14.field1358 || this.field239 == var14.field1358) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method82(this.field197, var14)) {
                                var36 = var14.field1323;
                                if (var35 && var14.field1333 != 0) {
                                    var36 = var14.field1333;
                                }
                                if (var14.field1324.length() > 0) {
                                    var34 = var14.field1324;
                                }
                            } else {
                                var36 = var14.field1330;
                                if (var35 && var14.field1365 != 0) {
                                    var36 = var14.field1365;
                                }
                            }
                            if (var14.field1340 == 6 && this.field611) {
                                var34 = "Please wait...";
                                var36 = var14.field1330;
                            }
                            if (class50.field1279 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field720 + var16;
                            while (var34.length() > 0) {
                                if (var34.indexOf("%") != -1) {
                                    label350: while (true) {
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
                                                                            break label350;
                                                                        }
                                                                        var34 = var34.substring(0, var42) + this.method158(0, this.method108(4, var14, (byte) 63)) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method158(0, this.method108(3, var14, (byte) 63)) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method158(0, this.method108(2, var14, (byte) 63)) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method158(0, this.method108(1, var14, (byte) 63)) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method158(0, this.method108(0, var14, (byte) 63)) + var34.substring(var38 + 2);
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
                                if (var14.field1336) {
                                    var33.method191(var14.field1351 / 2 + var15, var37, var36, var44, 0, var14.field1326);
                                } else {
                                    var33.method198(var44, var37, true, var14.field1326, var15, var36);
                                }
                                var37 += var33.field720;
                            }
                        } else if (var14.field1327 == 5) {
                            class26 var45;
                            if (this.method82(this.field197, var14)) {
                                var45 = var14.field1344;
                            } else {
                                var45 = var14.field1319;
                            }
                            if (var45 != null) {
                                var45.method331(var15, 272, var16);
                            }
                        } else if (var14.field1327 == 6) {
                            int var46 = class9.field671;
                            int var47 = class9.field672;
                            class9.field671 = var14.field1351 / 2 + var15;
                            class9.field672 = var14.field1345 / 2 + var16;
                            int var48 = class9.field675[var14.field1304] * var14.field1303 >> 16;
                            int var49 = class9.field676[var14.field1304] * var14.field1303 >> 16;
                            boolean var50 = this.method82(this.field197, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1343;
                            } else {
                                var51 = var14.field1342;
                            }
                            class53 var52;
                            if (var51 == -1) {
                                var52 = var14.method494(var50, -1, 14442, -1);
                            } else {
                                class59 var53 = class59.field1538[var51];
                                var52 = var14.method494(var50, var53.field1541[var14.field1318], 14442, var53.field1540[var14.field1318]);
                            }
                            if (var52 != null) {
                                var52.method520(0, var14.field1305, 0, var14.field1304, 0, var48, var49);
                            }
                            class9.field671 = var46;
                            class9.field672 = var47;
                        } else if (var14.field1327 == 7) {
                            class11 var54 = var14.field1315;
                            int var55 = 0;
                            for (int var56 = 0; var56 < var14.field1345; ++var56) {
                                for (int var57 = 0; var57 < var14.field1351; ++var57) {
                                    if (var14.field1348[var55] > 0) {
                                        class2 var58 = class2.method4(var14.field1348[var55] - 1);
                                        String var59 = var58.field37;
                                        if (var58.field31 || var14.field1363[var55] != 1) {
                                            var59 = var59 + " x" + method130(var14.field1363[var55], 990);
                                        }
                                        int var60 = (var14.field1314 + 115) * var57 + var15;
                                        int var61 = (var14.field1308 + 12) * var56 + var16;
                                        if (var14.field1336) {
                                            var54.method191(var14.field1351 / 2 + var60, var61, var14.field1330, var59, 0, var14.field1326);
                                        } else {
                                            var54.method198(var59, var61, true, var14.field1326, var60, var14.field1330);
                                        }
                                    }
                                    ++var55;
                                }
                            }
                        }
                    }
                }
                class50.method475(455, var6, var8, var9, var7);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method165(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field206.method437(arg5, arg4, arg2);
        if (var7 != 0) {
            int var8 = this.field206.method441(arg5, arg4, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg1;
            if (var7 > 0) {
                var11 = arg3;
            }
            int[] var12 = this.field542.field894;
            int var13 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class48 var15 = class48.method472(var14);
            if (var15.field1216 != -1) {
                class57 var16 = this.field446[var15.field1216];
                if (var16 != null) {
                    int var17 = (var15.field1262 * 4 - var16.field1474) / 2;
                    int var18 = (var15.field1230 * 4 - var16.field1475) / 2;
                    var16.method542(arg4 * 4 + 48 + var17, 272, (104 - arg2 - var15.field1230) * 4 + 48 + var18);
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
        int var19 = this.field206.method439(arg5, arg4, arg2);
        if (var19 != 0) {
            int var20 = this.field206.method441(arg5, arg4, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class48 var24 = class48.method472(var23);
            if (var24.field1216 != -1) {
                class57 var25 = this.field446[var24.field1216];
                if (var25 != null) {
                    int var26 = (var24.field1262 * 4 - var25.field1474) / 2;
                    int var27 = (var24.field1230 * 4 - var25.field1475) / 2;
                    var25.method542(arg4 * 4 + 48 + var26, 272, (104 - arg2 - var24.field1230) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field542.field894;
                int var30 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
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
        int var31 = this.field206.method440(arg5, arg4, arg2);
        while (arg0 >= 0) {
            this.field221 = this.field199.method29();
        }
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class48 var33 = class48.method472(var32);
            if (var33.field1216 != -1) {
                class57 var34 = this.field446[var33.field1216];
                if (var34 != null) {
                    int var35 = (var33.field1262 * 4 - var34.field1474) / 2;
                    int var36 = (var33.field1230 * 4 - var34.field1475) / 2;
                    var34.method542(arg4 * 4 + 48 + var35, 272, (104 - arg2 - var33.field1230) * 4 + 48 + var36);
                    return;
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
            field346[var1] = var0 / 4;
        }
        field415 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field533 = 990;
        field567 = -920;
        field569 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field569[var3] = var2 - 1;
            var2 += var2;
        }
    }
}
