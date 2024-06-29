import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import jaclib.memory.heap.NativeHeap;
import jaggl.OpenGL;
import java.awt.Canvas;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.lang.reflect.Method;
import java.util.Enumeration;
import java.util.Hashtable;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class35 extends class65 {
   @OriginalMember(
      owner = "client!rk",
      name = "U",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field553;
   @OriginalMember(
      owner = "client!rk",
      name = "he",
      descriptor = "I"
   )
   public int field720;
   @OriginalMember(
      owner = "client!rk",
      name = "de",
      descriptor = "Lql;"
   )
   private class766 field718;
   @OriginalMember(
      owner = "client!rk",
      name = "dg",
      descriptor = "Lpga;"
   )
   private class558 field722;
   @OriginalMember(
      owner = "client!rk",
      name = "Rb",
      descriptor = "Lpga;"
   )
   public class558 field723;
   @OriginalMember(
      owner = "client!rk",
      name = "Nd",
      descriptor = "I"
   )
   public int field727;
   @OriginalMember(
      owner = "client!rk",
      name = "Qd",
      descriptor = "I"
   )
   public int field726;
   @OriginalMember(
      owner = "client!rk",
      name = "y",
      descriptor = "Z"
   )
   private boolean field730;
   @OriginalMember(
      owner = "client!rk",
      name = "lb",
      descriptor = "Liw;"
   )
   private class332 field725;
   @OriginalMember(
      owner = "client!rk",
      name = "qh",
      descriptor = "I"
   )
   private int field731;
   @OriginalMember(
      owner = "client!rk",
      name = "yc",
      descriptor = "[Lgfa;"
   )
   private class781[] field737;
   @OriginalMember(
      owner = "client!rk",
      name = "ae",
      descriptor = "I"
   )
   private int field738;
   @OriginalMember(
      owner = "client!rk",
      name = "ud",
      descriptor = "[Lgfa;"
   )
   private class781[] field739;
   @OriginalMember(
      owner = "client!rk",
      name = "Ig",
      descriptor = "[Lgfa;"
   )
   private class781[] field740;
   @OriginalMember(
      owner = "client!rk",
      name = "yb",
      descriptor = "I"
   )
   private int field733;
   @OriginalMember(
      owner = "client!rk",
      name = "Ye",
      descriptor = "Liw;"
   )
   private class332 field743;
   @OriginalMember(
      owner = "client!rk",
      name = "Kg",
      descriptor = "Liw;"
   )
   private class332 field745;
   @OriginalMember(
      owner = "client!rk",
      name = "Le",
      descriptor = "Liw;"
   )
   private class332 field746;
   @OriginalMember(
      owner = "client!rk",
      name = "mg",
      descriptor = "Liw;"
   )
   private class332 field747;
   @OriginalMember(
      owner = "client!rk",
      name = "ff",
      descriptor = "Liw;"
   )
   private class332 field748;
   @OriginalMember(
      owner = "client!rk",
      name = "Y",
      descriptor = "Liw;"
   )
   private class332 field749;
   @OriginalMember(
      owner = "client!rk",
      name = "yf",
      descriptor = "Liw;"
   )
   private class332 field750;
   @OriginalMember(
      owner = "client!rk",
      name = "Bd",
      descriptor = "Lpga;"
   )
   public class558 field757;
   @OriginalMember(
      owner = "client!rk",
      name = "Cd",
      descriptor = "Lpga;"
   )
   public class558 field760;
   @OriginalMember(
      owner = "client!rk",
      name = "Ld",
      descriptor = "Lpga;"
   )
   public class558 field761;
   @OriginalMember(
      owner = "client!rk",
      name = "bh",
      descriptor = "I"
   )
   public int field764;
   @OriginalMember(
      owner = "client!rk",
      name = "tb",
      descriptor = "F"
   )
   private float field768;
   @OriginalMember(
      owner = "client!rk",
      name = "df",
      descriptor = "I"
   )
   private int field798;
   @OriginalMember(
      owner = "client!rk",
      name = "jg",
      descriptor = "I"
   )
   public int field803;
   @OriginalMember(
      owner = "client!rk",
      name = "xb",
      descriptor = "F"
   )
   public float field773;
   @OriginalMember(
      owner = "client!rk",
      name = "Md",
      descriptor = "I"
   )
   public int field800;
   @OriginalMember(
      owner = "client!rk",
      name = "Pf",
      descriptor = "I"
   )
   private int field810;
   @OriginalMember(
      owner = "client!rk",
      name = "pb",
      descriptor = "I"
   )
   public int field797;
   @OriginalMember(
      owner = "client!rk",
      name = "Ze",
      descriptor = "I"
   )
   private int field815;
   @OriginalMember(
      owner = "client!rk",
      name = "pg",
      descriptor = "I"
   )
   public int field814;
   @OriginalMember(
      owner = "client!rk",
      name = "cb",
      descriptor = "F"
   )
   public float field826;
   @OriginalMember(
      owner = "client!rk",
      name = "Q",
      descriptor = "I"
   )
   private int field816;
   @OriginalMember(
      owner = "client!rk",
      name = "Kb",
      descriptor = "I"
   )
   public int field794;
   @OriginalMember(
      owner = "client!rk",
      name = "Mb",
      descriptor = "I"
   )
   private int field820;
   @OriginalMember(
      owner = "client!rk",
      name = "Df",
      descriptor = "F"
   )
   public float field823;
   @OriginalMember(
      owner = "client!rk",
      name = "Wg",
      descriptor = "I"
   )
   public int field834;
   @OriginalMember(
      owner = "client!rk",
      name = "mb",
      descriptor = "[F"
   )
   private float[] field782;
   @OriginalMember(
      owner = "client!rk",
      name = "Ae",
      descriptor = "Z"
   )
   private boolean field832;
   @OriginalMember(
      owner = "client!rk",
      name = "Eb",
      descriptor = "F"
   )
   private float field781;
   @OriginalMember(
      owner = "client!rk",
      name = "zb",
      descriptor = "I"
   )
   public int field842;
   @OriginalMember(
      owner = "client!rk",
      name = "td",
      descriptor = "I"
   )
   private int field828;
   @OriginalMember(
      owner = "client!rk",
      name = "Xe",
      descriptor = "I"
   )
   public int field839;
   @OriginalMember(
      owner = "client!rk",
      name = "rf",
      descriptor = "I"
   )
   public int field829;
   @OriginalMember(
      owner = "client!rk",
      name = "bd",
      descriptor = "[F"
   )
   public float[] field830;
   @OriginalMember(
      owner = "client!rk",
      name = "vf",
      descriptor = "F"
   )
   private float field778;
   @OriginalMember(
      owner = "client!rk",
      name = "qe",
      descriptor = "I"
   )
   private int field827;
   @OriginalMember(
      owner = "client!rk",
      name = "ac",
      descriptor = "[F"
   )
   private float[] field844;
   @OriginalMember(
      owner = "client!rk",
      name = "dh",
      descriptor = "[F"
   )
   private float[] field790;
   @OriginalMember(
      owner = "client!rk",
      name = "pc",
      descriptor = "Z"
   )
   private boolean field850;
   @OriginalMember(
      owner = "client!rk",
      name = "wh",
      descriptor = "I"
   )
   private int field821;
   @OriginalMember(
      owner = "client!rk",
      name = "Qc",
      descriptor = "F"
   )
   public float field858;
   @OriginalMember(
      owner = "client!rk",
      name = "xf",
      descriptor = "F"
   )
   public float field854;
   @OriginalMember(
      owner = "client!rk",
      name = "Ub",
      descriptor = "F"
   )
   public float field780;
   @OriginalMember(
      owner = "client!rk",
      name = "te",
      descriptor = "[F"
   )
   private float[] field849;
   @OriginalMember(
      owner = "client!rk",
      name = "Ib",
      descriptor = "[Lke;"
   )
   private class622[] field762;
   @OriginalMember(
      owner = "client!rk",
      name = "rh",
      descriptor = "I"
   )
   private int field865;
   @OriginalMember(
      owner = "client!rk",
      name = "lc",
      descriptor = "I"
   )
   public int field861;
   @OriginalMember(
      owner = "client!rk",
      name = "oe",
      descriptor = "F"
   )
   public float field856;
   @OriginalMember(
      owner = "client!rk",
      name = "V",
      descriptor = "F"
   )
   private float field864;
   @OriginalMember(
      owner = "client!rk",
      name = "kb",
      descriptor = "I"
   )
   private int field863;
   @OriginalMember(
      owner = "client!rk",
      name = "Vc",
      descriptor = "F"
   )
   private float field859;
   @OriginalMember(
      owner = "client!rk",
      name = "hh",
      descriptor = "Lhha;"
   )
   public class543 field845;
   @OriginalMember(
      owner = "client!rk",
      name = "be",
      descriptor = "[B"
   )
   public byte[] field873;
   @OriginalMember(
      owner = "client!rk",
      name = "Zb",
      descriptor = "[I"
   )
   public int[] field875;
   @OriginalMember(
      owner = "client!rk",
      name = "rd",
      descriptor = "[I"
   )
   public int[] field878;
   @OriginalMember(
      owner = "client!rk",
      name = "zf",
      descriptor = "[I"
   )
   public int[] field876;
   @OriginalMember(
      owner = "client!rk",
      name = "Xg",
      descriptor = "I"
   )
   public int field712;
   @OriginalMember(
      owner = "client!rk",
      name = "Jg",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field678;
   @OriginalMember(
      owner = "client!rk",
      name = "sf",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field685;
   @OriginalMember(
      owner = "client!rk",
      name = "B",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field595;
   @OriginalMember(
      owner = "client!rk",
      name = "Ke",
      descriptor = "J"
   )
   private long field516;
   @OriginalMember(
      owner = "client!rk",
      name = "id",
      descriptor = "J"
   )
   private long field554;
   @OriginalMember(
      owner = "client!rk",
      name = "Ge",
      descriptor = "Z"
   )
   public boolean field807;
   @OriginalMember(
      owner = "client!rk",
      name = "gd",
      descriptor = "I"
   )
   public int field853;
   @OriginalMember(
      owner = "client!rk",
      name = "yg",
      descriptor = "Ljava/lang/String;"
   )
   private String field792;
   @OriginalMember(
      owner = "client!rk",
      name = "hd",
      descriptor = "Z"
   )
   public boolean field811;
   @OriginalMember(
      owner = "client!rk",
      name = "ng",
      descriptor = "Z"
   )
   private boolean field824;
   @OriginalMember(
      owner = "client!rk",
      name = "Hg",
      descriptor = "Z"
   )
   public boolean field867;
   @OriginalMember(
      owner = "client!rk",
      name = "Mf",
      descriptor = "Z"
   )
   public boolean field802;
   @OriginalMember(
      owner = "client!rk",
      name = "Uc",
      descriptor = "Z"
   )
   private boolean field805;
   @OriginalMember(
      owner = "client!rk",
      name = "me",
      descriptor = "Z"
   )
   public boolean field785;
   @OriginalMember(
      owner = "client!rk",
      name = "ic",
      descriptor = "Ljava/lang/String;"
   )
   private String field833;
   @OriginalMember(
      owner = "client!rk",
      name = "dc",
      descriptor = "Z"
   )
   public boolean field771;
   @OriginalMember(
      owner = "client!rk",
      name = "Sb",
      descriptor = "Z"
   )
   private boolean field838;
   @OriginalMember(
      owner = "client!rk",
      name = "xc",
      descriptor = "Lrm;"
   )
   private class428 field719;
   @OriginalMember(
      owner = "client!rk",
      name = "Wc",
      descriptor = "Lun;"
   )
   public class442 field729;
   @OriginalMember(
      owner = "client!rk",
      name = "uf",
      descriptor = "Lhs;"
   )
   private class343 field711;
   @OriginalMember(
      owner = "client!rk",
      name = "Xf",
      descriptor = "Lhl;"
   )
   private class552 field708;
   @OriginalMember(
      owner = "client!rk",
      name = "jh",
      descriptor = "Lbp;"
   )
   private class403 field705;
   @OriginalMember(
      owner = "client!rk",
      name = "yh",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field879 = new String[]{method446(method445("T$H3l\u000e")), method446(method445("T$H:l\u000e")), method446(method445("T$H3j\u000e")), method446(method445("T$H3k\u000e")), method446(method445("T$H=h\u000e")), method446(method445("T$H9o\u000e")), method446(method445("]aHZT")), method446(method445("H:\n\u0018")), method446(method445("T$H?n\u000e")), method446(method445("T$H2h\u000e")), method446(method445("T$H>j\u000e")), method446(method445("T$H\u0015H\u000e")), method446(method445("T$H0j\u000e")), method446(method445("T$H j\u000e")), method446(method445("T$H<j\u000e")), method446(method445("T$H:j\u000e")), method446(method445("T$H3\u0001")), method446(method445("T$H&m\u000e")), method446(method445("T$H6h\u000e")), method446(method445("T$H3o\u000e")), method446(method445("T$H9\u0001")), method446(method445("a\u000395{d\u0010\u000e\u0015E@\u0010\u0000\u0018FG;9\u0004@^*\n")), method446(method445("O!\u0012\u0011E")), method446(method445("L.\u0005\u0018@D")), method446(method445("U|F\u0013[G?\u000e\u001dJU")), method446(method445("N+")), method446(method445("L.\u0001\u0013E")), method446(method445("T$HH@H&\u0012J\u0001")), method446(method445("T.\u0002\u0011FH")), method446(method445("T$H3h\u000e")), method446(method445("T$H6o\u000e")), method446(method445("T$H%o\u000e")), method446(method445("T$H3m\u000e")), method446(method445("T$H2l\u000e")), method446(method445("T$H?l\u000e")), method446(method445("T$H9h\u000e")), method446(method445("T$H;\u0001")), method446(method445("T$H<o\u000e")), method446(method445("T$H<n\u000e")), method446(method445("T$H;o\u000e")), method446(method445("T$H:\u0001")), method446(method445("T$H$o\u000e")), method446(method445("T$H=o\u000e")), method446(method445("T$H k\u000e")), method446(method445("T$H!o\u000e")), method446(method445("T$H9l\u000e")), method446(method445("H9\u000f\u0010@G")), method446(method445("i?\u0003\u001anj")), method446(method445("T$H'\u0001")), method446(method445("G;\u000f")), method446(method445("T$H!k\u000e")), method446(method445("T$H0m\u000e")), method446(method445("T$H=n\u000e")), method446(method445("T$H0n\u000e")), method446(method445("T$H8k\u000e")), method446(method445("T$H,\u0001")), method446(method445("T$H\"h\u000e")), method446(method445("T$H%k\u000e")), method446(method445("T$H5h\u000e")), method446(method445("T$H0h\u000e")), method446(method445("a\u000395{d\u0010\u0010\u0011[R*\u001e+ZN.\u0002\u0011[")), method446(method445("a\u000395{d\u0010\u000b\u0001ER&\u0015\u0015DV#\u0003")), method446(method445("a\u000395{d\u0010\u0010\u0011[R*\u001e+YT \u0001\u0006HK")), method446(method445("a\u000395{d\u0010\u000b\u0001ER&\u0012\u0011QR:\u0014\u0011")), method446(method445("a\u000395{d\u0010\u0012\u0011QR:\u0014\u0011v@#\t\u0015]")), method446(method445("a\u000395{d\u0010\u0000\u0006HA\"\u0003\u001a]y<\u000e\u0015MC=")), method446(method445("a\u000395{d\u0010\u0012\u0011QR:\u0014\u0011vT*\u0005\u0000HH(\n\u0011")), method446(method445("a\u000391qr\u0010\u0012\u0011QR:\u0014\u0011\u001ab")), method446(method445("a\u000391qr\u0010\u0000\u0006HK*\u0004\u0001O@*\u0014+FD%\u0003\u0017]")), method446(method445("K&\u0005\u0006FU \u0000\u0000")), method446(method445("K.\u0005")), method446(method445("a\u000395{d\u0010\u0010\u0011[R*\u001e+KS)\u0000\u0011[y \u0004\u001eLE;")), method446(method445("a\u000391qr\u0010\u0000\u0006HK*\u0004\u0001O@*\u0014+KJ&\u0012")), method446(method445("a\u000391qr\u0010\u0000\u0006HK*\u0004\u0001O@*\u0014+DS#\u0012\u001dZG\"\u0016\u0018L")), method446(method445("T$H;h\u000e")), method446(method445("D=\u000f\u0015G\u0006?\u0007\u0001E")), method446(method445("a\u000395{d\u0010\u0000\u0006HA\"\u0003\u001a]y?\u0014\u001bNT.\u000b")), method446(method445("a\u000395{d\u0010\u0012\u0011QR:\u0014\u0011vE:\u0004\u0011vK.\u0016")), method446(method445("K*\u0015\u0015")), method446(method445("a\u000395{d\u0010\u0012\u0011QR:\u0014\u0011vC!\u0010+JI\"\u0004\u001dGC")), method446(method445("T$H<h\u000e")), method446(method445("T$H&j\u000e")), method446(method445("T$H%m\u000e")), method446(method445("T$H'm\u000e")), method446(method445("T$H=k\u000e")), method446(method445("T$H;j\u000e")), method446(method445("T$H:m\u000e")), method446(method445("T$H0k\u000e")), method446(method445("T$H&k\u000e")), method446(method445("T$H\u0016\u0001")), method446(method445("T$H1o\u000e")), method446(method445("T$H!j\u000e")), method446(method445("T$H?o\u000e")), method446(method445("T$H5o\u000e")), method446(method445("T$H$j\u000e")), method446(method445("T$H%h\u000e")), method446(method445("T$H'l\u000e")), method446(method445("T$H2\u0001")), method446(method445("T$H3n\u000e")), method446(method445("T$H#\u0001")), method446(method445("T$H6j\u000e")), method446(method445("T$H1m\u000e")), method446(method445("T$H:k\u000e")), method446(method445("T$H#h\u000e")), method446(method445("T$H;n\u000e")), method446(method445("T$H#k\u000e")), method446(method445("T$H<k\u000e")), method446(method445("T$H8l\u000e")), method446(method445("T$H7l\u000e")), method446(method445("T$H:n\u000e")), method446(method445("T$H;l\u000e")), method446(method445("T$H>h\u000e")), method446(method445("T$H!l\u000e")), method446(method445("T$H&o\u000e")), method446(method445("T$H\"k\u000e")), method446(method445("T$H5j\u000e")), method446(method445("T$H&l\u000e")), method446(method445("T$H\u001d\u0001")), method446(method445("T$H>k\u000e")), method446(method445("T$H\u0012\u0001")), method446(method445("T$H;m\u000e")), method446(method445("T$H6l\u000e")), method446(method445("T$H1h\u000e")), method446(method445("T$H;k\u000e")), method446(method445("T$H8j\u000e")), method446(method445("T$H#m\u000e")), method446(method445("T$H$\u0001")), method446(method445("T$H\"j\u000e")), method446(method445("T$H\u0018H\u000e")), method446(method445("T$H=j\u000e")), method446(method445("T$H8n\u000e")), method446(method445("T$H<\u0001")), method446(method445("T$H9j\u000e")), method446(method445("T$H%\u0001")), method446(method445("T$H?h\u000e")), method446(method445("T$H=m\u000e")), method446(method445("T$H&\u0001")), method446(method445("T$H\"o\u000e")), method446(method445("T$H.h\u000e")), method446(method445("T$H!\u0001")), method446(method445("T$H\u000eH\u000e")), method446(method445("T$H%l\u000e")), method446(method445("T$H6n\u000e")), method446(method445("T$H!m\u000e")), method446(method445("T$H%j\u000e")), method446(method445("T$H?\u0001")), method446(method445("T$H1\u0001")), method446(method445("T$H0l\u000e")), method446(method445("T$H'h\u000e")), method446(method445("T$H8m\u000e")), method446(method445("T$H#l\u000e")), method446(method445("T$H6m\u000e")), method446(method445("T$H \u0001")), method446(method445("T$H7o\u000e")), method446(method445("T$H?k\u000e")), method446(method445("T$H1n\u000e")), method446(method445("T$H>o\u000e")), method446(method445("T$H5k\u000e")), method446(method445("T$H7h\u000e")), method446(method445("T$H h\u000e")), method446(method445("T$H!h\u000e")), method446(method445("T$H o\u000e")), method446(method445("T$H1l\u000e")), method446(method445("T$H$m\u000e")), method446(method445("T$H6\u0001")), method446(method445("T$H\u001aH\u000e")), method446(method445("T$H5m\u000e")), method446(method445("T$H7n\u000e")), method446(method445("T$H9m\u000e")), method446(method445("T$H9n\u000e")), method446(method445("T$H,h\u000e")), method446(method445("T$H7\u0001")), method446(method445("T$H#j\u000e")), method446(method445("T$H l\u000e")), method446(method445("T$H\fH\u000e")), method446(method445("T$H'j\u000e")), method446(method445("T$H'o\u000e")), method446(method445("T$H7m\u000e")), method446(method445("T$H\u0004H\u000e")), method446(method445("T$H:o\u000e")), method446(method445("T$H=\u0001")), method446(method445("T$H&h\u000e")), method446(method445("T$H<l\u000e")), method446(method445("T$H:h\u000e")), method446(method445("T$H7k\u000e")), method446(method445("T$H\"\u0001")), method446(method445("T$H5n\u000e")), method446(method445("T$H$h\u000e")), method446(method445("T$H'k\u000e")), method446(method445("T$H>l\u000e")), method446(method445("T$H1j\u000e")), method446(method445("T$H$l\u000e")), method446(method445("T$H#o\u000e")), method446(method445("T$H\u0010H\u000e")), method446(method445("T$H5l\u000e")), method446(method445("T$H7j\u000e")), method446(method445("T$H2k\u000e")), method446(method445("T$H?j\u000e")), method446(method445("T$H$k\u000e")), method446(method445("T$H\rH\u000e")), method446(method445("T$H-\u0001")), method446(method445("T$H9k\u000e")), method446(method445("T$H8h\u000e")), method446(method445("T$H6k\u000e")), method446(method445("T$H8o\u000e")), method446(method445("T$H\"m\u000e")), method446(method445("T$H2n\u000e")), method446(method445("T$H2o\u000e")), method446(method445("T$H m\u000e")), method446(method445("T$H5\u0001")), method446(method445("T$H0\u0001")), method446(method445("L.\u0010\u0015\u0007G8\u0012ZjG!\u0010\u0015Z")), method446(method445("T$H>\u0001")), method446(method445("U*\u0012=NH \u0014\u0011{C?\u0007\u001dGR")), method446(method445("T$H0o\u000e")), method446(method445("T$H>m\u000e")), method446(method445("T$H1k\u000e")), method446(method445("T$H?m\u000e")), method446(method445("T$H2m\u000e")), method446(method445("T$H\"l\u000e")), method446(method445("T$H\u0006H\u000e")), method446(method445("T$H\u0006\u0001")), method446(method445("T$H2j\u000e")), method446(method445("T$H>n\u000e")), method446(method445("T$H8\u0001")), method446(method445("T$H=l\u000e")), method446(method445("T$H<m\u000e"))};
   @OriginalMember(
      owner = "client!rk",
      name = "cf",
      descriptor = "Lgh;"
   )
   public static class572 field656 = new class572(132, 10);
   @OriginalMember(
      owner = "client!rk",
      name = "xe",
      descriptor = "F"
   )
   private float field765;
   @OriginalMember(
      owner = "client!rk",
      name = "je",
      descriptor = "F"
   )
   public float field774;
   @OriginalMember(
      owner = "client!rk",
      name = "ih",
      descriptor = "F"
   )
   private float field779;
   @OriginalMember(
      owner = "client!rk",
      name = "nb",
      descriptor = "F"
   )
   public float field786;
   @OriginalMember(
      owner = "client!rk",
      name = "K",
      descriptor = "F"
   )
   private float field791;
   @OriginalMember(
      owner = "client!rk",
      name = "ge",
      descriptor = "F"
   )
   public float field806;
   @OriginalMember(
      owner = "client!rk",
      name = "yd",
      descriptor = "F"
   )
   public float field841;
   @OriginalMember(
      owner = "client!rk",
      name = "fh",
      descriptor = "F"
   )
   public float field862;
   @OriginalMember(
      owner = "client!rk",
      name = "Ee",
      descriptor = "F"
   )
   public float field866;
   @OriginalMember(
      owner = "client!rk",
      name = "Ue",
      descriptor = "I"
   )
   public static int field512;
   @OriginalMember(
      owner = "client!rk",
      name = "Ic",
      descriptor = "I"
   )
   public static int field513;
   @OriginalMember(
      owner = "client!rk",
      name = "qg",
      descriptor = "I"
   )
   public static int field514;
   @OriginalMember(
      owner = "client!rk",
      name = "N",
      descriptor = "I"
   )
   public static int field515;
   @OriginalMember(
      owner = "client!rk",
      name = "wf",
      descriptor = "I"
   )
   public static int field517;
   @OriginalMember(
      owner = "client!rk",
      name = "re",
      descriptor = "I"
   )
   public static int field518;
   @OriginalMember(
      owner = "client!rk",
      name = "Xb",
      descriptor = "I"
   )
   public static int field519;
   @OriginalMember(
      owner = "client!rk",
      name = "uh",
      descriptor = "I"
   )
   public static int field520;
   @OriginalMember(
      owner = "client!rk",
      name = "Rd",
      descriptor = "I"
   )
   public static int field521;
   @OriginalMember(
      owner = "client!rk",
      name = "ze",
      descriptor = "I"
   )
   public static int field522;
   @OriginalMember(
      owner = "client!rk",
      name = "bc",
      descriptor = "I"
   )
   public static int field523;
   @OriginalMember(
      owner = "client!rk",
      name = "Fe",
      descriptor = "I"
   )
   public static int field524;
   @OriginalMember(
      owner = "client!rk",
      name = "zg",
      descriptor = "I"
   )
   public static int field525;
   @OriginalMember(
      owner = "client!rk",
      name = "w",
      descriptor = "I"
   )
   public static int field526;
   @OriginalMember(
      owner = "client!rk",
      name = "ld",
      descriptor = "I"
   )
   public static int field527;
   @OriginalMember(
      owner = "client!rk",
      name = "gg",
      descriptor = "I"
   )
   public static int field528;
   @OriginalMember(
      owner = "client!rk",
      name = "qf",
      descriptor = "I"
   )
   public static int field529;
   @OriginalMember(
      owner = "client!rk",
      name = "M",
      descriptor = "I"
   )
   public static int field530;
   @OriginalMember(
      owner = "client!rk",
      name = "Vg",
      descriptor = "I"
   )
   public static int field531;
   @OriginalMember(
      owner = "client!rk",
      name = "Sg",
      descriptor = "I"
   )
   public static int field532;
   @OriginalMember(
      owner = "client!rk",
      name = "Jf",
      descriptor = "I"
   )
   public static int field533;
   @OriginalMember(
      owner = "client!rk",
      name = "xh",
      descriptor = "I"
   )
   public static int field534;
   @OriginalMember(
      owner = "client!rk",
      name = "lf",
      descriptor = "I"
   )
   private int field535;
   @OriginalMember(
      owner = "client!rk",
      name = "Zf",
      descriptor = "I"
   )
   public static int field536;
   @OriginalMember(
      owner = "client!rk",
      name = "Bf",
      descriptor = "I"
   )
   public static int field537;
   @OriginalMember(
      owner = "client!rk",
      name = "gf",
      descriptor = "I"
   )
   public static int field538;
   @OriginalMember(
      owner = "client!rk",
      name = "jc",
      descriptor = "I"
   )
   public static int field539;
   @OriginalMember(
      owner = "client!rk",
      name = "W",
      descriptor = "I"
   )
   public static int field540;
   @OriginalMember(
      owner = "client!rk",
      name = "mh",
      descriptor = "I"
   )
   public static int field541;
   @OriginalMember(
      owner = "client!rk",
      name = "nc",
      descriptor = "I"
   )
   public static int field542;
   @OriginalMember(
      owner = "client!rk",
      name = "Zg",
      descriptor = "I"
   )
   public static int field543;
   @OriginalMember(
      owner = "client!rk",
      name = "lg",
      descriptor = "I"
   )
   public static int field544;
   @OriginalMember(
      owner = "client!rk",
      name = "J",
      descriptor = "I"
   )
   public static int field545;
   @OriginalMember(
      owner = "client!rk",
      name = "Lg",
      descriptor = "I"
   )
   public int field546;
   @OriginalMember(
      owner = "client!rk",
      name = "Bc",
      descriptor = "I"
   )
   public static int field547;
   @OriginalMember(
      owner = "client!rk",
      name = "se",
      descriptor = "I"
   )
   public static int field548;
   @OriginalMember(
      owner = "client!rk",
      name = "zd",
      descriptor = "I"
   )
   public static int field549;
   @OriginalMember(
      owner = "client!rk",
      name = "Qb",
      descriptor = "I"
   )
   public static int field550;
   @OriginalMember(
      owner = "client!rk",
      name = "oh",
      descriptor = "I"
   )
   public static int field551;
   @OriginalMember(
      owner = "client!rk",
      name = "gh",
      descriptor = "I"
   )
   public static int field552;
   @OriginalMember(
      owner = "client!rk",
      name = "pd",
      descriptor = "I"
   )
   public static int field555;
   @OriginalMember(
      owner = "client!rk",
      name = "od",
      descriptor = "I"
   )
   public static int field556;
   @OriginalMember(
      owner = "client!rk",
      name = "Hc",
      descriptor = "I"
   )
   public static int field557;
   @OriginalMember(
      owner = "client!rk",
      name = "Oc",
      descriptor = "I"
   )
   public static int field558;
   @OriginalMember(
      owner = "client!rk",
      name = "v",
      descriptor = "I"
   )
   public static int field559;
   @OriginalMember(
      owner = "client!rk",
      name = "hf",
      descriptor = "I"
   )
   public static int field560;
   @OriginalMember(
      owner = "client!rk",
      name = "ub",
      descriptor = "I"
   )
   public static int field561;
   @OriginalMember(
      owner = "client!rk",
      name = "Ed",
      descriptor = "I"
   )
   public static int field562;
   @OriginalMember(
      owner = "client!rk",
      name = "Te",
      descriptor = "I"
   )
   public static int field563;
   @OriginalMember(
      owner = "client!rk",
      name = "ef",
      descriptor = "I"
   )
   public static int field564;
   @OriginalMember(
      owner = "client!rk",
      name = "sd",
      descriptor = "I"
   )
   public static int field565;
   @OriginalMember(
      owner = "client!rk",
      name = "Pc",
      descriptor = "I"
   )
   public static int field566;
   @OriginalMember(
      owner = "client!rk",
      name = "vc",
      descriptor = "I"
   )
   public static int field567;
   @OriginalMember(
      owner = "client!rk",
      name = "R",
      descriptor = "I"
   )
   public static int field568;
   @OriginalMember(
      owner = "client!rk",
      name = "We",
      descriptor = "I"
   )
   public static int field569;
   @OriginalMember(
      owner = "client!rk",
      name = "Fc",
      descriptor = "I"
   )
   public static int field570;
   @OriginalMember(
      owner = "client!rk",
      name = "Jd",
      descriptor = "I"
   )
   public static int field571;
   @OriginalMember(
      owner = "client!rk",
      name = "Jc",
      descriptor = "I"
   )
   public static int field572;
   @OriginalMember(
      owner = "client!rk",
      name = "T",
      descriptor = "I"
   )
   public static int field573;
   @OriginalMember(
      owner = "client!rk",
      name = "Me",
      descriptor = "I"
   )
   public static int field574;
   @OriginalMember(
      owner = "client!rk",
      name = "zc",
      descriptor = "I"
   )
   public static int field575;
   @OriginalMember(
      owner = "client!rk",
      name = "I",
      descriptor = "I"
   )
   public static int field576;
   @OriginalMember(
      owner = "client!rk",
      name = "wc",
      descriptor = "I"
   )
   public static int field577;
   @OriginalMember(
      owner = "client!rk",
      name = "gc",
      descriptor = "I"
   )
   public static int field578;
   @OriginalMember(
      owner = "client!rk",
      name = "De",
      descriptor = "I"
   )
   public static int field579;
   @OriginalMember(
      owner = "client!rk",
      name = "Lf",
      descriptor = "I"
   )
   public static int field580;
   @OriginalMember(
      owner = "client!rk",
      name = "Xd",
      descriptor = "I"
   )
   public static int field581;
   @OriginalMember(
      owner = "client!rk",
      name = "Mg",
      descriptor = "I"
   )
   public static int field582;
   @OriginalMember(
      owner = "client!rk",
      name = "X",
      descriptor = "I"
   )
   public static int field583;
   @OriginalMember(
      owner = "client!rk",
      name = "Qg",
      descriptor = "I"
   )
   public static int field584;
   @OriginalMember(
      owner = "client!rk",
      name = "Cg",
      descriptor = "I"
   )
   public static int field585;
   @OriginalMember(
      owner = "client!rk",
      name = "Yf",
      descriptor = "I"
   )
   public static int field586;
   @OriginalMember(
      owner = "client!rk",
      name = "cg",
      descriptor = "I"
   )
   public static int field587;
   @OriginalMember(
      owner = "client!rk",
      name = "He",
      descriptor = "I"
   )
   public static int field588;
   @OriginalMember(
      owner = "client!rk",
      name = "mf",
      descriptor = "I"
   )
   public static int field589;
   @OriginalMember(
      owner = "client!rk",
      name = "ob",
      descriptor = "I"
   )
   public static int field590;
   @OriginalMember(
      owner = "client!rk",
      name = "pf",
      descriptor = "I"
   )
   public static int field591;
   @OriginalMember(
      owner = "client!rk",
      name = "Oe",
      descriptor = "I"
   )
   public static int field592;
   @OriginalMember(
      owner = "client!rk",
      name = "Ie",
      descriptor = "I"
   )
   public static int field593;
   @OriginalMember(
      owner = "client!rk",
      name = "fg",
      descriptor = "I"
   )
   public static int field594;
   @OriginalMember(
      owner = "client!rk",
      name = "oc",
      descriptor = "I"
   )
   public static int field596;
   @OriginalMember(
      owner = "client!rk",
      name = "Jb",
      descriptor = "I"
   )
   public static int field597;
   @OriginalMember(
      owner = "client!rk",
      name = "Rg",
      descriptor = "I"
   )
   public static int field598;
   @OriginalMember(
      owner = "client!rk",
      name = "nf",
      descriptor = "I"
   )
   public static int field599;
   @OriginalMember(
      owner = "client!rk",
      name = "Fd",
      descriptor = "I"
   )
   public static int field600;
   @OriginalMember(
      owner = "client!rk",
      name = "Nb",
      descriptor = "I"
   )
   public static int field601;
   @OriginalMember(
      owner = "client!rk",
      name = "Nc",
      descriptor = "I"
   )
   public static int field602;
   @OriginalMember(
      owner = "client!rk",
      name = "cd",
      descriptor = "I"
   )
   public static int field603;
   @OriginalMember(
      owner = "client!rk",
      name = "Dc",
      descriptor = "I"
   )
   public static int field604;
   @OriginalMember(
      owner = "client!rk",
      name = "Cf",
      descriptor = "I"
   )
   public static int field605;
   @OriginalMember(
      owner = "client!rk",
      name = "dd",
      descriptor = "I"
   )
   public static int field606;
   @OriginalMember(
      owner = "client!rk",
      name = "Hf",
      descriptor = "I"
   )
   public static int field607;
   @OriginalMember(
      owner = "client!rk",
      name = "eg",
      descriptor = "I"
   )
   public static int field608;
   @OriginalMember(
      owner = "client!rk",
      name = "Se",
      descriptor = "I"
   )
   public static int field609;
   @OriginalMember(
      owner = "client!rk",
      name = "kg",
      descriptor = "I"
   )
   public static int field610;
   @OriginalMember(
      owner = "client!rk",
      name = "Zd",
      descriptor = "I"
   )
   public static int field611;
   @OriginalMember(
      owner = "client!rk",
      name = "ig",
      descriptor = "I"
   )
   public static int field612;
   @OriginalMember(
      owner = "client!rk",
      name = "Ff",
      descriptor = "I"
   )
   public static int field613;
   @OriginalMember(
      owner = "client!rk",
      name = "hc",
      descriptor = "I"
   )
   public static int field614;
   @OriginalMember(
      owner = "client!rk",
      name = "rg",
      descriptor = "I"
   )
   public static int field615;
   @OriginalMember(
      owner = "client!rk",
      name = "xd",
      descriptor = "I"
   )
   public static int field616;
   @OriginalMember(
      owner = "client!rk",
      name = "Fb",
      descriptor = "I"
   )
   public static int field617;
   @OriginalMember(
      owner = "client!rk",
      name = "le",
      descriptor = "I"
   )
   public static int field618;
   @OriginalMember(
      owner = "client!rk",
      name = "ye",
      descriptor = "I"
   )
   public static int field619;
   @OriginalMember(
      owner = "client!rk",
      name = "Lb",
      descriptor = "I"
   )
   public static int field620;
   @OriginalMember(
      owner = "client!rk",
      name = "Fg",
      descriptor = "I"
   )
   public static int field621;
   @OriginalMember(
      owner = "client!rk",
      name = "Qe",
      descriptor = "I"
   )
   public static int field622;
   @OriginalMember(
      owner = "client!rk",
      name = "F",
      descriptor = "I"
   )
   public static int field623;
   @OriginalMember(
      owner = "client!rk",
      name = "qc",
      descriptor = "I"
   )
   public static int field624;
   @OriginalMember(
      owner = "client!rk",
      name = "pe",
      descriptor = "I"
   )
   public static int field625;
   @OriginalMember(
      owner = "client!rk",
      name = "wd",
      descriptor = "I"
   )
   public static int field626;
   @OriginalMember(
      owner = "client!rk",
      name = "Ac",
      descriptor = "I"
   )
   public static int field627;
   @OriginalMember(
      owner = "client!rk",
      name = "md",
      descriptor = "I"
   )
   public static int field628;
   @OriginalMember(
      owner = "client!rk",
      name = "kd",
      descriptor = "I"
   )
   public static int field629;
   @OriginalMember(
      owner = "client!rk",
      name = "hg",
      descriptor = "I"
   )
   public static int field630;
   @OriginalMember(
      owner = "client!rk",
      name = "Sc",
      descriptor = "I"
   )
   public static int field631;
   @OriginalMember(
      owner = "client!rk",
      name = "Bg",
      descriptor = "I"
   )
   public static int field632;
   @OriginalMember(
      owner = "client!rk",
      name = "sh",
      descriptor = "I"
   )
   public static int field633;
   @OriginalMember(
      owner = "client!rk",
      name = "Wf",
      descriptor = "I"
   )
   public static int field634;
   @OriginalMember(
      owner = "client!rk",
      name = "A",
      descriptor = "I"
   )
   public static int field635;
   @OriginalMember(
      owner = "client!rk",
      name = "rc",
      descriptor = "I"
   )
   public static int field636;
   @OriginalMember(
      owner = "client!rk",
      name = "Sf",
      descriptor = "I"
   )
   public static int field637;
   @OriginalMember(
      owner = "client!rk",
      name = "Wd",
      descriptor = "I"
   )
   public static int field638;
   @OriginalMember(
      owner = "client!rk",
      name = "ue",
      descriptor = "I"
   )
   public static int field639;
   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "I"
   )
   public static int field640;
   @OriginalMember(
      owner = "client!rk",
      name = "Ve",
      descriptor = "I"
   )
   public static int field641;
   @OriginalMember(
      owner = "client!rk",
      name = "Kd",
      descriptor = "I"
   )
   public static int field642;
   @OriginalMember(
      owner = "client!rk",
      name = "ab",
      descriptor = "I"
   )
   public static int field643;
   @OriginalMember(
      owner = "client!rk",
      name = "tc",
      descriptor = "I"
   )
   public static int field644;
   @OriginalMember(
      owner = "client!rk",
      name = "Re",
      descriptor = "I"
   )
   public static int field645;
   @OriginalMember(
      owner = "client!rk",
      name = "qd",
      descriptor = "I"
   )
   public static int field646;
   @OriginalMember(
      owner = "client!rk",
      name = "eb",
      descriptor = "I"
   )
   public static int field647;
   @OriginalMember(
      owner = "client!rk",
      name = "Gb",
      descriptor = "I"
   )
   public static int field648;
   @OriginalMember(
      owner = "client!rk",
      name = "Cc",
      descriptor = "I"
   )
   public static int field649;
   @OriginalMember(
      owner = "client!rk",
      name = "Rc",
      descriptor = "I"
   )
   public static int field650;
   @OriginalMember(
      owner = "client!rk",
      name = "C",
      descriptor = "I"
   )
   public static int field651;
   @OriginalMember(
      owner = "client!rk",
      name = "Lc",
      descriptor = "I"
   )
   public static int field652;
   @OriginalMember(
      owner = "client!rk",
      name = "Yc",
      descriptor = "I"
   )
   public static int field653;
   @OriginalMember(
      owner = "client!rk",
      name = "Uf",
      descriptor = "I"
   )
   public static int field654;
   @OriginalMember(
      owner = "client!rk",
      name = "E",
      descriptor = "I"
   )
   public static int field655;
   @OriginalMember(
      owner = "client!rk",
      name = "vh",
      descriptor = "I"
   )
   public static int field657;
   @OriginalMember(
      owner = "client!rk",
      name = "Ec",
      descriptor = "I"
   )
   public static int field658;
   @OriginalMember(
      owner = "client!rk",
      name = "Og",
      descriptor = "I"
   )
   public static int field659;
   @OriginalMember(
      owner = "client!rk",
      name = "Ng",
      descriptor = "I"
   )
   public static int field660;
   @OriginalMember(
      owner = "client!rk",
      name = "Pg",
      descriptor = "I"
   )
   public static int field661;
   @OriginalMember(
      owner = "client!rk",
      name = "Yg",
      descriptor = "I"
   )
   public static int field662;
   @OriginalMember(
      owner = "client!rk",
      name = "db",
      descriptor = "I"
   )
   public static int field663;
   @OriginalMember(
      owner = "client!rk",
      name = "Dd",
      descriptor = "I"
   )
   public static int field664;
   @OriginalMember(
      owner = "client!rk",
      name = "ee",
      descriptor = "I"
   )
   public int field665;
   @OriginalMember(
      owner = "client!rk",
      name = "ib",
      descriptor = "I"
   )
   public static int field666;
   @OriginalMember(
      owner = "client!rk",
      name = "Gd",
      descriptor = "I"
   )
   public static int field667;
   @OriginalMember(
      owner = "client!rk",
      name = "mc",
      descriptor = "I"
   )
   public static int field668;
   @OriginalMember(
      owner = "client!rk",
      name = "Pe",
      descriptor = "I"
   )
   public static int field669;
   @OriginalMember(
      owner = "client!rk",
      name = "sb",
      descriptor = "I"
   )
   public static int field670;
   @OriginalMember(
      owner = "client!rk",
      name = "Wb",
      descriptor = "I"
   )
   public static int field671;
   @OriginalMember(
      owner = "client!rk",
      name = "tg",
      descriptor = "I"
   )
   public static int field672;
   @OriginalMember(
      owner = "client!rk",
      name = "x",
      descriptor = "I"
   )
   public static int field673;
   @OriginalMember(
      owner = "client!rk",
      name = "ce",
      descriptor = "I"
   )
   public static int field674;
   @OriginalMember(
      owner = "client!rk",
      name = "Je",
      descriptor = "I"
   )
   public static int field675;
   @OriginalMember(
      owner = "client!rk",
      name = "ag",
      descriptor = "I"
   )
   public static int field676;
   @OriginalMember(
      owner = "client!rk",
      name = "nd",
      descriptor = "I"
   )
   public static int field677;
   @OriginalMember(
      owner = "client!rk",
      name = "D",
      descriptor = "I"
   )
   public static int field679;
   @OriginalMember(
      owner = "client!rk",
      name = "cc",
      descriptor = "I"
   )
   public static int field680;
   @OriginalMember(
      owner = "client!rk",
      name = "gb",
      descriptor = "I"
   )
   public static int field681;
   @OriginalMember(
      owner = "client!rk",
      name = "Dg",
      descriptor = "I"
   )
   public static int field682;
   @OriginalMember(
      owner = "client!rk",
      name = "Z",
      descriptor = "I"
   )
   public static int field683;
   @OriginalMember(
      owner = "client!rk",
      name = "fc",
      descriptor = "I"
   )
   public static int field684;
   @OriginalMember(
      owner = "client!rk",
      name = "Of",
      descriptor = "I"
   )
   public static int field686;
   @OriginalMember(
      owner = "client!rk",
      name = "eh",
      descriptor = "I"
   )
   public static int field687;
   @OriginalMember(
      owner = "client!rk",
      name = "Pb",
      descriptor = "I"
   )
   public static int field688;
   @OriginalMember(
      owner = "client!rk",
      name = "ie",
      descriptor = "I"
   )
   public static int field689;
   @OriginalMember(
      owner = "client!rk",
      name = "bb",
      descriptor = "I"
   )
   public static int field690;
   @OriginalMember(
      owner = "client!rk",
      name = "Ef",
      descriptor = "I"
   )
   public static int field691;
   @OriginalMember(
      owner = "client!rk",
      name = "nh",
      descriptor = "I"
   )
   public static int field692;
   @OriginalMember(
      owner = "client!rk",
      name = "Sd",
      descriptor = "I"
   )
   public static int field693;
   @OriginalMember(
      owner = "client!rk",
      name = "G",
      descriptor = "I"
   )
   public static int field694;
   @OriginalMember(
      owner = "client!rk",
      name = "Tf",
      descriptor = "I"
   )
   public static int field695;
   @OriginalMember(
      owner = "client!rk",
      name = "kf",
      descriptor = "I"
   )
   public static int field696;
   @OriginalMember(
      owner = "client!rk",
      name = "Vf",
      descriptor = "I"
   )
   public static int field697;
   @OriginalMember(
      owner = "client!rk",
      name = "Yd",
      descriptor = "I"
   )
   public static int field698;
   @OriginalMember(
      owner = "client!rk",
      name = "Xc",
      descriptor = "I"
   )
   public static int field699;
   @OriginalMember(
      owner = "client!rk",
      name = "Ug",
      descriptor = "I"
   )
   public static int field700;
   @OriginalMember(
      owner = "client!rk",
      name = "H",
      descriptor = "I"
   )
   public static int field701;
   @OriginalMember(
      owner = "client!rk",
      name = "Gc",
      descriptor = "I"
   )
   public static int field702;
   @OriginalMember(
      owner = "client!rk",
      name = "uc",
      descriptor = "I"
   )
   private int field703;
   @OriginalMember(
      owner = "client!rk",
      name = "P",
      descriptor = "I"
   )
   public static int field704;
   @OriginalMember(
      owner = "client!rk",
      name = "Eg",
      descriptor = "I"
   )
   public static int field706;
   @OriginalMember(
      owner = "client!rk",
      name = "Mc",
      descriptor = "I"
   )
   public static int field707;
   @OriginalMember(
      owner = "client!rk",
      name = "ad",
      descriptor = "I"
   )
   public static int field709;
   @OriginalMember(
      owner = "client!rk",
      name = "vb",
      descriptor = "I"
   )
   public static int field710;
   @OriginalMember(
      owner = "client!rk",
      name = "Qf",
      descriptor = "I"
   )
   public static int field713;
   @OriginalMember(
      owner = "client!rk",
      name = "bf",
      descriptor = "I"
   )
   public static int field714;
   @OriginalMember(
      owner = "client!rk",
      name = "Vb",
      descriptor = "I"
   )
   public static int field715;
   @OriginalMember(
      owner = "client!rk",
      name = "ug",
      descriptor = "I"
   )
   public static int field716;
   @OriginalMember(
      owner = "client!rk",
      name = "Ud",
      descriptor = "I"
   )
   public static int field717;
   @OriginalMember(
      owner = "client!rk",
      name = "xg",
      descriptor = "I"
   )
   public static int field721;
   @OriginalMember(
      owner = "client!rk",
      name = "Pd",
      descriptor = "I"
   )
   public int field728;
   @OriginalMember(
      owner = "client!rk",
      name = "kh",
      descriptor = "I"
   )
   private int field741;
   @OriginalMember(
      owner = "client!rk",
      name = "jf",
      descriptor = "I"
   )
   public int field742;
   @OriginalMember(
      owner = "client!rk",
      name = "af",
      descriptor = "I"
   )
   public int field744;
   @OriginalMember(
      owner = "client!rk",
      name = "Ag",
      descriptor = "I"
   )
   private int field753;
   @OriginalMember(
      owner = "client!rk",
      name = "ch",
      descriptor = "I"
   )
   private int field754;
   @OriginalMember(
      owner = "client!rk",
      name = "Gf",
      descriptor = "I"
   )
   private int field758;
   @OriginalMember(
      owner = "client!rk",
      name = "Tg",
      descriptor = "I"
   )
   private int field777;
   @OriginalMember(
      owner = "client!rk",
      name = "Ab",
      descriptor = "I"
   )
   private int field783;
   @OriginalMember(
      owner = "client!rk",
      name = "Nf",
      descriptor = "I"
   )
   private int field789;
   @OriginalMember(
      owner = "client!rk",
      name = "Tc",
      descriptor = "I"
   )
   public int field793;
   @OriginalMember(
      owner = "client!rk",
      name = "tf",
      descriptor = "I"
   )
   private int field795;
   @OriginalMember(
      owner = "client!rk",
      name = "Tb",
      descriptor = "I"
   )
   private int field801;
   @OriginalMember(
      owner = "client!rk",
      name = "th",
      descriptor = "I"
   )
   private int field804;
   @OriginalMember(
      owner = "client!rk",
      name = "sc",
      descriptor = "I"
   )
   public int field808;
   @OriginalMember(
      owner = "client!rk",
      name = "L",
      descriptor = "I"
   )
   private int field809;
   @OriginalMember(
      owner = "client!rk",
      name = "Ce",
      descriptor = "I"
   )
   public int field818;
   @OriginalMember(
      owner = "client!rk",
      name = "bg",
      descriptor = "I"
   )
   private int field855;
   @OriginalMember(
      owner = "client!rk",
      name = "Cb",
      descriptor = "I"
   )
   public int field860;
   @OriginalMember(
      owner = "client!rk",
      name = "Ob",
      descriptor = "I"
   )
   private int field874;
   @OriginalMember(
      owner = "client!rk",
      name = "wb",
      descriptor = "I"
   )
   private int field877;
   @OriginalMember(
      owner = "client!rk",
      name = "jd",
      descriptor = "J"
   )
   private long field755;
   @OriginalMember(
      owner = "client!rk",
      name = "Vd",
      descriptor = "Ljja;"
   )
   private class119 field848;
   @OriginalMember(
      owner = "client!rk",
      name = "Od",
      descriptor = "Lkv;"
   )
   public class281 field819;
   @OriginalMember(
      owner = "client!rk",
      name = "Id",
      descriptor = "Lpe;"
   )
   private class633 field868;
   @OriginalMember(
      owner = "client!rk",
      name = "vd",
      descriptor = "Lcia;"
   )
   private class637 field736;
   @OriginalMember(
      owner = "client!rk",
      name = "Zc",
      descriptor = "Ljia;"
   )
   public class642 field763;
   @OriginalMember(
      owner = "client!rk",
      name = "u",
      descriptor = "Ljia;"
   )
   public class642 field817;
   @OriginalMember(
      owner = "client!rk",
      name = "Ad",
      descriptor = "Lee;"
   )
   private class703 field767;
   @OriginalMember(
      owner = "client!rk",
      name = "O",
      descriptor = "Lcp;"
   )
   public class753 field766;
   @OriginalMember(
      owner = "client!rk",
      name = "wg",
      descriptor = "Lcp;"
   )
   public class753 field770;
   @OriginalMember(
      owner = "client!rk",
      name = "sg",
      descriptor = "Lcp;"
   )
   public class753 field776;
   @OriginalMember(
      owner = "client!rk",
      name = "og",
      descriptor = "Lcp;"
   )
   public class753 field788;
   @OriginalMember(
      owner = "client!rk",
      name = "of",
      descriptor = "Lcp;"
   )
   public class753 field796;
   @OriginalMember(
      owner = "client!rk",
      name = "Be",
      descriptor = "Lcp;"
   )
   public class753 field825;
   @OriginalMember(
      owner = "client!rk",
      name = "If",
      descriptor = "Lcp;"
   )
   public class753 field843;
   @OriginalMember(
      owner = "client!rk",
      name = "vg",
      descriptor = "Lcp;"
   )
   public class753 field846;
   @OriginalMember(
      owner = "client!rk",
      name = "ed",
      descriptor = "Lcp;"
   )
   public class753 field852;
   @OriginalMember(
      owner = "client!rk",
      name = "kc",
      descriptor = "Lcp;"
   )
   public class753 field870;
   @OriginalMember(
      owner = "client!rk",
      name = "Af",
      descriptor = "Lpv;"
   )
   private class77 field799;
   @OriginalMember(
      owner = "client!rk",
      name = "ne",
      descriptor = "Lpv;"
   )
   private class77 field812;
   @OriginalMember(
      owner = "client!rk",
      name = "fd",
      descriptor = "Lgfa;"
   )
   private class781 field734;
   @OriginalMember(
      owner = "client!rk",
      name = "rb",
      descriptor = "Lgfa;"
   )
   private class781 field735;
   @OriginalMember(
      owner = "client!rk",
      name = "ke",
      descriptor = "Lin;"
   )
   private class98 field732;
   @OriginalMember(
      owner = "client!rk",
      name = "Gg",
      descriptor = "Lin;"
   )
   public class98 field835;
   @OriginalMember(
      owner = "client!rk",
      name = "fe",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field724;
   @OriginalMember(
      owner = "client!rk",
      name = "Kc",
      descriptor = "Z"
   )
   private boolean field751;
   @OriginalMember(
      owner = "client!rk",
      name = "Db",
      descriptor = "Z"
   )
   private boolean field752;
   @OriginalMember(
      owner = "client!rk",
      name = "Rf",
      descriptor = "Z"
   )
   private boolean field756;
   @OriginalMember(
      owner = "client!rk",
      name = "Ne",
      descriptor = "Z"
   )
   private boolean field759;
   @OriginalMember(
      owner = "client!rk",
      name = "Hd",
      descriptor = "Z"
   )
   public boolean field769;
   @OriginalMember(
      owner = "client!rk",
      name = "S",
      descriptor = "Z"
   )
   private boolean field772;
   @OriginalMember(
      owner = "client!rk",
      name = "lh",
      descriptor = "Z"
   )
   public boolean field775;
   @OriginalMember(
      owner = "client!rk",
      name = "Td",
      descriptor = "Z"
   )
   private boolean field784;
   @OriginalMember(
      owner = "client!rk",
      name = "hb",
      descriptor = "Z"
   )
   private boolean field787;
   @OriginalMember(
      owner = "client!rk",
      name = "Yb",
      descriptor = "Z"
   )
   private boolean field813;
   @OriginalMember(
      owner = "client!rk",
      name = "Bb",
      descriptor = "Z"
   )
   public boolean field831;
   @OriginalMember(
      owner = "client!rk",
      name = "fb",
      descriptor = "Z"
   )
   public boolean field836;
   @OriginalMember(
      owner = "client!rk",
      name = "Kf",
      descriptor = "Z"
   )
   public boolean field837;
   @OriginalMember(
      owner = "client!rk",
      name = "ph",
      descriptor = "Z"
   )
   public boolean field840;
   @OriginalMember(
      owner = "client!rk",
      name = "Hb",
      descriptor = "Z"
   )
   public boolean field847;
   @OriginalMember(
      owner = "client!rk",
      name = "we",
      descriptor = "Z"
   )
   private boolean field851;
   @OriginalMember(
      owner = "client!rk",
      name = "ec",
      descriptor = "Z"
   )
   public boolean field857;
   @OriginalMember(
      owner = "client!rk",
      name = "qb",
      descriptor = "Z"
   )
   public boolean field869;
   @OriginalMember(
      owner = "client!rk",
      name = "ve",
      descriptor = "Z"
   )
   private boolean field871;
   @OriginalMember(
      owner = "client!rk",
      name = "jb",
      descriptor = "Z"
   )
   private boolean field872;
   @OriginalMember(
      owner = "client!rk",
      name = "ah",
      descriptor = "[Lufa;"
   )
   private class707[] field822;

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lufa;B)V",
      line = 3
   )
   public final void method252(class707 arg0, byte arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 >= -6) {
            this.field809 = -71;
         }

         ++field610;
         class707 var4 = this.field822[this.field801];
         if (arg0 != var4) {
            label51: {
               if (arg0 == null) {
                  OpenGL.glDisable(var4.field10277);
                  if (!var3) {
                     break label51;
                  }
               }

               label41: {
                  if (var4 == null) {
                     OpenGL.glEnable(arg0.field10277);
                     if (!var3) {
                        break label41;
                     }
                  }

                  if (~arg0.field10277 != ~var4.field10277) {
                     OpenGL.glDisable(var4.field10277);
                     OpenGL.glEnable(arg0.field10277);
                  }
               }

               OpenGL.glBindTexture(arg0.field10277, arg0.method5125(113));
            }

            this.field822[this.field801] = arg0;
         }

         this.field754 &= -2;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[173] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lsfa;)V",
      line = 40
   )
   public final void method253(class723 arg0) {
      try {
         ++field702;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[57] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "K",
      descriptor = "([I)V",
      line = 47
   )
   public final void method254(int[] arg0) {
      try {
         arg0[2] = this.field798;
         ++field513;
         arg0[3] = this.field815;
         arg0[1] = this.field820;
         arg0[0] = this.field828;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[145] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "h",
      descriptor = "()Ldfa;",
      line = 59
   )
   public final class173 method255() {
      try {
         ++field536;
         return this.field722;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[115] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lvm;)V",
      line = 72
   )
   public final void method256(class713 arg0) {
      try {
         this.field718.method5540(-1, this, arg0, (byte)-126);
         ++field556;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[129] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "(Z)V",
      line = 82
   )
   private final void method257(boolean param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIIF)Lke;",
      line = 106
   )
   public final class622 method258(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field570;
         return new class786(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[127] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "n",
      descriptor = "(II)V",
      line = 117
   )
   public final void method259(int arg0, int arg1) {
      try {
         if (this.field801 != arg1) {
            OpenGL.glActiveTexture(arg1 + 33984);
            this.field801 = arg1;
         }

         ++field567;
         if (arg0 != 32) {
            this.field825 = null;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[104] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "A",
      descriptor = "(ILaa;II)V",
      line = 134
   )
   public final void method260(int arg0, class510 arg1, int arg2, int arg3) {
      try {
         ++field683;
         class560 var5 = (class560)arg1;
         class633 var6 = var5.field8145;
         this.method430(2);
         this.method252(var5.field8145, (byte)-55);
         this.method288(-3, 1);
         this.method314(7681, -23, 8448);
         this.method262(0, 768, 8960, 34167);
         float var7 = var6.field9233 / (float)var6.field9232;
         float var8 = var6.field9234 / (float)var6.field9235;
         OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field828) * var7, (float)(-arg3 + this.field820) * var8);
         OpenGL.glVertex2i(this.field828, this.field820);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field828) * var7, (float)(this.field815 - arg3) * var8);
         OpenGL.glVertex2i(this.field828, this.field815);
         OpenGL.glTexCoord2f((float)(this.field798 - arg2) * var7, (float)(-arg3 + this.field815) * var8);
         OpenGL.glVertex2i(this.field798, this.field815);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field798) * var7, (float)(-arg3 + this.field820) * var8);
         OpenGL.glVertex2i(this.field798, this.field820);
         OpenGL.glEnd();
         this.method262(0, 768, 8960, 5890);
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field879[209] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(IIIID)V",
      line = 166
   )
   public final void method261(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field590;
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[89] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "(IIII)V",
      line = 174
   )
   public final void method262(int arg0, int arg1, int arg2, int arg3) {
      try {
         OpenGL.glTexEnvi(8960, arg0 + 34176, arg3);
         ++field717;
         OpenGL.glTexEnvi(arg2, arg0 + 34192, arg1);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[153] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "(II)Lrj;",
      line = 184
   )
   public final class619 method263(int arg0, int arg1) {
      try {
         ++field630;
         return null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[123] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "([I)V",
      line = 193
   )
   public final void method264(int[] arg0) {
      try {
         arg0[0] = this.field665;
         ++field615;
         arg0[1] = this.field546;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[144] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIZ)Ltd;",
      line = 202
   )
   public final class476 method265(int arg0, int arg1, boolean arg2) {
      try {
         ++field526;
         return new class637(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[188] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IZLjaclib/memory/Buffer;IB)Lpv;",
      line = 212
   )
   public final class77 method266(int arg0, boolean arg1, Buffer arg2, int arg3, byte arg4) {
      try {
         if (arg4 != 3) {
            this.method438();
         }

         ++field659;
         return (class77)(!this.field824 || arg1 && !this.field805 ? new class314(this, arg0, arg2) : new class201(this, arg0, arg2, arg3, arg1));
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[185] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field879[6] : field879[7]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "r",
      descriptor = "()Z",
      line = 230
   )
   public final boolean method267() {
      try {
         ++field671;
         if (this.field708 != null) {
            if (!this.field708.method3120((byte)-91)) {
               if (!this.field711.method2652(this.field708, -6701)) {
                  return false;
               }

               this.field719.method3235(112);
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[124] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "()V",
      line = 255
   )
   public final void method268() {
      try {
         ++field699;
         if (this.field708 != null && this.field708.method3120((byte)79)) {
            this.field711.method2653(this.field708, 0);
            this.field719.method3235(102);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[14] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "(II)I",
      line = 271
   )
   public final int method269(int arg0, int arg1) {
      try {
         ++field548;
         return arg1 & arg0 ^ arg1;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[85] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "za",
      descriptor = "(IIIII)V",
      line = 279
   )
   public final void method270(int param1, int param2, int param3, int param4, int param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rk",
      name = "B",
      descriptor = "(I)V",
      line = 352
   )
   private final void method271(int arg0) {
      try {
         ++field579;
         class104.field1741[1] = this.field826 * this.field780;
         class104.field1741[3] = 1.0F;
         class104.field1741[2] = this.field856 * this.field826;
         class104.field1741[0] = this.field858 * this.field826;
         OpenGL.glLightfv(16384, 4609, class104.field1741, 0);
         class104.field1741[0] = -this.field773 * this.field858;
         class104.field1741[2] = -this.field773 * this.field856;
         class104.field1741[3] = 1.0F;
         class104.field1741[1] = -this.field773 * this.field780;
         if (arg0 != -15677) {
            this.field854 = -0.07781238F;
         }

         OpenGL.glLightfv(16385, 4609, class104.field1741, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[156] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "p",
      descriptor = "()V",
      line = 372
   )
   public final void method272() {
      boolean var1 = client.field4564;

      try {
         ++field641;
         class22 var2 = this.field725.method2579(-801);
         if (var1) {
            ((class583)var2).method4326(1);
            var2 = this.field725.method2583(1);
         }

         while(true) {
            while(var2 != null) {
               ((class583)var2).method4326(1);
               var2 = this.field725.method2583(1);
            }

            if (!var1) {
               if (this.field711 != null) {
                  this.field711.method2648((byte)-110);
               }

               if (this.field595 != null) {
                  Object var10000;
                  label47: {
                     this.method320(-1);
                     Enumeration var3 = this.field553.keys();
                     if (var1) {
                        var10000 = var3.nextElement();
                     } else if (!var3.hasMoreElements()) {
                        this.field595.release();
                        var10000 = this;
                        if (!var1) {
                           break label47;
                        }
                     } else {
                        var10000 = var3.nextElement();
                     }

                     while(true) {
                        Canvas var4 = (Canvas)var10000;
                        Long var5 = (Long)this.field553.get(var4);
                        this.field595.releaseSurface(var4, var5);
                        if (!var3.hasMoreElements()) {
                           this.field595.release();
                           var10000 = this;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }
                     }
                  }

                  ((class35)var10000).field595 = null;
               }

               if (this.field730) {
                  class741.method5347(false, 63, true);
                  this.field730 = false;
                  return;
               }

               return;
            }

            var2 = this.field725.method2583(1);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[201] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "m",
      descriptor = "()Lvfa;",
      line = 415
   )
   public final class698 method273() {
      boolean var1 = client.field4564;

      try {
         ++field565;
         int var2 = -1;
         if (this.field833.indexOf(field879[46]) == -1) {
            if (~this.field833.indexOf(field879[22]) == 0) {
               if (~this.field833.indexOf(field879[49]) == 0) {
                  return new class698(var2, field879[47], this.field795, this.field792, 0L);
               }

               var2 = 4098;
               if (!var1) {
                  return new class698(var2, field879[47], this.field795, this.field792, 0L);
               }
            }

            var2 = 32902;
            if (!var1) {
               return new class698(var2, field879[47], this.field795, this.field792, 0L);
            }
         }

         var2 = 4318;
         return new class698(var2, field879[47], this.field795, this.field792, 0L);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[48] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "()Z",
      line = 437
   )
   public final boolean method274() {
      try {
         ++field617;
         return false;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[135] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(FBFF)V",
      line = 445
   )
   private final void method275(float arg0, byte arg1, float arg2, float arg3) {
      try {
         ++field637;
         OpenGL.glMatrixMode(5890);
         if (this.field772) {
            OpenGL.glLoadIdentity();
         }

         OpenGL.glTranslatef(arg0, arg3, arg2);
         OpenGL.glMatrixMode(5888);
         this.field772 = true;
         int var5 = -8 / ((-60 - arg1) / 51);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[161] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "h",
      descriptor = "(B)V",
      line = 461
   )
   private final void method276(byte arg0) {
      try {
         ++field549;
         if (this.field855 != 3) {
            this.field855 = 3;
            this.method434(true);
            this.method369(true);
            this.field754 &= -8;
         }

         if (arg0 >= -13) {
            this.method263(-109, -4);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[93] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "(B)V",
      line = 483
   )
   private final void method277(byte arg0) {
      try {
         if (~this.field855 != -3) {
            this.field855 = 2;
            this.method332(2912);
            this.method369(true);
            this.field754 &= -8;
         }

         int var2 = -127 / ((-1 - arg0) / 37);
         ++field550;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[42] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "Y",
      descriptor = "()[I",
      line = 501
   )
   public final int[] method278() {
      try {
         ++field574;
         return new int[]{this.field861, this.field800, this.field803, this.field834};
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[200] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "r",
      descriptor = "(I)V",
      line = 509
   )
   public final void method279(int arg0) {
      try {
         OpenGL.glLightfv(16384, 4611, this.field830, arg0);
         ++field608;
         OpenGL.glLightfv(16385, 4611, this.field844, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[215] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "HA",
      descriptor = "(IIII[I)V",
      line = 519
   )
   public final void method280(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field522;
         float var6 = (float)arg2 * this.field757.field8098 + (float)arg0 * this.field757.field8130 + (float)arg1 * this.field757.field8110 + this.field757.field8109;
         if (!(var6 < (float)this.field829) && !((float)this.field827 < var6)) {
            int var7 = (int)(((float)arg2 * this.field757.field8127 + (float)arg0 * this.field757.field8099 + (float)arg1 * this.field757.field8103 + this.field757.field8102) * (float)this.field803 / (float)arg3);
            int var8 = (int)(((float)arg2 * this.field757.field8118 + (float)arg0 * this.field757.field8123 + (float)arg1 * this.field757.field8095 + this.field757.field8093) * (float)this.field834 / (float)arg3);
            if ((float)var7 >= this.field786 && (float)var7 <= this.field806 && this.field841 <= (float)var8 && this.field866 >= (float)var8) {
               arg4[0] = (int)((float)var7 + -this.field786);
               arg4[1] = (int)((float)var8 - this.field841);
               arg4[2] = (int)var6;
            } else {
               arg4[0] = arg4[1] = arg4[2] = -1;
            }
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field879[80] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "s",
      descriptor = "(I)V",
      line = 550
   )
   private final void method281(int arg0) {
      try {
         label19: {
            ++field713;
            if (this.field828 <= this.field798 && ~this.field820 >= ~this.field815) {
               OpenGL.glScissor(this.field863 + this.field828, this.field865 + this.field546 + -this.field815, -this.field828 + this.field798, -this.field820 + this.field815);
               if (!client.field4564) {
                  break label19;
               }
            }

            OpenGL.glScissor(0, 0, 0, 0);
         }

         int var2 = -19 % ((arg0 - 12) / 41);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[149] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZI)V",
      line = 565
   )
   public final void method282(boolean arg0, int arg1) {
      try {
         ++field633;
         if (this.field784 != arg0) {
            this.field784 = arg0;
            this.method405(2899);
            this.field754 &= -8;
         }

         if (arg1 != -8) {
            this.field703 = 7;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[186] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "A",
      descriptor = "(I)V",
      line = 584
   )
   private final void method283(int arg0) {
      try {
         ++field562;
         if (arg0 != 30728) {
            this.method406((class713)null, 74);
         }

         label21: {
            float[] var2 = this.field790;
            float var3 = (float)(-this.field861 * this.field829) / (float)this.field803;
            float var4 = (float)((-this.field861 + this.field665) * this.field829) / (float)this.field803;
            float var5 = (float)(this.field829 * this.field800) / (float)this.field834;
            float var6 = (float)((-this.field546 + this.field800) * this.field829) / (float)this.field834;
            if (var3 != var4 && var5 != var6) {
               float var7 = (float)this.field829 * 2.0F;
               var2[11] = -1.0F;
               var2[13] = 0.0F;
               var2[5] = var7 / (-var6 + var5);
               var2[6] = 0.0F;
               var2[2] = 0.0F;
               var2[14] = this.field779 = -((float)this.field827 * var7) / (float)(-this.field829 + this.field827);
               var2[15] = 0.0F;
               var2[0] = var7 / (var4 - var3);
               var2[9] = (var5 + var6) / (var5 - var6);
               var2[10] = this.field765 = (float)(-(this.field829 + this.field827)) / (float)(-this.field829 + this.field827);
               var2[1] = 0.0F;
               var2[7] = 0.0F;
               var2[12] = 0.0F;
               var2[4] = 0.0F;
               var2[3] = 0.0F;
               var2[8] = (var3 + var4) / (-var3 + var4);
               if (!client.field4564) {
                  break label21;
               }
            }

            var2[1] = 0.0F;
            var2[5] = 1.0F;
            var2[12] = 0.0F;
            var2[4] = 0.0F;
            var2[7] = 0.0F;
            var2[14] = 0.0F;
            var2[8] = 0.0F;
            var2[3] = 0.0F;
            var2[11] = 0.0F;
            var2[0] = 1.0F;
            var2[10] = 1.0F;
            var2[15] = 1.0F;
            var2[9] = 0.0F;
            var2[6] = 0.0F;
            var2[13] = 0.0F;
            var2[2] = 0.0F;
         }

         this.method293(true);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[169] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "j",
      descriptor = "(II)V",
      line = 648
   )
   public final void method284(int arg0, int arg1) {
      try {
         class104.field1741[0] = (float)class66.method706(16711680, arg1) / 1.671168E7F;
         class104.field1741[2] = (float)class66.method706(255, arg1) / 255.0F;
         class104.field1741[1] = (float)class66.method706(arg1, 65280) / 65280.0F;
         if (arg0 == -31405) {
            class104.field1741[3] = (float)(arg1 >>> 24) / 255.0F;
            ++field686;
            OpenGL.glTexEnvfv(8960, 8705, class104.field1741, 0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[86] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZI[BII)Lpv;",
      line = 663
   )
   public final class77 method285(boolean arg0, int arg1, byte[] arg2, int arg3, int arg4) {
      try {
         ++field613;
         if (this.field824 && (!arg0 || this.field805)) {
            return new class201(this, arg3, arg2, arg1, arg0);
         } else {
            if (arg4 != -19795) {
               this.method280(-61, 92, -38, 2, (int[])null);
            }

            return new class314(this, arg3, arg2, arg1);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[206] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field879[6] : field879[7]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lza;)V",
      line = 679
   )
   public final void method286(class432 arg0) {
      try {
         this.field724 = ((class583)arg0).field8441;
         ++field578;
         if (this.field799 == null) {
            class543 var2;
            label26: {
               var2 = new class543(80);
               if (this.field807) {
                  var2.method4064(-788993200, -1.0F);
                  var2.method4064(-788993200, -1.0F);
                  var2.method4064(-788993200, 0.0F);
                  var2.method4064(-788993200, 0.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, -1.0F);
                  var2.method4064(-788993200, 0.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, 0.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, 0.0F);
                  var2.method4064(-788993200, -1.0F);
                  var2.method4064(-788993200, 1.0F);
                  var2.method4064(-788993200, 0.0F);
                  var2.method4064(-788993200, 0.0F);
                  var2.method4064(-788993200, 0.0F);
                  if (!client.field4564) {
                     break label26;
                  }
               }

               var2.method4061((byte)-40, -1.0F);
               var2.method4061((byte)-82, -1.0F);
               var2.method4061((byte)-107, 0.0F);
               var2.method4061((byte)-68, 0.0F);
               var2.method4061((byte)-128, 1.0F);
               var2.method4061((byte)-83, 1.0F);
               var2.method4061((byte)-46, -1.0F);
               var2.method4061((byte)-54, 0.0F);
               var2.method4061((byte)-56, 1.0F);
               var2.method4061((byte)-103, 1.0F);
               var2.method4061((byte)-67, 1.0F);
               var2.method4061((byte)-105, 1.0F);
               var2.method4061((byte)-72, 0.0F);
               var2.method4061((byte)-94, 1.0F);
               var2.method4061((byte)-120, 0.0F);
               var2.method4061((byte)-47, -1.0F);
               var2.method4061((byte)-90, 1.0F);
               var2.method4061((byte)-84, 0.0F);
               var2.method4061((byte)-85, 0.0F);
               var2.method4061((byte)-69, 0.0F);
            }

            this.field799 = this.method285(false, var2.field6907, var2.field6889, 20, -19795);
            this.field763 = new class642(this.field799, 5126, 3, 0);
            this.field817 = new class642(this.field799, 5126, 2, 12);
            this.field718.method5538(false, this);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[183] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "E",
      descriptor = "()I",
      line = 745
   )
   public final int method287() {
      try {
         ++field619;
         return this.field744 + this.field741 + this.field742;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[146] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "k",
      descriptor = "(II)V",
      line = 753
   )
   public final void method288(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 == -3) {
            if (this.field758 != arg1) {
               boolean var4;
               byte var5;
               boolean var6;
               label106: {
                  if (~arg1 != -2) {
                     if (~arg1 == -3) {
                        var4 = false;
                        var5 = 2;
                        var6 = true;
                        if (!var3) {
                           break label106;
                        }
                     }

                     if (~arg1 != -129) {
                        var5 = 0;
                        var4 = false;
                        var6 = true;
                        if (!var3) {
                           break label106;
                        }
                     }

                     var6 = true;
                     var5 = 3;
                     var4 = true;
                     if (!var3) {
                        break label106;
                     }
                  }

                  var4 = true;
                  var5 = 1;
                  var6 = true;
               }

               if (!this.field759 != !var6) {
                  OpenGL.glColorMask(var6, var6, var6, true);
                  this.field759 = var6;
               }

               if (!var4 != !this.field752) {
                  label89: {
                     if (!var4) {
                        OpenGL.glDisable(3008);
                        if (!var3) {
                           break label89;
                        }
                     }

                     OpenGL.glEnable(3008);
                  }

                  this.field752 = var4;
               }

               if (this.field753 != var5) {
                  label118: {
                     if (var5 == 1) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(770, 771);
                        if (!var3) {
                           break label118;
                        }
                     }

                     if (~var5 == -3) {
                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                        if (!var3) {
                           break label118;
                        }
                     }

                     if (var5 != 3) {
                        OpenGL.glDisable(3042);
                        if (!var3) {
                           break label118;
                        }
                     }

                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(774, 1);
                  }

                  this.field753 = var5;
               }

               this.field754 &= -29;
               this.field758 = arg1;
            }

            ++field632;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[112] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "g",
      descriptor = "(B)V",
      line = 853
   )
   public final void method289(byte arg0) {
      try {
         ++field644;
         if (arg0 == -63) {
            if (this.field754 != 4) {
               this.method331(-107);
               this.method360(false, (byte)-50);
               this.method282(false, -8);
               this.method443(false, (byte)14);
               this.method440((byte)82, false);
               this.method335(0, -2);
               this.method288(arg0 ^ 60, 1);
               this.field754 = 4;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[82] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "(I)V",
      line = 878
   )
   private final void method290(int arg0) {
      try {
         ++field673;
         this.field791 = (float)(-this.field839 + this.field827) - this.field864;
         this.field774 = -((float)this.field842 * this.field859) + this.field791;
         if ((float)this.field829 > this.field774) {
            this.field774 = (float)this.field829;
         }

         OpenGL.glFogf(2915, this.field774);
         OpenGL.glFogf(2916, this.field791);
         class104.field1741[0] = (float)class66.method706(16711680, this.field797) / 1.671168E7F;
         int var2 = 101 / ((arg0 - -76) / 48);
         class104.field1741[1] = (float)class66.method706(this.field797, 65280) / 65280.0F;
         class104.field1741[2] = (float)class66.method706(this.field797, 255) / 255.0F;
         OpenGL.glFogfv(2918, class104.field1741, 0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[189] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "i",
      descriptor = "()I",
      line = 898
   )
   public final int method291() {
      try {
         ++field593;
         return this.field829;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[117] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIB)V",
      line = 907
   )
   public final void method292(int arg0, int arg1, byte arg2) {
      try {
         this.field863 = arg0;
         ++field691;
         this.field865 = arg1;
         this.method415((byte)20);
         this.method281(arg2 + 79);
         if (arg2 != -21) {
            this.field744 = -9;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "j",
      descriptor = "(Z)V",
      line = 923
   )
   private final void method293(boolean arg0) {
      try {
         if (arg0) {
            ++field677;
            this.field790[14] = this.field779;
            this.field790[10] = this.field765;
            this.field823 = (this.field790[14] - (float)this.field827) / this.field790[10];
            this.field854 = (float)this.field827;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[182] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "(IIIIII)V",
      line = 941
   )
   public static final void method294(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         class680.field9980 = arg5;
         class746.field10771 = arg4;
         ++field530;
         class775.field11349 = arg1;
         class555.field8076 = arg3;
         class315.field4536 = arg2;
         if (class746.field10771 >= 100) {
            int var6 = class775.field11349 * 512 + 256;
            int var7 = class315.field4536 * 512 + 256;
            int var8 = class663.method4851(var7, var6, class731.field10504, arg0 ^ -122) + -class555.field8076;
            int var9 = var6 - class583.field8442;
            int var10 = -class494.field7193 + var8;
            int var11 = var7 - class677.field9932;
            int var12 = (int)Math.sqrt((double)(var9 * var9 + var11 * var11));
            class414.field6073 = 16383 & (int)(Math.atan2((double)var10, (double)var12) * 2607.5945876176133D);
            class373.field5548 = 16383 & (int)(Math.atan2((double)var9, (double)var11) * -2607.5945876176133D);
            if (class414.field6073 < 1024) {
               class414.field6073 = 1024;
            }

            class127.field2133 = 0;
            if (~class414.field6073 < -3073) {
               class414.field6073 = 3072;
            }
         }

         class234.field3408 = arg0;
         class501.field7296 = arg0;
         class590.field8514 = 2;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field879[44] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "aa",
      descriptor = "(IIIIII)V",
      line = 984
   )
   public final void method295(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field609;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7;
         this.method366(256);
         float var10 = (float)arg3 + var8;
         this.method288(-3, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field851) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(7);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field851) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field879[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "(II)V",
      line = 1017
   )
   public final void method296(int arg0, int arg1) {
      try {
         if (this.field829 != arg0 || ~this.field827 != ~arg1) {
            label32: {
               this.field829 = arg0;
               this.field827 = arg1;
               this.method283(30728);
               this.method290(-127);
               if (this.field855 != 3) {
                  if (~this.field855 != -3) {
                     break label32;
                  }

                  this.method332(2912);
                  if (!client.field4564) {
                     break label32;
                  }
               }

               this.method434(true);
            }
         }

         ++field601;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[119] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "xa",
      descriptor = "(F)V",
      line = 1043
   )
   public final void method297(float arg0) {
      try {
         if (this.field862 != arg0) {
            this.field862 = arg0;
            this.method372((byte)-70);
         }

         ++field651;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[174] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ILgfa;)V",
      line = 1059
   )
   public final void method298(int arg0, class781 arg1) {
      try {
         if (arg0 != 1024) {
            this.field855 = -32;
         }

         ++field527;
         if (~this.field733 <= -4) {
            throw new RuntimeException();
         } else {
            if (this.field733 >= 0) {
               this.field739[this.field733].method940(true);
            }

            this.field735 = this.field739[++this.field733] = arg1;
            this.field735.method945((byte)56);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[142] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "P",
      descriptor = "(IIIII)V",
      line = 1078
   )
   public final void method299(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method366(256);
         ++field627;
         this.method288(-3, arg4);
         float var6 = (float)arg0 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f(var6, (float)arg2 + var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[126] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(I)Lza;",
      line = 1098
   )
   public final class432 method300(int arg0) {
      try {
         ++field561;
         class583 var2 = new class583(arg0);
         this.field725.method2585(var2, 80);
         return var2;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[88] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lrj;Leg;)Lsfa;",
      line = 1113
   )
   public final class723 method301(class619 arg0, class117 arg1) {
      try {
         ++field639;
         return null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[100] + (arg0 != null ? field879[6] : field879[7]) + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(IIII)V",
      line = 1126
   )
   public final void method302(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field661;
         OpenGL.glDrawArrays(arg2, arg1, arg0);
         if (arg3 < 119) {
            this.field712 = 106;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[83] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZZ)V",
      line = 1139
   )
   public final void method303(boolean arg0, boolean arg1) {
      try {
         ++field625;
         if (!arg1) {
            if (this.field813 != arg0) {
               this.field813 = arg0;
               this.method405(2899);
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[109] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(II[I[I)Laa;",
      line = 1157
   )
   public final class510 method304(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field697;
         return class346.method2673(arg1, this, arg0, arg2, true, arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[102] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field879[6] : field879[7]) + ',' + (arg3 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "p",
      descriptor = "(I)V",
      line = 1165
   )
   public final void method305(int arg0) {
      try {
         if (arg0 != 1) {
            this.field762 = null;
         }

         ++field529;
         if (this.field754 != 16) {
            this.method276((byte)-75);
            this.method360(true, (byte)-81);
            this.method443(true, (byte)14);
            this.method440((byte)-39, true);
            this.method288(-3, 1);
            this.field754 = 16;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[158] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(III)V",
      line = 1187
   )
   public final synchronized void method306(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 255) {
            this.method259(-43, 97);
         }

         ++field583;
         class459 var4 = new class459(arg1);
         var4.field347 = (long)arg2;
         this.field746.method2585(var4, arg0 + -332);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[208] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Ltn;Z)Ltd;",
      line = 1203
   )
   public final class476 method307(class94 arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         int[] var4;
         label95: {
            ++field544;
            var4 = new int[arg0.field1523 * arg0.field1520];
            int var5 = 0;
            int var6 = 0;
            if (arg0.field1527 == null) {
               int var7 = 0;
               if (var3 || ~arg0.field1520 < ~var7) {
                  do {
                     int var8 = 0;
                     if (var3 || var8 < arg0.field1523) {
                        do {
                           int var9 = arg0.field1521[255 & arg0.field1519[var5++]];
                           var4[var6++] = var9 == 0 ? 0 : class93.method899(-16777216, var9);
                           ++var8;
                        } while(var8 < arg0.field1523);
                     }

                     ++var7;
                  } while(~arg0.field1520 < ~var7);
               }

               if (!var3) {
                  break label95;
               }
            }

            int var10 = 0;
            if (var3 || arg0.field1520 > var10) {
               do {
                  int var11 = 0;
                  if (var3) {
                     var4[var6++] = class93.method899(arg0.field1521[class66.method706(arg0.field1519[var5], 255)], arg0.field1527[var5] << 24);
                     ++var5;
                     ++var11;
                  }

                  while(true) {
                     while(var11 < arg0.field1523) {
                        var4[var6++] = class93.method899(arg0.field1521[class66.method706(arg0.field1519[var5], 255)], arg0.field1527[var5] << 24);
                        ++var5;
                        ++var11;
                     }

                     if (!var3) {
                        ++var10;
                        break;
                     }

                     ++var11;
                  }
               } while(arg0.field1520 > var10);
            }
         }

         class476 var12 = this.method696(arg0.field1520, arg0.field1523, 0, -126, arg0.field1523, var4);
         var12.method3006(arg0.field1522, arg0.field1525, arg0.field1526, arg0.field1524);
         return var12;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field879[197] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "k",
      descriptor = "()Z",
      line = 1264
   )
   public final boolean method308() {
      try {
         ++field675;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[166] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "T",
      descriptor = "(IIII)V",
      line = 1273
   )
   public final void method309(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (~arg3 > ~this.field815) {
            this.field815 = arg3;
         }

         if (this.field820 < arg1) {
            this.field820 = arg1;
         }

         if (this.field798 > arg2) {
            this.field798 = arg2;
         }

         ++field623;
         if (~arg0 < ~this.field828) {
            this.field828 = arg0;
         }

         OpenGL.glEnable(3089);
         this.method422((byte)-109);
         this.method281(75);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[152] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 1303
   )
   public final void method310(Canvas arg0, int arg1, int arg2) {
      try {
         long var4;
         label37: {
            ++field518;
            var4 = 0L;
            if (arg0 != null && this.field678 != arg0) {
               if (!this.field553.containsKey(arg0)) {
                  break label37;
               }

               Long var6 = (Long)this.field553.get(arg0);
               var4 = var6;
               if (!client.field4564) {
                  break label37;
               }
            }

            var4 = this.field516;
         }

         if (~var4 == -1L) {
            throw new RuntimeException();
         } else {
            this.field595.surfaceResized(var4);
            if (this.field685 == arg0) {
               this.method347(true);
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[51] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(FBFFF)V",
      line = 1334
   )
   public final void method311(float arg0, byte arg1, float arg2, float arg3, float arg4) {
      try {
         ++field566;
         class104.field1741[3] = arg0;
         class104.field1741[2] = arg3;
         class104.field1741[0] = arg4;
         if (arg1 <= 66) {
            this.method375();
         }

         class104.field1741[1] = arg2;
         OpenGL.glTexEnvfv(8960, 8705, class104.field1741, 0);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[96] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "(I)V",
      line = 1349
   )
   public final void method312(int arg0) {
      try {
         ++field642;
         if (arg0 != 1) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[160] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lpv;B)V",
      line = 1363
   )
   public final void method313(class77 arg0, byte arg1) {
      try {
         int var3 = -9 % ((-12 - arg1) / 49);
         ++field634;
         if (this.field812 != arg0) {
            if (this.field824) {
               OpenGL.glBindBufferARB(34962, arg0.method795(6854));
            }

            this.field812 = arg0;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[219] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "(III)V",
      line = 1381
   )
   public final void method314(int arg0, int arg1, int arg2) {
      try {
         label29: {
            if (this.field801 != 0) {
               OpenGL.glTexEnvi(8960, 34161, arg0);
               OpenGL.glTexEnvi(8960, 34162, arg2);
               if (!client.field4564) {
                  break label29;
               }
            }

            boolean var4 = false;
            if (~this.field816 != ~arg0) {
               OpenGL.glTexEnvi(8960, 34161, arg0);
               var4 = true;
               this.field816 = arg0;
            }

            if (this.field810 != arg2) {
               OpenGL.glTexEnvi(8960, 34162, arg2);
               var4 = true;
               this.field810 = arg2;
            }

            if (var4) {
               this.field754 &= -30;
            }
         }

         int var5 = -119 % ((arg1 - 49) / 34);
         ++field612;
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[167] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 1422
   )
   public final void method315(Canvas arg0) {
      try {
         label45: {
            ++field557;
            this.field685 = null;
            this.field554 = 0L;
            if (arg0 == null || this.field678 == arg0) {
               this.field685 = this.field678;
               this.field554 = this.field516;
               if (!client.field4564) {
                  break label45;
               }
            }

            if (this.field553.containsKey(arg0)) {
               Long var2 = (Long)this.field553.get(arg0);
               this.field554 = var2;
               this.field685 = arg0;
            }
         }

         if (this.field685 != null && ~this.field554 != -1L) {
            this.field595.setSurface(this.field554);
            this.method347(true);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[95] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "C",
      descriptor = "(Z)V",
      line = 1451
   )
   public final void method316(boolean arg0) {
      try {
         this.field832 = arg0;
         ++field517;
         this.method399(true);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[171] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Z)V",
      line = 1462
   )
   public final void method317(boolean arg0) {
      try {
         ++field700;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[198] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "M",
      descriptor = "()I",
      line = 1471
   )
   public final int method318() {
      try {
         ++field649;
         int var1 = this.field877;
         this.field877 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "(I)V",
      line = 1482
   )
   private final void method319(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rk",
      name = "m",
      descriptor = "(I)V",
      line = 1528
   )
   private final void method320(int arg0) {
      try {
         ++field520;
         if (arg0 != -1) {
            this.field761 = null;
         }

         this.field595.method4762();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[225] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "t",
      descriptor = "()V",
      line = 1545
   )
   public final void method321() {
      try {
         OpenGL.glFinish();
         ++field519;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[226] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "m",
      descriptor = "(II)V",
      line = 1553
   )
   public final void method322(int arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg0 >= -35) {
            this.method401(-83);
         }

         label52: {
            if (~arg1 == -2) {
               this.method314(7681, -32, 7681);
               if (!var3) {
                  break label52;
               }
            }

            if (arg1 != 0) {
               if (arg1 == 2) {
                  this.method314(34165, 85, 7681);
                  if (!var3) {
                     break label52;
                  }
               }

               if (~arg1 == -4) {
                  this.method314(260, 99, 8448);
                  if (!var3) {
                     break label52;
                  }
               }

               if (arg1 != 4) {
                  break label52;
               }

               this.method314(34023, 125, 34023);
               if (!var3) {
                  break label52;
               }
            }

            this.method314(8448, 105, 8448);
         }

         ++field575;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[147] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(I)V",
      line = 1583
   )
   public final void method323(int arg0) {
      try {
         this.method320(-1);
         ++field666;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[91] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(JZ)V",
      line = 1593
   )
   public final synchronized void method324(long arg0, boolean arg1) {
      try {
         ++field600;
         class22 var4 = new class22();
         var4.field347 = arg0;
         if (arg1) {
            this.method325(8, -28, 124, -88);
         }

         this.field750.method2585(var4, -127);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[120] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "EA",
      descriptor = "(IIII)V",
      line = 1607
   )
   public final void method325(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field694;
         if (!this.field836) {
            throw new RuntimeException("");
         } else {
            this.field818 = arg0;
            this.field794 = arg3;
            this.field764 = arg1;
            this.field814 = arg2;
            if (this.field850) {
               this.field705.field5964.method5290(34336);
               this.field705.field5964.method5291((byte)-67);
            }
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[122] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "F",
      descriptor = "(II)V",
      line = 1630
   )
   public final void method326(int arg0, int arg1) {
      try {
         ++field693;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[97] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "j",
      descriptor = "()Z",
      line = 1637
   )
   public final boolean method327() {
      try {
         ++field597;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[50] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "l",
      descriptor = "()Z",
      line = 1645
   )
   public final boolean method328() {
      try {
         ++field657;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[32] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "v",
      descriptor = "()I",
      line = 1653
   )
   public final int method329() {
      try {
         ++field616;
         return 4;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IZ)V",
      line = 1662
   )
   public final synchronized void method330(int arg0, boolean arg1) {
      try {
         ++field655;
         class22 var3 = new class22();
         if (arg1) {
            this.field711 = null;
         }

         var3.field347 = (long)arg0;
         this.field749.method2585(var3, -117);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[141] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "q",
      descriptor = "(I)V",
      line = 1677
   )
   private final void method331(int arg0) {
      try {
         int var2 = 18 / ((-50 - arg0) / 32);
         ++field563;
         if (this.field855 != 1) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (~this.field665 < -1 && this.field546 > 0) {
               OpenGL.glOrtho(0.0D, (double)this.field665, (double)this.field546, 0.0D, -1.0D, 1.0D);
            }

            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field754 &= -25;
            this.field855 = 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "k",
      descriptor = "(I)V",
      line = 1700
   )
   private final void method332(int arg0) {
      try {
         if (arg0 == 2912) {
            ++field611;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadMatrixf(this.field790, 0);
            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[204] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "KA",
      descriptor = "(IIII)V",
      line = 1713
   )
   public final void method333(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (~arg1 > -1) {
            arg1 = 0;
         }

         if (~arg0 > -1) {
            arg0 = 0;
         }

         if (~this.field665 > ~arg2) {
            arg2 = this.field665;
         }

         if (this.field546 < arg3) {
            arg3 = this.field546;
         }

         ++field585;
         this.field828 = arg0;
         this.field798 = arg2;
         this.field820 = arg1;
         this.field815 = arg3;
         OpenGL.glEnable(3089);
         this.method422((byte)-117);
         this.method281(68);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[134] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "JA",
      descriptor = "(IIIIII)I",
      line = 1751
   )
   public final int method334(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;

      try {
         ++field640;
         int var8 = 0;
         float var9 = (float)arg2 * this.field757.field8098 + (float)arg0 * this.field757.field8130 + (float)arg1 * this.field757.field8110 + this.field757.field8109;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field757.field8098 + (float)arg3 * this.field757.field8130 + (float)arg4 * this.field757.field8110 + this.field757.field8109;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label63: {
            if ((float)this.field829 > var9 && (float)this.field829 > var10) {
               var8 |= 16;
               if (!var7) {
                  break label63;
               }
            }

            if (var9 > (float)this.field827 && var10 > (float)this.field827) {
               var8 |= 32;
            }
         }

         label57: {
            int var11 = (int)(((float)arg2 * this.field757.field8127 + (float)arg0 * this.field757.field8099 + (float)arg1 * this.field757.field8103 + this.field757.field8102) * (float)this.field803 / var9);
            int var12 = (int)(((float)arg5 * this.field757.field8127 + (float)arg3 * this.field757.field8099 + (float)arg4 * this.field757.field8103 + this.field757.field8102) * (float)this.field803 / var10);
            if (this.field786 > (float)var11 && this.field786 > (float)var12) {
               var8 |= 1;
               if (!var7) {
                  break label57;
               }
            }

            if (this.field806 < (float)var11 && (float)var12 > this.field806) {
               var8 |= 2;
            }
         }

         int var13 = (int)(((float)arg2 * this.field757.field8118 + (float)arg0 * this.field757.field8123 + (float)arg1 * this.field757.field8095 + this.field757.field8093) * (float)this.field834 / var9);
         int var14 = (int)(((float)arg5 * this.field757.field8118 + (float)arg3 * this.field757.field8123 + (float)arg4 * this.field757.field8095 + this.field757.field8093) * (float)this.field834 / var10);
         if (this.field841 > (float)var13 && this.field841 > (float)var14) {
            var8 |= 4;
            if (!var7) {
               return var8;
            }
         }

         if (this.field866 < (float)var13 && (float)var14 > this.field866) {
            var8 |= 8;
         }

         return var8;
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field879[111] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "o",
      descriptor = "(II)V",
      line = 1802
   )
   public final void method335(int arg0, int arg1) {
      try {
         ++field547;
         if (arg0 != 0) {
            this.field832 = true;
         }

         this.method355(true, arg0 ^ -106, arg1);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V",
      line = 1814
   )
   public final void method336(Canvas arg0, int arg1, int arg2) {
      try {
         ++field684;
         if (this.field678 == arg0) {
            throw new RuntimeException();
         } else if (!this.field553.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field879[211]);
                  Method var5 = var4.getMethod(field879[213], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var9) {
               }

               long var6 = this.field595.prepareSurface(arg0);
               if (~var6 == 0L) {
                  throw new RuntimeException();
               } else {
                  this.field553.put(arg0, new Long(var6));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field879[212] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "ZA",
      descriptor = "(IFFFFF)V",
      line = 1849
   )
   public final void method337(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field674;
         boolean var7 = ~this.field821 != ~arg0;
         if (var7 || this.field826 != arg1 || this.field773 != arg2) {
            this.field773 = arg2;
            this.field826 = arg1;
            this.field821 = arg0;
            if (var7) {
               this.field856 = (float)(255 & this.field821) / 255.0F;
               this.field858 = (float)(16711680 & this.field821) / 1.671168E7F;
               this.field780 = (float)(65280 & this.field821) / 65280.0F;
               this.method372((byte)-94);
            }

            this.method271(-15677);
         }

         if (this.field782[0] != arg3 || this.field782[1] != arg4 || this.field782[2] != arg5) {
            this.field782[0] = arg3;
            this.field782[1] = arg4;
            this.field782[2] = arg5;
            this.field849[1] = -arg4;
            this.field849[0] = -arg3;
            this.field849[2] = -arg5;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field830[0] = arg3 * var8;
            this.field830[1] = arg4 * var8;
            this.field830[2] = arg5 * var8;
            this.field844[1] = -this.field830[1];
            this.field844[0] = -this.field830[0];
            this.field844[2] = -this.field830[2];
            this.method279(0);
            this.field860 = (int)(arg5 * 256.0F / arg4);
            this.field793 = (int)(arg3 * 256.0F / arg4);
         }

      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field879[138] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Ldfa;)V",
      line = 1899
   )
   public final void method338(class173 arg0) {
      try {
         this.field757.method982(arg0);
         ++field706;
         this.field760.method982(this.field757);
         this.field760.method4169((byte)-105);
         this.field761.method4163(102, this.field760);
         if (this.field855 != 1) {
            this.method369(true);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[84] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "X",
      descriptor = "(I)V",
      line = 1915
   )
   public final void method339(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(IIIIII)V",
      line = 1934
   )
   public final void method340(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var8;
         float var10;
         label23: {
            ++field662;
            this.method366(256);
            this.method288(-3, arg5);
            float var7 = (float)arg2 - (float)arg0;
            var8 = (float)arg3 - (float)arg1;
            if (var7 != 0.0F || var8 != 0.0F) {
               float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
               var8 *= var9;
               var10 = var7 * var9;
               if (!client.field4564) {
                  break label23;
               }
            }

            var10 = 1.0F;
         }

         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glVertex2f((float)arg2 + var10 + 0.35F, (float)arg3 + var8 + 0.35F);
         OpenGL.glEnd();
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field879[10] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "i",
      descriptor = "(II)V",
      line = 1966
   )
   public final synchronized void method341(int arg0, int arg1) {
      try {
         ++field531;
         if (arg1 != 4) {
            this.method267();
         }

         class459 var3 = new class459(arg0);
         this.field747.method2585(var3, -115);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[39] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIZ)Ltd;",
      line = 1984
   )
   public final class476 method342(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field594;
         return new class637(this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(B)V",
      line = 1994
   )
   public final void method343(byte arg0) {
      try {
         ++field652;
         if (this.field855 != 0) {
            this.field754 &= -32;
            this.field855 = 0;
         }

         if (arg0 > -32) {
            this.method321();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[98] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Ljava/lang/String;I)J",
      line = 2013
   )
   public static final long method344(String arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field654;
         long var3 = 0L;
         int var5 = arg0.length();
         int var6 = 0;
         if (arg1 != 24485) {
            return -18L;
         } else {
            long var10000;
            label89:
            while(true) {
               label96: {
                  if (~var6 <= ~var5) {
                     if (!var2) {
                        if (var2) {
                           var3 /= 37L;
                        }
                        break label96;
                     }
                  } else {
                     var3 *= 37L;
                  }

                  label106: {
                     char var7 = arg0.charAt(var6);
                     if (~var7 > -66 || ~var7 < -91) {
                        if (~var7 > -98 || ~var7 < -123) {
                           if (var7 < '0' || ~var7 < -58) {
                              break label106;
                           }

                           var3 += (long)(var7 + -48 + 27);
                           if (!var2) {
                              break label106;
                           }
                        }

                        var3 += (long)(var7 + 1 + -97);
                        if (!var2) {
                           break label106;
                        }
                     }

                     var3 += (long)(var7 + -65 + 1);
                  }

                  if (var3 < 177917621779460413L || var2) {
                     ++var6;
                     continue;
                  }
               }

               while(true) {
                  if (~(var3 % 37L) != -1L) {
                     break label89;
                  }

                  var10000 = ~var3;
                  if (var2) {
                     return var10000;
                  }

                  if (var10000 == -1L) {
                     break label89;
                  }

                  var3 /= 37L;
               }
            }

            var10000 = var3;
            return var10000;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[155] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(II[BIZ)Lee;",
      line = 2063
   )
   public final class703 method345(int arg0, int arg1, byte[] arg2, int arg3, boolean arg4) {
      try {
         ++field687;
         if (arg0 != 25589) {
            this.method379();
         }

         return (class703)(!this.field824 || arg4 && !this.field805 ? new class163(this, arg3, arg2, arg1) : new class462(this, arg3, arg2, arg1, arg4));
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[223] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field879[6] : field879[7]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "I",
      descriptor = "()I",
      line = 2079
   )
   public final int method346() {
      try {
         ++field631;
         int var1 = this.field874;
         this.field874 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[180] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "(Z)V",
      line = 2090
   )
   private final void method347(boolean arg0) {
      try {
         label24: {
            if (this.field685 == null) {
               this.field535 = this.field703 = 0;
               if (!client.field4564) {
                  break label24;
               }
            }

            Dimension var2 = this.field685.getSize();
            this.field535 = var2.width;
            this.field703 = var2.height;
         }

         ++field603;
         if (this.field735 == null) {
            this.field546 = this.field703;
            this.field665 = this.field535;
            this.method415((byte)20);
         }

         this.method343((byte)-82);
         if (arg0) {
            this.method349();
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[110] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "x",
      descriptor = "()Z",
      line = 2122
   )
   public final boolean method348() {
      try {
         ++field543;
         return this.field708 != null && (this.field712 <= 1 || this.field871);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[114] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "la",
      descriptor = "()V",
      line = 2130
   )
   public final void method349() {
      try {
         this.field828 = 0;
         this.field820 = 0;
         this.field815 = this.field546;
         this.field798 = this.field665;
         ++field667;
         OpenGL.glDisable(3089);
         this.method422((byte)-107);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[128] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "t",
      descriptor = "(I)Lma;",
      line = 2145
   )
   public final class14 method350(int arg0) {
      try {
         ++field539;
         if (arg0 != 0) {
            return null;
         } else {
            return this.field848 != null ? this.field848.method1128(arg0 ^ -24197) : null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[40] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "A",
      descriptor = "()Z",
      line = 2156
   )
   public final boolean method351() {
      try {
         ++field647;
         return this.field851 && (!this.method410() || this.field871);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[159] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lph;IIII)Lka;",
      line = 2167
   )
   public final class495 method352(class668 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field707;
         return new class753(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[181] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IFF)V",
      line = 2177
   )
   public final void method353(int arg0, float arg1, float arg2) {
      try {
         this.field859 = arg1;
         if (arg0 <= 72) {
            this.field860 = 4;
         }

         ++field572;
         this.field864 = arg2;
         this.method290(-124);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[92] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "(II)I",
      line = 2197
   )
   public final int method354(int arg0, int arg1) {
      try {
         ++field645;
         return arg1 | arg0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[187] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZII)V",
      line = 2209
   )
   public final void method355(boolean arg0, int arg1, int arg2) {
      try {
         if (arg1 > -49) {
            this.method321();
         }

         ++field672;
         this.method412(arg0, arg2, true, (byte)-114);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[52] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(B)V",
      line = 2221
   )
   private final void method356(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field680;
         this.method335(0, -2);
         int var3 = this.field808 + -1;
         if (var2) {
            this.method259(32, var3);
            this.method252((class707)null, (byte)-103);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            --var3;
         }

         while(true) {
            while(~var3 <= -1) {
               this.method259(32, var3);
               this.method252((class707)null, (byte)-103);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               --var3;
            }

            this.method314(8448, -36, 8448);
            this.method262(2, 770, 8960, 34168);
            this.method439(5890);
            this.field758 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field753 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, 0.0F);
            this.field752 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field759 = true;
            this.method360(true, (byte)94);
            this.method282(true, -8);
            this.method443(true, (byte)14);
            this.method440((byte)86, true);
            this.method343((byte)-37);
            this.field595.setSwapInterval(0);
            OpenGL.glShadeModel(7425);
            if (!var2) {
               if (arg0 <= 59) {
                  return;
               }

               OpenGL.glClearDepth(1.0F);
               OpenGL.glDepthFunc(515);
               OpenGL.glPolygonMode(1028, 6914);
               OpenGL.glEnable(2884);
               OpenGL.glCullFace(1029);
               OpenGL.glMatrixMode(5888);
               OpenGL.glLoadIdentity();
               OpenGL.glColorMaterial(1028, 5634);
               OpenGL.glEnable(2903);
               float[] var4 = new float[]{0.0F, 0.0F, 0.0F, 1.0F};
               int var5 = 0;
               int var6;
               if (var2) {
                  var6 = 16384 - -var5;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }

               while(true) {
                  short var10000;
                  int var10001;
                  if (var5 >= 8) {
                     OpenGL.glEnable(16384);
                     OpenGL.glEnable(16385);
                     OpenGL.glFogf(2914, 0.95F);
                     OpenGL.glFogi(2917, 9729);
                     var10000 = 3156;
                     var10001 = 4353;
                     if (!var2) {
                        OpenGL.glHint(3156, 4353);
                        this.field821 = this.field797 = -1;
                        this.method349();
                        return;
                     }
                  } else {
                     var10000 = 16384;
                     var10001 = -var5;
                  }

                  var6 = var10000 - var10001;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }
            }

            OpenGL.glTexEnvi(arg0, 59, 34160);
            --var3;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[116] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "([IIIIIZ)Ltd;",
      line = 2297
   )
   public final class476 method357(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field696;
         return new class637(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[157] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(II)Leg;",
      line = 2305
   )
   public final class117 method358(int arg0, int arg1) {
      try {
         ++field721;
         return null;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[99] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIIILaa;II)V",
      line = 2314
   )
   public final void method359(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8) {
      try {
         ++field715;
         class560 var10 = (class560)arg6;
         class633 var11 = var10.field8145;
         this.method430(2);
         this.method252(var10.field8145, (byte)-124);
         this.method288(-3, arg5);
         this.method314(7681, 111, 8448);
         this.method262(0, 768, 8960, 34167);
         float var12 = var11.field9233 / (float)var11.field9232;
         float var13 = var11.field9234 / (float)var11.field9235;
         float var14 = (float)(-arg0) + (float)arg2;
         float var15 = (float)(-arg1) + (float)arg3;
         float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
         float var17 = var15 * var16;
         float var18 = var14 * var16;
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glTexCoord2f((float)(arg0 - arg7) * var12, (float)(-arg8 + arg1) * var13);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glTexCoord2f((float)(-arg7 + arg2) * var12, (float)(-arg8 + arg3) * var13);
         OpenGL.glVertex2f((float)arg2 + var18 + 0.35F, (float)arg3 + var17 + 0.35F);
         OpenGL.glEnd();
         this.method262(0, 768, 8960, 5890);
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field879[151] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field879[6] : field879[7]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZB)V",
      line = 2356
   )
   public final void method360(boolean arg0, byte arg1) {
      try {
         if (arg0 == !this.field872) {
            this.field872 = arg0;
            this.method397(32668);
            this.field754 &= -32;
         }

         ++field682;
         int var3 = 33 % ((arg1 - 12) / 34);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[179] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "U",
      descriptor = "(IIIII)V",
      line = 2376
   )
   public final void method361(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method366(256);
         ++field704;
         this.method288(-3, arg4);
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f((float)arg2 + var6, var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[139] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(FI)V",
      line = 2396
   )
   public final void method362(float arg0, int arg1) {
      try {
         if (this.field781 != arg0) {
            this.field781 = arg0;
            if (this.field855 == 3) {
               this.method434(true);
            }
         }

         ++field564;
         if (arg1 != -1) {
            this.field802 = true;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[103] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIII)Lpa;",
      line = 2415
   )
   public final class386 method363(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field559;
         return !this.field769 ? null : new class194(this, arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[196] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(I[Lke;)V",
      line = 2426
   )
   public final void method364(int arg0, class622[] arg1) {
      boolean var3 = client.field4564;

      try {
         int var4 = 0;
         if (var3) {
            this.field762[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class35 var10000;
            if (~arg0 >= ~var4) {
               ++field587;
               this.field809 = arg0;
               var10000 = this;
               if (!var3) {
                  if (~this.field855 != -2) {
                     this.method319(31709);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field762[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[202] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZLee;)V",
      line = 2448
   )
   public final void method365(boolean arg0, class703 arg1) {
      try {
         if (this.field767 != arg1) {
            if (this.field824) {
               OpenGL.glBindBufferARB(34963, arg1.method1489(-70));
            }

            this.field767 = arg1;
         }

         ++field635;
         if (!arg0) {
            this.field751 = false;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[137] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "n",
      descriptor = "(I)V",
      line = 2468
   )
   private final void method366(int arg0) {
      try {
         ++field620;
         if (arg0 != 256) {
            this.method275(-0.35812023F, (byte)-91, -1.8975197F, -0.15980244F);
         }

         if (~this.field754 != -2) {
            this.method331(-120);
            this.method360(false, (byte)-24);
            this.method282(false, -8);
            this.method443(false, (byte)14);
            this.method440((byte)89, false);
            this.method252((class707)null, (byte)-29);
            this.method335(0, -2);
            this.method322(-98, 1);
            this.field754 = 1;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "H",
      descriptor = "(III[I)V",
      line = 2497
   )
   public final void method367(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field569;
         float var5 = (float)arg2 * this.field757.field8098 + (float)arg0 * this.field757.field8130 + (float)arg1 * this.field757.field8110 + this.field757.field8109;
         if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
         } else {
            int var6 = (int)(((float)arg2 * this.field757.field8127 + (float)arg0 * this.field757.field8099 + (float)arg1 * this.field757.field8103 + this.field757.field8102) * (float)this.field803 / var5);
            int var7 = (int)(((float)arg2 * this.field757.field8118 + (float)arg0 * this.field757.field8123 + (float)arg1 * this.field757.field8095 + this.field757.field8093) * (float)this.field834 / var5);
            arg3[0] = (int)((float)var6 + -this.field786);
            arg3[1] = (int)((float)var7 + -this.field841);
            arg3[2] = (int)var5;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[131] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "r",
      descriptor = "(IIIIIII)I",
      line = 2519
   )
   public final int method368(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         int var11;
         label75: {
            ++field669;
            float var9 = (float)arg2 * this.field757.field8098 + (float)arg0 * this.field757.field8130 + (float)arg1 * this.field757.field8110 + this.field757.field8109;
            float var10 = (float)arg5 * this.field757.field8098 + (float)arg3 * this.field757.field8130 + (float)arg4 * this.field757.field8110 + this.field757.field8109;
            var11 = 0;
            if (!((float)this.field829 > var9) || !(var10 < (float)this.field829)) {
               if (!(var9 > (float)this.field827) || !(var10 > (float)this.field827)) {
                  break label75;
               }

               var11 |= 32;
               if (!var8) {
                  break label75;
               }
            }

            var11 |= 16;
         }

         label54: {
            int var12 = (int)(((float)arg2 * this.field757.field8127 + (float)arg0 * this.field757.field8099 + (float)arg1 * this.field757.field8103 + this.field757.field8102) * (float)this.field803 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field757.field8127 + (float)arg3 * this.field757.field8099 + (float)arg4 * this.field757.field8103 + this.field757.field8102) * (float)this.field803 / (float)arg6);
            if (this.field786 > (float)var12 && (float)var13 < this.field786) {
               var11 |= 1;
               if (!var8) {
                  break label54;
               }
            }

            if (this.field806 < (float)var12 && this.field806 < (float)var13) {
               var11 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field757.field8118 + (float)arg0 * this.field757.field8123 + (float)arg1 * this.field757.field8095 + this.field757.field8093) * (float)this.field834 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field757.field8118 + (float)arg3 * this.field757.field8123 + (float)arg4 * this.field757.field8095 + this.field757.field8093) * (float)this.field834 / (float)arg6);
         if (!(this.field841 > (float)var14) || !((float)var15 < this.field841)) {
            if (!(this.field866 < (float)var14) || !(this.field866 < (float)var15)) {
               return var11;
            }

            var11 |= 8;
            if (!var8) {
               return var11;
            }
         }

         var11 |= 4;
         return var11;
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field879[221] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "i",
      descriptor = "(Z)V",
      line = 2563
   )
   private final void method369(boolean arg0) {
      try {
         OpenGL.glLoadIdentity();
         if (arg0) {
            ++field606;
            OpenGL.glMultMatrixf(this.field760.method4160(0), 0);
            if (this.field850) {
               this.field705.field5964.method5290(34336);
            }

            this.method279(0);
            this.method319(31709);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[107] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "o",
      descriptor = "(I)V",
      line = 2581
   )
   public final void method370(int arg0) {
      try {
         ++field589;
         if (arg0 > 87) {
            if (~this.field754 != -9) {
               this.method277((byte)-97);
               this.method360(true, (byte)-52);
               this.method443(true, (byte)14);
               this.method440((byte)84, true);
               this.method288(-3, 1);
               this.field754 = 8;
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[217] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(FFF)V",
      line = 2603
   )
   public final void method371(float arg0, float arg1, float arg2) {
      try {
         class368.field5462 = arg2;
         ++field525;
         class358.field5350 = arg1;
         class162.field2583 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[118] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "(B)V",
      line = 2616
   )
   private final void method372(byte arg0) {
      try {
         class104.field1741[2] = this.field862 * this.field856;
         class104.field1741[3] = 1.0F;
         if (arg0 > -22) {
            this.method442(-15);
         }

         class104.field1741[1] = this.field862 * this.field780;
         ++field714;
         class104.field1741[0] = this.field862 * this.field858;
         OpenGL.glLightModelfv(2899, class104.field1741, 0);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[143] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "l",
      descriptor = "(II)I",
      line = 2631
   )
   public final int method373(int arg0, int arg1) {
      try {
         ++field628;
         if (arg0 != 6406 && arg0 != 6409) {
            if (~arg0 != -6411 && ~arg0 != -34847 && ~arg0 != -34845) {
               if (arg0 == 6407) {
                  return 3;
               } else if (arg0 != 6408 && ~arg0 != -34848) {
                  if (arg0 == 34843) {
                     return 6;
                  } else if (arg0 == 34842) {
                     return 8;
                  } else if (~arg0 != -6403) {
                     if (arg0 == 6401) {
                        return 1;
                     } else if (arg1 != 34023) {
                        return -90;
                     } else {
                        throw new IllegalArgumentException("");
                     }
                  } else {
                     return 3;
                  }
               } else {
                  return 4;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[194] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "pa",
      descriptor = "()V",
      line = 2674
   )
   public final void method374() {
      try {
         this.field836 = false;
         ++field670;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[178] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "()V",
      line = 2687
   )
   public final void method375() {
      try {
         ++field622;
         if (this.field838 && this.field665 > 0 && this.field546 > 0) {
            int var1 = this.field828;
            int var2 = this.field798;
            int var3 = this.field820;
            int var4 = this.field815;
            this.method349();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method343((byte)-73);
            this.method360(false, (byte)99);
            this.method282(false, -8);
            this.method443(false, (byte)14);
            this.method440((byte)93, false);
            this.method252((class707)null, (byte)-106);
            this.method335(0, -2);
            this.method322(-96, 1);
            this.method288(-3, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field665, this.field546, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method333(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[154] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "w",
      descriptor = "(I)V",
      line = 2731
   )
   public static void method376(int arg0) {
      try {
         field656 = null;
         if (arg0 != 11542) {
            field656 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[168] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "g",
      descriptor = "(II)I",
      line = 2742
   )
   public final int method377(int arg0, int arg1) {
      try {
         if (arg0 != 7513) {
            return 81;
         } else {
            ++field542;
            if (~arg1 != -2) {
               if (~arg1 == -1) {
                  return 8448;
               } else if (~arg1 == -3) {
                  return 34165;
               } else if (~arg1 != -4) {
                  if (~arg1 == -5) {
                     return 34023;
                  } else {
                     throw new IllegalArgumentException();
                  }
               } else {
                  return 260;
               }
            } else {
               return 7681;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[30] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "j",
      descriptor = "(I)V",
      line = 2773
   )
   public final void method378(int arg0) {
      try {
         ++field710;
         if (arg0 >= 128 && ~arg0 >= -1025) {
            this.field720 = arg0;
            this.field719.method3235(124);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "()V",
      line = 2786
   )
   public final void method379() {
      boolean var1 = client.field4564;

      try {
         label35: {
            ++field538;
            if (this.field771) {
               if (this.field732 != this.field735) {
                  throw new RuntimeException();
               }

               this.field732.method931(0, 1);
               this.field732.method931(8, 1);
               this.method400(this.field732, 20547);
               if (!var1) {
                  break label35;
               }
            }

            if (!this.field787) {
               throw new RuntimeException("");
            }

            this.field736.method1053(0, 0, this.field665, this.field546, 0, 0);
            this.field595.setSurface(this.field554);
            if (var1) {
               throw new RuntimeException("");
            }
         }

         this.field665 = this.field535;
         this.field736 = null;
         this.field546 = this.field703;
         this.method343((byte)-53);
         this.method415((byte)20);
         this.method349();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[216] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "ya",
      descriptor = "()V",
      line = 2819
   )
   public final void method380() {
      try {
         ++field576;
         this.method440((byte)102, true);
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[199] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V",
      line = 2830
   )
   public final void method381(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class328 {
      try {
         ++field592;
         this.method393(arg2, arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[36] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "(ILgfa;)V",
      line = 2841
   )
   public final void method382(int arg0, class781 arg1) {
      try {
         ++field551;
         if (arg0 != 1921197656) {
            this.method372((byte)26);
         }

         if (this.field731 >= 3) {
            throw new RuntimeException();
         } else {
            if (this.field731 >= 0) {
               this.field737[this.field731].method928((byte)-109);
            }

            this.field734 = this.field737[++this.field731] = arg1;
            this.field734.method944(22927);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[8] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "C",
      descriptor = "(I)I",
      line = 2862
   )
   private final int method383(int arg0) {
      try {
         ++field688;
         int var2 = 0;
         this.field833 = OpenGL.glGetString(7936).toLowerCase();
         this.field792 = OpenGL.glGetString(7937).toLowerCase();
         if (~this.field833.indexOf(field879[69]) != 0) {
            var2 |= 1;
         }

         if (this.field833.indexOf(field879[75]) != -1 || this.field833.indexOf(field879[78]) != -1) {
            var2 |= 1;
         }

         label58: {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class431.method3250(true, var3.replace('.', ' '), ' ');
            if (var4.length >= 2) {
               try {
                  int var5 = class515.method3896(10, var4[0]);
                  int var6 = class515.method3896(10, var4[1]);
                  this.field795 = var5 * 10 + var6;
                  break label58;
               } catch (NumberFormatException var9) {
                  var2 |= 4;
                  if (!client.field4564) {
                     break label58;
                  }
               }
            }

            var2 |= 4;
         }

         if (this.field795 < 12) {
            var2 |= 2;
         }

         if (!this.field595.method4764(field879[63])) {
            var2 |= 8;
         }

         if (!this.field595.method4764(field879[79])) {
            var2 |= 32;
         }

         int[] var7 = new int[1];
         OpenGL.glGetIntegerv(34018, var7, 0);
         this.field808 = var7[0];
         OpenGL.glGetIntegerv(34929, var7, 0);
         this.field804 = var7[0];
         OpenGL.glGetIntegerv(34930, var7, 0);
         this.field777 = var7[0];
         if (~this.field808 > -3 || ~this.field804 > -3 || ~this.field777 > -3) {
            var2 |= 16;
         }

         this.field807 = Stream.method5090();
         this.field787 = this.field595.arePbuffersAvailable();
         this.field824 = this.field595.method4764(field879[71]);
         if (arg0 < 48) {
            return 33;
         } else {
            this.field851 = this.field595.method4764(field879[61]);
            this.field840 = this.field595.method4764(field879[62]);
            this.field595.method4764(field879[76]);
            this.field869 = this.field595.method4764(field879[60]);
            this.field837 = this.field595.method4764(field879[65]);
            this.field811 = this.field595.method4764(field879[67]);
            this.field802 = this.field595.method4764(field879[66]);
            this.field769 = this.field595.method4764(field879[77]);
            this.field867 = this.field595.method4764(field879[64]);
            this.field831 = false;
            this.field771 = this.field595.method4764(field879[68]);
            this.field775 = this.field595.method4764(field879[72]);
            this.field847 = this.field595.method4764(field879[73]);
            this.field871 = this.field847 & this.field775;
            this.field857 = class614.field8919.startsWith(field879[70]);
            OpenGL.glGetFloatv(2834, class104.field1741, 0);
            this.field768 = class104.field1741[0];
            this.field778 = class104.field1741[1];
            return ~var2 != -1 ? var2 : 0;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field879[74] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lee;IBII)V",
      line = 2949
   )
   public final void method384(class703 arg0, int arg1, byte arg2, int arg3, int arg4) {
      try {
         ++field598;
         int var6 = arg0.method1486(false);
         int var9 = arg3 * this.method431(var6, -5125);
         this.method365(true, arg0);
         OpenGL.glDrawElements(arg4, arg1, var6, (long)var9 + arg0.method1487(arg2 + -31716));
         if (arg2 != -94) {
            this.field876 = null;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field879[58] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V",
      line = 2966
   )
   public final void method385(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field586;
         this.method366(256);
         this.method288(-3, arg12);
         OpenGL.glBegin(4);
         OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
         OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, (float)arg2);
         OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
         OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, (float)arg5);
         OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
         OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, (float)arg8);
         OpenGL.glEnd();
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field879[184] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "w",
      descriptor = "()Z",
      line = 2985
   )
   public final boolean method386() {
      try {
         ++field580;
         return this.field705.method3106(-127, 3);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[172] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "(IIII)V",
      line = 2993
   )
   public final void method387(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field618;
         OpenGL.glTexEnvi(8960, arg0 + arg1, arg2);
         OpenGL.glTexEnvi(8960, arg0 + 34200, arg3);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[37] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lpga;B)V",
      line = 3005
   )
   public final void method388(class558 arg0, byte arg1) {
      try {
         ++field709;
         int var3 = 11 / ((arg1 - 27) / 54);
         OpenGL.glLoadMatrixf(arg0.method4160(0), 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[162] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "da",
      descriptor = "(III[I)V",
      line = 3015
   )
   public final void method389(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field676;
         float var5 = (float)arg2 * this.field757.field8098 + (float)arg0 * this.field757.field8130 + (float)arg1 * this.field757.field8110 + this.field757.field8109;
         if (!((float)this.field829 > var5) && !((float)this.field827 < var5)) {
            int var6 = (int)(((float)arg2 * this.field757.field8127 + (float)arg0 * this.field757.field8099 + (float)arg1 * this.field757.field8103 + this.field757.field8102) * (float)this.field803 / var5);
            int var7 = (int)(((float)arg2 * this.field757.field8118 + (float)arg0 * this.field757.field8123 + (float)arg1 * this.field757.field8095 + this.field757.field8093) * (float)this.field834 / var5);
            if ((float)var6 >= this.field786 && (float)var6 <= this.field806 && (float)var7 >= this.field841 && this.field866 >= (float)var7) {
               arg3[0] = (int)((float)var6 + -this.field786);
               arg3[1] = (int)((float)var7 + -this.field841);
               arg3[2] = (int)var5;
            } else {
               arg3[0] = arg3[1] = arg3[2] = -1;
            }
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[193] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "g",
      descriptor = "(Z)V",
      line = 3051
   )
   private final void method390(boolean arg0) {
      try {
         ++field716;
         this.field822 = new class707[this.field808];
         this.field819 = new class281(this, 3553, 6408, 1, 1);
         if (!arg0) {
            new class281(this, 3553, 6408, 1, 1);
            new class281(this, 3553, 6408, 1, 1);
            this.field788 = new class753(this);
            this.field770 = new class753(this);
            this.field825 = new class753(this);
            this.field796 = new class753(this);
            this.field843 = new class753(this);
            this.field776 = new class753(this);
            this.field846 = new class753(this);
            this.field852 = new class753(this);
            this.field870 = new class753(this);
            this.field766 = new class753(this);
            if (this.field771) {
               this.field835 = new class98(this);
               new class98(this);
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[207] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;I)V",
      line = 3093
   )
   public class35(Canvas param1, class160 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "(I)V",
      line = 3242
   )
   public final void method391(int arg0) {
      try {
         ++field558;
         this.method257(false);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[210] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "()Z",
      line = 3253
   )
   public final boolean method392() {
      try {
         ++field555;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[132] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(II)V",
      line = 3261
   )
   public final void method393(int arg0, int arg1) throws class328 {
      try {
         try {
            this.field595.swapBuffers();
         } catch (Exception var4) {
         }

         ++field698;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[177] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "(Z)V",
      line = 3279
   )
   public final void method394(boolean arg0) {
      try {
         ++field523;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[136] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V",
      line = 3286
   )
   public final void method395(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class510 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      boolean var13 = client.field4564;

      try {
         ++field604;
         if (~arg0 != ~arg2 || arg1 != arg3) {
            float var16;
            float var17;
            float var21;
            float var22;
            float var23;
            float var24;
            float var25;
            float var26;
            float var27;
            float var28;
            label87: {
               class560 var14 = (class560)arg6;
               class633 var15 = var14.field8145;
               this.method430(2);
               this.method252(var14.field8145, (byte)-29);
               this.method288(-3, arg5);
               this.method314(7681, 99, 8448);
               this.method262(0, 768, 8960, 34167);
               var16 = var15.field9233 / (float)var15.field9232;
               var17 = var15.field9234 / (float)var15.field9235;
               float var18 = (float)(-arg0) + (float)arg2;
               float var19 = (float)arg3 - (float)arg1;
               float var20 = (float)(1.0D / Math.sqrt((double)(var18 * var18 + var19 * var19)));
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var21 = var19 * var20;
               int var35 = arg11 % (arg10 - -arg9);
               var22 = var18 * var20;
               var23 = (float)arg9 * var22;
               var24 = (float)arg9 * var21;
               var25 = 0.0F;
               var26 = 0.0F;
               var27 = var23;
               var28 = var24;
               if (var35 <= arg9) {
                  var27 = (float)(-var35 + arg9) * var22;
                  var28 = (float)(-var35 + arg9) * var21;
                  if (!var13) {
                     break label87;
                  }
               }

               var26 = (float)(arg9 + arg10 + -var35) * var21;
               var25 = (float)(-var35 + arg9 + arg10) * var22;
            }

            float var29 = (float)arg0 + 0.35F + var25;
            float var30 = (float)arg1 + 0.35F + var26;
            float var31 = (float)arg10 * var22;
            float var32 = (float)arg10 * var21;

            do {
               label94: {
                  int var10000;
                  label78: {
                     if (~arg0 > ~arg2) {
                        float var36;
                        var10000 = (var36 = var29 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                        if (var13) {
                           break label78;
                        }

                        if (var10000 > 0) {
                           break;
                        }

                        if (!(var27 + var29 > (float)arg2)) {
                           break label94;
                        }

                        var27 = (float)arg2 - var29;
                        if (!var13) {
                           break label94;
                        }
                     }

                     float var37;
                     var10000 = (var37 = (float)arg2 + 0.35F - var29) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
                  }

                  if (var10000 > 0) {
                     break;
                  }

                  if ((float)arg2 > var27 + var29) {
                     var27 = (float)arg2 - var29;
                  }
               }

               label96: {
                  if (arg3 <= arg1) {
                     if (var30 < (float)arg3 + 0.35F) {
                        break;
                     }

                     if (!(var28 + var30 < (float)arg3)) {
                        break label96;
                     }

                     var28 = (float)arg3 - var30;
                     if (!var13) {
                        break label96;
                     }
                  }

                  if ((float)arg3 + 0.35F < var30) {
                     break;
                  }

                  if (var28 + var30 > (float)arg3) {
                     var28 = (float)arg3 - var30;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glTexCoord2f((var29 - (float)arg7) * var16, (var30 - (float)arg8) * var17);
               OpenGL.glVertex2f(var29, var30);
               OpenGL.glTexCoord2f((var27 + var29 - (float)arg7) * var16, (var28 + var30 + (float)(-arg8)) * var17);
               OpenGL.glVertex2f(var27 + var29, var28 + var30);
               var29 += var27 + var31;
               OpenGL.glEnd();
               var30 += var28 + var32;
               var27 = var23;
               var28 = var24;
            } while(!var13);

            this.method262(0, 768, 8960, 5890);
         }
      } catch (RuntimeException var34) {
         throw class608.method4462(var34, field879[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field879[6] : field879[7]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;",
      line = 3413
   )
   public final class293 method396(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field571;
         return new class518(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[175] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field879[6] : field879[7]) + ',' + (arg3 != null ? field879[6] : field879[7]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "u",
      descriptor = "(I)V",
      line = 3421
   )
   private final void method397(int arg0) {
      try {
         label23: {
            ++field577;
            if (this.field872 && this.field842 >= 0) {
               OpenGL.glEnable(2912);
               if (!client.field4564) {
                  break label23;
               }
            }

            OpenGL.glDisable(2912);
         }

         if (arg0 != 32668) {
            this.field822 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "y",
      descriptor = "()Ldfa;",
      line = 3440
   )
   public final class173 method398() {
      try {
         ++field614;
         return this.field757;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[13] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "h",
      descriptor = "(Z)V",
      line = 3448
   )
   private final void method399(boolean arg0) {
      try {
         if (!arg0) {
            this.method405(100);
         }

         OpenGL.glDepthMask(this.field751 && this.field832);
         ++field591;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[121] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lgfa;I)V",
      line = 3459
   )
   public final void method400(class781 arg0, int arg1) {
      try {
         ++field534;
         if (arg1 == 20547) {
            if (this.field775) {
               this.method419(8192, arg0);
               this.method418((byte)2, arg0);
            } else if (this.field738 >= 0 && this.field740[this.field738] == arg0) {
               this.field740[this.field738--] = null;
               arg0.method938((byte)-89);
               if (~this.field738 <= -1) {
                  this.field734 = this.field735 = this.field740[this.field738];
                  this.field734.method949(27987);
               } else {
                  this.field734 = this.field735 = null;
               }
            } else {
               throw new RuntimeException();
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[176] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "l",
      descriptor = "(I)V",
      line = 3496
   )
   public final void method401(int arg0) {
      try {
         ++field629;
         if (arg0 != -22939) {
            this.method389(79, 92, -127, (int[])null);
         }

         OpenGL.glPopMatrix();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lpa;)V",
      line = 3507
   )
   public final void method402(class386 arg0) {
      try {
         ++field568;
         this.field848 = (class119)arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[105] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "(IIIIII)V",
      line = 3515
   )
   public final void method403(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field532;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7 - 1.0F;
         float var10 = (float)arg3 + var8 - 1.0F;
         this.method366(256);
         this.method288(-3, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field851) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(2);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field851) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field879[43] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "s",
      descriptor = "()Z",
      line = 3548
   )
   public final boolean method404() {
      try {
         ++field624;
         return false;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "y",
      descriptor = "(I)V",
      line = 3556
   )
   private final void method405(int arg0) {
      try {
         if (arg0 != 2899) {
            this.method257(false);
         }

         ++field596;
         if (this.field784 && !this.field813) {
            OpenGL.glEnable(2896);
         } else {
            OpenGL.glDisable(2896);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[205] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lvm;I)V",
      line = 3571
   )
   public final void method406(class713 arg0, int arg1) {
      try {
         this.field718.method5540(arg1, this, arg0, (byte)-94);
         ++field528;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[222] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "na",
      descriptor = "(IIII)[I",
      line = 3584
   )
   public final int[] method407(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field658;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5) {
            OpenGL.glReadPixelsi(arg0, -arg1 + -var7 + this.field546, arg2, 1, 32993, this.field853, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(arg3 > var7) {
               OpenGL.glReadPixelsi(arg0, -arg1 + -var7 + this.field546, arg2, 1, 32993, this.field853, var6, arg2 * var7);
               ++var7;
            }

            if (!var5) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[165] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "ra",
      descriptor = "(IIII)V",
      line = 3607
   )
   public final void method408(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field607;
         this.field818 = arg0;
         this.field836 = true;
         this.field794 = arg3;
         this.field814 = arg2;
         this.field764 = arg1;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[220] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 3622
   )
   public final void method409(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         OpenGL.glLineWidth((float)arg5);
         ++field626;
         this.method340(arg0, arg1, arg2, arg3, arg4, arg6);
         OpenGL.glLineWidth(1.0F);
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "u",
      descriptor = "()Z",
      line = 3634
   )
   public final boolean method410() {
      try {
         ++field646;
         return this.field708 != null && this.field708.method3120((byte)110);
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[54] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "()Z",
      line = 3642
   )
   public final boolean method411() {
      try {
         ++field668;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[56] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZIZB)V",
      line = 3651
   )
   public final void method412(boolean arg0, int arg1, boolean arg2, byte arg3) {
      try {
         ++field584;
         if (this.field783 != arg1 || !this.field836 == this.field850) {
            class281 var5 = null;
            int var6 = 0;
            byte var7 = 0;
            int var8 = 0;
            int var9 = this.field836 ? 3 : 0;
            if (arg1 < 0) {
               this.method439(5890);
            } else {
               class693 var10;
               label79: {
                  var5 = this.field719.method3231((byte)-38, arg1);
                  var10 = super.field1192.method1456(-8988, arg1);
                  if (~var10.field10152 != -1 || ~var10.field10173 != -1) {
                     int var11 = !var10.field10153 ? 128 : 64;
                     int var12 = var11 * 50;
                     this.method275((float)(this.field728 % var12 * var10.field10152) / (float)var12, (byte)-120, 0.0F, (float)(this.field728 % var12 * var10.field10173) / (float)var12);
                     if (!client.field4564) {
                        break label79;
                     }
                  }

                  this.method439(5890);
               }

               var6 = var10.field10166;
               if (!this.field836) {
                  var8 = var10.field10158;
                  var7 = var10.field10164;
                  var9 = var10.field10167;
               }
            }

            this.field705.method3108(arg2, var7, arg0, var8, var9, -111);
            if (!this.field705.method3107(var5, var6, 16213)) {
               this.method252(var5, (byte)-82);
               this.method322(-72, var6);
            }

            this.field783 = arg1;
            this.field850 = this.field836;
         }

         if (arg3 >= -20) {
            this.method345(-98, -60, (byte[])null, -80, false);
         }

         this.field754 &= -8;
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field879[34] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(IIZ)V",
      line = 3716
   )
   public final synchronized void method413(int arg0, int arg1, boolean arg2) {
      try {
         ++field650;
         if (!arg2) {
            this.method403(-113, 118, 51, -15, 38, -47);
         }

         class459 var4 = new class459(arg0);
         var4.field347 = (long)arg1;
         this.field748.method2585(var4, -113);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lika;[Ltn;Z)Lda;",
      line = 3730
   )
   public final class66 method414(class445 arg0, class94[] arg1, boolean arg2) {
      try {
         ++field621;
         return new class785(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[81] + (arg0 != null ? field879[6] : field879[7]) + ',' + (arg1 != null ? field879[6] : field879[7]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "(B)V",
      line = 3741
   )
   private final void method415(byte arg0) {
      try {
         OpenGL.glViewport(this.field863, this.field865, this.field665, this.field546);
         if (arg0 != 20) {
            this.method331(15);
         }

         ++field701;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[192] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "()Z",
      line = 3752
   )
   public final boolean method416() {
      try {
         ++field660;
         return true;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[190] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V",
      line = 3760
   )
   public final void method417(Canvas arg0) {
      try {
         ++field638;
         if (this.field678 == arg0) {
            throw new RuntimeException();
         } else if (this.field553.containsKey(arg0)) {
            Long var2 = (Long)this.field553.get(arg0);
            this.field595.releaseSurface(arg0, var2);
            this.field553.remove(arg0);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[164] + (arg0 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(BLgfa;)V",
      line = 3778
   )
   public final void method418(byte arg0, class781 arg1) {
      try {
         if (arg0 != 2) {
            this.method325(39, -5, -121, -43);
         }

         ++field545;
         if (~this.field733 <= -1 && this.field739[this.field733] == arg1) {
            this.field739[this.field733--] = null;
            arg1.method940(true);
            if (this.field733 < 0) {
               this.field735 = null;
            } else {
               this.field735 = this.field739[this.field733];
               this.field735.method945((byte)56);
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[108] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(ILgfa;)V",
      line = 3804
   )
   public final void method419(int arg0, class781 arg1) {
      try {
         ++field533;
         if (this.field731 >= 0 && this.field737[this.field731] == arg1) {
            this.field737[this.field731--] = null;
            if (arg0 != 8192) {
               this.field764 = 95;
            }

            arg1.method928((byte)-95);
            if (this.field731 >= 0) {
               this.field734 = this.field737[this.field731];
               this.field734.method944(22927);
            } else {
               this.field734 = null;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[125] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(III)V",
      line = 3827
   )
   public final synchronized void method420(int arg0, int arg1, int arg2) {
      try {
         ++field560;
         if (arg0 != 1) {
            this.field814 = -29;
         }

         class459 var4 = new class459(arg1);
         var4.field347 = (long)arg2;
         this.field745.method2585(var4, 122);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[90] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "GA",
      descriptor = "(I)V",
      line = 3841
   )
   public final void method421(int arg0) {
      try {
         this.method288(-3, 0);
         ++field653;
         OpenGL.glClearColor((float)(16711680 & arg0) / 1.671168E7F, (float)(65280 & arg0) / 65280.0F, (float)(255 & arg0) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[29] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "(B)V",
      line = 3857
   )
   private final void method422(byte arg0) {
      try {
         if (arg0 >= -85) {
            this.field720 = 113;
         }

         this.field806 = (float)(this.field798 - this.field861);
         this.field866 = (float)(-this.field800 + this.field815);
         ++field599;
         this.field841 = (float)(-this.field800 + this.field820);
         this.field786 = (float)(-this.field861 + this.field828);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[130] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(BLjia;Ljia;Ljia;Ljia;)V",
      line = 3871
   )
   public final void method423(byte arg0, class642 arg1, class642 arg2, class642 arg3, class642 arg4) {
      boolean var6 = client.field4564;

      try {
         label61: {
            ++field689;
            if (arg4 == null) {
               OpenGL.glDisableClientState(32884);
               if (!var6) {
                  break label61;
               }
            }

            this.method313(arg4.field9358, (byte)-75);
            OpenGL.glVertexPointer(arg4.field9359, arg4.field9355, this.field812.method794((byte)84), this.field812.method796(false) - -((long)arg4.field9357));
            OpenGL.glEnableClientState(32884);
         }

         label56: {
            int var7 = 54 % ((-40 - arg0) / 36);
            if (arg3 == null) {
               OpenGL.glDisableClientState(32885);
               if (!var6) {
                  break label56;
               }
            }

            this.method313(arg3.field9358, (byte)-84);
            OpenGL.glNormalPointer(arg3.field9355, this.field812.method794((byte)110), this.field812.method796(false) - -((long)arg3.field9357));
            OpenGL.glEnableClientState(32885);
         }

         label51: {
            if (arg1 != null) {
               this.method313(arg1.field9358, (byte)-100);
               OpenGL.glColorPointer(arg1.field9359, arg1.field9355, this.field812.method794((byte)113), this.field812.method796(false) + (long)arg1.field9357);
               OpenGL.glEnableClientState(32886);
               if (!var6) {
                  break label51;
               }
            }

            OpenGL.glDisableClientState(32886);
         }

         if (arg2 == null) {
            OpenGL.glDisableClientState(32888);
         } else {
            this.method313(arg2.field9358, (byte)47);
            OpenGL.glTexCoordPointer(arg2.field9359, arg2.field9355, this.field812.method794((byte)75), this.field812.method796(false) - -((long)arg2.field9357));
            OpenGL.glEnableClientState(32888);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field879[17] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ',' + (arg2 != null ? field879[6] : field879[7]) + ',' + (arg3 != null ? field879[6] : field879[7]) + ',' + (arg4 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "L",
      descriptor = "(III)V",
      line = 3920
   )
   public final void method424(int arg0, int arg1, int arg2) {
      try {
         ++field636;
         if (~this.field797 != ~arg0 || this.field842 != arg1 || ~this.field839 != ~arg2) {
            this.field839 = arg2;
            this.field797 = arg0;
            this.field842 = arg1;
            this.method290(-127);
            this.method397(32668);
         }

      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[224] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "Q",
      descriptor = "(IIIIII[BII)V",
      line = 3941
   )
   public final void method425(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         float var10;
         float var11;
         label36: {
            ++field588;
            if (this.field868 == null || ~arg2 < ~this.field868.field3926 || ~arg3 < ~this.field868.field3928) {
               this.field868 = class690.method5026(95, this, arg3, 6406, arg6, 6406, arg2, false);
               this.field868.method2195(false, (byte)-59, false);
               var10 = this.field868.field9234;
               var11 = this.field868.field9233;
               if (!client.field4564) {
                  break label36;
               }
            }

            this.field868.method2198(0, arg2, 0, arg6, 6406, 116, false, 0, arg3, 0);
            var10 = (float)arg3 * this.field868.field9234 / (float)this.field868.field3928;
            var11 = (float)arg2 * this.field868.field9233 / (float)this.field868.field3926;
         }

         this.method430(2);
         this.method252(this.field868, (byte)-40);
         this.method288(-3, arg8);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         this.method284(-31405, arg5);
         this.method314(34165, 123, 34165);
         this.method262(0, 768, 8960, 34166);
         this.method262(2, 770, 8960, 5890);
         this.method387(0, 34184, 34166, 770);
         this.method387(2, 34184, 5890, 770);
         float var12 = (float)arg0;
         float var13 = (float)arg1;
         float var14 = (float)arg2 + var12;
         float var15 = (float)arg3 + var13;
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f(0.0F, 0.0F);
         OpenGL.glVertex2f(var12, var13);
         OpenGL.glTexCoord2f(0.0F, var11);
         OpenGL.glVertex2f(var12, var15);
         OpenGL.glTexCoord2f(var10, var11);
         OpenGL.glVertex2f(var14, var15);
         OpenGL.glTexCoord2f(var10, 0.0F);
         OpenGL.glVertex2f(var14, var13);
         OpenGL.glEnd();
         this.method262(0, 768, 8960, 5890);
         this.method262(2, 770, 8960, 34166);
         this.method387(0, 34184, 5890, 770);
         this.method387(2, 34184, 34166, 770);
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field879[133] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field879[6] : field879[7]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIIIIII)V",
      line = 3998
   )
   public final void method426(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var10 = client.field4564;

      try {
         ++field664;
         if (~arg0 != ~arg2 || arg1 != arg3) {
            float var14;
            float var15;
            float var16;
            float var17;
            float var18;
            float var19;
            float var20;
            float var21;
            label79: {
               this.method366(256);
               this.method288(-3, arg5);
               float var11 = (float)(-arg0) + (float)arg2;
               float var12 = (float)arg3 - (float)arg1;
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               int var28 = arg8 % (arg6 + arg7);
               var14 = var12 * var13;
               var15 = var11 * var13;
               var16 = (float)arg6 * var15;
               var17 = (float)arg6 * var14;
               var18 = 0.0F;
               var19 = 0.0F;
               var20 = var16;
               var21 = var17;
               if (var28 <= arg6) {
                  var21 = (float)(-var28 + arg6) * var14;
                  var20 = (float)(-var28 + arg6) * var15;
                  if (!var10) {
                     break label79;
                  }
               }

               var18 = (float)(arg6 - var28 + arg7) * var15;
               var19 = (float)(arg6 + arg7 + -var28) * var14;
            }

            float var22 = (float)arg0 + 0.35F + var18;
            float var23 = (float)arg1 + 0.35F + var19;
            float var24 = (float)arg7 * var15;
            float var25 = (float)arg7 * var14;

            do {
               label86: {
                  int var10000;
                  label70: {
                     if (~arg2 < ~arg0) {
                        float var29;
                        var10000 = (var29 = var22 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                        if (var10) {
                           break label70;
                        }

                        if (var10000 > 0) {
                           break;
                        }

                        if (!((float)arg2 < var20 + var22)) {
                           break label86;
                        }

                        var20 = (float)arg2 + -var22;
                        if (!var10) {
                           break label86;
                        }
                     }

                     float var30;
                     var10000 = (var30 = var22 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var30 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     break;
                  }

                  if ((float)arg2 > var20 + var22) {
                     var20 = (float)arg2 - var22;
                  }
               }

               label88: {
                  if (~arg1 <= ~arg3) {
                     if ((float)arg3 + 0.35F > var23) {
                        break;
                     }

                     if (!((float)arg3 > var21 + var23)) {
                        break label88;
                     }

                     var21 = (float)arg3 - var23;
                     if (!var10) {
                        break label88;
                     }
                  }

                  if (var23 > (float)arg3 + 0.35F) {
                     break;
                  }

                  if (var21 + var23 > (float)arg3) {
                     var21 = (float)arg3 + -var23;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glVertex2f(var22, var23);
               OpenGL.glVertex2f(var20 + var22, var21 + var23);
               OpenGL.glEnd();
               var23 += var21 + var25;
               var22 += var20 + var24;
               var20 = var16;
               var21 = var17;
            } while(!var10);

         }
      } catch (RuntimeException var27) {
         throw class608.method4462(var27, field879[101] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIII)V",
      line = 4109
   )
   public final void method427(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field552;
         this.field711.method2649(arg0, arg3, arg1, arg2, true);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[87] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lgfa;B)V",
      line = 4122
   )
   public final void method428(class781 arg0, byte arg1) {
      try {
         if (arg1 > -104) {
            this.field770 = null;
         }

         ++field605;
         if (this.field775) {
            this.method382(1921197656, arg0);
            this.method298(1024, arg0);
         } else if (~this.field738 <= -4) {
            throw new RuntimeException();
         } else {
            if (~this.field738 <= -1) {
               this.field740[this.field738].method938((byte)-23);
            }

            this.field734 = this.field735 = this.field740[++this.field738] = arg0;
            this.field734.method949(27987);
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[191] + (arg0 != null ? field879[6] : field879[7]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "DA",
      descriptor = "(IIII)V",
      line = 4150
   )
   public final void method429(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field834 = arg3;
         ++field695;
         this.field803 = arg2;
         this.field861 = arg0;
         this.field800 = arg1;
         this.method283(30728);
         this.method422((byte)-93);
         if (this.field855 == 3) {
            this.method434(true);
         } else if (this.field855 == 2) {
            this.method332(2912);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field879[59] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "v",
      descriptor = "(I)V",
      line = 4173
   )
   public final void method430(int arg0) {
      try {
         ++field663;
         if (this.field754 != arg0) {
            this.method331(9);
            this.method360(false, (byte)124);
            this.method282(false, -8);
            this.method443(false, (byte)14);
            this.method440((byte)95, false);
            this.method335(0, -2);
            this.field754 = 2;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[214] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "h",
      descriptor = "(II)I",
      line = 4194
   )
   public final int method431(int arg0, int arg1) {
      try {
         ++field679;
         if (~arg0 != -5122 && ~arg0 != -5121) {
            if (arg0 != 5123 && arg0 != 5122) {
               if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
                  if (arg1 != -5125) {
                     return -84;
                  } else {
                     throw new IllegalArgumentException("");
                  }
               } else {
                  return 4;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[38] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "o",
      descriptor = "()Ldfa;",
      line = 4216
   )
   public final class173 method432() {
      try {
         ++field537;
         return new class558();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[94] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "n",
      descriptor = "()V",
      line = 4227
   )
   public final void method433() {
      try {
         ++field681;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[106] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "(Z)V",
      line = 4235
   )
   private final void method434(boolean arg0) {
      try {
         if (arg0) {
            ++field643;
            float var2 = (float)(-this.field861) * this.field781 / (float)this.field803;
            float var3 = (float)(-this.field800) * this.field781 / (float)this.field834;
            float var4 = (float)(-this.field861 + this.field665) * this.field781 / (float)this.field803;
            float var5 = (float)(-this.field800 + this.field546) * this.field781 / (float)this.field834;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
               OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field829, (double)this.field827);
            }

            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field879[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(ZLpga;)V",
      line = 4260
   )
   public final void method435(boolean arg0, class558 arg1) {
      try {
         OpenGL.glPushMatrix();
         if (!arg0) {
            this.field839 = 25;
         }

         ++field524;
         OpenGL.glMultMatrixf(arg1.method4160(0), 0);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[45] + arg0 + ',' + (arg1 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "D",
      descriptor = "(I)V",
      line = 4273
   )
   public final void method436(int arg0) {
      try {
         ++field512;
         OpenGL.glPushMatrix();
         if (arg0 < 27) {
            this.method339(-89);
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[113] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "XA",
      descriptor = "()I",
      line = 4284
   )
   public final int method437() {
      try {
         ++field690;
         return this.field827;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[170] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "q",
      descriptor = "()V",
      line = 4296
   )
   public final void method438() {
      try {
         this.field711.method2645(20271);
         ++field602;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field879[12] + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "x",
      descriptor = "(I)V",
      line = 4309
   )
   private final void method439(int arg0) {
      try {
         if (arg0 != 5890) {
            this.field705 = null;
         }

         if (this.field772) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field772 = false;
         }

         ++field514;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(BZ)V",
      line = 4331
   )
   public final void method440(byte arg0, boolean arg1) {
      try {
         int var3 = -78 % ((31 - arg0) / 37);
         ++field582;
         if (this.field751 != arg1) {
            this.field751 = arg1;
            this.method399(true);
            this.field754 &= -32;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field879[150] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Lpa;Lpa;FLpa;)Lpa;",
      line = 4348
   )
   public final class386 method441(class386 arg0, class386 arg1, float arg2, class386 arg3) {
      try {
         ++field573;
         if (arg0 != null && arg1 != null && this.field769 && this.field771) {
            class477 var5 = null;
            class119 var6 = (class119)arg0;
            class119 var7 = (class119)arg1;
            class14 var8 = var6.method1128(-24197);
            class14 var9 = var7.method1128(-24197);
            if (var8 != null && var9 != null) {
               int var10 = var9.field196 >= var8.field196 ? var9.field196 : var8.field196;
               if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class477) {
                  class477 var11 = (class477)arg3;
                  if (~var11.method3614(-128) == ~var10) {
                     var5 = var11;
                  }
               }

               if (var5 == null) {
                  var5 = new class477(this, var10);
               }

               if (var5.method3613((byte)-105, arg2, var9, var8)) {
                  return var5;
               }
            }
         }

         return arg2 < 0.5F ? arg0 : arg1;
      } catch (RuntimeException var13) {
         throw class608.method4462(var13, field879[195] + (arg0 != null ? field879[6] : field879[7]) + ',' + (arg1 != null ? field879[6] : field879[7]) + ',' + arg2 + ',' + (arg3 != null ? field879[6] : field879[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "h",
      descriptor = "(I)V",
      line = 4395
   )
   public final void method442(int arg0) {
      try {
         ++field515;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field879[148] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(ZB)V",
      line = 4413
   )
   public final void method443(boolean arg0, byte arg1) {
      try {
         if (arg1 != 14) {
            this.field761 = null;
         }

         if (!arg0 != !this.field756) {
            label30: {
               if (!arg0) {
                  OpenGL.glDisable(2929);
                  if (!client.field4564) {
                     break label30;
                  }
               }

               OpenGL.glEnable(2929);
            }

            this.field754 &= -32;
            this.field756 = arg0;
         }

         ++field581;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field879[163] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "g",
      descriptor = "(I)V",
      line = 4443
   )
   public final synchronized void method444(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field521;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var3 = 0;
         int var10000;
         if (var2 || !this.field745.method2574(-74)) {
            do {
               class459 var4 = (class459)this.field745.method2577(true);
               class363.field5415[var3++] = (int)var4.field347;
               this.field742 -= var4.field6727;
               var10000 = var3;

               while(var10000 == 1000) {
                  OpenGL.glDeleteBuffersARB(var3, class363.field5415, 0);
                  var10000 = 0;
                  if (!var2) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field745.method2574(-74));
         }

         class459 var5;
         class459 var6;
         class459 var7;
         boolean var8;
         class459 var9;
         class22 var10;
         class22 var11;
         class459 var12;
         byte var16;
         class35 var18;
         if (var3 > 0) {
            OpenGL.glDeleteBuffersARB(var3, class363.field5415, 0);
            var3 = 0;
            if (var2) {
               var5 = (class459)this.field746.method2577(true);
               class363.field5415[var3++] = (int)var5.field347;
               this.field744 -= var5.field6727;
               var10000 = var3;
            } else {
               if (this.field746.method2574(-75)) {
                  label687: {
                     if (var3 > 0) {
                        OpenGL.glDeleteTextures(var3, class363.field5415, 0);
                        var3 = 0;
                        if (var2) {
                           var6 = (class459)this.field747.method2577(true);
                           class363.field5415[var3++] = var6.field6727;
                           var10000 = var3;
                        } else {
                           if (this.field747.method2574(-106)) {
                              break label687;
                           }

                           var6 = (class459)this.field747.method2577(true);
                           class363.field5415[var3++] = var6.field6727;
                           var10000 = var3;
                        }
                     } else {
                        if (this.field747.method2574(-106)) {
                           break label687;
                        }

                        var6 = (class459)this.field747.method2577(true);
                        class363.field5415[var3++] = var6.field6727;
                        var10000 = var3;
                     }

                     while(true) {
                        while(var10000 == 1000) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class363.field5415, 0);
                           var10000 = 0;
                           if (!var2) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field747.method2574(-106)) {
                           break;
                        }

                        var6 = (class459)this.field747.method2577(true);
                        class363.field5415[var3++] = var6.field6727;
                        var10000 = var3;
                     }
                  }

                  if (~var3 < -1) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class363.field5415, 0);
                     var16 = 0;
                     if (var2) {
                        var7 = (class459)this.field748.method2577(true);
                        var3 = var16 + 1;
                        class363.field5415[var16] = (int)var7.field347;
                        this.field741 -= var7.field6727;
                        var10000 = var3;
                     } else {
                        if (this.field748.method2574(-67)) {
                           label745: {
                              if (~var16 < -1) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class363.field5415, 0);
                                 var8 = false;
                                 if (!var2 && this.field743.method2574(-109)) {
                                    break label745;
                                 }
                              } else if (this.field743.method2574(-109)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class459)this.field743.method2577(true);
                                 OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                              } while(!this.field743.method2574(-109));
                           }

                           if (var2) {
                              var10 = this.field749.method2577(true);
                              OpenGL.glDeleteProgramARB((int)var10.field347);
                           }

                           while(!this.field749.method2574(-118)) {
                              var10 = this.field749.method2577(true);
                              OpenGL.glDeleteProgramARB((int)var10.field347);
                           }

                           if (var2 || !this.field750.method2574(-99)) {
                              do {
                                 var11 = this.field750.method2577(true);
                                 OpenGL.glDeleteObjectARB(var11.field347);
                              } while(!this.field750.method2574(-99));
                           }

                           if (var2) {
                              var12 = (class459)this.field743.method2577(true);
                              OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                           }

                           while(true) {
                              if (this.field743.method2574(-89)) {
                                 this.field719.method3234((byte)110);
                                 var18 = this;
                                 if (!var2) {
                                    if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                       System.gc();
                                       this.field755 = class57.method650(91);
                                    }

                                    this.field728 = var15;
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class459)var18.field743.method2577(true);
                              OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                           }
                        }

                        var7 = (class459)this.field748.method2577(true);
                        var3 = var16 + 1;
                        class363.field5415[var16] = (int)var7.field347;
                        this.field741 -= var7.field6727;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field748.method2574(-67)) {
                        label831: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                              var8 = false;
                              if (!var2 && this.field743.method2574(-109)) {
                                 break label831;
                              }
                           } else if (this.field743.method2574(-109)) {
                              break label831;
                           }

                           do {
                              var9 = (class459)this.field743.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field743.method2574(-109));
                        }

                        if (var2) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field749.method2574(-118)) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field750.method2574(-99)) {
                           do {
                              var11 = this.field750.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field750.method2574(-99));
                        }

                        if (var2) {
                           var12 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field743.method2574(-89)) {
                              this.field719.method3234((byte)110);
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                    System.gc();
                                    this.field755 = class57.method650(91);
                                 }

                                 this.field728 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field748.method2577(true);
                     class363.field5415[var3++] = (int)var7.field347;
                     this.field741 -= var7.field6727;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field748.method2574(-67)) {
                        label930: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                              var8 = false;
                              if (!var2 && this.field743.method2574(-109)) {
                                 break label930;
                              }
                           } else if (this.field743.method2574(-109)) {
                              break label930;
                           }

                           do {
                              var9 = (class459)this.field743.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field743.method2574(-109));
                        }

                        if (var2) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field749.method2574(-118)) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field750.method2574(-99)) {
                           do {
                              var11 = this.field750.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field750.method2574(-99));
                        }

                        if (var2) {
                           var12 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field743.method2574(-89)) {
                              this.field719.method3234((byte)110);
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                    System.gc();
                                    this.field755 = class57.method650(91);
                                 }

                                 this.field728 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field748.method2577(true);
                     class363.field5415[var3++] = (int)var7.field347;
                     this.field741 -= var7.field6727;
                     var10000 = var3;
                  }
               }

               var5 = (class459)this.field746.method2577(true);
               class363.field5415[var3++] = (int)var5.field347;
               this.field744 -= var5.field6727;
               var10000 = var3;
            }
         } else {
            if (this.field746.method2574(-75)) {
               label357: {
                  if (var3 > 0) {
                     OpenGL.glDeleteTextures(var3, class363.field5415, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class459)this.field747.method2577(true);
                        class363.field5415[var3++] = var6.field6727;
                        var10000 = var3;
                     } else {
                        if (this.field747.method2574(-106)) {
                           break label357;
                        }

                        var6 = (class459)this.field747.method2577(true);
                        class363.field5415[var3++] = var6.field6727;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field747.method2574(-106)) {
                        break label357;
                     }

                     var6 = (class459)this.field747.method2577(true);
                     class363.field5415[var3++] = var6.field6727;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class363.field5415, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field747.method2574(-106)) {
                        break;
                     }

                     var6 = (class459)this.field747.method2577(true);
                     class363.field5415[var3++] = var6.field6727;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class363.field5415, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class459)this.field748.method2577(true);
                     var3 = var16 + 1;
                     class363.field5415[var16] = (int)var7.field347;
                     this.field741 -= var7.field6727;
                     var10000 = var3;
                  } else {
                     if (this.field748.method2574(-67)) {
                        label415: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class363.field5415, 0);
                              var8 = false;
                              if (!var2 && this.field743.method2574(-109)) {
                                 break label415;
                              }
                           } else if (this.field743.method2574(-109)) {
                              break label415;
                           }

                           do {
                              var9 = (class459)this.field743.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field743.method2574(-109));
                        }

                        if (var2) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field749.method2574(-118)) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field750.method2574(-99)) {
                           do {
                              var11 = this.field750.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field750.method2574(-99));
                        }

                        if (var2) {
                           var12 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field743.method2574(-89)) {
                              this.field719.method3234((byte)110);
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                    System.gc();
                                    this.field755 = class57.method650(91);
                                 }

                                 this.field728 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field748.method2577(true);
                     var3 = var16 + 1;
                     class363.field5415[var16] = (int)var7.field347;
                     this.field741 -= var7.field6727;
                     var10000 = var3;
                  }
               } else {
                  if (this.field748.method2574(-67)) {
                     label501: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                           var8 = false;
                           if (!var2 && this.field743.method2574(-109)) {
                              break label501;
                           }
                        } else if (this.field743.method2574(-109)) {
                           break label501;
                        }

                        do {
                           var9 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field743.method2574(-109));
                     }

                     if (var2) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field749.method2574(-118)) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field750.method2574(-99)) {
                        do {
                           var11 = this.field750.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field750.method2574(-99));
                     }

                     if (var2) {
                        var12 = (class459)this.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field743.method2574(-89)) {
                           this.field719.method3234((byte)110);
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                 System.gc();
                                 this.field755 = class57.method650(91);
                              }

                              this.field728 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field748.method2577(true);
                  class363.field5415[var3++] = (int)var7.field347;
                  this.field741 -= var7.field6727;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field748.method2574(-67)) {
                     label600: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                           var8 = false;
                           if (!var2 && this.field743.method2574(-109)) {
                              break label600;
                           }
                        } else if (this.field743.method2574(-109)) {
                           break label600;
                        }

                        do {
                           var9 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field743.method2574(-109));
                     }

                     if (var2) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field749.method2574(-118)) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field750.method2574(-99)) {
                        do {
                           var11 = this.field750.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field750.method2574(-99));
                     }

                     if (var2) {
                        var12 = (class459)this.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field743.method2574(-89)) {
                           this.field719.method3234((byte)110);
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                 System.gc();
                                 this.field755 = class57.method650(91);
                              }

                              this.field728 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field748.method2577(true);
                  class363.field5415[var3++] = (int)var7.field347;
                  this.field741 -= var7.field6727;
                  var10000 = var3;
               }
            }

            var5 = (class459)this.field746.method2577(true);
            class363.field5415[var3++] = (int)var5.field347;
            this.field744 -= var5.field6727;
            var10000 = var3;
         }

         while(true) {
            while(var10000 == 1000) {
               OpenGL.glDeleteTextures(var3, class363.field5415, 0);
               var10000 = 0;
               if (!var2) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field746.method2574(-75)) {
               label137: {
                  if (var3 > 0) {
                     OpenGL.glDeleteTextures(var3, class363.field5415, 0);
                     var3 = 0;
                     if (var2) {
                        var6 = (class459)this.field747.method2577(true);
                        class363.field5415[var3++] = var6.field6727;
                        var10000 = var3;
                     } else {
                        if (this.field747.method2574(-106)) {
                           break label137;
                        }

                        var6 = (class459)this.field747.method2577(true);
                        class363.field5415[var3++] = var6.field6727;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field747.method2574(-106)) {
                        break label137;
                     }

                     var6 = (class459)this.field747.method2577(true);
                     class363.field5415[var3++] = var6.field6727;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class363.field5415, 0);
                        var10000 = 0;
                        if (!var2) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field747.method2574(-106)) {
                        break;
                     }

                     var6 = (class459)this.field747.method2577(true);
                     class363.field5415[var3++] = var6.field6727;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class363.field5415, 0);
                  var16 = 0;
                  if (var2) {
                     var7 = (class459)this.field748.method2577(true);
                     var3 = var16 + 1;
                     class363.field5415[var16] = (int)var7.field347;
                     this.field741 -= var7.field6727;
                     var10000 = var3;
                  } else {
                     if (this.field748.method2574(-67)) {
                        label237: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class363.field5415, 0);
                              var8 = false;
                              if (!var2 && this.field743.method2574(-109)) {
                                 break label237;
                              }
                           } else if (this.field743.method2574(-109)) {
                              break label237;
                           }

                           do {
                              var9 = (class459)this.field743.method2577(true);
                              OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                           } while(!this.field743.method2574(-109));
                        }

                        if (var2) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        while(!this.field749.method2574(-118)) {
                           var10 = this.field749.method2577(true);
                           OpenGL.glDeleteProgramARB((int)var10.field347);
                        }

                        if (var2 || !this.field750.method2574(-99)) {
                           do {
                              var11 = this.field750.method2577(true);
                              OpenGL.glDeleteObjectARB(var11.field347);
                           } while(!this.field750.method2574(-99));
                        }

                        if (var2) {
                           var12 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }

                        while(true) {
                           if (this.field743.method2574(-89)) {
                              this.field719.method3234((byte)110);
                              var18 = this;
                              if (!var2) {
                                 if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                    System.gc();
                                    this.field755 = class57.method650(91);
                                 }

                                 this.field728 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class459)var18.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                        }
                     }

                     var7 = (class459)this.field748.method2577(true);
                     var3 = var16 + 1;
                     class363.field5415[var16] = (int)var7.field347;
                     this.field741 -= var7.field6727;
                     var10000 = var3;
                  }
               } else {
                  if (this.field748.method2574(-67)) {
                     label150: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                           var8 = false;
                           if (!var2 && this.field743.method2574(-109)) {
                              break label150;
                           }
                        } else if (this.field743.method2574(-109)) {
                           break label150;
                        }

                        do {
                           var9 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field743.method2574(-109));
                     }

                     if (var2) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field749.method2574(-118)) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field750.method2574(-99)) {
                        do {
                           var11 = this.field750.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field750.method2574(-99));
                     }

                     if (var2) {
                        var12 = (class459)this.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field743.method2574(-89)) {
                           this.field719.method3234((byte)110);
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                 System.gc();
                                 this.field755 = class57.method650(91);
                              }

                              this.field728 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field748.method2577(true);
                  class363.field5415[var3++] = (int)var7.field347;
                  this.field741 -= var7.field6727;
                  var10000 = var3;
               }

               while(true) {
                  while(var10000 == 1000) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                     var10000 = 0;
                     if (!var2) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field748.method2574(-67)) {
                     label99: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class363.field5415, 0);
                           var8 = false;
                           if (!var2 && this.field743.method2574(-109)) {
                              break label99;
                           }
                        } else if (this.field743.method2574(-109)) {
                           break label99;
                        }

                        do {
                           var9 = (class459)this.field743.method2577(true);
                           OpenGL.glDeleteLists((int)var9.field347, var9.field6727);
                        } while(!this.field743.method2574(-109));
                     }

                     if (var2) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     while(!this.field749.method2574(-118)) {
                        var10 = this.field749.method2577(true);
                        OpenGL.glDeleteProgramARB((int)var10.field347);
                     }

                     if (var2 || !this.field750.method2574(-99)) {
                        do {
                           var11 = this.field750.method2577(true);
                           OpenGL.glDeleteObjectARB(var11.field347);
                        } while(!this.field750.method2574(-99));
                     }

                     if (var2) {
                        var12 = (class459)this.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }

                     while(true) {
                        if (this.field743.method2574(-89)) {
                           this.field719.method3234((byte)110);
                           var18 = this;
                           if (!var2) {
                              if (this.method287() > 100663296 && ~class57.method650(125) < ~(this.field755 + 60000L)) {
                                 System.gc();
                                 this.field755 = class57.method650(91);
                              }

                              this.field728 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class459)var18.field743.method2577(true);
                        OpenGL.glDeleteLists((int)var12.field347, var12.field6727);
                     }
                  }

                  var7 = (class459)this.field748.method2577(true);
                  class363.field5415[var3++] = (int)var7.field347;
                  this.field741 -= var7.field6727;
                  var10000 = var3;
               }
            }

            var5 = (class459)this.field746.method2577(true);
            class363.field5415[var3++] = (int)var5.field347;
            this.field744 -= var5.field6727;
            var10000 = var3;
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field879[218] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method445(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method446(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 38;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 102;
            break;
         case 3:
            var10005 = 116;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
