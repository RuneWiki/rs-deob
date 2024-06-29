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

@OriginalClass("client!ck")
public class class667 extends class66 {
   @OriginalMember(
      owner = "client!ck",
      name = "pc",
      descriptor = "Ljava/util/Hashtable;"
   )
   private Hashtable field9831;
   @OriginalMember(
      owner = "client!ck",
      name = "Eb",
      descriptor = "I"
   )
   public int field9890;
   @OriginalMember(
      owner = "client!ck",
      name = "ge",
      descriptor = "Lkfa;"
   )
   private class627 field9889;
   @OriginalMember(
      owner = "client!ck",
      name = "sd",
      descriptor = "Luga;"
   )
   private class218 field9896;
   @OriginalMember(
      owner = "client!ck",
      name = "Zc",
      descriptor = "Luga;"
   )
   public class218 field9897;
   @OriginalMember(
      owner = "client!ck",
      name = "xd",
      descriptor = "I"
   )
   public int field9901;
   @OriginalMember(
      owner = "client!ck",
      name = "nh",
      descriptor = "Z"
   )
   private boolean field9902;
   @OriginalMember(
      owner = "client!ck",
      name = "bf",
      descriptor = "I"
   )
   public int field9903;
   @OriginalMember(
      owner = "client!ck",
      name = "Gc",
      descriptor = "Lum;"
   )
   private class550 field9900;
   @OriginalMember(
      owner = "client!ck",
      name = "Qg",
      descriptor = "[Lkc;"
   )
   private class143[] field9907;
   @OriginalMember(
      owner = "client!ck",
      name = "Ze",
      descriptor = "I"
   )
   private int field9911;
   @OriginalMember(
      owner = "client!ck",
      name = "zg",
      descriptor = "I"
   )
   private int field9910;
   @OriginalMember(
      owner = "client!ck",
      name = "fh",
      descriptor = "I"
   )
   private int field9909;
   @OriginalMember(
      owner = "client!ck",
      name = "Wg",
      descriptor = "[Lkc;"
   )
   private class143[] field9913;
   @OriginalMember(
      owner = "client!ck",
      name = "ad",
      descriptor = "[Lkc;"
   )
   private class143[] field9914;
   @OriginalMember(
      owner = "client!ck",
      name = "Hf",
      descriptor = "Lum;"
   )
   private class550 field9916;
   @OriginalMember(
      owner = "client!ck",
      name = "kb",
      descriptor = "Lum;"
   )
   private class550 field9919;
   @OriginalMember(
      owner = "client!ck",
      name = "bg",
      descriptor = "Lum;"
   )
   private class550 field9920;
   @OriginalMember(
      owner = "client!ck",
      name = "Ae",
      descriptor = "Lum;"
   )
   private class550 field9921;
   @OriginalMember(
      owner = "client!ck",
      name = "R",
      descriptor = "Lum;"
   )
   private class550 field9922;
   @OriginalMember(
      owner = "client!ck",
      name = "fc",
      descriptor = "Lum;"
   )
   private class550 field9923;
   @OriginalMember(
      owner = "client!ck",
      name = "ef",
      descriptor = "Lum;"
   )
   private class550 field9924;
   @OriginalMember(
      owner = "client!ck",
      name = "Og",
      descriptor = "Luga;"
   )
   public class218 field9926;
   @OriginalMember(
      owner = "client!ck",
      name = "Qe",
      descriptor = "Luga;"
   )
   public class218 field9934;
   @OriginalMember(
      owner = "client!ck",
      name = "t",
      descriptor = "Luga;"
   )
   public class218 field9935;
   @OriginalMember(
      owner = "client!ck",
      name = "gb",
      descriptor = "I"
   )
   public int field9945;
   @OriginalMember(
      owner = "client!ck",
      name = "Ef",
      descriptor = "F"
   )
   public float field9955;
   @OriginalMember(
      owner = "client!ck",
      name = "Fg",
      descriptor = "I"
   )
   public int field9940;
   @OriginalMember(
      owner = "client!ck",
      name = "oc",
      descriptor = "I"
   )
   private int field9962;
   @OriginalMember(
      owner = "client!ck",
      name = "s",
      descriptor = "I"
   )
   private int field9939;
   @OriginalMember(
      owner = "client!ck",
      name = "oh",
      descriptor = "F"
   )
   private float field9956;
   @OriginalMember(
      owner = "client!ck",
      name = "W",
      descriptor = "I"
   )
   private int field9976;
   @OriginalMember(
      owner = "client!ck",
      name = "jf",
      descriptor = "I"
   )
   private int field9968;
   @OriginalMember(
      owner = "client!ck",
      name = "Cg",
      descriptor = "F"
   )
   public float field9978;
   @OriginalMember(
      owner = "client!ck",
      name = "N",
      descriptor = "Z"
   )
   private boolean field9964;
   @OriginalMember(
      owner = "client!ck",
      name = "bb",
      descriptor = "I"
   )
   public int field9983;
   @OriginalMember(
      owner = "client!ck",
      name = "oe",
      descriptor = "F"
   )
   private float field9989;
   @OriginalMember(
      owner = "client!ck",
      name = "kg",
      descriptor = "I"
   )
   private int field9960;
   @OriginalMember(
      owner = "client!ck",
      name = "We",
      descriptor = "[F"
   )
   public float[] field9987;
   @OriginalMember(
      owner = "client!ck",
      name = "id",
      descriptor = "I"
   )
   public int field9963;
   @OriginalMember(
      owner = "client!ck",
      name = "Nc",
      descriptor = "I"
   )
   private int field9936;
   @OriginalMember(
      owner = "client!ck",
      name = "U",
      descriptor = "[F"
   )
   private float[] field9952;
   @OriginalMember(
      owner = "client!ck",
      name = "C",
      descriptor = "I"
   )
   public int field9949;
   @OriginalMember(
      owner = "client!ck",
      name = "ch",
      descriptor = "[F"
   )
   private float[] field9988;
   @OriginalMember(
      owner = "client!ck",
      name = "nb",
      descriptor = "F"
   )
   public float field9948;
   @OriginalMember(
      owner = "client!ck",
      name = "Lc",
      descriptor = "I"
   )
   private int field10012;
   @OriginalMember(
      owner = "client!ck",
      name = "Fc",
      descriptor = "I"
   )
   public int field9992;
   @OriginalMember(
      owner = "client!ck",
      name = "Gb",
      descriptor = "F"
   )
   private float field9991;
   @OriginalMember(
      owner = "client!ck",
      name = "lb",
      descriptor = "F"
   )
   public float field9985;
   @OriginalMember(
      owner = "client!ck",
      name = "rf",
      descriptor = "F"
   )
   public float field10017;
   @OriginalMember(
      owner = "client!ck",
      name = "Ve",
      descriptor = "[F"
   )
   private float[] field9997;
   @OriginalMember(
      owner = "client!ck",
      name = "Qf",
      descriptor = "[F"
   )
   private float[] field9984;
   @OriginalMember(
      owner = "client!ck",
      name = "Te",
      descriptor = "I"
   )
   private int field9999;
   @OriginalMember(
      owner = "client!ck",
      name = "Fd",
      descriptor = "I"
   )
   public int field10028;
   @OriginalMember(
      owner = "client!ck",
      name = "Sf",
      descriptor = "I"
   )
   public int field10035;
   @OriginalMember(
      owner = "client!ck",
      name = "Vg",
      descriptor = "Z"
   )
   private boolean field9990;
   @OriginalMember(
      owner = "client!ck",
      name = "ld",
      descriptor = "F"
   )
   private float field10036;
   @OriginalMember(
      owner = "client!ck",
      name = "be",
      descriptor = "I"
   )
   private int field10011;
   @OriginalMember(
      owner = "client!ck",
      name = "kc",
      descriptor = "F"
   )
   public float field10022;
   @OriginalMember(
      owner = "client!ck",
      name = "dd",
      descriptor = "I"
   )
   private int field10038;
   @OriginalMember(
      owner = "client!ck",
      name = "Ab",
      descriptor = "[Llja;"
   )
   private class744[] field9986;
   @OriginalMember(
      owner = "client!ck",
      name = "Zg",
      descriptor = "F"
   )
   public float field9969;
   @OriginalMember(
      owner = "client!ck",
      name = "He",
      descriptor = "I"
   )
   public int field10024;
   @OriginalMember(
      owner = "client!ck",
      name = "Jg",
      descriptor = "I"
   )
   public int field10031;
   @OriginalMember(
      owner = "client!ck",
      name = "db",
      descriptor = "I"
   )
   public int field10003;
   @OriginalMember(
      owner = "client!ck",
      name = "mb",
      descriptor = "F"
   )
   private float field10043;
   @OriginalMember(
      owner = "client!ck",
      name = "Ce",
      descriptor = "Leja;"
   )
   public class764 field10021;
   @OriginalMember(
      owner = "client!ck",
      name = "eb",
      descriptor = "[I"
   )
   public int[] field10049;
   @OriginalMember(
      owner = "client!ck",
      name = "Rf",
      descriptor = "[B"
   )
   public byte[] field10051;
   @OriginalMember(
      owner = "client!ck",
      name = "Dc",
      descriptor = "[I"
   )
   public int[] field10050;
   @OriginalMember(
      owner = "client!ck",
      name = "Je",
      descriptor = "[I"
   )
   public int[] field10048;
   @OriginalMember(
      owner = "client!ck",
      name = "Se",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9814;
   @OriginalMember(
      owner = "client!ck",
      name = "Lg",
      descriptor = "Ljava/awt/Canvas;"
   )
   private Canvas field9709;
   @OriginalMember(
      owner = "client!ck",
      name = "wc",
      descriptor = "I"
   )
   public int field9894;
   @OriginalMember(
      owner = "client!ck",
      name = "df",
      descriptor = "Ljaggl/OpenGL;"
   )
   private OpenGL field9866;
   @OriginalMember(
      owner = "client!ck",
      name = "nf",
      descriptor = "J"
   )
   private long field9875;
   @OriginalMember(
      owner = "client!ck",
      name = "ub",
      descriptor = "J"
   )
   private long field9752;
   @OriginalMember(
      owner = "client!ck",
      name = "Qb",
      descriptor = "Z"
   )
   public boolean field10006;
   @OriginalMember(
      owner = "client!ck",
      name = "D",
      descriptor = "I"
   )
   public int field10000;
   @OriginalMember(
      owner = "client!ck",
      name = "Nf",
      descriptor = "Ljava/lang/String;"
   )
   private String field10046;
   @OriginalMember(
      owner = "client!ck",
      name = "uh",
      descriptor = "Z"
   )
   public boolean field9996;
   @OriginalMember(
      owner = "client!ck",
      name = "Ed",
      descriptor = "Z"
   )
   private boolean field9941;
   @OriginalMember(
      owner = "client!ck",
      name = "Kb",
      descriptor = "Z"
   )
   public boolean field9995;
   @OriginalMember(
      owner = "client!ck",
      name = "Mc",
      descriptor = "Z"
   )
   public boolean field9950;
   @OriginalMember(
      owner = "client!ck",
      name = "tc",
      descriptor = "Z"
   )
   public boolean field9970;
   @OriginalMember(
      owner = "client!ck",
      name = "Hb",
      descriptor = "Z"
   )
   private boolean field9982;
   @OriginalMember(
      owner = "client!ck",
      name = "cd",
      descriptor = "Ljava/lang/String;"
   )
   private String field10039;
   @OriginalMember(
      owner = "client!ck",
      name = "rd",
      descriptor = "Z"
   )
   public boolean field9957;
   @OriginalMember(
      owner = "client!ck",
      name = "Id",
      descriptor = "Z"
   )
   private boolean field9972;
   @OriginalMember(
      owner = "client!ck",
      name = "Gg",
      descriptor = "Ltfa;"
   )
   private class36 field9895;
   @OriginalMember(
      owner = "client!ck",
      name = "Xc",
      descriptor = "Luc;"
   )
   public class30 field9899;
   @OriginalMember(
      owner = "client!ck",
      name = "Ib",
      descriptor = "Lpw;"
   )
   private class734 field9892;
   @OriginalMember(
      owner = "client!ck",
      name = "Z",
      descriptor = "Lgu;"
   )
   private class606 field9891;
   @OriginalMember(
      owner = "client!ck",
      name = "yg",
      descriptor = "Lpj;"
   )
   private class156 field9893;
   @OriginalMember(
      owner = "client!ck",
      name = "Ah",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10053 = new String[]{method4858(method4857("&0~KXm")), method4858(method4857("&0~\\Xm")), method4858(method4857("&0~\\Ym")), method4858(method4857("&0~N6")), method4858(method4857("&0~]Xm")), method4858(method4857("&0~V]m")), method4858(method4857("&0~P[m")), method4858(method4857("&0~L[m")), method4858(method4857("&0~]Zm")), method4858(method4857("+.<r")), method4858(method4857(">u~0c")), method4858(method4857("&0~w6")), method4858(method4857("&0~|6")), method4858(method4857("&0~Z_m")), method4858(method4857("&0~H6")), method4858(method4857("&0~X]m")), method4858(method4857("&0~OZm")), method4858(method4857("&0~QXm")), method4858(method4857("&0~PZm")), method4858(method4857("&0~_Xm")), method4858(method4857("&0~D_m")), method4858(method4857("&0~P\\m")), method4858(method4857("&0~HXm")), method4858(method4857("&0~[_m")), method4858(method4857("&0~JZm")), method4858(method4857("&0~K[m")), method4858(method4857("&0~V6")), method4858(method4857("&0~][m")), method4858(method4857("&0~UYm")), method4858(method4857("&0~U\\m")), method4858(method4857("&0~\\\\m")), method4858(method4857("&0~V[m")), method4858(method4857("&0~R\\m")), method4858(method4857("&0~L6")), method4858(method4857("&0~N\\m")), method4858(method4857("&0~SZm")), method4858(method4857("&0~QZm")), method4858(method4857("&0~LXm")), method4858(method4857("&0~M_m")), method4858(method4857("&0~G6")), method4858(method4857("&0~YXm")), method4858(method4857("&0~\\Zm")), method4858(method4857("&0~M6")), method4858(method4857("&0~X\\m")), method4858(method4857("&0~Y\\m")), method4858(method4857("&0~H]m")), method4858(method4857("&0~N_m")), method4858(method4857("&0~I6")), method4858(method4857("&0~[]m")), method4858(method4857("&0~S\\m")), method4858(method4857("&0~[Xm")), method4858(method4857("&0~J\\m")), method4858(method4857("&0~U_m")), method4858(method4857("&0~N[m")), method4858(method4857("&0~z\u007fm")), method4858(method4857("&0~W[m")), method4858(method4857("&0~QYm")), method4858(method4857("&0~U6")), method4858(method4857("&0~T_m")), method4858(method4857("&0~I[m")), method4858(method4857("&0~g\u007fm")), method4858(method4857("&0~R6")), method4858(method4857("&0~[[m")), method4858(method4857("&0~X_m")), method4858(method4857("&0~I]m")), method4858(method4857("&0~O[m")), method4858(method4857("&0~L\\m")), method4858(method4857("&0~V\\m")), method4858(method4857("&0~ZZm")), method4858(method4857("&0~l\u007fm")), method4858(method4857("&0~KZm")), method4858(method4857("&0~T]m")), method4858(method4857("&0~Y[m")), method4858(method4857("&0~J[m")), method4858(method4857("&0~W]m")), method4858(method4857("&0~UZm")), method4858(method4857("&0~S6")), method4858(method4857("&0~R_m")), method4858(method4857("+-9zw$")), method4858(method4857("$/9")), method4858(method4857("\n+5pY\t")), method4858(method4857(",5${r")), method4858(method4857("&0~SXm")), method4858(method4857("&0~WYm")), method4858(method4857("&0~MZm")), method4858(method4857("&0~\u007f\u007fm")), method4858(method4857("&0~I_m")), method4858(method4857("&0~HZm")), method4858(method4857("&0~RXm")), method4858(method4857("&0~O6")), method4858(method4857("&0~MXm")), method4858(method4857("&0~TYm")), method4858(method4857("&0~P]m")), method4858(method4857("&0~RYm")), method4858(method4857("&0~WZm")), method4858(method4857("&0~IZm")), method4858(method4857("&0~R]m")), method4858(method4857("\u0002\u0017\u000f[F\u0011\u00046l\u007f(>2kx#>\"A|)2$")), method4858(method4857("&0~H[m")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004=kr12#\u007fs575")), method4858(method4857("')9\u007fpe+1kr")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004&{l1>(An747l\u007f(")), method4858(method4857("\u0002\u0017\u000f[F\u0011\u00046l\u007f(>2kx#>\"Aq'15}j")), method4858(method4857("\u0002\u0017\u000f[F\u0011\u0004${f1.\"{-\u0001")), method4858(method4857("(:3")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004&{l1>(A|0=6{l\u001a42t{&/")), method4858(method4857("\u0002\u0017\u000f[F\u0011\u00046l\u007f(>2kx#>\"As07$wm$6 r{")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004${f1.\"{A 5&A}*62wp ")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004${f1.\"{A#7?\u007fj")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004=kr12${f1.\"{")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004${f1.\"{A&.2{A(: ")), method4858(method4857("(23lq646j")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004${f1.\"{A7>3j\u007f+<<{")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u00046l\u007f\"65pj\u001a(8\u007fz )")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u0004&{l1>(Am-:4{l")), method4858(method4857("(>#\u007f")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u00046l\u007f\"65pj\u001a+\"qy7:=")), method4858(method4857("&0~Z]m")), method4858(method4857("-?")), method4858(method4857("7:4{q+")), method4858(method4857("6hpyl$+8w}6")), method4858(method4857("/:7yr")), method4858(method4857("&0~\"w+2$ 6")), method4858(method4857("\u0002\u0017\u000f_L\u0007\u00048\u007fr#\u00046rq$/\u000fnw=><")), method4858(method4857("/:3rw'")), method4858(method4857("&0~Y]m")), method4858(method4857("&0~XXm")), method4858(method4857("&0~WXm")), method4858(method4857("&0~NZm")), method4858(method4857("&0~L_m")), method4858(method4857("&0~Y6")), method4858(method4857("&0~J6")), method4858(method4857("&0~Q6")), method4858(method4857("&0~VYm")), method4858(method4857("&0~H_m")), method4858(method4857("&0~]6")), method4858(method4857("&0~TZm")), method4858(method4857("&0~NYm")), method4858(method4857("&0~OXm")), method4858(method4857("&0~W_m")), method4858(method4857("&0~IXm")), method4858(method4857("&0~U[m")), method4858(method4857("&0~PYm")), method4858(method4857("&0~_]m")), method4858(method4857("&0~R[m")), method4858(method4857("&0~\\]m")), method4858(method4857("&0~K_m")), method4858(method4857("&0~d\u007fm")), method4858(method4857("&0~K6")), method4858(method4857("&0~K\\m")), method4858(method4857("&0~X[m")), method4858(method4857("&0~K]m")), method4858(method4857("&0~P6")), method4858(method4857("&0~p\u007fm")), method4858(method4857("&0~VZm")), method4858(method4857("&0~\\6")), method4858(method4857("&0~\\_m")), method4858(method4857("&0~T\\m")), method4858(method4857("6>$Wy+4\"{L +1wp1")), method4858(method4857("/:&\u007f0$,$0]$5&\u007fm")), method4858(method4857("&0~_[m")), method4858(method4857("&0~r\u007fm")), method4858(method4857("&0~Q\\m")), method4858(method4857("&0~M\\m")), method4858(method4857("&0~F6")), method4858(method4857("&0~S[m")), method4858(method4857("&0~UXm")), method4858(method4857("&0~H\\m")), method4858(method4857("&0~P_m")), method4858(method4857("&0~O]m")), method4858(method4857("&0~I\\m")), method4858(method4857("&0~TXm")), method4858(method4857("&0~JXm")), method4858(method4857("&0~[Zm")), method4858(method4857("&0~l6")), method4858(method4857("&0~J_m")), method4858(method4857("&0~Z[m")), method4858(method4857("&0~ZYm")), method4858(method4857("&0~XYm")), method4858(method4857("&0~U]m")), method4858(method4857("&0~X6")), method4858(method4857("&0~SYm")), method4858(method4857("&0~_\\m")), method4858(method4857("&0~__m")), method4858(method4857("&0~[\\m")), method4858(method4857("&0~S]m")), method4858(method4857("&0~]]m")), method4858(method4857("&0~M]m")), method4858(method4857("&0~L]m")), method4858(method4857("&0~Q]m")), method4858(method4857("&0~Y_m")), method4858(method4857("&0~YZm")), method4858(method4857("&0~W\\m")), method4858(method4857("&0~F_m")), method4858(method4857("&0~]\\m")), method4858(method4857("&0~T[m")), method4858(method4857("&0~RZm")), method4858(method4857("&0~_Zm")), method4858(method4857("&0~Z6")), method4858(method4857("&0~J]m")), method4858(method4857("&0~ZXm")), method4858(method4857("&0~O_m")), method4858(method4857("&0~Q_m")), method4858(method4857("&0~[Ym")), method4858(method4857("&0~Z\\m")), method4858(method4857("\u007f{")), method4858(method4857("&0~_Ym")), method4858(method4857("&0~Q[m")), method4858(method4857("&0~T6")), method4858(method4857("&0~O\\m")), method4858(method4857("&0~]Ym")), method4858(method4857("&0~W6")), method4858(method4857("&0~f\u007fm")), method4858(method4857("&0~S_m")), method4858(method4857("&0~PXm")), method4858(method4857("&0~LZm")), method4858(method4857("&0~YYm")), method4858(method4857("&0~_6")), method4858(method4857("&0~N]m")), method4858(method4857("&0~]_m")), method4858(method4857("&0~VXm")), method4858(method4857("&0~NXm")), method4858(method4857("&0~V_m")), method4858(method4857("&0~n\u007fm")), method4858(method4857("&0~XZm")), method4858(method4857("&0~x6")), method4858(method4857("&0~M[m")), method4858(method4857("&0~\\[m")), method4858(method4857("&0~[6"))};
   @OriginalMember(
      owner = "client!ck",
      name = "zb",
      descriptor = "[I"
   )
   public static int[] field9702 = new int[2];
   @OriginalMember(
      owner = "client!ck",
      name = "fg",
      descriptor = "Lsd;"
   )
   public static class101 field9769 = new class101(81, 28);
   @OriginalMember(
      owner = "client!ck",
      name = "Uc",
      descriptor = "[I"
   )
   public static int[] field9829 = new int[]{0, 1, 2, 2, 1, 1, 2, 3, 1, 3, 3, 4, 2, 0, 4};
   @OriginalMember(
      owner = "client!ck",
      name = "mg",
      descriptor = "Z"
   )
   public static boolean field9877 = false;
   @OriginalMember(
      owner = "client!ck",
      name = "pf",
      descriptor = "F"
   )
   public float field10009;
   @OriginalMember(
      owner = "client!ck",
      name = "of",
      descriptor = "F"
   )
   private float field10014;
   @OriginalMember(
      owner = "client!ck",
      name = "ib",
      descriptor = "F"
   )
   public float field10027;
   @OriginalMember(
      owner = "client!ck",
      name = "S",
      descriptor = "F"
   )
   private float field10042;
   @OriginalMember(
      owner = "client!ck",
      name = "vc",
      descriptor = "F"
   )
   public float field9937;
   @OriginalMember(
      owner = "client!ck",
      name = "jd",
      descriptor = "F"
   )
   public float field9944;
   @OriginalMember(
      owner = "client!ck",
      name = "pg",
      descriptor = "F"
   )
   public float field9965;
   @OriginalMember(
      owner = "client!ck",
      name = "qg",
      descriptor = "F"
   )
   public float field9981;
   @OriginalMember(
      owner = "client!ck",
      name = "P",
      descriptor = "F"
   )
   private float field9993;
   @OriginalMember(
      owner = "client!ck",
      name = "B",
      descriptor = "I"
   )
   public int field10020;
   @OriginalMember(
      owner = "client!ck",
      name = "cf",
      descriptor = "I"
   )
   private int field10023;
   @OriginalMember(
      owner = "client!ck",
      name = "Ge",
      descriptor = "I"
   )
   private int field10033;
   @OriginalMember(
      owner = "client!ck",
      name = "Kg",
      descriptor = "I"
   )
   private int field10040;
   @OriginalMember(
      owner = "client!ck",
      name = "ng",
      descriptor = "I"
   )
   private int field10041;
   @OriginalMember(
      owner = "client!ck",
      name = "ae",
      descriptor = "I"
   )
   private int field10045;
   @OriginalMember(
      owner = "client!ck",
      name = "Me",
      descriptor = "I"
   )
   private int field10047;
   @OriginalMember(
      owner = "client!ck",
      name = "Tc",
      descriptor = "I"
   )
   private int field10052;
   @OriginalMember(
      owner = "client!ck",
      name = "af",
      descriptor = "I"
   )
   public static int field9682;
   @OriginalMember(
      owner = "client!ck",
      name = "Ne",
      descriptor = "I"
   )
   public static int field9683;
   @OriginalMember(
      owner = "client!ck",
      name = "hc",
      descriptor = "I"
   )
   public static int field9684;
   @OriginalMember(
      owner = "client!ck",
      name = "se",
      descriptor = "I"
   )
   public static int field9685;
   @OriginalMember(
      owner = "client!ck",
      name = "Zb",
      descriptor = "I"
   )
   public static int field9686;
   @OriginalMember(
      owner = "client!ck",
      name = "wd",
      descriptor = "I"
   )
   public static int field9687;
   @OriginalMember(
      owner = "client!ck",
      name = "kf",
      descriptor = "I"
   )
   public static int field9688;
   @OriginalMember(
      owner = "client!ck",
      name = "bh",
      descriptor = "I"
   )
   public static int field9689;
   @OriginalMember(
      owner = "client!ck",
      name = "wb",
      descriptor = "I"
   )
   public static int field9690;
   @OriginalMember(
      owner = "client!ck",
      name = "od",
      descriptor = "I"
   )
   public static int field9691;
   @OriginalMember(
      owner = "client!ck",
      name = "Hd",
      descriptor = "I"
   )
   public static int field9692;
   @OriginalMember(
      owner = "client!ck",
      name = "qe",
      descriptor = "I"
   )
   public static int field9693;
   @OriginalMember(
      owner = "client!ck",
      name = "K",
      descriptor = "I"
   )
   public static int field9694;
   @OriginalMember(
      owner = "client!ck",
      name = "Cf",
      descriptor = "I"
   )
   public static int field9695;
   @OriginalMember(
      owner = "client!ck",
      name = "Sd",
      descriptor = "I"
   )
   public static int field9696;
   @OriginalMember(
      owner = "client!ck",
      name = "uc",
      descriptor = "I"
   )
   public static int field9697;
   @OriginalMember(
      owner = "client!ck",
      name = "w",
      descriptor = "I"
   )
   public static int field9698;
   @OriginalMember(
      owner = "client!ck",
      name = "cb",
      descriptor = "I"
   )
   public static int field9699;
   @OriginalMember(
      owner = "client!ck",
      name = "lf",
      descriptor = "I"
   )
   public static int field9700;
   @OriginalMember(
      owner = "client!ck",
      name = "Ig",
      descriptor = "I"
   )
   public static int field9701;
   @OriginalMember(
      owner = "client!ck",
      name = "Vf",
      descriptor = "I"
   )
   public static int field9703;
   @OriginalMember(
      owner = "client!ck",
      name = "Kd",
      descriptor = "I"
   )
   public static int field9704;
   @OriginalMember(
      owner = "client!ck",
      name = "Oe",
      descriptor = "I"
   )
   public static int field9705;
   @OriginalMember(
      owner = "client!ck",
      name = "Rg",
      descriptor = "I"
   )
   public static int field9706;
   @OriginalMember(
      owner = "client!ck",
      name = "Ag",
      descriptor = "I"
   )
   public static int field9707;
   @OriginalMember(
      owner = "client!ck",
      name = "Uf",
      descriptor = "I"
   )
   public static int field9708;
   @OriginalMember(
      owner = "client!ck",
      name = "zc",
      descriptor = "I"
   )
   public static int field9710;
   @OriginalMember(
      owner = "client!ck",
      name = "bc",
      descriptor = "I"
   )
   public static int field9711;
   @OriginalMember(
      owner = "client!ck",
      name = "lh",
      descriptor = "I"
   )
   public static int field9712;
   @OriginalMember(
      owner = "client!ck",
      name = "vf",
      descriptor = "I"
   )
   public static int field9713;
   @OriginalMember(
      owner = "client!ck",
      name = "Le",
      descriptor = "I"
   )
   public static int field9714;
   @OriginalMember(
      owner = "client!ck",
      name = "wg",
      descriptor = "I"
   )
   public static int field9715;
   @OriginalMember(
      owner = "client!ck",
      name = "ke",
      descriptor = "I"
   )
   public static int field9716;
   @OriginalMember(
      owner = "client!ck",
      name = "Bd",
      descriptor = "I"
   )
   public static int field9717;
   @OriginalMember(
      owner = "client!ck",
      name = "Dd",
      descriptor = "I"
   )
   public static int field9718;
   @OriginalMember(
      owner = "client!ck",
      name = "hd",
      descriptor = "I"
   )
   private int field9719;
   @OriginalMember(
      owner = "client!ck",
      name = "fb",
      descriptor = "I"
   )
   public static int field9720;
   @OriginalMember(
      owner = "client!ck",
      name = "dc",
      descriptor = "I"
   )
   public static int field9721;
   @OriginalMember(
      owner = "client!ck",
      name = "Hg",
      descriptor = "I"
   )
   public static int field9722;
   @OriginalMember(
      owner = "client!ck",
      name = "Jf",
      descriptor = "I"
   )
   public static int field9723;
   @OriginalMember(
      owner = "client!ck",
      name = "Ld",
      descriptor = "I"
   )
   public static int field9724;
   @OriginalMember(
      owner = "client!ck",
      name = "yf",
      descriptor = "I"
   )
   public static int field9725;
   @OriginalMember(
      owner = "client!ck",
      name = "T",
      descriptor = "I"
   )
   public static int field9726;
   @OriginalMember(
      owner = "client!ck",
      name = "dh",
      descriptor = "I"
   )
   public static int field9727;
   @OriginalMember(
      owner = "client!ck",
      name = "Wb",
      descriptor = "I"
   )
   public static int field9728;
   @OriginalMember(
      owner = "client!ck",
      name = "Yc",
      descriptor = "I"
   )
   public static int field9729;
   @OriginalMember(
      owner = "client!ck",
      name = "qf",
      descriptor = "I"
   )
   public static int field9730;
   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "I"
   )
   public static int field9731;
   @OriginalMember(
      owner = "client!ck",
      name = "cg",
      descriptor = "I"
   )
   public int field9732;
   @OriginalMember(
      owner = "client!ck",
      name = "Ud",
      descriptor = "I"
   )
   public static int field9733;
   @OriginalMember(
      owner = "client!ck",
      name = "ih",
      descriptor = "I"
   )
   public static int field9734;
   @OriginalMember(
      owner = "client!ck",
      name = "xh",
      descriptor = "I"
   )
   public static int field9735;
   @OriginalMember(
      owner = "client!ck",
      name = "X",
      descriptor = "I"
   )
   public static int field9736;
   @OriginalMember(
      owner = "client!ck",
      name = "yd",
      descriptor = "I"
   )
   public static int field9737;
   @OriginalMember(
      owner = "client!ck",
      name = "Yg",
      descriptor = "I"
   )
   public static int field9738;
   @OriginalMember(
      owner = "client!ck",
      name = "xc",
      descriptor = "I"
   )
   public static int field9739;
   @OriginalMember(
      owner = "client!ck",
      name = "ph",
      descriptor = "I"
   )
   public static int field9740;
   @OriginalMember(
      owner = "client!ck",
      name = "ed",
      descriptor = "I"
   )
   public static int field9741;
   @OriginalMember(
      owner = "client!ck",
      name = "Qd",
      descriptor = "I"
   )
   public static int field9742;
   @OriginalMember(
      owner = "client!ck",
      name = "Bc",
      descriptor = "I"
   )
   public static int field9743;
   @OriginalMember(
      owner = "client!ck",
      name = "Yf",
      descriptor = "I"
   )
   public static int field9744;
   @OriginalMember(
      owner = "client!ck",
      name = "rh",
      descriptor = "I"
   )
   public static int field9745;
   @OriginalMember(
      owner = "client!ck",
      name = "hb",
      descriptor = "I"
   )
   public static int field9746;
   @OriginalMember(
      owner = "client!ck",
      name = "ff",
      descriptor = "I"
   )
   public static int field9747;
   @OriginalMember(
      owner = "client!ck",
      name = "Ad",
      descriptor = "I"
   )
   public static int field9748;
   @OriginalMember(
      owner = "client!ck",
      name = "zh",
      descriptor = "I"
   )
   public static int field9749;
   @OriginalMember(
      owner = "client!ck",
      name = "Cb",
      descriptor = "I"
   )
   public static int field9750;
   @OriginalMember(
      owner = "client!ck",
      name = "Qc",
      descriptor = "I"
   )
   public static int field9751;
   @OriginalMember(
      owner = "client!ck",
      name = "bd",
      descriptor = "I"
   )
   public static int field9753;
   @OriginalMember(
      owner = "client!ck",
      name = "Eg",
      descriptor = "I"
   )
   public static int field9754;
   @OriginalMember(
      owner = "client!ck",
      name = "nc",
      descriptor = "I"
   )
   public static int field9755;
   @OriginalMember(
      owner = "client!ck",
      name = "Jb",
      descriptor = "I"
   )
   public static int field9756;
   @OriginalMember(
      owner = "client!ck",
      name = "Zd",
      descriptor = "I"
   )
   public static int field9757;
   @OriginalMember(
      owner = "client!ck",
      name = "rg",
      descriptor = "I"
   )
   public static int field9758;
   @OriginalMember(
      owner = "client!ck",
      name = "I",
      descriptor = "I"
   )
   public static int field9759;
   @OriginalMember(
      owner = "client!ck",
      name = "mc",
      descriptor = "I"
   )
   public static int field9760;
   @OriginalMember(
      owner = "client!ck",
      name = "Xf",
      descriptor = "I"
   )
   public static int field9761;
   @OriginalMember(
      owner = "client!ck",
      name = "Ee",
      descriptor = "I"
   )
   public static int field9762;
   @OriginalMember(
      owner = "client!ck",
      name = "Ff",
      descriptor = "I"
   )
   public static int field9763;
   @OriginalMember(
      owner = "client!ck",
      name = "Pg",
      descriptor = "I"
   )
   public static int field9764;
   @OriginalMember(
      owner = "client!ck",
      name = "Dg",
      descriptor = "I"
   )
   public static int field9765;
   @OriginalMember(
      owner = "client!ck",
      name = "Pb",
      descriptor = "I"
   )
   public static int field9766;
   @OriginalMember(
      owner = "client!ck",
      name = "td",
      descriptor = "I"
   )
   public static int field9767;
   @OriginalMember(
      owner = "client!ck",
      name = "Ic",
      descriptor = "I"
   )
   public static int field9768;
   @OriginalMember(
      owner = "client!ck",
      name = "ce",
      descriptor = "I"
   )
   public static int field9770;
   @OriginalMember(
      owner = "client!ck",
      name = "xe",
      descriptor = "I"
   )
   public static int field9771;
   @OriginalMember(
      owner = "client!ck",
      name = "xg",
      descriptor = "I"
   )
   public static int field9772;
   @OriginalMember(
      owner = "client!ck",
      name = "Xb",
      descriptor = "I"
   )
   public static int field9773;
   @OriginalMember(
      owner = "client!ck",
      name = "ec",
      descriptor = "I"
   )
   public static int field9774;
   @OriginalMember(
      owner = "client!ck",
      name = "ye",
      descriptor = "I"
   )
   public static int field9775;
   @OriginalMember(
      owner = "client!ck",
      name = "De",
      descriptor = "I"
   )
   public static int field9776;
   @OriginalMember(
      owner = "client!ck",
      name = "ze",
      descriptor = "I"
   )
   public static int field9777;
   @OriginalMember(
      owner = "client!ck",
      name = "Mg",
      descriptor = "I"
   )
   public static int field9778;
   @OriginalMember(
      owner = "client!ck",
      name = "Sc",
      descriptor = "I"
   )
   public static int field9779;
   @OriginalMember(
      owner = "client!ck",
      name = "Gd",
      descriptor = "I"
   )
   public static int field9780;
   @OriginalMember(
      owner = "client!ck",
      name = "fd",
      descriptor = "I"
   )
   public static int field9781;
   @OriginalMember(
      owner = "client!ck",
      name = "Yd",
      descriptor = "I"
   )
   public static int field9782;
   @OriginalMember(
      owner = "client!ck",
      name = "ie",
      descriptor = "I"
   )
   public static int field9783;
   @OriginalMember(
      owner = "client!ck",
      name = "hf",
      descriptor = "I"
   )
   public static int field9784;
   @OriginalMember(
      owner = "client!ck",
      name = "Jd",
      descriptor = "I"
   )
   public static int field9785;
   @OriginalMember(
      owner = "client!ck",
      name = "Wd",
      descriptor = "I"
   )
   public static int field9786;
   @OriginalMember(
      owner = "client!ck",
      name = "wf",
      descriptor = "I"
   )
   public static int field9787;
   @OriginalMember(
      owner = "client!ck",
      name = "lc",
      descriptor = "I"
   )
   public static int field9788;
   @OriginalMember(
      owner = "client!ck",
      name = "ac",
      descriptor = "I"
   )
   public static int field9789;
   @OriginalMember(
      owner = "client!ck",
      name = "hh",
      descriptor = "I"
   )
   public static int field9790;
   @OriginalMember(
      owner = "client!ck",
      name = "Tb",
      descriptor = "I"
   )
   public static int field9791;
   @OriginalMember(
      owner = "client!ck",
      name = "mh",
      descriptor = "I"
   )
   public static int field9792;
   @OriginalMember(
      owner = "client!ck",
      name = "Df",
      descriptor = "I"
   )
   public static int field9793;
   @OriginalMember(
      owner = "client!ck",
      name = "Vd",
      descriptor = "I"
   )
   public static int field9794;
   @OriginalMember(
      owner = "client!ck",
      name = "qc",
      descriptor = "I"
   )
   public static int field9795;
   @OriginalMember(
      owner = "client!ck",
      name = "Od",
      descriptor = "I"
   )
   public static int field9796;
   @OriginalMember(
      owner = "client!ck",
      name = "Nd",
      descriptor = "I"
   )
   public static int field9797;
   @OriginalMember(
      owner = "client!ck",
      name = "de",
      descriptor = "I"
   )
   public static int field9798;
   @OriginalMember(
      owner = "client!ck",
      name = "vh",
      descriptor = "I"
   )
   public static int field9799;
   @OriginalMember(
      owner = "client!ck",
      name = "Lb",
      descriptor = "I"
   )
   public static int field9800;
   @OriginalMember(
      owner = "client!ck",
      name = "Of",
      descriptor = "I"
   )
   public static int field9801;
   @OriginalMember(
      owner = "client!ck",
      name = "zd",
      descriptor = "I"
   )
   public int field9802;
   @OriginalMember(
      owner = "client!ck",
      name = "E",
      descriptor = "I"
   )
   public static int field9803;
   @OriginalMember(
      owner = "client!ck",
      name = "hg",
      descriptor = "I"
   )
   public static int field9804;
   @OriginalMember(
      owner = "client!ck",
      name = "ne",
      descriptor = "I"
   )
   public static int field9805;
   @OriginalMember(
      owner = "client!ck",
      name = "xb",
      descriptor = "I"
   )
   public static int field9806;
   @OriginalMember(
      owner = "client!ck",
      name = "ud",
      descriptor = "I"
   )
   public static int field9807;
   @OriginalMember(
      owner = "client!ck",
      name = "Lf",
      descriptor = "I"
   )
   public static int field9808;
   @OriginalMember(
      owner = "client!ck",
      name = "Bb",
      descriptor = "I"
   )
   public static int field9809;
   @OriginalMember(
      owner = "client!ck",
      name = "vd",
      descriptor = "I"
   )
   public static int field9810;
   @OriginalMember(
      owner = "client!ck",
      name = "Ye",
      descriptor = "I"
   )
   public static int field9811;
   @OriginalMember(
      owner = "client!ck",
      name = "te",
      descriptor = "I"
   )
   public static int field9812;
   @OriginalMember(
      owner = "client!ck",
      name = "ee",
      descriptor = "I"
   )
   public static int field9813;
   @OriginalMember(
      owner = "client!ck",
      name = "xf",
      descriptor = "I"
   )
   public static int field9815;
   @OriginalMember(
      owner = "client!ck",
      name = "ig",
      descriptor = "I"
   )
   public static int field9816;
   @OriginalMember(
      owner = "client!ck",
      name = "ag",
      descriptor = "I"
   )
   public static int field9817;
   @OriginalMember(
      owner = "client!ck",
      name = "Rc",
      descriptor = "I"
   )
   public static int field9818;
   @OriginalMember(
      owner = "client!ck",
      name = "jg",
      descriptor = "I"
   )
   public static int field9819;
   @OriginalMember(
      owner = "client!ck",
      name = "Pc",
      descriptor = "I"
   )
   public static int field9820;
   @OriginalMember(
      owner = "client!ck",
      name = "H",
      descriptor = "I"
   )
   public static int field9821;
   @OriginalMember(
      owner = "client!ck",
      name = "fe",
      descriptor = "I"
   )
   public static int field9822;
   @OriginalMember(
      owner = "client!ck",
      name = "qd",
      descriptor = "I"
   )
   public static int field9823;
   @OriginalMember(
      owner = "client!ck",
      name = "th",
      descriptor = "I"
   )
   public static int field9824;
   @OriginalMember(
      owner = "client!ck",
      name = "Tf",
      descriptor = "I"
   )
   public static int field9825;
   @OriginalMember(
      owner = "client!ck",
      name = "Hc",
      descriptor = "I"
   )
   public static int field9826;
   @OriginalMember(
      owner = "client!ck",
      name = "qb",
      descriptor = "I"
   )
   public static int field9827;
   @OriginalMember(
      owner = "client!ck",
      name = "je",
      descriptor = "I"
   )
   public static int field9828;
   @OriginalMember(
      owner = "client!ck",
      name = "Vc",
      descriptor = "I"
   )
   public static int field9830;
   @OriginalMember(
      owner = "client!ck",
      name = "sg",
      descriptor = "I"
   )
   public static int field9832;
   @OriginalMember(
      owner = "client!ck",
      name = "Fb",
      descriptor = "I"
   )
   public static int field9833;
   @OriginalMember(
      owner = "client!ck",
      name = "v",
      descriptor = "I"
   )
   public static int field9834;
   @OriginalMember(
      owner = "client!ck",
      name = "sh",
      descriptor = "I"
   )
   public static int field9835;
   @OriginalMember(
      owner = "client!ck",
      name = "uf",
      descriptor = "I"
   )
   public static int field9836;
   @OriginalMember(
      owner = "client!ck",
      name = "Vb",
      descriptor = "I"
   )
   public static int field9837;
   @OriginalMember(
      owner = "client!ck",
      name = "jh",
      descriptor = "I"
   )
   public static int field9838;
   @OriginalMember(
      owner = "client!ck",
      name = "Af",
      descriptor = "I"
   )
   public static int field9839;
   @OriginalMember(
      owner = "client!ck",
      name = "Bg",
      descriptor = "I"
   )
   public static int field9840;
   @OriginalMember(
      owner = "client!ck",
      name = "Mb",
      descriptor = "I"
   )
   public static int field9841;
   @OriginalMember(
      owner = "client!ck",
      name = "If",
      descriptor = "I"
   )
   public static int field9842;
   @OriginalMember(
      owner = "client!ck",
      name = "Xg",
      descriptor = "I"
   )
   public static int field9843;
   @OriginalMember(
      owner = "client!ck",
      name = "rc",
      descriptor = "I"
   )
   public static int field9844;
   @OriginalMember(
      owner = "client!ck",
      name = "Yb",
      descriptor = "I"
   )
   public static int field9845;
   @OriginalMember(
      owner = "client!ck",
      name = "pe",
      descriptor = "I"
   )
   public static int field9846;
   @OriginalMember(
      owner = "client!ck",
      name = "F",
      descriptor = "I"
   )
   public static int field9847;
   @OriginalMember(
      owner = "client!ck",
      name = "Pf",
      descriptor = "I"
   )
   public static int field9848;
   @OriginalMember(
      owner = "client!ck",
      name = "Jc",
      descriptor = "I"
   )
   public static int field9849;
   @OriginalMember(
      owner = "client!ck",
      name = "Ob",
      descriptor = "I"
   )
   public static int field9850;
   @OriginalMember(
      owner = "client!ck",
      name = "u",
      descriptor = "I"
   )
   public static int field9851;
   @OriginalMember(
      owner = "client!ck",
      name = "eg",
      descriptor = "I"
   )
   public static int field9852;
   @OriginalMember(
      owner = "client!ck",
      name = "yb",
      descriptor = "I"
   )
   public static int field9853;
   @OriginalMember(
      owner = "client!ck",
      name = "cc",
      descriptor = "I"
   )
   public static int field9854;
   @OriginalMember(
      owner = "client!ck",
      name = "pb",
      descriptor = "I"
   )
   public static int field9855;
   @OriginalMember(
      owner = "client!ck",
      name = "Bf",
      descriptor = "I"
   )
   public static int field9856;
   @OriginalMember(
      owner = "client!ck",
      name = "y",
      descriptor = "I"
   )
   public static int field9857;
   @OriginalMember(
      owner = "client!ck",
      name = "L",
      descriptor = "I"
   )
   public static int field9858;
   @OriginalMember(
      owner = "client!ck",
      name = "ue",
      descriptor = "I"
   )
   public static int field9859;
   @OriginalMember(
      owner = "client!ck",
      name = "Cc",
      descriptor = "I"
   )
   public static int field9860;
   @OriginalMember(
      owner = "client!ck",
      name = "yc",
      descriptor = "I"
   )
   public static int field9861;
   @OriginalMember(
      owner = "client!ck",
      name = "M",
      descriptor = "I"
   )
   public static int field9862;
   @OriginalMember(
      owner = "client!ck",
      name = "gc",
      descriptor = "I"
   )
   public static int field9863;
   @OriginalMember(
      owner = "client!ck",
      name = "rb",
      descriptor = "I"
   )
   public static int field9864;
   @OriginalMember(
      owner = "client!ck",
      name = "tg",
      descriptor = "I"
   )
   public static int field9865;
   @OriginalMember(
      owner = "client!ck",
      name = "kh",
      descriptor = "I"
   )
   public static int field9867;
   @OriginalMember(
      owner = "client!ck",
      name = "ob",
      descriptor = "I"
   )
   public static int field9868;
   @OriginalMember(
      owner = "client!ck",
      name = "mf",
      descriptor = "I"
   )
   public static int field9869;
   @OriginalMember(
      owner = "client!ck",
      name = "Sb",
      descriptor = "I"
   )
   public static int field9870;
   @OriginalMember(
      owner = "client!ck",
      name = "Pe",
      descriptor = "I"
   )
   public static int field9871;
   @OriginalMember(
      owner = "client!ck",
      name = "eh",
      descriptor = "I"
   )
   public static int field9872;
   @OriginalMember(
      owner = "client!ck",
      name = "Ke",
      descriptor = "I"
   )
   public static int field9873;
   @OriginalMember(
      owner = "client!ck",
      name = "jb",
      descriptor = "I"
   )
   public static int field9874;
   @OriginalMember(
      owner = "client!ck",
      name = "tf",
      descriptor = "I"
   )
   public static int field9876;
   @OriginalMember(
      owner = "client!ck",
      name = "Nb",
      descriptor = "I"
   )
   public static int field9878;
   @OriginalMember(
      owner = "client!ck",
      name = "Zf",
      descriptor = "I"
   )
   public static int field9879;
   @OriginalMember(
      owner = "client!ck",
      name = "vb",
      descriptor = "I"
   )
   public static int field9880;
   @OriginalMember(
      owner = "client!ck",
      name = "Y",
      descriptor = "I"
   )
   public static int field9881;
   @OriginalMember(
      owner = "client!ck",
      name = "Kf",
      descriptor = "I"
   )
   public static int field9882;
   @OriginalMember(
      owner = "client!ck",
      name = "Td",
      descriptor = "I"
   )
   public static int field9883;
   @OriginalMember(
      owner = "client!ck",
      name = "zf",
      descriptor = "I"
   )
   public static int field9884;
   @OriginalMember(
      owner = "client!ck",
      name = "Wf",
      descriptor = "I"
   )
   public static int field9885;
   @OriginalMember(
      owner = "client!ck",
      name = "Cd",
      descriptor = "I"
   )
   public static int field9886;
   @OriginalMember(
      owner = "client!ck",
      name = "re",
      descriptor = "I"
   )
   private int field9887;
   @OriginalMember(
      owner = "client!ck",
      name = "sb",
      descriptor = "I"
   )
   public static int field9888;
   @OriginalMember(
      owner = "client!ck",
      name = "Ub",
      descriptor = "I"
   )
   public int field9898;
   @OriginalMember(
      owner = "client!ck",
      name = "og",
      descriptor = "I"
   )
   public int field9915;
   @OriginalMember(
      owner = "client!ck",
      name = "ve",
      descriptor = "I"
   )
   public int field9917;
   @OriginalMember(
      owner = "client!ck",
      name = "Ec",
      descriptor = "I"
   )
   private int field9918;
   @OriginalMember(
      owner = "client!ck",
      name = "Tg",
      descriptor = "I"
   )
   private int field9925;
   @OriginalMember(
      owner = "client!ck",
      name = "Sg",
      descriptor = "I"
   )
   private int field9927;
   @OriginalMember(
      owner = "client!ck",
      name = "ab",
      descriptor = "I"
   )
   private int field9933;
   @OriginalMember(
      owner = "client!ck",
      name = "yh",
      descriptor = "I"
   )
   private int field9947;
   @OriginalMember(
      owner = "client!ck",
      name = "O",
      descriptor = "I"
   )
   public int field9951;
   @OriginalMember(
      owner = "client!ck",
      name = "Ac",
      descriptor = "I"
   )
   public int field9953;
   @OriginalMember(
      owner = "client!ck",
      name = "gf",
      descriptor = "I"
   )
   private int field9966;
   @OriginalMember(
      owner = "client!ck",
      name = "Md",
      descriptor = "I"
   )
   public int field9977;
   @OriginalMember(
      owner = "client!ck",
      name = "gh",
      descriptor = "I"
   )
   private int field9980;
   @OriginalMember(
      owner = "client!ck",
      name = "Db",
      descriptor = "J"
   )
   private long field9930;
   @OriginalMember(
      owner = "client!ck",
      name = "Ng",
      descriptor = "Liv;"
   )
   public class105 field10010;
   @OriginalMember(
      owner = "client!ck",
      name = "dg",
      descriptor = "Liv;"
   )
   private class105 field9908;
   @OriginalMember(
      owner = "client!ck",
      name = "Ug",
      descriptor = "Lkc;"
   )
   private class143 field9905;
   @OriginalMember(
      owner = "client!ck",
      name = "we",
      descriptor = "Lkc;"
   )
   private class143 field9906;
   @OriginalMember(
      owner = "client!ck",
      name = "he",
      descriptor = "Llf;"
   )
   public class247 field10005;
   @OriginalMember(
      owner = "client!ck",
      name = "lg",
      descriptor = "Llf;"
   )
   public class247 field10013;
   @OriginalMember(
      owner = "client!ck",
      name = "gd",
      descriptor = "Llf;"
   )
   public class247 field10019;
   @OriginalMember(
      owner = "client!ck",
      name = "me",
      descriptor = "Llf;"
   )
   public class247 field10030;
   @OriginalMember(
      owner = "client!ck",
      name = "ah",
      descriptor = "Llf;"
   )
   public class247 field10044;
   @OriginalMember(
      owner = "client!ck",
      name = "qh",
      descriptor = "Llf;"
   )
   public class247 field9946;
   @OriginalMember(
      owner = "client!ck",
      name = "Ie",
      descriptor = "Llf;"
   )
   public class247 field9959;
   @OriginalMember(
      owner = "client!ck",
      name = "wh",
      descriptor = "Llf;"
   )
   public class247 field9973;
   @OriginalMember(
      owner = "client!ck",
      name = "x",
      descriptor = "Llf;"
   )
   public class247 field9974;
   @OriginalMember(
      owner = "client!ck",
      name = "Mf",
      descriptor = "Llf;"
   )
   public class247 field9998;
   @OriginalMember(
      owner = "client!ck",
      name = "sf",
      descriptor = "Ldt;"
   )
   public class251 field10004;
   @OriginalMember(
      owner = "client!ck",
      name = "gg",
      descriptor = "Lrr;"
   )
   public class380 field10001;
   @OriginalMember(
      owner = "client!ck",
      name = "Rb",
      descriptor = "Lrr;"
   )
   public class380 field9954;
   @OriginalMember(
      owner = "client!ck",
      name = "Pd",
      descriptor = "Lgka;"
   )
   private class390 field10016;
   @OriginalMember(
      owner = "client!ck",
      name = "le",
      descriptor = "Lgka;"
   )
   private class390 field10037;
   @OriginalMember(
      owner = "client!ck",
      name = "Wc",
      descriptor = "Lfe;"
   )
   private class596 field10002;
   @OriginalMember(
      owner = "client!ck",
      name = "jc",
      descriptor = "Lcia;"
   )
   private class638 field9912;
   @OriginalMember(
      owner = "client!ck",
      name = "ug",
      descriptor = "Lsha;"
   )
   private class758 field10034;
   @OriginalMember(
      owner = "client!ck",
      name = "V",
      descriptor = "Lgea;"
   )
   private class81 field9943;
   @OriginalMember(
      owner = "client!ck",
      name = "sc",
      descriptor = "Ljaclib/memory/heap/NativeHeap;"
   )
   public NativeHeap field9904;
   @OriginalMember(
      owner = "client!ck",
      name = "tb",
      descriptor = "Z"
   )
   public boolean field10007;
   @OriginalMember(
      owner = "client!ck",
      name = "nd",
      descriptor = "Z"
   )
   private boolean field10008;
   @OriginalMember(
      owner = "client!ck",
      name = "G",
      descriptor = "Z"
   )
   private boolean field10015;
   @OriginalMember(
      owner = "client!ck",
      name = "ic",
      descriptor = "Z"
   )
   public boolean field10018;
   @OriginalMember(
      owner = "client!ck",
      name = "Xe",
      descriptor = "Z"
   )
   private boolean field10025;
   @OriginalMember(
      owner = "client!ck",
      name = "Rd",
      descriptor = "Z"
   )
   public boolean field10026;
   @OriginalMember(
      owner = "client!ck",
      name = "Fe",
      descriptor = "Z"
   )
   private boolean field10029;
   @OriginalMember(
      owner = "client!ck",
      name = "md",
      descriptor = "Z"
   )
   public boolean field10032;
   @OriginalMember(
      owner = "client!ck",
      name = "J",
      descriptor = "Z"
   )
   private boolean field9928;
   @OriginalMember(
      owner = "client!ck",
      name = "Gf",
      descriptor = "Z"
   )
   private boolean field9929;
   @OriginalMember(
      owner = "client!ck",
      name = "Re",
      descriptor = "Z"
   )
   private boolean field9931;
   @OriginalMember(
      owner = "client!ck",
      name = "pd",
      descriptor = "Z"
   )
   private boolean field9932;
   @OriginalMember(
      owner = "client!ck",
      name = "vg",
      descriptor = "Z"
   )
   private boolean field9938;
   @OriginalMember(
      owner = "client!ck",
      name = "Kc",
      descriptor = "Z"
   )
   private boolean field9942;
   @OriginalMember(
      owner = "client!ck",
      name = "A",
      descriptor = "Z"
   )
   public boolean field9958;
   @OriginalMember(
      owner = "client!ck",
      name = "kd",
      descriptor = "Z"
   )
   public boolean field9961;
   @OriginalMember(
      owner = "client!ck",
      name = "Xd",
      descriptor = "Z"
   )
   public boolean field9967;
   @OriginalMember(
      owner = "client!ck",
      name = "Q",
      descriptor = "Z"
   )
   public boolean field9971;
   @OriginalMember(
      owner = "client!ck",
      name = "Be",
      descriptor = "Z"
   )
   public boolean field9975;
   @OriginalMember(
      owner = "client!ck",
      name = "Oc",
      descriptor = "Z"
   )
   private boolean field9994;
   @OriginalMember(
      owner = "client!ck",
      name = "Ue",
      descriptor = "[Lbca;"
   )
   private class689[] field9979;

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "(ILkc;)V"
   )
   public final void method4772(int arg0, class143 arg1) {
      try {
         ++field9744;
         if (arg0 < 95) {
            this.method4822(-109, true);
         }

         if (this.field9911 >= 0 && this.field9907[this.field9911] == arg1) {
            this.field9907[this.field9911--] = null;
            arg1.method905((byte)-83);
            if (this.field9911 >= 0) {
               this.field9905 = this.field9907[this.field9911];
               this.field9905.method914((byte)-30);
            } else {
               this.field9905 = null;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[86] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lza;)V"
   )
   public final void method596(class434 arg0) {
      try {
         this.field9904 = ((class311)arg0).field4423;
         ++field9708;
         if (this.field10037 == null) {
            class764 var2;
            label26: {
               var2 = new class764(80);
               if (!this.field10006) {
                  var2.method5536(-1.0F, true);
                  var2.method5536(-1.0F, true);
                  var2.method5536(0.0F, true);
                  var2.method5536(0.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(-1.0F, true);
                  var2.method5536(0.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(0.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(0.0F, true);
                  var2.method5536(-1.0F, true);
                  var2.method5536(1.0F, true);
                  var2.method5536(0.0F, true);
                  var2.method5536(0.0F, true);
                  var2.method5536(0.0F, true);
                  if (client.field4530 == 0) {
                     break label26;
                  }
               }

               var2.method5537(-1.0F, (byte)-48);
               var2.method5537(-1.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(-1.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
               var2.method5537(-1.0F, (byte)-48);
               var2.method5537(1.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
               var2.method5537(0.0F, (byte)-48);
            }

            this.field10037 = this.method4808(20, (byte)88, var2.field1590, false, var2.field1552);
            this.field9954 = new class380(this.field10037, 5126, 3, 0);
            this.field10001 = new class380(this.field10037, 5126, 2, 12);
            this.field9889.method4518(-449958824, this);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[130] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "m",
      descriptor = "(B)V"
   )
   private final void method4773(byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(IIIID)V"
   )
   public final void method640(int arg0, int arg1, int arg2, int arg3, double arg4) {
      try {
         ++field9746;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIIZ)Lat;"
   )
   public final class396 method602(int arg0, int arg1, int arg2, int arg3, boolean arg4) {
      try {
         ++field9764;
         return new class638(this, arg0, arg1, arg2, arg3);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[151] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(I[Llja;)V"
   )
   public final void method599(int arg0, class744[] arg1) {
      int var3 = client.field4530;

      try {
         int var4 = 0;
         if (var3 != 0) {
            this.field9986[var4] = arg1[var4];
            ++var4;
         }

         while(true) {
            class667 var10000;
            if (arg0 <= var4) {
               ++field9813;
               this.field9966 = arg0;
               var10000 = this;
               if (var3 == 0) {
                  if (~this.field10045 != -2) {
                     this.method4778(1);
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            var10000.field9986[var4] = arg1[var4];
            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[184] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "P",
      descriptor = "(IIIII)V"
   )
   public final void method539(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         this.method4855((byte)87);
         ++field9705;
         this.method4854(-3, arg4);
         float var6 = (float)arg0 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f(var6, (float)arg2 + var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "A",
      descriptor = "()Lgq;"
   )
   public final class540 method656() {
      try {
         ++field9888;
         return this.field9926;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "na",
      descriptor = "(IIII)[I"
   )
   public final int[] method569(int arg0, int arg1, int arg2, int arg3) {
      int var5 = client.field4530;

      try {
         ++field9822;
         int[] var6 = new int[arg2 * arg3];
         int var7 = 0;
         if (var5 != 0) {
            OpenGL.glReadPixelsi(arg0, this.field9732 - arg1 - var7, arg2, 1, 32993, this.field10000, var6, arg2 * var7);
            ++var7;
         }

         while(true) {
            while(arg3 > var7) {
               OpenGL.glReadPixelsi(arg0, this.field9732 - arg1 - var7, arg2, 1, 32993, this.field10000, var6, arg2 * var7);
               ++var7;
            }

            if (var5 == 0) {
               return var6;
            }

            ++var7;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[153] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "r",
      descriptor = "()Lgq;"
   )
   public final class540 method659() {
      try {
         ++field9837;
         return this.field9896;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[197] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "h",
      descriptor = "(Z)V"
   )
   private final void method4774(boolean arg0) {
      try {
         ++field9745;
         float var2 = (float)(-this.field10003) * this.field9991 / (float)this.field9945;
         if (arg0) {
            float var3 = (float)(-this.field9940) * this.field9991 / (float)this.field10024;
            float var4 = (float)(-this.field10003 + this.field9802) * this.field9991 / (float)this.field9945;
            float var5 = (float)(-this.field9940 + this.field9732) * this.field9991 / (float)this.field10024;
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (var2 != var4 && var3 != var5) {
               OpenGL.glOrtho((double)var2, (double)var4, (double)(-var5), (double)(-var3), (double)this.field9963, (double)this.field9976);
            }

            OpenGL.glMatrixMode(5888);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "o",
      descriptor = "(I)V"
   )
   public final void method4775(int arg0) {
      try {
         if (arg0 != 2) {
            this.field10000 = 59;
         }

         ++field9726;
         if (~this.field9933 != -5) {
            this.method4845(0);
            this.method4795((byte)100, false);
            this.method4822(-118, false);
            this.method4807(false, false);
            this.method4811(-32, false);
            this.method4840(-2, (byte)125);
            this.method4854(-3, 1);
            this.field9933 = 4;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "([Ljava/awt/Rectangle;III)V"
   )
   public final void method605(Rectangle[] arg0, int arg1, int arg2, int arg3) throws class280 {
      try {
         ++field9739;
         this.method627(arg2, arg3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[96] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "(II)I"
   )
   public final int method632(int arg0, int arg1) {
      try {
         ++field9801;
         return arg1 ^ arg0 & arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[49] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ILkc;)V"
   )
   public final void method4776(int arg0, class143 arg1) {
      try {
         ++field9694;
         if (arg0 != -4117) {
            this.field9935 = null;
         }

         if (~this.field9911 <= -4) {
            throw new RuntimeException();
         } else {
            if (~this.field9911 <= -1) {
               this.field9907[this.field9911].method905((byte)122);
            }

            this.field9905 = this.field9907[++this.field9911] = arg1;
            this.field9905.method914((byte)-113);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[195] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lsea;)V"
   )
   public final void method566(class725 arg0) {
      try {
         ++field9722;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[74] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "(Z)V"
   )
   private final void method4777(boolean arg0) {
      try {
         if (arg0) {
            this.method542();
         }

         ++field9805;
         OpenGL.glViewport(this.field9962, this.field9960, this.field9802, this.field9732);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[165] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "k",
      descriptor = "(I)V"
   )
   private final void method4778(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public final void method593(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      int var10 = client.field4530;

      try {
         ++field9854;
         if (arg0 != arg2 || arg1 != arg3) {
            float var14;
            float var15;
            float var16;
            float var17;
            float var18;
            float var19;
            float var20;
            float var21;
            label79: {
               this.method4855((byte)-124);
               this.method4854(-3, arg5);
               float var11 = (float)arg2 - (float)arg0;
               float var12 = (float)(-arg1) + (float)arg3;
               float var13 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var12 * var12)));
               var14 = var11 * var13;
               int var28 = arg8 % (arg7 - -arg6);
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               var15 = var12 * var13;
               var16 = (float)arg6 * var14;
               var17 = (float)arg6 * var15;
               var18 = 0.0F;
               var19 = 0.0F;
               var20 = var16;
               var21 = var17;
               if (var28 > arg6) {
                  var19 = (float)(arg6 - -arg7 + -var28) * var15;
                  var18 = (float)(arg6 - -arg7 + -var28) * var14;
                  if (var10 == 0) {
                     break label79;
                  }
               }

               var21 = (float)(-var28 + arg6) * var15;
               var20 = (float)(arg6 - var28) * var14;
            }

            float var22 = (float)arg0 + 0.35F + var18;
            float var23 = (float)arg1 + 0.35F + var19;
            float var24 = (float)arg7 * var14;
            float var25 = (float)arg7 * var15;

            do {
               label86: {
                  int var10000;
                  label70: {
                     if (~arg2 < ~arg0) {
                        float var29;
                        var10000 = (var29 = (float)arg2 + 0.35F - var22) == 0.0F ? 0 : (var29 < 0.0F ? -1 : 1);
                        if (var10 != 0) {
                           break label70;
                        }

                        if (var10000 < 0) {
                           break;
                        }

                        if (!(var20 + var22 > (float)arg2)) {
                           break label86;
                        }

                        var20 = (float)arg2 + -var22;
                        if (var10 == 0) {
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
                     if (var23 < (float)arg3 + 0.35F) {
                        break;
                     }

                     if (!(var21 + var23 < (float)arg3)) {
                        break label88;
                     }

                     var21 = (float)arg3 + -var23;
                     if (var10 == 0) {
                        break label88;
                     }
                  }

                  if (var23 > (float)arg3 + 0.35F) {
                     break;
                  }

                  if ((float)arg3 < var21 + var23) {
                     var21 = (float)arg3 + -var23;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glVertex2f(var22, var23);
               OpenGL.glVertex2f(var20 + var22, var21 + var23);
               var22 += var20 + var24;
               OpenGL.glEnd();
               var23 += var21 + var25;
               var20 = var16;
               var21 = var17;
            } while(var10 == 0);

         }
      } catch (RuntimeException var27) {
         throw class670.method4877(var27, field10053[64] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "I",
      descriptor = "()I"
   )
   public final int method631() {
      try {
         ++field9800;
         int var1 = this.field10047;
         this.field10047 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[211] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(FFFIF)V"
   )
   public final void method4779(float arg0, float arg1, float arg2, int arg3, float arg4) {
      try {
         class61.field754[1] = arg0;
         ++field9688;
         if (arg3 >= 118) {
            class61.field754[2] = arg4;
            class61.field754[3] = arg1;
            class61.field754[0] = arg2;
            OpenGL.glTexEnvfv(8960, 8705, class61.field754, 0);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[133] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method620(Canvas arg0) {
      try {
         ++field9729;
         if (this.field9814 == arg0) {
            throw new RuntimeException();
         } else if (this.field9831.containsKey(arg0)) {
            Long var2 = (Long)this.field9831.get(arg0);
            this.field9866.releaseSurface(arg0, var2);
            this.field9831.remove(arg0);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[44] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(ILkc;)V"
   )
   public final void method4780(int arg0, class143 arg1) {
      try {
         if (arg0 <= 36) {
            this.method657();
         }

         ++field9704;
         if (~this.field9909 <= -4) {
            throw new RuntimeException();
         } else {
            if (this.field9909 >= 0) {
               this.field9914[this.field9909].method904(false);
            }

            this.field9906 = this.field9914[++this.field9909] = arg1;
            this.field9906.method908((byte)74);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[207] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "()V"
   )
   public final void method549() {
      try {
         ++field9820;
         if (this.field9891 != null && this.field9891.method3588(44)) {
            this.field9892.method5335(73, this.field9891);
            this.field9895.method253(-119);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[156] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IILsha;II)V"
   )
   public final void method4781(int arg0, int arg1, class758 arg2, int arg3, int arg4) {
      try {
         if (arg4 != 1024) {
            this.method599(57, (class744[])null);
         }

         ++field9811;
         int var6 = arg2.method996(15234);
         int var9 = arg3 * this.method4788(var6, 1);
         this.method4853(-4081, arg2);
         OpenGL.glDrawElements(arg1, arg0, var6, arg2.method992(30662) - -((long)var9));
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[136] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10053[10] : field10053[9]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "i",
      descriptor = "(II)V"
   )
   public final void method4782(int arg0, int arg1) {
      try {
         class61.field754[1] = (float)class153.method1262(65280, arg0) / 65280.0F;
         class61.field754[3] = (float)(arg0 >>> 24) / 255.0F;
         if (arg1 < 6) {
            this.field10024 = 26;
         }

         class61.field754[0] = (float)class153.method1262(arg0, 16711680) / 1.671168E7F;
         class61.field754[2] = (float)class153.method1262(arg0, 255) / 255.0F;
         ++field9872;
         OpenGL.glTexEnvfv(8960, 8705, class61.field754, 0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[171] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "q",
      descriptor = "()Z"
   )
   public final boolean method585() {
      try {
         ++field9779;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[30] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZZI)V"
   )
   public final void method4783(boolean arg0, boolean arg1, int arg2) {
      try {
         ++field9762;
         this.method4810(arg1, arg2, arg0, false);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[93] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "k",
      descriptor = "(II)V"
   )
   public final synchronized void method4784(int arg0, int arg1) {
      try {
         ++field9723;
         class10 var3 = new class10(arg0);
         if (arg1 != 6406) {
            this.method4850((class390)null, -111);
         }

         this.field9921.method4060(23, var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[95] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "(II)Lps;"
   )
   public final class103 method568(int arg0, int arg1) {
      try {
         ++field9869;
         return null;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[117] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "l",
      descriptor = "(B)V"
   )
   public static final void method4785(byte arg0) {
      try {
         if (class687.field10346 == null) {
            class783 var1 = new class783();
            byte[] var2 = var1.method5627(128, 128, 16, (byte)82);
            class687.field10346 = class756.method5493(var2, arg0 + -69, false);
         }

         ++field9841;
         if (class236.field2996 == null) {
            class591 var3 = new class591();
            byte[] var4 = var3.method4349(128, 128, 16, -128);
            class236.field2996 = class756.method5493(var4, 2, false);
         }

         if (arg0 != -43) {
            method4785((byte)-31);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[177] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZLjaclib/memory/Buffer;III)Lgka;"
   )
   public final class390 method4786(boolean arg0, Buffer arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg2 != 24348) {
            this.method611(-54, 62, -97, 86, -102, -0.8928114F);
         }

         ++field9827;
         return (class390)(!this.field9941 || arg0 && !this.field9982 ? new class753(this, arg4, arg1) : new class362(this, arg4, arg1, arg3, arg0));
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[59] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public final void method557(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         OpenGL.glLineWidth((float)arg5);
         ++field9836;
         this.method588(arg0, arg1, arg2, arg3, arg4, arg6);
         OpenGL.glLineWidth(1.0F);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[209] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIIIILaa;IIIII)V"
   )
   public final void method600(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8, int arg9, int arg10, int arg11) {
      int var13 = client.field4530;

      try {
         ++field9753;
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
               class364 var14 = (class364)arg6;
               class596 var15 = var14.field5462;
               this.method4817((byte)-61);
               this.method4818((byte)-105, var14.field5462);
               this.method4854(-3, arg5);
               this.method4849(8448, 34161, 7681);
               this.method4814(7681, 0, 34167, 768);
               var16 = var15.field8778 / (float)var15.field8779;
               var17 = var15.field8777 / (float)var15.field8783;
               float var18 = (float)arg2 - (float)arg0;
               float var19 = (float)arg3 - (float)arg1;
               float var20 = (float)(1.0D / Math.sqrt((double)(var18 * var18 + var19 * var19)));
               var21 = var18 * var20;
               var22 = var19 * var20;
               OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
               int var35 = arg11 % (arg10 - -arg9);
               var23 = (float)arg9 * var21;
               var24 = (float)arg9 * var22;
               var25 = 0.0F;
               var26 = 0.0F;
               var27 = var23;
               var28 = var24;
               if (var35 <= arg9) {
                  var27 = (float)(-var35 + arg9) * var21;
                  var28 = (float)(-var35 + arg9) * var22;
                  if (var13 == 0) {
                     break label87;
                  }
               }

               var26 = (float)(-var35 + arg9 + arg10) * var22;
               var25 = (float)(arg9 + arg10 + -var35) * var21;
            }

            float var29 = (float)arg0 + 0.35F + var25;
            float var30 = (float)arg1 + 0.35F + var26;
            float var31 = (float)arg10 * var21;
            float var32 = (float)arg10 * var22;

            do {
               label94: {
                  int var10000;
                  label78: {
                     if (~arg0 > ~arg2) {
                        float var36;
                        var10000 = (var36 = var29 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var36 < 0.0F ? -1 : 1);
                        if (var13 != 0) {
                           break label78;
                        }

                        if (var10000 > 0) {
                           break;
                        }

                        if (!(var27 + var29 > (float)arg2)) {
                           break label94;
                        }

                        var27 = (float)arg2 - var29;
                        if (var13 == 0) {
                           break label94;
                        }
                     }

                     float var37;
                     var10000 = (var37 = var29 - ((float)arg2 + 0.35F)) == 0.0F ? 0 : (var37 < 0.0F ? -1 : 1);
                  }

                  if (var10000 < 0) {
                     break;
                  }

                  if ((float)arg2 > var27 + var29) {
                     var27 = (float)arg2 - var29;
                  }
               }

               label96: {
                  if (~arg1 > ~arg3) {
                     if ((float)arg3 + 0.35F < var30) {
                        break;
                     }

                     if (!((float)arg3 < var28 + var30)) {
                        break label96;
                     }

                     var28 = (float)arg3 + -var30;
                     if (var13 == 0) {
                        break label96;
                     }
                  }

                  if ((float)arg3 + 0.35F > var30) {
                     break;
                  }

                  if (var28 + var30 < (float)arg3) {
                     var28 = (float)arg3 - var30;
                  }
               }

               OpenGL.glBegin(1);
               OpenGL.glTexCoord2f(((float)(-arg7) + var29) * var16, ((float)(-arg8) + var30) * var17);
               OpenGL.glVertex2f(var29, var30);
               OpenGL.glTexCoord2f((var27 + var29 - (float)arg7) * var16, (var28 + var30 + (float)(-arg8)) * var17);
               OpenGL.glVertex2f(var27 + var29, var28 + var30);
               var30 += var28 + var32;
               OpenGL.glEnd();
               var29 += var27 + var31;
               var27 = var23;
               var28 = var24;
            } while(var13 == 0);

            this.method4814(7681, 0, 5890, 768);
         }
      } catch (RuntimeException var34) {
         throw class670.method4877(var34, field10053[182] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10053[10] : field10053[9]) + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "u",
      descriptor = "()Z"
   )
   public final boolean method591() {
      try {
         ++field9788;
         return false;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[204] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "i",
      descriptor = "(B)V"
   )
   public final void method4787(byte arg0) {
      try {
         ++field9700;
         if (~this.field9933 != -17) {
            this.method4848(arg0 + 116);
            this.method4795((byte)100, true);
            this.method4807(false, true);
            this.method4811(-32, true);
            this.method4854(arg0 ^ 113, 1);
            this.field9933 = 16;
         }

         if (arg0 != -116) {
            this.method4842(11, -99, (byte)-55);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[31] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "j",
      descriptor = "(II)I"
   )
   public final int method4788(int arg0, int arg1) {
      try {
         ++field9718;
         if (arg1 != 1) {
            this.method596((class434)null);
         }

         if (~arg0 != -5122 && arg0 != 5120) {
            if (~arg0 != -5124 && arg0 != 5122) {
               if (~arg0 != -5126 && ~arg0 != -5125 && ~arg0 != -5127) {
                  throw new IllegalArgumentException("");
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
         throw class670.method4877(var4, field10053[83] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(III)V"
   )
   public final synchronized void method4789(int arg0, int arg1, int arg2) {
      try {
         ++field9690;
         if (arg0 < 7) {
            this.field10013 = null;
         }

         class10 var4 = new class10(arg1);
         var4.field5280 = (long)arg2;
         this.field9922.method4060(23, var4);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[166] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "A",
      descriptor = "(ILaa;II)V"
   )
   public final void method636(int arg0, class512 arg1, int arg2, int arg3) {
      try {
         ++field9699;
         class364 var5 = (class364)arg1;
         class596 var6 = var5.field5462;
         this.method4817((byte)-123);
         this.method4818((byte)8, var5.field5462);
         this.method4854(-3, 1);
         this.method4849(8448, 34161, 7681);
         this.method4814(7681, 0, 34167, 768);
         float var7 = var6.field8778 / (float)var6.field8779;
         float var8 = var6.field8777 / (float)var6.field8783;
         OpenGL.glColor4ub((byte)(arg0 >> 16), (byte)(arg0 >> 8), (byte)arg0, (byte)(arg0 >> 24));
         OpenGL.glBegin(7);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field10011) * var7, (float)(-arg3 + this.field9936) * var8);
         OpenGL.glVertex2i(this.field10011, this.field9936);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field10011) * var7, (float)(this.field10038 - arg3) * var8);
         OpenGL.glVertex2i(this.field10011, this.field10038);
         OpenGL.glTexCoord2f((float)(-arg2 + this.field10012) * var7, (float)(-arg3 + this.field10038) * var8);
         OpenGL.glVertex2i(this.field10012, this.field10038);
         OpenGL.glTexCoord2f((float)(this.field10012 - arg2) * var7, (float)(-arg3 + this.field9936) * var8);
         OpenGL.glVertex2i(this.field10012, this.field9936);
         OpenGL.glEnd();
         this.method4814(7681, 0, 5890, 768);
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10053[217] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "()Z"
   )
   public final boolean method542() {
      try {
         ++field9697;
         return this.field9994 && (!this.method657() || this.field10029);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[67] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "(B)V"
   )
   public final void method4790(byte arg0) {
      try {
         OpenGL.glPopMatrix();
         if (arg0 < 33) {
            this.method651();
         }

         ++field9760;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[210] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "r",
      descriptor = "(I)V"
   )
   public final void method4791(int arg0) {
      try {
         OpenGL.glLightfv(16384, 4611, this.field9987, 0);
         ++field9761;
         if (arg0 > 26) {
            OpenGL.glLightfv(16385, 4611, this.field9984, 0);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[73] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(BI)V"
   )
   public final synchronized void method4792(byte arg0, int arg1) {
      try {
         ++field9833;
         class347 var3 = new class347();
         var3.field5280 = (long)arg1;
         if (arg0 != 5) {
            this.field9894 = -112;
         }

         this.field9923.method4060(23, var3);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[141] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "p",
      descriptor = "(I)V"
   )
   private final void method4793(int arg0) {
      int var2 = client.field4530;

      try {
         this.method4840(-2, (byte)125);
         ++field9763;
         int var3 = this.field10020 - 1;
         if (var2 != 0) {
            this.method4828(var3, (byte)66);
            this.method4818((byte)100, (class689)null);
            OpenGL.glTexEnvi(8960, 8704, 34160);
            --var3;
         }

         while(true) {
            while(~var3 <= -1) {
               this.method4828(var3, (byte)66);
               this.method4818((byte)100, (class689)null);
               OpenGL.glTexEnvi(8960, 8704, 34160);
               --var3;
            }

            this.method4849(8448, arg0 ^ 34161, 8448);
            this.method4814(7681, 2, 34168, 770);
            this.method4812((byte)72);
            this.field9925 = 1;
            OpenGL.glEnable(3042);
            OpenGL.glBlendFunc(770, 771);
            this.field9927 = 1;
            OpenGL.glEnable(3008);
            OpenGL.glAlphaFunc(516, (float)arg0);
            this.field9932 = true;
            OpenGL.glColorMask(true, true, true, true);
            this.field9929 = true;
            this.method4795((byte)100, true);
            this.method4822(103, true);
            this.method4807(false, true);
            this.method4811(-32, true);
            this.method4794(-13674);
            this.field9866.setSwapInterval(0);
            OpenGL.glShadeModel(7425);
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
            if (var2 == 0) {
               int var6;
               if (var2 != 0) {
                  var6 = 16384 - -var5;
                  OpenGL.glLightfv(var6, 4608, var4, 0);
                  OpenGL.glLightf(var6, 4615, 0.0F);
                  OpenGL.glLightf(var6, 4616, 0.0F);
                  ++var5;
               }

               while(true) {
                  short var10000;
                  int var10001;
                  if (~var5 <= -9) {
                     OpenGL.glEnable(16384);
                     OpenGL.glEnable(16385);
                     OpenGL.glFogf(2914, 0.95F);
                     OpenGL.glFogi(2917, 9729);
                     var10000 = 3156;
                     var10001 = 4353;
                     if (var2 == 0) {
                        OpenGL.glHint(3156, 4353);
                        this.field9939 = this.field10028 = -1;
                        this.method607();
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

            --var3;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[90] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "ZA",
      descriptor = "(IFFFFF)V"
   )
   public final void method660(int arg0, float arg1, float arg2, float arg3, float arg4, float arg5) {
      try {
         ++field9731;
         boolean var7 = ~this.field9939 != ~arg0;
         if (var7 || this.field9985 != arg1 || this.field9948 != arg2) {
            this.field9939 = arg0;
            this.field9985 = arg1;
            this.field9948 = arg2;
            if (var7) {
               this.field9955 = (float)(this.field9939 & 255) / 255.0F;
               this.field10017 = (float)(65280 & this.field9939) / 65280.0F;
               this.field9978 = (float)(16711680 & this.field9939) / 1.671168E7F;
               this.method4856(1);
            }

            this.method4846(-15);
         }

         if (this.field9997[0] != arg3 || this.field9997[1] != arg4 || this.field9997[2] != arg5) {
            this.field9997[2] = arg5;
            this.field9997[0] = arg3;
            this.field9997[1] = arg4;
            this.field9952[2] = -arg5;
            this.field9952[1] = -arg4;
            this.field9952[0] = -arg3;
            float var8 = (float)(1.0D / Math.sqrt((double)(arg5 * arg5 + arg3 * arg3 + arg4 * arg4)));
            this.field9987[0] = arg3 * var8;
            this.field9987[2] = arg5 * var8;
            this.field9987[1] = arg4 * var8;
            this.field9984[0] = -this.field9987[0];
            this.field9984[1] = -this.field9987[1];
            this.field9984[2] = -this.field9987[2];
            this.method4791(69);
            this.field9953 = (int)(arg3 * 256.0F / arg4);
            this.field9977 = (int)(arg5 * 256.0F / arg4);
         }

      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10053[20] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "l",
      descriptor = "(I)V"
   )
   public final void method4794(int arg0) {
      try {
         ++field9773;
         if (~this.field10045 != -1) {
            this.field10045 = 0;
            this.field9933 &= -32;
         }

         if (arg0 != -13674) {
            this.method4776(-87, (class143)null);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[84] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "j",
      descriptor = "()Lgq;"
   )
   public final class540 method559() {
      try {
         ++field9810;
         return new class218();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[201] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIZ)Lat;"
   )
   public final class396 method580(int arg0, int arg1, boolean arg2) {
      try {
         ++field9847;
         return new class638(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[92] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method563(int arg0) {
      try {
         ++field9876;
         this.method4773((byte)121);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[33] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(BZ)V"
   )
   public final void method4795(byte arg0, boolean arg1) {
      try {
         ++field9880;
         if (arg0 != 100) {
            this.field9941 = true;
         }

         if (this.field9938 != arg1) {
            this.field9938 = arg1;
            this.method4825(arg0 ^ -20894);
            this.field9933 &= -32;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[152] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "KA",
      descriptor = "(IIII)V"
   )
   public final void method554(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (~arg1 > -1) {
            arg1 = 0;
         }

         if (arg2 > this.field9802) {
            arg2 = this.field9802;
         }

         if (arg0 < 0) {
            arg0 = 0;
         }

         ++field9703;
         if (~arg3 < ~this.field9732) {
            arg3 = this.field9732;
         }

         this.field9936 = arg1;
         this.field10038 = arg3;
         this.field10011 = arg0;
         this.field10012 = arg2;
         OpenGL.glEnable(3089);
         this.method4813(true);
         this.method4804(89);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[52] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(II[[I[[IIII)Ls;"
   )
   public final class293 method658(int arg0, int arg1, int[][] arg2, int[][] arg3, int arg4, int arg5, int arg6) {
      try {
         ++field9778;
         return new class663(this, arg5, arg6, arg0, arg1, arg2, arg3, arg4);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[185] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10053[10] : field10053[9]) + ',' + (arg3 != null ? field10053[10] : field10053[9]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(ZI)V"
   )
   public final void method4796(boolean arg0, int arg1) {
      int var3 = client.field4530;

      try {
         label52: {
            ++field9711;
            if (~arg1 == -2) {
               this.method4849(7681, 34161, 7681);
               if (var3 == 0) {
                  break label52;
               }
            }

            if (~arg1 != -1) {
               if (~arg1 == -3) {
                  this.method4849(7681, 34161, 34165);
                  if (var3 == 0) {
                     break label52;
                  }
               }

               if (~arg1 == -4) {
                  this.method4849(8448, 34161, 260);
                  if (var3 == 0) {
                     break label52;
                  }
               }

               if (~arg1 != -5) {
                  break label52;
               }

               this.method4849(34023, 34161, 34023);
               if (var3 == 0) {
                  break label52;
               }
            }

            this.method4849(8448, 34161, 8448);
         }

         if (arg0) {
            this.method612(-107, -40, 23, -17, -60, 29);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[181] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lnia;Z)Lat;"
   )
   public final class396 method577(class671 arg0, boolean arg1) {
      int var3 = client.field4530;

      try {
         int[] var4;
         label95: {
            ++field9693;
            var4 = new int[arg0.field10100 * arg0.field10097];
            int var5 = 0;
            int var6 = 0;
            if (arg0.field10095 != null) {
               int var7 = 0;
               if (var3 != 0 || ~arg0.field10097 < ~var7) {
                  do {
                     int var8 = 0;
                     if (var3 != 0) {
                        var4[var6++] = class379.method2928(arg0.field10095[var5] << 24, arg0.field10096[class153.method1262(arg0.field10099[var5], 255)]);
                        ++var5;
                        ++var8;
                     }

                     while(true) {
                        while(~arg0.field10100 < ~var8) {
                           var4[var6++] = class379.method2928(arg0.field10095[var5] << 24, arg0.field10096[class153.method1262(arg0.field10099[var5], 255)]);
                           ++var5;
                           ++var8;
                        }

                        if (var3 == 0) {
                           ++var7;
                           break;
                        }

                        ++var8;
                     }
                  } while(~arg0.field10097 < ~var7);
               }

               if (var3 == 0) {
                  break label95;
               }
            }

            int var9 = 0;
            if (var3 != 0 || ~arg0.field10097 < ~var9) {
               do {
                  int var10 = 0;
                  if (var3 != 0 || ~arg0.field10100 < ~var10) {
                     do {
                        int var11 = arg0.field10096[255 & arg0.field10099[var5++]];
                        var4[var6++] = ~var11 != -1 ? class379.method2928(var11, -16777216) : 0;
                        ++var10;
                     } while(~arg0.field10100 < ~var10);
                  }

                  ++var9;
               } while(~arg0.field10097 < ~var9);
            }
         }

         class396 var12 = this.method589(arg0.field10100, 0, 0, var4, arg0.field10100, arg0.field10097);
         var12.method1976(arg0.field10103, arg0.field10102, arg0.field10101, arg0.field10098);
         return var12;
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field10053[14] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(I[Ljava/lang/String;)[Ljava/lang/String;"
   )
   public static final String[] method4797(int arg0, String[] arg1) {
      int var2 = client.field4530;

      try {
         int var3 = -82 / ((arg0 - 12) / 39);
         ++field9886;
         String[] var4 = new String[5];
         int var5 = 0;
         if (var2 != 0) {
            var4[var5] = var5 + field10053[205];
            if (arg1 != null && arg1[var5] != null) {
               var4[var5] = var4[var5] + arg1[var5];
            }

            ++var5;
         }

         while(true) {
            String[] var10000;
            if (~var5 <= -6) {
               var10000 = var4;
               if (var2 == 0) {
                  return var4;
               }
            } else {
               var4[var5] = var5 + field10053[205];
               var10000 = arg1;
            }

            if (var10000 != null && arg1[var5] != null) {
               var4[var5] = var4[var5] + arg1[var5];
            }

            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[206] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "j",
      descriptor = "(I)V"
   )
   private final void method4798(int arg0) {
      try {
         ++field9721;
         float[] var2 = this.field9988;
         float var3 = (float)(-this.field10003 * this.field9963) / (float)this.field9945;
         if (arg0 > -105) {
            this.field9942 = true;
         }

         label29: {
            float var4 = (float)((this.field9802 - this.field10003) * this.field9963) / (float)this.field9945;
            float var5 = (float)(this.field9963 * this.field9940) / (float)this.field10024;
            float var6 = (float)((-this.field9732 + this.field9940) * this.field9963) / (float)this.field10024;
            if (var3 == var4 || var5 == var6) {
               var2[7] = 0.0F;
               var2[11] = 0.0F;
               var2[4] = 0.0F;
               var2[2] = 0.0F;
               var2[0] = 1.0F;
               var2[6] = 0.0F;
               var2[12] = 0.0F;
               var2[5] = 1.0F;
               var2[3] = 0.0F;
               var2[14] = 0.0F;
               var2[15] = 1.0F;
               var2[1] = 0.0F;
               var2[10] = 1.0F;
               var2[8] = 0.0F;
               var2[13] = 0.0F;
               var2[9] = 0.0F;
               if (client.field4530 == 0) {
                  break label29;
               }
            }

            float var7 = (float)this.field9963 * 2.0F;
            var2[8] = (var3 + var4) / (-var3 + var4);
            var2[14] = this.field10042 = -((float)this.field9976 * var7) / (float)(-this.field9963 + this.field9976);
            var2[7] = 0.0F;
            var2[4] = 0.0F;
            var2[1] = 0.0F;
            var2[10] = this.field10014 = (float)(-(this.field9976 + this.field9963)) / (float)(-this.field9963 + this.field9976);
            var2[5] = var7 / (var5 - var6);
            var2[9] = (var5 + var6) / (var5 - var6);
            var2[6] = 0.0F;
            var2[0] = var7 / (-var3 + var4);
            var2[15] = 0.0F;
            var2[11] = -1.0F;
            var2[3] = 0.0F;
            var2[12] = 0.0F;
            var2[13] = 0.0F;
            var2[2] = 0.0F;
         }

         this.method4799((byte)-128);
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[219] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Loda;I)V"
   )
   public final void method623(class127 arg0, int arg1) {
      try {
         this.field9889.method4523(this, (byte)75, arg1, arg0);
         ++field9734;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[186] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "h",
      descriptor = "(I)V"
   )
   public final void method643(int arg0) {
      try {
         ++field9849;
         if (~arg0 <= -129 && arg0 <= 1024) {
            this.field9890 = arg0;
            this.field9895.method253(-110);
         } else {
            throw new IllegalArgumentException();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[218] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "XA",
      descriptor = "()I"
   )
   public final int method639() {
      try {
         ++field9786;
         return this.field9976;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[193] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "j",
      descriptor = "(B)V"
   )
   private final void method4799(byte arg0) {
      try {
         this.field9988[10] = this.field10014;
         ++field9851;
         this.field9988[14] = this.field10042;
         int var2 = -7 % ((arg0 - -71) / 54);
         this.field9969 = (this.field9988[14] + (float)(-this.field9976)) / this.field9988[10];
         this.field10022 = (float)this.field9976;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[128] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(FI)V"
   )
   public final void method4800(float arg0, int arg1) {
      try {
         ++field9720;
         if (arg1 != -4) {
            this.method553(102, -87, -57, 19, -77, 8);
         }

         if (this.field9991 != arg0) {
            this.field9991 = arg0;
            if (~this.field10045 == -4) {
               this.method4774(true);
               return;
            }
         }

      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[188] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "()V"
   )
   public final void method581() {
      try {
         this.field9892.method5342(true);
         ++field9750;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[208] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;)V"
   )
   public final void method571(Canvas arg0) {
      try {
         label45: {
            ++field9725;
            this.field9752 = 0L;
            this.field9709 = null;
            if (arg0 == null || this.field9814 == arg0) {
               this.field9752 = this.field9875;
               this.field9709 = this.field9814;
               if (client.field4530 == 0) {
                  break label45;
               }
            }

            if (this.field9831.containsKey(arg0)) {
               Long var2 = (Long)this.field9831.get(arg0);
               this.field9752 = var2;
               this.field9709 = arg0;
            }
         }

         if (this.field9709 != null && this.field9752 != 0L) {
            this.field9866.setSurface(this.field9752);
            this.method4833(-17767);
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[168] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "(ILkc;)V"
   )
   public final void method4801(int arg0, class143 arg1) {
      int var3 = client.field4530;

      try {
         label52: {
            ++field9848;
            if (this.field10007) {
               this.method4841(28942, arg1);
               this.method4772(121, arg1);
               if (var3 == 0) {
                  break label52;
               }
            }

            if (this.field9910 < 0 || this.field9913[this.field9910] != arg1) {
               throw new RuntimeException();
            }

            this.field9913[this.field9910--] = null;
            arg1.method909(9619);
            if (this.field9910 < 0) {
               this.field9906 = this.field9905 = null;
               if (var3 == 0) {
                  break label52;
               }
            }

            this.field9906 = this.field9905 = this.field9913[this.field9910];
            this.field9906.method900(-23302);
         }

         if (arg0 > -1) {
            this.field9947 = -94;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[227] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "(I)V"
   )
   private final void method4802(int arg0) {
      try {
         ++field9749;
         int var2 = 122 / ((67 - arg0) / 33);
         OpenGL.glDepthMask(this.field9931 && this.field9964);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[213] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "Q",
      descriptor = "(IIIIII[BII)V"
   )
   public final void method546(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte[] arg6, int arg7, int arg8) {
      try {
         float var10;
         float var11;
         label36: {
            ++field9776;
            if (this.field10002 == null || this.field10002.field3367 < arg2 || this.field10002.field3361 < arg3) {
               this.field10002 = class553.method4090(false, arg2, 6406, 6406, this, arg3, arg6, (byte)47);
               this.field10002.method1893(true, false, false);
               var10 = this.field10002.field8777;
               var11 = this.field10002.field8778;
               if (client.field4530 == 0) {
                  break label36;
               }
            }

            this.field10002.method1895(false, 0, 6406, arg6, 0, arg2, 0, 10329, 0, arg3);
            var10 = (float)arg3 * this.field10002.field8777 / (float)this.field10002.field3361;
            var11 = (float)arg2 * this.field10002.field8778 / (float)this.field10002.field3367;
         }

         this.method4817((byte)-105);
         this.method4818((byte)101, this.field10002);
         this.method4854(-3, arg8);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         this.method4782(arg5, 79);
         this.method4849(34165, 34161, 34165);
         this.method4814(7681, 0, 34166, 768);
         this.method4814(7681, 2, 5890, 770);
         this.method4823(34166, 0, 770, (byte)115);
         this.method4823(5890, 2, 770, (byte)77);
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
         this.method4814(7681, 0, 5890, 768);
         this.method4814(7681, 2, 34166, 770);
         this.method4823(5890, 0, 770, (byte)80);
         this.method4823(34166, 2, 770, (byte)60);
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field10053[89] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10053[10] : field10053[9]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "HA",
      descriptor = "(IIII[I)V"
   )
   public final void method587(int arg0, int arg1, int arg2, int arg3, int[] arg4) {
      try {
         ++field9771;
         float var6 = (float)arg2 * this.field9926.field2746 + (float)arg0 * this.field9926.field2749 + (float)arg1 * this.field9926.field2748 + this.field9926.field2750;
         if (!(var6 < (float)this.field9963) && !(var6 > (float)this.field9976)) {
            int var7 = (int)(((float)arg2 * this.field9926.field2758 + (float)arg0 * this.field9926.field2762 + (float)arg1 * this.field9926.field2756 + this.field9926.field2761) * (float)this.field9945 / (float)arg3);
            int var8 = (int)(((float)arg2 * this.field9926.field2763 + (float)arg0 * this.field9926.field2754 + (float)arg1 * this.field9926.field2769 + this.field9926.field2773) * (float)this.field10024 / (float)arg3);
            if (this.field10027 <= (float)var7 && this.field9965 >= (float)var7 && this.field9944 <= (float)var8 && (float)var8 <= this.field9981) {
               arg4[1] = (int)((float)var8 - this.field9944);
               arg4[0] = (int)((float)var7 - this.field10027);
               arg4[2] = (int)var6;
            } else {
               arg4[0] = arg4[1] = arg4[2] = -1;
            }
         } else {
            arg4[0] = arg4[1] = arg4[2] = -1;
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10053[222] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "v",
      descriptor = "()V"
   )
   public final void method624() {
      int var1 = client.field4530;

      try {
         class347 var2 = this.field9900.method4071((byte)126);
         if (var1 != 0) {
            ((class311)var2).method2349((byte)-111);
            var2 = this.field9900.method4059((byte)124);
         }

         while(true) {
            while(var2 != null) {
               ((class311)var2).method2349((byte)-111);
               var2 = this.field9900.method4059((byte)124);
            }

            ++field9807;
            if (var1 == 0) {
               if (this.field9892 != null) {
                  this.field9892.method5336(-107);
               }

               if (this.field9866 != null) {
                  Object var10000;
                  label47: {
                     this.method4819(-1);
                     Enumeration var3 = this.field9831.keys();
                     if (var1 != 0) {
                        var10000 = var3.nextElement();
                     } else if (!var3.hasMoreElements()) {
                        this.field9866.release();
                        var10000 = this;
                        if (var1 == 0) {
                           break label47;
                        }
                     } else {
                        var10000 = var3.nextElement();
                     }

                     while(true) {
                        Canvas var4 = (Canvas)var10000;
                        Long var5 = (Long)this.field9831.get(var4);
                        this.field9866.releaseSurface(var4, var5);
                        if (!var3.hasMoreElements()) {
                           this.field9866.release();
                           var10000 = this;
                           if (var1 == 0) {
                              break;
                           }
                        } else {
                           var10000 = var3.nextElement();
                        }
                     }
                  }

                  ((class667)var10000).field9866 = null;
               }

               if (this.field9902) {
                  class442.method3343(true, false, (byte)-87);
                  this.field9902 = false;
                  return;
               }

               return;
            }

            var2 = this.field9900.method4059((byte)124);
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[192] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "u",
      descriptor = "(I)V"
   )
   private final void method4803(int arg0) {
      try {
         this.field9979 = new class689[this.field10020];
         ++field9795;
         this.field10004 = new class251(this, 3553, 6408, 1, 1);
         new class251(this, 3553, 6408, 1, 1);
         new class251(this, 3553, 6408, 1, 1);
         this.field9974 = new class247(this);
         this.field10013 = new class247(this);
         this.field9973 = new class247(this);
         this.field10019 = new class247(this);
         int var2 = -81 % ((48 - arg0) / 48);
         this.field10005 = new class247(this);
         this.field9959 = new class247(this);
         this.field9998 = new class247(this);
         this.field9946 = new class247(this);
         this.field10044 = new class247(this);
         this.field10030 = new class247(this);
         if (this.field9957) {
            this.field10010 = new class105(this);
            new class105(this);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[72] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "X",
      descriptor = "(I)V"
   )
   public final void method646(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ck",
      name = "F",
      descriptor = "(II)V"
   )
   public final void method638(int arg0, int arg1) {
      try {
         ++field9736;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[180] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "y",
      descriptor = "(I)V"
   )
   private final void method4804(int arg0) {
      try {
         if (arg0 <= 72) {
            this.field9938 = true;
         }

         label22: {
            if (~this.field10011 >= ~this.field10012 && this.field10038 >= this.field9936) {
               OpenGL.glScissor(this.field9962 - -this.field10011, -this.field10038 + this.field9960 + this.field9732, -this.field10011 + this.field10012, -this.field9936 + this.field10038);
               if (client.field4530 == 0) {
                  break label22;
               }
            }

            OpenGL.glScissor(0, 0, 0, 0);
         }

         ++field9865;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[142] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lkc;Z)V"
   )
   public final void method4805(class143 arg0, boolean arg1) {
      try {
         label37: {
            ++field9766;
            if (!this.field10007) {
               if (~this.field9910 <= -4) {
                  throw new RuntimeException();
               }

               if (~this.field9910 <= -1) {
                  this.field9913[this.field9910].method909(9619);
               }

               this.field9906 = this.field9905 = this.field9913[++this.field9910] = arg0;
               this.field9906.method900(-23302);
               if (client.field4530 == 0) {
                  break label37;
               }
            }

            this.method4780(103, arg0);
            this.method4776(-4117, arg0);
         }

         if (arg1) {
            this.method569(-95, 77, -54, -60);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[28] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(IIII)V"
   )
   public final void method4806(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9878;
         OpenGL.glDrawArrays(arg3, arg1, arg0);
         if (arg2 <= -76) {
            ;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method4807(boolean arg0, boolean arg1) {
      try {
         if (!arg0) {
            if (this.field9928 == !arg1) {
               label25: {
                  if (!arg1) {
                     OpenGL.glDisable(2929);
                     if (client.field4530 == 0) {
                        break label25;
                     }
                  }

                  OpenGL.glEnable(2929);
               }

               this.field9928 = arg1;
               this.field9933 &= -32;
            }

            ++field9858;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[178] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lpg;[Lnia;Z)Lda;"
   )
   public final class67 method570(class763 arg0, class671[] arg1, boolean arg2) {
      try {
         ++field9701;
         return new class210(this, arg0, arg1, arg2);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[48] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IBIZ[B)Lgka;"
   )
   public final class390 method4808(int arg0, byte arg1, int arg2, boolean arg3, byte[] arg4) {
      try {
         ++field9756;
         int var6 = -77 / ((arg1 - 9) / 60);
         return (class390)(!this.field9941 || arg3 && !this.field9982 ? new class753(this, arg0, arg4, arg2) : new class362(this, arg0, arg4, arg2, arg3));
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[53] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(II)I"
   )
   public final int method560(int arg0, int arg1) {
      try {
         ++field9881;
         return arg0 | arg1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[51] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "n",
      descriptor = "()Z"
   )
   public final boolean method644() {
      try {
         ++field9859;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[173] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZII)V"
   )
   public final synchronized void method4809(boolean arg0, int arg1, int arg2) {
      try {
         if (!arg0) {
            this.method581();
         }

         ++field9798;
         class10 var4 = new class10(arg2);
         var4.field5280 = (long)arg1;
         this.field9919.method4060(23, var4);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[22] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZIZZ)V"
   )
   public final void method4810(boolean arg0, int arg1, boolean arg2, boolean arg3) {
      int var5 = client.field4530;

      try {
         ++field9742;
         if (arg3) {
            this.method4809(true, -58, 53);
         }

         if (this.field10041 != arg1 || this.field9990 == !this.field9958) {
            class251 var6;
            int var7;
            byte var8;
            int var9;
            int var10;
            label70: {
               var6 = null;
               var7 = 0;
               var8 = 0;
               var9 = 0;
               var10 = this.field9958 ? 3 : 0;
               if (~arg1 > -1) {
                  this.method4812((byte)72);
                  if (var5 == 0) {
                     break label70;
                  }
               }

               class327 var11;
               label71: {
                  var6 = this.field9895.method251(arg1, (byte)-94);
                  var11 = super.field813.method1159(arg1, 124);
                  if (var11.field4654 == 0 && var11.field4656 == 0) {
                     this.method4812((byte)72);
                     if (var5 == 0) {
                        break label71;
                     }
                  }

                  int var12 = var11.field4646 ? 64 : 128;
                  int var13 = var12 * 50;
                  this.method4843(0.0F, (byte)-20, (float)(this.field9898 % var13 * var11.field4656) / (float)var13, (float)(this.field9898 % var13 * var11.field4654) / (float)var13);
               }

               var7 = var11.field4645;
               if (!this.field9958) {
                  var9 = var11.field4644;
                  var10 = var11.field4655;
                  var8 = var11.field4642;
               }
            }

            this.field9893.method1295((byte)84, var8, arg0, var10, var9, arg2);
            if (!this.field9893.method1294((byte)80, var7, var6)) {
               this.method4818((byte)85, var6);
               this.method4796(false, var7);
            }

            this.field9990 = this.field9958;
            this.field10041 = arg1;
         }

         this.field9933 &= -8;
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field10053[82] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "(IIIIII)V"
   )
   public final void method588(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         float var7;
         float var8;
         label18: {
            ++field9780;
            this.method4855((byte)121);
            this.method4854(-3, arg5);
            var7 = (float)arg2 - (float)arg0;
            var8 = (float)(-arg1) + (float)arg3;
            if (var7 == 0.0F && var8 == 0.0F) {
               var7 = 1.0F;
               if (client.field4530 == 0) {
                  break label18;
               }
            }

            float var9 = (float)(1.0D / Math.sqrt((double)(var7 * var7 + var8 * var8)));
            var8 *= var9;
            var7 *= var9;
         }

         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glVertex2f((float)arg2 + var7 + 0.35F, (float)arg3 + var8 + 0.35F);
         OpenGL.glEnd();
      } catch (RuntimeException var11) {
         throw class670.method4877(var11, field10053[191] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method4811(int arg0, boolean arg1) {
      try {
         if (!arg1 == this.field9931) {
            this.field9931 = arg1;
            this.method4802(30);
            this.field9933 &= -32;
         }

         if (arg0 != -32) {
            this.method622(false);
         }

         ++field9794;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[126] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "C",
      descriptor = "(Z)V"
   )
   public final void method622(boolean arg0) {
      try {
         ++field9809;
         this.field9964 = arg0;
         this.method4802(31);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[135] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Luaa;Luaa;FLuaa;)Luaa;"
   )
   public final class126 method608(class126 arg0, class126 arg1, float arg2, class126 arg3) {
      try {
         ++field9868;
         if (arg0 != null && arg1 != null && this.field10026 && this.field9957) {
            class487 var5 = null;
            class81 var6 = (class81)arg0;
            class81 var7 = (class81)arg1;
            class355 var8 = var6.method758(false);
            class355 var9 = var7.method758(false);
            if (var8 != null && var9 != null) {
               int var10 = var8.field5386 <= var9.field5386 ? var9.field5386 : var8.field5386;
               if (arg0 != arg3 && arg1 != arg3 && arg3 instanceof class487) {
                  class487 var11 = (class487)arg3;
                  if (var11.method3614((byte)-101) == var10) {
                     var5 = var11;
                  }
               }

               if (var5 == null) {
                  var5 = new class487(this, var10);
               }

               if (var5.method3609(var9, var8, (byte)125, arg2)) {
                  return var5;
               }
            }
         }

         return !(arg2 < 0.5F) ? arg1 : arg0;
      } catch (RuntimeException var13) {
         throw class670.method4877(var13, field10053[94] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ',' + arg2 + ',' + (arg3 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "T",
      descriptor = "(IIII)V"
   )
   public final void method598(int arg0, int arg1, int arg2, int arg3) {
      try {
         if (arg2 < this.field10012) {
            this.field10012 = arg2;
         }

         if (~arg1 < ~this.field9936) {
            this.field9936 = arg1;
         }

         if (~this.field10011 > ~arg0) {
            this.field10011 = arg0;
         }

         ++field9832;
         if (~this.field10038 < ~arg3) {
            this.field10038 = arg3;
         }

         OpenGL.glEnable(3089);
         this.method4813(true);
         this.method4804(82);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[131] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "([IIIIIZ)Lat;"
   )
   public final class396 method603(int[] arg0, int arg1, int arg2, int arg3, int arg4, boolean arg5) {
      try {
         ++field9885;
         return new class638(this, arg3, arg4, arg0, arg1, arg2);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[125] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "(B)V"
   )
   private final void method4812(byte arg0) {
      try {
         if (arg0 != 72) {
            this.method4847((class380)null, -124, (class380)null, (class380)null, (class380)null);
         }

         if (this.field10025) {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            this.field10025 = false;
         }

         ++field9819;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[216] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "(Z)V"
   )
   private final void method4813(boolean arg0) {
      try {
         this.field9981 = (float)(-this.field9940 + this.field10038);
         if (arg0) {
            this.field9965 = (float)(-this.field10003 + this.field10012);
            this.field9944 = (float)(this.field9936 - this.field9940);
            ++field9691;
            this.field10027 = (float)(-this.field10003 + this.field10011);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[144] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(II)Llba;"
   )
   public final class575 method578(int arg0, int arg1) {
      try {
         ++field9740;
         return null;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[143] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(I)V"
   )
   public final synchronized void method555(int arg0) {
      int var2 = client.field4530;

      try {
         ++field9757;
         int var15 = arg0 & Integer.MAX_VALUE;
         int var3 = 0;
         int var10000;
         if (var2 != 0 || !this.field9919.method4068(false)) {
            do {
               class10 var4 = (class10)this.field9919.method4063(-5);
               class663.field9637[var3++] = (int)var4.field5280;
               this.field9917 -= var4.field141;
               var10000 = ~var3;

               while(var10000 == -1001) {
                  OpenGL.glDeleteBuffersARB(var3, class663.field9637, 0);
                  var10000 = 0;
                  if (var2 == 0) {
                     var3 = 0;
                     break;
                  }
               }
            } while(!this.field9919.method4068(false));
         }

         class10 var5;
         class10 var6;
         class10 var7;
         boolean var8;
         class10 var9;
         class347 var10;
         class347 var11;
         class10 var12;
         byte var16;
         class667 var18;
         if (~var3 < -1) {
            OpenGL.glDeleteBuffersARB(var3, class663.field9637, 0);
            var3 = 0;
            if (var2 != 0) {
               var5 = (class10)this.field9920.method4063(-5);
               class663.field9637[var3++] = (int)var5.field5280;
               this.field9915 -= var5.field141;
               var10000 = var3;
            } else {
               if (this.field9920.method4068(false)) {
                  label687: {
                     if (var3 > 0) {
                        OpenGL.glDeleteTextures(var3, class663.field9637, 0);
                        var3 = 0;
                        if (var2 != 0) {
                           var6 = (class10)this.field9921.method4063(-5);
                           class663.field9637[var3++] = var6.field141;
                           var10000 = var3;
                        } else {
                           if (this.field9921.method4068(false)) {
                              break label687;
                           }

                           var6 = (class10)this.field9921.method4063(-5);
                           class663.field9637[var3++] = var6.field141;
                           var10000 = var3;
                        }
                     } else {
                        if (this.field9921.method4068(false)) {
                           break label687;
                        }

                        var6 = (class10)this.field9921.method4063(-5);
                        class663.field9637[var3++] = var6.field141;
                        var10000 = var3;
                     }

                     while(true) {
                        while(var10000 == 1000) {
                           OpenGL.glDeleteFramebuffersEXT(var3, class663.field9637, 0);
                           var10000 = 0;
                           if (var2 == 0) {
                              var3 = 0;
                              break;
                           }
                        }

                        if (this.field9921.method4068(false)) {
                           break;
                        }

                        var6 = (class10)this.field9921.method4063(-5);
                        class663.field9637[var3++] = var6.field141;
                        var10000 = var3;
                     }
                  }

                  if (~var3 < -1) {
                     OpenGL.glDeleteFramebuffersEXT(var3, class663.field9637, 0);
                     var16 = 0;
                     if (var2 != 0) {
                        var7 = (class10)this.field9922.method4063(-5);
                        var3 = var16 + 1;
                        class663.field9637[var16] = (int)var7.field5280;
                        this.field9918 -= var7.field141;
                        var10000 = ~var3;
                     } else {
                        if (this.field9922.method4068(false)) {
                           label745: {
                              if (~var16 < -1) {
                                 OpenGL.glDeleteRenderbuffersEXT(var16, class663.field9637, 0);
                                 var8 = false;
                                 if (var2 == 0 && this.field9916.method4068(false)) {
                                    break label745;
                                 }
                              } else if (this.field9916.method4068(false)) {
                                 break label745;
                              }

                              do {
                                 var9 = (class10)this.field9916.method4063(-5);
                                 OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                              } while(!this.field9916.method4068(false));
                           }

                           if (var2 != 0) {
                              var10 = this.field9923.method4063(-5);
                              OpenGL.glDeleteProgramARB((int)var10.field5280);
                           }

                           while(!this.field9923.method4068(false)) {
                              var10 = this.field9923.method4063(-5);
                              OpenGL.glDeleteProgramARB((int)var10.field5280);
                           }

                           if (var2 != 0 || !this.field9924.method4068(false)) {
                              do {
                                 var11 = this.field9924.method4063(-5);
                                 OpenGL.glDeleteObjectARB(var11.field5280);
                              } while(!this.field9924.method4068(false));
                           }

                           if (var2 != 0) {
                              var12 = (class10)this.field9916.method4063(-5);
                              OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                           }

                           while(true) {
                              if (this.field9916.method4068(false)) {
                                 this.field9895.method249((byte)110);
                                 var18 = this;
                                 if (var2 == 0) {
                                    if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                       System.gc();
                                       this.field9930 = class188.method1462(true);
                                    }

                                    this.field9898 = var15;
                                    return;
                                 }
                              } else {
                                 var18 = this;
                              }

                              var12 = (class10)var18.field9916.method4063(-5);
                              OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                           }
                        }

                        var7 = (class10)this.field9922.method4063(-5);
                        var3 = var16 + 1;
                        class663.field9637[var16] = (int)var7.field5280;
                        this.field9918 -= var7.field141;
                        var10000 = ~var3;
                     }
                  } else {
                     if (this.field9922.method4068(false)) {
                        label831: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                              var8 = false;
                              if (var2 == 0 && this.field9916.method4068(false)) {
                                 break label831;
                              }
                           } else if (this.field9916.method4068(false)) {
                              break label831;
                           }

                           do {
                              var9 = (class10)this.field9916.method4063(-5);
                              OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                           } while(!this.field9916.method4068(false));
                        }

                        if (var2 != 0) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        while(!this.field9923.method4068(false)) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        if (var2 != 0 || !this.field9924.method4068(false)) {
                           do {
                              var11 = this.field9924.method4063(-5);
                              OpenGL.glDeleteObjectARB(var11.field5280);
                           } while(!this.field9924.method4068(false));
                        }

                        if (var2 != 0) {
                           var12 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }

                        while(true) {
                           if (this.field9916.method4068(false)) {
                              this.field9895.method249((byte)110);
                              var18 = this;
                              if (var2 == 0) {
                                 if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                    System.gc();
                                    this.field9930 = class188.method1462(true);
                                 }

                                 this.field9898 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class10)var18.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }
                     }

                     var7 = (class10)this.field9922.method4063(-5);
                     class663.field9637[var3++] = (int)var7.field5280;
                     this.field9918 -= var7.field141;
                     var10000 = ~var3;
                  }

                  while(true) {
                     while(var10000 == -1001) {
                        OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                        var10000 = 0;
                        if (var2 == 0) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9922.method4068(false)) {
                        label930: {
                           if (~var3 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                              var8 = false;
                              if (var2 == 0 && this.field9916.method4068(false)) {
                                 break label930;
                              }
                           } else if (this.field9916.method4068(false)) {
                              break label930;
                           }

                           do {
                              var9 = (class10)this.field9916.method4063(-5);
                              OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                           } while(!this.field9916.method4068(false));
                        }

                        if (var2 != 0) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        while(!this.field9923.method4068(false)) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        if (var2 != 0 || !this.field9924.method4068(false)) {
                           do {
                              var11 = this.field9924.method4063(-5);
                              OpenGL.glDeleteObjectARB(var11.field5280);
                           } while(!this.field9924.method4068(false));
                        }

                        if (var2 != 0) {
                           var12 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }

                        while(true) {
                           if (this.field9916.method4068(false)) {
                              this.field9895.method249((byte)110);
                              var18 = this;
                              if (var2 == 0) {
                                 if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                    System.gc();
                                    this.field9930 = class188.method1462(true);
                                 }

                                 this.field9898 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class10)var18.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }
                     }

                     var7 = (class10)this.field9922.method4063(-5);
                     class663.field9637[var3++] = (int)var7.field5280;
                     this.field9918 -= var7.field141;
                     var10000 = ~var3;
                  }
               }

               var5 = (class10)this.field9920.method4063(-5);
               class663.field9637[var3++] = (int)var5.field5280;
               this.field9915 -= var5.field141;
               var10000 = var3;
            }
         } else {
            if (this.field9920.method4068(false)) {
               label357: {
                  if (var3 > 0) {
                     OpenGL.glDeleteTextures(var3, class663.field9637, 0);
                     var3 = 0;
                     if (var2 != 0) {
                        var6 = (class10)this.field9921.method4063(-5);
                        class663.field9637[var3++] = var6.field141;
                        var10000 = var3;
                     } else {
                        if (this.field9921.method4068(false)) {
                           break label357;
                        }

                        var6 = (class10)this.field9921.method4063(-5);
                        class663.field9637[var3++] = var6.field141;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field9921.method4068(false)) {
                        break label357;
                     }

                     var6 = (class10)this.field9921.method4063(-5);
                     class663.field9637[var3++] = var6.field141;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class663.field9637, 0);
                        var10000 = 0;
                        if (var2 == 0) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9921.method4068(false)) {
                        break;
                     }

                     var6 = (class10)this.field9921.method4063(-5);
                     class663.field9637[var3++] = var6.field141;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class663.field9637, 0);
                  var16 = 0;
                  if (var2 != 0) {
                     var7 = (class10)this.field9922.method4063(-5);
                     var3 = var16 + 1;
                     class663.field9637[var16] = (int)var7.field5280;
                     this.field9918 -= var7.field141;
                     var10000 = ~var3;
                  } else {
                     if (this.field9922.method4068(false)) {
                        label415: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class663.field9637, 0);
                              var8 = false;
                              if (var2 == 0 && this.field9916.method4068(false)) {
                                 break label415;
                              }
                           } else if (this.field9916.method4068(false)) {
                              break label415;
                           }

                           do {
                              var9 = (class10)this.field9916.method4063(-5);
                              OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                           } while(!this.field9916.method4068(false));
                        }

                        if (var2 != 0) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        while(!this.field9923.method4068(false)) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        if (var2 != 0 || !this.field9924.method4068(false)) {
                           do {
                              var11 = this.field9924.method4063(-5);
                              OpenGL.glDeleteObjectARB(var11.field5280);
                           } while(!this.field9924.method4068(false));
                        }

                        if (var2 != 0) {
                           var12 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }

                        while(true) {
                           if (this.field9916.method4068(false)) {
                              this.field9895.method249((byte)110);
                              var18 = this;
                              if (var2 == 0) {
                                 if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                    System.gc();
                                    this.field9930 = class188.method1462(true);
                                 }

                                 this.field9898 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class10)var18.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }
                     }

                     var7 = (class10)this.field9922.method4063(-5);
                     var3 = var16 + 1;
                     class663.field9637[var16] = (int)var7.field5280;
                     this.field9918 -= var7.field141;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field9922.method4068(false)) {
                     label501: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                           var8 = false;
                           if (var2 == 0 && this.field9916.method4068(false)) {
                              break label501;
                           }
                        } else if (this.field9916.method4068(false)) {
                           break label501;
                        }

                        do {
                           var9 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                        } while(!this.field9916.method4068(false));
                     }

                     if (var2 != 0) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     while(!this.field9923.method4068(false)) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     if (var2 != 0 || !this.field9924.method4068(false)) {
                        do {
                           var11 = this.field9924.method4063(-5);
                           OpenGL.glDeleteObjectARB(var11.field5280);
                        } while(!this.field9924.method4068(false));
                     }

                     if (var2 != 0) {
                        var12 = (class10)this.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }

                     while(true) {
                        if (this.field9916.method4068(false)) {
                           this.field9895.method249((byte)110);
                           var18 = this;
                           if (var2 == 0) {
                              if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                 System.gc();
                                 this.field9930 = class188.method1462(true);
                              }

                              this.field9898 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class10)var18.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }
                  }

                  var7 = (class10)this.field9922.method4063(-5);
                  class663.field9637[var3++] = (int)var7.field5280;
                  this.field9918 -= var7.field141;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                     var10000 = 0;
                     if (var2 == 0) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9922.method4068(false)) {
                     label600: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                           var8 = false;
                           if (var2 == 0 && this.field9916.method4068(false)) {
                              break label600;
                           }
                        } else if (this.field9916.method4068(false)) {
                           break label600;
                        }

                        do {
                           var9 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                        } while(!this.field9916.method4068(false));
                     }

                     if (var2 != 0) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     while(!this.field9923.method4068(false)) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     if (var2 != 0 || !this.field9924.method4068(false)) {
                        do {
                           var11 = this.field9924.method4063(-5);
                           OpenGL.glDeleteObjectARB(var11.field5280);
                        } while(!this.field9924.method4068(false));
                     }

                     if (var2 != 0) {
                        var12 = (class10)this.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }

                     while(true) {
                        if (this.field9916.method4068(false)) {
                           this.field9895.method249((byte)110);
                           var18 = this;
                           if (var2 == 0) {
                              if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                 System.gc();
                                 this.field9930 = class188.method1462(true);
                              }

                              this.field9898 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class10)var18.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }
                  }

                  var7 = (class10)this.field9922.method4063(-5);
                  class663.field9637[var3++] = (int)var7.field5280;
                  this.field9918 -= var7.field141;
                  var10000 = ~var3;
               }
            }

            var5 = (class10)this.field9920.method4063(-5);
            class663.field9637[var3++] = (int)var5.field5280;
            this.field9915 -= var5.field141;
            var10000 = var3;
         }

         while(true) {
            while(var10000 == 1000) {
               OpenGL.glDeleteTextures(var3, class663.field9637, 0);
               var10000 = 0;
               if (var2 == 0) {
                  var3 = 0;
                  break;
               }
            }

            if (this.field9920.method4068(false)) {
               label137: {
                  if (var3 > 0) {
                     OpenGL.glDeleteTextures(var3, class663.field9637, 0);
                     var3 = 0;
                     if (var2 != 0) {
                        var6 = (class10)this.field9921.method4063(-5);
                        class663.field9637[var3++] = var6.field141;
                        var10000 = var3;
                     } else {
                        if (this.field9921.method4068(false)) {
                           break label137;
                        }

                        var6 = (class10)this.field9921.method4063(-5);
                        class663.field9637[var3++] = var6.field141;
                        var10000 = var3;
                     }
                  } else {
                     if (this.field9921.method4068(false)) {
                        break label137;
                     }

                     var6 = (class10)this.field9921.method4063(-5);
                     class663.field9637[var3++] = var6.field141;
                     var10000 = var3;
                  }

                  while(true) {
                     while(var10000 == 1000) {
                        OpenGL.glDeleteFramebuffersEXT(var3, class663.field9637, 0);
                        var10000 = 0;
                        if (var2 == 0) {
                           var3 = 0;
                           break;
                        }
                     }

                     if (this.field9921.method4068(false)) {
                        break;
                     }

                     var6 = (class10)this.field9921.method4063(-5);
                     class663.field9637[var3++] = var6.field141;
                     var10000 = var3;
                  }
               }

               if (~var3 < -1) {
                  OpenGL.glDeleteFramebuffersEXT(var3, class663.field9637, 0);
                  var16 = 0;
                  if (var2 != 0) {
                     var7 = (class10)this.field9922.method4063(-5);
                     var3 = var16 + 1;
                     class663.field9637[var16] = (int)var7.field5280;
                     this.field9918 -= var7.field141;
                     var10000 = ~var3;
                  } else {
                     if (this.field9922.method4068(false)) {
                        label237: {
                           if (~var16 < -1) {
                              OpenGL.glDeleteRenderbuffersEXT(var16, class663.field9637, 0);
                              var8 = false;
                              if (var2 == 0 && this.field9916.method4068(false)) {
                                 break label237;
                              }
                           } else if (this.field9916.method4068(false)) {
                              break label237;
                           }

                           do {
                              var9 = (class10)this.field9916.method4063(-5);
                              OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                           } while(!this.field9916.method4068(false));
                        }

                        if (var2 != 0) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        while(!this.field9923.method4068(false)) {
                           var10 = this.field9923.method4063(-5);
                           OpenGL.glDeleteProgramARB((int)var10.field5280);
                        }

                        if (var2 != 0 || !this.field9924.method4068(false)) {
                           do {
                              var11 = this.field9924.method4063(-5);
                              OpenGL.glDeleteObjectARB(var11.field5280);
                           } while(!this.field9924.method4068(false));
                        }

                        if (var2 != 0) {
                           var12 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }

                        while(true) {
                           if (this.field9916.method4068(false)) {
                              this.field9895.method249((byte)110);
                              var18 = this;
                              if (var2 == 0) {
                                 if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                    System.gc();
                                    this.field9930 = class188.method1462(true);
                                 }

                                 this.field9898 = var15;
                                 return;
                              }
                           } else {
                              var18 = this;
                           }

                           var12 = (class10)var18.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                        }
                     }

                     var7 = (class10)this.field9922.method4063(-5);
                     var3 = var16 + 1;
                     class663.field9637[var16] = (int)var7.field5280;
                     this.field9918 -= var7.field141;
                     var10000 = ~var3;
                  }
               } else {
                  if (this.field9922.method4068(false)) {
                     label150: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                           var8 = false;
                           if (var2 == 0 && this.field9916.method4068(false)) {
                              break label150;
                           }
                        } else if (this.field9916.method4068(false)) {
                           break label150;
                        }

                        do {
                           var9 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                        } while(!this.field9916.method4068(false));
                     }

                     if (var2 != 0) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     while(!this.field9923.method4068(false)) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     if (var2 != 0 || !this.field9924.method4068(false)) {
                        do {
                           var11 = this.field9924.method4063(-5);
                           OpenGL.glDeleteObjectARB(var11.field5280);
                        } while(!this.field9924.method4068(false));
                     }

                     if (var2 != 0) {
                        var12 = (class10)this.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }

                     while(true) {
                        if (this.field9916.method4068(false)) {
                           this.field9895.method249((byte)110);
                           var18 = this;
                           if (var2 == 0) {
                              if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                 System.gc();
                                 this.field9930 = class188.method1462(true);
                              }

                              this.field9898 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class10)var18.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }
                  }

                  var7 = (class10)this.field9922.method4063(-5);
                  class663.field9637[var3++] = (int)var7.field5280;
                  this.field9918 -= var7.field141;
                  var10000 = ~var3;
               }

               while(true) {
                  while(var10000 == -1001) {
                     OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                     var10000 = 0;
                     if (var2 == 0) {
                        var3 = 0;
                        break;
                     }
                  }

                  if (this.field9922.method4068(false)) {
                     label99: {
                        if (~var3 < -1) {
                           OpenGL.glDeleteRenderbuffersEXT(var3, class663.field9637, 0);
                           var8 = false;
                           if (var2 == 0 && this.field9916.method4068(false)) {
                              break label99;
                           }
                        } else if (this.field9916.method4068(false)) {
                           break label99;
                        }

                        do {
                           var9 = (class10)this.field9916.method4063(-5);
                           OpenGL.glDeleteLists((int)var9.field5280, var9.field141);
                        } while(!this.field9916.method4068(false));
                     }

                     if (var2 != 0) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     while(!this.field9923.method4068(false)) {
                        var10 = this.field9923.method4063(-5);
                        OpenGL.glDeleteProgramARB((int)var10.field5280);
                     }

                     if (var2 != 0 || !this.field9924.method4068(false)) {
                        do {
                           var11 = this.field9924.method4063(-5);
                           OpenGL.glDeleteObjectARB(var11.field5280);
                        } while(!this.field9924.method4068(false));
                     }

                     if (var2 != 0) {
                        var12 = (class10)this.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }

                     while(true) {
                        if (this.field9916.method4068(false)) {
                           this.field9895.method249((byte)110);
                           var18 = this;
                           if (var2 == 0) {
                              if (~this.method565() < -100663297 && class188.method1462(true) > this.field9930 + 60000L) {
                                 System.gc();
                                 this.field9930 = class188.method1462(true);
                              }

                              this.field9898 = var15;
                              return;
                           }
                        } else {
                           var18 = this;
                        }

                        var12 = (class10)var18.field9916.method4063(-5);
                        OpenGL.glDeleteLists((int)var12.field5280, var12.field141);
                     }
                  }

                  var7 = (class10)this.field9922.method4063(-5);
                  class663.field9637[var3++] = (int)var7.field5280;
                  this.field9918 -= var7.field141;
                  var10000 = ~var3;
               }
            }

            var5 = (class10)this.field9920.method4063(-5);
            class663.field9637[var3++] = (int)var5.field5280;
            this.field9915 -= var5.field141;
            var10000 = var3;
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field10053[145] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "ra",
      descriptor = "(IIII)V"
   )
   public final void method558(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9958 = true;
         this.field9983 = arg1;
         this.field9951 = arg0;
         this.field9949 = arg3;
         this.field10035 = arg2;
         ++field9839;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[69] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "h",
      descriptor = "()Z"
   )
   public final boolean method604() {
      try {
         ++field9738;
         return this.field9891 != null && (~this.field9894 >= -2 || this.field10029);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[71] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(IIII)V"
   )
   public final void method4814(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9698;
         OpenGL.glTexEnvi(8960, arg1 + 34176, arg2);
         if (arg0 != 7681) {
            this.method641(-114, -6, 100, 61);
         }

         OpenGL.glTexEnvi(8960, arg1 + 34192, arg3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[65] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "x",
      descriptor = "()Z"
   )
   public final boolean method657() {
      try {
         ++field9765;
         return this.field9891 != null && this.field9891.method3588(-119);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[194] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(II[I[I)Laa;"
   )
   public final class512 method572(int arg0, int arg1, int[] arg2, int[] arg3) {
      try {
         ++field9871;
         return class101.method885(this, (byte)-126, arg2, arg1, arg0, arg3);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[199] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10053[10] : field10053[9]) + ',' + (arg3 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Loda;)V"
   )
   public final void method562(class127 arg0) {
      try {
         ++field9884;
         this.field9889.method4523(this, (byte)68, -1, arg0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[41] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(BLuga;)V"
   )
   public final void method4815(byte arg0, class218 arg1) {
      try {
         ++field9821;
         OpenGL.glPushMatrix();
         OpenGL.glMultMatrixf(arg1.method1649(-72), 0);
         int var3 = 77 % ((arg0 - -30) / 32);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[36] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "y",
      descriptor = "()Z"
   )
   public final boolean method634() {
      try {
         ++field9683;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[29] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "l",
      descriptor = "()Z"
   )
   public final boolean method544() {
      try {
         ++field9792;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(III)V"
   )
   public static final void method4816(int arg0, int arg1, int arg2) {
      try {
         ++field9767;
         class403 var3 = class453.method3410(0L, true, 15);
         if (arg2 != 4611) {
            field9702 = null;
         }

         var3.method3093(22144);
         var3.field6185 = arg0;
         var3.field6183 = arg1;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[50] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method4817(byte arg0) {
      try {
         if (~this.field9933 != -3) {
            this.method4845(0);
            this.method4795((byte)100, false);
            this.method4822(-126, false);
            this.method4807(false, false);
            this.method4811(-32, false);
            this.method4840(-2, (byte)125);
            this.field9933 = 2;
         }

         ++field9857;
         if (arg0 >= -47) {
            this.field10036 = -0.18570061F;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[176] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(BLbca;)V"
   )
   public final void method4818(byte arg0, class689 arg1) {
      int var3 = client.field4530;

      try {
         ++field9835;
         class689 var4 = this.field9979[this.field10033];
         if (arg1 != var4) {
            label39: {
               if (arg1 != null) {
                  label36: {
                     if (var4 == null) {
                        OpenGL.glEnable(arg1.field10376);
                        if (var3 == 0) {
                           break label36;
                        }
                     }

                     if (~arg1.field10376 != ~var4.field10376) {
                        OpenGL.glDisable(var4.field10376);
                        OpenGL.glEnable(arg1.field10376);
                     }
                  }

                  OpenGL.glBindTexture(arg1.field10376, arg1.method5021((byte)42));
                  if (var3 == 0) {
                     break label39;
                  }
               }

               OpenGL.glDisable(var4.field10376);
            }

            this.field9979[this.field10033] = arg1;
         }

         int var5 = 68 % ((arg0 - -49) / 54);
         this.field9933 &= -2;
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[63] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(I)V"
   )
   public final void method574(int arg0) {
      try {
         ++field9696;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[198] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "EA",
      descriptor = "(IIII)V"
   )
   public final void method641(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9823;
         if (!this.field9958) {
            throw new RuntimeException("");
         } else {
            this.field9983 = arg1;
            this.field9949 = arg3;
            this.field9951 = arg0;
            this.field10035 = arg2;
            if (this.field9990) {
               this.field9893.field1978.method1800(108);
               this.field9893.field1978.method1798(34336);
            }
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[23] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "i",
      descriptor = "()I"
   )
   public final int method635() {
      try {
         ++field9714;
         return this.field9963;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[11] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "x",
      descriptor = "(I)V"
   )
   private final void method4819(int arg0) {
      try {
         ++field9817;
         if (arg0 != -1) {
            this.field10046 = null;
         }

         this.field9866.method4692();
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[88] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(IIIIII)V"
   )
   public final void method553(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9768;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7 - 1.0F;
         this.method4855((byte)-86);
         float var10 = (float)arg3 + var8 - 1.0F;
         this.method4854(-3, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9994) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(2);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9994) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10053[139] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "()Z"
   )
   public final boolean method573() {
      try {
         ++field9686;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[179] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIIIF)Llja;"
   )
   public final class744 method611(int arg0, int arg1, int arg2, int arg3, int arg4, float arg5) {
      try {
         ++field9879;
         return new class357(arg0, arg1, arg2, arg3, arg4, arg5);
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[224] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(Z)V"
   )
   public final void method543(boolean arg0) {
      try {
         ++field9828;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[154] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "g",
      descriptor = "(Z)V"
   )
   public final void method4820(boolean arg0) {
      try {
         if (~this.field9933 != -9) {
            this.method4827(true);
            this.method4795((byte)100, true);
            this.method4807(false, true);
            this.method4811(-32, true);
            this.method4854(-3, 1);
            this.field9933 = 8;
         }

         ++field9816;
         if (arg0) {
            this.method4775(-13);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(BZ)V"
   )
   public final void method4821(byte arg0, boolean arg1) {
      try {
         if (arg0 != 5) {
            this.method4832((byte)-101, 17L);
         }

         if (this.field10015 == !arg1) {
            this.field10015 = arg1;
            this.method4835(arg0 ^ 5);
         }

         ++field9863;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[62] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(IZ)V"
   )
   public final void method4822(int arg0, boolean arg1) {
      try {
         ++field9772;
         if (!this.field10008 == arg1) {
            this.field10008 = arg1;
            this.method4835(0);
            this.field9933 &= -8;
         }

         int var3 = 127 / ((-68 - arg0) / 49);
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public final void method4823(int arg0, int arg1, int arg2, byte arg3) {
      try {
         if (arg3 < 49) {
            this.method591();
         }

         ++field9724;
         OpenGL.glTexEnvi(8960, 34184 - -arg1, arg0);
         OpenGL.glTexEnvi(8960, arg1 + 34200, arg2);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIII)V"
   )
   public final void method633(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field9892.method5345(arg0, arg2, arg3, arg1, 0);
         ++field9870;
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[46] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "K",
      descriptor = "([I)V"
   )
   public final void method618(int[] arg0) {
      try {
         arg0[1] = this.field9936;
         arg0[0] = this.field10011;
         arg0[3] = this.field10038;
         ++field9862;
         arg0[2] = this.field10012;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[57] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "E",
      descriptor = "()I"
   )
   public final int method565() {
      try {
         ++field9808;
         return this.field9918 + this.field9917 - -this.field9915;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[228] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "la",
      descriptor = "()V"
   )
   public final void method607() {
      try {
         this.field10012 = this.field9802;
         this.field10038 = this.field9732;
         this.field10011 = 0;
         this.field9936 = 0;
         ++field9707;
         OpenGL.glDisable(3089);
         this.method4813(true);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[161] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZII[BB)Lsha;"
   )
   public final class758 method4824(boolean arg0, int arg1, int arg2, byte[] arg3, byte arg4) {
      try {
         ++field9853;
         if (!this.field9941 || arg0 && !this.field9982) {
            int var6 = 40 / ((69 - arg4) / 34);
            return new class318(this, arg2, arg3, arg1);
         } else {
            return new class119(this, arg2, arg3, arg1, arg0);
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[203] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10053[10] : field10053[9]) + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "p",
      descriptor = "()V"
   )
   public final void method614() {
      try {
         ++field9758;
         if (this.field9972 && this.field9802 > 0 && ~this.field9732 < -1) {
            int var1 = this.field10011;
            int var2 = this.field10012;
            int var3 = this.field9936;
            int var4 = this.field10038;
            this.method607();
            OpenGL.glReadBuffer(1028);
            OpenGL.glDrawBuffer(1029);
            this.method4794(-13674);
            this.method4795((byte)100, false);
            this.method4822(-121, false);
            this.method4807(false, false);
            this.method4811(-32, false);
            this.method4818((byte)-103, (class689)null);
            this.method4840(-2, (byte)125);
            this.method4796(false, 1);
            this.method4854(-3, 0);
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            OpenGL.glOrtho(0.0D, 1.0D, 0.0D, 1.0D, -1.0D, 1.0D);
            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            OpenGL.glRasterPos2i(0, 0);
            OpenGL.glCopyPixels(0, 0, this.field9802, this.field9732, 6144);
            OpenGL.glFlush();
            OpenGL.glReadBuffer(1029);
            OpenGL.glDrawBuffer(1029);
            this.method554(var1, var3, var2, var4);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[32] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method584(Canvas arg0, int arg1, int arg2) {
      try {
         long var4;
         label46: {
            ++field9824;
            var4 = 0L;
            if (arg0 == null || this.field9814 == arg0) {
               var4 = this.field9875;
               if (client.field4530 == 0) {
                  break label46;
               }
            }

            if (this.field9831.containsKey(arg0)) {
               Long var6 = (Long)this.field9831.get(arg0);
               var4 = var6;
            }
         }

         if (~var4 == -1L) {
            throw new RuntimeException();
         } else {
            this.field9866.surfaceResized(var4);
            if (this.field9709 == arg0) {
               this.method4833(-17767);
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[170] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "(I)V"
   )
   public final void method628(int arg0) {
      try {
         ++field9791;
         if (~arg0 != -2) {
            throw new IllegalArgumentException("");
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[21] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "v",
      descriptor = "(I)V"
   )
   private final void method4825(int arg0) {
      try {
         label29: {
            ++field9861;
            if (!this.field9938 || this.field10031 < 0) {
               OpenGL.glDisable(2912);
               if (client.field4530 == 0) {
                  break label29;
               }
            }

            OpenGL.glEnable(2912);
         }

         if (arg0 != -20986) {
            this.field10011 = -121;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[172] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "L",
      descriptor = "(III)V"
   )
   public final void method540(int arg0, int arg1, int arg2) {
      try {
         ++field9748;
         if (this.field10028 != arg0 || ~this.field10031 != ~arg1 || ~this.field9992 != ~arg2) {
            this.field9992 = arg2;
            this.field10031 = arg1;
            this.field10028 = arg0;
            this.method4829((byte)-118);
            this.method4825(-20986);
         }

      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[61] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "()Lqha;"
   )
   public final class110 method595() {
      int var1 = client.field4530;

      try {
         ++field9852;
         int var2 = -1;
         if (this.field10039.indexOf(field10053[78]) == -1) {
            if (~this.field10039.indexOf(field10053[81]) != 0) {
               var2 = 32902;
               if (var1 == 0) {
                  return new class110(var2, field10053[80], this.field10023, this.field10046, 0L);
               }
            }

            if (~this.field10039.indexOf(field10053[79]) == 0) {
               return new class110(var2, field10053[80], this.field10023, this.field10046, 0L);
            }

            var2 = 4098;
            if (var1 == 0) {
               return new class110(var2, field10053[80], this.field10023, this.field10046, 0L);
            }
         }

         var2 = 4318;
         return new class110(var2, field10053[80], this.field10023, this.field10046, 0L);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[77] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "r",
      descriptor = "(IIIIIII)I"
   )
   public final int method590(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var8 = client.field4530;

      try {
         int var11;
         label58: {
            ++field9850;
            float var9 = (float)arg2 * this.field9926.field2746 + (float)arg0 * this.field9926.field2749 + (float)arg1 * this.field9926.field2748 + this.field9926.field2750;
            float var10 = (float)arg5 * this.field9926.field2746 + (float)arg3 * this.field9926.field2749 + (float)arg4 * this.field9926.field2748 + this.field9926.field2750;
            var11 = 0;
            if ((float)this.field9963 > var9 && (float)this.field9963 > var10) {
               var11 |= 16;
               if (var8 == 0) {
                  break label58;
               }
            }

            if (var9 > (float)this.field9976 && var10 > (float)this.field9976) {
               var11 |= 32;
            }
         }

         label52: {
            int var12 = (int)(((float)arg2 * this.field9926.field2758 + (float)arg0 * this.field9926.field2762 + (float)arg1 * this.field9926.field2756 + this.field9926.field2761) * (float)this.field9945 / (float)arg6);
            int var13 = (int)(((float)arg5 * this.field9926.field2758 + (float)arg3 * this.field9926.field2762 + (float)arg4 * this.field9926.field2756 + this.field9926.field2761) * (float)this.field9945 / (float)arg6);
            if (this.field10027 > (float)var12 && (float)var13 < this.field10027) {
               var11 |= 1;
               if (var8 == 0) {
                  break label52;
               }
            }

            if (this.field9965 < (float)var12 && (float)var13 > this.field9965) {
               var11 |= 2;
            }
         }

         int var14 = (int)(((float)arg2 * this.field9926.field2763 + (float)arg0 * this.field9926.field2754 + (float)arg1 * this.field9926.field2769 + this.field9926.field2773) * (float)this.field10024 / (float)arg6);
         int var15 = (int)(((float)arg5 * this.field9926.field2763 + (float)arg3 * this.field9926.field2754 + (float)arg4 * this.field9926.field2769 + this.field9926.field2773) * (float)this.field10024 / (float)arg6);
         if (this.field9944 > (float)var14 && (float)var15 < this.field9944) {
            var11 |= 4;
            if (var8 == 0) {
               return var11;
            }
         }

         if (this.field9981 < (float)var14 && this.field9981 < (float)var15) {
            var11 |= 8;
         }

         return var11;
      } catch (RuntimeException var17) {
         throw class670.method4877(var17, field10053[174] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "q",
      descriptor = "(I)V"
   )
   public static void method4826(int arg0) {
      try {
         field9829 = null;
         if (arg0 != 4617) {
            field9877 = true;
         }

         field9769 = null;
         field9702 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[19] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lgq;)V"
   )
   public final void method550(class540 arg0) {
      try {
         this.field9926.method1513(arg0);
         ++field9883;
         this.field9934.method1513(this.field9926);
         this.field9934.method1648(-2686);
         this.field9935.method1646((byte)116, this.field9934);
         if (this.field10045 != 1) {
            this.method4830(true);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[34] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "(Z)V"
   )
   private final void method4827(boolean arg0) {
      try {
         if (~this.field10045 != -3) {
            this.field10045 = 2;
            this.method4852((byte)116);
            this.method4830(arg0);
            this.field9933 &= -8;
         }

         ++field9781;
         if (!arg0) {
            this.method602(-87, 6, -105, -90, false);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(IB)V"
   )
   public final void method4828(int arg0, byte arg1) {
      try {
         if (arg1 == 66) {
            if (this.field10033 != arg0) {
               OpenGL.glActiveTexture(33984 - -arg0);
               this.field10033 = arg0;
            }

            ++field9685;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[150] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "aa",
      descriptor = "(IIIIII)V"
   )
   public final void method645(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9759;
         float var7 = (float)arg0 + 0.35F;
         float var8 = (float)arg1 + 0.35F;
         float var9 = (float)arg2 + var7;
         this.method4855((byte)23);
         float var10 = (float)arg3 + var8;
         this.method4854(-3, arg5);
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         if (this.field9994) {
            OpenGL.glDisable(32925);
         }

         OpenGL.glBegin(7);
         OpenGL.glVertex2f(var7, var8);
         OpenGL.glVertex2f(var7, var10);
         OpenGL.glVertex2f(var9, var10);
         OpenGL.glVertex2f(var9, var8);
         OpenGL.glEnd();
         if (this.field9994) {
            OpenGL.glEnable(32925);
         }
      } catch (RuntimeException var12) {
         throw class670.method4877(var12, field10053[85] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "k",
      descriptor = "(B)V"
   )
   private final void method4829(byte arg0) {
      try {
         this.field9993 = (float)(-this.field9992 + this.field9976) - this.field9956;
         ++field9873;
         this.field9937 = this.field9993 - (float)this.field10031 * this.field10036;
         if (this.field9937 < (float)this.field9963) {
            this.field9937 = (float)this.field9963;
         }

         OpenGL.glFogf(2915, this.field9937);
         OpenGL.glFogf(2916, this.field9993);
         class61.field754[1] = (float)class153.method1262(this.field10028, 65280) / 65280.0F;
         if (arg0 != -118) {
            this.field10026 = true;
         }

         class61.field754[2] = (float)class153.method1262(255, this.field10028) / 255.0F;
         class61.field754[0] = (float)class153.method1262(16711680, this.field10028) / 1.671168E7F;
         OpenGL.glFogfv(2918, class61.field754, 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(Z)V"
   )
   private final void method4830(boolean arg0) {
      try {
         OpenGL.glLoadIdentity();
         if (arg0) {
            ++field9797;
            OpenGL.glMultMatrixf(this.field9934.method1649(-69), 0);
            if (this.field9990) {
               this.field9893.field1978.method1800(113);
            }

            this.method4791(54);
            this.method4778(1);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[18] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Luga;I)V"
   )
   public final void method4831(class218 arg0, int arg1) {
      try {
         ++field9796;
         OpenGL.glLoadMatrixf(arg0.method1649(-99), 0);
         if (arg1 != 32993) {
            this.method4803(-47);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[137] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method613(int arg0) {
      try {
         ++field9754;
         this.method4819(-1);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[134] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "i",
      descriptor = "(I)Lza;"
   )
   public final class434 method592(int arg0) {
      try {
         ++field9845;
         class311 var2 = new class311(arg0);
         this.field9900.method4060(23, var2);
         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[68] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(BJ)V"
   )
   public final synchronized void method4832(byte arg0, long arg1) {
      try {
         ++field9710;
         class347 var4 = new class347();
         if (arg0 > -110) {
            this.method4784(56, -60);
         }

         var4.field5280 = arg1;
         this.field9924.method4060(23, var4);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[221] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIIIILaa;II)V"
   )
   public final void method606(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, class512 arg6, int arg7, int arg8) {
      try {
         ++field9706;
         class364 var10 = (class364)arg6;
         class596 var11 = var10.field5462;
         this.method4817((byte)-63);
         this.method4818((byte)95, var10.field5462);
         this.method4854(-3, arg5);
         this.method4849(8448, 34161, 7681);
         this.method4814(7681, 0, 34167, 768);
         float var12 = var11.field8778 / (float)var11.field8779;
         float var13 = var11.field8777 / (float)var11.field8783;
         float var14 = (float)(-arg0) + (float)arg2;
         float var15 = (float)(-arg1) + (float)arg3;
         float var16 = (float)(1.0D / Math.sqrt((double)(var14 * var14 + var15 * var15)));
         float var17 = var14 * var16;
         float var18 = var15 * var16;
         OpenGL.glColor4ub((byte)(arg4 >> 16), (byte)(arg4 >> 8), (byte)arg4, (byte)(arg4 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glTexCoord2f((float)(-arg7 + arg0) * var12, (float)(arg1 - arg8) * var13);
         OpenGL.glVertex2f((float)arg0 + 0.35F, (float)arg1 + 0.35F);
         OpenGL.glTexCoord2f((float)(-arg7 + arg2) * var12, (float)(arg3 - arg8) * var13);
         OpenGL.glVertex2f((float)arg2 + var17 + 0.35F, (float)arg3 + var18 + 0.35F);
         OpenGL.glEnd();
         this.method4814(7681, 0, 5890, 768);
      } catch (RuntimeException var20) {
         throw class670.method4877(var20, field10053[47] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field10053[10] : field10053[9]) + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "w",
      descriptor = "(I)V"
   )
   private final void method4833(int arg0) {
      try {
         label24: {
            if (this.field9709 == null) {
               this.field9719 = this.field9887 = 0;
               if (client.field4530 == 0) {
                  break label24;
               }
            }

            Dimension var2 = this.field9709.getSize();
            this.field9719 = var2.width;
            this.field9887 = var2.height;
         }

         ++field9825;
         if (this.field9905 == null) {
            this.field9802 = this.field9719;
            this.field9732 = this.field9887;
            this.method4777(false);
         }

         this.method4794(-13674);
         if (arg0 != -17767) {
            this.field9875 = 116L;
         }

         this.method607();
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[35] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "b",
      descriptor = "(Ljava/awt/Canvas;II)V"
   )
   public final void method601(Canvas arg0, int arg1, int arg2) {
      try {
         ++field9770;
         if (this.field9814 == arg0) {
            throw new RuntimeException();
         } else if (!this.field9831.containsKey(arg0)) {
            if (!arg0.isShowing()) {
               throw new RuntimeException();
            } else {
               try {
                  Class var4 = Class.forName(field10053[159]);
                  Method var5 = var4.getMethod(field10053[158], Boolean.TYPE);
                  var5.invoke(arg0, Boolean.TRUE);
               } catch (Exception var9) {
               }

               long var6 = this.field9866.prepareSurface(arg0);
               if (var6 == -1L) {
                  throw new RuntimeException();
               } else {
                  this.field9831.put(arg0, new Long(var6));
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10053[157] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "h",
      descriptor = "(II)I"
   )
   public final int method4834(int arg0, int arg1) {
      try {
         ++field9844;
         if (arg0 != 6406 && arg0 != 6409) {
            if (arg0 != 6410 && ~arg0 != -34847 && arg0 != 34844) {
               if (arg0 != 6407) {
                  if (~arg0 != -6409 && ~arg0 != -34848) {
                     if (arg0 != 34843) {
                        if (arg0 == 34842) {
                           return 8;
                        } else if (~arg0 == -6403) {
                           return 3;
                        } else if (~arg0 == -6402) {
                           return 1;
                        } else {
                           if (arg1 != 1000) {
                              this.field10037 = null;
                           }

                           throw new IllegalArgumentException("");
                        }
                     } else {
                        return 6;
                     }
                  } else {
                     return 4;
                  }
               } else {
                  return 3;
               }
            } else {
               return 2;
            }
         } else {
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[127] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "U",
      descriptor = "(IIIII)V"
   )
   public final void method615(int arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9787;
         this.method4855((byte)-92);
         this.method4854(-3, arg4);
         float var6 = (float)arg0 + 0.35F;
         float var7 = (float)arg1 + 0.35F;
         OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
         OpenGL.glBegin(1);
         OpenGL.glVertex2f(var6, var7);
         OpenGL.glVertex2f((float)arg2 + var6, var7);
         OpenGL.glEnd();
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[148] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "(I)V"
   )
   private final void method4835(int arg0) {
      try {
         label23: {
            if (this.field10008 && !this.field10015) {
               OpenGL.glEnable(2896);
               if (client.field4530 == 0) {
                  break label23;
               }
            }

            OpenGL.glDisable(2896);
         }

         if (arg0 != 0) {
            this.method4798(122);
         }

         ++field9799;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "GA",
      descriptor = "(I)V"
   )
   public final void method597(int arg0) {
      try {
         this.method4854(-3, 0);
         ++field9864;
         OpenGL.glClearColor((float)(16711680 & arg0) / 1.671168E7F, (float)(65280 & arg0) / 65280.0F, (float)(255 & arg0) / 255.0F, (float)(arg0 >>> 24) / 255.0F);
         OpenGL.glClear(16384);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[190] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "(IIIIII)Luaa;"
   )
   public final class126 method594(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      try {
         ++field9882;
         return this.field10026 ? new class115(this, arg0, arg1, arg2, arg3, arg4, arg5) : null;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[187] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "k",
      descriptor = "()Z"
   )
   public final boolean method649() {
      try {
         ++field9838;
         return this.field9893.method1292(3, (byte)-120);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[129] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "DA",
      descriptor = "(IIII)V"
   )
   public final void method630(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field9727;
         this.field9945 = arg2;
         this.field10003 = arg0;
         this.field10024 = arg3;
         this.field9940 = arg1;
         this.method4798(-122);
         this.method4813(true);
         if (~this.field10045 == -4) {
            this.method4774(true);
         } else if (this.field10045 == 2) {
            this.method4852((byte)109);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[13] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "w",
      descriptor = "()V"
   )
   public final void method647() {
      try {
         ++field9874;
         if (!this.field9957) {
            if (!this.field9942) {
               throw new RuntimeException("");
            }

            this.field9912.method261(0, 0, this.field9802, this.field9732, 0, 0);
            this.field9866.setSurface(this.field9752);
            if (client.field4530 != 0) {
               throw new RuntimeException("");
            }
         } else {
            if (this.field9905 != this.field9908) {
               throw new RuntimeException();
            }

            this.field9908.method907(0, true);
            this.field9908.method907(8, true);
            this.method4801(-58, this.field9908);
         }

         this.field9912 = null;
         this.field9732 = this.field9887;
         this.field9802 = this.field9719;
         this.method4794(-13674);
         this.method4777(false);
         this.method607();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[42] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "m",
      descriptor = "()I"
   )
   public final int method586() {
      try {
         ++field9777;
         return 4;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[146] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(FFB)V"
   )
   public final void method4836(float arg0, float arg1, byte arg2) {
      try {
         ++field9755;
         this.field9956 = arg0;
         int var4 = 95 % ((arg2 - -62) / 33);
         this.field10036 = arg1;
         this.method4829((byte)-118);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[202] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "H",
      descriptor = "(III[I)V"
   )
   public final void method621(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9856;
         float var5 = (float)arg2 * this.field9926.field2746 + (float)arg0 * this.field9926.field2749 + (float)arg1 * this.field9926.field2748 + this.field9926.field2750;
         if (var5 == 0.0F) {
            arg3[0] = arg3[1] = arg3[2] = -1;
         } else {
            int var6 = (int)(((float)arg2 * this.field9926.field2758 + (float)arg0 * this.field9926.field2762 + (float)arg1 * this.field9926.field2756 + this.field9926.field2761) * (float)this.field9945 / var5);
            int var7 = (int)(((float)arg2 * this.field9926.field2763 + (float)arg0 * this.field9926.field2754 + (float)arg1 * this.field9926.field2769 + this.field9926.field2773) * (float)this.field10024 / var5);
            arg3[0] = (int)((float)var6 + -this.field10027);
            arg3[1] = (int)((float)var7 - this.field9944);
            arg3[2] = (int)var5;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ZI)I"
   )
   public final int method4837(boolean arg0, int arg1) {
      try {
         if (!arg0) {
            this.method4784(-110, -110);
         }

         ++field9747;
         if (arg1 == 1) {
            return 7681;
         } else if (~arg1 == -1) {
            return 8448;
         } else if (~arg1 != -3) {
            if (~arg1 == -4) {
               return 260;
            } else if (~arg1 == -5) {
               return 34023;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 34165;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[140] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "n",
      descriptor = "(I)V"
   )
   public final void method4838(int arg0) {
      try {
         ++field9741;
         if (arg0 == 1) {
            OpenGL.glPushMatrix();
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[200] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "pa",
      descriptor = "()V"
   )
   public final void method648() {
      try {
         this.field9958 = false;
         ++field9751;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[223] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(FFF)V"
   )
   public final void method551(float arg0, float arg1, float arg2) {
      try {
         class327.field4647 = arg1;
         class130.field1618 = arg0;
         ++field9785;
         class180.field2221 = arg2;
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[38] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Luaa;)V"
   )
   public final void method583(class126 arg0) {
      try {
         ++field9793;
         this.field9943 = (class81)arg0;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[189] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(B)I"
   )
   private final int method4839(byte arg0) {
      try {
         ++field9790;
         int var2 = 0;
         this.field10039 = OpenGL.glGetString(7936).toLowerCase();
         this.field10046 = OpenGL.glGetString(7937).toLowerCase();
         if (this.field10039.indexOf(field10053[111]) != -1) {
            var2 |= 1;
         }

         if (this.field10039.indexOf(field10053[100]) != -1 || this.field10039.indexOf(field10053[115]) != -1) {
            var2 |= 1;
         }

         label58: {
            String var3 = OpenGL.glGetString(7938);
            String[] var4 = class136.method1163(' ', var3.replace('.', ' '), 107);
            if (~var4.length <= -3) {
               try {
                  int var5 = class561.method4150((byte)27, var4[0]);
                  int var6 = class561.method4150((byte)27, var4[1]);
                  this.field10023 = var5 * 10 - -var6;
                  break label58;
               } catch (NumberFormatException var9) {
                  var2 |= 4;
                  if (client.field4530 == 0) {
                     break label58;
                  }
               }
            }

            var2 |= 4;
         }

         if (this.field10023 < 12) {
            var2 |= 2;
         }

         if (!this.field9866.method4691(field10053[109])) {
            var2 |= 8;
         }

         if (!this.field9866.method4691(field10053[107])) {
            var2 |= 32;
         }

         int[] var7 = new int[1];
         OpenGL.glGetIntegerv(34018, var7, 0);
         this.field10020 = var7[0];
         OpenGL.glGetIntegerv(34929, var7, 0);
         this.field9980 = var7[0];
         OpenGL.glGetIntegerv(34930, var7, 0);
         this.field9947 = var7[0];
         if (~this.field10020 > -3 || ~this.field9980 > -3 || this.field9947 < 2) {
            var2 |= 16;
         }

         this.field10006 = Stream.method5098();
         this.field9942 = this.field9866.arePbuffersAvailable();
         this.field9941 = this.field9866.method4691(field10053[105]);
         this.field9994 = this.field9866.method4691(field10053[99]);
         this.field9961 = this.field9866.method4691(field10053[101]);
         this.field9866.method4691(field10053[116]);
         this.field9975 = this.field9866.method4691(field10053[114]);
         this.field10018 = this.field9866.method4691(field10053[113]);
         this.field9995 = this.field9866.method4691(field10053[103]);
         this.field9950 = this.field9866.method4691(field10053[112]);
         this.field10026 = this.field9866.method4691(field10053[110]);
         this.field9996 = this.field9866.method4691(field10053[108]);
         this.field10032 = false;
         if (arg0 != -96) {
            this.method635();
         }

         this.field9957 = this.field9866.method4691(field10053[102]);
         this.field10007 = this.field9866.method4691(field10053[97]);
         this.field9967 = this.field9866.method4691(field10053[106]);
         this.field10029 = this.field9967 & this.field10007;
         this.field9971 = class80.field990.startsWith(field10053[104]);
         OpenGL.glGetFloatv(2834, class61.field754, 0);
         this.field9989 = class61.field754[0];
         this.field10043 = class61.field754[1];
         return var2 == 0 ? 0 : var2;
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field10053[98] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "o",
      descriptor = "()V"
   )
   public final void method548() {
      try {
         ++field9728;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[43] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "xa",
      descriptor = "(F)V"
   )
   public final void method654(float arg0) {
      try {
         ++field9840;
         if (this.field10009 != arg0) {
            this.field10009 = arg0;
            this.method4856(1);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[212] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IB)V"
   )
   public final void method4840(int arg0, byte arg1) {
      try {
         ++field9804;
         this.method4783(true, true, arg0);
         if (arg1 != 125) {
            this.field9921 = null;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[183] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(II)V"
   )
   public final void method627(int arg0, int arg1) throws class280 {
      try {
         ++field9716;

         try {
            this.field9866.swapBuffers();
         } catch (Exception var4) {
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[149] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "M",
      descriptor = "()I"
   )
   public final int method556() {
      try {
         ++field9687;
         int var1 = this.field10052;
         this.field10052 = 0;
         return var1;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[76] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "(ILkc;)V"
   )
   public final void method4841(int arg0, class143 arg1) {
      try {
         ++field9806;
         if (this.field9909 >= 0 && this.field9914[this.field9909] == arg1) {
            this.field9914[this.field9909--] = null;
            arg1.method904(false);
            if (arg0 != 28942) {
               this.field10016 = null;
            }

            if (~this.field9909 <= -1) {
               this.field9906 = this.field9914[this.field9909];
               this.field9906.method908((byte)74);
            } else {
               this.field9906 = null;
            }
         } else {
            throw new RuntimeException();
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[40] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method4842(int arg0, int arg1, byte arg2) {
      try {
         this.field9960 = arg1;
         this.field9962 = arg0;
         ++field9846;
         this.method4777(false);
         if (arg2 == 74) {
            this.method4804(82);
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field10053[87] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(FBFF)V"
   )
   private final void method4843(float arg0, byte arg1, float arg2, float arg3) {
      try {
         ++field9713;
         OpenGL.glMatrixMode(5890);
         if (this.field10025) {
            OpenGL.glLoadIdentity();
         }

         OpenGL.glTranslatef(arg3, arg2, arg0);
         OpenGL.glMatrixMode(5888);
         this.field10025 = true;
         if (arg1 != -20) {
            this.field9962 = 44;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[56] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "d",
      descriptor = "(III)V"
   )
   public final synchronized void method4844(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -11495) {
            this.field9875 = -57L;
         }

         ++field9684;
         class10 var4 = new class10(arg1);
         var4.field5280 = (long)arg2;
         this.field9920.method4060(23, var4);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "A",
      descriptor = "(I)V"
   )
   private final void method4845(int arg0) {
      try {
         if (~this.field10045 != -2) {
            OpenGL.glMatrixMode(5889);
            OpenGL.glLoadIdentity();
            if (this.field9802 > 0 && ~this.field9732 < -1) {
               OpenGL.glOrtho(0.0D, (double)this.field9802, (double)this.field9732, 0.0D, -1.0D, 1.0D);
            }

            OpenGL.glMatrixMode(5888);
            OpenGL.glLoadIdentity();
            this.field10045 = 1;
            this.field9933 &= -25;
         }

         ++field9812;
         if (arg0 != 0) {
            this.method630(-48, 15, 5, -73);
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[160] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "s",
      descriptor = "(I)V"
   )
   private final void method4846(int arg0) {
      try {
         class61.field754[2] = this.field9985 * this.field9955;
         class61.field754[1] = this.field9985 * this.field10017;
         ++field9834;
         int var2 = 116 % ((arg0 - -78) / 34);
         class61.field754[3] = 1.0F;
         class61.field754[0] = this.field9985 * this.field9978;
         OpenGL.glLightfv(16384, 4609, class61.field754, 0);
         class61.field754[1] = -this.field9948 * this.field10017;
         class61.field754[3] = 1.0F;
         class61.field754[0] = -this.field9948 * this.field9978;
         class61.field754[2] = -this.field9948 * this.field9955;
         OpenGL.glLightfv(16385, 4609, class61.field754, 0);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lps;Llba;)Lsea;"
   )
   public final class725 method541(class103 arg0, class575 arg1) {
      try {
         ++field9695;
         return null;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[8] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lrr;ILrr;Lrr;Lrr;)V"
   )
   public final void method4847(class380 arg0, int arg1, class380 arg2, class380 arg3, class380 arg4) {
      int var6 = client.field4530;

      try {
         label65: {
            if (arg2 == null) {
               OpenGL.glDisableClientState(32884);
               if (var6 == 0) {
                  break label65;
               }
            }

            this.method4850(arg2.field5840, 34962);
            OpenGL.glVertexPointer(arg2.field5845, arg2.field5842, this.field10016.method2824((byte)76), this.field10016.method2822(16968) + (long)arg2.field5844);
            OpenGL.glEnableClientState(32884);
         }

         ++field9735;
         if (arg1 >= 112) {
            label59: {
               if (arg4 == null) {
                  OpenGL.glDisableClientState(32885);
                  if (var6 == 0) {
                     break label59;
                  }
               }

               this.method4850(arg4.field5840, 34962);
               OpenGL.glNormalPointer(arg4.field5842, this.field10016.method2824((byte)53), this.field10016.method2822(16968) + (long)arg4.field5844);
               OpenGL.glEnableClientState(32885);
            }

            label54: {
               if (arg3 != null) {
                  this.method4850(arg3.field5840, 34962);
                  OpenGL.glColorPointer(arg3.field5845, arg3.field5842, this.field10016.method2824((byte)87), this.field10016.method2822(16968) + (long)arg3.field5844);
                  OpenGL.glEnableClientState(32886);
                  if (var6 == 0) {
                     break label54;
                  }
               }

               OpenGL.glDisableClientState(32886);
            }

            if (arg0 != null) {
               this.method4850(arg0.field5840, 34962);
               OpenGL.glTexCoordPointer(arg0.field5845, arg0.field5842, this.field10016.method2824((byte)86), this.field10016.method2822(16968) - -((long)arg0.field5844));
               OpenGL.glEnableClientState(32888);
            } else {
               OpenGL.glDisableClientState(32888);
            }
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[91] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ',' + (arg2 != null ? field10053[10] : field10053[9]) + ',' + (arg3 != null ? field10053[10] : field10053[9]) + ',' + (arg4 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "c",
      descriptor = "()V"
   )
   public final void method616() {
      try {
         OpenGL.glFinish();
         ++field9743;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[175] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "za",
      descriptor = "(IIIII)V"
   )
   public final void method652(int arg0, int arg1, int arg2, int arg3, int arg4) {
      int var6 = client.field4530;

      try {
         ++field9682;
         if (arg2 < 0) {
            arg2 = -arg2;
         }

         if (this.field10011 <= arg0 - -arg2 && ~this.field10012 <= ~(arg0 - arg2) && arg1 + arg2 >= this.field9936 && this.field10038 >= -arg2 + arg1) {
            this.method4855((byte)-97);
            this.method4854(-3, arg4);
            OpenGL.glColor4ub((byte)(arg3 >> 16), (byte)(arg3 >> 8), (byte)arg3, (byte)(arg3 >> 24));
            float var7 = (float)arg0 + 0.35F;
            float var8 = (float)arg1 + 0.35F;
            int var9 = arg2 << 1;
            if ((float)var9 < this.field9989) {
               OpenGL.glBegin(7);
               OpenGL.glVertex2f(var7 + 1.0F, var8 + 1.0F);
               OpenGL.glVertex2f(var7 + 1.0F, var8 + -1.0F);
               OpenGL.glVertex2f(var7 + -1.0F, var8 - 1.0F);
               OpenGL.glVertex2f(var7 - 1.0F, var8 + 1.0F);
               OpenGL.glEnd();
            } else if (this.field10043 >= (float)var9) {
               OpenGL.glEnable(2832);
               OpenGL.glPointSize((float)var9);
               OpenGL.glBegin(0);
               OpenGL.glVertex2f(var7, var8);
               OpenGL.glEnd();
               OpenGL.glDisable(2832);
            } else {
               int var10;
               label42: {
                  OpenGL.glBegin(6);
                  OpenGL.glVertex2f(var7, var8);
                  var10 = 262144 / (arg2 * 6);
                  if (var10 <= 64) {
                     var10 = 64;
                     if (var6 == 0) {
                        break label42;
                     }
                  }

                  if (var10 > 512) {
                     var10 = 512;
                  }
               }

               int var11 = class605.method4419(var10, (byte)-123);
               OpenGL.glVertex2f((float)arg2 + var7, var8);
               int var12 = 16384 - var11;
               if (var6 != 0) {
                  OpenGL.glVertex2f(class500.field7423[var12] * (float)arg2 + var7, class500.field7425[var12] * (float)arg2 + var8);
                  var12 -= var11;
               }

               while(true) {
                  while(~var12 < -1) {
                     OpenGL.glVertex2f(class500.field7423[var12] * (float)arg2 + var7, class500.field7425[var12] * (float)arg2 + var8);
                     var12 -= var11;
                  }

                  OpenGL.glVertex2f((float)arg2 + var7, var8);
                  OpenGL.glEnd();
                  if (var6 == 0) {
                     return;
                  }

                  var12 -= var11;
               }
            }
         }
      } catch (RuntimeException var14) {
         throw class670.method4877(var14, field10053[147] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "m",
      descriptor = "(I)V"
   )
   private final void method4848(int arg0) {
      try {
         if (this.field10045 != 3) {
            this.field10045 = 3;
            this.method4774(true);
            this.method4830(true);
            this.field9933 &= -8;
         }

         if (arg0 != 0) {
            this.field9905 = null;
         }

         ++field9774;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[226] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "([I)V"
   )
   public final void method610(int[] arg0) {
      try {
         ++field9842;
         arg0[0] = this.field9802;
         arg0[1] = this.field9732;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[132] + (arg0 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lut;IIII)Lka;"
   )
   public final class497 method547(class134 arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         ++field9730;
         return new class247(this, arg0, arg1, arg3, arg4, arg2);
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field10053[45] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "<init>",
      descriptor = "(Ljava/awt/Canvas;Ld;I)V"
   )
   public class667(Canvas param1, class160 param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ck",
      name = "JA",
      descriptor = "(IIIIII)I"
   )
   public final int method612(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5) {
      int var7 = client.field4530;

      try {
         ++field9784;
         int var8 = 0;
         float var9 = (float)arg2 * this.field9926.field2746 + (float)arg0 * this.field9926.field2749 + (float)arg1 * this.field9926.field2748 + this.field9926.field2750;
         if (var9 < 1.0F) {
            var9 = 1.0F;
         }

         float var10 = (float)arg5 * this.field9926.field2746 + (float)arg3 * this.field9926.field2749 + (float)arg4 * this.field9926.field2748 + this.field9926.field2750;
         if (var10 < 1.0F) {
            var10 = 1.0F;
         }

         label83: {
            if (!(var9 < (float)this.field9963) || !(var10 < (float)this.field9963)) {
               if (!(var9 > (float)this.field9976) || !(var10 > (float)this.field9976)) {
                  break label83;
               }

               var8 |= 32;
               if (var7 == 0) {
                  break label83;
               }
            }

            var8 |= 16;
         }

         label59: {
            int var11 = (int)(((float)arg2 * this.field9926.field2758 + (float)arg0 * this.field9926.field2762 + (float)arg1 * this.field9926.field2756 + this.field9926.field2761) * (float)this.field9945 / var9);
            int var12 = (int)(((float)arg5 * this.field9926.field2758 + (float)arg3 * this.field9926.field2762 + (float)arg4 * this.field9926.field2756 + this.field9926.field2761) * (float)this.field9945 / var10);
            if (this.field10027 > (float)var11 && (float)var12 < this.field10027) {
               var8 |= 1;
               if (var7 == 0) {
                  break label59;
               }
            }

            if ((float)var11 > this.field9965 && (float)var12 > this.field9965) {
               var8 |= 2;
            }
         }

         int var13 = (int)(((float)arg2 * this.field9926.field2763 + (float)arg0 * this.field9926.field2754 + (float)arg1 * this.field9926.field2769 + this.field9926.field2773) * (float)this.field10024 / var9);
         int var14 = (int)(((float)arg5 * this.field9926.field2763 + (float)arg3 * this.field9926.field2754 + (float)arg4 * this.field9926.field2769 + this.field9926.field2773) * (float)this.field10024 / var10);
         if (!(this.field9944 > (float)var13) || !((float)var14 < this.field9944)) {
            if (!(this.field9981 < (float)var13) || !((float)var14 > this.field9981)) {
               return var8;
            }

            var8 |= 8;
            if (var7 == 0) {
               return var8;
            }
         }

         var8 |= 4;
         return var8;
      } catch (RuntimeException var16) {
         throw class670.method4877(var16, field10053[58] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "Y",
      descriptor = "()[I"
   )
   public final int[] method576() {
      try {
         ++field9860;
         return new int[]{this.field10003, this.field9940, this.field9945, this.field10024};
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[39] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method4849(int arg0, int arg1, int arg2) {
      try {
         label34: {
            if (this.field10033 != 0) {
               OpenGL.glTexEnvi(8960, 34161, arg2);
               OpenGL.glTexEnvi(8960, 34162, arg0);
               if (client.field4530 == 0) {
                  break label34;
               }
            }

            boolean var4 = false;
            if (~this.field9999 != ~arg2) {
               OpenGL.glTexEnvi(8960, 34161, arg2);
               this.field9999 = arg2;
               var4 = true;
            }

            if (this.field9968 != arg0) {
               OpenGL.glTexEnvi(8960, 34162, arg0);
               var4 = true;
               this.field9968 = arg0;
            }

            if (var4) {
               this.field9933 &= -30;
            }
         }

         ++field9692;
         if (arg1 != 34161) {
            this.field9997 = null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field10053[75] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "ya",
      descriptor = "()V"
   )
   public final void method561() {
      try {
         this.method4811(-32, true);
         ++field9855;
         OpenGL.glClear(256);
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[60] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "s",
      descriptor = "()Z"
   )
   public final boolean method545() {
      try {
         ++field9689;
         return false;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[162] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Lgka;I)V"
   )
   public final void method4850(class390 arg0, int arg1) {
      try {
         if (this.field10016 != arg0) {
            if (this.field9941) {
               OpenGL.glBindBufferARB(34962, arg0.method2821(false));
            }

            this.field10016 = arg0;
         }

         if (arg1 != 34962) {
            this.field10043 = 0.27289993F;
         }

         ++field9775;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[220] + (arg0 != null ? field10053[10] : field10053[9]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "n",
      descriptor = "(B)Lvu;"
   )
   public final class355 method4851(byte arg0) {
      try {
         ++field9715;
         if (arg0 != -30) {
            this.field10051 = null;
         }

         return this.field9943 == null ? null : this.field9943.method758(false);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[196] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method582(boolean arg0) {
      try {
         ++field9867;
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[167] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "g",
      descriptor = "(B)V"
   )
   private final void method4852(byte arg0) {
      try {
         if (arg0 <= 78) {
            this.field9831 = null;
         }

         ++field9783;
         OpenGL.glMatrixMode(5889);
         OpenGL.glLoadMatrixf(this.field9988, 0);
         OpenGL.glMatrixMode(5888);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[138] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(IIIIIIIIIIIII)V"
   )
   public final void method552(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9, int arg10, int arg11, int arg12) {
      try {
         ++field9815;
         this.method4855((byte)-115);
         this.method4854(-3, arg12);
         OpenGL.glBegin(4);
         OpenGL.glColor4ub((byte)(arg9 >> 16), (byte)(arg9 >> 8), (byte)arg9, (byte)(arg9 >> 24));
         OpenGL.glVertex3f((float)arg0 + 0.35F, (float)arg1 + 0.35F, (float)arg2);
         OpenGL.glColor4ub((byte)(arg10 >> 16), (byte)(arg10 >> 8), (byte)arg10, (byte)(arg10 >> 24));
         OpenGL.glVertex3f((float)arg3 + 0.35F, (float)arg4 + 0.35F, (float)arg5);
         OpenGL.glColor4ub((byte)(arg11 >> 16), (byte)(arg11 >> 8), (byte)arg11, (byte)(arg11 >> 24));
         OpenGL.glVertex3f((float)arg6 + 0.35F, (float)arg7 + 0.35F, (float)arg8);
         OpenGL.glEnd();
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field10053[155] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ',' + arg11 + ',' + arg12 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "a",
      descriptor = "(ILsha;)V"
   )
   public final void method4853(int arg0, class758 arg1) {
      try {
         if (arg0 != -4081) {
            this.method4822(-123, true);
         }

         ++field9826;
         if (this.field10034 != arg1) {
            if (this.field9941) {
               OpenGL.glBindBufferARB(34963, arg1.method991(1330));
            }

            this.field10034 = arg1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[27] + arg0 + ',' + (arg1 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "g",
      descriptor = "(II)V"
   )
   public final void method4854(int arg0, int arg1) {
      int var3 = client.field4530;

      try {
         if (arg0 == -3) {
            if (this.field9925 != arg1) {
               boolean var4;
               byte var5;
               boolean var6;
               label84: {
                  if (arg1 != 1) {
                     if (~arg1 != -3) {
                        if (arg1 != 128) {
                           var4 = false;
                           var5 = 0;
                           var6 = true;
                           if (var3 == 0) {
                              break label84;
                           }
                        }

                        var6 = true;
                        var5 = 3;
                        var4 = true;
                        if (var3 == 0) {
                           break label84;
                        }
                     }

                     var4 = false;
                     var5 = 2;
                     var6 = true;
                     if (var3 == 0) {
                        break label84;
                     }
                  }

                  var5 = 1;
                  var6 = true;
                  var4 = true;
               }

               if (this.field9929 != var6) {
                  OpenGL.glColorMask(var6, var6, var6, true);
                  this.field9929 = var6;
               }

               if (this.field9932 != var4) {
                  label70: {
                     if (!var4) {
                        OpenGL.glDisable(3008);
                        if (var3 == 0) {
                           break label70;
                        }
                     }

                     OpenGL.glEnable(3008);
                  }

                  this.field9932 = var4;
               }

               if (this.field9927 != var5) {
                  label61: {
                     if (~var5 != -2) {
                        if (~var5 != -3) {
                           if (var5 != 3) {
                              OpenGL.glDisable(3042);
                              if (var3 == 0) {
                                 break label61;
                              }
                           }

                           OpenGL.glEnable(3042);
                           OpenGL.glBlendFunc(774, 1);
                           if (var3 == 0) {
                              break label61;
                           }
                        }

                        OpenGL.glEnable(3042);
                        OpenGL.glBlendFunc(1, 1);
                        if (var3 == 0) {
                           break label61;
                        }
                     }

                     OpenGL.glEnable(3042);
                     OpenGL.glBlendFunc(770, 771);
                  }

                  this.field9927 = var5;
               }

               this.field9925 = arg1;
               this.field9933 &= -29;
            }

            ++field9733;
         }
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field10053[55] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "h",
      descriptor = "(B)V"
   )
   private final void method4855(byte arg0) {
      try {
         int var2 = -22 % ((arg0 - -41) / 36);
         ++field9717;
         if (this.field9933 != 1) {
            this.method4845(0);
            this.method4795((byte)100, false);
            this.method4822(-6, false);
            this.method4807(false, false);
            this.method4811(-32, false);
            this.method4818((byte)69, (class689)null);
            this.method4840(-2, (byte)125);
            this.method4796(false, 1);
            this.field9933 = 1;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[66] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "e",
      descriptor = "()Z"
   )
   public final boolean method651() {
      try {
         ++field9803;
         if (this.field9891 != null) {
            if (!this.field9891.method3588(-120)) {
               if (!this.field9892.method5344(85, this.field9891)) {
                  return false;
               }

               this.field9895.method253(-112);
            }

            return true;
         } else {
            return false;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[163] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "f",
      descriptor = "(II)V"
   )
   public final void method625(int arg0, int arg1) {
      try {
         if (this.field9963 != arg0 || ~this.field9976 != ~arg1) {
            label32: {
               this.field9976 = arg1;
               this.field9963 = arg0;
               this.method4798(-107);
               this.method4829((byte)-118);
               if (~this.field10045 != -4) {
                  if (this.field10045 != 2) {
                     break label32;
                  }

                  this.method4852((byte)114);
                  if (client.field4530 == 0) {
                     break label32;
                  }
               }

               this.method4774(true);
            }
         }

         ++field9789;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field10053[225] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "t",
      descriptor = "(I)V"
   )
   private final void method4856(int arg0) {
      try {
         ++field9712;
         class61.field754[3] = 1.0F;
         class61.field754[2] = this.field9955 * this.field10009;
         class61.field754[arg0] = this.field10017 * this.field10009;
         class61.field754[0] = this.field9978 * this.field10009;
         OpenGL.glLightModelfv(2899, class61.field754, 0);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field10053[70] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "t",
      descriptor = "()Z"
   )
   public final boolean method567() {
      try {
         ++field9830;
         return true;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field10053[169] + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "da",
      descriptor = "(III[I)V"
   )
   public final void method629(int arg0, int arg1, int arg2, int[] arg3) {
      try {
         ++field9782;
         float var5 = (float)arg2 * this.field9926.field2746 + (float)arg0 * this.field9926.field2749 + (float)arg1 * this.field9926.field2748 + this.field9926.field2750;
         if (!((float)this.field9963 > var5) && !((float)this.field9976 < var5)) {
            int var6 = (int)(((float)arg2 * this.field9926.field2758 + (float)arg0 * this.field9926.field2762 + (float)arg1 * this.field9926.field2756 + this.field9926.field2761) * (float)this.field9945 / var5);
            int var7 = (int)(((float)arg2 * this.field9926.field2763 + (float)arg0 * this.field9926.field2754 + (float)arg1 * this.field9926.field2769 + this.field9926.field2773) * (float)this.field10024 / var5);
            if (this.field10027 <= (float)var6 && (float)var6 <= this.field9965 && this.field9944 <= (float)var7 && (float)var7 <= this.field9981) {
               arg3[0] = (int)((float)var6 - this.field10027);
               arg3[1] = (int)((float)var7 + -this.field9944);
               arg3[2] = (int)var5;
            } else {
               arg3[0] = arg3[1] = arg3[2] = -1;
            }
         } else {
            arg3[0] = arg3[1] = arg3[2] = -1;
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field10053[54] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10053[10] : field10053[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4857(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 30);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ck",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4858(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 69;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 30;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
