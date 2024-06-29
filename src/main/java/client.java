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

    @OriginalMember(owner = "client!client", name = "K", descriptor = "[LIBHUFTPE;")
    private class22[] field128 = new class22[32];

    @OriginalMember(owner = "client!client", name = "L", descriptor = "I")
    private int field129 = -1;

    @OriginalMember(owner = "client!client", name = "Q", descriptor = "I")
    private int field134 = 9764;

    @OriginalMember(owner = "client!client", name = "S", descriptor = "B")
    private byte field136 = 90;

    @OriginalMember(owner = "client!client", name = "cb", descriptor = "Z")
    private volatile boolean field146 = false;

    @OriginalMember(owner = "client!client", name = "eb", descriptor = "I")
    private int field148 = 2;

    @OriginalMember(owner = "client!client", name = "fb", descriptor = "Z")
    private boolean field149 = false;

    @OriginalMember(owner = "client!client", name = "gb", descriptor = "I")
    private int field150 = 2048;

    @OriginalMember(owner = "client!client", name = "hb", descriptor = "I")
    private int field151 = 2047;

    @OriginalMember(owner = "client!client", name = "ib", descriptor = "[LBSQIIHOT;")
    private class6[] field152 = new class6[this.field150];

    @OriginalMember(owner = "client!client", name = "kb", descriptor = "[I")
    public int[] field154 = new int[this.field150];

    @OriginalMember(owner = "client!client", name = "mb", descriptor = "[I")
    private int[] field156 = new int[this.field150];

    @OriginalMember(owner = "client!client", name = "nb", descriptor = "[LMVHXDWGI;")
    private class38[] field157 = new class38[this.field150];

    @OriginalMember(owner = "client!client", name = "qb", descriptor = "[I")
    private int[] field160 = new int[class72.field1726];

    @OriginalMember(owner = "client!client", name = "rb", descriptor = "I")
    private int field161 = 35446;

    @OriginalMember(owner = "client!client", name = "sb", descriptor = "[I")
    private int[] field162 = new int[200];

    @OriginalMember(owner = "client!client", name = "xb", descriptor = "I")
    private int field167 = 3;

    @OriginalMember(owner = "client!client", name = "yb", descriptor = "I")
    private int field168 = 394;

    @OriginalMember(owner = "client!client", name = "zb", descriptor = "[J")
    private long[] field169 = new long[100];

    @OriginalMember(owner = "client!client", name = "Bb", descriptor = "Z")
    private boolean field171 = false;

    @OriginalMember(owner = "client!client", name = "Db", descriptor = "[LIBHUFTPE;")
    private class22[] field173 = new class22[100];

    @OriginalMember(owner = "client!client", name = "Eb", descriptor = "Z")
    private boolean field174 = true;

    @OriginalMember(owner = "client!client", name = "Fb", descriptor = "Z")
    public boolean field175 = true;

    @OriginalMember(owner = "client!client", name = "Tb", descriptor = "LIHMCQRZY;")
    private class24 field189 = new class24(field559);

    @OriginalMember(owner = "client!client", name = "Ub", descriptor = "Z")
    private volatile boolean field190 = false;

    @OriginalMember(owner = "client!client", name = "bc", descriptor = "I")
    private int field197 = -30964;

    @OriginalMember(owner = "client!client", name = "cc", descriptor = "Z")
    private boolean field198 = false;

    @OriginalMember(owner = "client!client", name = "dc", descriptor = "I")
    private int field199 = -1;

    @OriginalMember(owner = "client!client", name = "jc", descriptor = "Z")
    private boolean field205 = true;

    @OriginalMember(owner = "client!client", name = "oc", descriptor = "Z")
    public boolean field210 = false;

    @OriginalMember(owner = "client!client", name = "sc", descriptor = "I")
    private int field214 = 8;

    @OriginalMember(owner = "client!client", name = "uc", descriptor = "I")
    private int field216 = 7759444;

    @OriginalMember(owner = "client!client", name = "Ec", descriptor = "Z")
    private boolean field226 = false;

    @OriginalMember(owner = "client!client", name = "Gc", descriptor = "I")
    private int field228 = -1;

    @OriginalMember(owner = "client!client", name = "Hc", descriptor = "Z")
    private boolean field229 = false;

    @OriginalMember(owner = "client!client", name = "Qc", descriptor = "Z")
    private boolean field238 = false;

    @OriginalMember(owner = "client!client", name = "Rc", descriptor = "I")
    private int field239 = 653;

    @OriginalMember(owner = "client!client", name = "Sc", descriptor = "[J")
    private long[] field240 = new long[200];

    @OriginalMember(owner = "client!client", name = "Tc", descriptor = "Ljava/lang/String;")
    private String field241 = "";

    @OriginalMember(owner = "client!client", name = "Vc", descriptor = "I")
    private int field243 = 1;

    @OriginalMember(owner = "client!client", name = "Wc", descriptor = "Z")
    private boolean field244 = false;

    @OriginalMember(owner = "client!client", name = "dd", descriptor = "LMVHXDWGI;")
    private class38 field251 = class38.method345((byte) 7, 1);

    @OriginalMember(owner = "client!client", name = "fd", descriptor = "[I")
    public int[] field253 = new int[1000];

    @OriginalMember(owner = "client!client", name = "gd", descriptor = "Z")
    private boolean field254 = false;

    @OriginalMember(owner = "client!client", name = "jd", descriptor = "B")
    private byte field257 = -18;

    @OriginalMember(owner = "client!client", name = "kd", descriptor = "Z")
    private boolean field258 = false;

    @OriginalMember(owner = "client!client", name = "od", descriptor = "[I")
    private int[] field262 = new int[] { 16776960, 16711680, 65280, 65535, 16711935, 16777215 };

    @OriginalMember(owner = "client!client", name = "pd", descriptor = "I")
    private int field263 = 6;

    @OriginalMember(owner = "client!client", name = "rd", descriptor = "I")
    private int field265 = 2;

    @OriginalMember(owner = "client!client", name = "sd", descriptor = "B")
    private byte field266 = -58;

    @OriginalMember(owner = "client!client", name = "ud", descriptor = "Ljava/lang/String;")
    private String field268 = "";

    @OriginalMember(owner = "client!client", name = "wd", descriptor = "[Ljava/lang/String;")
    private String[] field270 = new String[100];

    @OriginalMember(owner = "client!client", name = "xd", descriptor = "[I")
    private int[] field271 = new int[100];

    @OriginalMember(owner = "client!client", name = "zd", descriptor = "Z")
    private boolean field273 = false;

    @OriginalMember(owner = "client!client", name = "Bd", descriptor = "[I")
    private int[] field275 = new int[151];

    @OriginalMember(owner = "client!client", name = "Fd", descriptor = "I")
    private int field279 = 307;

    @OriginalMember(owner = "client!client", name = "Md", descriptor = "Z")
    private boolean field286 = false;

    @OriginalMember(owner = "client!client", name = "Pd", descriptor = "[I")
    private int[] field289 = new int[9];

    @OriginalMember(owner = "client!client", name = "Wd", descriptor = "Z")
    private boolean field296 = false;

    @OriginalMember(owner = "client!client", name = "Yd", descriptor = "[[[I")
    private int[][][] field298 = new int[4][13][13];

    @OriginalMember(owner = "client!client", name = "Zd", descriptor = "[I")
    private int[] field299 = new int[5];

    @OriginalMember(owner = "client!client", name = "ge", descriptor = "LIHMCQRZY;")
    private class24 field306 = new class24(field559);

    @OriginalMember(owner = "client!client", name = "he", descriptor = "I")
    private int field307 = 3353893;

    @OriginalMember(owner = "client!client", name = "ie", descriptor = "Z")
    private boolean field308 = false;

    @OriginalMember(owner = "client!client", name = "le", descriptor = "[I")
    private int[] field311 = new int[1000];

    @OriginalMember(owner = "client!client", name = "me", descriptor = "[I")
    private int[] field312 = new int[1000];

    @OriginalMember(owner = "client!client", name = "oe", descriptor = "[LLQLHEUAQ;")
    private class31[] field314 = new class31[4];

    @OriginalMember(owner = "client!client", name = "pe", descriptor = "Z")
    private boolean field315 = false;

    @OriginalMember(owner = "client!client", name = "ve", descriptor = "[I")
    private int[] field321 = new int[] { -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1 };

    @OriginalMember(owner = "client!client", name = "Ce", descriptor = "[I")
    private int[] field328 = new int[33];

    @OriginalMember(owner = "client!client", name = "Ie", descriptor = "Ljava/lang/String;")
    private String field334 = "";

    @OriginalMember(owner = "client!client", name = "Le", descriptor = "[[I")
    private int[][] field337 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Ne", descriptor = "I")
    private int field339 = 78;

    @OriginalMember(owner = "client!client", name = "Qe", descriptor = "Ljava/lang/String;")
    private String field342 = "";

    @OriginalMember(owner = "client!client", name = "Re", descriptor = "I")
    private int field343 = 6;

    @OriginalMember(owner = "client!client", name = "Se", descriptor = "Z")
    private boolean field344 = true;

    @OriginalMember(owner = "client!client", name = "Te", descriptor = "[I")
    private int[] field345 = new int[5];

    @OriginalMember(owner = "client!client", name = "Ue", descriptor = "[I")
    private int[] field346 = new int[50];

    @OriginalMember(owner = "client!client", name = "Ve", descriptor = "[LIBHUFTPE;")
    private class22[] field347 = new class22[20];

    @OriginalMember(owner = "client!client", name = "We", descriptor = "I")
    private int field348 = -1;

    @OriginalMember(owner = "client!client", name = "Ye", descriptor = "I")
    private int field350 = -1;

    @OriginalMember(owner = "client!client", name = "af", descriptor = "I")
    private int field352 = 4;

    @OriginalMember(owner = "client!client", name = "df", descriptor = "I")
    private int field355 = -208;

    @OriginalMember(owner = "client!client", name = "ef", descriptor = "[LBNGXLHWA;")
    private class5[] field356 = new class5[13];

    @OriginalMember(owner = "client!client", name = "kf", descriptor = "[LQQNRPAWO;")
    public class48[] field361 = new class48[5];

    @OriginalMember(owner = "client!client", name = "sf", descriptor = "B")
    private byte field369 = -114;

    @OriginalMember(owner = "client!client", name = "tf", descriptor = "I")
    private int field370 = -1;

    @OriginalMember(owner = "client!client", name = "uf", descriptor = "[I")
    private int[] field371 = new int[50];

    @OriginalMember(owner = "client!client", name = "yf", descriptor = "Z")
    private boolean field375 = true;

    @OriginalMember(owner = "client!client", name = "Df", descriptor = "I")
    private int field380 = -1;

    @OriginalMember(owner = "client!client", name = "Ef", descriptor = "I")
    private int field381 = 156;

    @OriginalMember(owner = "client!client", name = "Hf", descriptor = "Z")
    private volatile boolean field384 = false;

    @OriginalMember(owner = "client!client", name = "If", descriptor = "[LIBHUFTPE;")
    private class22[] field385 = new class22[32];

    @OriginalMember(owner = "client!client", name = "Jf", descriptor = "LIHMCQRZY;")
    private class24 field386 = new class24(field559);

    @OriginalMember(owner = "client!client", name = "Kf", descriptor = "[LBNGXLHWA;")
    private class5[] field387 = new class5[2];

    @OriginalMember(owner = "client!client", name = "Lf", descriptor = "[I")
    private int[] field388 = new int[50];

    @OriginalMember(owner = "client!client", name = "Mf", descriptor = "I")
    private int field389 = 3;

    @OriginalMember(owner = "client!client", name = "Qf", descriptor = "B")
    private byte field393 = 8;

    @OriginalMember(owner = "client!client", name = "Sf", descriptor = "[Ljava/lang/String;")
    private String[] field395 = new String[5];

    @OriginalMember(owner = "client!client", name = "Tf", descriptor = "[Z")
    private boolean[] field396 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "Uf", descriptor = "[LBNGXLHWA;")
    private class5[] field397 = new class5[100];

    @OriginalMember(owner = "client!client", name = "Vf", descriptor = "LMVHXDWGI;")
    private class38 field398 = class38.method345((byte) 7, 1);

    @OriginalMember(owner = "client!client", name = "dg", descriptor = "Z")
    private boolean field406 = false;

    @OriginalMember(owner = "client!client", name = "eg", descriptor = "[LIBHUFTPE;")
    private class22[] field407 = new class22[32];

    @OriginalMember(owner = "client!client", name = "fg", descriptor = "I")
    private int field408 = 16892;

    @OriginalMember(owner = "client!client", name = "ig", descriptor = "I")
    private int field411 = 1;

    @OriginalMember(owner = "client!client", name = "jg", descriptor = "Z")
    private boolean field412 = true;

    @OriginalMember(owner = "client!client", name = "ng", descriptor = "I")
    private int field416 = 3;

    @OriginalMember(owner = "client!client", name = "pg", descriptor = "[[[LIHMCQRZY;")
    private class24[][][] field418 = new class24[4][104][104];

    @OriginalMember(owner = "client!client", name = "qg", descriptor = "[Ljava/lang/String;")
    private String[] field419 = new String[500];

    @OriginalMember(owner = "client!client", name = "xg", descriptor = "LMVHXDWGI;")
    private class38 field426 = class38.method345((byte) 7, 1);

    @OriginalMember(owner = "client!client", name = "zg", descriptor = "I")
    private int field428 = 128;

    @OriginalMember(owner = "client!client", name = "Dg", descriptor = "I")
    private int field432 = -1;

    @OriginalMember(owner = "client!client", name = "Hg", descriptor = "[I")
    private int[] field436 = new int[2000];

    @OriginalMember(owner = "client!client", name = "Rg", descriptor = "I")
    private int field446 = 2;

    @OriginalMember(owner = "client!client", name = "Sg", descriptor = "I")
    private int field447 = -1;

    @OriginalMember(owner = "client!client", name = "Tg", descriptor = "[LIBHUFTPE;")
    private class22[] field448 = new class22[1000];

    @OriginalMember(owner = "client!client", name = "eh", descriptor = "[LIBHUFTPE;")
    private class22[] field459 = new class22[8];

    @OriginalMember(owner = "client!client", name = "fh", descriptor = "Ljava/lang/String;")
    private String field460 = "";

    @OriginalMember(owner = "client!client", name = "gh", descriptor = "Ljava/lang/String;")
    private String field461 = "";

    @OriginalMember(owner = "client!client", name = "hh", descriptor = "[I")
    private int[] field462 = new int[500];

    @OriginalMember(owner = "client!client", name = "ih", descriptor = "[I")
    private int[] field463 = new int[500];

    @OriginalMember(owner = "client!client", name = "jh", descriptor = "[I")
    private int[] field464 = new int[500];

    @OriginalMember(owner = "client!client", name = "kh", descriptor = "[I")
    private int[] field465 = new int[500];

    @OriginalMember(owner = "client!client", name = "mh", descriptor = "I")
    private int field467 = -1;

    @OriginalMember(owner = "client!client", name = "nh", descriptor = "I")
    private int field468 = -1;

    @OriginalMember(owner = "client!client", name = "oh", descriptor = "[I")
    private final int[] field469 = new int[] { 0, 0, 0, 0, 1, 1, 1, 1, 1, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 2, 3 };

    @OriginalMember(owner = "client!client", name = "qh", descriptor = "I")
    private int field471 = 50;

    @OriginalMember(owner = "client!client", name = "rh", descriptor = "[I")
    private int[] field472 = new int[this.field471];

    @OriginalMember(owner = "client!client", name = "sh", descriptor = "[I")
    private int[] field473 = new int[this.field471];

    @OriginalMember(owner = "client!client", name = "th", descriptor = "[I")
    private int[] field474 = new int[this.field471];

    @OriginalMember(owner = "client!client", name = "uh", descriptor = "[I")
    private int[] field475 = new int[this.field471];

    @OriginalMember(owner = "client!client", name = "vh", descriptor = "[I")
    private int[] field476 = new int[this.field471];

    @OriginalMember(owner = "client!client", name = "wh", descriptor = "[I")
    private int[] field477 = new int[this.field471];

    @OriginalMember(owner = "client!client", name = "xh", descriptor = "[I")
    private int[] field478 = new int[this.field471];

    @OriginalMember(owner = "client!client", name = "yh", descriptor = "[Ljava/lang/String;")
    private String[] field479 = new String[this.field471];

    @OriginalMember(owner = "client!client", name = "Bh", descriptor = "[[I")
    private int[][] field482 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Ch", descriptor = "Ljava/lang/String;")
    private String field483 = "";

    @OriginalMember(owner = "client!client", name = "Dh", descriptor = "Ljava/lang/String;")
    private String field484 = "";

    @OriginalMember(owner = "client!client", name = "Eh", descriptor = "LMYGSUHVG;")
    private class39 field485 = new class39();

    @OriginalMember(owner = "client!client", name = "Mh", descriptor = "Z")
    private boolean field493 = true;

    @OriginalMember(owner = "client!client", name = "Oh", descriptor = "I")
    private int field495 = 2301979;

    @OriginalMember(owner = "client!client", name = "Ph", descriptor = "Z")
    private boolean field496 = true;

    @OriginalMember(owner = "client!client", name = "Rh", descriptor = "Z")
    private boolean field498 = false;

    @OriginalMember(owner = "client!client", name = "Sh", descriptor = "[I")
    private int[] field499 = new int[256];

    @OriginalMember(owner = "client!client", name = "Th", descriptor = "[I")
    private int[] field500 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Uh", descriptor = "[I")
    private int[] field501 = new int[4000];

    @OriginalMember(owner = "client!client", name = "Yh", descriptor = "I")
    private int field505 = -1;

    @OriginalMember(owner = "client!client", name = "ai", descriptor = "B")
    private byte field507 = 2;

    @OriginalMember(owner = "client!client", name = "ci", descriptor = "Z")
    private boolean field509 = true;

    @OriginalMember(owner = "client!client", name = "gi", descriptor = "[B")
    private byte[] field513 = new byte[16384];

    @OriginalMember(owner = "client!client", name = "oi", descriptor = "I")
    private int field521 = -17648;

    @OriginalMember(owner = "client!client", name = "ui", descriptor = "Z")
    private boolean field527 = false;

    @OriginalMember(owner = "client!client", name = "vi", descriptor = "[I")
    public int[] field528 = new int[2000];

    @OriginalMember(owner = "client!client", name = "wi", descriptor = "[I")
    private int[] field529 = new int[151];

    @OriginalMember(owner = "client!client", name = "zi", descriptor = "B")
    private byte field532 = 1;

    @OriginalMember(owner = "client!client", name = "Di", descriptor = "I")
    private final int field536 = 100;

    @OriginalMember(owner = "client!client", name = "Ei", descriptor = "[I")
    private int[] field537 = new int[100];

    @OriginalMember(owner = "client!client", name = "Ki", descriptor = "[I")
    private int[] field543 = new int[5];

    @OriginalMember(owner = "client!client", name = "Qi", descriptor = "Z")
    private boolean field549 = false;

    @OriginalMember(owner = "client!client", name = "Ri", descriptor = "B")
    private byte field550 = 1;

    @OriginalMember(owner = "client!client", name = "Zi", descriptor = "[I")
    private int[] field558 = new int[class72.field1726];

    @OriginalMember(owner = "client!client", name = "bj", descriptor = "[I")
    private int[] field560 = new int[class72.field1726];

    @OriginalMember(owner = "client!client", name = "cj", descriptor = "Ljava/util/zip/CRC32;")
    private CRC32 field561 = new CRC32();

    @OriginalMember(owner = "client!client", name = "dj", descriptor = "[I")
    private int[] field562 = new int[5];

    @OriginalMember(owner = "client!client", name = "ej", descriptor = "Z")
    private boolean field563 = false;

    @OriginalMember(owner = "client!client", name = "fj", descriptor = "Z")
    private boolean field564 = false;

    @OriginalMember(owner = "client!client", name = "oj", descriptor = "I")
    private int field573 = -1;

    @OriginalMember(owner = "client!client", name = "pj", descriptor = "I")
    private int field574 = -1;

    @OriginalMember(owner = "client!client", name = "qj", descriptor = "I")
    private int field575 = 5063219;

    @OriginalMember(owner = "client!client", name = "rj", descriptor = "[I")
    private int[] field576 = new int[7];

    @OriginalMember(owner = "client!client", name = "sj", descriptor = "Z")
    private boolean field577 = false;

    @OriginalMember(owner = "client!client", name = "tj", descriptor = "I")
    private int field578 = -1;

    @OriginalMember(owner = "client!client", name = "uj", descriptor = "[I")
    private int[] field579 = new int[33];

    @OriginalMember(owner = "client!client", name = "vj", descriptor = "[Ljava/lang/String;")
    private String[] field580 = new String[200];

    @OriginalMember(owner = "client!client", name = "wj", descriptor = "Ljava/lang/String;")
    private String field581 = "";

    @OriginalMember(owner = "client!client", name = "xj", descriptor = "[Z")
    private boolean[] field582 = new boolean[5];

    @OriginalMember(owner = "client!client", name = "yj", descriptor = "[I")
    private int[] field583 = new int[100];

    @OriginalMember(owner = "client!client", name = "zj", descriptor = "[Ljava/lang/String;")
    private String[] field584 = new String[100];

    @OriginalMember(owner = "client!client", name = "Aj", descriptor = "[Ljava/lang/String;")
    private String[] field585 = new String[100];

    @OriginalMember(owner = "client!client", name = "Cj", descriptor = "B")
    private byte field587 = 6;

    @OriginalMember(owner = "client!client", name = "Dj", descriptor = "Z")
    private boolean field588 = false;

    @OriginalMember(owner = "client!client", name = "Ej", descriptor = "Z")
    private boolean field589 = false;

    @OriginalMember(owner = "client!client", name = "Gj", descriptor = "[[I")
    private int[][] field591 = new int[104][104];

    @OriginalMember(owner = "client!client", name = "Ij", descriptor = "B")
    private byte field593 = 8;

    @OriginalMember(owner = "client!client", name = "Kj", descriptor = "Ljava/lang/String;")
    private String field595 = "";

    @OriginalMember(owner = "client!client", name = "Nj", descriptor = "Z")
    private boolean field598 = false;

    @OriginalMember(owner = "client!client", name = "Pj", descriptor = "LMVHXDWGI;")
    private class38 field600 = new class38(0, new byte[5000]);

    @OriginalMember(owner = "client!client", name = "Qj", descriptor = "[LACKJULTZ;")
    private class1[] field601 = new class1[16384];

    @OriginalMember(owner = "client!client", name = "Sj", descriptor = "[I")
    public int[] field603 = new int[16384];

    @OriginalMember(owner = "client!client", name = "fk", descriptor = "[I")
    private int[] field616 = new int[5];

    @OriginalMember(owner = "client!client", name = "gk", descriptor = "I")
    private int field617 = 632;

    @OriginalMember(owner = "client!client", name = "hk", descriptor = "[I")
    public int[] field618 = new int[] { 17, 24, 34, 40 };

    @OriginalMember(owner = "client!client", name = "jk", descriptor = "I")
    private int field620 = -33142;

    @OriginalMember(owner = "client!client", name = "kk", descriptor = "I")
    private int field621 = -1;

    @OriginalMember(owner = "client!client", name = "R", descriptor = "I")
    private static int field135 = 22535;

    @OriginalMember(owner = "client!client", name = "Cb", descriptor = "B")
    private static byte field172 = 8;

    @OriginalMember(owner = "client!client", name = "zf", descriptor = "I")
    private static int field376 = 10;

    @OriginalMember(owner = "client!client", name = "Bf", descriptor = "Z")
    private static boolean field378 = true;

    @OriginalMember(owner = "client!client", name = "rg", descriptor = "[I")
    private static int[] field420 = new int[99];

    @OriginalMember(owner = "client!client", name = "sg", descriptor = "[I")
    public static int[] field421;

    @OriginalMember(owner = "client!client", name = "vg", descriptor = "B")
    private static byte field424;

    @OriginalMember(owner = "client!client", name = "wg", descriptor = "I")
    private static int field425;

    @OriginalMember(owner = "client!client", name = "yg", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field427;

    @OriginalMember(owner = "client!client", name = "Ah", descriptor = "Ljava/math/BigInteger;")
    private static BigInteger field481;

    @OriginalMember(owner = "client!client", name = "Ih", descriptor = "[I")
    public static final int[] field489;

    @OriginalMember(owner = "client!client", name = "Jh", descriptor = "Ljava/lang/String;")
    private static String field490;

    @OriginalMember(owner = "client!client", name = "hi", descriptor = "[[I")
    public static final int[][] field514;

    @OriginalMember(owner = "client!client", name = "Ci", descriptor = "Z")
    private static boolean field535;

    @OriginalMember(owner = "client!client", name = "mj", descriptor = "B")
    private static byte field571;

    @OriginalMember(owner = "client!client", name = "J", descriptor = "I")
    private int field127;

    @OriginalMember(owner = "client!client", name = "M", descriptor = "I")
    private int field130;

    @OriginalMember(owner = "client!client", name = "N", descriptor = "I")
    private int field131;

    @OriginalMember(owner = "client!client", name = "P", descriptor = "I")
    private int field133;

    @OriginalMember(owner = "client!client", name = "db", descriptor = "I")
    private int field147;

    @OriginalMember(owner = "client!client", name = "jb", descriptor = "I")
    private int field153;

    @OriginalMember(owner = "client!client", name = "lb", descriptor = "I")
    private int field155;

    @OriginalMember(owner = "client!client", name = "pb", descriptor = "I")
    private int field159;

    @OriginalMember(owner = "client!client", name = "tb", descriptor = "I")
    private int field163;

    @OriginalMember(owner = "client!client", name = "ub", descriptor = "I")
    private static int field164;

    @OriginalMember(owner = "client!client", name = "vb", descriptor = "I")
    private int field165;

    @OriginalMember(owner = "client!client", name = "wb", descriptor = "I")
    private int field166;

    @OriginalMember(owner = "client!client", name = "Ab", descriptor = "I")
    private int field170;

    @OriginalMember(owner = "client!client", name = "Lb", descriptor = "I")
    private int field181;

    @OriginalMember(owner = "client!client", name = "Mb", descriptor = "I")
    private int field182;

    @OriginalMember(owner = "client!client", name = "Nb", descriptor = "I")
    private int field183;

    @OriginalMember(owner = "client!client", name = "Ob", descriptor = "I")
    private int field184;

    @OriginalMember(owner = "client!client", name = "Pb", descriptor = "I")
    private int field185;

    @OriginalMember(owner = "client!client", name = "Sb", descriptor = "I")
    private int field188;

    @OriginalMember(owner = "client!client", name = "Vb", descriptor = "I")
    private int field191;

    @OriginalMember(owner = "client!client", name = "Wb", descriptor = "I")
    private int field192;

    @OriginalMember(owner = "client!client", name = "Xb", descriptor = "I")
    private int field193;

    @OriginalMember(owner = "client!client", name = "Yb", descriptor = "I")
    private int field194;

    @OriginalMember(owner = "client!client", name = "Zb", descriptor = "I")
    private int field195;

    @OriginalMember(owner = "client!client", name = "ac", descriptor = "I")
    private int field196;

    @OriginalMember(owner = "client!client", name = "ic", descriptor = "I")
    private int field204;

    @OriginalMember(owner = "client!client", name = "rc", descriptor = "I")
    private int field213;

    @OriginalMember(owner = "client!client", name = "tc", descriptor = "I")
    private int field215;

    @OriginalMember(owner = "client!client", name = "Fc", descriptor = "I")
    private static int field227;

    @OriginalMember(owner = "client!client", name = "Ic", descriptor = "I")
    private int field230;

    @OriginalMember(owner = "client!client", name = "Jc", descriptor = "I")
    private int field231;

    @OriginalMember(owner = "client!client", name = "Kc", descriptor = "I")
    private int field232;

    @OriginalMember(owner = "client!client", name = "Lc", descriptor = "I")
    private int field233;

    @OriginalMember(owner = "client!client", name = "Nc", descriptor = "I")
    private int field235;

    @OriginalMember(owner = "client!client", name = "Oc", descriptor = "I")
    private int field236;

    @OriginalMember(owner = "client!client", name = "Pc", descriptor = "I")
    private int field237;

    @OriginalMember(owner = "client!client", name = "Uc", descriptor = "I")
    private int field242;

    @OriginalMember(owner = "client!client", name = "ad", descriptor = "I")
    private int field248;

    @OriginalMember(owner = "client!client", name = "cd", descriptor = "I")
    private int field250;

    @OriginalMember(owner = "client!client", name = "ed", descriptor = "I")
    private int field252;

    @OriginalMember(owner = "client!client", name = "hd", descriptor = "I")
    private static int field255;

    @OriginalMember(owner = "client!client", name = "id", descriptor = "I")
    private int field256;

    @OriginalMember(owner = "client!client", name = "ld", descriptor = "I")
    private int field259;

    @OriginalMember(owner = "client!client", name = "md", descriptor = "I")
    private int field260;

    @OriginalMember(owner = "client!client", name = "nd", descriptor = "I")
    private int field261;

    @OriginalMember(owner = "client!client", name = "qd", descriptor = "I")
    private int field264;

    @OriginalMember(owner = "client!client", name = "td", descriptor = "I")
    private int field267;

    @OriginalMember(owner = "client!client", name = "vd", descriptor = "I")
    private int field269;

    @OriginalMember(owner = "client!client", name = "yd", descriptor = "I")
    private int field272;

    @OriginalMember(owner = "client!client", name = "Cd", descriptor = "I")
    private int field276;

    @OriginalMember(owner = "client!client", name = "Gd", descriptor = "I")
    private int field280;

    @OriginalMember(owner = "client!client", name = "Hd", descriptor = "I")
    private int field281;

    @OriginalMember(owner = "client!client", name = "Id", descriptor = "I")
    private int field282;

    @OriginalMember(owner = "client!client", name = "Jd", descriptor = "I")
    private int field283;

    @OriginalMember(owner = "client!client", name = "Kd", descriptor = "I")
    private int field284;

    @OriginalMember(owner = "client!client", name = "Ld", descriptor = "I")
    private int field285;

    @OriginalMember(owner = "client!client", name = "Nd", descriptor = "I")
    private int field287;

    @OriginalMember(owner = "client!client", name = "Od", descriptor = "I")
    private static int field288;

    @OriginalMember(owner = "client!client", name = "Rd", descriptor = "I")
    private int field291;

    @OriginalMember(owner = "client!client", name = "Ud", descriptor = "I")
    private int field294;

    @OriginalMember(owner = "client!client", name = "Vd", descriptor = "I")
    private int field295;

    @OriginalMember(owner = "client!client", name = "ae", descriptor = "I")
    private int field300;

    @OriginalMember(owner = "client!client", name = "be", descriptor = "I")
    private int field301;

    @OriginalMember(owner = "client!client", name = "ce", descriptor = "I")
    private int field302;

    @OriginalMember(owner = "client!client", name = "de", descriptor = "I")
    private int field303;

    @OriginalMember(owner = "client!client", name = "ee", descriptor = "I")
    private int field304;

    @OriginalMember(owner = "client!client", name = "ke", descriptor = "I")
    private int field310;

    @OriginalMember(owner = "client!client", name = "ne", descriptor = "I")
    private int field313;

    @OriginalMember(owner = "client!client", name = "qe", descriptor = "I")
    private int field316;

    @OriginalMember(owner = "client!client", name = "re", descriptor = "I")
    private int field317;

    @OriginalMember(owner = "client!client", name = "se", descriptor = "I")
    private int field318;

    @OriginalMember(owner = "client!client", name = "te", descriptor = "I")
    private int field319;

    @OriginalMember(owner = "client!client", name = "ue", descriptor = "I")
    private int field320;

    @OriginalMember(owner = "client!client", name = "we", descriptor = "I")
    private int field322;

    @OriginalMember(owner = "client!client", name = "xe", descriptor = "I")
    private int field323;

    @OriginalMember(owner = "client!client", name = "ye", descriptor = "I")
    private static int field324;

    @OriginalMember(owner = "client!client", name = "ze", descriptor = "I")
    private int field325;

    @OriginalMember(owner = "client!client", name = "Ae", descriptor = "I")
    private int field326;

    @OriginalMember(owner = "client!client", name = "Be", descriptor = "I")
    private int field327;

    @OriginalMember(owner = "client!client", name = "De", descriptor = "I")
    private int field329;

    @OriginalMember(owner = "client!client", name = "Ee", descriptor = "I")
    private int field330;

    @OriginalMember(owner = "client!client", name = "Fe", descriptor = "I")
    private int field331;

    @OriginalMember(owner = "client!client", name = "Ge", descriptor = "I")
    private int field332;

    @OriginalMember(owner = "client!client", name = "He", descriptor = "I")
    private static int field333;

    @OriginalMember(owner = "client!client", name = "Je", descriptor = "I")
    private int field335;

    @OriginalMember(owner = "client!client", name = "Ke", descriptor = "I")
    private int field336;

    @OriginalMember(owner = "client!client", name = "Me", descriptor = "I")
    private int field338;

    @OriginalMember(owner = "client!client", name = "Pe", descriptor = "I")
    private static int field341;

    @OriginalMember(owner = "client!client", name = "Xe", descriptor = "I")
    private static int field349;

    @OriginalMember(owner = "client!client", name = "Ze", descriptor = "I")
    private static int field351;

    @OriginalMember(owner = "client!client", name = "bf", descriptor = "I")
    private int field353;

    @OriginalMember(owner = "client!client", name = "ff", descriptor = "I")
    private int field357;

    @OriginalMember(owner = "client!client", name = "gf", descriptor = "I")
    private int field358;

    @OriginalMember(owner = "client!client", name = "hf", descriptor = "I")
    private int field359;

    @OriginalMember(owner = "client!client", name = "jf", descriptor = "I")
    public static int field360;

    @OriginalMember(owner = "client!client", name = "lf", descriptor = "I")
    private int field362;

    @OriginalMember(owner = "client!client", name = "mf", descriptor = "I")
    private int field363;

    @OriginalMember(owner = "client!client", name = "nf", descriptor = "I")
    private int field364;

    @OriginalMember(owner = "client!client", name = "of", descriptor = "I")
    private int field365;

    @OriginalMember(owner = "client!client", name = "pf", descriptor = "I")
    private int field366;

    @OriginalMember(owner = "client!client", name = "rf", descriptor = "I")
    private int field368;

    @OriginalMember(owner = "client!client", name = "vf", descriptor = "I")
    private int field372;

    @OriginalMember(owner = "client!client", name = "wf", descriptor = "I")
    private int field373;

    @OriginalMember(owner = "client!client", name = "Af", descriptor = "I")
    public static int field377;

    @OriginalMember(owner = "client!client", name = "Rf", descriptor = "I")
    private int field394;

    @OriginalMember(owner = "client!client", name = "Wf", descriptor = "I")
    private static int field399;

    @OriginalMember(owner = "client!client", name = "Xf", descriptor = "I")
    private int field400;

    @OriginalMember(owner = "client!client", name = "Zf", descriptor = "I")
    private int field402;

    @OriginalMember(owner = "client!client", name = "ag", descriptor = "I")
    private int field403;

    @OriginalMember(owner = "client!client", name = "bg", descriptor = "I")
    private int field404;

    @OriginalMember(owner = "client!client", name = "hg", descriptor = "I")
    private int field410;

    @OriginalMember(owner = "client!client", name = "kg", descriptor = "I")
    private int field413;

    @OriginalMember(owner = "client!client", name = "mg", descriptor = "I")
    private static int field415;

    @OriginalMember(owner = "client!client", name = "tg", descriptor = "I")
    private static int field422;

    @OriginalMember(owner = "client!client", name = "ug", descriptor = "I")
    private int field423;

    @OriginalMember(owner = "client!client", name = "Ag", descriptor = "I")
    private int field429;

    @OriginalMember(owner = "client!client", name = "Bg", descriptor = "I")
    private int field430;

    @OriginalMember(owner = "client!client", name = "Cg", descriptor = "I")
    private int field431;

    @OriginalMember(owner = "client!client", name = "Eg", descriptor = "I")
    private int field433;

    @OriginalMember(owner = "client!client", name = "Fg", descriptor = "I")
    private int field434;

    @OriginalMember(owner = "client!client", name = "Gg", descriptor = "I")
    private int field435;

    @OriginalMember(owner = "client!client", name = "Jg", descriptor = "I")
    private static int field438;

    @OriginalMember(owner = "client!client", name = "Kg", descriptor = "I")
    private int field439;

    @OriginalMember(owner = "client!client", name = "Lg", descriptor = "I")
    private int field440;

    @OriginalMember(owner = "client!client", name = "Mg", descriptor = "I")
    private int field441;

    @OriginalMember(owner = "client!client", name = "Ng", descriptor = "I")
    private int field442;

    @OriginalMember(owner = "client!client", name = "Og", descriptor = "I")
    private int field443;

    @OriginalMember(owner = "client!client", name = "Pg", descriptor = "I")
    private int field444;

    @OriginalMember(owner = "client!client", name = "Qg", descriptor = "I")
    private int field445;

    @OriginalMember(owner = "client!client", name = "Ug", descriptor = "I")
    private int field449;

    @OriginalMember(owner = "client!client", name = "Vg", descriptor = "I")
    public int field450;

    @OriginalMember(owner = "client!client", name = "Xg", descriptor = "I")
    private int field452;

    @OriginalMember(owner = "client!client", name = "ch", descriptor = "I")
    private static int field457;

    @OriginalMember(owner = "client!client", name = "dh", descriptor = "I")
    private int field458;

    @OriginalMember(owner = "client!client", name = "lh", descriptor = "I")
    private int field466;

    @OriginalMember(owner = "client!client", name = "ph", descriptor = "I")
    private int field470;

    @OriginalMember(owner = "client!client", name = "zh", descriptor = "I")
    private int field480;

    @OriginalMember(owner = "client!client", name = "Lh", descriptor = "I")
    private int field492;

    @OriginalMember(owner = "client!client", name = "Qh", descriptor = "I")
    private static int field497;

    @OriginalMember(owner = "client!client", name = "Vh", descriptor = "I")
    public static int field502;

    @OriginalMember(owner = "client!client", name = "Wh", descriptor = "I")
    private int field503;

    @OriginalMember(owner = "client!client", name = "Xh", descriptor = "I")
    private int field504;

    @OriginalMember(owner = "client!client", name = "Zh", descriptor = "I")
    private int field506;

    @OriginalMember(owner = "client!client", name = "bi", descriptor = "I")
    private int field508;

    @OriginalMember(owner = "client!client", name = "di", descriptor = "I")
    private int field510;

    @OriginalMember(owner = "client!client", name = "fi", descriptor = "I")
    private static int field512;

    @OriginalMember(owner = "client!client", name = "ni", descriptor = "I")
    private int field520;

    @OriginalMember(owner = "client!client", name = "pi", descriptor = "I")
    private int field522;

    @OriginalMember(owner = "client!client", name = "qi", descriptor = "I")
    private int field523;

    @OriginalMember(owner = "client!client", name = "ri", descriptor = "I")
    private int field524;

    @OriginalMember(owner = "client!client", name = "si", descriptor = "I")
    private int field525;

    @OriginalMember(owner = "client!client", name = "ti", descriptor = "I")
    private int field526;

    @OriginalMember(owner = "client!client", name = "Ai", descriptor = "I")
    private int field533;

    @OriginalMember(owner = "client!client", name = "Bi", descriptor = "I")
    private int field534;

    @OriginalMember(owner = "client!client", name = "Li", descriptor = "I")
    private int field544;

    @OriginalMember(owner = "client!client", name = "Mi", descriptor = "I")
    private int field545;

    @OriginalMember(owner = "client!client", name = "Ni", descriptor = "I")
    private int field546;

    @OriginalMember(owner = "client!client", name = "Oi", descriptor = "I")
    private int field547;

    @OriginalMember(owner = "client!client", name = "Pi", descriptor = "I")
    private int field548;

    @OriginalMember(owner = "client!client", name = "Si", descriptor = "I")
    private int field551;

    @OriginalMember(owner = "client!client", name = "Ti", descriptor = "I")
    private int field552;

    @OriginalMember(owner = "client!client", name = "Ui", descriptor = "I")
    private int field553;

    @OriginalMember(owner = "client!client", name = "Vi", descriptor = "I")
    private int field554;

    @OriginalMember(owner = "client!client", name = "Wi", descriptor = "I")
    private int field555;

    @OriginalMember(owner = "client!client", name = "kj", descriptor = "I")
    private int field569;

    @OriginalMember(owner = "client!client", name = "nj", descriptor = "I")
    private static int field572;

    @OriginalMember(owner = "client!client", name = "Bj", descriptor = "I")
    private int field586;

    @OriginalMember(owner = "client!client", name = "Fj", descriptor = "I")
    private int field590;

    @OriginalMember(owner = "client!client", name = "Hj", descriptor = "I")
    private int field592;

    @OriginalMember(owner = "client!client", name = "Jj", descriptor = "I")
    private int field594;

    @OriginalMember(owner = "client!client", name = "Rj", descriptor = "I")
    private int field602;

    @OriginalMember(owner = "client!client", name = "Uj", descriptor = "I")
    private int field605;

    @OriginalMember(owner = "client!client", name = "Vj", descriptor = "I")
    private int field606;

    @OriginalMember(owner = "client!client", name = "Wj", descriptor = "I")
    public int field607;

    @OriginalMember(owner = "client!client", name = "Xj", descriptor = "I")
    public int field608;

    @OriginalMember(owner = "client!client", name = "Zj", descriptor = "I")
    private int field610;

    @OriginalMember(owner = "client!client", name = "ik", descriptor = "I")
    private int field619;

    @OriginalMember(owner = "client!client", name = "lk", descriptor = "I")
    private int field622;

    @OriginalMember(owner = "client!client", name = "mk", descriptor = "I")
    public static int field623;

    @OriginalMember(owner = "client!client", name = "O", descriptor = "J")
    private long field132;

    @OriginalMember(owner = "client!client", name = "Td", descriptor = "J")
    public long field293;

    @OriginalMember(owner = "client!client", name = "Xd", descriptor = "J")
    private long field297;

    @OriginalMember(owner = "client!client", name = "qf", descriptor = "J")
    private long field367;

    @OriginalMember(owner = "client!client", name = "lg", descriptor = "J")
    private long field414;

    @OriginalMember(owner = "client!client", name = "T", descriptor = "LESGPTMPA;")
    private class11 field137;

    @OriginalMember(owner = "client!client", name = "U", descriptor = "LESGPTMPA;")
    private class11 field138;

    @OriginalMember(owner = "client!client", name = "V", descriptor = "LESGPTMPA;")
    private class11 field139;

    @OriginalMember(owner = "client!client", name = "W", descriptor = "LESGPTMPA;")
    private class11 field140;

    @OriginalMember(owner = "client!client", name = "X", descriptor = "LESGPTMPA;")
    private class11 field141;

    @OriginalMember(owner = "client!client", name = "Y", descriptor = "LESGPTMPA;")
    private class11 field142;

    @OriginalMember(owner = "client!client", name = "Z", descriptor = "LESGPTMPA;")
    private class11 field143;

    @OriginalMember(owner = "client!client", name = "ab", descriptor = "LESGPTMPA;")
    private class11 field144;

    @OriginalMember(owner = "client!client", name = "bb", descriptor = "LESGPTMPA;")
    private class11 field145;

    @OriginalMember(owner = "client!client", name = "vc", descriptor = "LESGPTMPA;")
    private class11 field217;

    @OriginalMember(owner = "client!client", name = "wc", descriptor = "LESGPTMPA;")
    private class11 field218;

    @OriginalMember(owner = "client!client", name = "xc", descriptor = "LESGPTMPA;")
    private class11 field219;

    @OriginalMember(owner = "client!client", name = "yc", descriptor = "LESGPTMPA;")
    private class11 field220;

    @OriginalMember(owner = "client!client", name = "zc", descriptor = "LESGPTMPA;")
    private class11 field221;

    @OriginalMember(owner = "client!client", name = "Ac", descriptor = "LESGPTMPA;")
    private class11 field222;

    @OriginalMember(owner = "client!client", name = "Bc", descriptor = "LESGPTMPA;")
    private class11 field223;

    @OriginalMember(owner = "client!client", name = "Cc", descriptor = "LESGPTMPA;")
    private class11 field224;

    @OriginalMember(owner = "client!client", name = "Dc", descriptor = "LESGPTMPA;")
    private class11 field225;

    @OriginalMember(owner = "client!client", name = "Nf", descriptor = "LESGPTMPA;")
    private class11 field390;

    @OriginalMember(owner = "client!client", name = "Of", descriptor = "LESGPTMPA;")
    private class11 field391;

    @OriginalMember(owner = "client!client", name = "Pf", descriptor = "LESGPTMPA;")
    private class11 field392;

    @OriginalMember(owner = "client!client", name = "Yg", descriptor = "LESGPTMPA;")
    private class11 field453;

    @OriginalMember(owner = "client!client", name = "Zg", descriptor = "LESGPTMPA;")
    private class11 field454;

    @OriginalMember(owner = "client!client", name = "ah", descriptor = "LESGPTMPA;")
    private class11 field455;

    @OriginalMember(owner = "client!client", name = "bh", descriptor = "LESGPTMPA;")
    private class11 field456;

    @OriginalMember(owner = "client!client", name = "pc", descriptor = "LIBHUFTPE;")
    private class22 field211;

    @OriginalMember(owner = "client!client", name = "qc", descriptor = "LIBHUFTPE;")
    private class22 field212;

    @OriginalMember(owner = "client!client", name = "Oe", descriptor = "LIBHUFTPE;")
    private class22 field340;

    @OriginalMember(owner = "client!client", name = "xf", descriptor = "LIBHUFTPE;")
    private class22 field374;

    @OriginalMember(owner = "client!client", name = "Ff", descriptor = "LIBHUFTPE;")
    private class22 field382;

    @OriginalMember(owner = "client!client", name = "Gf", descriptor = "LIBHUFTPE;")
    private class22 field383;

    @OriginalMember(owner = "client!client", name = "gg", descriptor = "LIBHUFTPE;")
    private class22 field409;

    @OriginalMember(owner = "client!client", name = "Lj", descriptor = "LIBHUFTPE;")
    private class22 field596;

    @OriginalMember(owner = "client!client", name = "Mj", descriptor = "LIBHUFTPE;")
    private class22 field597;

    @OriginalMember(owner = "client!client", name = "Yj", descriptor = "LIBHUFTPE;")
    private class22 field609;

    @OriginalMember(owner = "client!client", name = "ak", descriptor = "LIBHUFTPE;")
    private class22 field611;

    @OriginalMember(owner = "client!client", name = "bk", descriptor = "LIBHUFTPE;")
    private class22 field612;

    @OriginalMember(owner = "client!client", name = "ck", descriptor = "LIBHUFTPE;")
    private class22 field613;

    @OriginalMember(owner = "client!client", name = "dk", descriptor = "LIBHUFTPE;")
    private class22 field614;

    @OriginalMember(owner = "client!client", name = "ek", descriptor = "LIBHUFTPE;")
    private class22 field615;

    @OriginalMember(owner = "client!client", name = "Tj", descriptor = "LIEMHZJLX;")
    private class23 field604;

    @OriginalMember(owner = "client!client", name = "Wg", descriptor = "LJFQWYHZJ;")
    private class26 field451;

    @OriginalMember(owner = "client!client", name = "hc", descriptor = "LQIAMMSTQ;")
    private class46 field203;

    @OriginalMember(owner = "client!client", name = "kc", descriptor = "LAWMLZOXZ;")
    private class4 field206;

    @OriginalMember(owner = "client!client", name = "lc", descriptor = "LAWMLZOXZ;")
    private class4 field207;

    @OriginalMember(owner = "client!client", name = "mc", descriptor = "LAWMLZOXZ;")
    private class4 field208;

    @OriginalMember(owner = "client!client", name = "nc", descriptor = "LAWMLZOXZ;")
    private class4 field209;

    @OriginalMember(owner = "client!client", name = "Ig", descriptor = "LRKMPVAZH;")
    private class53 field437;

    @OriginalMember(owner = "client!client", name = "Gb", descriptor = "LBNGXLHWA;")
    private class5 field176;

    @OriginalMember(owner = "client!client", name = "Hb", descriptor = "LBNGXLHWA;")
    private class5 field177;

    @OriginalMember(owner = "client!client", name = "Ib", descriptor = "LBNGXLHWA;")
    private class5 field178;

    @OriginalMember(owner = "client!client", name = "Jb", descriptor = "LBNGXLHWA;")
    private class5 field179;

    @OriginalMember(owner = "client!client", name = "Kb", descriptor = "LBNGXLHWA;")
    private class5 field180;

    @OriginalMember(owner = "client!client", name = "Qb", descriptor = "LBNGXLHWA;")
    private class5 field186;

    @OriginalMember(owner = "client!client", name = "Rb", descriptor = "LBNGXLHWA;")
    private class5 field187;

    @OriginalMember(owner = "client!client", name = "ec", descriptor = "LBNGXLHWA;")
    private class5 field200;

    @OriginalMember(owner = "client!client", name = "fc", descriptor = "LBNGXLHWA;")
    private class5 field201;

    @OriginalMember(owner = "client!client", name = "gc", descriptor = "LBNGXLHWA;")
    private class5 field202;

    @OriginalMember(owner = "client!client", name = "Fh", descriptor = "LBNGXLHWA;")
    private class5 field486;

    @OriginalMember(owner = "client!client", name = "Gh", descriptor = "LBNGXLHWA;")
    private class5 field487;

    @OriginalMember(owner = "client!client", name = "Hh", descriptor = "LBNGXLHWA;")
    private class5 field488;

    @OriginalMember(owner = "client!client", name = "xi", descriptor = "LBNGXLHWA;")
    private class5 field530;

    @OriginalMember(owner = "client!client", name = "yi", descriptor = "LBNGXLHWA;")
    private class5 field531;

    @OriginalMember(owner = "client!client", name = "Fi", descriptor = "LBNGXLHWA;")
    private class5 field538;

    @OriginalMember(owner = "client!client", name = "Gi", descriptor = "LBNGXLHWA;")
    private class5 field539;

    @OriginalMember(owner = "client!client", name = "Hi", descriptor = "LBNGXLHWA;")
    private class5 field540;

    @OriginalMember(owner = "client!client", name = "Ii", descriptor = "LBNGXLHWA;")
    private class5 field541;

    @OriginalMember(owner = "client!client", name = "Ji", descriptor = "LBNGXLHWA;")
    private class5 field542;

    @OriginalMember(owner = "client!client", name = "og", descriptor = "LTYRTFBBQ;")
    private class61 field417;

    @OriginalMember(owner = "client!client", name = "mi", descriptor = "LBSQIIHOT;")
    public static class6 field519;

    @OriginalMember(owner = "client!client", name = "je", descriptor = "LYNDLJDLS;")
    public class70 field309;

    @OriginalMember(owner = "client!client", name = "Mc", descriptor = "Ljava/lang/String;")
    public String field234;

    @OriginalMember(owner = "client!client", name = "Qd", descriptor = "Ljava/lang/String;")
    private String field290;

    @OriginalMember(owner = "client!client", name = "Sd", descriptor = "Ljava/lang/String;")
    private String field292;

    @OriginalMember(owner = "client!client", name = "cg", descriptor = "Ljava/lang/String;")
    public String field405;

    @OriginalMember(owner = "client!client", name = "ob", descriptor = "Ljava/net/Socket;")
    private Socket field158;

    @OriginalMember(owner = "client!client", name = "fe", descriptor = "Z")
    public static boolean field305;

    @OriginalMember(owner = "client!client", name = "cf", descriptor = "Z")
    private static boolean field354;

    @OriginalMember(owner = "client!client", name = "Cf", descriptor = "Z")
    private static boolean field379;

    @OriginalMember(owner = "client!client", name = "Kh", descriptor = "Z")
    private static boolean field491;

    @OriginalMember(owner = "client!client", name = "Nh", descriptor = "Z")
    public static boolean field494;

    @OriginalMember(owner = "client!client", name = "aj", descriptor = "Z")
    private static boolean field559;

    @OriginalMember(owner = "client!client", name = "lj", descriptor = "Z")
    private static boolean field570;

    @OriginalMember(owner = "client!client", name = "Xc", descriptor = "[I")
    private int[] field245;

    @OriginalMember(owner = "client!client", name = "Yc", descriptor = "[I")
    private int[] field246;

    @OriginalMember(owner = "client!client", name = "Zc", descriptor = "[I")
    private int[] field247;

    @OriginalMember(owner = "client!client", name = "Dd", descriptor = "[I")
    private int[] field277;

    @OriginalMember(owner = "client!client", name = "Ed", descriptor = "[I")
    private int[] field278;

    @OriginalMember(owner = "client!client", name = "ii", descriptor = "[I")
    private int[] field515;

    @OriginalMember(owner = "client!client", name = "ji", descriptor = "[I")
    private int[] field516;

    @OriginalMember(owner = "client!client", name = "ki", descriptor = "[I")
    private int[] field517;

    @OriginalMember(owner = "client!client", name = "li", descriptor = "[I")
    private int[] field518;

    @OriginalMember(owner = "client!client", name = "Xi", descriptor = "[I")
    private int[] field556;

    @OriginalMember(owner = "client!client", name = "Yi", descriptor = "[I")
    private int[] field557;

    @OriginalMember(owner = "client!client", name = "gj", descriptor = "[I")
    private int[] field565;

    @OriginalMember(owner = "client!client", name = "hj", descriptor = "[I")
    private int[] field566;

    @OriginalMember(owner = "client!client", name = "ij", descriptor = "[I")
    private int[] field567;

    @OriginalMember(owner = "client!client", name = "jj", descriptor = "[I")
    private int[] field568;

    @OriginalMember(owner = "client!client", name = "ei", descriptor = "[LBNGXLHWA;")
    private class5[] field511;

    @OriginalMember(owner = "client!client", name = "Ad", descriptor = "[[B")
    private byte[][] field274;

    @OriginalMember(owner = "client!client", name = "Yf", descriptor = "[[B")
    private byte[][] field401;

    @OriginalMember(owner = "client!client", name = "bd", descriptor = "[[[B")
    private byte[][][] field249;

    @OriginalMember(owner = "client!client", name = "Oj", descriptor = "[[[I")
    private int[][][] field599;

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(I)V")
    public final void method48(int arg0) {
        int var2 = this.field191 * 128 + 64;
        int var3 = this.field192 * 128 + 64;
        int var4 = this.method68(0, var3, var2, this.field452) - this.field193;
        if (this.field214 != arg0) {
            field135 = 86;
        }
        if (this.field362 < var2) {
            this.field362 += (var2 - this.field362) * this.field195 / 1000 + this.field194;
            if (this.field362 > var2) {
                this.field362 = var2;
            }
        }
        if (this.field362 > var2) {
            this.field362 -= (this.field362 - var2) * this.field195 / 1000 + this.field194;
            if (this.field362 < var2) {
                this.field362 = var2;
            }
        }
        if (this.field363 < var4) {
            this.field363 += (var4 - this.field363) * this.field195 / 1000 + this.field194;
            if (this.field363 > var4) {
                this.field363 = var4;
            }
        }
        if (this.field363 > var4) {
            this.field363 -= (this.field363 - var4) * this.field195 / 1000 + this.field194;
            if (this.field363 < var4) {
                this.field363 = var4;
            }
        }
        if (this.field364 < var3) {
            this.field364 += (var3 - this.field364) * this.field195 / 1000 + this.field194;
            if (this.field364 > var3) {
                this.field364 = var3;
            }
        }
        if (this.field364 > var3) {
            this.field364 -= (this.field364 - var3) * this.field195 / 1000 + this.field194;
            if (this.field364 < var3) {
                this.field364 = var3;
            }
        }
        int var5 = this.field522 * 128 + 64;
        int var6 = this.field523 * 128 + 64;
        int var7 = this.method68(0, var6, var5, this.field452) - this.field524;
        int var8 = var5 - this.field362;
        int var9 = var7 - this.field363;
        int var10 = var6 - this.field364;
        int var11 = (int) Math.sqrt((double) (var8 * var8 + var10 * var10));
        int var12 = (int) (Math.atan2((double) var9, (double) var11) * 325.949D) & 2047;
        int var13 = (int) (Math.atan2((double) var8, (double) var10) * -325.949D) & 2047;
        if (var12 < 128) {
            var12 = 128;
        }
        if (var12 > 383) {
            var12 = 383;
        }
        if (this.field365 < var12) {
            this.field365 += (var12 - this.field365) * this.field526 / 1000 + this.field525;
            if (this.field365 > var12) {
                this.field365 = var12;
            }
        }
        if (this.field365 > var12) {
            this.field365 -= (this.field365 - var12) * this.field526 / 1000 + this.field525;
            if (this.field365 < var12) {
                this.field365 = var12;
            }
        }
        int var14 = var13 - this.field366;
        if (var14 > 1024) {
            var14 -= 2048;
        }
        if (var14 < -1024) {
            var14 += 2048;
        }
        if (var14 > 0) {
            this.field366 += this.field526 * var14 / 1000 + this.field525;
            this.field366 &= 2047;
        }
        if (var14 < 0) {
            this.field366 -= -var14 * this.field526 / 1000 + this.field525;
            this.field366 &= 2047;
        }
        int var15 = var13 - this.field366;
        if (var15 > 1024) {
            var15 -= 2048;
        }
        if (var15 < -1024) {
            var15 += 2048;
        }
        if (var15 < 0 && var14 > 0 || var15 > 0 && var14 < 0) {
            this.field366 = var13;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LBSQIIHOT;BIII)V")
    public final void method49(class6 arg0, byte arg1, int arg2, int arg3, int arg4) {
        if (arg1 != 36) {
            this.method147();
        }
        if (field519 != arg0) {
            if (this.field261 < 400) {
                String var6;
                if (arg0.field111 == 0) {
                    var6 = arg0.field93 + method156(this.field496, arg0.field109, field519.field109) + " (level-" + arg0.field109 + ")";
                } else {
                    var6 = arg0.field93 + " (skill-" + arg0.field111 + ")";
                }
                if (this.field230 == 1) {
                    this.field419[this.field261] = "Use " + this.field234 + " with @whi@" + var6;
                    this.field464[this.field261] = 567;
                    this.field465[this.field261] = arg3;
                    this.field462[this.field261] = arg2;
                    this.field463[this.field261] = arg4;
                    ++this.field261;
                } else if (this.field402 == 1) {
                    if ((this.field404 & 8) == 8) {
                        this.field419[this.field261] = this.field405 + " @whi@" + var6;
                        this.field464[this.field261] = 495;
                        this.field465[this.field261] = arg3;
                        this.field462[this.field261] = arg2;
                        this.field463[this.field261] = arg4;
                        ++this.field261;
                    }
                } else {
                    for (int var7 = 4; var7 >= 0; --var7) {
                        if (this.field395[var7] != null) {
                            this.field419[this.field261] = this.field395[var7] + " @whi@" + var6;
                            short var9 = 0;
                            if (this.field395[var7].equalsIgnoreCase("attack")) {
                                if (arg0.field109 > field519.field109) {
                                    var9 = 2000;
                                }
                                if (field519.field100 != 0 && arg0.field100 != 0) {
                                    if (field519.field100 == arg0.field100) {
                                        var9 = 2000;
                                    } else {
                                        var9 = 0;
                                    }
                                }
                            } else if (this.field396[var7]) {
                                var9 = 2000;
                            }
                            if (var7 == 0) {
                                this.field464[this.field261] = var9 + 314;
                            }
                            if (var7 == 1) {
                                this.field464[this.field261] = var9 + 274;
                            }
                            if (var7 == 2) {
                                this.field464[this.field261] = var9 + 369;
                            }
                            if (var7 == 3) {
                                this.field464[this.field261] = var9 + 191;
                            }
                            if (var7 == 4) {
                                this.field464[this.field261] = var9 + 48;
                            }
                            this.field465[this.field261] = arg3;
                            this.field462[this.field261] = arg2;
                            this.field463[this.field261] = arg4;
                            ++this.field261;
                        }
                    }
                }
                for (int var8 = 0; var8 < this.field261; ++var8) {
                    if (this.field464[var8] == 2) {
                        this.field419[var8] = "Walk here @whi@" + var6;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIZ)V")
    public final void method50(int arg0, int arg1, boolean arg2) {
        int var4 = 0;
        if (!arg2) {
            for (int var5 = 0; var5 < 100; ++var5) {
                if (this.field585[var5] != null) {
                    int var6 = this.field583[var5];
                    int var7 = 70 - var4 * 14 + this.field331 + 4;
                    if (var7 < -20) {
                        break;
                    }
                    String var8 = this.field584[var5];
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
                    if ((var6 == 1 || var6 == 2) && (var6 == 1 || this.field325 == 0 || this.field325 == 1 && this.method74(-238, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7 && !var8.equals(field519.field93)) {
                            if (this.field433 >= 1) {
                                this.field419[this.field261] = "Report abuse @whi@" + var8;
                                this.field464[this.field261] = 614;
                                ++this.field261;
                            }
                            this.field419[this.field261] = "Add ignore @whi@" + var8;
                            this.field464[this.field261] = 235;
                            ++this.field261;
                            this.field419[this.field261] = "Add friend @whi@" + var8;
                            this.field464[this.field261] = 87;
                            ++this.field261;
                        }
                        ++var4;
                    }
                    if ((var6 == 3 || var6 == 7) && this.field622 == 0 && (var6 == 7 || this.field276 == 0 || this.field276 == 1 && this.method74(-238, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            if (this.field433 >= 1) {
                                this.field419[this.field261] = "Report abuse @whi@" + var8;
                                this.field464[this.field261] = 614;
                                ++this.field261;
                            }
                            this.field419[this.field261] = "Add ignore @whi@" + var8;
                            this.field464[this.field261] = 235;
                            ++this.field261;
                            this.field419[this.field261] = "Add friend @whi@" + var8;
                            this.field464[this.field261] = 87;
                            ++this.field261;
                        }
                        ++var4;
                    }
                    if (var6 == 4 && (this.field368 == 0 || this.field368 == 1 && this.method74(-238, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field419[this.field261] = "Accept trade @whi@" + var8;
                            this.field464[this.field261] = 536;
                            ++this.field261;
                        }
                        ++var4;
                    }
                    if ((var6 == 5 || var6 == 6) && this.field622 == 0 && this.field276 < 2) {
                        ++var4;
                    }
                    if (var6 == 8 && (this.field368 == 0 || this.field368 == 1 && this.method74(-238, var8))) {
                        if (arg0 > var7 - 14 && arg0 <= var7) {
                            this.field419[this.field261] = "Accept challenge @whi@" + var8;
                            this.field464[this.field261] = 691;
                            ++this.field261;
                        }
                        ++var4;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(I)V")
    public final void method51(int arg0) {
        if (this.field456 == null) {
            this.method137(-788);
            super.field1265 = null;
            this.field217 = null;
            this.field218 = null;
            this.field219 = null;
            this.field220 = null;
            this.field221 = null;
            this.field222 = null;
            this.field223 = null;
            if (arg0 != 0) {
                this.field552 = this.field251.method357();
            }
            this.field224 = null;
            this.field225 = null;
            this.field456 = new class11(96, 479, this.method119(0), field425);
            this.field454 = new class11(156, 172, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field487.method38(-23827, 0, 0);
            this.field453 = new class11(261, 190, this.method119(0), field425);
            this.field455 = new class11(334, 512, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field390 = new class11(50, 496, this.method119(0), field425);
            this.field391 = new class11(37, 269, this.method119(0), field425);
            this.field392 = new class11(45, 249, this.method119(0), field425);
            this.field296 = true;
            this.field455.method206((byte) 59);
            class59.field1613 = this.field517;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(B)V")
    public final void method52(byte arg0) {
        ++field512;
        if (arg0 != -6) {
            this.field418 = null;
        }
        if (field512 > 1754) {
            field512 = 0;
            this.field426.method346(41, true);
            this.field426.method347(0);
            int var2 = this.field426.field1161;
            this.field426.method347(105);
            this.field426.method348(61787);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field426.method347(216);
            }
            this.field426.method348(15751);
            this.field426.method348(46500);
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field426.method348(56513);
            }
            this.field426.method348(34718);
            this.field426.method347(7);
            this.field426.method348((int) (Math.random() * 65536.0D));
            if ((int) (Math.random() * 2.0D) == 0) {
                this.field426.method347(222);
            }
            this.field426.method356(true, this.field426.field1161 - var2);
        }
        for (int var3 = 0; var3 < this.field602; ++var3) {
            int var4 = this.field603[var3];
            class1 var5 = this.field601[var4];
            if (var5 != null) {
                this.method53(var5.field2.field1005, var5, (byte) 0);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILJXGMYPJH;B)V")
    public final void method53(int arg0, class27 arg1, byte arg2) {
        if (arg2 == 0) {
            boolean var4 = false;
        } else {
            this.method147();
        }
        if (arg1.field938 < 128 || arg1.field939 < 128 || arg1.field938 >= 13184 || arg1.field939 >= 13184) {
            arg1.field933 = -1;
            arg1.field900 = -1;
            arg1.field909 = 0;
            arg1.field910 = 0;
            arg1.field938 = arg1.field944[0] * 128 + arg1.field922 * 64;
            arg1.field939 = arg1.field945[0] * 128 + arg1.field922 * 64;
            arg1.method304(this.field393);
        }
        if (field519 == arg1 && (arg1.field938 < 1536 || arg1.field939 < 1536 || arg1.field938 >= 11776 || arg1.field939 >= 11776)) {
            arg1.field933 = -1;
            arg1.field900 = -1;
            arg1.field909 = 0;
            arg1.field910 = 0;
            arg1.field938 = arg1.field944[0] * 128 + arg1.field922 * 64;
            arg1.field939 = arg1.field945[0] * 128 + arg1.field922 * 64;
            arg1.method304(this.field393);
        }
        if (arg1.field909 > field502) {
            this.method54(arg1, 414);
        } else if (arg1.field910 >= field502) {
            this.method55(arg1, 205);
        } else {
            this.method56(-38823, arg1);
        }
        this.method57(arg1, (byte) 53);
        this.method58(arg1, 0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJXGMYPJH;I)V")
    public final void method54(class27 arg0, int arg1) {
        int var3 = arg0.field909 - field502;
        int var4 = arg0.field922 * 64 + arg0.field905 * 128;
        int var5 = arg0.field922 * 64 + arg0.field907 * 128;
        arg0.field938 += (var4 - arg0.field938) / var3;
        arg0.field939 += (var5 - arg0.field939) / var3;
        arg0.field912 = 0;
        int var6 = 77 / arg1;
        if (arg0.field911 == 0) {
            arg0.field927 = 1024;
        }
        if (arg0.field911 == 1) {
            arg0.field927 = 1536;
        }
        if (arg0.field911 == 2) {
            arg0.field927 = 0;
        }
        if (arg0.field911 == 3) {
            arg0.field927 = 512;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LJXGMYPJH;I)V")
    public final void method55(class27 arg0, int arg1) {
        if (arg1 <= 0) {
            this.field552 = this.field251.method357();
        }
        if (field502 == arg0.field910 || arg0.field933 == -1 || arg0.field936 != 0 || arg0.field935 + 1 > class28.field952[arg0.field933].method308(6, arg0.field934)) {
            int var3 = arg0.field910 - arg0.field909;
            int var4 = field502 - arg0.field909;
            int var5 = arg0.field922 * 64 + arg0.field905 * 128;
            int var6 = arg0.field922 * 64 + arg0.field907 * 128;
            int var7 = arg0.field922 * 64 + arg0.field906 * 128;
            int var8 = arg0.field922 * 64 + arg0.field908 * 128;
            arg0.field938 = ((var3 - var4) * var5 + var4 * var7) / var3;
            arg0.field939 = ((var3 - var4) * var6 + var4 * var8) / var3;
        }
        arg0.field912 = 0;
        if (arg0.field911 == 0) {
            arg0.field927 = 1024;
        }
        if (arg0.field911 == 1) {
            arg0.field927 = 1536;
        }
        if (arg0.field911 == 2) {
            arg0.field927 = 0;
        }
        if (arg0.field911 == 3) {
            arg0.field927 = 512;
        }
        arg0.field940 = arg0.field927;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILJXGMYPJH;)V")
    public final void method56(int arg0, class27 arg1) {
        arg1.field946 = arg1.field942;
        if (arg1.field926 == 0) {
            arg1.field912 = 0;
        } else {
            if (arg1.field933 != -1 && arg1.field936 == 0) {
                class28 var3 = class28.field952[arg1.field933];
                if (arg1.field924 > 0 && var3.field964 == 0) {
                    ++arg1.field912;
                    return;
                }
                if (arg1.field924 <= 0 && var3.field965 == 0) {
                    ++arg1.field912;
                    return;
                }
            }
            int var4 = arg1.field938;
            int var5 = arg1.field939;
            int var6 = arg1.field944[arg1.field926 - 1] * 128 + arg1.field922 * 64;
            int var7 = arg1.field945[arg1.field926 - 1] * 128 + arg1.field922 * 64;
            if (var6 - var4 <= 256 && var6 - var4 >= -256 && var7 - var5 <= 256 && var7 - var5 >= -256) {
                if (var4 < var6) {
                    if (var5 < var7) {
                        arg1.field927 = 1280;
                    } else if (var5 > var7) {
                        arg1.field927 = 1792;
                    } else {
                        arg1.field927 = 1536;
                    }
                } else if (var4 > var6) {
                    if (var5 < var7) {
                        arg1.field927 = 768;
                    } else if (var5 > var7) {
                        arg1.field927 = 256;
                    } else {
                        arg1.field927 = 512;
                    }
                } else if (var5 < var7) {
                    arg1.field927 = 1024;
                } else {
                    arg1.field927 = 0;
                }
                int var8 = arg1.field927 - arg1.field940 & 2047;
                if (var8 > 1024) {
                    var8 -= 2048;
                }
                int var9 = arg1.field916;
                if (var8 >= -256 && var8 <= 256) {
                    var9 = arg1.field915;
                } else if (var8 >= 256 && var8 < 768) {
                    var9 = arg1.field918;
                } else if (var8 >= -768 && var8 <= -256) {
                    var9 = arg1.field917;
                }
                if (var9 == -1) {
                    var9 = arg1.field915;
                }
                arg1.field946 = var9;
                if (arg0 != -38823) {
                    this.field214 = 217;
                }
                int var10 = 4;
                if (arg1.field940 != arg1.field927 && arg1.field925 == -1 && arg1.field941 != 0) {
                    var10 = 2;
                }
                if (arg1.field926 > 2) {
                    var10 = 6;
                }
                if (arg1.field926 > 3) {
                    var10 = 8;
                }
                if (arg1.field912 > 0 && arg1.field926 > 1) {
                    var10 = 8;
                    --arg1.field912;
                }
                if (arg1.field929[arg1.field926 - 1]) {
                    var10 <<= 1;
                }
                if (var10 >= 8 && arg1.field946 == arg1.field915 && arg1.field928 != -1) {
                    arg1.field946 = arg1.field928;
                }
                if (var4 < var6) {
                    arg1.field938 += var10;
                    if (arg1.field938 > var6) {
                        arg1.field938 = var6;
                    }
                } else if (var4 > var6) {
                    arg1.field938 -= var10;
                    if (arg1.field938 < var6) {
                        arg1.field938 = var6;
                    }
                }
                if (var5 < var7) {
                    arg1.field939 += var10;
                    if (arg1.field939 > var7) {
                        arg1.field939 = var7;
                    }
                } else if (var5 > var7) {
                    arg1.field939 -= var10;
                    if (arg1.field939 < var7) {
                        arg1.field939 = var7;
                    }
                }
                if (arg1.field938 == var6 && arg1.field939 == var7) {
                    --arg1.field926;
                    if (arg1.field924 > 0) {
                        --arg1.field924;
                        return;
                    }
                }
            } else {
                arg1.field938 = var6;
                arg1.field939 = var7;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LJXGMYPJH;B)V")
    public final void method57(class27 arg0, byte arg1) {
        if (arg1 == 53) {
            if (arg0.field941 != 0) {
                if (arg0.field925 != -1 && arg0.field925 < 32768) {
                    class1 var3 = this.field601[arg0.field925];
                    if (var3 != null) {
                        int var4 = arg0.field938 - var3.field938;
                        int var5 = arg0.field939 - var3.field939;
                        if (var4 != 0 || var5 != 0) {
                            arg0.field927 = (int) (Math.atan2((double) var4, (double) var5) * 325.949D) & 2047;
                        }
                    }
                }
                if (arg0.field925 >= 32768) {
                    int var6 = arg0.field925 - 32768;
                    if (this.field447 == var6) {
                        var6 = this.field151;
                    }
                    class6 var7 = this.field152[var6];
                    if (var7 != null) {
                        int var8 = arg0.field938 - var7.field938;
                        int var9 = arg0.field939 - var7.field939;
                        if (var8 != 0 || var9 != 0) {
                            arg0.field927 = (int) (Math.atan2((double) var8, (double) var9) * 325.949D) & 2047;
                        }
                    }
                }
                if ((arg0.field897 != 0 || arg0.field898 != 0) && (arg0.field926 == 0 || arg0.field912 > 0)) {
                    int var10 = arg0.field938 - (arg0.field897 - this.field280 - this.field280) * 64;
                    int var11 = arg0.field939 - (arg0.field898 - this.field281 - this.field281) * 64;
                    if (var10 != 0 || var11 != 0) {
                        arg0.field927 = (int) (Math.atan2((double) var10, (double) var11) * 325.949D) & 2047;
                    }
                    arg0.field897 = 0;
                    arg0.field898 = 0;
                }
                int var12 = arg0.field927 - arg0.field940 & 2047;
                if (var12 != 0) {
                    if (var12 >= arg0.field941 && var12 <= 2048 - arg0.field941) {
                        if (var12 > 1024) {
                            arg0.field940 -= arg0.field941;
                        } else {
                            arg0.field940 += arg0.field941;
                        }
                    } else {
                        arg0.field940 = arg0.field927;
                    }
                    arg0.field940 &= 2047;
                    if (arg0.field946 == arg0.field942 && arg0.field940 != arg0.field927) {
                        if (arg0.field943 != -1) {
                            arg0.field946 = arg0.field943;
                            return;
                        }
                        arg0.field946 = arg0.field915;
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(LJXGMYPJH;I)V")
    public final void method58(class27 arg0, int arg1) {
        if (arg1 != 0) {
            field354 = !field354;
        }
        arg0.field913 = false;
        if (arg0.field946 != -1) {
            class28 var3 = class28.field952[arg0.field946];
            ++arg0.field948;
            if (arg0.field947 < var3.field953 && arg0.field948 > var3.method308(6, arg0.field947)) {
                arg0.field948 = 0;
                ++arg0.field947;
            }
            if (arg0.field947 >= var3.field953) {
                arg0.field948 = 0;
                arg0.field947 = 0;
            }
        }
        if (arg0.field900 != -1 && field502 >= arg0.field903) {
            if (arg0.field901 < 0) {
                arg0.field901 = 0;
            }
            class28 var4 = class34.field1053[arg0.field900].field1057;
            ++arg0.field902;
            while (arg0.field901 < var4.field953 && arg0.field902 > var4.method308(6, arg0.field901)) {
                arg0.field902 -= var4.method308(6, arg0.field901);
                ++arg0.field901;
            }
            if (arg0.field901 >= var4.field953 && (arg0.field901 < 0 || arg0.field901 >= var4.field953)) {
                arg0.field900 = -1;
            }
        }
        if (arg0.field933 != -1 && arg0.field936 <= 1) {
            class28 var5 = class28.field952[arg0.field933];
            if (var5.field964 == 1 && arg0.field924 > 0 && arg0.field909 <= field502 && arg0.field910 < field502) {
                arg0.field936 = 1;
                return;
            }
        }
        if (arg0.field933 != -1 && arg0.field936 == 0) {
            class28 var6 = class28.field952[arg0.field933];
            ++arg0.field935;
            while (arg0.field934 < var6.field953 && arg0.field935 > var6.method308(6, arg0.field934)) {
                arg0.field935 -= var6.method308(6, arg0.field934);
                ++arg0.field934;
            }
            if (arg0.field934 >= var6.field953) {
                arg0.field934 -= var6.field957;
                ++arg0.field937;
                if (arg0.field937 >= var6.field963) {
                    arg0.field933 = -1;
                }
                if (arg0.field934 < 0 || arg0.field934 >= var6.field953) {
                    arg0.field933 = -1;
                }
            }
            arg0.field913 = var6.field959;
        }
        if (arg0.field936 > 0) {
            --arg0.field936;
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(Z)V")
    public final void method59(boolean arg0) {
        this.field210 &= arg0;
        if (this.field505 == -1 || this.field326 != 2 && super.field1265 == null) {
            if (this.field296) {
                this.method51(0);
                this.field296 = false;
                this.field137.method207(super.field1264, (byte) 19, 4, 0);
                this.field138.method207(super.field1264, (byte) 19, 357, 0);
                this.field139.method207(super.field1264, (byte) 19, 4, 722);
                this.field140.method207(super.field1264, (byte) 19, 205, 743);
                this.field141.method207(super.field1264, (byte) 19, 0, 0);
                this.field142.method207(super.field1264, (byte) 19, 4, 516);
                this.field143.method207(super.field1264, (byte) 19, 205, 516);
                this.field144.method207(super.field1264, (byte) 19, 357, 496);
                this.field145.method207(super.field1264, (byte) 19, 338, 0);
                this.field258 = true;
                this.field308 = true;
                this.field149 = true;
                this.field498 = true;
                if (this.field326 != 2) {
                    this.field455.method207(super.field1264, (byte) 19, 4, 4);
                    this.field454.method207(super.field1264, (byte) 19, 4, 550);
                }
            }
            if (this.field326 == 2) {
                this.method73(true);
            }
            if (this.field315 && this.field544 == 1) {
                this.field258 = true;
            }
            if (this.field129 != -1) {
                boolean var4 = this.method186(-523, this.field590, this.field129);
                if (var4) {
                    this.field258 = true;
                }
            }
            if (this.field442 == 2) {
                this.field258 = true;
            }
            if (this.field318 == 2) {
                this.field258 = true;
            }
            if (this.field258) {
                this.method193((byte) 4);
                this.field258 = false;
            }
            if (this.field621 == -1 && this.field533 == 0) {
                this.field485.field1238 = this.field339 - this.field331 - 77;
                if (super.field1272 > 448 && super.field1272 < 560 && super.field1273 > 332) {
                    this.method109(super.field1273 - 357, this.field485, 77, true, 0, -1, super.field1272 - 17, 463, this.field339);
                }
                int var5 = this.field339 - 77 - this.field485.field1238;
                if (var5 < 0) {
                    var5 = 0;
                }
                if (var5 > this.field339 - 77) {
                    var5 = this.field339 - 77;
                }
                if (this.field331 != var5) {
                    this.field331 = var5;
                    this.field308 = true;
                }
            }
            if (this.field621 == -1 && this.field533 == 3) {
                int var6 = this.field269 * 14 + 7;
                this.field485.field1238 = this.field272;
                if (super.field1272 > 448 && super.field1272 < 560 && super.field1273 > 332) {
                    this.method109(super.field1273 - 357, this.field485, 77, true, 0, -1, super.field1272 - 17, 463, var6);
                }
                int var7 = this.field485.field1238;
                if (var7 < 0) {
                    var7 = 0;
                }
                if (var7 > var6 - 77) {
                    var7 = var6 - 77;
                }
                if (this.field272 != var7) {
                    this.field272 = var7;
                    this.field308 = true;
                }
            }
            if (this.field621 != -1) {
                boolean var8 = this.method186(-523, this.field590, this.field621);
                if (var8) {
                    this.field308 = true;
                }
            }
            if (this.field442 == 3) {
                this.field308 = true;
            }
            if (this.field318 == 3) {
                this.field308 = true;
            }
            if (this.field292 != null) {
                this.field308 = true;
            }
            if (this.field315 && this.field544 == 2) {
                this.field308 = true;
            }
            if (this.field308) {
                this.method88(false);
                this.field308 = false;
            }
            if (this.field326 == 2) {
                this.method181(-234);
                this.field454.method207(super.field1264, (byte) 19, 4, 550);
            }
            if (this.field467 != -1) {
                this.field149 = true;
            }
            if (this.field149) {
                if (this.field467 != -1 && this.field467 == this.field389) {
                    this.field467 = -1;
                    this.field426.method346(77, true);
                    this.field426.method347(this.field389);
                }
                this.field149 = false;
                this.field392.method206((byte) 59);
                this.field202.method38(-23827, 0, 0);
                if (this.field129 == -1) {
                    if (this.field321[this.field389] != -1) {
                        if (this.field389 == 0) {
                            this.field176.method38(-23827, 22, 10);
                        }
                        if (this.field389 == 1) {
                            this.field177.method38(-23827, 54, 8);
                        }
                        if (this.field389 == 2) {
                            this.field177.method38(-23827, 82, 8);
                        }
                        if (this.field389 == 3) {
                            this.field178.method38(-23827, 110, 8);
                        }
                        if (this.field389 == 4) {
                            this.field180.method38(-23827, 153, 8);
                        }
                        if (this.field389 == 5) {
                            this.field180.method38(-23827, 181, 8);
                        }
                        if (this.field389 == 6) {
                            this.field179.method38(-23827, 209, 9);
                        }
                    }
                    if (this.field321[0] != -1 && (this.field467 != 0 || field502 % 20 < 10)) {
                        this.field356[0].method38(-23827, 29, 13);
                    }
                    if (this.field321[1] != -1 && (this.field467 != 1 || field502 % 20 < 10)) {
                        this.field356[1].method38(-23827, 53, 11);
                    }
                    if (this.field321[2] != -1 && (this.field467 != 2 || field502 % 20 < 10)) {
                        this.field356[2].method38(-23827, 82, 11);
                    }
                    if (this.field321[3] != -1 && (this.field467 != 3 || field502 % 20 < 10)) {
                        this.field356[3].method38(-23827, 115, 12);
                    }
                    if (this.field321[4] != -1 && (this.field467 != 4 || field502 % 20 < 10)) {
                        this.field356[4].method38(-23827, 153, 13);
                    }
                    if (this.field321[5] != -1 && (this.field467 != 5 || field502 % 20 < 10)) {
                        this.field356[5].method38(-23827, 180, 11);
                    }
                    if (this.field321[6] != -1 && (this.field467 != 6 || field502 % 20 < 10)) {
                        this.field356[6].method38(-23827, 208, 13);
                    }
                }
                this.field392.method207(super.field1264, (byte) 19, 160, 516);
                this.field391.method206((byte) 59);
                this.field201.method38(-23827, 0, 0);
                if (this.field129 == -1) {
                    if (this.field321[this.field389] != -1) {
                        if (this.field389 == 7) {
                            this.field538.method38(-23827, 42, 0);
                        }
                        if (this.field389 == 8) {
                            this.field539.method38(-23827, 74, 0);
                        }
                        if (this.field389 == 9) {
                            this.field539.method38(-23827, 102, 0);
                        }
                        if (this.field389 == 10) {
                            this.field540.method38(-23827, 130, 1);
                        }
                        if (this.field389 == 11) {
                            this.field542.method38(-23827, 173, 0);
                        }
                        if (this.field389 == 12) {
                            this.field542.method38(-23827, 201, 0);
                        }
                        if (this.field389 == 13) {
                            this.field541.method38(-23827, 229, 0);
                        }
                    }
                    if (this.field321[8] != -1 && (this.field467 != 8 || field502 % 20 < 10)) {
                        this.field356[7].method38(-23827, 74, 2);
                    }
                    if (this.field321[9] != -1 && (this.field467 != 9 || field502 % 20 < 10)) {
                        this.field356[8].method38(-23827, 102, 3);
                    }
                    if (this.field321[10] != -1 && (this.field467 != 10 || field502 % 20 < 10)) {
                        this.field356[9].method38(-23827, 137, 4);
                    }
                    if (this.field321[11] != -1 && (this.field467 != 11 || field502 % 20 < 10)) {
                        this.field356[10].method38(-23827, 174, 2);
                    }
                    if (this.field321[12] != -1 && (this.field467 != 12 || field502 % 20 < 10)) {
                        this.field356[11].method38(-23827, 201, 2);
                    }
                    if (this.field321[13] != -1 && (this.field467 != 13 || field502 % 20 < 10)) {
                        this.field356[12].method38(-23827, 226, 2);
                    }
                }
                this.field391.method207(super.field1264, (byte) 19, 466, 496);
                this.field455.method206((byte) 59);
                class59.field1613 = this.field517;
            }
            if (this.field498) {
                this.field498 = false;
                this.field390.method206((byte) 59);
                this.field200.method38(-23827, 0, 0);
                this.field207.method19("Public chat", true, 28, 16777215, 0, 55);
                if (this.field325 == 0) {
                    this.field207.method19("On", true, 41, 65280, 0, 55);
                }
                if (this.field325 == 1) {
                    this.field207.method19("Friends", true, 41, 16776960, 0, 55);
                }
                if (this.field325 == 2) {
                    this.field207.method19("Off", true, 41, 16711680, 0, 55);
                }
                if (this.field325 == 3) {
                    this.field207.method19("Hide", true, 41, 65535, 0, 55);
                }
                this.field207.method19("Private chat", true, 28, 16777215, 0, 184);
                if (this.field276 == 0) {
                    this.field207.method19("On", true, 41, 65280, 0, 184);
                }
                if (this.field276 == 1) {
                    this.field207.method19("Friends", true, 41, 16776960, 0, 184);
                }
                if (this.field276 == 2) {
                    this.field207.method19("Off", true, 41, 16711680, 0, 184);
                }
                this.field207.method19("Trade/compete", true, 28, 16777215, 0, 324);
                if (this.field368 == 0) {
                    this.field207.method19("On", true, 41, 65280, 0, 324);
                }
                if (this.field368 == 1) {
                    this.field207.method19("Friends", true, 41, 16776960, 0, 324);
                }
                if (this.field368 == 2) {
                    this.field207.method19("Off", true, 41, 16711680, 0, 324);
                }
                this.field207.method19("Report abuse", true, 33, 16777215, 0, 458);
                this.field390.method207(super.field1264, (byte) 19, 453, 0);
                this.field455.method206((byte) 59);
                class59.field1613 = this.field517;
            }
            this.field590 = 0;
        } else {
            if (this.field326 == 2) {
                this.method186(-523, this.field590, this.field505);
                if (this.field432 != -1) {
                    this.method186(-523, this.field590, this.field432);
                }
                this.field590 = 0;
                this.method70((byte) 3);
                super.field1265.method206((byte) 59);
                class59.field1613 = this.field518;
                class15.method212((byte) 0);
                this.field296 = true;
                class39 var2 = class39.method402(this.field505);
                if (var2.field1187 == 512 && var2.field1183 == 334 && var2.field1242 == 0) {
                    var2.field1187 = 765;
                    var2.field1183 = 503;
                }
                this.method124(var2, 0, 0, 878, 0);
                if (this.field432 != -1) {
                    class39 var3 = class39.method402(this.field432);
                    if (var3.field1187 == 512 && var3.field1183 == 334 && var3.field1242 == 0) {
                        var3.field1187 = 765;
                        var3.field1183 = 503;
                    }
                    this.method124(var3, 0, 0, 878, 0);
                }
                if (!this.field315) {
                    this.method165((byte) 106);
                    this.method174((byte) 125);
                } else {
                    this.method69(-705);
                }
            }
            super.field1265.method207(super.field1264, (byte) 19, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(I)V")
    public final void method60(int arg0) {
        this.field146 = true;
        if (arg0 != 3127) {
            this.field167 = this.field203.method483();
        }
        try {
            long var2 = System.currentTimeMillis();
            int var4 = 0;
            int var5 = 20;
            while (this.field384) {
                ++this.field458;
                this.method145((byte) 90);
                this.method145((byte) 90);
                this.method149(this.field338);
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
        this.field146 = false;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMVHXDWGI;ZI)V")
    private final void method61(class38 arg0, boolean arg1, int arg2) {
        while (true) {
            if (arg0.field1162 + 10 < arg2 * 8) {
                int var4 = arg0.method368(1, 11);
                if (var4 != 2047) {
                    if (this.field152[var4] == null) {
                        this.field152[var4] = new class6();
                        if (this.field157[var4] != null) {
                            this.field152[var4].method42(this.field157[var4], -46903);
                        }
                    }
                    this.field154[this.field153++] = var4;
                    class6 var5 = this.field152[var4];
                    var5.field923 = field502;
                    int var6 = arg0.method368(1, 5);
                    if (var6 > 15) {
                        var6 -= 32;
                    }
                    int var7 = arg0.method368(1, 1);
                    int var8 = arg0.method368(1, 1);
                    if (var8 == 1) {
                        this.field156[this.field155++] = var4;
                    }
                    int var9 = arg0.method368(1, 5);
                    if (var9 > 15) {
                        var9 -= 32;
                    }
                    var5.method306(field519.field945[0] + var6, var7 == 1, field519.field944[0] + var9, this.field291);
                    continue;
                }
            }
            arg0.method369(49924);
            if (arg1) {
                return;
            }
            for (int var10 = 1; var10 > 0; ++var10) {
            }
            return;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(B)V")
    public final void method62(byte arg0) {
        for (class56 var2 = (class56) this.field386.method246(); var2 != null; var2 = (class56) this.field386.method248(true)) {
            if (this.field452 == var2.field1551 && field502 <= var2.field1555) {
                if (field502 >= var2.field1554) {
                    if (var2.field1560 > 0) {
                        class1 var4 = this.field601[var2.field1560 - 1];
                        if (var4 != null && var4.field938 >= 0 && var4.field938 < 13312 && var4.field939 >= 0 && var4.field939 < 13312) {
                            var2.method542(var4.field938, field502, false, this.method68(0, var4.field939, var4.field938, var2.field1551) - var2.field1567, var4.field939);
                        }
                    }
                    if (var2.field1560 < 0) {
                        int var5 = -var2.field1560 - 1;
                        class6 var6;
                        if (this.field447 == var5) {
                            var6 = field519;
                        } else {
                            var6 = this.field152[var5];
                        }
                        if (var6 != null && var6.field938 >= 0 && var6.field938 < 13312 && var6.field939 >= 0 && var6.field939 < 13312) {
                            var2.method542(var6.field938, field502, false, this.method68(0, var6.field939, var6.field938, var2.field1551) - var2.field1567, var6.field939);
                        }
                    }
                    var2.method541(this.field590, field491);
                    this.field451.method263(this.field452, (int) var2.field1550, (int) var2.field1548, var2, (int) var2.field1549, 60, var2.field1542, false, -1, (byte) -89);
                }
            } else {
                var2.method589();
            }
        }
        ++field422;
        if (arg0 != -119) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (field422 > 138) {
            field422 = 0;
            this.field426.method346(36, true);
            this.field426.method348(48837);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JI)V")
    public final void method63(long arg0, int arg1) {
        if (arg0 != 0L) {
            for (int var4 = 0; var4 < this.field510; ++var4) {
                if (this.field169[var4] == arg0) {
                    --this.field510;
                    this.field258 = true;
                    for (int var5 = var4; var5 < this.field510; ++var5) {
                        this.field169[var5] = this.field169[var5 + 1];
                    }
                    this.field426.method346(141, true);
                    this.field426.method353(arg0, 2);
                    break;
                }
            }
            if (arg1 < 7 || arg1 > 7) {
                ;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(B)V")
    public final void method64(byte arg0) {
        if (arg0 == 2) {
            boolean var2 = false;
            if (field379 && this.field326 == 2 && class55.field1538 != this.field452) {
                this.method111((String) null, 9231, "Loading - please wait.");
                this.field326 = 1;
                this.field297 = System.currentTimeMillis();
            }
            if (this.field326 == 1) {
                int var3 = this.method65(false);
                if (var3 != 0 && System.currentTimeMillis() - this.field297 > 360000L) {
                    signlink.reporterror(this.field483 + " glcfb " + this.field414 + "," + var3 + "," + field379 + "," + this.field361[0] + "," + this.field437.method499() + "," + this.field452 + "," + this.field443 + "," + this.field444);
                    this.field297 = System.currentTimeMillis();
                }
            }
            if (this.field326 == 2 && this.field452 != this.field370) {
                this.field370 = this.field452;
                this.method87(this.field452, (byte) -114);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(Z)I")
    public final int method65(boolean arg0) {
        for (int var2 = 0; var2 < this.field401.length; ++var2) {
            if (this.field401[var2] == null && this.field246[var2] != -1) {
                return -1;
            }
            if (this.field274[var2] == null && this.field247[var2] != -1) {
                return -2;
            }
        }
        if (arg0) {
            field135 = this.field203.method483();
        }
        boolean var3 = true;
        for (int var4 = 0; var4 < this.field401.length; ++var4) {
            byte[] var5 = this.field274[var4];
            if (var5 != null) {
                int var6 = (this.field245[var4] >> 8) * 64 - this.field280;
                int var7 = (this.field245[var4] & 255) * 64 - this.field281;
                if (this.field549) {
                    var6 = 10;
                    var7 = 10;
                }
                var3 &= class55.method537(0, var5, var7, var6);
            }
        }
        if (!var3) {
            return -3;
        } else if (this.field244) {
            return -4;
        } else {
            this.field326 = 2;
            class55.field1538 = this.field452;
            this.method104((byte) 2);
            this.field426.method346(50, true);
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(II)V")
    public final void method66(int arg0, int arg1) {
        class39 var3 = class39.method402(arg0);
        for (int var4 = 0; var4 < var3.field1214.length && var3.field1214[var4] != -1; ++var4) {
            class39 var5 = class39.method402(var3.field1214[var4]);
            if (var5.field1242 == 1) {
                this.method66(var5.field1226, 0);
            }
            var5.field1209 = 0;
            var5.field1248 = 0;
        }
        if (arg1 == 0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(B)V")
    public final void method67(byte arg0) {
        if (arg0 != 56) {
            this.field355 = -10;
        }
        while (true) {
            int var2;
            do {
                while (true) {
                    var2 = this.method409(878);
                    if (var2 == -1) {
                        return;
                    }
                    if (this.field348 != -1 && this.field380 == this.field348) {
                        if (var2 == 8 && this.field595.length() > 0) {
                            this.field595 = this.field595.substring(0, this.field595.length() - 1);
                        }
                        break;
                    }
                    if (this.field273) {
                        if (var2 >= 32 && var2 <= 122 && this.field241.length() < 80) {
                            this.field241 = this.field241 + (char) var2;
                            this.field308 = true;
                        }
                        if (var2 == 8 && this.field241.length() > 0) {
                            this.field241 = this.field241.substring(0, this.field241.length() - 1);
                            this.field308 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            this.field273 = false;
                            this.field308 = true;
                            if (this.field166 == 1) {
                                long var3 = class58.method547(this.field241);
                                this.method178(var3, -678);
                            }
                            if (this.field166 == 2 && this.field130 > 0) {
                                long var5 = class58.method547(this.field241);
                                this.method103(986, var5);
                            }
                            if (this.field166 == 3 && this.field241.length() > 0) {
                                this.field426.method346(177, true);
                                this.field426.method347(0);
                                int var7 = this.field426.field1161;
                                this.field426.method353(this.field132, 2);
                                class52.method496(this.field426, this.field241, -699);
                                this.field426.method356(true, this.field426.field1161 - var7);
                                this.field241 = class52.method497(this.field241, (byte) 8);
                                this.field241 = class43.method451(this.field241, (byte) 8);
                                this.method102(4, this.field241, 6, class58.method551(class58.method548(this.field132, 13452), 0));
                                if (this.field276 == 2) {
                                    this.field276 = 1;
                                    this.field498 = true;
                                    this.field426.method346(227, true);
                                    this.field426.method347(this.field325);
                                    this.field426.method347(this.field276);
                                    this.field426.method347(this.field368);
                                }
                            }
                            if (this.field166 == 4 && this.field510 < 100) {
                                long var8 = class58.method547(this.field241);
                                this.method83(var8, (byte) -99);
                            }
                            if (this.field166 == 5 && this.field510 > 0) {
                                long var10 = class58.method547(this.field241);
                                this.method63(var10, 7);
                            }
                        }
                    } else if (this.field533 == 1) {
                        if (var2 >= 48 && var2 <= 57 && this.field334.length() < 10) {
                            this.field334 = this.field334 + (char) var2;
                            this.field308 = true;
                        }
                        if (var2 == 8 && this.field334.length() > 0) {
                            this.field334 = this.field334.substring(0, this.field334.length() - 1);
                            this.field308 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field334.length() > 0) {
                                int var12 = 0;
                                try {
                                    var12 = Integer.parseInt(this.field334);
                                } catch (Exception var22) {
                                }
                                this.field426.method346(142, true);
                                this.field426.method351(var12);
                            }
                            this.field533 = 0;
                            this.field308 = true;
                        }
                    } else if (this.field533 == 2) {
                        if (var2 >= 32 && var2 <= 122 && this.field334.length() < 12) {
                            this.field334 = this.field334 + (char) var2;
                            this.field308 = true;
                        }
                        if (var2 == 8 && this.field334.length() > 0) {
                            this.field334 = this.field334.substring(0, this.field334.length() - 1);
                            this.field308 = true;
                        }
                        if (var2 == 13 || var2 == 10) {
                            if (this.field334.length() > 0) {
                                this.field426.method346(217, true);
                                this.field426.method353(class58.method547(this.field334), 2);
                            }
                            this.field533 = 0;
                            this.field308 = true;
                        }
                    } else if (this.field533 == 3) {
                        if (var2 >= 32 && var2 <= 122 && this.field334.length() < 40) {
                            this.field334 = this.field334 + (char) var2;
                            this.field308 = true;
                        }
                        if (var2 == 8 && this.field334.length() > 0) {
                            this.field334 = this.field334.substring(0, this.field334.length() - 1);
                            this.field308 = true;
                        }
                    } else if (this.field621 == -1 && this.field505 == -1) {
                        if (var2 >= 32 && var2 <= 122 && this.field581.length() < 80) {
                            this.field581 = this.field581 + (char) var2;
                            this.field308 = true;
                        }
                        if (var2 == 8 && this.field581.length() > 0) {
                            this.field581 = this.field581.substring(0, this.field581.length() - 1);
                            this.field308 = true;
                        }
                        if ((var2 == 13 || var2 == 10) && this.field581.length() > 0) {
                            if (this.field433 == 2) {
                                if (this.field581.equals("::clientdrop")) {
                                    this.method167(false);
                                }
                                if (this.field581.equals("::lag")) {
                                    this.method118(6);
                                }
                                if (this.field581.equals("::prefetchmusic")) {
                                    for (int var13 = 0; var13 < this.field437.method514(true, 2); ++var13) {
                                        this.field437.method501(2, (byte) 1, var13, field571);
                                    }
                                }
                                if (this.field581.equals("::fpson")) {
                                    field305 = true;
                                }
                                if (this.field581.equals("::fpsoff")) {
                                    field305 = false;
                                }
                                if (this.field581.equals("::noclip")) {
                                    for (int var14 = 0; var14 < 4; ++var14) {
                                        for (int var15 = 1; var15 < 103; ++var15) {
                                            for (int var16 = 1; var16 < 103; ++var16) {
                                                this.field314[var14].field1024[var15][var16] = 0;
                                            }
                                        }
                                    }
                                }
                            }
                            if (this.field581.startsWith("::")) {
                                this.field426.method346(58, true);
                                this.field426.method347(this.field581.length() - 1);
                                this.field426.method354(this.field581.substring(2));
                            } else {
                                String var17 = this.field581.toLowerCase();
                                byte var18 = 0;
                                if (var17.startsWith("yellow:")) {
                                    var18 = 0;
                                    this.field581 = this.field581.substring(7);
                                } else if (var17.startsWith("red:")) {
                                    var18 = 1;
                                    this.field581 = this.field581.substring(4);
                                } else if (var17.startsWith("green:")) {
                                    var18 = 2;
                                    this.field581 = this.field581.substring(6);
                                } else if (var17.startsWith("cyan:")) {
                                    var18 = 3;
                                    this.field581 = this.field581.substring(5);
                                } else if (var17.startsWith("purple:")) {
                                    var18 = 4;
                                    this.field581 = this.field581.substring(7);
                                } else if (var17.startsWith("white:")) {
                                    var18 = 5;
                                    this.field581 = this.field581.substring(6);
                                } else if (var17.startsWith("flash1:")) {
                                    var18 = 6;
                                    this.field581 = this.field581.substring(7);
                                } else if (var17.startsWith("flash2:")) {
                                    var18 = 7;
                                    this.field581 = this.field581.substring(7);
                                } else if (var17.startsWith("flash3:")) {
                                    var18 = 8;
                                    this.field581 = this.field581.substring(7);
                                } else if (var17.startsWith("glow1:")) {
                                    var18 = 9;
                                    this.field581 = this.field581.substring(6);
                                } else if (var17.startsWith("glow2:")) {
                                    var18 = 10;
                                    this.field581 = this.field581.substring(6);
                                } else if (var17.startsWith("glow3:")) {
                                    var18 = 11;
                                    this.field581 = this.field581.substring(6);
                                }
                                String var19 = this.field581.toLowerCase();
                                byte var20 = 0;
                                if (var19.startsWith("wave:")) {
                                    var20 = 1;
                                    this.field581 = this.field581.substring(5);
                                } else if (var19.startsWith("wave2:")) {
                                    var20 = 2;
                                    this.field581 = this.field581.substring(6);
                                } else if (var19.startsWith("shake:")) {
                                    var20 = 3;
                                    this.field581 = this.field581.substring(6);
                                } else if (var19.startsWith("scroll:")) {
                                    var20 = 4;
                                    this.field581 = this.field581.substring(7);
                                } else if (var19.startsWith("slide:")) {
                                    var20 = 5;
                                    this.field581 = this.field581.substring(6);
                                }
                                this.field426.method346(110, true);
                                this.field426.method347(0);
                                int var21 = this.field426.field1161;
                                this.field600.field1161 = 0;
                                class52.method496(this.field600, this.field581, -699);
                                this.field426.method355(-641, this.field600.field1160, this.field600.field1161, 0);
                                this.field426.method347(var20);
                                this.field426.method374(164, var18);
                                this.field426.method356(true, this.field426.field1161 - var21);
                                this.field581 = class52.method497(this.field581, (byte) 8);
                                this.field581 = class43.method451(this.field581, (byte) 8);
                                field519.field914 = this.field581;
                                field519.field895 = var18;
                                field519.field896 = var20;
                                field519.field949 = 150;
                                if (this.field433 == 2) {
                                    this.method102(4, field519.field914, 2, "@cr2@" + field519.field93);
                                } else if (this.field433 == 1) {
                                    this.method102(4, field519.field914, 2, "@cr1@" + field519.field93);
                                } else {
                                    this.method102(4, field519.field914, 2, field519.field93);
                                }
                                if (this.field325 == 2) {
                                    this.field325 = 3;
                                    this.field498 = true;
                                    this.field426.method346(227, true);
                                    this.field426.method347(this.field325);
                                    this.field426.method347(this.field276);
                                    this.field426.method347(this.field368);
                                }
                            }
                            this.field581 = "";
                            this.field308 = true;
                        }
                    }
                }
            } while ((var2 < 97 || var2 > 122) && (var2 < 65 || var2 > 90) && (var2 < 48 || var2 > 57) && var2 != 32);
            if (this.field595.length() < 12) {
                this.field595 = this.field595 + (char) var2;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIII)I")
    public final int method68(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg2 >> 7;
        int var6 = arg1 >> 7;
        if (arg0 != 0) {
            for (int var7 = 1; var7 > 0; ++var7) {
            }
        }
        if (var5 >= 0 && var6 >= 0 && var5 <= 103 && var6 <= 103) {
            int var8 = arg3;
            if (arg3 < 3 && (this.field249[1][var5][var6] & 2) == 2) {
                var8 = arg3 + 1;
            }
            int var9 = arg2 & 127;
            int var10 = arg1 & 127;
            int var11 = (128 - var9) * this.field599[var8][var5][var6] + this.field599[var8][var5 + 1][var6] * var9 >> 7;
            int var12 = (128 - var9) * this.field599[var8][var5][var6 + 1] + this.field599[var8][var5 + 1][var6 + 1] * var9 >> 7;
            return (128 - var10) * var11 + var10 * var12 >> 7;
        } else {
            return 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(I)V")
    public final void method69(int arg0) {
        int var2 = this.field545;
        int var3 = this.field546;
        int var4 = this.field547;
        int var5 = this.field548;
        int var6 = 6116423;
        class15.method214(var6, 435, var5, var2, var3, var4);
        class15.method214(0, 435, 16, var2 + 1, var3 + 1, var4 - 2);
        class15.method215(var5 - 19, 479, 0, var4 - 2, var3 + 18, var2 + 1);
        this.field208.method22((byte) 6, var3 + 14, "Choose Option", var2 + 3, var6);
        int var7 = super.field1272;
        int var8 = super.field1273;
        while (arg0 >= 0) {
            this.field418 = null;
        }
        if (this.field544 == 0) {
            var7 -= 4;
            var8 -= 4;
        }
        if (this.field544 == 1) {
            var7 -= 553;
            var8 -= 205;
        }
        if (this.field544 == 2) {
            var7 -= 17;
            var8 -= 357;
        }
        for (int var9 = 0; var9 < this.field261; ++var9) {
            int var10 = (this.field261 - 1 - var9) * 15 + var3 + 31;
            int var11 = 16777215;
            if (var7 > var2 && var7 < var2 + var4 && var8 > var10 - 13 && var8 < var10 + 3) {
                var11 = 16776960;
            }
            this.field208.method26(var2 + 3, -968, var10, true, this.field419[var9], var11);
        }
    }

    @OriginalMember(owner = "client!client", name = "run", descriptor = "()V")
    public final void run() {
        if (this.field190) {
            this.method60(3127);
        } else {
            super.run();
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(B)V")
    public final void method70(byte arg0) {
        if (super.field1265 == null) {
            this.method137(-788);
            this.field217 = null;
            this.field218 = null;
            this.field219 = null;
            this.field220 = null;
            if (arg0 == 3) {
                boolean var2 = false;
            } else {
                this.method147();
            }
            this.field221 = null;
            this.field222 = null;
            this.field223 = null;
            this.field224 = null;
            this.field225 = null;
            this.field456 = null;
            this.field454 = null;
            this.field453 = null;
            this.field455 = null;
            this.field390 = null;
            this.field391 = null;
            this.field392 = null;
            super.field1265 = new class11(503, 765, this.method119(0), field425);
            this.field296 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(B)V")
    public final void method71(byte arg0) {
        if (this.field534 == 2) {
            this.method152(0, (this.field182 - this.field281 << 7) + this.field185, this.field183 * 2, (this.field181 - this.field280 << 7) + this.field184);
            if (arg0 != 100) {
                field135 = this.field203.method483();
            }
            if (this.field573 > -1 && field502 % 20 < 10) {
                this.field385[0].method233(-23827, this.field573 - 12, this.field574 - 28);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILjava/lang/String;)V")
    public final void method72(int arg0, int arg1, String arg2) {
        this.field592 = arg1;
        this.field290 = arg2;
        this.method77(0);
        if (this.field604 == null) {
            super.method72(-618, arg1, arg2);
        } else {
            this.field219.method206((byte) 59);
            if (arg0 >= 0) {
                field425 = this.field203.method483();
            }
            short var4 = 360;
            short var5 = 200;
            byte var6 = 20;
            this.field208.method18(16777215, "RuneScape is loading - please wait...", var5 / 2 - 26 - var6, var4 / 2, 0);
            int var7 = var5 / 2 - 18 - var6;
            class15.method215(34, 479, 9179409, 304, var7, var4 / 2 - 152);
            class15.method215(32, 479, 0, 302, var7 + 1, var4 / 2 - 151);
            class15.method214(9179409, 435, 30, var4 / 2 - 150, var7 + 2, arg1 * 3);
            class15.method214(0, 435, 30, arg1 * 3 + (var4 / 2 - 150), var7 + 2, 300 - arg1 * 3);
            this.field208.method18(16777215, arg2, var5 / 2 + 5 - var6, var4 / 2, 0);
            this.field219.method207(super.field1264, (byte) 19, 171, 202);
            if (this.field296) {
                this.field296 = false;
                if (!this.field384) {
                    this.field220.method207(super.field1264, (byte) 19, 0, 0);
                    this.field221.method207(super.field1264, (byte) 19, 0, 637);
                }
                this.field217.method207(super.field1264, (byte) 19, 0, 128);
                this.field218.method207(super.field1264, (byte) 19, 371, 202);
                this.field222.method207(super.field1264, (byte) 19, 265, 0);
                this.field223.method207(super.field1264, (byte) 19, 265, 562);
                this.field224.method207(super.field1264, (byte) 19, 171, 128);
                this.field225.method207(super.field1264, (byte) 19, 171, 562);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(Z)V")
    public final void method73(boolean arg0) {
        ++this.field163;
        this.method96(true, this.field569);
        this.method144(true, (byte) 7);
        this.method96(false, this.field569);
        this.method144(false, (byte) 7);
        this.method62((byte) -119);
        this.method158(this.field239);
        if (!this.field198) {
            int var2 = this.field428;
            if (this.field586 / 256 > var2) {
                var2 = this.field586 / 256;
            }
            if (this.field582[4] && this.field562[4] + 128 > var2) {
                var2 = this.field562[4] + 128;
            }
            int var3 = this.field429 + this.field242 & 2047;
            this.method163(var2 * 3 + 600, this.method68(0, field519.field939, field519.field938, this.field452) - 50, -33142, this.field236, var3, var2, this.field235);
        }
        int var4;
        if (!this.field198) {
            var4 = this.method115(32209);
        } else {
            var4 = this.method116(this.field381);
        }
        int var5 = this.field362;
        int var6 = this.field363;
        int var7 = this.field364;
        int var8 = this.field365;
        int var9 = this.field366;
        for (int var10 = 0; var10 < 5; ++var10) {
            if (this.field582[var10]) {
                int var13 = (int) (Math.random() * (double) (this.field616[var10] * 2 + 1) - (double) this.field616[var10] + Math.sin((double) this.field299[var10] / 100.0D * (double) this.field543[var10]) * (double) this.field562[var10]);
                if (var10 == 0) {
                    this.field362 += var13;
                }
                if (var10 == 1) {
                    this.field363 += var13;
                }
                if (var10 == 2) {
                    this.field364 += var13;
                }
                if (var10 == 3) {
                    this.field366 = this.field366 + var13 & 2047;
                }
                if (var10 == 4) {
                    this.field365 += var13;
                    if (this.field365 < 128) {
                        this.field365 = 128;
                    }
                    if (this.field365 > 383) {
                        this.field365 = 383;
                    }
                }
            }
        }
        int var11 = class59.field1622;
        class42.field1354 = true;
        class42.field1357 = 0;
        if (!arg0) {
            for (int var12 = 1; var12 > 0; ++var12) {
            }
        }
        class42.field1355 = super.field1272 - 4;
        class42.field1356 = super.field1273 - 4;
        class15.method212((byte) 0);
        this.field451.method291(this.field365, this.field363, (byte) 46, var4, this.field366, this.field364, this.field362);
        this.field451.method266(6);
        this.method172(false);
        this.method71((byte) 100);
        this.method93(-139, var11);
        this.method187(this.field197);
        this.field455.method207(super.field1264, (byte) 19, 4, 4);
        this.field362 = var5;
        this.field363 = var6;
        this.field364 = var7;
        this.field365 = var8;
        this.field366 = var9;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;)Z")
    public final boolean method74(int arg0, String arg1) {
        while (arg0 >= 0) {
            this.field426.method347(99);
        }
        if (arg1 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < this.field130; ++var3) {
                if (arg1.equalsIgnoreCase(this.field580[var3])) {
                    return true;
                }
            }
            if (arg1.equalsIgnoreCase(field519.field93)) {
                return true;
            } else {
                return false;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(Z)V")
    public final void method75(boolean arg0) {
        if (!this.field589 && !this.field286 && !this.field406) {
            ++field360;
            if (arg0) {
                if (!this.field210) {
                    this.method143(-941, false);
                } else {
                    this.method59(true);
                }
                this.field285 = 0;
            }
        } else {
            this.method141((byte) 85);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMVHXDWGI;I)V")
    private final void method76(int arg0, class38 arg1, int arg2) {
        arg1.method367(0);
        int var4 = arg1.method368(1, 8);
        int var5 = 80 / arg2;
        if (var4 < this.field602) {
            for (int var6 = var4; var6 < this.field602; ++var6) {
                this.field253[this.field252++] = this.field603[var6];
            }
        }
        if (var4 > this.field602) {
            signlink.reporterror(this.field483 + " Too many npcs");
            throw new RuntimeException("eek");
        } else {
            this.field602 = 0;
            for (int var7 = 0; var7 < var4; ++var7) {
                int var8 = this.field603[var7];
                class1 var9 = this.field601[var8];
                int var10 = arg1.method368(1, 1);
                if (var10 == 0) {
                    this.field603[this.field602++] = var8;
                    var9.field923 = field502;
                } else {
                    int var11 = arg1.method368(1, 2);
                    if (var11 == 0) {
                        this.field603[this.field602++] = var8;
                        var9.field923 = field502;
                        this.field156[this.field155++] = var8;
                    } else if (var11 == 1) {
                        this.field603[this.field602++] = var8;
                        var9.field923 = field502;
                        int var12 = arg1.method368(1, 3);
                        var9.method303(var12, false, (byte) -110);
                        int var13 = arg1.method368(1, 1);
                        if (var13 == 1) {
                            this.field156[this.field155++] = var8;
                        }
                    } else if (var11 == 2) {
                        this.field603[this.field602++] = var8;
                        var9.field923 = field502;
                        int var14 = arg1.method368(1, 3);
                        var9.method303(var14, true, (byte) -110);
                        int var15 = arg1.method368(1, 3);
                        var9.method303(var15, true, (byte) -110);
                        int var16 = arg1.method368(1, 1);
                        if (var16 == 1) {
                            this.field156[this.field155++] = var8;
                        }
                    } else if (var11 == 3) {
                        this.field253[this.field252++] = var8;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(I)V")
    public final void method77(int arg0) {
        if (this.field217 == null) {
            super.field1265 = null;
            this.field456 = null;
            this.field454 = null;
            this.field453 = null;
            this.field455 = null;
            this.field390 = null;
            this.field391 = null;
            this.field392 = null;
            this.field220 = new class11(265, 128, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field221 = new class11(265, 128, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field217 = new class11(171, 509, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field218 = new class11(132, 360, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field219 = new class11(200, 360, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field222 = new class11(238, 202, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field223 = new class11(238, 203, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field224 = new class11(94, 74, this.method119(0), field425);
            class15.method212((byte) 0);
            this.field551 += arg0;
            this.field225 = new class11(94, 75, this.method119(0), field425);
            class15.method212((byte) 0);
            if (this.field604 != null) {
                this.method155((byte) 112);
                this.method194(field135);
            }
            this.field296 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(I)V")
    public final void method78(int arg0) {
        for (int var2 = -1; var2 < this.field153; ++var2) {
            int var6;
            if (var2 == -1) {
                var6 = this.field151;
            } else {
                var6 = this.field154[var2];
            }
            class6 var7 = this.field152[var6];
            if (var7 != null && var7.field949 > 0) {
                --var7.field949;
                if (var7.field949 == 0) {
                    var7.field914 = null;
                }
            }
        }
        if (arg0 == 44732) {
            for (int var3 = 0; var3 < this.field602; ++var3) {
                int var4 = this.field603[var3];
                class1 var5 = this.field601[var4];
                if (var5 != null && var5.field949 > 0) {
                    --var5.field949;
                    if (var5.field949 == 0) {
                        var5.field914 = null;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;)V")
    private final void method79(String arg0) {
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

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(I)V")
    public final void method80(int arg0) {
        if (this.field622 != 0) {
            class4 var2 = this.field207;
            if (arg0 == -8180) {
                int var3 = 0;
                if (this.field520 != 0) {
                    var3 = 1;
                }
                for (int var4 = 0; var4 < 100; ++var4) {
                    if (this.field585[var4] != null) {
                        int var5 = this.field583[var4];
                        String var6 = this.field584[var4];
                        byte var7 = 0;
                        if (var6 != null && var6.startsWith("@cr1@")) {
                            var6 = var6.substring(5);
                            var7 = 1;
                        }
                        if (var6 != null && var6.startsWith("@cr2@")) {
                            var6 = var6.substring(5);
                            var7 = 2;
                        }
                        if ((var5 == 3 || var5 == 7) && (var5 == 7 || this.field276 == 0 || this.field276 == 1 && this.method74(-238, var6))) {
                            int var8 = 329 - var3 * 13;
                            byte var9 = 4;
                            var2.method22((byte) 6, var8, "From", var9, 0);
                            var2.method22((byte) 6, var8 - 1, "From", var9, 65535);
                            int var10 = var9 + var2.method20(0, "From ");
                            if (var7 == 1) {
                                this.field387[0].method38(-23827, var10, var8 - 12);
                                var10 += 14;
                            }
                            if (var7 == 2) {
                                this.field387[1].method38(-23827, var10, var8 - 12);
                                var10 += 14;
                            }
                            var2.method22((byte) 6, var8, var6 + ": " + this.field585[var4], var10, 0);
                            var2.method22((byte) 6, var8 - 1, var6 + ": " + this.field585[var4], var10, 65535);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 5 && this.field276 < 2) {
                            int var11 = 329 - var3 * 13;
                            var2.method22((byte) 6, var11, this.field585[var4], 4, 0);
                            var2.method22((byte) 6, var11 - 1, this.field585[var4], 4, 65535);
                            ++var3;
                            if (var3 >= 5) {
                                return;
                            }
                        }
                        if (var5 == 6 && this.field276 < 2) {
                            int var12 = 329 - var3 * 13;
                            var2.method22((byte) 6, var12, "To " + var6 + ": " + this.field585[var4], 4, 0);
                            var2.method22((byte) 6, var12 - 1, "To " + var6 + ": " + this.field585[var4], 4, 65535);
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;IIILjava/lang/String;I)LIEMHZJLX;")
    public final class23 method81(String arg0, int arg1, int arg2, int arg3, String arg4, int arg5) {
        if (arg1 < 0 || arg1 > 0) {
            this.field418 = null;
        }
        byte[] var7 = null;
        int var8 = 5;
        try {
            if (this.field361[0] != null) {
                var7 = this.field361[0].method488(403, arg5);
            }
        } catch (Exception var30) {
        }
        if (var7 != null) {
            this.field561.reset();
            this.field561.update(var7);
            int var9 = (int) this.field561.getValue();
            if (arg2 != var9) {
                var7 = null;
            }
        }
        if (var7 != null) {
            return new class23((byte) 5, var7);
        } else {
            int var11 = 0;
            while (var7 == null) {
                String var12 = "Unknown error";
                this.method72(-618, arg3, "Requesting " + arg0);
                Object var13 = null;
                try {
                    int var14 = 0;
                    DataInputStream var15 = this.method176(arg4 + arg2);
                    byte[] var16 = new byte[6];
                    var15.readFully(var16, 0, 6);
                    class38 var17 = new class38(0, var16);
                    var17.field1161 = 3;
                    int var18 = var17.method361() + 6;
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
                            this.method72(-618, arg3, "Loading " + arg0 + " - " + var23 + "%");
                        }
                        var14 = var23;
                    }
                    var15.close();
                    try {
                        if (this.field361[0] != null) {
                            this.field361[0].method489(arg5, 192, var7.length, var7);
                        }
                    } catch (Exception var29) {
                        this.field361[0] = null;
                    }
                    if (var7 != null) {
                        this.field561.reset();
                        this.field561.update(var7);
                        int var24 = (int) this.field561.getValue();
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
                            this.method72(-618, arg3, "Game updated - please reload page");
                            var26 = 10;
                        } else {
                            this.method72(-618, arg3, var12 + " - Retrying in " + var26);
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
                    this.field254 = !this.field254;
                }
            }
            return new class23((byte) 5, var7);
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(B)V")
    public final void method82(byte arg0) {
        class8.field624.method588();
        class8.field652.method588();
        class30.field992.method588();
        class3.field34.method588();
        if (this.field507 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        class3.field20.method588();
        class6.field90.method588();
        class34.field1065.method588();
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(JB)V")
    public final void method83(long arg0, byte arg1) {
        if (arg0 != 0L) {
            if (this.field510 >= 100) {
                this.method102(4, "Your ignore list is full. Max of 100 hit", 0, "");
            } else {
                String var4 = class58.method551(class58.method548(arg0, 13452), 0);
                for (int var5 = 0; var5 < this.field510; ++var5) {
                    if (this.field169[var5] == arg0) {
                        this.method102(4, var4 + " is already on your ignore list", 0, "");
                        return;
                    }
                }
                for (int var6 = 0; var6 < this.field130; ++var6) {
                    if (this.field240[var6] == arg0) {
                        this.method102(4, "Please remove " + var4 + " from your friend list first", 0, "");
                        return;
                    }
                }
                this.field169[this.field510++] = arg0;
                if (arg1 != -99) {
                    this.field521 = -147;
                }
                this.field258 = true;
                this.field426.method346(104, true);
                this.field426.method353(arg0, 2);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LXEHNJCHN;Z)V")
    private final void method84(class68 arg0, boolean arg1) {
        int var3 = 0;
        int var4 = -1;
        int var5 = 0;
        int var6 = 0;
        if (arg0.field1706 == 0) {
            var3 = this.field451.method278(arg0.field1705, arg0.field1707, arg0.field1708);
        }
        if (arg0.field1706 == 1) {
            var3 = this.field451.method279(arg0.field1707, 0, arg0.field1708, arg0.field1705);
        }
        if (arg0.field1706 == 2) {
            var3 = this.field451.method280(arg0.field1705, arg0.field1707, arg0.field1708);
        }
        if (arg0.field1706 == 3) {
            var3 = this.field451.method281(arg0.field1705, arg0.field1707, arg0.field1708);
        }
        if (var3 != 0) {
            int var7 = this.field451.method282(arg0.field1705, arg0.field1707, arg0.field1708, var3);
            var4 = var3 >> 14 & 32767;
            var5 = var7 & 31;
            var6 = var7 >> 6;
        }
        arg0.field1697 = var4;
        arg0.field1699 = var5;
        arg0.field1698 = var6;
        if (arg1) {
            field354 = !field354;
        }
    }

    @OriginalMember(owner = "client!client", name = "getParameter", descriptor = "(Ljava/lang/String;)Ljava/lang/String;")
    public final String getParameter(String arg0) {
        return signlink.mainapp != null ? signlink.mainapp.getParameter(arg0) : super.getParameter(arg0);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMYGSUHVG;I)V")
    public final void method85(class39 arg0, int arg1) {
        if (arg1 >= 0) {
            this.field552 = -1;
        }
        int var3 = arg0.field1232;
        if ((var3 < 1 || var3 > 100) && (var3 < 701 || var3 > 800)) {
            if (var3 >= 101 && var3 <= 200 || var3 >= 801 && var3 <= 900) {
                int var5 = this.field130;
                if (this.field131 != 2) {
                    var5 = 0;
                }
                if (var3 > 800) {
                    var3 -= 701;
                } else {
                    var3 -= 101;
                }
                if (var3 >= var5) {
                    arg0.field1224 = "";
                    arg0.field1215 = 0;
                } else {
                    if (this.field162[var3] == 0) {
                        arg0.field1224 = "@red@Offline";
                    } else if (this.field162[var3] < 200) {
                        if (this.field162[var3] == field376) {
                            arg0.field1224 = "@gre@World" + (this.field162[var3] - 9);
                        } else {
                            arg0.field1224 = "@yel@World" + (this.field162[var3] - 9);
                        }
                    } else if (this.field162[var3] == field376) {
                        arg0.field1224 = "@gre@Classic" + (this.field162[var3] - 219);
                    } else {
                        arg0.field1224 = "@yel@Classic" + (this.field162[var3] - 219);
                    }
                    arg0.field1215 = 1;
                }
            } else if (var3 == 203) {
                int var6 = this.field130;
                if (this.field131 != 2) {
                    var6 = 0;
                }
                arg0.field1233 = var6 * 15 + 20;
                if (arg0.field1233 <= arg0.field1183) {
                    arg0.field1233 = arg0.field1183 + 1;
                }
            } else if (var3 >= 401 && var3 <= 500) {
                var3 -= 401;
                if (var3 == 0 && this.field131 == 0) {
                    arg0.field1224 = "Loading ignore list";
                    arg0.field1215 = 0;
                } else if (var3 == 1 && this.field131 == 0) {
                    arg0.field1224 = "Please wait...";
                    arg0.field1215 = 0;
                } else {
                    int var7 = this.field510;
                    if (this.field131 == 0) {
                        var7 = 0;
                    }
                    if (var3 >= var7) {
                        arg0.field1224 = "";
                        arg0.field1215 = 0;
                    } else {
                        arg0.field1224 = class58.method551(class58.method548(this.field169[var3], 13452), 0);
                        arg0.field1215 = 1;
                    }
                }
            } else if (var3 == 503) {
                arg0.field1233 = this.field510 * 15 + 20;
                if (arg0.field1233 <= arg0.field1183) {
                    arg0.field1233 = arg0.field1183 + 1;
                }
            } else if (var3 == 327) {
                arg0.field1203 = 150;
                arg0.field1204 = (int) (Math.sin((double) field502 / 40.0D) * 256.0D) & 2047;
                if (this.field527) {
                    for (int var8 = 0; var8 < 7; ++var8) {
                        int var15 = this.field576[var8];
                        if (var15 >= 0 && !class33.field1044[var15].method337(0)) {
                            return;
                        }
                    }
                    this.field527 = false;
                    class42[] var9 = new class42[7];
                    int var10 = 0;
                    for (int var11 = 0; var11 < 7; ++var11) {
                        int var14 = this.field576[var11];
                        if (var14 >= 0) {
                            var9[var10++] = class33.field1044[var14].method338(true);
                        }
                    }
                    class42 var12 = new class42(var9, var10, 0);
                    for (int var13 = 0; var13 < 5; ++var13) {
                        if (this.field345[var13] != 0) {
                            var12.method428(field514[var13][0], field514[var13][this.field345[var13]]);
                            if (var13 == 1) {
                                var12.method428(field489[0], field489[this.field345[var13]]);
                            }
                        }
                    }
                    var12.method421(0);
                    var12.method422(0, class28.field952[field519.field942].field954[0]);
                    var12.method431(64, 850, -30, -50, -30, true);
                    arg0.field1196 = 5;
                    arg0.field1197 = 0;
                    class39.method394(0, var12, -259, 5);
                }
            } else if (var3 == 324) {
                if (this.field596 == null) {
                    this.field596 = arg0.field1208;
                    this.field597 = arg0.field1195;
                }
                if (this.field412) {
                    arg0.field1208 = this.field597;
                } else {
                    arg0.field1208 = this.field596;
                }
            } else if (var3 == 325) {
                if (this.field596 == null) {
                    this.field596 = arg0.field1208;
                    this.field597 = arg0.field1195;
                }
                if (this.field412) {
                    arg0.field1208 = this.field596;
                } else {
                    arg0.field1208 = this.field597;
                }
            } else if (var3 == 600) {
                arg0.field1224 = this.field595;
                if (field502 % 20 < 10) {
                    arg0.field1224 = arg0.field1224 + "|";
                } else {
                    arg0.field1224 = arg0.field1224 + " ";
                }
            } else {
                if (var3 == 620) {
                    if (this.field433 >= 1) {
                        if (this.field563) {
                            arg0.field1212 = 16711680;
                            arg0.field1224 = "Moderator option: Mute player for 48 hours: <ON>";
                        } else {
                            arg0.field1212 = 16777215;
                            arg0.field1224 = "Moderator option: Mute player for 48 hours: <OFF>";
                        }
                    } else {
                        arg0.field1224 = "";
                    }
                }
                if (var3 == 660) {
                    int var16 = this.field353 - this.field260;
                    String var17;
                    if (var16 <= 0) {
                        var17 = "earlier today";
                    } else if (var16 == 1) {
                        var17 = "yesterday";
                    } else {
                        var17 = var16 + " days ago";
                    }
                    arg0.field1224 = "You last logged in @red@" + var17 + "@bla@ from: @red@" + signlink.dns;
                }
                if (var3 == 661) {
                    if (this.field466 == 0) {
                        arg0.field1224 = "\\nYou have not yet set any recovery questions.\\nIt is @lre@strongly@yel@ recommended that you do so.\\n\\nIf you don't you will be @lre@unable to recover your\\n@lre@password@yel@ if you forget it, or it is stolen.";
                    } else if (this.field466 <= this.field353) {
                        arg0.field1224 = "\\n\\nRecovery Questions Last Set:\\n@gre@" + this.method86(true, this.field466);
                    } else {
                        int var18 = this.field353 + 14 - this.field466;
                        String var19;
                        if (var18 <= 0) {
                            var19 = "Earlier today";
                        } else if (var18 == 1) {
                            var19 = "Yesterday";
                        } else {
                            var19 = var18 + " days ago";
                        }
                        arg0.field1224 = var19 + " you requested@lre@ new recovery\\n@lre@questions.@yel@ The requested change will occur\\non: @lre@" + this.method86(true, this.field466) + "\\n\\nIf you do not remember making this request\\ncancel it immediately, and change your password.";
                    }
                }
                if (var3 == 662) {
                    String var20;
                    if (this.field127 == 0) {
                        var20 = "@yel@0 unread messages";
                    } else if (this.field127 == 1) {
                        var20 = "@gre@1 unread message";
                    } else {
                        var20 = "@gre@" + this.field127 + " unread messages";
                    }
                    arg0.field1224 = "You have " + var20 + "\\nin your message centre.";
                }
                if (var3 == 663) {
                    if (this.field435 > 0 && this.field435 <= this.field353 + 10) {
                        arg0.field1224 = "Last password change:\\n@gre@" + this.method86(true, this.field435);
                    } else {
                        arg0.field1224 = "Last password change:\\n@gre@Never changed";
                    }
                }
                if (var3 == 665) {
                    if (this.field413 > 2 && !field378) {
                        arg0.field1224 = "This is a non-members\\nworld. To enjoy your\\nmembers benefits we\\nrecommend you play on a\\nmembers world instead.";
                    } else if (this.field413 > 2) {
                        arg0.field1224 = "\\n\\nYou have @gre@" + this.field413 + "@yel@ days of\\nmember credit remaining.";
                    } else if (this.field413 > 0) {
                        arg0.field1224 = "You have @gre@" + this.field413 + "@yel@ days of\\nmember credit remaining.\\n\\n@lre@Credit low! Renew now\\n@lre@to avoid losing members.";
                    } else {
                        arg0.field1224 = "You are not a member.\\n\\nChoose to subscribe and\\nyou'll get loads of extra\\nbenefits and features.";
                    }
                }
                if (var3 == 667) {
                    if (this.field413 > 2 && !field378) {
                        arg0.field1224 = "To switch to a members-only world:\\n1) Logout and return to the world selection page.\\n2) Choose one of the members world with a gold star next to it's name.\\n\\nIf you prefer you can continue to use this world,\\nbut members only features will be unavailable here.";
                    } else if (this.field413 > 0) {
                        arg0.field1224 = "To extend or cancel a subscription:\\n1) Logout and return to the frontpage of this website.\\n2)Choose the relevant option from the 'membership' section.\\n\\nNote: If you are a credit card subscriber a top-up payment will\\nautomatically be taken when 3 days credit remain.\\n(unless you cancel your subscription, which can be done at any time.)";
                    } else {
                        arg0.field1224 = "To start a subscripton:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Start a new subscription'";
                    }
                }
                if (var3 == 668) {
                    if (this.field466 > this.field353) {
                        arg0.field1224 = "To cancel this request:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Cancel recovery questions'.";
                    } else {
                        arg0.field1224 = "To change your recovery questions:\\n1) Logout and return to the frontpage of this website.\\n2) Choose 'Set new recovery questions'.";
                    }
                }
            }
        } else if (var3 == 1 && this.field131 == 0) {
            arg0.field1224 = "Loading friend list";
            arg0.field1215 = 0;
        } else if (var3 == 1 && this.field131 == 1) {
            arg0.field1224 = "Connecting to friendserver";
            arg0.field1215 = 0;
        } else if (var3 == 2 && this.field131 != 2) {
            arg0.field1224 = "Please wait...";
            arg0.field1215 = 0;
        } else {
            int var4 = this.field130;
            if (this.field131 != 2) {
                var4 = 0;
            }
            if (var3 > 700) {
                var3 -= 601;
            } else {
                --var3;
            }
            if (var3 >= var4) {
                arg0.field1224 = "";
                arg0.field1215 = 0;
            } else {
                arg0.field1224 = this.field580[var3];
                arg0.field1215 = 1;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZI)Ljava/lang/String;")
    public final String method86(boolean arg0, int arg1) {
        if (arg1 > this.field353 + 10) {
            return "Unknown";
        } else {
            long var3 = ((long) arg1 + 11745L) * 86400000L;
            Calendar var5 = Calendar.getInstance();
            var5.setTime(new Date(var3));
            this.field210 &= arg0;
            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            String[] var9 = new String[] { "Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec" };
            return var6 + "-" + var9[var7] + "-" + var8;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IB)V")
    public final void method87(int arg0, byte arg1) {
        int[] var3 = this.field374.field789;
        int var4 = var3.length;
        for (int var5 = 0; var5 < var4; ++var5) {
            var3[var5] = 0;
        }
        for (int var6 = 1; var6 < 103; ++var6) {
            int var23 = (103 - var6) * 512 * 4 + 24628;
            for (int var24 = 1; var24 < 103; ++var24) {
                if ((this.field249[arg0][var24][var6] & 24) == 0) {
                    this.field451.method287(var3, var23, 512, arg0, var24, var6);
                }
                if (arg0 < 3 && (this.field249[arg0 + 1][var24][var6] & 8) != 0) {
                    this.field451.method287(var3, var23, 512, arg0 + 1, var24, var6);
                }
                var23 += 4;
            }
        }
        int var7 = (238 + (int) (Math.random() * 20.0D) - 10 << 16) + (238 + (int) (Math.random() * 20.0D) - 10 << 8) + (238 + (int) (Math.random() * 20.0D) - 10);
        int var8 = 238 + (int) (Math.random() * 20.0D) - 10 << 16;
        this.field374.method228((byte) 59);
        for (int var9 = 1; var9 < 103; ++var9) {
            for (int var22 = 1; var22 < 103; ++var22) {
                if ((this.field249[arg0][var22][var9] & 24) == 0) {
                    this.method179(-871, var8, var9, arg0, var22, var7);
                }
                if (arg0 < 3 && (this.field249[arg0 + 1][var22][var9] & 8) != 0) {
                    this.method179(-871, var8, var9, arg0 + 1, var22, var7);
                }
            }
        }
        if (this.field455 != null) {
            this.field455.method206((byte) 59);
            class59.field1613 = this.field517;
        }
        this.field310 = 0;
        if (arg1 == -114) {
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var11 = 0; var11 < 104; ++var11) {
                    int var12 = this.field451.method281(this.field452, var10, var11);
                    if (var12 != 0) {
                        int var13 = var12 >> 14 & 32767;
                        int var14 = class8.method203(var13).field645;
                        if (var14 >= 0) {
                            int var15 = var10;
                            int var16 = var11;
                            if (var14 != 22 && var14 != 29 && var14 != 34 && var14 != 36 && var14 != 46 && var14 != 47 && var14 != 48) {
                                byte var17 = 104;
                                byte var18 = 104;
                                int[][] var19 = this.field314[this.field452].field1024;
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
                            this.field448[this.field310] = this.field173[var14];
                            this.field311[this.field310] = var15;
                            this.field312[this.field310] = var16;
                            ++this.field310;
                        }
                    }
                }
            }
            ++field572;
            if (field572 > 88) {
                field572 = 0;
                this.field426.method346(45, true);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(Z)V")
    public final void method88(boolean arg0) {
        this.field456.method206((byte) 59);
        class59.field1613 = this.field515;
        this.field488.method38(-23827, 0, 0);
        if (this.field273) {
            this.field208.method18(0, this.field342, 40, 239, 0);
            this.field208.method18(128, this.field241 + "*", 60, 239, 0);
        } else if (this.field533 == 1) {
            this.field208.method18(0, "Enter amount:", 40, 239, 0);
            this.field208.method18(128, this.field334 + "*", 60, 239, 0);
        } else if (this.field533 == 2) {
            this.field208.method18(0, "Enter name:", 40, 239, 0);
            this.field208.method18(128, this.field334 + "*", 60, 239, 0);
        } else if (this.field533 == 3) {
            if (this.field334 != this.field268) {
                this.method170(-884, this.field334);
                this.field268 = this.field334;
            }
            class4 var2 = this.field207;
            class15.method211(0, 0, 77, 463, -39271);
            for (int var3 = 0; var3 < this.field269; ++var3) {
                int var4 = var3 * 14 + 18 - this.field272;
                if (var4 > 0 && var4 < 110) {
                    var2.method18(0, this.field270[var3], var4, 239, 0);
                }
            }
            class15.method210(9);
            if (this.field269 > 5) {
                this.method182(this.field272, 463, 77, 0, -408, this.field269 * 14 + 7);
            }
            if (this.field334.length() == 0) {
                this.field208.method18(255, "Enter object name", 40, 239, 0);
            } else if (this.field269 == 0) {
                this.field208.method18(0, "No matching objects found, please shorten search", 40, 239, 0);
            }
            var2.method18(0, this.field334 + "*", 90, 239, 0);
            class15.method217(0, 77, -368, 0, 479);
        } else if (this.field292 != null) {
            this.field208.method18(0, this.field292, 40, 239, 0);
            this.field208.method18(128, "Click to continue", 60, 239, 0);
        } else if (this.field621 != -1) {
            this.method124(class39.method402(this.field621), 0, 0, 878, 0);
        } else if (this.field578 != -1) {
            this.method124(class39.method402(this.field578), 0, 0, 878, 0);
        } else {
            class4 var5 = this.field207;
            int var6 = 0;
            class15.method211(0, 0, 77, 463, -39271);
            for (int var7 = 0; var7 < 100; ++var7) {
                if (this.field585[var7] != null) {
                    int var9 = this.field583[var7];
                    int var10 = 70 - var6 * 14 + this.field331;
                    String var11 = this.field584[var7];
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
                            var5.method22((byte) 6, var10, this.field585[var7], 4, 0);
                        }
                        ++var6;
                    }
                    if ((var9 == 1 || var9 == 2) && (var9 == 1 || this.field325 == 0 || this.field325 == 1 && this.method74(-238, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            int var13 = 4;
                            if (var12 == 1) {
                                this.field387[0].method38(-23827, var13, var10 - 12);
                                var13 += 14;
                            }
                            if (var12 == 2) {
                                this.field387[1].method38(-23827, var13, var10 - 12);
                                var13 += 14;
                            }
                            var5.method22((byte) 6, var10, var11 + ":", var13, 0);
                            int var14 = var13 + var5.method20(0, var11) + 8;
                            var5.method22((byte) 6, var10, this.field585[var7], var14, 255);
                        }
                        ++var6;
                    }
                    if ((var9 == 3 || var9 == 7) && this.field622 == 0 && (var9 == 7 || this.field276 == 0 || this.field276 == 1 && this.method74(-238, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            byte var15 = 4;
                            var5.method22((byte) 6, var10, "From", var15, 0);
                            int var16 = var15 + var5.method20(0, "From ");
                            if (var12 == 1) {
                                this.field387[0].method38(-23827, var16, var10 - 12);
                                var16 += 14;
                            }
                            if (var12 == 2) {
                                this.field387[1].method38(-23827, var16, var10 - 12);
                                var16 += 14;
                            }
                            var5.method22((byte) 6, var10, var11 + ":", var16, 0);
                            int var17 = var16 + var5.method20(0, var11) + 8;
                            var5.method22((byte) 6, var10, this.field585[var7], var17, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 4 && (this.field368 == 0 || this.field368 == 1 && this.method74(-238, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method22((byte) 6, var10, var11 + " " + this.field585[var7], 4, 8388736);
                        }
                        ++var6;
                    }
                    if (var9 == 5 && this.field622 == 0 && this.field276 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method22((byte) 6, var10, this.field585[var7], 4, 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 6 && this.field622 == 0 && this.field276 < 2) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method22((byte) 6, var10, "To " + var11 + ":", 4, 0);
                            var5.method22((byte) 6, var10, this.field585[var7], 12 + var5.method20(0, "To " + var11), 8388608);
                        }
                        ++var6;
                    }
                    if (var9 == 8 && (this.field368 == 0 || this.field368 == 1 && this.method74(-238, var11))) {
                        if (var10 > 0 && var10 < 110) {
                            var5.method22((byte) 6, var10, var11 + " " + this.field585[var7], 4, 8270336);
                        }
                        ++var6;
                    }
                }
            }
            class15.method210(9);
            this.field339 = var6 * 14 + 7;
            if (this.field339 < 78) {
                this.field339 = 78;
            }
            this.method182(this.field339 - this.field331 - 77, 463, 77, 0, -408, this.field339);
            String var8;
            if (field519 != null && field519.field93 != null) {
                var8 = field519.field93;
            } else {
                var8 = class58.method551(this.field483, 0);
            }
            var5.method22((byte) 6, 90, var8 + ":", 4, 0);
            var5.method22((byte) 6, 90, this.field581 + "*", 6 + var5.method20(0, var8 + ": "), 255);
            class15.method217(0, 77, -368, 0, 479);
        }
        if (this.field315 && this.field544 == 2) {
            this.method69(-705);
        }
        this.field456.method207(super.field1264, (byte) 19, 357, 17);
        this.field455.method206((byte) 59);
        class59.field1613 = this.field517;
        if (arg0) {
            this.field496 = !this.field496;
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(II)V")
    public final void method89(int arg0, int arg1) {
        while (arg1 >= 0) {
            this.method147();
        }
        int var3 = class51.field1440[arg0].field1448;
        if (var3 != 0) {
            int var4 = this.field528[arg0];
            if (var3 == 1) {
                if (var4 == 1) {
                    class59.method562(0.9D, (byte) 8);
                }
                if (var4 == 2) {
                    class59.method562(0.8D, (byte) 8);
                }
                if (var4 == 3) {
                    class59.method562(0.7D, (byte) 8);
                }
                if (var4 == 4) {
                    class59.method562(0.6D, (byte) 8);
                }
                class3.field20.method588();
                this.field296 = true;
            }
            if (var3 == 3) {
                boolean var5 = this.field493;
                if (var4 == 0) {
                    this.method106(0, this.field493, this.field263);
                    this.field493 = true;
                }
                if (var4 == 1) {
                    this.method106(-400, this.field493, this.field263);
                    this.field493 = true;
                }
                if (var4 == 2) {
                    this.method106(-800, this.field493, this.field263);
                    this.field493 = true;
                }
                if (var4 == 3) {
                    this.method106(-1200, this.field493, this.field263);
                    this.field493 = true;
                }
                if (var4 == 4) {
                    this.field493 = false;
                }
                if (this.field493 != var5 && !field379) {
                    if (this.field493) {
                        this.field508 = this.field350;
                        this.field509 = true;
                        this.field437.method516(2, this.field508);
                    } else {
                        this.method157(false);
                    }
                    this.field423 = 0;
                }
            }
            if (var3 == 4) {
                if (var4 == 0) {
                    this.field205 = true;
                    this.method134(0, false);
                }
                if (var4 == 1) {
                    this.field205 = true;
                    this.method134(-400, false);
                }
                if (var4 == 2) {
                    this.field205 = true;
                    this.method134(-800, false);
                }
                if (var4 == 3) {
                    this.field205 = true;
                    this.method134(-1200, false);
                }
                if (var4 == 4) {
                    this.field205 = false;
                }
            }
            if (var3 == 5) {
                this.field610 = var4;
            }
            if (var3 == 6) {
                this.field400 = var4;
            }
            if (var3 == 8) {
                this.field622 = var4;
                this.field308 = true;
            }
            if (var3 == 9) {
                this.field294 = var4;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(I)V")
    public final void method90(int arg0) {
        if (arg0 != 15260) {
            this.field552 = this.field251.method357();
        }
        try {
            int var2 = field519.field938 + this.field147;
            int var3 = field519.field939 + this.field445;
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
            if (super.field1282[1] == 1) {
                this.field430 += (-24 - this.field430) / 2;
            } else if (super.field1282[2] == 1) {
                this.field430 += (24 - this.field430) / 2;
            } else {
                this.field430 /= 2;
            }
            if (super.field1282[3] == 1) {
                this.field431 += (12 - this.field431) / 2;
            } else if (super.field1282[4] == 1) {
                this.field431 += (-12 - this.field431) / 2;
            } else {
                this.field431 /= 2;
            }
            this.field429 = this.field430 / 2 + this.field429 & 2047;
            this.field428 += this.field431 / 2;
            if (this.field428 < 128) {
                this.field428 = 128;
            }
            if (this.field428 > 383) {
                this.field428 = 383;
            }
            int var4 = this.field235 >> 7;
            int var5 = this.field236 >> 7;
            int var6 = this.method68(0, this.field236, this.field235, this.field452);
            int var7 = 0;
            if (var4 > 3 && var5 > 3 && var4 < 100 && var5 < 100) {
                for (int var8 = var4 - 4; var8 <= var4 + 4; ++var8) {
                    for (int var9 = var5 - 4; var9 <= var5 + 4; ++var9) {
                        int var10 = this.field452;
                        if (var10 < 3 && (this.field249[1][var8][var9] & 2) == 2) {
                            ++var10;
                        }
                        int var11 = var6 - this.field599[var10][var8][var9];
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
            if (var12 > this.field586) {
                this.field586 += (var12 - this.field586) / 24;
            } else if (var12 < this.field586) {
                this.field586 += (var12 - this.field586) / 80;
            }
        } catch (Exception var13) {
            signlink.reporterror("glfc_ex " + field519.field938 + "," + field519.field939 + "," + this.field235 + "," + this.field236 + "," + this.field443 + "," + this.field444 + "," + this.field280 + "," + this.field281);
            throw new RuntimeException("eek");
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BILMVHXDWGI;)V")
    private final void method91(byte arg0, int arg1, class38 arg2) {
        for (int var4 = 0; var4 < this.field155; ++var4) {
            int var6 = this.field156[var4];
            class6 var7 = this.field152[var6];
            int var8 = arg2.method357();
            if ((var8 & 2) != 0) {
                var8 += arg2.method357() << 8;
            }
            this.method192(var8, -826, var6, var7, arg2);
        }
        if (this.field593 == arg0) {
            boolean var5 = false;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BIIILLQFHJGYA;)V")
    public final void method92(byte arg0, int arg1, int arg2, int arg3, class30 arg4) {
        if (this.field261 < 400) {
            if (arg4.field988 != null) {
                arg4 = arg4.method316(true);
            }
            if (arg4 != null) {
                if (arg4.field977) {
                    String var6 = arg4.field973;
                    if (this.field587 != arg0) {
                        field135 = this.field203.method483();
                    }
                    if (arg4.field981 != 0) {
                        var6 = var6 + method156(this.field496, arg4.field981, field519.field109) + " (level-" + arg4.field981 + ")";
                    }
                    if (this.field230 == 1) {
                        this.field419[this.field261] = "Use " + this.field234 + " with @yel@" + var6;
                        this.field464[this.field261] = 416;
                        this.field465[this.field261] = arg2;
                        this.field462[this.field261] = arg1;
                        this.field463[this.field261] = arg3;
                        ++this.field261;
                    } else {
                        if (this.field402 == 1) {
                            if ((this.field404 & 2) == 2) {
                                this.field419[this.field261] = this.field405 + " @yel@" + var6;
                                this.field464[this.field261] = 372;
                                this.field465[this.field261] = arg2;
                                this.field462[this.field261] = arg1;
                                this.field463[this.field261] = arg3;
                                ++this.field261;
                                return;
                            }
                        } else {
                            if (arg4.field991 != null) {
                                for (int var7 = 4; var7 >= 0; --var7) {
                                    if (arg4.field991[var7] != null && !arg4.field991[var7].equalsIgnoreCase("attack")) {
                                        this.field419[this.field261] = arg4.field991[var7] + " @yel@" + var6;
                                        if (var7 == 0) {
                                            this.field464[this.field261] = 950;
                                        }
                                        if (var7 == 1) {
                                            this.field464[this.field261] = 956;
                                        }
                                        if (var7 == 2) {
                                            this.field464[this.field261] = 912;
                                        }
                                        if (var7 == 3) {
                                            this.field464[this.field261] = 804;
                                        }
                                        if (var7 == 4) {
                                            this.field464[this.field261] = 157;
                                        }
                                        this.field465[this.field261] = arg2;
                                        this.field462[this.field261] = arg1;
                                        this.field463[this.field261] = arg3;
                                        ++this.field261;
                                    }
                                }
                            }
                            if (arg4.field991 != null) {
                                for (int var8 = 4; var8 >= 0; --var8) {
                                    if (arg4.field991[var8] != null && arg4.field991[var8].equalsIgnoreCase("attack")) {
                                        short var9 = 0;
                                        if (arg4.field981 > field519.field109) {
                                            var9 = 2000;
                                        }
                                        this.field419[this.field261] = arg4.field991[var8] + " @yel@" + var6;
                                        if (var8 == 0) {
                                            this.field464[this.field261] = var9 + 950;
                                        }
                                        if (var8 == 1) {
                                            this.field464[this.field261] = var9 + 956;
                                        }
                                        if (var8 == 2) {
                                            this.field464[this.field261] = var9 + 912;
                                        }
                                        if (var8 == 3) {
                                            this.field464[this.field261] = var9 + 804;
                                        }
                                        if (var8 == 4) {
                                            this.field464[this.field261] = var9 + 157;
                                        }
                                        this.field465[this.field261] = arg2;
                                        this.field462[this.field261] = arg1;
                                        this.field463[this.field261] = arg3;
                                        ++this.field261;
                                    }
                                }
                            }
                            this.field419[this.field261] = "Examine @yel@" + var6;
                            this.field464[this.field261] = 1581;
                            this.field465[this.field261] = arg2;
                            this.field462[this.field261] = arg1;
                            this.field463[this.field261] = arg3;
                            ++this.field261;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(II)V")
    public final void method93(int arg0, int arg1) {
        if (arg0 >= 0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        if (!field379) {
            for (int var4 = 0; var4 < this.field618.length; ++var4) {
                int var5 = this.field618[var4];
                if (class59.field1621[var5] >= arg1) {
                    class5 var6 = class59.field1615[var5];
                    int var7 = var6.field83 * var6.field82 - 1;
                    int var8 = this.field590 * var6.field82 * 2;
                    byte[] var9 = var6.field80;
                    byte[] var10 = this.field513;
                    for (int var11 = 0; var11 <= var7; ++var11) {
                        var10[var11] = var9[var11 - var8 & var7];
                    }
                    var6.field80 = var10;
                    this.field513 = var9;
                    class59.method560(false, var5);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(I)V")
    public final void method94(int arg0) {
        if (arg0 >= 0) {
            this.method147();
        }
        if (super.field1278 == 1) {
            if (super.field1279 >= 6 && super.field1279 <= 106 && super.field1280 >= 467 && super.field1280 <= 499) {
                this.field325 = (this.field325 + 1) % 4;
                this.field498 = true;
                this.field308 = true;
                this.field426.method346(227, true);
                this.field426.method347(this.field325);
                this.field426.method347(this.field276);
                this.field426.method347(this.field368);
            }
            if (super.field1279 >= 135 && super.field1279 <= 235 && super.field1280 >= 467 && super.field1280 <= 499) {
                this.field276 = (this.field276 + 1) % 3;
                this.field498 = true;
                this.field308 = true;
                this.field426.method346(227, true);
                this.field426.method347(this.field325);
                this.field426.method347(this.field276);
                this.field426.method347(this.field368);
            }
            if (super.field1279 >= 273 && super.field1279 <= 373 && super.field1280 >= 467 && super.field1280 <= 499) {
                this.field368 = (this.field368 + 1) % 3;
                this.field498 = true;
                this.field308 = true;
                this.field426.method346(227, true);
                this.field426.method347(this.field325);
                this.field426.method347(this.field276);
                this.field426.method347(this.field368);
            }
            if (super.field1279 >= 412 && super.field1279 <= 512 && super.field1280 >= 467 && super.field1280 <= 499) {
                if (this.field348 == -1) {
                    this.method101(false);
                    this.field595 = "";
                    this.field563 = false;
                    this.field380 = this.field348 = class39.field1184;
                    return;
                }
                this.method102(4, "Please close the interface you have open before using 'report abuse'", 0, "");
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "getCodeBase", descriptor = "()Ljava/net/URL;")
    public final URL getCodeBase() {
        if (signlink.mainapp != null) {
            return signlink.mainapp.getCodeBase();
        } else {
            try {
                if (super.field1267 != null) {
                    return new URL("http://127.0.0.1:" + (field377 + 80));
                }
            } catch (Exception var1) {
            }
            return super.getCodeBase();
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILMVHXDWGI;I)V")
    public final void method95(int arg0, class38 arg1, int arg2) {
        if (arg2 < 0) {
            if (arg0 == 143) {
                int var4 = arg1.method357();
                int var5 = (var4 >> 4 & 7) + this.field605;
                int var6 = (var4 & 7) + this.field606;
                int var7 = arg1.method359();
                int var8 = arg1.method357();
                int var9 = var8 >> 4 & 15;
                int var10 = var8 & 7;
                if (field519.field944[0] >= var5 - var9 && field519.field944[0] <= var5 + var9 && field519.field945[0] >= var6 - var9 && field519.field945[0] <= var6 + var9 && this.field205 && !field379 && this.field329 < 50) {
                    this.field346[this.field329] = var7;
                    this.field388[this.field329] = var10;
                    this.field371[this.field329] = class64.field1675[var7];
                    ++this.field329;
                }
            }
            if (arg0 == 137) {
                int var11 = arg1.method385(-20383);
                int var12 = arg1.method357();
                int var13 = var12 >> 2;
                int var14 = var12 & 3;
                int var15 = this.field469[var13];
                byte var16 = arg1.method378(true);
                byte var17 = arg1.method379((byte) 5);
                int var18 = arg1.method385(-20383);
                byte var19 = arg1.method379((byte) 5);
                byte var20 = arg1.method378(true);
                int var21 = arg1.method383(false);
                int var22 = arg1.method385(-20383);
                int var23 = arg1.method357();
                int var24 = (var23 >> 4 & 7) + this.field605;
                int var25 = (var23 & 7) + this.field606;
                class6 var26;
                if (this.field447 == var22) {
                    var26 = field519;
                } else {
                    var26 = this.field152[var22];
                }
                if (var26 != null) {
                    class8 var27 = class8.method203(var18);
                    int var28 = this.field599[this.field452][var24][var25];
                    int var29 = this.field599[this.field452][var24 + 1][var25];
                    int var30 = this.field599[this.field452][var24 + 1][var25 + 1];
                    int var31 = this.field599[this.field452][var24][var25 + 1];
                    class42 var32 = var27.method205(var13, var14, var28, var29, var30, var31, -1);
                    if (var32 != null) {
                        this.method138(-1, var25, var21 + 1, -33233, var15, 0, var11 + 1, this.field452, var24, 0);
                        var26.field106 = field502 + var21;
                        var26.field107 = field502 + var11;
                        var26.field105 = var32;
                        int var33 = var27.field629;
                        int var34 = var27.field671;
                        if (var14 == 1 || var14 == 3) {
                            var33 = var27.field671;
                            var34 = var27.field629;
                        }
                        var26.field102 = var24 * 128 + var33 * 64;
                        var26.field104 = var25 * 128 + var34 * 64;
                        var26.field103 = this.method68(0, var26.field104, var26.field102, this.field452);
                        if (var20 > var17) {
                            byte var35 = var20;
                            var20 = var17;
                            var17 = var35;
                        }
                        if (var19 > var16) {
                            byte var36 = var19;
                            var19 = var16;
                            var16 = var36;
                        }
                        var26.field112 = var20 + var24;
                        var26.field114 = var17 + var24;
                        var26.field113 = var19 + var25;
                        var26.field115 = var16 + var25;
                    }
                }
            }
            if (arg0 == 101) {
                int var37 = arg1.method383(false);
                int var38 = arg1.method375(964);
                int var39 = (var38 >> 4 & 7) + this.field605;
                int var40 = (var38 & 7) + this.field606;
                int var41 = arg1.method383(false);
                if (var39 >= 0 && var40 >= 0 && var39 < 104 && var40 < 104) {
                    class16 var42 = new class16();
                    var42.field735 = var37;
                    var42.field734 = var41;
                    if (this.field418[this.field452][var39][var40] == null) {
                        this.field418[this.field452][var39][var40] = new class24(field559);
                    }
                    this.field418[this.field452][var39][var40].method243(var42);
                    this.method160(var39, var40);
                }
            } else if (arg0 == 247) {
                int var43 = arg1.method383(false);
                int var44 = arg1.method376(false);
                int var45 = (var44 >> 4 & 7) + this.field605;
                int var46 = (var44 & 7) + this.field606;
                int var47 = arg1.method383(false);
                int var48 = arg1.method383(false);
                if (var45 >= 0 && var46 >= 0 && var45 < 104 && var46 < 104 && this.field447 != var48) {
                    class16 var49 = new class16();
                    var49.field735 = var47;
                    var49.field734 = var43;
                    if (this.field418[this.field452][var45][var46] == null) {
                        this.field418[this.field452][var45][var46] = new class24(field559);
                    }
                    this.field418[this.field452][var45][var46].method243(var49);
                    this.method160(var45, var46);
                }
            } else if (arg0 == 243) {
                int var50 = arg1.method376(false);
                int var51 = (var50 >> 4 & 7) + this.field605;
                int var52 = (var50 & 7) + this.field606;
                int var53 = arg1.method359();
                int var54 = arg1.method357();
                int var55 = var54 >> 2;
                int var56 = var54 & 3;
                int var57 = this.field469[var55];
                if (var51 >= 0 && var52 >= 0 && var51 < 104 && var52 < 104) {
                    this.method138(var53, var52, 0, -33233, var57, var55, -1, this.field452, var51, var56);
                }
            } else if (arg0 == 23) {
                int var58 = arg1.method357();
                int var59 = (var58 >> 4 & 7) + this.field605;
                int var60 = (var58 & 7) + this.field606;
                int var61 = arg1.method376(false);
                int var62 = var61 >> 2;
                int var63 = var61 & 3;
                int var64 = this.field469[var62];
                if (var59 >= 0 && var60 >= 0 && var59 < 104 && var60 < 104) {
                    this.method138(-1, var60, 0, -33233, var64, var62, -1, this.field452, var59, var63);
                }
            } else if (arg0 == 94) {
                int var65 = arg1.method375(964);
                int var66 = (var65 >> 4 & 7) + this.field605;
                int var67 = (var65 & 7) + this.field606;
                int var68 = arg1.method377((byte) -114);
                int var69 = var68 >> 2;
                int var70 = var68 & 3;
                int var71 = this.field469[var69];
                int var72 = arg1.method359();
                if (var66 >= 0 && var67 >= 0 && var66 < 103 && var67 < 103) {
                    int var73 = this.field599[this.field452][var66][var67];
                    int var74 = this.field599[this.field452][var66 + 1][var67];
                    int var75 = this.field599[this.field452][var66 + 1][var67 + 1];
                    int var76 = this.field599[this.field452][var66][var67 + 1];
                    if (var71 == 0) {
                        class12 var77 = this.field451.method274(0, var67, var66, this.field452);
                        if (var77 != null) {
                            int var78 = var77.field699 >> 14 & 32767;
                            if (var69 == 2) {
                                var77.field697 = new class49(var74, var72, var78, var75, var70 + 4, 2, false, 902, var73, var76);
                                var77.field698 = new class49(var74, var72, var78, var75, var70 + 1 & 3, 2, false, 902, var73, var76);
                            } else {
                                var77.field697 = new class49(var74, var72, var78, var75, var70, var69, false, 902, var73, var76);
                            }
                        }
                    }
                    if (var71 == 1) {
                        class14 var79 = this.field451.method275(this.field452, var66, (byte) -39, var67);
                        if (var79 != null) {
                            var79.field716 = new class49(var74, var72, var79.field717 >> 14 & 32767, var75, 0, 4, false, 902, var73, var76);
                        }
                    }
                    if (var71 == 2) {
                        class25 var80 = this.field451.method276((byte) -54, var66, var67, this.field452);
                        if (var69 == 11) {
                            var69 = 10;
                        }
                        if (var80 != null) {
                            var80.field811 = new class49(var74, var72, var80.field819 >> 14 & 32767, var75, var70, var69, false, 902, var73, var76);
                        }
                    }
                    if (var71 == 3) {
                        class44 var81 = this.field451.method277(this.field452, var67, var66, this.field134);
                        if (var81 != null) {
                            var81.field1382 = new class49(var74, var72, var81.field1383 >> 14 & 32767, var75, var70, 22, false, 902, var73, var76);
                        }
                    }
                }
            } else if (arg0 == 4) {
                int var82 = arg1.method357();
                int var83 = (var82 >> 4 & 7) + this.field605;
                int var84 = (var82 & 7) + this.field606;
                int var85 = arg1.method359();
                int var86 = arg1.method357();
                int var87 = arg1.method359();
                if (var83 >= 0 && var84 >= 0 && var83 < 104 && var84 < 104) {
                    int var88 = var83 * 128 + 64;
                    int var89 = var84 * 128 + 64;
                    class18 var90 = new class18(this.field452, var85, field502, var89, 533, var88, var87, this.method68(0, var89, var88, this.field452) - var86);
                    this.field306.method243(var90);
                }
            } else if (arg0 == 235) {
                int var91 = arg1.method357();
                int var92 = (var91 >> 4 & 7) + this.field605;
                int var93 = (var91 & 7) + this.field606;
                int var94 = var92 + arg1.method358();
                int var95 = var93 + arg1.method358();
                int var96 = arg1.method360();
                int var97 = arg1.method359();
                int var98 = arg1.method357() * 4;
                int var99 = arg1.method357() * 4;
                int var100 = arg1.method359();
                int var101 = arg1.method359();
                int var102 = arg1.method357();
                int var103 = arg1.method357();
                if (var92 >= 0 && var93 >= 0 && var92 < 104 && var93 < 104 && var94 >= 0 && var95 >= 0 && var94 < 104 && var95 < 104 && var97 != 65535) {
                    int var104 = var92 * 128 + 64;
                    int var105 = var93 * 128 + 64;
                    int var106 = var94 * 128 + 64;
                    int var107 = var95 * 128 + 64;
                    class56 var108 = new class56(var99, this.field452, var97, field502 + var101, this.method68(0, var105, var104, this.field452) - var98, var96, var102, var103, var105, field502 + var100, (byte) 9, var104);
                    var108.method542(var106, field502 + var100, false, this.method68(0, var107, var106, this.field452) - var99, var107);
                    this.field386.method243(var108);
                }
            } else if (arg0 == 179) {
                int var109 = arg1.method376(false);
                int var110 = (var109 >> 4 & 7) + this.field605;
                int var111 = (var109 & 7) + this.field606;
                int var112 = arg1.method359();
                if (var110 >= 0 && var111 >= 0 && var110 < 104 && var111 < 104) {
                    class24 var113 = this.field418[this.field452][var110][var111];
                    if (var113 != null) {
                        for (class16 var114 = (class16) var113.method246(); var114 != null; var114 = (class16) var113.method248(true)) {
                            if ((var112 & 32767) == var114.field735) {
                                var114.method589();
                                break;
                            }
                        }
                        if (var113.method246() == null) {
                            this.field418[this.field452][var110][var111] = null;
                        }
                        this.method160(var110, var111);
                    }
                }
            } else if (arg0 == 93) {
                int var115 = arg1.method357();
                int var116 = (var115 >> 4 & 7) + this.field605;
                int var117 = (var115 & 7) + this.field606;
                int var118 = arg1.method359();
                int var119 = arg1.method359();
                int var120 = arg1.method359();
                if (var116 >= 0 && var117 >= 0 && var116 < 104 && var117 < 104) {
                    class24 var121 = this.field418[this.field452][var116][var117];
                    if (var121 != null) {
                        for (class16 var122 = (class16) var121.method246(); var122 != null; var122 = (class16) var121.method248(true)) {
                            if ((var118 & 32767) == var122.field735 && var122.field734 == var119) {
                                var122.field734 = var120;
                                break;
                            }
                        }
                        this.method160(var116, var117);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ZI)V")
    public final void method96(boolean arg0, int arg1) {
        if (field519.field938 >> 7 == this.field372 && field519.field939 >> 7 == this.field373) {
            this.field372 = 0;
        }
        int var3 = this.field153;
        if (arg1 != 0) {
            this.field197 = -230;
        }
        if (arg0) {
            var3 = 1;
        }
        for (int var4 = 0; var4 < var3; ++var4) {
            class6 var5;
            int var6;
            if (arg0) {
                var5 = field519;
                var6 = this.field151 << 14;
            } else {
                var5 = this.field152[this.field154[var4]];
                var6 = this.field154[var4] << 14;
            }
            if (var5 != null && var5.method1((byte) 9)) {
                var5.field92 = false;
                if ((field379 && this.field153 > 50 || this.field153 > 200) && !arg0 && var5.field946 == var5.field942) {
                    var5.field92 = true;
                }
                int var7 = var5.field938 >> 7;
                int var8 = var5.field939 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field105 != null && field502 >= var5.field106 && field502 < var5.field107) {
                        var5.field92 = false;
                        var5.field91 = this.method68(0, var5.field939, var5.field938, this.field452);
                        this.field451.method264(60, var5.field91, var5.field114, var5.field113, var5, var5.field115, var5.field112, var6, this.field452, var5.field938, var5.field939, this.field174, var5.field940);
                    } else {
                        if ((var5.field938 & 127) == 64 && (var5.field939 & 127) == 64) {
                            if (this.field337[var7][var8] == this.field163) {
                                continue;
                            }
                            this.field337[var7][var8] = this.field163;
                        }
                        var5.field91 = this.method68(0, var5.field939, var5.field938, this.field452);
                        this.field451.method263(this.field452, var5.field91, var5.field938, var5, var5.field939, 60, var5.field940, var5.field913, var6, (byte) -89);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIZ)I")
    public final int method97(int arg0, int arg1, int arg2, boolean arg3) {
        this.field210 &= arg3;
        int var5 = 256 - arg1;
        return ((arg0 & 16711935) * arg1 + (arg2 & 16711935) * var5 & -16711936) + ((arg0 & 65280) * arg1 + (arg2 & 65280) * var5 & 16711680) >> 8;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(I[BI)Z")
    public final boolean method98(int arg0, byte[] arg1, int arg2) {
        if (arg2 < 7 || arg2 > 7) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        return arg1 == null ? true : signlink.wavesave(arg1, arg0);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(I)V")
    public final void method99(int arg0) {
        if (arg0 < 6 || arg0 > 6) {
            this.field552 = this.field251.method357();
        }
        for (int var2 = 0; var2 < this.field329; ++var2) {
            if (this.field371[var2] <= 0) {
                boolean var3 = false;
                try {
                    if (this.field346[var2] == this.field199 && this.field388[var2] == this.field468) {
                        if (!this.method108((byte) -21)) {
                            var3 = true;
                        }
                    } else {
                        class38 var4 = class64.method581(true, this.field388[var2], this.field346[var2]);
                        if (System.currentTimeMillis() + (long) (var4.field1161 / 22) > (long) (this.field196 / 22) + this.field367) {
                            this.field196 = var4.field1161;
                            this.field367 = System.currentTimeMillis();
                            if (this.method98(var4.field1161, var4.field1160, 7)) {
                                this.field199 = this.field346[var2];
                                this.field468 = this.field388[var2];
                            } else {
                                var3 = true;
                            }
                        }
                    }
                } catch (Exception var7) {
                    if (signlink.reporterror) {
                        this.field426.method346(198, true);
                        this.field426.method348(this.field346[var2] & 32767);
                    } else {
                        this.field426.method346(198, true);
                        this.field426.method348(-1);
                    }
                }
                if (var3 && this.field371[var2] != -5) {
                    this.field371[var2] = -5;
                } else {
                    --this.field329;
                    for (int var6 = var2; var6 < this.field329; ++var6) {
                        this.field346[var6] = this.field346[var6 + 1];
                        this.field388[var6] = this.field388[var6 + 1];
                        this.field371[var6] = this.field371[var6 + 1];
                    }
                    --var2;
                }
            } else {
                int var10002 = this.field371[var2]--;
            }
        }
        if (this.field423 > 0) {
            this.field423 -= 20;
            if (this.field423 < 0) {
                this.field423 = 0;
            }
            if (this.field423 == 0 && this.field493 && !field379) {
                this.field508 = this.field350;
                this.field509 = true;
                this.field437.method516(2, this.field508);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(I)V")
    public final void method100(int arg0) {
        this.field527 = true;
        for (int var2 = 0; var2 < 7; ++var2) {
            this.field576[var2] = -1;
            for (int var4 = 0; var4 < class33.field1043; ++var4) {
                if (!class33.field1044[var4].field1050 && class33.field1044[var4].field1045 == var2 + (this.field412 ? 0 : 7)) {
                    this.field576[var2] = var4;
                    break;
                }
            }
        }
        if (arg0 != 14877) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(Z)V")
    public final void method101(boolean arg0) {
        if (arg0) {
            this.field552 = this.field251.method357();
        }
        this.field426.method346(71, true);
        if (this.field129 != -1) {
            this.method112(-681, this.field129);
            this.field129 = -1;
            this.field258 = true;
            this.field226 = false;
            this.field149 = true;
        }
        if (this.field621 != -1) {
            this.method112(-681, this.field621);
            this.field621 = -1;
            this.field308 = true;
            this.field226 = false;
        }
        if (this.field505 != -1) {
            this.method112(-681, this.field505);
            this.field505 = -1;
            this.field296 = true;
        }
        if (this.field432 != -1) {
            this.method112(-681, this.field432);
            this.field432 = -1;
        }
        if (this.field348 != -1) {
            this.method112(-681, this.field348);
            this.field348 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILjava/lang/String;ILjava/lang/String;)V")
    public final void method102(int arg0, String arg1, int arg2, String arg3) {
        if (arg2 == 0 && this.field578 != -1) {
            this.field292 = arg1;
            super.field1278 = 0;
        }
        if (this.field621 == -1) {
            this.field308 = true;
        }
        for (int var5 = 99; var5 > 0; --var5) {
            this.field583[var5] = this.field583[var5 - 1];
            this.field584[var5] = this.field584[var5 - 1];
            this.field585[var5] = this.field585[var5 - 1];
        }
        if (arg0 < 4 || arg0 > 4) {
            this.field552 = -1;
        }
        this.field583[0] = arg2;
        this.field584[0] = arg3;
        this.field585[0] = arg1;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IJ)V")
    public final void method103(int arg0, long arg1) {
        if (arg1 != 0L) {
            for (int var4 = 0; var4 < this.field130; ++var4) {
                if (this.field240[var4] == arg1) {
                    --this.field130;
                    this.field258 = true;
                    for (int var5 = var4; var5 < this.field130; ++var5) {
                        this.field580[var5] = this.field580[var5 + 1];
                        this.field162[var5] = this.field162[var5 + 1];
                        this.field240[var5] = this.field240[var5 + 1];
                    }
                    this.field426.method346(193, true);
                    this.field426.method353(arg1, 2);
                    break;
                }
            }
            int var6 = 80 / arg0;
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(B)V")
    public final void method104(byte arg0) {
        try {
            this.field370 = -1;
            this.field306.method250();
            this.field386.method250();
            class59.method556(-14344);
            this.method82((byte) 2);
            this.field451.method252(true);
            System.gc();
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field314[var2].method323();
            }
            for (int var3 = 0; var3 < 4; ++var3) {
                for (int var4 = 0; var4 < 104; ++var4) {
                    for (int var5 = 0; var5 < 104; ++var5) {
                        this.field249[var3][var4][var5] = 0;
                    }
                }
            }
            class55 var6 = new class55(this.field599, 104, 0, this.field249, 104);
            int var7 = this.field401.length;
            this.field426.method346(204, true);
            if (!this.field549) {
                for (int var8 = 0; var8 < var7; ++var8) {
                    int var9 = (this.field245[var8] >> 8) * 64 - this.field280;
                    int var10 = (this.field245[var8] & 255) * 64 - this.field281;
                    byte[] var11 = this.field401[var8];
                    if (var11 != null) {
                        var6.method531((this.field443 - 6) * 8, var11, var9, var10, false, (this.field444 - 6) * 8, this.field314);
                    }
                }
                for (int var12 = 0; var12 < var7; ++var12) {
                    int var13 = (this.field245[var12] >> 8) * 64 - this.field280;
                    int var14 = (this.field245[var12] & 255) * 64 - this.field281;
                    byte[] var15 = this.field401[var12];
                    if (var15 == null && this.field444 < 800) {
                        var6.method536(64, (byte) -14, var14, var13, 64);
                    }
                }
                ++field164;
                if (field164 > 167) {
                    field164 = 0;
                    this.field426.method346(75, true);
                    this.field426.method347(150);
                }
                this.field426.method346(204, true);
                for (int var16 = 0; var16 < var7; ++var16) {
                    byte[] var17 = this.field274[var16];
                    if (var17 != null) {
                        int var18 = (this.field245[var16] >> 8) * 64 - this.field280;
                        int var19 = (this.field245[var16] & 255) * 64 - this.field281;
                        var6.method529(var17, this.field314, this.field451, var18, -319, var19);
                    }
                }
            }
            if (this.field549) {
                int var20 = 0;
                label260: while (true) {
                    if (var20 >= 4) {
                        for (int var31 = 0; var31 < 13; ++var31) {
                            for (int var32 = 0; var32 < 13; ++var32) {
                                int var33 = this.field298[0][var31][var32];
                                if (var33 == -1) {
                                    var6.method536(8, (byte) -14, var32 * 8, var31 * 8, 8);
                                }
                            }
                        }
                        this.field426.method346(204, true);
                        int var34 = 0;
                        while (true) {
                            if (var34 >= 4) {
                                break label260;
                            }
                            for (int var35 = 0; var35 < 13; ++var35) {
                                for (int var36 = 0; var36 < 13; ++var36) {
                                    int var37 = this.field298[var34][var35][var36];
                                    if (var37 != -1) {
                                        int var38 = var37 >> 24 & 3;
                                        int var39 = var37 >> 1 & 3;
                                        int var40 = var37 >> 14 & 1023;
                                        int var41 = var37 >> 3 & 2047;
                                        int var42 = (var40 / 8 << 8) + var41 / 8;
                                        for (int var43 = 0; var43 < this.field245.length; ++var43) {
                                            if (this.field245[var43] == var42 && this.field274[var43] != null) {
                                                var6.method528(this.field314, this.field451, var38, var35 * 8, this.field274[var43], -627, (var40 & 7) * 8, var34, var36 * 8, var39, (var41 & 7) * 8);
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
                            int var24 = this.field298[var20][var21][var22];
                            if (var24 != -1) {
                                int var25 = var24 >> 24 & 3;
                                int var26 = var24 >> 1 & 3;
                                int var27 = var24 >> 14 & 1023;
                                int var28 = var24 >> 3 & 2047;
                                int var29 = (var27 / 8 << 8) + var28 / 8;
                                for (int var30 = 0; var30 < this.field245.length; ++var30) {
                                    if (this.field245[var30] == var29 && this.field401[var30] != null) {
                                        var6.method535(this.field314, (var27 & 7) * 8, var25, this.field401[var30], var21 * 8, var26, (var28 & 7) * 8, true, var22 * 8, var20);
                                        var23 = true;
                                        break;
                                    }
                                }
                            }
                            if (!var23) {
                                var6.method520(var20, var21 * 8, 5, var22 * 8);
                            }
                        }
                    }
                    ++var20;
                }
            }
            this.field426.method346(204, true);
            var6.method540(this.field521, this.field451, this.field314);
            if (this.field455 != null) {
                this.field455.method206((byte) 59);
                class59.field1613 = this.field517;
            }
            this.field426.method346(204, true);
            int var44 = class55.field1518;
            if (var44 > this.field452) {
                var44 = this.field452;
            }
            if (var44 < this.field452 - 1) {
                int var45 = this.field452 - 1;
            }
            if (field379) {
                this.field451.method253(class55.field1518, false);
            } else {
                this.field451.method253(0, false);
            }
            for (int var46 = 0; var46 < 104; ++var46) {
                for (int var47 = 0; var47 < 104; ++var47) {
                    this.method160(var46, var47);
                }
            }
            this.method122(0);
        } catch (Exception var60) {
        }
        class8.field624.method588();
        if (super.field1267 != null) {
            this.field426.method346(236, true);
            this.field426.method351(1057001181);
        }
        if (field379 && signlink.cache_dat != null) {
            int var49 = this.field437.method514(true, 0);
            for (int var50 = 0; var50 < var49; ++var50) {
                int var51 = this.field437.method504(var50, (byte) -98);
                if ((var51 & 121) == 0) {
                    class42.method413((byte) 2, var50);
                }
            }
        }
        System.gc();
        class59.method557(field354, 20);
        if (arg0 != 2) {
            this.field426.method347(189);
        }
        this.field437.method518(true);
        int var52 = (this.field443 - 6) / 8 - 1;
        int var53 = (this.field443 + 6) / 8 + 1;
        int var54 = (this.field444 - 6) / 8 - 1;
        int var55 = (this.field444 + 6) / 8 + 1;
        if (this.field598) {
            var52 = 49;
            var53 = 50;
            var54 = 49;
            var55 = 50;
        }
        for (int var56 = var52; var56 <= var53; ++var56) {
            for (int var57 = var54; var57 <= var55; ++var57) {
                if (var52 == var56 || var53 == var56 || var54 == var57 || var55 == var57) {
                    int var58 = this.field437.method507(0, var56, var57, false);
                    if (var58 != -1) {
                        this.field437.method517((byte) 4, var58, 3);
                    }
                    int var59 = this.field437.method507(1, var56, var57, false);
                    if (var59 != -1) {
                        this.field437.method517((byte) 4, var59, 3);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(Z)Ljava/lang/String;")
    public final String method105(boolean arg0) {
        if (arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (signlink.mainapp != null) {
            return signlink.mainapp.getDocumentBase().getHost().toLowerCase();
        } else {
            return super.field1267 != null ? "runescape.com" : super.getDocumentBase().getHost().toLowerCase();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZI)V")
    public final void method106(int arg0, boolean arg1, int arg2) {
        if (arg2 >= 6 && arg2 <= 6) {
            signlink.midivol = arg0;
            if (arg1) {
                signlink.midi = "voladjust";
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMVHXDWGI;IB)V")
    private final void method107(class38 arg0, int arg1, byte arg2) {
        int var4 = arg0.method368(1, 8);
        if (var4 < this.field153) {
            for (int var5 = var4; var5 < this.field153; ++var5) {
                this.field253[this.field252++] = this.field154[var5];
            }
        }
        if (var4 > this.field153) {
            signlink.reporterror(this.field483 + " Too many players");
            throw new RuntimeException("eek");
        } else {
            this.field153 = 0;
            if (arg2 != 3) {
                this.field332 = this.field203.method483();
            }
            for (int var6 = 0; var6 < var4; ++var6) {
                int var7 = this.field154[var6];
                class6 var8 = this.field152[var7];
                int var9 = arg0.method368(1, 1);
                if (var9 == 0) {
                    this.field154[this.field153++] = var7;
                    var8.field923 = field502;
                } else {
                    int var10 = arg0.method368(1, 2);
                    if (var10 == 0) {
                        this.field154[this.field153++] = var7;
                        var8.field923 = field502;
                        this.field156[this.field155++] = var7;
                    } else if (var10 == 1) {
                        this.field154[this.field153++] = var7;
                        var8.field923 = field502;
                        int var11 = arg0.method368(1, 3);
                        var8.method303(var11, false, (byte) -110);
                        int var12 = arg0.method368(1, 1);
                        if (var12 == 1) {
                            this.field156[this.field155++] = var7;
                        }
                    } else if (var10 == 2) {
                        this.field154[this.field153++] = var7;
                        var8.field923 = field502;
                        int var13 = arg0.method368(1, 3);
                        var8.method303(var13, true, (byte) -110);
                        int var14 = arg0.method368(1, 3);
                        var8.method303(var14, true, (byte) -110);
                        int var15 = arg0.method368(1, 1);
                        if (var15 == 1) {
                            this.field156[this.field155++] = var7;
                        }
                    } else if (var10 == 3) {
                        this.field253[this.field252++] = var7;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(B)Z")
    public final boolean method108(byte arg0) {
        if (arg0 != -21) {
            throw new NullPointerException();
        } else {
            return signlink.wavereplay();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMYGSUHVG;IZIIIII)V")
    public final void method109(int arg0, class39 arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
        if (this.field229) {
            this.field248 = 32;
        } else {
            this.field248 = 0;
        }
        this.field229 = false;
        this.field210 &= arg3;
        if (arg6 >= arg7 && arg6 < arg7 + 16 && arg0 >= arg4 && arg0 < arg4 + 16) {
            arg1.field1238 -= this.field285 * 4;
            if (arg5 == 1) {
                this.field258 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field308 = true;
            }
        } else if (arg6 >= arg7 && arg6 < arg7 + 16 && arg0 >= arg2 + arg4 - 16 && arg0 < arg2 + arg4) {
            arg1.field1238 += this.field285 * 4;
            if (arg5 == 1) {
                this.field258 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field308 = true;
            }
        } else if (arg6 >= arg7 - this.field248 && arg6 < arg7 + 16 + this.field248 && arg0 >= arg4 + 16 && arg0 < arg2 + arg4 - 16 && this.field285 > 0) {
            int var10 = (arg2 - 32) * arg2 / arg8;
            if (var10 < 8) {
                var10 = 8;
            }
            int var11 = arg0 - arg4 - 16 - var10 / 2;
            int var12 = arg2 - 32 - var10;
            arg1.field1238 = (arg8 - arg2) * var11 / var12;
            if (arg5 == 1) {
                this.field258 = true;
            }
            if (arg5 == 2 || arg5 == 3) {
                this.field308 = true;
            }
            this.field229 = true;
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(B)V")
    public final void method110(byte arg0) {
        try {
            if (this.field417 != null) {
                this.field417.method574();
            }
        } catch (Exception var3) {
        }
        this.field417 = null;
        this.field210 = false;
        this.field159 = 0;
        this.field483 = "";
        this.field484 = "";
        this.method82((byte) 2);
        this.field451.method252(true);
        if (arg0 == -26) {
            for (int var2 = 0; var2 < 4; ++var2) {
                this.field314[var2].method323();
            }
            System.gc();
            this.method157(false);
            this.field350 = -1;
            this.field508 = -1;
            this.field423 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;ILjava/lang/String;)V")
    public final void method111(String arg0, int arg1, String arg2) {
        if (arg1 != 9231) {
            this.field416 = this.field203.method483();
        }
        if (this.field455 != null) {
            this.field455.method206((byte) 59);
            class59.field1613 = this.field517;
            int var4 = 151;
            if (arg0 != null) {
                var4 -= 7;
            }
            this.field207.method18(0, arg2, var4, 257, 0);
            this.field207.method18(16777215, arg2, var4 - 1, 256, 0);
            var4 += 15;
            if (arg0 != null) {
                this.field207.method18(0, arg0, var4, 257, 0);
                this.field207.method18(16777215, arg0, var4 - 1, 256, 0);
            }
            this.field455.method207(super.field1264, (byte) 19, 4, 4);
        } else if (super.field1265 != null) {
            super.field1265.method206((byte) 59);
            class59.field1613 = this.field518;
            int var5 = 251;
            short var6 = 300;
            byte var7 = 50;
            class15.method214(0, 435, var7, 383 - var6 / 2, var5 - 5 - var7 / 2, var6);
            class15.method215(var7, 479, 16777215, var6, var5 - 5 - var7 / 2, 383 - var6 / 2);
            if (arg0 != null) {
                var5 -= 7;
            }
            this.field207.method18(0, arg2, var5, 383, 0);
            this.field207.method18(16777215, arg2, var5 - 1, 382, 0);
            var5 += 15;
            if (arg0 != null) {
                this.field207.method18(0, arg0, var5, 383, 0);
                this.field207.method18(16777215, arg0, var5 - 1, 382, 0);
            }
            super.field1265.method207(super.field1264, (byte) 19, 0, 0);
        }
    }

    @OriginalMember(owner = "client!client", name = "e", descriptor = "(II)V")
    public final void method112(int arg0, int arg1) {
        if (arg0 >= 0) {
            field491 = !field491;
        }
        class39.method403(-681, arg1);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMYGSUHVG;BI)I")
    public final int method113(class39 arg0, byte arg1, int arg2) {
        if (this.field266 != arg1) {
            this.field521 = 304;
        }
        if (arg0.field1246 != null && arg2 < arg0.field1246.length) {
            try {
                int[] var4 = arg0.field1246[arg2];
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
                        var9 = this.field560[var4[var6++]];
                    }
                    if (var8 == 2) {
                        var9 = this.field558[var4[var6++]];
                    }
                    if (var8 == 3) {
                        var9 = this.field160[var4[var6++]];
                    }
                    if (var8 == 4) {
                        class39 var11 = class39.method402(var4[var6++]);
                        int var12 = var4[var6++];
                        if (var12 >= 0 && var12 < class3.field48 && (!class3.method11(var12).field26 || field378)) {
                            for (int var13 = 0; var13 < var11.field1201.length; ++var13) {
                                if (var12 + 1 == var11.field1201[var13]) {
                                    var9 += var11.field1213[var13];
                                }
                            }
                        }
                    }
                    if (var8 == 5) {
                        var9 = this.field528[var4[var6++]];
                    }
                    if (var8 == 6) {
                        var9 = field420[this.field558[var4[var6++]] - 1];
                    }
                    if (var8 == 7) {
                        var9 = this.field528[var4[var6++]] * 100 / 46875;
                    }
                    if (var8 == 8) {
                        var9 = field519.field109;
                    }
                    if (var8 == 9) {
                        for (int var14 = 0; var14 < class72.field1726; ++var14) {
                            if (class72.field1728[var14]) {
                                var9 += this.field558[var14];
                            }
                        }
                    }
                    if (var8 == 10) {
                        class39 var15 = class39.method402(var4[var6++]);
                        int var16 = var4[var6++] + 1;
                        if (var16 >= 0 && var16 < class3.field48 && (!class3.method11(var16).field26 || field378)) {
                            for (int var17 = 0; var17 < var15.field1201.length; ++var17) {
                                if (var15.field1201[var17] == var16) {
                                    var9 = 999999999;
                                    break;
                                }
                            }
                        }
                    }
                    if (var8 == 11) {
                        var9 = this.field506;
                    }
                    if (var8 == 12) {
                        var9 = this.field284;
                    }
                    if (var8 == 13) {
                        int var18 = this.field528[var4[var6++]];
                        int var19 = var4[var6++];
                        var9 = (var18 & 1 << var19) != 0 ? 1 : 0;
                    }
                    if (var8 == 14) {
                        int var20 = var4[var6++];
                        class47 var21 = class47.field1405[var20];
                        int var22 = var21.field1407;
                        int var23 = var21.field1408;
                        int var24 = var21.field1409;
                        int var25 = field421[var24 - var23];
                        var9 = this.field528[var22] >> var23 & var25;
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
                        var9 = (field519.field938 >> 7) + this.field280;
                    }
                    if (var8 == 19) {
                        var9 = (field519.field939 >> 7) + this.field281;
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

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMVHXDWGI;II)V")
    private final void method114(class38 arg0, int arg1, int arg2) {
        this.field252 = 0;
        this.field155 = 0;
        this.method168(arg1, arg0, 274);
        this.method107(arg0, arg1, (byte) 3);
        this.method61(arg0, true, arg1);
        if (arg2 < 6 || arg2 > 6) {
            for (int var4 = 1; var4 > 0; ++var4) {
            }
        }
        this.method91((byte) 8, arg1, arg0);
        for (int var5 = 0; var5 < this.field252; ++var5) {
            int var7 = this.field253[var5];
            if (field502 != this.field152[var7].field923) {
                this.field152[var7] = null;
            }
        }
        if (arg0.field1161 != arg1) {
            signlink.reporterror("Error packet size mismatch in getplayer pos:" + arg0.field1161 + " psize:" + arg1);
            throw new RuntimeException("eek");
        } else {
            for (int var6 = 0; var6 < this.field153; ++var6) {
                if (this.field152[this.field154[var6]] == null) {
                    signlink.reporterror(this.field483 + " null entry in pl list - pos:" + var6 + " size:" + this.field153);
                    throw new RuntimeException("eek");
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(I)I")
    public final int method115(int arg0) {
        int var2 = 3;
        if (arg0 != 32209) {
            this.field426.method347(173);
        }
        if (this.field365 < 310) {
            int var3 = this.field362 >> 7;
            int var4 = this.field364 >> 7;
            int var5 = field519.field938 >> 7;
            int var6 = field519.field939 >> 7;
            if ((this.field249[this.field452][var3][var4] & 4) != 0) {
                var2 = this.field452;
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
                    if ((this.field249[this.field452][var3][var4] & 4) != 0) {
                        var2 = this.field452;
                    }
                    var10 += var9;
                    if (var10 >= 65536) {
                        var10 -= 65536;
                        if (var4 < var6) {
                            ++var4;
                        } else if (var4 > var6) {
                            --var4;
                        }
                        if ((this.field249[this.field452][var3][var4] & 4) != 0) {
                            var2 = this.field452;
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
                    if ((this.field249[this.field452][var3][var4] & 4) != 0) {
                        var2 = this.field452;
                    }
                    var12 += var11;
                    if (var12 >= 65536) {
                        var12 -= 65536;
                        if (var3 < var5) {
                            ++var3;
                        } else if (var3 > var5) {
                            --var3;
                        }
                        if ((this.field249[this.field452][var3][var4] & 4) != 0) {
                            var2 = this.field452;
                        }
                    }
                }
            }
        }
        if ((this.field249[this.field452][field519.field938 >> 7][field519.field939 >> 7] & 4) != 0) {
            var2 = this.field452;
        }
        return var2;
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(I)I")
    public final int method116(int arg0) {
        int var2 = 19 / arg0;
        int var3 = this.method68(0, this.field364, this.field362, this.field452);
        return var3 - this.field363 < 800 && (this.field249[this.field452][this.field362 >> 7][this.field364 >> 7] & 4) != 0 ? this.field452 : 3;
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(I)V")
    public final void method117(int arg0) {
        if (this.field416 != arg0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        if (this.field159 == 0) {
            int var3 = super.field1262 / 2 - 80;
            int var4 = super.field1263 / 2 + 20;
            int var15 = var4 + 20;
            if (super.field1278 == 1 && super.field1279 >= var3 - 75 && super.field1279 <= var3 + 75 && super.field1280 >= var15 - 20 && super.field1280 <= var15 + 20) {
                this.field159 = 3;
                this.field323 = 0;
            }
            int var5 = super.field1262 / 2 + 80;
            if (super.field1278 == 1 && super.field1279 >= var5 - 75 && super.field1279 <= var5 + 75 && super.field1280 >= var15 - 20 && super.field1280 <= var15 + 20) {
                this.field460 = "";
                this.field461 = "Enter your username & password.";
                this.field159 = 2;
                this.field323 = 0;
            }
        } else if (this.field159 == 2) {
            int var6 = super.field1263 / 2 - 40;
            int var16 = var6 + 30;
            int var17 = var16 + 25;
            if (super.field1278 == 1 && super.field1280 >= var17 - 15 && super.field1280 < var17) {
                this.field323 = 0;
            }
            var6 = var17 + 15;
            if (super.field1278 == 1 && super.field1280 >= var6 - 15 && super.field1280 < var6) {
                this.field323 = 1;
            }
            var6 += 15;
            int var7 = super.field1262 / 2 - 80;
            int var8 = super.field1263 / 2 + 50;
            int var18 = var8 + 20;
            if (super.field1278 == 1 && super.field1279 >= var7 - 75 && super.field1279 <= var7 + 75 && super.field1280 >= var18 - 20 && super.field1280 <= var18 + 20) {
                this.field594 = 0;
                this.method133(this.field483, this.field484, false);
                if (this.field210) {
                    return;
                }
            }
            int var9 = super.field1262 / 2 + 80;
            if (super.field1278 == 1 && super.field1279 >= var9 - 75 && super.field1279 <= var9 + 75 && super.field1280 >= var18 - 20 && super.field1280 <= var18 + 20) {
                this.field159 = 0;
                this.field483 = "";
                this.field484 = "";
            }
            while (true) {
                while (true) {
                    int var10 = this.method409(878);
                    if (var10 == -1) {
                        return;
                    }
                    boolean var11 = false;
                    for (int var12 = 0; var12 < field490.length(); ++var12) {
                        if (var10 == field490.charAt(var12)) {
                            var11 = true;
                            break;
                        }
                    }
                    if (this.field323 == 0) {
                        if (var10 == 8 && this.field483.length() > 0) {
                            this.field483 = this.field483.substring(0, this.field483.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field323 = 1;
                        }
                        if (var11) {
                            this.field483 = this.field483 + (char) var10;
                        }
                        if (this.field483.length() > 12) {
                            this.field483 = this.field483.substring(0, 12);
                        }
                    } else if (this.field323 == 1) {
                        if (var10 == 8 && this.field484.length() > 0) {
                            this.field484 = this.field484.substring(0, this.field484.length() - 1);
                        }
                        if (var10 == 9 || var10 == 10 || var10 == 13) {
                            this.field323 = 0;
                        }
                        if (var11) {
                            this.field484 = this.field484 + (char) var10;
                        }
                        if (this.field484.length() > 20) {
                            this.field484 = this.field484.substring(0, 20);
                        }
                    }
                }
            }
        } else {
            if (this.field159 == 3) {
                int var13 = super.field1262 / 2;
                int var14 = super.field1263 / 2 + 50;
                int var19 = var14 + 20;
                if (super.field1278 == 1 && super.field1279 >= var13 - 75 && super.field1279 <= var13 + 75 && super.field1280 >= var19 - 20 && super.field1280 <= var19 + 20) {
                    this.field159 = 0;
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(I)V")
    public void method118(int arg0) {
        System.out.println("============");
        if (arg0 < 6 || arg0 > 6) {
            this.method147();
        }
        System.out.println("flame-cycle:" + this.field458);
        if (this.field437 != null) {
            System.out.println("Od-cycle:" + this.field437.field1479);
        }
        System.out.println("loop-cycle:" + field502);
        System.out.println("draw-cycle:" + field360);
        System.out.println("ptype:" + this.field552);
        System.out.println("psize:" + this.field551);
        if (this.field417 != null) {
            this.field417.method579(6);
        }
        super.field1261 = true;
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(I)Ljava/awt/Component;")
    public final Component method119(int arg0) {
        this.field551 += arg0;
        if (signlink.mainapp != null) {
            return signlink.mainapp;
        } else {
            return super.field1267 != null ? super.field1267 : this;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(BI)Ljava/lang/String;")
    public final String method120(byte arg0, int arg1) {
        if (this.field257 != arg0) {
            throw new NullPointerException();
        } else {
            return arg1 < 999999999 ? String.valueOf(arg1) : "*";
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LMYGSUHVG;I)Z")
    public final boolean method121(class39 arg0, int arg1) {
        if (arg1 != 47294) {
            this.field279 = this.field203.method483();
        }
        int var3 = arg0.field1232;
        if ((var3 < 1 || var3 > 200) && (var3 < 701 || var3 > 900)) {
            if (var3 >= 401 && var3 <= 500) {
                this.field419[this.field261] = "Remove @whi@" + arg0.field1224;
                this.field464[this.field261] = 199;
                ++this.field261;
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
            this.field419[this.field261] = "Remove @whi@" + this.field580[var3];
            this.field464[this.field261] = 612;
            ++this.field261;
            this.field419[this.field261] = "Message @whi@" + this.field580[var3];
            this.field464[this.field261] = 28;
            ++this.field261;
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "s", descriptor = "(I)V")
    private final void method122(int arg0) {
        class68 var2 = (class68) this.field189.method246();
        if (arg0 != 0) {
            field559 = !field559;
        }
        while (var2 != null) {
            if (var2.field1704 == -1) {
                var2.field1703 = 0;
                this.method84(var2, false);
            } else {
                var2.method589();
            }
            var2 = (class68) this.field189.method248(true);
        }
    }

    @OriginalMember(owner = "client!client", name = "main", descriptor = "([Ljava/lang/String;)V")
    public static final void main(String[] arg0) {
        try {
            System.out.println("RS2 user client - release #" + 365);
            if (arg0.length != 5) {
                System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
            } else {
                field376 = Integer.parseInt(arg0[0]);
                field377 = Integer.parseInt(arg0[1]);
                if (arg0[2].equals("lowmem")) {
                    method164(true);
                } else {
                    if (!arg0[2].equals("highmem")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    method142(0);
                }
                if (arg0[3].equals("free")) {
                    field378 = false;
                } else {
                    if (!arg0[3].equals("members")) {
                        System.out.println("Usage: node-id, port-offset, [lowmem/highmem], [free/members], storeid");
                        return;
                    }
                    field378 = true;
                }
                signlink.storeid = Integer.parseInt(arg0[4]);
                signlink.startpriv(InetAddress.getLocalHost());
                client var1 = new client();
                var1.method405((byte) 7, 765, 503);
            }
        } catch (Exception var3) {
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILMYGSUHVG;)Z")
    public final boolean method123(int arg0, class39 arg1) {
        if (arg0 >= 0) {
            this.field496 = !this.field496;
        }
        int var3 = arg1.field1232;
        if (this.field131 == 2) {
            if (var3 == 201) {
                this.field308 = true;
                this.field533 = 0;
                this.field273 = true;
                this.field241 = "";
                this.field166 = 1;
                this.field342 = "Enter name of friend to add to list";
            }
            if (var3 == 202) {
                this.field308 = true;
                this.field533 = 0;
                this.field273 = true;
                this.field241 = "";
                this.field166 = 2;
                this.field342 = "Enter name of friend to delete from list";
            }
        }
        if (var3 == 205) {
            this.field555 = 250;
            return true;
        } else {
            if (var3 == 501) {
                this.field308 = true;
                this.field533 = 0;
                this.field273 = true;
                this.field241 = "";
                this.field166 = 4;
                this.field342 = "Enter name of player to add to list";
            }
            if (var3 == 502) {
                this.field308 = true;
                this.field533 = 0;
                this.field273 = true;
                this.field241 = "";
                this.field166 = 5;
                this.field342 = "Enter name of player to delete from list";
            }
            if (var3 >= 300 && var3 <= 313) {
                int var4 = (var3 - 300) / 2;
                int var5 = var3 & 1;
                int var6 = this.field576[var4];
                if (var6 != -1) {
                    while (true) {
                        if (var5 == 0) {
                            --var6;
                            if (var6 < 0) {
                                var6 = class33.field1043 - 1;
                            }
                        }
                        if (var5 == 1) {
                            ++var6;
                            if (var6 >= class33.field1043) {
                                var6 = 0;
                            }
                        }
                        if (!class33.field1044[var6].field1050 && class33.field1044[var6].field1045 == var4 + (this.field412 ? 0 : 7)) {
                            this.field576[var4] = var6;
                            this.field527 = true;
                            break;
                        }
                    }
                }
            }
            if (var3 >= 314 && var3 <= 323) {
                int var7 = (var3 - 314) / 2;
                int var8 = var3 & 1;
                int var9 = this.field345[var7];
                if (var8 == 0) {
                    --var9;
                    if (var9 < 0) {
                        var9 = field514[var7].length - 1;
                    }
                }
                if (var8 == 1) {
                    ++var9;
                    if (var9 >= field514[var7].length) {
                        var9 = 0;
                    }
                }
                this.field345[var7] = var9;
                this.field527 = true;
            }
            if (var3 == 324 && !this.field412) {
                this.field412 = true;
                this.method100(14877);
            }
            if (var3 == 325 && this.field412) {
                this.field412 = false;
                this.method100(14877);
            }
            if (var3 != 326) {
                if (var3 == 620) {
                    this.field563 = !this.field563;
                }
                if (var3 >= 601 && var3 <= 613) {
                    this.method101(false);
                    if (this.field595.length() > 0) {
                        this.field426.method346(154, true);
                        this.field426.method353(class58.method547(this.field595), 2);
                        this.field426.method347(var3 - 601);
                        this.field426.method347(this.field563 ? 1 : 0);
                    }
                }
                return false;
            } else {
                this.field426.method346(44, true);
                this.field426.method347(this.field412 ? 0 : 1);
                for (int var10 = 0; var10 < 7; ++var10) {
                    this.field426.method347(this.field576[var10]);
                }
                for (int var11 = 0; var11 < 5; ++var11) {
                    this.field426.method347(this.field345[var11]);
                }
                return true;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(LMYGSUHVG;IIII)V")
    public final void method124(class39 arg0, int arg1, int arg2, int arg3, int arg4) {
        if (arg0.field1242 == 0 && arg0.field1214 != null) {
            if (!arg0.field1247 || this.field256 == arg0.field1226 || this.field204 == arg0.field1226 || this.field300 == arg0.field1226) {
                int var6 = class15.field727;
                int var7 = class15.field725;
                int var8 = class15.field728;
                int var9 = class15.field726;
                class15.method211(arg2, arg4, arg0.field1183 + arg2, arg0.field1187 + arg4, -39271);
                int var10 = arg0.field1214.length;
                for (int var11 = 0; var11 < var10; ++var11) {
                    int var13 = arg0.field1178[var11] + arg4;
                    int var14 = arg0.field1180[var11] + arg2 - arg1;
                    class39 var15 = class39.method402(arg0.field1214[var11]);
                    int var16 = var15.field1219 + var13;
                    int var17 = var15.field1191 + var14;
                    if (var15.field1232 > 0) {
                        this.method85(var15, -519);
                    }
                    if (var15.field1242 == 0) {
                        if (var15.field1238 > var15.field1233 - var15.field1183) {
                            var15.field1238 = var15.field1233 - var15.field1183;
                        }
                        if (var15.field1238 < 0) {
                            var15.field1238 = 0;
                        }
                        this.method124(var15, var15.field1238, var17, 878, var16);
                        if (var15.field1233 > var15.field1183) {
                            this.method182(var15.field1238, var15.field1187 + var16, var15.field1183, var17, -408, var15.field1233);
                        }
                    } else if (var15.field1242 != 1) {
                        if (var15.field1242 == 2) {
                            int var18 = 0;
                            for (int var19 = 0; var19 < var15.field1183; ++var19) {
                                for (int var20 = 0; var20 < var15.field1187; ++var20) {
                                    int var21 = (var15.field1177 + 32) * var20 + var16;
                                    int var22 = (var15.field1223 + 32) * var19 + var17;
                                    if (var18 < 20) {
                                        var21 += var15.field1176[var18];
                                        var22 += var15.field1217[var18];
                                    }
                                    if (var15.field1201[var18] <= 0) {
                                        if (var15.field1240 != null && var18 < 20) {
                                            class22 var31 = var15.field1240[var18];
                                            if (var31 != null) {
                                                var31.method233(-23827, var21, var22);
                                            }
                                        }
                                    } else {
                                        int var23 = 0;
                                        int var24 = 0;
                                        int var25 = var15.field1201[var18] - 1;
                                        if (var21 > class15.field727 - 32 && var21 < class15.field728 && var22 > class15.field725 - 32 && var22 < class15.field726 || this.field318 != 0 && this.field317 == var18) {
                                            int var26 = 0;
                                            if (this.field230 == 1 && this.field231 == var18 && this.field232 == var15.field1226) {
                                                var26 = 16777215;
                                            }
                                            class22 var27 = class3.method12(var26, var15.field1213[var18], false, var25);
                                            if (var27 != null) {
                                                if (this.field318 != 0 && this.field317 == var18 && this.field316 == var15.field1226) {
                                                    var23 = super.field1272 - this.field319;
                                                    var24 = super.field1273 - this.field320;
                                                    if (var23 < 5 && var23 > -5) {
                                                        var23 = 0;
                                                    }
                                                    if (var24 < 5 && var24 > -5) {
                                                        var24 = 0;
                                                    }
                                                    if (this.field188 < 5) {
                                                        var23 = 0;
                                                        var24 = 0;
                                                    }
                                                    var27.method235(var22 + var24, 128, (byte) 5, var21 + var23);
                                                    if (var22 + var24 < class15.field725 && arg0.field1238 > 0) {
                                                        int var28 = (class15.field725 - var22 - var24) * this.field590 / 3;
                                                        if (var28 > this.field590 * 10) {
                                                            var28 = this.field590 * 10;
                                                        }
                                                        if (var28 > arg0.field1238) {
                                                            var28 = arg0.field1238;
                                                        }
                                                        arg0.field1238 -= var28;
                                                        this.field320 += var28;
                                                    }
                                                    if (var22 + var24 + 32 > class15.field726 && arg0.field1238 < arg0.field1233 - arg0.field1183) {
                                                        int var29 = (var22 + var24 + 32 - class15.field726) * this.field590 / 3;
                                                        if (var29 > this.field590 * 10) {
                                                            var29 = this.field590 * 10;
                                                        }
                                                        if (var29 > arg0.field1233 - arg0.field1183 - arg0.field1238) {
                                                            var29 = arg0.field1233 - arg0.field1183 - arg0.field1238;
                                                        }
                                                        arg0.field1238 += var29;
                                                        this.field320 -= var29;
                                                    }
                                                } else if (this.field442 != 0 && this.field441 == var18 && this.field440 == var15.field1226) {
                                                    var27.method235(var22, 128, (byte) 5, var21);
                                                } else {
                                                    var27.method233(-23827, var21, var22);
                                                }
                                                if (var27.field794 == 33 || var15.field1213[var18] != 1) {
                                                    int var30 = var15.field1213[var18];
                                                    this.field206.method22((byte) 6, var22 + 10 + var24, method180(this.field279, var30), var21 + 1 + var23, 0);
                                                    this.field206.method22((byte) 6, var22 + 9 + var24, method180(this.field279, var30), var21 + var23, 16776960);
                                                }
                                            }
                                        }
                                    }
                                    ++var18;
                                }
                            }
                        } else if (var15.field1242 == 3) {
                            boolean var32 = false;
                            if (this.field300 == var15.field1226 || this.field204 == var15.field1226 || this.field256 == var15.field1226) {
                                var32 = true;
                            }
                            int var33;
                            if (this.method175(this.field375, var15)) {
                                var33 = var15.field1174;
                                if (var32 && var15.field1216 != 0) {
                                    var33 = var15.field1216;
                                }
                            } else {
                                var33 = var15.field1212;
                                if (var32 && var15.field1243 != 0) {
                                    var33 = var15.field1243;
                                }
                            }
                            if (var15.field1250 == 0) {
                                if (var15.field1249) {
                                    class15.method214(var33, 435, var15.field1183, var16, var17, var15.field1187);
                                } else {
                                    class15.method215(var15.field1183, 479, var33, var15.field1187, var17, var16);
                                }
                            } else if (var15.field1249) {
                                class15.method213(-956, var33, var17, var15.field1187, 256 - (var15.field1250 & 255), var16, var15.field1183);
                            } else {
                                class15.method216(var16, var33, 256 - (var15.field1250 & 255), var15.field1183, var15.field1187, var17, (byte) -16);
                            }
                        } else if (var15.field1242 == 4) {
                            class4 var34 = var15.field1236;
                            String var35 = var15.field1224;
                            boolean var36 = false;
                            if (this.field300 == var15.field1226 || this.field204 == var15.field1226 || this.field256 == var15.field1226) {
                                var36 = true;
                            }
                            int var37;
                            if (this.method175(this.field375, var15)) {
                                var37 = var15.field1174;
                                if (var36 && var15.field1216 != 0) {
                                    var37 = var15.field1216;
                                }
                                if (var15.field1190.length() > 0) {
                                    var35 = var15.field1190;
                                }
                            } else {
                                var37 = var15.field1212;
                                if (var36 && var15.field1243 != 0) {
                                    var37 = var15.field1243;
                                }
                            }
                            if (var15.field1215 == 6 && this.field226) {
                                var35 = "Please wait...";
                                var37 = var15.field1212;
                            }
                            if (class15.field723 == 479) {
                                if (var37 == 16776960) {
                                    var37 = 255;
                                }
                                if (var37 == 49152) {
                                    var37 = 16777215;
                                }
                            }
                            int var38 = var34.field74 + var17;
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
                                                                        var35 = var35.substring(0, var43) + this.method120((byte) -18, this.method113(var15, (byte) -58, 4)) + var35.substring(var43 + 2);
                                                                    }
                                                                }
                                                                var35 = var35.substring(0, var42) + this.method120((byte) -18, this.method113(var15, (byte) -58, 3)) + var35.substring(var42 + 2);
                                                            }
                                                        }
                                                        var35 = var35.substring(0, var41) + this.method120((byte) -18, this.method113(var15, (byte) -58, 2)) + var35.substring(var41 + 2);
                                                    }
                                                }
                                                var35 = var35.substring(0, var40) + this.method120((byte) -18, this.method113(var15, (byte) -58, 1)) + var35.substring(var40 + 2);
                                            }
                                        }
                                        var35 = var35.substring(0, var39) + this.method120((byte) -18, this.method113(var15, (byte) -58, 0)) + var35.substring(var39 + 2);
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
                                if (var15.field1175) {
                                    var34.method19(var45, var15.field1225, var38, var37, 0, var15.field1187 / 2 + var16);
                                } else {
                                    var34.method26(var16, -968, var38, var15.field1225, var45, var37);
                                }
                                var38 += var34.field74;
                            }
                        } else if (var15.field1242 == 5) {
                            class22 var46;
                            if (this.method175(this.field375, var15)) {
                                var46 = var15.field1195;
                            } else {
                                var46 = var15.field1208;
                            }
                            if (var46 != null) {
                                var46.method233(-23827, var16, var17);
                            }
                        } else if (var15.field1242 == 6) {
                            int var47 = class59.field1607;
                            int var48 = class59.field1608;
                            class59.field1607 = var15.field1187 / 2 + var16;
                            class59.field1608 = var15.field1183 / 2 + var17;
                            int var49 = class59.field1611[var15.field1203] * var15.field1202 >> 16;
                            int var50 = class59.field1612[var15.field1203] * var15.field1202 >> 16;
                            boolean var51 = this.method175(this.field375, var15);
                            int var52;
                            if (var51) {
                                var52 = var15.field1211;
                            } else {
                                var52 = var15.field1210;
                            }
                            class42 var53;
                            if (var52 == -1) {
                                var53 = var15.method400(var51, (byte) -57, -1, -1);
                            } else {
                                class28 var54 = class28.field952[var52];
                                var53 = var15.method400(var51, (byte) -57, var54.field954[var15.field1209], var54.field955[var15.field1209]);
                            }
                            if (var53 != null) {
                                var53.method435(0, var15.field1204, 0, var15.field1203, 0, var49, var50);
                            }
                            class59.field1607 = var47;
                            class59.field1608 = var48;
                        } else {
                            if (var15.field1242 == 7) {
                                class4 var55 = var15.field1236;
                                int var56 = 0;
                                for (int var57 = 0; var57 < var15.field1183; ++var57) {
                                    for (int var58 = 0; var58 < var15.field1187; ++var58) {
                                        if (var15.field1201[var56] > 0) {
                                            class3 var59 = class3.method11(var15.field1201[var56] - 1);
                                            String var60 = String.valueOf(var59.field43);
                                            if (var59.field15 || var15.field1213[var56] != 1) {
                                                var60 = var60 + " x" + method188(-563, var15.field1213[var56]);
                                            }
                                            int var61 = (var15.field1177 + 115) * var58 + var16;
                                            int var62 = (var15.field1223 + 12) * var57 + var17;
                                            if (var15.field1175) {
                                                var55.method19(var60, var15.field1225, var62, var15.field1212, 0, var15.field1187 / 2 + var61);
                                            } else {
                                                var55.method26(var61, -968, var62, var15.field1225, var60, var15.field1212);
                                            }
                                        }
                                        ++var56;
                                    }
                                }
                            }
                            if (var15.field1242 == 8 && (this.field133 == var15.field1226 || this.field313 == var15.field1226 || this.field213 == var15.field1226) && this.field434 == 100) {
                                int var63 = 0;
                                int var64 = 0;
                                class4 var65 = this.field207;
                                String var66 = var15.field1224;
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
                                    int var75 = var65.method20(0, var74);
                                    if (var75 > var63) {
                                        var63 = var75;
                                    }
                                    var64 += var65.field74 + 1;
                                }
                                var63 += 6;
                                var64 += 7;
                                int var67 = var15.field1187 + var16 - 5 - var63;
                                int var68 = var15.field1183 + var17 + 5;
                                if (var67 < var16 + 5) {
                                    var67 = var16 + 5;
                                }
                                if (var63 + var67 > arg0.field1187 + arg4) {
                                    var67 = arg0.field1187 + arg4 - var63;
                                }
                                if (var64 + var68 > arg0.field1183 + arg2) {
                                    var68 = arg0.field1183 + arg2 - var64;
                                }
                                class15.method214(16777120, 435, var64, var67, var68, var63);
                                class15.method215(var64, 479, 0, var63, var68, var67);
                                String var69 = var15.field1224;
                                int var70 = var65.field74 + var68 + 2;
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
                                    var65.method26(var67 + 3, -968, var70, false, var72, 0);
                                    var70 += var65.field74 + 1;
                                }
                            }
                        }
                    }
                }
                int var12 = 83 / arg3;
                class15.method211(var7, var6, var9, var8, -39271);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(B)V")
    public final void method125(byte arg0) {
        int var2 = 5;
        this.field289[8] = 0;
        if (arg0 != -33) {
            field559 = !field559;
        }
        int var3 = 0;
        while (this.field289[8] == 0) {
            String var4 = "Unknown problem";
            this.method72(-618, 20, "Connecting to web server");
            try {
                DataInputStream var5 = this.method176("crc" + (int) (Math.random() * 9.9999999E7D) + "-" + 365);
                class38 var6 = new class38(0, new byte[40]);
                var5.readFully(var6.field1160, 0, 40);
                var5.close();
                for (int var7 = 0; var7 < 9; ++var7) {
                    this.field289[var7] = var6.method362();
                }
                int var8 = var6.method362();
                int var9 = 1234;
                for (int var10 = 0; var10 < 9; ++var10) {
                    var9 = (var9 << 1) + this.field289[var10];
                }
                if (var8 != var9) {
                    var4 = "checksum problem";
                    this.field289[8] = 0;
                }
            } catch (EOFException var13) {
                var4 = "EOF problem";
                this.field289[8] = 0;
            } catch (IOException var14) {
                var4 = "connection problem";
                this.field289[8] = 0;
            } catch (Exception var15) {
                var4 = "logic problem";
                this.field289[8] = 0;
                if (!signlink.reporterror) {
                    return;
                }
            }
            if (this.field289[8] == 0) {
                ++var3;
                for (int var11 = var2; var11 > 0; --var11) {
                    if (var3 >= 10) {
                        this.method72(-618, 10, "Game updated - please reload page");
                        var11 = 10;
                    } else {
                        this.method72(-618, 10, var4 + " - Will retry in " + var11 + " secs.");
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
                this.field254 = !this.field254;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLIBHUFTPE;II)V")
    public final void method126(boolean arg0, class22 arg1, int arg2, int arg3) {
        if (arg1 != null) {
            int var5 = this.field429 + this.field264 & 2047;
            int var6 = arg2 * arg2 + arg3 * arg3;
            if (var6 <= 6400) {
                int var7 = class42.field1359[var5];
                int var8 = class42.field1360[var5];
                int var9 = var7 * 256 / (this.field410 + 256);
                if (!arg0) {
                    int var10 = var8 * 256 / (this.field410 + 256);
                    int var11 = arg2 * var9 + arg3 * var10 >> 16;
                    int var12 = arg2 * var10 - arg3 * var9 >> 16;
                    if (var6 > 2500) {
                        arg1.method239(this.field487, 83 - var12 - arg1.field795 / 2 - 4, var11 + 94 - arg1.field794 / 2 + 4, false);
                    } else {
                        arg1.method233(-23827, var11 + 94 - arg1.field794 / 2 + 4, 83 - var12 - arg1.field795 / 2 - 4);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "k", descriptor = "(Z)V")
    public final void method127(boolean arg0) {
        if (!arg0) {
            this.method147();
        }
        if (super.field1278 == 1) {
            if (super.field1279 >= 539 && super.field1279 <= 573 && super.field1280 >= 169 && super.field1280 < 205 && this.field321[0] != -1) {
                this.field258 = true;
                this.field389 = 0;
                this.field149 = true;
            }
            if (super.field1279 >= 569 && super.field1279 <= 599 && super.field1280 >= 168 && super.field1280 < 205 && this.field321[1] != -1) {
                this.field258 = true;
                this.field389 = 1;
                this.field149 = true;
            }
            if (super.field1279 >= 597 && super.field1279 <= 627 && super.field1280 >= 168 && super.field1280 < 205 && this.field321[2] != -1) {
                this.field258 = true;
                this.field389 = 2;
                this.field149 = true;
            }
            if (super.field1279 >= 625 && super.field1279 <= 669 && super.field1280 >= 168 && super.field1280 < 203 && this.field321[3] != -1) {
                this.field258 = true;
                this.field389 = 3;
                this.field149 = true;
            }
            if (super.field1279 >= 666 && super.field1279 <= 696 && super.field1280 >= 168 && super.field1280 < 205 && this.field321[4] != -1) {
                this.field258 = true;
                this.field389 = 4;
                this.field149 = true;
            }
            if (super.field1279 >= 694 && super.field1279 <= 724 && super.field1280 >= 168 && super.field1280 < 205 && this.field321[5] != -1) {
                this.field258 = true;
                this.field389 = 5;
                this.field149 = true;
            }
            if (super.field1279 >= 722 && super.field1279 <= 756 && super.field1280 >= 169 && super.field1280 < 205 && this.field321[6] != -1) {
                this.field258 = true;
                this.field389 = 6;
                this.field149 = true;
            }
            if (super.field1279 >= 540 && super.field1279 <= 574 && super.field1280 >= 466 && super.field1280 < 502 && this.field321[7] != -1) {
                this.field258 = true;
                this.field389 = 7;
                this.field149 = true;
            }
            if (super.field1279 >= 572 && super.field1279 <= 602 && super.field1280 >= 466 && super.field1280 < 503 && this.field321[8] != -1) {
                this.field258 = true;
                this.field389 = 8;
                this.field149 = true;
            }
            if (super.field1279 >= 599 && super.field1279 <= 629 && super.field1280 >= 466 && super.field1280 < 503 && this.field321[9] != -1) {
                this.field258 = true;
                this.field389 = 9;
                this.field149 = true;
            }
            if (super.field1279 >= 627 && super.field1279 <= 671 && super.field1280 >= 467 && super.field1280 < 502 && this.field321[10] != -1) {
                this.field258 = true;
                this.field389 = 10;
                this.field149 = true;
            }
            if (super.field1279 >= 669 && super.field1279 <= 699 && super.field1280 >= 466 && super.field1280 < 503 && this.field321[11] != -1) {
                this.field258 = true;
                this.field389 = 11;
                this.field149 = true;
            }
            if (super.field1279 >= 696 && super.field1279 <= 726 && super.field1280 >= 466 && super.field1280 < 503 && this.field321[12] != -1) {
                this.field258 = true;
                this.field389 = 12;
                this.field149 = true;
            }
            if (super.field1279 >= 724 && super.field1279 <= 758 && super.field1280 >= 466 && super.field1280 < 502 && this.field321[13] != -1) {
                this.field258 = true;
                this.field389 = 13;
                this.field149 = true;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIILMYGSUHVG;)V")
    public final void method128(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, class39 arg7) {
        if (arg7.field1242 == 0 && arg7.field1214 != null && !arg7.field1247) {
            if (arg3 >= arg1 && arg5 >= arg4 && arg3 <= arg7.field1187 + arg1 && arg5 <= arg7.field1183 + arg4) {
                int var9 = arg7.field1214.length;
                if (arg6 == 2) {
                    for (int var10 = 0; var10 < var9; ++var10) {
                        int var11 = arg7.field1178[var10] + arg1;
                        int var12 = arg7.field1180[var10] + arg4 - arg0;
                        class39 var13 = class39.method402(arg7.field1214[var10]);
                        int var14 = var13.field1219 + var11;
                        int var15 = var13.field1191 + var12;
                        if ((var13.field1218 >= 0 || var13.field1243 != 0) && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                            if (var13.field1218 >= 0) {
                                this.field492 = var13.field1218;
                            } else {
                                this.field492 = var13.field1226;
                            }
                        }
                        if (var13.field1242 == 8 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                            this.field250 = var13.field1226;
                        }
                        if (var13.field1242 == 0) {
                            this.method128(var13.field1238, var14, arg2, arg3, var15, arg5, 2, var13);
                            if (var13.field1233 > var13.field1183) {
                                this.method109(arg5, var13, var13.field1183, true, var15, arg2, arg3, var13.field1187 + var14, var13.field1233);
                            }
                        } else {
                            if (var13.field1215 == 1 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                                boolean var16 = false;
                                if (var13.field1232 != 0) {
                                    var16 = this.method121(var13, 47294);
                                }
                                if (!var16) {
                                    this.field419[this.field261] = var13.field1234;
                                    this.field464[this.field261] = 639;
                                    this.field463[this.field261] = var13.field1226;
                                    ++this.field261;
                                }
                            }
                            if (var13.field1215 == 2 && this.field402 == 0 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                                String var17 = var13.field1237;
                                if (var17.indexOf(" ") != -1) {
                                    var17 = var17.substring(0, var17.indexOf(" "));
                                }
                                this.field419[this.field261] = var17 + " @gre@" + var13.field1192;
                                this.field464[this.field261] = 201;
                                this.field463[this.field261] = var13.field1226;
                                ++this.field261;
                            }
                            if (var13.field1215 == 3 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                                this.field419[this.field261] = "Close";
                                if (arg2 == 3) {
                                    this.field464[this.field261] = 141;
                                } else {
                                    this.field464[this.field261] = 78;
                                }
                                this.field463[this.field261] = var13.field1226;
                                ++this.field261;
                            }
                            if (var13.field1215 == 4 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                                this.field419[this.field261] = var13.field1234;
                                this.field464[this.field261] = 600;
                                this.field463[this.field261] = var13.field1226;
                                ++this.field261;
                            }
                            if (var13.field1215 == 5 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                                this.field419[this.field261] = var13.field1234;
                                this.field464[this.field261] = 645;
                                this.field463[this.field261] = var13.field1226;
                                ++this.field261;
                            }
                            if (var13.field1215 == 6 && !this.field226 && arg3 >= var14 && arg5 >= var15 && arg3 < var13.field1187 + var14 && arg5 < var13.field1183 + var15) {
                                this.field419[this.field261] = var13.field1234;
                                this.field464[this.field261] = 253;
                                this.field463[this.field261] = var13.field1226;
                                ++this.field261;
                            }
                            if (var13.field1242 == 2) {
                                int var18 = 0;
                                for (int var19 = 0; var19 < var13.field1183; ++var19) {
                                    for (int var20 = 0; var20 < var13.field1187; ++var20) {
                                        int var21 = (var13.field1177 + 32) * var20 + var14;
                                        int var22 = (var13.field1223 + 32) * var19 + var15;
                                        if (var18 < 20) {
                                            var21 += var13.field1176[var18];
                                            var22 += var13.field1217[var18];
                                        }
                                        if (arg3 >= var21 && arg5 >= var22 && arg3 < var21 + 32 && arg5 < var22 + 32) {
                                            this.field335 = var18;
                                            this.field336 = var13.field1226;
                                            if (var13.field1201[var18] > 0) {
                                                class3 var23 = class3.method11(var13.field1201[var18] - 1);
                                                if (this.field230 == 1 && var13.field1194) {
                                                    if (this.field232 != var13.field1226 || this.field231 != var18) {
                                                        this.field419[this.field261] = "Use " + this.field234 + " with @lre@" + var23.field43;
                                                        this.field464[this.field261] = 878;
                                                        this.field465[this.field261] = var23.field29;
                                                        this.field462[this.field261] = var18;
                                                        this.field463[this.field261] = var13.field1226;
                                                        ++this.field261;
                                                    }
                                                } else if (this.field402 == 1 && var13.field1194) {
                                                    if ((this.field404 & 16) == 16) {
                                                        this.field419[this.field261] = this.field405 + " @lre@" + var23.field43;
                                                        this.field464[this.field261] = 200;
                                                        this.field465[this.field261] = var23.field29;
                                                        this.field462[this.field261] = var18;
                                                        this.field463[this.field261] = var13.field1226;
                                                        ++this.field261;
                                                    }
                                                } else {
                                                    if (var13.field1194) {
                                                        for (int var24 = 4; var24 >= 3; --var24) {
                                                            if (var23.field12 != null && var23.field12[var24] != null) {
                                                                this.field419[this.field261] = var23.field12[var24] + " @lre@" + var23.field43;
                                                                if (var24 == 3) {
                                                                    this.field464[this.field261] = 635;
                                                                }
                                                                if (var24 == 4) {
                                                                    this.field464[this.field261] = 139;
                                                                }
                                                                this.field465[this.field261] = var23.field29;
                                                                this.field462[this.field261] = var18;
                                                                this.field463[this.field261] = var13.field1226;
                                                                ++this.field261;
                                                            } else if (var24 == 4) {
                                                                this.field419[this.field261] = "Drop @lre@" + var23.field43;
                                                                this.field464[this.field261] = 139;
                                                                this.field465[this.field261] = var23.field29;
                                                                this.field462[this.field261] = var18;
                                                                this.field463[this.field261] = var13.field1226;
                                                                ++this.field261;
                                                            }
                                                        }
                                                    }
                                                    if (var13.field1207) {
                                                        this.field419[this.field261] = "Use @lre@" + var23.field43;
                                                        this.field464[this.field261] = 25;
                                                        this.field465[this.field261] = var23.field29;
                                                        this.field462[this.field261] = var18;
                                                        this.field463[this.field261] = var13.field1226;
                                                        ++this.field261;
                                                    }
                                                    if (var13.field1194 && var23.field12 != null) {
                                                        for (int var25 = 2; var25 >= 0; --var25) {
                                                            if (var23.field12[var25] != null) {
                                                                this.field419[this.field261] = var23.field12[var25] + " @lre@" + var23.field43;
                                                                if (var25 == 0) {
                                                                    this.field464[this.field261] = 176;
                                                                }
                                                                if (var25 == 1) {
                                                                    this.field464[this.field261] = 212;
                                                                }
                                                                if (var25 == 2) {
                                                                    this.field464[this.field261] = 592;
                                                                }
                                                                this.field465[this.field261] = var23.field29;
                                                                this.field462[this.field261] = var18;
                                                                this.field463[this.field261] = var13.field1226;
                                                                ++this.field261;
                                                            }
                                                        }
                                                    }
                                                    if (var13.field1230 != null) {
                                                        for (int var26 = 4; var26 >= 0; --var26) {
                                                            if (var13.field1230[var26] != null) {
                                                                this.field419[this.field261] = var13.field1230[var26] + " @lre@" + var23.field43;
                                                                if (var26 == 0) {
                                                                    this.field464[this.field261] = 872;
                                                                }
                                                                if (var26 == 1) {
                                                                    this.field464[this.field261] = 348;
                                                                }
                                                                if (var26 == 2) {
                                                                    this.field464[this.field261] = 881;
                                                                }
                                                                if (var26 == 3) {
                                                                    this.field464[this.field261] = 829;
                                                                }
                                                                if (var26 == 4) {
                                                                    this.field464[this.field261] = 497;
                                                                }
                                                                this.field465[this.field261] = var23.field29;
                                                                this.field462[this.field261] = var18;
                                                                this.field463[this.field261] = var13.field1226;
                                                                ++this.field261;
                                                            }
                                                        }
                                                    }
                                                    this.field419[this.field261] = "Examine @lre@" + var23.field43;
                                                    this.field464[this.field261] = 1169;
                                                    this.field465[this.field261] = var23.field29;
                                                    this.field462[this.field261] = var18;
                                                    this.field463[this.field261] = var13.field1226;
                                                    ++this.field261;
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
    }

    @OriginalMember(owner = "client!client", name = "t", descriptor = "(I)V")
    public final void method129(int arg0) {
        if (arg0 != -33822) {
            this.field552 = this.field251.method357();
        }
        while (true) {
            class21 var2 = this.field437.method509();
            if (var2 == null) {
                return;
            }
            if (var2.field779 == 0) {
                class42.method412(var2.field781, 141, var2.field780);
                if ((this.field437.method504(var2.field781, (byte) -98) & 98) != 0) {
                    this.field258 = true;
                    if (this.field621 != -1 || this.field578 != -1) {
                        this.field308 = true;
                    }
                }
            }
            if (var2.field779 == 1 && var2.field780 != null) {
                class71.method599(var2.field780, true);
            }
            if (var2.field779 == 2 && this.field508 == var2.field781 && var2.field780 != null) {
                this.method136(var2.field780, false, this.field509);
            }
            if (var2.field779 == 3 && this.field326 == 1) {
                for (int var3 = 0; var3 < this.field401.length; ++var3) {
                    if (this.field246[var3] == var2.field781) {
                        this.field401[var3] = var2.field780;
                        if (var2.field780 == null) {
                            this.field246[var3] = -1;
                        }
                        break;
                    }
                    if (this.field247[var3] == var2.field781) {
                        this.field274[var3] = var2.field780;
                        if (var2.field780 == null) {
                            this.field247[var3] = -1;
                        }
                        break;
                    }
                }
            }
            if (var2.field779 == 93 && this.field437.method513(0, var2.field781)) {
                class55.method539(this.field437, 8, new class38(0, var2.field780));
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "u", descriptor = "(I)V")
    public final void method130(int arg0) {
        if (this.field520 > 1) {
            --this.field520;
        }
        if (this.field555 > 0) {
            --this.field555;
        }
        for (int var2 = 0; var2 < 5 && this.method171(918); ++var2) {
        }
        if (this.field210) {
            Object var3 = this.field309.field1715;
            synchronized (this.field309.field1715) {
                if (!field494) {
                    this.field309.field1711 = 0;
                } else if (super.field1278 != 0 || this.field309.field1711 >= 40) {
                    this.field426.method346(156, true);
                    this.field426.method347(0);
                    int var4 = this.field426.field1161;
                    int var5 = 0;
                    for (int var6 = 0; var6 < this.field309.field1711 && var4 - this.field426.field1161 < 240; ++var6) {
                        ++var5;
                        int var7 = this.field309.field1710[var6];
                        if (var7 < 0) {
                            var7 = 0;
                        } else if (var7 > 502) {
                            var7 = 502;
                        }
                        int var8 = this.field309.field1714[var6];
                        if (var8 < 0) {
                            var8 = 0;
                        } else if (var8 > 764) {
                            var8 = 764;
                        }
                        int var9 = var7 * 765 + var8;
                        if (this.field309.field1710[var6] == -1 && this.field309.field1714[var6] == -1) {
                            var8 = -1;
                            var7 = -1;
                            var9 = 524287;
                        }
                        if (this.field607 == var8 && this.field608 == var7) {
                            if (this.field450 < 2047) {
                                ++this.field450;
                            }
                        } else {
                            int var10 = var8 - this.field607;
                            this.field607 = var8;
                            int var11 = var7 - this.field608;
                            this.field608 = var7;
                            if (this.field450 < 8 && var10 >= -32 && var10 <= 31 && var11 >= -32 && var11 <= 31) {
                                var10 += 32;
                                var11 += 32;
                                this.field426.method348((this.field450 << 12) + (var10 << 6) + var11);
                                this.field450 = 0;
                            } else if (this.field450 < 8) {
                                this.field426.method350((this.field450 << 19) + 8388608 + var9);
                                this.field450 = 0;
                            } else {
                                this.field426.method351((this.field450 << 19) + -1073741824 + var9);
                                this.field450 = 0;
                            }
                        }
                    }
                    this.field426.method356(true, this.field426.field1161 - var4);
                    if (var5 >= this.field309.field1711) {
                        this.field309.field1711 = 0;
                    } else {
                        this.field309.field1711 -= var5;
                        for (int var12 = 0; var12 < this.field309.field1711; ++var12) {
                            this.field309.field1714[var12] = this.field309.field1714[var5 + var12];
                            this.field309.field1710[var12] = this.field309.field1710[var5 + var12];
                        }
                    }
                }
            }
            if (super.field1278 != 0) {
                long var13 = (super.field1281 - this.field293) / 50L;
                if (var13 > 4095L) {
                    var13 = 4095L;
                }
                this.field293 = super.field1281;
                int var15 = super.field1280;
                if (var15 < 0) {
                    var15 = 0;
                } else if (var15 > 502) {
                    var15 = 502;
                }
                int var16 = super.field1279;
                if (var16 < 0) {
                    var16 = 0;
                } else if (var16 > 764) {
                    var16 = 764;
                }
                int var17 = var15 * 765 + var16;
                byte var18 = 0;
                if (super.field1278 == 2) {
                    var18 = 1;
                }
                int var19 = (int) var13;
                this.field426.method346(127, true);
                this.field426.method388(-576, (var18 << 19) + (var19 << 20) + var17);
            }
            if (this.field237 > 0) {
                --this.field237;
            }
            if (super.field1282[1] == 1 || super.field1282[2] == 1 || super.field1282[3] == 1 || super.field1282[4] == 1) {
                this.field238 = true;
            }
            if (this.field238 && this.field237 <= 0) {
                this.field237 = 20;
                this.field238 = false;
                this.field426.method346(82, true);
                this.field426.method381(false, this.field428);
                this.field426.method348(this.field429);
            }
            if (super.field1269 && !this.field175) {
                this.field175 = true;
                this.field426.method346(163, true);
                this.field426.method347(1);
            }
            if (!super.field1269 && this.field175) {
                this.field175 = false;
                this.field426.method346(163, true);
                this.field426.method347(0);
            }
            this.method64((byte) 2);
            this.method132(true);
            this.method99(this.field343);
            ++this.field553;
            if (this.field553 > 750) {
                this.method167(false);
            }
            this.method166(-36249);
            this.method52((byte) -6);
            this.method78(44732);
            ++this.field590;
            if (this.field304 != 0) {
                this.field303 += 20;
                if (this.field303 >= 400) {
                    this.field304 = 0;
                }
            }
            if (this.field442 != 0) {
                ++this.field439;
                if (this.field439 >= 15) {
                    if (this.field442 == 2) {
                        this.field258 = true;
                    }
                    if (this.field442 == 3) {
                        this.field308 = true;
                    }
                    this.field442 = 0;
                }
            }
            if (this.field318 != 0) {
                ++this.field188;
                if (super.field1272 > this.field319 + 5 || super.field1272 < this.field319 - 5 || super.field1273 > this.field320 + 5 || super.field1273 < this.field320 - 5) {
                    this.field588 = true;
                }
                if (super.field1271 == 0) {
                    if (this.field318 == 2) {
                        this.field258 = true;
                    }
                    if (this.field318 == 3) {
                        this.field308 = true;
                    }
                    this.field318 = 0;
                    if (this.field588 && this.field188 >= 5) {
                        this.field336 = -1;
                        this.method165((byte) 106);
                        if (this.field336 == this.field316 && this.field335 != this.field317) {
                            class39 var20 = class39.method402(this.field316);
                            byte var21 = 0;
                            if (this.field294 == 1 && var20.field1232 == 206) {
                                var21 = 1;
                            }
                            if (var20.field1201[this.field335] <= 0) {
                                var21 = 0;
                            }
                            if (var20.field1231) {
                                int var22 = this.field317;
                                int var23 = this.field335;
                                var20.field1201[var23] = var20.field1201[var22];
                                var20.field1213[var23] = var20.field1213[var22];
                                var20.field1201[var22] = -1;
                                var20.field1213[var22] = 0;
                            } else if (var21 == 1) {
                                int var24 = this.field317;
                                int var25 = this.field335;
                                while (var24 != var25) {
                                    if (var24 > var25) {
                                        var20.method396(5, var24, var24 - 1);
                                        --var24;
                                    } else if (var24 < var25) {
                                        var20.method396(5, var24, var24 + 1);
                                        ++var24;
                                    }
                                }
                            } else {
                                var20.method396(5, this.field317, this.field335);
                            }
                            this.field426.method346(208, true);
                            this.field426.method348(this.field335);
                            this.field426.method348(this.field316);
                            this.field426.method373((byte) 6, var21);
                            this.field426.method380(this.field550, this.field317);
                        }
                    } else if ((this.field610 == 1 || this.method184(-39865, this.field261 - 1)) && this.field261 > 2) {
                        this.method185(6);
                    } else if (this.field261 > 0) {
                        this.method159(this.field261 - 1, 688);
                    }
                    this.field439 = 10;
                    super.field1278 = 0;
                }
            }
            if (class26.field865 != -1) {
                int var26 = class26.field865;
                int var27 = class26.field866;
                boolean var28 = this.method131(0, 0, 0, 0, 0, 0, true, true, var26, var27, field519.field945[0], field519.field944[0]);
                class26.field865 = -1;
                if (var28) {
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 1;
                    this.field303 = 0;
                }
            }
            if (super.field1278 == 1 && this.field292 != null) {
                this.field292 = null;
                this.field308 = true;
                super.field1278 = 0;
            }
            this.method162(false);
            if (arg0 <= 0) {
                this.field343 = this.field203.method483();
            }
            if (this.field505 == -1) {
                this.method150(false);
                this.method127(true);
                this.method94(this.field355);
            }
            if (super.field1271 == 1 || super.field1278 == 1) {
                ++this.field285;
            }
            if (this.field133 == 0 && this.field313 == 0 && this.field213 == 0) {
                if (this.field434 > 0) {
                    --this.field434;
                }
            } else if (this.field434 < 100) {
                ++this.field434;
                if (this.field434 == 100) {
                    if (this.field133 != 0) {
                        this.field308 = true;
                    }
                    if (this.field313 != 0) {
                        this.field258 = true;
                    }
                }
            }
            if (this.field326 == 2) {
                this.method90(15260);
            }
            if (this.field326 == 2 && this.field198) {
                this.method48(8);
            }
            for (int var29 = 0; var29 < 5; ++var29) {
                int var10002 = this.field543[var29]++;
            }
            this.method67((byte) 56);
            ++super.field1270;
            if (super.field1270 > 4500) {
                this.field555 = 250;
                super.field1270 -= 500;
                this.field426.method346(10, true);
            }
            ++this.field394;
            if (this.field394 > 500) {
                this.field394 = 0;
                int var30 = (int) (Math.random() * 8.0D);
                if ((var30 & 1) == 1) {
                    this.field147 += this.field148;
                }
                if ((var30 & 2) == 2) {
                    this.field445 += this.field446;
                }
                if ((var30 & 4) == 4) {
                    this.field242 += this.field243;
                }
            }
            if (this.field147 < -50) {
                this.field148 = 2;
            }
            if (this.field147 > 50) {
                this.field148 = -2;
            }
            if (this.field445 < -55) {
                this.field446 = 2;
            }
            if (this.field445 > 55) {
                this.field446 = -2;
            }
            if (this.field242 < -40) {
                this.field243 = 1;
            }
            if (this.field242 > 40) {
                this.field243 = -1;
            }
            ++this.field295;
            if (this.field295 > 500) {
                this.field295 = 0;
                int var31 = (int) (Math.random() * 8.0D);
                if ((var31 & 1) == 1) {
                    this.field264 += this.field265;
                }
                if ((var31 & 2) == 2) {
                    this.field410 += this.field411;
                }
            }
            if (this.field264 < -60) {
                this.field265 = 2;
            }
            if (this.field264 > 60) {
                this.field265 = -2;
            }
            if (this.field410 < -20) {
                this.field411 = 1;
            }
            if (this.field410 > 10) {
                this.field411 = -1;
            }
            ++field399;
            if (field399 > 161) {
                field399 = 0;
                this.field426.method346(168, true);
                this.field426.method350(15793049);
            }
            ++this.field554;
            if (this.field554 > 50) {
                this.field426.method346(204, true);
            }
            try {
                if (this.field417 != null && this.field426.field1161 > 0) {
                    this.field417.method578(-484, 0, this.field426.field1161, this.field426.field1160);
                    this.field426.field1161 = 0;
                    this.field554 = 0;
                }
            } catch (IOException var33) {
                this.method167(false);
            } catch (Exception var34) {
                this.method110((byte) -26);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIZZIIII)Z")
    public final boolean method131(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6, boolean arg7, int arg8, int arg9, int arg10, int arg11) {
        byte var13 = 104;
        byte var14 = 104;
        for (int var15 = 0; var15 < var13; ++var15) {
            for (int var39 = 0; var39 < var14; ++var39) {
                this.field591[var15][var39] = 0;
                this.field482[var15][var39] = 99999999;
            }
        }
        int var16 = arg11;
        int var17 = arg10;
        this.field591[arg11][arg10] = 99;
        this.field482[arg11][arg10] = 0;
        byte var18 = 0;
        int var19 = 0;
        this.field500[var18] = arg11;
        if (!arg6) {
            this.field418 = null;
        }
        int var40 = var18 + 1;
        this.field501[var18] = arg10;
        boolean var20 = false;
        int var21 = this.field500.length;
        int[][] var22 = this.field314[this.field452].field1024;
        while (var40 != var19) {
            var16 = this.field500[var19];
            var17 = this.field501[var19];
            var19 = (var19 + 1) % var21;
            if (arg8 == var16 && arg9 == var17) {
                var20 = true;
                break;
            }
            if (arg3 != 0) {
                if ((arg3 < 5 || arg3 == 10) && this.field314[this.field452].method332(arg9, var17, arg3 - 1, arg8, var16, (byte) 9, arg4)) {
                    var20 = true;
                    break;
                }
                if (arg3 < 10 && this.field314[this.field452].method333(arg8, var17, var16, arg4, 372, arg3 - 1, arg9)) {
                    var20 = true;
                    break;
                }
            }
            if (arg2 != 0 && arg0 != 0 && this.field314[this.field452].method334(arg8, arg2, arg0, var17, arg9, false, arg1, var16)) {
                var20 = true;
                break;
            }
            int var38 = this.field482[var16][var17] + 1;
            if (var16 > 0 && this.field591[var16 - 1][var17] == 0 && (var22[var16 - 1][var17] & 19398920) == 0) {
                this.field500[var40] = var16 - 1;
                this.field501[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field591[var16 - 1][var17] = 2;
                this.field482[var16 - 1][var17] = var38;
            }
            if (var16 < var13 - 1 && this.field591[var16 + 1][var17] == 0 && (var22[var16 + 1][var17] & 19399040) == 0) {
                this.field500[var40] = var16 + 1;
                this.field501[var40] = var17;
                var40 = (var40 + 1) % var21;
                this.field591[var16 + 1][var17] = 8;
                this.field482[var16 + 1][var17] = var38;
            }
            if (var17 > 0 && this.field591[var16][var17 - 1] == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field500[var40] = var16;
                this.field501[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field591[var16][var17 - 1] = 1;
                this.field482[var16][var17 - 1] = var38;
            }
            if (var17 < var14 - 1 && this.field591[var16][var17 + 1] == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field500[var40] = var16;
                this.field501[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field591[var16][var17 + 1] = 4;
                this.field482[var16][var17 + 1] = var38;
            }
            if (var16 > 0 && var17 > 0 && this.field591[var16 - 1][var17 - 1] == 0 && (var22[var16 - 1][var17 - 1] & 19398926) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field500[var40] = var16 - 1;
                this.field501[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field591[var16 - 1][var17 - 1] = 3;
                this.field482[var16 - 1][var17 - 1] = var38;
            }
            if (var16 < var13 - 1 && var17 > 0 && this.field591[var16 + 1][var17 - 1] == 0 && (var22[var16 + 1][var17 - 1] & 19399043) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 - 1] & 19398914) == 0) {
                this.field500[var40] = var16 + 1;
                this.field501[var40] = var17 - 1;
                var40 = (var40 + 1) % var21;
                this.field591[var16 + 1][var17 - 1] = 9;
                this.field482[var16 + 1][var17 - 1] = var38;
            }
            if (var16 > 0 && var17 < var14 - 1 && this.field591[var16 - 1][var17 + 1] == 0 && (var22[var16 - 1][var17 + 1] & 19398968) == 0 && (var22[var16 - 1][var17] & 19398920) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field500[var40] = var16 - 1;
                this.field501[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field591[var16 - 1][var17 + 1] = 6;
                this.field482[var16 - 1][var17 + 1] = var38;
            }
            if (var16 < var13 - 1 && var17 < var14 - 1 && this.field591[var16 + 1][var17 + 1] == 0 && (var22[var16 + 1][var17 + 1] & 19399136) == 0 && (var22[var16 + 1][var17] & 19399040) == 0 && (var22[var16][var17 + 1] & 19398944) == 0) {
                this.field500[var40] = var16 + 1;
                this.field501[var40] = var17 + 1;
                var40 = (var40 + 1) % var21;
                this.field591[var16 + 1][var17 + 1] = 12;
                this.field482[var16 + 1][var17 + 1] = var38;
            }
        }
        this.field170 = 0;
        if (!var20) {
            if (!arg7) {
                return false;
            }
            int var23 = 1000;
            int var24 = 100;
            byte var25 = 10;
            for (int var26 = arg8 - var25; var26 <= arg8 + var25; ++var26) {
                for (int var27 = arg9 - var25; var27 <= arg9 + var25; ++var27) {
                    if (var26 >= 0 && var27 >= 0 && var26 < 104 && var27 < 104 && this.field482[var26][var27] < 100) {
                        int var28 = 0;
                        if (var26 < arg8) {
                            var28 = arg8 - var26;
                        } else if (var26 > arg2 + arg8 - 1) {
                            var28 = var26 - (arg2 + arg8 - 1);
                        }
                        int var29 = 0;
                        if (var27 < arg9) {
                            var29 = arg9 - var27;
                        } else if (var27 > arg0 + arg9 - 1) {
                            var29 = var27 - (arg0 + arg9 - 1);
                        }
                        int var30 = var28 * var28 + var29 * var29;
                        if (var30 < var23 || var23 == var30 && this.field482[var26][var27] < var24) {
                            var23 = var30;
                            var24 = this.field482[var26][var27];
                            var16 = var26;
                            var17 = var27;
                        }
                    }
                }
            }
            if (var23 == 1000) {
                return false;
            }
            if (arg11 == var16 && arg10 == var17) {
                return false;
            }
            this.field170 = 1;
        }
        byte var31 = 0;
        this.field500[var31] = var16;
        int var41 = var31 + 1;
        this.field501[var31] = var17;
        int var32;
        int var33 = var32 = this.field591[var16][var17];
        while (arg11 != var16 || arg10 != var17) {
            if (var32 != var33) {
                var32 = var33;
                this.field500[var41] = var16;
                this.field501[var41++] = var17;
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
            var33 = this.field591[var16][var17];
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
            int var35 = this.field500[var41];
            int var36 = this.field501[var41];
            ++field457;
            if (field457 >= 96) {
                this.field426.method346(128, true);
                this.field426.method350(7618330);
                field457 = 0;
            }
            if (arg5 == 0) {
                this.field426.method346(1, true);
                this.field426.method347(var34 + var34 + 3);
            }
            if (arg5 == 1) {
                this.field426.method346(19, true);
                this.field426.method347(var34 + var34 + 3 + 14);
            }
            if (arg5 == 2) {
                this.field426.method346(18, true);
                this.field426.method347(var34 + var34 + 3);
            }
            this.field426.method374(164, super.field1282[5] == 1 ? 1 : 0);
            this.field426.method380(this.field550, this.field281 + var36);
            this.field372 = this.field500[0];
            this.field373 = this.field501[0];
            for (int var37 = 1; var37 < var34; ++var37) {
                --var41;
                this.field426.method374(164, this.field500[var41] - var35);
                this.field426.method373((byte) 6, this.field501[var41] - var36);
            }
            this.field426.method380(this.field550, this.field280 + var35);
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(Z)V")
    private final void method132(boolean arg0) {
        if (!arg0) {
            this.field418 = null;
        }
        if (this.field326 == 2) {
            for (class68 var2 = (class68) this.field189.method246(); var2 != null; var2 = (class68) this.field189.method248(true)) {
                if (var2.field1704 > 0) {
                    --var2.field1704;
                }
                if (var2.field1704 == 0) {
                    if (var2.field1697 < 0 || class55.method534(var2.field1699, (byte) 9, var2.field1697)) {
                        this.method135(var2.field1699, 40790, var2.field1697, var2.field1707, var2.field1706, var2.field1705, var2.field1708, var2.field1698);
                        var2.method589();
                    }
                } else {
                    if (var2.field1703 > 0) {
                        --var2.field1703;
                    }
                    if (var2.field1703 == 0 && var2.field1707 >= 1 && var2.field1708 >= 1 && var2.field1707 <= 102 && var2.field1708 <= 102 && (var2.field1700 < 0 || class55.method534(var2.field1702, (byte) 9, var2.field1700))) {
                        this.method135(var2.field1702, 40790, var2.field1700, var2.field1707, var2.field1706, var2.field1705, var2.field1708, var2.field1701);
                        var2.field1703 = -1;
                        if (var2.field1700 == var2.field1697 && var2.field1697 == -1) {
                            var2.method589();
                        } else if (var2.field1700 == var2.field1697 && var2.field1701 == var2.field1698 && var2.field1702 == var2.field1699) {
                            var2.method589();
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/String;Ljava/lang/String;Z)V")
    public final void method133(String arg0, String arg1, boolean arg2) {
        signlink.errorname = arg0;
        try {
            if (!arg2) {
                this.field460 = "";
                this.field461 = "Connecting to server...";
                this.method143(-941, true);
            }
            this.field417 = new class61(this, (byte) 0, this.method177(field377 + 43594));
            long var4 = class58.method547(arg0);
            int var6 = (int) (var4 >> 16 & 31L);
            this.field426.field1161 = 0;
            this.field426.method347(14);
            this.field426.method347(var6);
            this.field417.method578(-484, 0, 2, this.field426.field1160);
            for (int var7 = 0; var7 < 8; ++var7) {
                this.field417.method575();
            }
            int var8 = this.field417.method575();
            int var9 = var8;
            if (var8 == 0) {
                this.field417.method577(this.field251.field1160, 0, 8);
                this.field251.field1161 = 0;
                this.field414 = this.field251.method363(0);
                int[] var10 = new int[] { (int) (Math.random() * 9.9999999E7D), (int) (Math.random() * 9.9999999E7D), (int) (this.field414 >> 32), (int) this.field414 };
                this.field426.field1161 = 0;
                this.field426.method347(10);
                this.field426.method351(var10[0]);
                this.field426.method351(var10[1]);
                this.field426.method351(var10[2]);
                this.field426.method351(var10[3]);
                this.field426.method351(signlink.uid);
                this.field426.method354(arg0);
                this.field426.method354(arg1);
                this.field426.method372(0, field427, field481);
                this.field398.field1161 = 0;
                if (arg2) {
                    this.field398.method347(18);
                } else {
                    this.field398.method347(16);
                }
                this.field398.method347(this.field426.field1161 + 36 + 1 + 1 + 2);
                this.field398.method347(255);
                this.field398.method348(365);
                this.field398.method347(field379 ? 1 : 0);
                for (int var11 = 0; var11 < 9; ++var11) {
                    this.field398.method351(this.field289[var11]);
                }
                this.field398.method355(-641, this.field426.field1160, this.field426.field1161, 0);
                this.field426.field1165 = new class46(var10, true);
                for (int var12 = 0; var12 < 4; ++var12) {
                    var10[var12] += 50;
                }
                this.field203 = new class46(var10, true);
                this.field417.method578(-484, 0, this.field398.field1161, this.field398.field1160);
                var8 = this.field417.method575();
            }
            if (var8 == 1) {
                try {
                    Thread.sleep(2000L);
                } catch (Exception var22) {
                }
                this.method133(arg0, arg1, arg2);
            } else if (var8 == 2) {
                this.field433 = this.field417.method575();
                field494 = this.field417.method575() == 1;
                this.field293 = 0L;
                this.field450 = 0;
                this.field309.field1711 = 0;
                super.field1269 = true;
                this.field175 = true;
                this.field210 = true;
                this.field426.field1161 = 0;
                this.field251.field1161 = 0;
                this.field552 = -1;
                this.field357 = -1;
                this.field358 = -1;
                this.field359 = -1;
                this.field551 = 0;
                this.field553 = 0;
                this.field520 = 0;
                this.field555 = 0;
                this.field534 = 0;
                this.field261 = 0;
                this.field315 = false;
                super.field1270 = 0;
                for (int var13 = 0; var13 < 100; ++var13) {
                    this.field585[var13] = null;
                }
                this.field230 = 0;
                this.field402 = 0;
                this.field326 = 0;
                this.field329 = 0;
                this.field147 = (int) (Math.random() * 100.0D) - 50;
                this.field445 = (int) (Math.random() * 110.0D) - 55;
                this.field242 = (int) (Math.random() * 80.0D) - 40;
                this.field264 = (int) (Math.random() * 120.0D) - 60;
                this.field410 = (int) (Math.random() * 30.0D) - 20;
                this.field429 = (int) (Math.random() * 20.0D) - 10 & 2047;
                this.field215 = 0;
                this.field370 = -1;
                this.field372 = 0;
                this.field373 = 0;
                this.field153 = 0;
                this.field602 = 0;
                for (int var14 = 0; var14 < this.field150; ++var14) {
                    this.field152[var14] = null;
                    this.field157[var14] = null;
                }
                for (int var15 = 0; var15 < 16384; ++var15) {
                    this.field601[var15] = null;
                }
                field519 = this.field152[this.field151] = new class6();
                this.field386.method250();
                this.field306.method250();
                for (int var16 = 0; var16 < 4; ++var16) {
                    for (int var17 = 0; var17 < 104; ++var17) {
                        for (int var18 = 0; var18 < 104; ++var18) {
                            this.field418[var16][var17][var18] = null;
                        }
                    }
                }
                this.field189 = new class24(field559);
                this.field131 = 0;
                this.field130 = 0;
                this.method112(-681, this.field578);
                this.field578 = -1;
                this.method112(-681, this.field621);
                this.field621 = -1;
                this.method112(-681, this.field348);
                this.field348 = -1;
                this.method112(-681, this.field505);
                this.field505 = -1;
                this.method112(-681, this.field432);
                this.field432 = -1;
                this.method112(-681, this.field129);
                this.field129 = -1;
                this.method112(-681, this.field228);
                this.field228 = -1;
                this.field226 = false;
                this.field389 = 3;
                this.field533 = 0;
                this.field315 = false;
                this.field273 = false;
                this.field292 = null;
                this.field330 = 0;
                this.field467 = -1;
                this.field412 = true;
                this.method100(14877);
                for (int var19 = 0; var19 < 5; ++var19) {
                    this.field345[var19] = 0;
                }
                for (int var20 = 0; var20 < 5; ++var20) {
                    this.field395[var20] = null;
                    this.field396[var20] = false;
                }
                field415 = 0;
                field255 = 0;
                field227 = 0;
                field497 = 0;
                field457 = 0;
                field341 = 0;
                field333 = 0;
                field288 = 0;
                field351 = 0;
                field438 = 0;
                this.method51(0);
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
                this.field210 = true;
                this.field426.field1161 = 0;
                this.field251.field1161 = 0;
                this.field552 = -1;
                this.field357 = -1;
                this.field358 = -1;
                this.field359 = -1;
                this.field551 = 0;
                this.field553 = 0;
                this.field520 = 0;
                this.field261 = 0;
                this.field315 = false;
                this.field297 = System.currentTimeMillis();
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
                        if (this.field594 < 2) {
                            try {
                                Thread.sleep(2000L);
                            } catch (Exception var24) {
                            }
                            ++this.field594;
                            this.method133(arg0, arg1, arg2);
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
                int var21 = this.field417.method575();
                for (int var26 = var21 + 3; var26 >= 0; --var26) {
                    this.field460 = "You have only just left another world";
                    this.field461 = "Your profile will be transferred in: " + var26;
                    this.method143(-941, true);
                    try {
                        Thread.sleep(1200L);
                    } catch (Exception var23) {
                    }
                }
                this.method133(arg0, arg1, arg2);
            }
        } catch (IOException var25) {
            this.field460 = "";
            this.field461 = "Error connecting to server.";
        }
    }

    @OriginalMember(owner = "client!client", name = "init", descriptor = "()V")
    public final void init() {
        field376 = Integer.parseInt(this.getParameter("nodeid"));
        field377 = Integer.parseInt(this.getParameter("portoff"));
        String var1 = this.getParameter("lowmem");
        if (var1 != null && var1.equals("1")) {
            method164(true);
        } else {
            method142(0);
        }
        String var2 = this.getParameter("free");
        if (var2 != null && var2.equals("1")) {
            field378 = false;
        } else {
            field378 = true;
        }
        this.method406(503, 765, false);
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IZ)V")
    public final void method134(int arg0, boolean arg1) {
        signlink.wavevol = arg0;
        if (arg1) {
            this.field552 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIII)V")
    private final void method135(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7) {
        if (arg1 == 40790) {
            if (arg3 >= 1 && arg6 >= 1 && arg3 <= 102 && arg6 <= 102) {
                if (field379 && this.field452 != arg5) {
                    return;
                }
                int var9 = 0;
                boolean var10 = true;
                boolean var11 = false;
                boolean var12 = false;
                if (arg4 == 0) {
                    var9 = this.field451.method278(arg5, arg3, arg6);
                }
                if (arg4 == 1) {
                    var9 = this.field451.method279(arg3, 0, arg6, arg5);
                }
                if (arg4 == 2) {
                    var9 = this.field451.method280(arg5, arg3, arg6);
                }
                if (arg4 == 3) {
                    var9 = this.field451.method281(arg5, arg3, arg6);
                }
                if (var9 != 0) {
                    int var13 = this.field451.method282(arg5, arg3, arg6, var9);
                    int var14 = var9 >> 14 & 32767;
                    int var15 = var13 & 31;
                    int var16 = var13 >> 6;
                    if (arg4 == 0) {
                        this.field451.method269(arg6, arg5, -516, arg3);
                        class8 var17 = class8.method203(var14);
                        if (var17.field646) {
                            this.field314[arg5].method328(var17.field627, arg3, (byte) 2, var15, arg6, var16);
                        }
                    }
                    if (arg4 == 1) {
                        this.field451.method270(this.field161, arg6, arg3, arg5);
                    }
                    if (arg4 == 2) {
                        this.field451.method271(arg5, true, arg6, arg3);
                        class8 var18 = class8.method203(var14);
                        if (var18.field629 + arg3 > 103 || var18.field629 + arg6 > 103 || var18.field671 + arg3 > 103 || var18.field671 + arg6 > 103) {
                            return;
                        }
                        if (var18.field646) {
                            this.field314[arg5].method329(650, var16, arg6, var18.field629, arg3, var18.field671, var18.field627);
                        }
                    }
                    if (arg4 == 3) {
                        this.field451.method272(arg5, arg3, arg6, (byte) -89);
                        class8 var19 = class8.method203(var14);
                        if (var19.field646 && var19.field663) {
                            this.field314[arg5].method331((byte) -82, arg6, arg3);
                        }
                    }
                }
                if (arg2 >= 0) {
                    int var20 = arg5;
                    if (arg5 < 3 && (this.field249[1][arg3][arg6] & 2) == 2) {
                        var20 = arg5 + 1;
                    }
                    class55.method523(33254, arg0, arg5, arg7, this.field599, arg3, arg6, this.field314[arg5], var20, this.field451, arg2);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "([BZZ)V")
    public final void method136(byte[] arg0, boolean arg1, boolean arg2) {
        if (!arg1) {
            if (this.field493) {
                signlink.midifade = arg2 ? 1 : 0;
                signlink.midisave(arg0, arg0.length);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "v", descriptor = "(I)V")
    public final void method137(int arg0) {
        this.field384 = false;
        while (this.field146) {
            this.field384 = false;
            try {
                Thread.sleep(50L);
            } catch (Exception var3) {
            }
        }
        this.field530 = null;
        this.field531 = null;
        if (arg0 >= 0) {
            for (int var2 = 1; var2 > 0; ++var2) {
            }
        }
        this.field511 = null;
        this.field565 = null;
        this.field566 = null;
        this.field567 = null;
        this.field568 = null;
        this.field556 = null;
        this.field557 = null;
        this.field277 = null;
        this.field278 = null;
        this.field211 = null;
        this.field212 = null;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIIIIII)V")
    private final void method138(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
        if (arg3 == -33233) {
            class68 var11 = null;
            for (class68 var12 = (class68) this.field189.method246(); var12 != null; var12 = (class68) this.field189.method248(true)) {
                if (var12.field1705 == arg7 && var12.field1707 == arg8 && var12.field1708 == arg1 && var12.field1706 == arg4) {
                    var11 = var12;
                    break;
                }
            }
            if (var11 == null) {
                var11 = new class68();
                var11.field1705 = arg7;
                var11.field1706 = arg4;
                var11.field1707 = arg8;
                var11.field1708 = arg1;
                this.method84(var11, false);
                this.field189.method243(var11);
            }
            var11.field1700 = arg0;
            var11.field1702 = arg5;
            var11.field1701 = arg9;
            var11.field1703 = arg2;
            var11.field1704 = arg6;
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILIBHUFTPE;I)V")
    public final void method139(int arg0, int arg1, class22 arg2, int arg3) {
        int var5 = arg1 * arg1 + arg3 * arg3;
        if (arg0 == 31951) {
            if (var5 > 4225 && var5 < 90000) {
                int var6 = this.field429 + this.field264 & 2047;
                int var7 = class42.field1359[var6];
                int var8 = class42.field1360[var6];
                int var9 = var7 * 256 / (this.field410 + 256);
                int var10 = var8 * 256 / (this.field410 + 256);
                int var11 = arg1 * var9 + arg3 * var10 >> 16;
                int var12 = arg1 * var10 - arg3 * var9 >> 16;
                double var13 = Math.atan2((double) var11, (double) var12);
                int var15 = (int) (Math.sin(var13) * 63.0D);
                int var16 = (int) (Math.cos(var13) * 57.0D);
                this.field340.method238(20, 15, 83 - var16 - 20, var13, 15, 256, 20, (byte) 6, var15 + 94 + 4 - 10);
            } else {
                this.method126(false, arg2, arg1, arg3);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIII)Z")
    public final boolean method140(int arg0, int arg1, int arg2, int arg3) {
        int var5 = arg0 >> 14 & 32767;
        int var6 = this.field451.method282(this.field452, arg1, arg2, arg0);
        if (var6 == -1) {
            return false;
        } else {
            int var7 = var6 & 31;
            int var8 = var6 >> 6 & 3;
            if (var7 != 10 && var7 != 11 && var7 != 22) {
                this.method131(0, 0, 0, var7 + 1, var8, 2, true, true, arg1, arg2, field519.field945[0], field519.field944[0]);
            } else {
                class8 var9 = class8.method203(var5);
                int var10;
                int var11;
                if (var8 != 0 && var8 != 2) {
                    var10 = var9.field671;
                    var11 = var9.field629;
                } else {
                    var10 = var9.field629;
                    var11 = var9.field671;
                }
                int var12 = var9.field672;
                if (var8 != 0) {
                    var12 = (var12 >> 4 - var8) + (var12 << var8 & 15);
                }
                this.method131(var11, var12, var10, 0, 0, 2, true, true, arg1, arg2, field519.field945[0], field519.field944[0]);
            }
            ++field324;
            if (field324 > 1332) {
                field324 = 0;
                this.field426.method346(183, true);
                this.field426.method347(0);
                int var13 = this.field426.field1161;
                this.field426.method347(123);
                this.field426.method347(96);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field426.method348(63133);
                }
                this.field426.method348(30708);
                this.field426.method347(24);
                if ((int) (Math.random() * 2.0D) == 0) {
                    this.field426.method347(188);
                }
                this.field426.method347((int) (Math.random() * 256.0D));
                this.field426.method347((int) (Math.random() * 256.0D));
                this.field426.method347((int) (Math.random() * 256.0D));
                this.field426.method347(14);
                this.field426.method356(true, this.field426.field1161 - var13);
            }
            this.field301 = super.field1279;
            this.field302 = super.field1280;
            this.field304 = 2;
            this.field303 = 0;
            if (arg3 != 5) {
                this.field416 = this.field203.method483();
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "l", descriptor = "(B)V")
    public final void method141(byte arg0) {
        Graphics var2 = this.method119(0).getGraphics();
        var2.setColor(Color.black);
        if (arg0 != 85) {
            this.field552 = -1;
        }
        var2.fillRect(0, 0, 765, 503);
        this.method408(1, -52);
        if (this.field286) {
            this.field384 = false;
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
        if (this.field406) {
            this.field384 = false;
            var2.setFont(new Font("Helvetica", 1, 20));
            var2.setColor(Color.white);
            var2.drawString("Error - unable to load game!", 50, 50);
            var2.drawString("To play RuneScape make sure you play from", 50, 100);
            var2.drawString("http://www.runescape.com", 50, 150);
        }
        if (this.field589) {
            this.field384 = false;
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

    @OriginalMember(owner = "client!client", name = "w", descriptor = "(I)V")
    public static final void method142(int arg0) {
        class26.field831 = false;
        class59.field1602 = false;
        field379 = false;
        if (arg0 != 0) {
            for (int var1 = 1; var1 > 0; ++var1) {
            }
        }
        class55.field1536 = false;
        class8.field630 = false;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IZ)V")
    public final void method143(int arg0, boolean arg1) {
        this.method77(0);
        this.field219.method206((byte) 59);
        if (arg0 >= 0) {
            this.field426.method347(246);
        }
        this.field530.method38(-23827, 0, 0);
        short var3 = 360;
        short var4 = 200;
        if (this.field159 == 0) {
            int var5 = var4 / 2 + 80;
            this.field206.method19(this.field437.field1459, true, var5, 7711145, 0, var3 / 2);
            int var6 = var4 / 2 - 20;
            this.field208.method19("Welcome to RuneScape", true, var6, 16776960, 0, var3 / 2);
            int var17 = var6 + 30;
            int var7 = var3 / 2 - 80;
            int var8 = var4 / 2 + 20;
            this.field531.method38(-23827, var7 - 73, var8 - 20);
            this.field208.method19("New User", true, var8 + 5, 16777215, 0, var7);
            int var9 = var3 / 2 + 80;
            this.field531.method38(-23827, var9 - 73, var8 - 20);
            this.field208.method19("Existing User", true, var8 + 5, 16777215, 0, var9);
        }
        if (this.field159 == 2) {
            int var10 = var4 / 2 - 40;
            if (this.field460.length() > 0) {
                this.field208.method19(this.field460, true, var10 - 15, 16776960, 0, var3 / 2);
                this.field208.method19(this.field461, true, var10, 16776960, 0, var3 / 2);
                var10 += 30;
            } else {
                this.field208.method19(this.field461, true, var10 - 7, 16776960, 0, var3 / 2);
                var10 += 30;
            }
            this.field208.method26(var3 / 2 - 90, -968, var10, true, "Username: " + this.field483 + (this.field323 == 0 & field502 % 40 < 20 ? "@yel@|" : ""), 16777215);
            var10 += 15;
            this.field208.method26(var3 / 2 - 88, -968, var10, true, "Password: " + class58.method552((byte) 0, this.field484) + (this.field323 == 1 & field502 % 40 < 20 ? "@yel@|" : ""), 16777215);
            var10 += 15;
            if (!arg1) {
                int var11 = var3 / 2 - 80;
                int var12 = var4 / 2 + 50;
                this.field531.method38(-23827, var11 - 73, var12 - 20);
                this.field208.method19("Login", true, var12 + 5, 16777215, 0, var11);
                int var13 = var3 / 2 + 80;
                this.field531.method38(-23827, var13 - 73, var12 - 20);
                this.field208.method19("Cancel", true, var12 + 5, 16777215, 0, var13);
            }
        }
        if (this.field159 == 3) {
            this.field208.method19("Create a free account", true, var4 / 2 - 60, 16776960, 0, var3 / 2);
            int var14 = var4 / 2 - 35;
            this.field208.method19("To create a new account you need to", true, var14, 16777215, 0, var3 / 2);
            int var18 = var14 + 15;
            this.field208.method19("go back to the main RuneScape webpage", true, var18, 16777215, 0, var3 / 2);
            int var19 = var18 + 15;
            this.field208.method19("and choose the 'create account'", true, var19, 16777215, 0, var3 / 2);
            int var20 = var19 + 15;
            this.field208.method19("button near the top of that page.", true, var20, 16777215, 0, var3 / 2);
            int var21 = var20 + 15;
            int var15 = var3 / 2;
            int var16 = var4 / 2 + 50;
            this.field531.method38(-23827, var15 - 73, var16 - 20);
            this.field208.method19("Cancel", true, var16 + 5, 16777215, 0, var15);
        }
        this.field219.method207(super.field1264, (byte) 19, 171, 202);
        if (this.field296) {
            this.field296 = false;
            this.field217.method207(super.field1264, (byte) 19, 0, 128);
            this.field218.method207(super.field1264, (byte) 19, 371, 202);
            this.field222.method207(super.field1264, (byte) 19, 265, 0);
            this.field223.method207(super.field1264, (byte) 19, 265, 562);
            this.field224.method207(super.field1264, (byte) 19, 171, 128);
            this.field225.method207(super.field1264, (byte) 19, 171, 562);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZB)V")
    public final void method144(boolean arg0, byte arg1) {
        if (arg1 == 7) {
            boolean var3 = false;
        } else {
            this.method147();
        }
        for (int var4 = 0; var4 < this.field602; ++var4) {
            class1 var5 = this.field601[this.field603[var4]];
            int var6 = (this.field603[var4] << 14) + 536870912;
            if (var5 != null && var5.method1((byte) 9) && var5.field2.field1000 == arg0 && var5.field2.method318((byte) 97)) {
                int var7 = var5.field938 >> 7;
                int var8 = var5.field939 >> 7;
                if (var7 >= 0 && var7 < 104 && var8 >= 0 && var8 < 104) {
                    if (var5.field922 == 1 && (var5.field938 & 127) == 64 && (var5.field939 & 127) == 64) {
                        if (this.field337[var7][var8] == this.field163) {
                            continue;
                        }
                        this.field337[var7][var8] = this.field163;
                    }
                    if (!var5.field2.field977) {
                        var6 += Integer.MIN_VALUE;
                    }
                    this.field451.method263(this.field452, this.method68(0, var5.field939, var5.field938, this.field452), var5.field938, var5, var5.field939, (var5.field922 - 1) * 64 + 60, var5.field940, var5.field913, var6, (byte) -89);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(B)V")
    public final void method145(byte arg0) {
        short var2 = 256;
        if (this.field136 != arg0) {
            for (int var3 = 1; var3 > 0; ++var3) {
            }
        }
        for (int var4 = 10; var4 < 117; ++var4) {
            int var19 = (int) (Math.random() * 100.0D);
            if (var19 < 50) {
                this.field277[(var2 - 2 << 7) + var4] = 255;
            }
        }
        for (int var5 = 0; var5 < 100; ++var5) {
            int var16 = (int) (Math.random() * 124.0D) + 2;
            int var17 = (int) (Math.random() * 128.0D) + 128;
            int var18 = (var17 << 7) + var16;
            this.field277[var18] = 192;
        }
        for (int var6 = 1; var6 < var2 - 1; ++var6) {
            for (int var14 = 1; var14 < 127; ++var14) {
                int var15 = (var6 << 7) + var14;
                this.field278[var15] = (this.field277[var15 - 1] + this.field277[var15 + 1] + this.field277[var15 - 128] + this.field277[var15 + 128]) / 4;
            }
        }
        this.field165 += 128;
        if (this.field165 > this.field556.length) {
            this.field165 -= this.field556.length;
            int var7 = (int) (Math.random() * 12.0D);
            this.method154(-131, this.field511[var7]);
        }
        for (int var8 = 1; var8 < var2 - 1; ++var8) {
            for (int var11 = 1; var11 < 127; ++var11) {
                int var12 = (var8 << 7) + var11;
                int var13 = this.field278[var12 + 128] - this.field556[this.field165 + var12 & this.field556.length - 1] / 5;
                if (var13 < 0) {
                    var13 = 0;
                }
                this.field277[var12] = var13;
            }
        }
        for (int var9 = 0; var9 < var2 - 1; ++var9) {
            this.field499[var9] = this.field499[var9 + 1];
        }
        this.field499[var2 - 1] = (int) (Math.sin((double) field502 / 14.0D) * 16.0D + Math.sin((double) field502 / 15.0D) * 14.0D + Math.sin((double) field502 / 16.0D) * 12.0D);
        if (this.field503 > 0) {
            this.field503 -= 4;
        }
        if (this.field504 > 0) {
            this.field504 -= 4;
        }
        if (this.field503 == 0 && this.field504 == 0) {
            int var10 = (int) (Math.random() * 2000.0D);
            if (var10 == 0) {
                this.field503 = 1024;
            }
            if (var10 == 1) {
                this.field504 = 1024;
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IILMVHXDWGI;)V")
    private final void method146(int arg0, int arg1, class38 arg2) {
        this.field252 = 0;
        this.field155 = 0;
        this.method76(arg1, arg2, 75);
        this.method161(arg2, arg1, 0);
        this.method190(0, arg2, arg1);
        for (int var4 = 0; var4 < this.field252; ++var4) {
            int var6 = this.field253[var4];
            if (field502 != this.field601[var6].field923) {
                this.field601[var6].field2 = null;
                this.field601[var6] = null;
            }
        }
        if (arg0 == 14094) {
            if (arg2.field1161 != arg1) {
                signlink.reporterror(this.field483 + " size mismatch in getnpcpos - pos:" + arg2.field1161 + " psize:" + arg1);
                throw new RuntimeException("eek");
            } else {
                for (int var5 = 0; var5 < this.field602; ++var5) {
                    if (this.field601[this.field603[var5]] == null) {
                        signlink.reporterror(this.field483 + " null entry in npc list - pos:" + var5 + " size:" + this.field602);
                        throw new RuntimeException("eek");
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "()V")
    public final void method147() {
        this.method72(-618, 20, "Starting up");
        if (signlink.sunjava) {
            super.field1258 = 5;
        }
        if (field570) {
            this.field589 = true;
        } else {
            field570 = true;
            boolean var1 = false;
            String var2 = this.method105(false);
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
                this.field406 = true;
            } else {
                if (signlink.cache_dat != null) {
                    for (int var3 = 0; var3 < 5; ++var3) {
                        this.field361[var3] = new class48(signlink.cache_idx[var3], var3 + 1, 500000, 730, signlink.cache_dat);
                    }
                }
                try {
                    this.method125((byte) -33);
                    this.field604 = this.method81("title screen", 0, this.field289[1], 25, "title", 1);
                    this.field206 = new class4("p11_full", this.field604, true, false);
                    this.field207 = new class4("p12_full", this.field604, true, false);
                    this.field208 = new class4("b12_full", this.field604, true, false);
                    this.field209 = new class4("q8_full", this.field604, true, true);
                    this.method155((byte) 112);
                    this.method194(field135);
                    class23 var4 = this.method81("config", 0, this.field289[2], 30, "config", 2);
                    class23 var5 = this.method81("interface", 0, this.field289[3], 35, "interface", 3);
                    class23 var6 = this.method81("2d graphics", 0, this.field289[4], 40, "media", 4);
                    class23 var7 = this.method81("textures", 0, this.field289[6], 45, "textures", 6);
                    class23 var8 = this.method81("chat system", 0, this.field289[7], 50, "wordenc", 7);
                    class23 var9 = this.method81("sound effects", 0, this.field289[8], 55, "sounds", 8);
                    this.field249 = new byte[4][104][104];
                    this.field599 = new int[4][105][105];
                    this.field451 = new class26(104, this.field599, 458, 4, 104);
                    for (int var10 = 0; var10 < 4; ++var10) {
                        this.field314[var10] = new class31((byte) -99, 104, 104);
                    }
                    this.field374 = new class22(512, 512);
                    class23 var11 = this.method81("update list", 0, this.field289[5], 60, "versionlist", 5);
                    this.method72(-618, 60, "Connecting to update server");
                    this.field437 = new class53();
                    this.field437.method505(var11, this);
                    class71.method598(this.field437.method506(false));
                    class42.method411(this.field437.method514(true, 0), this.field437);
                    if (!field379) {
                        this.field508 = 0;
                        this.field509 = true;
                        this.field437.method516(2, this.field508);
                        while (this.field437.method499() > 0) {
                            this.method129(-33822);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var71) {
                            }
                            if (this.field437.field1480 > 3) {
                                this.method79("ondemand");
                                return;
                            }
                        }
                    }
                    this.method72(-618, 65, "Requesting animations");
                    int var12 = this.field437.method514(true, 1);
                    for (int var13 = 0; var13 < var12; ++var13) {
                        this.field437.method516(1, var13);
                    }
                    while (this.field437.method499() > 0) {
                        int var14 = var12 - this.field437.method499();
                        if (var14 > 0) {
                            this.method72(-618, 65, "Loading animations - " + var14 * 100 / var12 + "%");
                        }
                        this.method129(-33822);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var70) {
                        }
                        if (this.field437.field1480 > 3) {
                            this.method79("ondemand");
                            return;
                        }
                    }
                    this.method72(-618, 70, "Requesting models");
                    int var15 = this.field437.method514(true, 0);
                    for (int var16 = 0; var16 < var15; ++var16) {
                        int var17 = this.field437.method504(var16, (byte) -98);
                        if ((var17 & 1) != 0) {
                            this.field437.method516(0, var16);
                        }
                    }
                    int var18 = this.field437.method499();
                    while (this.field437.method499() > 0) {
                        int var19 = var18 - this.field437.method499();
                        if (var19 > 0) {
                            this.method72(-618, 70, "Loading models - " + var19 * 100 / var18 + "%");
                        }
                        this.method129(-33822);
                        try {
                            Thread.sleep(100L);
                        } catch (Exception var69) {
                        }
                    }
                    if (this.field361[0] != null) {
                        this.method72(-618, 75, "Requesting maps");
                        this.field437.method516(3, this.field437.method507(0, 47, 48, false));
                        this.field437.method516(3, this.field437.method507(1, 47, 48, false));
                        this.field437.method516(3, this.field437.method507(0, 48, 48, false));
                        this.field437.method516(3, this.field437.method507(1, 48, 48, false));
                        this.field437.method516(3, this.field437.method507(0, 49, 48, false));
                        this.field437.method516(3, this.field437.method507(1, 49, 48, false));
                        this.field437.method516(3, this.field437.method507(0, 47, 47, false));
                        this.field437.method516(3, this.field437.method507(1, 47, 47, false));
                        this.field437.method516(3, this.field437.method507(0, 48, 47, false));
                        this.field437.method516(3, this.field437.method507(1, 48, 47, false));
                        this.field437.method516(3, this.field437.method507(0, 48, 148, false));
                        this.field437.method516(3, this.field437.method507(1, 48, 148, false));
                        int var20 = this.field437.method499();
                        while (this.field437.method499() > 0) {
                            int var21 = var20 - this.field437.method499();
                            if (var21 > 0) {
                                this.method72(-618, 75, "Loading maps - " + var21 * 100 / var20 + "%");
                            }
                            this.method129(-33822);
                            try {
                                Thread.sleep(100L);
                            } catch (Exception var68) {
                            }
                        }
                    }
                    int var22 = this.field437.method514(true, 0);
                    for (int var23 = 0; var23 < var22; ++var23) {
                        int var24 = this.field437.method504(var23, (byte) -98);
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
                            this.field437.method501(0, var25, var23, field571);
                        }
                    }
                    this.field437.method510(3, field378);
                    if (!field379) {
                        int var26 = this.field437.method514(true, 2);
                        for (int var27 = 1; var27 < var26; ++var27) {
                            if (this.field437.method503(true, var27)) {
                                this.field437.method501(2, (byte) 1, var27, field571);
                            }
                        }
                    }
                    this.method72(-618, 80, "Unpacking media");
                    this.field486 = new class5(var6, "invback", 0);
                    this.field488 = new class5(var6, "chatback", 0);
                    this.field487 = new class5(var6, "mapback", 0);
                    this.field200 = new class5(var6, "backbase1", 0);
                    this.field201 = new class5(var6, "backbase2", 0);
                    this.field202 = new class5(var6, "backhmid1", 0);
                    for (int var28 = 0; var28 < 13; ++var28) {
                        this.field356[var28] = new class5(var6, "sideicons", var28);
                    }
                    this.field609 = new class22(var6, "compass", 0);
                    this.field340 = new class22(var6, "mapedge", 0);
                    this.field340.method230(-185);
                    for (int var29 = 0; var29 < 72; ++var29) {
                        this.field397[var29] = new class5(var6, "mapscene", var29);
                    }
                    for (int var30 = 0; var30 < 70; ++var30) {
                        this.field173[var30] = new class22(var6, "mapfunction", var30);
                    }
                    for (int var31 = 0; var31 < 5; ++var31) {
                        this.field347[var31] = new class22(var6, "hitmarks", var31);
                    }
                    for (int var32 = 0; var32 < 6; ++var32) {
                        this.field407[var32] = new class22(var6, "headicons_pk", var32);
                    }
                    for (int var33 = 0; var33 < 9; ++var33) {
                        this.field128[var33] = new class22(var6, "headicons_prayer", var33);
                    }
                    for (int var34 = 0; var34 < 6; ++var34) {
                        this.field385[var34] = new class22(var6, "headicons_hint", var34);
                    }
                    this.field409 = new class22(var6, "overlay_multiway", 0);
                    this.field382 = new class22(var6, "mapmarker", 0);
                    this.field383 = new class22(var6, "mapmarker", 1);
                    for (int var35 = 0; var35 < 8; ++var35) {
                        this.field459[var35] = new class22(var6, "cross", var35);
                    }
                    this.field611 = new class22(var6, "mapdots", 0);
                    this.field612 = new class22(var6, "mapdots", 1);
                    this.field613 = new class22(var6, "mapdots", 2);
                    this.field614 = new class22(var6, "mapdots", 3);
                    this.field615 = new class22(var6, "mapdots", 4);
                    this.field186 = new class5(var6, "scrollbar", 0);
                    this.field187 = new class5(var6, "scrollbar", 1);
                    this.field176 = new class5(var6, "redstone1", 0);
                    this.field177 = new class5(var6, "redstone2", 0);
                    this.field178 = new class5(var6, "redstone3", 0);
                    this.field179 = new class5(var6, "redstone1", 0);
                    this.field179.method35((byte) -18);
                    this.field180 = new class5(var6, "redstone2", 0);
                    this.field180.method35((byte) -18);
                    this.field538 = new class5(var6, "redstone1", 0);
                    this.field538.method36(false);
                    this.field539 = new class5(var6, "redstone2", 0);
                    this.field539.method36(false);
                    this.field540 = new class5(var6, "redstone3", 0);
                    this.field540.method36(false);
                    this.field541 = new class5(var6, "redstone1", 0);
                    this.field541.method35((byte) -18);
                    this.field541.method36(false);
                    this.field542 = new class5(var6, "redstone2", 0);
                    this.field542.method35((byte) -18);
                    this.field542.method36(false);
                    for (int var36 = 0; var36 < 2; ++var36) {
                        this.field387[var36] = new class5(var6, "mod_icons", var36);
                    }
                    class22 var37 = new class22(var6, "backleft1", 0);
                    this.field137 = new class11(var37.field791, var37.field790, this.method119(0), field425);
                    var37.method231(false, 0, 0);
                    class22 var38 = new class22(var6, "backleft2", 0);
                    this.field138 = new class11(var38.field791, var38.field790, this.method119(0), field425);
                    var38.method231(false, 0, 0);
                    class22 var39 = new class22(var6, "backright1", 0);
                    this.field139 = new class11(var39.field791, var39.field790, this.method119(0), field425);
                    var39.method231(false, 0, 0);
                    class22 var40 = new class22(var6, "backright2", 0);
                    this.field140 = new class11(var40.field791, var40.field790, this.method119(0), field425);
                    var40.method231(false, 0, 0);
                    class22 var41 = new class22(var6, "backtop1", 0);
                    this.field141 = new class11(var41.field791, var41.field790, this.method119(0), field425);
                    var41.method231(false, 0, 0);
                    class22 var42 = new class22(var6, "backvmid1", 0);
                    this.field142 = new class11(var42.field791, var42.field790, this.method119(0), field425);
                    var42.method231(false, 0, 0);
                    class22 var43 = new class22(var6, "backvmid2", 0);
                    this.field143 = new class11(var43.field791, var43.field790, this.method119(0), field425);
                    var43.method231(false, 0, 0);
                    class22 var44 = new class22(var6, "backvmid3", 0);
                    this.field144 = new class11(var44.field791, var44.field790, this.method119(0), field425);
                    var44.method231(false, 0, 0);
                    class22 var45 = new class22(var6, "backhmid2", 0);
                    this.field145 = new class11(var45.field791, var45.field790, this.method119(0), field425);
                    var45.method231(false, 0, 0);
                    int var46 = (int) (Math.random() * 21.0D) - 10;
                    int var47 = (int) (Math.random() * 21.0D) - 10;
                    int var48 = (int) (Math.random() * 21.0D) - 10;
                    int var49 = (int) (Math.random() * 41.0D) - 20;
                    for (int var50 = 0; var50 < 100; ++var50) {
                        if (this.field173[var50] != null) {
                            this.field173[var50].method229(field424, var47 + var49, var46 + var49, var48 + var49);
                        }
                        if (this.field397[var50] != null) {
                            this.field397[var50].method37(field424, var47 + var49, var46 + var49, var48 + var49);
                        }
                    }
                    this.method72(-618, 83, "Unpacking textures");
                    class59.method558(744, var7);
                    class59.method562(0.8D, (byte) 8);
                    class59.method557(field354, 20);
                    this.method72(-618, 86, "Unpacking config");
                    class28.method307((byte) 8, var4);
                    class8.method196(var4);
                    class45.method479((byte) 8, var4);
                    class3.method7(var4);
                    class30.method320(var4);
                    class33.method335((byte) 8, var4);
                    class34.method341((byte) 8, var4);
                    class51.method493((byte) 8, var4);
                    class47.method486((byte) 8, var4);
                    class3.field22 = field378;
                    if (!field379) {
                        this.method72(-618, 90, "Unpacking sounds");
                        byte[] var51 = var9.method242("sounds.dat", (byte[]) null);
                        class38 var52 = new class38(0, var51);
                        class64.method580((byte) 8, var52);
                    }
                    this.method72(-618, 95, "Unpacking interfaces");
                    class4[] var53 = new class4[] { this.field206, this.field207, this.field208, this.field209 };
                    class39.method401(true, var53, var5, var6);
                    this.method72(-618, 100, "Preparing game engine");
                    for (int var54 = 0; var54 < 33; ++var54) {
                        int var55 = 999;
                        int var56 = 0;
                        for (int var57 = 0; var57 < 34; ++var57) {
                            if (this.field487.field80[this.field487.field82 * var54 + var57] == 0) {
                                if (var55 == 999) {
                                    var55 = var57;
                                }
                            } else if (var55 != 999) {
                                var56 = var57;
                                break;
                            }
                        }
                        this.field579[var54] = var55;
                        this.field328[var54] = var56 - var55;
                    }
                    for (int var58 = 5; var58 < 156; ++var58) {
                        int var59 = 999;
                        int var60 = 0;
                        for (int var61 = 25; var61 < 172; ++var61) {
                            if (this.field487.field80[this.field487.field82 * var58 + var61] == 0 && (var61 > 34 || var58 > 34)) {
                                if (var59 == 999) {
                                    var59 = var61;
                                }
                            } else if (var59 != 999) {
                                var60 = var61;
                                break;
                            }
                        }
                        this.field275[var58 - 5] = var59 - 25;
                        this.field529[var58 - 5] = var60 - var59;
                    }
                    class59.method555(765, 503, 35982);
                    this.field518 = class59.field1613;
                    class59.method555(479, 96, 35982);
                    this.field515 = class59.field1613;
                    class59.method555(190, 261, 35982);
                    this.field516 = class59.field1613;
                    class59.method555(512, 334, 35982);
                    this.field517 = class59.field1613;
                    int[] var62 = new int[9];
                    for (int var63 = 0; var63 < 9; ++var63) {
                        int var64 = var63 * 32 + 128 + 15;
                        int var65 = var64 * 3 + 600;
                        int var66 = class59.field1611[var64];
                        var62[var63] = var65 * var66 >> 16;
                    }
                    class26.method288(334, 800, 512, true, var62, 500);
                    class43.method441(var8);
                    this.field309 = new class70(this, field172);
                    this.method169(this.field309, 10);
                    class49.field1425 = this;
                    class8.field659 = this;
                    class30.field993 = this;
                } catch (Exception var72) {
                    signlink.reporterror("loaderror " + this.field290 + " " + this.field592);
                    this.field286 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(Z)V")
    public final void method148(boolean arg0) {
        this.field462 = null;
        this.field463 = null;
        this.field464 = null;
        this.field465 = null;
        this.field419 = null;
        this.field311 = null;
        this.field312 = null;
        this.field448 = null;
        this.field245 = null;
        this.field401 = null;
        this.field274 = null;
        this.field246 = null;
        this.field247 = null;
        this.field176 = null;
        this.field177 = null;
        this.field178 = null;
        this.field179 = null;
        this.field180 = null;
        if (this.field309 != null) {
            this.field309.field1712 = false;
        }
        this.field309 = null;
        this.field611 = null;
        this.field612 = null;
        this.field613 = null;
        this.field614 = null;
        this.field615 = null;
        this.field397 = null;
        this.field173 = null;
        this.field356 = null;
        this.method157(false);
        this.field486 = null;
        this.field487 = null;
        this.field488 = null;
        this.field528 = null;
        this.field222 = null;
        this.field223 = null;
        this.field224 = null;
        this.field225 = null;
        this.field600 = null;
        this.field601 = null;
        this.field603 = null;
        this.field453 = null;
        this.field454 = null;
        this.field455 = null;
        this.field456 = null;
        this.field599 = null;
        this.field249 = null;
        this.field451 = null;
        this.field314 = null;
        this.field374 = null;
        this.field426 = null;
        this.field398 = null;
        this.field251 = null;
        this.field409 = null;
        this.field141 = null;
        this.field210 &= arg0;
        this.field142 = null;
        this.field143 = null;
        this.field144 = null;
        this.field145 = null;
        this.field137 = null;
        this.field138 = null;
        this.field139 = null;
        this.field140 = null;
        this.field152 = null;
        this.field154 = null;
        this.field156 = null;
        this.field157 = null;
        this.field253 = null;
        this.field591 = null;
        this.field482 = null;
        this.field500 = null;
        this.field501 = null;
        this.field337 = null;
        this.field220 = null;
        this.field221 = null;
        this.field217 = null;
        this.field218 = null;
        this.field219 = null;
        this.field609 = null;
        this.field347 = null;
        this.field407 = null;
        this.field128 = null;
        this.field385 = null;
        this.field459 = null;
        this.field418 = null;
        this.field189 = null;
        this.field580 = null;
        this.field240 = null;
        this.field162 = null;
        if (this.field437 != null) {
            this.field437.method511();
        }
        this.field437 = null;
        try {
            if (this.field417 != null) {
                this.field417.method574();
            }
        } catch (Exception var2) {
        }
        this.field417 = null;
        this.field200 = null;
        this.field201 = null;
        this.field202 = null;
        this.field390 = null;
        this.field391 = null;
        this.field392 = null;
        this.field538 = null;
        this.field539 = null;
        this.field540 = null;
        this.field541 = null;
        this.field542 = null;
        this.field386 = null;
        this.field306 = null;
        this.field513 = null;
        this.method137(-788);
        class8.method197(true);
        class30.method319(true);
        class3.method8(true);
        class39.method399(true);
        class45.field1386 = null;
        class33.field1044 = null;
        class13.field701 = null;
        class28.field952 = null;
        class34.field1053 = null;
        class34.field1065 = null;
        class51.field1440 = null;
        super.field1265 = null;
        class6.field90 = null;
        class59.method553(true);
        class26.method251(true);
        class42.method410(true);
        class71.method600(true);
        System.gc();
    }

    @OriginalMember(owner = "client!client", name = "x", descriptor = "(I)V")
    public final void method149(int arg0) {
        short var2 = 256;
        if (this.field503 > 0) {
            for (int var3 = 0; var3 < 256; ++var3) {
                if (this.field503 > 768) {
                    this.field565[var3] = this.method97(this.field567[var3], 1024 - this.field503, this.field566[var3], true);
                } else if (this.field503 > 256) {
                    this.field565[var3] = this.field567[var3];
                } else {
                    this.field565[var3] = this.method97(this.field566[var3], 256 - this.field503, this.field567[var3], true);
                }
            }
        } else if (this.field504 > 0) {
            for (int var4 = 0; var4 < 256; ++var4) {
                if (this.field504 > 768) {
                    this.field565[var4] = this.method97(this.field568[var4], 1024 - this.field504, this.field566[var4], true);
                } else if (this.field504 > 256) {
                    this.field565[var4] = this.field568[var4];
                } else {
                    this.field565[var4] = this.method97(this.field566[var4], 256 - this.field504, this.field568[var4], true);
                }
            }
        } else {
            for (int var5 = 0; var5 < 256; ++var5) {
                this.field565[var5] = this.field566[var5];
            }
        }
        for (int var6 = 0; var6 < 33920; ++var6) {
            this.field220.field686[var6] = this.field211.field789[var6];
        }
        int var7 = 0;
        int var8 = 1152;
        for (int var9 = 1; var9 < var2 - 1; ++var9) {
            int var23 = (var2 - var9) * this.field499[var9] / var2;
            int var24 = var23 + 22;
            if (var24 < 0) {
                var24 = 0;
            }
            var7 += var24;
            for (int var25 = var24; var25 < 128; ++var25) {
                int var26 = this.field277[var7++];
                if (var26 != 0) {
                    int var28 = 256 - var26;
                    int var29 = this.field565[var26];
                    int var30 = this.field220.field686[var8];
                    this.field220.field686[var8++] = ((var29 & 16711935) * var26 + (var30 & 16711935) * var28 & -16711936) + ((var29 & 65280) * var26 + (var30 & 65280) * var28 & 16711680) >> 8;
                } else {
                    ++var8;
                }
            }
            var8 += var24;
        }
        this.field220.method207(super.field1264, (byte) 19, 0, 0);
        this.field551 += arg0;
        for (int var10 = 0; var10 < 33920; ++var10) {
            this.field221.field686[var10] = this.field212.field789[var10];
        }
        int var11 = 0;
        int var12 = 1176;
        for (int var13 = 1; var13 < var2 - 1; ++var13) {
            int var14 = (var2 - var13) * this.field499[var13] / var2;
            int var15 = 103 - var14;
            int var16 = var12 + var14;
            for (int var17 = 0; var17 < var15; ++var17) {
                int var18 = this.field277[var11++];
                if (var18 != 0) {
                    int var20 = 256 - var18;
                    int var21 = this.field565[var18];
                    int var22 = this.field221.field686[var16];
                    this.field221.field686[var16++] = ((var21 & 16711935) * var18 + (var22 & 16711935) * var20 & -16711936) + ((var21 & 65280) * var18 + (var22 & 65280) * var20 & 16711680) >> 8;
                } else {
                    ++var16;
                }
            }
            var11 += 128 - var15;
            var12 = 128 - var15 - var14 + var16;
        }
        this.field221.method207(super.field1264, (byte) 19, 0, 637);
    }

    @OriginalMember(owner = "client!client", name = "m", descriptor = "(Z)V")
    public final void method150(boolean arg0) {
        if (arg0) {
            this.field416 = 248;
        }
        if (this.field215 == 0) {
            if (super.field1278 == 1) {
                int var2 = super.field1279 - 25 - 550;
                int var3 = super.field1280 - 5 - 4;
                if (var2 >= 0 && var3 >= 0 && var2 < 146 && var3 < 151) {
                    var2 -= 73;
                    var3 -= 75;
                    int var4 = this.field429 + this.field264 & 2047;
                    int var5 = class59.field1611[var4];
                    int var6 = class59.field1612[var4];
                    int var7 = (this.field410 + 256) * var5 >> 8;
                    int var8 = (this.field410 + 256) * var6 >> 8;
                    int var9 = var2 * var8 + var3 * var7 >> 11;
                    int var10 = var3 * var8 - var2 * var7 >> 11;
                    int var11 = field519.field938 + var9 >> 7;
                    int var12 = field519.field939 - var10 >> 7;
                    boolean var13 = this.method131(0, 0, 0, 0, 0, 1, true, true, var11, var12, field519.field945[0], field519.field944[0]);
                    if (var13) {
                        this.field426.method347(var2);
                        this.field426.method347(var3);
                        this.field426.method348(this.field429);
                        this.field426.method347(57);
                        this.field426.method347(this.field264);
                        this.field426.method347(this.field410);
                        this.field426.method347(89);
                        this.field426.method348(field519.field938);
                        this.field426.method348(field519.field939);
                        this.field426.method347(this.field170);
                        this.field426.method347(63);
                        return;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILJXGMYPJH;B)V")
    public final void method151(int arg0, class27 arg1, byte arg2) {
        this.method152(0, arg1.field939, arg0, arg1.field938);
        if (this.field532 == arg2) {
            boolean var4 = false;
        } else {
            this.field552 = this.field251.method357();
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(IIII)V")
    public final void method152(int arg0, int arg1, int arg2, int arg3) {
        if (arg3 >= 128 && arg1 >= 128 && arg3 <= 13056 && arg1 <= 13056) {
            int var5 = this.method68(0, arg1, arg3, this.field452) - arg2;
            int var6 = arg3 - this.field362;
            int var7 = var5 - this.field363;
            int var8 = arg1 - this.field364;
            int var9 = class42.field1359[this.field365];
            int var10 = class42.field1360[this.field365];
            int var11 = class42.field1359[this.field366];
            int var12 = class42.field1360[this.field366];
            int var13 = var6 * var12 + var8 * var11 >> 16;
            int var14 = var8 * var12 - var6 * var11 >> 16;
            int var16 = var7 * var10 - var9 * var14 >> 16;
            int var17 = var7 * var9 + var10 * var14 >> 16;
            if (arg0 != 0) {
                this.method147();
            }
            if (var17 >= 50) {
                this.field573 = (var13 << 9) / var17 + class59.field1607;
                this.field574 = (var16 << 9) / var17 + class59.field1608;
            } else {
                this.field573 = -1;
                this.field574 = -1;
            }
        } else {
            this.field573 = -1;
            this.field574 = -1;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Z)V")
    public final void method153(boolean arg0) {
        if (!this.field589 && !this.field286 && !this.field406) {
            ++field502;
            if (!this.field210) {
                this.method117(this.field167);
            } else {
                this.method130(this.field168);
            }
            this.method129(-33822);
            if (!arg0) {
                for (int var2 = 1; var2 > 0; ++var2) {
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ILBNGXLHWA;)V")
    public final void method154(int arg0, class5 arg1) {
        while (arg0 >= 0) {
            this.field168 = -311;
        }
        short var3 = 256;
        for (int var4 = 0; var4 < this.field556.length; ++var4) {
            this.field556[var4] = 0;
        }
        for (int var5 = 0; var5 < 5000; ++var5) {
            int var17 = (int) (Math.random() * 128.0D * (double) var3);
            this.field556[var17] = (int) (Math.random() * 256.0D);
        }
        for (int var6 = 0; var6 < 20; ++var6) {
            for (int var13 = 1; var13 < var3 - 1; ++var13) {
                for (int var15 = 1; var15 < 127; ++var15) {
                    int var16 = (var13 << 7) + var15;
                    this.field557[var16] = (this.field556[var16 - 1] + this.field556[var16 + 1] + this.field556[var16 - 128] + this.field556[var16 + 128]) / 4;
                }
            }
            int[] var14 = this.field556;
            this.field556 = this.field557;
            this.field557 = var14;
        }
        if (arg1 != null) {
            int var7 = 0;
            for (int var8 = 0; var8 < arg1.field83; ++var8) {
                for (int var9 = 0; var9 < arg1.field82; ++var9) {
                    if (arg1.field80[var7++] != 0) {
                        int var10 = var9 + 16 + arg1.field84;
                        int var11 = var8 + 16 + arg1.field85;
                        int var12 = (var11 << 7) + var10;
                        this.field556[var12] = 0;
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(B)V")
    public final void method155(byte arg0) {
        byte[] var2 = this.field604.method242("title.dat", (byte[]) null);
        class22 var3 = new class22(var2, this);
        this.field220.method206((byte) 59);
        var3.method231(false, 0, 0);
        this.field221.method206((byte) 59);
        var3.method231(false, -637, 0);
        this.field217.method206((byte) 59);
        var3.method231(false, -128, 0);
        this.field218.method206((byte) 59);
        var3.method231(false, -202, -371);
        this.field219.method206((byte) 59);
        var3.method231(false, -202, -171);
        this.field222.method206((byte) 59);
        var3.method231(false, 0, -265);
        this.field223.method206((byte) 59);
        var3.method231(false, -562, -265);
        this.field224.method206((byte) 59);
        var3.method231(false, -128, -171);
        this.field225.method206((byte) 59);
        var3.method231(false, -562, -171);
        if (arg0 == 112) {
            int[] var4 = new int[var3.field790];
            for (int var5 = 0; var5 < var3.field791; ++var5) {
                for (int var10 = 0; var10 < var3.field790; ++var10) {
                    var4[var10] = var3.field789[var3.field790 * var5 + (var3.field790 - var10 - 1)];
                }
                for (int var11 = 0; var11 < var3.field790; ++var11) {
                    var3.field789[var3.field790 * var5 + var11] = var4[var11];
                }
            }
            this.field220.method206((byte) 59);
            var3.method231(false, 382, 0);
            this.field221.method206((byte) 59);
            var3.method231(false, -255, 0);
            this.field217.method206((byte) 59);
            var3.method231(false, 254, 0);
            this.field218.method206((byte) 59);
            var3.method231(false, 180, -371);
            this.field219.method206((byte) 59);
            var3.method231(false, 180, -171);
            this.field222.method206((byte) 59);
            var3.method231(false, 382, -265);
            this.field223.method206((byte) 59);
            var3.method231(false, -180, -265);
            this.field224.method206((byte) 59);
            var3.method231(false, 254, -171);
            this.field225.method206((byte) 59);
            var3.method231(false, -180, -171);
            class22 var6 = new class22(this.field604, "logo", 0);
            this.field217.method206((byte) 59);
            var6.method233(-23827, 382 - var6.field790 / 2 - 128, 18);
            Object var7 = null;
            Object var8 = null;
            Object var9 = null;
            System.gc();
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZII)Ljava/lang/String;")
    public static final String method156(boolean arg0, int arg1, int arg2) {
        if (!arg0) {
            field425 = -343;
        }
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

    @OriginalMember(owner = "client!client", name = "n", descriptor = "(Z)V")
    public final void method157(boolean arg0) {
        signlink.midiplay = false;
        if (arg0) {
            this.field134 = -378;
        }
        signlink.midifade = 0;
        signlink.midi = "stop";
    }

    @OriginalMember(owner = "client!client", name = "y", descriptor = "(I)V")
    public final void method158(int arg0) {
        if (arg0 <= 0) {
            this.field552 = this.field251.method357();
        }
        for (class18 var2 = (class18) this.field306.method246(); var2 != null; var2 = (class18) this.field306.method248(true)) {
            if (this.field452 == var2.field764 && !var2.field762) {
                if (field502 >= var2.field770) {
                    var2.method221(-48, this.field590);
                    if (var2.field762) {
                        var2.method589();
                    } else {
                        this.field451.method263(var2.field764, var2.field767, var2.field765, var2, var2.field766, 60, 0, false, -1, (byte) -89);
                    }
                }
            } else {
                var2.method589();
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "f", descriptor = "(II)V")
    public final void method159(int arg0, int arg1) {
        int var3 = 90 / arg1;
        if (arg0 >= 0) {
            int var4 = this.field462[arg0];
            int var5 = this.field463[arg0];
            int var6 = this.field464[arg0];
            int var7 = this.field465[arg0];
            if (var6 >= 2000) {
                var6 -= 2000;
            }
            if (this.field533 != 0 && var6 != 1153) {
                this.field533 = 0;
                this.field308 = true;
            }
            if (var6 == 697 && this.method140(var7, var4, var5, 5)) {
                this.field426.method346(121, true);
                this.field426.method381(false, this.field232);
                this.field426.method380(this.field550, this.field281 + var5);
                this.field426.method380(this.field550, this.field233);
                this.field426.method381(false, this.field280 + var4);
                this.field426.method381(false, this.field231);
                this.field426.method348(var7 >> 14 & 32767);
            }
            if (var6 == 28) {
                String var8 = this.field419[arg0];
                int var9 = var8.indexOf("@whi@");
                if (var9 != -1) {
                    long var10 = class58.method547(var8.substring(var9 + 5).trim());
                    int var12 = -1;
                    for (int var13 = 0; var13 < this.field130; ++var13) {
                        if (this.field240[var13] == var10) {
                            var12 = var13;
                            break;
                        }
                    }
                    if (var12 != -1 && this.field162[var12] > 0) {
                        this.field308 = true;
                        this.field533 = 0;
                        this.field273 = true;
                        this.field241 = "";
                        this.field166 = 3;
                        this.field132 = this.field240[var12];
                        this.field342 = "Enter message to send to " + this.field580[var12];
                    }
                }
            }
            if (var6 == 1881) {
                int var14 = var7 >> 14 & 32767;
                class8 var15 = class8.method203(var14);
                String var16;
                if (var15.field641 != null) {
                    var16 = new String(var15.field641);
                } else {
                    var16 = "It's a " + var15.field670 + ".";
                }
                this.method102(4, var16, 0, "");
            }
            if (var6 == 1993) {
                class3 var17 = class3.method11(var7);
                String var18;
                if (var17.field14 != null) {
                    var18 = new String(var17.field14);
                } else {
                    var18 = "It's a " + var17.field43 + ".";
                }
                this.method102(4, var18, 0, "");
            }
            if (var6 == 1478) {
                this.method140(var7, var4, var5, 5);
                this.field426.method346(158, true);
                this.field426.method380(this.field550, this.field280 + var4);
                this.field426.method380(this.field550, var7 >> 14 & 32767);
                this.field426.method380(this.field550, this.field281 + var5);
            }
            if (var6 == 78) {
                this.method101(false);
            }
            if (var6 == 157) {
                class1 var19 = this.field601[var7];
                if (var19 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var19.field944[0], var19.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(95, true);
                    this.field426.method381(false, var7);
                }
            }
            if (var6 == 614) {
                String var20 = this.field419[arg0];
                int var21 = var20.indexOf("@whi@");
                if (var21 != -1) {
                    if (this.field348 == -1) {
                        this.method101(false);
                        this.field595 = var20.substring(var21 + 5).trim();
                        this.field563 = false;
                        this.field380 = this.field348 = class39.field1184;
                    } else {
                        this.method102(4, "Please close the interface you have open before using 'report abuse'", 0, "");
                    }
                }
            }
            if (var6 == 497) {
                this.field426.method346(116, true);
                this.field426.method348(var4);
                this.field426.method380(this.field550, var7);
                this.field426.method382(-379, var5);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 878) {
                this.field426.method346(188, true);
                this.field426.method348(this.field233);
                this.field426.method380(this.field550, this.field232);
                this.field426.method348(var5);
                this.field426.method382(-379, var7);
                this.field426.method380(this.field550, this.field231);
                this.field426.method380(this.field550, var4);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 600) {
                this.field426.method346(155, true);
                this.field426.method348(var5);
                class39 var22 = class39.method402(var5);
                if (var22.field1246 != null && var22.field1246[0][0] == 5) {
                    int var23 = var22.field1246[0][1];
                    this.field528[var23] = 1 - this.field528[var23];
                    this.method89(var23, -457);
                    this.field258 = true;
                }
            }
            if (var6 == 495) {
                class6 var24 = this.field152[var7];
                if (var24 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var24.field944[0], var24.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(230, true);
                    this.field426.method382(-379, this.field403);
                    this.field426.method348(var7);
                }
            }
            if (var6 == 956) {
                class1 var25 = this.field601[var7];
                if (var25 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var25.field944[0], var25.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    if ((var7 & 3) == 0) {
                        ++field415;
                    }
                    if (field415 >= 147) {
                        this.field426.method346(34, true);
                        this.field426.method351(0);
                        field415 = 0;
                    }
                    this.field426.method346(233, true);
                    this.field426.method348(var7);
                }
            }
            if (var6 == 881) {
                this.field426.method346(111, true);
                this.field426.method380(this.field550, var4);
                this.field426.method381(false, var7);
                this.field426.method348(var5);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 635) {
                this.field426.method346(51, true);
                this.field426.method382(-379, var5);
                this.field426.method380(this.field550, var7);
                this.field426.method380(this.field550, var4);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 592) {
                this.field426.method346(11, true);
                this.field426.method380(this.field550, var5);
                this.field426.method380(this.field550, var7);
                this.field426.method380(this.field550, var4);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 369) {
                class6 var26 = this.field152[var7];
                if (var26 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var26.field944[0], var26.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(139, true);
                    this.field426.method380(this.field550, var7);
                }
            }
            if (var6 == 212) {
                this.field426.method346(103, true);
                this.field426.method382(-379, var5);
                this.field426.method382(-379, var7);
                this.field426.method380(this.field550, var4);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 2) {
                if (!this.field315) {
                    this.field451.method290(super.field1279 - 4, super.field1280 - 4, 27004);
                } else {
                    this.field451.method290(var4 - 4, var5 - 4, 27004);
                }
            }
            if (var6 == 416) {
                class1 var27 = this.field601[var7];
                if (var27 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var27.field944[0], var27.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(101, true);
                    this.field426.method382(-379, this.field232);
                    this.field426.method382(-379, this.field233);
                    this.field426.method381(false, this.field231);
                    this.field426.method380(this.field550, var7);
                }
            }
            if (var6 == 314) {
                class6 var28 = this.field152[var7];
                if (var28 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var28.field944[0], var28.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    field255 += var7;
                    if (field255 >= 91) {
                        this.field426.method346(86, true);
                        this.field426.method348(51305);
                        field255 = 0;
                    }
                    this.field426.method346(91, true);
                    this.field426.method382(-379, var7);
                }
            }
            if (var6 == 732) {
                this.method140(var7, var4, var5, 5);
                this.field426.method346(201, true);
                this.field426.method380(this.field550, this.field280 + var4);
                this.field426.method381(false, this.field281 + var5);
                this.field426.method382(-379, var7 >> 14 & 32767);
            }
            if (var6 == 745) {
                boolean var29 = this.method131(0, 0, 0, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                if (!var29) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                }
                this.field301 = super.field1279;
                this.field302 = super.field1280;
                this.field304 = 2;
                this.field303 = 0;
                this.field426.method346(73, true);
                this.field426.method381(false, this.field280 + var4);
                this.field426.method382(-379, this.field281 + var5);
                this.field426.method380(this.field550, var7);
            }
            if (var6 == 872) {
                this.field426.method346(126, true);
                this.field426.method348(var4);
                this.field426.method382(-379, var5);
                this.field426.method348(var7);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 603) {
                boolean var31 = this.method131(0, 0, 0, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                if (!var31) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                }
                this.field301 = super.field1279;
                this.field302 = super.field1280;
                this.field304 = 2;
                this.field303 = 0;
                this.field426.method346(81, true);
                this.field426.method348(var7);
                this.field426.method380(this.field550, this.field280 + var4);
                this.field426.method382(-379, this.field281 + var5);
            }
            if (var6 == 912) {
                class1 var33 = this.field601[var7];
                if (var33 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var33.field944[0], var33.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(69, true);
                    this.field426.method382(-379, var7);
                }
            }
            if (var6 == 274) {
                class6 var34 = this.field152[var7];
                if (var34 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var34.field944[0], var34.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(112, true);
                    this.field426.method348(var7);
                }
            }
            if (var6 == 829) {
                this.field426.method346(175, true);
                this.field426.method348(var7);
                this.field426.method380(this.field550, var4);
                this.field426.method382(-379, var5);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 917 && this.method140(var7, var4, var5, 5)) {
                this.field426.method346(16, true);
                this.field426.method348(this.field281 + var5);
                this.field426.method381(false, this.field403);
                this.field426.method381(false, this.field280 + var4);
                this.field426.method382(-379, var7 >> 14 & 32767);
            }
            if (var6 == 176) {
                this.field426.method346(226, true);
                this.field426.method380(this.field550, var5);
                this.field426.method382(-379, var7);
                this.field426.method382(-379, var4);
                this.field439 = 0;
                this.field440 = var5;
                this.field441 = var4;
                this.field442 = 2;
                if (class39.method402(var5).field1181 == this.field348) {
                    this.field442 = 1;
                }
                if (class39.method402(var5).field1181 == this.field621) {
                    this.field442 = 3;
                }
            }
            if (var6 == 804) {
                class1 var35 = this.field601[var7];
                if (var35 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var35.field944[0], var35.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(210, true);
                    this.field426.method381(false, var7);
                }
            }
            if (var6 == 567) {
                class6 var36 = this.field152[var7];
                if (var36 != null) {
                    this.method131(1, 0, 1, 0, 0, 2, true, false, var36.field944[0], var36.field945[0], field519.field945[0], field519.field944[0]);
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(85, true);
                    this.field426.method380(this.field550, this.field231);
                    this.field426.method348(var7);
                    this.field426.method380(this.field550, this.field232);
                    this.field426.method380(this.field550, this.field233);
                }
            }
            if (var6 == 702) {
                field227 += this.field280;
                if (field227 >= 105) {
                    this.field426.method346(53, true);
                    this.field426.method347(45);
                    field227 = 0;
                }
                this.method140(var7, var4, var5, 5);
                this.field426.method346(14, true);
                this.field426.method381(false, this.field281 + var5);
                this.field426.method380(this.field550, var7 >> 14 & 32767);
                this.field426.method382(-379, this.field280 + var4);
            }
            if (var6 == 1581) {
                class1 var37 = this.field601[var7];
                if (var37 != null) {
                    class30 var38 = var37.field2;
                    if (var38.field988 != null) {
                        var38 = var38.method316(true);
                    }
                    if (var38 != null) {
                        String var39;
                        if (var38.field983 != null) {
                            var39 = new String(var38.field983);
                        } else {
                            var39 = "It's a " + var38.field973 + ".";
                        }
                        this.method102(4, var39, 0, "");
                    }
                }
            }
            if (var6 == 25) {
                this.field230 = 1;
                this.field231 = var4;
                this.field232 = var5;
                this.field233 = var7;
                this.field234 = String.valueOf(class3.method11(var7).field43);
                this.field402 = 0;
                this.field258 = true;
            } else {
                if (var6 == 253 && !this.field226) {
                    this.field426.method346(78, true);
                    this.field426.method348(var5);
                    this.field226 = true;
                }
                if (var6 == 191) {
                    class6 var40 = this.field152[var7];
                    if (var40 != null) {
                        this.method131(1, 0, 1, 0, 0, 2, true, false, var40.field944[0], var40.field945[0], field519.field945[0], field519.field944[0]);
                        this.field301 = super.field1279;
                        this.field302 = super.field1280;
                        this.field304 = 2;
                        this.field303 = 0;
                        this.field426.method346(138, true);
                        this.field426.method381(false, var7);
                    }
                }
                if (var6 == 639) {
                    class39 var41 = class39.method402(var5);
                    boolean var42 = true;
                    if (var41.field1232 > 0) {
                        var42 = this.method123(-887, var41);
                    }
                    if (var42) {
                        this.field426.method346(155, true);
                        this.field426.method348(var5);
                    }
                }
                if (var6 == 601) {
                    this.method140(var7, var4, var5, 5);
                    this.field426.method346(129, true);
                    this.field426.method382(-379, this.field280 + var4);
                    this.field426.method381(false, this.field281 + var5);
                    this.field426.method348(var7 >> 14 & 32767);
                }
                if (var6 == 194) {
                    boolean var43 = this.method131(0, 0, 0, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    if (!var43) {
                        this.method131(1, 0, 1, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    }
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(114, true);
                    this.field426.method348(var7);
                    this.field426.method348(this.field280 + var4);
                    this.field426.method380(this.field550, this.field281 + var5);
                }
                if (var6 == 644) {
                    boolean var45 = this.method131(0, 0, 0, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    if (!var45) {
                        this.method131(1, 0, 1, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    }
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(190, true);
                    this.field426.method381(false, var7);
                    this.field426.method382(-379, this.field281 + var5);
                    this.field426.method382(-379, this.field280 + var4);
                }
                if (var6 == 1169) {
                    class3 var47 = class3.method11(var7);
                    class39 var48 = class39.method402(var5);
                    String var49;
                    if (var48 != null && var48.field1213[var4] >= 100000) {
                        var49 = var48.field1213[var4] + " x " + var47.field43;
                    } else if (var47.field14 != null) {
                        var49 = new String(var47.field14);
                    } else {
                        var49 = "It's a " + var47.field43 + ".";
                    }
                    this.method102(4, var49, 0, "");
                }
                if (var6 == 645) {
                    this.field426.method346(155, true);
                    this.field426.method348(var5);
                    class39 var50 = class39.method402(var5);
                    if (var50.field1246 != null && var50.field1246[0][0] == 5) {
                        int var51 = var50.field1246[0][1];
                        if (this.field528[var51] != var50.field1239[0]) {
                            this.field528[var51] = var50.field1239[0];
                            this.method89(var51, -457);
                            this.field258 = true;
                        }
                    }
                }
                if (var6 == 141) {
                    this.method112(-681, this.field578);
                    this.field578 = -1;
                    this.field308 = true;
                }
                if (var6 == 200) {
                    this.field426.method346(4, true);
                    this.field426.method348(var7);
                    this.field426.method348(var5);
                    this.field426.method348(var4);
                    this.field426.method382(-379, this.field403);
                    this.field439 = 0;
                    this.field440 = var5;
                    this.field441 = var4;
                    this.field442 = 2;
                    if (class39.method402(var5).field1181 == this.field348) {
                        this.field442 = 1;
                    }
                    if (class39.method402(var5).field1181 == this.field621) {
                        this.field442 = 3;
                    }
                }
                if (var6 == 536 || var6 == 691) {
                    String var52 = this.field419[arg0];
                    int var53 = var52.indexOf("@whi@");
                    if (var53 != -1) {
                        String var54 = var52.substring(var53 + 5).trim();
                        String var55 = class58.method551(class58.method548(class58.method547(var54), 13452), 0);
                        boolean var56 = false;
                        for (int var57 = 0; var57 < this.field153; ++var57) {
                            class6 var58 = this.field152[this.field154[var57]];
                            if (var58 != null && var58.field93 != null && var58.field93.equalsIgnoreCase(var55)) {
                                this.method131(1, 0, 1, 0, 0, 2, true, false, var58.field944[0], var58.field945[0], field519.field945[0], field519.field944[0]);
                                if (var6 == 536) {
                                    this.field426.method346(138, true);
                                    this.field426.method381(false, this.field154[var57]);
                                }
                                if (var6 == 691) {
                                    field255 += var7;
                                    if (field255 >= 91) {
                                        this.field426.method346(86, true);
                                        this.field426.method348(51305);
                                        field255 = 0;
                                    }
                                    this.field426.method346(91, true);
                                    this.field426.method382(-379, this.field154[var57]);
                                }
                                var56 = true;
                                break;
                            }
                        }
                        if (!var56) {
                            this.method102(4, "Unable to find " + var55, 0, "");
                        }
                    }
                }
                if (var6 == 48) {
                    class6 var59 = this.field152[var7];
                    if (var59 != null) {
                        this.method131(1, 0, 1, 0, 0, 2, true, false, var59.field944[0], var59.field945[0], field519.field945[0], field519.field944[0]);
                        this.field301 = super.field1279;
                        this.field302 = super.field1280;
                        this.field304 = 2;
                        this.field303 = 0;
                        ++field497;
                        if (field497 >= 88) {
                            this.field426.method346(6, true);
                            this.field426.method348(33600);
                            field497 = 0;
                        }
                        this.field426.method346(140, true);
                        this.field426.method382(-379, var7);
                    }
                }
                if (var6 == 450) {
                    boolean var60 = this.method131(0, 0, 0, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    if (!var60) {
                        this.method131(1, 0, 1, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    }
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(222, true);
                    this.field426.method348(var7);
                    this.field426.method382(-379, this.field403);
                    this.field426.method380(this.field550, this.field280 + var4);
                    this.field426.method382(-379, this.field281 + var5);
                }
                if (var6 == 348) {
                    this.field426.method346(194, true);
                    this.field426.method348(var7);
                    this.field426.method382(-379, var5);
                    this.field426.method381(false, var4);
                    this.field439 = 0;
                    this.field440 = var5;
                    this.field441 = var4;
                    this.field442 = 2;
                    if (class39.method402(var5).field1181 == this.field348) {
                        this.field442 = 1;
                    }
                    if (class39.method402(var5).field1181 == this.field621) {
                        this.field442 = 3;
                    }
                }
                if (var6 == 344) {
                    boolean var62 = this.method131(0, 0, 0, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    if (!var62) {
                        this.method131(1, 0, 1, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                    }
                    this.field301 = super.field1279;
                    this.field302 = super.field1280;
                    this.field304 = 2;
                    this.field303 = 0;
                    this.field426.method346(117, true);
                    this.field426.method382(-379, this.field280 + var4);
                    this.field426.method380(this.field550, var7);
                    this.field426.method380(this.field550, this.field281 + var5);
                }
                if (var6 == 87 || var6 == 235 || var6 == 612 || var6 == 199) {
                    String var64 = this.field419[arg0];
                    int var65 = var64.indexOf("@whi@");
                    if (var65 != -1) {
                        long var66 = class58.method547(var64.substring(var65 + 5).trim());
                        if (var6 == 87) {
                            this.method178(var66, -678);
                        }
                        if (var6 == 235) {
                            this.method83(var66, (byte) -99);
                        }
                        if (var6 == 612) {
                            this.method103(986, var66);
                        }
                        if (var6 == 199) {
                            this.method63(var66, 7);
                        }
                    }
                }
                if (var6 == 201) {
                    class39 var68 = class39.method402(var5);
                    this.field402 = 1;
                    this.field403 = var5;
                    this.field404 = var68.field1185;
                    this.field230 = 0;
                    this.field258 = true;
                    String var69 = var68.field1237;
                    if (var69.indexOf(" ") != -1) {
                        var69 = var69.substring(0, var69.indexOf(" "));
                    }
                    String var70 = var68.field1237;
                    if (var70.indexOf(" ") != -1) {
                        var70 = var70.substring(var70.indexOf(" ") + 1);
                    }
                    this.field405 = var69 + " " + var68.field1192 + " " + var70;
                    if (this.field404 == 16) {
                        this.field258 = true;
                        this.field389 = 3;
                        this.field149 = true;
                    }
                } else {
                    if (var6 == 950) {
                        class1 var71 = this.field601[var7];
                        if (var71 != null) {
                            this.method131(1, 0, 1, 0, 0, 2, true, false, var71.field944[0], var71.field945[0], field519.field945[0], field519.field944[0]);
                            this.field301 = super.field1279;
                            this.field302 = super.field1280;
                            this.field304 = 2;
                            this.field303 = 0;
                            this.field426.method346(93, true);
                            this.field426.method348(var7);
                        }
                    }
                    if (var6 == 861) {
                        this.method140(var7, var4, var5, 5);
                        this.field426.method346(242, true);
                        this.field426.method382(-379, this.field280 + var4);
                        this.field426.method348(var7 >> 14 & 32767);
                        this.field426.method380(this.field550, this.field281 + var5);
                    }
                    if (var6 == 368) {
                        boolean var72 = this.method131(0, 0, 0, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                        if (!var72) {
                            this.method131(1, 0, 1, 0, 0, 2, true, false, var4, var5, field519.field945[0], field519.field944[0]);
                        }
                        this.field301 = super.field1279;
                        this.field302 = super.field1280;
                        this.field304 = 2;
                        this.field303 = 0;
                        this.field426.method346(38, true);
                        this.field426.method382(-379, this.field232);
                        this.field426.method380(this.field550, this.field281 + var5);
                        this.field426.method381(false, var7);
                        this.field426.method381(false, this.field233);
                        this.field426.method382(-379, this.field280 + var4);
                        this.field426.method382(-379, this.field231);
                    }
                    if (var6 == 139) {
                        this.field426.method346(27, true);
                        this.field426.method382(-379, var5);
                        this.field426.method380(this.field550, var7);
                        this.field426.method381(false, var4);
                        this.field439 = 0;
                        this.field440 = var5;
                        this.field441 = var4;
                        this.field442 = 2;
                        if (class39.method402(var5).field1181 == this.field348) {
                            this.field442 = 1;
                        }
                        if (class39.method402(var5).field1181 == this.field621) {
                            this.field442 = 3;
                        }
                    }
                    if (var6 == 372) {
                        class1 var74 = this.field601[var7];
                        if (var74 != null) {
                            this.method131(1, 0, 1, 0, 0, 2, true, false, var74.field944[0], var74.field945[0], field519.field945[0], field519.field944[0]);
                            this.field301 = super.field1279;
                            this.field302 = super.field1280;
                            this.field304 = 2;
                            this.field303 = 0;
                            this.field426.method346(221, true);
                            this.field426.method381(false, var7);
                            this.field426.method380(this.field550, this.field403);
                        }
                    }
                    this.field230 = 0;
                    this.field402 = 0;
                    this.field258 = true;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "g", descriptor = "(II)V")
    public final void method160(int arg0, int arg1) {
        class24 var3 = this.field418[this.field452][arg0][arg1];
        if (var3 == null) {
            this.field451.method273(this.field452, arg0, arg1);
        } else {
            int var4 = -99999999;
            class16 var5 = null;
            for (class16 var6 = (class16) var3.method246(); var6 != null; var6 = (class16) var3.method248(true)) {
                class3 var11 = class3.method11(var6.field735);
                int var12 = var11.field27;
                if (var11.field15) {
                    var12 = (var6.field734 + 1) * var12;
                }
                if (var12 > var4) {
                    var4 = var12;
                    var5 = var6;
                }
            }
            var3.method244(var5, 9);
            class16 var7 = null;
            class16 var8 = null;
            for (class16 var9 = (class16) var3.method246(); var9 != null; var9 = (class16) var3.method248(true)) {
                if (var5.field735 != var9.field735 && var7 == null) {
                    var7 = var9;
                }
                if (var5.field735 != var9.field735 && var7.field735 != var9.field735 && var8 == null) {
                    var8 = var9;
                }
            }
            int var10 = (arg1 << 7) + arg0 + 1610612736;
            this.field451.method259(var8, this.field452, arg0, var10, var5, var7, this.method68(0, arg1 * 128 + 64, arg0 * 128 + 64, this.field452), arg1, (byte) 1);
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(LMVHXDWGI;II)V")
    private final void method161(class38 arg0, int arg1, int arg2) {
        if (arg2 != 0) {
            field535 = !field535;
        }
        while (arg0.field1162 + 21 < arg1 * 8) {
            int var4 = arg0.method368(1, 14);
            if (var4 == 16383) {
                break;
            }
            if (this.field601[var4] == null) {
                this.field601[var4] = new class1();
            }
            class1 var5 = this.field601[var4];
            this.field603[this.field602++] = var4;
            var5.field923 = field502;
            int var6 = arg0.method368(1, 1);
            var5.field2 = class30.method315(arg0.method368(1, 13));
            int var7 = arg0.method368(1, 5);
            if (var7 > 15) {
                var7 -= 32;
            }
            int var8 = arg0.method368(1, 1);
            if (var8 == 1) {
                this.field156[this.field155++] = var4;
            }
            int var9 = arg0.method368(1, 5);
            if (var9 > 15) {
                var9 -= 32;
            }
            var5.field922 = var5.field2.field1005;
            var5.field941 = var5.field2.field1004;
            var5.field915 = var5.field2.field1001;
            var5.field916 = var5.field2.field984;
            var5.field917 = var5.field2.field1006;
            var5.field918 = var5.field2.field978;
            var5.field942 = var5.field2.field1011;
            var5.method306(field519.field945[0] + var7, var6 == 1, field519.field944[0] + var9, this.field291);
        }
        arg0.method369(49924);
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(Z)V")
    public final void method162(boolean arg0) {
        if (this.field318 == 0) {
            int var2 = super.field1278;
            if (arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            if (this.field402 == 1 && super.field1279 >= 516 && super.field1280 >= 160 && super.field1279 <= 765 && super.field1280 <= 205) {
                var2 = 0;
            }
            if (this.field315) {
                if (var2 != 1) {
                    int var4 = super.field1272;
                    int var5 = super.field1273;
                    if (this.field544 == 0) {
                        var4 -= 4;
                        var5 -= 4;
                    }
                    if (this.field544 == 1) {
                        var4 -= 553;
                        var5 -= 205;
                    }
                    if (this.field544 == 2) {
                        var4 -= 17;
                        var5 -= 357;
                    }
                    if (var4 < this.field545 - 10 || var4 > this.field547 + this.field545 + 10 || var5 < this.field546 - 10 || var5 > this.field548 + this.field546 + 10) {
                        this.field315 = false;
                        if (this.field544 == 1) {
                            this.field258 = true;
                        }
                        if (this.field544 == 2) {
                            this.field308 = true;
                        }
                    }
                }
                if (var2 == 1) {
                    int var6 = this.field545;
                    int var7 = this.field546;
                    int var8 = this.field547;
                    int var9 = super.field1279;
                    int var10 = super.field1280;
                    if (this.field544 == 0) {
                        var9 -= 4;
                        var10 -= 4;
                    }
                    if (this.field544 == 1) {
                        var9 -= 553;
                        var10 -= 205;
                    }
                    if (this.field544 == 2) {
                        var9 -= 17;
                        var10 -= 357;
                    }
                    int var11 = -1;
                    for (int var12 = 0; var12 < this.field261; ++var12) {
                        int var13 = (this.field261 - 1 - var12) * 15 + var7 + 31;
                        if (var9 > var6 && var9 < var6 + var8 && var10 > var13 - 13 && var10 < var13 + 3) {
                            var11 = var12;
                        }
                    }
                    if (var11 != -1) {
                        this.method159(var11, 688);
                    }
                    this.field315 = false;
                    if (this.field544 == 1) {
                        this.field258 = true;
                    }
                    if (this.field544 == 2) {
                        this.field308 = true;
                        return;
                    }
                }
            } else {
                if (var2 == 1 && this.field261 > 0) {
                    int var14 = this.field464[this.field261 - 1];
                    if (var14 == 872 || var14 == 348 || var14 == 881 || var14 == 829 || var14 == 497 || var14 == 176 || var14 == 212 || var14 == 592 || var14 == 635 || var14 == 139 || var14 == 25 || var14 == 1169) {
                        int var15 = this.field462[this.field261 - 1];
                        int var16 = this.field463[this.field261 - 1];
                        class39 var17 = class39.method402(var16);
                        if (var17.field1179 || var17.field1231) {
                            this.field588 = false;
                            this.field188 = 0;
                            this.field316 = var16;
                            this.field317 = var15;
                            this.field318 = 2;
                            this.field319 = super.field1279;
                            this.field320 = super.field1280;
                            if (class39.method402(var16).field1181 == this.field348) {
                                this.field318 = 1;
                            }
                            if (class39.method402(var16).field1181 == this.field621) {
                                this.field318 = 3;
                            }
                            return;
                        }
                    }
                }
                if (var2 == 1 && (this.field610 == 1 || this.method184(-39865, this.field261 - 1)) && this.field261 > 2) {
                    var2 = 2;
                }
                if (var2 == 1 && this.field261 > 0) {
                    this.method159(this.field261 - 1, 688);
                }
                if (var2 != 2 || this.field261 <= 0) {
                    return;
                }
                this.method185(6);
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIIII)V")
    public final void method163(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
        int var8 = 2048 - arg5 & 2047;
        int var9 = 2048 - arg4 & 2047;
        int var10 = 0;
        int var11 = 0;
        int var12 = arg0;
        if (var8 != 0) {
            int var13 = class42.field1359[var8];
            int var14 = class42.field1360[var8];
            int var15 = var11 * var14 - arg0 * var13 >> 16;
            var12 = var11 * var13 + arg0 * var14 >> 16;
            var11 = var15;
        }
        if (var9 != 0) {
            int var16 = class42.field1359[var9];
            int var17 = class42.field1360[var9];
            int var18 = var10 * var17 + var12 * var16 >> 16;
            var12 = var12 * var17 - var10 * var16 >> 16;
            var10 = var18;
        }
        this.field362 = arg6 - var10;
        this.field363 = arg1 - var11;
        this.field364 = arg3 - var12;
        if (this.field620 == arg2) {
            this.field365 = arg5;
            this.field366 = arg4;
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(Z)V")
    public static final void method164(boolean arg0) {
        class26.field831 = true;
        class59.field1602 = true;
        field379 = true;
        class55.field1536 = true;
        class8.field630 = true;
        if (arg0) {
            ;
        }
    }

    @OriginalMember(owner = "client!client", name = "o", descriptor = "(B)V")
    public final void method165(byte arg0) {
        if (this.field318 == 0) {
            this.field419[0] = "Cancel";
            this.field464[0] = 1153;
            this.field261 = 1;
            if (this.field505 != -1) {
                this.field492 = 0;
                this.field250 = 0;
                this.method128(0, 0, 0, super.field1272, 0, super.field1273, 2, class39.method402(this.field505));
                if (this.field492 != this.field256) {
                    this.field256 = this.field492;
                }
                if (this.field250 != this.field213) {
                    this.field213 = this.field250;
                }
            } else {
                this.method183(-897);
                this.field492 = 0;
                this.field250 = 0;
                if (super.field1272 > 4 && super.field1273 > 4 && super.field1272 < 516 && super.field1273 < 338) {
                    if (this.field348 != -1) {
                        this.method128(0, 4, 0, super.field1272, 4, super.field1273, 2, class39.method402(this.field348));
                    } else {
                        this.method189(this.field617);
                    }
                }
                if (this.field492 != this.field256) {
                    this.field256 = this.field492;
                }
                if (this.field250 != this.field213) {
                    this.field213 = this.field250;
                }
                this.field492 = 0;
                this.field250 = 0;
                if (super.field1272 > 553 && super.field1273 > 205 && super.field1272 < 743 && super.field1273 < 466) {
                    if (this.field129 != -1) {
                        this.method128(0, 553, 1, super.field1272, 205, super.field1273, 2, class39.method402(this.field129));
                    } else if (this.field321[this.field389] != -1) {
                        this.method128(0, 553, 1, super.field1272, 205, super.field1273, 2, class39.method402(this.field321[this.field389]));
                    }
                }
                if (this.field492 != this.field204) {
                    this.field258 = true;
                    this.field204 = this.field492;
                }
                if (this.field313 != this.field250) {
                    this.field258 = true;
                    this.field313 = this.field250;
                }
                this.field492 = 0;
                if (arg0 == 106) {
                    this.field250 = 0;
                    if (super.field1272 > 17 && super.field1273 > 357 && super.field1272 < 496 && super.field1273 < 453) {
                        if (this.field621 != -1) {
                            this.method128(0, 17, 2, super.field1272, 357, super.field1273, 2, class39.method402(this.field621));
                        } else if (this.field578 != -1) {
                            this.method128(0, 17, 3, super.field1272, 357, super.field1273, 2, class39.method402(this.field578));
                        } else if (super.field1273 < 434 && super.field1272 < 426 && this.field533 == 0) {
                            this.method50(super.field1273 - 357, super.field1272 - 17, false);
                        }
                    }
                    if ((this.field621 != -1 || this.field578 != -1) && this.field492 != this.field300) {
                        this.field308 = true;
                        this.field300 = this.field492;
                    }
                    if ((this.field621 != -1 || this.field578 != -1) && this.field250 != this.field133) {
                        this.field308 = true;
                        this.field133 = this.field250;
                    }
                    boolean var2 = false;
                    while (!var2) {
                        var2 = true;
                        for (int var3 = 0; var3 < this.field261 - 1; ++var3) {
                            if (this.field464[var3] < 1000 && this.field464[var3 + 1] > 1000) {
                                String var4 = this.field419[var3];
                                this.field419[var3] = this.field419[var3 + 1];
                                this.field419[var3 + 1] = var4;
                                int var5 = this.field464[var3];
                                this.field464[var3] = this.field464[var3 + 1];
                                this.field464[var3 + 1] = var5;
                                int var6 = this.field462[var3];
                                this.field462[var3] = this.field462[var3 + 1];
                                this.field462[var3 + 1] = var6;
                                int var7 = this.field463[var3];
                                this.field463[var3] = this.field463[var3 + 1];
                                this.field463[var3 + 1] = var7;
                                int var8 = this.field465[var3];
                                this.field465[var3] = this.field465[var3 + 1];
                                this.field465[var3 + 1] = var8;
                                var2 = false;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "z", descriptor = "(I)V")
    public final void method166(int arg0) {
        for (int var2 = -1; var2 < this.field153; ++var2) {
            int var3;
            if (var2 == -1) {
                var3 = this.field151;
            } else {
                var3 = this.field154[var2];
            }
            class6 var4 = this.field152[var3];
            if (var4 != null) {
                this.method53(1, var4, (byte) 0);
            }
        }
        if (arg0 != -36249) {
            this.field355 = this.field203.method483();
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(Z)V")
    public final void method167(boolean arg0) {
        if (this.field555 > 0) {
            this.method110((byte) -26);
        } else {
            this.method111("Please wait - attempting to reestablish", 9231, "Connection lost");
            this.field215 = 0;
            this.field372 = 0;
            class61 var2 = this.field417;
            if (arg0) {
                for (int var3 = 1; var3 > 0; ++var3) {
                }
            }
            this.field210 = false;
            this.field594 = 0;
            this.method133(this.field483, this.field484, true);
            if (!this.field210) {
                this.method110((byte) -26);
            }
            try {
                var2.method574();
            } catch (Exception var4) {
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "c", descriptor = "(ILMVHXDWGI;I)V")
    private final void method168(int arg0, class38 arg1, int arg2) {
        if (arg2 > 0) {
            arg1.method367(0);
            int var4 = arg1.method368(1, 1);
            if (var4 != 0) {
                int var5 = arg1.method368(1, 2);
                if (var5 == 0) {
                    this.field156[this.field155++] = this.field151;
                } else if (var5 == 1) {
                    int var6 = arg1.method368(1, 3);
                    field519.method303(var6, false, (byte) -110);
                    int var7 = arg1.method368(1, 1);
                    if (var7 == 1) {
                        this.field156[this.field155++] = this.field151;
                    }
                } else if (var5 == 2) {
                    int var8 = arg1.method368(1, 3);
                    field519.method303(var8, true, (byte) -110);
                    int var9 = arg1.method368(1, 3);
                    field519.method303(var9, true, (byte) -110);
                    int var10 = arg1.method368(1, 1);
                    if (var10 == 1) {
                        this.field156[this.field155++] = this.field151;
                    }
                } else if (var5 == 3) {
                    int var11 = arg1.method368(1, 1);
                    this.field452 = arg1.method368(1, 2);
                    int var12 = arg1.method368(1, 7);
                    int var13 = arg1.method368(1, 1);
                    if (var13 == 1) {
                        this.field156[this.field155++] = this.field151;
                    }
                    int var14 = arg1.method368(1, 7);
                    field519.method306(var14, var11 == 1, var12, this.field291);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(Ljava/lang/Runnable;I)V")
    public final void method169(Runnable arg0, int arg1) {
        if (arg1 > 10) {
            arg1 = 10;
        }
        if (signlink.mainapp != null) {
            signlink.startthread(arg0, arg1);
        } else {
            super.method169(arg0, arg1);
        }
    }

    @OriginalMember(owner = "client!client", name = "getAppletContext", descriptor = "()Ljava/applet/AppletContext;")
    public final AppletContext getAppletContext() {
        return signlink.mainapp != null ? signlink.mainapp.getAppletContext() : super.getAppletContext();
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(ILjava/lang/String;)V")
    public final void method170(int arg0, String arg1) {
        if (arg1 != null && arg1.length() != 0) {
            String var3 = arg1;
            while (arg0 >= 0) {
                this.method147();
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
                    this.field269 = 0;
                    label50: for (int var9 = 0; var9 < class3.field48; ++var9) {
                        class3 var10 = class3.method11(var9);
                        if (var10.field57 == -1 && var10.field43 != null) {
                            String var11 = var10.field43.toLowerCase();
                            for (int var12 = 0; var12 < var5; ++var12) {
                                if (var11.indexOf(var4[var12]) == -1) {
                                    continue label50;
                                }
                            }
                            this.field270[this.field269] = var11;
                            this.field271[this.field269] = var9;
                            ++this.field269;
                            if (this.field269 >= this.field270.length) {
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
            this.field269 = 0;
        }
    }

    @OriginalMember(owner = "client!client", name = "A", descriptor = "(I)Z")
    public final boolean method171(int arg0) {
        int var2 = 4 / arg0;
        if (this.field417 == null) {
            return false;
        } else {
            try {
                int var3 = this.field417.method576();
                if (var3 == 0) {
                    return false;
                }
                if (this.field552 == -1) {
                    this.field417.method577(this.field251.field1160, 0, 1);
                    this.field552 = this.field251.field1160[0] & 255;
                    if (this.field203 != null) {
                        this.field552 = this.field552 - this.field203.method483() & 255;
                    }
                    this.field551 = class10.field683[this.field552];
                    --var3;
                }
                if (this.field551 == -1) {
                    if (var3 <= 0) {
                        return false;
                    }
                    this.field417.method577(this.field251.field1160, 0, 1);
                    this.field551 = this.field251.field1160[0] & 255;
                    --var3;
                }
                if (this.field551 == -2) {
                    if (var3 <= 1) {
                        return false;
                    }
                    this.field417.method577(this.field251.field1160, 0, 2);
                    this.field251.field1161 = 0;
                    this.field551 = this.field251.method359();
                    var3 -= 2;
                }
                if (var3 < this.field551) {
                    return false;
                }
                this.field251.field1161 = 0;
                this.field417.method577(this.field251.field1160, 0, this.field551);
                this.field553 = 0;
                this.field359 = this.field358;
                this.field358 = this.field357;
                this.field357 = this.field552;
                if (this.field552 == 154) {
                    int var4 = this.field251.method384(3);
                    int var5 = this.field251.method390(9);
                    this.field436[var4] = var5;
                    if (this.field528[var4] != var5) {
                        this.field528[var4] = var5;
                        this.method89(var4, -457);
                        this.field258 = true;
                        if (this.field578 != -1) {
                            this.field308 = true;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 65) {
                    this.field605 = this.field251.method376(false);
                    this.field606 = this.field251.method377((byte) -114);
                    for (int var6 = this.field605; var6 < this.field605 + 8; ++var6) {
                        for (int var7 = this.field606; var7 < this.field606 + 8; ++var7) {
                            if (this.field418[this.field452][var6][var7] != null) {
                                this.field418[this.field452][var6][var7] = null;
                                this.method160(var6, var7);
                            }
                        }
                    }
                    for (class68 var8 = (class68) this.field189.method246(); var8 != null; var8 = (class68) this.field189.method248(true)) {
                        if (var8.field1707 >= this.field605 && var8.field1707 < this.field605 + 8 && var8.field1708 >= this.field606 && var8.field1708 < this.field606 + 8 && this.field452 == var8.field1705) {
                            var8.field1704 = 0;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 207) {
                    for (int var9 = 0; var9 < this.field528.length; ++var9) {
                        if (this.field528[var9] != this.field436[var9]) {
                            this.field528[var9] = this.field436[var9];
                            this.method89(var9, -457);
                            this.field258 = true;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 35) {
                    int var10 = this.field251.method359();
                    int var11 = this.field251.method359();
                    this.method66(var11, 0);
                    if (var10 != -1) {
                        this.method66(var10, 0);
                    }
                    if (this.field348 != -1) {
                        this.method112(-681, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field129 != -1) {
                        this.method112(-681, this.field129);
                        this.field129 = -1;
                    }
                    if (this.field621 != -1) {
                        this.method112(-681, this.field621);
                        this.field621 = -1;
                    }
                    if (this.field505 != var11) {
                        this.method112(-681, this.field505);
                        this.field505 = var11;
                    }
                    if (this.field432 != var11) {
                        this.method112(-681, this.field432);
                        this.field432 = var10;
                    }
                    this.field533 = 0;
                    this.field226 = false;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 115) {
                    int var12 = this.field251.method385(-20383);
                    int var13 = this.field251.method385(-20383);
                    int var14 = this.field251.method385(-20383);
                    if (var13 == 65535) {
                        class39.method402(var14).field1196 = 0;
                        this.field552 = -1;
                        return true;
                    }
                    class3 var15 = class3.method11(var13);
                    class39.method402(var14).field1196 = 4;
                    class39.method402(var14).field1197 = var13;
                    class39.method402(var14).field1203 = var15.field23;
                    class39.method402(var14).field1204 = var15.field17;
                    class39.method402(var14).field1202 = var15.field60 * 100 / var12;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 12) {
                    this.field215 = this.field251.method357();
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 21 || this.field552 == 15) {
                    int var16 = this.field443;
                    int var17 = this.field444;
                    if (this.field552 == 21) {
                        var17 = this.field251.method383(false);
                        var16 = this.field251.method359();
                        this.field549 = false;
                    }
                    if (this.field552 == 15) {
                        var17 = this.field251.method385(-20383);
                        var16 = this.field251.method359();
                        this.field251.method367(0);
                        int var18 = 0;
                        while (true) {
                            if (var18 >= 4) {
                                this.field251.method369(49924);
                                this.field549 = true;
                                break;
                            }
                            for (int var19 = 0; var19 < 13; ++var19) {
                                for (int var20 = 0; var20 < 13; ++var20) {
                                    int var21 = this.field251.method368(1, 1);
                                    if (var21 == 1) {
                                        this.field298[var18][var19][var20] = this.field251.method368(1, 26);
                                    } else {
                                        this.field298[var18][var19][var20] = -1;
                                    }
                                }
                            }
                            ++var18;
                        }
                    }
                    if (this.field443 == var16 && this.field444 == var17 && this.field326 == 2) {
                        this.field552 = -1;
                        return true;
                    }
                    this.field443 = var16;
                    this.field444 = var17;
                    this.field280 = (this.field443 - 6) * 8;
                    this.field281 = (this.field444 - 6) * 8;
                    this.field598 = false;
                    if ((this.field443 / 8 == 48 || this.field443 / 8 == 49) && this.field444 / 8 == 48) {
                        this.field598 = true;
                    }
                    if (this.field443 / 8 == 48 && this.field444 / 8 == 148) {
                        this.field598 = true;
                    }
                    this.field326 = 1;
                    this.field297 = System.currentTimeMillis();
                    this.method111((String) null, 9231, "Loading - please wait.");
                    if (this.field552 == 21) {
                        int var22 = 0;
                        int var23 = (this.field443 - 6) / 8;
                        label1185: while (true) {
                            if (var23 > (this.field443 + 6) / 8) {
                                this.field401 = new byte[var22][];
                                this.field274 = new byte[var22][];
                                this.field245 = new int[var22];
                                this.field246 = new int[var22];
                                this.field247 = new int[var22];
                                int var25 = 0;
                                int var26 = (this.field443 - 6) / 8;
                                while (true) {
                                    if (var26 > (this.field443 + 6) / 8) {
                                        break label1185;
                                    }
                                    for (int var27 = (this.field444 - 6) / 8; var27 <= (this.field444 + 6) / 8; ++var27) {
                                        this.field245[var25] = (var26 << 8) + var27;
                                        if (this.field598 && (var27 == 49 || var27 == 149 || var27 == 147 || var26 == 50 || var26 == 49 && var27 == 47)) {
                                            this.field246[var25] = -1;
                                            this.field247[var25] = -1;
                                            ++var25;
                                        } else {
                                            int var28 = this.field246[var25] = this.field437.method507(0, var26, var27, false);
                                            if (var28 != -1) {
                                                this.field437.method516(3, var28);
                                            }
                                            int var29 = this.field247[var25] = this.field437.method507(1, var26, var27, false);
                                            if (var29 != -1) {
                                                this.field437.method516(3, var29);
                                            }
                                            ++var25;
                                        }
                                    }
                                    ++var26;
                                }
                            }
                            for (int var24 = (this.field444 - 6) / 8; var24 <= (this.field444 + 6) / 8; ++var24) {
                                ++var22;
                            }
                            ++var23;
                        }
                    }
                    if (this.field552 == 15) {
                        int var30 = 0;
                        int[] var31 = new int[676];
                        int var32 = 0;
                        label1146: while (true) {
                            if (var32 >= 4) {
                                this.field401 = new byte[var30][];
                                this.field274 = new byte[var30][];
                                this.field245 = new int[var30];
                                this.field246 = new int[var30];
                                this.field247 = new int[var30];
                                int var40 = 0;
                                while (true) {
                                    if (var40 >= var30) {
                                        break label1146;
                                    }
                                    int var41 = this.field245[var40] = var31[var40];
                                    int var42 = var41 >> 8 & 255;
                                    int var43 = var41 & 255;
                                    int var44 = this.field246[var40] = this.field437.method507(0, var42, var43, false);
                                    if (var44 != -1) {
                                        this.field437.method516(3, var44);
                                    }
                                    int var45 = this.field247[var40] = this.field437.method507(1, var42, var43, false);
                                    if (var45 != -1) {
                                        this.field437.method516(3, var45);
                                    }
                                    ++var40;
                                }
                            }
                            for (int var33 = 0; var33 < 13; ++var33) {
                                for (int var34 = 0; var34 < 13; ++var34) {
                                    int var35 = this.field298[var32][var33][var34];
                                    if (var35 != -1) {
                                        int var36 = var35 >> 14 & 1023;
                                        int var37 = var35 >> 3 & 2047;
                                        int var38 = (var36 / 8 << 8) + var37 / 8;
                                        for (int var39 = 0; var39 < var30; ++var39) {
                                            if (var31[var39] == var38) {
                                                var38 = -1;
                                                break;
                                            }
                                        }
                                        if (var38 != -1) {
                                            var31[var30++] = var38;
                                        }
                                    }
                                }
                            }
                            ++var32;
                        }
                    }
                    int var46 = this.field280 - this.field282;
                    int var47 = this.field281 - this.field283;
                    this.field282 = this.field280;
                    this.field283 = this.field281;
                    for (int var48 = 0; var48 < 16384; ++var48) {
                        class1 var49 = this.field601[var48];
                        if (var49 != null) {
                            for (int var50 = 0; var50 < 10; ++var50) {
                                var49.field944[var50] -= var46;
                                var49.field945[var50] -= var47;
                            }
                            var49.field938 -= var46 * 128;
                            var49.field939 -= var47 * 128;
                        }
                    }
                    for (int var51 = 0; var51 < this.field150; ++var51) {
                        class6 var52 = this.field152[var51];
                        if (var52 != null) {
                            for (int var53 = 0; var53 < 10; ++var53) {
                                var52.field944[var53] -= var46;
                                var52.field945[var53] -= var47;
                            }
                            var52.field938 -= var46 * 128;
                            var52.field939 -= var47 * 128;
                        }
                    }
                    this.field244 = true;
                    byte var54 = 0;
                    byte var55 = 104;
                    byte var56 = 1;
                    if (var46 < 0) {
                        var54 = 103;
                        var55 = -1;
                        var56 = -1;
                    }
                    byte var57 = 0;
                    byte var58 = 104;
                    byte var59 = 1;
                    if (var47 < 0) {
                        var57 = 103;
                        var58 = -1;
                        var59 = -1;
                    }
                    for (int var60 = var54; var55 != var60; var60 += var56) {
                        for (int var61 = var57; var58 != var61; var61 += var59) {
                            int var62 = var46 + var60;
                            int var63 = var47 + var61;
                            for (int var64 = 0; var64 < 4; ++var64) {
                                if (var62 >= 0 && var63 >= 0 && var62 < 104 && var63 < 104) {
                                    this.field418[var64][var60][var61] = this.field418[var64][var62][var63];
                                } else {
                                    this.field418[var64][var60][var61] = null;
                                }
                            }
                        }
                    }
                    for (class68 var65 = (class68) this.field189.method246(); var65 != null; var65 = (class68) this.field189.method248(true)) {
                        var65.field1707 -= var46;
                        var65.field1708 -= var47;
                        if (var65.field1707 < 0 || var65.field1708 < 0 || var65.field1707 >= 104 || var65.field1708 >= 104) {
                            var65.method589();
                        }
                    }
                    if (this.field372 != 0) {
                        this.field372 -= var46;
                        this.field373 -= var47;
                    }
                    this.field198 = false;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 218) {
                    this.field259 = this.field251.method391(false);
                    this.field413 = this.field251.method383(false);
                    this.field466 = this.field251.method383(false);
                    this.field251.method359();
                    this.field260 = this.field251.method359();
                    this.field267 = this.field251.method384(3);
                    this.field127 = this.field251.method384(3);
                    this.field435 = this.field251.method383(false);
                    this.field251.method376(false);
                    this.field353 = this.field251.method359();
                    this.field327 = this.field251.method384(3);
                    signlink.dnslookup(class58.method550(this.field259, 0));
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 11) {
                    long var66 = this.field251.method363(0);
                    int var68 = this.field251.method357();
                    String var69 = class58.method551(class58.method548(var66, 13452), 0);
                    for (int var70 = 0; var70 < this.field130; ++var70) {
                        if (this.field240[var70] == var66) {
                            if (this.field162[var70] != var68) {
                                this.field162[var70] = var68;
                                this.field258 = true;
                                if (var68 > 0) {
                                    this.method102(4, var69 + " has logged in.", 5, "");
                                }
                                if (var68 == 0) {
                                    this.method102(4, var69 + " has logged out.", 5, "");
                                }
                            }
                            var69 = null;
                            break;
                        }
                    }
                    if (var69 != null && this.field130 < 200) {
                        this.field240[this.field130] = var66;
                        this.field580[this.field130] = var69;
                        this.field162[this.field130] = var68;
                        ++this.field130;
                        this.field258 = true;
                    }
                    boolean var71 = false;
                    while (!var71) {
                        var71 = true;
                        for (int var72 = 0; var72 < this.field130 - 1; ++var72) {
                            if (this.field162[var72] != field376 && this.field162[var72 + 1] == field376 || this.field162[var72] == 0 && this.field162[var72 + 1] != 0) {
                                int var73 = this.field162[var72];
                                this.field162[var72] = this.field162[var72 + 1];
                                this.field162[var72 + 1] = var73;
                                String var74 = this.field580[var72];
                                this.field580[var72] = this.field580[var72 + 1];
                                this.field580[var72 + 1] = var74;
                                long var75 = this.field240[var72];
                                this.field240[var72] = this.field240[var72 + 1];
                                this.field240[var72 + 1] = var75;
                                this.field258 = true;
                                var71 = false;
                            }
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 64) {
                    int var77 = this.field251.method359();
                    int var78 = this.field251.method384(3);
                    int var79 = this.field251.method383(false);
                    int var80 = this.field251.method359();
                    class39.method402(var77).field1203 = var80;
                    class39.method402(var77).field1204 = var79;
                    class39.method402(var77).field1202 = var78;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 244) {
                    int var81 = this.field251.method359();
                    int var82 = this.field251.method383(false);
                    class39.method402(var82).field1196 = 1;
                    class39.method402(var82).field1197 = var81;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 27) {
                    String var83 = this.field251.method364();
                    int var84 = this.field251.method384(3);
                    class39.method402(var84).field1224 = var83;
                    int var10001 = this.field321[this.field389];
                    if (class39.method402(var84).field1181 == var10001) {
                        this.field258 = true;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 204) {
                    this.field606 = this.field251.method376(false);
                    this.field605 = this.field251.method357();
                    while (this.field251.field1161 < this.field551) {
                        int var85 = this.field251.method357();
                        this.method95(var85, this.field251, -323);
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 83) {
                    int var86 = this.field251.method359();
                    if (var86 == 65535) {
                        var86 = -1;
                    }
                    if (this.field350 != var86 && this.field493 && !field379 && this.field423 == 0) {
                        this.field508 = var86;
                        this.field509 = true;
                        this.field437.method516(2, this.field508);
                    }
                    this.field350 = var86;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 232) {
                    int var87 = this.field251.method359();
                    int var88 = this.field251.method361();
                    if (this.field493 && !field379) {
                        this.field508 = var87;
                        this.field509 = false;
                        this.field437.method516(2, this.field508);
                        this.field423 = var88;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 138) {
                    this.field325 = this.field251.method357();
                    this.field276 = this.field251.method357();
                    this.field368 = this.field251.method357();
                    this.field498 = true;
                    this.field308 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 84) {
                    int var89 = this.field251.method383(false);
                    byte var90 = this.field251.method379((byte) 5);
                    this.field436[var89] = var90;
                    if (this.field528[var89] != var90) {
                        this.field528[var89] = var90;
                        this.method89(var89, -457);
                        this.field258 = true;
                        if (this.field578 != -1) {
                            this.field308 = true;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 136) {
                    this.field330 = this.field251.method357();
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 147) {
                    int var91 = this.field251.method357();
                    int var92 = this.field251.method357();
                    int var93 = this.field251.method357();
                    int var94 = this.field251.method357();
                    this.field582[var91] = true;
                    this.field616[var91] = var92;
                    this.field562[var91] = var93;
                    this.field299[var91] = var94;
                    this.field543[var91] = 0;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 151) {
                    this.field467 = this.field251.method357();
                    if (this.field467 == this.field389) {
                        if (this.field467 == 3) {
                            this.field389 = 1;
                        } else {
                            this.field389 = 3;
                        }
                        this.field258 = true;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 24) {
                    this.method114(this.field251, this.field551, 6);
                    this.field244 = false;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 165) {
                    int var95 = this.field251.method385(-20383);
                    this.method66(var95, 0);
                    if (this.field621 != -1) {
                        this.method112(-681, this.field621);
                        this.field621 = -1;
                        this.field308 = true;
                    }
                    if (this.field505 != -1) {
                        this.method112(-681, this.field505);
                        this.field505 = -1;
                        this.field296 = true;
                    }
                    if (this.field432 != -1) {
                        this.method112(-681, this.field432);
                        this.field432 = -1;
                    }
                    if (this.field348 != -1) {
                        this.method112(-681, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field129 != var95) {
                        this.method112(-681, this.field129);
                        this.field129 = var95;
                    }
                    if (this.field533 != 0) {
                        this.field533 = 0;
                        this.field308 = true;
                    }
                    this.field258 = true;
                    this.field149 = true;
                    this.field226 = false;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 155) {
                    int var96 = this.field251.method385(-20383);
                    int var97 = this.field251.method383(false);
                    class39 var98 = class39.method402(var96);
                    if (var98 != null && var98.field1242 == 0) {
                        if (var97 < 0) {
                            var97 = 0;
                        }
                        if (var97 > var98.field1233 - var98.field1183) {
                            var97 = var98.field1233 - var98.field1183;
                        }
                        var98.field1238 = var97;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 30) {
                    int var99 = this.field251.method385(-20383);
                    int var100 = this.field251.method385(-20383);
                    int var101 = this.field251.method359();
                    class39.method402(var99).field1205 = (var101 << 16) + var100;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 215) {
                    this.field510 = this.field551 / 8;
                    for (int var102 = 0; var102 < this.field510; ++var102) {
                        this.field169[var102] = this.field251.method363(0);
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 173) {
                    this.field273 = false;
                    this.field533 = 1;
                    this.field334 = "";
                    this.field308 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 198) {
                    int var103 = this.field251.method384(3);
                    this.method66(var103, 0);
                    if (this.field129 != -1) {
                        this.method112(-681, this.field129);
                        this.field129 = -1;
                        this.field258 = true;
                        this.field149 = true;
                    }
                    if (this.field505 != -1) {
                        this.method112(-681, this.field505);
                        this.field505 = -1;
                        this.field296 = true;
                    }
                    if (this.field432 != -1) {
                        this.method112(-681, this.field432);
                        this.field432 = -1;
                    }
                    if (this.field348 != -1) {
                        this.method112(-681, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field621 != var103) {
                        this.method112(-681, this.field621);
                        this.field621 = var103;
                    }
                    this.field226 = false;
                    this.field308 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 253) {
                    int var104 = this.field251.method357();
                    String var105 = this.field251.method364();
                    int var106 = this.field251.method376(false);
                    if (var104 >= 1 && var104 <= 5) {
                        if (var105.equalsIgnoreCase("null")) {
                            var105 = null;
                        }
                        this.field395[var104 - 1] = var105;
                        this.field396[var104 - 1] = var106 == 0;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 122) {
                    this.field372 = 0;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 199) {
                    this.field520 = this.field251.method385(-20383) * 30;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 61) {
                    this.field606 = this.field251.method377((byte) -114);
                    this.field605 = this.field251.method376(false);
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 87) {
                    int var107 = this.field251.method385(-20383);
                    this.method66(var107, 0);
                    if (this.field129 != -1) {
                        this.method112(-681, this.field129);
                        this.field129 = -1;
                        this.field258 = true;
                        this.field149 = true;
                    }
                    if (this.field621 != -1) {
                        this.method112(-681, this.field621);
                        this.field621 = -1;
                        this.field308 = true;
                    }
                    if (this.field505 != -1) {
                        this.method112(-681, this.field505);
                        this.field505 = -1;
                        this.field296 = true;
                    }
                    if (this.field432 != -1) {
                        this.method112(-681, this.field432);
                        this.field432 = -1;
                    }
                    if (this.field348 != var107) {
                        this.method112(-681, this.field348);
                        this.field348 = var107;
                    }
                    if (this.field533 != 0) {
                        this.field533 = 0;
                        this.field308 = true;
                    }
                    this.field226 = false;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 123) {
                    int var108 = this.field251.method359();
                    int var109 = this.field251.method357();
                    int var110 = this.field251.method359();
                    if (var110 == 65535) {
                        if (this.field329 < 50) {
                            this.field346[this.field329] = (short) var108;
                            this.field388[this.field329] = var109;
                            this.field371[this.field329] = 0;
                            ++this.field329;
                        }
                    } else if (this.field205 && !field379 && this.field329 < 50) {
                        this.field346[this.field329] = var108;
                        this.field388[this.field329] = var109;
                        this.field371[this.field329] = class64.field1675[var108] + var110;
                        ++this.field329;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 239) {
                    int var111 = this.field251.method385(-20383);
                    int var112 = this.field251.method385(-20383);
                    class39.method402(var112).field1196 = 2;
                    class39.method402(var112).field1197 = var111;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 134) {
                    this.field258 = true;
                    int var113 = this.field251.method359();
                    class39 var114 = class39.method402(var113);
                    int var115 = this.field251.method359();
                    for (int var116 = 0; var116 < var115; ++var116) {
                        int var117 = this.field251.method357();
                        if (var117 == 255) {
                            var117 = this.field251.method362();
                        }
                        var114.field1201[var116] = this.field251.method359();
                        var114.field1213[var116] = var117;
                    }
                    for (int var118 = var115; var118 < var114.field1201.length; ++var118) {
                        var114.field1201[var118] = 0;
                        var114.field1213[var118] = 0;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 20) {
                    this.method110((byte) -26);
                    this.field552 = -1;
                    return false;
                }
                if (this.field552 == 51) {
                    this.field131 = this.field251.method357();
                    this.field258 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 163) {
                    if (this.field389 == 12) {
                        this.field258 = true;
                    }
                    this.field284 = this.field251.method360();
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 29) {
                    this.field258 = true;
                    int var119 = this.field251.method359();
                    class39 var120 = class39.method402(var119);
                    while (this.field251.field1161 < this.field551) {
                        int var121 = this.field251.method371();
                        int var122 = this.field251.method359();
                        int var123 = this.field251.method357();
                        if (var123 == 255) {
                            var123 = this.field251.method362();
                        }
                        if (var121 >= 0 && var121 < var120.field1201.length) {
                            var120.field1201[var121] = var122;
                            var120.field1213[var121] = var123;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 34) {
                    this.field273 = false;
                    this.field533 = 2;
                    this.field334 = "";
                    this.field308 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 216) {
                    this.method146(14094, this.field551, this.field251);
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 25) {
                    int var124 = this.field251.method360();
                    int var125 = this.field251.method387(this.field408);
                    int var126 = this.field251.method383(false);
                    class39 var127 = class39.method402(var126);
                    var127.field1219 = var124;
                    var127.field1191 = var125;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 139) {
                    int var128 = this.field251.method360();
                    if (this.field578 != var128) {
                        this.method112(-681, this.field578);
                        this.field578 = var128;
                    }
                    this.field308 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 110) {
                    this.field198 = false;
                    for (int var129 = 0; var129 < 5; ++var129) {
                        this.field582[var129] = false;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 158) {
                    int var130 = this.field251.method383(false);
                    boolean var131 = this.field251.method375(964) == 1;
                    class39.method402(var130).field1247 = var131;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 91) {
                    int var132 = this.field251.method384(3);
                    int var133 = this.field251.method386((byte) 47);
                    class39 var134 = class39.method402(var132);
                    if (var134.field1210 != var133 || var133 == -1) {
                        var134.field1210 = var133;
                        var134.field1209 = 0;
                        var134.field1248 = 0;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 228) {
                    if (this.field129 != -1) {
                        this.method112(-681, this.field129);
                        this.field129 = -1;
                        this.field258 = true;
                        this.field149 = true;
                    }
                    if (this.field621 != -1) {
                        this.method112(-681, this.field621);
                        this.field621 = -1;
                        this.field308 = true;
                    }
                    if (this.field505 != -1) {
                        this.method112(-681, this.field505);
                        this.field505 = -1;
                        this.field296 = true;
                    }
                    if (this.field432 != -1) {
                        this.method112(-681, this.field432);
                        this.field432 = -1;
                    }
                    if (this.field348 != -1) {
                        this.method112(-681, this.field348);
                        this.field348 = -1;
                    }
                    if (this.field533 != 0) {
                        this.field533 = 0;
                        this.field308 = true;
                    }
                    this.field226 = false;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 76) {
                    for (int var135 = 0; var135 < this.field152.length; ++var135) {
                        if (this.field152[var135] != null) {
                            this.field152[var135].field933 = -1;
                        }
                    }
                    for (int var136 = 0; var136 < this.field601.length; ++var136) {
                        if (this.field601[var136] != null) {
                            this.field601[var136].field933 = -1;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 182) {
                    int var137 = this.field251.method383(false);
                    int var138 = this.field251.method383(false);
                    int var139 = var137 >> 10 & 31;
                    int var140 = var137 >> 5 & 31;
                    int var141 = var137 & 31;
                    class39.method402(var138).field1212 = (var141 << 3) + (var139 << 19) + (var140 << 11);
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 99) {
                    long var142 = this.field251.method363(0);
                    int var144 = this.field251.method362();
                    int var145 = this.field251.method357();
                    boolean var146 = false;
                    for (int var147 = 0; var147 < 100; ++var147) {
                        if (this.field537[var147] == var144) {
                            var146 = true;
                            break;
                        }
                    }
                    if (var145 <= 1) {
                        for (int var148 = 0; var148 < this.field510; ++var148) {
                            if (this.field169[var148] == var142) {
                                var146 = true;
                                break;
                            }
                        }
                    }
                    if (!var146 && this.field322 == 0) {
                        try {
                            this.field537[this.field619] = var144;
                            this.field619 = (this.field619 + 1) % 100;
                            String var149 = class52.method495(-73, this.field551 - 13, this.field251);
                            if (var145 != 3) {
                                var149 = class43.method451(var149, (byte) 8);
                            }
                            if (var145 != 2 && var145 != 3) {
                                if (var145 == 1) {
                                    this.method102(4, var149, 7, "@cr1@" + class58.method551(class58.method548(var142, 13452), 0));
                                } else {
                                    this.method102(4, var149, 3, class58.method551(class58.method548(var142, 13452), 0));
                                }
                            } else {
                                this.method102(4, var149, 7, "@cr2@" + class58.method551(class58.method548(var142, 13452), 0));
                            }
                        } catch (Exception var191) {
                            signlink.reporterror("cde1");
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 191) {
                    this.field389 = this.field251.method376(false);
                    this.field258 = true;
                    this.field149 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 161) {
                    String var151 = this.field251.method364();
                    if (var151.endsWith(":tradereq:")) {
                        String var152 = var151.substring(0, var151.indexOf(":"));
                        long var153 = class58.method547(var152);
                        boolean var155 = false;
                        for (int var156 = 0; var156 < this.field510; ++var156) {
                            if (this.field169[var156] == var153) {
                                var155 = true;
                                break;
                            }
                        }
                        if (!var155 && this.field322 == 0) {
                            this.method102(4, "wishes to trade with you.", 4, var152);
                        }
                    } else if (var151.endsWith(":duelreq:")) {
                        String var157 = var151.substring(0, var151.indexOf(":"));
                        long var158 = class58.method547(var157);
                        boolean var160 = false;
                        for (int var161 = 0; var161 < this.field510; ++var161) {
                            if (this.field169[var161] == var158) {
                                var160 = true;
                                break;
                            }
                        }
                        if (!var160 && this.field322 == 0) {
                            this.method102(4, "wishes to duel with you.", 8, var157);
                        }
                    } else if (!var151.endsWith(":chalreq:")) {
                        this.method102(4, var151, 0, "");
                    } else {
                        String var162 = var151.substring(0, var151.indexOf(":"));
                        long var163 = class58.method547(var162);
                        boolean var165 = false;
                        for (int var166 = 0; var166 < this.field510; ++var166) {
                            if (this.field169[var166] == var163) {
                                var165 = true;
                                break;
                            }
                        }
                        if (!var165 && this.field322 == 0) {
                            String var167 = var151.substring(var151.indexOf(":") + 1, var151.length() - 9);
                            this.method102(4, var167, 8, var162);
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 242) {
                    int var168 = this.field251.method384(3);
                    int var169 = this.field251.method383(false);
                    if (this.field621 != -1) {
                        this.method112(-681, this.field621);
                        this.field621 = -1;
                        this.field308 = true;
                    }
                    if (this.field505 != -1) {
                        this.method112(-681, this.field505);
                        this.field505 = -1;
                        this.field296 = true;
                    }
                    if (this.field432 != -1) {
                        this.method112(-681, this.field432);
                        this.field432 = -1;
                    }
                    if (this.field348 != var169) {
                        this.method112(-681, this.field348);
                        this.field348 = var169;
                    }
                    if (this.field129 != var168) {
                        this.method112(-681, this.field129);
                        this.field129 = var168;
                    }
                    if (this.field533 != 0) {
                        this.field533 = 0;
                        this.field308 = true;
                    }
                    this.field258 = true;
                    this.field149 = true;
                    this.field226 = false;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 92) {
                    int var170 = this.field251.method383(false);
                    int var171 = this.field251.method375(964);
                    if (var170 == 65535) {
                        var170 = -1;
                    }
                    if (this.field321[var171] != var170) {
                        this.method112(-681, this.field321[var171]);
                        this.field321[var171] = var170;
                    }
                    this.field258 = true;
                    this.field149 = true;
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 214) {
                    this.field198 = true;
                    this.field522 = this.field251.method357();
                    this.field523 = this.field251.method357();
                    this.field524 = this.field251.method359();
                    this.field525 = this.field251.method357();
                    this.field526 = this.field251.method357();
                    if (this.field526 >= 100) {
                        int var172 = this.field522 * 128 + 64;
                        int var173 = this.field523 * 128 + 64;
                        int var174 = this.method68(0, var173, var172, this.field452) - this.field524;
                        int var175 = var172 - this.field362;
                        int var176 = var174 - this.field363;
                        int var177 = var173 - this.field364;
                        int var178 = (int) Math.sqrt((double) (var175 * var175 + var177 * var177));
                        this.field365 = (int) (Math.atan2((double) var176, (double) var178) * 325.949D) & 2047;
                        this.field366 = (int) (Math.atan2((double) var175, (double) var177) * -325.949D) & 2047;
                        if (this.field365 < 128) {
                            this.field365 = 128;
                        }
                        if (this.field365 > 383) {
                            this.field365 = 383;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 221) {
                    this.field258 = true;
                    int var179 = this.field251.method376(false);
                    int var180 = this.field251.method375(964);
                    int var181 = this.field251.method389(34);
                    this.field160[var179] = var181;
                    this.field560[var179] = var180;
                    this.field558[var179] = 1;
                    for (int var182 = 0; var182 < 98; ++var182) {
                        if (var181 >= field420[var182]) {
                            this.field558[var179] = var182 + 2;
                        }
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 130) {
                    int var183 = this.field251.method383(false);
                    class39.method402(var183).field1196 = 3;
                    if (field519.field117 == null) {
                        class39.method402(var183).field1197 = (field519.field94[11] << 5) + (field519.field94[8] << 10) + (field519.field94[0] << 15) + (field519.field96[0] << 25) + (field519.field96[4] << 20) + field519.field94[1];
                    } else {
                        class39.method402(var183).field1197 = (int) (field519.field117.field996 + 305419896L);
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 143 || this.field552 == 93 || this.field552 == 137 || this.field552 == 247 || this.field552 == 4 || this.field552 == 235 || this.field552 == 179 || this.field552 == 101 || this.field552 == 94 || this.field552 == 23 || this.field552 == 243) {
                    this.method95(this.field552, this.field251, -323);
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 230) {
                    this.field534 = this.field251.method357();
                    if (this.field534 == 1) {
                        this.field480 = this.field251.method359();
                    }
                    if (this.field534 >= 2 && this.field534 <= 6) {
                        if (this.field534 == 2) {
                            this.field184 = 64;
                            this.field185 = 64;
                        }
                        if (this.field534 == 3) {
                            this.field184 = 0;
                            this.field185 = 64;
                        }
                        if (this.field534 == 4) {
                            this.field184 = 128;
                            this.field185 = 64;
                        }
                        if (this.field534 == 5) {
                            this.field184 = 64;
                            this.field185 = 0;
                        }
                        if (this.field534 == 6) {
                            this.field184 = 64;
                            this.field185 = 128;
                        }
                        this.field534 = 2;
                        this.field181 = this.field251.method359();
                        this.field182 = this.field251.method359();
                        this.field183 = this.field251.method357();
                    }
                    if (this.field534 == 10) {
                        this.field449 = this.field251.method359();
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 164) {
                    int var184 = this.field251.method359();
                    class39 var185 = class39.method402(var184);
                    for (int var186 = 0; var186 < var185.field1201.length; ++var186) {
                        var185.field1201[var186] = -1;
                        var185.field1201[var186] = 0;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 251) {
                    int var187 = this.field251.method386((byte) 47);
                    if (var187 >= 0) {
                        this.method66(var187, 0);
                    }
                    if (this.field228 != var187) {
                        this.method112(-681, this.field228);
                        this.field228 = var187;
                    }
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 55) {
                    this.field287 = this.field251.method377((byte) -114);
                    this.field447 = this.field251.method385(-20383);
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 203) {
                    if (this.field389 == 12) {
                        this.field258 = true;
                    }
                    this.field506 = this.field251.method357();
                    this.field552 = -1;
                    return true;
                }
                if (this.field552 == 103) {
                    this.field198 = true;
                    this.field191 = this.field251.method357();
                    this.field192 = this.field251.method357();
                    this.field193 = this.field251.method359();
                    this.field194 = this.field251.method357();
                    this.field195 = this.field251.method357();
                    if (this.field195 >= 100) {
                        this.field362 = this.field191 * 128 + 64;
                        this.field364 = this.field192 * 128 + 64;
                        this.field363 = this.method68(0, this.field364, this.field362, this.field452) - this.field193;
                    }
                    this.field552 = -1;
                    return true;
                }
                signlink.reporterror("T1 - " + this.field552 + "," + this.field551 + " - " + this.field358 + "," + this.field359);
                this.method110((byte) -26);
            } catch (IOException var192) {
                this.method167(false);
            } catch (Exception var193) {
                String var189 = "T2 - " + this.field552 + "," + this.field358 + "," + this.field359 + " - " + this.field551 + "," + (field519.field944[0] + this.field280) + "," + (field519.field945[0] + this.field281) + " - ";
                for (int var190 = 0; var190 < this.field551 && var190 < 50; ++var190) {
                    var189 = var189 + this.field251.field1160[var190] + ",";
                }
                signlink.reporterror(var189);
                this.method110((byte) -26);
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(Z)V")
    public final void method172(boolean arg0) {
        this.field470 = 0;
        if (!arg0) {
            for (int var2 = -1; var2 < this.field602 + this.field153; ++var2) {
                class27 var19;
                if (var2 == -1) {
                    var19 = field519;
                } else if (var2 < this.field153) {
                    var19 = this.field152[this.field154[var2]];
                } else {
                    var19 = this.field601[this.field603[var2 - this.field153]];
                }
                if (var19 != null && var19.method1((byte) 9)) {
                    if (var19 instanceof class1) {
                        class30 var20 = ((class1) var19).field2;
                        if (var20.field988 != null) {
                            var20 = var20.method316(true);
                        }
                        if (var20 == null) {
                            continue;
                        }
                    }
                    if (var2 >= this.field153) {
                        class30 var23 = ((class1) var19).field2;
                        if (var23.field975 >= 0 && var23.field975 < this.field128.length) {
                            this.method151(var19.field894 + 15, var19, (byte) 1);
                            if (this.field573 > -1) {
                                this.field128[var23.field975].method233(-23827, this.field573 - 12, this.field574 - 30);
                            }
                        }
                        if (this.field534 == 1 && this.field603[var2 - this.field153] == this.field480 && field502 % 20 < 10) {
                            this.method151(var19.field894 + 15, var19, (byte) 1);
                            if (this.field573 > -1) {
                                this.field385[0].method233(-23827, this.field573 - 12, this.field574 - 28);
                            }
                        }
                    } else {
                        int var21 = 30;
                        class6 var22 = (class6) var19;
                        if (var22.field88 != -1 || var22.field99 != -1) {
                            this.method151(var19.field894 + 15, var19, (byte) 1);
                            if (this.field573 > -1) {
                                if (var22.field88 != -1) {
                                    this.field407[var22.field88].method233(-23827, this.field573 - 12, this.field574 - var21);
                                    var21 += 25;
                                }
                                if (var22.field99 != -1) {
                                    this.field128[var22.field99].method233(-23827, this.field573 - 12, this.field574 - var21);
                                    var21 += 25;
                                }
                            }
                        }
                        if (var2 >= 0 && this.field534 == 10 && this.field154[var2] == this.field449) {
                            this.method151(var19.field894 + 15, var19, (byte) 1);
                            if (this.field573 > -1) {
                                this.field385[1].method233(-23827, this.field573 - 12, this.field574 - var21);
                            }
                        }
                    }
                    if (var19.field914 != null && (var2 >= this.field153 || this.field325 == 0 || this.field325 == 3 || this.field325 == 1 && this.method74(-238, ((class6) var19).field93))) {
                        this.method151(var19.field894, var19, (byte) 1);
                        if (this.field573 > -1 && this.field470 < this.field471) {
                            this.field475[this.field470] = this.field208.method21(var19.field914, 0) / 2;
                            this.field474[this.field470] = this.field208.field74;
                            this.field472[this.field470] = this.field573;
                            this.field473[this.field470] = this.field574;
                            this.field476[this.field470] = var19.field895;
                            this.field477[this.field470] = var19.field896;
                            this.field478[this.field470] = var19.field949;
                            this.field479[this.field470++] = var19.field914;
                            if (this.field400 == 0 && var19.field896 >= 1 && var19.field896 <= 3) {
                                this.field474[this.field470] += 10;
                                this.field473[this.field470] += 5;
                            }
                            if (this.field400 == 0 && var19.field896 == 4) {
                                this.field475[this.field470] = 60;
                            }
                            if (this.field400 == 0 && var19.field896 == 5) {
                                this.field474[this.field470] += 5;
                            }
                        }
                    }
                    if (var19.field930 > field502) {
                        this.method151(var19.field894 + 15, var19, (byte) 1);
                        if (this.field573 > -1) {
                            int var24 = var19.field931 * 30 / var19.field932;
                            if (var24 > 30) {
                                var24 = 30;
                            }
                            class15.method214(65280, 435, 5, this.field573 - 15, this.field574 - 3, var24);
                            class15.method214(16711680, 435, 5, this.field573 - 15 + var24, this.field574 - 3, 30 - var24);
                        }
                    }
                    for (int var25 = 0; var25 < 4; ++var25) {
                        if (var19.field921[var25] > field502) {
                            this.method151(var19.field894 / 2, var19, (byte) 1);
                            if (this.field573 > -1) {
                                if (var25 == 1) {
                                    this.field574 -= 20;
                                }
                                if (var25 == 2) {
                                    this.field573 -= 15;
                                    this.field574 -= 10;
                                }
                                if (var25 == 3) {
                                    this.field573 += 15;
                                    this.field574 -= 10;
                                }
                                this.field347[var19.field920[var25]].method233(-23827, this.field573 - 12, this.field574 - 12);
                                this.field206.method18(0, String.valueOf(var19.field919[var25]), this.field574 + 4, this.field573, 0);
                                this.field206.method18(16777215, String.valueOf(var19.field919[var25]), this.field574 + 3, this.field573 - 1, 0);
                            }
                        }
                    }
                }
            }
            for (int var3 = 0; var3 < this.field470; ++var3) {
                int var4 = this.field472[var3];
                int var5 = this.field473[var3];
                int var6 = this.field475[var3];
                int var7 = this.field474[var3];
                boolean var8 = true;
                while (var8) {
                    var8 = false;
                    for (int var18 = 0; var18 < var3; ++var18) {
                        if (var5 + 2 > this.field473[var18] - this.field474[var18] && var5 - var7 < this.field473[var18] + 2 && var4 - var6 < this.field475[var18] + this.field472[var18] && var4 + var6 > this.field472[var18] - this.field475[var18] && this.field473[var18] - this.field474[var18] < var5) {
                            var5 = this.field473[var18] - this.field474[var18];
                            var8 = true;
                        }
                    }
                }
                this.field573 = this.field472[var3];
                this.field574 = this.field473[var3] = var5;
                String var9 = this.field479[var3];
                if (this.field400 == 0) {
                    int var10 = 16776960;
                    if (this.field476[var3] < 6) {
                        var10 = this.field262[this.field476[var3]];
                    }
                    if (this.field476[var3] == 6) {
                        var10 = this.field163 % 20 < 10 ? 16711680 : 16776960;
                    }
                    if (this.field476[var3] == 7) {
                        var10 = this.field163 % 20 < 10 ? 255 : 65535;
                    }
                    if (this.field476[var3] == 8) {
                        var10 = this.field163 % 20 < 10 ? 45056 : 8454016;
                    }
                    if (this.field476[var3] == 9) {
                        int var11 = 150 - this.field478[var3];
                        if (var11 < 50) {
                            var10 = var11 * 1280 + 16711680;
                        } else if (var11 < 100) {
                            var10 = 16776960 - (var11 - 50) * 327680;
                        } else if (var11 < 150) {
                            var10 = (var11 - 100) * 5 + 65280;
                        }
                    }
                    if (this.field476[var3] == 10) {
                        int var12 = 150 - this.field478[var3];
                        if (var12 < 50) {
                            var10 = var12 * 5 + 16711680;
                        } else if (var12 < 100) {
                            var10 = 16711935 - (var12 - 50) * 327680;
                        } else if (var12 < 150) {
                            var10 = (var12 - 100) * 327680 + 255 - (var12 - 100) * 5;
                        }
                    }
                    if (this.field476[var3] == 11) {
                        int var13 = 150 - this.field478[var3];
                        if (var13 < 50) {
                            var10 = 16777215 - var13 * 327685;
                        } else if (var13 < 100) {
                            var10 = (var13 - 50) * 327685 + 65280;
                        } else if (var13 < 150) {
                            var10 = 16777215 - (var13 - 100) * 327680;
                        }
                    }
                    if (this.field477[var3] == 0) {
                        this.field208.method18(0, var9, this.field574 + 1, this.field573, 0);
                        this.field208.method18(var10, var9, this.field574, this.field573, 0);
                    }
                    if (this.field477[var3] == 1) {
                        this.field208.method23(this.field573, var9, 0, this.field332, this.field574 + 1, this.field163);
                        this.field208.method23(this.field573, var9, var10, this.field332, this.field574, this.field163);
                    }
                    if (this.field477[var3] == 2) {
                        this.field208.method24(this.field369, this.field163, this.field574 + 1, this.field573, 0, var9);
                        this.field208.method24(this.field369, this.field163, this.field574, this.field573, var10, var9);
                    }
                    if (this.field477[var3] == 3) {
                        this.field208.method25(this.field574 + 1, this.field344, this.field573, this.field163, 150 - this.field478[var3], var9, 0);
                        this.field208.method25(this.field574, this.field344, this.field573, this.field163, 150 - this.field478[var3], var9, var10);
                    }
                    if (this.field477[var3] == 4) {
                        int var14 = this.field208.method21(var9, 0);
                        int var15 = (150 - this.field478[var3]) * (var14 + 100) / 150;
                        class15.method211(0, this.field573 - 50, 334, this.field573 + 50, -39271);
                        this.field208.method22((byte) 6, this.field574 + 1, var9, this.field573 + 50 - var15, 0);
                        this.field208.method22((byte) 6, this.field574, var9, this.field573 + 50 - var15, var10);
                        class15.method210(9);
                    }
                    if (this.field477[var3] == 5) {
                        int var16 = 150 - this.field478[var3];
                        int var17 = 0;
                        if (var16 < 25) {
                            var17 = var16 - 25;
                        } else if (var16 > 125) {
                            var17 = var16 - 125;
                        }
                        class15.method211(this.field574 - this.field208.field74 - 1, 0, this.field574 + 5, 512, -39271);
                        this.field208.method18(0, var9, this.field574 + 1 + var17, this.field573, 0);
                        this.field208.method18(var10, var9, this.field574 + var17, this.field573, 0);
                        class15.method210(9);
                    }
                } else {
                    this.field208.method18(0, var9, this.field574 + 1, this.field573, 0);
                    this.field208.method18(16776960, var9, this.field574, this.field573, 0);
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "p", descriptor = "(B)V")
    public final void method173(byte arg0) {
        if (arg0 == -86) {
            this.field322 = 0;
            int var2 = (field519.field938 >> 7) + this.field280;
            int var3 = (field519.field939 >> 7) + this.field281;
            if (var2 >= 3053 && var2 <= 3156 && var3 >= 3056 && var3 <= 3136) {
                this.field322 = 1;
            }
            if (var2 >= 3072 && var2 <= 3118 && var3 >= 9492 && var3 <= 9535) {
                this.field322 = 1;
            }
            if (this.field322 == 1 && var2 >= 3139 && var2 <= 3199 && var3 >= 3008 && var3 <= 3062) {
                this.field322 = 0;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "q", descriptor = "(B)V")
    public final void method174(byte arg0) {
        if (this.field261 >= 2 || this.field230 != 0 || this.field402 != 0) {
            if (arg0 != 125) {
                this.method147();
            }
            String var2;
            if (this.field230 == 1 && this.field261 < 2) {
                var2 = "Use " + this.field234 + " with...";
            } else if (this.field402 == 1 && this.field261 < 2) {
                var2 = this.field405 + "...";
            } else {
                var2 = this.field419[this.field261 - 1];
            }
            if (this.field261 > 2) {
                var2 = var2 + "@whi@ / " + (this.field261 - 2) + " more options";
            }
            this.field208.method27(16777215, 4, var2, 15, true, (byte) 2, field502 / 1000);
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(ZLMYGSUHVG;)Z")
    public final boolean method175(boolean arg0, class39 arg1) {
        if (arg1.field1206 == null) {
            return false;
        } else {
            for (int var3 = 0; var3 < arg1.field1206.length; ++var3) {
                int var4 = this.method113(arg1, (byte) -58, var3);
                int var5 = arg1.field1239[var3];
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
            if (!arg0) {
                this.field418 = null;
            }
            return true;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(Ljava/lang/String;)Ljava/io/DataInputStream;")
    public final DataInputStream method176(String arg0) throws IOException {
        if (!this.field254) {
            return signlink.mainapp != null ? signlink.openurl(arg0) : new DataInputStream((new URL(this.getCodeBase(), arg0)).openStream());
        } else {
            if (this.field158 != null) {
                try {
                    this.field158.close();
                } catch (Exception var4) {
                }
                this.field158 = null;
            }
            this.field158 = this.method177(43595);
            this.field158.setSoTimeout(10000);
            InputStream var2 = this.field158.getInputStream();
            OutputStream var3 = this.field158.getOutputStream();
            var3.write(("JAGGRAB /" + arg0 + "\n\n").getBytes());
            return new DataInputStream(var2);
        }
    }

    @OriginalMember(owner = "client!client", name = "B", descriptor = "(I)Ljava/net/Socket;")
    public final Socket method177(int arg0) throws IOException {
        return signlink.mainapp != null ? signlink.opensocket(arg0) : new Socket(InetAddress.getByName(this.getCodeBase().getHost()), arg0);
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(JI)V")
    public final void method178(long arg0, int arg1) {
        if (arg0 != 0L) {
            if (this.field130 >= 100 && this.field287 != 1) {
                this.method102(4, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else if (this.field130 >= 200) {
                this.method102(4, "Your friendlist is full. Max of 100 for free users, and 200 for members", 0, "");
            } else {
                String var4 = class58.method551(class58.method548(arg0, 13452), 0);
                if (arg1 < 0) {
                    for (int var5 = 0; var5 < this.field130; ++var5) {
                        if (this.field240[var5] == arg0) {
                            this.method102(4, var4 + " is already on your friend list", 0, "");
                            return;
                        }
                    }
                    for (int var6 = 0; var6 < this.field510; ++var6) {
                        if (this.field169[var6] == arg0) {
                            this.method102(4, "Please remove " + var4 + " from your ignore list first", 0, "");
                            return;
                        }
                    }
                    if (!var4.equals(field519.field93)) {
                        this.field580[this.field130] = var4;
                        this.field240[this.field130] = arg0;
                        this.field162[this.field130] = 0;
                        ++this.field130;
                        this.field258 = true;
                        this.field426.method346(52, true);
                        this.field426.method353(arg0, 2);
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIIIII)V")
    public final void method179(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        int var7 = this.field451.method278(arg3, arg4, arg2);
        while (arg0 >= 0) {
            this.field355 = this.field203.method483();
        }
        if (var7 != 0) {
            int var8 = this.field451.method282(arg3, arg4, arg2, var7);
            int var9 = var8 >> 6 & 3;
            int var10 = var8 & 31;
            int var11 = arg5;
            if (var7 > 0) {
                var11 = arg1;
            }
            int[] var12 = this.field374.field789;
            int var13 = (103 - arg2) * 512 * 4 + arg4 * 4 + 24624;
            int var14 = var7 >> 14 & 32767;
            class8 var15 = class8.method203(var14);
            if (var15.field643 != -1) {
                class5 var16 = this.field397[var15.field643];
                if (var16 != null) {
                    int var17 = (var15.field629 * 4 - var16.field82) / 2;
                    int var18 = (var15.field671 * 4 - var16.field83) / 2;
                    var16.method38(-23827, arg4 * 4 + 48 + var17, (104 - arg2 - var15.field671) * 4 + 48 + var18);
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
        int var19 = this.field451.method280(arg3, arg4, arg2);
        if (var19 != 0) {
            int var20 = this.field451.method282(arg3, arg4, arg2, var19);
            int var21 = var20 >> 6 & 3;
            int var22 = var20 & 31;
            int var23 = var19 >> 14 & 32767;
            class8 var24 = class8.method203(var23);
            if (var24.field643 != -1) {
                class5 var25 = this.field397[var24.field643];
                if (var25 != null) {
                    int var26 = (var24.field629 * 4 - var25.field82) / 2;
                    int var27 = (var24.field671 * 4 - var25.field83) / 2;
                    var25.method38(-23827, arg4 * 4 + 48 + var26, (104 - arg2 - var24.field671) * 4 + 48 + var27);
                }
            } else if (var22 == 9) {
                int var28 = 15658734;
                if (var19 > 0) {
                    var28 = 15597568;
                }
                int[] var29 = this.field374.field789;
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
        int var31 = this.field451.method281(arg3, arg4, arg2);
        if (var31 != 0) {
            int var32 = var31 >> 14 & 32767;
            class8 var33 = class8.method203(var32);
            if (var33.field643 != -1) {
                class5 var34 = this.field397[var33.field643];
                if (var34 != null) {
                    int var35 = (var33.field629 * 4 - var34.field82) / 2;
                    int var36 = (var33.field671 * 4 - var34.field83) / 2;
                    var34.method38(-23827, arg4 * 4 + 48 + var35, (104 - arg2 - var33.field671) * 4 + 48 + var36);
                    return;
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "h", descriptor = "(II)Ljava/lang/String;")
    private static final String method180(int arg0, int arg1) {
        if (arg0 <= 0) {
            throw new NullPointerException();
        } else if (arg1 < 100000) {
            return String.valueOf(arg1);
        } else {
            return arg1 < 10000000 ? arg1 / 1000 + "K" : arg1 / 1000000 + "M";
        }
    }

    @OriginalMember(owner = "client!client", name = "C", descriptor = "(I)V")
    public final void method181(int arg0) {
        this.field454.method206((byte) 59);
        if (this.field215 == 2) {
            byte[] var2 = this.field487.field80;
            int[] var3 = class15.field722;
            int var4 = var2.length;
            for (int var5 = 0; var5 < var4; ++var5) {
                if (var2[var5] == 0) {
                    var3[var5] = 0;
                }
            }
            this.field609.method237(25, true, this.field579, 256, 33, this.field328, 33, 0, 25, 0, this.field429);
            this.field455.method206((byte) 59);
            class59.field1613 = this.field517;
        } else {
            int var6 = this.field429 + this.field264 & 2047;
            int var7 = field519.field938 / 32 + 48;
            int var8 = 464 - field519.field939 / 32;
            this.field374.method237(var7, true, this.field275, this.field410 + 256, 151, this.field529, 146, 5, var8, 25, var6);
            while (arg0 >= 0) {
                this.field352 = 195;
            }
            this.field609.method237(25, true, this.field579, 256, 33, this.field328, 33, 0, 25, 0, this.field429);
            for (int var9 = 0; var9 < this.field310; ++var9) {
                int var39 = this.field311[var9] * 4 + 2 - field519.field938 / 32;
                int var40 = this.field312[var9] * 4 + 2 - field519.field939 / 32;
                this.method126(false, this.field448[var9], var40, var39);
            }
            for (int var10 = 0; var10 < 104; ++var10) {
                for (int var35 = 0; var35 < 104; ++var35) {
                    class24 var36 = this.field418[this.field452][var10][var35];
                    if (var36 != null) {
                        int var37 = var10 * 4 + 2 - field519.field938 / 32;
                        int var38 = var35 * 4 + 2 - field519.field939 / 32;
                        this.method126(false, this.field611, var38, var37);
                    }
                }
            }
            for (int var11 = 0; var11 < this.field602; ++var11) {
                class1 var31 = this.field601[this.field603[var11]];
                if (var31 != null && var31.method1((byte) 9)) {
                    class30 var32 = var31.field2;
                    if (var32.field988 != null) {
                        var32 = var32.method316(true);
                    }
                    if (var32 != null && var32.field1010 && var32.field977) {
                        int var33 = var31.field938 / 32 - field519.field938 / 32;
                        int var34 = var31.field939 / 32 - field519.field939 / 32;
                        this.method126(false, this.field612, var34, var33);
                    }
                }
            }
            for (int var12 = 0; var12 < this.field153; ++var12) {
                class6 var23 = this.field152[this.field154[var12]];
                if (var23 != null && var23.method1((byte) 9)) {
                    int var24 = var23.field938 / 32 - field519.field938 / 32;
                    int var25 = var23.field939 / 32 - field519.field939 / 32;
                    boolean var26 = false;
                    long var27 = class58.method547(var23.field93);
                    for (int var29 = 0; var29 < this.field130; ++var29) {
                        if (this.field240[var29] == var27 && this.field162[var29] != 0) {
                            var26 = true;
                            break;
                        }
                    }
                    boolean var30 = false;
                    if (field519.field100 != 0 && var23.field100 != 0 && field519.field100 == var23.field100) {
                        var30 = true;
                    }
                    if (var26) {
                        this.method126(false, this.field614, var25, var24);
                    } else if (var30) {
                        this.method126(false, this.field615, var25, var24);
                    } else {
                        this.method126(false, this.field613, var25, var24);
                    }
                }
            }
            if (this.field534 != 0 && field502 % 20 < 10) {
                if (this.field534 == 1 && this.field480 >= 0 && this.field480 < this.field601.length) {
                    class1 var13 = this.field601[this.field480];
                    if (var13 != null) {
                        int var14 = var13.field938 / 32 - field519.field938 / 32;
                        int var15 = var13.field939 / 32 - field519.field939 / 32;
                        this.method139(31951, var15, this.field383, var14);
                    }
                }
                if (this.field534 == 2) {
                    int var16 = (this.field181 - this.field280) * 4 + 2 - field519.field938 / 32;
                    int var17 = (this.field182 - this.field281) * 4 + 2 - field519.field939 / 32;
                    this.method139(31951, var17, this.field383, var16);
                }
                if (this.field534 == 10 && this.field449 >= 0 && this.field449 < this.field152.length) {
                    class6 var18 = this.field152[this.field449];
                    if (var18 != null) {
                        int var19 = var18.field938 / 32 - field519.field938 / 32;
                        int var20 = var18.field939 / 32 - field519.field939 / 32;
                        this.method139(31951, var20, this.field383, var19);
                    }
                }
            }
            if (this.field372 != 0) {
                int var21 = this.field372 * 4 + 2 - field519.field938 / 32;
                int var22 = this.field373 * 4 + 2 - field519.field939 / 32;
                this.method126(false, this.field382, var22, var21);
            }
            class15.method214(16777215, 435, 3, 97, 78, 3);
            this.field455.method206((byte) 59);
            class59.field1613 = this.field517;
        }
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(IIIIII)V")
    public final void method182(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
        if (arg4 < 0) {
            this.field186.method38(-23827, arg1, arg3);
            this.field187.method38(-23827, arg1, arg2 + arg3 - 16);
            class15.method214(this.field495, 435, arg2 - 32, arg1, arg3 + 16, 16);
            int var7 = (arg2 - 32) * arg2 / arg5;
            if (var7 < 8) {
                var7 = 8;
            }
            int var8 = (arg2 - 32 - var7) * arg0 / (arg5 - arg2);
            class15.method214(this.field575, 435, var7, arg1, arg3 + 16 + var8, 16);
            class15.method219(arg3 + 16 + var8, var7, (byte) 81, arg1, this.field216);
            class15.method219(arg3 + 16 + var8, var7, (byte) 81, arg1 + 1, this.field216);
            class15.method217(arg1, arg3 + 16 + var8, -368, this.field216, 16);
            class15.method217(arg1, arg3 + 17 + var8, -368, this.field216, 16);
            class15.method219(arg3 + 16 + var8, var7, (byte) 81, arg1 + 15, this.field307);
            class15.method219(arg3 + 17 + var8, var7 - 1, (byte) 81, arg1 + 14, this.field307);
            class15.method217(arg1, arg3 + 15 + var8 + var7, -368, this.field307, 16);
            class15.method217(arg1 + 1, arg3 + 14 + var8 + var7, -368, this.field307, 15);
        }
    }

    @OriginalMember(owner = "client!client", name = "D", descriptor = "(I)V")
    public final void method183(int arg0) {
        if (arg0 >= 0) {
            this.field167 = this.field203.method483();
        }
        if (this.field622 != 0) {
            int var2 = 0;
            if (this.field520 != 0) {
                var2 = 1;
            }
            for (int var3 = 0; var3 < 100; ++var3) {
                if (this.field585[var3] != null) {
                    int var4 = this.field583[var3];
                    String var5 = this.field584[var3];
                    boolean var6 = false;
                    if (var5 != null && var5.startsWith("@cr1@")) {
                        var5 = var5.substring(5);
                        boolean var7 = true;
                    }
                    if (var5 != null && var5.startsWith("@cr2@")) {
                        var5 = var5.substring(5);
                        boolean var8 = true;
                    }
                    if ((var4 == 3 || var4 == 7) && (var4 == 7 || this.field276 == 0 || this.field276 == 1 && this.method74(-238, var5))) {
                        int var9 = 329 - var2 * 13;
                        if (super.field1272 > 4 && super.field1273 - 4 > var9 - 10 && super.field1273 - 4 <= var9 + 3) {
                            int var10 = this.field207.method20(0, "From:  " + var5 + this.field585[var3]) + 25;
                            if (var10 > 450) {
                                var10 = 450;
                            }
                            if (super.field1272 < var10 + 4) {
                                if (this.field433 >= 1) {
                                    this.field419[this.field261] = "Report abuse @whi@" + var5;
                                    this.field464[this.field261] = 2614;
                                    ++this.field261;
                                }
                                this.field419[this.field261] = "Add ignore @whi@" + var5;
                                this.field464[this.field261] = 2235;
                                ++this.field261;
                                this.field419[this.field261] = "Add friend @whi@" + var5;
                                this.field464[this.field261] = 2087;
                                ++this.field261;
                            }
                        }
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                    if ((var4 == 5 || var4 == 6) && this.field276 < 2) {
                        ++var2;
                        if (var2 >= 5) {
                            return;
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "i", descriptor = "(II)Z")
    public final boolean method184(int arg0, int arg1) {
        if (arg1 < 0) {
            return false;
        } else {
            int var3 = this.field464[arg1];
            if (arg0 != -39865) {
                for (int var4 = 1; var4 > 0; ++var4) {
                }
            }
            if (var3 >= 2000) {
                var3 -= 2000;
            }
            return var3 == 87;
        }
    }

    @OriginalMember(owner = "client!client", name = "E", descriptor = "(I)V")
    public final void method185(int arg0) {
        int var2 = this.field208.method20(0, "Choose Option");
        for (int var3 = 0; var3 < this.field261; ++var3) {
            int var11 = this.field208.method20(0, this.field419[var3]);
            if (var11 > var2) {
                var2 = var11;
            }
        }
        if (arg0 == 6) {
            var2 += 8;
            int var4 = this.field261 * 15 + 21;
            if (super.field1279 > 4 && super.field1280 > 4 && super.field1279 < 516 && super.field1280 < 338) {
                int var5 = super.field1279 - 4 - var2 / 2;
                if (var2 + var5 > 512) {
                    var5 = 512 - var2;
                }
                if (var5 < 0) {
                    var5 = 0;
                }
                int var6 = super.field1280 - 4;
                if (var4 + var6 > 334) {
                    var6 = 334 - var4;
                }
                if (var6 < 0) {
                    var6 = 0;
                }
                this.field315 = true;
                this.field544 = 0;
                this.field545 = var5;
                this.field546 = var6;
                this.field547 = var2;
                this.field548 = this.field261 * 15 + 22;
            }
            if (super.field1279 > 553 && super.field1280 > 205 && super.field1279 < 743 && super.field1280 < 466) {
                int var7 = super.field1279 - 553 - var2 / 2;
                if (var7 < 0) {
                    var7 = 0;
                } else if (var2 + var7 > 190) {
                    var7 = 190 - var2;
                }
                int var8 = super.field1280 - 205;
                if (var8 < 0) {
                    var8 = 0;
                } else if (var4 + var8 > 261) {
                    var8 = 261 - var4;
                }
                this.field315 = true;
                this.field544 = 1;
                this.field545 = var7;
                this.field546 = var8;
                this.field547 = var2;
                this.field548 = this.field261 * 15 + 22;
            }
            if (super.field1279 > 17 && super.field1280 > 357 && super.field1279 < 496 && super.field1280 < 453) {
                int var9 = super.field1279 - 17 - var2 / 2;
                if (var9 < 0) {
                    var9 = 0;
                } else if (var2 + var9 > 479) {
                    var9 = 479 - var2;
                }
                int var10 = super.field1280 - 357;
                if (var10 < 0) {
                    var10 = 0;
                } else if (var4 + var10 > 96) {
                    var10 = 96 - var4;
                }
                this.field315 = true;
                this.field544 = 2;
                this.field545 = var9;
                this.field546 = var10;
                this.field547 = var2;
                this.field548 = this.field261 * 15 + 22;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(III)Z")
    public final boolean method186(int arg0, int arg1, int arg2) {
        boolean var4 = false;
        if (arg0 >= 0) {
            throw new NullPointerException();
        } else {
            class39 var5 = class39.method402(arg2);
            for (int var6 = 0; var6 < var5.field1214.length && var5.field1214[var6] != -1; ++var6) {
                class39 var7 = class39.method402(var5.field1214[var6]);
                if (var7.field1242 == 0) {
                    var4 |= this.method186(-523, arg1, var7.field1226);
                }
                if (var7.field1242 == 6 && (var7.field1210 != -1 || var7.field1211 != -1)) {
                    boolean var8 = this.method175(this.field375, var7);
                    int var9;
                    if (var8) {
                        var9 = var7.field1211;
                    } else {
                        var9 = var7.field1210;
                    }
                    if (var9 != -1) {
                        class28 var10 = class28.field952[var9];
                        var7.field1248 += arg1;
                        while (var7.field1248 > var10.method308(6, var7.field1209)) {
                            var7.field1248 -= var10.method308(6, var7.field1209) + 1;
                            ++var7.field1209;
                            if (var7.field1209 >= var10.field953) {
                                var7.field1209 -= var10.field957;
                                if (var7.field1209 < 0 || var7.field1209 >= var10.field953) {
                                    var7.field1209 = 0;
                                }
                            }
                            var4 = true;
                        }
                    }
                }
                if (var7.field1242 == 6 && var7.field1205 != 0) {
                    int var11 = var7.field1205 >> 16;
                    int var12 = var7.field1205 << 16 >> 16;
                    int var13 = arg1 * var11;
                    int var14 = arg1 * var12;
                    var7.field1203 = var7.field1203 + var13 & 2047;
                    var7.field1204 = var7.field1204 + var14 & 2047;
                    var4 = true;
                }
            }
            return var4;
        }
    }

    @OriginalMember(owner = "client!client", name = "F", descriptor = "(I)V")
    public final void method187(int arg0) {
        this.method80(-8180);
        if (this.field304 == 1) {
            this.field459[this.field303 / 100].method233(-23827, this.field301 - 8 - 4, this.field302 - 8 - 4);
        }
        if (this.field304 == 2) {
            this.field459[this.field303 / 100 + 4].method233(-23827, this.field301 - 8 - 4, this.field302 - 8 - 4);
        }
        if (this.field228 != -1) {
            this.method186(-523, this.field590, this.field228);
            this.method124(class39.method402(this.field228), 0, 0, 878, 0);
        }
        if (this.field348 != -1) {
            this.method186(-523, this.field590, this.field348);
            this.method124(class39.method402(this.field348), 0, 0, 878, 0);
        }
        this.method173((byte) -86);
        if (arg0 != -30964) {
            this.field426.method347(153);
        }
        if (!this.field315) {
            this.method165((byte) 106);
            this.method174((byte) 125);
        } else if (this.field544 == 0) {
            this.method69(-705);
        }
        if (this.field330 == 1) {
            this.field409.method233(-23827, 472, 296);
        }
        if (field305) {
            short var2 = 507;
            byte var3 = 20;
            int var4 = 16776960;
            if (super.field1260 < 30 && field379) {
                var4 = 16711680;
            }
            if (super.field1260 < 20 && !field379) {
                var4 = 16711680;
            }
            this.field207.method17(var2, var4, "Fps:" + super.field1260, var3, false);
            int var13 = var3 + 15;
            Runtime var5 = Runtime.getRuntime();
            int var6 = (int) ((var5.totalMemory() - var5.freeMemory()) / 1024L);
            int var7 = 16776960;
            if (var6 > 33554432 && field379) {
                int var8 = 16711680;
            }
            if (var6 > 67108864 && !field379) {
                int var9 = 16711680;
            }
            this.field207.method17(var2, 16776960, "Mem:" + var6 + "k", var13, false);
            var13 += 15;
        }
        if (this.field520 != 0) {
            int var10 = this.field520 / 50;
            int var11 = var10 / 60;
            int var12 = var10 % 60;
            if (var12 < 10) {
                this.field207.method22((byte) 6, 329, "System update in: " + var11 + ":0" + var12, 4, 16776960);
            } else {
                this.field207.method22((byte) 6, 329, "System update in: " + var11 + ":" + var12, 4, 16776960);
            }
            ++field349;
            if (field349 > 74) {
                field349 = 0;
                this.field426.method346(105, true);
                return;
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "j", descriptor = "(II)Ljava/lang/String;")
    private static final String method188(int arg0, int arg1) {
        String var2 = String.valueOf(arg1);
        if (arg0 >= 0) {
            field535 = !field535;
        }
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

    @OriginalMember(owner = "client!client", name = "G", descriptor = "(I)V")
    public final void method189(int arg0) {
        if (this.field230 == 0 && this.field402 == 0) {
            this.field419[this.field261] = "Walk here";
            this.field464[this.field261] = 2;
            this.field462[this.field261] = super.field1272;
            this.field463[this.field261] = super.field1273;
            ++this.field261;
        }
        int var2 = -1;
        if (arg0 <= 0) {
            this.field168 = -329;
        }
        for (int var3 = 0; var3 < class42.field1357; ++var3) {
            int var4 = class42.field1358[var3];
            int var5 = var4 & 127;
            int var6 = var4 >> 7 & 127;
            int var7 = var4 >> 29 & 3;
            int var8 = var4 >> 14 & 32767;
            if (var2 != var4) {
                var2 = var4;
                if (var7 == 2 && this.field451.method282(this.field452, var5, var6, var4) >= 0) {
                    class8 var9 = class8.method203(var8);
                    if (var9.field638 != null) {
                        var9 = var9.method195(-731);
                    }
                    if (var9 == null) {
                        continue;
                    }
                    if (this.field230 == 1) {
                        this.field419[this.field261] = "Use " + this.field234 + " with @cya@" + var9.field670;
                        this.field464[this.field261] = 697;
                        this.field465[this.field261] = var4;
                        this.field462[this.field261] = var5;
                        this.field463[this.field261] = var6;
                        ++this.field261;
                    } else if (this.field402 == 1) {
                        if ((this.field404 & 4) == 4) {
                            this.field419[this.field261] = this.field405 + " @cya@" + var9.field670;
                            this.field464[this.field261] = 917;
                            this.field465[this.field261] = var4;
                            this.field462[this.field261] = var5;
                            this.field463[this.field261] = var6;
                            ++this.field261;
                        }
                    } else {
                        if (var9.field633 != null) {
                            for (int var10 = 4; var10 >= 0; --var10) {
                                if (var9.field633[var10] != null) {
                                    this.field419[this.field261] = var9.field633[var10] + " @cya@" + var9.field670;
                                    if (var10 == 0) {
                                        this.field464[this.field261] = 861;
                                    }
                                    if (var10 == 1) {
                                        this.field464[this.field261] = 601;
                                    }
                                    if (var10 == 2) {
                                        this.field464[this.field261] = 732;
                                    }
                                    if (var10 == 3) {
                                        this.field464[this.field261] = 702;
                                    }
                                    if (var10 == 4) {
                                        this.field464[this.field261] = 1478;
                                    }
                                    this.field465[this.field261] = var4;
                                    this.field462[this.field261] = var5;
                                    this.field463[this.field261] = var6;
                                    ++this.field261;
                                }
                            }
                        }
                        this.field419[this.field261] = "Examine @cya@" + var9.field670;
                        this.field464[this.field261] = 1881;
                        this.field465[this.field261] = var9.field662 << 14;
                        this.field462[this.field261] = var5;
                        this.field463[this.field261] = var6;
                        ++this.field261;
                    }
                }
                if (var7 == 1) {
                    class1 var11 = this.field601[var8];
                    if (var11.field2.field1005 == 1 && (var11.field938 & 127) == 64 && (var11.field939 & 127) == 64) {
                        for (int var12 = 0; var12 < this.field602; ++var12) {
                            class1 var15 = this.field601[this.field603[var12]];
                            if (var15 != null && var11 != var15 && var15.field2.field1005 == 1 && var11.field938 == var15.field938 && var11.field939 == var15.field939) {
                                this.method92((byte) 6, var5, this.field603[var12], var6, var15.field2);
                            }
                        }
                        for (int var13 = 0; var13 < this.field153; ++var13) {
                            class6 var14 = this.field152[this.field154[var13]];
                            if (var14 != null && var11.field938 == var14.field938 && var11.field939 == var14.field939) {
                                this.method49(var14, (byte) 36, var5, this.field154[var13], var6);
                            }
                        }
                    }
                    this.method92((byte) 6, var5, var8, var6, var11.field2);
                }
                if (var7 == 0) {
                    class6 var16 = this.field152[var8];
                    if ((var16.field938 & 127) == 64 && (var16.field939 & 127) == 64) {
                        for (int var17 = 0; var17 < this.field602; ++var17) {
                            class1 var20 = this.field601[this.field603[var17]];
                            if (var20 != null && var20.field2.field1005 == 1 && var16.field938 == var20.field938 && var16.field939 == var20.field939) {
                                this.method92((byte) 6, var5, this.field603[var17], var6, var20.field2);
                            }
                        }
                        for (int var18 = 0; var18 < this.field153; ++var18) {
                            class6 var19 = this.field152[this.field154[var18]];
                            if (var19 != null && var16 != var19 && var16.field938 == var19.field938 && var16.field939 == var19.field939) {
                                this.method49(var19, (byte) 36, var5, this.field154[var18], var6);
                            }
                        }
                    }
                    this.method49(var16, (byte) 36, var5, var8, var6);
                }
                if (var7 == 3) {
                    class24 var21 = this.field418[this.field452][var5][var6];
                    if (var21 != null) {
                        for (class16 var22 = (class16) var21.method247(true); var22 != null; var22 = (class16) var21.method249(this.field352)) {
                            class3 var23 = class3.method11(var22.field735);
                            if (this.field230 == 1) {
                                this.field419[this.field261] = "Use " + this.field234 + " with @lre@" + var23.field43;
                                this.field464[this.field261] = 368;
                                this.field465[this.field261] = var22.field735;
                                this.field462[this.field261] = var5;
                                this.field463[this.field261] = var6;
                                ++this.field261;
                            } else if (this.field402 == 1) {
                                if ((this.field404 & 1) == 1) {
                                    this.field419[this.field261] = this.field405 + " @lre@" + var23.field43;
                                    this.field464[this.field261] = 450;
                                    this.field465[this.field261] = var22.field735;
                                    this.field462[this.field261] = var5;
                                    this.field463[this.field261] = var6;
                                    ++this.field261;
                                }
                            } else {
                                for (int var24 = 4; var24 >= 0; --var24) {
                                    if (var23.field61 != null && var23.field61[var24] != null) {
                                        this.field419[this.field261] = var23.field61[var24] + " @lre@" + var23.field43;
                                        if (var24 == 0) {
                                            this.field464[this.field261] = 644;
                                        }
                                        if (var24 == 1) {
                                            this.field464[this.field261] = 603;
                                        }
                                        if (var24 == 2) {
                                            this.field464[this.field261] = 194;
                                        }
                                        if (var24 == 3) {
                                            this.field464[this.field261] = 745;
                                        }
                                        if (var24 == 4) {
                                            this.field464[this.field261] = 344;
                                        }
                                        this.field465[this.field261] = var22.field735;
                                        this.field462[this.field261] = var5;
                                        this.field463[this.field261] = var6;
                                        ++this.field261;
                                    } else if (var24 == 2) {
                                        this.field419[this.field261] = "Take @lre@" + var23.field43;
                                        this.field464[this.field261] = 194;
                                        this.field465[this.field261] = var22.field735;
                                        this.field462[this.field261] = var5;
                                        this.field463[this.field261] = var6;
                                        ++this.field261;
                                    }
                                }
                                this.field419[this.field261] = "Examine @lre@" + var23.field43;
                                this.field464[this.field261] = 1993;
                                this.field465[this.field261] = var22.field735;
                                this.field462[this.field261] = var5;
                                this.field463[this.field261] = var6;
                                ++this.field261;
                            }
                        }
                    }
                }
            }
        }
    }

    @OriginalMember(owner = "client!client", name = "d", descriptor = "(ILMVHXDWGI;I)V")
    private final void method190(int arg0, class38 arg1, int arg2) {
        for (int var4 = 0; var4 < this.field155; ++var4) {
            int var6 = this.field156[var4];
            class1 var7 = this.field601[var6];
            int var8 = arg1.method357();
            if ((var8 & 32) != 0) {
                var7.field897 = arg1.method384(3);
                var7.field898 = arg1.method385(-20383);
            }
            if ((var8 & 1) != 0) {
                var7.field900 = arg1.method383(false);
                int var9 = arg1.method390(9);
                var7.field904 = var9 >> 16;
                var7.field903 = (var9 & 65535) + field502;
                var7.field901 = 0;
                var7.field902 = 0;
                if (var7.field903 > field502) {
                    var7.field901 = -1;
                }
                if (var7.field900 == 65535) {
                    var7.field900 = -1;
                }
            }
            if ((var8 & 16) != 0) {
                int var10 = arg1.method385(-20383);
                if (var10 == 65535) {
                    var10 = -1;
                }
                int var11 = arg1.method377((byte) -114);
                if (var7.field933 == var10 && var10 != -1) {
                    int var12 = class28.field952[var10].field966;
                    if (var12 == 1) {
                        var7.field934 = 0;
                        var7.field935 = 0;
                        var7.field936 = var11;
                        var7.field937 = 0;
                    }
                    if (var12 == 2) {
                        var7.field937 = 0;
                    }
                } else if (var10 == -1 || var7.field933 == -1 || class28.field952[var10].field960 >= class28.field952[var7.field933].field960) {
                    var7.field933 = var10;
                    var7.field934 = 0;
                    var7.field935 = 0;
                    var7.field936 = var11;
                    var7.field937 = 0;
                    var7.field924 = var7.field926;
                }
            }
            if ((var8 & 128) != 0) {
                int var13 = arg1.method357();
                int var14 = arg1.method357();
                var7.method305(var13, -921, field502, var14);
                var7.field930 = field502 + 300;
                var7.field931 = arg1.method377((byte) -114);
                var7.field932 = arg1.method357();
            }
            if ((var8 & 64) != 0) {
                int var15 = arg1.method376(false);
                int var16 = arg1.method375(964);
                var7.method305(var15, -921, field502, var16);
                var7.field930 = field502 + 300;
                var7.field931 = arg1.method376(false);
                var7.field932 = arg1.method357();
            }
            if ((var8 & 8) != 0) {
                var7.field2 = class30.method315(arg1.method359());
                var7.field922 = var7.field2.field1005;
                var7.field941 = var7.field2.field1004;
                var7.field915 = var7.field2.field1001;
                var7.field916 = var7.field2.field984;
                var7.field917 = var7.field2.field1006;
                var7.field918 = var7.field2.field978;
                var7.field942 = var7.field2.field1011;
            }
            if ((var8 & 2) != 0) {
                var7.field925 = arg1.method383(false);
                if (var7.field925 == 65535) {
                    var7.field925 = -1;
                }
            }
            if ((var8 & 4) != 0) {
                var7.field914 = arg1.method364();
                var7.field949 = 100;
            }
        }
        int var10000 = arg0 + arg2;
    }

    @OriginalMember(owner = "client!client", name = "b", descriptor = "(I)V")
    public final void method191(int arg0) {
        if (arg0 != 0) {
            this.field552 = this.field251.method357();
        }
        this.field296 = true;
    }

    @OriginalMember(owner = "client!client", name = "a", descriptor = "(IIILBSQIIHOT;LMVHXDWGI;)V")
    private final void method192(int arg0, int arg1, int arg2, class6 arg3, class38 arg4) {
        while (arg1 >= 0) {
            this.field552 = -1;
        }
        if ((arg0 & 64) != 0) {
            arg3.field897 = arg4.method359();
            arg3.field898 = arg4.method385(-20383);
        }
        if ((arg0 & 512) != 0) {
            arg3.field900 = arg4.method359();
            int var6 = arg4.method391(false);
            arg3.field904 = var6 >> 16;
            arg3.field903 = (var6 & 65535) + field502;
            arg3.field901 = 0;
            arg3.field902 = 0;
            if (arg3.field903 > field502) {
                arg3.field901 = -1;
            }
            if (arg3.field900 == 65535) {
                arg3.field900 = -1;
            }
        }
        if ((arg0 & 1) != 0) {
            arg3.field914 = arg4.method364();
            if (arg3.field914.charAt(0) == '~') {
                arg3.field914 = arg3.field914.substring(1);
                this.method102(4, arg3.field914, 2, arg3.field93);
            } else if (field519 == arg3) {
                this.method102(4, arg3.field914, 2, arg3.field93);
            }
            arg3.field895 = 0;
            arg3.field896 = 0;
            arg3.field949 = 150;
        }
        if ((arg0 & 1024) != 0) {
            int var7 = arg4.method376(false);
            int var8 = arg4.method377((byte) -114);
            arg3.method305(var7, -921, field502, var8);
            arg3.field930 = field502 + 300;
            arg3.field931 = arg4.method375(964);
            arg3.field932 = arg4.method377((byte) -114);
        }
        if ((arg0 & 256) != 0) {
            arg3.field905 = arg4.method377((byte) -114);
            arg3.field907 = arg4.method357();
            arg3.field906 = arg4.method357();
            arg3.field908 = arg4.method377((byte) -114);
            arg3.field909 = arg4.method385(-20383) + field502;
            arg3.field910 = arg4.method359() + field502;
            arg3.field911 = arg4.method377((byte) -114);
            arg3.method304(this.field393);
        }
        if ((arg0 & 16) != 0) {
            int var9 = arg4.method385(-20383);
            int var10 = arg4.method375(964);
            int var11 = arg4.method377((byte) -114);
            int var12 = arg4.field1161;
            if (arg3.field93 != null && arg3.field89) {
                long var13 = class58.method547(arg3.field93);
                boolean var15 = false;
                if (var10 <= 1) {
                    for (int var16 = 0; var16 < this.field510; ++var16) {
                        if (this.field169[var16] == var13) {
                            var15 = true;
                            break;
                        }
                    }
                }
                if (!var15 && this.field322 == 0) {
                    try {
                        this.field600.field1161 = 0;
                        arg4.method393(0, this.field600.field1160, var11, 349);
                        this.field600.field1161 = 0;
                        String var17 = class52.method495(-73, var11, this.field600);
                        String var18 = class43.method451(var17, (byte) 8);
                        arg3.field914 = var18;
                        arg3.field895 = var9 >> 8;
                        arg3.field896 = var9 & 255;
                        arg3.field949 = 150;
                        if (var10 != 2 && var10 != 3) {
                            if (var10 == 1) {
                                this.method102(4, var18, 1, "@cr1@" + arg3.field93);
                            } else {
                                this.method102(4, var18, 2, arg3.field93);
                            }
                        } else {
                            this.method102(4, var18, 1, "@cr2@" + arg3.field93);
                        }
                    } catch (Exception var28) {
                        signlink.reporterror("cde2");
                    }
                }
            }
            arg4.field1161 = var11 + var12;
        }
        if ((arg0 & 4) != 0) {
            arg3.field925 = arg4.method385(-20383);
            if (arg3.field925 == 65535) {
                arg3.field925 = -1;
            }
        }
        if ((arg0 & 32) != 0) {
            int var20 = arg4.method376(false);
            int var21 = arg4.method375(964);
            arg3.method305(var20, -921, field502, var21);
            arg3.field930 = field502 + 300;
            arg3.field931 = arg4.method376(false);
            arg3.field932 = arg4.method376(false);
        }
        if ((arg0 & 128) != 0) {
            int var22 = arg4.method385(-20383);
            if (var22 == 65535) {
                var22 = -1;
            }
            int var23 = arg4.method375(964);
            if (arg3.field933 == var22 && var22 != -1) {
                int var24 = class28.field952[var22].field966;
                if (var24 == 1) {
                    arg3.field934 = 0;
                    arg3.field935 = 0;
                    arg3.field936 = var23;
                    arg3.field937 = 0;
                }
                if (var24 == 2) {
                    arg3.field937 = 0;
                }
            } else if (var22 == -1 || arg3.field933 == -1 || class28.field952[var22].field960 >= class28.field952[arg3.field933].field960) {
                arg3.field933 = var22;
                arg3.field934 = 0;
                arg3.field935 = 0;
                arg3.field936 = var23;
                arg3.field937 = 0;
                arg3.field924 = arg3.field926;
            }
        }
        if ((arg0 & 8) != 0) {
            int var25 = arg4.method357();
            byte[] var26 = new byte[var25];
            class38 var27 = new class38(0, var26);
            arg4.method392(true, 0, var25, var26);
            this.field157[arg2] = var27;
            arg3.method42(var27, -46903);
        }
    }

    @OriginalMember(owner = "client!client", name = "r", descriptor = "(B)V")
    public final void method193(byte arg0) {
        if (arg0 == 4) {
            boolean var2 = false;
        } else {
            this.field134 = -471;
        }
        this.field453.method206((byte) 59);
        class59.field1613 = this.field516;
        this.field486.method38(-23827, 0, 0);
        if (this.field129 != -1) {
            this.method124(class39.method402(this.field129), 0, 0, 878, 0);
        } else if (this.field321[this.field389] != -1) {
            this.method124(class39.method402(this.field321[this.field389]), 0, 0, 878, 0);
        }
        if (this.field315 && this.field544 == 1) {
            this.method69(-705);
        }
        this.field453.method207(super.field1264, (byte) 19, 205, 553);
        this.field455.method206((byte) 59);
        class59.field1613 = this.field517;
    }

    @OriginalMember(owner = "client!client", name = "H", descriptor = "(I)V")
    public final void method194(int arg0) {
        this.field530 = new class5(this.field604, "titlebox", 0);
        if (arg0 != 22535) {
            this.field552 = -1;
        }
        this.field531 = new class5(this.field604, "titlebutton", 0);
        this.field511 = new class5[12];
        for (int var2 = 0; var2 < 12; ++var2) {
            this.field511[var2] = new class5(this.field604, "runes", var2);
        }
        this.field211 = new class22(128, 265);
        this.field212 = new class22(128, 265);
        for (int var3 = 0; var3 < 33920; ++var3) {
            this.field211.field789[var3] = this.field220.field686[var3];
        }
        for (int var4 = 0; var4 < 33920; ++var4) {
            this.field212.field789[var4] = this.field221.field686[var4];
        }
        this.field566 = new int[256];
        for (int var5 = 0; var5 < 64; ++var5) {
            this.field566[var5] = var5 * 262144;
        }
        for (int var6 = 0; var6 < 64; ++var6) {
            this.field566[var6 + 64] = var6 * 1024 + 16711680;
        }
        for (int var7 = 0; var7 < 64; ++var7) {
            this.field566[var7 + 128] = var7 * 4 + 16776960;
        }
        for (int var8 = 0; var8 < 64; ++var8) {
            this.field566[var8 + 192] = 16777215;
        }
        this.field567 = new int[256];
        for (int var9 = 0; var9 < 64; ++var9) {
            this.field567[var9] = var9 * 1024;
        }
        for (int var10 = 0; var10 < 64; ++var10) {
            this.field567[var10 + 64] = var10 * 4 + 65280;
        }
        for (int var11 = 0; var11 < 64; ++var11) {
            this.field567[var11 + 128] = var11 * 262144 + 65535;
        }
        for (int var12 = 0; var12 < 64; ++var12) {
            this.field567[var12 + 192] = 16777215;
        }
        this.field568 = new int[256];
        for (int var13 = 0; var13 < 64; ++var13) {
            this.field568[var13] = var13 * 4;
        }
        for (int var14 = 0; var14 < 64; ++var14) {
            this.field568[var14 + 64] = var14 * 262144 + 255;
        }
        for (int var15 = 0; var15 < 64; ++var15) {
            this.field568[var15 + 128] = var15 * 1024 + 16711935;
        }
        for (int var16 = 0; var16 < 64; ++var16) {
            this.field568[var16 + 192] = 16777215;
        }
        this.field565 = new int[256];
        this.field556 = new int[32768];
        this.field557 = new int[32768];
        this.method154(-131, (class5) null);
        this.field277 = new int[32768];
        this.field278 = new int[32768];
        this.method72(-618, 10, "Connecting to fileserver");
        if (!this.field384) {
            this.field190 = true;
            this.field384 = true;
            this.method169(this, 2);
        }
    }

    static {
        int var0 = 0;
        for (int var1 = 0; var1 < 99; ++var1) {
            int var4 = var1 + 1;
            int var5 = (int) ((double) var4 + 300.0D * Math.pow(2.0D, (double) var4 / 7.0D));
            var0 += var5;
            field420[var1] = var0 / 4;
        }
        field421 = new int[32];
        int var2 = 2;
        for (int var3 = 0; var3 < 32; ++var3) {
            field421[var3] = var2 - 1;
            var2 += var2;
        }
        field424 = 7;
        field425 = 625;
        field427 = new BigInteger("7162900525229798032761816791230527296329313291232324290237849263501208207972894053929065636522363163621000728841182238772712427862772219676577293600221789");
        field481 = new BigInteger("58778699976184461502525193738213253649000149147835990136706041084440742975821");
        field489 = new int[] { 9104, 10275, 7595, 3610, 7975, 8526, 918, 38802, 24466, 10145, 58654, 5027, 1457, 16565, 34991, 25486 };
        field490 = "ABCDEFGHIJKLMNOPQRSTUVWXYZabcdefghijklmnopqrstuvwxyz0123456789!\"£$%^&*()-_=+[{]};:'@#~,<.>/?\\| ";
        field514 = new int[][] { { 6798, 107, 10283, 16, 4797, 7744, 5799, 4634, 33697, 22433, 2983, 54193 }, { 8741, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003, 25239 }, { 25238, 8742, 12, 64030, 43162, 7735, 8404, 1701, 38430, 24094, 10153, 56621, 4783, 1341, 16578, 35003 }, { 4626, 11146, 6439, 12, 4758, 10270 }, { 4550, 4537, 5681, 5673, 5790, 6806, 8076, 4574 } };
        field535 = true;
        field571 = 9;
    }
}
