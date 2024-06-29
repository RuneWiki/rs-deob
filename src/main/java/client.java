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
public class client extends class51 {

    @OriginalMember(owner = "client!client", name = "J", descriptor = "LWTGHTNMN;")
    private class57 field139 = new class57(36113);

    @OriginalMember(owner = "client!client", name = "K", descriptor = "I")
    private int field140 = 7085;

    @OriginalMember(owner = "client!client", name = "L", descriptor = "[I")
    private int[] field141 = new int[9];

    @OriginalMember(owner = "client!client", name = "M", descriptor = "Z")
    private boolean field142 = false;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "[I")
    private int[] field163 = new int[class72.field1731];

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field165 = -1;

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "LQXTIWHBH;")
    private class44 field166 = new class44();

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "I")
    private int field168 = 3;

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "LEMWAMCXW;")
    private class14 field169 = class14.method205(1, (byte) -102);

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "I")
    private int field174 = 2;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "Z")
    private boolean field175 = false;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "[I")
    private int[] field180 = new int[33];

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private int field182 = -485;

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
    private boolean field183 = false;

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "I")
    private int field186 = 1;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "[I")
    private int[] field187 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "LEMWAMCXW;")
    private class14 field188 = class14.method205(1, (byte) -102);

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "Z")
    private boolean field189 = false;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "[I")
    private int[] field190 = new int[class72.field1731];

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "[LCMELCUKG;")
    private class8[] field191 = new class8[100];

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "LEMWAMCXW;")
    private class14 field193 = new class14(new byte[5000], true);

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "[LRLTBSHTA;")
    private class45[] field194 = new class45[16384];

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "[I")
    public int[] field196 = new int[16384];

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "[Ljava/lang/String;")
    private String[] field207 = new String[200];

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "[I")
    private int[] field208 = new int[50];

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "[Ljava/lang/String;")
    private String[] field212 = new String[5];

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "[Z")
    private boolean[] field213 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "Ljava/lang/String;")
    private String field214 = "";

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "[Ljava/lang/String;")
    private String[] field216 = new String[100];

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "[I")
    private int[] field217 = new int[100];

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "Z")
    private boolean field219 = false;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "[I")
    private int[] field220 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "I")
    private int field222 = -1;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "[I")
    private int[] field232 = new int[33];

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "[LTFHGRYAS;")
    private class50[] field233 = new class50[1000];

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "I")
    private int field234 = -1;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "[LTFHGRYAS;")
    private class50[] field235 = new class50[100];

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "I")
    private int field236 = -1;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "I")
    private int field237 = -814;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "[I")
    private int[] field239 = new int[5];

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "Z")
    private boolean field240 = false;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "LWTGHTNMN;")
    private class57 field242 = new class57(36113);

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "[LYSPVLGYE;")
    public class65[] field246 = new class65[5];

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "Z")
    private boolean field251 = false;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "Z")
    private boolean field252 = true;

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "B")
    private byte field255 = 2;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
    private boolean field256 = true;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "[LCMELCUKG;")
    private class8[] field258 = new class8[2];

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "[I")
    private int[] field260 = new int[1000];

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[I")
    private int[] field261 = new int[1000];

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private final int field262 = 100;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "[I")
    private int[] field263 = new int[100];

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "[LTFHGRYAS;")
    private class50[] field265 = new class50[20];

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "[J")
    private long[] field267 = new long[100];

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field272 = -1;

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "Z")
    private boolean field275 = false;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field277 = 1;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "I")
    private int field278 = -1;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field279 = -1;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "[[I")
    private int[][] field280 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "[I")
    private int[] field281 = new int[200];

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field288 = 2;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "B")
    private byte field290 = 4;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "B")
    private byte field292 = -7;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "[I")
    private int[] field299 = new int[7];

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[LTFHGRYAS;")
    private class50[] field301 = new class50[32];

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "[I")
    private int[] field302 = new int[256];

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "Z")
    private boolean field307 = false;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "I")
    private int field309 = 50;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "[I")
    private int[] field310 = new int[this.field309];

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
    private int[] field311 = new int[this.field309];

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "[I")
    private int[] field312 = new int[this.field309];

    @OriginalMember(owner = "client!client", name = "be", descriptor = "[I")
    private int[] field313 = new int[this.field309];

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "[I")
    private int[] field314 = new int[this.field309];

    @OriginalMember(owner = "client!client", name = "de", descriptor = "[I")
    private int[] field315 = new int[this.field309];

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "[I")
    private int[] field316 = new int[this.field309];

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "[Ljava/lang/String;")
    private String[] field317 = new String[this.field309];

    @OriginalMember(owner = "client!client", name = "he", descriptor = "[I")
    public int[] field319 = new int[2000];

    @OriginalMember(owner = "client!client", name = "je", descriptor = "[[I")
    private int[][] field321 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field322 = 655;

    @OriginalMember(owner = "client!client", name = "me", descriptor = "I")
    private int field324 = -892;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "Z")
    public boolean field329 = true;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "I")
    private int field330 = 135;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "[Ljava/lang/String;")
    private String[] field332 = new String[500];

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "I")
    private int field333 = -1;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field337 = 5063219;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "Z")
    private boolean field338 = false;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field339 = 2048;

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "I")
    private int field340 = 2047;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "[LZATRZGAA;")
    private class66[] field341 = new class66[this.field339];

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "[I")
    public int[] field343 = new int[this.field339];

    @OriginalMember(owner = "client!client", name = "He", descriptor = "[I")
    private int[] field345 = new int[this.field339];

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "[LEMWAMCXW;")
    private class14[] field346 = new class14[this.field339];

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "Z")
    private boolean field348 = false;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "I")
    private int field357 = 3353893;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field362 = 2;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "I")
    private int field368 = -580;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "Ljava/lang/String;")
    private String field372 = "";

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "[J")
    private long[] field373 = new long[200];

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "Z")
    private boolean field375 = false;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "Z")
    private boolean field376 = true;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "Ljava/lang/String;")
    private String field379 = "";

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field380 = 243;

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "I")
    private int field381 = 603;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "[I")
    private int[] field382 = new int[50];

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "[I")
    private int[] field385 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
    private volatile boolean field391 = false;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "[[[I")
    private int[][][] field392 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "I")
    private int field395 = 128;

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "[Z")
    private boolean[] field399 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "I")
    private int field404 = 78;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "I")
    private int field405 = 7759444;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "Z")
    private boolean field406 = true;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "Z")
    private boolean field407 = false;

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "I")
    private int field410 = 5;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "I")
    private int field421 = -224;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field422 = -1;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "Z")
    private volatile boolean field425 = false;

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "Z")
    private boolean field431 = false;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "[I")
    private int[] field434 = new int[class72.field1731];

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field435 = -1;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "I")
    private int field436 = -1;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "[[[LWTGHTNMN;")
    private class57[][][] field437 = new class57[4][104][104];

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "Ljava/lang/String;")
    private String field443 = "";

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "[LTFHGRYAS;")
    private class50[] field451 = new class50[8];

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "Z")
    private boolean field452 = false;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "LEMWAMCXW;")
    private class14 field455 = class14.method205(1, (byte) -102);

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "[I")
    private int[] field458 = new int[151];

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "Z")
    private boolean field462 = false;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "I")
    private int field463 = -6771;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "Z")
    private boolean field465 = true;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "Z")
    public boolean field466 = false;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "I")
    private int field467 = -1;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "Z")
    private boolean field469 = false;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "[I")
    private int[] field470 = new int[5];

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "[LTFHGRYAS;")
    private class50[] field471 = new class50[32];

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "[LCAMRNFMB;")
    private class6[] field472 = new class6[4];

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "[LCMELCUKG;")
    private class8[] field474 = new class8[13];

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "Ljava/lang/String;")
    private String field478 = "";

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "Ljava/lang/String;")
    private String field479 = "";

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "B")
    private byte field484 = -109;

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
    private int[] field485 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "Z")
    private boolean field493 = false;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "[I")
    private int[] field498 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "[I")
    private int[] field499 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field504 = -351;

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "I")
    private int field505 = 2301979;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "[I")
    public int[] field507 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "Ljava/lang/String;")
    private String field508 = "";

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "Z")
    private boolean field515 = false;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "[I")
    private int[] field516 = new int[500];

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "[I")
    private int[] field517 = new int[500];

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "[I")
    private int[] field518 = new int[500];

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "[I")
    private int[] field519 = new int[500];

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "[I")
    private int[] field524 = new int[50];

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "Z")
    private boolean field525 = false;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
    private int[] field527 = new int[151];

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "Z")
    private boolean field528 = false;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "I")
    private int field529 = -1;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "I")
    private int field530 = 250;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "Z")
    private volatile boolean field531 = false;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "[I")
    private int[] field543 = new int[100];

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "[Ljava/lang/String;")
    private String[] field544 = new String[100];

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "[Ljava/lang/String;")
    private String[] field545 = new String[100];

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "I")
    private int field555 = 3;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field558 = -1;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "Z")
    private boolean field559 = false;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "[B")
    private byte[] field562 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "Z")
    private boolean field563 = true;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "Z")
    private boolean field566 = false;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "I")
    private int field569 = -1;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "Ljava/lang/String;")
    private String field571 = "";

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "[[I")
    private int[][] field572 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "[I")
    private int[] field573 = new int[5];

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "I")
    private int field579 = 2;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "Z")
    private boolean field587 = false;

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "I")
    private int field592 = -1;

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "B")
    private byte field593 = -18;

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[LTFHGRYAS;")
    private class50[] field597 = new class50[32];

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "[I")
    public int[] field601 = new int[1000];

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field603 = new CRC32();

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "[I")
    private int[] field604 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "LWTGHTNMN;")
    private class57 field605 = new class57(36113);

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "Z")
    private boolean field606 = true;

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "I")
    private int field610 = -205;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "[I")
    private final int[] field614 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "Z")
    private boolean field616 = false;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "Ljava/lang/String;")
    private String field617 = "";

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "Ljava/lang/String;")
    private String field618 = "";

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    private int field619 = 839;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "Z")
    private boolean field624 = false;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "I")
    private int field625 = 8;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private static int field143 = 475;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "[I")
    private static int[] field238 = new int[99];

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "[[I")
    public static final int[][] field245;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private static int field268;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
    private static boolean field270;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field273;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private static int field300;

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "Ljava/lang/String;")
    private static String field349;

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "[I")
    public static int[] field359;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private static int field371;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "Z")
    private static boolean field426;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "[I")
    public static final int[] field454;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field523;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "Z")
    private static boolean field526;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "I")
    private static int field580;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "I")
    private int field164;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field167;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field171;

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "I")
    private int field172;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field197;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "I")
    private int field198;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "I")
    private int field199;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field200;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private static int field203;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field206;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    public int field209;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "I")
    public int field210;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field211;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "I")
    private int field218;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "I")
    private int field221;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "I")
    private int field223;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "I")
    private int field224;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
    private int field225;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field226;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field227;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "I")
    private static int field241;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private int field244;

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "I")
    private int field253;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private static int field254;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "I")
    public static int field257;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "I")
    private int field266;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "I")
    public static int field269;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "I")
    private int field289;

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "I")
    private int field298;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field306;

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "I")
    private int field308;

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "I")
    private static int field318;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
    private int field328;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    public static int field331;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field334;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    public int field336;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
    private int field342;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private int field344;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field347;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private static int field350;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "I")
    private int field356;

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private static int field360;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private int field361;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field370;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
    private int field374;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    private int field384;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "I")
    private int field386;

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "I")
    private int field387;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private int field388;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    private int field389;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "I")
    private int field390;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "I")
    private static int field394;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "I")
    private int field396;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "I")
    private int field397;

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "I")
    private int field398;

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field401;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "I")
    private int field408;

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "I")
    private static int field409;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private int field411;

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "I")
    private int field418;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "I")
    private int field419;

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field420;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "I")
    private int field424;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private int field427;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field428;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "I")
    private int field432;

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "I")
    private int field438;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field446;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field447;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "I")
    private int field448;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private int field450;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private static int field453;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field456;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field457;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field459;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field461;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field464;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "I")
    private int field468;

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "I")
    private int field473;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "I")
    private int field481;

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field483;

    @OriginalMember(owner = "client!client", name = "th", descriptor = "I")
    private int field486;

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "I")
    private int field487;

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "I")
    private int field488;

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "I")
    private int field489;

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "I")
    private int field490;

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "I")
    private int field491;

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "I")
    private int field494;

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "I")
    private int field495;

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "I")
    private int field496;

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "I")
    private int field497;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "I")
    private int field500;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "I")
    private int field502;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    private static int field514;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private static int field522;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field535;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field536;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field537;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field538;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "I")
    private int field539;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "I")
    private int field540;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "I")
    private int field542;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field556;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field557;

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "I")
    private static int field561;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private static int field564;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field565;

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "I")
    private int field574;

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "I")
    private int field575;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "I")
    private int field576;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "I")
    private int field577;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "I")
    private int field578;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int field581;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "I")
    private int field582;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "I")
    private int field583;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private int field584;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field585;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "I")
    private int field588;

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "I")
    private int field589;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "I")
    private int field591;

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "I")
    private static int field595;

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "I")
    private int field596;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field598;

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "I")
    private int field599;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "I")
    private int field600;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "I")
    private int field607;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "I")
    private int field608;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "I")
    private int field609;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "I")
    private int field611;

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "I")
    private int field613;

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "I")
    private int field615;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    private int field620;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "I")
    private int field621;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private static int field622;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "I")
    public static int field626;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "J")
    private long field286;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "J")
    public long field305;

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "J")
    private long field541;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "J")
    private long field560;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "J")
    private long field602;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "LKMIIMWED;")
    private class26 field369;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "LMAARFNGV;")
    private class29 field501;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "LMWZVGOTL;")
    public class30 field480;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "LTFHGRYAS;")
    private class50 field152;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "LTFHGRYAS;")
    private class50 field153;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "LTFHGRYAS;")
    private class50 field228;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "LTFHGRYAS;")
    private class50 field229;

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "LTFHGRYAS;")
    private class50 field351;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "LTFHGRYAS;")
    private class50 field352;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "LTFHGRYAS;")
    private class50 field353;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "LTFHGRYAS;")
    private class50 field354;

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "LTFHGRYAS;")
    private class50 field355;

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "LTFHGRYAS;")
    private class50 field400;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "LTFHGRYAS;")
    private class50 field403;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "LTFHGRYAS;")
    private class50 field460;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "LTFHGRYAS;")
    private class50 field482;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "LTFHGRYAS;")
    private class50 field520;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "LTFHGRYAS;")
    private class50 field521;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "LXBLPPVAP;")
    private class59 field154;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "LXBLPPVAP;")
    private class59 field155;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "LXBLPPVAP;")
    private class59 field156;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "LXBLPPVAP;")
    private class59 field157;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "LXBLPPVAP;")
    private class59 field158;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "LXBLPPVAP;")
    private class59 field159;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "LXBLPPVAP;")
    private class59 field160;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "LXBLPPVAP;")
    private class59 field161;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "LXBLPPVAP;")
    private class59 field162;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "LXBLPPVAP;")
    private class59 field176;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "LXBLPPVAP;")
    private class59 field177;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "LXBLPPVAP;")
    private class59 field178;

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "LXBLPPVAP;")
    private class59 field179;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "LXBLPPVAP;")
    private class59 field532;

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "LXBLPPVAP;")
    private class59 field533;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "LXBLPPVAP;")
    private class59 field534;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "LXBLPPVAP;")
    private class59 field546;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "LXBLPPVAP;")
    private class59 field547;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "LXBLPPVAP;")
    private class59 field548;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "LXBLPPVAP;")
    private class59 field549;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "LXBLPPVAP;")
    private class59 field550;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "LXBLPPVAP;")
    private class59 field551;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "LXBLPPVAP;")
    private class59 field552;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "LXBLPPVAP;")
    private class59 field553;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "LXBLPPVAP;")
    private class59 field554;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "LXQKSIEVT;")
    private class62 field148;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "LXQKSIEVT;")
    private class62 field149;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "LXQKSIEVT;")
    private class62 field150;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "LXQKSIEVT;")
    private class62 field151;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "LYJYHBEIS;")
    private class63 field243;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "LZATRZGAA;")
    public static class66 field612;

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "LZPFBNGWW;")
    private class68 field202;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "LCLJPNHPC;")
    private class7 field503;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "LCMELCUKG;")
    private class8 field145;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "LCMELCUKG;")
    private class8 field146;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "LCMELCUKG;")
    private class8 field147;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "LCMELCUKG;")
    private class8 field204;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "LCMELCUKG;")
    private class8 field205;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "LCMELCUKG;")
    private class8 field293;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "LCMELCUKG;")
    private class8 field294;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "LCMELCUKG;")
    private class8 field295;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "LCMELCUKG;")
    private class8 field296;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "LCMELCUKG;")
    private class8 field297;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "LCMELCUKG;")
    private class8 field377;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "LCMELCUKG;")
    private class8 field378;

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "LCMELCUKG;")
    private class8 field475;

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "LCMELCUKG;")
    private class8 field476;

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "LCMELCUKG;")
    private class8 field477;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "LCMELCUKG;")
    private class8 field509;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "LCMELCUKG;")
    private class8 field510;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "LCMELCUKG;")
    private class8 field511;

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "LCMELCUKG;")
    private class8 field512;

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "LCMELCUKG;")
    private class8 field513;

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "Ljava/lang/String;")
    public String field173;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "Ljava/lang/String;")
    public String field201;

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "Ljava/lang/String;")
    private String field433;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "Ljava/lang/String;")
    private String field570;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "Ljava/net/Socket;")
    private Socket field383;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "Z")
    private static boolean field271;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "Z")
    private static boolean field274;

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "Z")
    public static boolean field358;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "Z")
    public static boolean field367;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "Z")
    private static boolean field393;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "[I")
    private int[] field247;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "[I")
    private int[] field248;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "[I")
    private int[] field249;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "[I")
    private int[] field250;

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
    private int[] field283;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "[I")
    private int[] field284;

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "[I")
    private int[] field285;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "[I")
    private int[] field412;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "[I")
    private int[] field413;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "[I")
    private int[] field414;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "[I")
    private int[] field415;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "[I")
    private int[] field416;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "[I")
    private int[] field417;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "[I")
    private int[] field567;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
    private int[] field568;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "[LCMELCUKG;")
    private class8[] field623;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "[[B")
    private byte[][] field144;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "[[B")
    private byte[][] field492;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "[[[B")
    private byte[][][] field192;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "[[[I")
    private int[][][] field230;

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)V")
    public final void method40(int arg0) {
        int var2 = this.field150.method483(true, "Choose Option");
        for (int var3 = 0; var3 < this.field419; ++var3) {
            int var12 = this.field150.method483(true, this.field332[var3]);
            if (var12 > var2) {
                var2 = var12;
            }
        }
        var2 += 8;
        int var4 = this.field419 * 15 + 21;
        int var5 = 35 / arg0;
        if (super.field1379 > 4 && super.field1380 > 4 && super.field1379 < 516 && super.field1380 < 338) {
            int var6 = super.field1379 - 4 - var2 / 2;
            if (var2 + var6 > 512) {
                var6 = 512 - var2;
            }
            if (var6 < 0) {
                var6 = 0;
            }
            int var7 = super.field1380 - 4;
            if (var4 + var7 > 334) {
                var7 = 334 - var4;
            }
            if (var7 < 0) {
                var7 = 0;
            }
            this.field175 = true;
            this.field223 = 0;
            this.field224 = var6;
            this.field225 = var7;
            this.field226 = var2;
            this.field227 = this.field419 * 15 + 22;
        }
        if (super.field1379 > 553 && super.field1380 > 205 && super.field1379 < 743 && super.field1380 < 466) {
            int var8 = super.field1379 - 553 - var2 / 2;
            if (var8 < 0) {
                var8 = 0;
            } else if (var2 + var8 > 190) {
                var8 = 190 - var2;
            }
            int var9 = super.field1380 - 205;
            if (var9 < 0) {
                var9 = 0;
            } else if (var4 + var9 > 261) {
                var9 = 261 - var4;
            }
            this.field175 = true;
            this.field223 = 1;
            this.field224 = var8;
            this.field225 = var9;
            this.field226 = var2;
            this.field227 = this.field419 * 15 + 22;
        }
        if (super.field1379 > 17 && super.field1380 > 357 && super.field1379 < 496 && super.field1380 < 453) {
            int var10 = super.field1379 - 17 - var2 / 2;
            if (var10 < 0) {
                var10 = 0;
            } else if (var2 + var10 > 479) {
                var10 = 479 - var2;
            }
            int var11 = super.field1380 - 357;
            if (var11 < 0) {
                var11 = 0;
            } else if (var4 + var11 > 96) {
                var11 = 96 - var4;
            }
            this.field175 = true;
            this.field223 = 2;
            this.field224 = var10;
            this.field225 = var11;
            this.field226 = var2;
            this.field227 = this.field419 * 15 + 22;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IBLZATRZGAA;ILEMWAMCXW;)V")
    private final void method41(int arg0, byte arg1, class66 arg2, int arg3, class14 arg4) {
        if (arg1 != 71) {
            this.field606 = !this.field606;
        }
        if ((arg3 & 128) != 0) {
            int var6 = arg4.method238((byte) 93);
            int var7 = arg4.method236(29396);
            arg2.method340(var6, var7, -795, field257);
            arg2.field1047 = field257 + 300;
            arg2.field1048 = arg4.method237(true);
            arg2.field1049 = arg4.method236(29396);
        }
        if ((arg3 & 64) != 0) {
            arg2.field1088 = arg4.method245(-485);
            arg2.field1089 = arg4.method245(-485);
        }
        if ((arg3 & 32) != 0) {
            arg2.field1075 = arg4.method224();
            if (arg2.field1075.charAt(0) == '~') {
                arg2.field1075 = arg2.field1075.substring(1);
                this.method79(arg2.field1075, 2, arg2.field1587, true);
            } else if (field612 == arg2) {
                this.method79(arg2.field1075, 2, arg2.field1587, true);
            }
            arg2.field1076 = 0;
            arg2.field1062 = 0;
            arg2.field1054 = 150;
        }
        if ((arg3 & 2) != 0) {
            int var8 = arg4.method246(633);
            if (var8 == 65535) {
                var8 = -1;
            }
            int var9 = arg4.method238((byte) 93);
            if (arg2.field1064 == var8 && var8 != -1) {
                int var10 = class55.field1444[var8].field1458;
                if (var10 == 1) {
                    arg2.field1065 = 0;
                    arg2.field1066 = 0;
                    arg2.field1067 = var9;
                    arg2.field1068 = 0;
                }
                if (var10 == 2) {
                    arg2.field1068 = 0;
                }
            } else if (var8 == -1 || arg2.field1064 == -1 || class55.field1444[var8].field1452 >= class55.field1444[arg2.field1064].field1452) {
                arg2.field1064 = var8;
                arg2.field1065 = 0;
                arg2.field1066 = 0;
                arg2.field1067 = var9;
                arg2.field1068 = 0;
                arg2.field1050 = arg2.field1069;
            }
        }
        if ((arg3 & 16) != 0) {
            int var11 = arg4.method217();
            byte[] var12 = new byte[var11];
            class14 var13 = new class14(var12, true);
            arg4.method255(0, var12, var11, -18210);
            this.field346[arg0] = var13;
            arg2.method505(var13, 5696);
        }
        if ((arg3 & 512) != 0) {
            int var14 = arg4.method238((byte) 93);
            int var15 = arg4.method236(29396);
            arg2.method340(var14, var15, -795, field257);
            arg2.field1047 = field257 + 300;
            arg2.field1048 = arg4.method236(29396);
            arg2.field1049 = arg4.method238((byte) 93);
        }
        if ((arg3 & 8) != 0) {
            int var16 = arg4.method247(-110);
            int var17 = arg4.method236(29396);
            int var18 = arg4.method237(true);
            int var19 = arg4.field707;
            if (arg2.field1587 != null && arg2.field1589) {
                long var20 = class56.method461(arg2.field1587);
                boolean var22 = false;
                if (var17 <= 1) {
                    for (int var23 = 0; var23 < this.field577; ++var23) {
                        if (this.field267[var23] == var20) {
                            var22 = true;
                            break;
                        }
                    }
                }
                if (!var22 && this.field289 == 0) {
                    try {
                        this.field193.field707 = 0;
                        arg4.method226(this.field193.field706, 0, 0, var18);
                        this.field193.field707 = 0;
                        String var24 = class15.method256(this.field193, var18, 905);
                        String var25 = class70.method577(false, var24);
                        arg2.field1075 = var25;
                        arg2.field1076 = var16 >> 8;
                        arg2.field1062 = var16 & 255;
                        arg2.field1054 = 150;
                        if (var17 != 2 && var17 != 3) {
                            if (var17 == 1) {
                                this.method79(var25, 1, "@cr1@" + arg2.field1587, true);
                            } else {
                                this.method79(var25, 2, arg2.field1587, true);
                            }
                        } else {
                            this.method79(var25, 1, "@cr2@" + arg2.field1587, true);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field707 = var18 + var19;
        }
        if ((arg3 & 256) != 0) {
            arg2.field1081 = arg4.method238((byte) 93);
            arg2.field1083 = arg4.method217();
            arg2.field1082 = arg4.method238((byte) 93);
            arg2.field1084 = arg4.method236(29396);
            arg2.field1085 = arg4.method247(-110) + field257;
            arg2.field1086 = arg4.method247(-110) + field257;
            arg2.field1087 = arg4.method217();
            arg2.method341(789);
        }
        if ((arg3 & 1) != 0) {
            arg2.field1063 = arg4.method246(633);
            if (arg2.field1063 == 65535) {
                arg2.field1063 = -1;
            }
        }
        if ((arg3 & 1024) != 0) {
            arg2.field1042 = arg4.method245(-485);
            int var27 = arg4.method222();
            arg2.field1046 = var27 >> 16;
            arg2.field1045 = (var27 & 65535) + field257;
            arg2.field1043 = 0;
            arg2.field1044 = 0;
            if (arg2.field1045 > field257) {
                arg2.field1043 = -1;
            }
            if (arg2.field1042 == 65535) {
                arg2.field1042 = -1;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method42(int arg0) {
        if (this.field231 == 2) {
            this.method123(this.field440 * 2, false, (this.field439 - this.field364 << 7) + this.field442, (this.field438 - this.field363 << 7) + this.field441);
            this.field487 += arg0;
            if (this.field435 > -1 && field257 % 20 < 10) {
                this.field471[0].method424(-24669, this.field435 - 12, this.field436 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method43(boolean arg0) {
        ++this.field620;
        this.method92(this.field240, true);
        this.method163(true, (byte) -124);
        this.method92(this.field240, false);
        this.method163(false, (byte) -124);
        this.method54(-44999);
        this.method84(-46459);
        if (!this.field338) {
            int var2 = this.field395;
            if (this.field599 / 256 > var2) {
                var2 = this.field599 / 256;
            }
            if (this.field399[4] && this.field239[4] + 128 > var2) {
                var2 = this.field239[4] + 128;
            }
            int var3 = this.field396 + this.field185 & 2047;
            this.method87(var2 * 3 + 600, -383, this.field428, var2, this.method114(this.field596, field612.field1059, 1, field612.field1060) - 50, var3, this.field429);
        }
        int var4;
        if (!this.field338) {
            var4 = this.method135(6);
        } else {
            var4 = this.method136(false);
        }
        int var5 = this.field581;
        int var6 = this.field582;
        int var7 = this.field583;
        int var8 = this.field584;
        int var9 = this.field585;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field399[var10]) {
                int var12 = (int) (Math.random() * (double) (this.field470[var10] * 2 + 1) - (double) this.field470[var10] + Math.sin((double) this.field604[var10] / 100.0D * (double) this.field573[var10]) * (double) this.field239[var10]);
                if (var10 == 0) {
                    this.field581 += var12;
                }
                if (var10 == 1) {
                    this.field582 += var12;
                }
                if (var10 == 2) {
                    this.field583 += var12;
                }
                if (var10 == 3) {
                    this.field585 = this.field585 + var12 & 2047;
                }
                if (var10 == 4) {
                    this.field584 += var12;
                    if (this.field584 < 128) {
                        this.field584 = 128;
                    }
                    if (this.field584 > 383) {
                        this.field584 = 383;
                    }
                }
            }
        }
        int var11 = class39.field1126;
        class18.field824 = true;
        class18.field827 = 0;
        class18.field825 = super.field1372 - 4;
        class18.field826 = super.field1373 - 4;
        class2.method15(true);
        this.field202.method555(this.field585, this.field583, this.field584, var4, this.field581, 0, this.field582);
        this.field466 &= arg0;
        this.field202.method530(0);
        this.method103((byte) 8);
        this.method42(this.field445);
        this.method55(3, var11);
        this.method93((byte) 0);
        this.field178.method478(4, 4, super.field1364, false);
        this.field581 = var5;
        this.field582 = var6;
        this.field583 = var7;
        this.field584 = var8;
        this.field585 = var9;
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method44(int arg0) {
        if (this.field197 == 0 && this.field170 == 0) {
            this.field332[this.field419] = "Walk here";
            this.field518[this.field419] = 269;
            this.field516[this.field419] = super.field1372;
            this.field517[this.field419] = super.field1373;
            ++this.field419;
        }
        int var2 = -1;
        this.field487 += arg0;
        for (int var3 = 0; var3 < class18.field827; ++var3) {
            int var4 = class18.field828[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field202.method546(this.field596, var5, var6, var4) >= 0) {
                    class1 var9 = class1.method4(var8);
                    if (var9.field18 != null) {
                        var9 = var9.method2(3);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field197 == 1) {
                        this.field332[this.field419] = "Use " + this.field201 + " with @cya@" + var9.field17;
                        this.field518[this.field419] = 871;
                        this.field519[this.field419] = var4;
                        this.field516[this.field419] = var5;
                        this.field517[this.field419] = var6;
                        ++this.field419;
                    } else if (this.field170 == 1) {
                        if ((this.field172 & 4) == 4) {
                            this.field332[this.field419] = this.field173 + " @cya@" + var9.field17;
                            this.field518[this.field419] = 82;
                            this.field519[this.field419] = var4;
                            this.field516[this.field419] = var5;
                            this.field517[this.field419] = var6;
                            ++this.field419;
                        }
                    } else {
                        if (var9.field49 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field49[var10] != null) {
                                    this.field332[this.field419] = var9.field49[var10] + " @cya@" + var9.field17;
                                    if (var10 == 0) {
                                        this.field518[this.field419] = 242;
                                    }
                                    if (var10 == 1) {
                                        this.field518[this.field419] = 721;
                                    }
                                    if (var10 == 2) {
                                        this.field518[this.field419] = 617;
                                    }
                                    if (var10 == 3) {
                                        this.field518[this.field419] = 846;
                                    }
                                    if (var10 == 4) {
                                        this.field518[this.field419] = 1299;
                                    }
                                    this.field519[this.field419] = var4;
                                    this.field516[this.field419] = var5;
                                    this.field517[this.field419] = var6;
                                    ++this.field419;
                                }
                            }
                        }
                        this.field332[this.field419] = "Examine @cya@" + var9.field17;
                        this.field518[this.field419] = 1263;
                        this.field519[this.field419] = var9.field28 << 14;
                        this.field516[this.field419] = var5;
                        this.field517[this.field419] = var6;
                        ++this.field419;
                    }
                }
                if (var7 == 1) {
                    class45 var11 = this.field194[var8];
                    if (var11.field1259.field1625 == 1 && (var11.field1059 & 127) == 64 && (var11.field1060 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field195; ++var12) {
                            class45 var15 = this.field194[this.field196[var12]];
                            if (var15 != null && var11 != var15 && var15.field1259.field1625 == 1 && var11.field1059 == var15.field1059 && var11.field1060 == var15.field1060) {
                                this.method65(var5, var15.field1259, 116, this.field196[var12], var6);
                            }
                        }
                        for (int var13 = 0; var13 < this.field342; ++var13) {
                            class66 var14 = this.field341[this.field343[var13]];
                            if (var14 != null && var11.field1059 == var14.field1059 && var11.field1060 == var14.field1060) {
                                this.method49(this.field343[var13], var14, var5, 0, var6);
                            }
                        }
                    }
                    this.method65(var5, var11.field1259, 116, var8, var6);
                }
                if (var7 == 0) {
                    class66 var16 = this.field341[var8];
                    if ((var16.field1059 & 127) == 64 && (var16.field1060 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field195; ++var17) {
                            class45 var20 = this.field194[this.field196[var17]];
                            if (var20 != null && var20.field1259.field1625 == 1 && var16.field1059 == var20.field1059 && var16.field1060 == var20.field1060) {
                                this.method65(var5, var20.field1259, 116, this.field196[var17], var6);
                            }
                        }
                        for (int var18 = 0; var18 < this.field342; ++var18) {
                            class66 var19 = this.field341[this.field343[var18]];
                            if (var19 != null && var16 != var19 && var16.field1059 == var19.field1059 && var16.field1060 == var19.field1060) {
                                this.method49(this.field343[var18], var19, var5, 0, var6);
                            }
                        }
                    }
                    this.method49(var8, var16, var5, 0, var6);
                }
                if (var7 == 3) {
                    class57 var21 = this.field437[this.field596][var5][var6];
                    if (var21 != null) {
                        for (class4 var22 = (class4) var21.method471(0); var22 != null; var22 = (class4) var21.method473(-698)) {
                            class54 var23 = class54.method447(var22.field117);
                            if (this.field197 == 1) {
                                this.field332[this.field419] = "Use " + this.field201 + " with @lre@" + var23.field1419;
                                this.field518[this.field419] = 146;
                                this.field519[this.field419] = var22.field117;
                                this.field516[this.field419] = var5;
                                this.field517[this.field419] = var6;
                                ++this.field419;
                            } else if (this.field170 == 1) {
                                if ((this.field172 & 1) == 1) {
                                    this.field332[this.field419] = this.field173 + " @lre@" + var23.field1419;
                                    this.field518[this.field419] = 399;
                                    this.field519[this.field419] = var22.field117;
                                    this.field516[this.field419] = var5;
                                    this.field517[this.field419] = var6;
                                    ++this.field419;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field1430 != null && var23.field1430[var24] != null) {
                                        this.field332[this.field419] = var23.field1430[var24] + " @lre@" + var23.field1419;
                                        if (var24 == 0) {
                                            this.field518[this.field419] = 278;
                                        }
                                        if (var24 == 1) {
                                            this.field518[this.field419] = 416;
                                        }
                                        if (var24 == 2) {
                                            this.field518[this.field419] = 740;
                                        }
                                        if (var24 == 3) {
                                            this.field518[this.field419] = 880;
                                        }
                                        if (var24 == 4) {
                                            this.field518[this.field419] = 609;
                                        }
                                        this.field519[this.field419] = var22.field117;
                                        this.field516[this.field419] = var5;
                                        this.field517[this.field419] = var6;
                                        ++this.field419;
                                    } else if (var24 == 2) {
                                        this.field332[this.field419] = "Take @lre@" + var23.field1419;
                                        this.field518[this.field419] = 740;
                                        this.field519[this.field419] = var22.field117;
                                        this.field516[this.field419] = var5;
                                        this.field517[this.field419] = var6;
                                        ++this.field419;
                                    }
                                }
                                this.field332[this.field419] = "Examine @lre@" + var23.field1419;
                                this.field518[this.field419] = 1069;
                                this.field519[this.field419] = var22.field117;
                                this.field516[this.field419] = var5;
                                this.field517[this.field419] = var6;
                                ++this.field419;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method45(byte arg0) {
        class1.field24.method27();
        class1.field48.method27();
        class67.field1624.method27();
        if (arg0 != 42) {
            this.field488 = -1;
        }
        class54.field1433.method27();
        class54.field1406.method27();
        class66.field1570.method27();
        class47.field1288.method27();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQXTIWHBH;IIIIII)V")
    public final void method46(int arg0, class44 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1.field1220 == 0 && arg1.field1245 != null && !arg1.field1248) {
            if (arg4 >= arg2 && arg6 >= arg3 && arg4 <= arg1.field1250 + arg2 && arg6 <= arg1.field1207 + arg3) {
                int var9 = arg1.field1245.length;
                if (arg7 <= 0) {
                    for (int var10 = 1; var10 > 0; ++var10) {
                    }
                }
                for (int var11 = 0; var11 < var9; ++var11) {
                    int var12 = arg1.field1234[var11] + arg2;
                    int var13 = arg1.field1191[var11] + arg3 - arg0;
                    class44 var14 = class44.method380(arg1.field1245[var11]);
                    int var15 = var14.field1252 + var12;
                    int var16 = var14.field1185 + var13;
                    if ((var14.field1224 >= 0 || var14.field1187 != 0) && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                        if (var14.field1224 >= 0) {
                            this.field408 = var14.field1224;
                        } else {
                            this.field408 = var14.field1200;
                        }
                    }
                    if (var14.field1220 == 8 && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                        this.field461 = var14.field1200;
                    }
                    if (var14.field1220 == 0) {
                        this.method46(var14.field1196, var14, var15, var16, arg4, arg5, arg6, 250);
                        if (var14.field1198 > var14.field1207) {
                            this.method50(-7270, arg6, var14.field1198, var14, arg4, var16, var14.field1250 + var15, var14.field1207, arg5);
                        }
                    } else {
                        if (var14.field1217 == 1 && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                            boolean var17 = false;
                            if (var14.field1237 != 0) {
                                var17 = this.method86(false, var14);
                            }
                            if (!var17) {
                                this.field332[this.field419] = var14.field1197;
                                this.field518[this.field419] = 997;
                                this.field517[this.field419] = var14.field1200;
                                ++this.field419;
                            }
                        }
                        if (var14.field1217 == 2 && this.field170 == 0 && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                            String var18 = var14.field1201;
                            if (var18.indexOf(" ") != -1) {
                                var18 = var18.substring(0, var18.indexOf(" "));
                            }
                            this.field332[this.field419] = var18 + " @gre@" + var14.field1205;
                            this.field518[this.field419] = 632;
                            this.field517[this.field419] = var14.field1200;
                            ++this.field419;
                        }
                        if (var14.field1217 == 3 && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                            this.field332[this.field419] = "Close";
                            if (arg5 == 3) {
                                this.field518[this.field419] = 736;
                            } else {
                                this.field518[this.field419] = 543;
                            }
                            this.field517[this.field419] = var14.field1200;
                            ++this.field419;
                        }
                        if (var14.field1217 == 4 && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                            this.field332[this.field419] = var14.field1197;
                            this.field518[this.field419] = 405;
                            this.field517[this.field419] = var14.field1200;
                            ++this.field419;
                        }
                        if (var14.field1217 == 5 && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                            this.field332[this.field419] = var14.field1197;
                            this.field518[this.field419] = 324;
                            this.field517[this.field419] = var14.field1200;
                            ++this.field419;
                        }
                        if (var14.field1217 == 6 && !this.field566 && arg4 >= var15 && arg6 >= var16 && arg4 < var14.field1250 + var15 && arg6 < var14.field1207 + var16) {
                            this.field332[this.field419] = var14.field1197;
                            this.field518[this.field419] = 22;
                            this.field517[this.field419] = var14.field1200;
                            ++this.field419;
                        }
                        if (var14.field1220 == 2) {
                            int var19 = 0;
                            for (int var20 = 0; var20 < var14.field1207; ++var20) {
                                for (int var21 = 0; var21 < var14.field1250; ++var21) {
                                    int var22 = (var14.field1186 + 32) * var21 + var15;
                                    int var23 = (var14.field1184 + 32) * var20 + var16;
                                    if (var19 < 20) {
                                        var22 += var14.field1239[var19];
                                        var23 += var14.field1190[var19];
                                    }
                                    if (arg4 >= var22 && arg6 >= var23 && arg4 < var22 + 32 && arg6 < var23 + 32) {
                                        this.field456 = var19;
                                        this.field457 = var14.field1200;
                                        if (var14.field1255[var19] > 0) {
                                            class54 var24 = class54.method447(var14.field1255[var19] - 1);
                                            if (this.field197 == 1 && var14.field1230) {
                                                if (this.field199 != var14.field1200 || this.field198 != var19) {
                                                    this.field332[this.field419] = "Use " + this.field201 + " with @lre@" + var24.field1419;
                                                    this.field518[this.field419] = 335;
                                                    this.field519[this.field419] = var24.field1405;
                                                    this.field516[this.field419] = var19;
                                                    this.field517[this.field419] = var14.field1200;
                                                    ++this.field419;
                                                }
                                            } else if (this.field170 == 1 && var14.field1230) {
                                                if ((this.field172 & 16) == 16) {
                                                    this.field332[this.field419] = this.field173 + " @lre@" + var24.field1419;
                                                    this.field518[this.field419] = 864;
                                                    this.field519[this.field419] = var24.field1405;
                                                    this.field516[this.field419] = var19;
                                                    this.field517[this.field419] = var14.field1200;
                                                    ++this.field419;
                                                }
                                            } else {
                                                if (var14.field1230) {
                                                    for (int var25 = 4; var25 >= 3; --var25) {
                                                        if (var24.field1401 != null && var24.field1401[var25] != null) {
                                                            this.field332[this.field419] = var24.field1401[var25] + " @lre@" + var24.field1419;
                                                            if (var25 == 3) {
                                                                this.field518[this.field419] = 394;
                                                            }
                                                            if (var25 == 4) {
                                                                this.field518[this.field419] = 913;
                                                            }
                                                            this.field519[this.field419] = var24.field1405;
                                                            this.field516[this.field419] = var19;
                                                            this.field517[this.field419] = var14.field1200;
                                                            ++this.field419;
                                                        } else if (var25 == 4) {
                                                            this.field332[this.field419] = "Drop @lre@" + var24.field1419;
                                                            this.field518[this.field419] = 913;
                                                            this.field519[this.field419] = var24.field1405;
                                                            this.field516[this.field419] = var19;
                                                            this.field517[this.field419] = var14.field1200;
                                                            ++this.field419;
                                                        }
                                                    }
                                                }
                                                if (var14.field1218) {
                                                    this.field332[this.field419] = "Use @lre@" + var24.field1419;
                                                    this.field518[this.field419] = 850;
                                                    this.field519[this.field419] = var24.field1405;
                                                    this.field516[this.field419] = var19;
                                                    this.field517[this.field419] = var14.field1200;
                                                    ++this.field419;
                                                }
                                                if (var14.field1230 && var24.field1401 != null) {
                                                    for (int var26 = 2; var26 >= 0; --var26) {
                                                        if (var24.field1401[var26] != null) {
                                                            this.field332[this.field419] = var24.field1401[var26] + " @lre@" + var24.field1419;
                                                            if (var26 == 0) {
                                                                this.field518[this.field419] = 446;
                                                            }
                                                            if (var26 == 1) {
                                                                this.field518[this.field419] = 286;
                                                            }
                                                            if (var26 == 2) {
                                                                this.field518[this.field419] = 210;
                                                            }
                                                            this.field519[this.field419] = var24.field1405;
                                                            this.field516[this.field419] = var19;
                                                            this.field517[this.field419] = var14.field1200;
                                                            ++this.field419;
                                                        }
                                                    }
                                                }
                                                if (var14.field1214 != null) {
                                                    for (int var27 = 4; var27 >= 0; --var27) {
                                                        if (var14.field1214[var27] != null) {
                                                            this.field332[this.field419] = var14.field1214[var27] + " @lre@" + var24.field1419;
                                                            if (var27 == 0) {
                                                                this.field518[this.field419] = 746;
                                                            }
                                                            if (var27 == 1) {
                                                                this.field518[this.field419] = 4;
                                                            }
                                                            if (var27 == 2) {
                                                                this.field518[this.field419] = 253;
                                                            }
                                                            if (var27 == 3) {
                                                                this.field518[this.field419] = 534;
                                                            }
                                                            if (var27 == 4) {
                                                                this.field518[this.field419] = 930;
                                                            }
                                                            this.field519[this.field419] = var24.field1405;
                                                            this.field516[this.field419] = var19;
                                                            this.field517[this.field419] = var14.field1200;
                                                            ++this.field419;
                                                        }
                                                    }
                                                }
                                                this.field332[this.field419] = "Examine @lre@" + var24.field1419;
                                                this.field518[this.field419] = 1217;
                                                this.field519[this.field419] = var24.field1405;
                                                this.field516[this.field419] = var19;
                                                this.field517[this.field419] = var14.field1200;
                                                ++this.field419;
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

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method47(byte arg0) {
        this.field176.method477(422);
        class39.field1117 = this.field415;
        this.field475.method198(-24669, 0, 0);
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.field188.method207(179);
        }
        if (this.field422 != -1) {
            this.method183(0, class44.method380(this.field422), (byte) 27, 0, 0);
        } else if (this.field220[this.field168] != -1) {
            this.method183(0, class44.method380(this.field220[this.field168]), (byte) 27, 0, 0);
        }
        if (this.field175 && this.field223 == 1) {
            this.method63(8);
        }
        this.field176.method478(205, 553, super.field1364, false);
        this.field178.method477(422);
        class39.field1117 = this.field416;
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method48(int arg0) {
        this.field403 = null;
        if (this.field369 != null) {
            this.field369.method320();
        }
        this.field369 = null;
        this.field549 = null;
        this.field550 = null;
        this.field546 = null;
        this.field547 = null;
        this.field548 = null;
        this.field532 = null;
        this.field533 = null;
        this.field534 = null;
        this.field194 = null;
        this.field196 = null;
        this.field572 = null;
        this.field280 = null;
        this.field498 = null;
        this.field499 = null;
        this.field474 = null;
        this.field283 = null;
        this.field144 = null;
        this.field492 = null;
        this.field284 = null;
        this.field285 = null;
        this.field158 = null;
        this.field159 = null;
        this.field160 = null;
        this.field161 = null;
        this.field162 = null;
        this.field176 = null;
        this.field177 = null;
        this.field178 = null;
        this.field179 = null;
        if (this.field480 != null) {
            this.field480.field991 = false;
        }
        this.field480 = null;
        this.field145 = null;
        this.field146 = null;
        this.field147 = null;
        this.field437 = null;
        this.field242 = null;
        this.field188 = null;
        this.field169 = null;
        this.field455 = null;
        this.field516 = null;
        int var2 = 93 / arg0;
        this.field517 = null;
        this.field518 = null;
        this.field519 = null;
        this.field332 = null;
        this.field509 = null;
        this.field510 = null;
        this.field511 = null;
        this.field512 = null;
        this.field513 = null;
        this.field139 = null;
        this.field605 = null;
        this.field207 = null;
        this.field373 = null;
        this.field281 = null;
        this.field193 = null;
        this.field319 = null;
        try {
            if (this.field503 != null) {
                this.field503.method187();
            }
        } catch (Exception var3) {
        }
        this.field503 = null;
        this.field191 = null;
        this.field235 = null;
        this.field293 = null;
        this.field294 = null;
        this.field295 = null;
        this.field296 = null;
        this.field297 = null;
        this.field482 = null;
        this.field551 = null;
        this.field552 = null;
        this.field553 = null;
        this.field554 = null;
        this.field351 = null;
        this.field352 = null;
        this.field353 = null;
        this.field354 = null;
        this.field355 = null;
        this.field475 = null;
        this.field476 = null;
        this.field477 = null;
        this.field260 = null;
        this.field261 = null;
        this.field233 = null;
        this.method177((byte) 6);
        this.field341 = null;
        this.field343 = null;
        this.field345 = null;
        this.field346 = null;
        this.field601 = null;
        this.field154 = null;
        this.field155 = null;
        this.field156 = null;
        this.field157 = null;
        this.field230 = null;
        this.field192 = null;
        this.field202 = null;
        this.field472 = null;
        this.field562 = null;
        this.field321 = null;
        this.field460 = null;
        this.field265 = null;
        this.field301 = null;
        this.field597 = null;
        this.field471 = null;
        this.field451 = null;
        this.method156((byte) -112);
        class1.method8(false);
        class67.method508(false);
        class54.method457(false);
        class44.method384(false);
        class46.field1262 = null;
        class43.field1172 = null;
        class32.field1003 = null;
        class55.field1444 = null;
        class47.field1276 = null;
        class47.field1288 = null;
        class20.field838 = null;
        super.field1365 = null;
        class66.field1570 = null;
        class39.method349(false);
        class68.method515(false);
        class18.method263(false);
        class33.method335(false);
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILZATRZGAA;III)V")
    public final void method49(int arg0, class66 arg1, int arg2, int arg3, int arg4) {
        if (field612 != arg1) {
            if (this.field419 < 400) {
                String var6;
                if (arg1.field1566 == 0) {
                    var6 = arg1.field1587 + method57(field612.field1574, arg1.field1574, true) + " (level-" + arg1.field1574 + ")";
                } else {
                    var6 = arg1.field1587 + " (skill-" + arg1.field1566 + ")";
                }
                if (this.field197 == 1) {
                    this.field332[this.field419] = "Use " + this.field201 + " with @whi@" + var6;
                    this.field518[this.field419] = 244;
                    this.field519[this.field419] = arg0;
                    this.field516[this.field419] = arg2;
                    this.field517[this.field419] = arg4;
                    ++this.field419;
                } else if (this.field170 == 1) {
                    if ((this.field172 & 8) == 8) {
                        this.field332[this.field419] = this.field173 + " @whi@" + var6;
                        this.field518[this.field419] = 461;
                        this.field519[this.field419] = arg0;
                        this.field516[this.field419] = arg2;
                        this.field517[this.field419] = arg4;
                        ++this.field419;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field212[var7] != null) {
                            this.field332[this.field419] = this.field212[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field212[var7].equalsIgnoreCase("attack")) {
                                if (arg1.field1574 > field612.field1574) {
                                    var9 = 2000;
                                }
                                if (field612.field1567 != 0 && arg1.field1567 != 0) {
                                    if (field612.field1567 == arg1.field1567) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field213[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field518[this.field419] = var9 + 70;
                            }
                            if (var7 == 1) {
                                this.field518[this.field419] = var9 + 136;
                            }
                            if (var7 == 2) {
                                this.field518[this.field419] = var9 + 367;
                            }
                            if (var7 == 3) {
                                this.field518[this.field419] = var9 + 321;
                            }
                            if (var7 == 4) {
                                this.field518[this.field419] = var9 + 974;
                            }
                            this.field519[this.field419] = arg0;
                            this.field516[this.field419] = arg2;
                            this.field517[this.field419] = arg4;
                            ++this.field419;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field419; ++var8) {
                    if (this.field518[var8] == 269) {
                        this.field332[var8] = "Walk here @whi@" + var6;
                        break;
                    }
                }
                this.field487 += arg3;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILQXTIWHBH;IIIII)V")
    public final void method50(int arg0, int arg1, int arg2, class44 arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field528) {
            this.field167 = 32;
        } else {
            this.field167 = 0;
        }
        this.field528 = false;
        if (arg0 != -7270) {
            field393 = !field393;
        }
        if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg5 && arg1 < arg5 + 16) {
            arg3.field1196 -= this.field481 * 4;
            if (arg8 == 1) {
                this.field348 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field275 = true;
            }
        } else if (arg4 >= arg6 && arg4 < arg6 + 16 && arg1 >= arg5 + arg7 - 16 && arg1 < arg5 + arg7) {
            arg3.field1196 += this.field481 * 4;
            if (arg8 == 1) {
                this.field348 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field275 = true;
            }
        } else if (arg4 >= arg6 - this.field167 && arg4 < arg6 + 16 + this.field167 && arg1 >= arg5 + 16 && arg1 < arg5 + arg7 - 16 && this.field481 > 0) {
            int var10 = (arg7 - 32) * arg7 / arg2;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg1 - arg5 - 16 - var10 / 2;
            int var12 = arg7 - 32 - var10;
            arg3.field1196 = (arg2 - arg7) * var11 / var12;
            if (arg8 == 1) {
                this.field348 = true;
            }
            if (arg8 == 2 || arg8 == 3) {
                this.field275 = true;
            }
            this.field528 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILEMWAMCXW;I)V")
    private final void method51(int arg0, class14 arg1, int arg2) {
        if (arg2 >= 0) {
            this.field504 = -448;
        }
        for (int var4 = 0; var4 < this.field344; ++var4) {
            int var5 = this.field345[var4];
            class66 var6 = this.field341[var5];
            int var7 = arg1.method217();
            if ((var7 & 4) != 0) {
                var7 += arg1.method217() << 8;
            }
            this.method41(var5, (byte) 71, var6, var7, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method52(boolean arg0) {
        if (!this.field462 && !this.field559 && !this.field452) {
            ++field257;
            this.field466 &= arg0;
            if (!this.field466) {
                this.method64(false);
            } else {
                this.method133(-42550);
            }
            this.method56((byte) 7);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method53(byte arg0) {
        short var2 = 256;
        if (this.field556 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field556 > 768) {
                    this.field247[var3] = this.method131(this.field249[var3], 0, this.field248[var3], 1024 - this.field556);
                } else if (this.field556 > 256) {
                    this.field247[var3] = this.field249[var3];
                } else {
                    this.field247[var3] = this.method131(this.field248[var3], 0, this.field249[var3], 256 - this.field556);
                }
            }
        } else if (this.field557 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field557 > 768) {
                    this.field247[var4] = this.method131(this.field250[var4], 0, this.field248[var4], 1024 - this.field557);
                } else if (this.field557 > 256) {
                    this.field247[var4] = this.field250[var4];
                } else {
                    this.field247[var4] = this.method131(this.field248[var4], 0, this.field250[var4], 256 - this.field557);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field247[var5] = this.field248[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field549.field1498[var6] = this.field152.field1345[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var24 = (var2 - var9) * this.field302[var9] / var2;
            int var25 = var24 + 22;
            if (var25 < 0) {
                var25 = 0;
            }
            var7 += var25;
            for (int var26 = var25; var26 < 128; ++var26) {
                int var27 = this.field567[var7++];
                if (var27 != 0) {
                    int var29 = 256 - var27;
                    int var30 = this.field247[var27];
                    int var31 = this.field549.field1498[var8];
                    this.field549.field1498[var8++] = ((var30 & 16711935) * var27 + (var31 & 16711935) * var29 & -16711936) + ((var30 & 65280) * var27 + (var31 & 65280) * var29 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var25;
        }
        this.field549.method478(0, 0, super.field1364, false);
        if (arg0 == 0) {
            boolean var10 = false;
        } else {
            field300 = this.field243.method496();
        }
        for (int var11 = 0; var11 < 33920; ++var11) {
            this.field550.field1498[var11] = this.field153.field1345[var11];
        }
        int var12 = 0;
        int var13 = 1176;
        for (int var14 = 1; var14 < var2 - 1; ++var14) {
            int var15 = (var2 - var14) * this.field302[var14] / var2;
            int var16 = 103 - var15;
            int var17 = var13 + var15;
            for (int var18 = 0; var18 < var16; ++var18) {
                int var19 = this.field567[var12++];
                if (var19 != 0) {
                    int var21 = 256 - var19;
                    int var22 = this.field247[var19];
                    int var23 = this.field550.field1498[var17];
                    this.field550.field1498[var17++] = ((var22 & 16711935) * var19 + (var23 & 16711935) * var21 & -16711936) + ((var22 & 65280) * var19 + (var23 & 65280) * var21 & 16711680) >> 8;
                } else {
                    ++var17;
                }
            }
            var12 += 128 - var16;
            var13 = 128 - var16 - var15 + var17;
        }
        this.field550.method478(0, 637, super.field1364, false);
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method54(int arg0) {
        class58 var2 = (class58) this.field139.method470();
        if (arg0 != -44999) {
            this.field266 = 192;
        }
        while (var2 != null) {
            if (this.field596 == var2.field1472 && field257 <= var2.field1474) {
                if (field257 >= var2.field1473) {
                    if (var2.field1477 > 0) {
                        class45 var3 = this.field194[var2.field1477 - 1];
                        if (var3 != null && var3.field1059 >= 0 && var3.field1059 < 13312 && var3.field1060 >= 0 && var3.field1060 < 13312) {
                            var2.method476(var3.field1060, var3.field1059, field257, -458, this.method114(var2.field1472, var3.field1059, 1, var3.field1060) - var2.field1481);
                        }
                    }
                    if (var2.field1477 < 0) {
                        int var4 = -var2.field1477 - 1;
                        class66 var5;
                        if (this.field222 == var4) {
                            var5 = field612;
                        } else {
                            var5 = this.field341[var4];
                        }
                        if (var5 != null && var5.field1059 >= 0 && var5.field1059 < 13312 && var5.field1060 >= 0 && var5.field1060 < 13312) {
                            var2.method476(var5.field1060, var5.field1059, field257, -458, this.method114(var2.field1472, var5.field1059, 1, var5.field1060) - var2.field1481);
                        }
                    }
                    var2.method475(this.field356, this.field619);
                    this.field202.method527(var2.field1482, var2, this.field596, (int) var2.field1494, (int) var2.field1492, (int) var2.field1493, -1, 60, false, 0);
                }
            } else {
                var2.method338();
            }
            var2 = (class58) this.field139.method472(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method55(int arg0, int arg1) {
        if (arg0 < this.field555 || arg0 > this.field555) {
            this.field189 = !this.field189;
        }
        if (!field271) {
            for (int var3 = 0; var3 < this.field507.length; ++var3) {
                int var4 = this.field507[var3];
                if (class39.field1125[var4] >= arg1) {
                    class8 var5 = class39.field1119[var4];
                    int var6 = var5.field648 * var5.field647 - 1;
                    int var7 = this.field356 * var5.field647 * 2;
                    byte[] var8 = var5.field645;
                    byte[] var9 = this.field562;
                    for (int var10 = 0; var10 <= var6; ++var10) {
                        var9[var10] = var8[var10 - var7 & var6];
                    }
                    var5.field645 = var9;
                    this.field562 = var8;
                    class39.method356(var4, 666);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method56(byte arg0) {
        if (arg0 == 7) {
            boolean var2 = false;
        } else {
            this.field488 = -1;
        }
        while (true) {
            class35 var3 = this.field369.method312();
            if (var3 == null) {
                return;
            }
            if (var3.field1030 == 0) {
                class18.method265(var3.field1031, 24493, var3.field1028);
                if ((this.field369.method322(var3.field1028, field371) & 98) != 0) {
                    this.field348 = true;
                    if (this.field234 != -1 || this.field529 != -1) {
                        this.field275 = true;
                    }
                }
            }
            if (var3.field1030 == 1 && var3.field1031 != null) {
                class33.method334(var3.field1031, 0);
            }
            if (var3.field1030 == 2 && this.field464 == var3.field1028 && var3.field1031 != null) {
                this.method70(this.field465, var3.field1031, -790);
            }
            if (var3.field1030 == 3 && this.field411 == 1) {
                for (int var4 = 0; var4 < this.field144.length; ++var4) {
                    if (this.field284[var4] == var3.field1028) {
                        this.field144[var4] = var3.field1031;
                        if (var3.field1031 == null) {
                            this.field284[var4] = -1;
                        }
                        break;
                    }
                    if (this.field285[var4] == var3.field1028) {
                        this.field492[var4] = var3.field1031;
                        if (var3.field1031 == null) {
                            this.field285[var4] = -1;
                        }
                        break;
                    }
                }
            }
            if (var3.field1030 == 93 && this.field369.method318(var3.field1028, (byte) 106)) {
                class48.method406(new class14(var3.field1031, true), this.field410, this.field369);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIZ)Ljava/lang/String;")
    public static final String method57(int arg0, int arg1, boolean arg2) {
        if (!arg2) {
            field426 = !field426;
        }
        int var3 = arg0 - arg1;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILEMWAMCXW;)V")
    private final void method58(int arg0, int arg1, class14 arg2) {
        if (arg0 < 1 || arg0 > 1) {
            this.method81();
        }
        while (arg2.field708 + 10 < arg1 * 8) {
            int var4 = arg2.method228(11, 4);
            if (var4 == 2047) {
                break;
            }
            if (this.field341[var4] == null) {
                this.field341[var4] = new class66();
                if (this.field346[var4] != null) {
                    this.field341[var4].method505(this.field346[var4], 5696);
                }
            }
            this.field343[this.field342++] = var4;
            class66 var5 = this.field341[var4];
            var5.field1058 = field257;
            int var6 = arg2.method228(5, 4);
            if (var6 > 15) {
                var6 -= 32;
            }
            int var7 = arg2.method228(5, 4);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg2.method228(1, 4);
            int var9 = arg2.method228(1, 4);
            if (var9 == 1) {
                this.field345[this.field344++] = var4;
            }
            var5.method339(field612.field1035[0] + var6, var8 == 1, this.field324, field612.field1034[0] + var7);
        }
        arg2.method229((byte) 92);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLEMWAMCXW;I)V")
    private final void method59(byte arg0, class14 arg1, int arg2) {
        if (arg0 != -72) {
            this.field488 = -1;
        }
        for (int var4 = 0; var4 < this.field344; ++var4) {
            int var5 = this.field345[var4];
            class45 var6 = this.field194[var5];
            int var7 = arg1.method217();
            if ((var7 & 4) != 0) {
                var6.field1075 = arg1.method224();
                var6.field1054 = 100;
            }
            if ((var7 & 32) != 0) {
                var6.field1088 = arg1.method245(-485);
                var6.field1089 = arg1.method245(-485);
            }
            if ((var7 & 8) != 0) {
                var6.field1042 = arg1.method246(633);
                int var8 = arg1.method222();
                var6.field1046 = var8 >> 16;
                var6.field1045 = (var8 & 65535) + field257;
                var6.field1043 = 0;
                var6.field1044 = 0;
                if (var6.field1045 > field257) {
                    var6.field1043 = -1;
                }
                if (var6.field1042 == 65535) {
                    var6.field1042 = -1;
                }
            }
            if ((var7 & 1) != 0) {
                var6.field1259 = class67.method509(arg1.method246(633));
                var6.field1070 = var6.field1259.field1625;
                var6.field1052 = var6.field1259.field1619;
                var6.field1036 = var6.field1259.field1630;
                var6.field1037 = var6.field1259.field1626;
                var6.field1038 = var6.field1259.field1612;
                var6.field1039 = var6.field1259.field1629;
                var6.field1040 = var6.field1259.field1592;
            }
            if ((var7 & 64) != 0) {
                var6.field1063 = arg1.method245(-485);
                if (var6.field1063 == 65535) {
                    var6.field1063 = -1;
                }
            }
            if ((var7 & 128) != 0) {
                int var9 = arg1.method236(29396);
                int var10 = arg1.method236(29396);
                var6.method340(var9, var10, -795, field257);
                var6.field1047 = field257 + 300;
                var6.field1048 = arg1.method236(29396);
                var6.field1049 = arg1.method238((byte) 93);
            }
            if ((var7 & 2) != 0) {
                int var11 = arg1.method219();
                if (var11 == 65535) {
                    var11 = -1;
                }
                int var12 = arg1.method236(29396);
                if (var6.field1064 == var11 && var11 != -1) {
                    int var13 = class55.field1444[var11].field1458;
                    if (var13 == 1) {
                        var6.field1065 = 0;
                        var6.field1066 = 0;
                        var6.field1067 = var12;
                        var6.field1068 = 0;
                    }
                    if (var13 == 2) {
                        var6.field1068 = 0;
                    }
                } else if (var11 == -1 || var6.field1064 == -1 || class55.field1444[var11].field1452 >= class55.field1444[var6.field1064].field1452) {
                    var6.field1064 = var11;
                    var6.field1065 = 0;
                    var6.field1066 = 0;
                    var6.field1067 = var12;
                    var6.field1068 = 0;
                    var6.field1050 = var6.field1069;
                }
            }
            if ((var7 & 16) != 0) {
                int var14 = arg1.method237(true);
                int var15 = arg1.method237(true);
                var6.method340(var14, var15, -795, field257);
                var6.field1047 = field257 + 300;
                var6.field1048 = arg1.method236(29396);
                var6.field1049 = arg1.method236(29396);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI[B)Z")
    public final boolean method60(byte arg0, int arg1, byte[] arg2) {
        if (arg0 != 115) {
            throw new NullPointerException();
        } else {
            return arg2 == null ? true : signlink.wavesave(arg2, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method61(int arg0, int arg1) {
        class44 var3 = class44.method380(arg0);
        for (int var4 = 0; var4 < var3.field1245.length && var3.field1245[var4] != -1; ++var4) {
            class44 var5 = class44.method380(var3.field1245[var4]);
            if (var5.field1220 == 1) {
                this.method61(var5.field1200, -22137);
            }
            var5.field1194 = 0;
            var5.field1242 = 0;
        }
        if (arg1 != -22137) {
            this.field437 = null;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method62(int arg0) {
        if (arg0 <= 0) {
            field371 = this.field243.method496();
        }
        if (this.field291 == 0) {
            if (super.field1378 == 1) {
                int var2 = super.field1379 - 25 - 550;
                int var3 = super.field1380 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field396 + this.field287 & 2047;
                    int var5 = class39.field1115[var4];
                    int var6 = class39.field1116[var4];
                    int var7 = (this.field276 + 256) * var5 >> 8;
                    int var8 = (this.field276 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field612.field1059 + var9 >> 7;
                    int var12 = field612.field1060 - var10 >> 7;
                    boolean var13 = this.method110(true, 1, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var11, var12, (byte) 78);
                    if (var13) {
                        this.field188.method207(var2);
                        this.field188.method207(var3);
                        this.field188.method208(this.field396);
                        this.field188.method207(57);
                        this.field188.method207(this.field287);
                        this.field188.method207(this.field276);
                        this.field188.method207(89);
                        this.field188.method208(field612.field1059);
                        this.field188.method208(field612.field1060);
                        this.field188.method207(this.field420);
                        this.field188.method207(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method63(int arg0) {
        int var2 = this.field224;
        int var3 = this.field225;
        int var4 = this.field226;
        int var5 = this.field227;
        int var6 = 6116423;
        class2.method17(var2, var3, this.field463, var6, var4, var5);
        if (arg0 < 8 || arg0 > 8) {
            this.field488 = -1;
        }
        class2.method17(var2 + 1, var3 + 1, this.field463, 0, var4 - 2, 16);
        class2.method18(0, var2 + 1, var4 - 2, 0, var5 - 19, var3 + 18);
        this.field150.method485("Choose Option", false, var2 + 3, var6, var3 + 14);
        int var7 = super.field1372;
        int var8 = super.field1373;
        if (this.field223 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field223 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field223 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field419; ++var9) {
            int var10 = (this.field419 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field150.method489(true, var2 + 3, var11, var10, -877, this.field332[var9]);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method64(boolean arg0) {
        if (arg0) {
            field580 = -7;
        }
        if (this.field384 == 0) {
            int var2 = super.field1362 / 2 - 80;
            int var3 = super.field1363 / 2 + 20;
            int var14 = var3 + 20;
            if (super.field1378 == 1 && super.field1379 >= var2 - 75 && super.field1379 <= var2 + 75 && super.field1380 >= var14 - 20 && super.field1380 <= var14 + 20) {
                this.field384 = 3;
                this.field607 = 0;
            }
            int var4 = super.field1362 / 2 + 80;
            if (super.field1378 == 1 && super.field1379 >= var4 - 75 && super.field1379 <= var4 + 75 && super.field1380 >= var14 - 20 && super.field1380 <= var14 + 20) {
                this.field617 = "";
                this.field618 = "Enter your username & password.";
                this.field384 = 2;
                this.field607 = 0;
            }
        } else if (this.field384 == 2) {
            int var5 = super.field1363 / 2 - 40;
            int var15 = var5 + 30;
            int var16 = var15 + 25;
            if (super.field1378 == 1 && super.field1380 >= var16 - 15 && super.field1380 < var16) {
                this.field607 = 0;
            }
            var5 = var16 + 15;
            if (super.field1378 == 1 && super.field1380 >= var5 - 15 && super.field1380 < var5) {
                this.field607 = 1;
            }
            var5 += 15;
            int var6 = super.field1362 / 2 - 80;
            int var7 = super.field1363 / 2 + 50;
            int var17 = var7 + 20;
            if (super.field1378 == 1 && super.field1379 >= var6 - 75 && super.field1379 <= var6 + 75 && super.field1380 >= var17 - 20 && super.field1380 <= var17 + 20) {
                this.field444 = 0;
                this.method73(this.field478, this.field479, false);
                if (this.field466) {
                    return;
                }
            }
            int var8 = super.field1362 / 2 + 80;
            if (super.field1378 == 1 && super.field1379 >= var8 - 75 && super.field1379 <= var8 + 75 && super.field1380 >= var17 - 20 && super.field1380 <= var17 + 20) {
                this.field384 = 0;
                this.field478 = "";
                this.field479 = "";
            }
            while (true) {
                while (true) {
                    int var9 = this.method436(4);
                    if (var9 == -1) {
                        return;
                    }
                    boolean var10 = false;
                    for (int var11 = 0; var11 < field349.length(); ++var11) {
                        if (var9 == field349.charAt(var11)) {
                            var10 = true;
                            break;
                        }
                    }
                    if (this.field607 == 0) {
                        if (var9 == 8 && this.field478.length() > 0) {
                            this.field478 = this.field478.substring(0, this.field478.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field607 = 1;
                        }
                        if (var10) {
                            this.field478 = this.field478 + (char) var9;
                        }
                        if (this.field478.length() > 12) {
                            this.field478 = this.field478.substring(0, 12);
                        }
                    } else if (this.field607 == 1) {
                        if (var9 == 8 && this.field479.length() > 0) {
                            this.field479 = this.field479.substring(0, this.field479.length() - 1);
                        }
                        if (var9 == 9 || var9 == 10 || var9 == 13) {
                            this.field607 = 0;
                        }
                        if (var10) {
                            this.field479 = this.field479 + (char) var9;
                        }
                        if (this.field479.length() > 20) {
                            this.field479 = this.field479.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field384 == 3) {
                int var12 = super.field1362 / 2;
                int var13 = super.field1363 / 2 + 50;
                int var18 = var13 + 20;
                if (super.field1378 == 1 && super.field1379 >= var12 - 75 && super.field1379 <= var12 + 75 && super.field1380 >= var18 - 20 && super.field1380 <= var18 + 20) {
                    this.field384 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILZLQCXMFK;III)V")
    public final void method65(int arg0, class67 arg1, int arg2, int arg3, int arg4) {
        int var6 = 98 / arg2;
        if (this.field419 < 400) {
            if (arg1.field1628 != null) {
                arg1 = arg1.method510(116);
            }
            if (arg1 != null) {
                if (arg1.field1610) {
                    String var7 = arg1.field1593;
                    if (arg1.field1631 != 0) {
                        var7 = var7 + method57(field612.field1574, arg1.field1631, true) + " (level-" + arg1.field1631 + ")";
                    }
                    if (this.field197 == 1) {
                        this.field332[this.field419] = "Use " + this.field201 + " with @yel@" + var7;
                        this.field518[this.field419] = 10;
                        this.field519[this.field419] = arg3;
                        this.field516[this.field419] = arg0;
                        this.field517[this.field419] = arg4;
                        ++this.field419;
                    } else {
                        if (this.field170 == 1) {
                            if ((this.field172 & 2) == 2) {
                                this.field332[this.field419] = this.field173 + " @yel@" + var7;
                                this.field518[this.field419] = 209;
                                this.field519[this.field419] = arg3;
                                this.field516[this.field419] = arg0;
                                this.field517[this.field419] = arg4;
                                ++this.field419;
                                return;
                            }
                        } else {
                            if (arg1.field1618 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg1.field1618[var8] != null && !arg1.field1618[var8].equalsIgnoreCase("attack")) {
                                        this.field332[this.field419] = arg1.field1618[var8] + " @yel@" + var7;
                                        if (var8 == 0) {
                                            this.field518[this.field419] = 88;
                                        }
                                        if (var8 == 1) {
                                            this.field518[this.field419] = 320;
                                        }
                                        if (var8 == 2) {
                                            this.field518[this.field419] = 608;
                                        }
                                        if (var8 == 3) {
                                            this.field518[this.field419] = 169;
                                        }
                                        if (var8 == 4) {
                                            this.field518[this.field419] = 189;
                                        }
                                        this.field519[this.field419] = arg3;
                                        this.field516[this.field419] = arg0;
                                        this.field517[this.field419] = arg4;
                                        ++this.field419;
                                    }
                                }
                            }
                            if (arg1.field1618 != null) {
                                for (int var9 = 4; var9 >= 0; --var9) {
                                    if (arg1.field1618[var9] != null && arg1.field1618[var9].equalsIgnoreCase("attack")) {
                                        short var10 = 0;
                                        if (arg1.field1631 > field612.field1574) {
                                            var10 = 2000;
                                        }
                                        this.field332[this.field419] = arg1.field1618[var9] + " @yel@" + var7;
                                        if (var9 == 0) {
                                            this.field518[this.field419] = var10 + 88;
                                        }
                                        if (var9 == 1) {
                                            this.field518[this.field419] = var10 + 320;
                                        }
                                        if (var9 == 2) {
                                            this.field518[this.field419] = var10 + 608;
                                        }
                                        if (var9 == 3) {
                                            this.field518[this.field419] = var10 + 169;
                                        }
                                        if (var9 == 4) {
                                            this.field518[this.field419] = var10 + 189;
                                        }
                                        this.field519[this.field419] = arg3;
                                        this.field516[this.field419] = arg0;
                                        this.field517[this.field419] = arg4;
                                        ++this.field419;
                                    }
                                }
                            }
                            this.field332[this.field419] = "Examine @yel@" + var7;
                            this.field518[this.field419] = 1199;
                            this.field519[this.field419] = arg3;
                            this.field516[this.field419] = arg0;
                            this.field517[this.field419] = arg4;
                            ++this.field419;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)Ljava/lang/String;")
    private static final String method66(int arg0, int arg1) {
        String var2 = String.valueOf(arg0);
        if (arg1 >= 2 && arg1 <= 2) {
            for (int var3 = var2.length() - 3; var3 > 0; var3 -= 3) {
                var2 = var2.substring(0, var3) + "," + var2.substring(var3);
            }
            if (var2.length() > 8) {
                var2 = "@gre@" + var2.substring(0, var2.length() - 8) + " million @whi@(" + var2 + ")";
            } else if (var2.length() > 4) {
                var2 = "@cya@" + var2.substring(0, var2.length() - 4) + "K @whi@(" + var2 + ")";
            }
            return " " + var2;
        } else {
            throw new NullPointerException();
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method67(int arg0) {
        if (arg0 != 0) {
            field526 = !field526;
        }
        short var2 = 256;
        for (int var3 = 10; var3 < 117; ++var3) {
            int var18 = (int) (Math.random() * 100.0D);
            if (var18 < 50) {
                this.field567[(var2 - 2 << 7) + var3] = 255;
            }
        }
        for (int var4 = 0; var4 < 100; ++var4) {
            int var15 = (int) (Math.random() * 124.0D) + 2;
            int var16 = (int) (Math.random() * 128.0D) + 128;
            int var17 = (var16 << 7) + var15;
            this.field567[var17] = 192;
        }
        for (int var5 = 1; var5 < var2 - 1; ++var5) {
            for (int var13 = 1; var13 < 127; ++var13) {
                int var14 = (var5 << 7) + var13;
                this.field568[var14] = (this.field567[var14 - 1] + this.field567[var14 + 1] + this.field567[var14 - 128] + this.field567[var14 + 128]) / 4;
            }
        }
        this.field211 += 128;
        if (this.field211 > this.field412.length) {
            this.field211 -= this.field412.length;
            int var6 = (int) (Math.random() * 12.0D);
            this.method166(-55, this.field623[var6]);
        }
        for (int var7 = 1; var7 < var2 - 1; ++var7) {
            for (int var10 = 1; var10 < 127; ++var10) {
                int var11 = (var7 << 7) + var10;
                int var12 = this.field568[var11 + 128] - this.field412[this.field211 + var11 & this.field412.length - 1] / 5;
                if (var12 < 0) {
                    var12 = 0;
                }
                this.field567[var11] = var12;
            }
        }
        for (int var8 = 0; var8 < var2 - 1; ++var8) {
            this.field302[var8] = this.field302[var8 + 1];
        }
        this.field302[var2 - 1] = (int) (Math.sin((double) field257 / 14.0D) * 16.0D + Math.sin((double) field257 / 15.0D) * 14.0D + Math.sin((double) field257 / 16.0D) * 12.0D);
        if (this.field556 > 0) {
            this.field556 -= 4;
        }
        if (this.field557 > 0) {
            this.field557 -= 4;
        }
        if (this.field556 == 0 && this.field557 == 0) {
            int var9 = (int) (Math.random() * 2000.0D);
            if (var9 == 0) {
                this.field556 = 1024;
            }
            if (var9 == 1) {
                this.field557 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method68(int arg0) {
        for (int var2 = 0; var2 < this.field374; ++var2) {
            if (this.field208[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field382[var2] == this.field467 && this.field524[var2] == this.field165) {
                        if (!this.method101(-44059)) {
                            var3 = true;
                        }
                    } else {
                        class14 var4 = class28.method326(this.field382[var2], this.field524[var2], (byte) -65);
                        if (System.currentTimeMillis() + (long) (var4.field707 / 22) > (long) (this.field264 / 22) + this.field286) {
                            this.field264 = var4.field707;
                            this.field286 = System.currentTimeMillis();
                            if (this.method60((byte) 115, var4.field707, var4.field706)) {
                                this.field467 = this.field382[var2];
                                this.field165 = this.field524[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field188.method206(215, 533);
                        this.field188.method208(this.field382[var2] & 32767);
                    } else {
                        this.field188.method206(215, 533);
                        this.field188.method208(-1);
                    }
                }
                if (var3 && this.field208[var2] != -5) {
                    this.field208[var2] = -5;
                } else {
                    --this.field374;
                    for (int var6 = var2; var6 < this.field374; ++var6) {
                        this.field382[var6] = this.field382[var6 + 1];
                        this.field524[var6] = this.field524[var6 + 1];
                        this.field208[var6] = this.field208[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field208[var2]--;
            }
        }
        while (arg0 >= 0) {
            this.field380 = 168;
        }
        if (this.field418 > 0) {
            this.field418 -= 20;
            if (this.field418 < 0) {
                this.field418 = 0;
            }
            if (this.field418 == 0 && this.field256 && !field271) {
                this.field464 = this.field278;
                this.field465 = true;
                this.field369.method321(2, this.field464);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method69(int arg0, int arg1) {
        int var3 = class20.field838[arg1].field846;
        while (arg0 >= 0) {
            this.field140 = 410;
        }
        if (var3 != 0) {
            int var4 = this.field319[arg1];
            if (var3 == 1) {
                if (var4 == 1) {
                    class39.method358(4, 0.9D);
                }
                if (var4 == 2) {
                    class39.method358(4, 0.8D);
                }
                if (var4 == 3) {
                    class39.method358(4, 0.7D);
                }
                if (var4 == 4) {
                    class39.method358(4, 0.6D);
                }
                class54.field1406.method27();
                this.field587 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field256;
                if (var4 == 0) {
                    this.method132(0, this.field256, -34172);
                    this.field256 = true;
                }
                if (var4 == 1) {
                    this.method132(-400, this.field256, -34172);
                    this.field256 = true;
                }
                if (var4 == 2) {
                    this.method132(-800, this.field256, -34172);
                    this.field256 = true;
                }
                if (var4 == 3) {
                    this.method132(-1200, this.field256, -34172);
                    this.field256 = true;
                }
                if (var4 == 4) {
                    this.field256 = false;
                }
                if (this.field256 != var5 && !field271) {
                    if (this.field256) {
                        this.field464 = this.field278;
                        this.field465 = true;
                        this.field369.method321(2, this.field464);
                    } else {
                        this.method177((byte) 6);
                    }
                    this.field418 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field563 = true;
                    this.method179(0, 0);
                }
                if (var4 == 1) {
                    this.field563 = true;
                    this.method179(-400, 0);
                }
                if (var4 == 2) {
                    this.field563 = true;
                    this.method179(-800, 0);
                }
                if (var4 == 3) {
                    this.field563 = true;
                    this.method179(-1200, 0);
                }
                if (var4 == 4) {
                    this.field563 = false;
                }
            }
            if (var3 == 5) {
                this.field506 = var4;
            }
            if (var3 == 6) {
                this.field253 = var4;
            }
            if (var3 == 8) {
                this.field221 = var4;
                this.field275 = true;
            }
            if (var3 == 9) {
                this.field320 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Z[BI)V")
    public final void method70(boolean arg0, byte[] arg1, int arg2) {
        if (this.field256) {
            signlink.midifade = arg0 ? 1 : 0;
            signlink.midisave(arg1, arg1.length);
            if (arg2 >= 0) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLjava/lang/String;)V")
    public final void method71(byte arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            if (arg0 != -42) {
                this.field182 = -104;
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
                    this.field215 = 0;
                    label51: for (int var9 = 0; var9 < class54.field1439; ++var9) {
                        class54 var10 = class54.method447(var9);
                        if (var10.field1431 == -1 && var10.field1419 != null) {
                            String var11 = var10.field1419.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label51;
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

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method72(int arg0) {
        for (int var2 = -1; var2 < this.field342; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field340;
            } else {
                var3 = this.field343[var2];
            }
            class66 var4 = this.field341[var3];
            if (var4 != null) {
                this.method144(var4, (byte) 9, 1);
            }
        }
        if (arg0 >= 0) {
            this.field488 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method73(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field617 = "";
                this.field618 = "Connecting to server...";
                this.method158(0, true);
            }
            this.field503 = new class7(this.method100(field269 + 43594), this, this.field322);
            long var4 = class56.method461(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field188.field707 = 0;
            this.field188.method207(14);
            this.field188.method207(var6);
            this.field503.method191(this.field188.field706, this.field406, 0, 2);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field503.method188();
            }
            int var8 = this.field503.method188();
            int var9 = var8;
            if (var8 == 0) {
                this.field503.method190(this.field455.field706, 0, 8);
                this.field455.field707 = 0;
                this.field541 = this.field455.method223(3);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field541 >> 32), (int) this.field541 };
                this.field188.field707 = 0;
                this.field188.method207(10);
                this.field188.method211(var10[0]);
                this.field188.method211(var10[1]);
                this.field188.method211(var10[2]);
                this.field188.method211(var10[3]);
                this.field188.method211(signlink.uid);
                this.field188.method214(arg0);
                this.field188.method214(arg1);
                this.field188.method232(false, field523, field273);
                this.field169.field707 = 0;
                if (arg2) {
                    this.field169.method207(18);
                } else {
                    this.field169.method207(16);
                }
                this.field169.method207(this.field188.field707 + 36 + 1 + 1 + 2);
                this.field169.method207(255);
                this.field169.method208(364);
                this.field169.method207(field271 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field169.method211(this.field141[var11]);
                }
                this.field169.method215(this.field188.field706, (byte) -18, this.field188.field707, 0);
                this.field188.field711 = new class63(true, var10);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field243 = new class63(true, var10);
                this.field503.method191(this.field169.field706, this.field406, 0, this.field169.field707);
                var8 = this.field503.method188();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method73(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field424 = this.field503.method188();
                field367 = this.field503.method188() == 1;
                this.field305 = 0L;
                this.field336 = 0;
                this.field480.field987 = 0;
                super.field1369 = true;
                this.field329 = true;
                this.field466 = true;
                this.field188.field707 = 0;
                this.field455.field707 = 0;
                this.field488 = -1;
                this.field574 = -1;
                this.field575 = -1;
                this.field576 = -1;
                this.field487 = 0;
                this.field489 = 0;
                this.field486 = 0;
                this.field491 = 0;
                this.field231 = 0;
                this.field419 = 0;
                this.field175 = false;
                super.field1370 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field545[var13] = null;
                }
                this.field197 = 0;
                this.field170 = 0;
                this.field411 = 0;
                this.field374 = 0;
                this.field361 = (int) (Math.random() * 100.0D) - 50;
                this.field578 = (int) (Math.random() * 110.0D) - 55;
                this.field185 = (int) (Math.random() * 80.0D) - 40;
                this.field287 = (int) (Math.random() * 120.0D) - 60;
                this.field276 = (int) (Math.random() * 30.0D) - 20;
                this.field396 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field291 = 0;
                this.field272 = -1;
                this.field401 = 0;
                this.field402 = 0;
                this.field342 = 0;
                this.field195 = 0;
                for (int var14 = 0; var14 < this.field339; ++var14) {
                    this.field341[var14] = null;
                    this.field346[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field194[var15] = null;
                }
                field612 = this.field341[this.field340] = new class66();
                this.field139.method474();
                this.field605.method474();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field437[var16][var17][var18] = null;
                        }
                    }
                }
                this.field242 = new class57(36113);
                this.field335 = 0;
                this.field334 = 0;
                this.method75(this.field529, 43360);
                this.field529 = -1;
                this.method75(this.field234, 43360);
                this.field234 = -1;
                this.method75(this.field236, 43360);
                this.field236 = -1;
                this.method75(this.field333, 43360);
                this.field333 = -1;
                this.method75(this.field592, 43360);
                this.field592 = -1;
                this.method75(this.field422, 43360);
                this.field422 = -1;
                this.method75(this.field569, 43360);
                this.field569 = -1;
                this.field566 = false;
                this.field168 = 3;
                this.field483 = 0;
                this.field175 = false;
                this.field219 = false;
                this.field433 = null;
                this.field502 = 0;
                this.field279 = -1;
                this.field376 = true;
                this.method106(-391);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field485[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field212[var20] = null;
                    this.field213[var20] = false;
                }
                field622 = 0;
                field409 = 0;
                field350 = 0;
                field203 = 0;
                field595 = 0;
                field561 = 0;
                field318 = 0;
                field522 = 0;
                field564 = 0;
                field254 = 0;
                this.method89(0);
            } else if (var8 == 3) {
                this.field617 = "";
                this.field618 = "Invalid username or password.";
            } else if (var8 == 4) {
                this.field617 = "Your account has been disabled.";
                this.field618 = "Please check your message-centre for details.";
            } else if (var8 == 5) {
                this.field617 = "Your account is already logged in.";
                this.field618 = "Try again in 60 secs...";
            } else if (var8 == 6) {
                this.field617 = "RuneScape has been updated!";
                this.field618 = "Please reload this page.";
            } else if (var8 == 7) {
                this.field617 = "This world is full.";
                this.field618 = "Please use a different world.";
            } else if (var8 == 8) {
                this.field617 = "Unable to connect.";
                this.field618 = "Login server offline.";
            } else if (var8 == 9) {
                this.field617 = "Login limit exceeded.";
                this.field618 = "Too many connections from your address.";
            } else if (var8 == 10) {
                this.field617 = "Unable to connect.";
                this.field618 = "Bad session id.";
            } else if (var8 == 12) {
                this.field617 = "You need a members account to login to this world.";
                this.field618 = "Please subscribe, or use a different world.";
            } else if (var8 == 13) {
                this.field617 = "Could not complete login.";
                this.field618 = "Please try using a different world.";
            } else if (var8 == 14) {
                this.field617 = "The server is being updated.";
                this.field618 = "Please wait 1 minute and try again.";
            } else if (var8 == 15) {
                this.field466 = true;
                this.field188.field707 = 0;
                this.field455.field707 = 0;
                this.field488 = -1;
                this.field574 = -1;
                this.field575 = -1;
                this.field576 = -1;
                this.field487 = 0;
                this.field489 = 0;
                this.field486 = 0;
                this.field419 = 0;
                this.field175 = false;
                this.field560 = System.currentTimeMillis();
            } else if (var8 == 16) {
                this.field617 = "Login attempts exceeded.";
                this.field618 = "Please wait 1 minute and try again.";
            } else if (var8 == 17) {
                this.field617 = "You are standing in a members-only area.";
                this.field618 = "To play on this world move to a free area first";
            } else if (var8 == 20) {
                this.field617 = "Invalid loginserver requested";
                this.field618 = "Please try using a different world.";
            } else if (var8 != 21) {
                if (var8 == 22) {
                    this.field617 = "Malformed login packet.";
                    this.field618 = "Please try again.";
                } else if (var8 == 23) {
                    this.field617 = "No reply from loginserver.";
                    this.field618 = "Please try again.";
                } else if (var8 == 24) {
                    this.field617 = "Error loading your profile.";
                    this.field618 = "Please contact customer support.";
                } else if (var8 == 25) {
                    this.field617 = "Unexpected loginserver response.";
                    this.field618 = "Please try using a different world.";
                } else if (var8 == 26) {
                    this.field617 = "This computers address has been blocked";
                    this.field618 = "as it was used to break our rules";
                } else if (var8 == -1) {
                    if (var9 == 0) {
                        if (this.field444 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field444;
                            this.method73(arg0, arg1, arg2);
                        } else {
                            this.field617 = "No response from loginserver";
                            this.field618 = "Please wait 1 minute and try again.";
                        }
                    } else {
                        this.field617 = "No response from server";
                        this.field618 = "Please try using a different world.";
                    }
                } else {
                    System.out.println("response:" + var8);
                    this.field617 = "Unexpected server response";
                    this.field618 = "Please try using a different world.";
                }
            } else {
                int var21 = this.field503.method188();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field617 = "You have only just left another world";
                    this.field618 = "Your profile will be transferred in: " + var26;
                    this.method158(0, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method73(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field617 = "";
            this.field618 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field268 = Integer.parseInt(this.getParameter("nodeid"));
        field269 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method76(field580);
        } else {
            method141(true);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field270 = false;
        } else {
            field270 = true;
        }
        this.method433(503, -383, 765);
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method74(byte arg0) {
        int var2 = 5;
        this.field141[8] = 0;
        if (this.field290 != arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        int var4 = 0;
        while (this.field141[8] == 0) {
            String var5 = "Unknown problem";
            this.method98("Connecting to web server", 20, (byte) 5);
            try {
                DataInputStream var6 = this.method88("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 364);
                class14 var7 = new class14(new byte[40], true);
                var6.readFully(var7.field706, 0, 40);
                var6.close();
                for (int var8 = 0; var8 < 9; ++var8) {
                    this.field141[var8] = var7.method222();
                }
                int var9 = var7.method222();
                int var10 = 1234;
                for (int var11 = 0; var11 < 9; ++var11) {
                    var10 = (var10 << 1) + this.field141[var11];
                }
                if (var9 != var10) {
                    var5 = "checksum problem";
                    this.field141[8] = 0;
                }
            } catch (EOFException var14) {
                var5 = "EOF problem";
                this.field141[8] = 0;
            } catch (IOException var15) {
                var5 = "connection problem";
                this.field141[8] = 0;
            } catch (Exception var16) {
                var5 = "logic problem";
                this.field141[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field141[8] == 0) {
                ++var4;
                for (int var12 = var2; var12 > 0; --var12) {
                    if (var4 >= 10) {
                        this.method98("Game updated - please reload page", 10, (byte) 5);
                        var12 = 10;
                    } else {
                        this.method98(var5 + " - Will retry in " + var12 + " secs.", 10, (byte) 5);
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
                this.field307 = !this.field307;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method75(int arg0, int arg1) {
        if (field300 == arg1) {
            class44.method379(arg0, 43360);
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public static final void method76(int arg0) {
        class68.field1644 = true;
        if (arg0 != 16822) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class39.field1106 = true;
        field271 = true;
        class48.field1290 = true;
        class1.field45 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method77(int arg0, boolean arg1) {
        if (arg0 >= 0) {
            int var3 = this.field516[arg0];
            int var4 = this.field517[arg0];
            int var5 = this.field518[arg0];
            int var6 = this.field519[arg0];
            if (var5 >= 2000) {
                var5 -= 2000;
            }
            if (this.field483 != 0 && var5 != 1196) {
                this.field483 = 0;
                this.field275 = true;
            }
            if (var5 == 850) {
                this.field197 = 1;
                this.field198 = var3;
                this.field199 = var4;
                this.field200 = var6;
                this.field201 = String.valueOf(class54.method447(var6).field1419);
                this.field170 = 0;
                this.field348 = true;
            } else {
                if (var5 == 324) {
                    this.field188.method206(129, 533);
                    this.field188.method208(var4);
                    class44 var7 = class44.method380(var4);
                    if (var7.field1253 != null && var7.field1253[0][0] == 5) {
                        int var8 = var7.field1253[0][1];
                        if (this.field319[var8] != var7.field1232[0]) {
                            this.field319[var8] = var7.field1232[0];
                            this.method69(-580, var8);
                            this.field348 = true;
                        }
                    }
                }
                if (var5 == 146) {
                    boolean var9 = this.method110(false, 2, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var3, var4, (byte) 78);
                    if (!var9) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var3, var4, (byte) 78);
                    }
                    this.field588 = super.field1379;
                    this.field589 = super.field1380;
                    this.field591 = 2;
                    this.field590 = 0;
                    this.field188.method206(145, 533);
                    this.field188.method244(true, this.field363 + var3);
                    this.field188.method243((byte) 15, this.field200);
                    this.field188.method244(true, this.field364 + var4);
                    this.field188.method208(this.field198);
                    this.field188.method243((byte) 15, this.field199);
                    this.field188.method242(var6, 28989);
                }
                if (var5 == 209) {
                    class45 var11 = this.field194[var6];
                    if (var11 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var11.field1034[0], var11.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(166, 533);
                        this.field188.method242(this.field171, 28989);
                        this.field188.method243((byte) 15, var6);
                    }
                }
                if (var5 == 189) {
                    class45 var12 = this.field194[var6];
                    if (var12 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var12.field1034[0], var12.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        ++field564;
                        if (field564 >= 85) {
                            this.field188.method206(191, 533);
                            this.field188.method210(8044226);
                            field564 = 0;
                        }
                        this.field188.method206(162, 533);
                        this.field188.method242(var6, 28989);
                    }
                }
                if (var5 == 265) {
                    String var13 = this.field332[arg0];
                    int var14 = var13.indexOf("@whi@");
                    if (var14 != -1) {
                        if (this.field236 == -1) {
                            this.method127(-744);
                            this.field571 = var13.substring(var14 + 5).trim();
                            this.field525 = false;
                            this.field558 = this.field236 = class44.field1221;
                        } else {
                            this.method79("Please close the interface you have open before using 'report abuse'", 0, "", true);
                        }
                    }
                }
                if (var5 == 617) {
                    this.method83(var3, var4, var6, 0);
                    this.field188.method206(171, 533);
                    this.field188.method208(this.field363 + var3);
                    this.field188.method242(var6 >> 14 & 32767, 28989);
                    this.field188.method244(true, this.field364 + var4);
                }
                if (var5 == 416) {
                    boolean var15 = this.method110(false, 2, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var3, var4, (byte) 78);
                    if (!var15) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var3, var4, (byte) 78);
                    }
                    this.field588 = super.field1379;
                    this.field589 = super.field1380;
                    this.field591 = 2;
                    this.field590 = 0;
                    this.field188.method206(84, 533);
                    this.field188.method244(true, var6);
                    this.field188.method243((byte) 15, this.field364 + var4);
                    this.field188.method244(true, this.field363 + var3);
                }
                if (var5 == 721) {
                    if ((this.field364 & 3) == 0) {
                        ++field561;
                    }
                    if (field561 >= 97) {
                        this.field188.method206(36, 533);
                        this.field188.method208(43864);
                        field561 = 0;
                    }
                    this.method83(var3, var4, var6, 0);
                    this.field188.method206(109, 533);
                    this.field188.method244(true, this.field364 + var4);
                    this.field188.method243((byte) 15, this.field363 + var3);
                    this.field188.method244(true, var6 >> 14 & 32767);
                }
                if (var5 == 278) {
                    boolean var17 = this.method110(false, 2, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var3, var4, (byte) 78);
                    if (!var17) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var3, var4, (byte) 78);
                    }
                    this.field588 = super.field1379;
                    this.field589 = super.field1380;
                    this.field591 = 2;
                    this.field590 = 0;
                    this.field188.method206(136, 533);
                    this.field188.method243((byte) 15, this.field363 + var3);
                    this.field188.method208(this.field364 + var4);
                    this.field188.method242(var6, 28989);
                }
                if (var5 == 242) {
                    ++field203;
                    if (field203 >= 120) {
                        this.field188.method206(44, 533);
                        this.field188.method210(14465744);
                        field203 = 0;
                    }
                    this.method83(var3, var4, var6, 0);
                    this.field188.method206(9, 533);
                    this.field188.method244(true, this.field364 + var4);
                    this.field188.method208(this.field363 + var3);
                    this.field188.method243((byte) 15, var6 >> 14 & 32767);
                }
                if (var5 == 609) {
                    boolean var19 = this.method110(false, 2, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var3, var4, (byte) 78);
                    if (!var19) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var3, var4, (byte) 78);
                    }
                    this.field588 = super.field1379;
                    this.field589 = super.field1380;
                    this.field591 = 2;
                    this.field590 = 0;
                    this.field188.method206(54, 533);
                    this.field188.method244(true, var6);
                    this.field188.method244(true, this.field363 + var3);
                    this.field188.method244(true, this.field364 + var4);
                }
                if (var5 == 66 || var5 == 723 || var5 == 299 || var5 == 903) {
                    String var21 = this.field332[arg0];
                    int var22 = var21.indexOf("@whi@");
                    if (var22 != -1) {
                        long var23 = class56.method461(var21.substring(var22 + 5).trim());
                        if (var5 == 66) {
                            this.method184(0, var23);
                        }
                        if (var5 == 723) {
                            this.method82((byte) 9, var23);
                        }
                        if (var5 == 299) {
                            this.method130(-224, var23);
                        }
                        if (var5 == 903) {
                            this.method117(7, var23);
                        }
                    }
                }
                if (var5 == 1263) {
                    int var25 = var6 >> 14 & 32767;
                    class1 var26 = class1.method4(var25);
                    String var27;
                    if (var26.field1 != null) {
                        var27 = new String(var26.field1);
                    } else {
                        var27 = "It's a " + var26.field17 + ".";
                    }
                    this.method79(var27, 0, "", true);
                }
                if (var5 == 1199) {
                    class45 var28 = this.field194[var6];
                    if (var28 != null) {
                        class67 var29 = var28.field1259;
                        if (var29.field1628 != null) {
                            var29 = var29.method510(116);
                        }
                        if (var29 != null) {
                            String var30;
                            if (var29.field1598 != null) {
                                var30 = new String(var29.field1598);
                            } else {
                                var30 = "It's a " + var29.field1593 + ".";
                            }
                            this.method79(var30, 0, "", true);
                        }
                    }
                }
                if (var5 == 70) {
                    class66 var31 = this.field341[var6];
                    if (var31 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var31.field1034[0], var31.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        if ((var6 & 3) == 0) {
                            ++field318;
                        }
                        if (field318 >= 118) {
                            this.field188.method206(223, 533);
                            this.field188.method211(0);
                            field318 = 0;
                        }
                        this.field188.method206(32, 533);
                        this.field188.method243((byte) 15, var6);
                    }
                }
                if (var5 == 461) {
                    class66 var32 = this.field341[var6];
                    if (var32 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var32.field1034[0], var32.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(48, 533);
                        this.field188.method243((byte) 15, var6);
                        this.field188.method243((byte) 15, this.field171);
                    }
                }
                if (var5 == 10) {
                    class45 var33 = this.field194[var6];
                    if (var33 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var33.field1034[0], var33.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(60, 533);
                        this.field188.method242(this.field198, 28989);
                        this.field188.method208(var6);
                        this.field188.method243((byte) 15, this.field199);
                        this.field188.method242(this.field200, 28989);
                    }
                }
                if (var5 == 269) {
                    if (!this.field175) {
                        this.field202.method554(super.field1380 - 4, super.field1379 - 4, -112);
                    } else {
                        this.field202.method554(var4 - 4, var3 - 4, -112);
                    }
                }
                if (var5 == 169) {
                    class45 var34 = this.field194[var6];
                    if (var34 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var34.field1034[0], var34.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        field622 += var6;
                        if (field622 >= 85) {
                            this.field188.method206(204, 533);
                            this.field188.method210(2535407);
                            field622 = 0;
                        }
                        this.field188.method206(41, 533);
                        this.field188.method208(var6);
                    }
                }
                if (var5 == 301 || var5 == 769) {
                    String var35 = this.field332[arg0];
                    int var36 = var35.indexOf("@whi@");
                    if (var36 != -1) {
                        String var37 = var35.substring(var36 + 5).trim();
                        String var38 = class56.method465(-74, class56.method462(false, class56.method461(var37)));
                        boolean var39 = false;
                        for (int var40 = 0; var40 < this.field342; ++var40) {
                            class66 var41 = this.field341[this.field343[var40]];
                            if (var41 != null && var41.field1587 != null && var41.field1587.equalsIgnoreCase(var38)) {
                                this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var41.field1034[0], var41.field1035[0], (byte) 78);
                                if (var5 == 301) {
                                    this.field188.method206(107, 533);
                                    this.field188.method208(this.field343[var40]);
                                }
                                if (var5 == 769) {
                                    if ((var6 & 3) == 0) {
                                        ++field318;
                                    }
                                    if (field318 >= 118) {
                                        this.field188.method206(223, 533);
                                        this.field188.method211(0);
                                        field318 = 0;
                                    }
                                    this.field188.method206(32, 533);
                                    this.field188.method243((byte) 15, this.field343[var40]);
                                }
                                var39 = true;
                                break;
                            }
                        }
                        if (!var39) {
                            this.method79("Unable to find " + var38, 0, "", true);
                        }
                    }
                }
                if (var5 == 608) {
                    class45 var42 = this.field194[var6];
                    if (var42 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var42.field1034[0], var42.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(229, 533);
                        this.field188.method242(var6, 28989);
                    }
                }
                if (var5 == 136) {
                    class66 var43 = this.field341[var6];
                    if (var43 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var43.field1034[0], var43.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(177, 533);
                        this.field188.method208(var6);
                    }
                }
                if (var5 == 394) {
                    this.field188.method206(239, 533);
                    this.field188.method243((byte) 15, var4);
                    this.field188.method242(var6, 28989);
                    this.field188.method208(var3);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 736) {
                    this.method75(this.field529, 43360);
                    this.field529 = -1;
                    this.field275 = true;
                }
                if (var5 == 534) {
                    this.field188.method206(220, 533);
                    this.field188.method208(var3);
                    this.field188.method242(var6, 28989);
                    this.field188.method243((byte) 15, var4);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 930) {
                    this.field188.method206(142, 533);
                    this.field188.method244(true, var6);
                    this.field188.method242(var4, 28989);
                    this.field188.method208(var3);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 4) {
                    this.field188.method206(110, 533);
                    this.field188.method208(var4);
                    this.field188.method243((byte) 15, var6);
                    this.field188.method242(var3, 28989);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 1069) {
                    class54 var44 = class54.method447(var6);
                    String var45;
                    if (var44.field1423 != null) {
                        var45 = new String(var44.field1423);
                    } else {
                        var45 = "It's a " + var44.field1419 + ".";
                    }
                    this.method79(var45, 0, "", true);
                }
                if (var5 == 399) {
                    boolean var46 = this.method110(false, 2, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var3, var4, (byte) 78);
                    if (!var46) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var3, var4, (byte) 78);
                    }
                    this.field588 = super.field1379;
                    this.field589 = super.field1380;
                    this.field591 = 2;
                    this.field590 = 0;
                    this.field188.method206(70, 533);
                    this.field188.method208(this.field364 + var4);
                    this.field188.method243((byte) 15, this.field363 + var3);
                    this.field188.method242(this.field171, 28989);
                    this.field188.method244(true, var6);
                }
                if (var5 == 335) {
                    this.field188.method206(116, 533);
                    this.field188.method244(true, var4);
                    this.field188.method243((byte) 15, this.field199);
                    this.field188.method242(var6, 28989);
                    this.field188.method208(this.field198);
                    this.field188.method244(true, this.field200);
                    this.field188.method242(var3, 28989);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 446) {
                    ++field409;
                    if (field409 >= 66) {
                        this.field188.method206(66, 533);
                        this.field188.method210(16006891);
                        field409 = 0;
                    }
                    this.field188.method206(222, 533);
                    this.field188.method244(true, var4);
                    this.field188.method208(var6);
                    this.field188.method208(var3);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 253) {
                    if ((var3 & 3) == 0) {
                        ++field522;
                    }
                    if (field522 >= 93) {
                        this.field188.method206(157, 533);
                        field522 = 0;
                    }
                    this.field188.method206(233, 533);
                    this.field188.method243((byte) 15, var4);
                    this.field188.method208(var6);
                    this.field188.method243((byte) 15, var3);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 320) {
                    class45 var48 = this.field194[var6];
                    if (var48 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var48.field1034[0], var48.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        ++field595;
                        if (field595 >= 120) {
                            this.field188.method206(242, 533);
                            field595 = 0;
                        }
                        this.field188.method206(15, 533);
                        this.field188.method243((byte) 15, var6);
                    }
                }
                if (var5 == 367) {
                    class66 var49 = this.field341[var6];
                    if (var49 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var49.field1034[0], var49.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(230, 533);
                        this.field188.method208(var6);
                    }
                }
                if (var5 == 997) {
                    class44 var50 = class44.method380(var4);
                    boolean var51 = true;
                    if (var50.field1237 > 0) {
                        var51 = this.method125(5, var50);
                    }
                    if (var51) {
                        this.field188.method206(129, 533);
                        this.field188.method208(var4);
                    }
                }
                if (var5 == 1217) {
                    class54 var52 = class54.method447(var6);
                    class44 var53 = class44.method380(var4);
                    String var54;
                    if (var53 != null && var53.field1181[var3] >= 100000) {
                        var54 = var53.field1181[var3] + " x " + var52.field1419;
                    } else if (var52.field1423 != null) {
                        var54 = new String(var52.field1423);
                    } else {
                        var54 = "It's a " + var52.field1419 + ".";
                    }
                    this.method79(var54, 0, "", true);
                }
                if (var5 == 321) {
                    class66 var55 = this.field341[var6];
                    if (var55 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var55.field1034[0], var55.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(107, 533);
                        this.field188.method208(var6);
                    }
                }
                if (var5 == 286) {
                    this.field188.method206(189, 533);
                    this.field188.method242(var6, 28989);
                    this.field188.method208(var3);
                    this.field188.method243((byte) 15, var4);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 210) {
                    this.field188.method206(176, 533);
                    this.field188.method244(true, var4);
                    this.field188.method242(var3, 28989);
                    this.field188.method244(true, var6);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 22 && !this.field566) {
                    this.field188.method206(17, 533);
                    this.field188.method208(var4);
                    this.field566 = true;
                }
                if (var5 == 481) {
                    String var56 = this.field332[arg0];
                    int var57 = var56.indexOf("@whi@");
                    if (var57 != -1) {
                        long var58 = class56.method461(var56.substring(var57 + 5).trim());
                        int var60 = -1;
                        for (int var61 = 0; var61 < this.field334; ++var61) {
                            if (this.field373[var61] == var58) {
                                var60 = var61;
                                break;
                            }
                        }
                        if (var60 != -1 && this.field281[var60] > 0) {
                            this.field275 = true;
                            this.field483 = 0;
                            this.field219 = true;
                            this.field372 = "";
                            this.field427 = 3;
                            this.field602 = this.field373[var60];
                            this.field508 = "Enter message to send to " + this.field207[var60];
                        }
                    }
                }
                if (var5 == 913) {
                    ++field350;
                    if (field350 >= 91) {
                        this.field188.method206(2, 533);
                        field350 = 0;
                    }
                    this.field188.method206(82, 533);
                    this.field188.method208(var3);
                    this.field188.method242(var4, 28989);
                    this.field188.method208(var6);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 974) {
                    class66 var62 = this.field341[var6];
                    if (var62 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var62.field1034[0], var62.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(45, 533);
                        this.field188.method208(var6);
                    }
                }
                if (var5 == 1299) {
                    this.method83(var3, var4, var6, 0);
                    this.field188.method206(187, 533);
                    this.field188.method208(this.field364 + var4);
                    this.field188.method208(var6 >> 14 & 32767);
                    this.field188.method208(this.field363 + var3);
                }
                if (var5 == 543) {
                    this.method127(-744);
                }
                if (var5 == 746) {
                    this.field188.method206(173, 533);
                    this.field188.method208(var3);
                    this.field188.method242(var4, 28989);
                    this.field188.method208(var6);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 871 && this.method83(var3, var4, var6, 0)) {
                    this.field188.method206(120, 533);
                    this.field188.method242(this.field199, 28989);
                    this.field188.method242(this.field200, 28989);
                    this.field188.method242(var6 >> 14 & 32767, 28989);
                    this.field188.method243((byte) 15, this.field198);
                    this.field188.method242(this.field363 + var3, 28989);
                    this.field188.method208(this.field364 + var4);
                }
                if (var5 == 82 && this.method83(var3, var4, var6, 0)) {
                    this.field188.method206(74, 533);
                    this.field188.method242(this.field364 + var4, 28989);
                    this.field188.method242(this.field363 + var3, 28989);
                    this.field188.method243((byte) 15, this.field171);
                    this.field188.method208(var6 >> 14 & 32767);
                }
                if (var5 == 88) {
                    class45 var63 = this.field194[var6];
                    if (var63 != null) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var63.field1034[0], var63.field1035[0], (byte) 78);
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(21, 533);
                        this.field188.method244(true, var6);
                    }
                }
                if (var5 == 405) {
                    this.field188.method206(129, 533);
                    this.field188.method208(var4);
                    class44 var64 = class44.method380(var4);
                    if (var64.field1253 != null && var64.field1253[0][0] == 5) {
                        int var65 = var64.field1253[0][1];
                        this.field319[var65] = 1 - this.field319[var65];
                        this.method69(-580, var65);
                        this.field348 = true;
                    }
                }
                if (var5 == 864) {
                    this.field188.method206(201, 533);
                    this.field188.method244(true, var4);
                    this.field188.method242(this.field171, 28989);
                    this.field188.method208(var6);
                    this.field188.method243((byte) 15, var3);
                    this.field494 = 0;
                    this.field495 = var4;
                    this.field496 = var3;
                    this.field497 = 2;
                    if (class44.method380(var4).field1240 == this.field236) {
                        this.field497 = 1;
                    }
                    if (class44.method380(var4).field1240 == this.field234) {
                        this.field497 = 3;
                    }
                }
                if (var5 == 880) {
                    boolean var66 = this.method110(false, 2, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var3, var4, (byte) 78);
                    if (!var66) {
                        this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var3, var4, (byte) 78);
                    }
                    this.field588 = super.field1379;
                    this.field589 = super.field1380;
                    this.field591 = 2;
                    this.field590 = 0;
                    this.field188.method206(232, 533);
                    this.field188.method243((byte) 15, this.field363 + var3);
                    this.field188.method244(true, var6);
                    this.field188.method242(this.field364 + var4, 28989);
                }
                if (var5 == 632) {
                    class44 var68 = class44.method380(var4);
                    this.field170 = 1;
                    this.field171 = var4;
                    this.field172 = var68.field1254;
                    this.field197 = 0;
                    this.field348 = true;
                    String var69 = var68.field1201;
                    if (var69.indexOf(" ") != -1) {
                        var69 = var69.substring(0, var69.indexOf(" "));
                    }
                    String var70 = var68.field1201;
                    if (var70.indexOf(" ") != -1) {
                        var70 = var70.substring(var70.indexOf(" ") + 1);
                    }
                    this.field173 = var69 + " " + var68.field1205 + " " + var70;
                    if (this.field172 == 16) {
                        this.field348 = true;
                        this.field168 = 3;
                        this.field142 = true;
                    }
                } else {
                    if (var5 == 846) {
                        this.method83(var3, var4, var6, 0);
                        this.field188.method206(212, 533);
                        this.field188.method243((byte) 15, this.field364 + var4);
                        this.field188.method244(true, this.field363 + var3);
                        this.field188.method243((byte) 15, var6 >> 14 & 32767);
                    }
                    if (var5 == 244) {
                        class66 var71 = this.field341[var6];
                        if (var71 != null) {
                            this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var71.field1034[0], var71.field1035[0], (byte) 78);
                            this.field588 = super.field1379;
                            this.field589 = super.field1380;
                            this.field591 = 2;
                            this.field590 = 0;
                            this.field188.method206(163, 533);
                            this.field188.method243((byte) 15, var6);
                            this.field188.method243((byte) 15, this.field198);
                            this.field188.method243((byte) 15, this.field200);
                            this.field188.method242(this.field199, 28989);
                        }
                    }
                    if (var5 == 740) {
                        boolean var72 = this.method110(false, 2, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var3, var4, (byte) 78);
                        if (!var72) {
                            this.method110(false, 2, 0, 1, 0, 0, field612.field1035[0], 1, field612.field1034[0], var3, var4, (byte) 78);
                        }
                        this.field588 = super.field1379;
                        this.field589 = super.field1380;
                        this.field591 = 2;
                        this.field590 = 0;
                        this.field188.method206(52, 533);
                        this.field188.method244(true, this.field363 + var3);
                        this.field188.method208(var6);
                        this.field188.method244(true, this.field364 + var4);
                    }
                    this.field197 = 0;
                    if (!arg1) {
                        this.field445 = 491;
                    }
                    this.field170 = 0;
                    this.field348 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)V")
    public final void method78(boolean arg0) {
        if (super.field1365 == null) {
            this.method156((byte) -112);
            this.field546 = null;
            this.field547 = null;
            this.field548 = null;
            this.field549 = null;
            this.field550 = null;
            this.field551 = null;
            this.field552 = null;
            this.field553 = null;
            this.field466 &= arg0;
            this.field554 = null;
            this.field179 = null;
            this.field177 = null;
            this.field176 = null;
            this.field178 = null;
            this.field532 = null;
            this.field533 = null;
            this.field534 = null;
            super.field1365 = new class59(this.method119((byte) 75), 765, 503, false);
            this.field587 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;Z)V")
    public final void method79(String arg0, int arg1, String arg2, boolean arg3) {
        if (!arg3) {
            this.field437 = null;
        }
        if (arg1 == 0 && this.field529 != -1) {
            this.field433 = arg0;
            super.field1378 = 0;
        }
        if (this.field234 == -1) {
            this.field275 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field543[var5] = this.field543[var5 - 1];
            this.field544[var5] = this.field544[var5 - 1];
            this.field545[var5] = this.field545[var5 - 1];
        }
        this.field543[0] = arg1;
        this.field544[0] = arg2;
        this.field545[0] = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJNEOOHMF;B)V")
    private final void method80(class24 arg0, byte arg1) {
        if (arg1 != -25) {
            this.field266 = this.field243.method496();
        }
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field885 == 0) {
            var3 = this.field202.method542(arg0.field884, arg0.field886, arg0.field887);
        }
        if (arg0.field885 == 1) {
            var3 = this.field202.method543(arg0.field884, arg0.field886, arg0.field887, 0);
        }
        if (arg0.field885 == 2) {
            var3 = this.field202.method544(arg0.field884, arg0.field886, arg0.field887);
        }
        if (arg0.field885 == 3) {
            var3 = this.field202.method545(arg0.field884, arg0.field886, arg0.field887);
        }
        if (var3 != 0) {
            int var7 = this.field202.method546(arg0.field884, arg0.field886, arg0.field887, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field889 = var4;
        arg0.field891 = var5;
        arg0.field890 = var6;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method81() {
        this.method98("Starting up", 20, (byte) 5);
        if (signlink.sunjava) {
            super.field1358 = 5;
        }
        if (field274) {
            this.field462 = true;
        } else {
            field274 = true;
            boolean var1 = false;
            String var2 = this.method105(true);
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
                this.field452 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field246[var3] = new class65(516, signlink.cache_dat, 500000, signlink.cache_idx[var3], var3 + 1);
                    }
                }
                try {
                    this.method74((byte) 4);
                    this.field501 = this.method109("title screen", "title", 15566, 25, 1, this.field141[1]);
                    this.field148 = new class62(field393, false, this.field501, "p11_full");
                    this.field149 = new class62(field393, false, this.field501, "p12_full");
                    this.field150 = new class62(field393, false, this.field501, "b12_full");
                    this.field151 = new class62(field393, true, this.field501, "q8_full");
                    this.method153(-31892);
                    this.method176(312);
                    class29 var4 = this.method109("config", "config", 15566, 30, 2, this.field141[2]);
                    class29 var5 = this.method109("interface", "interface", 15566, 35, 3, this.field141[3]);
                    class29 var6 = this.method109("2d graphics", "media", 15566, 40, 4, this.field141[4]);
                    class29 var7 = this.method109("textures", "textures", 15566, 45, 6, this.field141[6]);
                    class29 var8 = this.method109("chat system", "wordenc", 15566, 50, 7, this.field141[7]);
                    class29 var9 = this.method109("sound effects", "sounds", 15566, 55, 8, this.field141[8]);
                    this.field192 = new byte[4][104][104];
                    this.field230 = new int[4][105][105];
                    this.field202 = new class68(this.field230, 104, 4, 0, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field472[var10] = new class6(104, (byte) 51, 104);
                    }
                    this.field403 = new class50(512, 512);
                    class29 var11 = this.method109("update list", "versionlist", 15566, 60, 5, this.field141[5]);
                    this.method98("Connecting to update server", 60, (byte) 5);
                    this.field369 = new class26();
                    this.field369.method317(var11, this);
                    class33.method333(this.field369.method313(2));
                    class18.method264(this.field369.method315(0, -98), this.field369);
                    if (!field271) {
                        this.field464 = 0;
                        this.field465 = true;
                        this.field369.method321(2, this.field464);
                        while (this.field369.method306() > 0) {
                            this.method56((byte) 7);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field369.field962 > 3) {
                                this.method91("ondemand");
                                return;
                            }
                        }
                    }
                    this.method98("Requesting animations", 65, (byte) 5);
                    int var12 = this.field369.method315(1, -98);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field369.method321(1, var13);
                    }
                    while (this.field369.method306() > 0) {
                        int var14 = var12 - this.field369.method306();
                        if (var14 > 0) {
                            this.method98("Loading animations - " + var14 * 100 / var12 + "%", 65, (byte) 5);
                        }
                        this.method56((byte) 7);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field369.field962 > 3) {
                            this.method91("ondemand");
                            return;
                        }
                    }
                    this.method98("Requesting models", 70, (byte) 5);
                    int var15 = this.field369.method315(0, -98);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field369.method322(var16, field371);
                        if ((var17 & 1) != 0) {
                            this.field369.method321(0, var16);
                        }
                    }
                    int var18 = this.field369.method306();
                    while (this.field369.method306() > 0) {
                        int var19 = var18 - this.field369.method306();
                        if (var19 > 0) {
                            this.method98("Loading models - " + var19 * 100 / var18 + "%", 70, (byte) 5);
                        }
                        this.method56((byte) 7);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field246[0] != null) {
                        this.method98("Requesting maps", 75, (byte) 5);
                        this.field369.method321(3, this.field369.method308(false, 47, 0, 48));
                        this.field369.method321(3, this.field369.method308(false, 47, 1, 48));
                        this.field369.method321(3, this.field369.method308(false, 48, 0, 48));
                        this.field369.method321(3, this.field369.method308(false, 48, 1, 48));
                        this.field369.method321(3, this.field369.method308(false, 49, 0, 48));
                        this.field369.method321(3, this.field369.method308(false, 49, 1, 48));
                        this.field369.method321(3, this.field369.method308(false, 47, 0, 47));
                        this.field369.method321(3, this.field369.method308(false, 47, 1, 47));
                        this.field369.method321(3, this.field369.method308(false, 48, 0, 47));
                        this.field369.method321(3, this.field369.method308(false, 48, 1, 47));
                        this.field369.method321(3, this.field369.method308(false, 48, 0, 148));
                        this.field369.method321(3, this.field369.method308(false, 48, 1, 148));
                        int var20 = this.field369.method306();
                        while (this.field369.method306() > 0) {
                            int var21 = var20 - this.field369.method306();
                            if (var21 > 0) {
                                this.method98("Loading maps - " + var21 * 100 / var20 + "%", 75, (byte) 5);
                            }
                            this.method56((byte) 7);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field369.method315(0, -98);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field369.method322(var23, field371);
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
                            this.field369.method314(0, var23, (byte) 8, var25);
                        }
                    }
                    this.field369.method310(field270, field526);
                    if (!field271) {
                        int var26 = this.field369.method315(2, -98);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field369.method307(var27, true)) {
                                this.field369.method314(2, var27, (byte) 8, (byte) 1);
                            }
                        }
                    }
                    this.method98("Unpacking media", 80, (byte) 5);
                    this.field475 = new class8(var6, "invback", 0);
                    this.field477 = new class8(var6, "chatback", 0);
                    this.field476 = new class8(var6, "mapback", 0);
                    this.field145 = new class8(var6, "backbase1", 0);
                    this.field146 = new class8(var6, "backbase2", 0);
                    this.field147 = new class8(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field474[var28] = new class8(var6, "sideicons", var28);
                    }
                    this.field460 = new class50(var6, "compass", 0);
                    this.field400 = new class50(var6, "mapedge", 0);
                    this.field400.method421((byte) 6);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field191[var29] = new class8(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 70; ++var30) {
                        this.field235[var30] = new class50(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field265[var31] = new class50(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field301[var32] = new class50(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field597[var33] = new class50(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field471[var34] = new class50(var6, "headicons_hint", var34);
                    }
                    this.field482 = new class50(var6, "overlay_multiway", 0);
                    this.field520 = new class50(var6, "mapmarker", 0);
                    this.field521 = new class50(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field451[var35] = new class50(var6, "cross", var35);
                    }
                    this.field351 = new class50(var6, "mapdots", 0);
                    this.field352 = new class50(var6, "mapdots", 1);
                    this.field353 = new class50(var6, "mapdots", 2);
                    this.field354 = new class50(var6, "mapdots", 3);
                    this.field355 = new class50(var6, "mapdots", 4);
                    this.field204 = new class8(var6, "scrollbar", 0);
                    this.field205 = new class8(var6, "scrollbar", 1);
                    this.field293 = new class8(var6, "redstone1", 0);
                    this.field294 = new class8(var6, "redstone2", 0);
                    this.field295 = new class8(var6, "redstone3", 0);
                    this.field296 = new class8(var6, "redstone1", 0);
                    this.field296.method195(true);
                    this.field297 = new class8(var6, "redstone2", 0);
                    this.field297.method195(true);
                    this.field509 = new class8(var6, "redstone1", 0);
                    this.field509.method196((byte) 6);
                    this.field510 = new class8(var6, "redstone2", 0);
                    this.field510.method196((byte) 6);
                    this.field511 = new class8(var6, "redstone3", 0);
                    this.field511.method196((byte) 6);
                    this.field512 = new class8(var6, "redstone1", 0);
                    this.field512.method195(true);
                    this.field512.method196((byte) 6);
                    this.field513 = new class8(var6, "redstone2", 0);
                    this.field513.method195(true);
                    this.field513.method196((byte) 6);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field258[var36] = new class8(var6, "mod_icons", var36);
                    }
                    class50 var37 = new class50(var6, "backleft1", 0);
                    this.field154 = new class59(this.method119((byte) 75), var37.field1346, var37.field1347, false);
                    var37.method422(field143, 0, 0);
                    class50 var38 = new class50(var6, "backleft2", 0);
                    this.field155 = new class59(this.method119((byte) 75), var38.field1346, var38.field1347, false);
                    var38.method422(field143, 0, 0);
                    class50 var39 = new class50(var6, "backright1", 0);
                    this.field156 = new class59(this.method119((byte) 75), var39.field1346, var39.field1347, false);
                    var39.method422(field143, 0, 0);
                    class50 var40 = new class50(var6, "backright2", 0);
                    this.field157 = new class59(this.method119((byte) 75), var40.field1346, var40.field1347, false);
                    var40.method422(field143, 0, 0);
                    class50 var41 = new class50(var6, "backtop1", 0);
                    this.field158 = new class59(this.method119((byte) 75), var41.field1346, var41.field1347, false);
                    var41.method422(field143, 0, 0);
                    class50 var42 = new class50(var6, "backvmid1", 0);
                    this.field159 = new class59(this.method119((byte) 75), var42.field1346, var42.field1347, false);
                    var42.method422(field143, 0, 0);
                    class50 var43 = new class50(var6, "backvmid2", 0);
                    this.field160 = new class59(this.method119((byte) 75), var43.field1346, var43.field1347, false);
                    var43.method422(field143, 0, 0);
                    class50 var44 = new class50(var6, "backvmid3", 0);
                    this.field161 = new class59(this.method119((byte) 75), var44.field1346, var44.field1347, false);
                    var44.method422(field143, 0, 0);
                    class50 var45 = new class50(var6, "backhmid2", 0);
                    this.field162 = new class59(this.method119((byte) 75), var45.field1346, var45.field1347, false);
                    var45.method422(field143, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field235[var50] != null) {
                            this.field235[var50].method420(var46 + var49, var48 + var49, false, var47 + var49);
                        }
                        if (this.field191[var50] != null) {
                            this.field191[var50].method197(var46 + var49, var48 + var49, false, var47 + var49);
                        }
                    }
                    this.method98("Unpacking textures", 83, (byte) 5);
                    class39.method354(-943, var7);
                    class39.method358(4, 0.8D);
                    class39.method353(20, 523);
                    this.method98("Unpacking config", 86, (byte) 5);
                    class55.method458(0, var4);
                    class1.method10(var4);
                    class46.method390(0, var4);
                    class54.method448(var4);
                    class67.method511(var4);
                    class43.method373(0, var4);
                    class47.method394(0, var4);
                    class20.method293(0, var4);
                    class13.method203(0, var4);
                    class54.field1420 = field270;
                    if (!field271) {
                        this.method98("Unpacking sounds", 90, (byte) 5);
                        byte[] var51 = var9.method332("sounds.dat", (byte[]) null);
                        class14 var52 = new class14(var51, true);
                        class28.method325(0, var52);
                    }
                    this.method98("Unpacking interfaces", 95, (byte) 5);
                    class62[] var53 = new class62[] { this.field148, this.field149, this.field150, this.field151 };
                    class44.method385(var5, var53, var6, -72);
                    this.method98("Preparing game engine", 100, (byte) 5);
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field476.field645[this.field476.field647 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field232[var54] = var55;
                        this.field180[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field476.field645[this.field476.field647 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field458[var58 - 5] = var59 - 25;
                        this.field527[var58 - 5] = var60 - var59;
                    }
                    class39.method351(-55, 765, 503);
                    this.field417 = class39.field1117;
                    class39.method351(-55, 479, 96);
                    this.field414 = class39.field1117;
                    class39.method351(-55, 190, 261);
                    this.field415 = class39.field1117;
                    class39.method351(-55, 512, 334);
                    this.field416 = class39.field1117;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class39.field1115[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class68.method552(334, 500, 800, (byte) 3, var62, 512);
                    class70.method567(var8);
                    this.field480 = new class30(this, false);
                    this.method185(this.field480, 10);
                    class40.field1133 = this;
                    class1.field47 = this;
                    class67.field1600 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field570 + " " + this.field565);
                    this.field559 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BJ)V")
    public final void method82(byte arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field577 >= 100) {
                this.method79("Your ignore list is full. Max of 100 hit", 0, "", true);
            } else {
                String var4 = class56.method465(-74, class56.method462(false, arg1));
                for (int var5 = 0; var5 < this.field577; ++var5) {
                    if (this.field267[var5] == arg1) {
                        this.method79(var4 + " is already on your ignore list", 0, "", true);
                        return;
                    }
                }
                if (arg0 == 9) {
                    boolean var6 = false;
                } else {
                    for (int var7 = 1; var7 > 0; ++var7) {
                    }
                }
                for (int var8 = 0; var8 < this.field334; ++var8) {
                    if (this.field373[var8] == arg1) {
                        this.method79("Please remove " + var4 + " from your friend list first", 0, "", true);
                        return;
                    }
                }
                this.field267[this.field577++] = arg1;
                this.field348 = true;
                this.field188.method206(119, 533);
                this.field188.method213(arg1, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)Z")
    public final boolean method83(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 14 & 32767;
        this.field487 += arg3;
        int var6 = this.field202.method546(this.field596, arg0, arg1, arg2);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method110(true, 2, 0, 0, var8, var7 + 1, field612.field1035[0], 0, field612.field1034[0], arg0, arg1, (byte) 78);
            } else {
                class1 var9 = class1.method4(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field32;
                    var11 = var9.field22;
                } else {
                    var10 = var9.field22;
                    var11 = var9.field32;
                }
                int var12 = var9.field4;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method110(true, 2, var12, var10, 0, 0, field612.field1035[0], var11, field612.field1034[0], arg0, arg1, (byte) 78);
            }
            this.field588 = super.field1379;
            this.field589 = super.field1380;
            this.field591 = 2;
            this.field590 = 0;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method84(int arg0) {
        class41 var2 = (class41) this.field605.method470();
        if (arg0 == -46459) {
            while (var2 != null) {
                if (this.field596 == var2.field1150 && !var2.field1144) {
                    if (field257 >= var2.field1154) {
                        var2.method367(this.field356, this.field292);
                        if (var2.field1144) {
                            var2.method338();
                        } else {
                            this.field202.method527(0, var2, var2.field1150, var2.field1153, var2.field1151, var2.field1152, -1, 60, false, 0);
                        }
                    }
                } else {
                    var2.method338();
                }
                var2 = (class41) this.field605.method472(false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method85(int arg0) {
        if (arg0 != -9398) {
            field393 = !field393;
        }
        if (this.field388 == 0) {
            int var2 = super.field1378;
            if (this.field170 == 1 && super.field1379 >= 516 && super.field1380 >= 160 && super.field1379 <= 765 && super.field1380 <= 205) {
                var2 = 0;
            }
            if (this.field175) {
                if (var2 != 1) {
                    int var3 = super.field1372;
                    int var4 = super.field1373;
                    if (this.field223 == 0) {
                        var3 -= 4;
                        var4 -= 4;
                    }
                    if (this.field223 == 1) {
                        var3 -= 553;
                        var4 -= 205;
                    }
                    if (this.field223 == 2) {
                        var3 -= 17;
                        var4 -= 357;
                    }
                    if (var3 < this.field224 - 10 || var3 > this.field226 + this.field224 + 10 || var4 < this.field225 - 10 || var4 > this.field227 + this.field225 + 10) {
                        this.field175 = false;
                        if (this.field223 == 1) {
                            this.field348 = true;
                        }
                        if (this.field223 == 2) {
                            this.field275 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var5 = this.field224;
                    int var6 = this.field225;
                    int var7 = this.field226;
                    int var8 = super.field1379;
                    int var9 = super.field1380;
                    if (this.field223 == 0) {
                        var8 -= 4;
                        var9 -= 4;
                    }
                    if (this.field223 == 1) {
                        var8 -= 553;
                        var9 -= 205;
                    }
                    if (this.field223 == 2) {
                        var8 -= 17;
                        var9 -= 357;
                    }
                    int var10 = -1;
                    for (int var11 = 0; var11 < this.field419; ++var11) {
                        int var12 = (this.field419 - 1 - var11) * 15 + var6 + 31;
                        if (var8 > var5 && var8 < var5 + var7 && var9 > var12 - 13 && var9 < var12 + 3) {
                            var10 = var11;
                        }
                    }
                    if (var10 != -1) {
                        this.method77(var10, true);
                    }
                    this.field175 = false;
                    if (this.field223 == 1) {
                        this.field348 = true;
                    }
                    if (this.field223 == 2) {
                        this.field275 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field419 > 0) {
                    int var13 = this.field518[this.field419 - 1];
                    if (var13 == 746 || var13 == 4 || var13 == 253 || var13 == 534 || var13 == 930 || var13 == 446 || var13 == 286 || var13 == 210 || var13 == 394 || var13 == 913 || var13 == 850 || var13 == 1217) {
                        int var14 = this.field516[this.field419 - 1];
                        int var15 = this.field517[this.field419 - 1];
                        class44 var16 = class44.method380(var15);
                        if (var16.field1233 || var16.field1222) {
                            this.field493 = false;
                            this.field206 = 0;
                            this.field386 = var15;
                            this.field387 = var14;
                            this.field388 = 2;
                            this.field389 = super.field1379;
                            this.field390 = super.field1380;
                            if (class44.method380(var15).field1240 == this.field236) {
                                this.field388 = 1;
                            }
                            if (class44.method380(var15).field1240 == this.field234) {
                                this.field388 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field506 == 1 || this.method94(this.field419 - 1, this.field610)) && this.field419 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field419 > 0) {
                    this.method77(this.field419 - 1, true);
                }
                if (var2 != 2 || this.field419 <= 0) {
                    return;
                }
                this.method40(this.field380);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLQXTIWHBH;)Z")
    public final boolean method86(boolean arg0, class44 arg1) {
        int var3 = arg1.field1237;
        if (arg0) {
            this.field488 = -1;
        }
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field332[this.field419] = "Remove @whi@" + arg1.field1251;
                this.field518[this.field419] = 903;
                ++this.field419;
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
            this.field332[this.field419] = "Remove @whi@" + this.field207[var3];
            this.field518[this.field419] = 299;
            ++this.field419;
            this.field332[this.field419] = "Message @whi@" + this.field207[var3];
            this.field518[this.field419] = 481;
            ++this.field419;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 364);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field268 = Integer.parseInt(arg0[0]);
                field269 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method76(field580);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method141(true);
                }
                if (arg0[3].equals("free")) {
                    field270 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field270 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method432(503, 6, 765);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method87(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg3 & 2047;
        int var9 = 2048 - arg5 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (var8 != 0) {
            int var13 = class18.field829[var8];
            int var14 = class18.field830[var8];
            int var15 = var11 * var14 - arg0 * var13 >> 16;
            var12 = var11 * var13 + arg0 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class18.field829[var9];
            int var17 = class18.field830[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field581 = arg2 - var10;
        while (arg1 >= 0) {
            this.field488 = this.field455.method217();
        }
        this.field582 = arg4 - var11;
        this.field583 = arg6 - var12;
        this.field584 = arg3;
        this.field585 = arg5;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method88(String arg0) throws IOException {
        if (!this.field307) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field383 != null) {
                try {
                    this.field383.close();
                } catch (Exception var4) {
                }
                this.field383 = null;
            }
            this.field383 = this.method100(43595);
            this.field383.setSoTimeout(10000);
            InputStream var2 = this.field383.getInputStream();
            OutputStream var3 = this.field383.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)V")
    public final void method89(int arg0) {
        if (arg0 == 0) {
            if (this.field179 == null) {
                this.method156((byte) -112);
                super.field1365 = null;
                this.field546 = null;
                this.field547 = null;
                this.field548 = null;
                this.field549 = null;
                this.field550 = null;
                this.field551 = null;
                this.field552 = null;
                this.field553 = null;
                this.field554 = null;
                this.field179 = new class59(this.method119((byte) 75), 479, 96, false);
                this.field177 = new class59(this.method119((byte) 75), 172, 156, false);
                class2.method15(true);
                this.field476.method198(-24669, 0, 0);
                this.field176 = new class59(this.method119((byte) 75), 190, 261, false);
                this.field178 = new class59(this.method119((byte) 75), 512, 334, false);
                class2.method15(true);
                this.field532 = new class59(this.method119((byte) 75), 496, 50, false);
                this.field533 = new class59(this.method119((byte) 75), 269, 37, false);
                this.field534 = new class59(this.method119((byte) 75), 249, 45, false);
                this.field587 = true;
                this.field178.method477(422);
                class39.field1117 = this.field416;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method90(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            field580 = this.field243.method496();
        }
        if (!this.field462 && !this.field559 && !this.field452) {
            ++field331;
            if (!this.field466) {
                this.method158(0, false);
            } else {
                this.method150((byte) 115);
            }
            this.field481 = 0;
        } else {
            this.method157(this.field375);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)V")
    private final void method91(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZZ)V")
    public final void method92(boolean arg0, boolean arg1) {
        if (!arg0) {
            if (field612.field1059 >> 7 == this.field401 && field612.field1060 >> 7 == this.field402) {
                this.field401 = 0;
                ++field394;
                if (field394 > 175) {
                    field394 = 0;
                    this.field188.method206(202, 533);
                    this.field188.method211(0);
                }
            }
            int var3 = this.field342;
            if (arg1) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < var3; ++var4) {
                class66 var5;
                int var6;
                if (arg1) {
                    var5 = field612;
                    var6 = this.field340 << 14;
                } else {
                    var5 = this.field341[this.field343[var4]];
                    var6 = this.field343[var4] << 14;
                }
                if (var5 != null && var5.method342(false)) {
                    var5.field1586 = false;
                    if ((field271 && this.field342 > 50 || this.field342 > 200) && !arg1 && var5.field1078 == var5.field1040) {
                        var5.field1586 = true;
                    }
                    int var7 = var5.field1059 >> 7;
                    int var8 = var5.field1060 >> 7;
                    if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                        if (var5.field1579 != null && field257 >= var5.field1571 && field257 < var5.field1572) {
                            var5.field1586 = false;
                            var5.field1573 = this.method114(this.field596, var5.field1059, 1, var5.field1060);
                            this.field202.method528(var5.field1060, var5, var6, var5.field1061, var5.field1565, var5.field1059, var5.field1562, var5.field1564, (byte) 5, this.field596, var5.field1563, 60, var5.field1573);
                        } else {
                            if ((var5.field1059 & 127) == 64 && (var5.field1060 & 127) == 64) {
                                if (this.field321[var7][var8] == this.field620) {
                                    continue;
                                }
                                this.field321[var7][var8] = this.field620;
                            }
                            var5.field1573 = this.method114(this.field596, var5.field1059, 1, var5.field1060);
                            this.field202.method527(var5.field1061, var5, this.field596, var5.field1573, var5.field1059, var5.field1060, var6, 60, var5.field1071, 0);
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method93(byte arg0) {
        if (arg0 == 0) {
            boolean var2 = false;
        } else {
            this.field188.method207(220);
        }
        this.method137(0);
        if (this.field591 == 1) {
            this.field451[this.field590 / 100].method424(-24669, this.field588 - 8 - 4, this.field589 - 8 - 4);
        }
        if (this.field591 == 2) {
            this.field451[this.field590 / 100 + 4].method424(-24669, this.field588 - 8 - 4, this.field589 - 8 - 4);
            ++field514;
            if (field514 > 1608) {
                field514 = 0;
                this.field188.method206(31, 533);
                this.field188.method207(0);
                int var3 = this.field188.field707;
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field188.method207(22);
                }
                this.field188.method207(218);
                this.field188.method207(64);
                this.field188.method208(3198);
                this.field188.method208(5250);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field188.method208(5949);
                }
                this.field188.method207((int) (Math.random() * 256.0D));
                this.field188.method208(32257);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field188.method208(41491);
                }
                this.field188.method208(44938);
                this.field188.method216(false, this.field188.field707 - var3);
            }
        }
        if (this.field569 != -1) {
            this.method171(this.field569, 32022, this.field356);
            this.method183(0, class44.method380(this.field569), (byte) 27, 0, 0);
        }
        if (this.field236 != -1) {
            this.method171(this.field236, 32022, this.field356);
            this.method183(0, class44.method380(this.field236), (byte) 27, 0, 0);
        }
        this.method164(false);
        if (!this.field175) {
            this.method120((byte) 54);
            this.method134(8);
        } else if (this.field223 == 0) {
            this.method63(8);
        }
        if (this.field502 == 1) {
            this.field482.method424(-24669, 472, 296);
        }
        if (field358) {
            short var4 = 507;
            byte var5 = 20;
            int var6 = 16776960;
            if (super.field1360 < 30 && field271) {
                var6 = 16711680;
            }
            if (super.field1360 < 20 && !field271) {
                var6 = 16711680;
            }
            this.field149.method480(var6, "Fps:" + super.field1360, true, var4, var5);
            int var15 = var5 + 15;
            Runtime var7 = Runtime.getRuntime();
            int var8 = (int) ((var7.totalMemory() - var7.freeMemory()) / 1024L);
            int var9 = 16776960;
            if (var8 > 33554432 && field271) {
                int var10 = 16711680;
            }
            if (var8 > 67108864 && !field271) {
                int var11 = 16711680;
            }
            this.field149.method480(16776960, "Mem:" + var8 + "k", true, var4, var15);
            var15 += 15;
        }
        if (this.field486 != 0) {
            int var12 = this.field486 / 50;
            int var13 = var12 / 60;
            int var14 = var12 % 60;
            if (var14 < 10) {
                this.field149.method485("System update in: " + var13 + ":0" + var14, false, 4, 16776960, 329);
            } else {
                this.field149.method485("System update in: " + var13 + ":" + var14, false, 4, 16776960, 329);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)Z")
    public final boolean method94(int arg0, int arg1) {
        if (arg0 < 0) {
            return false;
        } else {
            int var3 = this.field518[arg0];
            if (arg1 >= 0) {
                this.field188.method207(182);
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 66;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method95(boolean arg0) {
        if (!arg0) {
            if (field271 && this.field411 == 2 && class48.field1298 != this.field596) {
                this.method160((String) null, this.field593, "Loading - please wait.");
                this.field411 = 1;
                this.field560 = System.currentTimeMillis();
            }
            if (this.field411 == 1) {
                int var2 = this.method96(1);
                if (var2 != 0 && System.currentTimeMillis() - this.field560 > 360000L) {
                    signlink.reporterror(this.field478 + " glcfb " + this.field541 + "," + var2 + "," + field271 + "," + this.field246[0] + "," + this.field369.method306() + "," + this.field596 + "," + this.field303 + "," + this.field304);
                    this.field560 = System.currentTimeMillis();
                }
            }
            if (this.field411 == 2 && this.field596 != this.field272) {
                this.field272 = this.field596;
                this.method172(this.field596, (byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
    public final int method96(int arg0) {
        for (int var2 = 0; var2 < this.field144.length; ++var2) {
            if (this.field144[var2] == null && this.field284[var2] != -1) {
                return -1;
            }
            if (this.field492[var2] == null && this.field285[var2] != -1) {
                return -2;
            }
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field144.length; ++var4) {
            byte[] var5 = this.field492[var4];
            if (var5 != null) {
                int var6 = (this.field283[var4] >> 8) * 64 - this.field363;
                int var7 = (this.field283[var4] & 255) * 64 - this.field364;
                if (this.field515) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class48.method418(var6, var5, var7, this.field606);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field251) {
            return -4;
        } else {
            this.field411 = 2;
            if (arg0 < 1 || arg0 > 1) {
                this.field266 = this.field243.method496();
            }
            class48.field1298 = this.field596;
            this.method151(9);
            this.field188.method206(169, 533);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(BLEMWAMCXW;I)V")
    private final void method97(byte arg0, class14 arg1, int arg2) {
        arg1.method227((byte) 31);
        if (arg0 == 7) {
            int var4 = arg1.method228(1, 4);
            if (var4 != 0) {
                int var5 = arg1.method228(2, 4);
                if (var5 == 0) {
                    this.field345[this.field344++] = this.field340;
                } else if (var5 == 1) {
                    int var6 = arg1.method228(3, 4);
                    field612.method343(38670, var6, false);
                    int var7 = arg1.method228(1, 4);
                    if (var7 == 1) {
                        this.field345[this.field344++] = this.field340;
                    }
                } else if (var5 == 2) {
                    int var8 = arg1.method228(3, 4);
                    field612.method343(38670, var8, true);
                    int var9 = arg1.method228(3, 4);
                    field612.method343(38670, var9, true);
                    int var10 = arg1.method228(1, 4);
                    if (var10 == 1) {
                        this.field345[this.field344++] = this.field340;
                    }
                } else if (var5 == 3) {
                    int var11 = arg1.method228(1, 4);
                    int var12 = arg1.method228(7, 4);
                    int var13 = arg1.method228(7, 4);
                    this.field596 = arg1.method228(2, 4);
                    int var14 = arg1.method228(1, 4);
                    if (var14 == 1) {
                        this.field345[this.field344++] = this.field340;
                    }
                    field612.method339(var12, var11 == 1, this.field324, var13);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IB)V")
    public final void method98(String arg0, int arg1, byte arg2) {
        this.field565 = arg1;
        this.field570 = arg0;
        this.method175(true);
        if (this.field501 == null) {
            super.method98(arg0, arg1, (byte) 5);
        } else {
            this.field548.method477(422);
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field150.method481("RuneScape is loading - please wait...", 936, 16777215, var4 / 2, var5 / 2 - 26 - var6);
            if (arg2 == 5) {
                boolean var7 = false;
            } else {
                this.field488 = this.field455.method217();
            }
            int var8 = var5 / 2 - 18 - var6;
            class2.method18(0, var4 / 2 - 152, 304, 9179409, 34, var8);
            class2.method18(0, var4 / 2 - 151, 302, 0, 32, var8 + 1);
            class2.method17(var4 / 2 - 150, var8 + 2, this.field463, 9179409, arg1 * 3, 30);
            class2.method17(arg1 * 3 + (var4 / 2 - 150), var8 + 2, this.field463, 0, 300 - arg1 * 3, 30);
            this.field150.method481(arg0, 936, 16777215, var4 / 2, var5 / 2 + 5 - var6);
            this.field548.method478(171, 202, super.field1364, false);
            if (this.field587) {
                this.field587 = false;
                if (!this.field391) {
                    this.field549.method478(0, 0, super.field1364, false);
                    this.field550.method478(0, 637, super.field1364, false);
                }
                this.field546.method478(0, 128, super.field1364, false);
                this.field547.method478(371, 202, super.field1364, false);
                this.field551.method478(265, 0, super.field1364, false);
                this.field552.method478(265, 562, super.field1364, false);
                this.field553.method478(171, 128, super.field1364, false);
                this.field554.method478(171, 562, super.field1364, false);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (this.field491 > 0) {
            this.method159(-121);
        } else {
            this.method160("Please wait - attempting to reestablish", this.field593, "Connection lost");
            this.field291 = 0;
            this.field401 = 0;
            class7 var2 = this.field503;
            this.field466 = false;
            while (arg0 >= 0) {
                this.field437 = null;
            }
            this.field444 = 0;
            this.method73(this.field478, this.field479, true);
            if (!this.field466) {
                this.method159(-121);
            }
            try {
                var2.method187();
            } catch (Exception var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method100(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)Z")
    public final boolean method101(int arg0) {
        if (arg0 != -44059) {
            this.field619 = this.field243.method496();
        }
        return signlink.wavereplay();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIILTFHGRYAS;)V")
    public final void method102(byte arg0, int arg1, int arg2, class50 arg3) {
        if (arg3 != null) {
            int var5 = this.field396 + this.field287 & 2047;
            int var6 = arg1 * arg1 + arg2 * arg2;
            if (var6 <= 6400) {
                int var7 = class18.field829[var5];
                int var8 = class18.field830[var5];
                int var9 = var7 * 256 / (this.field276 + 256);
                int var10 = var8 * 256 / (this.field276 + 256);
                int var11 = arg1 * var9 + arg2 * var10 >> 16;
                int var12 = arg1 * var10 - arg2 * var9 >> 16;
                if (arg0 == 2) {
                    boolean var13 = false;
                } else {
                    for (int var14 = 1; var14 > 0; ++var14) {
                    }
                }
                if (var6 > 2500) {
                    arg3.method430(0, var11 + 94 - arg3.field1350 / 2 + 4, this.field476, 83 - var12 - arg3.field1351 / 2 - 4);
                } else {
                    arg3.method424(-24669, var11 + 94 - arg3.field1350 / 2 + 4, 83 - var12 - arg3.field1351 / 2 - 4);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)V")
    public final void method103(byte arg0) {
        this.field308 = 0;
        for (int var2 = -1; var2 < this.field342 + this.field195; ++var2) {
            class36 var19;
            if (var2 == -1) {
                var19 = field612;
            } else if (var2 < this.field342) {
                var19 = this.field341[this.field343[var2]];
            } else {
                var19 = this.field194[this.field196[var2 - this.field342]];
            }
            if (var19 != null && var19.method342(false)) {
                if (var19 instanceof class45) {
                    class67 var20 = ((class45) var19).field1259;
                    if (var20.field1628 != null) {
                        var20 = var20.method510(116);
                    }
                    if (var20 == null) {
                        continue;
                    }
                }
                if (var2 >= this.field342) {
                    class67 var23 = ((class45) var19).field1259;
                    if (var23.field1621 >= 0 && var23.field1621 < this.field597.length) {
                        this.method122(true, var19.field1033 + 15, var19);
                        if (this.field435 > -1) {
                            this.field597[var23.field1621].method424(-24669, this.field435 - 12, this.field436 - 30);
                        }
                    }
                    if (this.field231 == 1 && this.field196[var2 - this.field342] == this.field347 && field257 % 20 < 10) {
                        this.method122(true, var19.field1033 + 15, var19);
                        if (this.field435 > -1) {
                            this.field471[0].method424(-24669, this.field435 - 12, this.field436 - 28);
                        }
                    }
                } else {
                    int var21 = 30;
                    class66 var22 = (class66) var19;
                    if (var22.field1588 != -1 || var22.field1583 != -1) {
                        this.method122(true, var19.field1033 + 15, var19);
                        if (this.field435 > -1) {
                            if (var22.field1588 != -1) {
                                this.field301[var22.field1588].method424(-24669, this.field435 - 12, this.field436 - var21);
                                var21 += 25;
                            }
                            if (var22.field1583 != -1) {
                                this.field597[var22.field1583].method424(-24669, this.field435 - 12, this.field436 - var21);
                                var21 += 25;
                            }
                        }
                    }
                    if (var2 >= 0 && this.field231 == 10 && this.field343[var2] == this.field473) {
                        this.method122(true, var19.field1033 + 15, var19);
                        if (this.field435 > -1) {
                            this.field471[1].method424(-24669, this.field435 - 12, this.field436 - var21);
                        }
                    }
                }
                if (var19.field1075 != null && (var2 >= this.field342 || this.field423 == 0 || this.field423 == 3 || this.field423 == 1 && this.method107(0, ((class66) var19).field1587))) {
                    this.method122(true, var19.field1033, var19);
                    if (this.field435 > -1 && this.field308 < this.field309) {
                        this.field313[this.field308] = this.field150.method484(445, var19.field1075) / 2;
                        this.field312[this.field308] = this.field150.field1542;
                        this.field310[this.field308] = this.field435;
                        this.field311[this.field308] = this.field436;
                        this.field314[this.field308] = var19.field1076;
                        this.field315[this.field308] = var19.field1062;
                        this.field316[this.field308] = var19.field1054;
                        this.field317[this.field308++] = var19.field1075;
                        if (this.field253 == 0 && var19.field1062 >= 1 && var19.field1062 <= 3) {
                            this.field312[this.field308] += 10;
                            this.field311[this.field308] += 5;
                        }
                        if (this.field253 == 0 && var19.field1062 == 4) {
                            this.field313[this.field308] = 60;
                        }
                        if (this.field253 == 0 && var19.field1062 == 5) {
                            this.field312[this.field308] += 5;
                        }
                    }
                }
                if (var19.field1047 > field257) {
                    this.method122(true, var19.field1033 + 15, var19);
                    if (this.field435 > -1) {
                        int var24 = var19.field1048 * 30 / var19.field1049;
                        if (var24 > 30) {
                            var24 = 30;
                        }
                        class2.method17(this.field435 - 15, this.field436 - 3, this.field463, 65280, var24, 5);
                        class2.method17(this.field435 - 15 + var24, this.field436 - 3, this.field463, 16711680, 30 - var24, 5);
                    }
                }
                for (int var25 = 0; var25 < 4; ++var25) {
                    if (var19.field1074[var25] > field257) {
                        this.method122(true, var19.field1033 / 2, var19);
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
                            this.field265[var19.field1073[var25]].method424(-24669, this.field435 - 12, this.field436 - 12);
                            this.field148.method481(String.valueOf(var19.field1072[var25]), 936, 0, this.field435, this.field436 + 4);
                            this.field148.method481(String.valueOf(var19.field1072[var25]), 936, 16777215, this.field435 - 1, this.field436 + 3);
                        }
                    }
                }
            }
        }
        for (int var3 = 0; var3 < this.field308; ++var3) {
            int var4 = this.field310[var3];
            int var5 = this.field311[var3];
            int var6 = this.field313[var3];
            int var7 = this.field312[var3];
            boolean var8 = true;
            while (var8) {
                var8 = false;
                for (int var18 = 0; var18 < var3; ++var18) {
                    if (var5 + 2 > this.field311[var18] - this.field312[var18] && var5 - var7 < this.field311[var18] + 2 && var4 - var6 < this.field313[var18] + this.field310[var18] && var4 + var6 > this.field310[var18] - this.field313[var18] && this.field311[var18] - this.field312[var18] < var5) {
                        var5 = this.field311[var18] - this.field312[var18];
                        var8 = true;
                    }
                }
            }
            this.field435 = this.field310[var3];
            this.field436 = this.field311[var3] = var5;
            String var9 = this.field317[var3];
            if (this.field253 == 0) {
                int var10 = 16776960;
                if (this.field314[var3] < 6) {
                    var10 = this.field385[this.field314[var3]];
                }
                if (this.field314[var3] == 6) {
                    var10 = this.field620 % 20 < 10 ? 16711680 : 16776960;
                }
                if (this.field314[var3] == 7) {
                    var10 = this.field620 % 20 < 10 ? 255 : 65535;
                }
                if (this.field314[var3] == 8) {
                    var10 = this.field620 % 20 < 10 ? 45056 : 8454016;
                }
                if (this.field314[var3] == 9) {
                    int var11 = 150 - this.field316[var3];
                    if (var11 < 50) {
                        var10 = var11 * 1280 + 16711680;
                    } else if (var11 < 100) {
                        var10 = 16776960 - (var11 - 50) * 327680;
                    } else if (var11 < 150) {
                        var10 = (var11 - 100) * 5 + 65280;
                    }
                }
                if (this.field314[var3] == 10) {
                    int var12 = 150 - this.field316[var3];
                    if (var12 < 50) {
                        var10 = var12 * 5 + 16711680;
                    } else if (var12 < 100) {
                        var10 = 16711935 - (var12 - 50) * 327680;
                    } else if (var12 < 150) {
                        var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                    }
                }
                if (this.field314[var3] == 11) {
                    int var13 = 150 - this.field316[var3];
                    if (var13 < 50) {
                        var10 = 16777215 - var13 * 327685;
                    } else if (var13 < 100) {
                        var10 = (var13 - 50) * 327685 + 65280;
                    } else if (var13 < 150) {
                        var10 = 16777215 - (var13 - 100) * 327680;
                    }
                }
                if (this.field315[var3] == 0) {
                    this.field150.method481(var9, 936, 0, this.field435, this.field436 + 1);
                    this.field150.method481(var9, 936, var10, this.field435, this.field436);
                }
                if (this.field315[var3] == 1) {
                    this.field150.method486(var9, this.field436 + 1, (byte) -122, this.field435, this.field620, 0);
                    this.field150.method486(var9, this.field436, (byte) -122, this.field435, this.field620, var10);
                }
                if (this.field315[var3] == 2) {
                    this.field150.method487(0, this.field620, 0, var9, this.field436 + 1, this.field435);
                    this.field150.method487(var10, this.field620, 0, var9, this.field436, this.field435);
                }
                if (this.field315[var3] == 3) {
                    this.field150.method488(0, 28569, this.field436 + 1, this.field435, 150 - this.field316[var3], this.field620, var9);
                    this.field150.method488(var10, 28569, this.field436, this.field435, 150 - this.field316[var3], this.field620, var9);
                }
                if (this.field315[var3] == 4) {
                    int var14 = this.field150.method484(445, var9);
                    int var15 = (150 - this.field316[var3]) * (var14 + 100) / 150;
                    class2.method14(this.field435 + 50, 0, 334, this.field435 - 50, 357);
                    this.field150.method485(var9, false, this.field435 + 50 - var15, 0, this.field436 + 1);
                    this.field150.method485(var9, false, this.field435 + 50 - var15, var10, this.field436);
                    class2.method13(-15334);
                }
                if (this.field315[var3] == 5) {
                    int var16 = 150 - this.field316[var3];
                    int var17 = 0;
                    if (var16 < 25) {
                        var17 = var16 - 25;
                    } else if (var16 > 125) {
                        var17 = var16 - 125;
                    }
                    class2.method14(512, this.field436 - this.field150.field1542 - 1, this.field436 + 5, 0, 357);
                    this.field150.method481(var9, 936, 0, this.field435, this.field436 + 1 + var17);
                    this.field150.method481(var9, 936, var10, this.field435, this.field436 + var17);
                    class2.method13(-15334);
                }
            } else {
                this.field150.method481(var9, 936, 0, this.field435, this.field436 + 1);
                this.field150.method481(var9, 936, 16776960, this.field435, this.field436);
            }
        }
        if (arg0 != 8) {
            this.field488 = this.field455.method217();
        }
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method104(int arg0) {
        if (arg0 <= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field1378 == 1) {
            if (super.field1379 >= 6 && super.field1379 <= 106 && super.field1380 >= 467 && super.field1380 <= 499) {
                this.field423 = (this.field423 + 1) % 4;
                this.field183 = true;
                this.field275 = true;
                this.field188.method206(178, 533);
                this.field188.method207(this.field423);
                this.field188.method207(this.field164);
                this.field188.method207(this.field306);
            }
            if (super.field1379 >= 135 && super.field1379 <= 235 && super.field1380 >= 467 && super.field1380 <= 499) {
                this.field164 = (this.field164 + 1) % 3;
                this.field183 = true;
                this.field275 = true;
                this.field188.method206(178, 533);
                this.field188.method207(this.field423);
                this.field188.method207(this.field164);
                this.field188.method207(this.field306);
            }
            if (super.field1379 >= 273 && super.field1379 <= 373 && super.field1380 >= 467 && super.field1380 <= 499) {
                this.field306 = (this.field306 + 1) % 3;
                this.field183 = true;
                this.field275 = true;
                this.field188.method206(178, 533);
                this.field188.method207(this.field423);
                this.field188.method207(this.field164);
                this.field188.method207(this.field306);
            }
            if (super.field1379 >= 412 && super.field1379 <= 512 && super.field1380 >= 467 && super.field1380 <= 499) {
                if (this.field236 == -1) {
                    this.method127(-744);
                    this.field571 = "";
                    this.field525 = false;
                    this.field558 = this.field236 = class44.field1221;
                    return;
                }
                this.method79("Please close the interface you have open before using 'report abuse'", 0, "", true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)Ljava/lang/String;")
    public final String method105(boolean arg0) {
        this.field466 &= arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1367 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method106(int arg0) {
        this.field624 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field299[var2] = -1;
            for (int var3 = 0; var3 < class43.field1171; ++var3) {
                if (!class43.field1172[var3].field1178 && class43.field1172[var3].field1173 == var2 + (this.field376 ? 0 : 7)) {
                    this.field299[var2] = var3;
                    break;
                }
            }
        }
        while (arg0 >= 0) {
            this.field488 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method107(int arg0, String arg1) {
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field334; ++var3) {
                if (arg1.equalsIgnoreCase(this.field207[var3])) {
                    return true;
                }
            }
            if (arg0 != 0) {
                throw new NullPointerException();
            } else {
                return arg1.equalsIgnoreCase(field612.field1587);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method108(boolean arg0) {
        this.field587 = true;
        this.field466 &= arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;IIII)LMAARFNGV;")
    public final class29 method109(String arg0, String arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg2 != 15566) {
            this.field488 = -1;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field246[0] != null) {
                var7 = this.field246[0].method500(1016, arg4);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field603.reset();
            this.field603.update(var7);
            int var9 = (int) this.field603.getValue();
            if (arg5 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class29(var7, (byte) 9);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method98("Requesting " + arg0, arg3, (byte) 5);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method88(arg1 + arg5);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class14 var17 = new class14(var16, true);
                    var17.field707 = 3;
                    int var18 = var17.method221() + 6;
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
                            this.method98("Loading " + arg0 + " - " + var23 + "%", arg3, (byte) 5);
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field246[0] != null) {
                            this.field246[0].method501(var7, var7.length, arg4, -225);
                        }
                    } catch (Exception var29) {
                        this.field246[0] = null;
                    }
                    if (var7 != null) {
                        this.field603.reset();
                        this.field603.update(var7);
                        int var24 = (int) this.field603.getValue();
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
                            this.method98("Game updated - please reload page", arg3, (byte) 5);
                            var26 = 10;
                        } else {
                            this.method98(var12 + " - Retrying in " + var26, arg3, (byte) 5);
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
                    this.field307 = !this.field307;
                }
            }
            return new class29(var7, (byte) 9);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZIIIIIIIIIIB)Z")
    public final boolean method110(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, byte arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var40 = 0; var40 < var14; ++var40) {
                this.field572[var15][var40] = 0;
                this.field280[var15][var40] = 99999999;
            }
        }
        int var16 = arg8;
        int var17 = arg6;
        this.field572[arg8][arg6] = 99;
        if (arg11 != 78) {
            for (int var18 = 1; var18 > 0; ++var18) {
            }
        }
        this.field280[arg8][arg6] = 0;
        byte var19 = 0;
        int var20 = 0;
        this.field498[var19] = arg8;
        int var41 = var19 + 1;
        this.field499[var19] = arg6;
        boolean var21 = false;
        int var22 = this.field498.length;
        int[][] var23 = this.field472[this.field596].field138;
        while (var41 != var20) {
            var16 = this.field498[var20];
            var17 = this.field499[var20];
            var20 = (var20 + 1) % var22;
            if (arg9 == var16 && arg10 == var17) {
                var21 = true;
                break;
            }
            if (arg5 != 0) {
                if ((arg5 < 5 || arg5 == 10) && this.field472[this.field596].method37(arg9, var17, var16, arg10, (byte) 5, arg4, arg5 - 1)) {
                    var21 = true;
                    break;
                }
                if (arg5 < 10 && this.field472[this.field596].method38(this.field182, arg5 - 1, arg9, arg10, arg4, var17, var16)) {
                    var21 = true;
                    break;
                }
            }
            if (arg3 != 0 && arg7 != 0 && this.field472[this.field596].method39(arg10, -15341, arg7, arg3, var17, arg9, arg2, var16)) {
                var21 = true;
                break;
            }
            int var39 = this.field280[var16][var17] + 1;
            if (var16 > 0 && this.field572[var16 - 1][var17] == 0 && (var23[var16 - 1][var17] & 19398920) == 0) {
                this.field498[var41] = var16 - 1;
                this.field499[var41] = var17;
                var41 = (var41 + 1) % var22;
                this.field572[var16 - 1][var17] = 2;
                this.field280[var16 - 1][var17] = var39;
            }
            if (var16 < var13 - 1 && this.field572[var16 + 1][var17] == 0 && (var23[var16 + 1][var17] & 19399040) == 0) {
                this.field498[var41] = var16 + 1;
                this.field499[var41] = var17;
                var41 = (var41 + 1) % var22;
                this.field572[var16 + 1][var17] = 8;
                this.field280[var16 + 1][var17] = var39;
            }
            if (var17 > 0 && this.field572[var16][var17 - 1] == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field498[var41] = var16;
                this.field499[var41] = var17 - 1;
                var41 = (var41 + 1) % var22;
                this.field572[var16][var17 - 1] = 1;
                this.field280[var16][var17 - 1] = var39;
            }
            if (var17 < var14 - 1 && this.field572[var16][var17 + 1] == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field498[var41] = var16;
                this.field499[var41] = var17 + 1;
                var41 = (var41 + 1) % var22;
                this.field572[var16][var17 + 1] = 4;
                this.field280[var16][var17 + 1] = var39;
            }
            if (var16 > 0 && var17 > 0 && this.field572[var16 - 1][var17 - 1] == 0 && (var23[var16 - 1][var17 - 1] & 19398926) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field498[var41] = var16 - 1;
                this.field499[var41] = var17 - 1;
                var41 = (var41 + 1) % var22;
                this.field572[var16 - 1][var17 - 1] = 3;
                this.field280[var16 - 1][var17 - 1] = var39;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field572[var16 + 1][var17 - 1] == 0 && (var23[var16 + 1][var17 - 1] & 19399043) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 - 1] & 19398914) == 0) {
                this.field498[var41] = var16 + 1;
                this.field499[var41] = var17 - 1;
                var41 = (var41 + 1) % var22;
                this.field572[var16 + 1][var17 - 1] = 9;
                this.field280[var16 + 1][var17 - 1] = var39;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field572[var16 - 1][var17 + 1] == 0 && (var23[var16 - 1][var17 + 1] & 19398968) == 0 && (var23[var16 - 1][var17] & 19398920) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field498[var41] = var16 - 1;
                this.field499[var41] = var17 + 1;
                var41 = (var41 + 1) % var22;
                this.field572[var16 - 1][var17 + 1] = 6;
                this.field280[var16 - 1][var17 + 1] = var39;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field572[var16 + 1][var17 + 1] == 0 && (var23[var16 + 1][var17 + 1] & 19399136) == 0 && (var23[var16 + 1][var17] & 19399040) == 0 && (var23[var16][var17 + 1] & 19398944) == 0) {
                this.field498[var41] = var16 + 1;
                this.field499[var41] = var17 + 1;
                var41 = (var41 + 1) % var22;
                this.field572[var16 + 1][var17 + 1] = 12;
                this.field280[var16 + 1][var17 + 1] = var39;
            }
        }
        this.field420 = 0;
        if (!var21) {
            if (!arg0) {
                return false;
            }
            int var24 = 1000;
            int var25 = 100;
            byte var26 = 10;
            for (int var27 = arg9 - var26; var27 <= arg9 + var26; ++var27) {
                for (int var28 = arg10 - var26; var28 <= arg10 + var26; ++var28) {
                    if (var27 >= 0 && var28 >= 0 && var27 < 104 && var28 < 104 && this.field280[var27][var28] < 100) {
                        int var29 = 0;
                        if (var27 < arg9) {
                            var29 = arg9 - var27;
                        } else if (var27 > arg3 + arg9 - 1) {
                            var29 = var27 - (arg3 + arg9 - 1);
                        }
                        int var30 = 0;
                        if (var28 < arg10) {
                            var30 = arg10 - var28;
                        } else if (var28 > arg7 + arg10 - 1) {
                            var30 = var28 - (arg7 + arg10 - 1);
                        }
                        int var31 = var29 * var29 + var30 * var30;
                        if (var31 < var24 || var24 == var31 && this.field280[var27][var28] < var25) {
                            var24 = var31;
                            var25 = this.field280[var27][var28];
                            var16 = var27;
                            var17 = var28;
                        }
                    }
                }
            }
            if (var24 == 1000) {
                return false;
            }
            if (arg8 == var16 && arg6 == var17) {
                return false;
            }
            this.field420 = 1;
        }
        byte var32 = 0;
        this.field498[var32] = var16;
        int var42 = var32 + 1;
        this.field499[var32] = var17;
        int var33;
        int var34 = var33 = this.field572[var16][var17];
        while (arg8 != var16 || arg6 != var17) {
            if (var33 != var34) {
                var33 = var34;
                this.field498[var42] = var16;
                this.field499[var42++] = var17;
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
            var34 = this.field572[var16][var17];
        }
        if (var42 <= 0) {
            if (arg1 == 1) {
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
            int var36 = this.field498[var42];
            int var37 = this.field499[var42];
            if (arg1 == 0) {
                this.field188.method206(143, 533);
                this.field188.method207(var35 + var35 + 3);
            }
            if (arg1 == 1) {
                this.field188.method206(115, 533);
                this.field188.method207(var35 + var35 + 3 + 14);
            }
            if (arg1 == 2) {
                this.field188.method206(236, 533);
                this.field188.method207(var35 + var35 + 3);
            }
            this.field401 = this.field498[0];
            this.field402 = this.field499[0];
            for (int var38 = 1; var38 < var35; ++var38) {
                --var42;
                this.field188.method233(-265, this.field498[var42] - var36);
                this.field188.method233(-265, this.field499[var42] - var37);
            }
            this.field188.method244(true, this.field363 + var36);
            this.field188.method235(0, super.field1382[5] == 1 ? 1 : 0);
            this.field188.method208(this.field364 + var37);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)V")
    public final void method111(int arg0, int arg1) {
        class57 var3 = this.field437[this.field596][arg0][arg1];
        if (var3 == null) {
            this.field202.method537(this.field596, arg0, arg1);
        } else {
            int var4 = -99999999;
            class4 var5 = null;
            for (class4 var6 = (class4) var3.method470(); var6 != null; var6 = (class4) var3.method472(false)) {
                class54 var11 = class54.method447(var6.field117);
                int var12 = var11.field1429;
                if (var11.field1422) {
                    var12 = (var6.field116 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method468(var5, 0);
            class4 var7 = null;
            class4 var8 = null;
            for (class4 var9 = (class4) var3.method470(); var9 != null; var9 = (class4) var3.method472(false)) {
                if (var5.field117 != var9.field117 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field117 != var9.field117 && var7.field117 != var9.field117 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field202.method523(var8, var5, arg0, var7, var10, 7, arg1, this.method114(this.field596, arg0 * 128 + 64, 1, arg1 * 128 + 64), this.field596);
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)Z")
    public final boolean method112(int arg0) {
        int var2 = 82 / arg0;
        if (this.field503 == null) {
            return false;
        } else {
            try {
                int var3 = this.field503.method189();
                if (var3 == 0) {
                    return false;
                }
                if (this.field488 == -1) {
                    this.field503.method190(this.field455.field706, 0, 1);
                    this.field488 = this.field455.field706[0] & 255;
                    if (this.field243 != null) {
                        this.field488 = this.field488 - this.field243.method496() & 255;
                    }
                    this.field487 = class52.field1388[this.field488];
                    --var3;
                }
                if (this.field487 == -1) {
                    if (var3 <= 0) {
                        return false;
                    }
                    this.field503.method190(this.field455.field706, 0, 1);
                    this.field487 = this.field455.field706[0] & 255;
                    --var3;
                }
                if (this.field487 == -2) {
                    if (var3 <= 1) {
                        return false;
                    }
                    this.field503.method190(this.field455.field706, 0, 2);
                    this.field455.field707 = 0;
                    this.field487 = this.field455.method219();
                    var3 -= 2;
                }
                if (var3 < this.field487) {
                    return false;
                }
                this.field455.field707 = 0;
                this.field503.method190(this.field455.field706, 0, this.field487);
                this.field489 = 0;
                this.field576 = this.field575;
                this.field575 = this.field574;
                this.field574 = this.field488;
                if (this.field488 == 21) {
                    this.field328 = this.field455.method236(29396);
                    this.field327 = this.field455.method238((byte) 93);
                    this.field488 = -1;
                    return true;
                }
                if (this.field488 == 18) {
                    long var4 = this.field455.method223(3);
                    int var6 = this.field455.method217();
                    String var7 = class56.method465(-74, class56.method462(false, var4));
                    for (int var8 = 0; var8 < this.field334; ++var8) {
                        if (this.field373[var8] == var4) {
                            if (this.field281[var8] != var6) {
                                this.field281[var8] = var6;
                                this.field348 = true;
                                if (var6 > 0) {
                                    this.method79(var7 + " has logged in.", 5, "", true);
                                }
                                if (var6 == 0) {
                                    this.method79(var7 + " has logged out.", 5, "", true);
                                }
                            }
                            var7 = null;
                            break;
                        }
                    }
                    if (var7 != null && this.field334 < 200) {
                        this.field373[this.field334] = var4;
                        this.field207[this.field334] = var7;
                        this.field281[this.field334] = var6;
                        ++this.field334;
                        this.field348 = true;
                    }
                    boolean var9 = false;
                    while (!var9) {
                        var9 = true;
                        for (int var10 = 0; var10 < this.field334 - 1; ++var10) {
                            if (this.field281[var10] != field268 && this.field281[var10 + 1] == field268 || this.field281[var10] == 0 && this.field281[var10 + 1] != 0) {
                                int var11 = this.field281[var10];
                                this.field281[var10] = this.field281[var10 + 1];
                                this.field281[var10 + 1] = var11;
                                String var12 = this.field207[var10];
                                this.field207[var10] = this.field207[var10 + 1];
                                this.field207[var10 + 1] = var12;
                                long var13 = this.field373[var10];
                                this.field373[var10] = this.field373[var10 + 1];
                                this.field373[var10 + 1] = var13;
                                this.field348 = true;
                                var9 = false;
                            }
                        }
                    }
                    this.field488 = -1;
                    return true;
                }
                if (this.field488 == 232) {
                    this.field222 = this.field455.method219();
                    this.field542 = this.field455.method217();
                    this.field488 = -1;
                    return true;
                }
                if (this.field488 == 58) {
                    int var15 = this.field455.method246(633);
                    int var16 = this.field455.method246(633);
                    int var17 = this.field455.method245(-485);
                    class44.method380(var16).field1188 = (var17 << 16) + var15;
                    this.field488 = -1;
                    return true;
                }
                if (this.field488 == 25) {
                    int var18 = this.field455.method247(-110);
                    this.method61(var18, -22137);
                    if (this.field422 != -1) {
                        this.method75(this.field422, 43360);
                        this.field422 = -1;
                        this.field348 = true;
                        this.field142 = true;
                    }
                    if (this.field234 != -1) {
                        this.method75(this.field234, 43360);
                        this.field234 = -1;
                        this.field275 = true;
                    }
                    if (this.field333 != -1) {
                        this.method75(this.field333, 43360);
                        this.field333 = -1;
                        this.field587 = true;
                    }
                    if (this.field592 != -1) {
                        this.method75(this.field592, 43360);
                        this.field592 = -1;
                    }
                    if (this.field236 != var18) {
                        this.method75(this.field236, 43360);
                        this.field236 = var18;
                    }
                    if (this.field483 != 0) {
                        this.field483 = 0;
                        this.field275 = true;
                    }
                    this.field566 = false;
                    this.field488 = -1;
                    return true;
                }
                if (this.field488 == 215) {
                    this.method159(-121);
                    this.field488 = -1;
                    return false;
                }
                if (this.field488 != 4 && this.field488 != 5) {
                    if (this.field488 == 212) {
                        this.field455.method246(633);
                        this.field540 = this.field455.method245(-485);
                        this.field468 = this.field455.method222();
                        this.field594 = this.field455.method219();
                        this.field244 = this.field455.method247(-110);
                        this.field608 = this.field455.method247(-110);
                        this.field621 = this.field455.method246(633);
                        this.field432 = this.field455.method246(633);
                        this.field455.method236(29396);
                        this.field615 = this.field455.method245(-485);
                        this.field613 = this.field455.method246(633);
                        signlink.dnslookup(class56.method464((byte) 8, this.field468));
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 == 167) {
                        this.field279 = this.field455.method238((byte) 93);
                        if (this.field279 == this.field168) {
                            if (this.field279 == 3) {
                                this.field168 = 1;
                            } else {
                                this.field168 = 3;
                            }
                            this.field348 = true;
                        }
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 == 60) {
                        int var69 = this.field455.method219();
                        int var70 = this.field455.method217();
                        int var71 = this.field455.method219();
                        if (var71 == 65535) {
                            if (this.field374 < 50) {
                                this.field382[this.field374] = (short) var69;
                                this.field524[this.field374] = var70;
                                this.field208[this.field374] = 0;
                                ++this.field374;
                            }
                        } else if (this.field563 && !field271 && this.field374 < 50) {
                            this.field382[this.field374] = var69;
                            this.field524[this.field374] = var70;
                            this.field208[this.field374] = class28.field973[var69] + var71;
                            ++this.field374;
                        }
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 == 186) {
                        this.field577 = this.field487 / 8;
                        for (int var72 = 0; var72 < this.field577; ++var72) {
                            this.field267[var72] = this.field455.method223(3);
                        }
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 == 149) {
                        if (this.field168 == 12) {
                            this.field348 = true;
                        }
                        this.field609 = this.field455.method220();
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 == 49) {
                        String var73 = this.field455.method224();
                        if (var73.endsWith(":tradereq:")) {
                            String var74 = var73.substring(0, var73.indexOf(":"));
                            long var75 = class56.method461(var74);
                            boolean var77 = false;
                            for (int var78 = 0; var78 < this.field577; ++var78) {
                                if (this.field267[var78] == var75) {
                                    var77 = true;
                                    break;
                                }
                            }
                            if (!var77 && this.field289 == 0) {
                                this.method79("wishes to trade with you.", 4, var74, true);
                            }
                        } else if (var73.endsWith(":duelreq:")) {
                            String var79 = var73.substring(0, var73.indexOf(":"));
                            long var80 = class56.method461(var79);
                            boolean var82 = false;
                            for (int var83 = 0; var83 < this.field577; ++var83) {
                                if (this.field267[var83] == var80) {
                                    var82 = true;
                                    break;
                                }
                            }
                            if (!var82 && this.field289 == 0) {
                                this.method79("wishes to duel with you.", 8, var79, true);
                            }
                        } else if (!var73.endsWith(":chalreq:")) {
                            this.method79(var73, 0, "", true);
                        } else {
                            String var84 = var73.substring(0, var73.indexOf(":"));
                            long var85 = class56.method461(var84);
                            boolean var87 = false;
                            for (int var88 = 0; var88 < this.field577; ++var88) {
                                if (this.field267[var88] == var85) {
                                    var87 = true;
                                    break;
                                }
                            }
                            if (!var87 && this.field289 == 0) {
                                String var89 = var73.substring(var73.indexOf(":") + 1, var73.length() - 9);
                                this.method79(var89, 8, var84, true);
                            }
                        }
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 == 44) {
                        int var90 = this.field455.method219();
                        int var91 = this.field455.method246(633);
                        int var92 = this.field455.method247(-110);
                        if (var92 == 65535) {
                            class44.method380(var90).field1215 = 0;
                            this.field488 = -1;
                            return true;
                        }
                        class54 var93 = class54.method447(var92);
                        class44.method380(var90).field1215 = 4;
                        class44.method380(var90).field1216 = var92;
                        class44.method380(var90).field1227 = var93.field1404;
                        class44.method380(var90).field1228 = var93.field1421;
                        class44.method380(var90).field1226 = var93.field1409 * 100 / var91;
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 == 145) {
                        if (this.field168 == 12) {
                            this.field348 = true;
                        }
                        this.field282 = this.field455.method217();
                        this.field488 = -1;
                        return true;
                    }
                    if (this.field488 != 76) {
                        if (this.field488 == 99) {
                            int var94 = this.field455.method246(633);
                            class44.method380(var94).field1215 = 3;
                            if (field612.field1568 == null) {
                                class44.method380(var94).field1216 = (field612.field1561[11] << 5) + (field612.field1561[8] << 10) + (field612.field1561[0] << 15) + (field612.field1581[0] << 25) + (field612.field1581[4] << 20) + field612.field1561[1];
                            } else {
                                class44.method380(var94).field1216 = (int) (field612.field1568.field1594 + 305419896L);
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 236 || this.field488 == 19 || this.field488 == 231 || this.field488 == 131 || this.field488 == 216 || this.field488 == 65 || this.field488 == 93 || this.field488 == 94 || this.field488 == 103 || this.field488 == 87 || this.field488 == 191) {
                            this.method113(this.field237, this.field455, this.field488);
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 162) {
                            this.field338 = false;
                            for (int var95 = 0; var95 < 5; ++var95) {
                                this.field399[var95] = false;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 148) {
                            int var96 = this.field455.method217();
                            int var97 = this.field455.method217();
                            int var98 = this.field455.method217();
                            int var99 = this.field455.method217();
                            this.field399[var96] = true;
                            this.field470[var96] = var97;
                            this.field239[var96] = var98;
                            this.field604[var96] = var99;
                            this.field573[var96] = 0;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 250) {
                            int var100 = this.field455.method219();
                            if (var100 == 65535) {
                                var100 = -1;
                            }
                            if (this.field278 != var100 && this.field256 && !field271 && this.field418 == 0) {
                                this.field464 = var100;
                                this.field465 = true;
                                this.field369.method321(2, this.field464);
                            }
                            this.field278 = var100;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 84) {
                            int var101 = this.field455.method245(-485);
                            int var102 = this.field455.method250((byte) 7);
                            if (this.field256 && !field271) {
                                this.field464 = var101;
                                this.field465 = false;
                                this.field369.method321(2, this.field464);
                                this.field418 = var102;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 134) {
                            int var103 = this.field455.method247(-110);
                            byte var104 = this.field455.method241(-367);
                            this.field187[var103] = var104;
                            if (this.field319[var103] != var104) {
                                this.field319[var103] = var104;
                                this.method69(-580, var103);
                                this.field348 = true;
                                if (this.field529 != -1) {
                                    this.field275 = true;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 59) {
                            int var105 = this.field455.method246(633);
                            int var106 = this.field455.method249(this.field330);
                            int var107 = this.field455.method248((byte) 93);
                            class44 var108 = class44.method380(var105);
                            var108.field1252 = var107;
                            var108.field1185 = var106;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 233) {
                            this.field502 = this.field455.method217();
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 3) {
                            this.field401 = 0;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 153) {
                            this.field291 = this.field455.method217();
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 180) {
                            int var109 = this.field455.method246(633);
                            boolean var110 = this.field455.method237(true) == 1;
                            class44.method380(var109).field1248 = var110;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 144) {
                            int var111 = this.field455.method246(633);
                            int var112 = this.field455.method246(633);
                            class44.method380(var111).field1215 = 1;
                            class44.method380(var111).field1216 = var112;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 14) {
                            int var113 = this.field455.method245(-485);
                            this.method61(var113, -22137);
                            if (this.field234 != -1) {
                                this.method75(this.field234, 43360);
                                this.field234 = -1;
                                this.field275 = true;
                            }
                            if (this.field333 != -1) {
                                this.method75(this.field333, 43360);
                                this.field333 = -1;
                                this.field587 = true;
                            }
                            if (this.field592 != -1) {
                                this.method75(this.field592, 43360);
                                this.field592 = -1;
                            }
                            if (this.field236 != -1) {
                                this.method75(this.field236, 43360);
                                this.field236 = -1;
                            }
                            if (this.field422 != var113) {
                                this.method75(this.field422, 43360);
                                this.field422 = var113;
                            }
                            if (this.field483 != 0) {
                                this.field483 = 0;
                                this.field275 = true;
                            }
                            this.field348 = true;
                            this.field142 = true;
                            this.field566 = false;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 211) {
                            int var114 = this.field455.method238((byte) 93);
                            String var115 = this.field455.method224();
                            int var116 = this.field455.method238((byte) 93);
                            if (var114 >= 1 && var114 <= 5) {
                                if (var115.equalsIgnoreCase("null")) {
                                    var115 = null;
                                }
                                this.field212[var114 - 1] = var115;
                                this.field213[var114 - 1] = var116 == 0;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 73) {
                            int var117 = this.field455.method248((byte) 93);
                            if (var117 >= 0) {
                                this.method61(var117, -22137);
                            }
                            if (this.field569 != var117) {
                                this.method75(this.field569, 43360);
                                this.field569 = var117;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 225) {
                            this.field348 = true;
                            int var118 = this.field455.method219();
                            class44 var119 = class44.method380(var118);
                            int var120 = this.field455.method219();
                            for (int var121 = 0; var121 < var120; ++var121) {
                                int var122 = this.field455.method237(true);
                                if (var122 == 255) {
                                    var122 = this.field455.method222();
                                }
                                var119.field1255[var121] = this.field455.method247(-110);
                                var119.field1181[var121] = var122;
                            }
                            for (int var123 = var120; var123 < var119.field1255.length; ++var123) {
                                var119.field1255[var123] = 0;
                                var119.field1181[var123] = 0;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 221) {
                            long var124 = this.field455.method223(3);
                            int var126 = this.field455.method222();
                            int var127 = this.field455.method217();
                            boolean var128 = false;
                            for (int var129 = 0; var129 < 100; ++var129) {
                                if (this.field263[var129] == var126) {
                                    var128 = true;
                                    break;
                                }
                            }
                            if (var127 <= 1) {
                                for (int var130 = 0; var130 < this.field577; ++var130) {
                                    if (this.field267[var130] == var124) {
                                        var128 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var128 && this.field289 == 0) {
                                try {
                                    this.field263[this.field323] = var126;
                                    this.field323 = (this.field323 + 1) % 100;
                                    String var131 = class15.method256(this.field455, this.field487 - 13, 905);
                                    if (var127 != 3) {
                                        var131 = class70.method577(false, var131);
                                    }
                                    if (var127 != 2 && var127 != 3) {
                                        if (var127 == 1) {
                                            this.method79(var131, 7, "@cr1@" + class56.method465(-74, class56.method462(false, var124)), true);
                                        } else {
                                            this.method79(var131, 3, class56.method465(-74, class56.method462(false, var124)), true);
                                        }
                                    } else {
                                        this.method79(var131, 7, "@cr2@" + class56.method465(-74, class56.method462(false, var124)), true);
                                    }
                                } catch (Exception var191) {
                                    signlink.reporterror("cde1");
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 140) {
                            int var133 = this.field455.method245(-485);
                            String var134 = this.field455.method224();
                            class44.method380(var133).field1251 = var134;
                            int var10001 = this.field220[this.field168];
                            if (class44.method380(var133).field1240 == var10001) {
                                this.field348 = true;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 241) {
                            this.field338 = true;
                            this.field535 = this.field455.method217();
                            this.field536 = this.field455.method217();
                            this.field537 = this.field455.method219();
                            this.field538 = this.field455.method217();
                            this.field539 = this.field455.method217();
                            if (this.field539 >= 100) {
                                this.field581 = this.field535 * 128 + 64;
                                this.field583 = this.field536 * 128 + 64;
                                this.field582 = this.method114(this.field596, this.field581, 1, this.field583) - this.field537;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 90) {
                            this.field335 = this.field455.method217();
                            this.field348 = true;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 64) {
                            int var135 = this.field455.method245(-485);
                            int var136 = this.field455.method219();
                            class44 var137 = class44.method380(var136);
                            if (var137 != null && var137.field1220 == 0) {
                                if (var135 < 0) {
                                    var135 = 0;
                                }
                                if (var135 > var137.field1198 - var137.field1207) {
                                    var135 = var137.field1198 - var137.field1207;
                                }
                                var137.field1196 = var135;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 2) {
                            this.field168 = this.field455.method238((byte) 93);
                            this.field348 = true;
                            this.field142 = true;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 45) {
                            if (this.field422 != -1) {
                                this.method75(this.field422, 43360);
                                this.field422 = -1;
                                this.field348 = true;
                                this.field142 = true;
                            }
                            if (this.field234 != -1) {
                                this.method75(this.field234, 43360);
                                this.field234 = -1;
                                this.field275 = true;
                            }
                            if (this.field333 != -1) {
                                this.method75(this.field333, 43360);
                                this.field333 = -1;
                                this.field587 = true;
                            }
                            if (this.field592 != -1) {
                                this.method75(this.field592, 43360);
                                this.field592 = -1;
                            }
                            if (this.field236 != -1) {
                                this.method75(this.field236, 43360);
                                this.field236 = -1;
                            }
                            if (this.field483 != 0) {
                                this.field483 = 0;
                                this.field275 = true;
                            }
                            this.field566 = false;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 217) {
                            this.field486 = this.field455.method219() * 30;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 249) {
                            int var138 = this.field455.method219();
                            int var139 = this.field455.method245(-485);
                            if (this.field234 != -1) {
                                this.method75(this.field234, 43360);
                                this.field234 = -1;
                                this.field275 = true;
                            }
                            if (this.field333 != -1) {
                                this.method75(this.field333, 43360);
                                this.field333 = -1;
                                this.field587 = true;
                            }
                            if (this.field592 != -1) {
                                this.method75(this.field592, 43360);
                                this.field592 = -1;
                            }
                            if (this.field236 != var138) {
                                this.method75(this.field236, 43360);
                                this.field236 = var138;
                            }
                            if (this.field422 != var139) {
                                this.method75(this.field422, 43360);
                                this.field422 = var139;
                            }
                            if (this.field483 != 0) {
                                this.field483 = 0;
                                this.field275 = true;
                            }
                            this.field348 = true;
                            this.field142 = true;
                            this.field566 = false;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 234) {
                            this.field348 = true;
                            int var140 = this.field455.method236(29396);
                            int var141 = this.field455.method236(29396);
                            int var142 = this.field455.method253(false);
                            this.field190[var141] = var142;
                            this.field434[var141] = var140;
                            this.field163[var141] = 1;
                            for (int var143 = 0; var143 < 98; ++var143) {
                                if (var142 >= field238[var143]) {
                                    this.field163[var141] = var143 + 2;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 214) {
                            this.field327 = this.field455.method237(true);
                            this.field328 = this.field455.method236(29396);
                            while (this.field455.field707 < this.field487) {
                                int var144 = this.field455.method217();
                                this.method113(this.field237, this.field455, var144);
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 210) {
                            int var145 = this.field455.method245(-485);
                            int var146 = this.field455.method247(-110);
                            int var147 = var146 >> 10 & 31;
                            int var148 = var146 >> 5 & 31;
                            int var149 = var146 & 31;
                            class44.method380(var145).field1180 = (var149 << 3) + (var147 << 19) + (var148 << 11);
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 181) {
                            for (int var150 = 0; var150 < this.field341.length; ++var150) {
                                if (this.field341[var150] != null) {
                                    this.field341[var150].field1064 = -1;
                                }
                            }
                            for (int var151 = 0; var151 < this.field194.length; ++var151) {
                                if (this.field194[var151] != null) {
                                    this.field194[var151].field1064 = -1;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 194) {
                            this.method126(this.field455, -843, this.field487);
                            this.field251 = false;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 163) {
                            int var152 = this.field455.method247(-110);
                            class44 var153 = class44.method380(var152);
                            for (int var154 = 0; var154 < var153.field1255.length; ++var154) {
                                var153.field1255[var154] = -1;
                                var153.field1255[var154] = 0;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 223) {
                            this.field338 = true;
                            this.field446 = this.field455.method217();
                            this.field447 = this.field455.method217();
                            this.field448 = this.field455.method219();
                            this.field449 = this.field455.method217();
                            this.field450 = this.field455.method217();
                            if (this.field450 >= 100) {
                                int var155 = this.field446 * 128 + 64;
                                int var156 = this.field447 * 128 + 64;
                                int var157 = this.method114(this.field596, var155, 1, var156) - this.field448;
                                int var158 = var155 - this.field581;
                                int var159 = var157 - this.field582;
                                int var160 = var156 - this.field583;
                                int var161 = (int) Math.sqrt((double) (var158 * var158 + var160 * var160));
                                this.field584 = (int) (Math.atan2((double) var159, (double) var161) * 325.949D) & 2047;
                                this.field585 = (int) (Math.atan2((double) var158, (double) var160) * -325.949D) & 2047;
                                if (this.field584 < 128) {
                                    this.field584 = 128;
                                }
                                if (this.field584 > 383) {
                                    this.field584 = 383;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 197) {
                            int var162 = this.field455.method246(633);
                            int var163 = this.field455.method219();
                            int var164 = this.field455.method247(-110);
                            int var165 = this.field455.method219();
                            class44.method380(var165).field1227 = var163;
                            class44.method380(var165).field1228 = var164;
                            class44.method380(var165).field1226 = var162;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 16) {
                            int var166 = this.field455.method220();
                            int var167 = this.field455.method245(-485);
                            class44 var168 = class44.method380(var167);
                            if (var168.field1208 != var166 || var166 == -1) {
                                var168.field1208 = var166;
                                var168.field1194 = 0;
                                var168.field1242 = 0;
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 91) {
                            int var169 = this.field455.method219();
                            int var170 = this.field455.method219();
                            class44.method380(var169).field1215 = 2;
                            class44.method380(var169).field1216 = var170;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 106) {
                            this.field348 = true;
                            int var171 = this.field455.method219();
                            class44 var172 = class44.method380(var171);
                            while (this.field455.field707 < this.field487) {
                                int var173 = this.field455.method231();
                                int var174 = this.field455.method219();
                                int var175 = this.field455.method217();
                                if (var175 == 255) {
                                    var175 = this.field455.method222();
                                }
                                if (var173 >= 0 && var173 < var172.field1255.length) {
                                    var172.field1255[var173] = var174;
                                    var172.field1181[var173] = var175;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 160) {
                            int var176 = this.field455.method219();
                            int var177 = this.field455.method237(true);
                            if (var176 == 65535) {
                                var176 = -1;
                            }
                            if (this.field220[var177] != var176) {
                                this.method75(this.field220[var177], 43360);
                                this.field220[var177] = var176;
                            }
                            this.field348 = true;
                            this.field142 = true;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 238) {
                            this.field328 = this.field455.method217();
                            this.field327 = this.field455.method217();
                            for (int var178 = this.field327; var178 < this.field327 + 8; ++var178) {
                                for (int var179 = this.field328; var179 < this.field328 + 8; ++var179) {
                                    if (this.field437[this.field596][var178][var179] != null) {
                                        this.field437[this.field596][var178][var179] = null;
                                        this.method111(var178, var179);
                                    }
                                }
                            }
                            for (class24 var180 = (class24) this.field242.method470(); var180 != null; var180 = (class24) this.field242.method472(false)) {
                                if (var180.field886 >= this.field327 && var180.field886 < this.field327 + 8 && var180.field887 >= this.field328 && var180.field887 < this.field328 + 8 && this.field596 == var180.field884) {
                                    var180.field888 = 0;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 229) {
                            int var181 = this.field455.method219();
                            this.method61(var181, -22137);
                            if (this.field422 != -1) {
                                this.method75(this.field422, 43360);
                                this.field422 = -1;
                                this.field348 = true;
                                this.field142 = true;
                            }
                            if (this.field333 != -1) {
                                this.method75(this.field333, 43360);
                                this.field333 = -1;
                                this.field587 = true;
                            }
                            if (this.field592 != -1) {
                                this.method75(this.field592, 43360);
                                this.field592 = -1;
                            }
                            if (this.field236 != -1) {
                                this.method75(this.field236, 43360);
                                this.field236 = -1;
                            }
                            if (this.field234 != var181) {
                                this.method75(this.field234, 43360);
                                this.field234 = var181;
                            }
                            this.field566 = false;
                            this.field275 = true;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 219) {
                            for (int var182 = 0; var182 < this.field319.length; ++var182) {
                                if (this.field319[var182] != this.field187[var182]) {
                                    this.field319[var182] = this.field187[var182];
                                    this.method69(-580, var182);
                                    this.field348 = true;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 81) {
                            this.field219 = false;
                            this.field483 = 2;
                            this.field379 = "";
                            this.field275 = true;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 39) {
                            this.field423 = this.field455.method217();
                            this.field164 = this.field455.method217();
                            this.field306 = this.field455.method217();
                            this.field183 = true;
                            this.field275 = true;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 71) {
                            int var183 = this.field455.method252(false);
                            int var184 = this.field455.method247(-110);
                            this.field187[var184] = var183;
                            if (this.field319[var184] != var183) {
                                this.field319[var184] = var183;
                                this.method69(-580, var184);
                                this.field348 = true;
                                if (this.field529 != -1) {
                                    this.field275 = true;
                                }
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 129) {
                            this.field231 = this.field455.method217();
                            if (this.field231 == 1) {
                                this.field347 = this.field455.method219();
                            }
                            if (this.field231 >= 2 && this.field231 <= 6) {
                                if (this.field231 == 2) {
                                    this.field441 = 64;
                                    this.field442 = 64;
                                }
                                if (this.field231 == 3) {
                                    this.field441 = 0;
                                    this.field442 = 64;
                                }
                                if (this.field231 == 4) {
                                    this.field441 = 128;
                                    this.field442 = 64;
                                }
                                if (this.field231 == 5) {
                                    this.field441 = 64;
                                    this.field442 = 0;
                                }
                                if (this.field231 == 6) {
                                    this.field441 = 64;
                                    this.field442 = 128;
                                }
                                this.field231 = 2;
                                this.field438 = this.field455.method219();
                                this.field439 = this.field455.method219();
                                this.field440 = this.field455.method217();
                            }
                            if (this.field231 == 10) {
                                this.field473 = this.field455.method219();
                            }
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 68) {
                            int var185 = this.field455.method246(633);
                            int var186 = this.field455.method247(-110);
                            this.method61(var186, -22137);
                            if (var185 != -1) {
                                this.method61(var185, -22137);
                            }
                            if (this.field236 != -1) {
                                this.method75(this.field236, 43360);
                                this.field236 = -1;
                            }
                            if (this.field422 != -1) {
                                this.method75(this.field422, 43360);
                                this.field422 = -1;
                            }
                            if (this.field234 != -1) {
                                this.method75(this.field234, 43360);
                                this.field234 = -1;
                            }
                            if (this.field333 != var186) {
                                this.method75(this.field333, 43360);
                                this.field333 = var186;
                            }
                            if (this.field592 != var186) {
                                this.method75(this.field592, 43360);
                                this.field592 = var185;
                            }
                            this.field483 = 0;
                            this.field566 = false;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 255) {
                            int var187 = this.field455.method249(this.field330);
                            if (this.field529 != var187) {
                                this.method75(this.field529, 43360);
                                this.field529 = var187;
                            }
                            this.field275 = true;
                            this.field488 = -1;
                            return true;
                        }
                        if (this.field488 == 30) {
                            this.field219 = false;
                            this.field483 = 1;
                            this.field379 = "";
                            this.field275 = true;
                            this.field488 = -1;
                            return true;
                        }
                        signlink.reporterror("T1 - " + this.field488 + "," + this.field487 + " - " + this.field575 + "," + this.field576);
                        this.method159(-121);
                        return true;
                    }
                    this.method115(this.field455, true, this.field487);
                    this.field488 = -1;
                    return true;
                }
                int var19 = this.field303;
                int var20 = this.field304;
                if (this.field488 == 4) {
                    var19 = this.field455.method246(633);
                    var20 = this.field455.method245(-485);
                    this.field515 = false;
                }
                if (this.field488 == 5) {
                    var19 = this.field455.method245(-485);
                    var20 = this.field455.method219();
                    this.field455.method227((byte) 31);
                    int var21 = 0;
                    while (true) {
                        if (var21 >= 4) {
                            this.field455.method229((byte) 92);
                            this.field515 = true;
                            break;
                        }
                        for (int var22 = 0; var22 < 13; ++var22) {
                            for (int var23 = 0; var23 < 13; ++var23) {
                                int var24 = this.field455.method228(1, 4);
                                if (var24 == 1) {
                                    this.field392[var21][var22][var23] = this.field455.method228(26, 4);
                                } else {
                                    this.field392[var21][var22][var23] = -1;
                                }
                            }
                        }
                        ++var21;
                    }
                }
                if (this.field303 == var19 && this.field304 == var20 && this.field411 == 2) {
                    this.field488 = -1;
                    return true;
                }
                this.field303 = var19;
                this.field304 = var20;
                this.field363 = (this.field303 - 6) * 8;
                this.field364 = (this.field304 - 6) * 8;
                this.field407 = false;
                if ((this.field303 / 8 == 48 || this.field303 / 8 == 49) && this.field304 / 8 == 48) {
                    this.field407 = true;
                }
                if (this.field303 / 8 == 48 && this.field304 / 8 == 148) {
                    this.field407 = true;
                }
                this.field411 = 1;
                this.field560 = System.currentTimeMillis();
                this.method160((String) null, this.field593, "Loading - please wait.");
                if (this.field488 == 4) {
                    int var25 = 0;
                    int var26 = (this.field303 - 6) / 8;
                    label1245: while (true) {
                        if (var26 > (this.field303 + 6) / 8) {
                            this.field144 = new byte[var25][];
                            this.field492 = new byte[var25][];
                            this.field283 = new int[var25];
                            this.field284 = new int[var25];
                            this.field285 = new int[var25];
                            int var28 = 0;
                            int var29 = (this.field303 - 6) / 8;
                            while (true) {
                                if (var29 > (this.field303 + 6) / 8) {
                                    break label1245;
                                }
                                for (int var30 = (this.field304 - 6) / 8; var30 <= (this.field304 + 6) / 8; ++var30) {
                                    this.field283[var28] = (var29 << 8) + var30;
                                    if (this.field407 && (var30 == 49 || var30 == 149 || var30 == 147 || var29 == 50 || var29 == 49 && var30 == 47)) {
                                        this.field284[var28] = -1;
                                        this.field285[var28] = -1;
                                        ++var28;
                                    } else {
                                        int var31 = this.field284[var28] = this.field369.method308(false, var29, 0, var30);
                                        if (var31 != -1) {
                                            this.field369.method321(3, var31);
                                        }
                                        int var32 = this.field285[var28] = this.field369.method308(false, var29, 1, var30);
                                        if (var32 != -1) {
                                            this.field369.method321(3, var32);
                                        }
                                        ++var28;
                                    }
                                }
                                ++var29;
                            }
                        }
                        for (int var27 = (this.field304 - 6) / 8; var27 <= (this.field304 + 6) / 8; ++var27) {
                            ++var25;
                        }
                        ++var26;
                    }
                }
                if (this.field488 == 5) {
                    int var33 = 0;
                    int[] var34 = new int[676];
                    int var35 = 0;
                    label1206: while (true) {
                        if (var35 >= 4) {
                            this.field144 = new byte[var33][];
                            this.field492 = new byte[var33][];
                            this.field283 = new int[var33];
                            this.field284 = new int[var33];
                            this.field285 = new int[var33];
                            int var43 = 0;
                            while (true) {
                                if (var43 >= var33) {
                                    break label1206;
                                }
                                int var44 = this.field283[var43] = var34[var43];
                                int var45 = var44 >> 8 & 255;
                                int var46 = var44 & 255;
                                int var47 = this.field284[var43] = this.field369.method308(false, var45, 0, var46);
                                if (var47 != -1) {
                                    this.field369.method321(3, var47);
                                }
                                int var48 = this.field285[var43] = this.field369.method308(false, var45, 1, var46);
                                if (var48 != -1) {
                                    this.field369.method321(3, var48);
                                }
                                ++var43;
                            }
                        }
                        for (int var36 = 0; var36 < 13; ++var36) {
                            for (int var37 = 0; var37 < 13; ++var37) {
                                int var38 = this.field392[var35][var36][var37];
                                if (var38 != -1) {
                                    int var39 = var38 >> 14 & 1023;
                                    int var40 = var38 >> 3 & 2047;
                                    int var41 = (var39 / 8 << 8) + var40 / 8;
                                    for (int var42 = 0; var42 < var33; ++var42) {
                                        if (var34[var42] == var41) {
                                            var41 = -1;
                                            break;
                                        }
                                    }
                                    if (var41 != -1) {
                                        var34[var33++] = var41;
                                    }
                                }
                            }
                        }
                        ++var35;
                    }
                }
                int var49 = this.field363 - this.field365;
                int var50 = this.field364 - this.field366;
                this.field365 = this.field363;
                this.field366 = this.field364;
                for (int var51 = 0; var51 < 16384; ++var51) {
                    class45 var52 = this.field194[var51];
                    if (var52 != null) {
                        for (int var53 = 0; var53 < 10; ++var53) {
                            var52.field1034[var53] -= var49;
                            var52.field1035[var53] -= var50;
                        }
                        var52.field1059 -= var49 * 128;
                        var52.field1060 -= var50 * 128;
                    }
                }
                for (int var54 = 0; var54 < this.field339; ++var54) {
                    class66 var55 = this.field341[var54];
                    if (var55 != null) {
                        for (int var56 = 0; var56 < 10; ++var56) {
                            var55.field1034[var56] -= var49;
                            var55.field1035[var56] -= var50;
                        }
                        var55.field1059 -= var49 * 128;
                        var55.field1060 -= var50 * 128;
                    }
                }
                this.field251 = true;
                byte var57 = 0;
                byte var58 = 104;
                byte var59 = 1;
                if (var49 < 0) {
                    var57 = 103;
                    var58 = -1;
                    var59 = -1;
                }
                byte var60 = 0;
                byte var61 = 104;
                byte var62 = 1;
                if (var50 < 0) {
                    var60 = 103;
                    var61 = -1;
                    var62 = -1;
                }
                for (int var63 = var57; var58 != var63; var63 += var59) {
                    for (int var64 = var60; var61 != var64; var64 += var62) {
                        int var65 = var49 + var63;
                        int var66 = var50 + var64;
                        for (int var67 = 0; var67 < 4; ++var67) {
                            if (var65 >= 0 && var66 >= 0 && var65 < 104 && var66 < 104) {
                                this.field437[var67][var63][var64] = this.field437[var67][var65][var66];
                            } else {
                                this.field437[var67][var63][var64] = null;
                            }
                        }
                    }
                }
                for (class24 var68 = (class24) this.field242.method470(); var68 != null; var68 = (class24) this.field242.method472(false)) {
                    var68.field886 -= var49;
                    var68.field887 -= var50;
                    if (var68.field886 < 0 || var68.field887 < 0 || var68.field886 >= 104 || var68.field887 >= 104) {
                        var68.method338();
                    }
                }
                if (this.field401 != 0) {
                    this.field401 -= var49;
                    this.field402 -= var50;
                }
                this.field338 = false;
                this.field488 = -1;
                return true;
            } catch (IOException var192) {
                this.method99(-602);
            } catch (Exception var193) {
                String var189 = "T2 - " + this.field488 + "," + this.field575 + "," + this.field576 + " - " + this.field487 + "," + (field612.field1034[0] + this.field363) + "," + (field612.field1035[0] + this.field364) + " - ";
                for (int var190 = 0; var190 < this.field487 && var190 < 50; ++var190) {
                    var189 = var189 + this.field455.field706[var190] + ",";
                }
                signlink.reporterror(var189);
                this.method159(-121);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILEMWAMCXW;I)V")
    public final void method113(int arg0, class14 arg1, int arg2) {
        if (arg0 >= 0) {
            this.field189 = !this.field189;
        }
        if (arg2 == 216) {
            int var4 = arg1.method217();
            int var5 = (var4 >> 4 & 7) + this.field327;
            int var6 = (var4 & 7) + this.field328;
            int var7 = arg1.method219();
            int var8 = arg1.method217();
            int var9 = arg1.method219();
            if (var5 >= 0 && var6 >= 0 && var5 < 104 && var6 < 104) {
                int var10 = var5 * 128 + 64;
                int var11 = var6 * 128 + 64;
                class41 var12 = new class41(this.field596, var7, var10, this.method114(this.field596, var10, 1, var11) - var8, var11, var9, field257, 0);
                this.field605.method467(var12);
            }
        } else if (arg2 == 19) {
            int var13 = arg1.method217();
            int var14 = (var13 >> 4 & 7) + this.field327;
            int var15 = (var13 & 7) + this.field328;
            int var16 = arg1.method219();
            int var17 = arg1.method219();
            int var18 = arg1.method219();
            if (var14 >= 0 && var15 >= 0 && var14 < 104 && var15 < 104) {
                class57 var19 = this.field437[this.field596][var14][var15];
                if (var19 != null) {
                    for (class4 var20 = (class4) var19.method470(); var20 != null; var20 = (class4) var19.method472(false)) {
                        if ((var16 & 32767) == var20.field117 && var20.field116 == var17) {
                            var20.field116 = var18;
                            break;
                        }
                    }
                    this.method111(var14, var15);
                }
            }
        } else {
            if (arg2 == 236) {
                int var21 = arg1.method217();
                int var22 = (var21 >> 4 & 7) + this.field327;
                int var23 = (var21 & 7) + this.field328;
                int var24 = arg1.method219();
                int var25 = arg1.method217();
                int var26 = var25 >> 4 & 15;
                int var27 = var25 & 7;
                if (field612.field1034[0] >= var22 - var26 && field612.field1034[0] <= var22 + var26 && field612.field1035[0] >= var23 - var26 && field612.field1035[0] <= var23 + var26 && this.field563 && !field271 && this.field374 < 50) {
                    this.field382[this.field374] = var24;
                    this.field524[this.field374] = var27;
                    this.field208[this.field374] = class28.field973[var24];
                    ++this.field374;
                }
            }
            if (arg2 == 231) {
                int var28 = arg1.method219();
                int var29 = arg1.method219();
                byte var30 = arg1.method240(false);
                byte var31 = arg1.method239(this.field140);
                int var32 = arg1.method238((byte) 93);
                int var33 = var32 >> 2;
                int var34 = var32 & 3;
                int var35 = this.field614[var33];
                byte var36 = arg1.method240(false);
                int var37 = arg1.method238((byte) 93);
                int var38 = (var37 >> 4 & 7) + this.field327;
                int var39 = (var37 & 7) + this.field328;
                byte var40 = arg1.method241(-367);
                int var41 = arg1.method247(-110);
                int var42 = arg1.method246(633);
                class66 var43;
                if (this.field222 == var41) {
                    var43 = field612;
                } else {
                    var43 = this.field341[var41];
                }
                if (var43 != null) {
                    class1 var44 = class1.method4(var28);
                    int var45 = this.field230[this.field596][var38][var39];
                    int var46 = this.field230[this.field596][var38 + 1][var39];
                    int var47 = this.field230[this.field596][var38 + 1][var39 + 1];
                    int var48 = this.field230[this.field596][var38][var39 + 1];
                    class18 var49 = var44.method5(var33, var34, var45, var46, var47, var48, -1);
                    if (var49 != null) {
                        this.method169(-1, 0, 0, 0, this.field596, var29 + 1, var38, var35, var42 + 1, var39);
                        var43.field1571 = field257 + var29;
                        var43.field1572 = field257 + var42;
                        var43.field1579 = var49;
                        int var50 = var44.field22;
                        int var51 = var44.field32;
                        if (var34 == 1 || var34 == 3) {
                            var50 = var44.field32;
                            var51 = var44.field22;
                        }
                        var43.field1576 = var38 * 128 + var50 * 64;
                        var43.field1578 = var39 * 128 + var51 * 64;
                        var43.field1577 = this.method114(this.field596, var43.field1576, 1, var43.field1578);
                        if (var36 > var30) {
                            byte var52 = var36;
                            var36 = var30;
                            var30 = var52;
                        }
                        if (var40 > var31) {
                            byte var53 = var40;
                            var40 = var31;
                            var31 = var53;
                        }
                        var43.field1562 = var36 + var38;
                        var43.field1564 = var30 + var38;
                        var43.field1563 = var39 + var40;
                        var43.field1565 = var31 + var39;
                    }
                }
            }
            if (arg2 == 94) {
                int var54 = arg1.method246(633);
                int var55 = arg1.method217();
                int var56 = (var55 >> 4 & 7) + this.field327;
                int var57 = (var55 & 7) + this.field328;
                int var58 = arg1.method247(-110);
                if (var56 >= 0 && var57 >= 0 && var56 < 104 && var57 < 104) {
                    class4 var59 = new class4();
                    var59.field117 = var54;
                    var59.field116 = var58;
                    if (this.field437[this.field596][var56][var57] == null) {
                        this.field437[this.field596][var56][var57] = new class57(36113);
                    }
                    this.field437[this.field596][var56][var57].method467(var59);
                    this.method111(var56, var57);
                }
            } else if (arg2 == 87) {
                int var60 = arg1.method217();
                int var61 = (var60 >> 4 & 7) + this.field327;
                int var62 = (var60 & 7) + this.field328;
                int var63 = arg1.method217();
                int var64 = var63 >> 2;
                int var65 = var63 & 3;
                int var66 = this.field614[var64];
                if (var61 >= 0 && var62 >= 0 && var61 < 104 && var62 < 104) {
                    this.method169(-1, var64, 0, var65, this.field596, 0, var61, var66, -1, var62);
                }
            } else if (arg2 == 65) {
                int var67 = arg1.method217();
                int var68 = (var67 >> 4 & 7) + this.field327;
                int var69 = (var67 & 7) + this.field328;
                int var70 = var68 + arg1.method218();
                int var71 = var69 + arg1.method218();
                int var72 = arg1.method220();
                int var73 = arg1.method219();
                int var74 = arg1.method217() * 4;
                int var75 = arg1.method217() * 4;
                int var76 = arg1.method219();
                int var77 = arg1.method219();
                int var78 = arg1.method217();
                int var79 = arg1.method217();
                if (var68 >= 0 && var69 >= 0 && var68 < 104 && var69 < 104 && var70 >= 0 && var71 >= 0 && var70 < 104 && var71 < 104 && var73 != 65535) {
                    int var80 = var68 * 128 + 64;
                    int var81 = var69 * 128 + 64;
                    int var82 = var70 * 128 + 64;
                    int var83 = var71 * 128 + 64;
                    class58 var84 = new class58(field257 + var76, var81, var78, 0, var75, field257 + var77, var73, this.field596, var80, var72, var79, this.method114(this.field596, var80, 1, var81) - var74);
                    var84.method476(var83, var82, field257 + var76, -458, this.method114(this.field596, var82, 1, var83) - var75);
                    this.field139.method467(var84);
                }
            } else if (arg2 != 93) {
                if (arg2 == 103) {
                    int var91 = arg1.method238((byte) 93);
                    int var92 = var91 >> 2;
                    int var93 = var91 & 3;
                    int var94 = this.field614[var92];
                    int var95 = arg1.method245(-485);
                    int var96 = arg1.method236(29396);
                    int var97 = (var96 >> 4 & 7) + this.field327;
                    int var98 = (var96 & 7) + this.field328;
                    if (var97 >= 0 && var98 >= 0 && var97 < 103 && var98 < 103) {
                        int var99 = this.field230[this.field596][var97][var98];
                        int var100 = this.field230[this.field596][var97 + 1][var98];
                        int var101 = this.field230[this.field596][var97 + 1][var98 + 1];
                        int var102 = this.field230[this.field596][var97][var98 + 1];
                        if (var94 == 0) {
                            class31 var103 = this.field202.method538(var98, this.field596, 0, var97);
                            if (var103 != null) {
                                int var104 = var103.field1000 >> 14 & 32767;
                                if (var92 == 2) {
                                    var103.field998 = new class40(var101, var102, var93 + 4, 2, var99, var104, var100, var95, (byte) 5, false);
                                    var103.field999 = new class40(var101, var102, var93 + 1 & 3, 2, var99, var104, var100, var95, (byte) 5, false);
                                } else {
                                    var103.field998 = new class40(var101, var102, var93, var92, var99, var104, var100, var95, (byte) 5, false);
                                }
                            }
                        }
                        if (var94 == 1) {
                            class37 var105 = this.field202.method539(this.field596, var98, var97, 0);
                            if (var105 != null) {
                                var105.field1095 = new class40(var101, var102, 0, 4, var99, var105.field1096 >> 14 & 32767, var100, var95, (byte) 5, false);
                            }
                        }
                        if (var94 == 2) {
                            class9 var106 = this.field202.method540(var98, (byte) 2, var97, this.field596);
                            if (var92 == 11) {
                                var92 = 10;
                            }
                            if (var106 != null) {
                                var106.field657 = new class40(var101, var102, var93, var92, var99, var106.field665 >> 14 & 32767, var100, var95, (byte) 5, false);
                            }
                        }
                        if (var94 == 3) {
                            class61 var107 = this.field202.method541(var98, 186, this.field596, var97);
                            if (var107 != null) {
                                var107.field1530 = new class40(var101, var102, var93, 22, var99, var107.field1531 >> 14 & 32767, var100, var95, (byte) 5, false);
                            }
                        }
                    }
                } else if (arg2 == 131) {
                    int var108 = arg1.method219();
                    int var109 = arg1.method247(-110);
                    int var110 = arg1.method247(-110);
                    int var111 = arg1.method237(true);
                    int var112 = (var111 >> 4 & 7) + this.field327;
                    int var113 = (var111 & 7) + this.field328;
                    if (var112 >= 0 && var113 >= 0 && var112 < 104 && var113 < 104 && this.field222 != var108) {
                        class4 var114 = new class4();
                        var114.field117 = var109;
                        var114.field116 = var110;
                        if (this.field437[this.field596][var112][var113] == null) {
                            this.field437[this.field596][var112][var113] = new class57(36113);
                        }
                        this.field437[this.field596][var112][var113].method467(var114);
                        this.method111(var112, var113);
                    }
                } else if (arg2 == 191) {
                    int var115 = arg1.method238((byte) 93);
                    int var116 = var115 >> 2;
                    int var117 = var115 & 3;
                    int var118 = this.field614[var116];
                    int var119 = arg1.method217();
                    int var120 = (var119 >> 4 & 7) + this.field327;
                    int var121 = (var119 & 7) + this.field328;
                    int var122 = arg1.method219();
                    if (var120 >= 0 && var121 >= 0 && var120 < 104 && var121 < 104) {
                        this.method169(var122, var116, 0, var117, this.field596, 0, var120, var118, -1, var121);
                    }
                }
            } else {
                int var85 = arg1.method245(-485);
                int var86 = arg1.method238((byte) 93);
                int var87 = (var86 >> 4 & 7) + this.field327;
                int var88 = (var86 & 7) + this.field328;
                if (var87 >= 0 && var88 >= 0 && var87 < 104 && var88 < 104) {
                    class57 var89 = this.field437[this.field596][var87][var88];
                    if (var89 != null) {
                        for (class4 var90 = (class4) var89.method470(); var90 != null; var90 = (class4) var89.method472(false)) {
                            if ((var85 & 32767) == var90.field117) {
                                var90.method338();
                                break;
                            }
                        }
                        if (var89.method470() == null) {
                            this.field437[this.field596][var87][var88] = null;
                        }
                        this.method111(var87, var88);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)I")
    public final int method114(int arg0, int arg1, int arg2, int arg3) {
        if (arg2 != 1) {
            return 0;
        } else {
            int var5 = arg1 >> 7;
            int var6 = arg3 >> 7;
            if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
                int var7 = arg0;
                if (arg0 < 3 && (this.field192[1][var5][var6] & 2) == 2) {
                    var7 = arg0 + 1;
                }
                int var8 = arg1 & 127;
                int var9 = arg3 & 127;
                int var10 = (128 - var8) * this.field230[var7][var5][var6] + this.field230[var7][var5 + 1][var6] * var8 >> 7;
                int var11 = (128 - var8) * this.field230[var7][var5][var6 + 1] + this.field230[var7][var5 + 1][var6 + 1] * var8 >> 7;
                return (128 - var9) * var10 + var9 * var11 >> 7;
            } else {
                return 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LEMWAMCXW;ZI)V")
    private final void method115(class14 arg0, boolean arg1, int arg2) {
        this.field600 = 0;
        this.field344 = 0;
        this.method168(0, arg0, arg2);
        if (!arg1) {
            this.field488 = arg0.method217();
        }
        this.method116(0, arg0, arg2);
        this.method59((byte) -72, arg0, arg2);
        for (int var4 = 0; var4 < this.field600; ++var4) {
            int var6 = this.field601[var4];
            if (field257 != this.field194[var6].field1058) {
                this.field194[var6].field1259 = null;
                this.field194[var6] = null;
            }
        }
        if (arg0.field707 != arg2) {
            signlink.reporterror(this.field478 + " size mismatch in getnpcpos - pos:" + arg0.field707 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field195; ++var5) {
                if (this.field194[this.field196[var5]] == null) {
                    signlink.reporterror(this.field478 + " null entry in npc list - pos:" + var5 + " size:" + this.field195);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILEMWAMCXW;I)V")
    private final void method116(int arg0, class14 arg1, int arg2) {
        while (true) {
            if (arg1.field708 + 21 < arg2 * 8) {
                int var4 = arg1.method228(14, 4);
                if (var4 != 16383) {
                    if (this.field194[var4] == null) {
                        this.field194[var4] = new class45();
                    }
                    class45 var5 = this.field194[var4];
                    this.field196[this.field195++] = var4;
                    var5.field1058 = field257;
                    int var6 = arg1.method228(1, 4);
                    if (var6 == 1) {
                        this.field345[this.field344++] = var4;
                    }
                    int var7 = arg1.method228(5, 4);
                    if (var7 > 15) {
                        var7 -= 32;
                    }
                    int var8 = arg1.method228(1, 4);
                    int var9 = arg1.method228(5, 4);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.field1259 = class67.method509(arg1.method228(13, 4));
                    var5.field1070 = var5.field1259.field1625;
                    var5.field1052 = var5.field1259.field1619;
                    var5.field1036 = var5.field1259.field1630;
                    var5.field1037 = var5.field1259.field1626;
                    var5.field1038 = var5.field1259.field1612;
                    var5.field1039 = var5.field1259.field1629;
                    var5.field1040 = var5.field1259.field1592;
                    var5.method339(field612.field1035[0] + var7, var8 == 1, this.field324, field612.field1034[0] + var9);
                    continue;
                }
            }
            arg1.method229((byte) 92);
            if (arg0 != 0) {
                this.field437 = null;
                return;
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method117(int arg0, long arg1) {
        if (arg0 != 7) {
            this.field182 = -402;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field577; ++var4) {
                if (this.field267[var4] == arg1) {
                    --this.field577;
                    this.field348 = true;
                    for (int var5 = var4; var5 < this.field577; ++var5) {
                        this.field267[var5] = this.field267[var5 + 1];
                    }
                    this.field188.method206(247, 533);
                    this.field188.method213(arg1, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public void method118(boolean arg0) {
        System.out.println("============");
        System.out.println("flame-cycle:" + this.field598);
        if (!arg0) {
            this.method81();
        }
        if (this.field369 != null) {
            System.out.println("Od-cycle:" + this.field369.field961);
        }
        System.out.println("loop-cycle:" + field257);
        System.out.println("draw-cycle:" + field331);
        System.out.println("ptype:" + this.field488);
        System.out.println("psize:" + this.field487);
        if (this.field503 != null) {
            this.field503.method192(field426);
        }
        super.field1361 = true;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)Ljava/awt/Component;")
    public final Component method119(byte arg0) {
        if (arg0 != 75) {
            throw new NullPointerException();
        } else if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1367 != null ? super.field1367 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method120(byte arg0) {
        if (this.field388 == 0) {
            this.field332[0] = "Cancel";
            this.field518[0] = 1196;
            this.field419 = 1;
            if (this.field333 != -1) {
                this.field408 = 0;
                this.field461 = 0;
                this.method46(0, class44.method380(this.field333), 0, 0, super.field1372, 0, super.field1373, 250);
                if (this.field500 != this.field408) {
                    this.field500 = this.field408;
                }
                if (this.field461 != this.field459) {
                    this.field459 = this.field461;
                }
            } else {
                this.method139(454);
                this.field408 = 0;
                this.field461 = 0;
                if (super.field1372 > 4 && super.field1373 > 4 && super.field1372 < 516 && super.field1373 < 338) {
                    if (this.field236 != -1) {
                        this.method46(0, class44.method380(this.field236), 4, 4, super.field1372, 0, super.field1373, 250);
                    } else {
                        this.method44(0);
                    }
                }
                if (this.field500 != this.field408) {
                    this.field500 = this.field408;
                }
                if (this.field461 != this.field459) {
                    this.field459 = this.field461;
                }
                this.field408 = 0;
                this.field461 = 0;
                if (super.field1372 > 553 && super.field1373 > 205 && super.field1372 < 743 && super.field1373 < 466) {
                    if (this.field422 != -1) {
                        this.method46(0, class44.method380(this.field422), 553, 205, super.field1372, 1, super.field1373, 250);
                    } else if (this.field220[this.field168] != -1) {
                        this.method46(0, class44.method380(this.field220[this.field168]), 553, 205, super.field1372, 1, super.field1373, 250);
                    }
                }
                if (this.field408 != this.field181) {
                    this.field348 = true;
                    this.field181 = this.field408;
                }
                if (this.field461 != this.field184) {
                    this.field348 = true;
                    this.field184 = this.field461;
                }
                this.field408 = 0;
                this.field461 = 0;
                if (super.field1372 > 17 && super.field1373 > 357 && super.field1372 < 496 && super.field1373 < 453) {
                    if (this.field234 != -1) {
                        this.method46(0, class44.method380(this.field234), 17, 357, super.field1372, 2, super.field1373, 250);
                    } else if (this.field529 != -1) {
                        this.method46(0, class44.method380(this.field529), 17, 357, super.field1372, 3, super.field1373, 250);
                    } else if (super.field1373 < 434 && super.field1372 < 426 && this.field483 == 0) {
                        this.method186(super.field1373 - 357, -16295, super.field1372 - 17);
                    }
                }
                if ((this.field234 != -1 || this.field529 != -1) && this.field408 != this.field298) {
                    this.field275 = true;
                    this.field298 = this.field408;
                }
                if ((this.field234 != -1 || this.field529 != -1) && this.field461 != this.field326) {
                    this.field275 = true;
                    this.field326 = this.field461;
                }
                boolean var2 = false;
                if (arg0 != 54) {
                    this.field174 = 434;
                }
                while (!var2) {
                    var2 = true;
                    for (int var3 = 0; var3 < this.field419 - 1; ++var3) {
                        if (this.field518[var3] < 1000 && this.field518[var3 + 1] > 1000) {
                            String var4 = this.field332[var3];
                            this.field332[var3] = this.field332[var3 + 1];
                            this.field332[var3 + 1] = var4;
                            int var5 = this.field518[var3];
                            this.field518[var3] = this.field518[var3 + 1];
                            this.field518[var3 + 1] = var5;
                            int var6 = this.field516[var3];
                            this.field516[var3] = this.field516[var3 + 1];
                            this.field516[var3 + 1] = var6;
                            int var7 = this.field517[var3];
                            this.field517[var3] = this.field517[var3 + 1];
                            this.field517[var3 + 1] = var7;
                            int var8 = this.field519[var3];
                            this.field519[var3] = this.field519[var3 + 1];
                            this.field519[var3 + 1] = var8;
                            var2 = false;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)Ljava/lang/String;")
    public final String method121(int arg0, boolean arg1) {
        this.field466 &= arg1;
        return arg0 < 999999999 ? String.valueOf(arg0) : "*";
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZILOKXNBSEJ;)V")
    public final void method122(boolean arg0, int arg1, class36 arg2) {
        this.field466 &= arg0;
        this.method123(arg1, false, arg2.field1060, arg2.field1059);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZII)V")
    public final void method123(int arg0, boolean arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg2 >= 128 && arg3 <= 13056 && arg2 <= 13056) {
            int var5 = this.method114(this.field596, arg3, 1, arg2) - arg0;
            int var6 = arg3 - this.field581;
            int var7 = var5 - this.field582;
            int var8 = arg2 - this.field583;
            int var9 = class18.field829[this.field584];
            int var10 = class18.field830[this.field584];
            int var11 = class18.field829[this.field585];
            int var12 = class18.field830[this.field585];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            if (arg1) {
                this.field410 = -311;
            }
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (var17 >= 50) {
                this.field435 = (var13 << 9) / var17 + class39.field1111;
                this.field436 = (var16 << 9) / var17 + class39.field1112;
            } else {
                this.field435 = -1;
                this.field436 = -1;
            }
        } else {
            this.field435 = -1;
            this.field436 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public final void method124(int arg0) {
        while (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (super.field1378 == 1) {
            if (super.field1379 >= 539 && super.field1379 <= 573 && super.field1380 >= 169 && super.field1380 < 205 && this.field220[0] != -1) {
                this.field348 = true;
                this.field168 = 0;
                this.field142 = true;
            }
            if (super.field1379 >= 569 && super.field1379 <= 599 && super.field1380 >= 168 && super.field1380 < 205 && this.field220[1] != -1) {
                this.field348 = true;
                this.field168 = 1;
                this.field142 = true;
            }
            if (super.field1379 >= 597 && super.field1379 <= 627 && super.field1380 >= 168 && super.field1380 < 205 && this.field220[2] != -1) {
                this.field348 = true;
                this.field168 = 2;
                this.field142 = true;
            }
            if (super.field1379 >= 625 && super.field1379 <= 669 && super.field1380 >= 168 && super.field1380 < 203 && this.field220[3] != -1) {
                this.field348 = true;
                this.field168 = 3;
                this.field142 = true;
            }
            if (super.field1379 >= 666 && super.field1379 <= 696 && super.field1380 >= 168 && super.field1380 < 205 && this.field220[4] != -1) {
                this.field348 = true;
                this.field168 = 4;
                this.field142 = true;
            }
            if (super.field1379 >= 694 && super.field1379 <= 724 && super.field1380 >= 168 && super.field1380 < 205 && this.field220[5] != -1) {
                this.field348 = true;
                this.field168 = 5;
                this.field142 = true;
            }
            if (super.field1379 >= 722 && super.field1379 <= 756 && super.field1380 >= 169 && super.field1380 < 205 && this.field220[6] != -1) {
                this.field348 = true;
                this.field168 = 6;
                this.field142 = true;
            }
            if (super.field1379 >= 540 && super.field1379 <= 574 && super.field1380 >= 466 && super.field1380 < 502 && this.field220[7] != -1) {
                this.field348 = true;
                this.field168 = 7;
                this.field142 = true;
            }
            if (super.field1379 >= 572 && super.field1379 <= 602 && super.field1380 >= 466 && super.field1380 < 503 && this.field220[8] != -1) {
                this.field348 = true;
                this.field168 = 8;
                this.field142 = true;
            }
            if (super.field1379 >= 599 && super.field1379 <= 629 && super.field1380 >= 466 && super.field1380 < 503 && this.field220[9] != -1) {
                this.field348 = true;
                this.field168 = 9;
                this.field142 = true;
            }
            if (super.field1379 >= 627 && super.field1379 <= 671 && super.field1380 >= 467 && super.field1380 < 502 && this.field220[10] != -1) {
                this.field348 = true;
                this.field168 = 10;
                this.field142 = true;
            }
            if (super.field1379 >= 669 && super.field1379 <= 699 && super.field1380 >= 466 && super.field1380 < 503 && this.field220[11] != -1) {
                this.field348 = true;
                this.field168 = 11;
                this.field142 = true;
            }
            if (super.field1379 >= 696 && super.field1379 <= 726 && super.field1380 >= 466 && super.field1380 < 503 && this.field220[12] != -1) {
                this.field348 = true;
                this.field168 = 12;
                this.field142 = true;
            }
            if (super.field1379 >= 724 && super.field1379 <= 758 && super.field1380 >= 466 && super.field1380 < 502 && this.field220[13] != -1) {
                this.field348 = true;
                this.field168 = 13;
                this.field142 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQXTIWHBH;)Z")
    public final boolean method125(int arg0, class44 arg1) {
        if (arg0 < 5 || arg0 > 5) {
            this.method81();
        }
        int var3 = arg1.field1237;
        if (this.field335 == 2) {
            if (var3 == 201) {
                this.field275 = true;
                this.field483 = 0;
                this.field219 = true;
                this.field372 = "";
                this.field427 = 1;
                this.field508 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field275 = true;
                this.field483 = 0;
                this.field219 = true;
                this.field372 = "";
                this.field427 = 2;
                this.field508 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field491 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field275 = true;
                this.field483 = 0;
                this.field219 = true;
                this.field372 = "";
                this.field427 = 4;
                this.field508 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field275 = true;
                this.field483 = 0;
                this.field219 = true;
                this.field372 = "";
                this.field427 = 5;
                this.field508 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field299[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class43.field1171 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class43.field1171) {
                                var6 = 0;
                            }
                        }
                        if (!class43.field1172[var6].field1178 && class43.field1172[var6].field1173 == var4 + (this.field376 ? 0 : 7)) {
                            this.field299[var4] = var6;
                            this.field624 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field485[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field245[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field245[var7].length) {
                        var9 = 0;
                    }
                }
                this.field485[var7] = var9;
                this.field624 = true;
            }
            if (var3 == 324 && !this.field376) {
                this.field376 = true;
                this.method106(-391);
            }
            if (var3 == 325 && this.field376) {
                this.field376 = false;
                this.method106(-391);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field525 = !this.field525;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method127(-744);
                    if (this.field571.length() > 0) {
                        this.field188.method206(255, 533);
                        this.field188.method213(class56.method461(this.field571), false);
                        this.field188.method207(var3 - 601);
                        this.field188.method207(this.field525 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field188.method206(19, 533);
                this.field188.method207(this.field376 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field188.method207(this.field299[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field188.method207(this.field485[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LEMWAMCXW;II)V")
    private final void method126(class14 arg0, int arg1, int arg2) {
        this.field600 = 0;
        this.field344 = 0;
        while (arg1 >= 0) {
            this.field488 = arg0.method217();
        }
        this.method97((byte) 7, arg0, arg2);
        this.method170(arg0, 671, arg2);
        this.method58(1, arg2, arg0);
        this.method51(arg2, arg0, -79);
        for (int var4 = 0; var4 < this.field600; ++var4) {
            int var6 = this.field601[var4];
            if (field257 != this.field341[var6].field1058) {
                this.field341[var6] = null;
            }
        }
        if (arg0.field707 != arg2) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field707 + " psize:" + arg2);
            throw new RuntimeException("eek");
        } else {
            for (int var5 = 0; var5 < this.field342; ++var5) {
                if (this.field341[this.field343[var5]] == null) {
                    signlink.reporterror(this.field478 + " null entry in pl list - pos:" + var5 + " size:" + this.field342);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method127(int arg0) {
        this.field188.method206(94, 533);
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field422 != -1) {
            this.method75(this.field422, 43360);
            this.field422 = -1;
            this.field348 = true;
            this.field566 = false;
            this.field142 = true;
        }
        if (this.field234 != -1) {
            this.method75(this.field234, 43360);
            this.field234 = -1;
            this.field275 = true;
            this.field566 = false;
        }
        if (this.field333 != -1) {
            this.method75(this.field333, 43360);
            this.field333 = -1;
            this.field587 = true;
        }
        if (this.field592 != -1) {
            this.method75(this.field592, 43360);
            this.field592 = -1;
        }
        if (this.field236 != -1) {
            this.method75(this.field236, 43360);
            this.field236 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILQXTIWHBH;)Z")
    public final boolean method128(int arg0, class44 arg1) {
        while (arg0 >= 0) {
            this.method81();
        }
        if (arg1.field1206 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1206.length; ++var3) {
                int var4 = this.method180(1, var3, arg1);
                int var5 = arg1.field1232[var3];
                if (arg1.field1206[var3] == 2) {
                    if (var4 >= var5) {
                        return false;
                    }
                } else if (arg1.field1206[var3] == 3) {
                    if (var4 <= var5) {
                        return false;
                    }
                } else if (arg1.field1206[var3] == 4) {
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

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)V")
    public final void method129(boolean arg0) {
        this.field179.method477(422);
        class39.field1117 = this.field414;
        this.field477.method198(-24669, 0, 0);
        if (!arg0) {
            this.field610 = -22;
        }
        if (this.field219) {
            this.field150.method481(this.field508, 936, 0, 239, 40);
            this.field150.method481(this.field372 + "*", 936, 128, 239, 60);
        } else if (this.field483 == 1) {
            this.field150.method481("Enter amount:", 936, 0, 239, 40);
            this.field150.method481(this.field379 + "*", 936, 128, 239, 60);
        } else if (this.field483 == 2) {
            this.field150.method481("Enter name:", 936, 0, 239, 40);
            this.field150.method481(this.field379 + "*", 936, 128, 239, 60);
        } else if (this.field483 == 3) {
            if (this.field379 != this.field214) {
                this.method71((byte) -42, this.field379);
                this.field214 = this.field379;
            }
            class62 var2 = this.field149;
            class2.method14(463, 0, 77, 0, 357);
            for (int var3 = 0; var3 < this.field215; ++var3) {
                int var4 = var3 * 14 + 18 - this.field218;
                if (var4 > 0 && var4 < 110) {
                    var2.method481(this.field216[var3], 936, 0, 239, var4);
                }
            }
            class2.method13(-15334);
            if (this.field215 > 5) {
                this.method152(0, this.field215 * 14 + 7, this.field218, 77, 9, 463);
            }
            if (this.field379.length() == 0) {
                this.field150.method481("Enter object name", 936, 255, 239, 40);
            } else if (this.field215 == 0) {
                this.field150.method481("No matching objects found, please shorten search", 936, 0, 239, 40);
            }
            var2.method481(this.field379 + "*", 936, 0, 239, 90);
            class2.method20(0, 129, 77, 479, 0);
        } else if (this.field433 != null) {
            this.field150.method481(this.field433, 936, 0, 239, 40);
            this.field150.method481("Click to continue", 936, 128, 239, 60);
        } else if (this.field234 != -1) {
            this.method183(0, class44.method380(this.field234), (byte) 27, 0, 0);
        } else if (this.field529 != -1) {
            this.method183(0, class44.method380(this.field529), (byte) 27, 0, 0);
        } else {
            class62 var5 = this.field149;
            int var6 = 0;
            class2.method14(463, 0, 77, 0, 357);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field545[var7] != null) {
                    int var9 = this.field543[var7];
                    int var10 = 70 - var6 * 14 + this.field370;
                    String var11 = this.field544[var7];
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
                            var5.method485(this.field545[var7], false, 4, 0, var10);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field423 == 0 || this.field423 == 1 && this.method107(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field258[0].method198(-24669, var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field258[1].method198(-24669, var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method485(var11 + ":", false, var13, 0, var10);
                            int var14 = var13 + var5.method483(true, var11) + 8;
                            var5.method485(this.field545[var7], false, var14, 255, var10);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field221 == 0 && (var9 == 7 || this.field164 == 0 || this.field164 == 1 && this.method107(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method485("From", false, var15, 0, var10);
                            int var16 = var15 + var5.method483(true, "From ");
                            if (var12 == 1) {
                                this.field258[0].method198(-24669, var16, var10 - 12);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field258[1].method198(-24669, var16, var10 - 12);
                                var16 += 14;
                            }
                            var5.method485(var11 + ":", false, var16, 0, var10);
                            int var17 = var16 + var5.method483(true, var11) + 8;
                            var5.method485(this.field545[var7], false, var17, 8388608, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field306 == 0 || this.field306 == 1 && this.method107(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method485(var11 + " " + this.field545[var7], false, 4, 8388736, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field221 == 0 && this.field164 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method485(this.field545[var7], false, 4, 8388608, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field221 == 0 && this.field164 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method485("To " + var11 + ":", false, 4, 0, var10);
                            var5.method485(this.field545[var7], false, 12 + var5.method483(true, "To " + var11), 8388608, var10);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field306 == 0 || this.field306 == 1 && this.method107(0, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method485(var11 + " " + this.field545[var7], false, 4, 8270336, var10);
                        }
                        ++var6;
                    }
                }
            }
            class2.method13(-15334);
            this.field404 = var6 * 14 + 7;
            if (this.field404 < 78) {
                this.field404 = 78;
            }
            this.method152(0, this.field404, this.field404 - this.field370 - 77, 77, 9, 463);
            String var8;
            if (field612 != null && field612.field1587 != null) {
                var8 = field612.field1587;
            } else {
                var8 = class56.method465(-74, this.field478);
            }
            var5.method485(var8 + ":", false, 4, 0, 90);
            var5.method485(this.field443 + "*", false, 6 + var5.method483(true, var8 + ": "), 255, 90);
            class2.method20(0, 129, 77, 479, 0);
        }
        if (this.field175 && this.field223 == 2) {
            this.method63(8);
        }
        this.field179.method478(357, 17, super.field1364, false);
        this.field178.method477(422);
        class39.field1117 = this.field416;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IJ)V")
    public final void method130(int arg0, long arg1) {
        if (arg0 >= 0) {
            this.field406 = !this.field406;
        }
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field334; ++var4) {
                if (this.field373[var4] == arg1) {
                    --this.field334;
                    this.field348 = true;
                    for (int var5 = var4; var5 < this.field334; ++var5) {
                        this.field207[var5] = this.field207[var5 + 1];
                        this.field281[var5] = this.field281[var5 + 1];
                        this.field373[var5] = this.field373[var5 + 1];
                    }
                    this.field188.method206(193, 533);
                    this.field188.method213(arg1, false);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)I")
    public final int method131(int arg0, int arg1, int arg2, int arg3) {
        int var5 = 256 - arg3;
        if (arg1 != 0) {
            this.field437 = null;
        }
        return ((arg0 & 16711935) * arg3 + (arg2 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg3 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
    public final void method132(int arg0, boolean arg1, int arg2) {
        signlink.midivol = arg0;
        if (arg2 != -34172) {
            this.field188.method207(248);
        }
        if (arg1) {
            signlink.midi = "voladjust";
        }
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method133(int arg0) {
        if (this.field486 > 1) {
            --this.field486;
        }
        if (this.field491 > 0) {
            --this.field491;
        }
        for (int var2 = 0; var2 < 5 && this.method112(51); ++var2) {
        }
        if (this.field466) {
            Object var3 = this.field480.field989;
            synchronized (this.field480.field989) {
                if (!field367) {
                    this.field480.field987 = 0;
                } else if (super.field1378 != 0 || this.field480.field987 >= 40) {
                    this.field188.method206(108, 533);
                    this.field188.method207(0);
                    int var4 = this.field188.field707;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field480.field987 && var4 - this.field188.field707 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field480.field992[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field480.field988[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field480.field992[var6] == -1 && this.field480.field988[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field209 == var8 && this.field210 == var7) {
                            if (this.field336 < 2047) {
                                ++this.field336;
                            }
                        } else {
                            int var10 = var8 - this.field209;
                            this.field209 = var8;
                            int var11 = var7 - this.field210;
                            this.field210 = var7;
                            if (this.field336 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field188.method208((this.field336 << 12) + (var10 << 6) + var11);
                                this.field336 = 0;
                            } else if (this.field336 < 8) {
                                this.field188.method210((this.field336 << 19) + 8388608 + var9);
                                this.field336 = 0;
                            } else {
                                this.field188.method211((this.field336 << 19) + -1073741824 + var9);
                                this.field336 = 0;
                            }
                        }
                    }
                    this.field188.method216(false, this.field188.field707 - var4);
                    if (var5 >= this.field480.field987) {
                        this.field480.field987 = 0;
                    } else {
                        this.field480.field987 -= var5;
                        for (int var12 = 0; var12 < this.field480.field987; ++var12) {
                            this.field480.field988[var12] = this.field480.field988[var5 + var12];
                            this.field480.field992[var12] = this.field480.field992[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1378 != 0) {
                long var13 = (super.field1381 - this.field305) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field305 = super.field1381;
                int var15 = super.field1380;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1379;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1378 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field188.method206(134, 533);
                this.field188.method251(0, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field430 > 0) {
                --this.field430;
            }
            if (super.field1382[1] == 1 || super.field1382[2] == 1 || super.field1382[3] == 1 || super.field1382[4] == 1) {
                this.field431 = true;
            }
            if (this.field431 && this.field430 <= 0) {
                this.field430 = 20;
                this.field431 = false;
                this.field188.method206(8, 533);
                this.field188.method242(this.field396, 28989);
                this.field188.method243((byte) 15, this.field395);
            }
            if (super.field1369 && !this.field329) {
                this.field329 = true;
                this.field188.method206(22, 533);
                this.field188.method207(1);
            }
            if (!super.field1369 && this.field329) {
                this.field329 = false;
                this.field188.method206(22, 533);
                this.field188.method207(0);
            }
            this.method95(false);
            this.method142(false);
            this.method68(-58);
            ++this.field489;
            if (this.field489 > 750) {
                this.method99(-602);
            }
            this.method72(-410);
            this.method143(true);
            this.method161(-88);
            ++field241;
            if (field241 > 114) {
                field241 = 0;
                this.field188.method206(42, 533);
                this.field188.method210(9592457);
            }
            ++this.field356;
            if (this.field591 != 0) {
                this.field590 += 20;
                if (this.field590 >= 400) {
                    this.field591 = 0;
                }
            }
            if (this.field497 != 0) {
                ++this.field494;
                if (this.field494 >= 15) {
                    if (this.field497 == 2) {
                        this.field348 = true;
                    }
                    if (this.field497 == 3) {
                        this.field275 = true;
                    }
                    this.field497 = 0;
                }
            }
            if (this.field388 != 0) {
                ++this.field206;
                if (super.field1372 > this.field389 + 5 || super.field1372 < this.field389 - 5 || super.field1373 > this.field390 + 5 || super.field1373 < this.field390 - 5) {
                    this.field493 = true;
                }
                if (super.field1371 == 0) {
                    if (this.field388 == 2) {
                        this.field348 = true;
                    }
                    if (this.field388 == 3) {
                        this.field275 = true;
                    }
                    this.field388 = 0;
                    if (this.field493 && this.field206 >= 5) {
                        this.field457 = -1;
                        this.method120((byte) 54);
                        if (this.field457 == this.field386 && this.field456 != this.field387) {
                            class44 var20 = class44.method380(this.field386);
                            byte var21 = 0;
                            if (this.field320 == 1 && var20.field1237 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1255[this.field456] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1222) {
                                int var22 = this.field387;
                                int var23 = this.field456;
                                var20.field1255[var23] = var20.field1255[var22];
                                var20.field1181[var23] = var20.field1181[var22];
                                var20.field1255[var22] = -1;
                                var20.field1181[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field387;
                                int var25 = this.field456;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method387(var24 - 1, var24, -109);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method387(var24 + 1, var24, -109);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method387(this.field456, this.field387, -109);
                            }
                            this.field188.method206(168, 533);
                            this.field188.method208(this.field456);
                            this.field188.method235(0, var21);
                            this.field188.method243((byte) 15, this.field387);
                            this.field188.method244(true, this.field386);
                        }
                    } else if ((this.field506 == 1 || this.method94(this.field419 - 1, this.field610)) && this.field419 > 2) {
                        this.method40(this.field380);
                    } else if (this.field419 > 0) {
                        this.method77(this.field419 - 1, true);
                    }
                    this.field494 = 10;
                    super.field1378 = 0;
                }
            }
            if (class68.field1678 != -1) {
                int var26 = class68.field1678;
                int var27 = class68.field1679;
                boolean var28 = this.method110(true, 0, 0, 0, 0, 0, field612.field1035[0], 0, field612.field1034[0], var26, var27, (byte) 78);
                class68.field1678 = -1;
                if (var28) {
                    this.field588 = super.field1379;
                    this.field589 = super.field1380;
                    this.field591 = 1;
                    this.field590 = 0;
                }
            }
            if (super.field1378 == 1 && this.field433 != null) {
                this.field433 = null;
                this.field275 = true;
                super.field1378 = 0;
            }
            this.method85(-9398);
            if (this.field333 == -1) {
                this.method62(200);
                this.method124(-631);
                this.method104(591);
            }
            if (super.field1371 == 1 || super.field1378 == 1) {
                ++this.field481;
            }
            if (this.field326 == 0 && this.field184 == 0 && this.field459 == 0) {
                if (this.field611 > 0) {
                    --this.field611;
                }
            } else if (this.field611 < 100) {
                ++this.field611;
                if (this.field611 == 100) {
                    if (this.field326 != 0) {
                        this.field275 = true;
                    }
                    if (this.field184 != 0) {
                        this.field348 = true;
                    }
                }
            }
            if (this.field411 == 2) {
                this.method165((byte) -38);
            }
            if (this.field411 == 2 && this.field338) {
                this.method154((byte) -115);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field573[var29]++;
            }
            this.method178(-904);
            ++super.field1370;
            if (super.field1370 > 4500) {
                this.field491 = 250;
                super.field1370 -= 500;
                this.field188.method206(69, 533);
            }
            ++this.field325;
            if (arg0 != -42550) {
                this.field380 = 80;
            }
            if (this.field325 > 500) {
                this.field325 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field361 += this.field362;
                }
                if ((var30 & 2) == 2) {
                    this.field578 += this.field579;
                }
                if ((var30 & 4) == 4) {
                    this.field185 += this.field186;
                }
            }
            if (this.field361 < -50) {
                this.field362 = 2;
            }
            if (this.field361 > 50) {
                this.field362 = -2;
            }
            if (this.field578 < -55) {
                this.field579 = 2;
            }
            if (this.field578 > 55) {
                this.field579 = -2;
            }
            if (this.field185 < -40) {
                this.field186 = 1;
            }
            if (this.field185 > 40) {
                this.field186 = -1;
            }
            ++this.field586;
            if (this.field586 > 500) {
                this.field586 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field287 += this.field288;
                }
                if ((var31 & 2) == 2) {
                    this.field276 += this.field277;
                }
            }
            if (this.field287 < -60) {
                this.field288 = 2;
            }
            if (this.field287 > 60) {
                this.field288 = -2;
            }
            if (this.field276 < -20) {
                this.field277 = 1;
            }
            if (this.field276 > 10) {
                this.field277 = -1;
            }
            ++this.field490;
            if (this.field490 > 50) {
                this.field188.method206(133, 533);
            }
            try {
                if (this.field503 != null && this.field188.field707 > 0) {
                    this.field503.method191(this.field188.field706, this.field406, 0, this.field188.field707);
                    this.field188.field707 = 0;
                    this.field490 = 0;
                }
            } catch (IOException var33) {
                this.method99(-602);
            } catch (Exception var34) {
                this.method159(-121);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method134(int arg0) {
        if (arg0 != 8) {
            field143 = -29;
        }
        if (this.field419 >= 2 || this.field197 != 0 || this.field170 != 0) {
            String var2;
            if (this.field197 == 1 && this.field419 < 2) {
                var2 = "Use " + this.field201 + " with...";
            } else if (this.field170 == 1 && this.field419 < 2) {
                var2 = this.field173 + "...";
            } else {
                var2 = this.field332[this.field419 - 1];
            }
            if (this.field419 > 2) {
                var2 = var2 + "@whi@ / " + (this.field419 - 2) + " more options";
            }
            this.field150.method490(true, 4, 15, true, var2, field257 / 1000, 16777215);
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)I")
    public final int method135(int arg0) {
        int var2 = 3;
        if (arg0 != 6) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (this.field584 < 310) {
            int var4 = this.field581 >> 7;
            int var5 = this.field583 >> 7;
            int var6 = field612.field1059 >> 7;
            int var7 = field612.field1060 >> 7;
            if ((this.field192[this.field596][var4][var5] & 4) != 0) {
                var2 = this.field596;
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
                    if ((this.field192[this.field596][var4][var5] & 4) != 0) {
                        var2 = this.field596;
                    }
                    var11 += var10;
                    if (var11 >= 65536) {
                        var11 -= 65536;
                        if (var5 < var7) {
                            ++var5;
                        } else if (var5 > var7) {
                            --var5;
                        }
                        if ((this.field192[this.field596][var4][var5] & 4) != 0) {
                            var2 = this.field596;
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
                    if ((this.field192[this.field596][var4][var5] & 4) != 0) {
                        var2 = this.field596;
                    }
                    var13 += var12;
                    if (var13 >= 65536) {
                        var13 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field192[this.field596][var4][var5] & 4) != 0) {
                            var2 = this.field596;
                        }
                    }
                }
            }
        }
        if ((this.field192[this.field596][field612.field1059 >> 7][field612.field1060 >> 7] & 4) != 0) {
            var2 = this.field596;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)I")
    public final int method136(boolean arg0) {
        int var2 = this.method114(this.field596, this.field581, 1, this.field583);
        if (arg0) {
            this.field266 = this.field243.method496();
        }
        return var2 - this.field582 < 800 && (this.field192[this.field596][this.field581 >> 7][this.field583 >> 7] & 4) != 0 ? this.field596 : 3;
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)V")
    public final void method137(int arg0) {
        if (this.field221 != 0) {
            class62 var2 = this.field149;
            int var3 = 0;
            if (this.field486 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field545[var4] != null) {
                    int var5 = this.field543[var4];
                    String var6 = this.field544[var4];
                    byte var7 = 0;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        var7 = 1;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        var7 = 2;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field164 == 0 || this.field164 == 1 && this.method107(0, var6))) {
                        int var8 = 329 - var3 * 13;
                        byte var9 = 4;
                        var2.method485("From", false, var9, 0, var8);
                        var2.method485("From", false, var9, 65535, var8 - 1);
                        int var10 = var9 + var2.method483(true, "From ");
                        if (var7 == 1) {
                            this.field258[0].method198(-24669, var10, var8 - 12);
                            var10 += 14;
                        }
                        if (var7 == 2) {
                            this.field258[1].method198(-24669, var10, var8 - 12);
                            var10 += 14;
                        }
                        var2.method485(var6 + ": " + this.field545[var4], false, var10, 0, var8);
                        var2.method485(var6 + ": " + this.field545[var4], false, var10, 65535, var8 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 5 && this.field164 < 2) {
                        int var11 = 329 - var3 * 13;
                        var2.method485(this.field545[var4], false, 4, 0, var11);
                        var2.method485(this.field545[var4], false, 4, 65535, var11 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if (var5 == 6 && this.field164 < 2) {
                        int var12 = 329 - var3 * 13;
                        var2.method485("To " + var6 + ": " + this.field545[var4], false, 4, 0, var12);
                        var2.method485("To " + var6 + ": " + this.field545[var4], false, 4, 65535, var12 - 1);
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
            this.field487 += arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    private final void method138(int arg0) {
        class24 var2 = (class24) this.field242.method470();
        while (arg0 >= 0) {
            this.method81();
        }
        while (var2 != null) {
            if (var2.field888 == -1) {
                var2.field895 = 0;
                this.method80(var2, (byte) -25);
            } else {
                var2.method338();
            }
            var2 = (class24) this.field242.method472(false);
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method139(int arg0) {
        int var2 = 15 / arg0;
        if (this.field221 != 0) {
            int var3 = 0;
            if (this.field486 != 0) {
                var3 = 1;
            }
            for (int var4 = 0; var4 < 100; ++var4) {
                if (this.field545[var4] != null) {
                    int var5 = this.field543[var4];
                    String var6 = this.field544[var4];
                    boolean var7 = false;
                    if (var6 != null && var6.startsWith("@cr1@")) {
                        var6 = var6.substring(5);
                        boolean var8 = true;
                    }
                    if (var6 != null && var6.startsWith("@cr2@")) {
                        var6 = var6.substring(5);
                        boolean var9 = true;
                    }
                    if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field164 == 0 || this.field164 == 1 && this.method107(0, var6))) {
                        int var10 = 329 - var3 * 13;
                        if (super.field1372 > 4 && super.field1373 - 4 > var10 - 10 && super.field1373 - 4 <= var10 + 3) {
                            int var11 = this.field149.method483(true, "From:  " + var6 + this.field545[var4]) + 25;
                            if (var11 > 450) {
                                var11 = 450;
                            }
                            if (super.field1372 < var11 + 4) {
                                if (this.field424 >= 1) {
                                    this.field332[this.field419] = "Report abuse @whi@" + var6;
                                    this.field518[this.field419] = 2265;
                                    ++this.field419;
                                }
                                this.field332[this.field419] = "Add ignore @whi@" + var6;
                                this.field518[this.field419] = 2723;
                                ++this.field419;
                                this.field332[this.field419] = "Add friend @whi@" + var6;
                                this.field518[this.field419] = 2066;
                                ++this.field419;
                            }
                        }
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                    if ((var5 == 5 || var5 == 6) && this.field164 < 2) {
                        ++var3;
                        if (var3 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILTFHGRYAS;)V")
    public final void method140(int arg0, int arg1, int arg2, class50 arg3) {
        if (arg2 != -33991) {
            this.field437 = null;
        }
        int var5 = arg0 * arg0 + arg1 * arg1;
        if (var5 > 4225 && var5 < 90000) {
            int var6 = this.field396 + this.field287 & 2047;
            int var7 = class18.field829[var6];
            int var8 = class18.field830[var6];
            int var9 = var7 * 256 / (this.field276 + 256);
            int var10 = var8 * 256 / (this.field276 + 256);
            int var11 = arg0 * var9 + arg1 * var10 >> 16;
            int var12 = arg0 * var10 - arg1 * var9 >> 16;
            double var13 = Math.atan2((double) var11, (double) var12);
            int var15 = (int) (Math.sin(var13) * 63.0D);
            int var16 = (int) (Math.cos(var13) * 57.0D);
            this.field400.method429(15, 15, 0, 20, 256, var15 + 94 + 4 - 10, 20, var13, 83 - var16 - 20);
        } else {
            this.method102((byte) 2, arg0, arg1, arg3);
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1367 != null) {
                    return new URL("http://127.0.0.1:" + (field269 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field531) {
            this.method162((byte) 7);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    public static final void method141(boolean arg0) {
        class68.field1644 = false;
        class39.field1106 = false;
        if (!arg0) {
            field300 = -80;
        }
        field271 = false;
        class48.field1290 = false;
        class1.field45 = false;
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    private final void method142(boolean arg0) {
        if (arg0) {
            this.field463 = -389;
        }
        if (this.field411 == 2) {
            for (class24 var2 = (class24) this.field242.method470(); var2 != null; var2 = (class24) this.field242.method472(false)) {
                if (var2.field888 > 0) {
                    --var2.field888;
                }
                if (var2.field888 == 0) {
                    if (var2.field889 < 0 || class48.method413(-164, var2.field889, var2.field891)) {
                        this.method155(var2.field886, var2.field884, var2.field889, var2.field891, var2.field885, var2.field887, 0, var2.field890);
                        var2.method338();
                    }
                } else {
                    if (var2.field895 > 0) {
                        --var2.field895;
                    }
                    if (var2.field895 == 0 && var2.field886 >= 1 && var2.field887 >= 1 && var2.field886 <= 102 && var2.field887 <= 102 && (var2.field892 < 0 || class48.method413(-164, var2.field892, var2.field894))) {
                        this.method155(var2.field886, var2.field884, var2.field892, var2.field894, var2.field885, var2.field887, 0, var2.field893);
                        var2.field895 = -1;
                        if (var2.field892 == var2.field889 && var2.field889 == -1) {
                            var2.method338();
                        } else if (var2.field892 == var2.field889 && var2.field893 == var2.field890 && var2.field894 == var2.field891) {
                            var2.method338();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method143(boolean arg0) {
        for (int var2 = 0; var2 < this.field195; ++var2) {
            int var3 = this.field196[var2];
            class45 var4 = this.field194[var3];
            if (var4 != null) {
                this.method144(var4, (byte) 9, var4.field1259.field1625);
            }
        }
        if (!arg0) {
            field393 = !field393;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOKXNBSEJ;BI)V")
    public final void method144(class36 arg0, byte arg1, int arg2) {
        if (arg0.field1059 < 128 || arg0.field1060 < 128 || arg0.field1059 >= 13184 || arg0.field1060 >= 13184) {
            arg0.field1064 = -1;
            arg0.field1042 = -1;
            arg0.field1085 = 0;
            arg0.field1086 = 0;
            arg0.field1059 = arg0.field1034[0] * 128 + arg0.field1070 * 64;
            arg0.field1060 = arg0.field1035[0] * 128 + arg0.field1070 * 64;
            arg0.method341(789);
        }
        if (field612 == arg0 && (arg0.field1059 < 1536 || arg0.field1060 < 1536 || arg0.field1059 >= 11776 || arg0.field1060 >= 11776)) {
            arg0.field1064 = -1;
            arg0.field1042 = -1;
            arg0.field1085 = 0;
            arg0.field1086 = 0;
            arg0.field1059 = arg0.field1034[0] * 128 + arg0.field1070 * 64;
            arg0.field1060 = arg0.field1035[0] * 128 + arg0.field1070 * 64;
            arg0.method341(789);
        }
        if (arg0.field1085 > field257) {
            this.method145((byte) -109, arg0);
        } else if (arg0.field1086 >= field257) {
            this.method146(arg0, 719);
        } else {
            this.method147(arg0, (byte) 3);
        }
        this.method148(arg0, false);
        if (arg1 == 9) {
            boolean var4 = false;
        } else {
            this.method81();
        }
        this.method149(-475, arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BLOKXNBSEJ;)V")
    public final void method145(byte arg0, class36 arg1) {
        int var3 = arg1.field1085 - field257;
        int var4 = arg1.field1081 * 128 + arg1.field1070 * 64;
        int var5 = arg1.field1083 * 128 + arg1.field1070 * 64;
        arg1.field1059 += (var4 - arg1.field1059) / var3;
        arg1.field1060 += (var5 - arg1.field1060) / var3;
        if (this.field484 != arg0) {
            this.field189 = !this.field189;
        }
        arg1.field1056 = 0;
        if (arg1.field1087 == 0) {
            arg1.field1055 = 1024;
        }
        if (arg1.field1087 == 1) {
            arg1.field1055 = 1536;
        }
        if (arg1.field1087 == 2) {
            arg1.field1055 = 0;
        }
        if (arg1.field1087 == 3) {
            arg1.field1055 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOKXNBSEJ;I)V")
    public final void method146(class36 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field188.method207(38);
        }
        if (field257 == arg0.field1086 || arg0.field1064 == -1 || arg0.field1067 != 0 || arg0.field1066 + 1 > class55.field1444[arg0.field1064].method459(arg0.field1065, false)) {
            int var3 = arg0.field1086 - arg0.field1085;
            int var4 = field257 - arg0.field1085;
            int var5 = arg0.field1081 * 128 + arg0.field1070 * 64;
            int var6 = arg0.field1083 * 128 + arg0.field1070 * 64;
            int var7 = arg0.field1082 * 128 + arg0.field1070 * 64;
            int var8 = arg0.field1084 * 128 + arg0.field1070 * 64;
            arg0.field1059 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field1060 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field1056 = 0;
        if (arg0.field1087 == 0) {
            arg0.field1055 = 1024;
        }
        if (arg0.field1087 == 1) {
            arg0.field1055 = 1536;
        }
        if (arg0.field1087 == 2) {
            arg0.field1055 = 0;
        }
        if (arg0.field1087 == 3) {
            arg0.field1055 = 512;
        }
        arg0.field1061 = arg0.field1055;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOKXNBSEJ;B)V")
    public final void method147(class36 arg0, byte arg1) {
        arg0.field1078 = arg0.field1040;
        if (arg0.field1069 == 0) {
            arg0.field1056 = 0;
        } else {
            if (arg0.field1064 != -1 && arg0.field1067 == 0) {
                class55 var3 = class55.field1444[arg0.field1064];
                if (arg0.field1050 > 0 && var3.field1456 == 0) {
                    ++arg0.field1056;
                    return;
                }
                if (arg0.field1050 <= 0 && var3.field1457 == 0) {
                    ++arg0.field1056;
                    return;
                }
            }
            int var4 = arg0.field1059;
            int var5 = arg0.field1060;
            int var6 = arg0.field1034[arg0.field1069 - 1] * 128 + arg0.field1070 * 64;
            int var7 = arg0.field1035[arg0.field1069 - 1] * 128 + arg0.field1070 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg0.field1055 = 1280;
                    } else if (var5 > var7) {
                        arg0.field1055 = 1792;
                    } else {
                        arg0.field1055 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg0.field1055 = 768;
                    } else if (var5 > var7) {
                        arg0.field1055 = 256;
                    } else {
                        arg0.field1055 = 512;
                    }
                } else if (var5 < var7) {
                    arg0.field1055 = 1024;
                } else {
                    arg0.field1055 = 0;
                }
                int var8 = arg0.field1055 - arg0.field1061 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg0.field1037;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg0.field1036;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg0.field1039;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg0.field1038;
                }
                if (var9 == -1) {
                    var9 = arg0.field1036;
                }
                arg0.field1078 = var9;
                int var10 = 4;
                if (arg1 != 3) {
                    for (int var11 = 1; var11 > 0; ++var11) {
                    }
                }
                if (arg0.field1061 != arg0.field1055 && arg0.field1063 == -1 && arg0.field1052 != 0) {
                    var10 = 2;
                }
                if (arg0.field1069 > 2) {
                    var10 = 6;
                }
                if (arg0.field1069 > 3) {
                    var10 = 8;
                }
                if (arg0.field1056 > 0 && arg0.field1069 > 1) {
                    var10 = 8;
                    --arg0.field1056;
                }
                if (arg0.field1051[arg0.field1069 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg0.field1078 == arg0.field1036 && arg0.field1057 != -1) {
                    arg0.field1078 = arg0.field1057;
                }
                if (var4 < var6) {
                    arg0.field1059 += var10;
                    if (arg0.field1059 > var6) {
                        arg0.field1059 = var6;
                    }
                } else if (var4 > var6) {
                    arg0.field1059 -= var10;
                    if (arg0.field1059 < var6) {
                        arg0.field1059 = var6;
                    }
                }
                if (var5 < var7) {
                    arg0.field1060 += var10;
                    if (arg0.field1060 > var7) {
                        arg0.field1060 = var7;
                    }
                } else if (var5 > var7) {
                    arg0.field1060 -= var10;
                    if (arg0.field1060 < var7) {
                        arg0.field1060 = var7;
                    }
                }
                if (arg0.field1059 == var6 && arg0.field1060 == var7) {
                    --arg0.field1069;
                    if (arg0.field1050 > 0) {
                        --arg0.field1050;
                        return;
                    }
                }
            } else {
                arg0.field1059 = var6;
                arg0.field1060 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LOKXNBSEJ;Z)V")
    public final void method148(class36 arg0, boolean arg1) {
        if (arg1) {
            this.field189 = !this.field189;
        }
        if (arg0.field1052 != 0) {
            if (arg0.field1063 != -1 && arg0.field1063 < 32768) {
                class45 var3 = this.field194[arg0.field1063];
                if (var3 != null) {
                    int var4 = arg0.field1059 - var3.field1059;
                    int var5 = arg0.field1060 - var3.field1060;
                    if (var4 != 0 || var5 != 0) {
                        arg0.field1055 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                    }
                }
            }
            if (arg0.field1063 >= 32768) {
                int var6 = arg0.field1063 - 32768;
                if (this.field222 == var6) {
                    var6 = this.field340;
                }
                class66 var7 = this.field341[var6];
                if (var7 != null) {
                    int var8 = arg0.field1059 - var7.field1059;
                    int var9 = arg0.field1060 - var7.field1060;
                    if (var8 != 0 || var9 != 0) {
                        arg0.field1055 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                    }
                }
            }
            if ((arg0.field1088 != 0 || arg0.field1089 != 0) && (arg0.field1069 == 0 || arg0.field1056 > 0)) {
                int var10 = arg0.field1059 - (arg0.field1088 - this.field363 - this.field363) * 64;
                int var11 = arg0.field1060 - (arg0.field1089 - this.field364 - this.field364) * 64;
                if (var10 != 0 || var11 != 0) {
                    arg0.field1055 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                }
                arg0.field1088 = 0;
                arg0.field1089 = 0;
            }
            int var12 = arg0.field1055 - arg0.field1061 & 2047;
            if (var12 != 0) {
                if (var12 >= arg0.field1052 && var12 <= 2048 - arg0.field1052) {
                    if (var12 > 1024) {
                        arg0.field1061 -= arg0.field1052;
                    } else {
                        arg0.field1061 += arg0.field1052;
                    }
                } else {
                    arg0.field1061 = arg0.field1055;
                }
                arg0.field1061 &= 2047;
                if (arg0.field1078 == arg0.field1040 && arg0.field1061 != arg0.field1055) {
                    if (arg0.field1041 != -1) {
                        arg0.field1078 = arg0.field1041;
                        return;
                    }
                    arg0.field1078 = arg0.field1036;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILOKXNBSEJ;)V")
    public final void method149(int arg0, class36 arg1) {
        if (arg0 >= 0) {
            this.field437 = null;
        }
        arg1.field1071 = false;
        if (arg1.field1078 != -1) {
            class55 var3 = class55.field1444[arg1.field1078];
            ++arg1.field1080;
            if (arg1.field1079 < var3.field1445 && arg1.field1080 > var3.method459(arg1.field1079, false)) {
                arg1.field1080 = 0;
                ++arg1.field1079;
            }
            if (arg1.field1079 >= var3.field1445) {
                arg1.field1080 = 0;
                arg1.field1079 = 0;
            }
        }
        if (arg1.field1042 != -1 && field257 >= arg1.field1045) {
            if (arg1.field1043 < 0) {
                arg1.field1043 = 0;
            }
            class55 var4 = class47.field1276[arg1.field1042].field1280;
            ++arg1.field1044;
            while (arg1.field1043 < var4.field1445 && arg1.field1044 > var4.method459(arg1.field1043, false)) {
                arg1.field1044 -= var4.method459(arg1.field1043, false);
                ++arg1.field1043;
            }
            if (arg1.field1043 >= var4.field1445 && (arg1.field1043 < 0 || arg1.field1043 >= var4.field1445)) {
                arg1.field1042 = -1;
            }
        }
        if (arg1.field1064 != -1 && arg1.field1067 <= 1) {
            class55 var5 = class55.field1444[arg1.field1064];
            if (var5.field1456 == 1 && arg1.field1050 > 0 && arg1.field1085 <= field257 && arg1.field1086 < field257) {
                arg1.field1067 = 1;
                return;
            }
        }
        if (arg1.field1064 != -1 && arg1.field1067 == 0) {
            class55 var6 = class55.field1444[arg1.field1064];
            ++arg1.field1066;
            while (arg1.field1065 < var6.field1445 && arg1.field1066 > var6.method459(arg1.field1065, false)) {
                arg1.field1066 -= var6.method459(arg1.field1065, false);
                ++arg1.field1065;
            }
            if (arg1.field1065 >= var6.field1445) {
                arg1.field1065 -= var6.field1449;
                ++arg1.field1068;
                if (arg1.field1068 >= var6.field1455) {
                    arg1.field1064 = -1;
                }
                if (arg1.field1065 < 0 || arg1.field1065 >= var6.field1445) {
                    arg1.field1064 = -1;
                }
            }
            arg1.field1071 = var6.field1451;
        }
        if (arg1.field1067 > 0) {
            --arg1.field1067;
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method150(byte arg0) {
        if (arg0 != 115) {
            this.field488 = -1;
        }
        if (this.field333 == -1 || this.field411 != 2 && super.field1365 == null) {
            if (this.field587) {
                this.method89(0);
                this.field587 = false;
                this.field154.method478(4, 0, super.field1364, false);
                this.field155.method478(357, 0, super.field1364, false);
                this.field156.method478(4, 722, super.field1364, false);
                this.field157.method478(205, 743, super.field1364, false);
                this.field158.method478(0, 0, super.field1364, false);
                this.field159.method478(4, 516, super.field1364, false);
                this.field160.method478(205, 516, super.field1364, false);
                this.field161.method478(357, 496, super.field1364, false);
                this.field162.method478(338, 0, super.field1364, false);
                this.field348 = true;
                this.field275 = true;
                this.field142 = true;
                this.field183 = true;
                if (this.field411 != 2) {
                    this.field178.method478(4, 4, super.field1364, false);
                    this.field177.method478(4, 550, super.field1364, false);
                }
            }
            if (this.field411 == 2) {
                this.method43(this.field252);
            }
            if (this.field175 && this.field223 == 1) {
                this.field348 = true;
            }
            if (this.field422 != -1) {
                boolean var4 = this.method171(this.field422, 32022, this.field356);
                if (var4) {
                    this.field348 = true;
                }
            }
            if (this.field497 == 2) {
                this.field348 = true;
            }
            if (this.field388 == 2) {
                this.field348 = true;
            }
            if (this.field348) {
                this.method47((byte) 6);
                this.field348 = false;
            }
            if (this.field234 == -1 && this.field483 == 0) {
                this.field166.field1196 = this.field404 - this.field370 - 77;
                if (super.field1372 > 448 && super.field1372 < 560 && super.field1373 > 332) {
                    this.method50(-7270, super.field1373 - 357, this.field404, this.field166, super.field1372 - 17, 0, 463, 77, -1);
                }
                int var5 = this.field404 - 77 - this.field166.field1196;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field404 - 77) {
                    var5 = this.field404 - 77;
                }
                if (this.field370 != var5) {
                    this.field370 = var5;
                    this.field275 = true;
                }
            }
            if (this.field234 == -1 && this.field483 == 3) {
                int var6 = this.field215 * 14 + 7;
                this.field166.field1196 = this.field218;
                if (super.field1372 > 448 && super.field1372 < 560 && super.field1373 > 332) {
                    this.method50(-7270, super.field1373 - 357, var6, this.field166, super.field1372 - 17, 0, 463, 77, -1);
                }
                int var7 = this.field166.field1196;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field218 != var7) {
                    this.field218 = var7;
                    this.field275 = true;
                }
            }
            if (this.field234 != -1) {
                boolean var8 = this.method171(this.field234, 32022, this.field356);
                if (var8) {
                    this.field275 = true;
                }
            }
            if (this.field497 == 3) {
                this.field275 = true;
            }
            if (this.field388 == 3) {
                this.field275 = true;
            }
            if (this.field433 != null) {
                this.field275 = true;
            }
            if (this.field175 && this.field223 == 2) {
                this.field275 = true;
            }
            if (this.field275) {
                this.method129(true);
                this.field275 = false;
            }
            if (this.field411 == 2) {
                this.method167(false);
                this.field177.method478(4, 550, super.field1364, false);
            }
            if (this.field279 != -1) {
                this.field142 = true;
            }
            if (this.field142) {
                if (this.field279 != -1 && this.field279 == this.field168) {
                    this.field279 = -1;
                    this.field188.method206(252, 533);
                    this.field188.method207(this.field168);
                }
                this.field142 = false;
                this.field534.method477(422);
                this.field147.method198(-24669, 0, 0);
                if (this.field422 == -1) {
                    if (this.field220[this.field168] != -1) {
                        if (this.field168 == 0) {
                            this.field293.method198(-24669, 22, 10);
                        }
                        if (this.field168 == 1) {
                            this.field294.method198(-24669, 54, 8);
                        }
                        if (this.field168 == 2) {
                            this.field294.method198(-24669, 82, 8);
                        }
                        if (this.field168 == 3) {
                            this.field295.method198(-24669, 110, 8);
                        }
                        if (this.field168 == 4) {
                            this.field297.method198(-24669, 153, 8);
                        }
                        if (this.field168 == 5) {
                            this.field297.method198(-24669, 181, 8);
                        }
                        if (this.field168 == 6) {
                            this.field296.method198(-24669, 209, 9);
                        }
                    }
                    if (this.field220[0] != -1 && (this.field279 != 0 || field257 % 20 < 10)) {
                        this.field474[0].method198(-24669, 29, 13);
                    }
                    if (this.field220[1] != -1 && (this.field279 != 1 || field257 % 20 < 10)) {
                        this.field474[1].method198(-24669, 53, 11);
                    }
                    if (this.field220[2] != -1 && (this.field279 != 2 || field257 % 20 < 10)) {
                        this.field474[2].method198(-24669, 82, 11);
                    }
                    if (this.field220[3] != -1 && (this.field279 != 3 || field257 % 20 < 10)) {
                        this.field474[3].method198(-24669, 115, 12);
                    }
                    if (this.field220[4] != -1 && (this.field279 != 4 || field257 % 20 < 10)) {
                        this.field474[4].method198(-24669, 153, 13);
                    }
                    if (this.field220[5] != -1 && (this.field279 != 5 || field257 % 20 < 10)) {
                        this.field474[5].method198(-24669, 180, 11);
                    }
                    if (this.field220[6] != -1 && (this.field279 != 6 || field257 % 20 < 10)) {
                        this.field474[6].method198(-24669, 208, 13);
                    }
                }
                this.field534.method478(160, 516, super.field1364, false);
                this.field533.method477(422);
                this.field146.method198(-24669, 0, 0);
                if (this.field422 == -1) {
                    if (this.field220[this.field168] != -1) {
                        if (this.field168 == 7) {
                            this.field509.method198(-24669, 42, 0);
                        }
                        if (this.field168 == 8) {
                            this.field510.method198(-24669, 74, 0);
                        }
                        if (this.field168 == 9) {
                            this.field510.method198(-24669, 102, 0);
                        }
                        if (this.field168 == 10) {
                            this.field511.method198(-24669, 130, 1);
                        }
                        if (this.field168 == 11) {
                            this.field513.method198(-24669, 173, 0);
                        }
                        if (this.field168 == 12) {
                            this.field513.method198(-24669, 201, 0);
                        }
                        if (this.field168 == 13) {
                            this.field512.method198(-24669, 229, 0);
                        }
                    }
                    if (this.field220[8] != -1 && (this.field279 != 8 || field257 % 20 < 10)) {
                        this.field474[7].method198(-24669, 74, 2);
                    }
                    if (this.field220[9] != -1 && (this.field279 != 9 || field257 % 20 < 10)) {
                        this.field474[8].method198(-24669, 102, 3);
                    }
                    if (this.field220[10] != -1 && (this.field279 != 10 || field257 % 20 < 10)) {
                        this.field474[9].method198(-24669, 137, 4);
                    }
                    if (this.field220[11] != -1 && (this.field279 != 11 || field257 % 20 < 10)) {
                        this.field474[10].method198(-24669, 174, 2);
                    }
                    if (this.field220[12] != -1 && (this.field279 != 12 || field257 % 20 < 10)) {
                        this.field474[11].method198(-24669, 201, 2);
                    }
                    if (this.field220[13] != -1 && (this.field279 != 13 || field257 % 20 < 10)) {
                        this.field474[12].method198(-24669, 226, 2);
                    }
                }
                this.field533.method478(466, 496, super.field1364, false);
                this.field178.method477(422);
                class39.field1117 = this.field416;
            }
            if (this.field183) {
                this.field183 = false;
                this.field532.method477(422);
                this.field145.method198(-24669, 0, 0);
                this.field149.method482(true, "Public chat", 16777215, true, 55, 28);
                if (this.field423 == 0) {
                    this.field149.method482(true, "On", 65280, true, 55, 41);
                }
                if (this.field423 == 1) {
                    this.field149.method482(true, "Friends", 16776960, true, 55, 41);
                }
                if (this.field423 == 2) {
                    this.field149.method482(true, "Off", 16711680, true, 55, 41);
                }
                if (this.field423 == 3) {
                    this.field149.method482(true, "Hide", 65535, true, 55, 41);
                }
                this.field149.method482(true, "Private chat", 16777215, true, 184, 28);
                if (this.field164 == 0) {
                    this.field149.method482(true, "On", 65280, true, 184, 41);
                }
                if (this.field164 == 1) {
                    this.field149.method482(true, "Friends", 16776960, true, 184, 41);
                }
                if (this.field164 == 2) {
                    this.field149.method482(true, "Off", 16711680, true, 184, 41);
                }
                this.field149.method482(true, "Trade/compete", 16777215, true, 324, 28);
                if (this.field306 == 0) {
                    this.field149.method482(true, "On", 65280, true, 324, 41);
                }
                if (this.field306 == 1) {
                    this.field149.method482(true, "Friends", 16776960, true, 324, 41);
                }
                if (this.field306 == 2) {
                    this.field149.method482(true, "Off", 16711680, true, 324, 41);
                }
                this.field149.method482(true, "Report abuse", 16777215, true, 458, 33);
                this.field532.method478(453, 0, super.field1364, false);
                this.field178.method477(422);
                class39.field1117 = this.field416;
            }
            this.field356 = 0;
        } else {
            if (this.field411 == 2) {
                this.method171(this.field333, 32022, this.field356);
                if (this.field592 != -1) {
                    this.method171(this.field592, 32022, this.field356);
                }
                this.field356 = 0;
                this.method78(true);
                super.field1365.method477(422);
                class39.field1117 = this.field417;
                class2.method15(true);
                this.field587 = true;
                class44 var2 = class44.method380(this.field333);
                if (var2.field1250 == 512 && var2.field1207 == 334 && var2.field1220 == 0) {
                    var2.field1250 = 765;
                    var2.field1207 = 503;
                }
                this.method183(0, var2, (byte) 27, 0, 0);
                if (this.field592 != -1) {
                    class44 var3 = class44.method380(this.field592);
                    if (var3.field1250 == 512 && var3.field1207 == 334 && var3.field1220 == 0) {
                        var3.field1250 = 765;
                        var3.field1207 = 503;
                    }
                    this.method183(0, var3, (byte) 27, 0, 0);
                }
                if (!this.field175) {
                    this.method120((byte) 54);
                    this.method134(8);
                } else {
                    this.method63(8);
                }
            }
            super.field1365.method478(0, 0, super.field1364, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method151(int arg0) {
        if (arg0 != 9) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        try {
            this.field272 = -1;
            this.field605.method474();
            this.field139.method474();
            ++field360;
            if (field360 > 149) {
                field360 = 0;
                this.field188.method206(98, 533);
                this.field188.method210(14922832);
            }
            class39.method352((byte) 23);
            this.method45((byte) 42);
            this.field202.method516(false);
            System.gc();
            for (int var3 = 0; var3 < 4; ++var3) {
                this.field472[var3].method28();
            }
            for (int var4 = 0; var4 < 4; ++var4) {
                for (int var5 = 0; var5 < 104; ++var5) {
                    for (int var6 = 0; var6 < 104; ++var6) {
                        this.field192[var4][var5][var6] = 0;
                    }
                }
            }
            class48 var7 = new class48(this.field230, 104, 104, 0, this.field192);
            int var8 = this.field144.length;
            this.field188.method206(133, 533);
            if (!this.field515) {
                for (int var9 = 0; var9 < var8; ++var9) {
                    int var10 = (this.field283[var9] >> 8) * 64 - this.field363;
                    int var11 = (this.field283[var9] & 255) * 64 - this.field364;
                    byte[] var12 = this.field144[var9];
                    if (var12 != null) {
                        var7.method404(this.field472, var11, (this.field303 - 6) * 8, var10, (this.field304 - 6) * 8, var12, false);
                    }
                }
                for (int var13 = 0; var13 < var8; ++var13) {
                    int var14 = (this.field283[var13] >> 8) * 64 - this.field363;
                    int var15 = (this.field283[var13] & 255) * 64 - this.field364;
                    byte[] var16 = this.field144[var13];
                    if (var16 == null && this.field304 < 800) {
                        var7.method398(var15, 906, 64, 64, var14);
                    }
                }
                this.field188.method206(133, 533);
                for (int var17 = 0; var17 < var8; ++var17) {
                    byte[] var18 = this.field492[var17];
                    if (var18 != null) {
                        int var19 = (this.field283[var17] >> 8) * 64 - this.field363;
                        int var20 = (this.field283[var17] & 255) * 64 - this.field364;
                        var7.method407(var19, true, var20, this.field472, var18, this.field202);
                    }
                }
            }
            if (this.field515) {
                int var21 = 0;
                label260: while (true) {
                    if (var21 >= 4) {
                        for (int var32 = 0; var32 < 13; ++var32) {
                            for (int var33 = 0; var33 < 13; ++var33) {
                                int var34 = this.field392[0][var32][var33];
                                if (var34 == -1) {
                                    var7.method398(var33 * 8, 906, 8, 8, var32 * 8);
                                }
                            }
                        }
                        this.field188.method206(133, 533);
                        int var35 = 0;
                        while (true) {
                            if (var35 >= 4) {
                                break label260;
                            }
                            for (int var36 = 0; var36 < 13; ++var36) {
                                for (int var37 = 0; var37 < 13; ++var37) {
                                    int var38 = this.field392[var35][var36][var37];
                                    if (var38 != -1) {
                                        int var39 = var38 >> 24 & 3;
                                        int var40 = var38 >> 1 & 3;
                                        int var41 = var38 >> 14 & 1023;
                                        int var42 = var38 >> 3 & 2047;
                                        int var43 = (var41 / 8 << 8) + var42 / 8;
                                        for (int var44 = 0; var44 < this.field283.length; ++var44) {
                                            if (this.field283[var44] == var43 && this.field492[var44] != null) {
                                                var7.method409(var40, (var41 & 7) * 8, this.field472, var37 * 8, this.field492[var44], this.field202, (var42 & 7) * 8, var36 * 8, -673, var35, var39);
                                                break;
                                            }
                                        }
                                    }
                                }
                            }
                            ++var35;
                        }
                    }
                    for (int var22 = 0; var22 < 13; ++var22) {
                        for (int var23 = 0; var23 < 13; ++var23) {
                            boolean var24 = false;
                            int var25 = this.field392[var21][var22][var23];
                            if (var25 != -1) {
                                int var26 = var25 >> 24 & 3;
                                int var27 = var25 >> 1 & 3;
                                int var28 = var25 >> 14 & 1023;
                                int var29 = var25 >> 3 & 2047;
                                int var30 = (var28 / 8 << 8) + var29 / 8;
                                for (int var31 = 0; var31 < this.field283.length; ++var31) {
                                    if (this.field283[var31] == var30 && this.field144[var31] != null) {
                                        var7.method415((var28 & 7) * 8, (var29 & 7) * 8, var22 * 8, var26, this.field144[var31], var21, var27, 7, var23 * 8, this.field472);
                                        var24 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var24) {
                                var7.method401(var21, (byte) 5, var23 * 8, var22 * 8);
                            }
                        }
                    }
                    ++var21;
                }
            }
            this.field188.method206(133, 533);
            var7.method408(this.field472, this.field202, this.field255);
            if (this.field178 != null) {
                this.field178.method477(422);
                class39.field1117 = this.field416;
            }
            this.field188.method206(133, 533);
            int var45 = class48.field1316;
            if (var45 > this.field596) {
                var45 = this.field596;
            }
            if (var45 < this.field596 - 1) {
                int var46 = this.field596 - 1;
            }
            if (field271) {
                this.field202.method517(723, class48.field1316);
            } else {
                this.field202.method517(723, 0);
            }
            for (int var47 = 0; var47 < 104; ++var47) {
                for (int var48 = 0; var48 < 104; ++var48) {
                    this.method111(var47, var48);
                }
            }
            this.method138(-95);
        } catch (Exception var61) {
        }
        class1.field24.method27();
        if (super.field1367 != null) {
            this.field188.method206(213, 533);
            this.field188.method211(1057001181);
        }
        if (field271 && signlink.cache_dat != null) {
            int var50 = this.field369.method315(0, -98);
            for (int var51 = 0; var51 < var50; ++var51) {
                int var52 = this.field369.method322(var51, field371);
                if ((var52 & 121) == 0) {
                    class18.method266(true, var51);
                }
            }
        }
        System.gc();
        class39.method353(20, 523);
        this.field369.method316(this.field174);
        int var53 = (this.field303 - 6) / 8 - 1;
        int var54 = (this.field303 + 6) / 8 + 1;
        int var55 = (this.field304 - 6) / 8 - 1;
        int var56 = (this.field304 + 6) / 8 + 1;
        if (this.field407) {
            var53 = 49;
            var54 = 50;
            var55 = 49;
            var56 = 50;
        }
        for (int var57 = var53; var57 <= var54; ++var57) {
            for (int var58 = var55; var58 <= var56; ++var58) {
                if (var53 == var57 || var54 == var57 || var55 == var58 || var56 == var58) {
                    int var59 = this.field369.method308(false, var57, 0, var58);
                    if (var59 != -1) {
                        this.field369.method319(3, true, var59);
                    }
                    int var60 = this.field369.method308(false, var57, 1, var58);
                    if (var60 != -1) {
                        this.field369.method319(3, true, var60);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        this.field204.method198(-24669, arg5, arg0);
        this.field205.method198(-24669, arg5, arg0 + arg3 - 16);
        class2.method17(arg5, arg0 + 16, this.field463, this.field505, 16, arg3 - 32);
        int var7 = (arg3 - 32) * arg3 / arg1;
        if (var7 < 8) {
            var7 = 8;
        }
        int var8 = (arg3 - 32 - var7) * arg2 / (arg1 - arg3);
        class2.method17(arg5, arg0 + 16 + var8, this.field463, this.field337, 16, var7);
        class2.method22(485, this.field405, var7, arg5, arg0 + 16 + var8);
        class2.method22(485, this.field405, var7, arg5 + 1, arg0 + 16 + var8);
        class2.method20(arg5, 129, arg0 + 16 + var8, 16, this.field405);
        class2.method20(arg5, 129, arg0 + 17 + var8, 16, this.field405);
        class2.method22(485, this.field357, var7, arg5 + 15, arg0 + 16 + var8);
        class2.method22(485, this.field357, var7 - 1, arg5 + 14, arg0 + 17 + var8);
        class2.method20(arg5, 129, arg0 + 15 + var8 + var7, 16, this.field357);
        if (arg4 != 9) {
            this.field488 = -1;
        }
        class2.method20(arg5 + 1, 129, arg0 + 14 + var8 + var7, 15, this.field357);
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method153(int arg0) {
        byte[] var2 = this.field501.method332("title.dat", (byte[]) null);
        class50 var3 = new class50(var2, this);
        this.field549.method477(422);
        var3.method422(field143, 0, 0);
        this.field550.method477(422);
        var3.method422(field143, -637, 0);
        this.field546.method477(422);
        var3.method422(field143, -128, 0);
        this.field547.method477(422);
        var3.method422(field143, -202, -371);
        this.field548.method477(422);
        var3.method422(field143, -202, -171);
        this.field551.method477(422);
        var3.method422(field143, 0, -265);
        this.field552.method477(422);
        var3.method422(field143, -562, -265);
        this.field553.method477(422);
        var3.method422(field143, -128, -171);
        this.field554.method477(422);
        var3.method422(field143, -562, -171);
        int[] var4 = new int[var3.field1346];
        for (int var5 = 0; var5 < var3.field1347; ++var5) {
            for (int var10 = 0; var10 < var3.field1346; ++var10) {
                var4[var10] = var3.field1345[var3.field1346 * var5 + (var3.field1346 - var10 - 1)];
            }
            for (int var11 = 0; var11 < var3.field1346; ++var11) {
                var3.field1345[var3.field1346 * var5 + var11] = var4[var11];
            }
        }
        this.field549.method477(422);
        var3.method422(field143, 382, 0);
        this.field550.method477(422);
        var3.method422(field143, -255, 0);
        this.field546.method477(422);
        var3.method422(field143, 254, 0);
        this.field547.method477(422);
        var3.method422(field143, 180, -371);
        this.field548.method477(422);
        var3.method422(field143, 180, -171);
        this.field551.method477(422);
        var3.method422(field143, 382, -265);
        this.field552.method477(422);
        var3.method422(field143, -180, -265);
        this.field553.method477(422);
        if (arg0 != -31892) {
            this.field188.method207(192);
        }
        var3.method422(field143, 254, -171);
        this.field554.method477(422);
        var3.method422(field143, -180, -171);
        class50 var6 = new class50(this.field501, "logo", 0);
        this.field546.method477(422);
        var6.method424(-24669, 382 - var6.field1346 / 2 - 128, 18);
        Object var7 = null;
        Object var8 = null;
        Object var9 = null;
        System.gc();
        if (class34.field1027) {
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method154(byte arg0) {
        int var2 = this.field535 * 128 + 64;
        int var3 = this.field536 * 128 + 64;
        int var4 = this.method114(this.field596, var2, 1, var3) - this.field537;
        if (this.field581 < var2) {
            this.field581 += (var2 - this.field581) * this.field539 / 1000 + this.field538;
            if (this.field581 > var2) {
                this.field581 = var2;
            }
        }
        if (this.field581 > var2) {
            this.field581 -= (this.field581 - var2) * this.field539 / 1000 + this.field538;
            if (this.field581 < var2) {
                this.field581 = var2;
            }
        }
        if (this.field582 < var4) {
            this.field582 += (var4 - this.field582) * this.field539 / 1000 + this.field538;
            if (this.field582 > var4) {
                this.field582 = var4;
            }
        }
        if (this.field582 > var4) {
            this.field582 -= (this.field582 - var4) * this.field539 / 1000 + this.field538;
            if (this.field582 < var4) {
                this.field582 = var4;
            }
        }
        if (this.field583 < var3) {
            this.field583 += (var3 - this.field583) * this.field539 / 1000 + this.field538;
            if (this.field583 > var3) {
                this.field583 = var3;
            }
        }
        if (this.field583 > var3) {
            this.field583 -= (this.field583 - var3) * this.field539 / 1000 + this.field538;
            if (this.field583 < var3) {
                this.field583 = var3;
            }
        }
        int var5 = this.field446 * 128 + 64;
        if (arg0 == -115) {
            int var6 = this.field447 * 128 + 64;
            int var7 = this.method114(this.field596, var5, 1, var6) - this.field448;
            int var8 = var5 - this.field581;
            int var9 = var7 - this.field582;
            int var10 = var6 - this.field583;
            int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
            int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
            int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
            if (var12 < 128) {
                var12 = 128;
            }
            if (var12 > 383) {
                var12 = 383;
            }
            if (this.field584 < var12) {
                this.field584 += (var12 - this.field584) * this.field450 / 1000 + this.field449;
                if (this.field584 > var12) {
                    this.field584 = var12;
                }
            }
            if (this.field584 > var12) {
                this.field584 -= (this.field584 - var12) * this.field450 / 1000 + this.field449;
                if (this.field584 < var12) {
                    this.field584 = var12;
                }
            }
            int var14 = var13 - this.field585;
            if (var14 > 1024) {
                var14 -= 2048;
            }
            if (var14 < -1024) {
                var14 += 2048;
            }
            if (var14 > 0) {
                this.field585 += this.field450 * var14 / 1000 + this.field449;
                this.field585 &= 2047;
            }
            if (var14 < 0) {
                this.field585 -= -var14 * this.field450 / 1000 + this.field449;
                this.field585 &= 2047;
            }
            int var15 = var13 - this.field585;
            if (var15 > 1024) {
                var15 -= 2048;
            }
            if (var15 < -1024) {
                var15 += 2048;
            }
            if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
                this.field585 = var13;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method155(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        this.field487 += arg6;
        if (arg0 >= 1 && arg5 >= 1 && arg0 <= 102 && arg5 <= 102) {
            if (field271 && this.field596 != arg1) {
                return;
            }
            int var9 = 0;
            boolean var10 = true;
            boolean var11 = false;
            boolean var12 = false;
            if (arg4 == 0) {
                var9 = this.field202.method542(arg1, arg0, arg5);
            }
            if (arg4 == 1) {
                var9 = this.field202.method543(arg1, arg0, arg5, 0);
            }
            if (arg4 == 2) {
                var9 = this.field202.method544(arg1, arg0, arg5);
            }
            if (arg4 == 3) {
                var9 = this.field202.method545(arg1, arg0, arg5);
            }
            if (var9 != 0) {
                int var13 = this.field202.method546(arg1, arg0, arg5, var9);
                int var14 = var9 >> 14 & 32767;
                int var15 = var13 & 31;
                int var16 = var13 >> 6;
                if (arg4 == 0) {
                    this.field202.method533(arg1, arg0, false, arg5);
                    class1 var17 = class1.method4(var14);
                    if (var17.field26) {
                        this.field472[arg1].method33(arg0, var17.field23, this.field504, arg5, var15, var16);
                    }
                }
                if (arg4 == 1) {
                    this.field202.method534(arg1, -763, arg0, arg5);
                }
                if (arg4 == 2) {
                    this.field202.method535(arg1, 0, arg0, arg5);
                    class1 var18 = class1.method4(var14);
                    if (var18.field22 + arg0 > 103 || var18.field22 + arg5 > 103 || var18.field32 + arg0 > 103 || var18.field32 + arg5 > 103) {
                        return;
                    }
                    if (var18.field26) {
                        this.field472[arg1].method34(var18.field32, var18.field23, 16288, var16, var18.field22, arg0, arg5);
                    }
                }
                if (arg4 == 3) {
                    this.field202.method536(arg0, arg5, false, arg1);
                    class1 var19 = class1.method4(var14);
                    if (var19.field26 && var19.field5) {
                        this.field472[arg1].method36(arg0, this.field381, arg5);
                    }
                }
            }
            if (arg2 >= 0) {
                int var20 = arg1;
                if (arg1 < 3 && (this.field192[1][arg0][arg5] & 2) == 2) {
                    var20 = arg1 + 1;
                }
                class48.method417(arg0, this.field230, this.field202, arg7, arg1, this.field472[arg1], 0, arg2, arg3, arg5, var20);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method156(byte arg0) {
        this.field391 = false;
        while (this.field425) {
            this.field391 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field377 = null;
        this.field378 = null;
        if (arg0 != -112) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field623 = null;
        this.field247 = null;
        this.field248 = null;
        this.field249 = null;
        this.field250 = null;
        this.field412 = null;
        this.field413 = null;
        this.field567 = null;
        this.field568 = null;
        this.field152 = null;
        this.field153 = null;
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        Graphics var2 = this.method119((byte) 75).getGraphics();
        var2.setColor(Color.black);
        var2.fillRect(0, 0, 765, 503);
        if (arg0) {
            this.field488 = -1;
        }
        this.method435(7, 1);
        if (this.field559) {
            this.field391 = false;
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
        if (this.field452) {
            this.field391 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field462) {
            this.field391 = false;
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

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IZ)V")
    public final void method158(int arg0, boolean arg1) {
        this.method175(true);
        this.field548.method477(422);
        this.field487 += arg0;
        this.field377.method198(-24669, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field384 == 0) {
            int var5 = var4 / 2 + 80;
            this.field148.method482(true, this.field369.field947, 7711145, true, var3 / 2, var5);
            int var6 = var4 / 2 - 20;
            this.field150.method482(true, "Welcome to RuneScape", 16776960, true, var3 / 2, var6);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field378.method198(-24669, var7 - 73, var8 - 20);
            this.field150.method482(true, "New User", 16777215, true, var7, var8 + 5);
            int var9 = var3 / 2 + 80;
            this.field378.method198(-24669, var9 - 73, var8 - 20);
            this.field150.method482(true, "Existing User", 16777215, true, var9, var8 + 5);
        }
        if (this.field384 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field617.length() > 0) {
                this.field150.method482(true, this.field617, 16776960, true, var3 / 2, var10 - 15);
                this.field150.method482(true, this.field618, 16776960, true, var3 / 2, var10);
                var10 += 30;
            } else {
                this.field150.method482(true, this.field618, 16776960, true, var3 / 2, var10 - 7);
                var10 += 30;
            }
            this.field150.method489(true, var3 / 2 - 90, 16777215, var10, -877, "Username: " + this.field478 + (this.field607 == 0 & field257 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            this.field150.method489(true, var3 / 2 - 88, 16777215, var10, -877, "Password: " + class56.method466(this.field479, (byte) 8) + (this.field607 == 1 & field257 % 40 < 20 ? "@yel@|" : ""));
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field378.method198(-24669, var11 - 73, var12 - 20);
                this.field150.method482(true, "Login", 16777215, true, var11, var12 + 5);
                int var13 = var3 / 2 + 80;
                this.field378.method198(-24669, var13 - 73, var12 - 20);
                this.field150.method482(true, "Cancel", 16777215, true, var13, var12 + 5);
            }
        }
        if (this.field384 == 3) {
            this.field150.method482(true, "Create a free account", 16776960, true, var3 / 2, var4 / 2 - 60);
            int var14 = var4 / 2 - 35;
            this.field150.method482(true, "To create a new account you need to", 16777215, true, var3 / 2, var14);
            int var18 = var14 + 15;
            this.field150.method482(true, "go back to the main RuneScape webpage", 16777215, true, var3 / 2, var18);
            int var19 = var18 + 15;
            this.field150.method482(true, "and choose the 'create account'", 16777215, true, var3 / 2, var19);
            int var20 = var19 + 15;
            this.field150.method482(true, "button near the top of that page.", 16777215, true, var3 / 2, var20);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field378.method198(-24669, var15 - 73, var16 - 20);
            this.field150.method482(true, "Cancel", 16777215, true, var15, var16 + 5);
        }
        this.field548.method478(171, 202, super.field1364, false);
        if (this.field587) {
            this.field587 = false;
            this.field546.method478(0, 128, super.field1364, false);
            this.field547.method478(371, 202, super.field1364, false);
            this.field551.method478(265, 0, super.field1364, false);
            this.field552.method478(265, 562, super.field1364, false);
            this.field553.method478(171, 128, super.field1364, false);
            this.field554.method478(171, 562, super.field1364, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method159(int arg0) {
        try {
            if (this.field503 != null) {
                this.field503.method187();
            }
        } catch (Exception var3) {
        }
        this.field503 = null;
        this.field466 = false;
        this.field384 = 0;
        this.field478 = "";
        this.field479 = "";
        this.method45((byte) 42);
        this.field202.method516(false);
        while (arg0 >= 0) {
            field580 = 230;
        }
        for (int var2 = 0; var2 < 4; ++var2) {
            this.field472[var2].method28();
        }
        System.gc();
        this.method177((byte) 6);
        this.field278 = -1;
        this.field464 = -1;
        this.field418 = 0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;BLjava/lang/String;)V")
    public final void method160(String arg0, byte arg1, String arg2) {
        if (arg1 != -18) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (this.field178 != null) {
            this.field178.method477(422);
            class39.field1117 = this.field416;
            int var5 = 151;
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field149.method481(arg2, 936, 0, 257, var5);
            this.field149.method481(arg2, 936, 16777215, 256, var5 - 1);
            var5 += 15;
            if (arg0 != null) {
                this.field149.method481(arg0, 936, 0, 257, var5);
                this.field149.method481(arg0, 936, 16777215, 256, var5 - 1);
            }
            this.field178.method478(4, 4, super.field1364, false);
        } else if (super.field1365 != null) {
            super.field1365.method477(422);
            class39.field1117 = this.field417;
            int var6 = 251;
            short var7 = 300;
            byte var8 = 50;
            class2.method17(383 - var7 / 2, var6 - 5 - var8 / 2, this.field463, 0, var7, var8);
            class2.method18(0, 383 - var7 / 2, var7, 16777215, var8, var6 - 5 - var8 / 2);
            if (arg0 != null) {
                var6 -= 7;
            }
            this.field149.method481(arg2, 936, 0, 383, var6);
            this.field149.method481(arg2, 936, 16777215, 382, var6 - 1);
            var6 += 15;
            if (arg0 != null) {
                this.field149.method481(arg0, 936, 0, 383, var6);
                this.field149.method481(arg0, 936, 16777215, 382, var6 - 1);
            }
            super.field1365.method478(0, 0, super.field1364, false);
        }
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method161(int arg0) {
        for (int var2 = -1; var2 < this.field342; ++var2) {
            int var7;
            if (var2 == -1) {
                var7 = this.field340;
            } else {
                var7 = this.field343[var2];
            }
            class66 var8 = this.field341[var7];
            if (var8 != null && var8.field1054 > 0) {
                --var8.field1054;
                if (var8.field1054 == 0) {
                    var8.field1075 = null;
                }
            }
        }
        while (arg0 >= 0) {
            for (int var6 = 1; var6 > 0; ++var6) {
            }
        }
        for (int var3 = 0; var3 < this.field195; ++var3) {
            int var4 = this.field196[var3];
            class45 var5 = this.field194[var4];
            if (var5 != null && var5.field1054 > 0) {
                --var5.field1054;
                if (var5.field1054 == 0) {
                    var5.field1075 = null;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method162(byte arg0) {
        if (arg0 != 7) {
            this.field469 = !this.field469;
        }
        this.field425 = true;
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field391) {
                ++this.field598;
                this.method67(0);
                this.method67(0);
                this.method53((byte) 0);
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
        this.field425 = false;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method163(boolean arg0, byte arg1) {
        for (int var3 = 0; var3 < this.field195; ++var3) {
            class45 var4 = this.field194[this.field196[var3]];
            int var5 = (this.field196[var3] << 14) + 536870912;
            if (var4 != null && var4.method342(false) && var4.field1259.field1615 == arg0 && var4.field1259.method513((byte) 112)) {
                int var6 = var4.field1059 >> 7;
                int var7 = var4.field1060 >> 7;
                if (var6 >= 0 && var6 < 104 && var7 >= 0 && var7 < 104) {
                    if (var4.field1070 == 1 && (var4.field1059 & 127) == 64 && (var4.field1060 & 127) == 64) {
                        if (this.field321[var6][var7] == this.field620) {
                            continue;
                        }
                        this.field321[var6][var7] = this.field620;
                    }
                    if (!var4.field1259.field1610) {
                        var5 += Integer.MIN_VALUE;
                    }
                    this.field202.method527(var4.field1061, var4, this.field596, this.method114(this.field596, var4.field1059, 1, var4.field1060), var4.field1059, var4.field1060, var5, (var4.field1070 - 1) * 64 + 60, var4.field1071, 0);
                }
            }
        }
        if (arg1 != -124) {
            this.field488 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public final void method164(boolean arg0) {
        this.field289 = 0;
        int var2 = (field612.field1059 >> 7) + this.field363;
        int var3 = (field612.field1060 >> 7) + this.field364;
        if (arg0) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
            this.field289 = 1;
        }
        if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
            this.field289 = 1;
        }
        if (this.field289 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
            this.field289 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method165(byte arg0) {
        if (arg0 != -38) {
            this.field188.method207(148);
        }
        try {
            int var2 = field612.field1059 + this.field361;
            int var3 = field612.field1060 + this.field578;
            if (this.field428 - var2 < -500 || this.field428 - var2 > 500 || this.field429 - var3 < -500 || this.field429 - var3 > 500) {
                this.field428 = var2;
                this.field429 = var3;
            }
            if (this.field428 != var2) {
                this.field428 += (var2 - this.field428) / 16;
            }
            if (this.field429 != var3) {
                this.field429 += (var3 - this.field429) / 16;
            }
            if (super.field1382[1] == 1) {
                this.field397 += (-24 - this.field397) / 2;
            } else if (super.field1382[2] == 1) {
                this.field397 += (24 - this.field397) / 2;
            } else {
                this.field397 /= 2;
            }
            if (super.field1382[3] == 1) {
                this.field398 += (12 - this.field398) / 2;
            } else if (super.field1382[4] == 1) {
                this.field398 += (-12 - this.field398) / 2;
            } else {
                this.field398 /= 2;
            }
            this.field396 = this.field397 / 2 + this.field396 & 2047;
            this.field395 += this.field398 / 2;
            if (this.field395 < 128) {
                this.field395 = 128;
            }
            if (this.field395 > 383) {
                this.field395 = 383;
            }
            int var4 = this.field428 >> 7;
            int var5 = this.field429 >> 7;
            int var6 = this.method114(this.field596, this.field428, 1, this.field429);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field596;
                        if (var10 < 3 && (this.field192[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field230[var10][var8][var9];
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
            if (var12 > this.field599) {
                this.field599 += (var12 - this.field599) / 24;
            } else if (var12 < this.field599) {
                this.field599 += (var12 - this.field599) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field612.field1059 + "," + field612.field1060 + "," + this.field428 + "," + this.field429 + "," + this.field303 + "," + this.field304 + "," + this.field363 + "," + this.field364);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILCMELCUKG;)V")
    public final void method166(int arg0, class8 arg1) {
        short var3 = 256;
        for (int var4 = 0; var4 < this.field412.length; ++var4) {
            this.field412[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field412[var17] = (int) (Math.random() * 256.0D);
        }
        if (arg0 >= 0) {
            this.field188.method207(245);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field413[var16] = (this.field412[var16 - 1] + this.field412[var16 + 1] + this.field412[var16 - 128] + this.field412[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field412;
            this.field412 = this.field413;
            this.field413 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field648; ++var8) {
                for (int var9 = 0; var9 < arg1.field647; ++var9) {
                    if (arg1.field645[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field649;
                        int var11 = var8 + 16 + arg1.field650;
                        int var12 = (var11 << 7) + var10;
                        this.field412[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
    public final void method167(boolean arg0) {
        this.field177.method477(422);
        if (this.field291 == 2) {
            byte[] var2 = this.field476.field645;
            int[] var3 = class2.field57;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field460.method428(this.field396, 0, 25, 33, this.field232, 33, 25, 0, (byte) 7, 256, this.field180);
            this.field178.method477(422);
            class39.field1117 = this.field416;
        } else {
            int var6 = this.field396 + this.field287 & 2047;
            int var7 = field612.field1059 / 32 + 48;
            if (!arg0) {
                int var8 = 464 - field612.field1060 / 32;
                this.field403.method428(var6, 5, var8, 146, this.field458, 151, var7, 25, (byte) 7, this.field276 + 256, this.field527);
                this.field460.method428(this.field396, 0, 25, 33, this.field232, 33, 25, 0, (byte) 7, 256, this.field180);
                for (int var9 = 0; var9 < this.field259; ++var9) {
                    int var39 = this.field260[var9] * 4 + 2 - field612.field1059 / 32;
                    int var40 = this.field261[var9] * 4 + 2 - field612.field1060 / 32;
                    this.method102((byte) 2, var40, var39, this.field233[var9]);
                }
                for (int var10 = 0; var10 < 104; ++var10) {
                    for (int var35 = 0; var35 < 104; ++var35) {
                        class57 var36 = this.field437[this.field596][var10][var35];
                        if (var36 != null) {
                            int var37 = var10 * 4 + 2 - field612.field1059 / 32;
                            int var38 = var35 * 4 + 2 - field612.field1060 / 32;
                            this.method102((byte) 2, var38, var37, this.field351);
                        }
                    }
                }
                for (int var11 = 0; var11 < this.field195; ++var11) {
                    class45 var31 = this.field194[this.field196[var11]];
                    if (var31 != null && var31.method342(false)) {
                        class67 var32 = var31.field1259;
                        if (var32.field1628 != null) {
                            var32 = var32.method510(116);
                        }
                        if (var32 != null && var32.field1622 && var32.field1610) {
                            int var33 = var31.field1059 / 32 - field612.field1059 / 32;
                            int var34 = var31.field1060 / 32 - field612.field1060 / 32;
                            this.method102((byte) 2, var34, var33, this.field352);
                        }
                    }
                }
                for (int var12 = 0; var12 < this.field342; ++var12) {
                    class66 var23 = this.field341[this.field343[var12]];
                    if (var23 != null && var23.method342(false)) {
                        int var24 = var23.field1059 / 32 - field612.field1059 / 32;
                        int var25 = var23.field1060 / 32 - field612.field1060 / 32;
                        boolean var26 = false;
                        long var27 = class56.method461(var23.field1587);
                        for (int var29 = 0; var29 < this.field334; ++var29) {
                            if (this.field373[var29] == var27 && this.field281[var29] != 0) {
                                var26 = true;
                                break;
                            }
                        }
                        boolean var30 = false;
                        if (field612.field1567 != 0 && var23.field1567 != 0 && field612.field1567 == var23.field1567) {
                            var30 = true;
                        }
                        if (var26) {
                            this.method102((byte) 2, var25, var24, this.field354);
                        } else if (var30) {
                            this.method102((byte) 2, var25, var24, this.field355);
                        } else {
                            this.method102((byte) 2, var25, var24, this.field353);
                        }
                    }
                }
                if (this.field231 != 0 && field257 % 20 < 10) {
                    if (this.field231 == 1 && this.field347 >= 0 && this.field347 < this.field194.length) {
                        class45 var13 = this.field194[this.field347];
                        if (var13 != null) {
                            int var14 = var13.field1059 / 32 - field612.field1059 / 32;
                            int var15 = var13.field1060 / 32 - field612.field1060 / 32;
                            this.method140(var15, var14, -33991, this.field521);
                        }
                    }
                    if (this.field231 == 2) {
                        int var16 = (this.field438 - this.field363) * 4 + 2 - field612.field1059 / 32;
                        int var17 = (this.field439 - this.field364) * 4 + 2 - field612.field1060 / 32;
                        this.method140(var17, var16, -33991, this.field521);
                    }
                    if (this.field231 == 10 && this.field473 >= 0 && this.field473 < this.field341.length) {
                        class66 var18 = this.field341[this.field473];
                        if (var18 != null) {
                            int var19 = var18.field1059 / 32 - field612.field1059 / 32;
                            int var20 = var18.field1060 / 32 - field612.field1060 / 32;
                            this.method140(var20, var19, -33991, this.field521);
                        }
                    }
                }
                if (this.field401 != 0) {
                    int var21 = this.field401 * 4 + 2 - field612.field1059 / 32;
                    int var22 = this.field402 * 4 + 2 - field612.field1060 / 32;
                    this.method102((byte) 2, var22, var21, this.field520);
                }
                class2.method17(97, 78, this.field463, 16777215, 3, 3);
                this.field178.method477(422);
                class39.field1117 = this.field416;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(ILEMWAMCXW;I)V")
    private final void method168(int arg0, class14 arg1, int arg2) {
        arg1.method227((byte) 31);
        int var4 = arg1.method228(8, 4);
        int var10000 = arg0 + arg2;
        if (var4 < this.field195) {
            for (int var6 = var4; var6 < this.field195; ++var6) {
                this.field601[this.field600++] = this.field196[var6];
            }
        }
        if (var4 > this.field195) {
            signlink.reporterror(this.field478 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field195 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field196[var7];
                class45 var9 = this.field194[var8];
                int var10 = arg1.method228(1, 4);
                if (var10 == 0) {
                    this.field196[this.field195++] = var8;
                    var9.field1058 = field257;
                } else {
                    int var11 = arg1.method228(2, 4);
                    if (var11 == 0) {
                        this.field196[this.field195++] = var8;
                        var9.field1058 = field257;
                        this.field345[this.field344++] = var8;
                    } else if (var11 == 1) {
                        this.field196[this.field195++] = var8;
                        var9.field1058 = field257;
                        int var12 = arg1.method228(3, 4);
                        var9.method343(38670, var12, false);
                        int var13 = arg1.method228(1, 4);
                        if (var13 == 1) {
                            this.field345[this.field344++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field196[this.field195++] = var8;
                        var9.field1058 = field257;
                        int var14 = arg1.method228(3, 4);
                        var9.method343(38670, var14, true);
                        int var15 = arg1.method228(3, 4);
                        var9.method343(38670, var15, true);
                        int var16 = arg1.method228(1, 4);
                        if (var16 == 1) {
                            this.field345[this.field344++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field601[this.field600++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method169(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        class24 var11 = null;
        for (class24 var12 = (class24) this.field242.method470(); var12 != null; var12 = (class24) this.field242.method472(false)) {
            if (var12.field884 == arg4 && var12.field886 == arg6 && var12.field887 == arg9 && var12.field885 == arg7) {
                var11 = var12;
                break;
            }
        }
        if (var11 == null) {
            var11 = new class24();
            var11.field884 = arg4;
            var11.field885 = arg7;
            var11.field886 = arg6;
            var11.field887 = arg9;
            this.method80(var11, (byte) -25);
            this.field242.method467(var11);
        }
        var11.field892 = arg0;
        var11.field894 = arg1;
        var11.field893 = arg3;
        var11.field895 = arg5;
        if (arg2 != 0) {
            this.field437 = null;
        }
        var11.field888 = arg8;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LEMWAMCXW;II)V")
    private final void method170(class14 arg0, int arg1, int arg2) {
        int var4 = arg0.method228(8, 4);
        if (var4 < this.field342) {
            for (int var5 = var4; var5 < this.field342; ++var5) {
                this.field601[this.field600++] = this.field343[var5];
            }
        }
        if (var4 > this.field342) {
            signlink.reporterror(this.field478 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field342 = 0;
            int var6 = 70 / arg1;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field343[var7];
                class66 var9 = this.field341[var8];
                int var10 = arg0.method228(1, 4);
                if (var10 == 0) {
                    this.field343[this.field342++] = var8;
                    var9.field1058 = field257;
                } else {
                    int var11 = arg0.method228(2, 4);
                    if (var11 == 0) {
                        this.field343[this.field342++] = var8;
                        var9.field1058 = field257;
                        this.field345[this.field344++] = var8;
                    } else if (var11 == 1) {
                        this.field343[this.field342++] = var8;
                        var9.field1058 = field257;
                        int var12 = arg0.method228(3, 4);
                        var9.method343(38670, var12, false);
                        int var13 = arg0.method228(1, 4);
                        if (var13 == 1) {
                            this.field345[this.field344++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field343[this.field342++] = var8;
                        var9.field1058 = field257;
                        int var14 = arg0.method228(3, 4);
                        var9.method343(38670, var14, true);
                        int var15 = arg0.method228(3, 4);
                        var9.method343(38670, var15, true);
                        int var16 = arg0.method228(1, 4);
                        if (var16 == 1) {
                            this.field345[this.field344++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field601[this.field600++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(III)Z")
    public final boolean method171(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        class44 var5 = class44.method380(arg0);
        for (int var6 = 0; var6 < var5.field1245.length && var5.field1245[var6] != -1; ++var6) {
            class44 var7 = class44.method380(var5.field1245[var6]);
            if (var7.field1220 == 0) {
                var4 |= this.method171(var7.field1200, 32022, arg2);
            }
            if (var7.field1220 == 6 && (var7.field1208 != -1 || var7.field1209 != -1)) {
                boolean var8 = this.method128(-283, var7);
                int var9;
                if (var8) {
                    var9 = var7.field1209;
                } else {
                    var9 = var7.field1208;
                }
                if (var9 != -1) {
                    class55 var10 = class55.field1444[var9];
                    var7.field1242 += arg2;
                    while (var7.field1242 > var10.method459(var7.field1194, false)) {
                        var7.field1242 -= var10.method459(var7.field1194, false) + 1;
                        ++var7.field1194;
                        if (var7.field1194 >= var10.field1445) {
                            var7.field1194 -= var10.field1449;
                            if (var7.field1194 < 0 || var7.field1194 >= var10.field1445) {
                                var7.field1194 = 0;
                            }
                        }
                        var4 = true;
                    }
                }
            }
            if (var7.field1220 == 6 && var7.field1188 != 0) {
                int var11 = var7.field1188 >> 16;
                int var12 = var7.field1188 << 16 >> 16;
                int var13 = arg2 * var11;
                int var14 = arg2 * var12;
                var7.field1227 = var7.field1227 + var13 & 2047;
                var7.field1228 = var7.field1228 + var14 & 2047;
                var4 = true;
            }
        }
        if (arg1 != 32022) {
            this.field188.method207(175);
        }
        return var4;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void method172(int arg0, byte arg1) {
        int[] var3 = this.field403.field1345;
        if (arg1 != 0) {
            this.method81();
        }
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field192[arg0][var24][var6] & 24) == 0) {
                    this.field202.method551(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field192[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field202.method551(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field403.method419(422);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field192[arg0][var22][var9] & 24) == 0) {
                    this.method173(var9, arg0, (byte) 5, var8, var7, var22);
                }
                if (arg0 < 3 && (this.field192[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method173(var9, arg0 + 1, (byte) 5, var8, var7, var22);
                }
            }
        }
        if (this.field178 != null) {
            this.field178.method477(422);
            class39.field1117 = this.field416;
        }
        this.field259 = 0;
        for (int var10 = 0; var10 < 104; ++var10) {
            for (int var11 = 0; var11 < 104; ++var11) {
                int var12 = this.field202.method545(this.field596, var10, var11);
                if (var12 != 0) {
                    int var13 = var12 >> 14 & 32767;
                    int var14 = class1.method4(var13).field50;
                    if (var14 >= 0) {
                        int var15 = var10;
                        int var16 = var11;
                        if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                            byte var17 = 104;
                            byte var18 = 104;
                            int[][] var19 = this.field472[this.field596].field138;
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
                        this.field233[this.field259] = this.field235[var14];
                        this.field260[this.field259] = var15;
                        this.field261[this.field259] = var16;
                        ++this.field259;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIBIII)V")
    public final void method173(int arg0, int arg1, byte arg2, int arg3, int arg4, int arg5) {
        if (arg2 == 5) {
            boolean var7 = false;
        } else {
            for (int var8 = 1; var8 > 0; ++var8) {
            }
        }
        int var9 = this.field202.method542(arg1, arg5, arg0);
        if (var9 != 0) {
            int var10 = this.field202.method546(arg1, arg5, arg0, var9);
            int var11 = var10 >> 6 & 3;
            int var12 = var10 & 31;
            int var13 = arg4;
            if (var9 > 0) {
                var13 = arg3;
            }
            int[] var14 = this.field403.field1345;
            int var15 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
            int var16 = var9 >> 14 & 32767;
            class1 var17 = class1.method4(var16);
            if (var17.field36 != -1) {
                class8 var18 = this.field191[var17.field36];
                if (var18 != null) {
                    int var19 = (var17.field22 * 4 - var18.field647) / 2;
                    int var20 = (var17.field32 * 4 - var18.field648) / 2;
                    var18.method198(-24669, arg5 * 4 + 48 + var19, (104 - arg0 - var17.field32) * 4 + 48 + var20);
                }
            } else {
                if (var12 == 0 || var12 == 2) {
                    if (var11 == 0) {
                        var14[var15] = var13;
                        var14[var15 + 512] = var13;
                        var14[var15 + 1024] = var13;
                        var14[var15 + 1536] = var13;
                    } else if (var11 == 1) {
                        var14[var15] = var13;
                        var14[var15 + 1] = var13;
                        var14[var15 + 2] = var13;
                        var14[var15 + 3] = var13;
                    } else if (var11 == 2) {
                        var14[var15 + 3] = var13;
                        var14[var15 + 3 + 512] = var13;
                        var14[var15 + 3 + 1024] = var13;
                        var14[var15 + 3 + 1536] = var13;
                    } else if (var11 == 3) {
                        var14[var15 + 1536] = var13;
                        var14[var15 + 1536 + 1] = var13;
                        var14[var15 + 1536 + 2] = var13;
                        var14[var15 + 1536 + 3] = var13;
                    }
                }
                if (var12 == 3) {
                    if (var11 == 0) {
                        var14[var15] = var13;
                    } else if (var11 == 1) {
                        var14[var15 + 3] = var13;
                    } else if (var11 == 2) {
                        var14[var15 + 3 + 1536] = var13;
                    } else if (var11 == 3) {
                        var14[var15 + 1536] = var13;
                    }
                }
                if (var12 == 2) {
                    if (var11 == 3) {
                        var14[var15] = var13;
                        var14[var15 + 512] = var13;
                        var14[var15 + 1024] = var13;
                        var14[var15 + 1536] = var13;
                    } else if (var11 == 0) {
                        var14[var15] = var13;
                        var14[var15 + 1] = var13;
                        var14[var15 + 2] = var13;
                        var14[var15 + 3] = var13;
                    } else if (var11 == 1) {
                        var14[var15 + 3] = var13;
                        var14[var15 + 3 + 512] = var13;
                        var14[var15 + 3 + 1024] = var13;
                        var14[var15 + 3 + 1536] = var13;
                    } else if (var11 == 2) {
                        var14[var15 + 1536] = var13;
                        var14[var15 + 1536 + 1] = var13;
                        var14[var15 + 1536 + 2] = var13;
                        var14[var15 + 1536 + 3] = var13;
                    }
                }
            }
        }
        int var21 = this.field202.method544(arg1, arg5, arg0);
        if (var21 != 0) {
            int var22 = this.field202.method546(arg1, arg5, arg0, var21);
            int var23 = var22 >> 6 & 3;
            int var24 = var22 & 31;
            int var25 = var21 >> 14 & 32767;
            class1 var26 = class1.method4(var25);
            if (var26.field36 != -1) {
                class8 var27 = this.field191[var26.field36];
                if (var27 != null) {
                    int var28 = (var26.field22 * 4 - var27.field647) / 2;
                    int var29 = (var26.field32 * 4 - var27.field648) / 2;
                    var27.method198(-24669, arg5 * 4 + 48 + var28, (104 - arg0 - var26.field32) * 4 + 48 + var29);
                }
            } else if (var24 == 9) {
                int var30 = 15658734;
                if (var21 > 0) {
                    var30 = 15597568;
                }
                int[] var31 = this.field403.field1345;
                int var32 = (103 - arg0) * 512 * 4 + arg5 * 4 + 24624;
                if (var23 != 0 && var23 != 2) {
                    var31[var32] = var30;
                    var31[var32 + 512 + 1] = var30;
                    var31[var32 + 1024 + 2] = var30;
                    var31[var32 + 1536 + 3] = var30;
                } else {
                    var31[var32 + 1536] = var30;
                    var31[var32 + 1024 + 1] = var30;
                    var31[var32 + 512 + 2] = var30;
                    var31[var32 + 3] = var30;
                }
            }
        }
        int var33 = this.field202.method545(arg1, arg5, arg0);
        if (var33 != 0) {
            int var34 = var33 >> 14 & 32767;
            class1 var35 = class1.method4(var34);
            if (var35.field36 != -1) {
                class8 var36 = this.field191[var35.field36];
                if (var36 != null) {
                    int var37 = (var35.field22 * 4 - var36.field647) / 2;
                    int var38 = (var35.field32 * 4 - var36.field648) / 2;
                    var36.method198(-24669, arg5 * 4 + 48 + var37, (104 - arg0 - var35.field32) * 4 + 48 + var38);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    private static final String method174(byte arg0, int arg1) {
        if (arg0 != 6) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
    public final void method175(boolean arg0) {
        if (this.field546 == null) {
            super.field1365 = null;
            this.field466 &= arg0;
            this.field179 = null;
            this.field177 = null;
            this.field176 = null;
            this.field178 = null;
            this.field532 = null;
            this.field533 = null;
            this.field534 = null;
            this.field549 = new class59(this.method119((byte) 75), 128, 265, false);
            class2.method15(true);
            this.field550 = new class59(this.method119((byte) 75), 128, 265, false);
            class2.method15(true);
            this.field546 = new class59(this.method119((byte) 75), 509, 171, false);
            class2.method15(true);
            this.field547 = new class59(this.method119((byte) 75), 360, 132, false);
            class2.method15(true);
            this.field548 = new class59(this.method119((byte) 75), 360, 200, false);
            class2.method15(true);
            this.field551 = new class59(this.method119((byte) 75), 202, 238, false);
            class2.method15(true);
            this.field552 = new class59(this.method119((byte) 75), 203, 238, false);
            class2.method15(true);
            this.field553 = new class59(this.method119((byte) 75), 74, 94, false);
            class2.method15(true);
            this.field554 = new class59(this.method119((byte) 75), 75, 94, false);
            class2.method15(true);
            if (this.field501 != null) {
                this.method153(-31892);
                this.method176(312);
            }
            this.field587 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "I", descriptor = "(I)V")
    public final void method176(int arg0) {
        this.field377 = new class8(this.field501, "titlebox", 0);
        this.field378 = new class8(this.field501, "titlebutton", 0);
        if (arg0 <= 0) {
            this.field322 = this.field243.method496();
        }
        this.field623 = new class8[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field623[var2] = new class8(this.field501, "runes", var2);
        }
        this.field152 = new class50(128, 265);
        this.field153 = new class50(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field152.field1345[var3] = this.field549.field1498[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field153.field1345[var4] = this.field550.field1498[var4];
        }
        this.field248 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field248[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field248[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field248[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field248[var8 + 192] = 16777215;
        }
        this.field249 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field249[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field249[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field249[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field249[var12 + 192] = 16777215;
        }
        this.field250 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field250[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field250[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field250[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field250[var16 + 192] = 16777215;
        }
        this.field247 = new int[256];
        this.field412 = new int[32768];
        this.field413 = new int[32768];
        this.method166(-55, (class8) null);
        this.field567 = new int[32768];
        this.field568 = new int[32768];
        this.method98("Connecting to fileserver", 10, (byte) 5);
        if (!this.field391) {
            this.field531 = true;
            this.field391 = true;
            this.method185(this, 2);
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method177(byte arg0) {
        if (arg0 == 6) {
            boolean var2 = false;
        } else {
            this.method81();
        }
        signlink.midiplay = false;
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "J", descriptor = "(I)V")
    public final void method178(int arg0) {
        ++field453;
        while (arg0 >= 0) {
            this.field188.method207(68);
        }
        if (field453 > 130) {
            field453 = 0;
            this.field188.method206(137, 533);
            this.field188.method207(209);
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method436(4);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field236 != -1 && this.field558 == this.field236) {
                        if (var2 == 8 && this.field571.length() > 0) {
                            this.field571 = this.field571.substring(0, this.field571.length() - 1);
                        }
                        break;
                    }
                    if (this.field219) {
                        if (var2 >= 32 && var2 <= 122 && this.field372.length() < 80) {
                            this.field372 = this.field372 + (char) var2;
                            this.field275 = true;
                        }
                        if (var2 == 8 && this.field372.length() > 0) {
                            this.field372 = this.field372.substring(0, this.field372.length() - 1);
                            this.field275 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field219 = false;
                            this.field275 = true;
                            if (this.field427 == 1) {
                                long var3 = class56.method461(this.field372);
                                this.method184(0, var3);
                            }
                            if (this.field427 == 2 && this.field334 > 0) {
                                long var5 = class56.method461(this.field372);
                                this.method130(-224, var5);
                            }
                            if (this.field427 == 3 && this.field372.length() > 0) {
                                this.field188.method206(238, 533);
                                this.field188.method207(0);
                                int var7 = this.field188.field707;
                                this.field188.method213(this.field602, false);
                                class15.method257(921, this.field372, this.field188);
                                this.field188.method216(false, this.field188.field707 - var7);
                                this.field372 = class15.method258(false, this.field372);
                                this.field372 = class70.method577(false, this.field372);
                                this.method79(this.field372, 6, class56.method465(-74, class56.method462(false, this.field602)), true);
                                if (this.field164 == 2) {
                                    this.field164 = 1;
                                    this.field183 = true;
                                    this.field188.method206(178, 533);
                                    this.field188.method207(this.field423);
                                    this.field188.method207(this.field164);
                                    this.field188.method207(this.field306);
                                }
                            }
                            if (this.field427 == 4 && this.field577 < 100) {
                                long var8 = class56.method461(this.field372);
                                this.method82((byte) 9, var8);
                            }
                            if (this.field427 == 5 && this.field577 > 0) {
                                long var10 = class56.method461(this.field372);
                                this.method117(7, var10);
                            }
                        }
                    } else if (this.field483 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field379.length() < 10) {
                            this.field379 = this.field379 + (char) var2;
                            this.field275 = true;
                        }
                        if (var2 == 8 && this.field379.length() > 0) {
                            this.field379 = this.field379.substring(0, this.field379.length() - 1);
                            this.field275 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field379.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field379);
                                } catch (Exception var22) {
                                }
                                this.field188.method206(59, 533);
                                this.field188.method211(var12);
                            }
                            this.field483 = 0;
                            this.field275 = true;
                        }
                    } else if (this.field483 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field379.length() < 12) {
                            this.field379 = this.field379 + (char) var2;
                            this.field275 = true;
                        }
                        if (var2 == 8 && this.field379.length() > 0) {
                            this.field379 = this.field379.substring(0, this.field379.length() - 1);
                            this.field275 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field379.length() > 0) {
                                this.field188.method206(16, 533);
                                this.field188.method213(class56.method461(this.field379), false);
                            }
                            this.field483 = 0;
                            this.field275 = true;
                        }
                    } else if (this.field483 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field379.length() < 40) {
                            this.field379 = this.field379 + (char) var2;
                            this.field275 = true;
                        }
                        if (var2 == 8 && this.field379.length() > 0) {
                            this.field379 = this.field379.substring(0, this.field379.length() - 1);
                            this.field275 = true;
                        }
                    } else if (this.field234 == -1 && this.field333 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field443.length() < 80) {
                            this.field443 = this.field443 + (char) var2;
                            this.field275 = true;
                        }
                        if (var2 == 8 && this.field443.length() > 0) {
                            this.field443 = this.field443.substring(0, this.field443.length() - 1);
                            this.field275 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field443.length() > 0) {
                            if (this.field424 == 2) {
                                if (this.field443.equals("::clientdrop")) {
                                    this.method99(-602);
                                }
                                if (this.field443.equals("::lag")) {
                                    this.method118(field426);
                                }
                                if (this.field443.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field369.method315(2, -98); ++var13) {
                                        this.field369.method314(2, var13, (byte) 8, (byte) 1);
                                    }
                                }
                                if (this.field443.equals("::fpson")) {
                                    field358 = true;
                                }
                                if (this.field443.equals("::fpsoff")) {
                                    field358 = false;
                                }
                                if (this.field443.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field472[var14].field138[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field443.startsWith("::")) {
                                this.field188.method206(146, 533);
                                this.field188.method207(this.field443.length() - 1);
                                this.field188.method214(this.field443.substring(2));
                            } else {
                                String var17 = this.field443.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field443 = this.field443.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field443 = this.field443.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field443 = this.field443.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field443 = this.field443.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field443 = this.field443.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field443 = this.field443.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field443 = this.field443.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field443 = this.field443.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field443 = this.field443.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field443 = this.field443.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field443 = this.field443.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field443 = this.field443.substring(6);
                                }
                                String var19 = this.field443.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field443 = this.field443.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field443 = this.field443.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field443 = this.field443.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field443 = this.field443.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field443 = this.field443.substring(6);
                                }
                                this.field188.method206(35, 533);
                                this.field188.method207(0);
                                int var21 = this.field188.field707;
                                this.field188.method234(var18, true);
                                this.field188.method235(0, var20);
                                this.field193.field707 = 0;
                                class15.method257(921, this.field443, this.field193);
                                this.field188.method254(0, (byte) 8, this.field193.field706, this.field193.field707);
                                this.field188.method216(false, this.field188.field707 - var21);
                                this.field443 = class15.method258(false, this.field443);
                                this.field443 = class70.method577(false, this.field443);
                                field612.field1075 = this.field443;
                                field612.field1076 = var18;
                                field612.field1062 = var20;
                                field612.field1054 = 150;
                                if (this.field424 == 2) {
                                    this.method79(field612.field1075, 2, "@cr2@" + field612.field1587, true);
                                } else if (this.field424 == 1) {
                                    this.method79(field612.field1075, 2, "@cr1@" + field612.field1587, true);
                                } else {
                                    this.method79(field612.field1075, 2, field612.field1587, true);
                                }
                                if (this.field423 == 2) {
                                    this.field423 = 3;
                                    this.field183 = true;
                                    this.field188.method206(178, 533);
                                    this.field188.method207(this.field423);
                                    this.field188.method207(this.field164);
                                    this.field188.method207(this.field306);
                                }
                            }
                            this.field443 = "";
                            this.field275 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field571.length() < 12) {
                this.field571 = this.field571 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(II)V")
    public final void method179(int arg0, int arg1) {
        this.field487 += arg1;
        signlink.wavevol = arg0;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILQXTIWHBH;)I")
    public final int method180(int arg0, int arg1, class44 arg2) {
        if (arg0 != 1) {
            this.field188.method207(64);
        }
        if (arg2.field1253 != null && arg1 < arg2.field1253.length) {
            try {
                int[] var4 = arg2.field1253[arg1];
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
                        var9 = this.field434[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field163[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field190[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class44 var11 = class44.method380(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class54.field1439 && (!class54.method447(var12).field1390 || field270)) {
                            for (int var13 = 0; var13 < var11.field1255.length; ++var13) {
                                if (var12 + 1 == var11.field1255[var13]) {
                                    var9 += var11.field1181[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field319[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field238[this.field163[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field319[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field612.field1574;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class72.field1731; ++var14) {
                            if (class72.field1733[var14]) {
                                var9 += this.field163[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class44 var15 = class44.method380(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class54.field1439 && (!class54.method447(var16).field1390 || field270)) {
                            for (int var17 = 0; var17 < var15.field1255.length; ++var17) {
                                if (var15.field1255[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field282;
                    }
                    if (var8 == 12) {
                        var9 = this.field609;
                    }
                    if (var8 == 13) {
                        int var18 = this.field319[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class13 var21 = class13.field684[var20];
                        int var22 = var21.field686;
                        int var23 = var21.field687;
                        int var24 = var21.field688;
                        int var25 = field359[var24 - var23];
                        var9 = this.field319[var22] >> var23 & var25;
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
                        var9 = (field612.field1059 >> 7) + this.field363;
                    }
                    if (var8 == 19) {
                        var9 = (field612.field1060 >> 7) + this.field364;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LQXTIWHBH;I)V")
    public final void method181(class44 arg0, int arg1) {
        int var3 = arg0.field1237;
        int var4 = 96 / arg1;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var6 = this.field334;
                if (this.field335 != 2) {
                    var6 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var6) {
                    arg0.field1251 = "";
                    arg0.field1217 = 0;
                } else {
                    if (this.field281[var3] == 0) {
                        arg0.field1251 = "@red@Offline";
                    } else if (this.field281[var3] < 200) {
                        if (this.field281[var3] == field268) {
                            arg0.field1251 = "@gre@World" + (this.field281[var3] - 9);
                        } else {
                            arg0.field1251 = "@yel@World" + (this.field281[var3] - 9);
                        }
                    } else if (this.field281[var3] == field268) {
                        arg0.field1251 = "@gre@Classic" + (this.field281[var3] - 219);
                    } else {
                        arg0.field1251 = "@yel@Classic" + (this.field281[var3] - 219);
                    }
                    arg0.field1217 = 1;
                }
            } else if (var3 == 203) {
                int var7 = this.field334;
                if (this.field335 != 2) {
                    var7 = 0;
                }
                arg0.field1198 = var7 * 15 + 20;
                if (arg0.field1198 <= arg0.field1207) {
                    arg0.field1198 = arg0.field1207 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field335 == 0) {
                    arg0.field1251 = "Loading ignore list";
                    arg0.field1217 = 0;
                } else if (var3 == 1 && this.field335 == 0) {
                    arg0.field1251 = "Please wait...";
                    arg0.field1217 = 0;
                } else {
                    int var8 = this.field577;
                    if (this.field335 == 0) {
                        var8 = 0;
                    }
                    if (var3 >= var8) {
                        arg0.field1251 = "";
                        arg0.field1217 = 0;
                    } else {
                        arg0.field1251 = class56.method465(-74, class56.method462(false, this.field267[var3]));
                        arg0.field1217 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1198 = this.field577 * 15 + 20;
                if (arg0.field1198 <= arg0.field1207) {
                    arg0.field1198 = arg0.field1207 + 1;
                }
            } else if (var3 == 327) {
                arg0.field1227 = 150;
                arg0.field1228 = (int) (Math.sin((double) field257 / 40.0D) * 256.0D) & 2047;
                if (this.field624) {
                    for (int var9 = 0; var9 < 7; ++var9) {
                        int var16 = this.field299[var9];
                        if (var16 >= 0 && !class43.field1172[var16].method375(7)) {
                            return;
                        }
                    }
                    this.field624 = false;
                    class18[] var10 = new class18[7];
                    int var11 = 0;
                    for (int var12 = 0; var12 < 7; ++var12) {
                        int var15 = this.field299[var12];
                        if (var15 >= 0) {
                            var10[var11++] = class43.field1172[var15].method376(9);
                        }
                    }
                    class18 var13 = new class18(var10, this.field625, var11);
                    for (int var14 = 0; var14 < 5; ++var14) {
                        if (this.field485[var14] != 0) {
                            var13.method281(field245[var14][0], field245[var14][this.field485[var14]]);
                            if (var14 == 1) {
                                var13.method281(field454[0], field454[this.field485[var14]]);
                            }
                        }
                    }
                    var13.method274(false);
                    var13.method275((byte) 9, class55.field1444[field612.field1040].field1446[0]);
                    var13.method284(64, 850, -30, -50, -30, true);
                    arg0.field1215 = 5;
                    arg0.field1216 = 0;
                    class44.method383(0, (byte) -82, 5, var13);
                }
            } else if (var3 == 324) {
                if (this.field228 == null) {
                    this.field228 = arg0.field1199;
                    this.field229 = arg0.field1182;
                }
                if (this.field376) {
                    arg0.field1199 = this.field229;
                } else {
                    arg0.field1199 = this.field228;
                }
            } else if (var3 == 325) {
                if (this.field228 == null) {
                    this.field228 = arg0.field1199;
                    this.field229 = arg0.field1182;
                }
                if (this.field376) {
                    arg0.field1199 = this.field228;
                } else {
                    arg0.field1199 = this.field229;
                }
            } else if (var3 == 600) {
                arg0.field1251 = this.field571;
                if (field257 % 20 < 10) {
                    arg0.field1251 = arg0.field1251 + "|";
                } else {
                    arg0.field1251 = arg0.field1251 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field424 >= 1) {
                        if (this.field525) {
                            arg0.field1180 = 16711680;
                            arg0.field1251 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1180 = 16777215;
                            arg0.field1251 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1251 = "";
                    }
                }
                if (var3 == 660) {
                    int var17 = this.field615 - this.field608;
                    String var18;
                    if (var17 <= 0) {
                        var18 = "earlier today";
                    } else if (var17 == 1) {
                        var18 = "yesterday";
                    } else {
                        var18 = var17 + " days ago";
                    }
                    arg0.field1251 = "You last logged in @red@" + var18 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field540 == 0) {
                        arg0.field1251 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field540 <= this.field615) {
                        arg0.field1251 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method182(true, this.field540);
                    } else {
                        int var19 = this.field615 + 14 - this.field540;
                        String var20;
                        if (var19 <= 0) {
                            var20 = "Earlier today";
                        } else if (var19 == 1) {
                            var20 = "Yesterday";
                        } else {
                            var20 = var19 + " days ago";
                        }
                        arg0.field1251 = var20 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method182(true, this.field540) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var21;
                    if (this.field244 == 0) {
                        var21 = "@yel@0 unread messages";
                    } else if (this.field244 == 1) {
                        var21 = "@gre@1 unread message";
                    } else {
                        var21 = "@gre@" + this.field244 + " unread messages";
                    }
                    arg0.field1251 = "You have " + var21 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field432 > 0 && this.field432 <= this.field615 + 10) {
                        arg0.field1251 = "Last password change:\\n@gre@" + this.method182(true, this.field432);
                    } else {
                        arg0.field1251 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field594 > 2 && !field270) {
                        arg0.field1251 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field594 > 2) {
                        arg0.field1251 = "\\n\\nYou have @gre@" + this.field594 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field594 > 0) {
                        arg0.field1251 = "You have @gre@" + this.field594 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field1251 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field594 > 2 && !field270) {
                        arg0.field1251 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field594 > 0) {
                        arg0.field1251 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field1251 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field540 > this.field615) {
                        arg0.field1251 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field1251 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field335 == 0) {
            arg0.field1251 = "Loading friend list";
            arg0.field1217 = 0;
        } else if (var3 == 1 && this.field335 == 1) {
            arg0.field1251 = "Connecting to friendserver";
            arg0.field1217 = 0;
        } else if (var3 == 2 && this.field335 != 2) {
            arg0.field1251 = "Please wait...";
            arg0.field1217 = 0;
        } else {
            int var5 = this.field334;
            if (this.field335 != 2) {
                var5 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var5) {
                arg0.field1251 = "";
                arg0.field1217 = 0;
            } else {
                arg0.field1251 = this.field207[var3];
                arg0.field1217 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method182(boolean arg0, int arg1) {
        if (arg1 > this.field615 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            if (!arg0) {
                this.method81();
            }
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILQXTIWHBH;BII)V")
    public final void method183(int arg0, class44 arg1, byte arg2, int arg3, int arg4) {
        if (arg1.field1220 == 0 && arg1.field1245 != null) {
            if (!arg1.field1248 || this.field500 == arg1.field1200 || this.field181 == arg1.field1200 || this.field298 == arg1.field1200) {
                int var6 = class2.field62;
                int var7 = class2.field60;
                int var8 = class2.field63;
                int var9 = class2.field61;
                class2.method14(arg1.field1250 + arg0, arg3, arg1.field1207 + arg3, arg0, 357);
                int var10 = arg1.field1245.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var12 = arg1.field1234[var11] + arg0;
                    int var13 = arg1.field1191[var11] + arg3 - arg4;
                    class44 var14 = class44.method380(arg1.field1245[var11]);
                    int var15 = var14.field1252 + var12;
                    int var16 = var14.field1185 + var13;
                    if (var14.field1237 > 0) {
                        this.method181(var14, 591);
                    }
                    if (var14.field1220 == 0) {
                        if (var14.field1196 > var14.field1198 - var14.field1207) {
                            var14.field1196 = var14.field1198 - var14.field1207;
                        }
                        if (var14.field1196 < 0) {
                            var14.field1196 = 0;
                        }
                        this.method183(var15, var14, (byte) 27, var16, var14.field1196);
                        if (var14.field1198 > var14.field1207) {
                            this.method152(var16, var14.field1198, var14.field1196, var14.field1207, 9, var14.field1250 + var15);
                        }
                    } else if (var14.field1220 != 1) {
                        if (var14.field1220 == 2) {
                            int var17 = 0;
                            for (int var18 = 0; var18 < var14.field1207; ++var18) {
                                for (int var19 = 0; var19 < var14.field1250; ++var19) {
                                    int var20 = (var14.field1186 + 32) * var19 + var15;
                                    int var21 = (var14.field1184 + 32) * var18 + var16;
                                    if (var17 < 20) {
                                        var20 += var14.field1239[var17];
                                        var21 += var14.field1190[var17];
                                    }
                                    if (var14.field1255[var17] <= 0) {
                                        if (var14.field1192 != null && var17 < 20) {
                                            class50 var30 = var14.field1192[var17];
                                            if (var30 != null) {
                                                var30.method424(-24669, var20, var21);
                                            }
                                        }
                                    } else {
                                        int var22 = 0;
                                        int var23 = 0;
                                        int var24 = var14.field1255[var17] - 1;
                                        if (var20 > class2.field62 - 32 && var20 < class2.field63 && var21 > class2.field60 - 32 && var21 < class2.field61 || this.field388 != 0 && this.field387 == var17) {
                                            int var25 = 0;
                                            if (this.field197 == 1 && this.field198 == var17 && this.field199 == var14.field1200) {
                                                var25 = 16777215;
                                            }
                                            class50 var26 = class54.method446(var14.field1181[var17], true, var24, var25);
                                            if (var26 != null) {
                                                if (this.field388 != 0 && this.field387 == var17 && this.field386 == var14.field1200) {
                                                    var22 = super.field1372 - this.field389;
                                                    var23 = super.field1373 - this.field390;
                                                    if (var22 < 5 && var22 > -5) {
                                                        var22 = 0;
                                                    }
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (this.field206 < 5) {
                                                        var22 = 0;
                                                        var23 = 0;
                                                    }
                                                    var26.method426(var20 + var22, 128, (byte) 5, var21 + var23);
                                                    if (var21 + var23 < class2.field60 && arg1.field1196 > 0) {
                                                        int var27 = (class2.field60 - var21 - var23) * this.field356 / 3;
                                                        if (var27 > this.field356 * 10) {
                                                            var27 = this.field356 * 10;
                                                        }
                                                        if (var27 > arg1.field1196) {
                                                            var27 = arg1.field1196;
                                                        }
                                                        arg1.field1196 -= var27;
                                                        this.field390 += var27;
                                                    }
                                                    if (var21 + var23 + 32 > class2.field61 && arg1.field1196 < arg1.field1198 - arg1.field1207) {
                                                        int var28 = (var21 + var23 + 32 - class2.field61) * this.field356 / 3;
                                                        if (var28 > this.field356 * 10) {
                                                            var28 = this.field356 * 10;
                                                        }
                                                        if (var28 > arg1.field1198 - arg1.field1207 - arg1.field1196) {
                                                            var28 = arg1.field1198 - arg1.field1207 - arg1.field1196;
                                                        }
                                                        arg1.field1196 += var28;
                                                        this.field390 -= var28;
                                                    }
                                                } else if (this.field497 != 0 && this.field496 == var17 && this.field495 == var14.field1200) {
                                                    var26.method426(var20, 128, (byte) 5, var21);
                                                } else {
                                                    var26.method424(-24669, var20, var21);
                                                }
                                                if (var26.field1350 == 33 || var14.field1181[var17] != 1) {
                                                    int var29 = var14.field1181[var17];
                                                    this.field148.method485(method174((byte) 6, var29), false, var20 + 1 + var22, 0, var21 + 10 + var23);
                                                    this.field148.method485(method174((byte) 6, var29), false, var20 + var22, 16776960, var21 + 9 + var23);
                                                }
                                            }
                                        }
                                    }
                                    ++var17;
                                }
                            }
                        } else if (var14.field1220 == 3) {
                            boolean var31 = false;
                            if (this.field298 == var14.field1200 || this.field181 == var14.field1200 || this.field500 == var14.field1200) {
                                var31 = true;
                            }
                            int var32;
                            if (this.method128(-283, var14)) {
                                var32 = var14.field1179;
                                if (var31 && var14.field1225 != 0) {
                                    var32 = var14.field1225;
                                }
                            } else {
                                var32 = var14.field1180;
                                if (var31 && var14.field1187 != 0) {
                                    var32 = var14.field1187;
                                }
                            }
                            if (var14.field1241 == 0) {
                                if (var14.field1193) {
                                    class2.method17(var15, var16, this.field463, var32, var14.field1250, var14.field1207);
                                } else {
                                    class2.method18(0, var15, var14.field1250, var32, var14.field1207, var16);
                                }
                            } else if (var14.field1193) {
                                class2.method16(var15, 256 - (var14.field1241 & 255), var14.field1250, var14.field1207, false, var32, var16);
                            } else {
                                class2.method19(true, var15, var14.field1207, 256 - (var14.field1241 & 255), var14.field1250, var32, var16);
                            }
                        } else if (var14.field1220 == 4) {
                            class62 var33 = var14.field1231;
                            String var34 = var14.field1251;
                            boolean var35 = false;
                            if (this.field298 == var14.field1200 || this.field181 == var14.field1200 || this.field500 == var14.field1200) {
                                var35 = true;
                            }
                            int var36;
                            if (this.method128(-283, var14)) {
                                var36 = var14.field1179;
                                if (var35 && var14.field1225 != 0) {
                                    var36 = var14.field1225;
                                }
                                if (var14.field1203.length() > 0) {
                                    var34 = var14.field1203;
                                }
                            } else {
                                var36 = var14.field1180;
                                if (var35 && var14.field1187 != 0) {
                                    var36 = var14.field1187;
                                }
                            }
                            if (var14.field1217 == 6 && this.field566) {
                                var34 = "Please wait...";
                                var36 = var14.field1180;
                            }
                            if (class2.field58 == 479) {
                                if (var36 == 16776960) {
                                    var36 = 255;
                                }
                                if (var36 == 49152) {
                                    var36 = 16777215;
                                }
                            }
                            int var37 = var33.field1542 + var16;
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
                                                                        var34 = var34.substring(0, var42) + this.method121(this.method180(1, 4, var14), true) + var34.substring(var42 + 2);
                                                                    }
                                                                }
                                                                var34 = var34.substring(0, var41) + this.method121(this.method180(1, 3, var14), true) + var34.substring(var41 + 2);
                                                            }
                                                        }
                                                        var34 = var34.substring(0, var40) + this.method121(this.method180(1, 2, var14), true) + var34.substring(var40 + 2);
                                                    }
                                                }
                                                var34 = var34.substring(0, var39) + this.method121(this.method180(1, 1, var14), true) + var34.substring(var39 + 2);
                                            }
                                        }
                                        var34 = var34.substring(0, var38) + this.method121(this.method180(1, 0, var14), true) + var34.substring(var38 + 2);
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
                                if (var14.field1243) {
                                    var33.method482(true, var44, var36, var14.field1249, var14.field1250 / 2 + var15, var37);
                                } else {
                                    var33.method489(var14.field1249, var15, var36, var37, -877, var44);
                                }
                                var37 += var33.field1542;
                            }
                        } else if (var14.field1220 == 5) {
                            class50 var45;
                            if (this.method128(-283, var14)) {
                                var45 = var14.field1182;
                            } else {
                                var45 = var14.field1199;
                            }
                            if (var45 != null) {
                                var45.method424(-24669, var15, var16);
                            }
                        } else if (var14.field1220 == 6) {
                            int var46 = class39.field1111;
                            int var47 = class39.field1112;
                            class39.field1111 = var14.field1250 / 2 + var15;
                            class39.field1112 = var14.field1207 / 2 + var16;
                            int var48 = class39.field1115[var14.field1227] * var14.field1226 >> 16;
                            int var49 = class39.field1116[var14.field1227] * var14.field1226 >> 16;
                            boolean var50 = this.method128(-283, var14);
                            int var51;
                            if (var50) {
                                var51 = var14.field1209;
                            } else {
                                var51 = var14.field1208;
                            }
                            class18 var52;
                            if (var51 == -1) {
                                var52 = var14.method381(-1, var50, -1, (byte) -26);
                            } else {
                                class55 var53 = class55.field1444[var51];
                                var52 = var14.method381(var53.field1447[var14.field1194], var50, var53.field1446[var14.field1194], (byte) -26);
                            }
                            if (var52 != null) {
                                var52.method288(0, var14.field1228, 0, var14.field1227, 0, var48, var49);
                            }
                            class39.field1111 = var46;
                            class39.field1112 = var47;
                        } else {
                            if (var14.field1220 == 7) {
                                class62 var54 = var14.field1231;
                                int var55 = 0;
                                for (int var56 = 0; var56 < var14.field1207; ++var56) {
                                    for (int var57 = 0; var57 < var14.field1250; ++var57) {
                                        if (var14.field1255[var55] > 0) {
                                            class54 var58 = class54.method447(var14.field1255[var55] - 1);
                                            String var59 = String.valueOf(var58.field1419);
                                            if (var58.field1422 || var14.field1181[var55] != 1) {
                                                var59 = var59 + " x" + method66(var14.field1181[var55], 2);
                                            }
                                            int var60 = (var14.field1186 + 115) * var57 + var15;
                                            int var61 = (var14.field1184 + 12) * var56 + var16;
                                            if (var14.field1243) {
                                                var54.method482(true, var59, var14.field1180, var14.field1249, var14.field1250 / 2 + var60, var61);
                                            } else {
                                                var54.method489(var14.field1249, var60, var14.field1180, var61, -877, var59);
                                            }
                                        }
                                        ++var55;
                                    }
                                }
                            }
                            if (var14.field1220 == 8 && (this.field326 == var14.field1200 || this.field184 == var14.field1200 || this.field459 == var14.field1200) && this.field611 == 100) {
                                int var62 = 0;
                                int var63 = 0;
                                class62 var64 = this.field149;
                                String var65 = var14.field1251;
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
                                    int var74 = var64.method483(true, var73);
                                    if (var74 > var62) {
                                        var62 = var74;
                                    }
                                    var63 += var64.field1542 + 1;
                                }
                                var62 += 6;
                                var63 += 7;
                                int var66 = var14.field1250 + var15 - 5 - var62;
                                int var67 = var14.field1207 + var16 + 5;
                                if (var66 < var15 + 5) {
                                    var66 = var15 + 5;
                                }
                                if (var62 + var66 > arg1.field1250 + arg0) {
                                    var66 = arg1.field1250 + arg0 - var62;
                                }
                                if (var63 + var67 > arg1.field1207 + arg3) {
                                    var67 = arg1.field1207 + arg3 - var63;
                                }
                                class2.method17(var66, var67, this.field463, 16777120, var62, var63);
                                class2.method18(0, var66, var62, 0, var63, var67);
                                String var68 = var14.field1251;
                                int var69 = var64.field1542 + var67 + 2;
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
                                    var64.method489(false, var66 + 3, 0, var69, -877, var71);
                                    var69 += var64.field1542 + 1;
                                }
                            }
                        }
                    }
                }
                if (arg2 != 27) {
                    field143 = this.field243.method496();
                }
                class2.method14(var8, var7, var9, var6, 357);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IJ)V")
    public final void method184(int arg0, long arg1) {
        if (arg1 != 0L) {
            if (this.field334 >= 100 && this.field542 != 1) {
                this.method79("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", true);
            } else if (this.field334 >= 200) {
                this.method79("Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "", true);
            } else {
                String var4 = class56.method465(-74, class56.method462(false, arg1));
                for (int var5 = 0; var5 < this.field334; ++var5) {
                    if (this.field373[var5] == arg1) {
                        this.method79(var4 + " is already on your friend list", 0, "", true);
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field577; ++var6) {
                    if (this.field267[var6] == arg1) {
                        this.method79("Please remove " + var4 + " from your ignore list first", 0, "", true);
                        return;
                    }
                }
                if (!var4.equals(field612.field1587)) {
                    this.field207[this.field334] = var4;
                    this.field373[this.field334] = arg1;
                    this.field281[this.field334] = 0;
                    ++this.field334;
                    this.field348 = true;
                    this.field487 += arg0;
                    this.field188.method206(217, 533);
                    this.field188.method213(arg1, false);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method185(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method185(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(III)V")
    public final void method186(int arg0, int arg1, int arg2) {
        int var4 = 0;
        for (int var5 = 0; var5 < 100; ++var5) {
            if (this.field545[var5] != null) {
                int var6 = this.field543[var5];
                int var7 = 70 - var4 * 14 + this.field370 + 4;
                if (var7 < -20) {
                    break;
                }
                String var8 = this.field544[var5];
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
                if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field423 == 0 || this.field423 == 1 && this.method107(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field612.field1587)) {
                        if (this.field424 >= 1) {
                            this.field332[this.field419] = "Report abuse @whi@" + var8;
                            this.field518[this.field419] = 265;
                            ++this.field419;
                        }
                        this.field332[this.field419] = "Add ignore @whi@" + var8;
                        this.field518[this.field419] = 723;
                        ++this.field419;
                        this.field332[this.field419] = "Add friend @whi@" + var8;
                        this.field518[this.field419] = 66;
                        ++this.field419;
                    }
                    ++var4;
                }
                if ((var6 == 3 || var6 == 7) && this.field221 == 0 && (var6 == 7 || this.field164 == 0 || this.field164 == 1 && this.method107(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        if (this.field424 >= 1) {
                            this.field332[this.field419] = "Report abuse @whi@" + var8;
                            this.field518[this.field419] = 265;
                            ++this.field419;
                        }
                        this.field332[this.field419] = "Add ignore @whi@" + var8;
                        this.field518[this.field419] = 723;
                        ++this.field419;
                        this.field332[this.field419] = "Add friend @whi@" + var8;
                        this.field518[this.field419] = 66;
                        ++this.field419;
                    }
                    ++var4;
                }
                if (var6 == 4 && (this.field306 == 0 || this.field306 == 1 && this.method107(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field332[this.field419] = "Accept trade @whi@" + var8;
                        this.field518[this.field419] = 301;
                        ++this.field419;
                    }
                    ++var4;
                }
                if ((var6 == 5 || var6 == 6) && this.field221 == 0 && this.field164 < 2) {
                    ++var4;
                }
                if (var6 == 8 && (this.field306 == 0 || this.field306 == 1 && this.method107(0, var8))) {
                    if (arg0 > var7 - 14 && arg0 <= var7) {
                        this.field332[this.field419] = "Accept challenge @whi@" + var8;
                        this.field518[this.field419] = 769;
                        ++this.field419;
                    }
                    ++var4;
                }
            }
        }
        if (arg1 != -16295) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field238[var1] = var0 / 4;
        }
        field245 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field268 = 10;
        field270 = true;
        field273 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field300 = 43360;
        field349 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field359 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field359[var3] = var2 - 1;
            var2 += var2;
        }
        field371 = -24958;
        field426 = true;
        field454 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field523 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field526 = true;
        field580 = 16822;
    }
}
