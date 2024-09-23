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
public class client extends class12 {

    @OriginalMember(owner = "client", name = "L", descriptor = "I")
    private int field156 = -1;

    @OriginalMember(owner = "client", name = "M", descriptor = "[LSWNASVGQ;")
    private class51[] field157 = new class51[20];

    @OriginalMember(owner = "client", name = "O", descriptor = "Z")
    private boolean field159 = false;

    @OriginalMember(owner = "client", name = "U", descriptor = "B")
    private byte field165 = 55;

    @OriginalMember(owner = "client", name = "ab", descriptor = "[I")
    private int[] field171 = new int[5];

    @OriginalMember(owner = "client", name = "gb", descriptor = "LMLYYHULT;")
    private class30 field177 = class30.method284(9448, 1);

    @OriginalMember(owner = "client", name = "nb", descriptor = "Z")
    private boolean field184 = true;

    @OriginalMember(owner = "client", name = "ob", descriptor = "LZWZXPJNQ;")
    private class72 field185 = new class72(708);

    @OriginalMember(owner = "client", name = "rb", descriptor = "[LNUXLZYAZ;")
    private class33[] field188 = new class33[100];

    @OriginalMember(owner = "client", name = "Cb", descriptor = "[I")
    private int[] field199 = new int[5];

    @OriginalMember(owner = "client", name = "Db", descriptor = "Z")
    private volatile boolean field200 = false;

    @OriginalMember(owner = "client", name = "Hb", descriptor = "Z")
    private boolean field204 = false;

    @OriginalMember(owner = "client", name = "Kb", descriptor = "I")
    private int field207 = -1;

    @OriginalMember(owner = "client", name = "Nb", descriptor = "I")
    private int field210 = 1;

    @OriginalMember(owner = "client", name = "Ob", descriptor = "[Z")
    private boolean[] field211 = new boolean[5];

    @OriginalMember(owner = "client", name = "Pb", descriptor = "I")
    private int field212 = 128;

    @OriginalMember(owner = "client", name = "Ub", descriptor = "I")
    private int field217 = -1;

    @OriginalMember(owner = "client", name = "Vb", descriptor = "I")
    private int field218 = -1;

    @OriginalMember(owner = "client", name = "cc", descriptor = "[LSWNASVGQ;")
    private class51[] field225 = new class51[100];

    @OriginalMember(owner = "client", name = "fc", descriptor = "[I")
    private int[] field228 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client", name = "gc", descriptor = "[I")
    private int[] field229 = new int[500];

    @OriginalMember(owner = "client", name = "hc", descriptor = "[I")
    private int[] field230 = new int[500];

    @OriginalMember(owner = "client", name = "ic", descriptor = "[I")
    private int[] field231 = new int[500];

    @OriginalMember(owner = "client", name = "jc", descriptor = "[I")
    private int[] field232 = new int[500];

    @OriginalMember(owner = "client", name = "kc", descriptor = "I")
    private int field233 = 3;

    @OriginalMember(owner = "client", name = "lc", descriptor = "Z")
    private boolean field234 = true;

    @OriginalMember(owner = "client", name = "qc", descriptor = "I")
    private int field239 = 8;

    @OriginalMember(owner = "client", name = "rc", descriptor = "[I")
    private final int[] field240 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client", name = "sc", descriptor = "[I")
    private int[] field241 = new int[50];

    @OriginalMember(owner = "client", name = "uc", descriptor = "I")
    private int field243 = 490;

    @OriginalMember(owner = "client", name = "vc", descriptor = "[LSWNASVGQ;")
    private class51[] field244 = new class51[32];

    @OriginalMember(owner = "client", name = "wc", descriptor = "[I")
    private int[] field245 = new int[33];

    @OriginalMember(owner = "client", name = "Cc", descriptor = "Z")
    private boolean field251 = false;

    @OriginalMember(owner = "client", name = "Kc", descriptor = "[I")
    public int[] field259 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client", name = "Lc", descriptor = "I")
    private int field260 = 78;

    @OriginalMember(owner = "client", name = "Mc", descriptor = "[[I")
    private int[][] field261 = new int[104][104];

    @OriginalMember(owner = "client", name = "Oc", descriptor = "Z")
    public boolean field263 = true;

    @OriginalMember(owner = "client", name = "Pc", descriptor = "LMLYYHULT;")
    private class30 field264 = new class30(true, new byte[5000]);

    @OriginalMember(owner = "client", name = "Qc", descriptor = "[LJMUIRIHZ;")
    private class23[] field265 = new class23[16384];

    @OriginalMember(owner = "client", name = "Sc", descriptor = "[I")
    public int[] field267 = new int[16384];

    @OriginalMember(owner = "client", name = "Tc", descriptor = "[I")
    private int[] field268 = new int[7];

    @OriginalMember(owner = "client", name = "Wc", descriptor = "[I")
    private int[] field271 = new int[5];

    @OriginalMember(owner = "client", name = "Xc", descriptor = "I")
    private int field272 = -303;

    @OriginalMember(owner = "client", name = "cd", descriptor = "Z")
    private boolean field277 = true;

    @OriginalMember(owner = "client", name = "ed", descriptor = "Z")
    private volatile boolean field279 = false;

    @OriginalMember(owner = "client", name = "fd", descriptor = "Z")
    private boolean field280 = false;

    @OriginalMember(owner = "client", name = "sd", descriptor = "[I")
    public int[] field293 = new int[2000];

    @OriginalMember(owner = "client", name = "td", descriptor = "[[I")
    private int[][] field294 = new int[104][104];

    @OriginalMember(owner = "client", name = "ud", descriptor = "LHWEMRKQZ;")
    private class20 field295 = new class20();

    @OriginalMember(owner = "client", name = "vd", descriptor = "[B")
    private byte[] field296 = new byte[16384];

    @OriginalMember(owner = "client", name = "wd", descriptor = "[LNUXLZYAZ;")
    private class33[] field297 = new class33[2];

    @OriginalMember(owner = "client", name = "yd", descriptor = "Z")
    private boolean field299 = false;

    @OriginalMember(owner = "client", name = "zd", descriptor = "[I")
    private int[] field300 = new int[200];

    @OriginalMember(owner = "client", name = "Ad", descriptor = "Z")
    private boolean field301 = false;

    @OriginalMember(owner = "client", name = "Bd", descriptor = "Z")
    private boolean field302 = false;

    @OriginalMember(owner = "client", name = "Dd", descriptor = "[LSWNASVGQ;")
    private class51[] field304 = new class51[32];

    @OriginalMember(owner = "client", name = "Kd", descriptor = "[I")
    private int[] field311 = new int[151];

    @OriginalMember(owner = "client", name = "Nd", descriptor = "Z")
    private boolean field314 = false;

    @OriginalMember(owner = "client", name = "Qd", descriptor = "[LRRDZGTNX;")
    public class46[] field317 = new class46[5];

    @OriginalMember(owner = "client", name = "Sd", descriptor = "I")
    private int field319 = 7;

    @OriginalMember(owner = "client", name = "Td", descriptor = "Z")
    public boolean field320 = false;

    @OriginalMember(owner = "client", name = "Ud", descriptor = "Z")
    private boolean field321 = false;

    @OriginalMember(owner = "client", name = "Wd", descriptor = "I")
    private int field323 = -1;

    @OriginalMember(owner = "client", name = "Zd", descriptor = "I")
    private int field326 = 2;

    @OriginalMember(owner = "client", name = "ce", descriptor = "I")
    private int field329 = 7759444;

    @OriginalMember(owner = "client", name = "he", descriptor = "I")
    private int field334 = -1;

    @OriginalMember(owner = "client", name = "ie", descriptor = "LZWZXPJNQ;")
    private class72 field335 = new class72(708);

    @OriginalMember(owner = "client", name = "je", descriptor = "I")
    private int field336 = -38190;

    @OriginalMember(owner = "client", name = "oe", descriptor = "[[[I")
    private int[][][] field341 = new int[4][13][13];

    @OriginalMember(owner = "client", name = "qe", descriptor = "[I")
    public int[] field343 = new int[1000];

    @OriginalMember(owner = "client", name = "re", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field344 = new CRC32();

    @OriginalMember(owner = "client", name = "se", descriptor = "Z")
    private boolean field345 = false;

    @OriginalMember(owner = "client", name = "te", descriptor = "I")
    private int field346 = 935;

    @OriginalMember(owner = "client", name = "Be", descriptor = "Z")
    private boolean field354 = false;

    @OriginalMember(owner = "client", name = "Ce", descriptor = "Z")
    private boolean field355 = true;

    @OriginalMember(owner = "client", name = "Fe", descriptor = "Z")
    private boolean field358 = true;

    @OriginalMember(owner = "client", name = "Ge", descriptor = "I")
    private int field359 = 5;

    @OriginalMember(owner = "client", name = "He", descriptor = "[I")
    private int[] field360 = new int[5];

    @OriginalMember(owner = "client", name = "Je", descriptor = "B")
    private byte field362 = 45;

    @OriginalMember(owner = "client", name = "Ke", descriptor = "Z")
    private boolean field363 = false;

    @OriginalMember(owner = "client", name = "Qe", descriptor = "I")
    private int field369 = -1;

    @OriginalMember(owner = "client", name = "Re", descriptor = "Z")
    private boolean field370 = false;

    @OriginalMember(owner = "client", name = "Se", descriptor = "Ljava/lang/String;")
    private String field371 = "";

    @OriginalMember(owner = "client", name = "We", descriptor = "[I")
    private int[] field375 = new int[4000];

    @OriginalMember(owner = "client", name = "Xe", descriptor = "[I")
    private int[] field376 = new int[4000];

    @OriginalMember(owner = "client", name = "Ye", descriptor = "I")
    private int field377 = -1;

    @OriginalMember(owner = "client", name = "Ze", descriptor = "I")
    private int field378 = -1;

    @OriginalMember(owner = "client", name = "af", descriptor = "LZWZXPJNQ;")
    private class72 field379 = new class72(708);

    @OriginalMember(owner = "client", name = "bf", descriptor = "[LSWNASVGQ;")
    private class51[] field380 = new class51[32];

    @OriginalMember(owner = "client", name = "df", descriptor = "Ljava/lang/String;")
    private String field382 = "";

    @OriginalMember(owner = "client", name = "kf", descriptor = "[Ljava/lang/String;")
    private String[] field388 = new String[5];

    @OriginalMember(owner = "client", name = "lf", descriptor = "[Z")
    private boolean[] field389 = new boolean[5];

    @OriginalMember(owner = "client", name = "of", descriptor = "Z")
    private boolean field392 = false;

    @OriginalMember(owner = "client", name = "uf", descriptor = "[Ljava/lang/String;")
    private String[] field398 = new String[200];

    @OriginalMember(owner = "client", name = "Bf", descriptor = "I")
    private int field405 = 2;

    @OriginalMember(owner = "client", name = "Cf", descriptor = "LMLYYHULT;")
    private class30 field406 = class30.method284(9448, 1);

    @OriginalMember(owner = "client", name = "If", descriptor = "Ljava/lang/String;")
    private String field412 = "";

    @OriginalMember(owner = "client", name = "Kf", descriptor = "[Ljava/lang/String;")
    private String[] field414 = new String[100];

    @OriginalMember(owner = "client", name = "Lf", descriptor = "[I")
    private int[] field415 = new int[100];

    @OriginalMember(owner = "client", name = "Nf", descriptor = "Z")
    private boolean field417 = false;

    @OriginalMember(owner = "client", name = "Of", descriptor = "B")
    private byte field418 = 33;

    @OriginalMember(owner = "client", name = "Pf", descriptor = "Z")
    private boolean field419 = false;

    @OriginalMember(owner = "client", name = "Rf", descriptor = "I")
    private int field421 = 1;

    @OriginalMember(owner = "client", name = "Sf", descriptor = "[I")
    private int[] field422 = new int[100];

    @OriginalMember(owner = "client", name = "Tf", descriptor = "[Ljava/lang/String;")
    private String[] field423 = new String[100];

    @OriginalMember(owner = "client", name = "Uf", descriptor = "[Ljava/lang/String;")
    private String[] field424 = new String[100];

    @OriginalMember(owner = "client", name = "Wf", descriptor = "Z")
    private boolean field426 = false;

    @OriginalMember(owner = "client", name = "bg", descriptor = "I")
    private int field431 = -258;

    @OriginalMember(owner = "client", name = "cg", descriptor = "I")
    private int field432 = 2048;

    @OriginalMember(owner = "client", name = "dg", descriptor = "I")
    private int field433 = 2047;

    @OriginalMember(owner = "client", name = "eg", descriptor = "[LCHKMTWJC;")
    private class4[] field434 = new class4[this.field432];

    @OriginalMember(owner = "client", name = "gg", descriptor = "[I")
    public int[] field436 = new int[this.field432];

    @OriginalMember(owner = "client", name = "ig", descriptor = "[I")
    private int[] field438 = new int[this.field432];

    @OriginalMember(owner = "client", name = "jg", descriptor = "[LMLYYHULT;")
    private class30[] field439 = new class30[this.field432];

    @OriginalMember(owner = "client", name = "kg", descriptor = "Z")
    private boolean field440 = false;

    @OriginalMember(owner = "client", name = "mg", descriptor = "LMLYYHULT;")
    private class30 field442 = class30.method284(9448, 1);

    @OriginalMember(owner = "client", name = "ng", descriptor = "Ljava/lang/String;")
    private String field443 = "";

    @OriginalMember(owner = "client", name = "qg", descriptor = "Z")
    private boolean field446 = false;

    @OriginalMember(owner = "client", name = "sg", descriptor = "[I")
    private int[] field448 = new int[151];

    @OriginalMember(owner = "client", name = "ug", descriptor = "Z")
    private volatile boolean field450 = false;

    @OriginalMember(owner = "client", name = "wg", descriptor = "I")
    private int field452 = 336;

    @OriginalMember(owner = "client", name = "Cg", descriptor = "I")
    private int field458 = 50;

    @OriginalMember(owner = "client", name = "Dg", descriptor = "[I")
    private int[] field459 = new int[this.field458];

    @OriginalMember(owner = "client", name = "Eg", descriptor = "[I")
    private int[] field460 = new int[this.field458];

    @OriginalMember(owner = "client", name = "Fg", descriptor = "[I")
    private int[] field461 = new int[this.field458];

    @OriginalMember(owner = "client", name = "Gg", descriptor = "[I")
    private int[] field462 = new int[this.field458];

    @OriginalMember(owner = "client", name = "Hg", descriptor = "[I")
    private int[] field463 = new int[this.field458];

    @OriginalMember(owner = "client", name = "Ig", descriptor = "[I")
    private int[] field464 = new int[this.field458];

    @OriginalMember(owner = "client", name = "Jg", descriptor = "[I")
    private int[] field465 = new int[this.field458];

    @OriginalMember(owner = "client", name = "Kg", descriptor = "[Ljava/lang/String;")
    private String[] field466 = new String[this.field458];

    @OriginalMember(owner = "client", name = "Mg", descriptor = "[LSWNASVGQ;")
    private class51[] field468 = new class51[8];

    @OriginalMember(owner = "client", name = "Ng", descriptor = "Z")
    private boolean field469 = false;

    @OriginalMember(owner = "client", name = "Qg", descriptor = "B")
    private byte field472 = 3;

    @OriginalMember(owner = "client", name = "Tg", descriptor = "[[I")
    private int[][] field475 = new int[104][104];

    @OriginalMember(owner = "client", name = "Ug", descriptor = "I")
    private int field476 = -1;

    @OriginalMember(owner = "client", name = "Wg", descriptor = "[LNUXLZYAZ;")
    private class33[] field478 = new class33[13];

    @OriginalMember(owner = "client", name = "Xg", descriptor = "Ljava/lang/String;")
    private String field479 = "";

    @OriginalMember(owner = "client", name = "Yg", descriptor = "Ljava/lang/String;")
    private String field480 = "";

    @OriginalMember(owner = "client", name = "bh", descriptor = "[LSWNASVGQ;")
    private class51[] field483 = new class51[1000];

    @OriginalMember(owner = "client", name = "ch", descriptor = "I")
    private int field484 = -6346;

    @OriginalMember(owner = "client", name = "eh", descriptor = "[I")
    private int[] field486 = new int[256];

    @OriginalMember(owner = "client", name = "fh", descriptor = "I")
    private int field487 = -578;

    @OriginalMember(owner = "client", name = "hh", descriptor = "Z")
    private boolean field489 = false;

    @OriginalMember(owner = "client", name = "kh", descriptor = "[I")
    private int[] field492 = new int[class19.field858];

    @OriginalMember(owner = "client", name = "ph", descriptor = "[I")
    private int[] field497 = new int[class19.field858];

    @OriginalMember(owner = "client", name = "qh", descriptor = "I")
    private int field498 = -1;

    @OriginalMember(owner = "client", name = "sh", descriptor = "I")
    private int field500 = 187;

    @OriginalMember(owner = "client", name = "th", descriptor = "I")
    private int field501 = 3353893;

    @OriginalMember(owner = "client", name = "Ch", descriptor = "I")
    private int field510 = -1;

    @OriginalMember(owner = "client", name = "Dh", descriptor = "Z")
    private boolean field511 = false;

    @OriginalMember(owner = "client", name = "Gh", descriptor = "I")
    private int field514 = 43943;

    @OriginalMember(owner = "client", name = "Hh", descriptor = "[J")
    private long[] field515 = new long[200];

    @OriginalMember(owner = "client", name = "Nh", descriptor = "I")
    private int field521 = -1;

    @OriginalMember(owner = "client", name = "Vh", descriptor = "Ljava/lang/String;")
    private String field529 = "";

    @OriginalMember(owner = "client", name = "Wh", descriptor = "Ljava/lang/String;")
    private String field530 = "";

    @OriginalMember(owner = "client", name = "ai", descriptor = "Z")
    private boolean field534 = false;

    @OriginalMember(owner = "client", name = "bi", descriptor = "I")
    private int field535 = 2301979;

    @OriginalMember(owner = "client", name = "ci", descriptor = "Z")
    private boolean field536 = false;

    @OriginalMember(owner = "client", name = "ei", descriptor = "I")
    private int field538 = 1;

    @OriginalMember(owner = "client", name = "li", descriptor = "[I")
    private int[] field545 = new int[2000];

    @OriginalMember(owner = "client", name = "mi", descriptor = "[I")
    private int[] field546 = new int[33];

    @OriginalMember(owner = "client", name = "si", descriptor = "I")
    private int field552 = -228;

    @OriginalMember(owner = "client", name = "vi", descriptor = "[J")
    private long[] field555 = new long[100];

    @OriginalMember(owner = "client", name = "wi", descriptor = "[LOTPPFNKL;")
    private class36[] field556 = new class36[4];

    @OriginalMember(owner = "client", name = "Hi", descriptor = "I")
    private int field567 = 2;

    @OriginalMember(owner = "client", name = "Ii", descriptor = "B")
    private byte field568 = 25;

    @OriginalMember(owner = "client", name = "Ji", descriptor = "I")
    private int field569 = -1;

    @OriginalMember(owner = "client", name = "Ki", descriptor = "Z")
    private boolean field570 = false;

    @OriginalMember(owner = "client", name = "Ri", descriptor = "[I")
    private int[] field577 = new int[1000];

    @OriginalMember(owner = "client", name = "Si", descriptor = "[I")
    private int[] field578 = new int[1000];

    @OriginalMember(owner = "client", name = "Ti", descriptor = "B")
    private byte field579 = -85;

    @OriginalMember(owner = "client", name = "Vi", descriptor = "[I")
    private int[] field581 = new int[50];

    @OriginalMember(owner = "client", name = "Yi", descriptor = "[I")
    private int[] field584 = new int[9];

    @OriginalMember(owner = "client", name = "Zi", descriptor = "I")
    private int field585 = -1;

    @OriginalMember(owner = "client", name = "bj", descriptor = "[I")
    private int[] field587 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client", name = "lj", descriptor = "Ljava/lang/String;")
    private String field597 = "";

    @OriginalMember(owner = "client", name = "rj", descriptor = "[I")
    private int[] field603 = new int[5];

    @OriginalMember(owner = "client", name = "uj", descriptor = "[Ljava/lang/String;")
    private String[] field606 = new String[500];

    @OriginalMember(owner = "client", name = "wj", descriptor = "I")
    private int field608 = 32;

    @OriginalMember(owner = "client", name = "Aj", descriptor = "Ljava/lang/String;")
    private String field612 = "";

    @OriginalMember(owner = "client", name = "Bj", descriptor = "I")
    private int field613 = 47691;

    @OriginalMember(owner = "client", name = "Dj", descriptor = "I")
    private int field615 = -1;

    @OriginalMember(owner = "client", name = "Kj", descriptor = "[[[LZWZXPJNQ;")
    private class72[][][] field622 = new class72[4][104][104];

    @OriginalMember(owner = "client", name = "Lj", descriptor = "I")
    private final int field623 = 100;

    @OriginalMember(owner = "client", name = "Mj", descriptor = "[I")
    private int[] field624 = new int[100];

    @OriginalMember(owner = "client", name = "Nj", descriptor = "Z")
    private boolean field625 = true;

    @OriginalMember(owner = "client", name = "Oj", descriptor = "[I")
    private int[] field626 = new int[class19.field858];

    @OriginalMember(owner = "client", name = "Pj", descriptor = "[I")
    private int[] field627 = new int[50];

    @OriginalMember(owner = "client", name = "Qj", descriptor = "I")
    private int field628 = 5063219;

    @OriginalMember(owner = "client", name = "Xj", descriptor = "B")
    private byte field635 = 24;

    @OriginalMember(owner = "client", name = "N", descriptor = "[I")
    private static int[] field158 = new int[99];

    @OriginalMember(owner = "client", name = "V", descriptor = "[I")
    public static int[] field166;

    @OriginalMember(owner = "client", name = "Y", descriptor = "Ljava/lang/String;")
    private static String field169;

    @OriginalMember(owner = "client", name = "hb", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field178;

    @OriginalMember(owner = "client", name = "Tb", descriptor = "I")
    private static int field216;

    @OriginalMember(owner = "client", name = "Dc", descriptor = "I")
    private static int field252;

    @OriginalMember(owner = "client", name = "dd", descriptor = "I")
    private static int field278;

    @OriginalMember(owner = "client", name = "Xd", descriptor = "[[I")
    public static final int[][] field324;

    @OriginalMember(owner = "client", name = "xe", descriptor = "I")
    private static int field350;

    @OriginalMember(owner = "client", name = "ze", descriptor = "Z")
    private static boolean field352;

    @OriginalMember(owner = "client", name = "pf", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field393;

    @OriginalMember(owner = "client", name = "Vf", descriptor = "[I")
    public static final int[] field425;

    @OriginalMember(owner = "client", name = "Lg", descriptor = "I")
    private static int field467;

    @OriginalMember(owner = "client", name = "Ah", descriptor = "Z")
    private static boolean field508;

    @OriginalMember(owner = "client", name = "P", descriptor = "I")
    private int field160;

    @OriginalMember(owner = "client", name = "Q", descriptor = "I")
    private int field161;

    @OriginalMember(owner = "client", name = "R", descriptor = "I")
    private int field162;

    @OriginalMember(owner = "client", name = "S", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client", name = "T", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client", name = "X", descriptor = "I")
    private int field168;

    @OriginalMember(owner = "client", name = "Z", descriptor = "I")
    private static int field170;

    @OriginalMember(owner = "client", name = "ib", descriptor = "I")
    private int field179;

    @OriginalMember(owner = "client", name = "jb", descriptor = "I")
    private int field180;

    @OriginalMember(owner = "client", name = "kb", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client", name = "mb", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client", name = "pb", descriptor = "I")
    private int field186;

    @OriginalMember(owner = "client", name = "qb", descriptor = "I")
    private int field187;

    @OriginalMember(owner = "client", name = "wb", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client", name = "xb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client", name = "yb", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client", name = "zb", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client", name = "Ab", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client", name = "Bb", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client", name = "Fb", descriptor = "I")
    private int field202;

    @OriginalMember(owner = "client", name = "Gb", descriptor = "I")
    private int field203;

    @OriginalMember(owner = "client", name = "Ib", descriptor = "I")
    private int field205;

    @OriginalMember(owner = "client", name = "Jb", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client", name = "Lb", descriptor = "I")
    private int field208;

    @OriginalMember(owner = "client", name = "Mb", descriptor = "I")
    private int field209;

    @OriginalMember(owner = "client", name = "Qb", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client", name = "Rb", descriptor = "I")
    private int field214;

    @OriginalMember(owner = "client", name = "Sb", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client", name = "Wb", descriptor = "I")
    private int field219;

    @OriginalMember(owner = "client", name = "Xb", descriptor = "I")
    private int field220;

    @OriginalMember(owner = "client", name = "Yb", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client", name = "Zb", descriptor = "I")
    private int field222;

    @OriginalMember(owner = "client", name = "ac", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client", name = "dc", descriptor = "I")
    public int field226;

    @OriginalMember(owner = "client", name = "ec", descriptor = "I")
    public int field227;

    @OriginalMember(owner = "client", name = "tc", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client", name = "xc", descriptor = "I")
    private int field246;

    @OriginalMember(owner = "client", name = "yc", descriptor = "I")
    private int field247;

    @OriginalMember(owner = "client", name = "zc", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client", name = "Ac", descriptor = "I")
    private int field249;

    @OriginalMember(owner = "client", name = "Bc", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client", name = "Gc", descriptor = "I")
    private int field255;

    @OriginalMember(owner = "client", name = "Hc", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client", name = "Ic", descriptor = "I")
    private int field257;

    @OriginalMember(owner = "client", name = "Jc", descriptor = "I")
    private int field258;

    @OriginalMember(owner = "client", name = "Rc", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client", name = "Vc", descriptor = "I")
    private int field270;

    @OriginalMember(owner = "client", name = "Yc", descriptor = "I")
    private int field273;

    @OriginalMember(owner = "client", name = "Zc", descriptor = "I")
    private int field274;

    @OriginalMember(owner = "client", name = "ad", descriptor = "I")
    private int field275;

    @OriginalMember(owner = "client", name = "bd", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client", name = "Cd", descriptor = "I")
    public int field303;

    @OriginalMember(owner = "client", name = "Ed", descriptor = "I")
    private static int field305;

    @OriginalMember(owner = "client", name = "Fd", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client", name = "Gd", descriptor = "I")
    private int field307;

    @OriginalMember(owner = "client", name = "Hd", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client", name = "Id", descriptor = "I")
    private int field309;

    @OriginalMember(owner = "client", name = "Jd", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client", name = "Od", descriptor = "I")
    private static int field315;

    @OriginalMember(owner = "client", name = "Pd", descriptor = "I")
    private static int field316;

    @OriginalMember(owner = "client", name = "Vd", descriptor = "I")
    private static int field322;

    @OriginalMember(owner = "client", name = "Yd", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client", name = "ae", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client", name = "be", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client", name = "fe", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client", name = "ge", descriptor = "I")
    private int field333;

    @OriginalMember(owner = "client", name = "pe", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client", name = "ue", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client", name = "ve", descriptor = "I")
    private int field348;

    @OriginalMember(owner = "client", name = "we", descriptor = "I")
    private static int field349;

    @OriginalMember(owner = "client", name = "ye", descriptor = "I")
    public static int field351;

    @OriginalMember(owner = "client", name = "De", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client", name = "Ee", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client", name = "Ie", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client", name = "Oe", descriptor = "I")
    private static int field367;

    @OriginalMember(owner = "client", name = "cf", descriptor = "I")
    public static int field381;

    @OriginalMember(owner = "client", name = "ef", descriptor = "I")
    private int field383;

    @OriginalMember(owner = "client", name = "ff", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client", name = "gf", descriptor = "I")
    private int field385;

    @OriginalMember(owner = "client", name = "hf", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client", name = "jf", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client", name = "nf", descriptor = "I")
    private int field391;

    @OriginalMember(owner = "client", name = "qf", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client", name = "vf", descriptor = "I")
    private int field399;

    @OriginalMember(owner = "client", name = "wf", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client", name = "xf", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client", name = "yf", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client", name = "Af", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client", name = "Jf", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client", name = "Mf", descriptor = "I")
    private int field416;

    @OriginalMember(owner = "client", name = "Qf", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client", name = "Xf", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client", name = "Yf", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client", name = "Zf", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client", name = "fg", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client", name = "hg", descriptor = "I")
    private int field437;

    @OriginalMember(owner = "client", name = "lg", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client", name = "og", descriptor = "I")
    private static int field444;

    @OriginalMember(owner = "client", name = "pg", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client", name = "rg", descriptor = "I")
    private static int field447;

    @OriginalMember(owner = "client", name = "xg", descriptor = "I")
    private int field453;

    @OriginalMember(owner = "client", name = "yg", descriptor = "I")
    private int field454;

    @OriginalMember(owner = "client", name = "zg", descriptor = "I")
    private int field455;

    @OriginalMember(owner = "client", name = "Ag", descriptor = "I")
    private static int field456;

    @OriginalMember(owner = "client", name = "Bg", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client", name = "Og", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client", name = "Pg", descriptor = "I")
    private int field471;

    @OriginalMember(owner = "client", name = "Rg", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client", name = "Sg", descriptor = "I")
    private static int field474;

    @OriginalMember(owner = "client", name = "Vg", descriptor = "I")
    private static int field477;

    @OriginalMember(owner = "client", name = "ah", descriptor = "I")
    private int field482;

    @OriginalMember(owner = "client", name = "dh", descriptor = "I")
    private int field485;

    @OriginalMember(owner = "client", name = "gh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client", name = "lh", descriptor = "I")
    private int field493;

    @OriginalMember(owner = "client", name = "mh", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client", name = "oh", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client", name = "uh", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client", name = "zh", descriptor = "I")
    private int field507;

    @OriginalMember(owner = "client", name = "Eh", descriptor = "I")
    private int field512;

    @OriginalMember(owner = "client", name = "Fh", descriptor = "I")
    private int field513;

    @OriginalMember(owner = "client", name = "Ih", descriptor = "I")
    private int field516;

    @OriginalMember(owner = "client", name = "Jh", descriptor = "I")
    private int field517;

    @OriginalMember(owner = "client", name = "Kh", descriptor = "I")
    private int field518;

    @OriginalMember(owner = "client", name = "Lh", descriptor = "I")
    private int field519;

    @OriginalMember(owner = "client", name = "Mh", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client", name = "Oh", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client", name = "Ph", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client", name = "Qh", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client", name = "Rh", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client", name = "Sh", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client", name = "Th", descriptor = "I")
    private int field527;

    @OriginalMember(owner = "client", name = "Uh", descriptor = "I")
    private int field528;

    @OriginalMember(owner = "client", name = "Xh", descriptor = "I")
    private int field531;

    @OriginalMember(owner = "client", name = "Yh", descriptor = "I")
    private int field532;

    @OriginalMember(owner = "client", name = "Zh", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client", name = "di", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client", name = "ki", descriptor = "I")
    private static int field544;

    @OriginalMember(owner = "client", name = "oi", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client", name = "pi", descriptor = "I")
    private static int field549;

    @OriginalMember(owner = "client", name = "qi", descriptor = "I")
    private int field550;

    @OriginalMember(owner = "client", name = "ri", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client", name = "xi", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client", name = "yi", descriptor = "I")
    private int field558;

    @OriginalMember(owner = "client", name = "zi", descriptor = "I")
    private int field559;

    @OriginalMember(owner = "client", name = "Ai", descriptor = "I")
    private int field560;

    @OriginalMember(owner = "client", name = "Bi", descriptor = "I")
    private int field561;

    @OriginalMember(owner = "client", name = "Ci", descriptor = "I")
    private int field562;

    @OriginalMember(owner = "client", name = "Ei", descriptor = "I")
    private int field564;

    @OriginalMember(owner = "client", name = "Fi", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client", name = "Gi", descriptor = "I")
    private int field566;

    @OriginalMember(owner = "client", name = "Qi", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client", name = "Ui", descriptor = "I")
    private int field580;

    @OriginalMember(owner = "client", name = "Wi", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client", name = "Xi", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client", name = "aj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client", name = "oj", descriptor = "I")
    private static int field600;

    @OriginalMember(owner = "client", name = "pj", descriptor = "I")
    private static int field601;

    @OriginalMember(owner = "client", name = "qj", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client", name = "sj", descriptor = "I")
    private int field604;

    @OriginalMember(owner = "client", name = "tj", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client", name = "vj", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client", name = "xj", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client", name = "yj", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client", name = "zj", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client", name = "Cj", descriptor = "I")
    private int field614;

    @OriginalMember(owner = "client", name = "Fj", descriptor = "I")
    private int field617;

    @OriginalMember(owner = "client", name = "Gj", descriptor = "I")
    private int field618;

    @OriginalMember(owner = "client", name = "Hj", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client", name = "Ij", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client", name = "Jj", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client", name = "Rj", descriptor = "I")
    private int field629;

    @OriginalMember(owner = "client", name = "Sj", descriptor = "I")
    private int field630;

    @OriginalMember(owner = "client", name = "Yj", descriptor = "I")
    private int field636;

    @OriginalMember(owner = "client", name = "ak", descriptor = "I")
    private int field638;

    @OriginalMember(owner = "client", name = "bk", descriptor = "I")
    private int field639;

    @OriginalMember(owner = "client", name = "ck", descriptor = "I")
    public static int field640;

    @OriginalMember(owner = "client", name = "W", descriptor = "J")
    private long field167;

    @OriginalMember(owner = "client", name = "Eb", descriptor = "J")
    private long field201;

    @OriginalMember(owner = "client", name = "vh", descriptor = "J")
    public long field503;

    @OriginalMember(owner = "client", name = "Bh", descriptor = "J")
    private long field509;

    @OriginalMember(owner = "client", name = "Di", descriptor = "J")
    private long field563;

    @OriginalMember(owner = "client", name = "Ec", descriptor = "LFJSXIAWX;")
    private class14 field253;

    @OriginalMember(owner = "client", name = "lb", descriptor = "LGWOEELWB;")
    private class18 field182;

    @OriginalMember(owner = "client", name = "nj", descriptor = "LKPIQNZMJ;")
    private class24 field599;

    @OriginalMember(owner = "client", name = "bb", descriptor = "LNUXLZYAZ;")
    private class33 field172;

    @OriginalMember(owner = "client", name = "cb", descriptor = "LNUXLZYAZ;")
    private class33 field173;

    @OriginalMember(owner = "client", name = "db", descriptor = "LNUXLZYAZ;")
    private class33 field174;

    @OriginalMember(owner = "client", name = "eb", descriptor = "LNUXLZYAZ;")
    private class33 field175;

    @OriginalMember(owner = "client", name = "fb", descriptor = "LNUXLZYAZ;")
    private class33 field176;

    @OriginalMember(owner = "client", name = "gd", descriptor = "LNUXLZYAZ;")
    private class33 field281;

    @OriginalMember(owner = "client", name = "hd", descriptor = "LNUXLZYAZ;")
    private class33 field282;

    @OriginalMember(owner = "client", name = "id", descriptor = "LNUXLZYAZ;")
    private class33 field283;

    @OriginalMember(owner = "client", name = "rf", descriptor = "LNUXLZYAZ;")
    private class33 field395;

    @OriginalMember(owner = "client", name = "sf", descriptor = "LNUXLZYAZ;")
    private class33 field396;

    @OriginalMember(owner = "client", name = "tf", descriptor = "LNUXLZYAZ;")
    private class33 field397;

    @OriginalMember(owner = "client", name = "Df", descriptor = "LNUXLZYAZ;")
    private class33 field407;

    @OriginalMember(owner = "client", name = "Ef", descriptor = "LNUXLZYAZ;")
    private class33 field408;

    @OriginalMember(owner = "client", name = "Ff", descriptor = "LNUXLZYAZ;")
    private class33 field409;

    @OriginalMember(owner = "client", name = "Gf", descriptor = "LNUXLZYAZ;")
    private class33 field410;

    @OriginalMember(owner = "client", name = "Hf", descriptor = "LNUXLZYAZ;")
    private class33 field411;

    @OriginalMember(owner = "client", name = "ih", descriptor = "LNUXLZYAZ;")
    private class33 field490;

    @OriginalMember(owner = "client", name = "jh", descriptor = "LNUXLZYAZ;")
    private class33 field491;

    @OriginalMember(owner = "client", name = "ti", descriptor = "LNUXLZYAZ;")
    private class33 field553;

    @OriginalMember(owner = "client", name = "ui", descriptor = "LNUXLZYAZ;")
    private class33 field554;

    @OriginalMember(owner = "client", name = "hi", descriptor = "LSSCDCBAC;")
    private class49 field541;

    @OriginalMember(owner = "client", name = "rh", descriptor = "LCHKMTWJC;")
    public static class4 field499;

    @OriginalMember(owner = "client", name = "ke", descriptor = "LSSVSGKGT;")
    private class50 field337;

    @OriginalMember(owner = "client", name = "le", descriptor = "LSSVSGKGT;")
    private class50 field338;

    @OriginalMember(owner = "client", name = "me", descriptor = "LSSVSGKGT;")
    private class50 field339;

    @OriginalMember(owner = "client", name = "ne", descriptor = "LSSVSGKGT;")
    private class50 field340;

    @OriginalMember(owner = "client", name = "K", descriptor = "LSWNASVGQ;")
    private class51 field155;

    @OriginalMember(owner = "client", name = "Ld", descriptor = "LSWNASVGQ;")
    private class51 field312;

    @OriginalMember(owner = "client", name = "Md", descriptor = "LSWNASVGQ;")
    private class51 field313;

    @OriginalMember(owner = "client", name = "Te", descriptor = "LSWNASVGQ;")
    private class51 field372;

    @OriginalMember(owner = "client", name = "Ue", descriptor = "LSWNASVGQ;")
    private class51 field373;

    @OriginalMember(owner = "client", name = "nh", descriptor = "LSWNASVGQ;")
    private class51 field495;

    @OriginalMember(owner = "client", name = "ii", descriptor = "LSWNASVGQ;")
    private class51 field542;

    @OriginalMember(owner = "client", name = "ji", descriptor = "LSWNASVGQ;")
    private class51 field543;

    @OriginalMember(owner = "client", name = "Li", descriptor = "LSWNASVGQ;")
    private class51 field571;

    @OriginalMember(owner = "client", name = "Mi", descriptor = "LSWNASVGQ;")
    private class51 field572;

    @OriginalMember(owner = "client", name = "Ni", descriptor = "LSWNASVGQ;")
    private class51 field573;

    @OriginalMember(owner = "client", name = "Oi", descriptor = "LSWNASVGQ;")
    private class51 field574;

    @OriginalMember(owner = "client", name = "Pi", descriptor = "LSWNASVGQ;")
    private class51 field575;

    @OriginalMember(owner = "client", name = "mj", descriptor = "LSWNASVGQ;")
    private class51 field598;

    @OriginalMember(owner = "client", name = "Zj", descriptor = "LSWNASVGQ;")
    private class51 field637;

    @OriginalMember(owner = "client", name = "mf", descriptor = "LTAWLWNCF;")
    private class53 field390;

    @OriginalMember(owner = "client", name = "sb", descriptor = "LWOKQCNXG;")
    private class62 field189;

    @OriginalMember(owner = "client", name = "tb", descriptor = "LWOKQCNXG;")
    private class62 field190;

    @OriginalMember(owner = "client", name = "ub", descriptor = "LWOKQCNXG;")
    private class62 field191;

    @OriginalMember(owner = "client", name = "vb", descriptor = "LWOKQCNXG;")
    private class62 field192;

    @OriginalMember(owner = "client", name = "jd", descriptor = "LWOKQCNXG;")
    private class62 field284;

    @OriginalMember(owner = "client", name = "kd", descriptor = "LWOKQCNXG;")
    private class62 field285;

    @OriginalMember(owner = "client", name = "ld", descriptor = "LWOKQCNXG;")
    private class62 field286;

    @OriginalMember(owner = "client", name = "md", descriptor = "LWOKQCNXG;")
    private class62 field287;

    @OriginalMember(owner = "client", name = "nd", descriptor = "LWOKQCNXG;")
    private class62 field288;

    @OriginalMember(owner = "client", name = "od", descriptor = "LWOKQCNXG;")
    private class62 field289;

    @OriginalMember(owner = "client", name = "pd", descriptor = "LWOKQCNXG;")
    private class62 field290;

    @OriginalMember(owner = "client", name = "qd", descriptor = "LWOKQCNXG;")
    private class62 field291;

    @OriginalMember(owner = "client", name = "rd", descriptor = "LWOKQCNXG;")
    private class62 field292;

    @OriginalMember(owner = "client", name = "Le", descriptor = "LWOKQCNXG;")
    private class62 field364;

    @OriginalMember(owner = "client", name = "Me", descriptor = "LWOKQCNXG;")
    private class62 field365;

    @OriginalMember(owner = "client", name = "Ne", descriptor = "LWOKQCNXG;")
    private class62 field366;

    @OriginalMember(owner = "client", name = "cj", descriptor = "LWOKQCNXG;")
    private class62 field588;

    @OriginalMember(owner = "client", name = "dj", descriptor = "LWOKQCNXG;")
    private class62 field589;

    @OriginalMember(owner = "client", name = "ej", descriptor = "LWOKQCNXG;")
    private class62 field590;

    @OriginalMember(owner = "client", name = "fj", descriptor = "LWOKQCNXG;")
    private class62 field591;

    @OriginalMember(owner = "client", name = "gj", descriptor = "LWOKQCNXG;")
    private class62 field592;

    @OriginalMember(owner = "client", name = "hj", descriptor = "LWOKQCNXG;")
    private class62 field593;

    @OriginalMember(owner = "client", name = "ij", descriptor = "LWOKQCNXG;")
    private class62 field594;

    @OriginalMember(owner = "client", name = "jj", descriptor = "LWOKQCNXG;")
    private class62 field595;

    @OriginalMember(owner = "client", name = "kj", descriptor = "LWOKQCNXG;")
    private class62 field596;

    @OriginalMember(owner = "client", name = "vg", descriptor = "LYBAERVYW;")
    public class66 field451;

    @OriginalMember(owner = "client", name = "bc", descriptor = "Ljava/lang/String;")
    private String field224;

    @OriginalMember(owner = "client", name = "Ve", descriptor = "Ljava/lang/String;")
    private String field374;

    @OriginalMember(owner = "client", name = "zf", descriptor = "Ljava/lang/String;")
    public String field403;

    @OriginalMember(owner = "client", name = "ag", descriptor = "Ljava/lang/String;")
    public String field430;

    @OriginalMember(owner = "client", name = "ni", descriptor = "Ljava/net/Socket;")
    private Socket field547;

    @OriginalMember(owner = "client", name = "Fc", descriptor = "Z")
    private static boolean field254;

    @OriginalMember(owner = "client", name = "xd", descriptor = "Z")
    private static boolean field298;

    @OriginalMember(owner = "client", name = "Ae", descriptor = "Z")
    private static boolean field353;

    @OriginalMember(owner = "client", name = "tg", descriptor = "Z")
    public static boolean field449;

    @OriginalMember(owner = "client", name = "Zg", descriptor = "Z")
    public static boolean field481;

    @OriginalMember(owner = "client", name = "mc", descriptor = "[I")
    private int[] field235;

    @OriginalMember(owner = "client", name = "nc", descriptor = "[I")
    private int[] field236;

    @OriginalMember(owner = "client", name = "oc", descriptor = "[I")
    private int[] field237;

    @OriginalMember(owner = "client", name = "pc", descriptor = "[I")
    private int[] field238;

    @OriginalMember(owner = "client", name = "de", descriptor = "[I")
    private int[] field330;

    @OriginalMember(owner = "client", name = "ee", descriptor = "[I")
    private int[] field331;

    @OriginalMember(owner = "client", name = "wh", descriptor = "[I")
    private int[] field504;

    @OriginalMember(owner = "client", name = "xh", descriptor = "[I")
    private int[] field505;

    @OriginalMember(owner = "client", name = "yh", descriptor = "[I")
    private int[] field506;

    @OriginalMember(owner = "client", name = "fi", descriptor = "[I")
    private int[] field539;

    @OriginalMember(owner = "client", name = "gi", descriptor = "[I")
    private int[] field540;

    @OriginalMember(owner = "client", name = "Tj", descriptor = "[I")
    private int[] field631;

    @OriginalMember(owner = "client", name = "Uj", descriptor = "[I")
    private int[] field632;

    @OriginalMember(owner = "client", name = "Vj", descriptor = "[I")
    private int[] field633;

    @OriginalMember(owner = "client", name = "Wj", descriptor = "[I")
    private int[] field634;

    @OriginalMember(owner = "client", name = "Uc", descriptor = "[LNUXLZYAZ;")
    private class33[] field269;

    @OriginalMember(owner = "client", name = "Pe", descriptor = "[[B")
    private byte[][] field368;

    @OriginalMember(owner = "client", name = "Ej", descriptor = "[[B")
    private byte[][] field616;

    @OriginalMember(owner = "client", name = "Rd", descriptor = "[[[B")
    private byte[][][] field318;

    @OriginalMember(owner = "client", name = "Nc", descriptor = "[[[I")
    private int[][][] field262;

    @OriginalMember(owner = "client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field450) {
            this.method72(field508);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIIIIIIII)Z")
    public final boolean method64(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var35 = 0; var35 < var14; ++var35) {
                this.field475[var15][var35] = 0;
                this.field294[var15][var35] = 99999999;
            }
        }
        int var16 = arg9;
        int var17 = arg10;
        this.field475[arg9][arg10] = 99;
        this.field294[arg9][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field375[var18] = arg9;
        int var36 = var18 + 1;
        this.field376[var18] = arg10;
        boolean var20 = false;
        int var21 = this.field375.length;
        int[][] var22 = this.field556[this.field605].field1213;
        while (var36 != var19) {
            var16 = this.field375[var19];
            var17 = this.field376[var19];
            var19 = (var19 + 1) % var21;
            if (arg5 == var16 && arg8 == var17) {
                var20 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && this.field556[this.field605].method362(arg7, arg8, arg5, var17, true, arg3 - 1, var16)) {
                    var20 = true;
                    break;
                }
                if (arg3 < 10 && this.field556[this.field605].method363(arg5, arg3 - 1, arg8, arg7, var16, var17, true)) {
                    var20 = true;
                    break;
                }
            }
            if (arg4 != 0 && arg6 != 0 && this.field556[this.field605].method364(arg6, 360, var17, var16, arg5, arg4, arg8, arg11)) {
                var20 = true;
                break;
            }
            int var34 = this.field294[var16][var17] + 1;
            if (var16 > 0 && this.field475[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field375[var36] = var16 - 1;
                this.field376[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field475[var16 - 1][var17] = 2;
                this.field294[var16 - 1][var17] = var34;
            }
            if (var16 < var13 - 1 && this.field475[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field375[var36] = var16 + 1;
                this.field376[var36] = var17;
                var36 = (var36 + 1) % var21;
                this.field475[var16 + 1][var17] = 8;
                this.field294[var16 + 1][var17] = var34;
            }
            if (var17 > 0 && this.field475[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field375[var36] = var16;
                this.field376[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field475[var16][var17 - 1] = 1;
                this.field294[var16][var17 - 1] = var34;
            }
            if (var17 < var14 - 1 && this.field475[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field375[var36] = var16;
                this.field376[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field475[var16][var17 + 1] = 4;
                this.field294[var16][var17 + 1] = var34;
            }
            if (var16 > 0 && var17 > 0 && this.field475[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field375[var36] = var16 - 1;
                this.field376[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field475[var16 - 1][var17 - 1] = 3;
                this.field294[var16 - 1][var17 - 1] = var34;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field475[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field375[var36] = var16 + 1;
                this.field376[var36] = var17 - 1;
                var36 = (var36 + 1) % var21;
                this.field475[var16 + 1][var17 - 1] = 9;
                this.field294[var16 + 1][var17 - 1] = var34;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field475[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field375[var36] = var16 - 1;
                this.field376[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field475[var16 - 1][var17 + 1] = 6;
                this.field294[var16 - 1][var17 + 1] = var34;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field475[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field375[var36] = var16 + 1;
                this.field376[var36] = var17 + 1;
                var36 = (var36 + 1) % var21;
                this.field475[var16 + 1][var17 + 1] = 12;
                this.field294[var16 + 1][var17 + 1] = var34;
            }
        }
        this.field607 = 0;
        this.field160 += arg2;
        if (!var20) {
            if (arg1) {
                int var23 = 100;
                for (int var24 = 1; var24 < 2; ++var24) {
                    for (int var25 = arg5 - var24; var25 <= arg5 + var24; ++var25) {
                        for (int var26 = arg8 - var24; var26 <= arg8 + var24; ++var26) {
                            if (var25 >= 0 && var26 >= 0 && var25 < 104 && var26 < 104 && this.field294[var25][var26] < var23) {
                                var23 = this.field294[var25][var26];
                                var16 = var25;
                                var17 = var26;
                                this.field607 = 1;
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
        this.field375[var27] = var16;
        int var37 = var27 + 1;
        this.field376[var27] = var17;
        int var28;
        int var29 = var28 = this.field475[var16][var17];
        while (arg9 != var16 || arg10 != var17) {
            if (var28 != var29) {
                var28 = var29;
                this.field375[var37] = var16;
                this.field376[var37++] = var17;
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
            var29 = this.field475[var16][var17];
        }
        if (var37 <= 0) {
            if (arg0 == 1) {
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
            int var31 = this.field375[var37];
            int var32 = this.field376[var37];
            if (arg0 == 0) {
                this.field406.method285(246, 132);
                this.field406.method286(var30 + var30 + 3);
            }
            if (arg0 == 1) {
                this.field406.method285(147, 132);
                this.field406.method286(var30 + var30 + 3 + 14);
            }
            if (arg0 == 2) {
                this.field406.method285(216, 132);
                this.field406.method286(var30 + var30 + 3);
            }
            this.field406.method312(false, super.field733[5] == 1 ? 1 : 0);
            this.field406.method321(this.field256 + var32, (byte) 1);
            this.field493 = this.field375[0];
            this.field494 = this.field376[0];
            for (int var33 = 1; var33 < var30; ++var33) {
                --var37;
                this.field406.method312(false, this.field375[var37] - var31);
                this.field406.method313(2, this.field376[var37] - var32);
            }
            this.field406.method321(this.field255 + var31, (byte) 1);
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IBII)Z")
    public final boolean method65(int arg0, byte arg1, int arg2, int arg3) {
        int var5 = arg3 >> 14 & 32767;
        if (arg1 != 24) {
            throw new NullPointerException();
        } else {
            int var6 = this.field390.method517(this.field605, arg0, arg2, arg3);
            if (var6 == -1) {
                return false;
            } else {
                int var7 = var6 & 31;
                int var8 = var6 >> 6 & 3;
                ++field456;
                if (field456 > 1184) {
                    field456 = 0;
                    this.field406.method285(127, 132);
                    this.field406.method286(0);
                    int var9 = this.field406.field1092;
                    this.field406.method287(8709);
                    this.field406.method287(18795);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field406.method286(235);
                    }
                    this.field406.method286(38);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field406.method287(55800);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field406.method287(42667);
                    }
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field406.method286(1);
                    }
                    this.field406.method286(163);
                    this.field406.method287(42960);
                    if ((int) (Math.random() * 2.0D) == 0) {
                        this.field406.method286(194);
                    }
                    this.field406.method295(this.field406.field1092 - var9, 0);
                }
                if (var7 != 10 && var7 != 11 && var7 != 22) {
                    this.method64(2, false, 0, var7 + 1, 0, arg0, 0, var8, arg2, field499.field1140[0], field499.field1141[0], 0);
                } else {
                    class27 var10 = class27.method282(var5);
                    int var11;
                    int var12;
                    if (var8 != 0 && var8 != 2) {
                        var11 = var10.field996;
                        var12 = var10.field985;
                    } else {
                        var11 = var10.field985;
                        var12 = var10.field996;
                    }
                    int var13 = var10.field997;
                    if (var8 != 0) {
                        var13 = (var13 >> 4 - var8) + (var13 << var8 & 15);
                    }
                    this.method64(2, false, 0, 0, var11, arg0, var12, 0, arg2, field499.field1140[0], field499.field1141[0], var13);
                }
                this.field557 = super.field730;
                this.field558 = super.field731;
                this.field560 = 2;
                this.field559 = 0;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(I)V")
    public final void method66(int arg0) {
        this.field536 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field268[var2] = -1;
            for (int var3 = 0; var3 < class32.field1114; ++var3) {
                if (!class32.field1115[var3].field1121 && class32.field1115[var3].field1116 == var2 + (this.field277 ? 0 : 7)) {
                    this.field268[var2] = var3;
                    break;
                }
            }
        }
        if (arg0 >= 0) {
            this.field496 = -176;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILMLYYHULT;B)V")
    private final void method67(int arg0, class30 arg1, byte arg2) {
        this.field342 = 0;
        this.field437 = 0;
        this.method119(arg0, -198, arg1);
        if (arg2 == 4) {
            boolean var4 = false;
        } else {
            this.field161 = -1;
        }
        this.method163(arg1, -228, arg0);
        this.method146(this.field243, arg0, arg1);
        this.method125((byte) -8, arg1, arg0);
        for (int var5 = 0; var5 < this.field342; ++var5) {
            int var7 = this.field343[var5];
            if (field502 != this.field434[var7].field1166) {
                this.field434[var7] = null;
            }
        }
        if (arg1.field1092 != arg0) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg1.field1092 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field435; ++var6) {
                if (this.field434[this.field436[var6]] == null) {
                    signlink.reporterror(this.field529 + " null entry in pl list - pos:" + var6 + " size:" + this.field435);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(I)V")
    public final void method68(int arg0) {
        short var2 = 256;
        if (this.field629 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field629 > 768) {
                    this.field235[var3] = this.method171(1024 - this.field629, this.field236[var3], 8, this.field237[var3]);
                } else if (this.field629 > 256) {
                    this.field235[var3] = this.field237[var3];
                } else {
                    this.field235[var3] = this.method171(256 - this.field629, this.field237[var3], 8, this.field236[var3]);
                }
            }
        } else if (this.field630 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field630 > 768) {
                    this.field235[var4] = this.method171(1024 - this.field630, this.field236[var4], 8, this.field238[var4]);
                } else if (this.field630 > 256) {
                    this.field235[var4] = this.field238[var4];
                } else {
                    this.field235[var4] = this.method171(256 - this.field630, this.field238[var4], 8, this.field236[var4]);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field235[var5] = this.field236[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field591.field1651[var6] = this.field372.field1436[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field486[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field539[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field235[var26];
                    int var30 = this.field591.field1651[var8];
                    this.field591.field1651[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field591.method579(7, 0, super.field715, 0);
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field592.field1651[var10] = this.field373.field1436[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field486[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field539[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field235[var18];
                    int var22 = this.field592.field1651[var16];
                    this.field592.field1651[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        if (arg0 != 0) {
            this.field161 = -1;
        }
        this.field592.method579(7, 0, super.field715, 637);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Ljava/lang/String;I)V")
    public final void method69(int arg0, String arg1, String arg2, int arg3) {
        if (arg0 == 0 && this.field615 != -1) {
            this.field224 = arg2;
            super.field729 = 0;
        }
        if (this.field585 == -1) {
            this.field511 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field422[var5] = this.field422[var5 - 1];
            this.field423[var5] = this.field423[var5 - 1];
            this.field424[var5] = this.field424[var5 - 1];
        }
        this.field422[0] = arg0;
        this.field423[0] = arg1;
        this.field424[0] = arg2;
        if (arg3 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(III)Z")
    public final boolean method70(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class20 var5 = class20.method256(arg0);
        for (int var6 = 0; var6 < var5.field899.length && var5.field899[var6] != -1; ++var6) {
            class20 var7 = class20.method256(var5.field899[var6]);
            if (var7.field877 == 1) {
                var4 |= this.method70(var7.field892, -187, arg2);
            }
            if (var7.field877 == 6 && (var7.field878 != -1 || var7.field879 != -1)) {
                boolean var8 = this.method73(var7, 8);
                int var9;
                if (var8) {
                    var9 = var7.field879;
                } else {
                    var9 = var7.field878;
                }
                if (var9 != -1) {
                    class58 var10 = class58.field1570[var9];
                    var7.field906 += arg2;
                    while (var7.field906 > var10.method562((byte) 5, var7.field929)) {
                        var7.field906 -= var10.method562((byte) 5, var7.field929) + 1;
                        ++var7.field929;
                        if (var7.field929 >= var10.field1571) {
                            var7.field929 -= var10.field1575;
                            if (var7.field929 < 0 || var7.field929 >= var10.field1571) {
                                var7.field929 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field877 == 6 && var7.field912 != 0) {
                int var11 = var7.field912 >> 16;
                int var12 = var7.field912 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field866 = var7.field866 + var13 & 2047;
                var7.field867 = var7.field867 + var14 & 2047;
                var4 = true;
            }
        }
        if (arg1 >= 0) {
            field254 = !field254;
        }
        return var4;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(II)V")
    public final void method71(int arg0, int arg1) {
        if (arg0 < 7 || arg0 > 7) {
            this.field426 = !this.field426;
        }
        int var3 = class25.field966[arg1].field974;
        if (var3 != 0) {
            int var4 = this.field293[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class41.method428(0.9D, 29576);
                }
                if (var4 == 2) {
                    class41.method428(0.8D, 29576);
                }
                if (var4 == 3) {
                    class41.method428(0.7D, 29576);
                }
                if (var4 == 4) {
                    class41.method428(0.6D, 29576);
                }
                class40.field1246.method540();
                this.field446 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field234;
                if (var4 == 0) {
                    this.method207(-971, this.field234, 0);
                    this.field234 = true;
                }
                if (var4 == 1) {
                    this.method207(-971, this.field234, -400);
                    this.field234 = true;
                }
                if (var4 == 2) {
                    this.method207(-971, this.field234, -800);
                    this.field234 = true;
                }
                if (var4 == 3) {
                    this.method207(-971, this.field234, -1200);
                    this.field234 = true;
                }
                if (var4 == 4) {
                    this.field234 = false;
                }
                if (this.field234 != var5 && !field353) {
                    if (this.field234) {
                        this.field183 = this.field569;
                        this.field184 = true;
                        this.field253.method237(2, this.field183);
                    } else {
                        this.method209(1);
                    }
                    this.field455 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field358 = true;
                    this.method156((byte) 0, 0);
                }
                if (var4 == 1) {
                    this.field358 = true;
                    this.method156((byte) 0, -400);
                }
                if (var4 == 2) {
                    this.field358 = true;
                    this.method156((byte) 0, -800);
                }
                if (var4 == 3) {
                    this.field358 = true;
                    this.method156((byte) 0, -1200);
                }
                if (var4 == 4) {
                    this.field358 = false;
                }
            }
            if (var3 == 5) {
                this.field582 = var4;
            }
            if (var3 == 6) {
                this.field333 = var4;
            }
            if (var3 == 8) {
                this.field488 = var4;
                this.field511 = true;
            }
            if (var3 == 9) {
                this.field357 = var4;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(Z)V")
    public final void method72(boolean arg0) {
        this.field200 = true;
        this.field320 &= arg0;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field279) {
                ++this.field453;
                this.method149(769);
                this.method149(769);
                this.method68(0);
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
        this.field200 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LHWEMRKQZ;I)Z")
    public final boolean method73(class20 arg0, int arg1) {
        if (arg1 < 8 || arg1 > 8) {
            this.method208();
        }
        if (arg0.field923 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg0.field923.length; ++var3) {
                int var4 = this.method127(var3, 6, arg0);
                int var5 = arg0.field895[var3];
                if (arg0.field923[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg0.field923[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg0.field923[var3] == 4) {
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNXRPKSXU;ZI)V")
    public final void method74(class34 arg0, boolean arg1, int arg2) {
        this.method75(-435, arg0.field1153, arg0.field1152, arg2);
        if (arg1) {
            this.field161 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIII)V")
    public final void method75(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 >= 128 && arg1 >= 128 && arg2 <= 13056 && arg1 <= 13056) {
            int var5 = this.method80(this.field605, arg2, arg1, 9) - arg3;
            int var6 = arg2 - this.field617;
            if (arg0 < 0) {
                int var7 = var5 - this.field618;
                int var8 = arg1 - this.field619;
                int var9 = class3.field89[this.field620];
                int var10 = class3.field90[this.field620];
                int var11 = class3.field89[this.field621];
                int var12 = class3.field90[this.field621];
                int var13 = var6 * var12 + var8 * var11 >> 16;
                int var14 = var8 * var12 - var6 * var11 >> 16;
                int var16 = var7 * var10 - var9 * var14 >> 16;
                int var17 = var7 * var9 + var10 * var14 >> 16;
                if (var17 >= 50) {
                    this.field377 = (var13 << 9) / var17 + class41.field1303;
                    this.field378 = (var16 << 9) / var17 + class41.field1304;
                } else {
                    this.field377 = -1;
                    this.field378 = -1;
                }
            }
        } else {
            this.field377 = -1;
            this.field378 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(B)V")
    public final void method76(byte arg0) {
        this.field190.method578(0);
        if (this.field602 == 2) {
            byte[] var2 = this.field282.field1125;
            int[] var3 = class56.field1555;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field637.method478(this.field245, this.field546, 0, 256, 0, 25, 0, 25, 33, this.field213, 33);
            this.field191.method578(0);
            class41.field1309 = this.field633;
        } else {
            int var6 = this.field325 + this.field213 & 2047;
            int var7 = field499.field1152 / 32 + 48;
            if (this.field165 != arg0) {
                for (int var8 = 1; var8 > 0; ++var8) {
                }
            }
            int var9 = 464 - field499.field1153 / 32;
            this.field495.method478(this.field448, this.field311, 5, this.field209 + 256, 25, var7, 0, var9, 146, var6, 151);
            this.field637.method478(this.field245, this.field546, 0, 256, 0, 25, 0, 25, 33, this.field213, 33);
            for (int var10 = 0; var10 < this.field576; ++var10) {
                int var40 = this.field577[var10] * 4 + 2 - field499.field1152 / 32;
                int var41 = this.field578[var10] * 4 + 2 - field499.field1153 / 32;
                this.method143(var40, var41, true, this.field483[var10]);
            }
            for (int var11 = 0; var11 < 104; ++var11) {
                for (int var36 = 0; var36 < 104; ++var36) {
                    class72 var37 = this.field622[this.field605][var11][var36];
                    if (var37 != null) {
                        int var38 = var11 * 4 + 2 - field499.field1152 / 32;
                        int var39 = var36 * 4 + 2 - field499.field1153 / 32;
                        this.method143(var38, var39, true, this.field571);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field266; ++var12) {
                class23 var32 = this.field265[this.field267[var12]];
                if (var32 != null && var32.method38(false)) {
                    class60 var33 = var32.field951;
                    if (var33.field1618 != null) {
                        var33 = var33.method570(0);
                    }
                    if (var33 != null && var33.field1606 && var33.field1614) {
                        int var34 = var32.field1152 / 32 - field499.field1152 / 32;
                        int var35 = var32.field1153 / 32 - field499.field1153 / 32;
                        this.method143(var34, var35, true, this.field572);
                    }
                }
            }
            for (int var13 = 0; var13 < this.field435; ++var13) {
                class4 var24 = this.field434[this.field436[var13]];
                if (var24 != null && var24.method38(false)) {
                    int var25 = var24.field1152 / 32 - field499.field1152 / 32;
                    int var26 = var24.field1153 / 32 - field499.field1153 / 32;
                    boolean var27 = false;
                    long var28 = class63.method581(var24.field113);
                    for (int var30 = 0; var30 < this.field610; ++var30) {
                        if (this.field515[var30] == var28 && this.field300[var30] != 0) {
                            var27 = true;
                            break;
                        }
                    }
                    boolean var31 = false;
                    if (field499.field110 != 0 && var24.field110 != 0 && field499.field110 == var24.field110) {
                        var31 = true;
                    }
                    if (var27) {
                        this.method143(var25, var26, true, this.field574);
                    } else if (var31) {
                        this.method143(var25, var26, true, this.field575);
                    } else {
                        this.method143(var25, var26, true, this.field573);
                    }
                }
            }
            if (this.field203 != 0 && field502 % 20 < 10) {
                if (this.field203 == 1 && this.field473 >= 0 && this.field473 < this.field265.length) {
                    class23 var14 = this.field265[this.field473];
                    if (var14 != null) {
                        int var15 = var14.field1152 / 32 - field499.field1152 / 32;
                        int var16 = var14.field1153 / 32 - field499.field1153 / 32;
                        this.method108(this.field313, var15, -43513, var16);
                    }
                }
                if (this.field203 == 2) {
                    int var17 = (this.field246 - this.field255) * 4 + 2 - field499.field1152 / 32;
                    int var18 = (this.field247 - this.field256) * 4 + 2 - field499.field1153 / 32;
                    this.method108(this.field313, var17, -43513, var18);
                }
                if (this.field203 == 10 && this.field537 >= 0 && this.field537 < this.field434.length) {
                    class4 var19 = this.field434[this.field537];
                    if (var19 != null) {
                        int var20 = var19.field1152 / 32 - field499.field1152 / 32;
                        int var21 = var19.field1153 / 32 - field499.field1153 / 32;
                        this.method108(this.field313, var20, -43513, var21);
                    }
                }
            }
            if (this.field493 != 0) {
                int var22 = this.field493 * 4 + 2 - field499.field1152 / 32;
                int var23 = this.field494 * 4 + 2 - field499.field1153 / 32;
                this.method143(var22, var23, true, this.field312);
            }
            class56.method546(16777215, 97, true, 78, 3, 3);
            this.field191.method578(0);
            class41.field1309 = this.field633;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNUXLZYAZ;I)V")
    public final void method77(class33 arg0, int arg1) {
        short var3 = 256;
        if (this.field359 != arg1) {
            this.field622 = null;
        }
        for (int var4 = 0; var4 < this.field330.length; ++var4) {
            this.field330[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field330[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field331[var16] = (this.field330[var16 - 1] + this.field330[var16 + 1] + this.field330[var16 - 128] + this.field330[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field330;
            this.field330 = this.field331;
            this.field331 = var14;
        }
        if (arg0 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg0.field1128; ++var8) {
                for (int var9 = 0; var9 < arg0.field1127; ++var9) {
                    if (arg0.field1125[var7++] != 0) {
                        int var10 = var9 + 16 + arg0.field1129;
                        int var11 = var8 + 16 + arg0.field1130;
                        int var12 = (var11 << 7) + var10;
                        this.field330[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(B)V")
    public final void method78(byte arg0) {
        if (this.field164 > 0) {
            this.method176(2);
        } else {
            this.method177("Connection lost", false, "Please wait - attempting to reestablish");
            this.field602 = 0;
            if (arg0 == 33) {
                this.field493 = 0;
                class24 var2 = this.field599;
                this.field320 = false;
                this.field328 = 0;
                this.method191(this.field529, this.field530, true);
                if (!this.field320) {
                    this.method176(2);
                }
                try {
                    var2.method261();
                } catch (Exception var3) {
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(B)V")
    public final void method79(byte arg0) {
        class27.field992.method540();
        class27.field999.method540();
        if (arg0 != 2) {
            this.field622 = null;
        }
        class60.field1607.method540();
        class40.field1285.method540();
        class40.field1246.method540();
        class4.field94.method540();
        class64.field1677.method540();
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIII)I")
    public final int method80(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg1 >> 7;
        int var6 = arg2 >> 7;
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var7 = arg0;
            if (arg3 != 9) {
                this.field622 = null;
            }
            if (arg0 < 3 && (this.field318[1][var5][var6] & 2) == 2) {
                var7 = arg0 + 1;
            }
            int var8 = arg1 & 127;
            int var9 = arg2 & 127;
            int var10 = (128 - var8) * this.field262[var7][var5][var6] + this.field262[var7][var5 + 1][var6] * var8 >> 7;
            int var11 = (128 - var8) * this.field262[var7][var5][var6 + 1] + this.field262[var7][var5 + 1][var6 + 1] * var8 >> 7;
            return (128 - var9) * var10 + var9 * var11 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIII)V")
    public final void method81(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field553.method347(arg1, arg0, (byte) 2);
        this.field554.method347(arg1, arg0 + arg3 - 16, (byte) 2);
        class56.method546(this.field535, arg1, true, arg0 + 16, 16, arg3 - 32);
        int var7 = (arg3 - 32) * arg3 / arg4;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg5 / (arg4 - arg3);
        class56.method546(this.field628, arg1, true, arg0 + 16 + var8, 16, var7);
        class56.method551(this.field329, -663, var7, arg1, arg0 + 16 + var8);
        class56.method551(this.field329, -663, var7, arg1 + 1, arg0 + 16 + var8);
        class56.method549(0, this.field329, arg0 + 16 + var8, 16, arg1);
        int var9 = 8 / arg2;
        class56.method549(0, this.field329, arg0 + 17 + var8, 16, arg1);
        class56.method551(this.field501, -663, var7, arg1 + 15, arg0 + 16 + var8);
        class56.method551(this.field501, -663, var7 - 1, arg1 + 14, arg0 + 17 + var8);
        class56.method549(0, this.field501, arg0 + 15 + var8 + var7, 16, arg1);
        class56.method549(0, this.field501, arg0 + 14 + var8 + var7, 15, arg1 + 1);
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(Z)V")
    public final void method82(boolean arg0) {
        if (this.field586 >= 2 || this.field399 != 0 || this.field427 != 0) {
            String var2;
            if (this.field399 == 1 && this.field586 < 2) {
                var2 = "Use " + this.field403 + " with...";
            } else if (this.field427 == 1 && this.field586 < 2) {
                var2 = this.field430 + "...";
            } else {
                var2 = this.field606[this.field586 - 1];
            }
            if (this.field586 > 2) {
                var2 = var2 + "@whi@ / " + (this.field586 - 2) + " more options";
            }
            this.field339.method463(1, var2, 4, 15, field502 / 1000, 16777215, true);
            if (!arg0) {
                this.field406.method286(78);
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(I)V")
    public final void method83(int arg0) {
        ++this.field551;
        this.method89(true, 0);
        this.method134((byte) 1, true);
        this.method89(false, 0);
        this.method134((byte) 1, false);
        this.method157(true);
        this.method101(-1669);
        if (!this.field159) {
            int var2 = this.field212;
            if (this.field332 / 256 > var2) {
                var2 = this.field332 / 256;
            }
            if (this.field211[4] && this.field360[4] + 128 > var2) {
                var2 = this.field360[4] + 128;
            }
            int var3 = this.field420 + this.field213 & 2047;
            this.method139(var3, this.field531, 3823, this.method80(this.field605, field499.field1152, field499.field1153, 9) - 50, var2 * 3 + 600, this.field532, var2);
        }
        int var4;
        if (!this.field159) {
            var4 = this.method90(0);
        } else {
            var4 = this.method91(47691);
        }
        int var5 = this.field617;
        int var6 = this.field618;
        int var7 = this.field619;
        int var8 = this.field620;
        int var9 = this.field621;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field211[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field199[var10] * 2 + 1) - (double) this.field199[var10] + Math.sin((double) this.field603[var10] / 100.0D * (double) this.field171[var10]) * (double) this.field360[var10]);
                if (var10 == 0) {
                    this.field617 += var13;
                }
                if (var10 == 1) {
                    this.field618 += var13;
                }
                if (var10 == 2) {
                    this.field619 += var13;
                }
                if (var10 == 3) {
                    this.field621 = this.field621 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field620 += var13;
                    if (this.field620 < 128) {
                        this.field620 = 128;
                    }
                    if (this.field620 > 383) {
                        this.field620 = 383;
                    }
                }
            }
        }
        int var11 = class41.field1318;
        class3.field84 = true;
        class3.field87 = 0;
        class3.field85 = super.field723 - 4;
        class3.field86 = super.field724 - 4;
        class56.method544((byte) -2);
        this.field390.method526(var4, this.field619, this.field617, this.field618, this.field620, this.field621, (byte) 6);
        if (arg0 != 0) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        this.field390.method501(10503);
        this.method197(4);
        this.method151(27294);
        this.method86(var11, 151);
        this.method128(this.field514);
        this.field191.method579(7, 4, super.field715, 4);
        this.field617 = var5;
        this.field618 = var6;
        this.field619 = var7;
        this.field620 = var8;
        this.field621 = var9;
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(B)V")
    public final void method84(byte arg0) {
        this.field279 = false;
        while (this.field200) {
            this.field279 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field490 = null;
        this.field491 = null;
        this.field269 = null;
        this.field235 = null;
        this.field236 = null;
        this.field237 = null;
        this.field238 = null;
        this.field330 = null;
        if (arg0 == 9) {
            boolean var2 = false;
        } else {
            this.field406.method286(190);
        }
        this.field331 = null;
        this.field539 = null;
        this.field540 = null;
        this.field372 = null;
        this.field373 = null;
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (arg0 <= 0) {
            field508 = !field508;
        }
        for (int var2 = -1; var2 < this.field435; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field433;
            } else {
                var3 = this.field436[var2];
            }
            class4 var4 = this.field434[var3];
            if (var4 != null) {
                this.method184(1, 825, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(II)V")
    public final void method86(int arg0, int arg1) {
        int var3 = 91 / arg1;
        if (!field353) {
            for (int var4 = 0; var4 < this.field259.length; ++var4) {
                int var5 = this.field259[var4];
                if (class41.field1317[var5] >= arg0) {
                    class33 var6 = class41.field1311[var5];
                    int var7 = var6.field1128 * var6.field1127 - 1;
                    int var8 = this.field276 * var6.field1127 * 2;
                    byte[] var9 = var6.field1125;
                    byte[] var10 = this.field296;
                    for (int var11 = 0; var11 <= var7; ++var11) {
                        var10[var11] = var9[var11 - var8 & var7];
                    }
                    var6.field1125 = var10;
                    this.field296 = var9;
                    class41.method426(var5, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(Z)V")
    public final void method87(boolean arg0) {
        if (arg0) {
            this.field161 = this.field177.method296();
        }
        if (this.field602 == 0) {
            if (super.field729 == 1) {
                int var2 = super.field730 - 25 - 550;
                int var3 = super.field731 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field325 + this.field213 & 2047;
                    int var5 = class41.field1307[var4];
                    int var6 = class41.field1308[var4];
                    int var7 = (this.field209 + 256) * var5 >> 8;
                    int var8 = (this.field209 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field499.field1152 + var9 >> 7;
                    int var12 = field499.field1153 - var10 >> 7;
                    boolean var13 = this.method64(1, true, 0, 0, 0, var11, 0, 0, var12, field499.field1140[0], field499.field1141[0], 0);
                    if (var13) {
                        this.field406.method286(var2);
                        this.field406.method286(var3);
                        this.field406.method287(this.field213);
                        this.field406.method286(57);
                        this.field406.method286(this.field325);
                        this.field406.method286(this.field209);
                        this.field406.method286(89);
                        this.field406.method287(field499.field1152);
                        this.field406.method287(field499.field1153);
                        this.field406.method286(this.field607);
                        this.field406.method286(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(Z)Ljava/lang/String;")
    public final String method88(boolean arg0) {
        this.field320 &= arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field718 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZI)V")
    public final void method89(boolean arg0, int arg1) {
        this.field160 += arg1;
        if (field499.field1152 >> 7 == this.field493 && field499.field1153 >> 7 == this.field494) {
            this.field493 = 0;
            ++field544;
            if (field544 > 96) {
                field544 = 0;
                this.field406.method285(35, 132);
            }
        }
        int var3 = this.field435;
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class4 var5;
            int var6;
            if (arg0) {
                var5 = field499;
                var6 = this.field433 << 14;
            } else {
                var5 = this.field434[this.field436[var4]];
                var6 = this.field436[var4] << 14;
            }
            if (var5 != null && var5.method38(false)) {
                var5.field104 = false;
                if ((field353 && this.field435 > 50 || this.field435 > 200) && !arg0 && var5.field1155 == var5.field1148) {
                    var5.field104 = true;
                }
                int var7 = var5.field1152 >> 7;
                int var8 = var5.field1153 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field122 != null && field502 >= var5.field117 && field502 < var5.field118) {
                        var5.field104 = false;
                        var5.field96 = this.method80(this.field605, var5.field1152, var5.field1153, 9);
                        this.field390.method499(var6, this.field605, var5.field1154, var5.field1152, 60, var5.field106, var5.field107, var5.field96, var5.field108, var5.field109, var5.field1153, var5, -47054);
                    } else {
                        if ((var5.field1152 & 127) == 64 && (var5.field1153 & 127) == 64) {
                            if (this.field261[var7][var8] == this.field551) {
                                continue;
                            }
                            this.field261[var7][var8] = this.field551;
                        }
                        var5.field96 = this.method80(this.field605, var5.field1152, var5.field1153, 9);
                        this.field390.method498(false, var5.field1154, var5.field1153, var5.field1188, 60, var5, this.field605, var5.field96, var5.field1152, var6);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(I)I")
    public final int method90(int arg0) {
        int var2 = 3;
        this.field160 += arg0;
        if (this.field620 < 310) {
            int var3 = this.field617 >> 7;
            int var4 = this.field619 >> 7;
            int var5 = field499.field1152 >> 7;
            int var6 = field499.field1153 >> 7;
            if ((this.field318[this.field605][var3][var4] & 4) != 0) {
                var2 = this.field605;
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
                    if ((this.field318[this.field605][var3][var4] & 4) != 0) {
                        var2 = this.field605;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field318[this.field605][var3][var4] & 4) != 0) {
                            var2 = this.field605;
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
                    if ((this.field318[this.field605][var3][var4] & 4) != 0) {
                        var2 = this.field605;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field318[this.field605][var3][var4] & 4) != 0) {
                            var2 = this.field605;
                        }
                    }
                }
            }
        }
        if ((this.field318[this.field605][field499.field1152 >> 7][field499.field1153 >> 7] & 4) != 0) {
            var2 = this.field605;
        }
        return var2;
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(I)I")
    public final int method91(int arg0) {
        int var2 = this.method80(this.field605, this.field617, this.field619, 9);
        if (this.field613 != arg0) {
            this.field161 = -1;
        }
        return var2 - this.field618 < 800 && (this.field318[this.field605][this.field617 >> 7][this.field619 >> 7] & 4) != 0 ? this.field605 : 3;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(I)V")
    public final void method92(int arg0) {
        if (this.field588 == null) {
            super.field716 = null;
            this.field192 = null;
            this.field190 = null;
            this.field189 = null;
            this.field191 = null;
            this.field364 = null;
            this.field365 = null;
            this.field366 = null;
            this.field591 = new class62(128, 265, 462, this.method122(false));
            class56.method544((byte) -2);
            this.field592 = new class62(128, 265, 462, this.method122(false));
            class56.method544((byte) -2);
            this.field588 = new class62(509, 171, 462, this.method122(false));
            if (arg0 != 2484) {
                field216 = this.field541.method450();
            }
            class56.method544((byte) -2);
            this.field589 = new class62(360, 132, 462, this.method122(false));
            class56.method544((byte) -2);
            this.field590 = new class62(360, 200, 462, this.method122(false));
            class56.method544((byte) -2);
            this.field593 = new class62(202, 238, 462, this.method122(false));
            class56.method544((byte) -2);
            this.field594 = new class62(203, 238, 462, this.method122(false));
            class56.method544((byte) -2);
            this.field595 = new class62(74, 94, 462, this.method122(false));
            class56.method544((byte) -2);
            this.field596 = new class62(75, 94, 462, this.method122(false));
            class56.method544((byte) -2);
            if (this.field182 != null) {
                this.method198((byte) 1);
                this.method193(true);
            }
            this.field446 = true;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Z)V")
    public final void method93(boolean arg0) {
        if (!this.field299 && !this.field314 && !this.field280) {
            ++field502;
            this.field320 &= arg0;
            if (!this.field320) {
                this.method126(-599);
            } else {
                this.method201(1);
            }
            this.method137(0);
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(Z)V")
    public final void method94(boolean arg0) {
        if (arg0) {
            this.field161 = this.field177.method296();
        }
        try {
            this.field218 = -1;
            this.field379.method604();
            this.field185.method604();
            class41.method422((byte) 82);
            this.method79((byte) 2);
            this.field390.method487((byte) 80);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field556[var2].method353();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field318[var3][var4][var5] = 0;
                    }
                }
            }
            class5 var6 = new class5(104, this.field262, false, this.field318, 104);
            int var7 = this.field368.length;
            this.field406.method285(58, 132);
            if (!this.field321) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field504[var8] >> 8) * 64 - this.field255;
                    int var10 = (this.field504[var8] & 255) * 64 - this.field256;
                    byte[] var11 = this.field368[var8];
                    if (var11 != null) {
                        var6.method55(var11, var9, this.field556, var10, 0, (this.field181 - 6) * 8, (this.field180 - 6) * 8);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field504[var12] >> 8) * 64 - this.field255;
                    int var14 = (this.field504[var12] & 255) * 64 - this.field256;
                    byte[] var15 = this.field368[var12];
                    if (var15 == null && this.field181 < 800) {
                        var6.method63(64, 719, var13, var14, 64);
                    }
                }
                this.field406.method285(58, 132);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field616[var16];
                    if (var17 != null) {
                        int var18 = (this.field504[var16] >> 8) * 64 - this.field255;
                        int var19 = (this.field504[var16] & 255) * 64 - this.field256;
                        var6.method47(var19, this.field556, (byte) 8, this.field390, var18, var17);
                    }
                }
            }
            if (this.field321) {
                int var20 = 0;
                label250: while (true) {
                    if (var20 >= 4) {
                        for (int var30 = 0; var30 < 13; ++var30) {
                            for (int var31 = 0; var31 < 13; ++var31) {
                                int var32 = this.field341[0][var30][var31];
                                if (var32 == -1) {
                                    var6.method63(8, 719, var30 * 8, var31 * 8, 8);
                                }
                            }
                        }
                        this.field406.method285(58, 132);
                        int var33 = 0;
                        while (true) {
                            if (var33 >= 4) {
                                break label250;
                            }
                            for (int var34 = 0; var34 < 13; ++var34) {
                                for (int var35 = 0; var35 < 13; ++var35) {
                                    int var36 = this.field341[var33][var34][var35];
                                    if (var36 != -1) {
                                        int var37 = var36 >> 24 & 3;
                                        int var38 = var36 >> 1 & 3;
                                        int var39 = var36 >> 14 & 1023;
                                        int var40 = var36 >> 3 & 2047;
                                        int var41 = (var39 / 8 << 8) + var40 / 8;
                                        for (int var42 = 0; var42 < this.field504.length; ++var42) {
                                            if (this.field504[var42] == var41 && this.field616[var42] != null) {
                                                var6.method48(var37, var35 * 8, (var40 & 7) * 8, var34 * 8, this.field556, var38, (var39 & 7) * 8, (byte) 3, this.field390, this.field616[var42], var33);
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
                            int var23 = this.field341[var20][var21][var22];
                            if (var23 != -1) {
                                int var24 = var23 >> 24 & 3;
                                int var25 = var23 >> 1 & 3;
                                int var26 = var23 >> 14 & 1023;
                                int var27 = var23 >> 3 & 2047;
                                int var28 = (var26 / 8 << 8) + var27 / 8;
                                for (int var29 = 0; var29 < this.field504.length; ++var29) {
                                    if (this.field504[var29] == var28 && this.field368[var29] != null) {
                                        var6.method56((var27 & 7) * 8, (byte) 7, var24, this.field556, var22 * 8, var21 * 8, this.field368[var29], var20, var25, (var26 & 7) * 8);
                                        break;
                                    }
                                }
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field406.method285(58, 132);
            var6.method62((byte) 61, this.field556, this.field390);
            if (this.field191 != null) {
                this.field191.method578(0);
                class41.field1309 = this.field633;
            }
            this.field406.method285(58, 132);
            int var43 = class5.field146;
            if (var43 > this.field605) {
                var43 = this.field605;
            }
            if (var43 < this.field605 - 1) {
                int var44 = this.field605 - 1;
            }
            if (field353) {
                this.field390.method488(class5.field146, false);
            } else {
                this.field390.method488(0, false);
            }
            for (int var45 = 0; var45 < 104; ++var45) {
                for (int var46 = 0; var46 < 104; ++var46) {
                    this.method199(var45, var46);
                }
            }
            this.method95((byte) 33);
        } catch (Exception var59) {
        }
        class27.field992.method540();
        if (super.field718 != null) {
            this.field406.method285(173, 132);
            this.field406.method290(1057001181);
        }
        if (field353 && signlink.cache_dat != null) {
            int var48 = this.field253.method239(field216, 0);
            for (int var49 = 0; var49 < var48; ++var49) {
                int var50 = this.field253.method234(-715, var49);
                if ((var50 & 121) == 0) {
                    class3.method10(var49, (byte) 21);
                }
            }
        }
        System.gc();
        class41.method423(0, 20);
        this.field253.method238(this.field608);
        int var51 = (this.field180 - 6) / 8 - 1;
        int var52 = (this.field180 + 6) / 8 + 1;
        int var53 = (this.field181 - 6) / 8 - 1;
        int var54 = (this.field181 + 6) / 8 + 1;
        if (this.field302) {
            var51 = 49;
            var52 = 50;
            var53 = 49;
            var54 = 50;
        }
        for (int var55 = var51; var55 <= var52; ++var55) {
            for (int var56 = var53; var56 <= var54; ++var56) {
                if (var51 == var55 || var52 == var55 || var53 == var56 || var54 == var56) {
                    int var57 = this.field253.method235(var56, var55, 0, 949);
                    if (var57 != -1) {
                        this.field253.method230(3, false, var57);
                    }
                    int var58 = this.field253.method235(var56, var55, 1, 949);
                    if (var58 != -1) {
                        this.field253.method230(3, false, var58);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(B)V")
    private final void method95(byte arg0) {
        if (this.field418 != arg0) {
            this.field161 = -1;
        }
        for (class29 var2 = (class29) this.field335.method600(); var2 != null; var2 = (class29) this.field335.method602((byte) 3)) {
            if (var2.field1066 == -1) {
                var2.field1070 = 0;
                this.method159(var2, (byte) 8);
            } else {
                var2.method367();
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IIIIII)V")
    public final void method96(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 <= 0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        int var8 = this.field390.method513(arg0, arg1, arg5);
        if (var8 != 0) {
            int var9 = this.field390.method517(arg0, arg1, arg5, var8);
            int var10 = var9 >> 6 & 3;
            int var11 = var9 & 31;
            int var12 = arg4;
            if (var8 > 0) {
                var12 = arg3;
            }
            int[] var13 = this.field495.field1436;
            int var14 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
            int var15 = var8 >> 14 & 32767;
            class27 var16 = class27.method282(var15);
            if (var16.field1022 != -1) {
                class33 var17 = this.field188[var16.field1022];
                if (var17 != null) {
                    int var18 = (var16.field985 * 4 - var17.field1127) / 2;
                    int var19 = (var16.field996 * 4 - var17.field1128) / 2;
                    var17.method347(arg1 * 4 + 48 + var18, (104 - arg5 - var16.field996) * 4 + 48 + var19, (byte) 2);
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
        int var20 = this.field390.method515(arg0, arg1, arg5);
        if (var20 != 0) {
            int var21 = this.field390.method517(arg0, arg1, arg5, var20);
            int var22 = var21 >> 6 & 3;
            int var23 = var21 & 31;
            int var24 = var20 >> 14 & 32767;
            class27 var25 = class27.method282(var24);
            if (var25.field1022 != -1) {
                class33 var26 = this.field188[var25.field1022];
                if (var26 != null) {
                    int var27 = (var25.field985 * 4 - var26.field1127) / 2;
                    int var28 = (var25.field996 * 4 - var26.field1128) / 2;
                    var26.method347(arg1 * 4 + 48 + var27, (104 - arg5 - var25.field996) * 4 + 48 + var28, (byte) 2);
                }
            } else if (var23 == 9) {
                int var29 = 15658734;
                if (var20 > 0) {
                    var29 = 15597568;
                }
                int[] var30 = this.field495.field1436;
                int var31 = (103 - arg5) * 512 * 4 + arg1 * 4 + 24624;
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
        int var32 = this.field390.method516(arg0, arg1, arg5);
        if (var32 != 0) {
            int var33 = var32 >> 14 & 32767;
            class27 var34 = class27.method282(var33);
            if (var34.field1022 != -1) {
                class33 var35 = this.field188[var34.field1022];
                if (var35 != null) {
                    int var36 = (var34.field985 * 4 - var35.field1127) / 2;
                    int var37 = (var34.field996 * 4 - var35.field1128) / 2;
                    var35.method347(arg1 * 4 + 48 + var36, (104 - arg5 - var34.field996) * 4 + 48 + var37, (byte) 2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(B)V")
    private final void method97(byte arg0) {
        if (arg0 != 8) {
            this.method208();
        }
        if (this.field550 == 2) {
            for (class29 var2 = (class29) this.field335.method600(); var2 != null; var2 = (class29) this.field335.method602((byte) 3)) {
                if (var2.field1066 > 0) {
                    --var2.field1066;
                }
                if (var2.field1066 == 0) {
                    if (var2.field1059 < 0 || class5.method49(var2.field1061, 5, var2.field1059)) {
                        this.method179(var2.field1060, var2.field1063, var2.field1064, var2.field1061, var2.field1062, var2.field1065, -36, var2.field1059);
                        var2.method367();
                    }
                } else {
                    if (var2.field1070 > 0) {
                        --var2.field1070;
                    }
                    if (var2.field1070 == 0 && var2.field1064 >= 1 && var2.field1065 >= 1 && var2.field1064 <= 102 && var2.field1065 <= 102 && (var2.field1067 < 0 || class5.method49(var2.field1069, 5, var2.field1067))) {
                        this.method179(var2.field1068, var2.field1063, var2.field1064, var2.field1069, var2.field1062, var2.field1065, -36, var2.field1067);
                        var2.field1070 = -1;
                        if (var2.field1067 == var2.field1059 && var2.field1059 == -1) {
                            var2.method367();
                        } else if (var2.field1067 == var2.field1059 && var2.field1068 == var2.field1060 && var2.field1069 == var2.field1061) {
                            var2.method367();
                        }
                    }
                }
            }
            ++field316;
            if (field316 > 1896) {
                field316 = 0;
                this.field406.method285(119, 132);
                this.field406.method286(0);
                int var3 = this.field406.field1092;
                this.field406.method287((int) (Math.random() * 65536.0D));
                this.field406.method287((int) (Math.random() * 65536.0D));
                this.field406.method286(245);
                this.field406.method287(25901);
                this.field406.method286((int) (Math.random() * 256.0D));
                this.field406.method286(130);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field406.method286(74);
                }
                this.field406.method287(64410);
                this.field406.method286(239);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field406.method287(62571);
                }
                this.field406.method295(this.field406.field1092 - var3, 0);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(I)V")
    public final void method98(int arg0) {
        this.field446 = true;
        if (arg0 > 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(B)V")
    public final void method99(byte arg0) {
        if (arg0 != 6) {
            this.field161 = -1;
        }
        if (super.field729 == 1) {
            if (super.field730 >= 6 && super.field730 <= 106 && super.field731 >= 467 && super.field731 <= 499) {
                this.field485 = (this.field485 + 1) % 4;
                this.field392 = true;
                this.field511 = true;
                this.field406.method285(124, 132);
                this.field406.method286(this.field485);
                this.field406.method286(this.field274);
                this.field406.method286(this.field636);
            }
            if (super.field730 >= 135 && super.field730 <= 235 && super.field731 >= 467 && super.field731 <= 499) {
                this.field274 = (this.field274 + 1) % 3;
                this.field392 = true;
                this.field511 = true;
                this.field406.method285(124, 132);
                this.field406.method286(this.field485);
                this.field406.method286(this.field274);
                this.field406.method286(this.field636);
            }
            if (super.field730 >= 273 && super.field730 <= 373 && super.field731 >= 467 && super.field731 <= 499) {
                this.field636 = (this.field636 + 1) % 3;
                this.field392 = true;
                this.field511 = true;
                this.field406.method285(124, 132);
                this.field406.method286(this.field485);
                this.field406.method286(this.field274);
                this.field406.method286(this.field636);
            }
            if (super.field730 >= 412 && super.field730 <= 512 && super.field731 >= 467 && super.field731 <= 499) {
                if (this.field207 == -1) {
                    this.method107((byte) 6);
                    this.field597 = "";
                    this.field345 = false;
                    this.field510 = this.field207 = class20.field890;
                    return;
                }
                this.method69(0, "", "Please close the interface you have open before using 'report abuse'", -113);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(I)V")
    public final void method100(int arg0) {
        if (arg0 <= 0) {
            this.method208();
        }
        if (!this.field299 && !this.field314 && !this.field280) {
            ++field381;
            if (!this.field320) {
                this.method104(false, -474);
            } else {
                this.method190(-911);
            }
            this.field513 = 0;
        } else {
            this.method116(49719);
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(I)V")
    public final void method101(int arg0) {
        class45 var2 = (class45) this.field379.method600();
        if (arg0 != -1669) {
            this.method208();
        }
        while (var2 != null) {
            if (this.field605 == var2.field1382 && !var2.field1381) {
                if (field502 >= var2.field1377) {
                    var2.method445(-13956, this.field276);
                    if (var2.field1381) {
                        var2.method367();
                    } else {
                        this.field390.method498(false, 0, var2.field1384, false, 60, var2, var2.field1382, var2.field1385, var2.field1383, -1);
                    }
                }
            } else {
                var2.method367();
            }
            var2 = (class45) this.field379.method602((byte) 3);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BJ)V")
    public final void method102(byte arg0, long arg1) {
        if (arg0 != 0) {
            this.field161 = this.field177.method296();
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field610; ++var4) {
                if (this.field515[var4] == arg1) {
                    --this.field610;
                    this.field489 = true;
                    for (int var5 = var4; var5 < this.field610; ++var5) {
                        this.field398[var5] = this.field398[var5 + 1];
                        this.field300[var5] = this.field300[var5 + 1];
                        this.field515[var5] = this.field515[var5 + 1];
                    }
                    this.field406.method285(223, 132);
                    this.field406.method292(arg1, this.field362);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(I)V")
    public final void method103(int arg0) {
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            int var3 = field499.field1152 + this.field404;
            int var4 = field499.field1153 + this.field566;
            if (this.field531 - var3 < -500 || this.field531 - var3 > 500 || this.field532 - var4 < -500 || this.field532 - var4 > 500) {
                this.field531 = var3;
                this.field532 = var4;
            }
            if (this.field531 != var3) {
                this.field531 += (var3 - this.field531) / 16;
            }
            if (this.field532 != var4) {
                this.field532 += (var4 - this.field532) / 16;
            }
            if (super.field733[1] == 1) {
                this.field214 += (-24 - this.field214) / 2;
            } else if (super.field733[2] == 1) {
                this.field214 += (24 - this.field214) / 2;
            } else {
                this.field214 /= 2;
            }
            if (super.field733[3] == 1) {
                this.field215 += (12 - this.field215) / 2;
            } else if (super.field733[4] == 1) {
                this.field215 += (-12 - this.field215) / 2;
            } else {
                this.field215 /= 2;
            }
            this.field213 = this.field214 / 2 + this.field213 & 2047;
            this.field212 += this.field215 / 2;
            if (this.field212 < 128) {
                this.field212 = 128;
            }
            if (this.field212 > 383) {
                this.field212 = 383;
            }
            int var5 = this.field531 >> 7;
            int var6 = this.field532 >> 7;
            int var7 = this.method80(this.field605, this.field531, this.field532, 9);
            int var8 = 0;
            if (var5 > 3 && var6 > 3 && var5 < 100 && var6 < 100) {
                for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                    for (int var10 = var6 - 4; var10 <= var6 + 4; ++var10) {
                        int var11 = this.field605;
                        if (var11 < 3 && (this.field318[1][var9][var10] & 2) == 2) {
                            ++var11;
                        }
                        int var12 = var7 - this.field262[var11][var9][var10];
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
            if (var13 > this.field332) {
                this.field332 += (var13 - this.field332) / 24;
            } else if (var13 < this.field332) {
                this.field332 += (var13 - this.field332) / 80;
            }
        } catch (Exception var14) {
            signlink.reporterror("glfc_ex " + field499.field1152 + "," + field499.field1153 + "," + this.field531 + "," + this.field532 + "," + this.field180 + "," + this.field181 + "," + this.field255 + "," + this.field256);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ZI)V")
    public final void method104(boolean arg0, int arg1) {
        this.method92(2484);
        while (arg1 >= 0) {
            this.field161 = -1;
        }
        this.field590.method578(0);
        this.field490.method347(0, 0, (byte) 2);
        short var3 = 360;
        short var4 = 200;
        if (this.field548 == 0) {
            int var5 = var4 / 2 + 80;
            this.field337.method455(this.field253.field770, var5, 0, true, var3 / 2, 7711145);
            int var6 = var4 / 2 - 20;
            this.field339.method455("Welcome to RuneScape", var6, 0, true, var3 / 2, 16776960);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field491.method347(var7 - 73, var8 - 20, (byte) 2);
            this.field339.method455("New User", var8 + 5, 0, true, var7, 16777215);
            int var9 = var3 / 2 + 80;
            this.field491.method347(var9 - 73, var8 - 20, (byte) 2);
            this.field339.method455("Existing User", var8 + 5, 0, true, var9, 16777215);
        }
        if (this.field548 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field479.length() > 0) {
                this.field339.method455(this.field479, var10 - 15, 0, true, var3 / 2, 16776960);
                this.field339.method455(this.field480, var10, 0, true, var3 / 2, 16776960);
                var10 += 30;
            } else {
                this.field339.method455(this.field480, var10 - 7, 0, true, var3 / 2, 16776960);
                var10 += 30;
            }
            this.field339.method462(var3 / 2 - 90, 16777215, true, 14904, "Username: " + this.field529 + (this.field356 == 0 & field502 % 40 < 20 ? "@yel@|" : ""), var10);
            var10 += 15;
            this.field339.method462(var3 / 2 - 88, 16777215, true, 14904, "Password: " + class63.method586(this.field431, this.field530) + (this.field356 == 1 & field502 % 40 < 20 ? "@yel@|" : ""), var10);
            var10 += 15;
            if (!arg0) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field491.method347(var11 - 73, var12 - 20, (byte) 2);
                this.field339.method455("Login", var12 + 5, 0, true, var11, 16777215);
                int var13 = var3 / 2 + 80;
                this.field491.method347(var13 - 73, var12 - 20, (byte) 2);
                this.field339.method455("Cancel", var12 + 5, 0, true, var13, 16777215);
            }
        }
        if (this.field548 == 3) {
            this.field339.method455("Create a free account", var4 / 2 - 60, 0, true, var3 / 2, 16776960);
            int var14 = var4 / 2 - 35;
            this.field339.method455("To create a new account you need to", var14, 0, true, var3 / 2, 16777215);
            int var18 = var14 + 15;
            this.field339.method455("go back to the main RuneScape webpage", var18, 0, true, var3 / 2, 16777215);
            int var19 = var18 + 15;
            this.field339.method455("and choose the 'create account'", var19, 0, true, var3 / 2, 16777215);
            int var20 = var19 + 15;
            this.field339.method455("button near the top of that page.", var20, 0, true, var3 / 2, 16777215);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field491.method347(var15 - 73, var16 - 20, (byte) 2);
            this.field339.method455("Cancel", var16 + 5, 0, true, var15, 16777215);
        }
        this.field590.method579(7, 171, super.field715, 202);
        if (this.field446) {
            this.field446 = false;
            this.field588.method579(7, 0, super.field715, 128);
            this.field589.method579(7, 371, super.field715, 202);
            this.field593.method579(7, 265, super.field715, 0);
            this.field594.method579(7, 265, super.field715, 562);
            this.field595.method579(7, 171, super.field715, 128);
            this.field596.method579(7, 171, super.field715, 562);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(JZ)V")
    public final void method105(long arg0, boolean arg1) {
        if (!arg1) {
            if (arg0 != 0L) {
                for (int var4 = 0; var4 < this.field202; ++var4) {
                    if (this.field555[var4] == arg0) {
                        --this.field202;
                        this.field489 = true;
                        for (int var5 = var4; var5 < this.field202; ++var5) {
                            this.field555[var5] = this.field555[var5 + 1];
                        }
                        this.field406.method285(146, 132);
                        this.field406.method292(arg0, this.field362);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILCHKMTWJC;ILMLYYHULT;B)V")
    private final void method106(int arg0, class4 arg1, int arg2, class30 arg3, byte arg4) {
        if (arg4 != 51) {
            this.method208();
        }
        if ((arg0 & 32) != 0) {
            int var6 = arg3.method315(0);
            byte[] var7 = new byte[var6];
            class30 var8 = new class30(true, var7);
            arg3.method305(var6, 0, var7, (byte) 119);
            this.field439[arg2] = var8;
            arg1.method42((byte) 121, var8);
        }
        if ((arg0 & 256) != 0) {
            arg1.field1133 = arg3.method326(field278);
            int var9 = arg3.method332(891);
            arg1.field1137 = var9 >> 16;
            arg1.field1136 = (var9 & 65535) + field502;
            arg1.field1134 = 0;
            arg1.field1135 = 0;
            if (arg1.field1136 > field502) {
                arg1.field1134 = -1;
            }
            if (arg1.field1133 == 65535) {
                arg1.field1133 = -1;
            }
        }
        if ((arg0 & 1) != 0) {
            int var10 = arg3.method324(-178);
            if (var10 == 65535) {
                var10 = -1;
            }
            int var11 = arg3.method315(0);
            if (arg1.field1182 == var10 && var10 != -1) {
                int var12 = class58.field1570[var10].field1584;
                if (var12 == 1) {
                    arg1.field1183 = 0;
                    arg1.field1184 = 0;
                    arg1.field1185 = var11;
                    arg1.field1186 = 0;
                }
                if (var12 == 2) {
                    arg1.field1186 = 0;
                }
            } else if (var10 == -1 || arg1.field1182 == -1 || class58.field1570[var10].field1578 >= class58.field1570[arg1.field1182].field1578) {
                arg1.field1182 = var10;
                arg1.field1183 = 0;
                arg1.field1184 = 0;
                arg1.field1185 = var11;
                arg1.field1186 = 0;
                arg1.field1143 = arg1.field1167;
            }
        }
        if ((arg0 & 2) != 0) {
            arg1.field1179 = arg3.method298();
            arg1.field1180 = arg3.method324(-178);
        }
        if ((arg0 & 1024) != 0) {
            arg1.field1168 = arg3.method316(5715);
            arg1.field1170 = arg3.method317(false);
            arg1.field1169 = arg3.method315(0);
            arg1.field1171 = arg3.method315(0);
            arg1.field1172 = arg3.method324(-178) + field502;
            arg1.field1173 = arg3.method325(584) + field502;
            arg1.field1174 = arg3.method296();
            arg1.method350(-784);
        }
        if ((arg0 & 8) != 0) {
            arg1.field1138 = arg3.method303();
            if (arg1.field1138.charAt(0) == '~') {
                arg1.field1138 = arg1.field1138.substring(1);
                this.method69(2, arg1.field113, arg1.field1138, -113);
            } else if (field499 == arg1) {
                this.method69(2, arg1.field113, arg1.field1138, -113);
            }
            arg1.field1150 = 0;
            arg1.field1142 = 0;
            arg1.field1175 = 150;
        }
        if ((arg0 & 128) != 0) {
            arg1.field1164 = arg3.method298();
            if (arg1.field1164 == 65535) {
                arg1.field1164 = -1;
            }
        }
        if ((arg0 & 512) != 0) {
            int var13 = arg3.method296();
            int var14 = arg3.method317(false);
            arg1.method349(var14, 0, var13, field502);
            arg1.field1145 = field502 + 300;
            arg1.field1146 = arg3.method316(5715);
            arg1.field1147 = arg3.method317(false);
        }
        if ((arg0 & 64) != 0) {
            int var15 = arg3.method326(field278);
            int var16 = arg3.method296();
            int var17 = arg3.method317(false);
            int var18 = arg3.field1092;
            if (arg1.field113 != null && arg1.field98) {
                long var19 = class63.method581(arg1.field113);
                boolean var21 = false;
                if (var16 <= 1) {
                    for (int var22 = 0; var22 < this.field202; ++var22) {
                        if (this.field555[var22] == var19) {
                            var21 = true;
                            break;
                        }
                    }
                }
                if (!var21 && this.field391 == 0) {
                    try {
                        this.field264.field1092 = 0;
                        arg3.method335(0, (byte) -35, this.field264.field1091, var17);
                        this.field264.field1092 = 0;
                        String var23 = class17.method245(0, this.field264, var17);
                        String var24 = class39.method378(0, var23);
                        arg1.field1138 = var24;
                        arg1.field1150 = var15 >> 8;
                        arg1.field1142 = var15 & 255;
                        arg1.field1175 = 150;
                        if (var16 != 2 && var16 != 3) {
                            if (var16 == 1) {
                                this.method69(1, "@cr1@" + arg1.field113, var24, -113);
                            } else {
                                this.method69(2, arg1.field113, var24, -113);
                            }
                        } else {
                            this.method69(1, "@cr2@" + arg1.field113, var24, -113);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg3.field1092 = var17 + var18;
        }
        if ((arg0 & 16) != 0) {
            int var26 = arg3.method317(false);
            int var27 = arg3.method315(0);
            arg1.method349(var27, 0, var26, field502);
            arg1.field1145 = field502 + 300;
            arg1.field1146 = arg3.method296();
            arg1.field1147 = arg3.method317(false);
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(B)V")
    public final void method107(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field161 = -1;
        }
        this.field406.method285(211, 132);
        if (this.field521 != -1) {
            this.method158(this.field521, 35928);
            this.field521 = -1;
            this.field489 = true;
            this.field440 = false;
            this.field469 = true;
        }
        if (this.field585 != -1) {
            this.method158(this.field585, 35928);
            this.field585 = -1;
            this.field511 = true;
            this.field440 = false;
        }
        if (this.field369 != -1) {
            this.method158(this.field369, 35928);
            this.field369 = -1;
            this.field446 = true;
        }
        if (this.field217 != -1) {
            this.method158(this.field217, 35928);
            this.field217 = -1;
        }
        if (this.field207 != -1) {
            this.method158(this.field207, 35928);
            this.field207 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LSWNASVGQ;III)V")
    public final void method108(class51 arg0, int arg1, int arg2, int arg3) {
        if (arg2 != -43513) {
            this.field161 = -1;
        }
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field325 + this.field213 & 2047;
            int var7 = class3.field89[var6];
            int var8 = class3.field90[var6];
            int var9 = var7 * 256 / (this.field209 + 256);
            int var10 = var8 * 256 / (this.field209 + 256);
            int var11 = arg1 * var10 + arg3 * var9 >> 16;
            int var12 = arg3 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field155.method479(var15 + 94 + 4 - 10, 20, var13, (byte) 8, 20, 15, 256, 15, 83 - var16 - 20);
        } else {
            this.method143(arg1, arg3, true, arg0);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILHWEMRKQZ;)Z")
    public final boolean method109(int arg0, class20 arg1) {
        if (arg0 != 7) {
            throw new NullPointerException();
        } else {
            int var3 = arg1.field930;
            if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
                if (var3 >= 401 && var3 <= 500) {
                    this.field606[this.field586] = "Remove @whi@" + arg1.field907;
                    this.field231[this.field586] = 212;
                    ++this.field586;
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
                this.field606[this.field586] = "Remove @whi@" + this.field398[var3];
                this.field231[this.field586] = 526;
                ++this.field586;
                this.field606[this.field586] = "Message @whi@" + this.field398[var3];
                this.field231[this.field586] = 247;
                ++this.field586;
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(I)V")
    public final void method110(int arg0) {
        if (arg0 < 0) {
            if (this.field488 != 0) {
                class50 var2 = this.field338;
                int var3 = 0;
                if (this.field384 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field424[var4] != null) {
                        int var5 = this.field422[var4];
                        String var6 = this.field423[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field274 == 0 || this.field274 == 1 && this.method132((byte) 8, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method458((byte) -61, 0, var9, var8, "From");
                            var2.method458((byte) -61, 65535, var9, var8 - 1, "From");
                            int var10 = var9 + var2.method456("From ", 9);
                            if (var7 == 1) {
                                this.field297[0].method347(var10, var8 - 12, (byte) 2);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field297[1].method347(var10, var8 - 12, (byte) 2);
                                var10 += 14;
                            }
                            var2.method458((byte) -61, 0, var10, var8, var6 + ": " + this.field424[var4]);
                            var2.method458((byte) -61, 65535, var10, var8 - 1, var6 + ": " + this.field424[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field274 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method458((byte) -61, 0, 4, var11, this.field424[var4]);
                            var2.method458((byte) -61, 65535, 4, var11 - 1, this.field424[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field274 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method458((byte) -61, 0, 4, var12, "To " + var6 + ": " + this.field424[var4]);
                            var2.method458((byte) -61, 65535, 4, var12 - 1, "To " + var6 + ": " + this.field424[var4]);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(LHWEMRKQZ;I)V")
    public final void method111(class20 arg0, int arg1) {
        int var3 = arg0.field930;
        int var4 = 76 / arg1;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var6 = this.field610;
                if (this.field611 != 2) {
                    var6 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var6) {
                    arg0.field907 = "";
                    arg0.field884 = 0;
                } else {
                    if (this.field300[var3] == 0) {
                        arg0.field907 = "@red@Offline";
                    } else if (this.field300[var3] < 200) {
                        if (this.field300[var3] == field350) {
                            arg0.field907 = "@gre@World" + (this.field300[var3] - 9);
                        } else {
                            arg0.field907 = "@yel@World" + (this.field300[var3] - 9);
                        }
                    } else if (this.field300[var3] == field350) {
                        arg0.field907 = "@gre@Classic" + (this.field300[var3] - 219);
                    } else {
                        arg0.field907 = "@yel@Classic" + (this.field300[var3] - 219);
                    }
                    arg0.field884 = 1;
                }
            } else if (var3 == 203) {
                int var7 = this.field610;
                if (this.field611 != 2) {
                    var7 = 0;
                }
                arg0.field876 = var7 * 15 + 20;
                if (arg0.field876 <= arg0.field901) {
                    arg0.field876 = arg0.field901 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field611 == 0) {
                    arg0.field907 = "Loading ignore list";
                    arg0.field884 = 0;
                } else if (var3 == 1 && this.field611 == 0) {
                    arg0.field907 = "Please wait...";
                    arg0.field884 = 0;
                } else {
                    int var8 = this.field202;
                    if (this.field611 == 0) {
                        var8 = 0;
                    }
                    if (var3 >= var8) {
                        arg0.field907 = "";
                        arg0.field884 = 0;
                    } else {
                        arg0.field907 = class63.method585(class63.method582((byte) 57, this.field555[var3]), 0);
                        arg0.field884 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field876 = this.field202 * 15 + 20;
                if (arg0.field876 <= arg0.field901) {
                    arg0.field876 = arg0.field901 + 1;
                }
            } else if (var3 == 327) {
                arg0.field866 = 150;
                arg0.field867 = (int) (Math.sin((double) field502 / 40.0D) * 256.0D) & 2047;
                if (this.field536) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field268[var9];
                        if (var16 >= 0 && !class32.field1115[var16].method338(-908)) {
                            return;
                        }
                    }
                    this.field536 = false;
                    class3[] var10 = new class3[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field268[var12];
                        if (var15 >= 0) {
                            var10[var11++] = class32.field1115[var15].method339(0);
                        }
                    }
                    class3 var13 = new class3(var10, var11, 337);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field271[var14] != 0) {
                            var13.method25(field324[var14][0], field324[var14][this.field271[var14]]);
                            if (var14 == 1) {
                                var13.method25(field425[0], field425[this.field271[var14]]);
                            }
                        }
                    }
                    var13.method18(false);
                    var13.method19(class58.field1570[field499.field1148].field1572[0], (byte) -62);
                    var13.method28(64, 850, -30, -50, -30, true);
                    arg0.field937 = 5;
                    arg0.field938 = 0;
                    class20.method259(5, 0, 0, var13);
                }
            } else if (var3 == 324) {
                if (this.field542 == null) {
                    this.field542 = arg0.field861;
                    this.field543 = arg0.field904;
                }
                if (this.field277) {
                    arg0.field861 = this.field543;
                } else {
                    arg0.field861 = this.field542;
                }
            } else if (var3 == 325) {
                if (this.field542 == null) {
                    this.field542 = arg0.field861;
                    this.field543 = arg0.field904;
                }
                if (this.field277) {
                    arg0.field861 = this.field542;
                } else {
                    arg0.field861 = this.field543;
                }
            } else if (var3 == 600) {
                arg0.field907 = this.field597;
                if (field502 % 20 < 10) {
                    arg0.field907 = arg0.field907 + "|";
                } else {
                    arg0.field907 = arg0.field907 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field561 >= 1) {
                        if (this.field345) {
                            arg0.field931 = 16711680;
                            arg0.field907 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field931 = 16777215;
                            arg0.field907 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field907 = "";
                    }
                }
                if (var3 == 660) {
                    int var17 = this.field516 - this.field394;
                    String var18;
                    if (var17 <= 0) {
                        var18 = "earlier today";
                    } else if (var17 == 1) {
                        var18 = "yesterday";
                    } else {
                        var18 = var17 + " days ago";
                    }
                    arg0.field907 = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field270 == 0) {
                        arg0.field907 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field270 <= this.field516) {
                        arg0.field907 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method112(true, this.field270);
                    } else {
                        int var19 = this.field516 + 14 - this.field270;
                        String var20;
                        if (var19 <= 0) {
                            var20 = "Earlier today";
                        } else if (var19 == 1) {
                            var20 = "Yesterday";
                        } else {
                            var20 = var19 + " days ago";
                        }
                        arg0.field907 = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method112(true, this.field270) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var21;
                    if (this.field639 == 0) {
                        var21 = "@yel@0 unread messages";
                    } else if (this.field639 == 1) {
                        var21 = "@gre@1 unread message";
                    } else {
                        var21 = "@gre@" + this.field639 + " unread messages";
                    }
                    arg0.field907 = "You have " + var21 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field527 > 0 && this.field527 <= this.field516 + 10) {
                        arg0.field907 = "Last password change:\\n@gre@" + this.method112(true, this.field527);
                    } else {
                        arg0.field907 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field383 > 2 && !field352) {
                        arg0.field907 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field383 > 2) {
                        arg0.field907 = "\\n\\nYou have @gre@" + this.field383 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field383 > 0) {
                        arg0.field907 = "You have @gre@" + this.field383 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field907 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field383 > 2 && !field352) {
                        arg0.field907 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field383 > 0) {
                        arg0.field907 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field907 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field270 > this.field516) {
                        arg0.field907 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field907 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field611 == 0) {
            arg0.field907 = "Loading friend list";
            arg0.field884 = 0;
        } else if (var3 == 1 && this.field611 == 1) {
            arg0.field907 = "Connecting to friendserver";
            arg0.field884 = 0;
        } else if (var3 == 2 && this.field611 != 2) {
            arg0.field907 = "Please wait...";
            arg0.field884 = 0;
        } else {
            int var5 = this.field610;
            if (this.field611 != 2) {
                var5 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var5) {
                arg0.field907 = "";
                arg0.field884 = 0;
            } else {
                arg0.field907 = this.field398[var3];
                arg0.field884 = 1;
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(ZI)Ljava/lang/String;")
    public final String method112(boolean arg0, int arg1) {
        if (arg1 > this.field516 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            if (!arg0) {
                this.field161 = -1;
            }
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZIIIIIIII)V")
    private final void method113(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class29 var11 = null;
        for (class29 var12 = (class29) this.field335.method600(); var12 != null; var12 = (class29) this.field335.method602((byte) 3)) {
            if (var12.field1062 == arg9 && var12.field1064 == arg4 && var12.field1065 == arg5 && var12.field1063 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class29();
            var11.field1062 = arg9;
            var11.field1063 = arg7;
            var11.field1064 = arg4;
            var11.field1065 = arg5;
            this.method159(var11, (byte) 8);
            this.field335.method597(var11);
        }
        var11.field1067 = arg2;
        var11.field1069 = arg0;
        var11.field1068 = arg6;
        var11.field1070 = arg8;
        var11.field1066 = arg3;
        if (!arg1) {
            this.field406.method286(253);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(II)Ljava/lang/String;")
    private static final String method114(int arg0, int arg1) {
        int var2 = 32 / arg1;
        if (arg0 < 100000) {
            return String.valueOf(arg0);
        } else {
            return arg0 < 10000000 ? arg0 / 1000 + "K" : arg0 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(I)V")
    public final void method115(int arg0) {
        this.field391 = 0;
        int var2 = (field499.field1152 >> 7) + this.field255;
        int var3 = (field499.field1153 >> 7) + this.field256;
        int var4 = 6 / arg0;
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field391 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field391 = 1;
        }
        if (this.field391 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field391 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(I)V")
    public final void method116(int arg0) {
        Graphics var2 = this.method122(false).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 49719) {
            this.field622 = null;
        }
        var2.fillRect(0, 0, 765, 503);
        this.method222((byte) 29, 1);
        if (this.field314) {
            this.field279 = false;
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
        if (this.field280) {
            this.field279 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field299) {
            this.field279 = false;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IZ)Ljava/lang/String;")
    private static final String method117(int arg0, boolean arg1) {
        String var2 = String.valueOf(arg0);
        for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
            var2 = var2.substring(0, var3) + "," + var2.substring(var3);
        }
        if (!arg1) {
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

    @OriginalMember(owner = "client", name = "b", descriptor = "(IZI)Ljava/lang/String;")
    public static final String method118(int arg0, boolean arg1, int arg2) {
        if (arg1) {
            field278 = -303;
        }
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILMLYYHULT;)V")
    private final void method119(int arg0, int arg1, class30 arg2) {
        arg2.method306(0);
        while (arg1 >= 0) {
            this.field161 = arg2.method296();
        }
        int var4 = arg2.method307(1, 84);
        if (var4 != 0) {
            int var5 = arg2.method307(2, 84);
            if (var5 == 0) {
                this.field438[this.field437++] = this.field433;
            } else if (var5 == 1) {
                int var6 = arg2.method307(3, 84);
                field499.method351(var6, false, 5);
                int var7 = arg2.method307(1, 84);
                if (var7 == 1) {
                    this.field438[this.field437++] = this.field433;
                }
            } else if (var5 == 2) {
                int var8 = arg2.method307(3, 84);
                field499.method351(var8, true, 5);
                int var9 = arg2.method307(3, 84);
                field499.method351(var9, true, 5);
                int var10 = arg2.method307(1, 84);
                if (var10 == 1) {
                    this.field438[this.field437++] = this.field433;
                }
            } else if (var5 == 3) {
                int var11 = arg2.method307(7, 84);
                int var12 = arg2.method307(7, 84);
                this.field605 = arg2.method307(2, 84);
                int var13 = arg2.method307(1, 84);
                int var14 = arg2.method307(1, 84);
                if (var14 == 1) {
                    this.field438[this.field437++] = this.field433;
                }
                field499.method352(var11, true, var12, var13 == 1);
            }
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(Z)V")
    public final void method120(boolean arg0) {
        for (int var2 = 0; var2 < this.field562; ++var2) {
            if (this.field627[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field241[var2] == this.field334 && this.field581[var2] == this.field323) {
                        if (!this.method195(true)) {
                            var3 = true;
                        }
                    } else {
                        class30 var4 = class2.method2((byte) 9, this.field581[var2], this.field241[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1092 / 22) > (long) (this.field470 / 22) + this.field563) {
                            this.field470 = var4.field1092;
                            this.field563 = System.currentTimeMillis();
                            if (this.method181(-482, var4.field1092, var4.field1091)) {
                                this.field334 = this.field241[var2];
                                this.field323 = this.field581[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                }
                if (var3 && this.field627[var2] != -5) {
                    this.field627[var2] = -5;
                } else {
                    --this.field562;
                    for (int var6 = var2; var6 < this.field562; ++var6) {
                        this.field241[var6] = this.field241[var6 + 1];
                        this.field581[var6] = this.field581[var6 + 1];
                        this.field627[var6] = this.field627[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field627[var2]--;
            }
        }
        if (!arg0) {
            this.field406.method286(243);
        }
        if (this.field455 > 0) {
            this.field455 -= 20;
            if (this.field455 < 0) {
                this.field455 = 0;
            }
            if (this.field455 == 0 && this.field234 && !field353) {
                this.field183 = this.field569;
                this.field184 = true;
                this.field253.method237(2, this.field183);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(I)V")
    public void method121(int arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field453);
        if (this.field253 != null) {
            System.out.println("Od-cycle:" + this.field253.field772);
        }
        System.out.println("loop-cycle:" + field502);
        System.out.println("draw-cycle:" + field381);
        System.out.println("ptype:" + this.field161);
        System.out.println("psize:" + this.field160);
        if (this.field599 != null) {
            this.field599.method266(-36);
        }
        super.field712 = true;
        if (arg0 < 0) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Z)Ljava/awt/Component;")
    public final Component method122(boolean arg0) {
        if (arg0) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field718 != null ? super.field718 : this;
        }
    }

    @OriginalMember(owner = "client", name = "i", descriptor = "(Z)Z")
    public final boolean method123(boolean arg0) {
        this.field320 &= arg0;
        if (this.field599 == null) {
            return false;
        } else {
            try {
                int var2 = this.field599.method263();
                if (var2 == 0) {
                    return false;
                }
                if (this.field161 == -1) {
                    this.field599.method264(this.field177.field1091, 0, 1);
                    this.field161 = this.field177.field1091[0] & 255;
                    if (this.field541 != null) {
                        this.field161 = this.field161 - this.field541.method450() & 255;
                    }
                    this.field160 = class69.field1724[this.field161];
                    --var2;
                }
                if (this.field160 == -1) {
                    if (var2 <= 0) {
                        return false;
                    }
                    this.field599.method264(this.field177.field1091, 0, 1);
                    this.field160 = this.field177.field1091[0] & 255;
                    --var2;
                }
                if (this.field160 == -2) {
                    if (var2 <= 1) {
                        return false;
                    }
                    this.field599.method264(this.field177.field1091, 0, 2);
                    this.field177.field1092 = 0;
                    this.field160 = this.field177.method298();
                    var2 -= 2;
                }
                if (var2 < this.field160) {
                    return false;
                }
                this.field177.field1092 = 0;
                this.field599.method264(this.field177.field1091, 0, this.field160);
                this.field162 = 0;
                this.field387 = this.field386;
                this.field386 = this.field385;
                this.field385 = this.field161;
                if (this.field161 == 100) {
                    this.field208 = this.field177.method296();
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 229) {
                    int var3 = this.field177.method298();
                    if (var3 == 65535) {
                        var3 = -1;
                    }
                    if (this.field569 != var3 && this.field234 && !field353 && this.field455 == 0) {
                        this.field183 = var3;
                        this.field184 = true;
                        this.field253.method237(2, this.field183);
                    }
                    this.field569 = var3;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 22) {
                    int var4 = this.field177.method330(42287);
                    int var5 = this.field177.method324(-178);
                    if (this.field234 && !field353) {
                        this.field183 = var5;
                        this.field184 = false;
                        this.field253.method237(2, this.field183);
                        this.field455 = var4;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 192) {
                    for (int var6 = 0; var6 < this.field293.length; ++var6) {
                        if (this.field545[var6] != this.field293[var6]) {
                            this.field293[var6] = this.field545[var6];
                            this.method71(7, var6);
                            this.field489 = true;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 56) {
                    int var7 = this.field177.method325(584);
                    int var8 = this.field177.method324(-178);
                    int var9 = this.field177.method298();
                    int var10 = this.field177.method326(field278);
                    class20.method256(var9).field866 = var8;
                    class20.method256(var9).field867 = var7;
                    class20.method256(var9).field865 = var10;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 89) {
                    this.field489 = true;
                    int var11 = this.field177.method298();
                    class20 var12 = class20.method256(var11);
                    while (this.field177.field1092 < this.field160) {
                        int var13 = this.field177.method310();
                        int var14 = this.field177.method298();
                        int var15 = this.field177.method296();
                        if (var15 == 255) {
                            var15 = this.field177.method301();
                        }
                        if (var13 >= 0 && var13 < var12.field881.length) {
                            var12.field881[var13] = var14;
                            var12.field919[var13] = var15;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 190) {
                    this.field384 = this.field177.method326(field278) * 30;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 40 || this.field161 == 2 || this.field161 == 255 || this.field161 == 65 || this.field161 == 175 || this.field161 == 146 || this.field161 == 121 || this.field161 == 250 || this.field161 == 126 || this.field161 == 164 || this.field161 == 198) {
                    this.method129(this.field161, 47935, this.field177);
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 136) {
                    boolean var16 = this.field177.method317(false) == 1;
                    int var17 = this.field177.method298();
                    class20.method256(var17).field883 = var16;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 152 || this.field161 == 20) {
                    int var18 = this.field180;
                    int var19 = this.field181;
                    if (this.field161 == 152) {
                        var19 = this.field177.method326(field278);
                        var18 = this.field177.method326(field278);
                        this.field321 = false;
                    }
                    if (this.field161 == 20) {
                        this.field177.method306(0);
                        int var20 = 0;
                        while (true) {
                            if (var20 >= 4) {
                                this.field177.method308((byte) -108);
                                var18 = this.field177.method298();
                                var19 = this.field177.method324(-178);
                                this.field321 = true;
                                break;
                            }
                            for (int var21 = 0; var21 < 13; ++var21) {
                                for (int var22 = 0; var22 < 13; ++var22) {
                                    int var23 = this.field177.method307(1, 84);
                                    if (var23 == 1) {
                                        this.field341[var20][var21][var22] = this.field177.method307(26, 84);
                                    } else {
                                        this.field341[var20][var21][var22] = -1;
                                    }
                                }
                            }
                            ++var20;
                        }
                    }
                    if (this.field180 == var18 && this.field181 == var19 && this.field550 == 2) {
                        this.field161 = -1;
                        return true;
                    }
                    this.field180 = var18;
                    this.field181 = var19;
                    this.field255 = (this.field180 - 6) * 8;
                    this.field256 = (this.field181 - 6) * 8;
                    this.field302 = false;
                    if ((this.field180 / 8 == 48 || this.field180 / 8 == 49) && this.field181 / 8 == 48) {
                        this.field302 = true;
                    }
                    if (this.field180 / 8 == 48 && this.field181 / 8 == 148) {
                        this.field302 = true;
                    }
                    this.field550 = 1;
                    this.field201 = System.currentTimeMillis();
                    this.method177("Loading - please wait.", false, (String) null);
                    if (this.field161 == 152) {
                        int var24 = 0;
                        int var25 = (this.field180 - 6) / 8;
                        label1249: while (true) {
                            if (var25 > (this.field180 + 6) / 8) {
                                this.field368 = new byte[var24][];
                                this.field616 = new byte[var24][];
                                this.field504 = new int[var24];
                                this.field505 = new int[var24];
                                this.field506 = new int[var24];
                                int var27 = 0;
                                int var28 = (this.field180 - 6) / 8;
                                while (true) {
                                    if (var28 > (this.field180 + 6) / 8) {
                                        break label1249;
                                    }
                                    for (int var29 = (this.field181 - 6) / 8; var29 <= (this.field181 + 6) / 8; ++var29) {
                                        this.field504[var27] = (var28 << 8) + var29;
                                        if (this.field302 && (var29 == 49 || var29 == 149 || var29 == 147 || var28 == 50 || var28 == 49 && var29 == 47)) {
                                            this.field505[var27] = -1;
                                            this.field506[var27] = -1;
                                            ++var27;
                                        } else {
                                            int var30 = this.field505[var27] = this.field253.method235(var29, var28, 0, 949);
                                            if (var30 != -1) {
                                                this.field253.method237(3, var30);
                                            }
                                            int var31 = this.field506[var27] = this.field253.method235(var29, var28, 1, 949);
                                            if (var31 != -1) {
                                                this.field253.method237(3, var31);
                                            }
                                            ++var27;
                                        }
                                    }
                                    ++var28;
                                }
                            }
                            for (int var26 = (this.field181 - 6) / 8; var26 <= (this.field181 + 6) / 8; ++var26) {
                                ++var24;
                            }
                            ++var25;
                        }
                    }
                    if (this.field161 == 20) {
                        int var32 = 0;
                        int[] var33 = new int[676];
                        int var34 = 0;
                        label1210: while (true) {
                            if (var34 >= 4) {
                                this.field368 = new byte[var32][];
                                this.field616 = new byte[var32][];
                                this.field504 = new int[var32];
                                this.field505 = new int[var32];
                                this.field506 = new int[var32];
                                int var42 = 0;
                                while (true) {
                                    if (var42 >= var32) {
                                        break label1210;
                                    }
                                    int var43 = this.field504[var42] = var33[var42];
                                    int var44 = var43 >> 8 & 255;
                                    int var45 = var43 & 255;
                                    int var46 = this.field505[var42] = this.field253.method235(var45, var44, 0, 949);
                                    if (var46 != -1) {
                                        this.field253.method237(3, var46);
                                    }
                                    int var47 = this.field506[var42] = this.field253.method235(var45, var44, 1, 949);
                                    if (var47 != -1) {
                                        this.field253.method237(3, var47);
                                    }
                                    ++var42;
                                }
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field341[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 14 & 1023;
                                        int var39 = var37 >> 3 & 2047;
                                        int var40 = (var38 / 8 << 8) + var39 / 8;
                                        for (int var41 = 0; var41 < var32; ++var41) {
                                            if (var33[var41] == var40) {
                                                var40 = -1;
                                                break;
                                            }
                                        }
                                        if (var40 != -1) {
                                            var33[var32++] = var40;
                                        }
                                    }
                                }
                            }
                            ++var34;
                        }
                    }
                    int var48 = this.field255 - this.field257;
                    int var49 = this.field256 - this.field258;
                    this.field257 = this.field255;
                    this.field258 = this.field256;
                    for (int var50 = 0; var50 < 16384; ++var50) {
                        class23 var51 = this.field265[var50];
                        if (var51 != null) {
                            for (int var52 = 0; var52 < 10; ++var52) {
                                var51.field1140[var52] -= var48;
                                var51.field1141[var52] -= var49;
                            }
                            var51.field1152 -= var48 * 128;
                            var51.field1153 -= var49 * 128;
                        }
                    }
                    for (int var53 = 0; var53 < this.field432; ++var53) {
                        class4 var54 = this.field434[var53];
                        if (var54 != null) {
                            for (int var55 = 0; var55 < 10; ++var55) {
                                var54.field1140[var55] -= var48;
                                var54.field1141[var55] -= var49;
                            }
                            var54.field1152 -= var48 * 128;
                            var54.field1153 -= var49 * 128;
                        }
                    }
                    this.field570 = true;
                    byte var56 = 0;
                    byte var57 = 104;
                    byte var58 = 1;
                    if (var48 < 0) {
                        var56 = 103;
                        var57 = -1;
                        var58 = -1;
                    }
                    byte var59 = 0;
                    byte var60 = 104;
                    byte var61 = 1;
                    if (var49 < 0) {
                        var59 = 103;
                        var60 = -1;
                        var61 = -1;
                    }
                    for (int var62 = var56; var57 != var62; var62 += var58) {
                        for (int var63 = var59; var60 != var63; var63 += var61) {
                            int var64 = var48 + var62;
                            int var65 = var49 + var63;
                            for (int var66 = 0; var66 < 4; ++var66) {
                                if (var64 >= 0 && var65 >= 0 && var64 < 104 && var65 < 104) {
                                    this.field622[var66][var62][var63] = this.field622[var66][var64][var65];
                                } else {
                                    this.field622[var66][var62][var63] = null;
                                }
                            }
                        }
                    }
                    for (class29 var67 = (class29) this.field335.method600(); var67 != null; var67 = (class29) this.field335.method602((byte) 3)) {
                        var67.field1064 -= var48;
                        var67.field1065 -= var49;
                        if (var67.field1064 < 0 || var67.field1065 < 0 || var67.field1064 >= 104 || var67.field1065 >= 104) {
                            var67.method367();
                        }
                    }
                    if (this.field493 != 0) {
                        this.field493 -= var48;
                        this.field494 -= var49;
                    }
                    this.field159 = false;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 62) {
                    int var68 = this.field177.method298();
                    int var69 = this.field177.method325(584);
                    if (this.field585 != -1) {
                        this.method158(this.field585, 35928);
                        this.field585 = -1;
                        this.field511 = true;
                    }
                    if (this.field369 != -1) {
                        this.method158(this.field369, 35928);
                        this.field369 = -1;
                        this.field446 = true;
                    }
                    if (this.field217 != -1) {
                        this.method158(this.field217, 35928);
                        this.field217 = -1;
                    }
                    if (this.field207 != var69) {
                        this.method158(this.field207, 35928);
                        this.field207 = var69;
                    }
                    if (this.field521 != var68) {
                        this.method158(this.field521, 35928);
                        this.field521 = var68;
                    }
                    if (this.field348 != 0) {
                        this.field348 = 0;
                        this.field511 = true;
                    }
                    this.field489 = true;
                    this.field469 = true;
                    this.field440 = false;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 181) {
                    this.field159 = true;
                    this.field193 = this.field177.method296();
                    this.field194 = this.field177.method296();
                    this.field195 = this.field177.method298();
                    this.field196 = this.field177.method296();
                    this.field197 = this.field177.method296();
                    if (this.field197 >= 100) {
                        this.field617 = this.field193 * 128 + 64;
                        this.field619 = this.field194 * 128 + 64;
                        this.field618 = this.method80(this.field605, this.field617, this.field619, 9) - this.field195;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 53) {
                    int var70 = this.field177.method326(field278);
                    int var71 = this.field177.method324(-178);
                    class20.method256(var71).field937 = 2;
                    class20.method256(var71).field938 = var70;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 49) {
                    int var72 = this.field177.method315(0);
                    int var73 = this.field177.method298();
                    if (var73 == 65535) {
                        var73 = -1;
                    }
                    if (this.field587[var72] != var73) {
                        this.method158(this.field587[var72], 35928);
                        this.field587[var72] = var73;
                    }
                    this.field489 = true;
                    this.field469 = true;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 150) {
                    byte var74 = this.field177.method297();
                    int var75 = this.field177.method298();
                    this.field545[var75] = var74;
                    if (this.field293[var75] != var74) {
                        this.field293[var75] = var74;
                        this.method71(7, var75);
                        this.field489 = true;
                        if (this.field615 != -1) {
                            this.field511 = true;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 58) {
                    this.field202 = this.field160 / 8;
                    for (int var76 = 0; var76 < this.field202; ++var76) {
                        this.field555[var76] = this.field177.method302((byte) 2);
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 128) {
                    this.field489 = true;
                    int var77 = this.field177.method331(-32869);
                    int var78 = this.field177.method315(0);
                    int var79 = this.field177.method317(false);
                    this.field497[var79] = var77;
                    this.field492[var79] = var78;
                    this.field626[var79] = 1;
                    for (int var80 = 0; var80 < 98; ++var80) {
                        if (var77 >= field158[var80]) {
                            this.field626[var79] = var80 + 2;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 137) {
                    this.field159 = false;
                    for (int var81 = 0; var81 < 5; ++var81) {
                        this.field211[var81] = false;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 148) {
                    this.field485 = this.field177.method296();
                    this.field274 = this.field177.method296();
                    this.field636 = this.field177.method296();
                    this.field392 = true;
                    this.field511 = true;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 216) {
                    int var82 = this.field177.method296();
                    int var83 = this.field177.method317(false);
                    String var84 = this.field177.method303();
                    if (var82 >= 1 && var82 <= 5) {
                        if (var84.equalsIgnoreCase("null")) {
                            var84 = null;
                        }
                        this.field388[var82 - 1] = var84;
                        this.field389[var82 - 1] = var83 == 0;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 86) {
                    int var85 = this.field177.method296();
                    int var86 = this.field177.method296();
                    int var87 = this.field177.method296();
                    int var88 = this.field177.method296();
                    this.field211[var85] = true;
                    this.field199[var85] = var86;
                    this.field360[var85] = var87;
                    this.field603[var85] = var88;
                    this.field171[var85] = 0;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 60) {
                    int var89 = this.field177.method328((byte) -95);
                    if (var89 >= 0) {
                        this.method155(20489, var89);
                    }
                    if (this.field498 != var89) {
                        this.method158(this.field498, 35928);
                        this.field498 = var89;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 35) {
                    int var90 = this.field177.method325(584);
                    int var91 = this.field177.method298();
                    class20 var92 = class20.method256(var91);
                    if (var92 != null && var92.field877 == 0) {
                        if (var90 < 0) {
                            var90 = 0;
                        }
                        if (var90 > var92.field876 - var92.field901) {
                            var90 = var92.field876 - var92.field901;
                        }
                        var92.field916 = var90;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 64) {
                    int var93 = this.field177.method298();
                    int var94 = this.field177.method327(-957);
                    int var95 = this.field177.method329(0);
                    class20 var96 = class20.method256(var93);
                    var96.field873 = var94;
                    var96.field934 = var95;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 251) {
                    this.field476 = this.field177.method324(-178);
                    this.field507 = this.field177.method317(false);
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 25) {
                    this.field611 = this.field177.method296();
                    this.field489 = true;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 205) {
                    this.field471 = this.field177.method331(-32869);
                    this.field394 = this.field177.method298();
                    this.field516 = this.field177.method324(-178);
                    this.field639 = this.field177.method298();
                    this.field186 = this.field177.method326(field278);
                    this.field177.method315(0);
                    this.field527 = this.field177.method324(-178);
                    this.field177.method298();
                    this.field383 = this.field177.method326(field278);
                    this.field270 = this.field177.method325(584);
                    this.field528 = this.field177.method298();
                    signlink.dnslookup(class63.method584(true, this.field471));
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 106) {
                    int var97 = this.field177.method324(-178);
                    int var98 = this.field177.method298();
                    int var99 = this.field177.method298();
                    if (var97 == 65535) {
                        class20.method256(var98).field937 = 0;
                        this.field161 = -1;
                        return true;
                    }
                    class40 var100 = class40.method418(var97);
                    class20.method256(var98).field937 = 4;
                    class20.method256(var98).field938 = var97;
                    class20.method256(var98).field866 = var100.field1244;
                    class20.method256(var98).field867 = var100.field1270;
                    class20.method256(var98).field865 = var100.field1259 * 100 / var99;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 15) {
                    int var101 = this.field177.method298();
                    int var102 = this.field177.method325(584);
                    this.method155(20489, var101);
                    if (var102 != -1) {
                        this.method155(20489, var102);
                    }
                    if (this.field207 != -1) {
                        this.method158(this.field207, 35928);
                        this.field207 = -1;
                    }
                    if (this.field521 != -1) {
                        this.method158(this.field521, 35928);
                        this.field521 = -1;
                    }
                    if (this.field585 != -1) {
                        this.method158(this.field585, 35928);
                        this.field585 = -1;
                    }
                    if (this.field369 != var101) {
                        this.method158(this.field369, 35928);
                        this.field369 = var101;
                    }
                    if (this.field217 != var101) {
                        this.method158(this.field217, 35928);
                        this.field217 = var102;
                    }
                    this.field348 = 0;
                    this.field440 = false;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 219) {
                    this.field602 = this.field177.method296();
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 172) {
                    this.method140(this.field160, this.field177, false);
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 66) {
                    int var103 = this.field177.method298();
                    class20 var104 = class20.method256(var103);
                    for (int var105 = 0; var105 < var104.field881.length; ++var105) {
                        var104.field881[var105] = -1;
                        var104.field881[var105] = 0;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 84) {
                    int var106 = this.field177.method325(584);
                    int var107 = this.field177.method298();
                    class20.method256(var107).field937 = 1;
                    class20.method256(var107).field938 = var106;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 176) {
                    long var108 = this.field177.method302((byte) 2);
                    int var110 = this.field177.method301();
                    int var111 = this.field177.method296();
                    boolean var112 = false;
                    for (int var113 = 0; var113 < 100; ++var113) {
                        if (this.field624[var113] == var110) {
                            var112 = true;
                            break;
                        }
                    }
                    if (var111 <= 1) {
                        for (int var114 = 0; var114 < this.field202; ++var114) {
                            if (this.field555[var114] == var108) {
                                var112 = true;
                                break;
                            }
                        }
                    }
                    if (!var112 && this.field391 == 0) {
                        try {
                            this.field624[this.field454] = var110;
                            this.field454 = (this.field454 + 1) % 100;
                            String var115 = class17.method245(0, this.field177, this.field160 - 13);
                            if (var111 != 3) {
                                var115 = class39.method378(0, var115);
                            }
                            if (var111 != 2 && var111 != 3) {
                                if (var111 == 1) {
                                    this.method69(7, "@cr1@" + class63.method585(class63.method582((byte) 57, var108), 0), var115, -113);
                                } else {
                                    this.method69(3, class63.method585(class63.method582((byte) 57, var108), 0), var115, -113);
                                }
                            } else {
                                this.method69(7, "@cr2@" + class63.method585(class63.method582((byte) 57, var108), 0), var115, -113);
                            }
                        } catch (Exception var190) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 197) {
                    long var117 = this.field177.method302((byte) 2);
                    int var119 = this.field177.method296();
                    String var120 = class63.method585(class63.method582((byte) 57, var117), 0);
                    for (int var121 = 0; var121 < this.field610; ++var121) {
                        if (this.field515[var121] == var117) {
                            if (this.field300[var121] != var119) {
                                this.field300[var121] = var119;
                                this.field489 = true;
                                if (var119 > 0) {
                                    this.method69(5, "", var120 + " has logged in.", -113);
                                }
                                if (var119 == 0) {
                                    this.method69(5, "", var120 + " has logged out.", -113);
                                }
                            }
                            var120 = null;
                            break;
                        }
                    }
                    if (var120 != null && this.field610 < 200) {
                        this.field515[this.field610] = var117;
                        this.field398[this.field610] = var120;
                        this.field300[this.field610] = var119;
                        ++this.field610;
                        this.field489 = true;
                    }
                    boolean var122 = false;
                    while (!var122) {
                        var122 = true;
                        for (int var123 = 0; var123 < this.field610 - 1; ++var123) {
                            if (this.field300[var123] != field350 && this.field300[var123 + 1] == field350 || this.field300[var123] == 0 && this.field300[var123 + 1] != 0) {
                                int var124 = this.field300[var123];
                                this.field300[var123] = this.field300[var123 + 1];
                                this.field300[var123 + 1] = var124;
                                String var125 = this.field398[var123];
                                this.field398[var123] = this.field398[var123 + 1];
                                this.field398[var123 + 1] = var125;
                                long var126 = this.field515[var123];
                                this.field515[var123] = this.field515[var123 + 1];
                                this.field515[var123 + 1] = var126;
                                this.field489 = true;
                                var122 = false;
                            }
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 223) {
                    String var128 = this.field177.method303();
                    int var129 = this.field177.method324(-178);
                    class20.method256(var129).field907 = var128;
                    int var10001 = this.field587[this.field233];
                    if (class20.method256(var129).field917 == var10001) {
                        this.field489 = true;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 37) {
                    this.method67(this.field160, this.field177, (byte) 4);
                    this.field570 = false;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 158) {
                    int var130 = this.field177.method298();
                    int var131 = this.field177.method326(field278);
                    int var132 = this.field177.method324(-178);
                    class20.method256(var130).field912 = (var132 << 16) + var131;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 46) {
                    int var133 = this.field177.method298();
                    int var134 = this.field177.method324(-178);
                    int var135 = var133 >> 10 & 31;
                    int var136 = var133 >> 5 & 31;
                    int var137 = var133 & 31;
                    class20.method256(var134).field931 = (var137 << 3) + (var135 << 19) + (var136 << 11);
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 1) {
                    int var138 = this.field177.method327(-957);
                    int var139 = this.field177.method324(-178);
                    class20 var140 = class20.method256(var139);
                    if (var140.field878 != var138 || var138 == -1) {
                        var140.field878 = var138;
                        var140.field929 = 0;
                        var140.field906 = 0;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 168) {
                    for (int var141 = 0; var141 < this.field434.length; ++var141) {
                        if (this.field434[var141] != null) {
                            this.field434[var141].field1182 = -1;
                        }
                    }
                    for (int var142 = 0; var142 < this.field265.length; ++var142) {
                        if (this.field265[var142] != null) {
                            this.field265[var142].field1182 = -1;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 165) {
                    if (this.field233 == 12) {
                        this.field489 = true;
                    }
                    this.field187 = this.field177.method296();
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 129) {
                    this.field156 = this.field177.method296();
                    if (this.field233 == this.field156) {
                        if (this.field156 == 3) {
                            this.field233 = 1;
                        } else {
                            this.field233 = 3;
                        }
                        this.field489 = true;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 144) {
                    int var143 = this.field177.method327(-957);
                    if (this.field615 != var143) {
                        this.method158(this.field615, 35928);
                        this.field615 = var143;
                    }
                    this.field511 = true;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 104) {
                    int var144 = this.field177.method298();
                    int var145 = this.field177.method296();
                    int var146 = this.field177.method298();
                    if (this.field358 && !field353 && this.field562 < 50) {
                        this.field241[this.field562] = var144;
                        this.field581[this.field562] = var145;
                        this.field627[this.field562] = class2.field8[var144] + var146;
                        ++this.field562;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 52) {
                    this.field493 = 0;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 124) {
                    this.field417 = false;
                    this.field348 = 2;
                    this.field382 = "";
                    this.field511 = true;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 118) {
                    int var147 = this.field177.method325(584);
                    this.method155(20489, var147);
                    if (this.field521 != -1) {
                        this.method158(this.field521, 35928);
                        this.field521 = -1;
                        this.field489 = true;
                        this.field469 = true;
                    }
                    if (this.field369 != -1) {
                        this.method158(this.field369, 35928);
                        this.field369 = -1;
                        this.field446 = true;
                    }
                    if (this.field217 != -1) {
                        this.method158(this.field217, 35928);
                        this.field217 = -1;
                    }
                    if (this.field207 != -1) {
                        this.method158(this.field207, 35928);
                        this.field207 = -1;
                    }
                    if (this.field585 != var147) {
                        this.method158(this.field585, 35928);
                        this.field585 = var147;
                    }
                    this.field440 = false;
                    this.field511 = true;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 242) {
                    String var148 = this.field177.method303();
                    if (var148.endsWith(":tradereq:")) {
                        String var149 = var148.substring(0, var148.indexOf(":"));
                        long var150 = class63.method581(var149);
                        boolean var152 = false;
                        for (int var153 = 0; var153 < this.field202; ++var153) {
                            if (this.field555[var153] == var150) {
                                var152 = true;
                                break;
                            }
                        }
                        if (!var152 && this.field391 == 0) {
                            this.method69(4, var149, "wishes to trade with you.", -113);
                        }
                    } else if (var148.endsWith(":duelreq:")) {
                        String var154 = var148.substring(0, var148.indexOf(":"));
                        long var155 = class63.method581(var154);
                        boolean var157 = false;
                        for (int var158 = 0; var158 < this.field202; ++var158) {
                            if (this.field555[var158] == var155) {
                                var157 = true;
                                break;
                            }
                        }
                        if (!var157 && this.field391 == 0) {
                            this.method69(8, var154, "wishes to duel with you.", -113);
                        }
                    } else if (!var148.endsWith(":chalreq:")) {
                        this.method69(0, "", var148, -113);
                    } else {
                        String var159 = var148.substring(0, var148.indexOf(":"));
                        long var160 = class63.method581(var159);
                        boolean var162 = false;
                        for (int var163 = 0; var163 < this.field202; ++var163) {
                            if (this.field555[var163] == var160) {
                                var162 = true;
                                break;
                            }
                        }
                        if (!var162 && this.field391 == 0) {
                            String var164 = var148.substring(var148.indexOf(":") + 1, var148.length() - 9);
                            this.method69(8, var159, var164, -113);
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 14) {
                    int var165 = this.field177.method298();
                    this.method155(20489, var165);
                    if (this.field521 != -1) {
                        this.method158(this.field521, 35928);
                        this.field521 = -1;
                        this.field489 = true;
                        this.field469 = true;
                    }
                    if (this.field585 != -1) {
                        this.method158(this.field585, 35928);
                        this.field585 = -1;
                        this.field511 = true;
                    }
                    if (this.field369 != -1) {
                        this.method158(this.field369, 35928);
                        this.field369 = -1;
                        this.field446 = true;
                    }
                    if (this.field217 != -1) {
                        this.method158(this.field217, 35928);
                        this.field217 = -1;
                    }
                    if (this.field207 != var165) {
                        this.method158(this.field207, 35928);
                        this.field207 = var165;
                    }
                    if (this.field348 != 0) {
                        this.field348 = 0;
                        this.field511 = true;
                    }
                    this.field440 = false;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 241) {
                    this.field564 = this.field177.method316(5715);
                    this.field565 = this.field177.method316(5715);
                    for (int var166 = this.field564; var166 < this.field564 + 8; ++var166) {
                        for (int var167 = this.field565; var167 < this.field565 + 8; ++var167) {
                            if (this.field622[this.field605][var166][var167] != null) {
                                this.field622[this.field605][var166][var167] = null;
                                this.method199(var166, var167);
                            }
                        }
                    }
                    for (class29 var168 = (class29) this.field335.method600(); var168 != null; var168 = (class29) this.field335.method602((byte) 3)) {
                        if (var168.field1064 >= this.field564 && var168.field1064 < this.field564 + 8 && var168.field1065 >= this.field565 && var168.field1065 < this.field565 + 8 && this.field605 == var168.field1062) {
                            var168.field1066 = 0;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 71) {
                    int var169 = this.field177.method324(-178);
                    this.method155(20489, var169);
                    if (this.field585 != -1) {
                        this.method158(this.field585, 35928);
                        this.field585 = -1;
                        this.field511 = true;
                    }
                    if (this.field369 != -1) {
                        this.method158(this.field369, 35928);
                        this.field369 = -1;
                        this.field446 = true;
                    }
                    if (this.field217 != -1) {
                        this.method158(this.field217, 35928);
                        this.field217 = -1;
                    }
                    if (this.field207 != -1) {
                        this.method158(this.field207, 35928);
                        this.field207 = -1;
                    }
                    if (this.field521 != var169) {
                        this.method158(this.field521, 35928);
                        this.field521 = var169;
                    }
                    if (this.field348 != 0) {
                        this.field348 = 0;
                        this.field511 = true;
                    }
                    this.field489 = true;
                    this.field469 = true;
                    this.field440 = false;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 253) {
                    if (this.field521 != -1) {
                        this.method158(this.field521, 35928);
                        this.field521 = -1;
                        this.field489 = true;
                        this.field469 = true;
                    }
                    if (this.field585 != -1) {
                        this.method158(this.field585, 35928);
                        this.field585 = -1;
                        this.field511 = true;
                    }
                    if (this.field369 != -1) {
                        this.method158(this.field369, 35928);
                        this.field369 = -1;
                        this.field446 = true;
                    }
                    if (this.field217 != -1) {
                        this.method158(this.field217, 35928);
                        this.field217 = -1;
                    }
                    if (this.field207 != -1) {
                        this.method158(this.field207, 35928);
                        this.field207 = -1;
                    }
                    if (this.field348 != 0) {
                        this.field348 = 0;
                        this.field511 = true;
                    }
                    this.field440 = false;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 153) {
                    this.field203 = this.field177.method296();
                    if (this.field203 == 1) {
                        this.field473 = this.field177.method298();
                    }
                    if (this.field203 >= 2 && this.field203 <= 6) {
                        if (this.field203 == 2) {
                            this.field249 = 64;
                            this.field250 = 64;
                        }
                        if (this.field203 == 3) {
                            this.field249 = 0;
                            this.field250 = 64;
                        }
                        if (this.field203 == 4) {
                            this.field249 = 128;
                            this.field250 = 64;
                        }
                        if (this.field203 == 5) {
                            this.field249 = 64;
                            this.field250 = 0;
                        }
                        if (this.field203 == 6) {
                            this.field249 = 64;
                            this.field250 = 128;
                        }
                        this.field203 = 2;
                        this.field246 = this.field177.method298();
                        this.field247 = this.field177.method298();
                        this.field248 = this.field177.method296();
                    }
                    if (this.field203 == 10) {
                        this.field537 = this.field177.method298();
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 243) {
                    this.field565 = this.field177.method296();
                    this.field564 = this.field177.method315(0);
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 16) {
                    this.field565 = this.field177.method315(0);
                    this.field564 = this.field177.method317(false);
                    while (this.field177.field1092 < this.field160) {
                        int var170 = this.field177.method296();
                        this.method129(var170, 47935, this.field177);
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 179) {
                    if (this.field233 == 12) {
                        this.field489 = true;
                    }
                    this.field441 = this.field177.method299();
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 125) {
                    this.field233 = this.field177.method315(0);
                    this.field489 = true;
                    this.field469 = true;
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 5) {
                    this.method176(2);
                    this.field161 = -1;
                    return false;
                }
                if (this.field161 == 32) {
                    int var171 = this.field177.method298();
                    int var172 = this.field177.method333(false);
                    this.field545[var171] = var172;
                    if (this.field293[var171] != var172) {
                        this.field293[var171] = var172;
                        this.method71(7, var171);
                        this.field489 = true;
                        if (this.field615 != -1) {
                            this.field511 = true;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 96) {
                    this.field159 = true;
                    this.field306 = this.field177.method296();
                    this.field307 = this.field177.method296();
                    this.field308 = this.field177.method298();
                    this.field309 = this.field177.method296();
                    this.field310 = this.field177.method296();
                    if (this.field310 >= 100) {
                        int var173 = this.field306 * 128 + 64;
                        int var174 = this.field307 * 128 + 64;
                        int var175 = this.method80(this.field605, var173, var174, 9) - this.field308;
                        int var176 = var173 - this.field617;
                        int var177 = var175 - this.field618;
                        int var178 = var174 - this.field619;
                        int var179 = (int) Math.sqrt((double) (var176 * var176 + var178 * var178));
                        this.field620 = (int) (Math.atan2((double) var177, (double) var179) * 325.949D) & 2047;
                        this.field621 = (int) (Math.atan2((double) var176, (double) var178) * -325.949D) & 2047;
                        if (this.field620 < 128) {
                            this.field620 = 128;
                        }
                        if (this.field620 > 383) {
                            this.field620 = 383;
                        }
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 30) {
                    int var180 = this.field177.method325(584);
                    class20.method256(var180).field937 = 3;
                    if (field499.field105 == null) {
                        class20.method256(var180).field938 = (field499.field99[11] << 5) + (field499.field99[8] << 10) + (field499.field99[0] << 15) + (field499.field103[0] << 25) + (field499.field103[4] << 20) + field499.field99[1];
                    } else {
                        class20.method256(var180).field938 = (int) (field499.field105.field1613 + 305419896L);
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 206) {
                    this.field489 = true;
                    int var181 = this.field177.method298();
                    class20 var182 = class20.method256(var181);
                    int var183 = this.field177.method298();
                    for (int var184 = 0; var184 < var183; ++var184) {
                        var182.field881[var184] = this.field177.method298();
                        int var185 = this.field177.method315(0);
                        if (var185 == 255) {
                            var185 = this.field177.method301();
                        }
                        var182.field919[var184] = var185;
                    }
                    for (int var186 = var183; var186 < var182.field881.length; ++var186) {
                        var182.field881[var186] = 0;
                        var182.field919[var186] = 0;
                    }
                    this.field161 = -1;
                    return true;
                }
                if (this.field161 == 114) {
                    this.field417 = false;
                    this.field348 = 1;
                    this.field382 = "";
                    this.field511 = true;
                    this.field161 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field161 + "," + this.field160 + " - " + this.field386 + "," + this.field387);
                this.method176(2);
            } catch (IOException var191) {
                this.method78((byte) 33);
            } catch (Exception var192) {
                String var188 = "T2 - " + this.field161 + "," + this.field386 + "," + this.field387 + " - " + this.field160 + "," + (field499.field1140[0] + this.field255) + "," + (field499.field1141[0] + this.field256) + " - ";
                for (int var189 = 0; var189 < this.field160 && var189 < 50; ++var189) {
                    var188 = var188 + this.field177.field1091[var189] + ",";
                }
                signlink.reporterror(var188);
                this.method176(2);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(II)V")
    public final void method124(int arg0, int arg1) {
        if (arg1 >= 0) {
            int var3 = this.field229[arg1];
            int var4 = this.field230[arg1];
            int var5 = this.field231[arg1];
            int var6 = this.field232[arg1];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field348 != 0 && var5 != 1921) {
                this.field348 = 0;
                this.field511 = true;
            }
            if (var5 == 766) {
                this.method65(var3, this.field635, var4, var6);
                this.field406.method285(217, 132);
                this.field406.method323((byte) 2, this.field255 + var3);
                this.field406.method321(this.field256 + var4, (byte) 1);
                this.field406.method321(var6 >> 14 & 32767, (byte) 1);
            }
            if (var5 == 790) {
                this.field406.method285(208, 132);
                this.field406.method287(var4);
                class20 var7 = class20.method256(var4);
                if (var7.field932 != null && var7.field932[0][0] == 5) {
                    int var8 = var7.field932[0][1];
                    this.field293[var8] = 1 - this.field293[var8];
                    this.method71(7, var8);
                    this.field489 = true;
                }
            }
            if (var5 == 24) {
                class23 var9 = this.field265[var6];
                if (var9 != null) {
                    this.method64(2, false, 0, 0, 1, var9.field1140[0], 1, 0, var9.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                    this.field557 = super.field730;
                    this.field558 = super.field731;
                    this.field560 = 2;
                    this.field559 = 0;
                    this.field406.method285(76, 132);
                    this.field406.method323((byte) 2, var6);
                }
            }
            if (var5 == 951) {
                this.field406.method285(208, 132);
                this.field406.method287(var4);
                class20 var10 = class20.method256(var4);
                if (var10.field932 != null && var10.field932[0][0] == 5) {
                    int var11 = var10.field932[0][1];
                    if (this.field293[var11] != var10.field895[0]) {
                        this.field293[var11] = var10.field895[0];
                        this.method71(7, var11);
                        this.field489 = true;
                    }
                }
            }
            if (var5 == 1577) {
                this.method65(var3, this.field635, var4, var6);
                this.field406.method285(206, 132);
                this.field406.method323((byte) 2, this.field255 + var3);
                this.field406.method321(this.field256 + var4, (byte) 1);
                this.field406.method287(var6 >> 14 & 32767);
            }
            if (var5 == 208) {
                this.method107((byte) 6);
            }
            if (var5 == 1335) {
                class23 var12 = this.field265[var6];
                if (var12 != null) {
                    class60 var13 = var12.field951;
                    if (var13.field1618 != null) {
                        var13 = var13.method570(0);
                    }
                    if (var13 != null) {
                        String var14;
                        if (var13.field1632 != null) {
                            var14 = new String(var13.field1632);
                        } else {
                            var14 = "It's a " + var13.field1609 + ".";
                        }
                        this.method69(0, "", var14, -113);
                    }
                }
            }
            if (var5 == 696 || var5 == 379 || var5 == 526 || var5 == 212) {
                String var15 = this.field606[arg1];
                int var16 = var15.indexOf("@whi@");
                if (var16 != -1) {
                    long var17 = class63.method581(var15.substring(var16 + 5).trim());
                    if (var5 == 696) {
                        this.method154((byte) 6, var17);
                    }
                    if (var5 == 379) {
                        this.method167(465, var17);
                    }
                    if (var5 == 526) {
                        this.method102((byte) 0, var17);
                    }
                    if (var5 == 212) {
                        this.method105(var17, this.field363);
                    }
                }
            }
            if (var5 == 582) {
                class20 var19 = class20.method256(var4);
                this.field427 = 1;
                this.field428 = var4;
                this.field429 = var19.field925;
                this.field399 = 0;
                this.field489 = true;
                String var20 = var19.field922;
                if (var20.indexOf(" ") != -1) {
                    var20 = var20.substring(0, var20.indexOf(" "));
                }
                String var21 = var19.field922;
                if (var21.indexOf(" ") != -1) {
                    var21 = var21.substring(var21.indexOf(" ") + 1);
                }
                this.field430 = var20 + " " + var19.field905 + " " + var21;
                if (this.field429 == 16) {
                    this.field489 = true;
                    this.field233 = 3;
                    this.field469 = true;
                }
            } else {
                if (var5 == 621) {
                    class4 var22 = this.field434[var6];
                    if (var22 != null) {
                        this.method64(2, false, 0, 0, 1, var22.field1140[0], 1, 0, var22.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(170, 132);
                        this.field406.method322(this.field428, 0);
                        this.field406.method287(var6);
                    }
                }
                if (var5 == 184) {
                    boolean var23 = this.method64(2, false, 0, 0, 0, var3, 0, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    if (!var23) {
                        this.method64(2, false, 0, 0, 1, var3, 1, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    }
                    this.field557 = super.field730;
                    this.field558 = super.field731;
                    this.field560 = 2;
                    this.field559 = 0;
                    this.field406.method285(41, 132);
                    this.field406.method287(var6);
                    this.field406.method323((byte) 2, this.field256 + var4);
                    this.field406.method287(this.field255 + var3);
                }
                if (var5 == 851) {
                    class23 var25 = this.field265[var6];
                    if (var25 != null) {
                        this.method64(2, false, 0, 0, 1, var25.field1140[0], 1, 0, var25.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        if ((var6 & 3) == 0) {
                            ++field349;
                        }
                        if (field349 >= 111) {
                            this.field406.method285(199, 132);
                            this.field406.method290(0);
                            field349 = 0;
                        }
                        this.field406.method285(37, 132);
                        this.field406.method287(var6);
                    }
                }
                if (var5 == 940 || var5 == 113) {
                    String var26 = this.field606[arg1];
                    int var27 = var26.indexOf("@whi@");
                    if (var27 != -1) {
                        String var28 = var26.substring(var27 + 5).trim();
                        String var29 = class63.method585(class63.method582((byte) 57, class63.method581(var28)), 0);
                        boolean var30 = false;
                        for (int var31 = 0; var31 < this.field435; ++var31) {
                            class4 var32 = this.field434[this.field436[var31]];
                            if (var32 != null && var32.field113 != null && var32.field113.equalsIgnoreCase(var29)) {
                                this.method64(2, false, 0, 0, 1, var32.field1140[0], 1, 0, var32.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                                if (var5 == 940) {
                                    this.field406.method285(162, 132);
                                    this.field406.method287(this.field436[var31]);
                                }
                                if (var5 == 113) {
                                    this.field406.method285(99, 132);
                                    this.field406.method323((byte) 2, this.field436[var31]);
                                }
                                var30 = true;
                                break;
                            }
                        }
                        if (!var30) {
                            this.method69(0, "", "Unable to find " + var29, -113);
                        }
                    }
                }
                if (var5 == 1327) {
                    int var33 = var6 >> 14 & 32767;
                    class27 var34 = class27.method282(var33);
                    String var35;
                    if (var34.field1008 != null) {
                        var35 = new String(var34.field1008);
                    } else {
                        var35 = "It's a " + var34.field1024 + ".";
                    }
                    this.method69(0, "", var35, -113);
                }
                if (var5 == 277) {
                    ++field477;
                    if (field477 >= 132) {
                        this.field406.method285(95, 132);
                        this.field406.method290(0);
                        field477 = 0;
                    }
                    this.field406.method285(93, 132);
                    this.field406.method322(var4, 0);
                    this.field406.method322(var3, 0);
                    this.field406.method287(var6);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 1184) {
                    class40 var36 = class40.method418(var6);
                    String var37;
                    if (var36.field1262 != null) {
                        var37 = new String(var36.field1262);
                    } else {
                        var37 = "It's a " + var36.field1292 + ".";
                    }
                    this.method69(0, "", var37, -113);
                }
                if (var5 == 1) {
                    this.field406.method285(73, 132);
                    this.field406.method322(var4, 0);
                    this.field406.method322(var6, 0);
                    this.field406.method287(var3);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 482) {
                    this.method158(this.field615, 35928);
                    this.field615 = -1;
                    this.field511 = true;
                }
                if (var5 == 946) {
                    this.field406.method285(17, 132);
                    this.field406.method322(var3, 0);
                    this.field406.method322(var6, 0);
                    this.field406.method287(var4);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 391) {
                    this.field406.method285(174, 132);
                    this.field406.method322(var3, 0);
                    this.field406.method323((byte) 2, var6);
                    this.field406.method321(var4, (byte) 1);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 426) {
                    class20 var38 = class20.method256(var4);
                    boolean var39 = true;
                    if (var38.field930 > 0) {
                        var39 = this.method133(var38, this.field346);
                    }
                    if (var39) {
                        this.field406.method285(208, 132);
                        this.field406.method287(var4);
                    }
                }
                if (var5 == 896) {
                    class4 var40 = this.field434[var6];
                    if (var40 != null) {
                        this.method64(2, false, 0, 0, 1, var40.field1140[0], 1, 0, var40.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(162, 132);
                        this.field406.method287(var6);
                    }
                }
                if (var5 == 247) {
                    String var41 = this.field606[arg1];
                    int var42 = var41.indexOf("@whi@");
                    if (var42 != -1) {
                        long var43 = class63.method581(var41.substring(var42 + 5).trim());
                        int var45 = -1;
                        for (int var46 = 0; var46 < this.field610; ++var46) {
                            if (this.field515[var46] == var43) {
                                var45 = var46;
                                break;
                            }
                        }
                        if (var45 != -1 && this.field300[var45] > 0) {
                            this.field511 = true;
                            this.field348 = 0;
                            this.field417 = true;
                            this.field443 = "";
                            this.field347 = 3;
                            this.field167 = this.field515[var45];
                            this.field371 = "Enter message to send to " + this.field398[var45];
                        }
                    }
                }
                if (var5 == 985) {
                    field601 += var4;
                    if (field601 >= 145) {
                        this.field406.method285(100, 132);
                        field601 = 0;
                    }
                    this.method65(var3, this.field635, var4, var6);
                    this.field406.method285(59, 132);
                    this.field406.method287(var6 >> 14 & 32767);
                    this.field406.method321(this.field256 + var4, (byte) 1);
                    this.field406.method322(this.field255 + var3, 0);
                }
                if (var5 == 62) {
                    boolean var47 = this.method64(2, false, 0, 0, 0, var3, 0, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    if (!var47) {
                        this.method64(2, false, 0, 0, 1, var3, 1, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    }
                    this.field557 = super.field730;
                    this.field558 = super.field731;
                    this.field560 = 2;
                    this.field559 = 0;
                    this.field406.method285(113, 132);
                    this.field406.method322(this.field400, 0);
                    this.field406.method321(this.field256 + var4, (byte) 1);
                    this.field406.method322(this.field402, 0);
                    this.field406.method323((byte) 2, this.field401);
                    this.field406.method287(this.field255 + var3);
                    this.field406.method287(var6);
                }
                if (var5 == 81) {
                    boolean var49 = this.method64(2, false, 0, 0, 0, var3, 0, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    if (!var49) {
                        this.method64(2, false, 0, 0, 1, var3, 1, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    }
                    this.field557 = super.field730;
                    this.field558 = super.field731;
                    this.field560 = 2;
                    this.field559 = 0;
                    this.field406.method285(12, 132);
                    this.field406.method322(var6, 0);
                    this.field406.method287(this.field256 + var4);
                    this.field406.method323((byte) 2, this.field255 + var3);
                }
                if (var5 == 281) {
                    field322 += var4;
                    if (field322 >= 82) {
                        this.field406.method285(182, 132);
                        field322 = 0;
                    }
                    this.field406.method285(255, 132);
                    this.field406.method287(var3);
                    this.field406.method322(var6, 0);
                    this.field406.method322(var4, 0);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 256) {
                    this.method65(var3, this.field635, var4, var6);
                    this.field406.method285(102, 132);
                    this.field406.method321(this.field255 + var3, (byte) 1);
                    this.field406.method322(this.field256 + var4, 0);
                    this.field406.method322(var6 >> 14 & 32767, 0);
                }
                if (var5 == 157 && this.method65(var3, this.field635, var4, var6)) {
                    this.field406.method285(90, 132);
                    this.field406.method287(this.field256 + var4);
                    this.field406.method322(var6 >> 14 & 32767, 0);
                    this.field406.method287(this.field255 + var3);
                    this.field406.method323((byte) 2, this.field428);
                }
                if (var5 == 883) {
                    class4 var51 = this.field434[var6];
                    if (var51 != null) {
                        this.method64(2, false, 0, 0, 1, var51.field1140[0], 1, 0, var51.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(99, 132);
                        this.field406.method323((byte) 2, var6);
                    }
                }
                if (var5 == 233) {
                    class4 var52 = this.field434[var6];
                    if (var52 != null) {
                        this.method64(2, false, 0, 0, 1, var52.field1140[0], 1, 0, var52.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(190, 132);
                        this.field406.method287(var6);
                    }
                }
                if (var5 == 1870) {
                    class40 var53 = class40.method418(var6);
                    class20 var54 = class20.method256(var4);
                    String var55;
                    if (var54 != null && var54.field919[var3] >= 100000) {
                        var55 = var54.field919[var3] + " x " + var53.field1292;
                    } else if (var53.field1262 != null) {
                        var55 = new String(var53.field1262);
                    } else {
                        var55 = "It's a " + var53.field1292 + ".";
                    }
                    this.method69(0, "", var55, -113);
                }
                if (var5 == 789) {
                    this.field406.method285(14, 132);
                    this.field406.method323((byte) 2, this.field428);
                    this.field406.method287(var6);
                    this.field406.method321(var4, (byte) 1);
                    this.field406.method322(var3, 0);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 145) {
                    class4 var56 = this.field434[var6];
                    if (var56 != null) {
                        this.method64(2, false, 0, 0, 1, var56.field1140[0], 1, 0, var56.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        field315 += var6;
                        if (field315 >= 50) {
                            this.field406.method285(164, 132);
                            this.field406.method289(3839761);
                            field315 = 0;
                        }
                        this.field406.method285(54, 132);
                        this.field406.method322(var6, 0);
                    }
                }
                if (var5 == 983) {
                    class23 var57 = this.field265[var6];
                    if (var57 != null) {
                        this.method64(2, false, 0, 0, 1, var57.field1140[0], 1, 0, var57.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(158, 132);
                        this.field406.method321(var6, (byte) 1);
                    }
                }
                if (var5 == 703) {
                    class4 var58 = this.field434[var6];
                    if (var58 != null) {
                        this.method64(2, false, 0, 0, 1, var58.field1140[0], 1, 0, var58.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(189, 132);
                        this.field406.method322(var6, 0);
                        this.field406.method287(this.field401);
                        this.field406.method322(this.field400, 0);
                        this.field406.method321(this.field402, (byte) 1);
                    }
                }
                if (var5 == 275) {
                    boolean var59 = this.method64(2, false, 0, 0, 0, var3, 0, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    if (!var59) {
                        this.method64(2, false, 0, 0, 1, var3, 1, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                    }
                    this.field557 = super.field730;
                    this.field558 = super.field731;
                    this.field560 = 2;
                    this.field559 = 0;
                    this.field406.method285(143, 132);
                    this.field406.method321(this.field256 + var4, (byte) 1);
                    this.field406.method322(var6, 0);
                    this.field406.method321(this.field255 + var3, (byte) 1);
                }
                if (var5 == 530) {
                    this.field406.method285(19, 132);
                    this.field406.method321(var4, (byte) 1);
                    this.field406.method321(var3, (byte) 1);
                    this.field406.method323((byte) 2, var6);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 646) {
                    class23 var61 = this.field265[var6];
                    if (var61 != null) {
                        this.method64(2, false, 0, 0, 1, var61.field1140[0], 1, 0, var61.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(48, 132);
                        this.field406.method287(this.field401);
                        this.field406.method321(this.field402, (byte) 1);
                        this.field406.method321(var6, (byte) 1);
                        this.field406.method321(this.field400, (byte) 1);
                    }
                }
                if (var5 == 447) {
                    class23 var62 = this.field265[var6];
                    if (var62 != null) {
                        this.method64(2, false, 0, 0, 1, var62.field1140[0], 1, 0, var62.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(163, 132);
                        this.field406.method322(var6, 0);
                    }
                }
                if (var5 == 485) {
                    this.field406.method285(117, 132);
                    this.field406.method323((byte) 2, var6);
                    this.field406.method321(var3, (byte) 1);
                    this.field406.method323((byte) 2, var4);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 377) {
                    this.field406.method285(226, 132);
                    this.field406.method323((byte) 2, var3);
                    this.field406.method287(var6);
                    this.field406.method321(var4, (byte) 1);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 181) {
                    this.field406.method285(140, 132);
                    this.field406.method321(var3, (byte) 1);
                    this.field406.method322(var4, 0);
                    this.field406.method323((byte) 2, var6);
                    this.field517 = 0;
                    this.field518 = var4;
                    this.field519 = var3;
                    this.field520 = 2;
                    if (class20.method256(var4).field917 == this.field207) {
                        this.field520 = 1;
                    }
                    if (class20.method256(var4).field917 == this.field585) {
                        this.field520 = 3;
                    }
                }
                if (var5 == 359) {
                    class4 var63 = this.field434[var6];
                    if (var63 != null) {
                        this.method64(2, false, 0, 0, 1, var63.field1140[0], 1, 0, var63.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(134, 132);
                        this.field406.method321(var6, (byte) 1);
                    }
                }
                if (var5 == 403) {
                    class23 var64 = this.field265[var6];
                    if (var64 != null) {
                        this.method64(2, false, 0, 0, 1, var64.field1140[0], 1, 0, var64.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(21, 132);
                        this.field406.method321(var6, (byte) 1);
                        this.field406.method321(this.field428, (byte) 1);
                    }
                }
                if (var5 == 588) {
                    this.method65(var3, this.field635, var4, var6);
                    this.field406.method285(9, 132);
                    this.field406.method321(this.field256 + var4, (byte) 1);
                    this.field406.method322(var6 >> 14 & 32767, 0);
                    this.field406.method323((byte) 2, this.field255 + var3);
                }
                if (var5 == 405 && !this.field440) {
                    this.field406.method285(154, 132);
                    this.field406.method287(var4);
                    this.field440 = true;
                }
                if (var5 == 963) {
                    this.field399 = 1;
                    this.field400 = var3;
                    this.field401 = var4;
                    this.field402 = var6;
                    this.field403 = class40.method418(var6).field1292;
                    this.field427 = 0;
                    this.field489 = true;
                } else {
                    if (var5 == 98) {
                        boolean var65 = this.method64(2, false, 0, 0, 0, var3, 0, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                        if (!var65) {
                            this.method64(2, false, 0, 0, 1, var3, 1, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                        }
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(105, 132);
                        this.field406.method323((byte) 2, this.field256 + var4);
                        this.field406.method321(var6, (byte) 1);
                        this.field406.method322(this.field255 + var3, 0);
                    }
                    if (var5 == 16) {
                        if (!this.field301) {
                            this.field390.method525((byte) 3, super.field731 - 4, super.field730 - 4);
                        } else {
                            this.field390.method525((byte) 3, var4 - 4, var3 - 4);
                        }
                    }
                    if (var5 == 538) {
                        boolean var67 = this.method64(2, false, 0, 0, 0, var3, 0, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                        if (!var67) {
                            this.method64(2, false, 0, 0, 1, var3, 1, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                        }
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        this.field406.method285(104, 132);
                        this.field406.method322(this.field255 + var3, 0);
                        this.field406.method287(this.field256 + var4);
                        this.field406.method321(this.field428, (byte) 1);
                        this.field406.method287(var6);
                    }
                    if (var5 == 689) {
                        boolean var69 = this.method64(2, false, 0, 0, 0, var3, 0, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                        if (!var69) {
                            this.method64(2, false, 0, 0, 1, var3, 1, 0, var4, field499.field1140[0], field499.field1141[0], 0);
                        }
                        this.field557 = super.field730;
                        this.field558 = super.field731;
                        this.field560 = 2;
                        this.field559 = 0;
                        field367 += var4;
                        if (field367 >= 102) {
                            this.field406.method285(30, 132);
                            this.field406.method290(0);
                            field367 = 0;
                        }
                        this.field406.method285(57, 132);
                        this.field406.method287(var6);
                        this.field406.method287(this.field255 + var3);
                        this.field406.method322(this.field256 + var4, 0);
                    }
                    if (var5 == 787) {
                        String var71 = this.field606[arg1];
                        int var72 = var71.indexOf("@whi@");
                        if (var72 != -1) {
                            if (this.field207 == -1) {
                                this.method107((byte) 6);
                                this.field597 = var71.substring(var72 + 5).trim();
                                this.field345 = false;
                                this.field510 = this.field207 = class20.field890;
                            } else {
                                this.method69(0, "", "Please close the interface you have open before using 'report abuse'", -113);
                            }
                        }
                    }
                    if (var5 == 515) {
                        class23 var73 = this.field265[var6];
                        if (var73 != null) {
                            this.method64(2, false, 0, 0, 1, var73.field1140[0], 1, 0, var73.field1141[0], field499.field1140[0], field499.field1141[0], 0);
                            this.field557 = super.field730;
                            this.field558 = super.field731;
                            this.field560 = 2;
                            this.field559 = 0;
                            this.field406.method285(16, 132);
                            this.field406.method322(var6, 0);
                        }
                    }
                    if (var5 == 395) {
                        this.field406.method285(137, 132);
                        this.field406.method321(var4, (byte) 1);
                        this.field406.method287(this.field401);
                        this.field406.method321(this.field402, (byte) 1);
                        this.field406.method322(this.field400, 0);
                        this.field406.method322(var3, 0);
                        this.field406.method321(var6, (byte) 1);
                        this.field517 = 0;
                        this.field518 = var4;
                        this.field519 = var3;
                        this.field520 = 2;
                        if (class20.method256(var4).field917 == this.field207) {
                            this.field520 = 1;
                        }
                        if (class20.method256(var4).field917 == this.field585) {
                            this.field520 = 3;
                        }
                    }
                    if (var5 == 152) {
                        if ((var3 & 3) == 0) {
                            ++field305;
                        }
                        if (field305 >= 129) {
                            this.field406.method285(87, 132);
                            this.field406.method287(37562);
                            field305 = 0;
                        }
                        this.field406.method285(176, 132);
                        this.field406.method287(var4);
                        this.field406.method287(var3);
                        this.field406.method287(var6);
                        this.field517 = 0;
                        this.field518 = var4;
                        this.field519 = var3;
                        this.field520 = 2;
                        if (class20.method256(var4).field917 == this.field207) {
                            this.field520 = 1;
                        }
                        if (class20.method256(var4).field917 == this.field585) {
                            this.field520 = 3;
                        }
                    }
                    if (var5 == 419 && this.method65(var3, this.field635, var4, var6)) {
                        this.field406.method285(18, 132);
                        this.field406.method323((byte) 2, this.field402);
                        this.field406.method322(var6 >> 14 & 32767, 0);
                        this.field406.method287(this.field400);
                        this.field406.method321(this.field255 + var3, (byte) 1);
                        this.field406.method323((byte) 2, this.field401);
                        this.field406.method287(this.field256 + var4);
                    }
                    this.field399 = 0;
                    this.field427 = 0;
                    this.field489 = true;
                    if (arg0 != -415) {
                        this.field243 = -230;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLMLYYHULT;I)V")
    private final void method125(byte arg0, class30 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field437; ++var4) {
            int var5 = this.field438[var4];
            class4 var6 = this.field434[var5];
            int var7 = arg1.method296();
            if ((var7 & 4) != 0) {
                var7 += arg1.method296() << 8;
            }
            this.method106(var7, var6, var5, arg1, (byte) 51);
        }
        if (arg0 == -8) {
            ;
        }
    }

    @OriginalMember(owner = "client", name = "r", descriptor = "(I)V")
    public final void method126(int arg0) {
        if (arg0 < 0) {
            if (this.field548 == 0) {
                int var2 = super.field713 / 2 - 80;
                int var3 = super.field714 / 2 + 20;
                int var14 = var3 + 20;
                if (super.field729 == 1 && super.field730 >= var2 - 75 && super.field730 <= var2 + 75 && super.field731 >= var14 - 20 && super.field731 <= var14 + 20) {
                    this.field548 = 3;
                    this.field356 = 0;
                }
                int var4 = super.field713 / 2 + 80;
                if (super.field729 == 1 && super.field730 >= var4 - 75 && super.field730 <= var4 + 75 && super.field731 >= var14 - 20 && super.field731 <= var14 + 20) {
                    this.field479 = "";
                    this.field480 = "Enter your username & password.";
                    this.field548 = 2;
                    this.field356 = 0;
                }
            } else if (this.field548 == 2) {
                int var5 = super.field714 / 2 - 40;
                int var15 = var5 + 30;
                int var16 = var15 + 25;
                if (super.field729 == 1 && super.field731 >= var16 - 15 && super.field731 < var16) {
                    this.field356 = 0;
                }
                var5 = var16 + 15;
                if (super.field729 == 1 && super.field731 >= var5 - 15 && super.field731 < var5) {
                    this.field356 = 1;
                }
                var5 += 15;
                int var6 = super.field713 / 2 - 80;
                int var7 = super.field714 / 2 + 50;
                int var17 = var7 + 20;
                if (super.field729 == 1 && super.field730 >= var6 - 75 && super.field730 <= var6 + 75 && super.field731 >= var17 - 20 && super.field731 <= var17 + 20) {
                    this.field328 = 0;
                    this.method191(this.field529, this.field530, false);
                    if (this.field320) {
                        return;
                    }
                }
                int var8 = super.field713 / 2 + 80;
                if (super.field729 == 1 && super.field730 >= var8 - 75 && super.field730 <= var8 + 75 && super.field731 >= var17 - 20 && super.field731 <= var17 + 20) {
                    this.field548 = 0;
                    this.field529 = "";
                    this.field530 = "";
                }
                while (true) {
                    while (true) {
                        int var9 = this.method223((byte) 6);
                        if (var9 == -1) {
                            return;
                        }
                        boolean var10 = false;
                        for (int var11 = 0; var11 < field169.length(); ++var11) {
                            if (var9 == field169.charAt(var11)) {
                                var10 = true;
                                break;
                            }
                        }
                        if (this.field356 == 0) {
                            if (var9 == 8 && this.field529.length() > 0) {
                                this.field529 = this.field529.substring(0, this.field529.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field356 = 1;
                            }
                            if (var10) {
                                this.field529 = this.field529 + (char) var9;
                            }
                            if (this.field529.length() > 12) {
                                this.field529 = this.field529.substring(0, 12);
                            }
                        } else if (this.field356 == 1) {
                            if (var9 == 8 && this.field530.length() > 0) {
                                this.field530 = this.field530.substring(0, this.field530.length() - 1);
                            }
                            if (var9 == 9 || var9 == 10 || var9 == 13) {
                                this.field356 = 0;
                            }
                            if (var10) {
                                this.field530 = this.field530 + (char) var9;
                            }
                            if (this.field530.length() > 20) {
                                this.field530 = this.field530.substring(0, 20);
                            }
                        }
                    }
                }
            } else {
                if (this.field548 == 3) {
                    int var12 = super.field713 / 2;
                    int var13 = super.field714 / 2 + 50;
                    int var18 = var13 + 20;
                    if (super.field729 == 1 && super.field730 >= var12 - 75 && super.field730 <= var12 + 75 && super.field731 >= var18 - 20 && super.field731 <= var18 + 20) {
                        this.field548 = 0;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILHWEMRKQZ;)I")
    public final int method127(int arg0, int arg1, class20 arg2) {
        if (arg1 < 6 || arg1 > 6) {
            field216 = this.field541.method450();
        }
        if (arg2.field932 != null && arg0 < arg2.field932.length) {
            try {
                int[] var4 = arg2.field932[arg0];
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
                        var9 = this.field492[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field626[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field497[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class20 var11 = class20.method256(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class40.field1260 && (!class40.method418(var12).field1291 || field352)) {
                            for (int var13 = 0; var13 < var11.field881.length; ++var13) {
                                if (var12 + 1 == var11.field881[var13]) {
                                    var9 += var11.field919[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field293[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field158[this.field626[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field293[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field499.field115;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class19.field858; ++var14) {
                            if (class19.field860[var14]) {
                                var9 += this.field626[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class20 var15 = class20.method256(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class40.field1260 && (!class40.method418(var16).field1291 || field352)) {
                            for (int var17 = 0; var17 < var15.field881.length; ++var17) {
                                if (var15.field881[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field187;
                    }
                    if (var8 == 12) {
                        var9 = this.field441;
                    }
                    if (var8 == 13) {
                        int var18 = this.field293[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class61 var21 = class61.field1641[var20];
                        int var22 = var21.field1643;
                        int var23 = var21.field1644;
                        int var24 = var21.field1645;
                        int var25 = field166[var24 - var23];
                        var9 = this.field293[var22] >> var23 & var25;
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
                        var9 = (field499.field1152 >> 7) + this.field255;
                    }
                    if (var8 == 19) {
                        var9 = (field499.field1153 >> 7) + this.field256;
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

    @OriginalMember(owner = "client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field718 != null) {
                    return new URL("http://127.0.0.1:" + (field351 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 350);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field350 = Integer.parseInt(arg0[0]);
                field351 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method164(-896);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method130((byte) 4);
                }
                if (arg0[3].equals("free")) {
                    field352 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field352 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method219(503, false, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client", name = "s", descriptor = "(I)V")
    public final void method128(int arg0) {
        this.method110(-415);
        if (this.field560 == 1) {
            this.field468[this.field559 / 100].method474(this.field557 - 8 - 4, this.field558 - 8 - 4, (byte) 2);
        }
        if (this.field560 == 2) {
            this.field468[this.field559 / 100 + 4].method474(this.field557 - 8 - 4, this.field558 - 8 - 4, (byte) 2);
        }
        if (this.field498 != -1) {
            this.method70(this.field498, -187, this.field276);
            this.method148((byte) 3, 0, 0, 0, class20.method256(this.field498));
        }
        if (this.field207 != -1) {
            this.method70(this.field207, -187, this.field276);
            this.method148((byte) 3, 0, 0, 0, class20.method256(this.field207));
        }
        this.method115(477);
        if (this.field514 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (!this.field301) {
            this.method203(7);
            this.method82(true);
        } else if (this.field522 == 0) {
            this.method147(field254);
        }
        if (this.field208 == 1) {
            this.field598.method474(472, 296, (byte) 2);
        }
        if (field481) {
            short var3 = 507;
            byte var4 = 20;
            int var5 = 16776960;
            if (super.field711 < 30 && field353) {
                var5 = 16711680;
            }
            if (super.field711 < 20 && !field353) {
                var5 = 16711680;
            }
            this.field338.method453(-849, var3, var4, var5, "Fps:" + super.field711);
            int var14 = var4 + 15;
            Runtime var6 = Runtime.getRuntime();
            int var7 = (int) ((var6.totalMemory() - var6.freeMemory()) / 1024L);
            int var8 = 16776960;
            if (var7 > 33554432 && field353) {
                int var9 = 16711680;
            }
            if (var7 > 67108864 && !field353) {
                int var10 = 16711680;
            }
            this.field338.method453(-849, var3, var14, 16776960, "Mem:" + var7 + "k");
            var14 += 15;
        }
        if (this.field384 != 0) {
            int var11 = this.field384 / 50;
            int var12 = var11 / 60;
            int var13 = var11 % 60;
            if (var13 < 10) {
                this.field338.method458((byte) -61, 16776960, 4, 329, "System update in: " + var12 + ":0" + var13);
            } else {
                this.field338.method458((byte) -61, 16776960, 4, 329, "System update in: " + var12 + ":" + var13);
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(IILMLYYHULT;)V")
    public final void method129(int arg0, int arg1, class30 arg2) {
        if (arg1 != 47935) {
            field508 = !field508;
        }
        if (arg0 == 126) {
            int var4 = arg2.method298();
            int var5 = arg2.method316(5715);
            int var6 = var5 >> 2;
            int var7 = var5 & 3;
            int var8 = this.field240[var6];
            int var9 = arg2.method315(0);
            int var10 = (var9 >> 4 & 7) + this.field564;
            int var11 = (var9 & 7) + this.field565;
            if (var10 >= 0 && var11 >= 0 && var10 < 103 && var11 < 103) {
                int var12 = this.field262[this.field605][var10][var11];
                int var13 = this.field262[this.field605][var10 + 1][var11];
                int var14 = this.field262[this.field605][var10 + 1][var11 + 1];
                int var15 = this.field262[this.field605][var10][var11 + 1];
                if (var8 == 0) {
                    class65 var16 = this.field390.method509(0, this.field605, var11, var10);
                    if (var16 != null) {
                        int var17 = var16.field1685 >> 14 & 32767;
                        if (var6 == 2) {
                            var16.field1683 = new class11(false, var7 + 4, var17, (byte) 6, 2, var12, var13, var14, var4, var15);
                            var16.field1684 = new class11(false, var7 + 1 & 3, var17, (byte) 6, 2, var12, var13, var14, var4, var15);
                        } else {
                            var16.field1683 = new class11(false, var7, var17, (byte) 6, var6, var12, var13, var14, var4, var15);
                        }
                    }
                }
                if (var8 == 1) {
                    class48 var18 = this.field390.method510(this.field605, -350, var10, var11);
                    if (var18 != null) {
                        var18.field1405 = new class11(false, 0, var18.field1406 >> 14 & 32767, (byte) 6, 4, var12, var13, var14, var4, var15);
                    }
                }
                if (var8 == 2) {
                    class35 var19 = this.field390.method511(this.field605, var11, var10, false);
                    if (var6 == 11) {
                        var6 = 10;
                    }
                    if (var19 != null) {
                        var19.field1193 = new class11(false, var7, var19.field1201 >> 14 & 32767, (byte) 6, var6, var12, var13, var14, var4, var15);
                    }
                }
                if (var8 == 3) {
                    class13 var20 = this.field390.method512(var10, var11, 344, this.field605);
                    if (var20 != null) {
                        var20.field741 = new class11(false, var7, var20.field742 >> 14 & 32767, (byte) 6, 22, var12, var13, var14, var4, var15);
                    }
                }
            }
        } else if (arg0 == 175) {
            int var21 = arg2.method296();
            int var22 = (var21 >> 4 & 7) + this.field564;
            int var23 = (var21 & 7) + this.field565;
            int var24 = arg2.method298();
            int var25 = arg2.method296();
            int var26 = arg2.method298();
            if (var22 >= 0 && var23 >= 0 && var22 < 104 && var23 < 104) {
                int var27 = var22 * 128 + 64;
                int var28 = var23 * 128 + 64;
                class45 var29 = new class45(var26, var28, this.method80(this.field605, var27, var28, 9) - var25, var24, this.field605, false, field502, var27);
                this.field379.method597(var29);
            }
        } else {
            if (arg0 == 40) {
                int var30 = arg2.method296();
                int var31 = (var30 >> 4 & 7) + this.field564;
                int var32 = (var30 & 7) + this.field565;
                int var33 = arg2.method298();
                int var34 = arg2.method296();
                int var35 = var34 >> 4 & 15;
                int var36 = var34 & 7;
                if (field499.field1140[0] >= var31 - var35 && field499.field1140[0] <= var31 + var35 && field499.field1141[0] >= var32 - var35 && field499.field1141[0] <= var32 + var35 && this.field358 && !field353 && this.field562 < 50) {
                    this.field241[this.field562] = var33;
                    this.field581[this.field562] = var36;
                    this.field627[this.field562] = class2.field8[var33];
                    ++this.field562;
                }
            }
            if (arg0 == 164) {
                int var37 = arg2.method316(5715);
                int var38 = (var37 >> 4 & 7) + this.field564;
                int var39 = (var37 & 7) + this.field565;
                int var40 = arg2.method296();
                int var41 = var40 >> 2;
                int var42 = var40 & 3;
                int var43 = this.field240[var41];
                if (var38 >= 0 && var39 >= 0 && var38 < 104 && var39 < 104) {
                    this.method113(var41, true, -1, -1, var38, var39, var42, var43, 0, this.field605);
                }
            } else {
                if (arg0 == 255) {
                    int var44 = arg2.method324(-178);
                    byte var45 = arg2.method319(false);
                    int var46 = arg2.method325(584);
                    byte var47 = arg2.method320(true);
                    byte var48 = arg2.method320(true);
                    int var49 = arg2.method296();
                    int var50 = (var49 >> 4 & 7) + this.field564;
                    int var51 = (var49 & 7) + this.field565;
                    int var52 = arg2.method326(field278);
                    int var53 = arg2.method317(false);
                    int var54 = var53 >> 2;
                    int var55 = var53 & 3;
                    int var56 = this.field240[var54];
                    byte var57 = arg2.method318((byte) -53);
                    int var58 = arg2.method326(field278);
                    class4 var59;
                    if (this.field476 == var44) {
                        var59 = field499;
                    } else {
                        var59 = this.field434[var44];
                    }
                    if (var59 != null) {
                        class27 var60 = class27.method282(var58);
                        int var61 = this.field262[this.field605][var50][var51];
                        int var62 = this.field262[this.field605][var50 + 1][var51];
                        int var63 = this.field262[this.field605][var50 + 1][var51 + 1];
                        int var64 = this.field262[this.field605][var50][var51 + 1];
                        class3 var65 = var60.method283(var54, var55, var61, var62, var63, var64, -1);
                        if (var65 != null) {
                            this.method113(0, true, -1, var52 + 1, var50, var51, 0, var56, var46 + 1, this.field605);
                            var59.field117 = field502 + var46;
                            var59.field118 = field502 + var52;
                            var59.field122 = var65;
                            int var66 = var60.field985;
                            int var67 = var60.field996;
                            if (var55 == 1 || var55 == 3) {
                                var66 = var60.field996;
                                var67 = var60.field985;
                            }
                            var59.field119 = var50 * 128 + var66 * 64;
                            var59.field121 = var51 * 128 + var67 * 64;
                            var59.field120 = this.method80(this.field605, var59.field119, var59.field121, 9);
                            if (var48 > var47) {
                                byte var68 = var48;
                                var48 = var47;
                                var47 = var68;
                            }
                            if (var57 > var45) {
                                byte var69 = var57;
                                var57 = var45;
                                var45 = var69;
                            }
                            var59.field106 = var48 + var50;
                            var59.field108 = var47 + var50;
                            var59.field107 = var51 + var57;
                            var59.field109 = var45 + var51;
                        }
                    }
                }
                if (arg0 == 198) {
                    int var70 = arg2.method317(false);
                    int var71 = (var70 >> 4 & 7) + this.field564;
                    int var72 = (var70 & 7) + this.field565;
                    int var73 = arg2.method298();
                    int var74 = arg2.method316(5715);
                    int var75 = var74 >> 2;
                    int var76 = var74 & 3;
                    int var77 = this.field240[var75];
                    if (var71 >= 0 && var72 >= 0 && var71 < 104 && var72 < 104) {
                        this.method113(var75, true, var73, -1, var71, var72, var76, var77, 0, this.field605);
                    }
                } else if (arg0 == 146) {
                    int var78 = arg2.method296();
                    int var79 = (var78 >> 4 & 7) + this.field564;
                    int var80 = (var78 & 7) + this.field565;
                    int var81 = var79 + arg2.method297();
                    int var82 = var80 + arg2.method297();
                    int var83 = arg2.method299();
                    int var84 = arg2.method298();
                    int var85 = arg2.method296() * 4;
                    int var86 = arg2.method296() * 4;
                    int var87 = arg2.method298();
                    int var88 = arg2.method298();
                    int var89 = arg2.method296();
                    int var90 = arg2.method296();
                    if (var79 >= 0 && var80 >= 0 && var79 < 104 && var80 < 104 && var81 >= 0 && var82 >= 0 && var81 < 104 && var82 < 104 && var84 != 65535) {
                        int var91 = var79 * 128 + 64;
                        int var92 = var80 * 128 + 64;
                        int var93 = var81 * 128 + 64;
                        int var94 = var82 * 128 + 64;
                        class67 var95 = new class67(var84, field502 + var87, field502 + var88, var83, var92, var89, var91, this.field605, (byte) -53, var90, var86, this.method80(this.field605, var91, var92, 9) - var85);
                        var95.method591(false, var94, field502 + var87, this.method80(this.field605, var93, var94, 9) - var86, var93);
                        this.field185.method597(var95);
                    }
                } else if (arg0 == 2) {
                    int var96 = arg2.method296();
                    int var97 = (var96 >> 4 & 7) + this.field564;
                    int var98 = (var96 & 7) + this.field565;
                    int var99 = arg2.method298();
                    int var100 = arg2.method298();
                    int var101 = arg2.method298();
                    if (var97 >= 0 && var98 >= 0 && var97 < 104 && var98 < 104) {
                        class72 var102 = this.field622[this.field605][var97][var98];
                        if (var102 != null) {
                            for (class68 var103 = (class68) var102.method600(); var103 != null; var103 = (class68) var102.method602((byte) 3)) {
                                if ((var99 & 32767) == var103.field1721 && var103.field1720 == var100) {
                                    var103.field1720 = var101;
                                    break;
                                }
                            }
                            this.method199(var97, var98);
                        }
                    }
                } else if (arg0 == 65) {
                    int var104 = arg2.method296();
                    int var105 = (var104 >> 4 & 7) + this.field564;
                    int var106 = (var104 & 7) + this.field565;
                    int var107 = arg2.method325(584);
                    int var108 = arg2.method298();
                    int var109 = arg2.method298();
                    if (var105 >= 0 && var106 >= 0 && var105 < 104 && var106 < 104 && this.field476 != var108) {
                        class68 var110 = new class68();
                        var110.field1721 = var109;
                        var110.field1720 = var107;
                        if (this.field622[this.field605][var105][var106] == null) {
                            this.field622[this.field605][var105][var106] = new class72(708);
                        }
                        this.field622[this.field605][var105][var106].method597(var110);
                        this.method199(var105, var106);
                    }
                } else if (arg0 != 121) {
                    if (arg0 == 250) {
                        int var117 = arg2.method296();
                        int var118 = (var117 >> 4 & 7) + this.field564;
                        int var119 = (var117 & 7) + this.field565;
                        int var120 = arg2.method325(584);
                        int var121 = arg2.method326(field278);
                        if (var118 >= 0 && var119 >= 0 && var118 < 104 && var119 < 104) {
                            class68 var122 = new class68();
                            var122.field1721 = var120;
                            var122.field1720 = var121;
                            if (this.field622[this.field605][var118][var119] == null) {
                                this.field622[this.field605][var118][var119] = new class72(708);
                            }
                            this.field622[this.field605][var118][var119].method597(var122);
                            this.method199(var118, var119);
                        }
                    }
                } else {
                    int var111 = arg2.method317(false);
                    int var112 = (var111 >> 4 & 7) + this.field564;
                    int var113 = (var111 & 7) + this.field565;
                    int var114 = arg2.method326(field278);
                    if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104) {
                        class72 var115 = this.field622[this.field605][var112][var113];
                        if (var115 != null) {
                            for (class68 var116 = (class68) var115.method600(); var116 != null; var116 = (class68) var115.method602((byte) 3)) {
                                if ((var114 & 32767) == var116.field1721) {
                                    var116.method367();
                                    break;
                                }
                            }
                            if (var115.method600() == null) {
                                this.field622[this.field605][var112][var113] = null;
                            }
                            this.method199(var112, var113);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(B)V")
    public static final void method130(byte arg0) {
        class53.field1468 = false;
        class41.field1298 = false;
        if (arg0 == 4) {
            boolean var1 = false;
        } else {
            field252 = -420;
        }
        field353 = false;
        class5.field143 = false;
        class27.field998 = false;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method131(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method131(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLjava/lang/String;)Z")
    public final boolean method132(byte arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field610; ++var3) {
                if (arg1.equalsIgnoreCase(this.field398[var3])) {
                    return true;
                }
            }
            if (arg0 == 8) {
                boolean var4 = false;
            } else {
                this.field336 = 20;
            }
            return arg1.equalsIgnoreCase(field499.field113);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(LHWEMRKQZ;I)Z")
    public final boolean method133(class20 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field406.method286(252);
        }
        int var3 = arg0.field930;
        if (this.field611 == 2) {
            if (var3 == 201) {
                this.field511 = true;
                this.field348 = 0;
                this.field417 = true;
                this.field443 = "";
                this.field347 = 1;
                this.field371 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field511 = true;
                this.field348 = 0;
                this.field417 = true;
                this.field443 = "";
                this.field347 = 2;
                this.field371 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field164 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field511 = true;
                this.field348 = 0;
                this.field417 = true;
                this.field443 = "";
                this.field347 = 4;
                this.field371 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field511 = true;
                this.field348 = 0;
                this.field417 = true;
                this.field443 = "";
                this.field347 = 5;
                this.field371 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field268[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class32.field1114 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class32.field1114) {
                                var6 = 0;
                            }
                        }
                        if (!class32.field1115[var6].field1121 && class32.field1115[var6].field1116 == var4 + (this.field277 ? 0 : 7)) {
                            this.field268[var4] = var6;
                            this.field536 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field271[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field324[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field324[var7].length) {
                        var9 = 0;
                    }
                }
                this.field271[var7] = var9;
                this.field536 = true;
            }
            if (var3 == 324 && !this.field277) {
                this.field277 = true;
                this.method66(-245);
            }
            if (var3 == 325 && this.field277) {
                this.field277 = false;
                this.method66(-245);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field345 = !this.field345;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method107((byte) 6);
                    if (this.field597.length() > 0) {
                        this.field406.method285(3, 132);
                        this.field406.method292(class63.method581(this.field597), this.field362);
                        this.field406.method286(var3 - 601);
                        this.field406.method286(this.field345 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field406.method285(205, 132);
                this.field406.method286(this.field277 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field406.method286(this.field268[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field406.method286(this.field271[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BZ)V")
    public final void method134(byte arg0, boolean arg1) {
        if (arg0 != 1) {
            this.method208();
        }
        for (int var3 = 0; var3 < this.field266; ++var3) {
            class23 var4 = this.field265[this.field267[var3]];
            int var5 = (this.field267[var3] << 14) + 536870912;
            if (var4 != null && var4.method38(false) && var4.field951.field1629 == arg1 && var4.field951.method569(0)) {
                int var6 = var4.field1152 >> 7;
                int var7 = var4.field1153 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1144 == 1 && (var4.field1152 & 127) == 64 && (var4.field1153 & 127) == 64) {
                        if (this.field261[var6][var7] == this.field551) {
                            continue;
                        }
                        this.field261[var6][var7] = this.field551;
                    }
                    if (!var4.field951.field1614) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field390.method498(false, var4.field1154, var4.field1153, var4.field1188, (var4.field1144 - 1) * 64 + 60, var4, this.field605, this.method80(this.field605, var4.field1152, var4.field1153, 9), var4.field1152, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BI)Z")
    public final boolean method135(byte arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field231[arg1];
            if (arg0 != -86) {
                this.field622 = null;
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 696;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "([BIZ)V")
    public final void method136(byte[] arg0, int arg1, boolean arg2) {
        if (arg1 <= 0) {
            this.field346 = this.field541.method450();
        }
        if (this.field234) {
            signlink.midifade = arg2 ? 1 : 0;
            signlink.midisave(arg0, arg0.length);
        }
    }

    @OriginalMember(owner = "client", name = "t", descriptor = "(I)V")
    public final void method137(int arg0) {
        this.field160 += arg0;
        while (true) {
            class31 var2 = this.field253.method243();
            if (var2 == null) {
                return;
            }
            if (var2.field1105 == 0) {
                class3.method9(1, var2.field1106, var2.field1109);
                if ((this.field253.method234(-715, var2.field1106) & 98) != 0) {
                    this.field489 = true;
                    if (this.field585 != -1 || this.field615 != -1) {
                        this.field511 = true;
                    }
                }
            }
            if (var2.field1105 == 1 && var2.field1109 != null) {
                class8.method212(792, var2.field1109);
            }
            if (var2.field1105 == 2 && this.field183 == var2.field1106 && var2.field1109 != null) {
                this.method136(var2.field1109, 36, this.field184);
            }
            if (var2.field1105 == 3 && this.field550 == 1) {
                for (int var3 = 0; var3 < this.field368.length; ++var3) {
                    if (this.field505[var3] == var2.field1106) {
                        this.field368[var3] = var2.field1109;
                        if (var2.field1109 == null) {
                            this.field505[var3] = -1;
                        }
                        break;
                    }
                    if (this.field506[var3] == var2.field1106) {
                        this.field616[var3] = var2.field1109;
                        if (var2.field1109 == null) {
                            this.field506[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field1105 == 93 && this.field253.method228((byte) 2, var2.field1106)) {
                class5.method51(true, this.field253, new class30(true, var2.field1109));
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLVWKJSKWX;III)V")
    public final void method138(byte arg0, class60 arg1, int arg2, int arg3, int arg4) {
        if (this.field586 < 400) {
            if (arg1.field1618 != null) {
                arg1 = arg1.method570(0);
            }
            if (arg1 != null) {
                if (arg1.field1614) {
                    String var6 = arg1.field1609;
                    if (this.field568 != arg0) {
                        for (int var7 = 1; var7 > 0; ++var7) {
                        }
                    }
                    if (arg1.field1630 != 0) {
                        var6 = var6 + method118(arg1.field1630, this.field354, field499.field115) + " (level-" + arg1.field1630 + ")";
                    }
                    if (this.field399 == 1) {
                        this.field606[this.field586] = "Use " + this.field403 + " with @yel@" + var6;
                        this.field231[this.field586] = 646;
                        this.field232[this.field586] = arg4;
                        this.field229[this.field586] = arg3;
                        this.field230[this.field586] = arg2;
                        ++this.field586;
                    } else {
                        if (this.field427 == 1) {
                            if ((this.field429 & 2) == 2) {
                                this.field606[this.field586] = this.field430 + " @yel@" + var6;
                                this.field231[this.field586] = 403;
                                this.field232[this.field586] = arg4;
                                this.field229[this.field586] = arg3;
                                this.field230[this.field586] = arg2;
                                ++this.field586;
                                return;
                            }
                        } else {
                            if (arg1.field1624 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field1624[var8] != null && !arg1.field1624[var8].equalsIgnoreCase("attack")) {
                                        this.field606[this.field586] = arg1.field1624[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field231[this.field586] = 447;
                                        }
                                        if (var8 == 1) {
                                            this.field231[this.field586] = 24;
                                        }
                                        if (var8 == 2) {
                                            this.field231[this.field586] = 851;
                                        }
                                        if (var8 == 3) {
                                            this.field231[this.field586] = 515;
                                        }
                                        if (var8 == 4) {
                                            this.field231[this.field586] = 983;
                                        }
                                        this.field232[this.field586] = arg4;
                                        this.field229[this.field586] = arg3;
                                        this.field230[this.field586] = arg2;
                                        ++this.field586;
                                    }
                                }
                            }
                            if (arg1.field1624 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg1.field1624[var9] != null && arg1.field1624[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg1.field1630 > field499.field115) {
                                            var10 = 2000;
                                        }
                                        this.field606[this.field586] = arg1.field1624[var9] + " @yel@" + var6;
                                        if (var9 == 0) {
                                            this.field231[this.field586] = var10 + 447;
                                        }
                                        if (var9 == 1) {
                                            this.field231[this.field586] = var10 + 24;
                                        }
                                        if (var9 == 2) {
                                            this.field231[this.field586] = var10 + 851;
                                        }
                                        if (var9 == 3) {
                                            this.field231[this.field586] = var10 + 515;
                                        }
                                        if (var9 == 4) {
                                            this.field231[this.field586] = var10 + 983;
                                        }
                                        this.field232[this.field586] = arg4;
                                        this.field229[this.field586] = arg3;
                                        this.field230[this.field586] = arg2;
                                        ++this.field586;
                                    }
                                }
                            }
                            this.field606[this.field586] = "Examine @yel@" + var6;
                            this.field231[this.field586] = 1335;
                            this.field232[this.field586] = arg4;
                            this.field229[this.field586] = arg3;
                            this.field230[this.field586] = arg2;
                            ++this.field586;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIII)V")
    public final void method139(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg6 & 2047;
        int var9 = 2048 - arg0 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg4;
        if (var8 != 0) {
            int var13 = class3.field89[var8];
            int var14 = class3.field90[var8];
            int var15 = var11 * var14 - arg4 * var13 >> 16;
            var12 = var11 * var13 + arg4 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class3.field89[var9];
            int var17 = class3.field90[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field617 = arg1 - var10;
        this.field618 = arg3 - var11;
        this.field619 = arg5 - var12;
        if (arg2 != 3823) {
            for (int var19 = 1; var19 > 0; ++var19) {
            }
        }
        this.field620 = arg6;
        this.field621 = arg0;
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILMLYYHULT;Z)V")
    private final void method140(int arg0, class30 arg1, boolean arg2) {
        this.field342 = 0;
        this.field437 = 0;
        this.method194(arg0, 0, arg1);
        if (arg2) {
            this.field161 = arg1.method296();
        }
        this.method210(true, arg0, arg1);
        this.method161(arg1, arg0, false);
        for (int var4 = 0; var4 < this.field342; ++var4) {
            int var6 = this.field343[var4];
            if (field502 != this.field265[var6].field1166) {
                this.field265[var6].field951 = null;
                this.field265[var6] = null;
            }
        }
        if (arg1.field1092 != arg0) {
            signlink.reporterror(this.field529 + " size mismatch in getnpcpos - pos:" + arg1.field1092 + " psize:" + arg0);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field266; ++var5) {
                if (this.field265[this.field267[var5]] == null) {
                    signlink.reporterror(this.field529 + " null entry in npc list - pos:" + var5 + " size:" + this.field266);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LHWEMRKQZ;IIIIZII)V")
    public final void method141(class20 arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int arg7) {
        if (!arg5) {
            this.field161 = this.field177.method296();
        }
        if (arg0.field877 == 0 && arg0.field899 != null && !arg0.field883) {
            if (arg4 >= arg3 && arg1 >= arg7 && arg4 <= arg0.field915 + arg3 && arg1 <= arg0.field901 + arg7) {
                int var9 = arg0.field899.length;
                for (int var10 = 0; var10 < var9; ++var10) {
                    int var11 = arg0.field918[var10] + arg3;
                    int var12 = arg0.field893[var10] + arg7 - arg6;
                    class20 var13 = class20.method256(arg0.field899[var10]);
                    int var14 = var13.field873 + var11;
                    int var15 = var13.field934 + var12;
                    if ((var13.field870 >= 0 || var13.field914 != 0) && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                        if (var13.field870 >= 0) {
                            this.field361 = var13.field870;
                        } else {
                            this.field361 = var13.field892;
                        }
                    }
                    if (var13.field877 == 8 && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                        this.field512 = var13.field892;
                    }
                    if (var13.field877 == 0) {
                        this.method141(var13, arg1, arg2, var14, arg4, true, var13.field916, var15);
                        if (var13.field876 > var13.field901) {
                            this.method145(var13.field876, var15, var13.field915 + var14, arg4, arg2, var13, arg1, var13.field901, 0);
                        }
                    } else {
                        if (var13.field884 == 1 && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                            boolean var16 = false;
                            if (var13.field930 != 0) {
                                var16 = this.method109(7, var13);
                            }
                            if (!var16) {
                                this.field606[this.field586] = var13.field864;
                                this.field231[this.field586] = 426;
                                this.field230[this.field586] = var13.field892;
                                ++this.field586;
                            }
                        }
                        if (var13.field884 == 2 && this.field427 == 0 && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                            String var17 = var13.field922;
                            if (var17.indexOf(" ") != -1) {
                                var17 = var17.substring(0, var17.indexOf(" "));
                            }
                            this.field606[this.field586] = var17 + " @gre@" + var13.field905;
                            this.field231[this.field586] = 582;
                            this.field230[this.field586] = var13.field892;
                            ++this.field586;
                        }
                        if (var13.field884 == 3 && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                            this.field606[this.field586] = "Close";
                            if (arg2 == 3) {
                                this.field231[this.field586] = 482;
                            } else {
                                this.field231[this.field586] = 208;
                            }
                            this.field230[this.field586] = var13.field892;
                            ++this.field586;
                        }
                        if (var13.field884 == 4 && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                            this.field606[this.field586] = var13.field864;
                            this.field231[this.field586] = 790;
                            this.field230[this.field586] = var13.field892;
                            ++this.field586;
                        }
                        if (var13.field884 == 5 && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                            this.field606[this.field586] = var13.field864;
                            this.field231[this.field586] = 951;
                            this.field230[this.field586] = var13.field892;
                            ++this.field586;
                        }
                        if (var13.field884 == 6 && !this.field440 && arg4 >= var14 && arg1 >= var15 && arg4 < var13.field915 + var14 && arg1 < var13.field901 + var15) {
                            this.field606[this.field586] = var13.field864;
                            this.field231[this.field586] = 405;
                            this.field230[this.field586] = var13.field892;
                            ++this.field586;
                        }
                        if (var13.field877 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var13.field901; ++var19) {
                                for (int var20 = 0; var20 < var13.field915; ++var20) {
                                    int var21 = (var13.field921 + 32) * var20 + var14;
                                    int var22 = (var13.field935 + 32) * var19 + var15;
                                    if (var18 < 20) {
                                        var21 += var13.field909[var18];
                                        var22 += var13.field927[var18];
                                    }
                                    if (arg4 >= var21 && arg1 >= var22 && arg4 < var21 + 32 && arg1 < var22 + 32) {
                                        this.field205 = var18;
                                        this.field206 = var13.field892;
                                        if (var13.field881[var18] > 0) {
                                            class40 var23 = class40.method418(var13.field881[var18] - 1);
                                            if (this.field399 == 1 && var13.field910) {
                                                if (this.field401 != var13.field892 || this.field400 != var18) {
                                                    this.field606[this.field586] = "Use " + this.field403 + " with @lre@" + var23.field1292;
                                                    this.field231[this.field586] = 395;
                                                    this.field232[this.field586] = var23.field1269;
                                                    this.field229[this.field586] = var18;
                                                    this.field230[this.field586] = var13.field892;
                                                    ++this.field586;
                                                }
                                            } else if (this.field427 == 1 && var13.field910) {
                                                if ((this.field429 & 16) == 16) {
                                                    this.field606[this.field586] = this.field430 + " @lre@" + var23.field1292;
                                                    this.field231[this.field586] = 789;
                                                    this.field232[this.field586] = var23.field1269;
                                                    this.field229[this.field586] = var18;
                                                    this.field230[this.field586] = var13.field892;
                                                    ++this.field586;
                                                }
                                            } else {
                                                if (var13.field910) {
                                                    for (int var24 = 4; var24 >= 3; --var24) {
                                                        if (var23.field1267 != null && var23.field1267[var24] != null) {
                                                            this.field606[this.field586] = var23.field1267[var24] + " @lre@" + var23.field1292;
                                                            if (var24 == 3) {
                                                                this.field231[this.field586] = 1;
                                                            }
                                                            if (var24 == 4) {
                                                                this.field231[this.field586] = 530;
                                                            }
                                                            this.field232[this.field586] = var23.field1269;
                                                            this.field229[this.field586] = var18;
                                                            this.field230[this.field586] = var13.field892;
                                                            ++this.field586;
                                                        } else if (var24 == 4) {
                                                            this.field606[this.field586] = "Drop @lre@" + var23.field1292;
                                                            this.field231[this.field586] = 530;
                                                            this.field232[this.field586] = var23.field1269;
                                                            this.field229[this.field586] = var18;
                                                            this.field230[this.field586] = var13.field892;
                                                            ++this.field586;
                                                        }
                                                    }
                                                }
                                                if (var13.field896) {
                                                    this.field606[this.field586] = "Use @lre@" + var23.field1292;
                                                    this.field231[this.field586] = 963;
                                                    this.field232[this.field586] = var23.field1269;
                                                    this.field229[this.field586] = var18;
                                                    this.field230[this.field586] = var13.field892;
                                                    ++this.field586;
                                                }
                                                if (var13.field910 && var23.field1267 != null) {
                                                    for (int var25 = 2; var25 >= 0; --var25) {
                                                        if (var23.field1267[var25] != null) {
                                                            this.field606[this.field586] = var23.field1267[var25] + " @lre@" + var23.field1292;
                                                            if (var25 == 0) {
                                                                this.field231[this.field586] = 181;
                                                            }
                                                            if (var25 == 1) {
                                                                this.field231[this.field586] = 946;
                                                            }
                                                            if (var25 == 2) {
                                                                this.field231[this.field586] = 152;
                                                            }
                                                            this.field232[this.field586] = var23.field1269;
                                                            this.field229[this.field586] = var18;
                                                            this.field230[this.field586] = var13.field892;
                                                            ++this.field586;
                                                        }
                                                    }
                                                }
                                                if (var13.field863 != null) {
                                                    for (int var26 = 4; var26 >= 0; --var26) {
                                                        if (var13.field863[var26] != null) {
                                                            this.field606[this.field586] = var13.field863[var26] + " @lre@" + var23.field1292;
                                                            if (var26 == 0) {
                                                                this.field231[this.field586] = 391;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field231[this.field586] = 377;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field231[this.field586] = 277;
                                                            }
                                                            if (var26 == 3) {
                                                                this.field231[this.field586] = 281;
                                                            }
                                                            if (var26 == 4) {
                                                                this.field231[this.field586] = 485;
                                                            }
                                                            this.field232[this.field586] = var23.field1269;
                                                            this.field229[this.field586] = var18;
                                                            this.field230[this.field586] = var13.field892;
                                                            ++this.field586;
                                                        }
                                                    }
                                                }
                                                this.field606[this.field586] = "Examine @lre@" + var23.field1292;
                                                this.field231[this.field586] = 1870;
                                                this.field232[this.field586] = var23.field1269;
                                                this.field229[this.field586] = var18;
                                                this.field230[this.field586] = var13.field892;
                                                ++this.field586;
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILjava/lang/String;Z)V")
    public final void method142(int arg0, String arg1, boolean arg2) {
        this.field614 = arg0;
        this.field374 = arg1;
        this.method92(2484);
        if (this.field182 == null) {
            super.method142(arg0, arg1, true);
        } else {
            this.field590.method578(0);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field339.method454(1, 16777215, var5 / 2 - 26 - var6, var4 / 2, "RuneScape is loading - please wait...");
            int var7 = var5 / 2 - 18 - var6;
            class56.method547(658, var7, 34, var4 / 2 - 152, 9179409, 304);
            class56.method547(658, var7 + 1, 32, var4 / 2 - 151, 0, 302);
            class56.method546(9179409, var4 / 2 - 150, true, var7 + 2, arg0 * 3, 30);
            this.field320 &= arg2;
            class56.method546(0, arg0 * 3 + (var4 / 2 - 150), true, var7 + 2, 300 - arg0 * 3, 30);
            this.field339.method454(1, 16777215, var5 / 2 + 5 - var6, var4 / 2, arg1);
            this.field590.method579(7, 171, super.field715, 202);
            if (this.field446) {
                this.field446 = false;
                if (!this.field279) {
                    this.field591.method579(7, 0, super.field715, 0);
                    this.field592.method579(7, 0, super.field715, 637);
                }
                this.field588.method579(7, 0, super.field715, 128);
                this.field589.method579(7, 371, super.field715, 202);
                this.field593.method579(7, 265, super.field715, 0);
                this.field594.method579(7, 265, super.field715, 562);
                this.field595.method579(7, 171, super.field715, 128);
                this.field596.method579(7, 171, super.field715, 562);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIZLSWNASVGQ;)V")
    public final void method143(int arg0, int arg1, boolean arg2, class51 arg3) {
        int var5 = this.field325 + this.field213 & 2047;
        int var6 = arg0 * arg0 + arg1 * arg1;
        this.field320 &= arg2;
        if (var6 <= 6400) {
            int var7 = class3.field89[var5];
            int var8 = class3.field90[var5];
            int var9 = var7 * 256 / (this.field209 + 256);
            int var10 = var8 * 256 / (this.field209 + 256);
            int var11 = arg0 * var10 + arg1 * var9 >> 16;
            int var12 = arg1 * var10 - arg0 * var9 >> 16;
            if (var6 > 2500) {
                arg3.method480(-797, 83 - var12 - arg3.field1442 / 2 - 4, var11 + 94 - arg3.field1441 / 2 + 4, this.field282);
            } else {
                arg3.method474(var11 + 94 - arg3.field1441 / 2 + 4, 83 - var12 - arg3.field1442 / 2 - 4, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIILCHKMTWJC;I)V")
    public final void method144(int arg0, int arg1, int arg2, class4 arg3, int arg4) {
        while (arg0 >= 0) {
            this.field161 = -1;
        }
        if (field499 != arg3) {
            if (this.field586 < 400) {
                String var6;
                if (arg3.field101 == 0) {
                    var6 = arg3.field113 + method118(arg3.field115, this.field354, field499.field115) + " (level-" + arg3.field115 + ")";
                } else {
                    var6 = arg3.field113 + " (skill-" + arg3.field101 + ")";
                }
                if (this.field399 == 1) {
                    this.field606[this.field586] = "Use " + this.field403 + " with @whi@" + var6;
                    this.field231[this.field586] = 703;
                    this.field232[this.field586] = arg2;
                    this.field229[this.field586] = arg4;
                    this.field230[this.field586] = arg1;
                    ++this.field586;
                } else if (this.field427 == 1) {
                    if ((this.field429 & 8) == 8) {
                        this.field606[this.field586] = this.field430 + " @whi@" + var6;
                        this.field231[this.field586] = 621;
                        this.field232[this.field586] = arg2;
                        this.field229[this.field586] = arg4;
                        this.field230[this.field586] = arg1;
                        ++this.field586;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field388[var7] != null) {
                            this.field606[this.field586] = this.field388[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field388[var7].equalsIgnoreCase("attack")) {
                                if (arg3.field115 > field499.field115) {
                                    var9 = 2000;
                                }
                                if (field499.field110 != 0 && arg3.field110 != 0) {
                                    if (field499.field110 == arg3.field110) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field389[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field231[this.field586] = var9 + 883;
                            }
                            if (var7 == 1) {
                                this.field231[this.field586] = var9 + 145;
                            }
                            if (var7 == 2) {
                                this.field231[this.field586] = var9 + 359;
                            }
                            if (var7 == 3) {
                                this.field231[this.field586] = var9 + 896;
                            }
                            if (var7 == 4) {
                                this.field231[this.field586] = var9 + 233;
                            }
                            this.field232[this.field586] = arg2;
                            this.field229[this.field586] = arg4;
                            this.field230[this.field586] = arg1;
                            ++this.field586;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field586; ++var8) {
                    if (this.field231[var8] == 16) {
                        this.field606[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIILHWEMRKQZ;III)V")
    public final void method145(int arg0, int arg1, int arg2, int arg3, int arg4, class20 arg5, int arg6, int arg7, int arg8) {
        if (this.field251) {
            this.field242 = 32;
        } else {
            this.field242 = 0;
        }
        this.field251 = false;
        if (arg8 != 0) {
            this.method208();
        }
        if (arg3 >= arg2 && arg3 < arg2 + 16 && arg6 >= arg1 && arg6 < arg1 + 16) {
            arg5.field916 -= this.field513 * 4;
            if (arg4 == 1) {
                this.field489 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field511 = true;
            }
        } else if (arg3 >= arg2 && arg3 < arg2 + 16 && arg6 >= arg1 + arg7 - 16 && arg6 < arg1 + arg7) {
            arg5.field916 += this.field513 * 4;
            if (arg4 == 1) {
                this.field489 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field511 = true;
            }
        } else if (arg3 >= arg2 - this.field242 && arg3 < arg2 + 16 + this.field242 && arg6 >= arg1 + 16 && arg6 < arg1 + arg7 - 16 && this.field513 > 0) {
            int var10 = (arg7 - 32) * arg7 / arg0;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg6 - arg1 - 16 - var10 / 2;
            int var12 = arg7 - 32 - var10;
            arg5.field916 = (arg0 - arg7) * var11 / var12;
            if (arg4 == 1) {
                this.field489 = true;
            }
            if (arg4 == 2 || arg4 == 3) {
                this.field511 = true;
            }
            this.field251 = true;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IILMLYYHULT;)V")
    private final void method146(int arg0, int arg1, class30 arg2) {
        while (true) {
            if (arg2.field1093 + 10 < arg1 * 8) {
                int var4 = arg2.method307(11, 84);
                if (var4 != 2047) {
                    if (this.field434[var4] == null) {
                        this.field434[var4] = new class4();
                        if (this.field439[var4] != null) {
                            this.field434[var4].method42((byte) 121, this.field439[var4]);
                        }
                    }
                    this.field436[this.field435++] = var4;
                    class4 var5 = this.field434[var4];
                    var5.field1166 = field502;
                    int var6 = arg2.method307(5, 84);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg2.method307(1, 84);
                    if (var7 == 1) {
                        this.field438[this.field437++] = var4;
                    }
                    int var8 = arg2.method307(5, 84);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg2.method307(1, 84);
                    var5.method352(field499.field1140[0] + var8, true, field499.field1141[0] + var6, var9 == 1);
                    continue;
                }
            }
            arg2.method308((byte) -108);
            int var10 = 69 / arg0;
            return;
        }
    }

    @OriginalMember(owner = "client", name = "j", descriptor = "(Z)V")
    public final void method147(boolean arg0) {
        int var2 = this.field523;
        int var3 = this.field524;
        int var4 = this.field525;
        int var5 = this.field526;
        int var6 = 6116423;
        class56.method546(var6, var2, true, var3, var4, var5);
        class56.method546(0, var2 + 1, true, var3 + 1, var4 - 2, 16);
        class56.method547(658, var3 + 18, var5 - 19, var2 + 1, 0, var4 - 2);
        if (arg0) {
            this.method208();
        }
        this.field339.method458((byte) -61, var6, var2 + 3, var3 + 14, "Choose Option");
        int var7 = super.field723;
        int var8 = super.field724;
        if (this.field522 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field522 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field522 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field586; ++var9) {
            int var10 = (this.field586 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field339.method462(var2 + 3, var11, true, 14904, this.field606[var9], var10);
        }
    }

    @OriginalMember(owner = "client", name = "init", descriptor = "()V")
    public final void init() {
        field350 = Integer.parseInt(this.getParameter("nodeid"));
        field351 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method164(-896);
        } else {
            method130((byte) 4);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field352 = false;
        } else {
            field352 = true;
        }
        this.method220(765, 503, 4);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BIIILHWEMRKQZ;)V")
    public final void method148(byte arg0, int arg1, int arg2, int arg3, class20 arg4) {
        if (arg4.field877 == 0 && arg4.field899 != null) {
            if (!arg4.field883 || this.field179 == arg4.field892 || this.field168 == arg4.field892 || this.field580 == arg4.field892) {
                int var6 = class56.field1560;
                int var7 = class56.field1558;
                int var8 = class56.field1561;
                int var9 = class56.field1559;
                class56.method543(arg1, arg2, arg4.field915 + arg1, 134, arg4.field901 + arg2);
                int var10 = arg4.field899.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg4.field918[var11] + arg1;
                    int var14 = arg4.field893[var11] + arg2 - arg3;
                    class20 var15 = class20.method256(arg4.field899[var11]);
                    int var16 = var15.field873 + var13;
                    int var17 = var15.field934 + var14;
                    if (var15.field930 > 0) {
                        this.method111(var15, this.field500);
                    }
                    if (var15.field877 == 0) {
                        if (var15.field916 > var15.field876 - var15.field901) {
                            var15.field916 = var15.field876 - var15.field901;
                        }
                        if (var15.field916 < 0) {
                            var15.field916 = 0;
                        }
                        this.method148((byte) 3, var16, var17, var15.field916, var15);
                        if (var15.field876 > var15.field901) {
                            this.method81(var17, var15.field915 + var16, 382, var15.field901, var15.field876, var15.field916);
                        }
                    } else if (var15.field877 != 1) {
                        if (var15.field877 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field901; ++var19) {
                                for (int var20 = 0; var20 < var15.field915; ++var20) {
                                    int var21 = (var15.field921 + 32) * var20 + var16;
                                    int var22 = (var15.field935 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field909[var18];
                                        var22 += var15.field927[var18];
                                    }
                                    if (var15.field881[var18] <= 0) {
                                        if (var15.field939 != null && var18 < 20) {
                                            class51 var31 = var15.field939[var18];
                                            if (var31 != null) {
                                                var31.method474(var21, var22, (byte) 2);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field881[var18] - 1;
                                        if (var21 > class56.field1560 - 32 && var21 < class56.field1561 && var22 > class56.field1558 - 32 && var22 < class56.field1559 || this.field221 != 0 && this.field220 == var18) {
                                            int var26 = 0;
                                            if (this.field399 == 1 && this.field400 == var18 && this.field401 == var15.field892) {
                                                var26 = 16777215;
                                            }
                                            class51 var27 = class40.method412(var15.field919[var18], 3, var26, var25);
                                            if (var27 != null) {
                                                if (this.field221 != 0 && this.field220 == var18 && this.field219 == var15.field892) {
                                                    var23 = super.field723 - this.field222;
                                                    var24 = super.field724 - this.field223;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field609 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method476(var21 + var23, var22 + var24, 128, -770);
                                                    if (var22 + var24 < class56.field1558 && arg4.field916 > 0) {
                                                        int var28 = (class56.field1558 - var22 - var24) * this.field276 / 3;
                                                        if (var28 > this.field276 * 10) {
                                                            var28 = this.field276 * 10;
                                                        }
                                                        if (var28 > arg4.field916) {
                                                            var28 = arg4.field916;
                                                        }
                                                        arg4.field916 -= var28;
                                                        this.field223 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class56.field1559 && arg4.field916 < arg4.field876 - arg4.field901) {
                                                        int var29 = (var22 + var24 + 32 - class56.field1559) * this.field276 / 3;
                                                        if (var29 > this.field276 * 10) {
                                                            var29 = this.field276 * 10;
                                                        }
                                                        if (var29 > arg4.field876 - arg4.field901 - arg4.field916) {
                                                            var29 = arg4.field876 - arg4.field901 - arg4.field916;
                                                        }
                                                        arg4.field916 += var29;
                                                        this.field223 -= var29;
                                                    }
                                                } else if (this.field520 != 0 && this.field519 == var18 && this.field518 == var15.field892) {
                                                    var27.method476(var21, var22, 128, -770);
                                                } else {
                                                    var27.method474(var21, var22, (byte) 2);
                                                }
                                                if (var27.field1441 == 33 || var15.field919[var18] != 1) {
                                                    int var30 = var15.field919[var18];
                                                    this.field337.method458((byte) -61, 0, var21 + 1 + var23, var22 + 10 + var24, method114(var30, 806));
                                                    this.field337.method458((byte) -61, 16776960, var21 + var23, var22 + 9 + var24, method114(var30, 806));
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field877 == 3) {
                            boolean var32 = false;
                            if (this.field580 == var15.field892 || this.field168 == var15.field892 || this.field179 == var15.field892) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method73(var15, 8)) {
                                var33 = var15.field872;
                                if (var32 && var15.field920 != 0) {
                                    var33 = var15.field920;
                                }
                            } else {
                                var33 = var15.field931;
                                if (var32 && var15.field914 != 0) {
                                    var33 = var15.field914;
                                }
                            }
                            if (var15.field871 == 0) {
                                if (var15.field874) {
                                    class56.method546(var33, var16, true, var17, var15.field915, var15.field901);
                                } else {
                                    class56.method547(658, var17, var15.field901, var16, var33, var15.field915);
                                }
                            } else if (var15.field874) {
                                class56.method545(var16, var17, var33, 256 - (var15.field871 & 255), 0, var15.field901, var15.field915);
                            } else {
                                class56.method548(var17, var15.field915, var16, 256 - (var15.field871 & 255), (byte) 43, var15.field901, var33);
                            }
                        } else if (var15.field877 == 4) {
                            class50 var34 = var15.field889;
                            String var35 = var15.field907;
                            boolean var36 = false;
                            if (this.field580 == var15.field892 || this.field168 == var15.field892 || this.field179 == var15.field892) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method73(var15, 8)) {
                                var37 = var15.field872;
                                if (var36 && var15.field920 != 0) {
                                    var37 = var15.field920;
                                }
                                if (var15.field891.length() > 0) {
                                    var35 = var15.field891;
                                }
                            } else {
                                var37 = var15.field931;
                                if (var36 && var15.field914 != 0) {
                                    var37 = var15.field914;
                                }
                            }
                            if (var15.field884 == 6 && this.field440) {
                                var35 = "Please wait...";
                                var37 = var15.field931;
                            }
                            if (class56.field1556 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field1427 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method200((byte) -42, this.method127(4, 6, var15)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method200((byte) -42, this.method127(3, 6, var15)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method200((byte) -42, this.method127(2, 6, var15)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method200((byte) -42, this.method127(1, 6, var15)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method200((byte) -42, this.method127(0, 6, var15)) + var35.substring(var39 + 2);
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
                                if (var15.field936) {
                                    var34.method455(var45, var38, 0, var15.field897, var15.field915 / 2 + var16, var37);
                                } else {
                                    var34.method462(var16, var37, var15.field897, 14904, var45, var38);
                                }
                                var38 += var34.field1427;
                            }
                        } else if (var15.field877 == 5) {
                            class51 var46;
                            if (this.method73(var15, 8)) {
                                var46 = var15.field904;
                            } else {
                                var46 = var15.field861;
                            }
                            if (var46 != null) {
                                var46.method474(var16, var17, (byte) 2);
                            }
                        } else if (var15.field877 == 6) {
                            int var47 = class41.field1303;
                            int var48 = class41.field1304;
                            class41.field1303 = var15.field915 / 2 + var16;
                            class41.field1304 = var15.field901 / 2 + var17;
                            int var49 = class41.field1307[var15.field866] * var15.field865 >> 16;
                            int var50 = class41.field1308[var15.field866] * var15.field865 >> 16;
                            boolean var51 = this.method73(var15, 8);
                            int var52;
                            if (var51) {
                                var52 = var15.field879;
                            } else {
                                var52 = var15.field878;
                            }
                            class3 var53;
                            if (var52 == -1) {
                                var53 = var15.method252(119, -1, -1, var51);
                            } else {
                                class58 var54 = class58.field1570[var52];
                                var53 = var15.method252(119, var54.field1573[var15.field929], var54.field1572[var15.field929], var51);
                            }
                            if (var53 != null) {
                                var53.method32(0, var15.field867, 0, var15.field866, 0, var49, var50);
                            }
                            class41.field1303 = var47;
                            class41.field1304 = var48;
                        } else {
                            if (var15.field877 == 7) {
                                class50 var55 = var15.field889;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field901; ++var57) {
                                    for (int var58 = 0; var58 < var15.field915; ++var58) {
                                        if (var15.field881[var56] > 0) {
                                            class40 var59 = class40.method418(var15.field881[var56] - 1);
                                            String var60 = var59.field1292;
                                            if (var59.field1275 || var15.field919[var56] != 1) {
                                                var60 = var60 + " x" + method117(var15.field919[var56], true);
                                            }
                                            int var61 = (var15.field921 + 115) * var58 + var16;
                                            int var62 = (var15.field935 + 12) * var57 + var17;
                                            if (var15.field936) {
                                                var55.method455(var60, var62, 0, var15.field897, var15.field915 / 2 + var61, var15.field931);
                                            } else {
                                                var55.method462(var61, var15.field931, var15.field897, 14904, var60, var62);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field877 == 8 && (this.field275 == var15.field892 || this.field198 == var15.field892 || this.field273 == var15.field892) && this.field604 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class50 var65 = this.field338;
                                String var66 = var15.field907;
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
                                    int var75 = var65.method456(var74, 9);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field1427 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field915 + var16 - 5 - var63;
                                int var68 = var15.field901 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg4.field915 + arg1) {
                                    var67 = arg4.field915 + arg1 - var63;
                                }
                                class56.method546(16777120, var67, true, var68, var63, var64);
                                class56.method547(658, var68, var64, var67, 0, var63);
                                String var69 = var15.field907;
                                int var70 = var65.field1427 + var68 + 2;
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
                                    var65.method462(var67 + 3, 0, false, 14904, var72, var70);
                                    var70 += var65.field1427 + 1;
                                }
                            }
                        }
                    }
                }
                if (this.field472 == arg0) {
                    boolean var12 = false;
                } else {
                    this.field161 = -1;
                }
                class56.method543(var6, var7, var8, 134, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "u", descriptor = "(I)V")
    public final void method149(int arg0) {
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field539[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field539[var17] = 192;
        }
        if (arg0 <= 0) {
            field467 = this.field541.method450();
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field540[var14] = (this.field539[var14 - 1] + this.field539[var14 + 1] + this.field539[var14 - 128] + this.field539[var14 + 128]) / 4;
            }
        }
        this.field638 += 128;
        if (this.field638 > this.field330.length) {
            this.field638 -= this.field330.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method77(this.field269[var6], 5);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field540[var11 + 128] - this.field330[this.field638 + var11 & this.field330.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field539[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field486[var8] = this.field486[var8 + 1];
        }
        this.field486[var2 - 1] = (int) (Math.sin((double) field502 / 14.0D) * 16.0D + Math.sin((double) field502 / 15.0D) * 14.0D + Math.sin((double) field502 / 16.0D) * 12.0D);
        if (this.field629 > 0) {
            this.field629 -= 4;
        }
        if (this.field630 > 0) {
            this.field630 -= 4;
        }
        if (this.field629 == 0 && this.field630 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field629 = 1024;
            }
            if (var9 == 1) {
                this.field630 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "v", descriptor = "(I)V")
    public final void method150(int arg0) {
        if (arg0 != 4) {
            this.field406.method286(138);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method223((byte) 6);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field207 != -1 && this.field510 == this.field207) {
                        if (var2 == 8 && this.field597.length() > 0) {
                            this.field597 = this.field597.substring(0, this.field597.length() - 1);
                        }
                        break;
                    }
                    if (this.field417) {
                        if (var2 >= 32 && var2 <= 122 && this.field443.length() < 80) {
                            this.field443 = this.field443 + (char) var2;
                            this.field511 = true;
                        }
                        if (var2 == 8 && this.field443.length() > 0) {
                            this.field443 = this.field443.substring(0, this.field443.length() - 1);
                            this.field511 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field417 = false;
                            this.field511 = true;
                            if (this.field347 == 1) {
                                long var3 = class63.method581(this.field443);
                                this.method154((byte) 6, var3);
                            }
                            if (this.field347 == 2 && this.field610 > 0) {
                                long var5 = class63.method581(this.field443);
                                this.method102((byte) 0, var5);
                            }
                            if (this.field347 == 3 && this.field443.length() > 0) {
                                this.field406.method285(168, 132);
                                this.field406.method286(0);
                                int var7 = this.field406.field1092;
                                this.field406.method292(this.field167, this.field362);
                                class17.method246(652, this.field443, this.field406);
                                this.field406.method295(this.field406.field1092 - var7, 0);
                                this.field443 = class17.method247(0, this.field443);
                                this.field443 = class39.method378(0, this.field443);
                                this.method69(6, class63.method585(class63.method582((byte) 57, this.field167), 0), this.field443, -113);
                                if (this.field274 == 2) {
                                    this.field274 = 1;
                                    this.field392 = true;
                                    this.field406.method285(124, 132);
                                    this.field406.method286(this.field485);
                                    this.field406.method286(this.field274);
                                    this.field406.method286(this.field636);
                                }
                            }
                            if (this.field347 == 4 && this.field202 < 100) {
                                long var8 = class63.method581(this.field443);
                                this.method167(465, var8);
                            }
                            if (this.field347 == 5 && this.field202 > 0) {
                                long var10 = class63.method581(this.field443);
                                this.method105(var10, this.field363);
                            }
                        }
                    } else if (this.field348 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field382.length() < 10) {
                            this.field382 = this.field382 + (char) var2;
                            this.field511 = true;
                        }
                        if (var2 == 8 && this.field382.length() > 0) {
                            this.field382 = this.field382.substring(0, this.field382.length() - 1);
                            this.field511 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field382.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field382);
                                } catch (Exception var22) {
                                }
                                this.field406.method285(86, 132);
                                this.field406.method290(var12);
                            }
                            this.field348 = 0;
                            this.field511 = true;
                        }
                    } else if (this.field348 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field382.length() < 12) {
                            this.field382 = this.field382 + (char) var2;
                            this.field511 = true;
                        }
                        if (var2 == 8 && this.field382.length() > 0) {
                            this.field382 = this.field382.substring(0, this.field382.length() - 1);
                            this.field511 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field382.length() > 0) {
                                this.field406.method285(200, 132);
                                this.field406.method292(class63.method581(this.field382), this.field362);
                            }
                            this.field348 = 0;
                            this.field511 = true;
                        }
                    } else if (this.field348 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field382.length() < 40) {
                            this.field382 = this.field382 + (char) var2;
                            this.field511 = true;
                        }
                        if (var2 == 8 && this.field382.length() > 0) {
                            this.field382 = this.field382.substring(0, this.field382.length() - 1);
                            this.field511 = true;
                        }
                    } else if (this.field585 == -1 && this.field369 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field612.length() < 80) {
                            this.field612 = this.field612 + (char) var2;
                            this.field511 = true;
                        }
                        if (var2 == 8 && this.field612.length() > 0) {
                            this.field612 = this.field612.substring(0, this.field612.length() - 1);
                            this.field511 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field612.length() > 0) {
                            if (this.field561 == 2) {
                                if (this.field612.equals("::clientdrop")) {
                                    this.method78((byte) 33);
                                }
                                if (this.field612.equals("::lag")) {
                                    this.method121(-36);
                                }
                                if (this.field612.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field253.method239(field216, 2); ++var13) {
                                        this.field253.method227(0, 2, var13, (byte) 1);
                                    }
                                }
                                if (this.field612.equals("::fpson")) {
                                    field481 = true;
                                }
                                if (this.field612.equals("::fpsoff")) {
                                    field481 = false;
                                }
                                if (this.field612.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field556[var14].field1213[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field612.startsWith("::")) {
                                this.field406.method285(230, 132);
                                this.field406.method286(this.field612.length() - 1);
                                this.field406.method293(this.field612.substring(2));
                            } else {
                                String var17 = this.field612.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field612 = this.field612.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field612 = this.field612.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field612 = this.field612.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field612 = this.field612.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field612 = this.field612.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field612 = this.field612.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field612 = this.field612.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field612 = this.field612.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field612 = this.field612.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field612 = this.field612.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field612 = this.field612.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field612 = this.field612.substring(6);
                                }
                                String var19 = this.field612.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field612 = this.field612.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field612 = this.field612.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field612 = this.field612.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field612 = this.field612.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field612 = this.field612.substring(6);
                                }
                                this.field406.method285(169, 132);
                                this.field406.method286(0);
                                int var21 = this.field406.field1092;
                                this.field264.field1092 = 0;
                                class17.method246(652, this.field612, this.field264);
                                this.field406.method334(this.field264.field1091, 4, 0, this.field264.field1092);
                                this.field406.method314(-746, var20);
                                this.field406.method286(var18);
                                this.field406.method295(this.field406.field1092 - var21, 0);
                                this.field612 = class17.method247(0, this.field612);
                                this.field612 = class39.method378(0, this.field612);
                                field499.field1138 = this.field612;
                                field499.field1150 = var18;
                                field499.field1142 = var20;
                                field499.field1175 = 150;
                                if (this.field561 == 2) {
                                    this.method69(2, "@cr2@" + field499.field113, field499.field1138, -113);
                                } else if (this.field561 == 1) {
                                    this.method69(2, "@cr1@" + field499.field113, field499.field1138, -113);
                                } else {
                                    this.method69(2, field499.field113, field499.field1138, -113);
                                }
                                if (this.field485 == 2) {
                                    this.field485 = 3;
                                    this.field392 = true;
                                    this.field406.method285(124, 132);
                                    this.field406.method286(this.field485);
                                    this.field406.method286(this.field274);
                                    this.field406.method286(this.field636);
                                }
                            }
                            this.field612 = "";
                            this.field511 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field597.length() < 12) {
                this.field597 = this.field597 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client", name = "w", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (this.field203 == 2) {
            this.method75(-435, (this.field247 - this.field256 << 7) + this.field250, (this.field246 - this.field255 << 7) + this.field249, this.field248 * 2);
            if (arg0 != 27294) {
                this.method208();
            }
            if (this.field377 > -1 && field502 % 20 < 10) {
                this.field304[0].method474(this.field377 - 12, this.field378 - 28, (byte) 2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "x", descriptor = "(I)V")
    public final void method152(int arg0) {
        while (arg0 >= 0) {
            this.field161 = -1;
        }
        if (field353 && this.field550 == 2 && class5.field149 != this.field605) {
            this.method177("Loading - please wait.", false, (String) null);
            this.field550 = 1;
            this.field201 = System.currentTimeMillis();
        }
        if (this.field550 == 1) {
            int var2 = this.method153(-45921);
            if (var2 != 0 && System.currentTimeMillis() - this.field201 > 360000L) {
                signlink.reporterror(this.field529 + " glcfb " + this.field509 + "," + var2 + "," + field353 + "," + this.field317[0] + "," + this.field253.method225() + "," + this.field605 + "," + this.field180 + "," + this.field181);
                this.field201 = System.currentTimeMillis();
            }
        }
        if (this.field550 == 2 && this.field605 != this.field218) {
            this.field218 = this.field605;
            this.method165(this.field605, -427);
        }
    }

    @OriginalMember(owner = "client", name = "y", descriptor = "(I)I")
    public final int method153(int arg0) {
        for (int var2 = 0; var2 < this.field368.length; ++var2) {
            if (this.field368[var2] == null && this.field505[var2] != -1) {
                return -1;
            }
            if (this.field616[var2] == null && this.field506[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field368.length; ++var4) {
            byte[] var5 = this.field616[var4];
            if (var5 != null) {
                int var6 = (this.field504[var4] >> 8) * 64 - this.field255;
                int var7 = (this.field504[var4] & 255) * 64 - this.field256;
                if (this.field321) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class5.method50(0, var5, var6, var7);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field570) {
            return -4;
        } else {
            this.field550 = 2;
            class5.field149 = this.field605;
            this.method94(false);
            if (arg0 != -45921) {
                field252 = this.field541.method450();
            }
            this.field406.method285(210, 132);
            return 0;
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(BJ)V")
    public final void method154(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field610 >= 100 && this.field507 != 1) {
                this.method69(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", -113);
            } else if (this.field610 >= 200) {
                this.method69(0, "", "Your friendlist is full. Max of 100 for free users, and 200 for members", -113);
            } else {
                String var4 = class63.method585(class63.method582((byte) 57, arg1), 0);
                for (int var5 = 0; var5 < this.field610; ++var5) {
                    if (this.field515[var5] == arg1) {
                        this.method69(0, "", var4 + " is already on your friend list", -113);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field202; ++var6) {
                    if (this.field555[var6] == arg1) {
                        this.method69(0, "", "Please remove " + var4 + " from your ignore list first", -113);
                        return;
                    }
                }
                if (!var4.equals(field499.field113)) {
                    this.field398[this.field610] = var4;
                    if (arg0 == 6) {
                        boolean var7 = false;
                    } else {
                        for (int var8 = 1; var8 > 0; ++var8) {
                        }
                    }
                    this.field515[this.field610] = arg1;
                    this.field300[this.field610] = 0;
                    ++this.field610;
                    this.field489 = true;
                    this.field406.method285(167, 132);
                    this.field406.method292(arg1, this.field362);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "e", descriptor = "(II)V")
    public final void method155(int arg0, int arg1) {
        class20 var3 = class20.method256(arg1);
        for (int var4 = 0; var4 < var3.field899.length && var3.field899[var4] != -1; ++var4) {
            class20 var5 = class20.method256(var3.field899[var4]);
            if (var5.field877 == 1) {
                this.method155(20489, var5.field892);
            }
            var5.field929 = 0;
            var5.field906 = 0;
        }
        if (arg0 != 20489) {
            this.field355 = !this.field355;
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(BI)V")
    public final void method156(byte arg0, int arg1) {
        signlink.wavevol = arg1;
        if (arg0 != 0) {
            this.field363 = !this.field363;
        }
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        this.field320 &= arg0;
        for (class67 var2 = (class67) this.field185.method600(); var2 != null; var2 = (class67) this.field185.method602((byte) 3)) {
            if (this.field605 == var2.field1701 && field502 <= var2.field1713) {
                if (field502 >= var2.field1712) {
                    if (var2.field1707 > 0) {
                        class23 var3 = this.field265[var2.field1707 - 1];
                        if (var3 != null && var3.field1152 >= 0 && var3.field1152 < 13312 && var3.field1153 >= 0 && var3.field1153 < 13312) {
                            var2.method591(false, var3.field1153, field502, this.method80(var2.field1701, var3.field1152, var3.field1153, 9) - var2.field1717, var3.field1152);
                        }
                    }
                    if (var2.field1707 < 0) {
                        int var4 = -var2.field1707 - 1;
                        class4 var5;
                        if (this.field476 == var4) {
                            var5 = field499;
                        } else {
                            var5 = this.field434[var4];
                        }
                        if (var5 != null && var5.field1152 >= 0 && var5.field1152 < 13312 && var5.field1153 >= 0 && var5.field1153 < 13312) {
                            var2.method591(false, var5.field1153, field502, this.method80(var2.field1701, var5.field1152, var5.field1153, 9) - var2.field1717, var5.field1152);
                        }
                    }
                    var2.method590((byte) -10, this.field276);
                    this.field390.method498(false, var2.field1703, (int) var2.field1697, false, 60, var2, this.field605, (int) var2.field1698, (int) var2.field1696, -1);
                }
            } else {
                var2.method367();
            }
        }
    }

    @OriginalMember(owner = "client", name = "f", descriptor = "(II)V")
    public final void method158(int arg0, int arg1) {
        if (arg1 != 35928) {
            field254 = !field254;
        }
        class20.method257(arg0, 35928);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMLLEEKZP;B)V")
    private final void method159(class29 arg0, byte arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg1 != 8) {
            this.field406.method286(68);
        }
        if (arg0.field1063 == 0) {
            var3 = this.field390.method513(arg0.field1062, arg0.field1064, arg0.field1065);
        }
        if (arg0.field1063 == 1) {
            var3 = this.field390.method514(arg0.field1064, true, arg0.field1062, arg0.field1065);
        }
        if (arg0.field1063 == 2) {
            var3 = this.field390.method515(arg0.field1062, arg0.field1064, arg0.field1065);
        }
        if (arg0.field1063 == 3) {
            var3 = this.field390.method516(arg0.field1062, arg0.field1064, arg0.field1065);
        }
        if (var3 != 0) {
            int var7 = this.field390.method517(arg0.field1062, arg0.field1064, arg0.field1065, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1059 = var4;
        arg0.field1061 = var5;
        arg0.field1060 = var6;
    }

    @OriginalMember(owner = "client", name = "k", descriptor = "(B)V")
    public final void method160(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field161 = this.field177.method296();
        }
        if (super.field729 == 1) {
            if (super.field730 >= 539 && super.field730 <= 573 && super.field731 >= 169 && super.field731 < 205 && this.field587[0] != -1) {
                this.field489 = true;
                this.field233 = 0;
                this.field469 = true;
            }
            if (super.field730 >= 569 && super.field730 <= 599 && super.field731 >= 168 && super.field731 < 205 && this.field587[1] != -1) {
                this.field489 = true;
                this.field233 = 1;
                this.field469 = true;
            }
            if (super.field730 >= 597 && super.field730 <= 627 && super.field731 >= 168 && super.field731 < 205 && this.field587[2] != -1) {
                this.field489 = true;
                this.field233 = 2;
                this.field469 = true;
            }
            if (super.field730 >= 625 && super.field730 <= 669 && super.field731 >= 168 && super.field731 < 203 && this.field587[3] != -1) {
                this.field489 = true;
                this.field233 = 3;
                this.field469 = true;
            }
            if (super.field730 >= 666 && super.field730 <= 696 && super.field731 >= 168 && super.field731 < 205 && this.field587[4] != -1) {
                this.field489 = true;
                this.field233 = 4;
                this.field469 = true;
            }
            if (super.field730 >= 694 && super.field730 <= 724 && super.field731 >= 168 && super.field731 < 205 && this.field587[5] != -1) {
                this.field489 = true;
                this.field233 = 5;
                this.field469 = true;
            }
            if (super.field730 >= 722 && super.field730 <= 756 && super.field731 >= 169 && super.field731 < 205 && this.field587[6] != -1) {
                this.field489 = true;
                this.field233 = 6;
                this.field469 = true;
            }
            if (super.field730 >= 540 && super.field730 <= 574 && super.field731 >= 466 && super.field731 < 502 && this.field587[7] != -1) {
                this.field489 = true;
                this.field233 = 7;
                this.field469 = true;
            }
            if (super.field730 >= 572 && super.field730 <= 602 && super.field731 >= 466 && super.field731 < 503 && this.field587[8] != -1) {
                this.field489 = true;
                this.field233 = 8;
                this.field469 = true;
            }
            if (super.field730 >= 599 && super.field730 <= 629 && super.field731 >= 466 && super.field731 < 503 && this.field587[9] != -1) {
                this.field489 = true;
                this.field233 = 9;
                this.field469 = true;
            }
            if (super.field730 >= 627 && super.field730 <= 671 && super.field731 >= 467 && super.field731 < 502 && this.field587[10] != -1) {
                this.field489 = true;
                this.field233 = 10;
                this.field469 = true;
            }
            if (super.field730 >= 669 && super.field730 <= 699 && super.field731 >= 466 && super.field731 < 503 && this.field587[11] != -1) {
                this.field489 = true;
                this.field233 = 11;
                this.field469 = true;
            }
            if (super.field730 >= 696 && super.field730 <= 726 && super.field731 >= 466 && super.field731 < 503 && this.field587[12] != -1) {
                this.field489 = true;
                this.field233 = 12;
                this.field469 = true;
            }
            if (super.field730 >= 724 && super.field730 <= 758 && super.field731 >= 466 && super.field731 < 502 && this.field587[13] != -1) {
                this.field489 = true;
                this.field233 = 13;
                this.field469 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMLYYHULT;IZ)V")
    private final void method161(class30 arg0, int arg1, boolean arg2) {
        for (int var4 = 0; var4 < this.field437; ++var4) {
            int var5 = this.field438[var4];
            class23 var6 = this.field265[var5];
            int var7 = arg0.method296();
            if ((var7 & 64) != 0) {
                var6.field1138 = arg0.method303();
                var6.field1175 = 100;
            }
            if ((var7 & 32) != 0) {
                var6.field1179 = arg0.method324(-178);
                var6.field1180 = arg0.method298();
            }
            if ((var7 & 1) != 0) {
                int var8 = arg0.method316(5715);
                int var9 = arg0.method316(5715);
                var6.method349(var9, 0, var8, field502);
                var6.field1145 = field502 + 300;
                var6.field1146 = arg0.method316(5715);
                var6.field1147 = arg0.method315(0);
            }
            if ((var7 & 2) != 0) {
                int var10 = arg0.method316(5715);
                int var11 = arg0.method315(0);
                var6.method349(var11, 0, var10, field502);
                var6.field1145 = field502 + 300;
                var6.field1146 = arg0.method317(false);
                var6.field1147 = arg0.method296();
            }
            if ((var7 & 128) != 0) {
                var6.field1133 = arg0.method325(584);
                int var12 = arg0.method332(891);
                var6.field1137 = var12 >> 16;
                var6.field1136 = (var12 & 65535) + field502;
                var6.field1134 = 0;
                var6.field1135 = 0;
                if (var6.field1136 > field502) {
                    var6.field1134 = -1;
                }
                if (var6.field1133 == 65535) {
                    var6.field1133 = -1;
                }
            }
            if ((var7 & 16) != 0) {
                var6.field951 = class60.method574(arg0.method326(field278));
                var6.field1144 = var6.field951.field1628;
                var6.field1139 = var6.field951.field1622;
                var6.field1159 = var6.field951.field1603;
                var6.field1160 = var6.field951.field1620;
                var6.field1161 = var6.field951.field1612;
                var6.field1162 = var6.field951.field1626;
                var6.field1148 = var6.field951.field1625;
            }
            if ((var7 & 4) != 0) {
                var6.field1164 = arg0.method325(584);
                if (var6.field1164 == 65535) {
                    var6.field1164 = -1;
                }
            }
            if ((var7 & 8) != 0) {
                int var13 = arg0.method324(-178);
                if (var13 == 65535) {
                    var13 = -1;
                }
                int var14 = arg0.method316(5715);
                if (var6.field1182 == var13 && var13 != -1) {
                    int var15 = class58.field1570[var13].field1584;
                    if (var15 == 1) {
                        var6.field1183 = 0;
                        var6.field1184 = 0;
                        var6.field1185 = var14;
                        var6.field1186 = 0;
                    }
                    if (var15 == 2) {
                        var6.field1186 = 0;
                    }
                } else if (var13 == -1 || var6.field1182 == -1 || class58.field1570[var13].field1578 >= class58.field1570[var6.field1182].field1578) {
                    var6.field1182 = var13;
                    var6.field1183 = 0;
                    var6.field1184 = 0;
                    var6.field1185 = var14;
                    var6.field1186 = 0;
                    var6.field1143 = var6.field1167;
                }
            }
        }
        if (arg2) {
            this.field161 = -1;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;BIIILjava/lang/String;)LGWOEELWB;")
    public final class18 method162(String arg0, byte arg1, int arg2, int arg3, int arg4, String arg5) {
        if (arg1 != -79) {
            this.field622 = null;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field317[0] != null) {
                var7 = this.field317[0].method446(arg3, (byte) 2);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field344.reset();
            this.field344.update(var7);
            int var9 = (int) this.field344.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class18(var7, 8);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method142(arg4, "Requesting " + arg5, true);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method206(arg0 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class30 var17 = new class30(true, var16);
                    var17.field1092 = 3;
                    int var18 = var17.method300() + 6;
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
                            this.method142(arg4, "Loading " + arg5 + " - " + var23 + "%", true);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field317[0] != null) {
                            this.field317[0].method447(arg3, (byte) 0, var7, var7.length);
                        }
                    } catch (Exception var29) {
                        this.field317[0] = null;
                    }
                    if (var7 != null) {
                        this.field344.reset();
                        this.field344.update(var7);
                        int var24 = (int) this.field344.getValue();
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
                            this.method142(arg4, "Game updated - please reload page", true);
                            var26 = 10;
                        } else {
                            this.method142(arg4, var12 + " - Retrying in " + var26, true);
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
                    this.field204 = !this.field204;
                }
            }
            return new class18(var7, 8);
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LMLYYHULT;II)V")
    private final void method163(class30 arg0, int arg1, int arg2) {
        int var4 = arg0.method307(8, 84);
        if (var4 < this.field435) {
            for (int var5 = var4; var5 < this.field435; ++var5) {
                this.field343[this.field342++] = this.field436[var5];
            }
        }
        if (var4 > this.field435) {
            signlink.reporterror(this.field529 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field435 = 0;
            if (arg1 >= 0) {
                this.method208();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field436[var6];
                class4 var8 = this.field434[var7];
                int var9 = arg0.method307(1, 84);
                if (var9 == 0) {
                    this.field436[this.field435++] = var7;
                    var8.field1166 = field502;
                } else {
                    int var10 = arg0.method307(2, 84);
                    if (var10 == 0) {
                        this.field436[this.field435++] = var7;
                        var8.field1166 = field502;
                        this.field438[this.field437++] = var7;
                    } else if (var10 == 1) {
                        this.field436[this.field435++] = var7;
                        var8.field1166 = field502;
                        int var11 = arg0.method307(3, 84);
                        var8.method351(var11, false, 5);
                        int var12 = arg0.method307(1, 84);
                        if (var12 == 1) {
                            this.field438[this.field437++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field436[this.field435++] = var7;
                        var8.field1166 = field502;
                        int var13 = arg0.method307(3, 84);
                        var8.method351(var13, true, 5);
                        int var14 = arg0.method307(3, 84);
                        var8.method351(var14, true, 5);
                        int var15 = arg0.method307(1, 84);
                        if (var15 == 1) {
                            this.field438[this.field437++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field343[this.field342++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "z", descriptor = "(I)V")
    public static final void method164(int arg0) {
        class53.field1468 = true;
        class41.field1298 = true;
        if (arg0 < 0) {
            field353 = true;
            class5.field143 = true;
            class27.field998 = true;
        }
    }

    @OriginalMember(owner = "client", name = "g", descriptor = "(II)V")
    public final void method165(int arg0, int arg1) {
        int[] var3 = this.field495.field1436;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field318[arg0][var24][var6] & 24) == 0) {
                    this.field390.method522(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field318[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field390.method522(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field495.method469(0);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field318[arg0][var22][var9] & 24) == 0) {
                    this.method96(arg0, var22, 586, var8, var7, var9);
                }
                if (arg0 < 3 && (this.field318[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method96(arg0 + 1, var22, 586, var8, var7, var9);
                }
            }
        }
        if (this.field191 != null) {
            this.field191.method578(0);
            class41.field1309 = this.field633;
        }
        this.field576 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field390.method516(this.field605, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class27.method282(var13).field991;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field556[this.field605].field1213;
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
                        this.field483[this.field576] = this.field225[var14];
                        this.field577[this.field576] = var15;
                        this.field578[this.field576] = var16;
                        ++this.field576;
                    }
                }
            }
        }
        if (arg1 >= 0) {
            this.field496 = 449;
        }
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(B)V")
    public final void method166(byte arg0) {
        for (int var2 = -1; var2 < this.field435; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field433;
            } else {
                var7 = this.field436[var2];
            }
            class4 var8 = this.field434[var7];
            if (var8 != null && var8.field1175 > 0) {
                --var8.field1175;
                if (var8.field1175 == 0) {
                    var8.field1138 = null;
                }
            }
        }
        for (int var3 = 0; var3 < this.field266; ++var3) {
            int var5 = this.field267[var3];
            class23 var6 = this.field265[var5];
            if (var6 != null && var6.field1175 > 0) {
                --var6.field1175;
                if (var6.field1175 == 0) {
                    var6.field1138 = null;
                }
            }
        }
        if (arg0 == 0) {
            boolean var4 = false;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IJ)V")
    public final void method167(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field202 >= 100) {
                this.method69(0, "", "Your ignore list is full. Max of 100 hit", -113);
            } else {
                String var4 = class63.method585(class63.method582((byte) 57, arg1), 0);
                if (arg0 > 0) {
                    for (int var5 = 0; var5 < this.field202; ++var5) {
                        if (this.field555[var5] == arg1) {
                            this.method69(0, "", var4 + " is already on your ignore list", -113);
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field610; ++var6) {
                        if (this.field515[var6] == arg1) {
                            this.method69(0, "", "Please remove " + var4 + " from your friend list first", -113);
                            return;
                        }
                    }
                    this.field555[this.field202++] = arg1;
                    this.field489 = true;
                    this.field406.method285(71, 132);
                    this.field406.method292(arg1, this.field362);
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(B)V")
    public final void method168(byte arg0) {
        this.field189.method578(0);
        class41.field1309 = this.field632;
        this.field281.method347(0, 0, (byte) 2);
        if (this.field521 != -1) {
            this.method148((byte) 3, 0, 0, 0, class20.method256(this.field521));
        } else if (this.field587[this.field233] != -1) {
            this.method148((byte) 3, 0, 0, 0, class20.method256(this.field587[this.field233]));
        }
        if (this.field301 && this.field522 == 1) {
            this.method147(field254);
        }
        this.field189.method579(7, 205, super.field715, 553);
        this.field191.method578(0);
        class41.field1309 = this.field633;
        if (arg0 != 37) {
            field216 = -36;
        }
    }

    @OriginalMember(owner = "client", name = "A", descriptor = "(I)V")
    public final void method169(int arg0) {
        if (this.field488 != 0) {
            int var2 = 0;
            if (this.field384 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field424[var3] != null) {
                    int var5 = this.field422[var3];
                    String var6 = this.field423[var3];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field274 == 0 || this.field274 == 1 && this.method132((byte) 8, var6))) {
                        int var10 = 329 - var2 * 13;
                        if (super.field723 > 4 && super.field724 - 4 > var10 - 10 && super.field724 - 4 <= var10 + 3) {
                            int var11 = this.field338.method456("From:  " + var6 + this.field424[var3], 9) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field723 < var11 + 4) {
                                if (this.field561 >= 1) {
                                    this.field606[this.field586] = "Report abuse @whi@" + var6;
                                    this.field231[this.field586] = 2787;
                                    ++this.field586;
                                }
                                this.field606[this.field586] = "Add ignore @whi@" + var6;
                                this.field231[this.field586] = 2379;
                                ++this.field586;
                                this.field606[this.field586] = "Add friend @whi@" + var6;
                                this.field231[this.field586] = 2696;
                                ++this.field586;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field274 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
            int var4 = 5 / arg0;
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(B)V")
    public final void method170(byte arg0) {
        this.field192.method578(0);
        class41.field1309 = this.field631;
        this.field283.method347(0, 0, (byte) 2);
        if (arg0 != 42) {
            this.field161 = this.field177.method296();
        }
        if (this.field417) {
            this.field339.method454(1, 0, 40, 239, this.field371);
            this.field339.method454(1, 128, 60, 239, this.field443 + "*");
        } else if (this.field348 == 1) {
            this.field339.method454(1, 0, 40, 239, "Enter amount:");
            this.field339.method454(1, 128, 60, 239, this.field382 + "*");
        } else if (this.field348 == 2) {
            this.field339.method454(1, 0, 40, 239, "Enter name:");
            this.field339.method454(1, 128, 60, 239, this.field382 + "*");
        } else if (this.field348 == 3) {
            if (this.field412 != this.field382) {
                this.method192(this.field382, -351);
                this.field412 = this.field382;
            }
            class50 var2 = this.field338;
            class56.method543(0, 0, 463, 134, 77);
            for (int var3 = 0; var3 < this.field413; ++var3) {
                int var4 = var3 * 14 + 18 - this.field416;
                if (var4 > 0 && var4 < 110) {
                    var2.method454(1, 0, var4, 239, this.field414[var3]);
                }
            }
            class56.method542(260);
            if (this.field413 > 5) {
                this.method81(0, 463, 382, 77, this.field413 * 14 + 7, this.field416);
            }
            if (this.field382.length() == 0) {
                this.field339.method454(1, 255, 40, 239, "Enter object name");
            } else if (this.field413 == 0) {
                this.field339.method454(1, 0, 40, 239, "No matching objects found, please shorten search");
            }
            var2.method454(1, 0, 90, 239, this.field382 + "*");
            class56.method549(0, 0, 77, 479, 0);
        } else if (this.field224 != null) {
            this.field339.method454(1, 0, 40, 239, this.field224);
            this.field339.method454(1, 128, 60, 239, "Click to continue");
        } else if (this.field585 != -1) {
            this.method148((byte) 3, 0, 0, 0, class20.method256(this.field585));
        } else if (this.field615 != -1) {
            this.method148((byte) 3, 0, 0, 0, class20.method256(this.field615));
        } else {
            class50 var5 = this.field338;
            int var6 = 0;
            class56.method543(0, 0, 463, 134, 77);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field424[var7] != null) {
                    int var9 = this.field422[var7];
                    int var10 = 70 - var6 * 14 + this.field327;
                    String var11 = this.field423[var7];
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
                            var5.method458((byte) -61, 0, 4, var10, this.field424[var7]);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field485 == 0 || this.field485 == 1 && this.method132((byte) 8, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field297[0].method347(var13, var10 - 12, (byte) 2);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field297[1].method347(var13, var10 - 12, (byte) 2);
                                var13 += 14;
                            }
                            var5.method458((byte) -61, 0, var13, var10, var11 + ":");
                            int var14 = var13 + var5.method456(var11, 9) + 8;
                            var5.method458((byte) -61, 255, var14, var10, this.field424[var7]);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field488 == 0 && (var9 == 7 || this.field274 == 0 || this.field274 == 1 && this.method132((byte) 8, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method458((byte) -61, 0, var15, var10, "From");
                            int var16 = var15 + var5.method456("From ", 9);
                            if (var12 == 1) {
                                this.field297[0].method347(var16, var10 - 12, (byte) 2);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field297[1].method347(var16, var10 - 12, (byte) 2);
                                var16 += 14;
                            }
                            var5.method458((byte) -61, 0, var16, var10, var11 + ":");
                            int var17 = var16 + var5.method456(var11, 9) + 8;
                            var5.method458((byte) -61, 8388608, var17, var10, this.field424[var7]);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field636 == 0 || this.field636 == 1 && this.method132((byte) 8, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method458((byte) -61, 8388736, 4, var10, var11 + " " + this.field424[var7]);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field488 == 0 && this.field274 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method458((byte) -61, 8388608, 4, var10, this.field424[var7]);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field488 == 0 && this.field274 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method458((byte) -61, 0, 4, var10, "To " + var11 + ":");
                            var5.method458((byte) -61, 8388608, 12 + var5.method456("To " + var11, 9), var10, this.field424[var7]);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field636 == 0 || this.field636 == 1 && this.method132((byte) 8, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method458((byte) -61, 8270336, 4, var10, var11 + " " + this.field424[var7]);
                        }
                        ++var6;
                    }
                }
            }
            class56.method542(260);
            this.field260 = var6 * 14 + 7;
            if (this.field260 < 78) {
                this.field260 = 78;
            }
            this.method81(0, 463, 382, 77, this.field260, this.field260 - this.field327 - 77);
            String var8;
            if (field499 != null && field499.field113 != null) {
                var8 = field499.field113;
            } else {
                var8 = class63.method585(this.field529, 0);
            }
            var5.method458((byte) -61, 0, 4, 90, var8 + ":");
            var5.method458((byte) -61, 255, 6 + var5.method456(var8 + ": ", 9), 90, this.field612 + "*");
            class56.method549(0, 0, 77, 479, 0);
        }
        if (this.field301 && this.field522 == 2) {
            this.method147(field254);
        }
        this.field192.method579(7, 357, super.field715, 17);
        this.field191.method578(0);
        class41.field1309 = this.field633;
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IIII)I")
    public final int method171(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 < this.field239 || arg2 > this.field239) {
            this.field161 = -1;
        }
        int var5 = 256 - arg0;
        return ((arg1 & 16711935) * var5 + (arg3 & 16711935) * arg0 & -16711936) + ((arg1 & 65280) * var5 + (arg3 & 65280) * arg0 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client", name = "l", descriptor = "(Z)V")
    public final void method172(boolean arg0) {
        int var2 = this.field339.method456("Choose Option", 9);
        for (int var3 = 0; var3 < this.field586; ++var3) {
            int var12 = this.field339.method456(this.field606[var3], 9);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        int var4 = this.field586 * 15 + 21;
        if (arg0) {
            for (int var5 = 1; var5 > 0; ++var5) {
            }
        }
        if (super.field730 > 4 && super.field731 > 4 && super.field730 < 516 && super.field731 < 338) {
            int var6 = super.field730 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field731 - 4;
            if (var4 + var7 > 334) {
                var7 = 334 - var4;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field301 = true;
            this.field522 = 0;
            this.field523 = var6;
            this.field524 = var7;
            this.field525 = var2;
            this.field526 = this.field586 * 15 + 22;
        }
        if (super.field730 > 553 && super.field731 > 205 && super.field730 < 743 && super.field731 < 466) {
            int var8 = super.field730 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field731 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var4 + var9 > 261) {
                var9 = 261 - var4;
            }
            this.field301 = true;
            this.field522 = 1;
            this.field523 = var8;
            this.field524 = var9;
            this.field525 = var2;
            this.field526 = this.field586 * 15 + 22;
        }
        if (super.field730 > 17 && super.field731 > 357 && super.field730 < 496 && super.field731 < 453) {
            int var10 = super.field730 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field731 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var4 + var11 > 96) {
                var11 = 96 - var4;
            }
            this.field301 = true;
            this.field522 = 2;
            this.field523 = var10;
            this.field524 = var11;
            this.field525 = var2;
            this.field526 = this.field586 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client", name = "B", descriptor = "(I)V")
    public final void method173(int arg0) {
        if (this.field221 == 0) {
            int var2 = super.field729;
            while (arg0 >= 0) {
                this.field161 = -1;
            }
            if (this.field427 == 1 && super.field730 >= 516 && super.field731 >= 160 && super.field730 <= 765 && super.field731 <= 205) {
                var2 = 0;
            }
            if (this.field301) {
                if (var2 != 1) {
                    int var3 = super.field723;
                    int var4 = super.field724;
                    if (this.field522 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field522 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field522 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field523 - 10 || var3 > this.field525 + this.field523 + 10 || var4 < this.field524 - 10 || var4 > this.field526 + this.field524 + 10) {
                        this.field301 = false;
                        if (this.field522 == 1) {
                            this.field489 = true;
                        }
                        if (this.field522 == 2) {
                            this.field511 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field523;
                    int var6 = this.field524;
                    int var7 = this.field525;
                    int var8 = super.field730;
                    int var9 = super.field731;
                    if (this.field522 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field522 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field522 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field586; ++var11) {
                        int var12 = (this.field586 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method124(-415, var10);
                    }
                    this.field301 = false;
                    if (this.field522 == 1) {
                        this.field489 = true;
                    }
                    if (this.field522 == 2) {
                        this.field511 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field586 > 0) {
                    int var13 = this.field231[this.field586 - 1];
                    if (var13 == 391 || var13 == 377 || var13 == 277 || var13 == 281 || var13 == 485 || var13 == 181 || var13 == 946 || var13 == 152 || var13 == 1 || var13 == 530 || var13 == 963 || var13 == 1870) {
                        int var14 = this.field229[this.field586 - 1];
                        int var15 = this.field230[this.field586 - 1];
                        class20 var16 = class20.method256(var15);
                        if (var16.field926 || var16.field875) {
                            this.field370 = false;
                            this.field609 = 0;
                            this.field219 = var15;
                            this.field220 = var14;
                            this.field221 = 2;
                            this.field222 = super.field730;
                            this.field223 = super.field731;
                            if (class20.method256(var15).field917 == this.field207) {
                                this.field221 = 1;
                            }
                            if (class20.method256(var15).field917 == this.field585) {
                                this.field221 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field582 == 1 || this.method135((byte) -86, this.field586 - 1)) && this.field586 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field586 > 0) {
                    this.method124(-415, this.field586 - 1);
                }
                if (var2 != 2 || this.field586 <= 0) {
                    return;
                }
                this.method172(false);
            }
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(III)V")
    public final void method174(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field424[var5] != null) {
                int var6 = this.field422[var5];
                int var7 = 70 - var4 * 14 + this.field327 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field423[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field485 == 0 || this.field485 == 1 && this.method132((byte) 8, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7 && !var8.equals(field499.field113)) {
                        if (this.field561 >= 1) {
                            this.field606[this.field586] = "Report abuse @whi@" + var8;
                            this.field231[this.field586] = 787;
                            ++this.field586;
                        }
                        this.field606[this.field586] = "Add ignore @whi@" + var8;
                        this.field231[this.field586] = 379;
                        ++this.field586;
                        this.field606[this.field586] = "Add friend @whi@" + var8;
                        this.field231[this.field586] = 696;
                        ++this.field586;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field488 == 0 && (var6 == 7 || this.field274 == 0 || this.field274 == 1 && this.method132((byte) 8, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        if (this.field561 >= 1) {
                            this.field606[this.field586] = "Report abuse @whi@" + var8;
                            this.field231[this.field586] = 787;
                            ++this.field586;
                        }
                        this.field606[this.field586] = "Add ignore @whi@" + var8;
                        this.field231[this.field586] = 379;
                        ++this.field586;
                        this.field606[this.field586] = "Add friend @whi@" + var8;
                        this.field231[this.field586] = 696;
                        ++this.field586;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field636 == 0 || this.field636 == 1 && this.method132((byte) 8, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field606[this.field586] = "Accept trade @whi@" + var8;
                        this.field231[this.field586] = 940;
                        ++this.field586;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field488 == 0 && this.field274 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field636 == 0 || this.field636 == 1 && this.method132((byte) 8, var8))) {
                    if (arg2 > var7 - 14 && arg2 <= var7) {
                        this.field606[this.field586] = "Accept challenge @whi@" + var8;
                        this.field231[this.field586] = 113;
                        ++this.field586;
                    }
                    ++var4;
                }
            }
        }
        if (arg0 < 8 || arg0 > 8) {
            this.field406.method286(102);
        }
    }

    @OriginalMember(owner = "client", name = "C", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method175(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client", name = "D", descriptor = "(I)V")
    public final void method176(int arg0) {
        if (arg0 == 2) {
            try {
                if (this.field599 != null) {
                    this.field599.method261();
                }
            } catch (Exception var3) {
            }
            this.field599 = null;
            this.field320 = false;
            this.field548 = 0;
            this.field529 = "";
            this.field530 = "";
            this.method79((byte) 2);
            this.field390.method487((byte) 80);
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field556[var2].method353();
            }
            System.gc();
            this.method209(1);
            this.field569 = -1;
            this.field183 = -1;
            this.field455 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;ZLjava/lang/String;)V")
    public final void method177(String arg0, boolean arg1, String arg2) {
        if (!arg1) {
            if (this.field191 != null) {
                this.field191.method578(0);
                class41.field1309 = this.field633;
                int var4 = 151;
                if (arg2 != null) {
                    var4 -= 7;
                }
                this.field338.method454(1, 0, var4, 257, arg0);
                this.field338.method454(1, 16777215, var4 - 1, 256, arg0);
                var4 += 15;
                if (arg2 != null) {
                    this.field338.method454(1, 0, var4, 257, arg2);
                    this.field338.method454(1, 16777215, var4 - 1, 256, arg2);
                }
                this.field191.method579(7, 4, super.field715, 4);
            } else if (super.field716 != null) {
                super.field716.method578(0);
                class41.field1309 = this.field634;
                int var5 = 251;
                short var6 = 300;
                byte var7 = 50;
                class56.method546(0, 383 - var6 / 2, true, var5 - 5 - var7 / 2, var6, var7);
                class56.method547(658, var5 - 5 - var7 / 2, var7, 383 - var6 / 2, 16777215, var6);
                if (arg2 != null) {
                    var5 -= 7;
                }
                this.field338.method454(1, 0, var5, 383, arg0);
                this.field338.method454(1, 16777215, var5 - 1, 382, arg0);
                var5 += 15;
                if (arg2 != null) {
                    this.field338.method454(1, 0, var5, 383, arg2);
                    this.field338.method454(1, 16777215, var5 - 1, 382, arg2);
                }
                super.field716.method579(7, 0, super.field715, 0);
            }
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(B)V")
    public final void method178(byte arg0) {
        int var2 = this.field193 * 128 + 64;
        int var3 = this.field194 * 128 + 64;
        int var4 = this.method80(this.field605, var2, var3, 9) - this.field195;
        if (this.field617 < var2) {
            this.field617 += (var2 - this.field617) * this.field197 / 1000 + this.field196;
            if (this.field617 > var2) {
                this.field617 = var2;
            }
        }
        if (this.field617 > var2) {
            this.field617 -= (this.field617 - var2) * this.field197 / 1000 + this.field196;
            if (this.field617 < var2) {
                this.field617 = var2;
            }
        }
        if (this.field618 < var4) {
            this.field618 += (var4 - this.field618) * this.field197 / 1000 + this.field196;
            if (this.field618 > var4) {
                this.field618 = var4;
            }
        }
        if (this.field618 > var4) {
            this.field618 -= (this.field618 - var4) * this.field197 / 1000 + this.field196;
            if (this.field618 < var4) {
                this.field618 = var4;
            }
        }
        if (this.field619 < var3) {
            this.field619 += (var3 - this.field619) * this.field197 / 1000 + this.field196;
            if (this.field619 > var3) {
                this.field619 = var3;
            }
        }
        if (this.field619 > var3) {
            this.field619 -= (this.field619 - var3) * this.field197 / 1000 + this.field196;
            if (this.field619 < var3) {
                this.field619 = var3;
            }
        }
        int var5 = this.field306 * 128 + 64;
        int var6 = this.field307 * 128 + 64;
        if (this.field579 == arg0) {
            int var7 = this.method80(this.field605, var5, var6, 9) - this.field308;
            int var8 = var5 - this.field617;
            int var9 = var7 - this.field618;
            int var10 = var6 - this.field619;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field620 < var12) {
                this.field620 += (var12 - this.field620) * this.field310 / 1000 + this.field309;
                if (this.field620 > var12) {
                    this.field620 = var12;
                }
            }
            if (this.field620 > var12) {
                this.field620 -= (this.field620 - var12) * this.field310 / 1000 + this.field309;
                if (this.field620 < var12) {
                    this.field620 = var12;
                }
            }
            int var14 = var13 - this.field621;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field621 += this.field310 * var14 / 1000 + this.field309;
                this.field621 &= 2047;
            }
            if (var14 < 0) {
                this.field621 -= -var14 * this.field310 / 1000 + this.field309;
                this.field621 &= 2047;
            }
            int var15 = var13 - this.field621;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field621 = var13;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg6 >= 0) {
            this.field622 = null;
        }
        if (arg2 >= 1 && arg5 >= 1 && arg2 <= 102 && arg5 <= 102) {
            if (field353 && this.field605 != arg4) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg1 == 0) {
                var9 = this.field390.method513(arg4, arg2, arg5);
            }
            if (arg1 == 1) {
                var9 = this.field390.method514(arg2, true, arg4, arg5);
            }
            if (arg1 == 2) {
                var9 = this.field390.method515(arg4, arg2, arg5);
            }
            if (arg1 == 3) {
                var9 = this.field390.method516(arg4, arg2, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field390.method517(arg4, arg2, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg1 == 0) {
                    this.field390.method504(arg4, 334, arg5, arg2);
                    class27 var17 = class27.method282(var14);
                    if (var17.field1013) {
                        this.field556[arg4].method358(arg2, arg5, var17.field1030, 0, var16, var15);
                    }
                }
                if (arg1 == 1) {
                    this.field390.method505(arg2, arg5, arg4, 0);
                }
                if (arg1 == 2) {
                    this.field390.method506(arg2, arg5, arg4, 7);
                    class27 var18 = class27.method282(var14);
                    if (var18.field985 + arg2 > 103 || var18.field985 + arg5 > 103 || var18.field996 + arg2 > 103 || var18.field996 + arg5 > 103) {
                        return;
                    }
                    if (var18.field1013) {
                        this.field556[arg4].method359(var18.field985, arg2, var18.field996, -365, var16, var18.field1030, arg5);
                    }
                }
                if (arg1 == 3) {
                    this.field390.method507(arg2, arg5, (byte) 9, arg4);
                    class27 var19 = class27.method282(var14);
                    if (var19.field1013 && var19.field984) {
                        this.field556[arg4].method361(arg2, -978, arg5);
                    }
                }
            }
            if (arg7 >= 0) {
                int var20 = arg4;
                if (arg4 < 3 && (this.field318[1][arg2][arg5] & 2) == 2) {
                    var20 = arg4 + 1;
                }
                class5.method58(var20, arg0, arg2, this.field390, arg4, this.field262, this.field484, arg5, this.field556[arg4], arg3, arg7);
                return;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;)V")
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

    @OriginalMember(owner = "client", name = "a", descriptor = "(II[B)Z")
    public final boolean method181(int arg0, int arg1, byte[] arg2) {
        if (arg0 >= 0) {
            this.method208();
        }
        return arg2 == null ? true : signlink.wavesave(arg2, arg1);
    }

    @OriginalMember(owner = "client", name = "E", descriptor = "(I)V")
    public final void method182(int arg0) {
        this.field160 += arg0;
        if (super.field716 == null) {
            this.method84((byte) 9);
            this.field588 = null;
            this.field589 = null;
            this.field590 = null;
            this.field591 = null;
            this.field592 = null;
            this.field593 = null;
            this.field594 = null;
            this.field595 = null;
            this.field596 = null;
            this.field192 = null;
            this.field190 = null;
            this.field189 = null;
            this.field191 = null;
            this.field364 = null;
            this.field365 = null;
            this.field366 = null;
            super.field716 = new class62(765, 503, 462, this.method122(false));
            this.field446 = true;
        }
    }

    @OriginalMember(owner = "client", name = "F", descriptor = "(I)V")
    public final void method183(int arg0) {
        ++field549;
        if (arg0 < this.field319 || arg0 > this.field319) {
            this.field622 = null;
        }
        if (field549 > 179) {
            field549 = 0;
            this.field406.method285(193, 132);
            this.field406.method290(0);
        }
        for (int var2 = 0; var2 < this.field266; ++var2) {
            int var3 = this.field267[var2];
            class23 var4 = this.field265[var3];
            if (var4 != null) {
                this.method184(var4.field951.field1628, 825, var4);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(IILNXRPKSXU;)V")
    public final void method184(int arg0, int arg1, class34 arg2) {
        int var4 = 9 / arg1;
        if (arg2.field1152 < 128 || arg2.field1153 < 128 || arg2.field1152 >= 13184 || arg2.field1153 >= 13184) {
            arg2.field1182 = -1;
            arg2.field1133 = -1;
            arg2.field1172 = 0;
            arg2.field1173 = 0;
            arg2.field1152 = arg2.field1140[0] * 128 + arg2.field1144 * 64;
            arg2.field1153 = arg2.field1141[0] * 128 + arg2.field1144 * 64;
            arg2.method350(-784);
        }
        if (field499 == arg2 && (arg2.field1152 < 1536 || arg2.field1153 < 1536 || arg2.field1152 >= 11776 || arg2.field1153 >= 11776)) {
            arg2.field1182 = -1;
            arg2.field1133 = -1;
            arg2.field1172 = 0;
            arg2.field1173 = 0;
            arg2.field1152 = arg2.field1140[0] * 128 + arg2.field1144 * 64;
            arg2.field1153 = arg2.field1141[0] * 128 + arg2.field1144 * 64;
            arg2.method350(-784);
        }
        if (arg2.field1172 > field502) {
            this.method185(-169, arg2);
        } else if (arg2.field1173 >= field502) {
            this.method186((byte) -119, arg2);
        } else {
            this.method187(arg2, 0);
        }
        this.method188(true, arg2);
        this.method189(100, arg2);
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ILNXRPKSXU;)V")
    public final void method185(int arg0, class34 arg1) {
        int var3 = arg1.field1172 - field502;
        int var4 = arg1.field1168 * 128 + arg1.field1144 * 64;
        int var5 = arg1.field1170 * 128 + arg1.field1144 * 64;
        arg1.field1152 += (var4 - arg1.field1152) / var3;
        if (arg0 < 0) {
            arg1.field1153 += (var5 - arg1.field1153) / var3;
            arg1.field1165 = 0;
            if (arg1.field1174 == 0) {
                arg1.field1158 = 1024;
            }
            if (arg1.field1174 == 1) {
                arg1.field1158 = 1536;
            }
            if (arg1.field1174 == 2) {
                arg1.field1158 = 0;
            }
            if (arg1.field1174 == 3) {
                arg1.field1158 = 512;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(BLNXRPKSXU;)V")
    public final void method186(byte arg0, class34 arg1) {
        if (field502 == arg1.field1173 || arg1.field1182 == -1 || arg1.field1185 != 0 || arg1.field1184 + 1 > class58.field1570[arg1.field1182].method562((byte) 5, arg1.field1183)) {
            int var3 = arg1.field1173 - arg1.field1172;
            int var4 = field502 - arg1.field1172;
            int var5 = arg1.field1168 * 128 + arg1.field1144 * 64;
            int var6 = arg1.field1170 * 128 + arg1.field1144 * 64;
            int var7 = arg1.field1169 * 128 + arg1.field1144 * 64;
            int var8 = arg1.field1171 * 128 + arg1.field1144 * 64;
            arg1.field1152 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg1.field1153 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg1.field1165 = 0;
        if (arg1.field1174 == 0) {
            arg1.field1158 = 1024;
        }
        if (arg1.field1174 == 1) {
            arg1.field1158 = 1536;
        }
        if (arg1.field1174 == 2) {
            arg1.field1158 = 0;
        }
        if (arg1.field1174 == 3) {
            arg1.field1158 = 512;
        }
        arg1.field1154 = arg1.field1158;
        if (arg0 != -119) {
            field508 = !field508;
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(LNXRPKSXU;I)V")
    public final void method187(class34 arg0, int arg1) {
        arg0.field1155 = arg0.field1148;
        if (arg0.field1167 == 0) {
            arg0.field1165 = 0;
        } else {
            if (arg0.field1182 != -1 && arg0.field1185 == 0) {
                class58 var3 = class58.field1570[arg0.field1182];
                if (arg0.field1143 > 0 && var3.field1582 == 0) {
                    ++arg0.field1165;
                    return;
                }
                if (arg0.field1143 <= 0 && var3.field1583 == 0) {
                    ++arg0.field1165;
                    return;
                }
            }
            int var4 = arg0.field1152;
            int var5 = arg0.field1153;
            int var6 = arg0.field1140[arg0.field1167 - 1] * 128 + arg0.field1144 * 64;
            int var7 = arg0.field1141[arg0.field1167 - 1] * 128 + arg0.field1144 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1158 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1158 = 1792;
                    } else {
                        arg0.field1158 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1158 = 768;
                    } else if (var5 > var7) {
                        arg0.field1158 = 256;
                    } else {
                        arg0.field1158 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1158 = 1024;
                } else {
                    arg0.field1158 = 0;
                }
                int var8 = arg0.field1158 - arg0.field1154 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1160;
                this.field160 += arg1;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1159;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1162;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1161;
                }
                if (var9 == -1) {
                    var9 = arg0.field1159;
                }
                arg0.field1155 = var9;
                int var10 = 4;
                if (arg0.field1158 != arg0.field1154 && arg0.field1164 == -1 && arg0.field1139 != 0) {
                    var10 = 2;
                }
                if (arg0.field1167 > 2) {
                    var10 = 6;
                }
                if (arg0.field1167 > 3) {
                    var10 = 8;
                }
                if (arg0.field1165 > 0 && arg0.field1167 > 1) {
                    var10 = 8;
                    --arg0.field1165;
                }
                if (arg0.field1163[arg0.field1167 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1159 == arg0.field1155 && arg0.field1181 != -1) {
                    arg0.field1155 = arg0.field1181;
                }
                if (var4 < var6) {
                    arg0.field1152 += var10;
                    if (arg0.field1152 > var6) {
                        arg0.field1152 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1152 -= var10;
                    if (arg0.field1152 < var6) {
                        arg0.field1152 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1153 += var10;
                    if (arg0.field1153 > var7) {
                        arg0.field1153 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1153 -= var10;
                    if (arg0.field1153 < var7) {
                        arg0.field1153 = var7;
                    }
                }
                if (arg0.field1152 == var6 && arg0.field1153 == var7) {
                    --arg0.field1167;
                    if (arg0.field1143 > 0) {
                        --arg0.field1143;
                        return;
                    }
                }
            } else {
                arg0.field1152 = var6;
                arg0.field1153 = var7;
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZLNXRPKSXU;)V")
    public final void method188(boolean arg0, class34 arg1) {
        if (!arg0) {
            this.method208();
        }
        if (arg1.field1139 != 0) {
            if (arg1.field1164 != -1 && arg1.field1164 < 32768) {
                class23 var3 = this.field265[arg1.field1164];
                if (var3 != null) {
                    int var4 = arg1.field1152 - var3.field1152;
                    int var5 = arg1.field1153 - var3.field1153;
                    if (var4 != 0 || var5 != 0) {
                        arg1.field1158 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg1.field1164 >= 32768) {
                int var6 = arg1.field1164 - 32768;
                if (this.field476 == var6) {
                    var6 = this.field433;
                }
                class4 var7 = this.field434[var6];
                if (var7 != null) {
                    int var8 = arg1.field1152 - var7.field1152;
                    int var9 = arg1.field1153 - var7.field1153;
                    if (var8 != 0 || var9 != 0) {
                        arg1.field1158 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg1.field1179 != 0 || arg1.field1180 != 0) && (arg1.field1167 == 0 || arg1.field1165 > 0)) {
                int var10 = arg1.field1152 - (arg1.field1179 - this.field255 - this.field255) * 64;
                int var11 = arg1.field1153 - (arg1.field1180 - this.field256 - this.field256) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg1.field1158 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg1.field1179 = 0;
                arg1.field1180 = 0;
            }
            int var12 = arg1.field1158 - arg1.field1154 & 2047;
            if (var12 != 0) {
                if (var12 >= arg1.field1139 && var12 <= 2048 - arg1.field1139) {
                    if (var12 > 1024) {
                        arg1.field1154 -= arg1.field1139;
                    } else {
                        arg1.field1154 += arg1.field1139;
                    }
                } else {
                    arg1.field1154 = arg1.field1158;
                }
                arg1.field1154 &= 2047;
                if (arg1.field1155 == arg1.field1148 && arg1.field1158 != arg1.field1154) {
                    if (arg1.field1149 != -1) {
                        arg1.field1155 = arg1.field1149;
                        return;
                    }
                    arg1.field1155 = arg1.field1159;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(ILNXRPKSXU;)V")
    public final void method189(int arg0, class34 arg1) {
        int var3 = 35 / arg0;
        arg1.field1188 = false;
        if (arg1.field1155 != -1) {
            class58 var4 = class58.field1570[arg1.field1155];
            ++arg1.field1157;
            if (arg1.field1156 < var4.field1571 && arg1.field1157 > var4.method562((byte) 5, arg1.field1156)) {
                arg1.field1157 = 0;
                ++arg1.field1156;
            }
            if (arg1.field1156 >= var4.field1571) {
                arg1.field1157 = 0;
                arg1.field1156 = 0;
            }
        }
        if (arg1.field1133 != -1 && field502 >= arg1.field1136) {
            if (arg1.field1134 < 0) {
                arg1.field1134 = 0;
            }
            class58 var5 = class64.field1665[arg1.field1133].field1669;
            ++arg1.field1135;
            while (arg1.field1134 < var5.field1571 && arg1.field1135 > var5.method562((byte) 5, arg1.field1134)) {
                arg1.field1135 -= var5.method562((byte) 5, arg1.field1134);
                ++arg1.field1134;
            }
            if (arg1.field1134 >= var5.field1571 && (arg1.field1134 < 0 || arg1.field1134 >= var5.field1571)) {
                arg1.field1133 = -1;
            }
        }
        if (arg1.field1182 != -1 && arg1.field1185 <= 1) {
            class58 var6 = class58.field1570[arg1.field1182];
            if (var6.field1582 == 1 && arg1.field1143 > 0 && arg1.field1172 <= field502 && arg1.field1173 < field502) {
                arg1.field1185 = 1;
                return;
            }
        }
        if (arg1.field1182 != -1 && arg1.field1185 == 0) {
            class58 var7 = class58.field1570[arg1.field1182];
            ++arg1.field1184;
            while (arg1.field1183 < var7.field1571 && arg1.field1184 > var7.method562((byte) 5, arg1.field1183)) {
                arg1.field1184 -= var7.method562((byte) 5, arg1.field1183);
                ++arg1.field1183;
            }
            if (arg1.field1183 >= var7.field1571) {
                arg1.field1183 -= var7.field1575;
                ++arg1.field1186;
                if (arg1.field1186 >= var7.field1581) {
                    arg1.field1182 = -1;
                }
                if (arg1.field1183 < 0 || arg1.field1183 >= var7.field1571) {
                    arg1.field1182 = -1;
                }
            }
            arg1.field1188 = var7.field1577;
        }
        if (arg1.field1185 > 0) {
            --arg1.field1185;
        }
    }

    @OriginalMember(owner = "client", name = "G", descriptor = "(I)V")
    public final void method190(int arg0) {
        if (this.field369 != -1 && (this.field550 == 2 || super.field716 != null)) {
            if (this.field550 == 2) {
                this.method70(this.field369, -187, this.field276);
                if (this.field217 != -1) {
                    this.method70(this.field217, -187, this.field276);
                }
                this.field276 = 0;
                this.method182(0);
                super.field716.method578(0);
                class41.field1309 = this.field634;
                class56.method544((byte) -2);
                this.field446 = true;
                class20 var2 = class20.method256(this.field369);
                if (var2.field915 == 512 && var2.field901 == 334 && var2.field877 == 0) {
                    var2.field915 = 765;
                    var2.field901 = 503;
                }
                this.method148((byte) 3, 0, 0, 0, var2);
                if (this.field217 != -1) {
                    class20 var3 = class20.method256(this.field217);
                    if (var3.field915 == 512 && var3.field901 == 334 && var3.field877 == 0) {
                        var3.field915 = 765;
                        var3.field901 = 503;
                    }
                    this.method148((byte) 3, 0, 0, 0, var3);
                }
                if (!this.field301) {
                    this.method203(7);
                    this.method82(true);
                } else {
                    this.method147(field254);
                }
            }
            super.field716.method579(7, 0, super.field715, 0);
        } else {
            if (this.field446) {
                this.method202((byte) 3);
                this.field446 = false;
                this.field284.method579(7, 4, super.field715, 0);
                this.field285.method579(7, 357, super.field715, 0);
                this.field286.method579(7, 4, super.field715, 722);
                this.field287.method579(7, 205, super.field715, 743);
                this.field288.method579(7, 0, super.field715, 0);
                this.field289.method579(7, 4, super.field715, 516);
                this.field290.method579(7, 205, super.field715, 516);
                this.field291.method579(7, 357, super.field715, 496);
                this.field292.method579(7, 338, super.field715, 0);
                this.field489 = true;
                this.field511 = true;
                this.field469 = true;
                this.field392 = true;
                if (this.field550 != 2) {
                    this.field191.method579(7, 4, super.field715, 4);
                    this.field190.method579(7, 4, super.field715, 550);
                }
                ++field600;
                if (field600 > 131) {
                    field600 = 0;
                    this.field406.method285(84, 132);
                    this.field406.method290(0);
                }
            }
            if (this.field550 == 2) {
                this.method83(this.field482);
            }
            if (this.field301 && this.field522 == 1) {
                this.field489 = true;
            }
            if (this.field521 != -1) {
                boolean var4 = this.method70(this.field521, -187, this.field276);
                if (var4) {
                    this.field489 = true;
                }
            }
            if (this.field520 == 2) {
                this.field489 = true;
            }
            if (this.field221 == 2) {
                this.field489 = true;
            }
            if (this.field489) {
                this.method168((byte) 37);
                this.field489 = false;
            }
            if (this.field585 == -1 && this.field348 == 0) {
                this.field295.field916 = this.field260 - this.field327 - 77;
                if (super.field723 > 448 && super.field723 < 560 && super.field724 > 332) {
                    this.method145(this.field260, 0, 463, super.field723 - 17, -1, this.field295, super.field724 - 357, 77, 0);
                }
                int var5 = this.field260 - 77 - this.field295.field916;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field260 - 77) {
                    var5 = this.field260 - 77;
                }
                if (this.field327 != var5) {
                    this.field327 = var5;
                    this.field511 = true;
                }
            }
            if (this.field585 == -1 && this.field348 == 3) {
                int var6 = this.field413 * 14 + 7;
                this.field295.field916 = this.field416;
                if (super.field723 > 448 && super.field723 < 560 && super.field724 > 332) {
                    this.method145(var6, 0, 463, super.field723 - 17, -1, this.field295, super.field724 - 357, 77, 0);
                }
                int var7 = this.field295.field916;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field416 != var7) {
                    this.field416 = var7;
                    this.field511 = true;
                }
            }
            if (this.field585 != -1) {
                boolean var8 = this.method70(this.field585, -187, this.field276);
                if (var8) {
                    this.field511 = true;
                }
            }
            if (this.field520 == 3) {
                this.field511 = true;
            }
            if (this.field221 == 3) {
                this.field511 = true;
            }
            if (this.field224 != null) {
                this.field511 = true;
            }
            if (this.field301 && this.field522 == 2) {
                this.field511 = true;
            }
            if (this.field511) {
                this.method170((byte) 42);
                this.field511 = false;
            }
            if (this.field550 == 2) {
                this.method76((byte) 55);
                this.field190.method579(7, 4, super.field715, 550);
            }
            if (this.field156 != -1) {
                this.field469 = true;
            }
            if (this.field469) {
                if (this.field156 != -1 && this.field233 == this.field156) {
                    this.field156 = -1;
                    this.field406.method285(225, 132);
                    this.field406.method286(this.field233);
                }
                this.field469 = false;
                this.field366.method578(0);
                this.field397.method347(0, 0, (byte) 2);
                if (this.field521 == -1) {
                    if (this.field587[this.field233] != -1) {
                        if (this.field233 == 0) {
                            this.field172.method347(22, 10, (byte) 2);
                        }
                        if (this.field233 == 1) {
                            this.field173.method347(54, 8, (byte) 2);
                        }
                        if (this.field233 == 2) {
                            this.field173.method347(82, 8, (byte) 2);
                        }
                        if (this.field233 == 3) {
                            this.field174.method347(110, 8, (byte) 2);
                        }
                        if (this.field233 == 4) {
                            this.field176.method347(153, 8, (byte) 2);
                        }
                        if (this.field233 == 5) {
                            this.field176.method347(181, 8, (byte) 2);
                        }
                        if (this.field233 == 6) {
                            this.field175.method347(209, 9, (byte) 2);
                        }
                    }
                    if (this.field587[0] != -1 && (this.field156 != 0 || field502 % 20 < 10)) {
                        this.field478[0].method347(29, 13, (byte) 2);
                    }
                    if (this.field587[1] != -1 && (this.field156 != 1 || field502 % 20 < 10)) {
                        this.field478[1].method347(53, 11, (byte) 2);
                    }
                    if (this.field587[2] != -1 && (this.field156 != 2 || field502 % 20 < 10)) {
                        this.field478[2].method347(82, 11, (byte) 2);
                    }
                    if (this.field587[3] != -1 && (this.field156 != 3 || field502 % 20 < 10)) {
                        this.field478[3].method347(115, 12, (byte) 2);
                    }
                    if (this.field587[4] != -1 && (this.field156 != 4 || field502 % 20 < 10)) {
                        this.field478[4].method347(153, 13, (byte) 2);
                    }
                    if (this.field587[5] != -1 && (this.field156 != 5 || field502 % 20 < 10)) {
                        this.field478[5].method347(180, 11, (byte) 2);
                    }
                    if (this.field587[6] != -1 && (this.field156 != 6 || field502 % 20 < 10)) {
                        this.field478[6].method347(208, 13, (byte) 2);
                    }
                }
                this.field366.method579(7, 160, super.field715, 516);
                this.field365.method578(0);
                this.field396.method347(0, 0, (byte) 2);
                if (this.field521 == -1) {
                    if (this.field587[this.field233] != -1) {
                        if (this.field233 == 7) {
                            this.field407.method347(42, 0, (byte) 2);
                        }
                        if (this.field233 == 8) {
                            this.field408.method347(74, 0, (byte) 2);
                        }
                        if (this.field233 == 9) {
                            this.field408.method347(102, 0, (byte) 2);
                        }
                        if (this.field233 == 10) {
                            this.field409.method347(130, 1, (byte) 2);
                        }
                        if (this.field233 == 11) {
                            this.field411.method347(173, 0, (byte) 2);
                        }
                        if (this.field233 == 12) {
                            this.field411.method347(201, 0, (byte) 2);
                        }
                        if (this.field233 == 13) {
                            this.field410.method347(229, 0, (byte) 2);
                        }
                    }
                    if (this.field587[8] != -1 && (this.field156 != 8 || field502 % 20 < 10)) {
                        this.field478[7].method347(74, 2, (byte) 2);
                    }
                    if (this.field587[9] != -1 && (this.field156 != 9 || field502 % 20 < 10)) {
                        this.field478[8].method347(102, 3, (byte) 2);
                    }
                    if (this.field587[10] != -1 && (this.field156 != 10 || field502 % 20 < 10)) {
                        this.field478[9].method347(137, 4, (byte) 2);
                    }
                    if (this.field587[11] != -1 && (this.field156 != 11 || field502 % 20 < 10)) {
                        this.field478[10].method347(174, 2, (byte) 2);
                    }
                    if (this.field587[12] != -1 && (this.field156 != 12 || field502 % 20 < 10)) {
                        this.field478[11].method347(201, 2, (byte) 2);
                    }
                    if (this.field587[13] != -1 && (this.field156 != 13 || field502 % 20 < 10)) {
                        this.field478[12].method347(226, 2, (byte) 2);
                    }
                }
                this.field365.method579(7, 466, super.field715, 496);
                this.field191.method578(0);
                class41.field1309 = this.field633;
            }
            if (this.field392) {
                this.field392 = false;
                this.field364.method578(0);
                this.field395.method347(0, 0, (byte) 2);
                this.field338.method455("Public chat", 28, 0, true, 55, 16777215);
                if (this.field485 == 0) {
                    this.field338.method455("On", 41, 0, true, 55, 65280);
                }
                if (this.field485 == 1) {
                    this.field338.method455("Friends", 41, 0, true, 55, 16776960);
                }
                if (this.field485 == 2) {
                    this.field338.method455("Off", 41, 0, true, 55, 16711680);
                }
                if (this.field485 == 3) {
                    this.field338.method455("Hide", 41, 0, true, 55, 65535);
                }
                this.field338.method455("Private chat", 28, 0, true, 184, 16777215);
                if (this.field274 == 0) {
                    this.field338.method455("On", 41, 0, true, 184, 65280);
                }
                if (this.field274 == 1) {
                    this.field338.method455("Friends", 41, 0, true, 184, 16776960);
                }
                if (this.field274 == 2) {
                    this.field338.method455("Off", 41, 0, true, 184, 16711680);
                }
                this.field338.method455("Trade/compete", 28, 0, true, 324, 16777215);
                if (this.field636 == 0) {
                    this.field338.method455("On", 41, 0, true, 324, 65280);
                }
                if (this.field636 == 1) {
                    this.field338.method455("Friends", 41, 0, true, 324, 16776960);
                }
                if (this.field636 == 2) {
                    this.field338.method455("Off", 41, 0, true, 324, 16711680);
                }
                this.field338.method455("Report abuse", 33, 0, true, 458, 16777215);
                this.field364.method579(7, 453, super.field715, 0);
                this.field191.method578(0);
                class41.field1309 = this.field633;
            }
            this.field276 = 0;
            if (arg0 >= 0) {
                this.field406.method286(40);
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method191(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field479 = "";
                this.field480 = "Connecting to server...";
                this.method104(true, -474);
            }
            this.field599 = new class24((byte) 3, this.method175(field351 + 43594), this);
            long var4 = class63.method581(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field406.field1092 = 0;
            this.field406.method286(14);
            this.field406.method286(var6);
            this.field599.method265(2, 0, this.field406.field1091, -184);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field599.method262();
            }
            int var8 = this.field599.method262();
            int var9 = var8;
            if (var8 == 0) {
                this.field599.method264(this.field177.field1091, 0, 8);
                this.field177.field1092 = 0;
                this.field509 = this.field177.method302((byte) 2);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field509 >> 32), (int) this.field509 };
                this.field406.field1092 = 0;
                this.field406.method286(10);
                this.field406.method290(var10[0]);
                this.field406.method290(var10[1]);
                this.field406.method290(var10[2]);
                this.field406.method290(var10[3]);
                this.field406.method290(signlink.uid);
                this.field406.method293(arg0);
                this.field406.method293(arg1);
                this.field406.method311(3, field393, field178);
                this.field442.field1092 = 0;
                if (arg2) {
                    this.field442.method286(18);
                } else {
                    this.field442.method286(16);
                }
                this.field442.method286(this.field406.field1092 + 36 + 1 + 1 + 2);
                this.field442.method286(255);
                this.field442.method287(350);
                this.field442.method286(field353 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field442.method290(this.field584[var11]);
                }
                this.field442.method294(399, 0, this.field406.field1091, this.field406.field1092);
                this.field406.field1096 = new class49(var10, false);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field541 = new class49(var10, false);
                this.field599.method265(this.field442.field1092, 0, this.field442.field1091, -184);
                var8 = this.field599.method262();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method191(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field561 = this.field599.method262();
                field449 = this.field599.method262() == 1;
                this.field503 = 0L;
                this.field303 = 0;
                this.field451.field1693 = 0;
                super.field720 = true;
                this.field263 = true;
                this.field320 = true;
                this.field406.field1092 = 0;
                this.field177.field1092 = 0;
                this.field161 = -1;
                this.field385 = -1;
                this.field386 = -1;
                this.field387 = -1;
                this.field160 = 0;
                this.field162 = 0;
                this.field384 = 0;
                this.field164 = 0;
                this.field203 = 0;
                this.field586 = 0;
                this.field301 = false;
                super.field721 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field424[var13] = null;
                }
                this.field399 = 0;
                this.field427 = 0;
                this.field550 = 0;
                this.field562 = 0;
                this.field404 = (int) (Math.random() * 100.0D) - 50;
                this.field566 = (int) (Math.random() * 110.0D) - 55;
                this.field420 = (int) (Math.random() * 80.0D) - 40;
                this.field325 = (int) (Math.random() * 120.0D) - 60;
                this.field209 = (int) (Math.random() * 30.0D) - 20;
                this.field213 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field602 = 0;
                this.field218 = -1;
                this.field493 = 0;
                this.field494 = 0;
                this.field435 = 0;
                this.field266 = 0;
                for (int var14 = 0; var14 < this.field432; ++var14) {
                    this.field434[var14] = null;
                    this.field439[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field265[var15] = null;
                }
                field499 = this.field434[this.field433] = new class4();
                this.field185.method604();
                this.field379.method604();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field622[var16][var17][var18] = null;
                        }
                    }
                }
                this.field335 = new class72(708);
                this.field611 = 0;
                this.field610 = 0;
                this.method158(this.field615, 35928);
                this.field615 = -1;
                this.method158(this.field585, 35928);
                this.field585 = -1;
                this.method158(this.field207, 35928);
                this.field207 = -1;
                this.method158(this.field369, 35928);
                this.field369 = -1;
                this.method158(this.field217, 35928);
                this.field217 = -1;
                this.method158(this.field521, 35928);
                this.field521 = -1;
                this.method158(this.field498, 35928);
                this.field498 = -1;
                this.field440 = false;
                this.field233 = 3;
                this.field348 = 0;
                this.field301 = false;
                this.field417 = false;
                this.field224 = null;
                this.field208 = 0;
                this.field156 = -1;
                this.field277 = true;
                this.method66(-245);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field271[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field388[var20] = null;
                    this.field389[var20] = false;
                }
                field305 = 0;
                field349 = 0;
                field477 = 0;
                field315 = 0;
                field367 = 0;
                field601 = 0;
                field322 = 0;
                field474 = 0;
                field170 = 0;
                field444 = 0;
                this.method202((byte) 3);
            } else if (var8 == 3) {
                this.field479 = "";
                this.field480 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field479 = "Your account has been disabled.";
                this.field480 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field479 = "Your account is already logged in.";
                this.field480 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field479 = "RuneScape has been updated!";
                this.field480 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field479 = "This world is full.";
                this.field480 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field479 = "Unable to connect.";
                this.field480 = "Login server offline.";
            } else if (var8 == 9) {
                this.field479 = "Login limit exceeded.";
                this.field480 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field479 = "Unable to connect.";
                this.field480 = "Bad session id.";
            } else if (var8 == 11) {
                this.field479 = "Login server rejected session.";
                this.field480 = "Please try again.";
            } else if (var8 == 12) {
                this.field479 = "You need a members account to login to this world.";
                this.field480 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field479 = "Could not complete login.";
                this.field480 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field479 = "The server is being updated.";
                this.field480 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field320 = true;
                this.field406.field1092 = 0;
                this.field177.field1092 = 0;
                this.field161 = -1;
                this.field385 = -1;
                this.field386 = -1;
                this.field387 = -1;
                this.field160 = 0;
                this.field162 = 0;
                this.field384 = 0;
                this.field586 = 0;
                this.field301 = false;
                this.field201 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field479 = "Login attempts exceeded.";
                this.field480 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field479 = "You are standing in a members-only area.";
                this.field480 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field479 = "Invalid loginserver requested";
                this.field480 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field479 = "Malformed login packet.";
                    this.field480 = "Please try again.";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field328 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field328;
                            this.method191(arg0, arg1, arg2);
                        } else {
                            this.field479 = "No response from loginserver";
                            this.field480 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field479 = "No response from server";
                        this.field480 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field479 = "Unexpected server response";
                    this.field480 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field599.method262();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field479 = "You have only just left another world";
                    this.field480 = "Your profile will be transferred in: " + var26;
                    this.method104(true, -474);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method191(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field479 = "";
            this.field480 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(Ljava/lang/String;I)V")
    public final void method192(String arg0, int arg1) {
        if (arg0 != null && arg0.length() != 0) {
            String var3 = arg0;
            String[] var4 = new String[100];
            int var5 = 0;
            if (arg1 >= 0) {
                for (int var6 = 1; var6 > 0; ++var6) {
                }
            }
            while (true) {
                int var7 = var3.indexOf(" ");
                if (var7 == -1) {
                    String var9 = var3.trim();
                    if (var9.length() > 0) {
                        var4[var5++] = var9.toLowerCase();
                    }
                    this.field413 = 0;
                    label51: for (int var10 = 0; var10 < class40.field1260; ++var10) {
                        class40 var11 = class40.method418(var10);
                        if (var11.field1278 == -1 && var11.field1292 != null) {
                            String var12 = var11.field1292.toLowerCase();
                            for (int var13 = 0; var13 < var5; ++var13) {
                                if (var12.indexOf(var4[var13]) == -1) {
                                    continue label51;
                                }
                            }
                            this.field414[this.field413] = var12;
                            this.field415[this.field413] = var10;
                            ++this.field413;
                            if (this.field413 >= this.field414.length) {
                                return;
                            }
                        }
                    }
                    return;
                }
                String var8 = var3.substring(0, var7).trim();
                if (var8.length() > 0) {
                    var4[var5++] = var8.toLowerCase();
                }
                var3 = var3.substring(var7 + 1);
            }
        } else {
            this.field413 = 0;
        }
    }

    @OriginalMember(owner = "client", name = "m", descriptor = "(Z)V")
    public final void method193(boolean arg0) {
        if (!arg0) {
            this.method208();
        }
        this.field490 = new class33(this.field182, "titlebox", 0);
        this.field491 = new class33(this.field182, "titlebutton", 0);
        this.field269 = new class33[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field269[var2] = new class33(this.field182, "runes", var2);
        }
        this.field372 = new class51(128, 265);
        this.field373 = new class51(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field372.field1436[var3] = this.field591.field1651[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field373.field1436[var4] = this.field592.field1651[var4];
        }
        this.field236 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field236[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field236[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field236[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field236[var8 + 192] = 16777215;
        }
        this.field237 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field237[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field237[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field237[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field237[var12 + 192] = 16777215;
        }
        this.field238 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field238[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field238[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field238[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field238[var16 + 192] = 16777215;
        }
        this.field235 = new int[256];
        this.field330 = new int[32768];
        this.field331 = new int[32768];
        this.method77((class33) null, 5);
        this.field539 = new int[32768];
        this.field540 = new int[32768];
        this.method142(10, "Connecting to fileserver", true);
        if (!this.field279) {
            this.field450 = true;
            this.field279 = true;
            this.method131(this, 2);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(IILMLYYHULT;)V")
    private final void method194(int arg0, int arg1, class30 arg2) {
        arg2.method306(0);
        int var4 = arg2.method307(8, 84);
        if (var4 < this.field266) {
            for (int var5 = var4; var5 < this.field266; ++var5) {
                this.field343[this.field342++] = this.field267[var5];
            }
        }
        if (var4 > this.field266) {
            signlink.reporterror(this.field529 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field266 = 0;
            if (arg1 != 0) {
                field508 = !field508;
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field267[var6];
                class23 var8 = this.field265[var7];
                int var9 = arg2.method307(1, 84);
                if (var9 == 0) {
                    this.field267[this.field266++] = var7;
                    var8.field1166 = field502;
                } else {
                    int var10 = arg2.method307(2, 84);
                    if (var10 == 0) {
                        this.field267[this.field266++] = var7;
                        var8.field1166 = field502;
                        this.field438[this.field437++] = var7;
                    } else if (var10 == 1) {
                        this.field267[this.field266++] = var7;
                        var8.field1166 = field502;
                        int var11 = arg2.method307(3, 84);
                        var8.method351(var11, false, 5);
                        int var12 = arg2.method307(1, 84);
                        if (var12 == 1) {
                            this.field438[this.field437++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field267[this.field266++] = var7;
                        var8.field1166 = field502;
                        int var13 = arg2.method307(3, 84);
                        var8.method351(var13, true, 5);
                        int var14 = arg2.method307(3, 84);
                        var8.method351(var14, true, 5);
                        int var15 = arg2.method307(1, 84);
                        if (var15 == 1) {
                            this.field438[this.field437++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field343[this.field342++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "n", descriptor = "(Z)Z")
    public final boolean method195(boolean arg0) {
        this.field320 &= arg0;
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client", name = "H", descriptor = "(I)V")
    public final void method196(int arg0) {
        int var2 = 5;
        this.field584[8] = 0;
        int var3 = 0;
        if (arg0 < 7 || arg0 > 7) {
            this.field161 = this.field177.method296();
        }
        while (this.field584[8] == 0) {
            String var4 = "Unknown problem";
            this.method142(20, "Connecting to web server", true);
            try {
                DataInputStream var5 = this.method206("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 350);
                class30 var6 = new class30(true, new byte[40]);
                var5.readFully(var6.field1091, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field584[var7] = var6.method301();
                }
                int var8 = var6.method301();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field584[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field584[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field584[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field584[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field584[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field584[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method142(10, "Game updated - please reload page", true);
                        var11 = 10;
                    } else {
                        this.method142(10, var4 + " - Will retry in " + var11 + " secs.", true);
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
                this.field204 = !this.field204;
            }
        }
    }

    @OriginalMember(owner = "client", name = "I", descriptor = "(I)V")
    public final void method197(int arg0) {
        this.field457 = 0;
        for (int var2 = -1; var2 < this.field435 + this.field266; ++var2) {
            class34 var19;
            if (var2 == -1) {
                var19 = field499;
            } else if (var2 < this.field435) {
                var19 = this.field434[this.field436[var2]];
            } else {
                var19 = this.field265[this.field267[var2 - this.field435]];
            }
            if (var19 != null && var19.method38(false)) {
                if (var19 instanceof class23) {
                    class60 var20 = ((class23) var19).field951;
                    if (var20.field1618 != null) {
                        var20 = var20.method570(0);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field435) {
                    class60 var23 = ((class23) var19).field951;
                    if (var23.field1610 >= 0 && var23.field1610 < this.field244.length) {
                        this.method74(var19, false, var19.field1187 + 15);
                        if (this.field377 > -1) {
                            this.field244[var23.field1610].method474(this.field377 - 12, this.field378 - 30, (byte) 2);
                        }
                    }
                    if (this.field203 == 1 && this.field267[var2 - this.field435] == this.field473 && field502 % 20 < 10) {
                        this.method74(var19, false, var19.field1187 + 15);
                        if (this.field377 > -1) {
                            this.field304[0].method474(this.field377 - 12, this.field378 - 28, (byte) 2);
                        }
                    }
                } else {
                    int var21 = 30;
                    class4 var22 = (class4) var19;
                    if (var22.field97 != -1 || var22.field95 != -1) {
                        this.method74(var19, false, var19.field1187 + 15);
                        if (this.field377 > -1) {
                            if (var22.field97 != -1) {
                                this.field380[var22.field97].method474(this.field377 - 12, this.field378 - var21, (byte) 2);
                                var21 += 25;
                            }
                            if (var22.field95 != -1) {
                                this.field244[var22.field95].method474(this.field377 - 12, this.field378 - var21, (byte) 2);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field203 == 10 && this.field436[var2] == this.field537) {
                        this.method74(var19, false, var19.field1187 + 15);
                        if (this.field377 > -1) {
                            this.field304[1].method474(this.field377 - 12, this.field378 - var21, (byte) 2);
                        }
                    }
                }
                if (var19.field1138 != null && (var2 >= this.field435 || this.field485 == 0 || this.field485 == 3 || this.field485 == 1 && this.method132((byte) 8, ((class4) var19).field113))) {
                    this.method74(var19, false, var19.field1187);
                    if (this.field377 > -1 && this.field457 < this.field458) {
                        this.field462[this.field457] = this.field339.method457(var19.field1138, 106) / 2;
                        this.field461[this.field457] = this.field339.field1427;
                        this.field459[this.field457] = this.field377;
                        this.field460[this.field457] = this.field378;
                        this.field463[this.field457] = var19.field1150;
                        this.field464[this.field457] = var19.field1142;
                        this.field465[this.field457] = var19.field1175;
                        this.field466[this.field457++] = var19.field1138;
                        if (this.field333 == 0 && var19.field1142 >= 1 && var19.field1142 <= 3) {
                            this.field461[this.field457] += 10;
                            this.field460[this.field457] += 5;
                        }
                        if (this.field333 == 0 && var19.field1142 == 4) {
                            this.field462[this.field457] = 60;
                        }
                        if (this.field333 == 0 && var19.field1142 == 5) {
                            this.field461[this.field457] += 5;
                        }
                    }
                }
                if (var19.field1145 > field502) {
                    this.method74(var19, false, var19.field1187 + 15);
                    if (this.field377 > -1) {
                        int var24 = var19.field1146 * 30 / var19.field1147;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class56.method546(65280, this.field377 - 15, true, this.field378 - 3, var24, 5);
                        class56.method546(16711680, this.field377 - 15 + var24, true, this.field378 - 3, 30 - var24, 5);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1178[var25] > field502) {
                        this.method74(var19, false, var19.field1187 / 2);
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
                            this.field157[var19.field1177[var25]].method474(this.field377 - 12, this.field378 - 12, (byte) 2);
                            this.field337.method454(1, 0, this.field378 + 4, this.field377, String.valueOf(var19.field1176[var25]));
                            this.field337.method454(1, 16777215, this.field378 + 3, this.field377 - 1, String.valueOf(var19.field1176[var25]));
                        }
                    }
                }
            }
        }
        if (arg0 < 4 || arg0 > 4) {
            this.field161 = -1;
        }
        for (int var3 = 0; var3 < this.field457; ++var3) {
            int var4 = this.field459[var3];
            int var5 = this.field460[var3];
            int var6 = this.field462[var3];
            int var7 = this.field461[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field460[var18] - this.field461[var18] && var5 - var7 < this.field460[var18] + 2 && var4 - var6 < this.field462[var18] + this.field459[var18] && var4 + var6 > this.field459[var18] - this.field462[var18] && this.field460[var18] - this.field461[var18] < var5) {
                        var5 = this.field460[var18] - this.field461[var18];
                        var8 = true;
                    }
                }
            }
            this.field377 = this.field459[var3];
            this.field378 = this.field460[var3] = var5;
            String var9 = this.field466[var3];
            if (this.field333 == 0) {
                int var10 = 16776960;
                if (this.field463[var3] < 6) {
                    var10 = this.field228[this.field463[var3]];
                }
                if (this.field463[var3] == 6) {
                    var10 = this.field551 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field463[var3] == 7) {
                    var10 = this.field551 % 20 < 10 ? 255 : 65535;
                }
                if (this.field463[var3] == 8) {
                    var10 = this.field551 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field463[var3] == 9) {
                    int var11 = 150 - this.field465[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field463[var3] == 10) {
                    int var12 = 150 - this.field465[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field463[var3] == 11) {
                    int var13 = 150 - this.field465[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field464[var3] == 0) {
                    this.field339.method454(1, 0, this.field378 + 1, this.field377, var9);
                    this.field339.method454(1, var10, this.field378, this.field377, var9);
                }
                if (this.field464[var3] == 1) {
                    this.field339.method459(this.field551, this.field378 + 1, 0, this.field377, var9, -111);
                    this.field339.method459(this.field551, this.field378, var10, this.field377, var9, -111);
                }
                if (this.field464[var3] == 2) {
                    this.field339.method460(this.field378 + 1, 0, this.field377, var9, -3443, this.field551);
                    this.field339.method460(this.field378, var10, this.field377, var9, -3443, this.field551);
                }
                if (this.field464[var3] == 3) {
                    this.field339.method461(0, -972, var9, 150 - this.field465[var3], this.field378 + 1, this.field551, this.field377);
                    this.field339.method461(var10, -972, var9, 150 - this.field465[var3], this.field378, this.field551, this.field377);
                }
                if (this.field464[var3] == 4) {
                    int var14 = this.field339.method457(var9, 106);
                    int var15 = (150 - this.field465[var3]) * (var14 + 100) / 150;
                    class56.method543(this.field377 - 50, 0, this.field377 + 50, 134, 334);
                    this.field339.method458((byte) -61, 0, this.field377 + 50 - var15, this.field378 + 1, var9);
                    this.field339.method458((byte) -61, var10, this.field377 + 50 - var15, this.field378, var9);
                    class56.method542(260);
                }
                if (this.field464[var3] == 5) {
                    int var16 = 150 - this.field465[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class56.method543(0, this.field378 - this.field339.field1427 - 1, 512, 134, this.field378 + 5);
                    this.field339.method454(1, 0, this.field378 + 1 + var17, this.field377, var9);
                    this.field339.method454(1, var10, this.field378 + var17, this.field377, var9);
                    class56.method542(260);
                }
            } else {
                this.field339.method454(1, 0, this.field378 + 1, this.field377, var9);
                this.field339.method454(1, 16776960, this.field378, this.field377, var9);
            }
        }
    }

    @OriginalMember(owner = "client", name = "p", descriptor = "(B)V")
    public final void method198(byte arg0) {
        byte[] var2 = this.field182.method249("title.dat", (byte[]) null);
        class51 var3 = new class51(var2, this);
        this.field591.method578(0);
        var3.method472(0, 0, true);
        this.field592.method578(0);
        var3.method472(-637, 0, true);
        this.field588.method578(0);
        var3.method472(-128, 0, true);
        this.field589.method578(0);
        var3.method472(-202, -371, true);
        this.field590.method578(0);
        var3.method472(-202, -171, true);
        this.field593.method578(0);
        var3.method472(0, -265, true);
        this.field594.method578(0);
        var3.method472(-562, -265, true);
        this.field595.method578(0);
        var3.method472(-128, -171, true);
        this.field596.method578(0);
        var3.method472(-562, -171, true);
        int[] var4 = new int[var3.field1437];
        for (int var5 = 0; var5 < var3.field1438; ++var5) {
            for (int var10 = 0; var10 < var3.field1437; ++var10) {
                var4[var10] = var3.field1436[var3.field1437 * var5 + (var3.field1437 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1437; ++var11) {
                var3.field1436[var3.field1437 * var5 + var11] = var4[var11];
            }
        }
        this.field591.method578(0);
        var3.method472(382, 0, true);
        this.field592.method578(0);
        var3.method472(-255, 0, true);
        this.field588.method578(0);
        var3.method472(254, 0, true);
        this.field589.method578(0);
        var3.method472(180, -371, true);
        this.field590.method578(0);
        var3.method472(180, -171, true);
        this.field593.method578(0);
        var3.method472(382, -265, true);
        this.field594.method578(0);
        var3.method472(-180, -265, true);
        if (arg0 != 1) {
            this.field406.method286(254);
        }
        this.field595.method578(0);
        var3.method472(254, -171, true);
        this.field596.method578(0);
        var3.method472(-180, -171, true);
        class51 var6 = new class51(this.field182, "logo", 0);
        this.field588.method578(0);
        var6.method474(382 - var6.field1437 / 2 - 128, 18, (byte) 2);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class38.field1221) {
        }
    }

    @OriginalMember(owner = "client", name = "h", descriptor = "(II)V")
    public final void method199(int arg0, int arg1) {
        class72 var3 = this.field622[this.field605][arg0][arg1];
        if (var3 == null) {
            this.field390.method508(this.field605, arg0, arg1);
        } else {
            int var4 = -99999999;
            class68 var5 = null;
            for (class68 var6 = (class68) var3.method600(); var6 != null; var6 = (class68) var3.method602((byte) 3)) {
                class40 var11 = class40.method418(var6.field1721);
                int var12 = var11.field1249;
                if (var11.field1275) {
                    var12 = (var6.field1720 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method598(0, var5);
            class68 var7 = null;
            class68 var8 = null;
            for (class68 var9 = (class68) var3.method600(); var9 != null; var9 = (class68) var3.method602((byte) 3)) {
                if (var5.field1721 != var9.field1721 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field1721 != var9.field1721 && var7.field1721 != var9.field1721 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field390.method494(1, var7, var8, this.method80(this.field605, arg0 * 128 + 64, arg1 * 128 + 64, 9), this.field605, arg1, arg0, var5, var10);
        }
    }

    @OriginalMember(owner = "client", name = "d", descriptor = "(BI)Ljava/lang/String;")
    public final String method200(byte arg0, int arg1) {
        if (arg0 != -42) {
            throw new NullPointerException();
        } else {
            return arg1 < 999999999 ? String.valueOf(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client", name = "J", descriptor = "(I)V")
    public final void method201(int arg0) {
        if (this.field384 > 1) {
            --this.field384;
        }
        if (this.field164 > 0) {
            --this.field164;
        }
        for (int var2 = 0; var2 < 5 && this.method123(true); ++var2) {
        }
        if (this.field320) {
            Object var3 = this.field451.field1691;
            synchronized (this.field451.field1691) {
                if (!field449) {
                    this.field451.field1693 = 0;
                } else if (super.field729 != 0 || this.field451.field1693 >= 40) {
                    this.field406.method285(224, 132);
                    this.field406.method286(0);
                    int var4 = this.field406.field1092;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field451.field1693 && var4 - this.field406.field1092 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field451.field1690[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field451.field1692[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field451.field1690[var6] == -1 && this.field451.field1692[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field226 == var8 && this.field227 == var7) {
                            if (this.field303 < 2047) {
                                ++this.field303;
                            }
                        } else {
                            int var10 = var8 - this.field226;
                            this.field226 = var8;
                            int var11 = var7 - this.field227;
                            this.field227 = var7;
                            if (this.field303 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field406.method287((this.field303 << 12) + (var10 << 6) + var11);
                                this.field303 = 0;
                            } else if (this.field303 < 8) {
                                this.field406.method289((this.field303 << 19) + 8388608 + var9);
                                this.field303 = 0;
                            } else {
                                this.field406.method290((this.field303 << 19) + -1073741824 + var9);
                                this.field303 = 0;
                            }
                        }
                    }
                    this.field406.method295(this.field406.field1092 - var4, 0);
                    if (var5 >= this.field451.field1693) {
                        this.field451.field1693 = 0;
                    } else {
                        this.field451.field1693 -= var5;
                        for (int var12 = 0; var12 < this.field451.field1693; ++var12) {
                            this.field451.field1692[var12] = this.field451.field1692[var5 + var12];
                            this.field451.field1690[var12] = this.field451.field1690[var5 + var12];
                        }
                    }
                }
            }
            if (super.field729 != 0) {
                long var13 = (super.field732 - this.field503) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field503 = super.field732;
                int var15 = super.field731;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field730;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field729 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field406.method285(150, 132);
                this.field406.method290((var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field533 > 0) {
                --this.field533;
            }
            if (super.field733[1] == 1 || super.field733[2] == 1 || super.field733[3] == 1 || super.field733[4] == 1) {
                this.field534 = true;
            }
            if (this.field534 && this.field533 <= 0) {
                this.field533 = 20;
                this.field534 = false;
                this.field406.method285(130, 132);
                this.field406.method323((byte) 2, this.field212);
                this.field406.method287(this.field213);
            }
            if (super.field720 && !this.field263) {
                this.field263 = true;
                this.field406.method285(139, 132);
                this.field406.method286(1);
            }
            if (!super.field720 && this.field263) {
                this.field263 = false;
                this.field406.method285(139, 132);
                this.field406.method286(0);
            }
            this.method152(-412);
            this.method97((byte) 8);
            this.method120(true);
            ++this.field162;
            if (this.field162 > 750) {
                this.method78((byte) 33);
            }
            this.method85(318);
            this.method183(7);
            this.method166((byte) 0);
            ++this.field276;
            if (this.field560 != 0) {
                this.field559 += 20;
                if (this.field559 >= 400) {
                    this.field560 = 0;
                }
            }
            if (this.field520 != 0) {
                ++this.field517;
                if (this.field517 >= 15) {
                    if (this.field520 == 2) {
                        this.field489 = true;
                    }
                    if (this.field520 == 3) {
                        this.field511 = true;
                    }
                    this.field520 = 0;
                }
            }
            if (this.field221 != 0) {
                ++this.field609;
                if (super.field723 > this.field222 + 5 || super.field723 < this.field222 - 5 || super.field724 > this.field223 + 5 || super.field724 < this.field223 - 5) {
                    this.field370 = true;
                }
                if (super.field722 == 0) {
                    if (this.field221 == 2) {
                        this.field489 = true;
                    }
                    if (this.field221 == 3) {
                        this.field511 = true;
                    }
                    this.field221 = 0;
                    if (this.field370 && this.field609 >= 5) {
                        this.field206 = -1;
                        this.method203(7);
                        if (this.field219 == this.field206 && this.field220 != this.field205) {
                            class20 var20 = class20.method256(this.field219);
                            byte var21 = 0;
                            if (this.field357 == 1 && var20.field930 == 206) {
                                var21 = 1;
                            }
                            if (var20.field881[this.field205] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field875) {
                                int var22 = this.field220;
                                int var23 = this.field205;
                                var20.field881[var23] = var20.field881[var22];
                                var20.field919[var23] = var20.field919[var22];
                                var20.field881[var22] = -1;
                                var20.field919[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field220;
                                int var25 = this.field205;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method253(var24 - 1, 43, var24);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method253(var24 + 1, 43, var24);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method253(this.field205, 43, this.field220);
                            }
                            this.field406.method285(109, 132);
                            this.field406.method286(var21);
                            this.field406.method322(this.field219, 0);
                            this.field406.method322(this.field205, 0);
                            this.field406.method321(this.field220, (byte) 1);
                        }
                    } else if ((this.field582 == 1 || this.method135((byte) -86, this.field586 - 1)) && this.field586 > 2) {
                        this.method172(false);
                    } else if (this.field586 > 0) {
                        this.method124(-415, this.field586 - 1);
                    }
                    this.field517 = 10;
                    super.field729 = 0;
                }
            }
            if (class53.field1502 != -1) {
                int var26 = class53.field1502;
                int var27 = class53.field1503;
                boolean var28 = this.method64(0, true, 0, 0, 0, var26, 0, 0, var27, field499.field1140[0], field499.field1141[0], 0);
                class53.field1502 = -1;
                if (var28) {
                    this.field557 = super.field730;
                    this.field558 = super.field731;
                    this.field560 = 1;
                    this.field559 = 0;
                }
            }
            if (super.field729 == 1 && this.field224 != null) {
                this.field224 = null;
                this.field511 = true;
                super.field729 = 0;
            }
            this.method173(-303);
            if (this.field369 == -1) {
                this.method87(false);
                this.method160((byte) 6);
                this.method99((byte) 6);
            }
            if (super.field722 == 1 || super.field729 == 1) {
                ++this.field513;
            }
            if (this.field275 == 0 && this.field198 == 0 && this.field273 == 0) {
                if (this.field604 > 0) {
                    --this.field604;
                }
            } else if (this.field604 < 100) {
                ++this.field604;
                if (this.field604 == 100) {
                    if (this.field275 != 0) {
                        this.field511 = true;
                    }
                    if (this.field198 != 0) {
                        this.field489 = true;
                    }
                }
            }
            if (this.field550 == 2) {
                this.method103(-800);
            }
            if (this.field550 == 2 && this.field159) {
                this.method178(this.field579);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field171[var29]++;
            }
            this.method150(4);
            ++field447;
            if (field447 > 153) {
                field447 = 0;
                this.field406.method285(1, 132);
                this.field406.method287(26173);
            }
            ++super.field721;
            if (super.field721 > 4500) {
                this.field164 = 250;
                super.field721 -= 500;
                this.field406.method285(63, 132);
            }
            ++this.field583;
            if (this.field583 > 500) {
                this.field583 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field404 += this.field405;
                }
                if ((var30 & 2) == 2) {
                    this.field566 += this.field567;
                }
                if ((var30 & 4) == 4) {
                    this.field420 += this.field421;
                }
            }
            if (this.field404 < -50) {
                this.field405 = 2;
            }
            if (this.field404 > 50) {
                this.field405 = -2;
            }
            if (this.field566 < -55) {
                this.field567 = 2;
            }
            if (this.field566 > 55) {
                this.field567 = -2;
            }
            if (this.field420 < -40) {
                this.field421 = 1;
            }
            if (this.field420 > 40) {
                this.field421 = -1;
            }
            ++this.field445;
            if (arg0 != 1) {
                this.field161 = -1;
            }
            if (this.field445 > 500) {
                this.field445 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field325 += this.field326;
                }
                if ((var31 & 2) == 2) {
                    this.field209 += this.field210;
                }
            }
            if (this.field325 < -60) {
                this.field326 = 2;
            }
            if (this.field325 > 60) {
                this.field326 = -2;
            }
            if (this.field209 < -20) {
                this.field210 = 1;
            }
            if (this.field209 > 10) {
                this.field210 = -1;
            }
            ++this.field163;
            if (this.field163 > 50) {
                this.field406.method285(58, 132);
            }
            try {
                if (this.field599 != null && this.field406.field1092 > 0) {
                    this.field599.method265(this.field406.field1092, 0, this.field406.field1091, -184);
                    this.field406.field1092 = 0;
                    this.field163 = 0;
                }
            } catch (IOException var33) {
                this.method78((byte) 33);
            } catch (Exception var34) {
                this.method176(2);
            }
        }
    }

    @OriginalMember(owner = "client", name = "q", descriptor = "(B)V")
    public final void method202(byte arg0) {
        if (arg0 == 3) {
            boolean var2 = false;
            if (this.field192 == null) {
                this.method84((byte) 9);
                super.field716 = null;
                this.field588 = null;
                this.field589 = null;
                this.field590 = null;
                this.field591 = null;
                this.field592 = null;
                this.field593 = null;
                this.field594 = null;
                this.field595 = null;
                this.field596 = null;
                this.field192 = new class62(479, 96, 462, this.method122(false));
                this.field190 = new class62(172, 156, 462, this.method122(false));
                class56.method544((byte) -2);
                this.field282.method347(0, 0, (byte) 2);
                this.field189 = new class62(190, 261, 462, this.method122(false));
                this.field191 = new class62(512, 334, 462, this.method122(false));
                class56.method544((byte) -2);
                this.field364 = new class62(496, 50, 462, this.method122(false));
                this.field365 = new class62(269, 37, 462, this.method122(false));
                this.field366 = new class62(249, 45, 462, this.method122(false));
                this.field446 = true;
                this.field191.method578(0);
                class41.field1309 = this.field633;
            }
        }
    }

    @OriginalMember(owner = "client", name = "K", descriptor = "(I)V")
    public final void method203(int arg0) {
        if (arg0 != 7) {
            this.field622 = null;
        }
        if (this.field221 == 0) {
            this.field606[0] = "Cancel";
            this.field231[0] = 1921;
            this.field586 = 1;
            if (this.field369 != -1) {
                this.field361 = 0;
                this.field512 = 0;
                this.method141(class20.method256(this.field369), super.field724, 0, 0, super.field723, true, 0, 0);
                if (this.field361 != this.field179) {
                    this.field179 = this.field361;
                }
                if (this.field512 != this.field273) {
                    this.field273 = this.field512;
                }
            } else {
                this.method169(336);
                this.field361 = 0;
                this.field512 = 0;
                if (super.field723 > 4 && super.field724 > 4 && super.field723 < 516 && super.field724 < 338) {
                    if (this.field207 != -1) {
                        this.method141(class20.method256(this.field207), super.field724, 0, 4, super.field723, true, 0, 4);
                    } else {
                        this.method205(true);
                    }
                }
                if (this.field361 != this.field179) {
                    this.field179 = this.field361;
                }
                if (this.field512 != this.field273) {
                    this.field273 = this.field512;
                }
                this.field361 = 0;
                this.field512 = 0;
                if (super.field723 > 553 && super.field724 > 205 && super.field723 < 743 && super.field724 < 466) {
                    if (this.field521 != -1) {
                        this.method141(class20.method256(this.field521), super.field724, 1, 553, super.field723, true, 0, 205);
                    } else if (this.field587[this.field233] != -1) {
                        this.method141(class20.method256(this.field587[this.field233]), super.field724, 1, 553, super.field723, true, 0, 205);
                    }
                }
                if (this.field361 != this.field168) {
                    this.field489 = true;
                    this.field168 = this.field361;
                }
                if (this.field512 != this.field198) {
                    this.field489 = true;
                    this.field198 = this.field512;
                }
                this.field361 = 0;
                this.field512 = 0;
                if (super.field723 > 17 && super.field724 > 357 && super.field723 < 496 && super.field724 < 453) {
                    if (this.field585 != -1) {
                        this.method141(class20.method256(this.field585), super.field724, 2, 17, super.field723, true, 0, 357);
                    } else if (this.field615 != -1) {
                        this.method141(class20.method256(this.field615), super.field724, 3, 17, super.field723, true, 0, 357);
                    } else if (super.field724 < 434 && super.field723 < 426 && this.field348 == 0) {
                        this.method174(8, super.field723 - 17, super.field724 - 357);
                    }
                }
                if ((this.field585 != -1 || this.field615 != -1) && this.field580 != this.field361) {
                    this.field511 = true;
                    this.field580 = this.field361;
                }
                if ((this.field585 != -1 || this.field615 != -1) && this.field512 != this.field275) {
                    this.field511 = true;
                    this.field275 = this.field512;
                }
                boolean var2 = false;
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field586 - 1; ++var3) {
                        if (this.field231[var3] < 1000 && this.field231[var3 + 1] > 1000) {
                            String var4 = this.field606[var3];
                            this.field606[var3] = this.field606[var3 + 1];
                            this.field606[var3 + 1] = var4;
                            int var5 = this.field231[var3];
                            this.field231[var3] = this.field231[var3 + 1];
                            this.field231[var3 + 1] = var5;
                            int var6 = this.field229[var3];
                            this.field229[var3] = this.field229[var3 + 1];
                            this.field229[var3 + 1] = var6;
                            int var7 = this.field230[var3];
                            this.field230[var3] = this.field230[var3 + 1];
                            this.field230[var3 + 1] = var7;
                            int var8 = this.field232[var3];
                            this.field232[var3] = this.field232[var3 + 1];
                            this.field232[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(I)V")
    public final void method204(int arg0) {
        signlink.reporterror = false;
        try {
            if (this.field599 != null) {
                this.field599.method261();
            }
        } catch (Exception var2) {
        }
        this.field599 = null;
        this.method209(1);
        if (this.field451 != null) {
            this.field451.field1688 = false;
        }
        this.field451 = null;
        this.field253.method231();
        this.field253 = null;
        this.field264 = null;
        this.field406 = null;
        this.field442 = null;
        this.field177 = null;
        this.field504 = null;
        this.field368 = null;
        this.field616 = null;
        this.field505 = null;
        this.field506 = null;
        this.field262 = null;
        this.field318 = null;
        this.field390 = null;
        this.field556 = null;
        this.field475 = null;
        this.field294 = null;
        this.field375 = null;
        this.field376 = null;
        this.field296 = null;
        this.field189 = null;
        this.field190 = null;
        this.field191 = null;
        this.field192 = null;
        this.field364 = null;
        this.field365 = null;
        this.field366 = null;
        this.field284 = null;
        this.field285 = null;
        this.field286 = null;
        this.field287 = null;
        this.field288 = null;
        this.field289 = null;
        this.field290 = null;
        this.field291 = null;
        this.field292 = null;
        this.field281 = null;
        this.field282 = null;
        this.field283 = null;
        this.field395 = null;
        this.field396 = null;
        this.field397 = null;
        this.field478 = null;
        this.field172 = null;
        this.field173 = null;
        this.field174 = null;
        this.field175 = null;
        this.field176 = null;
        this.field407 = null;
        this.field408 = null;
        this.field409 = null;
        this.field410 = null;
        this.field411 = null;
        this.field637 = null;
        this.field157 = null;
        if (arg0 == 24755) {
            this.field380 = null;
            this.field244 = null;
            this.field304 = null;
            this.field468 = null;
            this.field598 = null;
            this.field571 = null;
            this.field572 = null;
            this.field573 = null;
            this.field574 = null;
            this.field575 = null;
            this.field188 = null;
            this.field225 = null;
            this.field261 = null;
            this.field434 = null;
            this.field436 = null;
            this.field438 = null;
            this.field439 = null;
            this.field343 = null;
            this.field265 = null;
            this.field267 = null;
            this.field622 = null;
            this.field335 = null;
            this.field185 = null;
            this.field379 = null;
            this.field229 = null;
            this.field230 = null;
            this.field231 = null;
            this.field232 = null;
            this.field606 = null;
            this.field293 = null;
            this.field577 = null;
            this.field578 = null;
            this.field483 = null;
            this.field495 = null;
            this.field398 = null;
            this.field515 = null;
            this.field300 = null;
            this.field591 = null;
            this.field592 = null;
            this.field588 = null;
            this.field589 = null;
            this.field590 = null;
            this.field593 = null;
            this.field594 = null;
            this.field595 = null;
            this.field596 = null;
            this.method84((byte) 9);
            class27.method281(this.field336);
            class60.method571(this.field336);
            class40.method414(this.field336);
            class20.method251(this.field336);
            class52.field1444 = null;
            class32.field1115 = null;
            class54.field1532 = null;
            class58.field1570 = null;
            class64.field1665 = null;
            class64.field1677 = null;
            class25.field966 = null;
            super.field716 = null;
            class4.field94 = null;
            class41.method419(this.field336);
            class53.method486(this.field336);
            class3.method7(this.field336);
            class8.method213(this.field336);
            System.gc();
        }
    }

    @OriginalMember(owner = "client", name = "o", descriptor = "(Z)V")
    public final void method205(boolean arg0) {
        if (this.field399 == 0 && this.field427 == 0) {
            this.field606[this.field586] = "Walk here";
            this.field231[this.field586] = 16;
            this.field229[this.field586] = super.field723;
            this.field230[this.field586] = super.field724;
            ++this.field586;
        }
        int var2 = -1;
        for (int var3 = 0; var3 < class3.field87; ++var3) {
            int var5 = class3.field88[var3];
            int var6 = var5 & 127;
            int var7 = var5 >> 7 & 127;
            int var8 = var5 >> 29 & 3;
            int var9 = var5 >> 14 & 32767;
            if (var2 != var5) {
                var2 = var5;
                if (var8 == 2 && this.field390.method517(this.field605, var6, var7, var5) >= 0) {
                    class27 var10 = class27.method282(var9);
                    if (var10.field1016 != null) {
                        var10 = var10.method278((byte) -41);
                    }
                    if (var10 == null) {
                        continue;
                    }
                    if (this.field399 == 1) {
                        this.field606[this.field586] = "Use " + this.field403 + " with @cya@" + var10.field1024;
                        this.field231[this.field586] = 419;
                        this.field232[this.field586] = var5;
                        this.field229[this.field586] = var6;
                        this.field230[this.field586] = var7;
                        ++this.field586;
                    } else if (this.field427 == 1) {
                        if ((this.field429 & 4) == 4) {
                            this.field606[this.field586] = this.field430 + " @cya@" + var10.field1024;
                            this.field231[this.field586] = 157;
                            this.field232[this.field586] = var5;
                            this.field229[this.field586] = var6;
                            this.field230[this.field586] = var7;
                            ++this.field586;
                        }
                    } else {
                        if (var10.field1003 != null) {
                            for (int var11 = 4; var11 >= 0; --var11) {
                                if (var10.field1003[var11] != null) {
                                    this.field606[this.field586] = var10.field1003[var11] + " @cya@" + var10.field1024;
                                    if (var11 == 0) {
                                        this.field231[this.field586] = 588;
                                    }
                                    if (var11 == 1) {
                                        this.field231[this.field586] = 256;
                                    }
                                    if (var11 == 2) {
                                        this.field231[this.field586] = 766;
                                    }
                                    if (var11 == 3) {
                                        this.field231[this.field586] = 985;
                                    }
                                    if (var11 == 4) {
                                        this.field231[this.field586] = 1577;
                                    }
                                    this.field232[this.field586] = var5;
                                    this.field229[this.field586] = var6;
                                    this.field230[this.field586] = var7;
                                    ++this.field586;
                                }
                            }
                        }
                        this.field606[this.field586] = "Examine @cya@" + var10.field1024;
                        this.field231[this.field586] = 1327;
                        this.field232[this.field586] = var10.field1018 << 14;
                        this.field229[this.field586] = var6;
                        this.field230[this.field586] = var7;
                        ++this.field586;
                    }
                }
                if (var8 == 1) {
                    class23 var12 = this.field265[var9];
                    if (var12.field951.field1628 == 1 && (var12.field1152 & 127) == 64 && (var12.field1153 & 127) == 64) {
                        for (int var13 = 0; var13 < this.field266; ++var13) {
                            class23 var16 = this.field265[this.field267[var13]];
                            if (var16 != null && var12 != var16 && var16.field951.field1628 == 1 && var12.field1152 == var16.field1152 && var12.field1153 == var16.field1153) {
                                this.method138((byte) 25, var16.field951, var7, var6, this.field267[var13]);
                            }
                        }
                        for (int var14 = 0; var14 < this.field435; ++var14) {
                            class4 var15 = this.field434[this.field436[var14]];
                            if (var15 != null && var12.field1152 == var15.field1152 && var12.field1153 == var15.field1153) {
                                this.method144(-578, var7, this.field436[var14], var15, var6);
                            }
                        }
                    }
                    this.method138((byte) 25, var12.field951, var7, var6, var9);
                }
                if (var8 == 0) {
                    class4 var17 = this.field434[var9];
                    if ((var17.field1152 & 127) == 64 && (var17.field1153 & 127) == 64) {
                        for (int var18 = 0; var18 < this.field266; ++var18) {
                            class23 var21 = this.field265[this.field267[var18]];
                            if (var21 != null && var21.field951.field1628 == 1 && var17.field1152 == var21.field1152 && var17.field1153 == var21.field1153) {
                                this.method138((byte) 25, var21.field951, var7, var6, this.field267[var18]);
                            }
                        }
                        for (int var19 = 0; var19 < this.field435; ++var19) {
                            class4 var20 = this.field434[this.field436[var19]];
                            if (var20 != null && var17 != var20 && var17.field1152 == var20.field1152 && var17.field1153 == var20.field1153) {
                                this.method144(-578, var7, this.field436[var19], var20, var6);
                            }
                        }
                    }
                    this.method144(-578, var7, var9, var17, var6);
                }
                if (var8 == 3) {
                    class72 var22 = this.field622[this.field605][var6][var7];
                    if (var22 != null) {
                        for (class68 var23 = (class68) var22.method601(-402); var23 != null; var23 = (class68) var22.method603((byte) 18)) {
                            class40 var24 = class40.method418(var23.field1721);
                            if (this.field399 == 1) {
                                this.field606[this.field586] = "Use " + this.field403 + " with @lre@" + var24.field1292;
                                this.field231[this.field586] = 62;
                                this.field232[this.field586] = var23.field1721;
                                this.field229[this.field586] = var6;
                                this.field230[this.field586] = var7;
                                ++this.field586;
                            } else if (this.field427 == 1) {
                                if ((this.field429 & 1) == 1) {
                                    this.field606[this.field586] = this.field430 + " @lre@" + var24.field1292;
                                    this.field231[this.field586] = 538;
                                    this.field232[this.field586] = var23.field1721;
                                    this.field229[this.field586] = var6;
                                    this.field230[this.field586] = var7;
                                    ++this.field586;
                                }
                            } else {
                                for (int var25 = 4; var25 >= 0; --var25) {
                                    if (var24.field1277 != null && var24.field1277[var25] != null) {
                                        this.field606[this.field586] = var24.field1277[var25] + " @lre@" + var24.field1292;
                                        if (var25 == 0) {
                                            this.field231[this.field586] = 184;
                                        }
                                        if (var25 == 1) {
                                            this.field231[this.field586] = 81;
                                        }
                                        if (var25 == 2) {
                                            this.field231[this.field586] = 98;
                                        }
                                        if (var25 == 3) {
                                            this.field231[this.field586] = 275;
                                        }
                                        if (var25 == 4) {
                                            this.field231[this.field586] = 689;
                                        }
                                        this.field232[this.field586] = var23.field1721;
                                        this.field229[this.field586] = var6;
                                        this.field230[this.field586] = var7;
                                        ++this.field586;
                                    } else if (var25 == 2) {
                                        this.field606[this.field586] = "Take @lre@" + var24.field1292;
                                        this.field231[this.field586] = 98;
                                        this.field232[this.field586] = var23.field1721;
                                        this.field229[this.field586] = var6;
                                        this.field230[this.field586] = var7;
                                        ++this.field586;
                                    }
                                }
                                this.field606[this.field586] = "Examine @lre@" + var24.field1292;
                                this.field231[this.field586] = 1184;
                                this.field232[this.field586] = var23.field1721;
                                this.field229[this.field586] = var6;
                                this.field230[this.field586] = var7;
                                ++this.field586;
                            }
                        }
                    }
                }
            }
        }
        if (!arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method206(String arg0) throws IOException {
        if (!this.field204) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field547 != null) {
                try {
                    this.field547.close();
                } catch (Exception var4) {
                }
                this.field547 = null;
            }
            this.field547 = this.method175(43595);
            this.field547.setSoTimeout(10000);
            InputStream var2 = this.field547.getInputStream();
            OutputStream var3 = this.field547.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client", name = "c", descriptor = "(IZI)V")
    public final void method207(int arg0, boolean arg1, int arg2) {
        if (arg0 >= 0) {
            this.field426 = !this.field426;
        }
        signlink.midivol = arg2;
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "()V")
    public final void method208() {
        this.method142(20, "Starting up", true);
        if (signlink.sunjava) {
            super.field709 = 5;
        }
        if (field298) {
            this.field299 = true;
        } else {
            field298 = true;
            boolean var1 = false;
            String var2 = this.method88(true);
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
                this.field280 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field317[var3] = new class46(var3 + 1, -10687, signlink.cache_dat, signlink.cache_idx[var3], 500000);
                    }
                }
                try {
                    this.method196(7);
                    this.field182 = this.method162("title", (byte) -79, this.field584[1], 1, 25, "title screen");
                    this.field337 = new class50(0, "p11_full", false, this.field182);
                    this.field338 = new class50(0, "p12_full", false, this.field182);
                    this.field339 = new class50(0, "b12_full", false, this.field182);
                    this.field340 = new class50(0, "q8_full", true, this.field182);
                    this.method198((byte) 1);
                    this.method193(true);
                    class18 var4 = this.method162("config", (byte) -79, this.field584[2], 2, 30, "config");
                    class18 var5 = this.method162("interface", (byte) -79, this.field584[3], 3, 35, "interface");
                    class18 var6 = this.method162("media", (byte) -79, this.field584[4], 4, 40, "2d graphics");
                    class18 var7 = this.method162("textures", (byte) -79, this.field584[6], 6, 45, "textures");
                    class18 var8 = this.method162("wordenc", (byte) -79, this.field584[7], 7, 50, "chat system");
                    class18 var9 = this.method162("sounds", (byte) -79, this.field584[8], 8, 55, "sound effects");
                    this.field318 = new byte[4][104][104];
                    this.field262 = new int[4][105][105];
                    this.field390 = new class53(false, 4, 104, this.field262, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field556[var10] = new class36(104, false, 104);
                    }
                    this.field495 = new class51(512, 512);
                    class18 var11 = this.method162("versionlist", (byte) -79, this.field584[5], 5, 60, "update list");
                    this.method142(60, "Connecting to update server", true);
                    this.field253 = new class14();
                    this.field253.method233(var11, this);
                    class8.method211(this.field253.method236(-101));
                    class3.method8(this.field253.method239(field216, 0), this.field253);
                    if (!field353) {
                        this.field183 = 0;
                        this.field184 = true;
                        this.field253.method237(2, this.field183);
                        while (this.field253.method225() > 0) {
                            this.method137(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field253.field751 > 3) {
                                this.method180("ondemand");
                                return;
                            }
                        }
                    }
                    this.method142(65, "Requesting animations", true);
                    int var12 = this.field253.method239(field216, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field253.method237(1, var13);
                    }
                    while (this.field253.method225() > 0) {
                        int var14 = var12 - this.field253.method225();
                        if (var14 > 0) {
                            this.method142(65, "Loading animations - " + var14 * 100 / var12 + "%", true);
                        }
                        this.method137(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field253.field751 > 3) {
                            this.method180("ondemand");
                            return;
                        }
                    }
                    this.method142(70, "Requesting models", true);
                    int var15 = this.field253.method239(field216, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field253.method234(-715, var16);
                        if ((var17 & 1) != 0) {
                            this.field253.method237(0, var16);
                        }
                    }
                    int var18 = this.field253.method225();
                    while (this.field253.method225() > 0) {
                        int var19 = var18 - this.field253.method225();
                        if (var19 > 0) {
                            this.method142(70, "Loading models - " + var19 * 100 / var18 + "%", true);
                        }
                        this.method137(0);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field317[0] != null) {
                        this.method142(75, "Requesting maps", true);
                        this.field253.method237(3, this.field253.method235(48, 47, 0, 949));
                        this.field253.method237(3, this.field253.method235(48, 47, 1, 949));
                        this.field253.method237(3, this.field253.method235(48, 48, 0, 949));
                        this.field253.method237(3, this.field253.method235(48, 48, 1, 949));
                        this.field253.method237(3, this.field253.method235(48, 49, 0, 949));
                        this.field253.method237(3, this.field253.method235(48, 49, 1, 949));
                        this.field253.method237(3, this.field253.method235(47, 47, 0, 949));
                        this.field253.method237(3, this.field253.method235(47, 47, 1, 949));
                        this.field253.method237(3, this.field253.method235(47, 48, 0, 949));
                        this.field253.method237(3, this.field253.method235(47, 48, 1, 949));
                        this.field253.method237(3, this.field253.method235(148, 48, 0, 949));
                        this.field253.method237(3, this.field253.method235(148, 48, 1, 949));
                        int var20 = this.field253.method225();
                        while (this.field253.method225() > 0) {
                            int var21 = var20 - this.field253.method225();
                            if (var21 > 0) {
                                this.method142(75, "Loading maps - " + var21 * 100 / var20 + "%", true);
                            }
                            this.method137(0);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field253.method239(field216, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field253.method234(-715, var23);
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
                            this.field253.method227(0, 0, var23, var25);
                        }
                    }
                    this.field253.method232(field352, 0);
                    if (!field353) {
                        int var26 = this.field253.method239(field216, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field253.method240(-25506, var27)) {
                                this.field253.method227(0, 2, var27, (byte) 1);
                            }
                        }
                    }
                    this.method142(80, "Unpacking media", true);
                    this.field281 = new class33(var6, "invback", 0);
                    this.field283 = new class33(var6, "chatback", 0);
                    this.field282 = new class33(var6, "mapback", 0);
                    this.field395 = new class33(var6, "backbase1", 0);
                    this.field396 = new class33(var6, "backbase2", 0);
                    this.field397 = new class33(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field478[var28] = new class33(var6, "sideicons", var28);
                    }
                    this.field637 = new class51(var6, "compass", 0);
                    this.field155 = new class51(var6, "mapedge", 0);
                    this.field155.method471(9);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field188[var29] = new class33(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 63; ++var30) {
                        this.field225[var30] = new class51(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field157[var31] = new class51(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field380[var32] = new class51(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field244[var33] = new class51(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field304[var34] = new class51(var6, "headicons_hint", var34);
                    }
                    this.field598 = new class51(var6, "overlay_multiway", 0);
                    this.field312 = new class51(var6, "mapmarker", 0);
                    this.field313 = new class51(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field468[var35] = new class51(var6, "cross", var35);
                    }
                    this.field571 = new class51(var6, "mapdots", 0);
                    this.field572 = new class51(var6, "mapdots", 1);
                    this.field573 = new class51(var6, "mapdots", 2);
                    this.field574 = new class51(var6, "mapdots", 3);
                    this.field575 = new class51(var6, "mapdots", 4);
                    this.field553 = new class33(var6, "scrollbar", 0);
                    this.field554 = new class33(var6, "scrollbar", 1);
                    this.field172 = new class33(var6, "redstone1", 0);
                    this.field173 = new class33(var6, "redstone2", 0);
                    this.field174 = new class33(var6, "redstone3", 0);
                    this.field175 = new class33(var6, "redstone1", 0);
                    this.field175.method344(2);
                    this.field176 = new class33(var6, "redstone2", 0);
                    this.field176.method344(2);
                    this.field407 = new class33(var6, "redstone1", 0);
                    this.field407.method345(-179);
                    this.field408 = new class33(var6, "redstone2", 0);
                    this.field408.method345(-179);
                    this.field409 = new class33(var6, "redstone3", 0);
                    this.field409.method345(-179);
                    this.field410 = new class33(var6, "redstone1", 0);
                    this.field410.method344(2);
                    this.field410.method345(-179);
                    this.field411 = new class33(var6, "redstone2", 0);
                    this.field411.method344(2);
                    this.field411.method345(-179);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field297[var36] = new class33(var6, "mod_icons", var36);
                    }
                    class51 var37 = new class51(var6, "backleft1", 0);
                    this.field284 = new class62(var37.field1437, var37.field1438, 462, this.method122(false));
                    var37.method472(0, 0, true);
                    class51 var38 = new class51(var6, "backleft2", 0);
                    this.field285 = new class62(var38.field1437, var38.field1438, 462, this.method122(false));
                    var38.method472(0, 0, true);
                    class51 var39 = new class51(var6, "backright1", 0);
                    this.field286 = new class62(var39.field1437, var39.field1438, 462, this.method122(false));
                    var39.method472(0, 0, true);
                    class51 var40 = new class51(var6, "backright2", 0);
                    this.field287 = new class62(var40.field1437, var40.field1438, 462, this.method122(false));
                    var40.method472(0, 0, true);
                    class51 var41 = new class51(var6, "backtop1", 0);
                    this.field288 = new class62(var41.field1437, var41.field1438, 462, this.method122(false));
                    var41.method472(0, 0, true);
                    class51 var42 = new class51(var6, "backvmid1", 0);
                    this.field289 = new class62(var42.field1437, var42.field1438, 462, this.method122(false));
                    var42.method472(0, 0, true);
                    class51 var43 = new class51(var6, "backvmid2", 0);
                    this.field290 = new class62(var43.field1437, var43.field1438, 462, this.method122(false));
                    var43.method472(0, 0, true);
                    class51 var44 = new class51(var6, "backvmid3", 0);
                    this.field291 = new class62(var44.field1437, var44.field1438, 462, this.method122(false));
                    var44.method472(0, 0, true);
                    class51 var45 = new class51(var6, "backhmid2", 0);
                    this.field292 = new class62(var45.field1437, var45.field1438, 462, this.method122(false));
                    var45.method472(0, 0, true);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field225[var50] != null) {
                            this.field225[var50].method470(var48 + var49, 106, var47 + var49, var46 + var49);
                        }
                        if (this.field188[var50] != null) {
                            this.field188[var50].method346(var48 + var49, 106, var47 + var49, var46 + var49);
                        }
                    }
                    this.method142(83, "Unpacking textures", true);
                    class41.method424(var7, 3);
                    class41.method428(0.8D, 29576);
                    class41.method423(0, 20);
                    this.method142(86, "Unpacking config", true);
                    class58.method561(var4, (byte) 3);
                    class27.method274(var4);
                    class52.method482(var4, (byte) 3);
                    class40.method417(var4);
                    class60.method573(var4);
                    class32.method336(var4, (byte) 3);
                    class64.method587(var4, (byte) 3);
                    class25.method267(var4, (byte) 3);
                    class61.method576(var4, (byte) 3);
                    class40.field1256 = field352;
                    if (!field353) {
                        this.method142(90, "Unpacking sounds", true);
                        byte[] var51 = var9.method249("sounds.dat", (byte[]) null);
                        class30 var52 = new class30(true, var51);
                        class2.method1(var52, (byte) 3);
                    }
                    this.method142(95, "Unpacking interfaces", true);
                    class50[] var53 = new class50[] { this.field337, this.field338, this.field339, this.field340 };
                    class20.method255(var6, var53, var5, 0);
                    this.method142(100, "Preparing game engine", true);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field282.field1125[this.field282.field1127 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field245[var54] = var55;
                        this.field546[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field282.field1125[this.field282.field1127 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field448[var58 - 5] = var59 - 25;
                        this.field311[var58 - 5] = var60 - var59;
                    }
                    class41.method421(503, 765, 7);
                    this.field634 = class41.field1309;
                    class41.method421(96, 479, 7);
                    this.field631 = class41.field1309;
                    class41.method421(261, 190, 7);
                    this.field632 = class41.field1309;
                    class41.method421(334, 512, 7);
                    this.field633 = class41.field1309;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class41.field1307[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class53.method523(800, 334, 500, 512, var62, -402);
                    class39.method368(var8);
                    this.field451 = new class66(field467, this);
                    this.method131(this.field451, 10);
                    class11.field690 = this;
                    class27.field1015 = this;
                    class60.field1615 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field374 + " " + this.field614);
                    this.field314 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client", name = "L", descriptor = "(I)V")
    public final void method209(int arg0) {
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
        if (this.field538 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
    }

    @OriginalMember(owner = "client", name = "a", descriptor = "(ZILMLYYHULT;)V")
    private final void method210(boolean arg0, int arg1, class30 arg2) {
        while (true) {
            if (arg2.field1093 + 21 < arg1 * 8) {
                int var4 = arg2.method307(14, 84);
                if (var4 != 16383) {
                    if (this.field265[var4] == null) {
                        this.field265[var4] = new class23();
                    }
                    class23 var5 = this.field265[var4];
                    this.field267[this.field266++] = var4;
                    var5.field1166 = field502;
                    int var6 = arg2.method307(1, 84);
                    var5.field951 = class60.method574(arg2.method307(13, 84));
                    int var7 = arg2.method307(1, 84);
                    if (var7 == 1) {
                        this.field438[this.field437++] = var4;
                    }
                    int var8 = arg2.method307(5, 84);
                    if (var8 > 15) {
                        var8 -= 32;
                    }
                    int var9 = arg2.method307(5, 84);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1144 = var5.field951.field1628;
                    var5.field1139 = var5.field951.field1622;
                    var5.field1159 = var5.field951.field1603;
                    var5.field1160 = var5.field951.field1620;
                    var5.field1161 = var5.field951.field1612;
                    var5.field1162 = var5.field951.field1626;
                    var5.field1148 = var5.field951.field1625;
                    var5.method352(field499.field1140[0] + var9, true, field499.field1141[0] + var8, var6 == 1);
                    continue;
                }
            }
            arg2.method308((byte) -108);
            if (!arg0) {
                this.field622 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field158[var1] = var0 / 4;
        }
        field166 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field166[var3] = var2 - 1;
            var2 += var2;
        }
        field169 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field178 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field216 = 495;
        field252 = -896;
        field278 = -151;
        field324 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field350 = 10;
        field352 = true;
        field393 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field425 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field467 = 885;
        field508 = true;
    }
}
