import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iw")
public class class146 extends class91 {
   @OriginalMember(
      owner = "client!iw",
      name = "wc",
      descriptor = "I"
   )
   private int field2144;
   @OriginalMember(
      owner = "client!iw",
      name = "cc",
      descriptor = "I"
   )
   private int field2136;
   @OriginalMember(
      owner = "client!iw",
      name = "zc",
      descriptor = "Z"
   )
   private boolean field2158;
   @OriginalMember(
      owner = "client!iw",
      name = "Gb",
      descriptor = "I"
   )
   private int field2109;
   @OriginalMember(
      owner = "client!iw",
      name = "nb",
      descriptor = "Z"
   )
   private boolean field2106;
   @OriginalMember(
      owner = "client!iw",
      name = "Nb",
      descriptor = "Z"
   )
   private boolean field2121;
   @OriginalMember(
      owner = "client!iw",
      name = "w",
      descriptor = "Z"
   )
   private boolean field2179;
   @OriginalMember(
      owner = "client!iw",
      name = "wb",
      descriptor = "I"
   )
   private int field2181;
   @OriginalMember(
      owner = "client!iw",
      name = "sb",
      descriptor = "I"
   )
   private int field2196;
   @OriginalMember(
      owner = "client!iw",
      name = "vb",
      descriptor = "Lc;"
   )
   private class652 field2187;
   @OriginalMember(
      owner = "client!iw",
      name = "Kc",
      descriptor = "Lgs;"
   )
   private class436 field2198;
   @OriginalMember(
      owner = "client!iw",
      name = "rc",
      descriptor = "Lgs;"
   )
   private class436 field2189;
   @OriginalMember(
      owner = "client!iw",
      name = "fc",
      descriptor = "Lgs;"
   )
   private class436 field2138;
   @OriginalMember(
      owner = "client!iw",
      name = "Ob",
      descriptor = "Lgs;"
   )
   private class436 field2162;
   @OriginalMember(
      owner = "client!iw",
      name = "oc",
      descriptor = "Lrq;"
   )
   private class124 field2166;
   @OriginalMember(
      owner = "client!iw",
      name = "lc",
      descriptor = "I"
   )
   private int field2125;
   @OriginalMember(
      owner = "client!iw",
      name = "Qb",
      descriptor = "I"
   )
   private int field2116;
   @OriginalMember(
      owner = "client!iw",
      name = "ec",
      descriptor = "[I"
   )
   private int[] field2094;
   @OriginalMember(
      owner = "client!iw",
      name = "y",
      descriptor = "[S"
   )
   private short[] field2161;
   @OriginalMember(
      owner = "client!iw",
      name = "Rb",
      descriptor = "[I"
   )
   private int[] field2100;
   @OriginalMember(
      owner = "client!iw",
      name = "Ab",
      descriptor = "[I"
   )
   private int[] field2134;
   @OriginalMember(
      owner = "client!iw",
      name = "Mb",
      descriptor = "[I"
   )
   private int[] field2197;
   @OriginalMember(
      owner = "client!iw",
      name = "Eb",
      descriptor = "[Lqw;"
   )
   private class253[] field2188;
   @OriginalMember(
      owner = "client!iw",
      name = "I",
      descriptor = "[Lgl;"
   )
   private class574[] field2182;
   @OriginalMember(
      owner = "client!iw",
      name = "V",
      descriptor = "I"
   )
   private int field2130;
   @OriginalMember(
      owner = "client!iw",
      name = "s",
      descriptor = "[Lng;"
   )
   private class248[] field2099;
   @OriginalMember(
      owner = "client!iw",
      name = "Sb",
      descriptor = "[Lfo;"
   )
   private class249[] field2117;
   @OriginalMember(
      owner = "client!iw",
      name = "Lc",
      descriptor = "[S"
   )
   private short[] field2140;
   @OriginalMember(
      owner = "client!iw",
      name = "F",
      descriptor = "[S"
   )
   private short[] field2165;
   @OriginalMember(
      owner = "client!iw",
      name = "Ic",
      descriptor = "[B"
   )
   private byte[] field2146;
   @OriginalMember(
      owner = "client!iw",
      name = "O",
      descriptor = "[S"
   )
   private short[] field2150;
   @OriginalMember(
      owner = "client!iw",
      name = "q",
      descriptor = "S"
   )
   private short field2178;
   @OriginalMember(
      owner = "client!iw",
      name = "r",
      descriptor = "[F"
   )
   private float[] field2131;
   @OriginalMember(
      owner = "client!iw",
      name = "zb",
      descriptor = "[S"
   )
   private short[] field2156;
   @OriginalMember(
      owner = "client!iw",
      name = "J",
      descriptor = "[S"
   )
   private short[] field2137;
   @OriginalMember(
      owner = "client!iw",
      name = "xb",
      descriptor = "[S"
   )
   private short[] field2104;
   @OriginalMember(
      owner = "client!iw",
      name = "kc",
      descriptor = "[S"
   )
   private short[] field2110;
   @OriginalMember(
      owner = "client!iw",
      name = "Tb",
      descriptor = "S"
   )
   private short field2079;
   @OriginalMember(
      owner = "client!iw",
      name = "M",
      descriptor = "[F"
   )
   private float[] field2195;
   @OriginalMember(
      owner = "client!iw",
      name = "S",
      descriptor = "[B"
   )
   private byte[] field2155;
   @OriginalMember(
      owner = "client!iw",
      name = "Wb",
      descriptor = "[S"
   )
   private short[] field2154;
   @OriginalMember(
      owner = "client!iw",
      name = "H",
      descriptor = "[S"
   )
   private short[] field2088;
   @OriginalMember(
      owner = "client!iw",
      name = "tb",
      descriptor = "[S"
   )
   private short[] field2080;
   @OriginalMember(
      owner = "client!iw",
      name = "Kb",
      descriptor = "[I"
   )
   private int[] field2076;
   @OriginalMember(
      owner = "client!iw",
      name = "yb",
      descriptor = "[[I"
   )
   private int[][] field2107;
   @OriginalMember(
      owner = "client!iw",
      name = "Nc",
      descriptor = "[[I"
   )
   private int[][] field2083;
   @OriginalMember(
      owner = "client!iw",
      name = "lb",
      descriptor = "[[I"
   )
   private int[][] field2072;
   @OriginalMember(
      owner = "client!iw",
      name = "N",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2199 = new String[]{method1335(method1334("7\u001fNk[")), method1335(method1334("7\u001fNP[")), method1335(method1334("7\u001fN_\u0012v")), method1335(method1334("7\u001fNv[")), method1335(method1334("0\u001d\fW")), method1335(method1334("%FN\u0015\u000e")), method1335(method1334("7\u001fN~2v")), method1335(method1334("7\u001fNM[")), method1335(method1334("7\u001fNI[")), method1335(method1334("7\u001fNo2v")), method1335(method1334("7\u001fNr2v")), method1335(method1334("7\u001fNq2v")), method1335(method1334("7\u001fNp2v")), method1335(method1334("7\u001fNh[")), method1335(method1334("7\u001fN~[")), method1335(method1334("7\u001fNA\u0012v")), method1335(method1334("7\u001fNw[")), method1335(method1334("7\u001fNV\u0012v")), method1335(method1334("7\u001fNN\u0012v")), method1335(method1334("7\u001fNr[")), method1335(method1334("7\u001fNz2v")), method1335(method1334("7\u001fNn[")), method1335(method1334("7\u001fN}[")), method1335(method1334("7\u001fNs2v")), method1335(method1334("7\u001fNk2v")), method1335(method1334("7\u001fNL\u0012v")), method1335(method1334("7\u001fNi1v")), method1335(method1334("7\u001fNi2v")), method1335(method1334("7\u001fNZ\u0012v")), method1335(method1334("7\u001fNn1v")), method1335(method1334("7\u001fN\u0007\u001a0\u0001\u0014\u0005[")), method1335(method1334("7\u001fNj[")), method1335(method1334("7\u001fNy[")), method1335(method1334("7\u001fNo[")), method1335(method1334("7\u001fN|2v")), method1335(method1334("7\u001fNY\u0012v")), method1335(method1334("7\u001fNz[")), method1335(method1334("7\u001fNu2v")), method1335(method1334("7\u001fN]\u0012v")), method1335(method1334("7\u001fN\u007f[")), method1335(method1334("7\u001fNK[")), method1335(method1334("7\u001fN}2v")), method1335(method1334("7\u001fNm[")), method1335(method1334("7\u001fNH[")), method1335(method1334("7\u001fNx1v")), method1335(method1334("7\u001fN\u007f1v")), method1335(method1334("7\u001fN}1v")), method1335(method1334("7\u001fNz1v")), method1335(method1334("7\u001fNl2v")), method1335(method1334("7\u001fNw2v")), method1335(method1334("7\u001fNt2v")), method1335(method1334("7\u001fNu[")), method1335(method1334("7\u001fNs[")), method1335(method1334("7\u001fNy2v")), method1335(method1334("7\u001fNx[")), method1335(method1334("7\u001fNp[")), method1335(method1334("7\u001fN|[")), method1335(method1334("7\u001fNU\u0012v")), method1335(method1334("7\u001fNq[")), method1335(method1334("7\u001fNZ[")), method1335(method1334("7\u001fNi[")), method1335(method1334("7\u001fNl[")), method1335(method1334("7\u001fN\u007f2v")), method1335(method1334("7\u001fNR\u0012v")), method1335(method1334("7\u001fNv2v")), method1335(method1334("7\u001fNm2v")), method1335(method1334("7\u001fNt[")), method1335(method1334("7\u001fNx2v"))};
   @OriginalMember(
      owner = "client!iw",
      name = "t",
      descriptor = "Lhg;"
   )
   public static class733 field2073 = new class733(0, 0);
   @OriginalMember(
      owner = "client!iw",
      name = "Ib",
      descriptor = "Lnaa;"
   )
   public static class113 field2183 = new class113(92, -1);
   @OriginalMember(
      owner = "client!iw",
      name = "pb",
      descriptor = "B"
   )
   private byte field2145;
   @OriginalMember(
      owner = "client!iw",
      name = "sc",
      descriptor = "I"
   )
   public static int field2071;
   @OriginalMember(
      owner = "client!iw",
      name = "mb",
      descriptor = "I"
   )
   public static int field2074;
   @OriginalMember(
      owner = "client!iw",
      name = "Gc",
      descriptor = "I"
   )
   public static int field2075;
   @OriginalMember(
      owner = "client!iw",
      name = "G",
      descriptor = "I"
   )
   public static int field2077;
   @OriginalMember(
      owner = "client!iw",
      name = "jb",
      descriptor = "I"
   )
   public static int field2078;
   @OriginalMember(
      owner = "client!iw",
      name = "ib",
      descriptor = "I"
   )
   public static int field2081;
   @OriginalMember(
      owner = "client!iw",
      name = "Pb",
      descriptor = "I"
   )
   public static int field2082;
   @OriginalMember(
      owner = "client!iw",
      name = "Dc",
      descriptor = "I"
   )
   public static int field2085;
   @OriginalMember(
      owner = "client!iw",
      name = "rb",
      descriptor = "I"
   )
   public static int field2086;
   @OriginalMember(
      owner = "client!iw",
      name = "Cc",
      descriptor = "I"
   )
   public static int field2087;
   @OriginalMember(
      owner = "client!iw",
      name = "Jb",
      descriptor = "I"
   )
   public static int field2089;
   @OriginalMember(
      owner = "client!iw",
      name = "U",
      descriptor = "I"
   )
   public static int field2090;
   @OriginalMember(
      owner = "client!iw",
      name = "ic",
      descriptor = "I"
   )
   public static int field2091;
   @OriginalMember(
      owner = "client!iw",
      name = "jc",
      descriptor = "I"
   )
   public static int field2092;
   @OriginalMember(
      owner = "client!iw",
      name = "dc",
      descriptor = "I"
   )
   public static int field2095;
   @OriginalMember(
      owner = "client!iw",
      name = "gb",
      descriptor = "I"
   )
   public static int field2096;
   @OriginalMember(
      owner = "client!iw",
      name = "Ec",
      descriptor = "I"
   )
   public static int field2097;
   @OriginalMember(
      owner = "client!iw",
      name = "Bb",
      descriptor = "I"
   )
   public static int field2101;
   @OriginalMember(
      owner = "client!iw",
      name = "Lb",
      descriptor = "I"
   )
   public static int field2103;
   @OriginalMember(
      owner = "client!iw",
      name = "Hc",
      descriptor = "I"
   )
   public static int field2105;
   @OriginalMember(
      owner = "client!iw",
      name = "X",
      descriptor = "I"
   )
   public static int field2111;
   @OriginalMember(
      owner = "client!iw",
      name = "Bc",
      descriptor = "I"
   )
   public static int field2112;
   @OriginalMember(
      owner = "client!iw",
      name = "u",
      descriptor = "I"
   )
   public static int field2114;
   @OriginalMember(
      owner = "client!iw",
      name = "gc",
      descriptor = "I"
   )
   public static int field2115;
   @OriginalMember(
      owner = "client!iw",
      name = "Xb",
      descriptor = "I"
   )
   public static int field2118;
   @OriginalMember(
      owner = "client!iw",
      name = "x",
      descriptor = "I"
   )
   public static int field2119;
   @OriginalMember(
      owner = "client!iw",
      name = "Z",
      descriptor = "I"
   )
   public static int field2120;
   @OriginalMember(
      owner = "client!iw",
      name = "Fc",
      descriptor = "I"
   )
   public static int field2122;
   @OriginalMember(
      owner = "client!iw",
      name = "hb",
      descriptor = "I"
   )
   public static int field2123;
   @OriginalMember(
      owner = "client!iw",
      name = "v",
      descriptor = "I"
   )
   public static int field2124;
   @OriginalMember(
      owner = "client!iw",
      name = "Q",
      descriptor = "I"
   )
   public static int field2126;
   @OriginalMember(
      owner = "client!iw",
      name = "xc",
      descriptor = "I"
   )
   public static int field2128;
   @OriginalMember(
      owner = "client!iw",
      name = "Cb",
      descriptor = "I"
   )
   public static int field2129;
   @OriginalMember(
      owner = "client!iw",
      name = "kb",
      descriptor = "I"
   )
   public static int field2132;
   @OriginalMember(
      owner = "client!iw",
      name = "fb",
      descriptor = "I"
   )
   public static int field2133;
   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "I"
   )
   public static int field2135;
   @OriginalMember(
      owner = "client!iw",
      name = "cb",
      descriptor = "I"
   )
   public static int field2139;
   @OriginalMember(
      owner = "client!iw",
      name = "C",
      descriptor = "I"
   )
   public static int field2141;
   @OriginalMember(
      owner = "client!iw",
      name = "R",
      descriptor = "I"
   )
   public static int field2143;
   @OriginalMember(
      owner = "client!iw",
      name = "pc",
      descriptor = "I"
   )
   public static int field2147;
   @OriginalMember(
      owner = "client!iw",
      name = "tc",
      descriptor = "I"
   )
   public static int field2148;
   @OriginalMember(
      owner = "client!iw",
      name = "bb",
      descriptor = "I"
   )
   public static int field2149;
   @OriginalMember(
      owner = "client!iw",
      name = "yc",
      descriptor = "I"
   )
   public static int field2151;
   @OriginalMember(
      owner = "client!iw",
      name = "Hb",
      descriptor = "I"
   )
   public static int field2152;
   @OriginalMember(
      owner = "client!iw",
      name = "Jc",
      descriptor = "I"
   )
   public static int field2153;
   @OriginalMember(
      owner = "client!iw",
      name = "eb",
      descriptor = "I"
   )
   public static int field2159;
   @OriginalMember(
      owner = "client!iw",
      name = "Fb",
      descriptor = "I"
   )
   public static int field2160;
   @OriginalMember(
      owner = "client!iw",
      name = "P",
      descriptor = "I"
   )
   public static int field2163;
   @OriginalMember(
      owner = "client!iw",
      name = "ab",
      descriptor = "I"
   )
   public static int field2164;
   @OriginalMember(
      owner = "client!iw",
      name = "uc",
      descriptor = "I"
   )
   public static int field2168;
   @OriginalMember(
      owner = "client!iw",
      name = "Ac",
      descriptor = "I"
   )
   public static int field2169;
   @OriginalMember(
      owner = "client!iw",
      name = "mc",
      descriptor = "I"
   )
   public static int field2170;
   @OriginalMember(
      owner = "client!iw",
      name = "K",
      descriptor = "I"
   )
   public static int field2171;
   @OriginalMember(
      owner = "client!iw",
      name = "ob",
      descriptor = "I"
   )
   public static int field2172;
   @OriginalMember(
      owner = "client!iw",
      name = "D",
      descriptor = "I"
   )
   public static int field2173;
   @OriginalMember(
      owner = "client!iw",
      name = "Vb",
      descriptor = "I"
   )
   public static int field2174;
   @OriginalMember(
      owner = "client!iw",
      name = "Y",
      descriptor = "I"
   )
   public static int field2175;
   @OriginalMember(
      owner = "client!iw",
      name = "nc",
      descriptor = "I"
   )
   public static int field2176;
   @OriginalMember(
      owner = "client!iw",
      name = "L",
      descriptor = "I"
   )
   public static int field2184;
   @OriginalMember(
      owner = "client!iw",
      name = "bc",
      descriptor = "I"
   )
   public static int field2185;
   @OriginalMember(
      owner = "client!iw",
      name = "p",
      descriptor = "I"
   )
   public static int field2186;
   @OriginalMember(
      owner = "client!iw",
      name = "qb",
      descriptor = "I"
   )
   public static int field2191;
   @OriginalMember(
      owner = "client!iw",
      name = "T",
      descriptor = "I"
   )
   public static int field2192;
   @OriginalMember(
      owner = "client!iw",
      name = "Mc",
      descriptor = "I"
   )
   public static int field2193;
   @OriginalMember(
      owner = "client!iw",
      name = "Zb",
      descriptor = "I"
   )
   public static int field2194;
   @OriginalMember(
      owner = "client!iw",
      name = "qc",
      descriptor = "Lli;"
   )
   private class112 field2167;
   @OriginalMember(
      owner = "client!iw",
      name = "ub",
      descriptor = "Lle;"
   )
   private class172 field2127;
   @OriginalMember(
      owner = "client!iw",
      name = "db",
      descriptor = "Ltn;"
   )
   private class345 field2098;
   @OriginalMember(
      owner = "client!iw",
      name = "Db",
      descriptor = "Lha;"
   )
   public static class610 field2177;
   @OriginalMember(
      owner = "client!iw",
      name = "E",
      descriptor = "S"
   )
   private short field2084;
   @OriginalMember(
      owner = "client!iw",
      name = "W",
      descriptor = "S"
   )
   private short field2093;
   @OriginalMember(
      owner = "client!iw",
      name = "B",
      descriptor = "S"
   )
   private short field2102;
   @OriginalMember(
      owner = "client!iw",
      name = "Yb",
      descriptor = "S"
   )
   private short field2108;
   @OriginalMember(
      owner = "client!iw",
      name = "A",
      descriptor = "S"
   )
   private short field2113;
   @OriginalMember(
      owner = "client!iw",
      name = "vc",
      descriptor = "S"
   )
   private short field2142;
   @OriginalMember(
      owner = "client!iw",
      name = "ac",
      descriptor = "S"
   )
   private short field2157;
   @OriginalMember(
      owner = "client!iw",
      name = "hc",
      descriptor = "S"
   )
   private short field2190;
   @OriginalMember(
      owner = "client!iw",
      name = "Ub",
      descriptor = "Z"
   )
   public static boolean field2180;

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(I[IIIIIZ)V",
      line = 4
   )
   public final void method880(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      boolean var8 = client.field1786;

      try {
         ++field2081;
         int var9 = arg1.length;
         int var10000;
         int var110;
         int var111;
         int var112;
         if (arg0 != 0) {
            if (~arg0 != -2) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 == 5) {
                        if (this.field2072 != null) {
                           int var69 = 0;
                           if (var8 || ~var69 > ~var9) {
                              do {
                                 int var70 = arg1[var69];
                                 if (this.field2072.length <= var70) {
                                    ++var69;
                                 } else {
                                    int[] var71 = this.field2072[var70];
                                    int var72 = 0;
                                    if (var8) {
                                       var10000 = var71[var72];
                                    } else if (~var72 <= ~var71.length) {
                                       var10000 = var71.length;
                                       if (!var8) {
                                          if (var10000 > 0 && this.field2162 != null) {
                                             this.field2162.field6682 = null;
                                          }

                                          ++var69;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var71[var72];
                                    }

                                    while(true) {
                                       int var73 = var10000;
                                       int var74 = (255 & this.field2155[var73]) - -(arg2 * 8);
                                       if (var74 >= 0) {
                                          if (var74 > 255) {
                                             var74 = 255;
                                             if (var8) {
                                                var74 = 0;
                                             }
                                          }
                                       } else {
                                          var74 = 0;
                                       }

                                       this.field2155[var73] = (byte)var74;
                                       ++var72;
                                       if (~var72 <= ~var71.length) {
                                          var10000 = var71.length;
                                          if (!var8) {
                                             if (var10000 > 0 && this.field2162 != null) {
                                                this.field2162.field6682 = null;
                                             }

                                             ++var69;
                                             break;
                                          }
                                       } else {
                                          var10000 = var71[var72];
                                       }
                                    }
                                 }
                              } while(~var69 > ~var9);
                           }

                           if (this.field2117 != null) {
                              int var75 = 0;
                              if (var8 || this.field2130 > var75) {
                                 do {
                                    class249 var76 = this.field2117[var75];
                                    class248 var77 = this.field2099[var75];
                                    var77.field3774 = -(this.field2155[var76.field3783] & 255) + 255 << 24 | 16777215 & var77.field3774;
                                    ++var75;
                                 } while(this.field2130 > var75);
                              }
                           }
                        }

                     } else if (arg0 == 7) {
                        if (this.field2072 != null) {
                           int var78 = 0;
                           if (var8 || ~var9 < ~var78) {
                              do {
                                 int var79 = arg1[var78];
                                 if (this.field2072.length <= var79) {
                                    ++var78;
                                 } else {
                                    int[] var80 = this.field2072[var79];
                                    int var81 = 0;
                                    if (var8) {
                                       var10000 = var80[var81];
                                    } else if (~var81 <= ~var80.length) {
                                       var10000 = ~var80.length;
                                       if (!var8) {
                                          if (var10000 < -1 && this.field2162 != null) {
                                             this.field2162.field6682 = null;
                                          }

                                          ++var78;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var80[var81];
                                    }

                                    while(true) {
                                       int var82 = var10000;
                                       int var83 = 65535 & this.field2140[var82];
                                       int var84 = 63 & var83 >> 10;
                                       int var85 = (906 & var83) >> 7;
                                       int var86 = arg2 + var84 & 63;
                                       int var87 = var83 & 127;
                                       int var88 = arg3 / 4 + var85;
                                       int var89 = arg4 + var87;
                                       if (var88 >= 0) {
                                          if (var88 > 7) {
                                             var88 = 7;
                                             if (var8) {
                                                var88 = 0;
                                             }
                                          }
                                       } else {
                                          var88 = 0;
                                       }

                                       if (var89 >= 0) {
                                          if (var89 > 127) {
                                             var89 = 127;
                                             if (var8) {
                                                var89 = 0;
                                             }
                                          }
                                       } else {
                                          var89 = 0;
                                       }

                                       this.field2140[var82] = (short)class119.method1087(class119.method1087(var88 << 7, var86 << 10), var89);
                                       ++var81;
                                       if (~var81 <= ~var80.length) {
                                          var10000 = ~var80.length;
                                          if (!var8) {
                                             if (var10000 < -1 && this.field2162 != null) {
                                                this.field2162.field6682 = null;
                                             }

                                             ++var78;
                                             break;
                                          }
                                       } else {
                                          var10000 = var80[var81];
                                       }
                                    }
                                 }
                              } while(~var9 < ~var78);
                           }

                           if (this.field2117 != null) {
                              int var90 = 0;
                              if (var8 || this.field2130 > var90) {
                                 do {
                                    class249 var91 = this.field2117[var90];
                                    class248 var92 = this.field2099[var90];
                                    var92.field3774 = var92.field3774 & -16777216 | 16777215 & class228.field3503[65535 & this.field2140[var91.field3783]];
                                    ++var90;
                                 } while(this.field2130 > var90);
                              }
                           }
                        }

                     } else if (~arg0 == -9) {
                        if (this.field2083 != null) {
                           int var93 = 0;
                           if (var8 || ~var9 < ~var93) {
                              do {
                                 int var94 = arg1[var93];
                                 if (this.field2083.length <= var94) {
                                    ++var93;
                                 } else {
                                    int[] var95 = this.field2083[var94];
                                    int var96 = 0;
                                    if (!var8 && var96 >= var95.length) {
                                       ++var93;
                                    } else {
                                       do {
                                          class248 var97 = this.field2099[var95[var96]];
                                          var97.field3770 += arg2;
                                          var97.field3777 += arg3;
                                          ++var96;
                                       } while(var96 < var95.length);

                                       ++var93;
                                    }
                                 }
                              } while(~var9 < ~var93);
                           }
                        }

                     } else if (arg0 == 10) {
                        if (this.field2083 != null) {
                           int var98 = 0;
                           if (var8 || var98 < var9) {
                              do {
                                 int var99 = arg1[var98];
                                 if (~var99 <= ~this.field2083.length) {
                                    ++var98;
                                 } else {
                                    int[] var100 = this.field2083[var99];
                                    int var101 = 0;
                                    if (!var8 && var100.length <= var101) {
                                       ++var98;
                                    } else {
                                       do {
                                          class248 var102 = this.field2099[var100[var101]];
                                          var102.field3772 = var102.field3772 * arg3 >> 7;
                                          var102.field3769 = var102.field3769 * arg2 >> 7;
                                          ++var101;
                                       } while(var100.length > var101);

                                       ++var98;
                                    }
                                 }
                              } while(var98 < var9);
                           }
                        }

                     } else if (arg0 == 9) {
                        if (this.field2083 != null) {
                           int var103 = 0;
                           if (var8 || ~var9 < ~var103) {
                              do {
                                 int var104 = arg1[var103];
                                 if (~this.field2083.length >= ~var104) {
                                    ++var103;
                                 } else {
                                    int[] var105 = this.field2083[var104];
                                    int var106 = 0;
                                    if (!var8 && var106 >= var105.length) {
                                       ++var103;
                                    } else {
                                       do {
                                          class248 var107 = this.field2099[var105[var106]];
                                          var107.field3773 = var107.field3773 + arg2 & 16383;
                                          ++var106;
                                       } while(var106 < var105.length);

                                       ++var103;
                                    }
                                 }
                              } while(~var9 < ~var103);
                           }
                        }

                     }
                  } else {
                     int var64 = 0;
                     if (var8 || var9 > var64) {
                        do {
                           int var65 = arg1[var64];
                           if (~var65 <= ~this.field2107.length) {
                              ++var64;
                           } else {
                              int[] var66 = this.field2107[var65];
                              int var67 = 0;
                              if (!var8 && ~var66.length >= ~var67) {
                                 ++var64;
                              } else {
                                 do {
                                    int var68 = var66[var67];
                                    this.field2197[var68] -= class728.field10876;
                                    this.field2134[var68] -= class696.field10343;
                                    this.field2100[var68] -= class462.field7021;
                                    this.field2197[var68] = this.field2197[var68] * arg2 >> 7;
                                    this.field2134[var68] = this.field2134[var68] * arg3 >> 7;
                                    this.field2100[var68] = this.field2100[var68] * arg4 >> 7;
                                    this.field2197[var68] += class728.field10876;
                                    this.field2134[var68] += class696.field10343;
                                    this.field2100[var68] += class462.field7021;
                                    ++var67;
                                 } while(~var66.length < ~var67);

                                 ++var64;
                              }
                           }
                        } while(var9 > var64);

                     }
                  }
               } else {
                  int var21 = 0;
                  int var46;
                  int var47;
                  int[] var48;
                  int var49;
                  int var50;
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  int var57;
                  int var58;
                  int var59;
                  int var60;
                  int var61;
                  int var62;
                  int var63;
                  if (var8) {
                     var10000 = arg1[var21];
                  } else if (~var21 <= ~var9) {
                     var10000 = arg6;
                     if (!var8) {
                        if (arg6 != 0) {
                           var46 = 0;
                           if (var8 || ~var9 < ~var46) {
                              do {
                                 var47 = arg1[var46];
                                 if (var47 >= this.field2107.length) {
                                    ++var46;
                                 } else {
                                    var48 = this.field2107[var47];
                                    var49 = 0;
                                    if (!var8 && var48.length <= var49) {
                                       ++var46;
                                    } else {
                                       label632:
                                       do {
                                          var50 = var48[var49];
                                          var51 = this.field2094[var50];
                                          var52 = this.field2094[var50 + 1];
                                          var53 = var51;
                                          if (!var8 && var52 <= var51) {
                                             ++var49;
                                          } else {
                                             do {
                                                var54 = this.field2080[var53] + -1;
                                                if (~var54 == 0) {
                                                   ++var49;
                                                   continue label632;
                                                }

                                                if (~arg4 != -1) {
                                                   var55 = class83.field1196[arg4];
                                                   var56 = class83.field1194[arg4];
                                                   var57 = this.field2156[var54] * var56 + this.field2137[var54] * var55 + 16383 >> 14;
                                                   this.field2137[var54] = (short)(this.field2137[var54] * var56 + -(this.field2156[var54] * var55) + 16383 >> 14);
                                                   this.field2156[var54] = (short)var57;
                                                }

                                                if (~arg2 != -1) {
                                                   var58 = class83.field1196[arg2];
                                                   var59 = class83.field1194[arg2];
                                                   var60 = this.field2137[var54] * var59 - this.field2154[var54] * var58 + 16383 >> 14;
                                                   this.field2154[var54] = (short)(this.field2154[var54] * var59 + this.field2137[var54] * var58 + 16383 >> 14);
                                                   this.field2137[var54] = (short)var60;
                                                }

                                                if (~arg3 != -1) {
                                                   var61 = class83.field1196[arg3];
                                                   var62 = class83.field1194[arg3];
                                                   var63 = this.field2156[var54] * var62 + this.field2154[var54] * var61 + 16383 >> 14;
                                                   this.field2154[var54] = (short)(this.field2154[var54] * var62 + 16383 + -(this.field2156[var54] * var61) >> 14);
                                                   this.field2156[var54] = (short)var63;
                                                }

                                                ++var53;
                                             } while(var52 > var53);

                                             ++var49;
                                          }
                                       } while(var48.length > var49);

                                       ++var46;
                                    }
                                 }
                              } while(~var9 < ~var46);
                           }

                           if (this.field2138 == null && this.field2162 != null) {
                              this.field2162.field6682 = null;
                           }

                           if (this.field2138 != null) {
                              this.field2138.field6682 = null;
                           }
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var21];
                  }

                  while(true) {
                     int var22 = var10000;
                     if (var22 >= this.field2107.length) {
                        ++var21;
                     } else {
                        label833: {
                           int[] var23 = this.field2107[var22];
                           int var35;
                           int var36;
                           int var37;
                           int var38;
                           int var39;
                           int var40;
                           int var41;
                           int var42;
                           int var43;
                           int var44;
                           int var45;
                           if (~(1 & arg5) != -1) {
                              int var24 = 0;
                              int var25;
                              int var26;
                              int var27;
                              int var28;
                              int var29;
                              int var30;
                              int var31;
                              int var32;
                              int var33;
                              int var34;
                              if (var8) {
                                 var25 = var23[var24];
                                 this.field2197[var25] -= class728.field10876;
                                 this.field2134[var25] -= class696.field10343;
                                 this.field2100[var25] -= class462.field7021;
                                 if (arg2 != 0) {
                                    var26 = class83.field1196[arg2];
                                    var27 = class83.field1194[arg2];
                                    var28 = this.field2134[var25] * var27 + -(this.field2100[var25] * var26) + 16383 >> 14;
                                    this.field2100[var25] = this.field2134[var25] * var26 + this.field2100[var25] * var27 + 16383 >> 14;
                                    this.field2134[var25] = var28;
                                 }

                                 if (arg4 != 0) {
                                    var29 = class83.field1196[arg4];
                                    var30 = class83.field1194[arg4];
                                    var31 = this.field2197[var25] * var30 + (this.field2134[var25] * var29 - -16383) >> 14;
                                    this.field2134[var25] = this.field2134[var25] * var30 + 16383 - this.field2197[var25] * var29 >> 14;
                                    this.field2197[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class83.field1196[arg3];
                                    var33 = class83.field1194[arg3];
                                    var34 = this.field2197[var25] * var33 + this.field2100[var25] * var32 - -16383 >> 14;
                                    this.field2100[var25] = this.field2100[var25] * var33 + 16383 + -(this.field2197[var25] * var32) >> 14;
                                    this.field2197[var25] = var34;
                                 }

                                 this.field2197[var25] += class728.field10876;
                                 this.field2134[var25] += class696.field10343;
                                 this.field2100[var25] += class462.field7021;
                                 ++var24;
                              }

                              while(var23.length > var24) {
                                 var25 = var23[var24];
                                 this.field2197[var25] -= class728.field10876;
                                 this.field2134[var25] -= class696.field10343;
                                 this.field2100[var25] -= class462.field7021;
                                 if (arg2 != 0) {
                                    var26 = class83.field1196[arg2];
                                    var27 = class83.field1194[arg2];
                                    var28 = this.field2134[var25] * var27 + -(this.field2100[var25] * var26) + 16383 >> 14;
                                    this.field2100[var25] = this.field2134[var25] * var26 + this.field2100[var25] * var27 + 16383 >> 14;
                                    this.field2134[var25] = var28;
                                 }

                                 if (arg4 != 0) {
                                    var29 = class83.field1196[arg4];
                                    var30 = class83.field1194[arg4];
                                    var31 = this.field2197[var25] * var30 + (this.field2134[var25] * var29 - -16383) >> 14;
                                    this.field2134[var25] = this.field2134[var25] * var30 + 16383 - this.field2197[var25] * var29 >> 14;
                                    this.field2197[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class83.field1196[arg3];
                                    var33 = class83.field1194[arg3];
                                    var34 = this.field2197[var25] * var33 + this.field2100[var25] * var32 - -16383 >> 14;
                                    this.field2100[var25] = this.field2100[var25] * var33 + 16383 + -(this.field2197[var25] * var32) >> 14;
                                    this.field2197[var25] = var34;
                                 }

                                 this.field2197[var25] += class728.field10876;
                                 this.field2134[var25] += class696.field10343;
                                 this.field2100[var25] += class462.field7021;
                                 ++var24;
                              }

                              if (!var8) {
                                 ++var21;
                                 break label833;
                              }

                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field2197[var36] -= class728.field10876;
                                 this.field2134[var36] -= class696.field10343;
                                 this.field2100[var36] -= class462.field7021;
                                 if (~arg4 != -1) {
                                    var37 = class83.field1196[arg4];
                                    var38 = class83.field1194[arg4];
                                    var39 = this.field2134[var36] * var37 + (this.field2197[var36] * var38 - -16383) >> 14;
                                    this.field2134[var36] = this.field2134[var36] * var38 + -(this.field2197[var36] * var37) + 16383 >> 14;
                                    this.field2197[var36] = var39;
                                 }

                                 if (arg2 != 0) {
                                    var40 = class83.field1196[arg2];
                                    var41 = class83.field1194[arg2];
                                    var42 = this.field2134[var36] * var41 + -(this.field2100[var36] * var40) + 16383 >> 14;
                                    this.field2100[var36] = this.field2134[var36] * var40 + this.field2100[var36] * var41 - -16383 >> 14;
                                    this.field2134[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class83.field1196[arg3];
                                    var44 = class83.field1194[arg3];
                                    var45 = this.field2197[var36] * var44 + this.field2100[var36] * var43 + 16383 >> 14;
                                    this.field2100[var36] = this.field2100[var36] * var44 + -(this.field2197[var36] * var43) + 16383 >> 14;
                                    this.field2197[var36] = var45;
                                 }

                                 this.field2197[var36] += class728.field10876;
                                 this.field2134[var36] += class696.field10343;
                                 this.field2100[var36] += class462.field7021;
                                 ++var35;
                              }
                           } else {
                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field2197[var36] -= class728.field10876;
                                 this.field2134[var36] -= class696.field10343;
                                 this.field2100[var36] -= class462.field7021;
                                 if (~arg4 != -1) {
                                    var37 = class83.field1196[arg4];
                                    var38 = class83.field1194[arg4];
                                    var39 = this.field2134[var36] * var37 + (this.field2197[var36] * var38 - -16383) >> 14;
                                    this.field2134[var36] = this.field2134[var36] * var38 + -(this.field2197[var36] * var37) + 16383 >> 14;
                                    this.field2197[var36] = var39;
                                 }

                                 if (arg2 != 0) {
                                    var40 = class83.field1196[arg2];
                                    var41 = class83.field1194[arg2];
                                    var42 = this.field2134[var36] * var41 + -(this.field2100[var36] * var40) + 16383 >> 14;
                                    this.field2100[var36] = this.field2134[var36] * var40 + this.field2100[var36] * var41 - -16383 >> 14;
                                    this.field2134[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class83.field1196[arg3];
                                    var44 = class83.field1194[arg3];
                                    var45 = this.field2197[var36] * var44 + this.field2100[var36] * var43 + 16383 >> 14;
                                    this.field2100[var36] = this.field2100[var36] * var44 + -(this.field2197[var36] * var43) + 16383 >> 14;
                                    this.field2197[var36] = var45;
                                 }

                                 this.field2197[var36] += class728.field10876;
                                 this.field2134[var36] += class696.field10343;
                                 this.field2100[var36] += class462.field7021;
                                 ++var35;
                              }
                           }

                           while(~var23.length < ~var35) {
                              var36 = var23[var35];
                              this.field2197[var36] -= class728.field10876;
                              this.field2134[var36] -= class696.field10343;
                              this.field2100[var36] -= class462.field7021;
                              if (~arg4 != -1) {
                                 var37 = class83.field1196[arg4];
                                 var38 = class83.field1194[arg4];
                                 var39 = this.field2134[var36] * var37 + (this.field2197[var36] * var38 - -16383) >> 14;
                                 this.field2134[var36] = this.field2134[var36] * var38 + -(this.field2197[var36] * var37) + 16383 >> 14;
                                 this.field2197[var36] = var39;
                              }

                              if (arg2 != 0) {
                                 var40 = class83.field1196[arg2];
                                 var41 = class83.field1194[arg2];
                                 var42 = this.field2134[var36] * var41 + -(this.field2100[var36] * var40) + 16383 >> 14;
                                 this.field2100[var36] = this.field2134[var36] * var40 + this.field2100[var36] * var41 - -16383 >> 14;
                                 this.field2134[var36] = var42;
                              }

                              if (arg3 != 0) {
                                 var43 = class83.field1196[arg3];
                                 var44 = class83.field1194[arg3];
                                 var45 = this.field2197[var36] * var44 + this.field2100[var36] * var43 + 16383 >> 14;
                                 this.field2100[var36] = this.field2100[var36] * var44 + -(this.field2197[var36] * var43) + 16383 >> 14;
                                 this.field2197[var36] = var45;
                              }

                              this.field2197[var36] += class728.field10876;
                              this.field2134[var36] += class696.field10343;
                              this.field2100[var36] += class462.field7021;
                              ++var35;
                           }

                           ++var21;
                        }
                     }

                     if (~var21 <= ~var9) {
                        var10000 = arg6;
                        if (!var8) {
                           if (arg6 != 0) {
                              var46 = 0;
                              if (var8 || ~var9 < ~var46) {
                                 do {
                                    var47 = arg1[var46];
                                    if (var47 >= this.field2107.length) {
                                       ++var46;
                                    } else {
                                       var48 = this.field2107[var47];
                                       var49 = 0;
                                       if (!var8 && var48.length <= var49) {
                                          ++var46;
                                       } else {
                                          label264:
                                          do {
                                             var50 = var48[var49];
                                             var51 = this.field2094[var50];
                                             var52 = this.field2094[var50 + 1];
                                             var53 = var51;
                                             if (!var8 && var52 <= var51) {
                                                ++var49;
                                             } else {
                                                do {
                                                   var54 = this.field2080[var53] + -1;
                                                   if (~var54 == 0) {
                                                      ++var49;
                                                      continue label264;
                                                   }

                                                   if (~arg4 != -1) {
                                                      var55 = class83.field1196[arg4];
                                                      var56 = class83.field1194[arg4];
                                                      var57 = this.field2156[var54] * var56 + this.field2137[var54] * var55 + 16383 >> 14;
                                                      this.field2137[var54] = (short)(this.field2137[var54] * var56 + -(this.field2156[var54] * var55) + 16383 >> 14);
                                                      this.field2156[var54] = (short)var57;
                                                   }

                                                   if (~arg2 != -1) {
                                                      var58 = class83.field1196[arg2];
                                                      var59 = class83.field1194[arg2];
                                                      var60 = this.field2137[var54] * var59 - this.field2154[var54] * var58 + 16383 >> 14;
                                                      this.field2154[var54] = (short)(this.field2154[var54] * var59 + this.field2137[var54] * var58 + 16383 >> 14);
                                                      this.field2137[var54] = (short)var60;
                                                   }

                                                   if (~arg3 != -1) {
                                                      var61 = class83.field1196[arg3];
                                                      var62 = class83.field1194[arg3];
                                                      var63 = this.field2156[var54] * var62 + this.field2154[var54] * var61 + 16383 >> 14;
                                                      this.field2154[var54] = (short)(this.field2154[var54] * var62 + 16383 + -(this.field2156[var54] * var61) >> 14);
                                                      this.field2156[var54] = (short)var63;
                                                   }

                                                   ++var53;
                                                } while(var52 > var53);

                                                ++var49;
                                             }
                                          } while(var48.length > var49);

                                          ++var46;
                                       }
                                    }
                                 } while(~var9 < ~var46);
                              }

                              if (this.field2138 == null && this.field2162 != null) {
                                 this.field2162.field6682 = null;
                              }

                              if (this.field2138 != null) {
                                 this.field2138.field6682 = null;
                              }
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var21];
                     }
                  }
               }
            } else {
               var111 = arg3 << 4;
               var112 = arg4 << 4;
               var110 = arg2 << 4;
               int var16 = 0;
               if (var8 || ~var9 < ~var16) {
                  do {
                     int var17 = arg1[var16];
                     if (~this.field2107.length >= ~var17) {
                        ++var16;
                     } else {
                        int[] var18 = this.field2107[var17];
                        int var19 = 0;
                        if (!var8 && ~var18.length >= ~var19) {
                           ++var16;
                        } else {
                           do {
                              int var20 = var18[var19];
                              this.field2197[var20] += var110;
                              this.field2134[var20] += var111;
                              this.field2100[var20] += var112;
                              ++var19;
                           } while(~var18.length < ~var19);

                           ++var16;
                        }
                     }
                  } while(~var9 < ~var16);

               }
            }
         } else {
            var112 = arg4 << 4;
            var111 = arg3 << 4;
            var110 = arg2 << 4;
            class696.field10343 = 0;
            int var10 = 0;
            class462.field7021 = 0;
            class728.field10876 = 0;
            int var11 = 0;
            if (var8) {
               var10000 = arg1[var11];
            } else if (~var9 >= ~var11) {
               var10000 = ~var10;
               if (!var8) {
                  if (var10000 >= -1) {
                     class462.field7021 = var112;
                     class728.field10876 = var110;
                     class696.field10343 = var111;
                     return;
                  }

                  class728.field10876 = class728.field10876 / var10 + var110;
                  class696.field10343 = class696.field10343 / var10 - -var111;
                  class462.field7021 = class462.field7021 / var10 + var112;
                  return;
               }
            } else {
               var10000 = arg1[var11];
            }

            while(true) {
               int var12 = var10000;
               if (~this.field2107.length >= ~var12) {
                  ++var11;
               } else {
                  int[] var13 = this.field2107[var12];
                  int var14 = 0;
                  int var15;
                  if (var8) {
                     var15 = var13[var14];
                     class728.field10876 += this.field2197[var15];
                     class696.field10343 += this.field2134[var15];
                     class462.field7021 += this.field2100[var15];
                     ++var10;
                     ++var14;
                  }

                  while(var13.length > var14) {
                     var15 = var13[var14];
                     class728.field10876 += this.field2197[var15];
                     class696.field10343 += this.field2134[var15];
                     class462.field7021 += this.field2100[var15];
                     ++var10;
                     ++var14;
                  }

                  ++var11;
               }

               if (~var9 >= ~var11) {
                  var10000 = ~var10;
                  if (!var8) {
                     if (var10000 >= -1) {
                        class462.field7021 = var112;
                        class728.field10876 = var110;
                        class696.field10343 = var111;
                        return;
                     }

                     class728.field10876 = class728.field10876 / var10 + var110;
                     class696.field10343 = class696.field10343 / var10 - -var111;
                     class462.field7021 = class462.field7021 / var10 + var112;
                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var109) {
         throw class482.method3757(var109, field2199[34] + arg0 + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "NA",
      descriptor = "()Z",
      line = 661
   )
   public final boolean method899() {
      boolean var1 = client.field1786;

      try {
         ++field2192;
         if (this.field2107 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var1) {
               this.field2197[var2] <<= 4;
               this.field2134[var2] <<= 4;
               this.field2100[var2] <<= 4;
               ++var2;
            }

            while(true) {
               while(~this.field2181 < ~var2) {
                  this.field2197[var2] <<= 4;
                  this.field2134[var2] <<= 4;
                  this.field2100[var2] <<= 4;
                  ++var2;
               }

               class728.field10876 = 0;
               class696.field10343 = 0;
               class462.field7021 = 0;
               if (!var1) {
                  return true;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2199[37] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "wa",
      descriptor = "()V",
      line = 688
   )
   public final void method915() {
      boolean var1 = client.field1786;

      try {
         ++field2173;
         int var2 = 0;
         if (var1) {
            this.field2197[var2] = this.field2197[var2] + 7 >> 4;
            this.field2134[var2] = this.field2134[var2] + 7 >> 4;
            this.field2100[var2] = this.field2100[var2] - -7 >> 4;
            ++var2;
         }

         while(true) {
            while(this.field2181 > var2) {
               this.field2197[var2] = this.field2197[var2] + 7 >> 4;
               this.field2134[var2] = this.field2134[var2] + 7 >> 4;
               this.field2100[var2] = this.field2100[var2] - -7 >> 4;
               ++var2;
            }

            if (!var1) {
               if (this.field2198 != null) {
                  this.field2198.field6682 = null;
               }

               this.field2121 = false;
               return;
            }

            this.field2100[var2] = this.field2100[var2] - -7 >> 4;
            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2199[25] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "na",
      descriptor = "()I",
      line = 712
   )
   public final int method891() {
      try {
         ++field2119;
         if (!this.field2121) {
            this.method1327((byte)-41);
         }

         return this.field2157;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[57] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "F",
      descriptor = "()Z",
      line = 724
   )
   public final boolean method892() {
      try {
         ++field2091;
         return this.field2106;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "G",
      descriptor = "()I",
      line = 735
   )
   public final int method866() {
      try {
         ++field2097;
         if (!this.field2121) {
            this.method1327((byte)-71);
         }

         return this.field2084;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[56] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "WA",
      descriptor = "()I",
      line = 749
   )
   public final int method916() {
      try {
         ++field2120;
         return this.field2178;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[48] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IIII)V",
      line = 757
   )
   public final void method882(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field2092;
         int var6 = 0;
         int var11;
         class249 var12;
         class248 var13;
         class146 var10000;
         if (var5) {
            var10000 = this;
         } else if (this.field2144 <= var6) {
            var10000 = this;
            if (!var5) {
               if (this.field2117 != null) {
                  var11 = 0;
                  if (var5 || var11 < this.field2130) {
                     do {
                        var12 = this.field2117[var11];
                        var13 = this.field2099[var11];
                        var13.field3774 = 16777215 & class228.field3503[this.field2140[var12.field3783] & 65535] | var13.field3774 & -16777216;
                        ++var11;
                     } while(var11 < this.field2130);
                  }
               }

               if (this.field2162 != null) {
                  this.field2162.field6682 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var7 = var10000.field2140[var6] & 65535;
            int var8 = 63 & var7 >> 10;
            int var9 = var7 >> 7 & 7;
            if (arg0 != -1) {
               var8 += (-var8 + arg0) * arg3 >> 7;
            }

            int var10 = var7 & 127;
            if (arg1 != -1) {
               var9 -= -((-var9 + arg1) * arg3 >> 7);
            }

            if (arg2 != -1) {
               var10 += (-var10 + arg2) * arg3 >> 7;
            }

            this.field2140[var6] = (short)class119.method1087(class119.method1087(var8 << 10, var9 << 7), var10);
            ++var6;
            if (this.field2144 <= var6) {
               var10000 = this;
               if (!var5) {
                  if (this.field2117 != null) {
                     var11 = 0;
                     if (var5 || var11 < this.field2130) {
                        do {
                           var12 = this.field2117[var11];
                           var13 = this.field2099[var11];
                           var13.field3774 = 16777215 & class228.field3503[this.field2140[var12.field3783] & 65535] | var13.field3774 & -16777216;
                           ++var11;
                        } while(var11 < this.field2130);
                     }
                  }

                  if (this.field2162 != null) {
                     this.field2162.field6682 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var15) {
         throw class482.method3757(var15, field2199[29] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(B[B)V",
      line = 815
   )
   public final void method893(byte arg0, byte[] arg1) {
      boolean var3 = client.field1786;

      try {
         int var4;
         if (arg1 != null) {
            var4 = 0;
            if (var3 || var4 < this.field2144) {
               do {
                  int var5 = 255 - (-(255 & arg1[var4]) + 255) * (-(255 & arg0) + 255) / 255;
                  this.field2155[var4] = (byte)var5;
                  ++var4;
               } while(var4 < this.field2144);
            }

            if (var3) {
               var4 = 0;
               if (var3) {
                  this.field2155[var4] = arg0;
                  ++var4;
               }
            } else {
               ++field2171;
               if (!var3) {
                  if (this.field2162 != null) {
                     this.field2162.field6682 = null;
                     return;
                  }

                  return;
               }

               this.field2155[var4] = arg0;
               ++var4;
            }
         } else {
            var4 = 0;
            if (var3) {
               this.field2155[var4] = arg0;
               ++var4;
            }
         }

         while(true) {
            while(var4 < this.field2144) {
               this.field2155[var4] = arg0;
               ++var4;
            }

            ++field2171;
            if (!var3) {
               if (this.field2162 != null) {
                  this.field2162.field6682 = null;
                  return;
               }

               return;
            }

            this.field2155[var4] = arg0;
            ++var4;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2199[53] + arg0 + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IB)V",
      line = 854
   )
   public static final void method1318(int arg0, byte arg1) {
      try {
         ++field2135;
         if (class147.field2219 != null) {
            if (~arg0 <= -1 && ~arg0 > ~class147.field2219.field9241) {
               class277 var2 = class147.field2219.field9240[arg0];
               if (~var2.field4412 == 0) {
                  class29 var3 = class578.method4332((byte)-32);
                  class577 var4 = class218.method1888(class760.field11230, 91, var3.field361);
                  var4.field8531.method2864(-26110, class714.method5292((byte)-97, var2.field4417) + 2);
                  var4.field8531.method2873(arg0, (byte)-34);
                  var4.field8531.method2862(var2.field4417, true);
                  var3.method211(var4, 115);
                  if (arg1 < 91) {
                     method1324(117, 34, 62);
                  }
               }
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2199[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "f",
      descriptor = "()[Lgl;",
      line = 885
   )
   public final class574[] method873() {
      try {
         ++field2159;
         return this.field2182;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[36] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "da",
      descriptor = "()I",
      line = 895
   )
   public final int method894() {
      try {
         ++field2118;
         return this.field2079;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[2] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "ia",
      descriptor = "(SS)V",
      line = 906
   )
   public final void method901(short arg0, short arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2160;
         int var4 = 0;
         if (var3) {
            if (this.field2140[var4] == arg0) {
               this.field2140[var4] = arg1;
               ++var4;
            } else {
               ++var4;
            }
         }

         while(true) {
            while(var4 < this.field2144) {
               if (this.field2140[var4] == arg0) {
                  this.field2140[var4] = arg1;
                  ++var4;
               } else {
                  ++var4;
               }
            }

            if (!var3) {
               if (this.field2117 != null) {
                  int var5 = 0;
                  if (var3 || ~var5 > ~this.field2130) {
                     do {
                        class249 var6 = this.field2117[var5];
                        class248 var7 = this.field2099[var5];
                        var7.field3774 = class228.field3503[this.field2140[var6.field3783] & 65535] & 16777215 | var7.field3774 & -16777216;
                        ++var5;
                     } while(~var5 > ~this.field2130);
                  }
               }

               if (this.field2162 != null) {
                  this.field2162.field6682 = null;
                  return;
               }

               return;
            }

            this.field2140[var4] = arg1;
            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2199[63] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lkf;)V",
      line = 948
   )
   public final void method909(class401 arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2153;
         class167 var3 = (class167)arg0;
         if (this.field2182 != null) {
            int var4 = 0;
            if (var2 || ~this.field2182.length < ~var4) {
               do {
                  class574 var5 = this.field2182[var4];
                  class574 var6 = var5;
                  if (var5.field8499 != null) {
                     var6 = var5.field8499;
                  }

                  var6.field8502 = (int)((float)this.field2100[var5.field8514] * var3.field2515 + (float)this.field2197[var5.field8514] * var3.field2533 + (float)this.field2134[var5.field8514] * var3.field2534 + var3.field2510);
                  var6.field8500 = (int)((float)this.field2100[var5.field8514] * var3.field2541 + (float)this.field2197[var5.field8514] * var3.field2530 + (float)this.field2134[var5.field8514] * var3.field2513 + var3.field2538);
                  var6.field8508 = (int)((float)this.field2100[var5.field8514] * var3.field2517 + (float)this.field2197[var5.field8514] * var3.field2516 + (float)this.field2134[var5.field8514] * var3.field2514 + var3.field2531);
                  var6.field8510 = (int)((float)this.field2100[var5.field8503] * var3.field2515 + (float)this.field2197[var5.field8503] * var3.field2533 + (float)this.field2134[var5.field8503] * var3.field2534 + var3.field2510);
                  var6.field8505 = (int)((float)this.field2100[var5.field8503] * var3.field2541 + (float)this.field2197[var5.field8503] * var3.field2530 + (float)this.field2134[var5.field8503] * var3.field2513 + var3.field2538);
                  var6.field8504 = (int)((float)this.field2100[var5.field8503] * var3.field2517 + (float)this.field2197[var5.field8503] * var3.field2516 + (float)this.field2134[var5.field8503] * var3.field2514 + var3.field2531);
                  var6.field8506 = (int)((float)this.field2100[var5.field8507] * var3.field2515 + (float)this.field2197[var5.field8507] * var3.field2533 + (float)this.field2134[var5.field8507] * var3.field2534 + var3.field2510);
                  var6.field8498 = (int)((float)this.field2100[var5.field8507] * var3.field2541 + (float)this.field2197[var5.field8507] * var3.field2530 + (float)this.field2134[var5.field8507] * var3.field2513 + var3.field2538);
                  var6.field8512 = (int)((float)this.field2100[var5.field8507] * var3.field2517 + (float)this.field2197[var5.field8507] * var3.field2516 + (float)this.field2134[var5.field8507] * var3.field2514 + var3.field2531);
                  ++var4;
               } while(~this.field2182.length < ~var4);
            }
         }

         if (this.field2188 != null) {
            int var7 = 0;
            if (var2 || var7 < this.field2188.length) {
               do {
                  class253 var8 = this.field2188[var7];
                  class253 var9 = var8;
                  if (var8.field3812 != null) {
                     var9 = var8.field3812;
                  }

                  if (var8.field3818 == null) {
                     var8.field3818 = var3.method1548();
                     if (var2) {
                        var8.field3818.method1549(var3);
                     }
                  } else {
                     var8.field3818.method1549(var3);
                  }

                  var9.field3813 = (int)((float)this.field2100[var8.field3816] * var3.field2515 + (float)this.field2197[var8.field3816] * var3.field2533 + (float)this.field2134[var8.field3816] * var3.field2534 + var3.field2510);
                  var9.field3819 = (int)((float)this.field2100[var8.field3816] * var3.field2541 + (float)this.field2197[var8.field3816] * var3.field2530 + (float)this.field2134[var8.field3816] * var3.field2513 + var3.field2538);
                  var9.field3815 = (int)((float)this.field2100[var8.field3816] * var3.field2517 + (float)this.field2197[var8.field3816] * var3.field2516 + (float)this.field2134[var8.field3816] * var3.field2514 + var3.field2531);
                  ++var7;
               } while(var7 < this.field2188.length);

            }
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2199[26] + (arg0 != null ? field2199[5] : field2199[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "()V",
      line = 1019
   )
   public final void method920() {
      try {
         ++field2176;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[44] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ZB)V",
      line = 1036
   )
   private final void method1319(boolean arg0, byte arg1) {
      boolean var3 = client.field1786;

      try {
         label82: {
            ++field2149;
            if (~(this.field2136 * 6) < ~this.field2187.field9720.field5428.length) {
               this.field2187.field9720 = new class37((this.field2136 + 100) * 6);
               if (!var3) {
                  break label82;
               }
            }

            this.field2187.field9720.field5436 = 0;
         }

         class37 var4 = this.field2187.field9720;
         int var5;
         if (this.field2187.field9695) {
            var5 = 0;
            if (var3) {
               var4.method2873(this.field2110[var5], (byte)113);
               var4.method2873(this.field2104[var5], (byte)-112);
               var4.method2873(this.field2088[var5], (byte)105);
               ++var5;
            }

            while(true) {
               while(~this.field2136 < ~var5) {
                  var4.method2873(this.field2110[var5], (byte)113);
                  var4.method2873(this.field2104[var5], (byte)-112);
                  var4.method2873(this.field2088[var5], (byte)105);
                  ++var5;
               }

               if (!var3) {
                  if (var3) {
                     var5 = 0;
                     if (var3) {
                        var4.method2841(-3, this.field2110[var5]);
                        var4.method2841(-3, this.field2104[var5]);
                        var4.method2841(-3, this.field2088[var5]);
                        ++var5;
                     }
                  } else {
                     if (!var3) {
                        if (~var4.field5436 == -1) {
                           return;
                        }

                        if (arg1 >= -36) {
                           this.field2179 = false;
                        }

                        label167: {
                           if (!arg0) {
                              this.field2166.field1790 = this.field2187.method4732(false, 5123, var4.field5436, var4.field5428, 126);
                              if (!var3) {
                                 break label167;
                              }
                           }

                           label131: {
                              if (this.field2127 != null) {
                                 this.field2127.method1590(var4.field5428, var4.field5436, 24668, 5123);
                                 if (!var3) {
                                    break label131;
                                 }
                              }

                              this.field2127 = this.field2187.method4732(true, 5123, var4.field5436, var4.field5428, 109);
                           }

                           this.field2166.field1790 = this.field2127;
                        }

                        if (!arg0) {
                           this.field2179 = true;
                           return;
                        }

                        return;
                     }

                     var4.method2841(-3, this.field2088[var5]);
                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var3) {
               var4.method2841(-3, this.field2110[var5]);
               var4.method2841(-3, this.field2104[var5]);
               var4.method2841(-3, this.field2088[var5]);
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field2136) {
               var4.method2841(-3, this.field2110[var5]);
               var4.method2841(-3, this.field2104[var5]);
               var4.method2841(-3, this.field2088[var5]);
               ++var5;
            }

            if (!var3) {
               if (~var4.field5436 == -1) {
                  return;
               }

               if (arg1 >= -36) {
                  this.field2179 = false;
               }

               label171: {
                  if (!arg0) {
                     this.field2166.field1790 = this.field2187.method4732(false, 5123, var4.field5436, var4.field5428, 126);
                     if (!var3) {
                        break label171;
                     }
                  }

                  label49: {
                     if (this.field2127 != null) {
                        this.field2127.method1590(var4.field5428, var4.field5436, 24668, 5123);
                        if (!var3) {
                           break label49;
                        }
                     }

                     this.field2127 = this.field2187.method4732(true, 5123, var4.field5436, var4.field5428, 109);
                  }

                  this.field2166.field1790 = this.field2127;
               }

               if (!arg0) {
                  this.field2179 = true;
                  return;
               }

               return;
            }

            var4.method2841(-3, this.field2088[var5]);
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2199[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ZI)V",
      line = 1104
   )
   private final void method1320(boolean arg0, int arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2129;
         boolean var4 = this.field2162 != null && this.field2162.field6682 == null;
         boolean var5 = this.field2138 != null && this.field2138.field6682 == null;
         boolean var6 = this.field2198 != null && this.field2198.field6682 == null;
         boolean var7 = this.field2189 != null && this.field2189.field6682 == null;
         if (arg0) {
            var7 &= ~(this.field2145 & 8) != -1;
            var5 &= ~(4 & this.field2145) != -1;
            var4 &= ~(2 & this.field2145) != -1;
            var6 &= ~(this.field2145 & 1) != -1;
         }

         byte var8 = 0;
         byte var9 = 0;
         byte var10 = 0;
         byte var11 = 0;
         if (var6) {
            var9 = var8;
            var8 = (byte)(var8 + 12);
         }

         byte var12 = 0;
         if (var4) {
            var10 = var8;
            var8 = (byte)(var8 + 4);
         }

         if (var5) {
            var11 = var8;
            var8 = (byte)(var8 + 12);
         }

         if (var7) {
            var12 = var8;
            var8 = (byte)(var8 + 8);
         }

         if (~var8 != -1) {
            label502: {
               if (this.field2187.field9720.field5428.length >= this.field2196 * var8) {
                  this.field2187.field9720.field5436 = 0;
                  if (!var3) {
                     break label502;
                  }
               }

               this.field2187.field9720 = new class37((this.field2196 - -100) * var8);
            }

            class37 var13 = this.field2187.field9720;
            if (var6) {
               label537: {
                  if (this.field2187.field9695) {
                     int var14 = 0;
                     if (var3 || ~var14 > ~this.field2109) {
                        label492:
                        do {
                           int var15 = Stream.floatToRawIntBits((float)this.field2197[var14]);
                           int var16 = Stream.floatToRawIntBits((float)this.field2134[var14]);
                           int var17 = Stream.floatToRawIntBits((float)this.field2100[var14]);
                           int var18 = this.field2094[var14];
                           int var19 = this.field2094[var14 + 1];
                           int var20 = var18;
                           if (!var3 && ~var18 <= ~var19) {
                              ++var14;
                           } else {
                              do {
                                 int var21 = this.field2080[var20] + -1;
                                 if (~var21 == 0) {
                                    ++var14;
                                    continue label492;
                                 }

                                 var13.field5436 = var8 * var21;
                                 var13.method2849(var15, (byte)-34);
                                 var13.method2849(var16, (byte)-34);
                                 var13.method2849(var17, (byte)-34);
                                 ++var20;
                              } while(~var20 > ~var19);

                              ++var14;
                           }
                        } while(~var14 > ~this.field2109);
                     }

                     if (!var3) {
                        break label537;
                     }
                  }

                  int var22 = 0;
                  if (var3 || ~var22 > ~this.field2109) {
                     label466:
                     do {
                        int var23 = Stream.floatToRawIntBits((float)this.field2197[var22]);
                        int var24 = Stream.floatToRawIntBits((float)this.field2134[var22]);
                        int var25 = Stream.floatToRawIntBits((float)this.field2100[var22]);
                        int var26 = this.field2094[var22];
                        int var27 = this.field2094[var22 + 1];
                        int var28 = var26;
                        if (!var3 && var26 >= var27) {
                           ++var22;
                        } else {
                           do {
                              int var29 = this.field2080[var28] + -1;
                              if (var29 == -1) {
                                 ++var22;
                                 continue label466;
                              }

                              var13.field5436 = var8 * var29;
                              var13.method2840(55, var23);
                              var13.method2840(127, var24);
                              var13.method2840(93, var25);
                              ++var28;
                           } while(var28 < var27);

                           ++var22;
                        }
                     } while(~var22 > ~this.field2109);
                  }
               }
            }

            if (var4) {
               label540: {
                  if (this.field2138 != null) {
                     int var30 = 0;
                     if (var3 || ~this.field2144 < ~var30) {
                        do {
                           int var31 = this.method1330(this.field2178, this.field2155[var30], this.field2165[var30], this.field2140[var30], -120);
                           var13.field5436 = this.field2110[var30] * var8 + var10;
                           var13.method2849(var31, (byte)-34);
                           var13.field5436 = var10 - -(this.field2104[var30] * var8);
                           var13.method2849(var31, (byte)-34);
                           var13.field5436 = this.field2088[var30] * var8 + var10;
                           var13.method2849(var31, (byte)-34);
                           ++var30;
                        } while(~this.field2144 < ~var30);
                     }

                     if (!var3) {
                        break label540;
                     }
                  }

                  byte[] var32;
                  short[] var33;
                  short[] var34;
                  short[] var35;
                  label426: {
                     if (this.field2098 != null) {
                        var32 = this.field2098.field5298;
                        var33 = this.field2098.field5300;
                        var34 = this.field2098.field5299;
                        var35 = this.field2098.field5295;
                        if (!var3) {
                           break label426;
                        }
                     }

                     var33 = this.field2154;
                     var34 = this.field2156;
                     var35 = this.field2137;
                     var32 = this.field2146;
                  }

                  float var36 = this.field2187.field9724[0];
                  float var37 = this.field2187.field9724[1];
                  float var38 = this.field2187.field9724[2];
                  float var39 = this.field2187.field9725;
                  float var40 = this.field2187.field9761 * 768.0F / (float)this.field2079;
                  float var41 = this.field2187.field9749 * 768.0F / (float)this.field2079;
                  int var42 = 0;
                  if (var3 || ~var42 > ~this.field2144) {
                     do {
                        short var44;
                        float var45;
                        float var46;
                        float var47;
                        float var49;
                        label407: {
                           int var43 = this.method1330(this.field2178, this.field2155[var42], this.field2165[var42], this.field2140[var42], -103);
                           var44 = this.field2110[var42];
                           var45 = (float)(255 & var43 >> 8) * this.field2187.field9762;
                           var46 = (float)(255 & var43 >> 16) * this.field2187.field9703;
                           var47 = (float)(var43 >>> 24) * this.field2187.field9734;
                           short var48 = (short)var32[var44];
                           if (var48 == 0) {
                              var49 = ((float)var33[var44] * var38 + (float)var34[var44] * var36 + (float)var35[var44] * var37) * 0.0026041667F;
                              if (!var3) {
                                 break label407;
                              }
                           }

                           var49 = ((float)var33[var44] * var38 + (float)var34[var44] * var36 + (float)var35[var44] * var37) / (float)(var48 * 256);
                        }

                        float var50 = var39 + (!(var49 < 0.0F) ? var40 : var41) * var49;
                        int var51 = (int)(var47 * var50);
                        if (var51 < 0) {
                           var51 = 0;
                           if (var3 && var51 > 255) {
                              var51 = 255;
                           }
                        } else if (var51 > 255) {
                           var51 = 255;
                        }

                        int var52 = (int)(var46 * var50);
                        int var53 = (int)(var45 * var50);
                        if (var52 < 0) {
                           var52 = 0;
                           if (var3 && ~var52 < -256) {
                              var52 = 255;
                           }
                        } else if (~var52 < -256) {
                           var52 = 255;
                        }

                        var13.field5436 = var8 * var44 + var10;
                        if (var53 >= 0) {
                           if (~var53 < -256) {
                              var53 = 255;
                              if (var3) {
                                 var53 = 0;
                              }
                           }
                        } else {
                           var53 = 0;
                        }

                        short var54;
                        float var56;
                        label412: {
                           var13.method2864(-26110, var51);
                           var13.method2864(-26110, var52);
                           var13.method2864(-26110, var53);
                           var13.method2864(-26110, 255 - (255 & this.field2155[var42]));
                           var54 = this.field2104[var42];
                           short var55 = (short)var32[var54];
                           if (var55 != 0) {
                              var56 = ((float)var33[var54] * var38 + (float)var34[var54] * var36 + (float)var35[var54] * var37) / (float)(var55 * 256);
                              if (!var3) {
                                 break label412;
                              }
                           }

                           var56 = ((float)var33[var54] * var38 + (float)var34[var54] * var36 + (float)var35[var54] * var37) * 0.0026041667F;
                        }

                        float var57 = var56 * (!(var56 < 0.0F) ? var40 : var41) + var39;
                        int var58 = (int)(var47 * var57);
                        int var59 = (int)(var46 * var57);
                        if (var58 < 0) {
                           var58 = 0;
                           if (var3 && ~var58 < -256) {
                              var58 = 255;
                           }
                        } else if (~var58 < -256) {
                           var58 = 255;
                        }

                        if (var59 < 0) {
                           var59 = 0;
                           if (var3 && var59 > 255) {
                              var59 = 255;
                           }
                        } else if (var59 > 255) {
                           var59 = 255;
                        }

                        int var60 = (int)(var45 * var57);
                        if (var60 < 0) {
                           var60 = 0;
                           if (var3 && ~var60 < -256) {
                              var60 = 255;
                           }
                        } else if (~var60 < -256) {
                           var60 = 255;
                        }

                        short var61;
                        float var63;
                        label418: {
                           var13.field5436 = var8 * var54 + var10;
                           var13.method2864(-26110, var58);
                           var13.method2864(-26110, var59);
                           var13.method2864(-26110, var60);
                           var13.method2864(-26110, -(this.field2155[var42] & 255) + 255);
                           var61 = this.field2088[var42];
                           short var62 = (short)var32[var61];
                           if (var62 != 0) {
                              var63 = ((float)var33[var61] * var38 + (float)var34[var61] * var36 + (float)var35[var61] * var37) / (float)(var62 * 256);
                              if (!var3) {
                                 break label418;
                              }
                           }

                           var63 = ((float)var33[var61] * var38 + (float)var34[var61] * var36 + (float)var35[var61] * var37) * 0.0026041667F;
                        }

                        float var64 = var63 * (!(var63 < 0.0F) ? var40 : var41) + var39;
                        int var65 = (int)(var47 * var64);
                        int var66 = (int)(var46 * var64);
                        if (var65 < 0) {
                           var65 = 0;
                           if (var3 && var65 > 255) {
                              var65 = 255;
                           }
                        } else if (var65 > 255) {
                           var65 = 255;
                        }

                        int var67 = (int)(var45 * var64);
                        if (~var66 > -1) {
                           var66 = 0;
                           if (var3 && var66 > 255) {
                              var66 = 255;
                           }
                        } else if (var66 > 255) {
                           var66 = 255;
                        }

                        var13.field5436 = var8 * var61 + var10;
                        if (~var67 <= -1) {
                           if (var67 > 255) {
                              var67 = 255;
                              if (var3) {
                                 var67 = 0;
                              }
                           }
                        } else {
                           var67 = 0;
                        }

                        var13.method2864(-26110, var65);
                        var13.method2864(-26110, var66);
                        var13.method2864(-26110, var67);
                        var13.method2864(-26110, -(255 & this.field2155[var42]) + 255);
                        ++var42;
                     } while(~var42 > ~this.field2144);
                  }
               }
            }

            if (var5) {
               label542: {
                  short[] var68;
                  short[] var69;
                  byte[] var70;
                  short[] var71;
                  label324: {
                     if (this.field2098 == null) {
                        var68 = this.field2137;
                        var69 = this.field2156;
                        var70 = this.field2146;
                        var71 = this.field2154;
                        if (!var3) {
                           break label324;
                        }
                     }

                     var69 = this.field2098.field5299;
                     var68 = this.field2098.field5295;
                     var71 = this.field2098.field5300;
                     var70 = this.field2098.field5298;
                  }

                  float var72 = 3.0F / (float)this.field2079;
                  var13.field5436 = var11;
                  float var73 = 3.0F / (float)(this.field2079 / 2 + this.field2079);
                  if (this.field2187.field9695) {
                     int var74 = 0;
                     if (var3 || ~var74 > ~this.field2196) {
                        do {
                           label314: {
                              int var75 = 255 & var70[var74];
                              if (var75 == 0) {
                                 var13.method265(29481, (float)var69[var74] * var73);
                                 var13.method265(29481, (float)var68[var74] * var73);
                                 var13.method265(29481, (float)var71[var74] * var73);
                                 if (!var3) {
                                    break label314;
                                 }
                              }

                              float var76 = var72 / (float)var75;
                              var13.method265(29481, (float)var69[var74] * var76);
                              var13.method265(29481, (float)var68[var74] * var76);
                              var13.method265(29481, (float)var71[var74] * var76);
                           }

                           var13.field5436 += var8 + -12;
                           ++var74;
                        } while(~var74 > ~this.field2196);
                     }

                     if (!var3) {
                        break label542;
                     }
                  }

                  int var77 = 0;
                  if (var3 || var77 < this.field2196) {
                     do {
                        label298: {
                           int var78 = 255 & var70[var77];
                           if (~var78 != -1) {
                              float var79 = var72 / (float)var78;
                              var13.method266(115976568, (float)var69[var77] * var79);
                              var13.method266(115976568, (float)var68[var77] * var79);
                              var13.method266(115976568, (float)var71[var77] * var79);
                              if (!var3) {
                                 break label298;
                              }
                           }

                           var13.method266(115976568, (float)var69[var77] * var73);
                           var13.method266(115976568, (float)var68[var77] * var73);
                           var13.method266(115976568, (float)var71[var77] * var73);
                        }

                        var13.field5436 += var8 + -12;
                        ++var77;
                     } while(var77 < this.field2196);
                  }
               }
            }

            if (var7) {
               label545: {
                  var13.field5436 = var12;
                  if (this.field2187.field9695) {
                     int var80 = 0;
                     if (var3) {
                        var13.method265(29481, this.field2131[var80]);
                        var13.method265(29481, this.field2195[var80]);
                        var13.field5436 += var8 - 8;
                        ++var80;
                     }

                     while(true) {
                        while(var80 < this.field2196) {
                           var13.method265(29481, this.field2131[var80]);
                           var13.method265(29481, this.field2195[var80]);
                           var13.field5436 += var8 - 8;
                           ++var80;
                        }

                        if (!var3) {
                           if (!var3) {
                              break label545;
                           }
                           break;
                        }

                        ++var80;
                     }
                  }

                  int var81 = 0;
                  if (var3 || this.field2196 > var81) {
                     do {
                        var13.method266(115976568, this.field2131[var81]);
                        var13.method266(115976568, this.field2195[var81]);
                        var13.field5436 += var8 - 8;
                        ++var81;
                     } while(this.field2196 > var81);
                  }
               }
            }

            if (arg1 >= -80) {
               field2183 = null;
            }

            class112 var82;
            label549: {
               var13.field5436 = this.field2196 * var8;
               if (!arg0) {
                  var82 = this.field2187.method4759(var8, var13.field5436, false, var13.field5428, -83);
                  this.field2179 = true;
                  if (!var3) {
                     break label549;
                  }
               }

               label245: {
                  if (this.field2167 != null) {
                     this.field2167.method1056(-1752, var13.field5436, var8, var13.field5428);
                     if (!var3) {
                        break label245;
                     }
                  }

                  this.field2167 = this.field2187.method4759(var8, var13.field5436, true, var13.field5428, -64);
               }

               this.field2145 = 0;
               var82 = this.field2167;
            }

            if (var6) {
               this.field2198.field6682 = var82;
               this.field2198.field6684 = var9;
            }

            if (var7) {
               this.field2189.field6684 = var12;
               this.field2189.field6682 = var82;
            }

            if (var4) {
               this.field2162.field6682 = var82;
               this.field2162.field6684 = var10;
            }

            if (var5) {
               this.field2138.field6682 = var82;
               this.field2138.field6684 = var11;
            }
         }
      } catch (RuntimeException var84) {
         throw class482.method3757(var84, field2199[24] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lkf;IZ)V",
      line = 1624
   )
   public final void method914(class401 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "e",
      descriptor = "()[B",
      line = 1658
   )
   public final byte[] method885() {
      try {
         ++field2186;
         return this.field2155;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "LA",
      descriptor = "(I)V",
      line = 1666
   )
   public final void method896(int arg0) {
      try {
         this.field2079 = (short)arg0;
         if (this.field2162 != null) {
            this.field2162.field6682 = null;
         }

         ++field2194;
         if (this.field2138 != null) {
            this.field2138.field6682 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2199[49] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "C",
      descriptor = "(I)V",
      line = 1683
   )
   public final void method887(int arg0) {
      try {
         if (this.field2162 != null) {
            this.field2162.field6682 = null;
         }

         ++field2096;
         this.field2178 = (short)arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2199[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(JII)Ldia;",
      line = 1701
   )
   public static final class566 method1321(long arg0, int arg1, int arg2) {
      try {
         ++field2111;
         class566 var4 = (class566)class86.field1259.method3141(arg0 | (long)arg1 << 56, true);
         if (var4 == null) {
            var4 = new class566(arg1, arg0);
            class86.field1259.method3143(arg2 + 1428737226, var4, var4.field4655);
         }

         return arg2 != -1428737160 ? null : var4;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2199[14] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "aa",
      descriptor = "(SS)V",
      line = 1726
   )
   public final void method922(short arg0, short arg1) {
      boolean var3 = client.field1786;

      try {
         ++field2175;
         class150 var4 = this.field2187.field8891;
         int var5 = 0;
         if (var3) {
            if (this.field2165[var5] == arg0) {
               this.field2165[var5] = arg1;
            }

            ++var5;
         }

         while(true) {
            int var10000;
            if (~this.field2144 >= ~var5) {
               byte var6 = 0;
               byte var7 = 0;
               var10000 = ~arg0;
               if (!var3) {
                  if (var10000 != 0) {
                     class453 var8 = var4.method1373(arg0 & 65535, (byte)-54);
                     var7 = var8.field6935;
                     var6 = var8.field6930;
                  }

                  byte var9 = 0;
                  byte var10 = 0;
                  if (~arg1 != 0) {
                     class453 var11 = var4.method1373(65535 & arg1, (byte)-54);
                     var9 = var11.field6930;
                     if (~var11.field6926 != -1 || ~var11.field6932 != -1) {
                        this.field2158 = true;
                     }

                     var10 = var11.field6935;
                  }

                  if (~var6 != ~var9 | ~var7 != ~var10) {
                     if (this.field2117 != null) {
                        int var12 = 0;
                        if (var3 || var12 < this.field2130) {
                           do {
                              class249 var13 = this.field2117[var12];
                              class248 var14 = this.field2099[var12];
                              var14.field3774 = 16777215 & class228.field3503[this.field2140[var13.field3783] & 65535] | -16777216 & var14.field3774;
                              ++var12;
                           } while(var12 < this.field2130);
                        }
                     }

                     if (this.field2162 != null) {
                        this.field2162.field6682 = null;
                        return;
                     }
                  }

                  return;
               }
            } else {
               var10000 = this.field2165[var5];
            }

            if (var10000 == arg0) {
               this.field2165[var5] = arg1;
            }

            ++var5;
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field2199[28] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 1806
   )
   private final boolean method1322(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg4 != 402650904) {
            this.method1330(-119, (byte)-68, (short)98, 114, -19);
         }

         ++field2193;
         if (~arg3 > ~arg5 && arg3 < arg7 && ~arg3 > ~arg0) {
            return false;
         } else if (arg5 < arg3 && ~arg3 < ~arg7 && ~arg3 < ~arg0) {
            return false;
         } else if (arg1 > arg8 && ~arg2 < ~arg8 && ~arg8 > ~arg6) {
            return false;
         } else {
            return ~arg8 >= ~arg1 || arg8 <= arg2 || ~arg8 >= ~arg6;
         }
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field2199[11] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "RA",
      descriptor = "()I",
      line = 1831
   )
   public final int method876() {
      try {
         if (!this.field2121) {
            this.method1327((byte)-52);
         }

         ++field2163;
         return this.field2113;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[27] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "I",
      descriptor = "(I[IIIIZI[I)V",
      line = 1844
   )
   public final void method900(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      boolean var9 = client.field1786;

      try {
         ++field2078;
         int var10 = arg1.length;
         int var10000;
         if (~arg0 != -1) {
            if (~arg0 == -2) {
               if (arg7 != null) {
                  int var17 = arg7[0] * arg2 - -(arg7[1] * arg3) + (arg7[2] * arg4 - -8192) >> 14;
                  int var18 = arg7[3] * arg2 + arg7[4] * arg3 + arg7[5] * arg4 + 8192 >> 14;
                  int var19 = arg7[7] * arg3 + arg7[8] * arg4 + arg7[6] * arg2 - -8192 >> 14;
                  arg4 = var19;
                  arg2 = var17;
                  arg3 = var18;
               }

               arg3 <<= 4;
               arg2 <<= 4;
               arg4 <<= 4;
               int var20 = 0;
               if (var9 || ~var20 > ~var10) {
                  do {
                     int var21 = arg1[var20];
                     if (this.field2107.length <= var21) {
                        ++var20;
                     } else {
                        int[] var22 = this.field2107[var21];
                        int var23 = 0;
                        if (!var9 && ~var22.length >= ~var23) {
                           ++var20;
                        } else {
                           do {
                              int var24 = var22[var23];
                              if (this.field2161 != null && (this.field2161[var24] & arg6) == 0) {
                                 ++var23;
                              } else {
                                 this.field2197[var24] += arg2;
                                 this.field2134[var24] += arg3;
                                 this.field2100[var24] += arg4;
                                 ++var23;
                              }
                           } while(~var22.length < ~var23);

                           ++var20;
                        }
                     }
                  } while(~var20 > ~var10);

               }
            } else if (arg0 == 2) {
               if (arg7 == null) {
                  label435: {
                     int var25 = 0;
                     if (var9) {
                        var10000 = arg1[var25];
                     } else if (var25 >= var10) {
                        var10000 = arg5;
                        if (!var9) {
                           break label435;
                        }
                     } else {
                        var10000 = arg1[var25];
                     }

                     while(true) {
                        int var26 = var10000;
                        if (~this.field2107.length >= ~var26) {
                           ++var25;
                        } else {
                           int[] var27 = this.field2107[var26];
                           int var28 = 0;
                           if (!var9 && var28 >= var27.length) {
                              ++var25;
                           } else {
                              while(true) {
                                 int var29 = var27[var28];
                                 if (this.field2161 != null && (arg6 & this.field2161[var29]) == 0) {
                                    ++var28;
                                 } else {
                                    this.field2197[var29] -= class728.field10876;
                                    this.field2134[var29] -= class696.field10343;
                                    this.field2100[var29] -= class462.field7021;
                                    if (~arg4 != -1) {
                                       int var30 = class83.field1196[arg4];
                                       int var31 = class83.field1194[arg4];
                                       int var32 = this.field2197[var29] * var31 + this.field2134[var29] * var30 + 16383 >> 14;
                                       this.field2134[var29] = this.field2134[var29] * var31 + (-(this.field2197[var29] * var30) - -16383) >> 14;
                                       this.field2197[var29] = var32;
                                    }

                                    if (arg2 != 0) {
                                       int var33 = class83.field1196[arg2];
                                       int var34 = class83.field1194[arg2];
                                       int var35 = this.field2134[var29] * var34 - -16383 + -(this.field2100[var29] * var33) >> 14;
                                       this.field2100[var29] = this.field2100[var29] * var34 + (this.field2134[var29] * var33 - -16383) >> 14;
                                       this.field2134[var29] = var35;
                                    }

                                    if (arg3 != 0) {
                                       int var36 = class83.field1196[arg3];
                                       int var37 = class83.field1194[arg3];
                                       int var38 = this.field2197[var29] * var37 + this.field2100[var29] * var36 + 16383 >> 14;
                                       this.field2100[var29] = this.field2100[var29] * var37 - -16383 + -(this.field2197[var29] * var36) >> 14;
                                       this.field2197[var29] = var38;
                                    }

                                    this.field2197[var29] += class728.field10876;
                                    this.field2134[var29] += class696.field10343;
                                    this.field2100[var29] += class462.field7021;
                                    ++var28;
                                 }

                                 if (var28 >= var27.length) {
                                    ++var25;
                                    break;
                                 }
                              }
                           }
                        }

                        if (var25 >= var10) {
                           var10000 = arg5;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var10000 = arg1[var25];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     int var39 = 0;
                     if (var9 || var39 < var10) {
                        do {
                           int var40 = arg1[var39];
                           if (var40 >= this.field2107.length) {
                              ++var39;
                           } else {
                              int[] var41 = this.field2107[var40];
                              int var42 = 0;
                              if (!var9 && var42 >= var41.length) {
                                 ++var39;
                              } else {
                                 label388:
                                 do {
                                    int var43 = var41[var42];
                                    if (this.field2161 != null && (this.field2161[var43] & arg6) == 0) {
                                       ++var42;
                                    } else {
                                       int var44 = this.field2094[var43];
                                       int var45 = this.field2094[var43 - -1];
                                       int var46 = var44;
                                       if (!var9 && var44 >= var45) {
                                          ++var42;
                                       } else {
                                          do {
                                             int var47 = this.field2080[var46] + -1;
                                             if (var47 == -1) {
                                                ++var42;
                                                continue label388;
                                             }

                                             if (arg4 != 0) {
                                                int var48 = class83.field1196[arg4];
                                                int var49 = class83.field1194[arg4];
                                                int var50 = this.field2137[var47] * var48 - -(this.field2156[var47] * var49) + 16383 >> 14;
                                                this.field2137[var47] = (short)(this.field2137[var47] * var49 + -(this.field2156[var47] * var48) - -16383 >> 14);
                                                this.field2156[var47] = (short)var50;
                                             }

                                             if (~arg2 != -1) {
                                                int var51 = class83.field1196[arg2];
                                                int var52 = class83.field1194[arg2];
                                                int var53 = this.field2137[var47] * var52 + -(this.field2154[var47] * var51) + 16383 >> 14;
                                                this.field2154[var47] = (short)(this.field2154[var47] * var52 + this.field2137[var47] * var51 + 16383 >> 14);
                                                this.field2137[var47] = (short)var53;
                                             }

                                             if (~arg3 != -1) {
                                                int var54 = class83.field1196[arg3];
                                                int var55 = class83.field1194[arg3];
                                                int var56 = this.field2156[var47] * var55 + this.field2154[var47] * var54 - -16383 >> 14;
                                                this.field2154[var47] = (short)(this.field2154[var47] * var55 + -(this.field2156[var47] * var54) + 16383 >> 14);
                                                this.field2156[var47] = (short)var56;
                                             }

                                             ++var46;
                                          } while(var46 < var45);

                                          ++var42;
                                       }
                                    }
                                 } while(var42 < var41.length);

                                 ++var39;
                              }
                           }
                        } while(var39 < var10);
                     }

                     if (this.field2138 == null && this.field2162 != null) {
                        this.field2162.field6682 = null;
                     }

                     if (this.field2138 != null) {
                        this.field2138.field6682 = null;
                        return;
                     }
                  }
               } else {
                  int var57 = arg7[9] << 4;
                  int var58 = arg7[10] << 4;
                  int var59 = arg7[11] << 4;
                  int var60 = arg7[12] << 4;
                  int var61 = arg7[13] << 4;
                  int var62 = arg7[14] << 4;
                  if (class274.field4391) {
                     int var63 = arg7[6] * class462.field7021 - -8192 + arg7[3] * class696.field10343 + arg7[0] * class728.field10876 >> 14;
                     int var64 = arg7[1] * class728.field10876 - (-(arg7[4] * class696.field10343) + -(arg7[7] * class462.field7021)) + 8192 >> 14;
                     int var65 = var60 + var63;
                     int var66 = var61 + var64;
                     int var67 = arg7[2] * class728.field10876 - -(arg7[5] * class696.field10343) - (-(arg7[8] * class462.field7021) + -8192) >> 14;
                     int var68 = var62 + var67;
                     class728.field10876 = var65;
                     class696.field10343 = var66;
                     class274.field4391 = false;
                     class462.field7021 = var68;
                  }

                  int[] var84;
                  int var86;
                  int var92;
                  int var93;
                  int[] var94;
                  int var95;
                  label589: {
                     int[] var69 = new int[9];
                     int var70 = class83.field1194[arg2];
                     int var71 = class83.field1196[arg2];
                     int var72 = class83.field1194[arg3];
                     int var73 = class83.field1196[arg3];
                     int var74 = class83.field1194[arg4];
                     int var75 = class83.field1196[arg4];
                     int var76 = var71 * var74 - -8192 >> 14;
                     int var77 = var71 * var75 + 8192 >> 14;
                     var69[5] = -var71;
                     var69[6] = -var73 * var74 + var72 * var77 - -8192 >> 14;
                     var69[0] = var72 * var74 + var73 * var77 + 8192 >> 14;
                     var69[3] = var70 * var75 + 8192 >> 14;
                     var69[1] = -var72 * var75 + (var73 * var76 - -8192) >> 14;
                     var69[7] = var73 * var75 + 8192 - -(var72 * var76) >> 14;
                     var69[8] = var70 * var72 + 8192 >> 14;
                     var69[2] = var70 * var73 + 8192 >> 14;
                     var69[4] = var70 * var74 + 8192 >> 14;
                     int var78 = var69[2] * -class462.field7021 + (var69[0] * -class728.field10876 - -(var69[1] * -class696.field10343)) + 8192 >> 14;
                     int var79 = var69[3] * -class728.field10876 + var69[4] * -class696.field10343 + var69[5] * -class462.field7021 + 8192 >> 14;
                     int var80 = var69[6] * -class728.field10876 - -(var69[8] * -class462.field7021) + var69[7] * -class696.field10343 + 8192 >> 14;
                     int var81 = class728.field10876 + var78;
                     int var82 = var79 - -class696.field10343;
                     int var83 = class462.field7021 + var80;
                     var84 = new int[9];
                     int var85 = 0;
                     int var89;
                     int var90;
                     int var91;
                     if (var9) {
                        var86 = 0;
                     } else if (~var85 <= -4) {
                        var89 = var69[2] * var62 + var69[0] * var60 - -(var69[1] * var61) + 8192 >> 14;
                        var90 = var69[5] * var62 + var69[4] * var61 + var69[3] * var60 + 8192 >> 14;
                        var91 = var69[8] * var62 + var69[7] * var61 + var69[6] * var60 + 8192 >> 14;
                        var86 = var81 + var89;
                        var92 = var82 + var90;
                        var93 = var83 + var91;
                        var94 = new int[9];
                        var95 = 0;
                        if (!var9) {
                           break label589;
                        }
                     } else {
                        var86 = 0;
                     }

                     while(true) {
                        label586: {
                           int var87;
                           int var88;
                           if (var9) {
                              var87 = 0;
                              var88 = 0;
                              if (var9) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }
                           } else {
                              if (~var86 <= -4) {
                                 break label586;
                              }

                              var87 = 0;
                              var88 = 0;
                              if (var9) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }
                           }

                           while(true) {
                              while(~var88 > -4) {
                                 var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                 ++var88;
                              }

                              var84[var85 * 3 + var86] = var87 + 8192 >> 14;
                              if (!var9) {
                                 ++var86;
                                 if (~var86 <= -4) {
                                    break;
                                 }

                                 var87 = 0;
                                 var88 = 0;
                                 if (var9) {
                                    var87 += var69[var85 * 3 + var88] * arg7[var86 * 3 + var88];
                                    ++var88;
                                 }
                              } else {
                                 ++var88;
                              }
                           }
                        }

                        ++var85;
                        if (~var85 <= -4) {
                           var89 = var69[2] * var62 + var69[0] * var60 - -(var69[1] * var61) + 8192 >> 14;
                           var90 = var69[5] * var62 + var69[4] * var61 + var69[3] * var60 + 8192 >> 14;
                           var91 = var69[8] * var62 + var69[7] * var61 + var69[6] * var60 + 8192 >> 14;
                           var86 = var81 + var89;
                           var92 = var82 + var90;
                           var93 = var83 + var91;
                           var94 = new int[9];
                           var95 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var86 = 0;
                        }
                     }
                  }

                  int var96;
                  int var102;
                  int var103;
                  int var104;
                  label528: {
                     int var99;
                     int var100;
                     int var101;
                     if (var9) {
                        var96 = 0;
                     } else if (~var95 <= -4) {
                        var99 = arg7[0] * var86 + arg7[1] * var92 + arg7[2] * var93 + 8192 >> 14;
                        var100 = arg7[3] * var86 - -8192 + arg7[5] * var93 + arg7[4] * var92 >> 14;
                        var96 = var57 + var99;
                        var101 = arg7[7] * var92 + arg7[6] * var86 - -(arg7[8] * var93) + 8192 >> 14;
                        var102 = var58 + var100;
                        var103 = var59 + var101;
                        var104 = 0;
                        if (!var9) {
                           break label528;
                        }
                     } else {
                        var96 = 0;
                     }

                     while(true) {
                        label525: {
                           int var97;
                           int var98;
                           if (var9) {
                              var97 = 0;
                              var98 = 0;
                              if (var9) {
                                 var97 += arg7[var95 * 3 - -var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }
                           } else {
                              if (~var96 <= -4) {
                                 break label525;
                              }

                              var97 = 0;
                              var98 = 0;
                              if (var9) {
                                 var97 += arg7[var95 * 3 - -var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }
                           }

                           while(true) {
                              while(~var98 > -4) {
                                 var97 += arg7[var95 * 3 - -var98] * var84[var98 * 3 + var96];
                                 ++var98;
                              }

                              var94[var95 * 3 + var96] = var97 + 8192 >> 14;
                              if (!var9) {
                                 ++var96;
                                 if (~var96 <= -4) {
                                    break;
                                 }

                                 var97 = 0;
                                 var98 = 0;
                                 if (var9) {
                                    var97 += arg7[var95 * 3 - -var98] * var84[var98 * 3 + var96];
                                    ++var98;
                                 }
                              } else {
                                 ++var98;
                              }
                           }
                        }

                        ++var95;
                        if (~var95 <= -4) {
                           var99 = arg7[0] * var86 + arg7[1] * var92 + arg7[2] * var93 + 8192 >> 14;
                           var100 = arg7[3] * var86 - -8192 + arg7[5] * var93 + arg7[4] * var92 >> 14;
                           var96 = var57 + var99;
                           var101 = arg7[7] * var92 + arg7[6] * var86 - -(arg7[8] * var93) + 8192 >> 14;
                           var102 = var58 + var100;
                           var103 = var59 + var101;
                           var104 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var96 = 0;
                        }
                     }
                  }

                  if (var9 || ~var10 < ~var104) {
                     do {
                        int var105 = arg1[var104];
                        if (~var105 <= ~this.field2107.length) {
                           ++var104;
                        } else {
                           int[] var106 = this.field2107[var105];
                           int var107 = 0;
                           if (!var9 && ~var107 <= ~var106.length) {
                              ++var104;
                           } else {
                              do {
                                 int var108 = var106[var107];
                                 if (this.field2161 != null && ~(arg6 & this.field2161[var108]) == -1) {
                                    ++var107;
                                 } else {
                                    int var109 = this.field2197[var108] * var94[0] + 8192 + this.field2134[var108] * var94[1] + this.field2100[var108] * var94[2] >> 14;
                                    int var110 = this.field2100[var108] * var94[5] + (this.field2197[var108] * var94[3] - (-(this.field2134[var108] * var94[4]) + -8192)) >> 14;
                                    int var111 = var96 + var109;
                                    int var112 = var102 + var110;
                                    int var113 = this.field2134[var108] * var94[7] + (this.field2197[var108] * var94[6] - -(this.field2100[var108] * var94[8])) - -8192 >> 14;
                                    this.field2197[var108] = var111;
                                    int var114 = var103 + var113;
                                    this.field2134[var108] = var112;
                                    this.field2100[var108] = var114;
                                    ++var107;
                                 }
                              } while(~var107 > ~var106.length);

                              ++var104;
                           }
                        }
                     } while(~var10 < ~var104);
                  }
               }

            } else if (arg0 == 3) {
               if (arg7 != null) {
                  int var120 = arg7[9] << 4;
                  int var121 = arg7[10] << 4;
                  int var122 = arg7[11] << 4;
                  int var123 = arg7[12] << 4;
                  int var124 = arg7[13] << 4;
                  int var125 = arg7[14] << 4;
                  if (class274.field4391) {
                     int var126 = arg7[3] * class696.field10343 + (arg7[0] * class728.field10876 - -(arg7[6] * class462.field7021)) + 8192 >> 14;
                     int var127 = arg7[7] * class462.field7021 + 8192 + arg7[1] * class728.field10876 + arg7[4] * class696.field10343 >> 14;
                     int var128 = arg7[8] * class462.field7021 + arg7[5] * class696.field10343 + arg7[2] * class728.field10876 + 8192 >> 14;
                     int var129 = var124 + var127;
                     int var130 = var123 + var126;
                     int var131 = var125 + var128;
                     class696.field10343 = var129;
                     class728.field10876 = var130;
                     class274.field4391 = false;
                     class462.field7021 = var131;
                  }

                  int[] var148;
                  int var150;
                  int var156;
                  int var157;
                  int var158;
                  label655: {
                     int var132 = arg2 << 15 >> 7;
                     int var133 = arg3 << 15 >> 7;
                     int var134 = arg4 << 15 >> 7;
                     int var135 = -class728.field10876 * var132 - -8192 >> 14;
                     int var136 = -class696.field10343 * var133 - -8192 >> 14;
                     int var137 = -class462.field7021 * var134 + 8192 >> 14;
                     int var138 = class728.field10876 + var135;
                     int var139 = class696.field10343 + var136;
                     int var140 = class462.field7021 + var137;
                     int[] var141 = new int[]{arg7[0] * var132 + 8192 >> 14, arg7[3] * var132 + 8192 >> 14, arg7[6] * var132 - -8192 >> 14, arg7[1] * var133 + 8192 >> 14, arg7[4] * var133 + 8192 >> 14, arg7[7] * var133 - -8192 >> 14, arg7[2] * var134 - -8192 >> 14, arg7[5] * var134 - -8192 >> 14, arg7[8] * var134 + 8192 >> 14};
                     int var142 = var123 * var132 + 8192 >> 14;
                     int var143 = var124 * var133 + 8192 >> 14;
                     int var144 = var139 + var143;
                     int var145 = var125 * var134 - -8192 >> 14;
                     int var146 = var138 + var142;
                     int var147 = var140 + var145;
                     var148 = new int[9];
                     int var149 = 0;
                     int var153;
                     int var154;
                     int var155;
                     if (var9) {
                        var150 = 0;
                     } else if (var149 >= 3) {
                        var153 = arg7[1] * var144 + 8192 + arg7[0] * var146 + arg7[2] * var147 >> 14;
                        var154 = arg7[5] * var147 + (arg7[3] * var146 - (-(arg7[4] * var144) + -8192)) >> 14;
                        var155 = arg7[7] * var144 - -8192 + arg7[8] * var147 + arg7[6] * var146 >> 14;
                        var150 = var120 + var153;
                        var156 = var121 + var154;
                        var157 = var122 + var155;
                        var158 = 0;
                        if (!var9) {
                           break label655;
                        }
                     } else {
                        var150 = 0;
                     }

                     while(true) {
                        label652: {
                           int var151;
                           int var152;
                           if (var9) {
                              var151 = 0;
                              var152 = 0;
                              if (var9) {
                                 var151 += arg7[var149 * 3 + var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }
                           } else {
                              if (~var150 <= -4) {
                                 break label652;
                              }

                              var151 = 0;
                              var152 = 0;
                              if (var9) {
                                 var151 += arg7[var149 * 3 + var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }
                           }

                           while(true) {
                              while(~var152 > -4) {
                                 var151 += arg7[var149 * 3 + var152] * var141[var152 * 3 + var150];
                                 ++var152;
                              }

                              var148[var149 * 3 - -var150] = var151 + 8192 >> 14;
                              if (!var9) {
                                 ++var150;
                                 if (~var150 <= -4) {
                                    break;
                                 }

                                 var151 = 0;
                                 var152 = 0;
                                 if (var9) {
                                    var151 += arg7[var149 * 3 + var152] * var141[var152 * 3 + var150];
                                    ++var152;
                                 }
                              } else {
                                 ++var152;
                              }
                           }
                        }

                        ++var149;
                        if (var149 >= 3) {
                           var153 = arg7[1] * var144 + 8192 + arg7[0] * var146 + arg7[2] * var147 >> 14;
                           var154 = arg7[5] * var147 + (arg7[3] * var146 - (-(arg7[4] * var144) + -8192)) >> 14;
                           var155 = arg7[7] * var144 - -8192 + arg7[8] * var147 + arg7[6] * var146 >> 14;
                           var150 = var120 + var153;
                           var156 = var121 + var154;
                           var157 = var122 + var155;
                           var158 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var150 = 0;
                        }
                     }
                  }

                  if (var9 || var158 < var10) {
                     do {
                        int var159 = arg1[var158];
                        if (~var159 <= ~this.field2107.length) {
                           ++var158;
                        } else {
                           int[] var160 = this.field2107[var159];
                           int var161 = 0;
                           if (!var9 && var161 >= var160.length) {
                              ++var158;
                           } else {
                              do {
                                 int var162 = var160[var161];
                                 if (this.field2161 != null && (this.field2161[var162] & arg6) == 0) {
                                    ++var161;
                                 } else {
                                    int var163 = this.field2197[var162] * var148[0] + 8192 - (-(this.field2134[var162] * var148[1]) - this.field2100[var162] * var148[2]) >> 14;
                                    int var164 = this.field2100[var162] * var148[5] + this.field2197[var162] * var148[3] + this.field2134[var162] * var148[4] + 8192 >> 14;
                                    int var165 = var156 + var164;
                                    int var166 = var150 + var163;
                                    int var167 = this.field2197[var162] * var148[6] - (-(this.field2134[var162] * var148[7]) - this.field2100[var162] * var148[8]) + 8192 >> 14;
                                    int var168 = var157 + var167;
                                    this.field2197[var162] = var166;
                                    this.field2134[var162] = var165;
                                    this.field2100[var162] = var168;
                                    ++var161;
                                 }
                              } while(var161 < var160.length);

                              ++var158;
                           }
                        }
                     } while(var158 < var10);

                  }
               } else {
                  int var115 = 0;
                  if (var9 || ~var10 < ~var115) {
                     do {
                        int var116 = arg1[var115];
                        if (~this.field2107.length >= ~var116) {
                           ++var115;
                        } else {
                           int[] var117 = this.field2107[var116];
                           int var118 = 0;
                           if (!var9 && ~var117.length >= ~var118) {
                              ++var115;
                           } else {
                              do {
                                 int var119 = var117[var118];
                                 if (this.field2161 != null && ~(this.field2161[var119] & arg6) == -1) {
                                    ++var118;
                                 } else {
                                    this.field2197[var119] -= class728.field10876;
                                    this.field2134[var119] -= class696.field10343;
                                    this.field2100[var119] -= class462.field7021;
                                    this.field2197[var119] = this.field2197[var119] * arg2 >> 7;
                                    this.field2134[var119] = this.field2134[var119] * arg3 >> 7;
                                    this.field2100[var119] = this.field2100[var119] * arg4 >> 7;
                                    this.field2197[var119] += class728.field10876;
                                    this.field2134[var119] += class696.field10343;
                                    this.field2100[var119] += class462.field7021;
                                    ++var118;
                                 }
                              } while(~var117.length < ~var118);

                              ++var115;
                           }
                        }
                     } while(~var10 < ~var115);

                  }
               }
            } else if (~arg0 == -6) {
               if (this.field2072 != null) {
                  int var169 = 0;
                  if (var9 || ~var10 < ~var169) {
                     do {
                        int var170 = arg1[var169];
                        if (~var170 <= ~this.field2072.length) {
                           ++var169;
                        } else {
                           int[] var171 = this.field2072[var170];
                           int var172 = 0;
                           if (!var9 && var171.length <= var172) {
                              ++var169;
                           } else {
                              do {
                                 int var173 = var171[var172];
                                 if (this.field2150 != null && ~(arg6 & this.field2150[var173]) == -1) {
                                    ++var172;
                                 } else {
                                    int var174 = (this.field2155[var173] & 255) - -(arg2 * 8);
                                    if (~var174 <= -1) {
                                       if (~var174 < -256) {
                                          var174 = 255;
                                          if (var9) {
                                             var174 = 0;
                                          }
                                       }
                                    } else {
                                       var174 = 0;
                                    }

                                    this.field2155[var173] = (byte)var174;
                                    if (this.field2162 != null) {
                                       this.field2162.field6682 = null;
                                    }

                                    ++var172;
                                 }
                              } while(var171.length > var172);

                              ++var169;
                           }
                        }
                     } while(~var10 < ~var169);
                  }

                  if (this.field2117 != null) {
                     int var175 = 0;
                     if (var9 || var175 < this.field2130) {
                        do {
                           class249 var176 = this.field2117[var175];
                           class248 var177 = this.field2099[var175];
                           var177.field3774 = -(255 & this.field2155[var176.field3783]) + 255 << 24 | 16777215 & var177.field3774;
                           ++var175;
                        } while(var175 < this.field2130);
                     }
                  }
               }

            } else if (~arg0 == -8) {
               if (this.field2072 != null) {
                  int var178 = 0;
                  if (var9 || ~var178 > ~var10) {
                     do {
                        int var179 = arg1[var178];
                        if (var179 >= this.field2072.length) {
                           ++var178;
                        } else {
                           int[] var180 = this.field2072[var179];
                           int var181 = 0;
                           if (!var9 && var181 >= var180.length) {
                              ++var178;
                           } else {
                              do {
                                 int var182 = var180[var181];
                                 if (this.field2150 != null && ~(this.field2150[var182] & arg6) == -1) {
                                    ++var181;
                                 } else {
                                    int var183 = this.field2140[var182] & 65535;
                                    int var184 = (65494 & var183) >> 10;
                                    int var185 = (var183 & 976) >> 7;
                                    int var186 = arg3 / 4 + var185;
                                    int var187 = var183 & 127;
                                    int var188 = 63 & arg2 + var184;
                                    if (~var186 > -1) {
                                       var186 = 0;
                                       if (var9 && ~var186 < -8) {
                                          var186 = 7;
                                       }
                                    } else if (~var186 < -8) {
                                       var186 = 7;
                                    }

                                    int var189 = arg4 + var187;
                                    if (~var189 <= -1) {
                                       if (var189 > 127) {
                                          var189 = 127;
                                          if (var9) {
                                             var189 = 0;
                                          }
                                       }
                                    } else {
                                       var189 = 0;
                                    }

                                    this.field2140[var182] = (short)class119.method1087(var189, class119.method1087(var188 << 10, var186 << 7));
                                    if (this.field2162 != null) {
                                       this.field2162.field6682 = null;
                                    }

                                    ++var181;
                                 }
                              } while(var181 < var180.length);

                              ++var178;
                           }
                        }
                     } while(~var178 > ~var10);
                  }

                  if (this.field2117 != null) {
                     int var190 = 0;
                     if (var9 || ~var190 > ~this.field2130) {
                        do {
                           class249 var191 = this.field2117[var190];
                           class248 var192 = this.field2099[var190];
                           var192.field3774 = var192.field3774 & -16777216 | 16777215 & class228.field3503[65535 & this.field2140[var191.field3783]];
                           ++var190;
                        } while(~var190 > ~this.field2130);
                     }
                  }
               }

            } else if (arg0 == 8) {
               if (this.field2083 != null) {
                  int var193 = 0;
                  if (var9 || ~var10 < ~var193) {
                     do {
                        int var194 = arg1[var193];
                        if (~var194 <= ~this.field2083.length) {
                           ++var193;
                        } else {
                           int[] var195 = this.field2083[var194];
                           int var196 = 0;
                           if (!var9 && var196 >= var195.length) {
                              ++var193;
                           } else {
                              do {
                                 class248 var197 = this.field2099[var195[var196]];
                                 var197.field3770 += arg2;
                                 var197.field3777 += arg3;
                                 ++var196;
                              } while(var196 < var195.length);

                              ++var193;
                           }
                        }
                     } while(~var10 < ~var193);
                  }
               }

            } else if (~arg0 == -11) {
               if (this.field2083 != null) {
                  int var198 = 0;
                  if (var9 || ~var198 > ~var10) {
                     do {
                        int var199 = arg1[var198];
                        if (~var199 <= ~this.field2083.length) {
                           ++var198;
                        } else {
                           int[] var200 = this.field2083[var199];
                           int var201 = 0;
                           if (!var9 && var201 >= var200.length) {
                              ++var198;
                           } else {
                              do {
                                 class248 var202 = this.field2099[var200[var201]];
                                 var202.field3769 = var202.field3769 * arg2 >> 7;
                                 var202.field3772 = var202.field3772 * arg3 >> 7;
                                 ++var201;
                              } while(var201 < var200.length);

                              ++var198;
                           }
                        }
                     } while(~var198 > ~var10);
                  }
               }

            } else if (arg0 == 9) {
               if (this.field2083 != null) {
                  int var203 = 0;
                  if (var9 || ~var10 < ~var203) {
                     do {
                        int var204 = arg1[var203];
                        if (~var204 <= ~this.field2083.length) {
                           ++var203;
                        } else {
                           int[] var205 = this.field2083[var204];
                           int var206 = 0;
                           if (!var9 && ~var206 <= ~var205.length) {
                              ++var203;
                           } else {
                              do {
                                 class248 var207 = this.field2099[var205[var206]];
                                 var207.field3773 = var207.field3773 + arg2 & 16383;
                                 ++var206;
                              } while(~var206 > ~var205.length);

                              ++var203;
                           }
                        }
                     } while(~var10 < ~var203);
                  }
               }

            }
         } else {
            arg3 <<= 4;
            arg2 <<= 4;
            arg4 <<= 4;
            int var11 = 0;
            class462.field7021 = 0;
            class696.field10343 = 0;
            class728.field10876 = 0;
            int var12 = 0;
            if (var9) {
               var10000 = arg1[var12];
            } else if (~var10 >= ~var12) {
               var10000 = var11;
               if (!var9) {
                  if (var11 > 0) {
                     class696.field10343 = class696.field10343 / var11 + arg3;
                     class728.field10876 = class728.field10876 / var11 + arg2;
                     class274.field4391 = true;
                     class462.field7021 = class462.field7021 / var11 + arg4;
                     return;
                  }

                  class696.field10343 = arg3;
                  class462.field7021 = arg4;
                  class728.field10876 = arg2;
                  return;
               }
            } else {
               var10000 = arg1[var12];
            }

            while(true) {
               int var13 = var10000;
               if (this.field2107.length <= var13) {
                  ++var12;
               } else {
                  int[] var14 = this.field2107[var13];
                  int var15 = 0;
                  int var16;
                  if (var9) {
                     var16 = var14[var15];
                     if (this.field2161 != null) {
                        if ((this.field2161[var16] & arg6) != 0) {
                           class728.field10876 += this.field2197[var16];
                           class696.field10343 += this.field2134[var16];
                           ++var11;
                           class462.field7021 += this.field2100[var16];
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class728.field10876 += this.field2197[var16];
                        class696.field10343 += this.field2134[var16];
                        ++var11;
                        class462.field7021 += this.field2100[var16];
                        ++var15;
                     }
                  }

                  while(var14.length > var15) {
                     var16 = var14[var15];
                     if (this.field2161 != null) {
                        if ((this.field2161[var16] & arg6) != 0) {
                           class728.field10876 += this.field2197[var16];
                           class696.field10343 += this.field2134[var16];
                           ++var11;
                           class462.field7021 += this.field2100[var16];
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class728.field10876 += this.field2197[var16];
                        class696.field10343 += this.field2134[var16];
                        ++var11;
                        class462.field7021 += this.field2100[var16];
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (~var10 >= ~var12) {
                  var10000 = var11;
                  if (!var9) {
                     if (var11 > 0) {
                        class696.field10343 = class696.field10343 / var11 + arg3;
                        class728.field10876 = class728.field10876 / var11 + arg2;
                        class274.field4391 = true;
                        class462.field7021 = class462.field7021 / var11 + arg4;
                        return;
                     }

                     class696.field10343 = arg3;
                     class462.field7021 = arg4;
                     class728.field10876 = arg2;
                     return;
                  }
               } else {
                  var10000 = arg1[var12];
               }
            }
         }
      } catch (RuntimeException var209) {
         throw class482.method3757(var209, field2199[19] + arg0 + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field2199[5] : field2199[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IILkf;ZII)Z",
      line = 2833
   )
   public final boolean method912(int arg0, int arg1, class401 arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field2071;
         return this.method1328(arg3, arg2, arg4, 0, arg0, arg1, arg5);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2199[47] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2199[5] : field2199[4]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "b",
      descriptor = "(B)V",
      line = 2841
   )
   private final void method1323(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2139;
         if (arg0 < -23) {
            if (this.field2117 != null) {
               class167 var3 = this.field2187.field9613;
               this.field2187.method4804(-12167);
               this.field2187.method581(!this.field2106);
               this.field2187.method4749(true, false);
               this.field2187.method4768(-677, this.field2187.field9736, (class436)null, this.field2187.field9744, (class436)null);
               int var4 = 0;
               class146 var10000;
               if (var2) {
                  var10000 = this;
               } else if (~var4 <= ~this.field2130) {
                  this.field2187.method581(true);
                  var10000 = this;
                  if (!var2) {
                     this.field2187.method4763((byte)-128);
                     return;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  class249 var5 = var10000.field2117[var4];
                  class248 var6 = this.field2099[var4];
                  if (var5.field3790 && this.field2187.method617()) {
                     ++var4;
                  } else {
                     float var7 = (float)(this.field2197[var5.field3784] + this.field2197[var5.field3779] + this.field2197[var5.field3792]) * 0.3333333F;
                     float var8 = (float)(this.field2134[var5.field3784] - (-this.field2134[var5.field3792] + -this.field2134[var5.field3779])) * 0.3333333F;
                     float var9 = (float)(this.field2100[var5.field3784] - (-this.field2100[var5.field3779] - this.field2100[var5.field3792])) * 0.3333333F;
                     float var10 = class276.field4409 * var9 + class396.field6212 * var8 + class115.field1561 * var7 + class742.field11028;
                     float var11 = class13.field161 * var9 + class766.field11309 * var8 + class433.field6664 * var7 + class201.field3080;
                     float var12 = class226.field3440 * var9 + class466.field7090 * var8 + class187.field2929 * var7 + class195.field3029;
                     float var13 = (float)(1.0D / Math.sqrt((double)(var12 * var12 + var10 * var10 + var11 * var11))) * (float)var5.field3791;
                     var3.method1561(var5.field3780 * var6.field3769 >> 7, (float)var6.field3770 + var10 + -(var10 * var13), var6.field3773, var12 * var13 + -var12, var5.field3782 * var6.field3772 >> 7, 1, var11 * var13 + ((float)var6.field3777 - var11));
                     this.field2187.method4791(118, var3);
                     int var14 = var6.field3774;
                     OpenGL.glColor4ub((byte)(var14 >> 16), (byte)(var14 >> 8), (byte)var14, (byte)(var14 >> 24));
                     this.field2187.method4805(var5.field3788, (byte)26);
                     this.field2187.method4783(3008, var5.field3793);
                     this.field2187.method4812((byte)30, 4, 7, 0);
                     ++var4;
                  }

                  if (~var4 <= ~this.field2130) {
                     this.field2187.method581(true);
                     var10000 = this;
                     if (!var2) {
                        this.field2187.method4763((byte)-128);
                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class482.method3757(var16, field2199[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "k",
      descriptor = "(I)V",
      line = 2903
   )
   public final void method864(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2151;
         int var3 = class83.field1196[arg0];
         int var4 = class83.field1194[arg0];
         int var5 = 0;
         int var6;
         if (var2) {
            var6 = this.field2197[var5] * var4 + this.field2100[var5] * var3 >> 14;
            this.field2100[var5] = this.field2100[var5] * var4 + -(this.field2197[var5] * var3) >> 14;
            this.field2197[var5] = var6;
            ++var5;
         }

         while(true) {
            while(var5 < this.field2109) {
               var6 = this.field2197[var5] * var4 + this.field2100[var5] * var3 >> 14;
               this.field2100[var5] = this.field2100[var5] * var4 + -(this.field2197[var5] * var3) >> 14;
               this.field2197[var5] = var6;
               ++var5;
            }

            int var7 = 0;
            if (!var2) {
               class146 var10000;
               if (var2) {
                  var10000 = this;
               } else if (this.field2196 <= var7) {
                  var10000 = this;
                  if (!var2) {
                     if (this.field2138 == null && this.field2162 != null) {
                        this.field2162.field6682 = null;
                     }

                     if (this.field2138 != null) {
                        this.field2138.field6682 = null;
                     }

                     if (this.field2198 != null) {
                        this.field2198.field6682 = null;
                     }

                     this.field2121 = false;
                     return;
                  }
               } else {
                  var10000 = this;
               }

               while(true) {
                  int var8 = var10000.field2156[var7] * var4 + this.field2154[var7] * var3 >> 14;
                  this.field2154[var7] = (short)(this.field2154[var7] * var4 + -(this.field2156[var7] * var3) >> 14);
                  this.field2156[var7] = (short)var8;
                  ++var7;
                  if (this.field2196 <= var7) {
                     var10000 = this;
                     if (!var2) {
                        if (this.field2138 == null && this.field2162 != null) {
                           this.field2162.field6682 = null;
                        }

                        if (this.field2138 != null) {
                           this.field2138.field6682 = null;
                        }

                        if (this.field2198 != null) {
                           this.field2198.field6682 = null;
                        }

                        this.field2121 = false;
                        return;
                     }
                  } else {
                     var10000 = this;
                  }
               }
            }

            ++var5;
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field2199[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "s",
      descriptor = "(I)V",
      line = 2955
   )
   public final void method923(int arg0) {
      try {
         this.field2125 = arg0;
         ++field2164;
         if (this.field2098 != null && (this.field2125 & 65536) == 0) {
            this.field2137 = this.field2098.field5295;
            this.field2156 = this.field2098.field5299;
            this.field2146 = this.field2098.field5298;
            this.field2154 = this.field2098.field5300;
            this.field2098 = null;
         }

         this.field2179 = true;
         this.method1329(false);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2199[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "V",
      descriptor = "()I",
      line = 2980
   )
   public final int method902() {
      try {
         ++field2126;
         if (!this.field2121) {
            this.method1327((byte)-52);
         }

         return this.field2093;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[42] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lkf;Lk;I)V",
      line = 2998
   )
   public final void method897(class401 arg0, class49 arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field2101;
         if (this.field2196 != 0) {
            class167 var5 = this.field2187.field9647;
            class167 var6 = (class167)arg0;
            if (!this.field2121) {
               this.method1327((byte)-28);
            }

            float var9;
            float var10;
            label141: {
               class466.field7090 = var5.field2517 * var6.field2514 + var5.field2516 * var6.field2534 + var5.field2514 * var6.field2513;
               class195.field3029 = var5.field2517 * var6.field2531 + var5.field2516 * var6.field2510 + var5.field2514 * var6.field2538 + var5.field2531;
               float var7 = (float)this.field2142 * class466.field7090 + class195.field3029;
               float var8 = (float)this.field2108 * class466.field7090 + class195.field3029;
               if (!(var7 > var8)) {
                  var9 = (float)this.field2157 + var8;
                  var10 = var7 - (float)this.field2157;
                  if (!var4) {
                     break label141;
                  }
               }

               var10 = (float)(-this.field2157) + var8;
               var9 = (float)this.field2157 + var7;
            }

            if (!(this.field2187.field9676 <= var10)) {
               if (!(var9 <= (float)this.field2187.field9753)) {
                  float var13;
                  float var14;
                  label133: {
                     class742.field11028 = var5.field2515 * var6.field2531 + var5.field2534 * var6.field2538 + var5.field2533 * var6.field2510 + var5.field2510;
                     class396.field6212 = var5.field2515 * var6.field2514 + var5.field2534 * var6.field2513 + var5.field2533 * var6.field2534;
                     float var11 = (float)this.field2142 * class396.field6212 + class742.field11028;
                     float var12 = (float)this.field2108 * class396.field6212 + class742.field11028;
                     if (var11 > var12) {
                        var13 = ((float)this.field2157 + var11) * (float)this.field2187.field9745;
                        var14 = ((float)(-this.field2157) + var12) * (float)this.field2187.field9745;
                        if (!var4) {
                           break label133;
                        }
                     }

                     var13 = ((float)this.field2157 + var12) * (float)this.field2187.field9745;
                     var14 = ((float)(-this.field2157) + var11) * (float)this.field2187.field9745;
                  }

                  if (!(this.field2187.field9751 <= var14 / var9)) {
                     if (!(this.field2187.field9742 >= var13 / var9)) {
                        float var17;
                        float var18;
                        label125: {
                           class201.field3080 = var5.field2541 * var6.field2531 + var5.field2530 * var6.field2510 + var5.field2513 * var6.field2538 + var5.field2538;
                           class766.field11309 = var5.field2541 * var6.field2514 + var5.field2530 * var6.field2534 + var5.field2513 * var6.field2513;
                           float var15 = (float)this.field2142 * class766.field11309 + class201.field3080;
                           float var16 = (float)this.field2108 * class766.field11309 + class201.field3080;
                           if (var16 < var15) {
                              var17 = ((float)this.field2157 + var15) * (float)this.field2187.field9717;
                              var18 = (var16 - (float)this.field2157) * (float)this.field2187.field9717;
                              if (!var4) {
                                 break label125;
                              }
                           }

                           var17 = ((float)this.field2157 + var16) * (float)this.field2187.field9717;
                           var18 = ((float)(-this.field2157) + var15) * (float)this.field2187.field9717;
                        }

                        if (!(this.field2187.field9699 <= var18 / var9)) {
                           if (!(var17 / var9 <= this.field2187.field9662)) {
                              if (arg1 != null || this.field2117 != null) {
                                 class276.field4409 = var5.field2515 * var6.field2517 + var5.field2534 * var6.field2541 + var5.field2533 * var6.field2515;
                                 class433.field6664 = var5.field2541 * var6.field2516 + var5.field2530 * var6.field2533 + var5.field2513 * var6.field2530;
                                 class13.field161 = var5.field2541 * var6.field2517 + var5.field2530 * var6.field2515 + var5.field2513 * var6.field2541;
                                 class115.field1561 = var5.field2515 * var6.field2516 + var5.field2534 * var6.field2530 + var5.field2533 * var6.field2533;
                                 class187.field2929 = var5.field2517 * var6.field2516 + var5.field2516 * var6.field2533 + var5.field2514 * var6.field2530;
                                 class226.field3440 = var5.field2517 * var6.field2517 + var5.field2516 * var6.field2515 + var5.field2514 * var6.field2541;
                              }

                              if (arg1 != null) {
                                 boolean var19;
                                 boolean var20;
                                 int var21;
                                 int var22;
                                 int var23;
                                 int var24;
                                 int var25;
                                 label110: {
                                    var19 = false;
                                    var20 = true;
                                    var21 = this.field2093 - -this.field2113 >> 1;
                                    var22 = this.field2190 + this.field2084 >> 1;
                                    var23 = (int)((float)var22 * class276.field4409 + (float)this.field2142 * class396.field6212 + (float)var21 * class115.field1561 + class742.field11028);
                                    var24 = (int)((float)var22 * class13.field161 + (float)this.field2142 * class766.field11309 + (float)var21 * class433.field6664 + class201.field3080);
                                    var25 = (int)((float)var22 * class226.field3440 + (float)this.field2142 * class466.field7090 + (float)var21 * class187.field2929 + class195.field3029);
                                    if (var25 < this.field2187.field9753) {
                                       var19 = true;
                                       if (!var4) {
                                          break label110;
                                       }
                                    }

                                    arg1.field634 = this.field2187.field9713 - -(this.field2187.field9717 * var24 / var25);
                                    arg1.field636 = this.field2187.field9745 * var23 / var25 + this.field2187.field9728;
                                 }

                                 int var26;
                                 int var27;
                                 int var28;
                                 label105: {
                                    var26 = (int)((float)var22 * class276.field4409 + (float)this.field2108 * class396.field6212 + (float)var21 * class115.field1561 + class742.field11028);
                                    var27 = (int)((float)var22 * class13.field161 + (float)this.field2108 * class766.field11309 + (float)var21 * class433.field6664 + class201.field3080);
                                    var28 = (int)((float)var22 * class226.field3440 + (float)this.field2108 * class466.field7090 + (float)var21 * class187.field2929 + class195.field3029);
                                    if (~this.field2187.field9753 < ~var28) {
                                       var19 = true;
                                       if (!var4) {
                                          break label105;
                                       }
                                    }

                                    arg1.field633 = this.field2187.field9713 - -(this.field2187.field9717 * var27 / var28);
                                    arg1.field635 = this.field2187.field9745 * var26 / var28 + this.field2187.field9728;
                                 }

                                 if (var19) {
                                    label169: {
                                       if (this.field2187.field9753 <= var25 || var28 >= this.field2187.field9753) {
                                          if (~this.field2187.field9753 >= ~var25) {
                                             if (this.field2187.field9753 <= var28) {
                                                break label169;
                                             }

                                             int var29 = (-this.field2187.field9753 + var25 << 16) / (var25 - var28);
                                             int var30 = var23 - -((-var26 + var23) * var29 >> 16);
                                             int var31 = ((-var27 + var24) * var29 >> 16) + var24;
                                             arg1.field636 = this.field2187.field9745 * var30 / this.field2187.field9753 + this.field2187.field9728;
                                             arg1.field634 = this.field2187.field9717 * var31 / this.field2187.field9753 + this.field2187.field9713;
                                             if (!var4) {
                                                break label169;
                                             }
                                          }

                                          int var32 = (-this.field2187.field9753 + var28 << 16) / (-var25 + var28);
                                          int var33 = var26 - -((-var23 + var26) * var32 >> 16);
                                          arg1.field636 = this.field2187.field9745 * var33 / this.field2187.field9753 + this.field2187.field9728;
                                          int var34 = ((-var24 + var27) * var32 >> 16) + var27;
                                          arg1.field634 = this.field2187.field9717 * var34 / this.field2187.field9753 + this.field2187.field9713;
                                          if (!var4) {
                                             break label169;
                                          }
                                       }

                                       var20 = false;
                                    }
                                 }

                                 if (var20) {
                                    label84: {
                                       if (var28 < var25) {
                                          arg1.field631 = this.field2187.field9728 - -((this.field2157 + var23) * this.field2187.field9745 / var25) + -arg1.field636;
                                          if (!var4) {
                                             break label84;
                                          }
                                       }

                                       arg1.field631 = (this.field2157 + var26) * this.field2187.field9745 / var28 + this.field2187.field9728 + -arg1.field635;
                                    }

                                    arg1.field632 = true;
                                 }
                              }

                              this.field2187.method4761(4098);
                              this.field2187.method4781(var6, (byte)108);
                              this.method1325(3);
                              this.field2187.method4763((byte)-120);
                              this.method1323((byte)-88);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var36) {
         throw class482.method3757(var36, field2199[3] + (arg0 != null ? field2199[5] : field2199[4]) + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(BIZ)Lka;",
      line = 3198
   )
   public final class91 method868(byte arg0, int arg1, boolean arg2) {
      boolean var4 = client.field1786;

      try {
         ++field2174;
         class146 var5;
         class146 var6;
         if (arg0 != 1) {
            if (~arg0 == -3) {
               var5 = this.field2187.field9684;
               var6 = this.field2187.field9687;
               if (!var4) {
                  return this.method1326(arg1, var5, arg2, (byte)-112, var6, ~arg0 != -1);
               }
            }

            if (~arg0 == -4) {
               var6 = this.field2187.field9719;
               var5 = this.field2187.field9752;
               if (!var4) {
                  return this.method1326(arg1, var5, arg2, (byte)-112, var6, ~arg0 != -1);
               }
            }

            if (arg0 == 4) {
               var5 = this.field2187.field9710;
               var6 = this.field2187.field9756;
               if (!var4) {
                  return this.method1326(arg1, var5, arg2, (byte)-112, var6, ~arg0 != -1);
               }
            }

            if (arg0 == 5) {
               var6 = this.field2187.field9754;
               var5 = this.field2187.field9755;
               if (!var4) {
                  return this.method1326(arg1, var5, arg2, (byte)-112, var6, ~arg0 != -1);
               }
            }

            var5 = var6 = new class146(this.field2187);
            if (!var4) {
               return this.method1326(arg1, var5, arg2, (byte)-112, var6, ~arg0 != -1);
            }
         }

         var5 = this.field2187.field9677;
         var6 = this.field2187.field9692;
         return this.method1326(arg1, var5, arg2, (byte)-112, var6, ~arg0 != -1);
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2199[32] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "ua",
      descriptor = "()I",
      line = 3247
   )
   public final int method906() {
      try {
         ++field2123;
         return this.field2125;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "()Z",
      line = 3255
   )
   public final boolean method890() {
      boolean var1 = client.field1786;

      try {
         ++field2115;
         if (this.field2165 == null) {
            return true;
         } else {
            int var2 = 0;
            if (var1) {
               if (this.field2165[var2] != -1 && !this.field2187.field8891.method1372(-106, this.field2165[var2])) {
                  return false;
               }

               ++var2;
            }

            while(true) {
               short var10000;
               if (~this.field2165.length >= ~var2) {
                  var10000 = 1;
                  if (!var1) {
                     return true;
                  }
               } else {
                  var10000 = this.field2165[var2];
               }

               if (var10000 != -1 && !this.field2187.field8891.method1372(-106, this.field2165[var2])) {
                  return false;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field2199[67] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "ba",
      descriptor = "(Lr;)Lr;",
      line = 3282
   )
   public final class273 method881(class273 arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2169;
         if (~this.field2196 == -1) {
            return null;
         } else {
            if (!this.field2121) {
               this.method1327((byte)-50);
            }

            int var3;
            int var4;
            label48: {
               if (this.field2187.field9727 <= 0) {
                  var3 = this.field2093 - (this.field2187.field9727 * this.field2142 >> 8) >> this.field2187.field9620;
                  var4 = this.field2113 - (this.field2187.field9727 * this.field2108 >> 8) >> this.field2187.field9620;
                  if (!var2) {
                     break label48;
                  }
               }

               var3 = -(this.field2187.field9727 * this.field2108 >> 8) + this.field2093 >> this.field2187.field9620;
               var4 = -(this.field2187.field9727 * this.field2142 >> 8) + this.field2113 >> this.field2187.field9620;
            }

            int var5;
            int var6;
            label43: {
               if (this.field2187.field9750 > 0) {
                  var5 = -(this.field2187.field9750 * this.field2108 >> 8) + this.field2190 >> this.field2187.field9620;
                  var6 = this.field2084 - (this.field2187.field9750 * this.field2142 >> 8) >> this.field2187.field9620;
                  if (!var2) {
                     break label43;
                  }
               }

               var5 = this.field2190 - (this.field2187.field9750 * this.field2142 >> 8) >> this.field2187.field9620;
               var6 = -(this.field2187.field9750 * this.field2108 >> 8) + this.field2084 >> this.field2187.field9620;
            }

            class630 var10;
            label60: {
               int var7 = -var3 + var4 - -1;
               int var8 = -var5 + var6 + 1;
               class630 var9 = (class630)arg0;
               if (var9 == null || !var9.method4614((byte)-111, var8, var7)) {
                  var10 = new class630(this.field2187, var7, var8);
                  if (!var2) {
                     break label60;
                  }
               }

               var10 = var9;
               var9.method4617((byte)0);
            }

            var10.method4615(var6, var4, false, var3, var5);
            this.method1332(var10, -17094);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class482.method3757(var12, field2199[35] + (arg0 != null ? field2199[5] : field2199[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(III)V",
      line = 3343
   )
   public static final void method1324(int arg0, int arg1, int arg2) {
      boolean var3 = client.field1786;

      try {
         label28: {
            ++field2114;
            if (~class452.field6916 != -2) {
               if (~class452.field6916 != -3) {
                  break label28;
               }

               if (!class281.field4472) {
                  class25.method189(arg2, arg0, 16);
                  if (!var3) {
                     break label28;
                  }
               }

               class25.method189(class600.method4443(0) + arg2, class218.method1890(0) + arg0, 16);
               if (!var3) {
                  break label28;
               }
            }

            class356.method2912(arg0, arg2, -88, class329.field4991);
         }

         int var4 = -125 / ((arg1 - 32) / 45);
         class452.field6916 = 0;
         class329.field4991 = null;
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field2199[39] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "O",
      descriptor = "(III)V",
      line = 3368
   )
   public final void method872(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field2090;
         int var5 = 0;
         if (var4) {
            if (arg0 != 128) {
               this.field2197[var5] = this.field2197[var5] * arg0 >> 7;
            }

            if (~arg1 != -129) {
               this.field2134[var5] = this.field2134[var5] * arg1 >> 7;
            }

            if (arg2 != 128) {
               this.field2100[var5] = this.field2100[var5] * arg2 >> 7;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field2109) {
               if (arg0 != 128) {
                  this.field2197[var5] = this.field2197[var5] * arg0 >> 7;
               }

               if (~arg1 != -129) {
                  this.field2134[var5] = this.field2134[var5] * arg1 >> 7;
               }

               if (arg2 != 128) {
                  this.field2100[var5] = this.field2100[var5] * arg2 >> 7;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            if (!var4) {
               if (this.field2198 != null) {
                  this.field2198.field6682 = null;
               }

               this.field2121 = false;
               return;
            }

            this.field2100[var5] = this.field2100[var5] * arg2 >> 7;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2199[66] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "VA",
      descriptor = "(I)V",
      line = 3402
   )
   public final void method874(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2077;
         int var3 = class83.field1196[arg0];
         int var4 = class83.field1194[arg0];
         int var5 = 0;
         class146 var10000;
         if (var2) {
            var10000 = this;
         } else if (~var5 <= ~this.field2109) {
            this.field2121 = false;
            var10000 = this;
            if (!var2) {
               if (this.field2198 != null) {
                  this.field2198.field6682 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field2134[var5] * var3 - -(this.field2197[var5] * var4) >> 14;
            this.field2134[var5] = this.field2134[var5] * var4 + -(this.field2197[var5] * var3) >> 14;
            this.field2197[var5] = var6;
            ++var5;
            if (~var5 <= ~this.field2109) {
               this.field2121 = false;
               var10000 = this;
               if (!var2) {
                  if (this.field2198 != null) {
                     this.field2198.field6682 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2199[65] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "(I)V",
      line = 3434
   )
   private final void method1325(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2147;
         if (~this.field2136 != -1) {
            if (arg0 != 3) {
               field2183 = null;
            }

            if (this.field2145 != 0) {
               this.method1320(true, -90);
            }

            this.method1320(false, arg0 ^ -104);
            if (this.field2166 != null) {
               if (this.field2166.field1790 == null) {
                  this.method1319(~(16 & this.field2145) != -1, (byte)-40);
               }

               if (this.field2166.field1790 != null) {
                  this.field2187.method4749(true, this.field2138 != null);
                  this.field2187.method4768(arg0 + -680, this.field2189, this.field2162, this.field2198, this.field2138);
                  int var3 = this.field2076.length + -1;
                  int var4 = 0;
                  if (var2 || var4 < var3) {
                     do {
                        int var5 = this.field2076[var4];
                        int var6 = this.field2076[var4 + 1];
                        int var7 = this.field2165[var5] & 65535;
                        if (~var7 == -65536) {
                           var7 = -1;
                        }

                        this.field2187.method4741(this.field2138 != null, -83, var7);
                        this.field2187.method4760((-var5 + var6) * 3, this.field2166.field1790, 4, var5 * 3, arg0 ^ -126);
                        ++var4;
                     } while(var4 < var3);
                  }
               }
            }

            this.method1329(false);
         }
      } catch (RuntimeException var9) {
         throw class482.method3757(var9, field2199[64] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ILiw;ZBLiw;Z)Lka;",
      line = 3490
   )
   private final class91 method1326(int arg0, class146 arg1, boolean arg2, byte arg3, class146 arg4, boolean arg5) {
      boolean var7 = client.field1786;

      try {
         label592: {
            if (~(arg0 & 256) == -1) {
               arg1.field2106 = this.field2106;
               if (!var7) {
                  break label592;
               }
            }

            arg1.field2106 = true;
         }

         label597: {
            arg1.field2196 = this.field2196;
            ++field2133;
            arg1.field2181 = this.field2181;
            arg1.field2136 = this.field2136;
            arg1.field2158 = this.field2158;
            arg1.field2125 = arg0;
            arg1.field2116 = this.field2116;
            arg1.field2130 = this.field2130;
            arg1.field2144 = this.field2144;
            arg1.field2109 = this.field2109;
            arg1.field2145 = 0;
            arg1.field2178 = this.field2178;
            arg1.field2079 = this.field2079;
            boolean var8 = class309.method2587(this.field2116, (byte)114, arg0);
            boolean var9 = class639.method4662(arg0, this.field2116, 7371);
            boolean var10 = class378.method3088((byte)-100, arg0, this.field2116);
            boolean var11 = var9 | var8 | var10;
            if (!var11) {
               arg1.field2134 = this.field2134;
               arg1.field2100 = this.field2100;
               arg1.field2197 = this.field2197;
               if (!var7) {
                  break label597;
               }
            }

            label635: {
               if (!var8) {
                  arg1.field2197 = this.field2197;
                  if (!var7) {
                     break label635;
                  }
               }

               if (arg4.field2197 == null || ~arg4.field2197.length > ~this.field2181) {
                  arg1.field2197 = arg4.field2197 = new int[this.field2181];
                  if (!var7) {
                     break label635;
                  }
               }

               arg1.field2197 = arg4.field2197;
            }

            label636: {
               if (!var9) {
                  arg1.field2134 = this.field2134;
                  if (!var7) {
                     break label636;
                  }
               }

               if (arg4.field2134 == null || ~arg4.field2134.length > ~this.field2181) {
                  arg1.field2134 = arg4.field2134 = new int[this.field2181];
                  if (!var7) {
                     break label636;
                  }
               }

               arg1.field2134 = arg4.field2134;
            }

            label600: {
               if (!var10) {
                  arg1.field2100 = this.field2100;
                  if (!var7) {
                     break label600;
                  }
               }

               if (arg4.field2100 != null && this.field2181 <= arg4.field2100.length) {
                  arg1.field2100 = arg4.field2100;
                  if (!var7) {
                     break label600;
                  }
               }

               arg1.field2100 = arg4.field2100 = new int[this.field2181];
            }

            int var12 = 0;
            if (var7 || var12 < this.field2181) {
               do {
                  if (var8) {
                     arg1.field2197[var12] = this.field2197[var12];
                  }

                  if (var9) {
                     arg1.field2134[var12] = this.field2134[var12];
                  }

                  if (var10) {
                     arg1.field2100[var12] = this.field2100[var12];
                  }

                  ++var12;
               } while(var12 < this.field2181);
            }
         }

         label602: {
            if (!class8.method34(this.field2116, 0, arg0)) {
               if (class20.method148(arg0, this.field2116, 2048)) {
                  arg1.field2198 = this.field2198;
                  if (!var7) {
                     break label602;
                  }
               }

               arg1.field2198 = null;
               if (!var7) {
                  break label602;
               }
            }

            arg1.field2198 = arg4.field2198;
            if (arg5) {
               arg1.field2145 = (byte)(arg1.field2145 | 1);
            }

            arg1.field2198.field6684 = this.field2198.field6684;
            arg1.field2198.field6682 = this.field2198.field6682;
         }

         label603: {
            if (!class238.method2031(arg0, this.field2116, 11760)) {
               arg1.field2140 = this.field2140;
               if (!var7) {
                  break label603;
               }
            }

            label529: {
               if (arg4.field2140 != null && ~this.field2144 >= ~arg4.field2140.length) {
                  arg1.field2140 = arg4.field2140;
                  if (!var7) {
                     break label529;
                  }
               }

               arg1.field2140 = arg4.field2140 = new short[this.field2144];
            }

            int var13 = 0;
            if (var7 || ~this.field2144 < ~var13) {
               do {
                  arg1.field2140[var13] = this.field2140[var13];
                  ++var13;
               } while(~this.field2144 < ~var13);
            }
         }

         label514: {
            if (class564.method4256(arg0, -19410, this.field2116)) {
               label511: {
                  if (arg4.field2155 != null && this.field2144 <= arg4.field2155.length) {
                     arg1.field2155 = arg4.field2155;
                     if (!var7) {
                        break label511;
                     }
                  }

                  arg1.field2155 = arg4.field2155 = new byte[this.field2144];
               }

               int var14 = 0;
               if (var7) {
                  arg1.field2155[var14] = this.field2155[var14];
                  ++var14;
               }

               while(true) {
                  while(~this.field2144 < ~var14) {
                     arg1.field2155[var14] = this.field2155[var14];
                     ++var14;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label514;
                     }
                     break;
                  }

                  ++var14;
               }
            }

            arg1.field2155 = this.field2155;
         }

         label607: {
            if (!class246.method2092((byte)-40, this.field2116, arg0)) {
               if (!class756.method5544(arg0, this.field2116, true)) {
                  arg1.field2162 = null;
                  if (!var7) {
                     break label607;
                  }
               }

               arg1.field2162 = this.field2162;
               if (!var7) {
                  break label607;
               }
            }

            arg1.field2162 = arg4.field2162;
            if (arg5) {
               arg1.field2145 = (byte)(arg1.field2145 | 2);
            }

            arg1.field2162.field6682 = this.field2162.field6682;
            arg1.field2162.field6684 = this.field2162.field6684;
         }

         label475: {
            if (class482.method3754(false, arg0, this.field2116)) {
               label472: {
                  if (arg4.field2156 != null && ~this.field2196 >= ~arg4.field2156.length) {
                     arg1.field2137 = arg4.field2137;
                     arg1.field2156 = arg4.field2156;
                     arg1.field2154 = arg4.field2154;
                     if (!var7) {
                        break label472;
                     }
                  }

                  int var15 = this.field2196;
                  arg1.field2137 = arg4.field2137 = new short[var15];
                  arg1.field2154 = arg4.field2154 = new short[var15];
                  arg1.field2156 = arg4.field2156 = new short[var15];
               }

               label609: {
                  if (this.field2098 != null) {
                     if (arg4.field2098 == null) {
                        arg4.field2098 = new class345();
                     }

                     class345 var16 = arg1.field2098 = arg4.field2098;
                     if (var16.field5299 == null || this.field2196 > var16.field5299.length) {
                        int var17 = this.field2196;
                        var16.field5299 = new short[var17];
                        var16.field5300 = new short[var17];
                        var16.field5298 = new byte[var17];
                        var16.field5295 = new short[var17];
                     }

                     int var18 = 0;
                     if (var7) {
                        arg1.field2156[var18] = this.field2156[var18];
                        arg1.field2137[var18] = this.field2137[var18];
                        arg1.field2154[var18] = this.field2154[var18];
                        var16.field5299[var18] = this.field2098.field5299[var18];
                        var16.field5295[var18] = this.field2098.field5295[var18];
                        var16.field5300[var18] = this.field2098.field5300[var18];
                        var16.field5298[var18] = this.field2098.field5298[var18];
                        ++var18;
                     }

                     while(true) {
                        while(var18 < this.field2196) {
                           arg1.field2156[var18] = this.field2156[var18];
                           arg1.field2137[var18] = this.field2137[var18];
                           arg1.field2154[var18] = this.field2154[var18];
                           var16.field5299[var18] = this.field2098.field5299[var18];
                           var16.field5295[var18] = this.field2098.field5295[var18];
                           var16.field5300[var18] = this.field2098.field5300[var18];
                           var16.field5298[var18] = this.field2098.field5298[var18];
                           ++var18;
                        }

                        if (!var7) {
                           if (!var7) {
                              break label609;
                           }
                           break;
                        }

                        ++var18;
                     }
                  }

                  int var19 = 0;
                  if (var7 || ~this.field2196 < ~var19) {
                     do {
                        arg1.field2156[var19] = this.field2156[var19];
                        arg1.field2137[var19] = this.field2137[var19];
                        arg1.field2154[var19] = this.field2154[var19];
                        ++var19;
                     } while(~this.field2196 < ~var19);
                  }
               }

               arg1.field2146 = this.field2146;
               if (!var7) {
                  break label475;
               }
            }

            arg1.field2156 = this.field2156;
            arg1.field2146 = this.field2146;
            arg1.field2098 = this.field2098;
            arg1.field2154 = this.field2154;
            arg1.field2137 = this.field2137;
         }

         label613: {
            if (!class372.method3038(128, this.field2116, arg0)) {
               if (!class55.method411(this.field2116, arg0, (byte)35)) {
                  arg1.field2138 = null;
                  if (!var7) {
                     break label613;
                  }
               }

               arg1.field2138 = this.field2138;
               if (!var7) {
                  break label613;
               }
            }

            arg1.field2138 = arg4.field2138;
            if (arg5) {
               arg1.field2145 = (byte)(arg1.field2145 | 4);
            }

            arg1.field2138.field6682 = this.field2138.field6682;
            arg1.field2138.field6684 = this.field2138.field6684;
         }

         label614: {
            if (!class66.method509(arg0, 2048, this.field2116)) {
               arg1.field2195 = this.field2195;
               arg1.field2131 = this.field2131;
               if (!var7) {
                  break label614;
               }
            }

            label637: {
               if (arg4.field2131 == null || arg4.field2131.length < this.field2144) {
                  int var20 = this.field2196;
                  arg1.field2195 = arg4.field2195 = new float[var20];
                  arg1.field2131 = arg4.field2131 = new float[var20];
                  if (!var7) {
                     break label637;
                  }
               }

               arg1.field2195 = arg4.field2195;
               arg1.field2131 = arg4.field2131;
            }

            int var21 = 0;
            if (var7 || var21 < this.field2196) {
               do {
                  arg1.field2131[var21] = this.field2131[var21];
                  arg1.field2195[var21] = this.field2195[var21];
                  ++var21;
               } while(var21 < this.field2196);
            }
         }

         if (arg3 >= -86) {
            this.field2140 = null;
         }

         label615: {
            if (!class348.method2804(0, this.field2116, arg0)) {
               if (!class22.method160(arg0, this.field2116, 2048)) {
                  arg1.field2189 = null;
                  if (!var7) {
                     break label615;
                  }
               }

               arg1.field2189 = this.field2189;
               if (!var7) {
                  break label615;
               }
            }

            if (arg5) {
               arg1.field2145 = (byte)(arg1.field2145 | 8);
            }

            arg1.field2189 = arg4.field2189;
            arg1.field2189.field6684 = this.field2189.field6684;
            arg1.field2189.field6682 = this.field2189.field6682;
         }

         label385: {
            if (class290.method2449(-18, this.field2116, arg0)) {
               label640: {
                  if (arg4.field2110 == null || ~this.field2144 < ~arg4.field2110.length) {
                     int var22 = this.field2144;
                     arg1.field2088 = arg4.field2088 = new short[var22];
                     arg1.field2104 = arg4.field2104 = new short[var22];
                     arg1.field2110 = arg4.field2110 = new short[var22];
                     if (!var7) {
                        break label640;
                     }
                  }

                  arg1.field2104 = arg4.field2104;
                  arg1.field2088 = arg4.field2088;
                  arg1.field2110 = arg4.field2110;
               }

               int var23 = 0;
               if (var7) {
                  arg1.field2110[var23] = this.field2110[var23];
                  arg1.field2104[var23] = this.field2104[var23];
                  arg1.field2088[var23] = this.field2088[var23];
                  ++var23;
               }

               while(true) {
                  while(~this.field2144 < ~var23) {
                     arg1.field2110[var23] = this.field2110[var23];
                     arg1.field2104[var23] = this.field2104[var23];
                     arg1.field2088[var23] = this.field2088[var23];
                     ++var23;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label385;
                     }
                     break;
                  }

                  ++var23;
               }
            }

            arg1.field2110 = this.field2110;
            arg1.field2104 = this.field2104;
            arg1.field2088 = this.field2088;
         }

         label619: {
            if (!class95.method943(arg0, this.field2116, true)) {
               if (class697.method5125(-21955, arg0, this.field2116)) {
                  arg1.field2166 = this.field2166;
                  if (!var7) {
                     break label619;
                  }
               }

               arg1.field2166 = null;
               if (!var7) {
                  break label619;
               }
            }

            arg1.field2166 = arg4.field2166;
            if (arg5) {
               arg1.field2145 = (byte)(arg1.field2145 | 16);
            }

            arg1.field2166.field1790 = this.field2166.field1790;
         }

         label620: {
            if (!class348.method2803(this.field2116, false, arg0)) {
               arg1.field2165 = this.field2165;
               if (!var7) {
                  break label620;
               }
            }

            label638: {
               if (arg4.field2165 == null || arg4.field2165.length < this.field2144) {
                  int var24 = this.field2144;
                  arg1.field2165 = arg4.field2165 = new short[var24];
                  if (!var7) {
                     break label638;
                  }
               }

               arg1.field2165 = arg4.field2165;
            }

            int var25 = 0;
            if (var7 || ~this.field2144 < ~var25) {
               do {
                  arg1.field2165[var25] = this.field2165[var25];
                  ++var25;
               } while(~this.field2144 < ~var25);
            }
         }

         label322: {
            if (class144.method1304(50560, arg0, this.field2116)) {
               if (arg4.field2099 == null || ~arg4.field2099.length > ~this.field2130) {
                  int var26 = this.field2130;
                  arg1.field2099 = arg4.field2099 = new class248[var26];
                  int var27 = 0;
                  if (var7) {
                     arg1.field2099[var27] = this.field2099[var27].method2111(2);
                     ++var27;
                  }

                  while(true) {
                     while(~var27 > ~this.field2130) {
                        arg1.field2099[var27] = this.field2099[var27].method2111(2);
                        ++var27;
                     }

                     if (!var7) {
                        if (!var7) {
                           break label322;
                        }
                        break;
                     }

                     ++var27;
                  }
               }

               arg1.field2099 = arg4.field2099;
               int var28 = 0;
               if (var7) {
                  arg1.field2099[var28].method2112(this.field2099[var28], -88);
                  ++var28;
               }

               while(true) {
                  while(this.field2130 > var28) {
                     arg1.field2099[var28].method2112(this.field2099[var28], -88);
                     ++var28;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label322;
                     }
                     break;
                  }

                  ++var28;
               }
            }

            arg1.field2099 = this.field2099;
         }

         label272: {
            arg1.field2150 = this.field2150;
            arg1.field2094 = this.field2094;
            arg1.field2117 = this.field2117;
            arg1.field2182 = this.field2182;
            arg1.field2072 = this.field2072;
            arg1.field2161 = this.field2161;
            arg1.field2083 = this.field2083;
            arg1.field2188 = this.field2188;
            arg1.field2107 = this.field2107;
            if (this.field2121) {
               arg1.field2157 = this.field2157;
               arg1.field2102 = this.field2102;
               arg1.field2190 = this.field2190;
               arg1.field2093 = this.field2093;
               arg1.field2142 = this.field2142;
               arg1.field2113 = this.field2113;
               arg1.field2108 = this.field2108;
               arg1.field2121 = true;
               arg1.field2084 = this.field2084;
               if (!var7) {
                  break label272;
               }
            }

            arg1.field2121 = false;
         }

         arg1.field2080 = this.field2080;
         arg1.field2076 = this.field2076;
         return arg1;
      } catch (RuntimeException var30) {
         throw class482.method3757(var30, field2199[58] + arg0 + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field2199[5] : field2199[4]) + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "HA",
      descriptor = "()I",
      line = 3959
   )
   public final int method918() {
      try {
         ++field2124;
         if (!this.field2121) {
            this.method1327((byte)-36);
         }

         return this.field2190;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[23] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lkf;Lk;II)V",
      line = 3976
   )
   public final void method905(class401 arg0, class49 arg1, int arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field2152;
         if (~this.field2196 != -1) {
            class167 var6 = this.field2187.field9647;
            if (!this.field2121) {
               this.method1327((byte)-51);
            }

            class167 var7;
            float var10;
            float var11;
            label93: {
               var7 = (class167)arg0;
               class195.field3029 = var6.field2517 * var7.field2531 + var6.field2516 * var7.field2510 + var6.field2514 * var7.field2538 + var6.field2531;
               class466.field7090 = var6.field2517 * var7.field2514 + var6.field2516 * var7.field2534 + var6.field2514 * var7.field2513;
               float var8 = (float)this.field2142 * class466.field7090 + class195.field3029;
               float var9 = (float)this.field2108 * class466.field7090 + class195.field3029;
               if (var8 > var9) {
                  var10 = (float)(-this.field2157) + var9;
                  var11 = (float)this.field2157 + var8;
                  if (!var5) {
                     break label93;
                  }
               }

               var10 = var8 - (float)this.field2157;
               var11 = (float)this.field2157 + var9;
            }

            if (!(var10 >= this.field2187.field9655)) {
               if (!((float)this.field2187.field9753 >= var11)) {
                  float var14;
                  float var15;
                  label85: {
                     class742.field11028 = var6.field2515 * var7.field2531 + var6.field2534 * var7.field2538 + var6.field2533 * var7.field2510 + var6.field2510;
                     class396.field6212 = var6.field2515 * var7.field2514 + var6.field2534 * var7.field2513 + var6.field2533 * var7.field2534;
                     float var12 = (float)this.field2142 * class396.field6212 + class742.field11028;
                     float var13 = (float)this.field2108 * class396.field6212 + class742.field11028;
                     if (var13 < var12) {
                        var14 = (var13 - (float)this.field2157) * (float)this.field2187.field9745;
                        var15 = ((float)this.field2157 + var12) * (float)this.field2187.field9745;
                        if (!var5) {
                           break label85;
                        }
                     }

                     var15 = ((float)this.field2157 + var13) * (float)this.field2187.field9745;
                     var14 = (var12 - (float)this.field2157) * (float)this.field2187.field9745;
                  }

                  if (!(var14 / (float)arg2 >= this.field2187.field9751)) {
                     if (!(this.field2187.field9742 >= var15 / (float)arg2)) {
                        float var18;
                        float var19;
                        label77: {
                           class766.field11309 = var6.field2541 * var7.field2514 + var6.field2530 * var7.field2534 + var6.field2513 * var7.field2513;
                           class201.field3080 = var6.field2541 * var7.field2531 + var6.field2530 * var7.field2510 + var6.field2513 * var7.field2538 + var6.field2538;
                           float var16 = (float)this.field2142 * class766.field11309 + class201.field3080;
                           float var17 = (float)this.field2108 * class766.field11309 + class201.field3080;
                           if (var16 > var17) {
                              var18 = ((float)this.field2157 + var16) * (float)this.field2187.field9717;
                              var19 = (var17 - (float)this.field2157) * (float)this.field2187.field9717;
                              if (!var5) {
                                 break label77;
                              }
                           }

                           var18 = ((float)this.field2157 + var17) * (float)this.field2187.field9717;
                           var19 = (var16 - (float)this.field2157) * (float)this.field2187.field9717;
                        }

                        if (!(var19 / (float)arg2 >= this.field2187.field9699)) {
                           if (!(var18 / (float)arg2 <= this.field2187.field9662)) {
                              if (arg1 != null || this.field2117 != null) {
                                 class226.field3440 = var6.field2517 * var7.field2517 + var6.field2516 * var7.field2515 + var6.field2514 * var7.field2541;
                                 class433.field6664 = var6.field2541 * var7.field2516 + var6.field2530 * var7.field2533 + var6.field2513 * var7.field2530;
                                 class115.field1561 = var6.field2515 * var7.field2516 + var6.field2534 * var7.field2530 + var6.field2533 * var7.field2533;
                                 class13.field161 = var6.field2541 * var7.field2517 + var6.field2530 * var7.field2515 + var6.field2513 * var7.field2541;
                                 class276.field4409 = var6.field2515 * var7.field2517 + var6.field2534 * var7.field2541 + var6.field2533 * var7.field2515;
                                 class187.field2929 = var6.field2517 * var7.field2516 + var6.field2516 * var7.field2533 + var6.field2514 * var7.field2530;
                              }

                              if (arg1 != null) {
                                 int var20 = this.field2113 + this.field2093 >> 1;
                                 int var21 = this.field2190 + this.field2084 >> 1;
                                 int var22 = (int)((float)var21 * class276.field4409 + (float)this.field2142 * class396.field6212 + (float)var20 * class115.field1561 + class742.field11028);
                                 int var23 = (int)((float)var21 * class13.field161 + (float)this.field2142 * class766.field11309 + (float)var20 * class433.field6664 + class201.field3080);
                                 int var24 = (int)((float)var21 * class226.field3440 + (float)this.field2142 * class466.field7090 + (float)var20 * class187.field2929 + class195.field3029);
                                 int var25 = (int)((float)var21 * class276.field4409 + (float)this.field2108 * class396.field6212 + (float)var20 * class115.field1561 + class742.field11028);
                                 int var26 = (int)((float)var21 * class13.field161 + (float)this.field2108 * class766.field11309 + (float)var20 * class433.field6664 + class201.field3080);
                                 arg1.field636 = this.field2187.field9728 - -(this.field2187.field9745 * var22 / arg2);
                                 int var27 = (int)((float)var21 * class226.field3440 + (float)this.field2108 * class466.field7090 + (float)var20 * class187.field2929 + class195.field3029);
                                 arg1.field633 = this.field2187.field9717 * var26 / arg2 + this.field2187.field9713;
                                 arg1.field635 = this.field2187.field9728 - -(this.field2187.field9745 * var25 / arg2);
                                 arg1.field634 = this.field2187.field9717 * var23 / arg2 + this.field2187.field9713;
                                 if (~var24 <= ~this.field2187.field9753 || ~this.field2187.field9753 >= ~var27) {
                                    arg1.field631 = (this.field2157 + var22) * this.field2187.field9745 / arg2 + this.field2187.field9728 + -arg1.field636;
                                    arg1.field632 = true;
                                 }
                              }

                              this.field2187.method4797(0, (float)arg2);
                              this.field2187.method4771(1);
                              this.field2187.method4781(var7, (byte)112);
                              this.method1325(3);
                              this.field2187.method4763((byte)-115);
                              this.method1323((byte)-74);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class482.method3757(var29, field2199[45] + (arg0 != null ? field2199[5] : field2199[4]) + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "g",
      descriptor = "()V",
      line = 4125
   )
   public final void method907() {
      try {
         ++field2148;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "EA",
      descriptor = "()I",
      line = 4132
   )
   public final int method871() {
      try {
         if (!this.field2121) {
            this.method1327((byte)-67);
         }

         ++field2085;
         return this.field2108;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "FA",
      descriptor = "(I)V",
      line = 4144
   )
   public final void method878(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2168;
         int var3 = class83.field1196[arg0];
         int var4 = class83.field1194[arg0];
         int var5 = 0;
         class146 var10000;
         if (var2) {
            var10000 = this;
         } else if (var5 >= this.field2109) {
            var10000 = this;
            if (!var2) {
               if (this.field2198 != null) {
                  this.field2198.field6682 = null;
               }

               this.field2121 = false;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field2134[var5] * var4 - this.field2100[var5] * var3 >> 14;
            this.field2100[var5] = this.field2134[var5] * var3 + this.field2100[var5] * var4 >> 14;
            this.field2134[var5] = var6;
            ++var5;
            if (var5 >= this.field2109) {
               var10000 = this;
               if (!var2) {
                  if (this.field2198 != null) {
                     this.field2198.field6682 = null;
                  }

                  this.field2121 = false;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2199[41] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(I)V",
      line = 4176
   )
   public final void method888(int arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2143;
         int var3 = class83.field1196[arg0];
         int var4 = class83.field1194[arg0];
         int var5 = 0;
         if (!var2 && ~var5 <= ~this.field2109) {
            if (this.field2198 != null) {
               this.field2198.field6682 = null;
            }

            this.field2121 = false;
         } else {
            do {
               int var6 = this.field2100[var5] * var3 - -(this.field2197[var5] * var4) >> 14;
               this.field2100[var5] = this.field2100[var5] * var4 + -(this.field2197[var5] * var3) >> 14;
               this.field2197[var5] = var6;
               ++var5;
            } while(~var5 > ~this.field2109);

            if (this.field2198 != null) {
               this.field2198.field6682 = null;
            }

            this.field2121 = false;
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field2199[59] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "(Lc;)V",
      line = 5892
   )
   public class146(class652 arg0) {
      this.field2144 = 0;
      this.field2136 = 0;
      this.field2158 = false;
      this.field2109 = 0;
      this.field2106 = false;
      this.field2121 = false;
      this.field2179 = true;
      this.field2181 = 0;
      this.field2196 = 0;

      try {
         this.field2187 = arg0;
         this.field2198 = new class436((class112)null, 5126, 3, 0);
         this.field2189 = new class436((class112)null, 5126, 2, 0);
         this.field2138 = new class436((class112)null, 5126, 3, 0);
         this.field2162 = new class436((class112)null, 5121, 4, 0);
         this.field2166 = new class124();
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field2199[30] + (arg0 != null ? field2199[5] : field2199[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "<init>",
      descriptor = "(Lc;Lnga;IIII)V",
      line = 5904
   )
   public class146(class652 arg0, class159 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field1786;
      super();
      this.field2144 = 0;
      this.field2136 = 0;
      this.field2158 = false;
      this.field2109 = 0;
      this.field2106 = false;
      this.field2121 = false;
      this.field2179 = true;
      this.field2181 = 0;
      this.field2196 = 0;

      try {
         this.field2187 = arg0;
         this.field2125 = arg2;
         this.field2116 = arg5;
         if (class20.method148(arg2, arg5, 2048)) {
            this.field2198 = new class436((class112)null, 5126, 3, 0);
         }

         if (class22.method160(arg2, arg5, 2048)) {
            this.field2189 = new class436((class112)null, 5126, 2, 0);
         }

         if (class55.method411(arg5, arg2, (byte)35)) {
            this.field2138 = new class436((class112)null, 5126, 3, 0);
         }

         if (class756.method5544(arg2, arg5, true)) {
            this.field2162 = new class436((class112)null, 5121, 4, 0);
         }

         if (class697.method5125(-21955, arg2, arg5)) {
            this.field2166 = new class124();
         }

         class150 var8 = arg0.field8891;
         this.field2094 = new int[arg1.field2391 + 1];
         int[] var9 = new int[arg1.field2362];
         int var10 = 0;
         class453 var11;
         if (var7) {
            if (arg1.field2398 != null) {
               if (arg1.field2398[var10] != 2) {
                  if (arg1.field2358 != null) {
                     if (arg1.field2358[var10] != -1) {
                        var11 = var8.method1373(65535 & arg1.field2358[var10], (byte)-54);
                        if ((this.field2116 & 64) != 0) {
                           if (!var11.field6934) {
                              if (var11.field6942) {
                                 if (var7) {
                                    var9[this.field2144++] = var10;
                                    ++this.field2094[arg1.field2372[var10]];
                                    ++this.field2094[arg1.field2368[var10]];
                                    ++this.field2094[arg1.field2405[var10]];
                                    ++var10;
                                 } else {
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field2144++] = var10;
                                 ++this.field2094[arg1.field2372[var10]];
                                 ++this.field2094[arg1.field2368[var10]];
                                 ++this.field2094[arg1.field2405[var10]];
                                 ++var10;
                              }
                           } else {
                              var9[this.field2144++] = var10;
                              ++this.field2094[arg1.field2372[var10]];
                              ++this.field2094[arg1.field2368[var10]];
                              ++this.field2094[arg1.field2405[var10]];
                              ++var10;
                           }
                        } else if (var11.field6942) {
                           if (var7) {
                              var9[this.field2144++] = var10;
                              ++this.field2094[arg1.field2372[var10]];
                              ++this.field2094[arg1.field2368[var10]];
                              ++this.field2094[arg1.field2405[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field2144++] = var10;
                           ++this.field2094[arg1.field2372[var10]];
                           ++this.field2094[arg1.field2368[var10]];
                           ++this.field2094[arg1.field2405[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field2144++] = var10;
                        ++this.field2094[arg1.field2372[var10]];
                        ++this.field2094[arg1.field2368[var10]];
                        ++this.field2094[arg1.field2405[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field2144++] = var10;
                     ++this.field2094[arg1.field2372[var10]];
                     ++this.field2094[arg1.field2368[var10]];
                     ++this.field2094[arg1.field2405[var10]];
                     ++var10;
                  }
               } else {
                  ++var10;
               }
            } else if (arg1.field2358 != null) {
               if (arg1.field2358[var10] != -1) {
                  var11 = var8.method1373(65535 & arg1.field2358[var10], (byte)-54);
                  if ((this.field2116 & 64) != 0) {
                     if (!var11.field6934) {
                        if (var11.field6942) {
                           if (var7) {
                              var9[this.field2144++] = var10;
                              ++this.field2094[arg1.field2372[var10]];
                              ++this.field2094[arg1.field2368[var10]];
                              ++this.field2094[arg1.field2405[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field2144++] = var10;
                           ++this.field2094[arg1.field2372[var10]];
                           ++this.field2094[arg1.field2368[var10]];
                           ++this.field2094[arg1.field2405[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field2144++] = var10;
                        ++this.field2094[arg1.field2372[var10]];
                        ++this.field2094[arg1.field2368[var10]];
                        ++this.field2094[arg1.field2405[var10]];
                        ++var10;
                     }
                  } else if (var11.field6942) {
                     if (var7) {
                        var9[this.field2144++] = var10;
                        ++this.field2094[arg1.field2372[var10]];
                        ++this.field2094[arg1.field2368[var10]];
                        ++this.field2094[arg1.field2405[var10]];
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     var9[this.field2144++] = var10;
                     ++this.field2094[arg1.field2372[var10]];
                     ++this.field2094[arg1.field2368[var10]];
                     ++this.field2094[arg1.field2405[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field2144++] = var10;
                  ++this.field2094[arg1.field2372[var10]];
                  ++this.field2094[arg1.field2368[var10]];
                  ++this.field2094[arg1.field2405[var10]];
                  ++var10;
               }
            } else {
               var9[this.field2144++] = var10;
               ++this.field2094[arg1.field2372[var10]];
               ++this.field2094[arg1.field2368[var10]];
               ++this.field2094[arg1.field2405[var10]];
               ++var10;
            }
         }

         while(true) {
            while(var10 < arg1.field2362) {
               if (arg1.field2398 != null) {
                  if (arg1.field2398[var10] != 2) {
                     if (arg1.field2358 != null) {
                        if (arg1.field2358[var10] != -1) {
                           var11 = var8.method1373(65535 & arg1.field2358[var10], (byte)-54);
                           if ((this.field2116 & 64) != 0) {
                              if (!var11.field6934) {
                                 if (var11.field6942) {
                                    if (var7) {
                                       var9[this.field2144++] = var10;
                                       ++this.field2094[arg1.field2372[var10]];
                                       ++this.field2094[arg1.field2368[var10]];
                                       ++this.field2094[arg1.field2405[var10]];
                                       ++var10;
                                    } else {
                                       ++var10;
                                    }
                                 } else {
                                    var9[this.field2144++] = var10;
                                    ++this.field2094[arg1.field2372[var10]];
                                    ++this.field2094[arg1.field2368[var10]];
                                    ++this.field2094[arg1.field2405[var10]];
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field2144++] = var10;
                                 ++this.field2094[arg1.field2372[var10]];
                                 ++this.field2094[arg1.field2368[var10]];
                                 ++this.field2094[arg1.field2405[var10]];
                                 ++var10;
                              }
                           } else if (var11.field6942) {
                              if (var7) {
                                 var9[this.field2144++] = var10;
                                 ++this.field2094[arg1.field2372[var10]];
                                 ++this.field2094[arg1.field2368[var10]];
                                 ++this.field2094[arg1.field2405[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field2144++] = var10;
                              ++this.field2094[arg1.field2372[var10]];
                              ++this.field2094[arg1.field2368[var10]];
                              ++this.field2094[arg1.field2405[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field2144++] = var10;
                           ++this.field2094[arg1.field2372[var10]];
                           ++this.field2094[arg1.field2368[var10]];
                           ++this.field2094[arg1.field2405[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field2144++] = var10;
                        ++this.field2094[arg1.field2372[var10]];
                        ++this.field2094[arg1.field2368[var10]];
                        ++this.field2094[arg1.field2405[var10]];
                        ++var10;
                     }
                  } else {
                     ++var10;
                  }
               } else if (arg1.field2358 != null) {
                  if (arg1.field2358[var10] != -1) {
                     var11 = var8.method1373(65535 & arg1.field2358[var10], (byte)-54);
                     if ((this.field2116 & 64) != 0) {
                        if (!var11.field6934) {
                           if (var11.field6942) {
                              if (var7) {
                                 var9[this.field2144++] = var10;
                                 ++this.field2094[arg1.field2372[var10]];
                                 ++this.field2094[arg1.field2368[var10]];
                                 ++this.field2094[arg1.field2405[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field2144++] = var10;
                              ++this.field2094[arg1.field2372[var10]];
                              ++this.field2094[arg1.field2368[var10]];
                              ++this.field2094[arg1.field2405[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field2144++] = var10;
                           ++this.field2094[arg1.field2372[var10]];
                           ++this.field2094[arg1.field2368[var10]];
                           ++this.field2094[arg1.field2405[var10]];
                           ++var10;
                        }
                     } else if (var11.field6942) {
                        if (var7) {
                           var9[this.field2144++] = var10;
                           ++this.field2094[arg1.field2372[var10]];
                           ++this.field2094[arg1.field2368[var10]];
                           ++this.field2094[arg1.field2405[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field2144++] = var10;
                        ++this.field2094[arg1.field2372[var10]];
                        ++this.field2094[arg1.field2368[var10]];
                        ++this.field2094[arg1.field2405[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field2144++] = var10;
                     ++this.field2094[arg1.field2372[var10]];
                     ++this.field2094[arg1.field2368[var10]];
                     ++this.field2094[arg1.field2405[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field2144++] = var10;
                  ++this.field2094[arg1.field2372[var10]];
                  ++this.field2094[arg1.field2368[var10]];
                  ++this.field2094[arg1.field2405[var10]];
                  ++var10;
               }
            }

            this.field2136 = this.field2144;
            long[] var12 = new long[this.field2144];
            int var10000 = ~(this.field2125 & 256);
            if (!var7) {
               label1117: {
                  boolean var13 = var10000 != -1;
                  int var14 = 0;
                  if (var7) {
                     var10000 = var9[var14];
                  } else if (~this.field2144 >= ~var14) {
                     class563.method4250(var9, var12, 40);
                     this.field2161 = arg1.field2379;
                     this.field2100 = arg1.field2371;
                     this.field2109 = arg1.field2391;
                     this.field2181 = arg1.field2384;
                     this.field2134 = arg1.field2357;
                     this.field2197 = arg1.field2387;
                     var10000 = this.field2109;
                     if (!var7) {
                        break label1117;
                     }
                  } else {
                     var10000 = var9[var14];
                  }

                  while(true) {
                     label3421: {
                        int var15 = var10000;
                        class453 var16 = null;
                        int var17 = 0;
                        byte var18 = 0;
                        byte var19 = 0;
                        byte var20 = 0;
                        if (arg1.field2407 != null) {
                           boolean var21 = false;
                           int var22 = 0;
                           class369 var23;
                           class59 var24;
                           class453 var25;
                           if (var7) {
                              var23 = arg1.field2407[var22];
                              if (~var23.field5731 == ~var15) {
                                 var24 = class396.method3194(0, var23.field5732);
                                 if (var24.field732) {
                                    var21 = true;
                                 }

                                 if (~var24.field731 != 0) {
                                    var25 = var8.method1373(var24.field731, (byte)-54);
                                    if (var25.field6927 == 2) {
                                       this.field2106 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           while(var22 < arg1.field2407.length) {
                              var23 = arg1.field2407[var22];
                              if (~var23.field5731 == ~var15) {
                                 var24 = class396.method3194(0, var23.field5732);
                                 if (var24.field732) {
                                    var21 = true;
                                 }

                                 if (~var24.field731 != 0) {
                                    var25 = var8.method1373(var24.field731, (byte)-54);
                                    if (var25.field6927 == 2) {
                                       this.field2106 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           if (var21) {
                              var12[var14] = Long.MAX_VALUE;
                              --this.field2136;
                              if (!var7) {
                                 ++var14;
                                 break label3421;
                              }
                           }
                        }

                        short var26 = -1;
                        if (arg1.field2358 != null) {
                           var26 = arg1.field2358[var15];
                           if (var26 != -1) {
                              var16 = var8.method1373(var26 & 65535, (byte)-54);
                              if (~(this.field2116 & 64) != -1) {
                                 if (!var16.field6934) {
                                    var19 = var16.field6924;
                                    var20 = var16.field6923;
                                    if (var16.field6926 == 0) {
                                       if (~var16.field6932 != -1) {
                                          this.field2158 = true;
                                          if (var7) {
                                             var16 = null;
                                             var26 = -1;
                                          }
                                       }
                                    } else {
                                       this.field2158 = true;
                                       if (var7) {
                                          var16 = null;
                                          var26 = -1;
                                       }
                                    }
                                 } else {
                                    var16 = null;
                                    var26 = -1;
                                 }
                              } else {
                                 var19 = var16.field6924;
                                 var20 = var16.field6923;
                                 if (var16.field6926 == 0) {
                                    if (~var16.field6932 != -1) {
                                       this.field2158 = true;
                                       if (var7) {
                                          var16 = null;
                                          var26 = -1;
                                       }
                                    }
                                 } else {
                                    this.field2158 = true;
                                    if (var7) {
                                       var16 = null;
                                       var26 = -1;
                                    }
                                 }
                              }
                           }
                        }

                        boolean var27 = arg1.field2402 != null ? (~arg1.field2402[var15] == -1 ? (var16 != null ? var16.field6927 != 0 : false) : true) : (var16 != null ? var16.field6927 != 0 : false);
                        if (!var13) {
                           if (var27 && arg1.field2388 != null) {
                              var17 += arg1.field2388[var15] << 17;
                           }
                        } else if (arg1.field2388 != null) {
                           var17 += arg1.field2388[var15] << 17;
                        }

                        if (var27) {
                           var17 += 65536;
                        }

                        int var28 = (65280 & var19 << 8) + var17;
                        int var29 = ((var26 & 65535) << 16) + var18;
                        int var30 = (255 & var20) + var28;
                        int var31 = (var14 & 65535) + var29;
                        var12[var14] = ((long)var30 << 32) + (long)var31;
                        this.field2106 |= var27;
                        this.field2158 |= var16 != null ? (~var16.field6926 == -1 ? var16.field6932 != 0 : true) : false;
                        ++var14;
                     }

                     if (~this.field2144 >= ~var14) {
                        class563.method4250(var9, var12, 40);
                        this.field2161 = arg1.field2379;
                        this.field2100 = arg1.field2371;
                        this.field2109 = arg1.field2391;
                        this.field2181 = arg1.field2384;
                        this.field2134 = arg1.field2357;
                        this.field2197 = arg1.field2387;
                        var10000 = this.field2109;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var9[var14];
                     }
                  }
               }

               class741[] var32 = new class741[var10000];
               this.field2188 = arg1.field2395;
               this.field2182 = arg1.field2383;
               int var10002;
               int var33;
               int var40;
               int var41;
               int var42;
               class695 var43;
               class386[] var44;
               int var45;
               int var46;
               short var47;
               short var48;
               int var49;
               int var50;
               int var51;
               int var52;
               int var53;
               int var54;
               int var55;
               int var56;
               int var57;
               int var58;
               int var59;
               int var60;
               int var61;
               byte var62;
               class386 var63;
               class741 var64;
               class741 var65;
               class741 var66;
               int var67;
               int var68;
               int var69;
               int var70;
               short var71;
               class453 var72;
               float var73;
               float var74;
               float var75;
               float var76;
               float var77;
               float var78;
               byte var79;
               byte var80;
               int var81;
               byte var82;
               short var83;
               short var84;
               short var85;
               int var86;
               int var87;
               int var88;
               float[] var89;
               byte var90;
               float var91;
               float var92;
               float var93;
               int var94;
               int var95;
               int var96;
               int var97;
               int var98;
               int var99;
               int var100;
               int var101;
               int var102;
               float var103;
               float var104;
               float var105;
               float var106;
               float var107;
               float var108;
               float var109;
               float var110;
               short var111;
               short var112;
               short var113;
               short var114;
               short var115;
               short var116;
               float var117;
               float var118;
               float var119;
               float var120;
               float var121;
               float var122;
               float var123;
               float var124;
               float var125;
               float var126;
               float var127;
               float var128;
               float var129;
               float var130;
               float var131;
               float var132;
               float var133;
               float var134;
               float var135;
               float var136;
               float var137;
               float var138;
               float var139;
               float var140;
               float var141;
               float var142;
               float var143;
               float var144;
               float var145;
               byte var146;
               class386 var147;
               long var148;
               long var150;
               short var152;
               short var153;
               short var154;
               class741 var155;
               class741 var156;
               class741 var157;
               int var158;
               short var159;
               short var160;
               int var161;
               int[] var162;
               int var163;
               int var164;
               int var165;
               int var166;
               byte var169;
               int var170;
               class159 var171;
               byte var172;
               class146 var173;
               if (arg1.field2407 != null) {
                  this.field2130 = arg1.field2407.length;
                  this.field2099 = new class248[this.field2130];
                  this.field2117 = new class249[this.field2130];
                  var33 = 0;
                  if (var7) {
                     var171 = arg1;
                  } else if (this.field2130 <= var33) {
                     var33 = this.field2144 * 3;
                     this.field2140 = new short[this.field2144];
                     this.field2165 = new short[this.field2144];
                     this.field2146 = new byte[var33];
                     var171 = arg1;
                     if (!var7) {
                        if (arg1.field2370 != null) {
                           this.field2150 = new short[this.field2144];
                        }

                        this.field2178 = (short)arg3;
                        this.field2131 = new float[var33];
                        this.field2156 = new short[var33];
                        this.field2137 = new short[var33];
                        this.field2104 = new short[this.field2144];
                        class461.field7017 = new long[var33];
                        this.field2110 = new short[this.field2144];
                        this.field2079 = (short)arg4;
                        this.field2195 = new float[var33];
                        this.field2155 = new byte[this.field2144];
                        this.field2154 = new short[var33];
                        this.field2088 = new short[this.field2144];
                        this.field2080 = new short[var33];
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field2094[var41];
                           this.field2094[var41] = var40;
                           var32[var41] = new class741();
                           var40 += var42;
                           ++var41;
                        }

                        while(true) {
                           if (~var41 <= ~arg1.field2391) {
                              this.field2094[arg1.field2391] = var40;
                              var43 = class740.method5438(arg1, (byte)-84, var9, this.field2144);
                              var44 = new class386[arg1.field2362];
                              var10000 = 0;
                              if (!var7) {
                                 label2124: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field2372[var45];
                                    } else if (var45 >= arg1.field2362) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label2124;
                                       }
                                    } else {
                                       var46 = arg1.field2372[var45];
                                    }

                                    label2127:
                                    while(true) {
                                       var47 = arg1.field2368[var45];
                                       var48 = arg1.field2405[var45];
                                       var49 = this.field2197[var47] + -this.field2197[var46];
                                       var50 = this.field2134[var47] + -this.field2134[var46];
                                       var51 = this.field2100[var47] - this.field2100[var46];
                                       var52 = this.field2197[var48] + -this.field2197[var46];
                                       var53 = this.field2134[var48] + -this.field2134[var46];
                                       var54 = this.field2100[var48] + -this.field2100[var46];
                                       var55 = var50 * var54 - var51 * var53;
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 - var50 * var52;
                                       if (var7) {
                                          var56 >>= 1;
                                          var55 >>= 1;
                                          var57 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                var10000 = ~var56;
                                                if (var7) {
                                                   var57 = var10000 >> -8193;
                                                   continue;
                                                }

                                                if (var10000 >= -8193 && var57 <= 8192 && var55 >= -8192 && var56 >= -8192 && ~var57 <= 8191) {
                                                   var58 = (int)Math.sqrt((double)(var55 * var55 - (-(var56 * var56) + -(var57 * var57))));
                                                   if (~var58 >= -1) {
                                                      var169 = 1;
                                                      var59 = var55 * 256 / var169;
                                                      var60 = var56 * 256 / var169;
                                                      var61 = var57 * 256 / var169;
                                                      var172 = arg1.field2398 == null ? 0 : arg1.field2398[var45];
                                                   } else {
                                                      var59 = var55 * 256 / var58;
                                                      var60 = var56 * 256 / var58;
                                                      var61 = var57 * 256 / var58;
                                                      var172 = arg1.field2398 == null ? 0 : arg1.field2398[var45];
                                                   }

                                                   label3428: {
                                                      var62 = var172;
                                                      if (var62 != 0) {
                                                         if (var62 != 1) {
                                                            ++var45;
                                                            break label3428;
                                                         }

                                                         var63 = var44[var45] = new class386();
                                                         var63.field6080 = var59;
                                                         var63.field6081 = var60;
                                                         var63.field6078 = var61;
                                                         if (!var7) {
                                                            ++var45;
                                                            break label3428;
                                                         }
                                                      }

                                                      var64 = var32[var46];
                                                      ++var64.field11021;
                                                      var64.field11019 += var59;
                                                      var64.field11020 += var61;
                                                      var64.field11023 += var60;
                                                      var65 = var32[var47];
                                                      ++var65.field11021;
                                                      var65.field11023 += var60;
                                                      var65.field11019 += var59;
                                                      var65.field11020 += var61;
                                                      var66 = var32[var48];
                                                      var66.field11019 += var59;
                                                      ++var66.field11021;
                                                      var66.field11020 += var61;
                                                      var66.field11023 += var60;
                                                      ++var45;
                                                   }

                                                   if (var45 >= arg1.field2362) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label2127;
                                                      }
                                                   } else {
                                                      var46 = arg1.field2372[var45];
                                                   }
                                                   continue label2127;
                                                }
                                             }

                                             var56 >>= 1;
                                             var55 >>= 1;
                                             var57 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field2360[var67];
                                    if (arg1.field2378 != null) {
                                       var69 = arg1.field2378[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field2402 != null) {
                                       var70 = arg1.field2402[var67] & 255;
                                       if (var7) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                    if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                       var72 = var8.method1373(65535 & var71, (byte)-54);
                                       if (var72.field6934) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (this.field2144 <= var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field2165[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field2136) {
                                                this.field2076 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (~this.field2136 >= ~var170) {
                                                         this.field2076[var67] = this.field2136;
                                                         class461.field7017 = null;
                                                         this.field2156 = class780.method5670(this.field2156, 1, this.field2196);
                                                         this.field2137 = class780.method5670(this.field2137, 1, this.field2196);
                                                         this.field2154 = class780.method5670(this.field2154, 1, this.field2196);
                                                         this.field2146 = class105.method1010(this.field2146, this.field2196, -86);
                                                         this.field2131 = class100.method973(this.field2196, this.field2131, (byte)118);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field2195 = class100.method973(this.field2196, this.field2195, (byte)80);
                                                            if (arg1.field2376 != null && class614.method4521(arg2, this.field2116, -1)) {
                                                               this.field2107 = arg1.method1425((byte)85, false);
                                                            }

                                                            if (arg1.field2407 != null && class713.method5286(false, arg2, this.field2116)) {
                                                               this.field2083 = arg1.method1424(-15);
                                                            }

                                                            if (arg1.field2364 != null && class65.method497(arg2, -9471, this.field2116)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field2364[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field2144 >= ~var163) {
                                                                     this.field2072 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field2072[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var161 >= var164) {
                                                                              this.field2072[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~this.field2144 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field2364[var9[var165]];
                                                                                 if (var166 >= 0) {
                                                                                    this.field2072[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field2144 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field2364[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field2165[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field2360[var67];
                                    }

                                    if (arg1.field2378 != null) {
                                       var69 = arg1.field2378[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field2402 != null) {
                                       var70 = arg1.field2402[var67] & 255;
                                       if (var7) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                    if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                       var72 = var8.method1373(65535 & var71, (byte)-54);
                                       if (var72.field6934) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (var71 != -1) {
                                       if (var69 != -1) {
                                          var69 &= 255;
                                          var82 = arg1.field2394[var69];
                                          if (~var82 != -1) {
                                             label3446: {
                                                var83 = arg1.field2372[var67];
                                                var84 = arg1.field2368[var67];
                                                var85 = arg1.field2405[var67];
                                                var86 = var43.field10323[var69];
                                                var87 = var43.field10325[var69];
                                                var88 = var43.field10320[var69];
                                                var89 = var43.field10321[var69];
                                                var90 = arg1.field2367[var69];
                                                var91 = (float)arg1.field2381[var69] / 256.0F;
                                                if (var82 != 1) {
                                                   if (~var82 == -3) {
                                                      var92 = (float)arg1.field2396[var69] / 256.0F;
                                                      var93 = (float)arg1.field2401[var69] / 256.0F;
                                                      var94 = arg1.field2387[var84] + -arg1.field2387[var83];
                                                      var95 = arg1.field2357[var84] + -arg1.field2357[var83];
                                                      var96 = arg1.field2371[var84] + -arg1.field2371[var83];
                                                      var97 = arg1.field2387[var85] - arg1.field2387[var83];
                                                      var98 = arg1.field2357[var85] + -arg1.field2357[var83];
                                                      var99 = arg1.field2371[var85] - arg1.field2371[var83];
                                                      var100 = var95 * var99 + -(var96 * var98);
                                                      var101 = var96 * var97 - var94 * var99;
                                                      var102 = var94 * var98 - var95 * var97;
                                                      var103 = 64.0F / (float)arg1.field2380[var69];
                                                      var104 = 64.0F / (float)arg1.field2369[var69];
                                                      var105 = 64.0F / (float)arg1.field2361[var69];
                                                      var106 = (var89[2] * (float)var102 + var89[0] * (float)var100 + var89[1] * (float)var101) / var103;
                                                      var107 = (var89[5] * (float)var102 + var89[3] * (float)var100 + var89[4] * (float)var101) / var104;
                                                      var108 = (var89[8] * (float)var102 + var89[7] * (float)var101 + var89[6] * (float)var100) / var105;
                                                      var81 = class40.method281(var108, var106, 5, var107);
                                                      class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var83], var81, var90, var88, var91, arg1.field2387[var83], arg1.field2357[var83], class766.field11311);
                                                      var74 = class766.field11311[1];
                                                      var73 = class766.field11311[0];
                                                      class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var84], var81, var90, var88, var91, arg1.field2387[var84], arg1.field2357[var84], class766.field11311);
                                                      var76 = class766.field11311[1];
                                                      var75 = class766.field11311[0];
                                                      class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var85], var81, var90, var88, var91, arg1.field2387[var85], arg1.field2357[var85], class766.field11311);
                                                      var78 = class766.field11311[1];
                                                      var77 = class766.field11311[0];
                                                      if (!var7) {
                                                         break label3446;
                                                      }
                                                   }

                                                   if (~var82 != -4) {
                                                      break label3446;
                                                   }

                                                   class464.method3600(arg1.field2387[var83], arg1.field2357[var83], var89, 63, var88, class766.field11311, arg1.field2371[var83], var86, var90, var87, var91);
                                                   var73 = class766.field11311[0];
                                                   var74 = class766.field11311[1];
                                                   class464.method3600(arg1.field2387[var84], arg1.field2357[var84], var89, 71, var88, class766.field11311, arg1.field2371[var84], var86, var90, var87, var91);
                                                   var75 = class766.field11311[0];
                                                   var76 = class766.field11311[1];
                                                   class464.method3600(arg1.field2387[var85], arg1.field2357[var85], var89, 17, var88, class766.field11311, arg1.field2371[var85], var86, var90, var87, var91);
                                                   var77 = class766.field11311[0];
                                                   var78 = class766.field11311[1];
                                                   if ((1 & var90) != 0) {
                                                      if (var76 - var74 > 0.5F) {
                                                         --var76;
                                                         var79 = 1;
                                                         if (var7 && -var76 + var74 > 0.5F) {
                                                            var79 = 2;
                                                            ++var76;
                                                         }
                                                      } else if (-var76 + var74 > 0.5F) {
                                                         var79 = 2;
                                                         ++var76;
                                                      }

                                                      if (!(-var74 + var78 > 0.5F)) {
                                                         if (!(-var78 + var74 > 0.5F)) {
                                                            break label3446;
                                                         }

                                                         ++var78;
                                                         var80 = 2;
                                                         if (!var7) {
                                                            break label3446;
                                                         }
                                                      }

                                                      --var78;
                                                      var80 = 1;
                                                      if (!var7) {
                                                         break label3446;
                                                      }

                                                      if (!(-var73 + var77 > 0.5F)) {
                                                         if (var73 - var77 > 0.5F) {
                                                            var80 = 2;
                                                            ++var77;
                                                            if (var7) {
                                                               --var77;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         --var77;
                                                         var80 = 1;
                                                      }
                                                   } else if (!(-var73 + var77 > 0.5F)) {
                                                      if (var73 - var77 > 0.5F) {
                                                         var80 = 2;
                                                         ++var77;
                                                         if (var7) {
                                                            --var77;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      --var77;
                                                      var80 = 1;
                                                   }

                                                   if (var75 - var73 > 0.5F) {
                                                      var79 = 1;
                                                      --var75;
                                                      if (!var7) {
                                                         break label3446;
                                                      }
                                                   }

                                                   if (!(-var75 + var73 > 0.5F)) {
                                                      break label3446;
                                                   }

                                                   ++var75;
                                                   var79 = 2;
                                                   if (!var7) {
                                                      break label3446;
                                                   }
                                                }

                                                var109 = (float)arg1.field2361[var69] / 1024.0F;
                                                class456.method3568(var86, var89, arg1.field2371[var83], (byte)-126, var87, var90, arg1.field2357[var83], var109, class766.field11311, var88, var91, arg1.field2387[var83]);
                                                var74 = class766.field11311[1];
                                                var73 = class766.field11311[0];
                                                class456.method3568(var86, var89, arg1.field2371[var84], (byte)-112, var87, var90, arg1.field2357[var84], var109, class766.field11311, var88, var91, arg1.field2387[var84]);
                                                var76 = class766.field11311[1];
                                                var75 = class766.field11311[0];
                                                class456.method3568(var86, var89, arg1.field2371[var85], (byte)-119, var87, var90, arg1.field2357[var85], var109, class766.field11311, var88, var91, arg1.field2387[var85]);
                                                var78 = class766.field11311[1];
                                                var77 = class766.field11311[0];
                                                var110 = var109 / 2.0F;
                                                if ((var90 & 1) == 0) {
                                                   if (!(var110 < -var73 + var77)) {
                                                      if (var110 < -var77 + var73) {
                                                         var77 += var109;
                                                         var80 = 2;
                                                         if (var7) {
                                                            var80 = 1;
                                                            var77 -= var109;
                                                         }
                                                      }
                                                   } else {
                                                      var80 = 1;
                                                      var77 -= var109;
                                                   }

                                                   if (var75 - var73 > var110) {
                                                      var79 = 1;
                                                      var75 -= var109;
                                                      if (!var7) {
                                                         break label3446;
                                                      }
                                                   }

                                                   if (!(-var75 + var73 > var110)) {
                                                      break label3446;
                                                   }

                                                   var75 += var109;
                                                   var79 = 2;
                                                   if (!var7) {
                                                      break label3446;
                                                   }

                                                   if (!(var110 < -var74 + var76)) {
                                                      if (var110 < -var76 + var74) {
                                                         var79 = 2;
                                                         var76 += var109;
                                                         if (var7) {
                                                            var79 = 1;
                                                            var76 -= var109;
                                                         }
                                                      }
                                                   } else {
                                                      var79 = 1;
                                                      var76 -= var109;
                                                   }
                                                } else if (!(var110 < -var74 + var76)) {
                                                   if (var110 < -var76 + var74) {
                                                      var79 = 2;
                                                      var76 += var109;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var76 -= var109;
                                                      }
                                                   }
                                                } else {
                                                   var79 = 1;
                                                   var76 -= var109;
                                                }

                                                if (!(var110 < -var74 + var78)) {
                                                   if (var110 < -var78 + var74) {
                                                      var80 = 2;
                                                      var78 += var109;
                                                      if (var7) {
                                                         var78 -= var109;
                                                         var80 = 1;
                                                         if (var7) {
                                                            var111 = arg1.field2372[var67];
                                                            var112 = arg1.field2368[var67];
                                                            var113 = arg1.field2405[var67];
                                                            var114 = arg1.field2406[var69];
                                                            var115 = arg1.field2386[var69];
                                                            var116 = arg1.field2397[var69];
                                                            var117 = (float)arg1.field2387[var114];
                                                            var118 = (float)arg1.field2357[var114];
                                                            var119 = (float)arg1.field2371[var114];
                                                            var120 = (float)arg1.field2387[var115] - var117;
                                                            var121 = (float)arg1.field2357[var115] - var118;
                                                            var122 = (float)arg1.field2371[var115] - var119;
                                                            var123 = (float)arg1.field2387[var116] - var117;
                                                            var124 = (float)arg1.field2357[var116] - var118;
                                                            var125 = (float)arg1.field2371[var116] - var119;
                                                            var126 = (float)arg1.field2387[var111] - var117;
                                                            var127 = (float)arg1.field2357[var111] - var118;
                                                            var128 = (float)arg1.field2371[var111] - var119;
                                                            var129 = (float)arg1.field2387[var112] + -var117;
                                                            var130 = (float)arg1.field2357[var112] + -var118;
                                                            var131 = (float)arg1.field2371[var112] + -var119;
                                                            var132 = (float)arg1.field2387[var113] - var117;
                                                            var133 = (float)arg1.field2357[var113] - var118;
                                                            var134 = (float)arg1.field2371[var113] - var119;
                                                            var135 = var121 * var125 + -(var122 * var124);
                                                            var136 = var122 * var123 + -(var120 * var125);
                                                            var137 = var120 * var124 + -(var121 * var123);
                                                            var138 = var124 * var137 - var125 * var136;
                                                            var139 = var125 * var135 - var123 * var137;
                                                            var140 = var123 * var136 + -(var124 * var135);
                                                            var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                            var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                            var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                            var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                            var142 = var121 * var137 + -(var122 * var136);
                                                            var143 = var120 * var136 + -(var121 * var135);
                                                            var144 = var122 * var135 - var120 * var137;
                                                            var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                                            var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                                            var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                                            var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var77 = 0.0F;
                                                               var74 = 1.0F;
                                                               var76 = 1.0F;
                                                               var80 = 2;
                                                               var75 = 1.0F;
                                                               var78 = 0.0F;
                                                               var73 = 0.0F;
                                                            }
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var78 -= var109;
                                                   var80 = 1;
                                                   if (var7) {
                                                      var111 = arg1.field2372[var67];
                                                      var112 = arg1.field2368[var67];
                                                      var113 = arg1.field2405[var67];
                                                      var114 = arg1.field2406[var69];
                                                      var115 = arg1.field2386[var69];
                                                      var116 = arg1.field2397[var69];
                                                      var117 = (float)arg1.field2387[var114];
                                                      var118 = (float)arg1.field2357[var114];
                                                      var119 = (float)arg1.field2371[var114];
                                                      var120 = (float)arg1.field2387[var115] - var117;
                                                      var121 = (float)arg1.field2357[var115] - var118;
                                                      var122 = (float)arg1.field2371[var115] - var119;
                                                      var123 = (float)arg1.field2387[var116] - var117;
                                                      var124 = (float)arg1.field2357[var116] - var118;
                                                      var125 = (float)arg1.field2371[var116] - var119;
                                                      var126 = (float)arg1.field2387[var111] - var117;
                                                      var127 = (float)arg1.field2357[var111] - var118;
                                                      var128 = (float)arg1.field2371[var111] - var119;
                                                      var129 = (float)arg1.field2387[var112] + -var117;
                                                      var130 = (float)arg1.field2357[var112] + -var118;
                                                      var131 = (float)arg1.field2371[var112] + -var119;
                                                      var132 = (float)arg1.field2387[var113] - var117;
                                                      var133 = (float)arg1.field2357[var113] - var118;
                                                      var134 = (float)arg1.field2371[var113] - var119;
                                                      var135 = var121 * var125 + -(var122 * var124);
                                                      var136 = var122 * var123 + -(var120 * var125);
                                                      var137 = var120 * var124 + -(var121 * var123);
                                                      var138 = var124 * var137 - var125 * var136;
                                                      var139 = var125 * var135 - var123 * var137;
                                                      var140 = var123 * var136 + -(var124 * var135);
                                                      var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                      var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                      var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                      var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                      var142 = var121 * var137 + -(var122 * var136);
                                                      var143 = var120 * var136 + -(var121 * var135);
                                                      var144 = var122 * var135 - var120 * var137;
                                                      var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                                      var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                                      var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                                      var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var77 = 0.0F;
                                                         var74 = 1.0F;
                                                         var76 = 1.0F;
                                                         var80 = 2;
                                                         var75 = 1.0F;
                                                         var78 = 0.0F;
                                                         var73 = 0.0F;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var111 = arg1.field2372[var67];
                                             var112 = arg1.field2368[var67];
                                             var113 = arg1.field2405[var67];
                                             var114 = arg1.field2406[var69];
                                             var115 = arg1.field2386[var69];
                                             var116 = arg1.field2397[var69];
                                             var117 = (float)arg1.field2387[var114];
                                             var118 = (float)arg1.field2357[var114];
                                             var119 = (float)arg1.field2371[var114];
                                             var120 = (float)arg1.field2387[var115] - var117;
                                             var121 = (float)arg1.field2357[var115] - var118;
                                             var122 = (float)arg1.field2371[var115] - var119;
                                             var123 = (float)arg1.field2387[var116] - var117;
                                             var124 = (float)arg1.field2357[var116] - var118;
                                             var125 = (float)arg1.field2371[var116] - var119;
                                             var126 = (float)arg1.field2387[var111] - var117;
                                             var127 = (float)arg1.field2357[var111] - var118;
                                             var128 = (float)arg1.field2371[var111] - var119;
                                             var129 = (float)arg1.field2387[var112] + -var117;
                                             var130 = (float)arg1.field2357[var112] + -var118;
                                             var131 = (float)arg1.field2371[var112] + -var119;
                                             var132 = (float)arg1.field2387[var113] - var117;
                                             var133 = (float)arg1.field2357[var113] - var118;
                                             var134 = (float)arg1.field2371[var113] - var119;
                                             var135 = var121 * var125 + -(var122 * var124);
                                             var136 = var122 * var123 + -(var120 * var125);
                                             var137 = var120 * var124 + -(var121 * var123);
                                             var138 = var124 * var137 - var125 * var136;
                                             var139 = var125 * var135 - var123 * var137;
                                             var140 = var123 * var136 + -(var124 * var135);
                                             var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                             var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                             var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                             var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                             var142 = var121 * var137 + -(var122 * var136);
                                             var143 = var120 * var136 + -(var121 * var135);
                                             var144 = var122 * var135 - var120 * var137;
                                             var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                             var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                             var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                             var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                             if (var7) {
                                                var79 = 1;
                                                var77 = 0.0F;
                                                var74 = 1.0F;
                                                var76 = 1.0F;
                                                var80 = 2;
                                                var75 = 1.0F;
                                                var78 = 0.0F;
                                                var73 = 0.0F;
                                             }
                                          }
                                       } else {
                                          var79 = 1;
                                          var77 = 0.0F;
                                          var74 = 1.0F;
                                          var76 = 1.0F;
                                          var80 = 2;
                                          var75 = 1.0F;
                                          var78 = 0.0F;
                                          var73 = 0.0F;
                                       }
                                    }

                                    if (arg1.field2398 == null) {
                                       var146 = 0;
                                       if (var7) {
                                          var146 = arg1.field2398[var67];
                                       }
                                    } else {
                                       var146 = arg1.field2398[var67];
                                    }

                                    if (var146 != 0) {
                                       if (var146 == 1) {
                                          var147 = var44[var67];
                                          var148 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)((var147.field6080 > 0 ? 1024 : 2048) + (var69 << 2) + (var147.field6081 + 256 << 12) + (var147.field6078 + 256 << 22));
                                          this.field2110[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, var148, arg1, var73, 0, arg1.field2372[var67], var74);
                                          this.field2104[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, (long)var79 + var148, arg1, var75, 0, arg1.field2368[var67], var76);
                                          this.field2088[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, (long)var80 + var148, arg1, var77, 0, arg1.field2405[var67], var78);
                                          if (var7) {
                                             var150 = (long)(var69 << 2) - -((long)(var81 << 24) - -((long)var70) + (long)(var68 << 8) << 32);
                                             var152 = arg1.field2372[var67];
                                             var153 = arg1.field2368[var67];
                                             var154 = arg1.field2405[var67];
                                             var155 = var32[var152];
                                             this.field2110[var46] = this.method1333(8617, var155.field11019, var155.field11023, var155.field11020, var150, arg1, var73, var155.field11021, var152, var74);
                                             var156 = var32[var153];
                                             this.field2104[var46] = this.method1333(8617, var156.field11019, var156.field11023, var156.field11020, (long)var79 + var150, arg1, var75, var156.field11021, var153, var76);
                                             var157 = var32[var154];
                                             this.field2088[var46] = this.method1333(8617, var157.field11019, var157.field11023, var157.field11020, (long)var80 + var150, arg1, var77, var157.field11021, var154, var78);
                                             if (arg1.field2402 != null) {
                                                this.field2155[var46] = arg1.field2402[var67];
                                             }

                                             if (arg1.field2370 != null) {
                                                this.field2150[var46] = arg1.field2370[var67];
                                             }

                                             this.field2140[var46] = arg1.field2360[var67];
                                             this.field2165[var46] = var71;
                                             ++var46;
                                          } else {
                                             if (arg1.field2402 != null) {
                                                this.field2155[var46] = arg1.field2402[var67];
                                             }

                                             if (arg1.field2370 != null) {
                                                this.field2150[var46] = arg1.field2370[var67];
                                             }

                                             this.field2140[var46] = arg1.field2360[var67];
                                             this.field2165[var46] = var71;
                                             ++var46;
                                          }
                                       } else {
                                          if (arg1.field2402 != null) {
                                             this.field2155[var46] = arg1.field2402[var67];
                                          }

                                          if (arg1.field2370 != null) {
                                             this.field2150[var46] = arg1.field2370[var67];
                                          }

                                          this.field2140[var46] = arg1.field2360[var67];
                                          this.field2165[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       var150 = (long)(var69 << 2) - -((long)(var81 << 24) - -((long)var70) + (long)(var68 << 8) << 32);
                                       var152 = arg1.field2372[var67];
                                       var153 = arg1.field2368[var67];
                                       var154 = arg1.field2405[var67];
                                       var155 = var32[var152];
                                       this.field2110[var46] = this.method1333(8617, var155.field11019, var155.field11023, var155.field11020, var150, arg1, var73, var155.field11021, var152, var74);
                                       var156 = var32[var153];
                                       this.field2104[var46] = this.method1333(8617, var156.field11019, var156.field11023, var156.field11020, (long)var79 + var150, arg1, var75, var156.field11021, var153, var76);
                                       var157 = var32[var154];
                                       this.field2088[var46] = this.method1333(8617, var157.field11019, var157.field11023, var157.field11020, (long)var80 + var150, arg1, var77, var157.field11021, var154, var78);
                                       if (arg1.field2402 != null) {
                                          this.field2155[var46] = arg1.field2402[var67];
                                       }

                                       if (arg1.field2370 != null) {
                                          this.field2150[var46] = arg1.field2370[var67];
                                       }

                                       this.field2140[var46] = arg1.field2360[var67];
                                       this.field2165[var46] = var71;
                                       ++var46;
                                    }

                                    if (this.field2144 <= var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field2165[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field2136) {
                                                this.field2076 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (~this.field2136 >= ~var170) {
                                                         this.field2076[var67] = this.field2136;
                                                         class461.field7017 = null;
                                                         this.field2156 = class780.method5670(this.field2156, 1, this.field2196);
                                                         this.field2137 = class780.method5670(this.field2137, 1, this.field2196);
                                                         this.field2154 = class780.method5670(this.field2154, 1, this.field2196);
                                                         this.field2146 = class105.method1010(this.field2146, this.field2196, -86);
                                                         this.field2131 = class100.method973(this.field2196, this.field2131, (byte)118);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field2195 = class100.method973(this.field2196, this.field2195, (byte)80);
                                                            if (arg1.field2376 != null && class614.method4521(arg2, this.field2116, -1)) {
                                                               this.field2107 = arg1.method1425((byte)85, false);
                                                            }

                                                            if (arg1.field2407 != null && class713.method5286(false, arg2, this.field2116)) {
                                                               this.field2083 = arg1.method1424(-15);
                                                            }

                                                            if (arg1.field2364 != null && class65.method497(arg2, -9471, this.field2116)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field2364[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field2144 >= ~var163) {
                                                                     this.field2072 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field2072[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var161 >= var164) {
                                                                              this.field2072[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~this.field2144 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field2364[var9[var165]];
                                                                                 if (var166 >= 0) {
                                                                                    this.field2072[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field2144 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field2364[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field2165[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field2360[var67];
                                    }

                                    if (arg1.field2378 != null) {
                                       var69 = arg1.field2378[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field2402 != null) {
                                       var70 = arg1.field2402[var67] & 255;
                                       if (var7) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                    if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                       var72 = var8.method1373(65535 & var71, (byte)-54);
                                       if (var72.field6934) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field2094[var41];
                           }

                           var42 = var10000;
                           this.field2094[var41] = var40;
                           var32[var41] = new class741();
                           var40 += var42;
                           ++var41;
                        }
                     }
                  } else {
                     var171 = arg1;
                  }
               } else {
                  var33 = this.field2144 * 3;
                  this.field2140 = new short[this.field2144];
                  this.field2165 = new short[this.field2144];
                  this.field2146 = new byte[var33];
                  var171 = arg1;
                  if (!var7) {
                     if (arg1.field2370 != null) {
                        this.field2150 = new short[this.field2144];
                     }

                     this.field2178 = (short)arg3;
                     this.field2131 = new float[var33];
                     this.field2156 = new short[var33];
                     this.field2137 = new short[var33];
                     this.field2104 = new short[this.field2144];
                     class461.field7017 = new long[var33];
                     this.field2110 = new short[this.field2144];
                     this.field2079 = (short)arg4;
                     this.field2195 = new float[var33];
                     this.field2155 = new byte[this.field2144];
                     this.field2154 = new short[var33];
                     this.field2088 = new short[this.field2144];
                     this.field2080 = new short[var33];
                     var40 = 0;
                     var41 = 0;
                     if (var7) {
                        var42 = this.field2094[var41];
                        this.field2094[var41] = var40;
                        var32[var41] = new class741();
                        var40 += var42;
                        ++var41;
                     }

                     while(true) {
                        if (~var41 <= ~arg1.field2391) {
                           this.field2094[arg1.field2391] = var40;
                           var43 = class740.method5438(arg1, (byte)-84, var9, this.field2144);
                           var44 = new class386[arg1.field2362];
                           var10000 = 0;
                           if (!var7) {
                              label1158: {
                                 var45 = 0;
                                 if (var7) {
                                    var46 = arg1.field2372[var45];
                                 } else if (var45 >= arg1.field2362) {
                                    var46 = 0;
                                    if (!var7) {
                                       break label1158;
                                    }
                                 } else {
                                    var46 = arg1.field2372[var45];
                                 }

                                 label1161:
                                 while(true) {
                                    var47 = arg1.field2368[var45];
                                    var48 = arg1.field2405[var45];
                                    var49 = this.field2197[var47] + -this.field2197[var46];
                                    var50 = this.field2134[var47] + -this.field2134[var46];
                                    var51 = this.field2100[var47] - this.field2100[var46];
                                    var52 = this.field2197[var48] + -this.field2197[var46];
                                    var53 = this.field2134[var48] + -this.field2134[var46];
                                    var54 = this.field2100[var48] + -this.field2100[var46];
                                    var55 = var50 * var54 - var51 * var53;
                                    var56 = var51 * var52 - var49 * var54;
                                    var57 = var49 * var53 - var50 * var52;
                                    if (var7) {
                                       var56 >>= 1;
                                       var55 >>= 1;
                                       var57 >>= 1;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (~var55 >= -8193) {
                                             var10000 = ~var56;
                                             if (var7) {
                                                var57 = var10000 >> -8193;
                                                continue;
                                             }

                                             if (var10000 >= -8193 && var57 <= 8192 && var55 >= -8192 && var56 >= -8192 && ~var57 <= 8191) {
                                                var58 = (int)Math.sqrt((double)(var55 * var55 - (-(var56 * var56) + -(var57 * var57))));
                                                if (~var58 >= -1) {
                                                   var169 = 1;
                                                   var59 = var55 * 256 / var169;
                                                   var60 = var56 * 256 / var169;
                                                   var61 = var57 * 256 / var169;
                                                   var172 = arg1.field2398 == null ? 0 : arg1.field2398[var45];
                                                } else {
                                                   var59 = var55 * 256 / var58;
                                                   var60 = var56 * 256 / var58;
                                                   var61 = var57 * 256 / var58;
                                                   var172 = arg1.field2398 == null ? 0 : arg1.field2398[var45];
                                                }

                                                label3471: {
                                                   var62 = var172;
                                                   if (var62 != 0) {
                                                      if (var62 != 1) {
                                                         ++var45;
                                                         break label3471;
                                                      }

                                                      var63 = var44[var45] = new class386();
                                                      var63.field6080 = var59;
                                                      var63.field6081 = var60;
                                                      var63.field6078 = var61;
                                                      if (!var7) {
                                                         ++var45;
                                                         break label3471;
                                                      }
                                                   }

                                                   var64 = var32[var46];
                                                   ++var64.field11021;
                                                   var64.field11019 += var59;
                                                   var64.field11020 += var61;
                                                   var64.field11023 += var60;
                                                   var65 = var32[var47];
                                                   ++var65.field11021;
                                                   var65.field11023 += var60;
                                                   var65.field11019 += var59;
                                                   var65.field11020 += var61;
                                                   var66 = var32[var48];
                                                   var66.field11019 += var59;
                                                   ++var66.field11021;
                                                   var66.field11020 += var61;
                                                   var66.field11023 += var60;
                                                   ++var45;
                                                }

                                                if (var45 >= arg1.field2362) {
                                                   var46 = 0;
                                                   if (!var7) {
                                                      break label1161;
                                                   }
                                                } else {
                                                   var46 = arg1.field2372[var45];
                                                }
                                                continue label1161;
                                             }
                                          }

                                          var56 >>= 1;
                                          var55 >>= 1;
                                          var57 >>= 1;
                                       }
                                    }
                                 }
                              }

                              if (var7) {
                                 var67 = var9[var46];
                                 var68 = 65535 & arg1.field2360[var67];
                                 if (arg1.field2378 != null) {
                                    var69 = arg1.field2378[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field2402 != null) {
                                    var70 = arg1.field2402[var67] & 255;
                                    if (var7) {
                                       var70 = 0;
                                    }
                                 } else {
                                    var70 = 0;
                                 }

                                 var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                 if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                    var72 = var8.method1373(65535 & var71, (byte)-54);
                                    if (var72.field6934) {
                                       var71 = -1;
                                    }
                                 }
                              } else {
                                 if (this.field2144 <= var46) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (!var7) {
                                       if (var7) {
                                          var159 = this.field2165[var158];
                                          if (var68 != var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (~var158 <= ~this.field2136) {
                                             this.field2076 = new int[var67 + 1];
                                             var67 = 0;
                                             var68 = -10000;
                                             var170 = 0;
                                             if (!var7) {
                                                if (var7) {
                                                   var160 = this.field2165[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field2076[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }

                                                while(true) {
                                                   if (~this.field2136 >= ~var170) {
                                                      this.field2076[var67] = this.field2136;
                                                      class461.field7017 = null;
                                                      this.field2156 = class780.method5670(this.field2156, 1, this.field2196);
                                                      this.field2137 = class780.method5670(this.field2137, 1, this.field2196);
                                                      this.field2154 = class780.method5670(this.field2154, 1, this.field2196);
                                                      this.field2146 = class105.method1010(this.field2146, this.field2196, -86);
                                                      this.field2131 = class100.method973(this.field2196, this.field2131, (byte)118);
                                                      var173 = this;
                                                      if (!var7) {
                                                         this.field2195 = class100.method973(this.field2196, this.field2195, (byte)80);
                                                         if (arg1.field2376 != null && class614.method4521(arg2, this.field2116, -1)) {
                                                            this.field2107 = arg1.method1425((byte)85, false);
                                                         }

                                                         if (arg1.field2407 != null && class713.method5286(false, arg2, this.field2116)) {
                                                            this.field2083 = arg1.method1424(-15);
                                                         }

                                                         if (arg1.field2364 != null && class65.method497(arg2, -9471, this.field2116)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7) {
                                                               var164 = arg1.field2364[var9[var163]];
                                                               if (~var164 <= -1) {
                                                                  if (~var161 > ~var164) {
                                                                     var161 = var164;
                                                                  }

                                                                  var10002 = var162[var164]++;
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (~this.field2144 >= ~var163) {
                                                                  this.field2072 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (!var7) {
                                                                     if (var7) {
                                                                        this.field2072[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(var161 >= var164) {
                                                                           this.field2072[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (!var7) {
                                                                           if (!var7 && ~this.field2144 >= ~var165) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field2364[var9[var165]];
                                                                              if (var166 >= 0) {
                                                                                 this.field2072[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(~this.field2144 < ~var165);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field2364[var9[var163]];
                                                               }

                                                               if (~var164 <= -1) {
                                                                  if (~var161 > ~var164) {
                                                                     var161 = var164;
                                                                  }

                                                                  var10002 = var162[var164]++;
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var173 = this;
                                                   }

                                                   var160 = var173.field2165[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field2076[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }
                                             }
                                          } else {
                                             var170 = this.field2165[var158];
                                          }

                                          if (var68 != var170) {
                                             ++var67;
                                             var68 = var170;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field2360[var67];
                                 }

                                 if (arg1.field2378 != null) {
                                    var69 = arg1.field2378[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field2402 != null) {
                                    var70 = arg1.field2402[var67] & 255;
                                    if (var7) {
                                       var70 = 0;
                                    }
                                 } else {
                                    var70 = 0;
                                 }

                                 var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                 if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                    var72 = var8.method1373(65535 & var71, (byte)-54);
                                    if (var72.field6934) {
                                       var71 = -1;
                                    }
                                 }
                              }

                              while(true) {
                                 var73 = 0.0F;
                                 var74 = 0.0F;
                                 var75 = 0.0F;
                                 var76 = 0.0F;
                                 var77 = 0.0F;
                                 var78 = 0.0F;
                                 var79 = 0;
                                 var80 = 0;
                                 var81 = 0;
                                 if (var71 != -1) {
                                    if (var69 != -1) {
                                       var69 &= 255;
                                       var82 = arg1.field2394[var69];
                                       if (~var82 != -1) {
                                          label3489: {
                                             var83 = arg1.field2372[var67];
                                             var84 = arg1.field2368[var67];
                                             var85 = arg1.field2405[var67];
                                             var86 = var43.field10323[var69];
                                             var87 = var43.field10325[var69];
                                             var88 = var43.field10320[var69];
                                             var89 = var43.field10321[var69];
                                             var90 = arg1.field2367[var69];
                                             var91 = (float)arg1.field2381[var69] / 256.0F;
                                             if (var82 != 1) {
                                                if (~var82 == -3) {
                                                   var92 = (float)arg1.field2396[var69] / 256.0F;
                                                   var93 = (float)arg1.field2401[var69] / 256.0F;
                                                   var94 = arg1.field2387[var84] + -arg1.field2387[var83];
                                                   var95 = arg1.field2357[var84] + -arg1.field2357[var83];
                                                   var96 = arg1.field2371[var84] + -arg1.field2371[var83];
                                                   var97 = arg1.field2387[var85] - arg1.field2387[var83];
                                                   var98 = arg1.field2357[var85] + -arg1.field2357[var83];
                                                   var99 = arg1.field2371[var85] - arg1.field2371[var83];
                                                   var100 = var95 * var99 + -(var96 * var98);
                                                   var101 = var96 * var97 - var94 * var99;
                                                   var102 = var94 * var98 - var95 * var97;
                                                   var103 = 64.0F / (float)arg1.field2380[var69];
                                                   var104 = 64.0F / (float)arg1.field2369[var69];
                                                   var105 = 64.0F / (float)arg1.field2361[var69];
                                                   var106 = (var89[2] * (float)var102 + var89[0] * (float)var100 + var89[1] * (float)var101) / var103;
                                                   var107 = (var89[5] * (float)var102 + var89[3] * (float)var100 + var89[4] * (float)var101) / var104;
                                                   var108 = (var89[8] * (float)var102 + var89[7] * (float)var101 + var89[6] * (float)var100) / var105;
                                                   var81 = class40.method281(var108, var106, 5, var107);
                                                   class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var83], var81, var90, var88, var91, arg1.field2387[var83], arg1.field2357[var83], class766.field11311);
                                                   var74 = class766.field11311[1];
                                                   var73 = class766.field11311[0];
                                                   class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var84], var81, var90, var88, var91, arg1.field2387[var84], arg1.field2357[var84], class766.field11311);
                                                   var76 = class766.field11311[1];
                                                   var75 = class766.field11311[0];
                                                   class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var85], var81, var90, var88, var91, arg1.field2387[var85], arg1.field2357[var85], class766.field11311);
                                                   var78 = class766.field11311[1];
                                                   var77 = class766.field11311[0];
                                                   if (!var7) {
                                                      break label3489;
                                                   }
                                                }

                                                if (~var82 != -4) {
                                                   break label3489;
                                                }

                                                class464.method3600(arg1.field2387[var83], arg1.field2357[var83], var89, 63, var88, class766.field11311, arg1.field2371[var83], var86, var90, var87, var91);
                                                var73 = class766.field11311[0];
                                                var74 = class766.field11311[1];
                                                class464.method3600(arg1.field2387[var84], arg1.field2357[var84], var89, 71, var88, class766.field11311, arg1.field2371[var84], var86, var90, var87, var91);
                                                var75 = class766.field11311[0];
                                                var76 = class766.field11311[1];
                                                class464.method3600(arg1.field2387[var85], arg1.field2357[var85], var89, 17, var88, class766.field11311, arg1.field2371[var85], var86, var90, var87, var91);
                                                var77 = class766.field11311[0];
                                                var78 = class766.field11311[1];
                                                if ((1 & var90) != 0) {
                                                   if (var76 - var74 > 0.5F) {
                                                      --var76;
                                                      var79 = 1;
                                                      if (var7 && -var76 + var74 > 0.5F) {
                                                         var79 = 2;
                                                         ++var76;
                                                      }
                                                   } else if (-var76 + var74 > 0.5F) {
                                                      var79 = 2;
                                                      ++var76;
                                                   }

                                                   if (!(-var74 + var78 > 0.5F)) {
                                                      if (!(-var78 + var74 > 0.5F)) {
                                                         break label3489;
                                                      }

                                                      ++var78;
                                                      var80 = 2;
                                                      if (!var7) {
                                                         break label3489;
                                                      }
                                                   }

                                                   --var78;
                                                   var80 = 1;
                                                   if (!var7) {
                                                      break label3489;
                                                   }

                                                   if (!(-var73 + var77 > 0.5F)) {
                                                      if (var73 - var77 > 0.5F) {
                                                         var80 = 2;
                                                         ++var77;
                                                         if (var7) {
                                                            --var77;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      --var77;
                                                      var80 = 1;
                                                   }
                                                } else if (!(-var73 + var77 > 0.5F)) {
                                                   if (var73 - var77 > 0.5F) {
                                                      var80 = 2;
                                                      ++var77;
                                                      if (var7) {
                                                         --var77;
                                                         var80 = 1;
                                                      }
                                                   }
                                                } else {
                                                   --var77;
                                                   var80 = 1;
                                                }

                                                if (var75 - var73 > 0.5F) {
                                                   var79 = 1;
                                                   --var75;
                                                   if (!var7) {
                                                      break label3489;
                                                   }
                                                }

                                                if (!(-var75 + var73 > 0.5F)) {
                                                   break label3489;
                                                }

                                                ++var75;
                                                var79 = 2;
                                                if (!var7) {
                                                   break label3489;
                                                }
                                             }

                                             var109 = (float)arg1.field2361[var69] / 1024.0F;
                                             class456.method3568(var86, var89, arg1.field2371[var83], (byte)-126, var87, var90, arg1.field2357[var83], var109, class766.field11311, var88, var91, arg1.field2387[var83]);
                                             var74 = class766.field11311[1];
                                             var73 = class766.field11311[0];
                                             class456.method3568(var86, var89, arg1.field2371[var84], (byte)-112, var87, var90, arg1.field2357[var84], var109, class766.field11311, var88, var91, arg1.field2387[var84]);
                                             var76 = class766.field11311[1];
                                             var75 = class766.field11311[0];
                                             class456.method3568(var86, var89, arg1.field2371[var85], (byte)-119, var87, var90, arg1.field2357[var85], var109, class766.field11311, var88, var91, arg1.field2387[var85]);
                                             var78 = class766.field11311[1];
                                             var77 = class766.field11311[0];
                                             var110 = var109 / 2.0F;
                                             if ((var90 & 1) == 0) {
                                                if (!(var110 < -var73 + var77)) {
                                                   if (var110 < -var77 + var73) {
                                                      var77 += var109;
                                                      var80 = 2;
                                                      if (var7) {
                                                         var80 = 1;
                                                         var77 -= var109;
                                                      }
                                                   }
                                                } else {
                                                   var80 = 1;
                                                   var77 -= var109;
                                                }

                                                if (var75 - var73 > var110) {
                                                   var79 = 1;
                                                   var75 -= var109;
                                                   if (!var7) {
                                                      break label3489;
                                                   }
                                                }

                                                if (!(-var75 + var73 > var110)) {
                                                   break label3489;
                                                }

                                                var75 += var109;
                                                var79 = 2;
                                                if (!var7) {
                                                   break label3489;
                                                }

                                                if (!(var110 < -var74 + var76)) {
                                                   if (var110 < -var76 + var74) {
                                                      var79 = 2;
                                                      var76 += var109;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var76 -= var109;
                                                      }
                                                   }
                                                } else {
                                                   var79 = 1;
                                                   var76 -= var109;
                                                }
                                             } else if (!(var110 < -var74 + var76)) {
                                                if (var110 < -var76 + var74) {
                                                   var79 = 2;
                                                   var76 += var109;
                                                   if (var7) {
                                                      var79 = 1;
                                                      var76 -= var109;
                                                   }
                                                }
                                             } else {
                                                var79 = 1;
                                                var76 -= var109;
                                             }

                                             if (!(var110 < -var74 + var78)) {
                                                if (var110 < -var78 + var74) {
                                                   var80 = 2;
                                                   var78 += var109;
                                                   if (var7) {
                                                      var78 -= var109;
                                                      var80 = 1;
                                                      if (var7) {
                                                         var111 = arg1.field2372[var67];
                                                         var112 = arg1.field2368[var67];
                                                         var113 = arg1.field2405[var67];
                                                         var114 = arg1.field2406[var69];
                                                         var115 = arg1.field2386[var69];
                                                         var116 = arg1.field2397[var69];
                                                         var117 = (float)arg1.field2387[var114];
                                                         var118 = (float)arg1.field2357[var114];
                                                         var119 = (float)arg1.field2371[var114];
                                                         var120 = (float)arg1.field2387[var115] - var117;
                                                         var121 = (float)arg1.field2357[var115] - var118;
                                                         var122 = (float)arg1.field2371[var115] - var119;
                                                         var123 = (float)arg1.field2387[var116] - var117;
                                                         var124 = (float)arg1.field2357[var116] - var118;
                                                         var125 = (float)arg1.field2371[var116] - var119;
                                                         var126 = (float)arg1.field2387[var111] - var117;
                                                         var127 = (float)arg1.field2357[var111] - var118;
                                                         var128 = (float)arg1.field2371[var111] - var119;
                                                         var129 = (float)arg1.field2387[var112] + -var117;
                                                         var130 = (float)arg1.field2357[var112] + -var118;
                                                         var131 = (float)arg1.field2371[var112] + -var119;
                                                         var132 = (float)arg1.field2387[var113] - var117;
                                                         var133 = (float)arg1.field2357[var113] - var118;
                                                         var134 = (float)arg1.field2371[var113] - var119;
                                                         var135 = var121 * var125 + -(var122 * var124);
                                                         var136 = var122 * var123 + -(var120 * var125);
                                                         var137 = var120 * var124 + -(var121 * var123);
                                                         var138 = var124 * var137 - var125 * var136;
                                                         var139 = var125 * var135 - var123 * var137;
                                                         var140 = var123 * var136 + -(var124 * var135);
                                                         var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                         var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                         var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                         var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                         var142 = var121 * var137 + -(var122 * var136);
                                                         var143 = var120 * var136 + -(var121 * var135);
                                                         var144 = var122 * var135 - var120 * var137;
                                                         var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                                         var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                                         var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                                         var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                                         if (var7) {
                                                            var79 = 1;
                                                            var77 = 0.0F;
                                                            var74 = 1.0F;
                                                            var76 = 1.0F;
                                                            var80 = 2;
                                                            var75 = 1.0F;
                                                            var78 = 0.0F;
                                                            var73 = 0.0F;
                                                         }
                                                      }
                                                   }
                                                }
                                             } else {
                                                var78 -= var109;
                                                var80 = 1;
                                                if (var7) {
                                                   var111 = arg1.field2372[var67];
                                                   var112 = arg1.field2368[var67];
                                                   var113 = arg1.field2405[var67];
                                                   var114 = arg1.field2406[var69];
                                                   var115 = arg1.field2386[var69];
                                                   var116 = arg1.field2397[var69];
                                                   var117 = (float)arg1.field2387[var114];
                                                   var118 = (float)arg1.field2357[var114];
                                                   var119 = (float)arg1.field2371[var114];
                                                   var120 = (float)arg1.field2387[var115] - var117;
                                                   var121 = (float)arg1.field2357[var115] - var118;
                                                   var122 = (float)arg1.field2371[var115] - var119;
                                                   var123 = (float)arg1.field2387[var116] - var117;
                                                   var124 = (float)arg1.field2357[var116] - var118;
                                                   var125 = (float)arg1.field2371[var116] - var119;
                                                   var126 = (float)arg1.field2387[var111] - var117;
                                                   var127 = (float)arg1.field2357[var111] - var118;
                                                   var128 = (float)arg1.field2371[var111] - var119;
                                                   var129 = (float)arg1.field2387[var112] + -var117;
                                                   var130 = (float)arg1.field2357[var112] + -var118;
                                                   var131 = (float)arg1.field2371[var112] + -var119;
                                                   var132 = (float)arg1.field2387[var113] - var117;
                                                   var133 = (float)arg1.field2357[var113] - var118;
                                                   var134 = (float)arg1.field2371[var113] - var119;
                                                   var135 = var121 * var125 + -(var122 * var124);
                                                   var136 = var122 * var123 + -(var120 * var125);
                                                   var137 = var120 * var124 + -(var121 * var123);
                                                   var138 = var124 * var137 - var125 * var136;
                                                   var139 = var125 * var135 - var123 * var137;
                                                   var140 = var123 * var136 + -(var124 * var135);
                                                   var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                   var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                   var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                   var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                   var142 = var121 * var137 + -(var122 * var136);
                                                   var143 = var120 * var136 + -(var121 * var135);
                                                   var144 = var122 * var135 - var120 * var137;
                                                   var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                                   var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                                   var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                                   var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                                   if (var7) {
                                                      var79 = 1;
                                                      var77 = 0.0F;
                                                      var74 = 1.0F;
                                                      var76 = 1.0F;
                                                      var80 = 2;
                                                      var75 = 1.0F;
                                                      var78 = 0.0F;
                                                      var73 = 0.0F;
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var111 = arg1.field2372[var67];
                                          var112 = arg1.field2368[var67];
                                          var113 = arg1.field2405[var67];
                                          var114 = arg1.field2406[var69];
                                          var115 = arg1.field2386[var69];
                                          var116 = arg1.field2397[var69];
                                          var117 = (float)arg1.field2387[var114];
                                          var118 = (float)arg1.field2357[var114];
                                          var119 = (float)arg1.field2371[var114];
                                          var120 = (float)arg1.field2387[var115] - var117;
                                          var121 = (float)arg1.field2357[var115] - var118;
                                          var122 = (float)arg1.field2371[var115] - var119;
                                          var123 = (float)arg1.field2387[var116] - var117;
                                          var124 = (float)arg1.field2357[var116] - var118;
                                          var125 = (float)arg1.field2371[var116] - var119;
                                          var126 = (float)arg1.field2387[var111] - var117;
                                          var127 = (float)arg1.field2357[var111] - var118;
                                          var128 = (float)arg1.field2371[var111] - var119;
                                          var129 = (float)arg1.field2387[var112] + -var117;
                                          var130 = (float)arg1.field2357[var112] + -var118;
                                          var131 = (float)arg1.field2371[var112] + -var119;
                                          var132 = (float)arg1.field2387[var113] - var117;
                                          var133 = (float)arg1.field2357[var113] - var118;
                                          var134 = (float)arg1.field2371[var113] - var119;
                                          var135 = var121 * var125 + -(var122 * var124);
                                          var136 = var122 * var123 + -(var120 * var125);
                                          var137 = var120 * var124 + -(var121 * var123);
                                          var138 = var124 * var137 - var125 * var136;
                                          var139 = var125 * var135 - var123 * var137;
                                          var140 = var123 * var136 + -(var124 * var135);
                                          var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                          var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                          var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                          var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                          var142 = var121 * var137 + -(var122 * var136);
                                          var143 = var120 * var136 + -(var121 * var135);
                                          var144 = var122 * var135 - var120 * var137;
                                          var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                          var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                          var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                          var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                          if (var7) {
                                             var79 = 1;
                                             var77 = 0.0F;
                                             var74 = 1.0F;
                                             var76 = 1.0F;
                                             var80 = 2;
                                             var75 = 1.0F;
                                             var78 = 0.0F;
                                             var73 = 0.0F;
                                          }
                                       }
                                    } else {
                                       var79 = 1;
                                       var77 = 0.0F;
                                       var74 = 1.0F;
                                       var76 = 1.0F;
                                       var80 = 2;
                                       var75 = 1.0F;
                                       var78 = 0.0F;
                                       var73 = 0.0F;
                                    }
                                 }

                                 if (arg1.field2398 == null) {
                                    var146 = 0;
                                    if (var7) {
                                       var146 = arg1.field2398[var67];
                                    }
                                 } else {
                                    var146 = arg1.field2398[var67];
                                 }

                                 if (var146 != 0) {
                                    if (var146 == 1) {
                                       var147 = var44[var67];
                                       var148 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)((var147.field6080 > 0 ? 1024 : 2048) + (var69 << 2) + (var147.field6081 + 256 << 12) + (var147.field6078 + 256 << 22));
                                       this.field2110[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, var148, arg1, var73, 0, arg1.field2372[var67], var74);
                                       this.field2104[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, (long)var79 + var148, arg1, var75, 0, arg1.field2368[var67], var76);
                                       this.field2088[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, (long)var80 + var148, arg1, var77, 0, arg1.field2405[var67], var78);
                                       if (var7) {
                                          var150 = (long)(var69 << 2) - -((long)(var81 << 24) - -((long)var70) + (long)(var68 << 8) << 32);
                                          var152 = arg1.field2372[var67];
                                          var153 = arg1.field2368[var67];
                                          var154 = arg1.field2405[var67];
                                          var155 = var32[var152];
                                          this.field2110[var46] = this.method1333(8617, var155.field11019, var155.field11023, var155.field11020, var150, arg1, var73, var155.field11021, var152, var74);
                                          var156 = var32[var153];
                                          this.field2104[var46] = this.method1333(8617, var156.field11019, var156.field11023, var156.field11020, (long)var79 + var150, arg1, var75, var156.field11021, var153, var76);
                                          var157 = var32[var154];
                                          this.field2088[var46] = this.method1333(8617, var157.field11019, var157.field11023, var157.field11020, (long)var80 + var150, arg1, var77, var157.field11021, var154, var78);
                                          if (arg1.field2402 != null) {
                                             this.field2155[var46] = arg1.field2402[var67];
                                          }

                                          if (arg1.field2370 != null) {
                                             this.field2150[var46] = arg1.field2370[var67];
                                          }

                                          this.field2140[var46] = arg1.field2360[var67];
                                          this.field2165[var46] = var71;
                                          ++var46;
                                       } else {
                                          if (arg1.field2402 != null) {
                                             this.field2155[var46] = arg1.field2402[var67];
                                          }

                                          if (arg1.field2370 != null) {
                                             this.field2150[var46] = arg1.field2370[var67];
                                          }

                                          this.field2140[var46] = arg1.field2360[var67];
                                          this.field2165[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       if (arg1.field2402 != null) {
                                          this.field2155[var46] = arg1.field2402[var67];
                                       }

                                       if (arg1.field2370 != null) {
                                          this.field2150[var46] = arg1.field2370[var67];
                                       }

                                       this.field2140[var46] = arg1.field2360[var67];
                                       this.field2165[var46] = var71;
                                       ++var46;
                                    }
                                 } else {
                                    var150 = (long)(var69 << 2) - -((long)(var81 << 24) - -((long)var70) + (long)(var68 << 8) << 32);
                                    var152 = arg1.field2372[var67];
                                    var153 = arg1.field2368[var67];
                                    var154 = arg1.field2405[var67];
                                    var155 = var32[var152];
                                    this.field2110[var46] = this.method1333(8617, var155.field11019, var155.field11023, var155.field11020, var150, arg1, var73, var155.field11021, var152, var74);
                                    var156 = var32[var153];
                                    this.field2104[var46] = this.method1333(8617, var156.field11019, var156.field11023, var156.field11020, (long)var79 + var150, arg1, var75, var156.field11021, var153, var76);
                                    var157 = var32[var154];
                                    this.field2088[var46] = this.method1333(8617, var157.field11019, var157.field11023, var157.field11020, (long)var80 + var150, arg1, var77, var157.field11021, var154, var78);
                                    if (arg1.field2402 != null) {
                                       this.field2155[var46] = arg1.field2402[var67];
                                    }

                                    if (arg1.field2370 != null) {
                                       this.field2150[var46] = arg1.field2370[var67];
                                    }

                                    this.field2140[var46] = arg1.field2360[var67];
                                    this.field2165[var46] = var71;
                                    ++var46;
                                 }

                                 if (this.field2144 <= var46) {
                                    var67 = 0;
                                    var68 = -10000;
                                    var158 = 0;
                                    if (!var7) {
                                       if (var7) {
                                          var159 = this.field2165[var158];
                                          if (var68 != var159) {
                                             ++var67;
                                             var68 = var159;
                                          }

                                          ++var158;
                                       }

                                       while(true) {
                                          if (~var158 <= ~this.field2136) {
                                             this.field2076 = new int[var67 + 1];
                                             var67 = 0;
                                             var68 = -10000;
                                             var170 = 0;
                                             if (!var7) {
                                                if (var7) {
                                                   var160 = this.field2165[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field2076[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }

                                                while(true) {
                                                   if (~this.field2136 >= ~var170) {
                                                      this.field2076[var67] = this.field2136;
                                                      class461.field7017 = null;
                                                      this.field2156 = class780.method5670(this.field2156, 1, this.field2196);
                                                      this.field2137 = class780.method5670(this.field2137, 1, this.field2196);
                                                      this.field2154 = class780.method5670(this.field2154, 1, this.field2196);
                                                      this.field2146 = class105.method1010(this.field2146, this.field2196, -86);
                                                      this.field2131 = class100.method973(this.field2196, this.field2131, (byte)118);
                                                      var173 = this;
                                                      if (!var7) {
                                                         this.field2195 = class100.method973(this.field2196, this.field2195, (byte)80);
                                                         if (arg1.field2376 != null && class614.method4521(arg2, this.field2116, -1)) {
                                                            this.field2107 = arg1.method1425((byte)85, false);
                                                         }

                                                         if (arg1.field2407 != null && class713.method5286(false, arg2, this.field2116)) {
                                                            this.field2083 = arg1.method1424(-15);
                                                         }

                                                         if (arg1.field2364 != null && class65.method497(arg2, -9471, this.field2116)) {
                                                            var161 = 0;
                                                            var162 = new int[256];
                                                            var163 = 0;
                                                            if (var7) {
                                                               var164 = arg1.field2364[var9[var163]];
                                                               if (~var164 <= -1) {
                                                                  if (~var161 > ~var164) {
                                                                     var161 = var164;
                                                                  }

                                                                  var10002 = var162[var164]++;
                                                               }

                                                               ++var163;
                                                            }

                                                            while(true) {
                                                               if (~this.field2144 >= ~var163) {
                                                                  this.field2072 = new int[var161 + 1][];
                                                                  var164 = 0;
                                                                  if (!var7) {
                                                                     if (var7) {
                                                                        this.field2072[var164] = new int[var162[var164]];
                                                                        var162[var164] = 0;
                                                                        ++var164;
                                                                     }

                                                                     while(true) {
                                                                        while(var161 >= var164) {
                                                                           this.field2072[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        var165 = 0;
                                                                        if (!var7) {
                                                                           if (!var7 && ~this.field2144 >= ~var165) {
                                                                              return;
                                                                           }

                                                                           do {
                                                                              var166 = arg1.field2364[var9[var165]];
                                                                              if (var166 >= 0) {
                                                                                 this.field2072[var166][var162[var166]++] = var165;
                                                                              }

                                                                              ++var165;
                                                                           } while(~this.field2144 < ~var165);

                                                                           return;
                                                                        }

                                                                        ++var164;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var164 = arg1.field2364[var9[var163]];
                                                               }

                                                               if (~var164 <= -1) {
                                                                  if (~var161 > ~var164) {
                                                                     var161 = var164;
                                                                  }

                                                                  var10002 = var162[var164]++;
                                                               }

                                                               ++var163;
                                                            }
                                                         }

                                                         return;
                                                      }
                                                   } else {
                                                      var173 = this;
                                                   }

                                                   var160 = var173.field2165[var170];
                                                   if (~var68 != ~var160) {
                                                      this.field2076[var67++] = var170;
                                                      var68 = var160;
                                                   }

                                                   ++var170;
                                                }
                                             }
                                          } else {
                                             var170 = this.field2165[var158];
                                          }

                                          if (var68 != var170) {
                                             ++var67;
                                             var68 = var170;
                                          }

                                          ++var158;
                                       }
                                    }
                                 } else {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field2360[var67];
                                 }

                                 if (arg1.field2378 != null) {
                                    var69 = arg1.field2378[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field2402 != null) {
                                    var70 = arg1.field2402[var67] & 255;
                                    if (var7) {
                                       var70 = 0;
                                    }
                                 } else {
                                    var70 = 0;
                                 }

                                 var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                 if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                    var72 = var8.method1373(65535 & var71, (byte)-54);
                                    if (var72.field6934) {
                                       var71 = -1;
                                    }
                                 }
                              }
                           }
                        } else {
                           var10000 = this.field2094[var41];
                        }

                        var42 = var10000;
                        this.field2094[var41] = var40;
                        var32[var41] = new class741();
                        var40 += var42;
                        ++var41;
                     }
                  }
               }

               while(true) {
                  class369 var34;
                  class59 var35;
                  int var36;
                  label3079: {
                     var34 = var171.field2407[var33];
                     var35 = class396.method3194(0, var34.field5732);
                     var36 = -1;
                     int var37 = 0;
                     if (var7) {
                        var10000 = ~var34.field5731;
                     } else if (~var37 <= ~this.field2144) {
                        var10000 = ~var36;
                        if (!var7) {
                           break label3079;
                        }
                     } else {
                        var10000 = ~var34.field5731;
                     }

                     label3078:
                     do {
                        while(true) {
                           if (var10000 == ~var9[var37]) {
                              var36 = var37;
                              if (!var7) {
                                 var10000 = ~var37;
                                 break;
                              }

                              ++var37;
                           } else {
                              ++var37;
                           }

                           if (~var37 <= ~this.field2144) {
                              var10000 = ~var36;
                              if (!var7) {
                                 break label3078;
                              }
                           } else {
                              var10000 = ~var34.field5731;
                           }
                        }
                     } while(var7);
                  }

                  if (var10000 == 0) {
                     throw new RuntimeException();
                  }

                  int var38 = 16777215 & class228.field3503[65535 & arg1.field2360[var34.field5731]];
                  int var39 = var38 | -(arg1.field2402 != null ? arg1.field2402[var34.field5731] : 0) + 255 << 24;
                  this.field2117[var33] = new class249(var36, arg1.field2372[var34.field5731], arg1.field2368[var34.field5731], arg1.field2405[var34.field5731], var35.field726, var35.field735, var35.field731, var35.field729, var35.field730, var35.field732, var35.field728, var34.field5741);
                  this.field2099[var33] = new class248(var39);
                  ++var33;
                  if (this.field2130 <= var33) {
                     var33 = this.field2144 * 3;
                     this.field2140 = new short[this.field2144];
                     this.field2165 = new short[this.field2144];
                     this.field2146 = new byte[var33];
                     var171 = arg1;
                     if (!var7) {
                        if (arg1.field2370 != null) {
                           this.field2150 = new short[this.field2144];
                        }

                        this.field2178 = (short)arg3;
                        this.field2131 = new float[var33];
                        this.field2156 = new short[var33];
                        this.field2137 = new short[var33];
                        this.field2104 = new short[this.field2144];
                        class461.field7017 = new long[var33];
                        this.field2110 = new short[this.field2144];
                        this.field2079 = (short)arg4;
                        this.field2195 = new float[var33];
                        this.field2155 = new byte[this.field2144];
                        this.field2154 = new short[var33];
                        this.field2088 = new short[this.field2144];
                        this.field2080 = new short[var33];
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field2094[var41];
                           this.field2094[var41] = var40;
                           var32[var41] = new class741();
                           var40 += var42;
                           ++var41;
                        }

                        while(true) {
                           if (~var41 <= ~arg1.field2391) {
                              this.field2094[arg1.field2391] = var40;
                              var43 = class740.method5438(arg1, (byte)-84, var9, this.field2144);
                              var44 = new class386[arg1.field2362];
                              var10000 = 0;
                              if (!var7) {
                                 label511: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field2372[var45];
                                    } else if (var45 >= arg1.field2362) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label511;
                                       }
                                    } else {
                                       var46 = arg1.field2372[var45];
                                    }

                                    label510:
                                    while(true) {
                                       var47 = arg1.field2368[var45];
                                       var48 = arg1.field2405[var45];
                                       var49 = this.field2197[var47] + -this.field2197[var46];
                                       var50 = this.field2134[var47] + -this.field2134[var46];
                                       var51 = this.field2100[var47] - this.field2100[var46];
                                       var52 = this.field2197[var48] + -this.field2197[var46];
                                       var53 = this.field2134[var48] + -this.field2134[var46];
                                       var54 = this.field2100[var48] + -this.field2100[var46];
                                       var55 = var50 * var54 - var51 * var53;
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 - var50 * var52;
                                       if (var7) {
                                          var56 >>= 1;
                                          var55 >>= 1;
                                          var57 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                var10000 = ~var56;
                                                if (var7) {
                                                   var57 = var10000 >> -8193;
                                                   continue;
                                                }

                                                if (var10000 >= -8193 && var57 <= 8192 && var55 >= -8192 && var56 >= -8192 && ~var57 <= 8191) {
                                                   var58 = (int)Math.sqrt((double)(var55 * var55 - (-(var56 * var56) + -(var57 * var57))));
                                                   if (~var58 >= -1) {
                                                      var169 = 1;
                                                      var59 = var55 * 256 / var169;
                                                      var60 = var56 * 256 / var169;
                                                      var61 = var57 * 256 / var169;
                                                      var172 = arg1.field2398 == null ? 0 : arg1.field2398[var45];
                                                   } else {
                                                      var59 = var55 * 256 / var58;
                                                      var60 = var56 * 256 / var58;
                                                      var61 = var57 * 256 / var58;
                                                      var172 = arg1.field2398 == null ? 0 : arg1.field2398[var45];
                                                   }

                                                   label3515: {
                                                      var62 = var172;
                                                      if (var62 != 0) {
                                                         if (var62 != 1) {
                                                            ++var45;
                                                            break label3515;
                                                         }

                                                         var63 = var44[var45] = new class386();
                                                         var63.field6080 = var59;
                                                         var63.field6081 = var60;
                                                         var63.field6078 = var61;
                                                         if (!var7) {
                                                            ++var45;
                                                            break label3515;
                                                         }
                                                      }

                                                      var64 = var32[var46];
                                                      ++var64.field11021;
                                                      var64.field11019 += var59;
                                                      var64.field11020 += var61;
                                                      var64.field11023 += var60;
                                                      var65 = var32[var47];
                                                      ++var65.field11021;
                                                      var65.field11023 += var60;
                                                      var65.field11019 += var59;
                                                      var65.field11020 += var61;
                                                      var66 = var32[var48];
                                                      var66.field11019 += var59;
                                                      ++var66.field11021;
                                                      var66.field11020 += var61;
                                                      var66.field11023 += var60;
                                                      ++var45;
                                                   }

                                                   if (var45 >= arg1.field2362) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label510;
                                                      }
                                                   } else {
                                                      var46 = arg1.field2372[var45];
                                                   }
                                                   continue label510;
                                                }
                                             }

                                             var56 >>= 1;
                                             var55 >>= 1;
                                             var57 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = 65535 & arg1.field2360[var67];
                                    if (arg1.field2378 != null) {
                                       var69 = arg1.field2378[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field2402 != null) {
                                       var70 = arg1.field2402[var67] & 255;
                                       if (var7) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                    if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                       var72 = var8.method1373(65535 & var71, (byte)-54);
                                       if (var72.field6934) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (this.field2144 <= var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field2165[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field2136) {
                                                this.field2076 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (~this.field2136 >= ~var170) {
                                                         this.field2076[var67] = this.field2136;
                                                         class461.field7017 = null;
                                                         this.field2156 = class780.method5670(this.field2156, 1, this.field2196);
                                                         this.field2137 = class780.method5670(this.field2137, 1, this.field2196);
                                                         this.field2154 = class780.method5670(this.field2154, 1, this.field2196);
                                                         this.field2146 = class105.method1010(this.field2146, this.field2196, -86);
                                                         this.field2131 = class100.method973(this.field2196, this.field2131, (byte)118);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field2195 = class100.method973(this.field2196, this.field2195, (byte)80);
                                                            if (arg1.field2376 != null && class614.method4521(arg2, this.field2116, -1)) {
                                                               this.field2107 = arg1.method1425((byte)85, false);
                                                            }

                                                            if (arg1.field2407 != null && class713.method5286(false, arg2, this.field2116)) {
                                                               this.field2083 = arg1.method1424(-15);
                                                            }

                                                            if (arg1.field2364 != null && class65.method497(arg2, -9471, this.field2116)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field2364[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field2144 >= ~var163) {
                                                                     this.field2072 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field2072[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var161 >= var164) {
                                                                              this.field2072[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~this.field2144 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field2364[var9[var165]];
                                                                                 if (var166 >= 0) {
                                                                                    this.field2072[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field2144 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field2364[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field2165[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field2360[var67];
                                    }

                                    if (arg1.field2378 != null) {
                                       var69 = arg1.field2378[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field2402 != null) {
                                       var70 = arg1.field2402[var67] & 255;
                                       if (var7) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                    if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                       var72 = var8.method1373(65535 & var71, (byte)-54);
                                       if (var72.field6934) {
                                          var71 = -1;
                                       }
                                    }
                                 }

                                 while(true) {
                                    var73 = 0.0F;
                                    var74 = 0.0F;
                                    var75 = 0.0F;
                                    var76 = 0.0F;
                                    var77 = 0.0F;
                                    var78 = 0.0F;
                                    var79 = 0;
                                    var80 = 0;
                                    var81 = 0;
                                    if (var71 != -1) {
                                       if (var69 != -1) {
                                          var69 &= 255;
                                          var82 = arg1.field2394[var69];
                                          if (~var82 != -1) {
                                             label3533: {
                                                var83 = arg1.field2372[var67];
                                                var84 = arg1.field2368[var67];
                                                var85 = arg1.field2405[var67];
                                                var86 = var43.field10323[var69];
                                                var87 = var43.field10325[var69];
                                                var88 = var43.field10320[var69];
                                                var89 = var43.field10321[var69];
                                                var90 = arg1.field2367[var69];
                                                var91 = (float)arg1.field2381[var69] / 256.0F;
                                                if (var82 != 1) {
                                                   if (~var82 == -3) {
                                                      var92 = (float)arg1.field2396[var69] / 256.0F;
                                                      var93 = (float)arg1.field2401[var69] / 256.0F;
                                                      var94 = arg1.field2387[var84] + -arg1.field2387[var83];
                                                      var95 = arg1.field2357[var84] + -arg1.field2357[var83];
                                                      var96 = arg1.field2371[var84] + -arg1.field2371[var83];
                                                      var97 = arg1.field2387[var85] - arg1.field2387[var83];
                                                      var98 = arg1.field2357[var85] + -arg1.field2357[var83];
                                                      var99 = arg1.field2371[var85] - arg1.field2371[var83];
                                                      var100 = var95 * var99 + -(var96 * var98);
                                                      var101 = var96 * var97 - var94 * var99;
                                                      var102 = var94 * var98 - var95 * var97;
                                                      var103 = 64.0F / (float)arg1.field2380[var69];
                                                      var104 = 64.0F / (float)arg1.field2369[var69];
                                                      var105 = 64.0F / (float)arg1.field2361[var69];
                                                      var106 = (var89[2] * (float)var102 + var89[0] * (float)var100 + var89[1] * (float)var101) / var103;
                                                      var107 = (var89[5] * (float)var102 + var89[3] * (float)var100 + var89[4] * (float)var101) / var104;
                                                      var108 = (var89[8] * (float)var102 + var89[7] * (float)var101 + var89[6] * (float)var100) / var105;
                                                      var81 = class40.method281(var108, var106, 5, var107);
                                                      class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var83], var81, var90, var88, var91, arg1.field2387[var83], arg1.field2357[var83], class766.field11311);
                                                      var74 = class766.field11311[1];
                                                      var73 = class766.field11311[0];
                                                      class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var84], var81, var90, var88, var91, arg1.field2387[var84], arg1.field2357[var84], class766.field11311);
                                                      var76 = class766.field11311[1];
                                                      var75 = class766.field11311[0];
                                                      class717.method5311(var93, var92, var87, (byte)-20, var86, var89, arg1.field2371[var85], var81, var90, var88, var91, arg1.field2387[var85], arg1.field2357[var85], class766.field11311);
                                                      var78 = class766.field11311[1];
                                                      var77 = class766.field11311[0];
                                                      if (!var7) {
                                                         break label3533;
                                                      }
                                                   }

                                                   if (~var82 != -4) {
                                                      break label3533;
                                                   }

                                                   class464.method3600(arg1.field2387[var83], arg1.field2357[var83], var89, 63, var88, class766.field11311, arg1.field2371[var83], var86, var90, var87, var91);
                                                   var73 = class766.field11311[0];
                                                   var74 = class766.field11311[1];
                                                   class464.method3600(arg1.field2387[var84], arg1.field2357[var84], var89, 71, var88, class766.field11311, arg1.field2371[var84], var86, var90, var87, var91);
                                                   var75 = class766.field11311[0];
                                                   var76 = class766.field11311[1];
                                                   class464.method3600(arg1.field2387[var85], arg1.field2357[var85], var89, 17, var88, class766.field11311, arg1.field2371[var85], var86, var90, var87, var91);
                                                   var77 = class766.field11311[0];
                                                   var78 = class766.field11311[1];
                                                   if ((1 & var90) != 0) {
                                                      if (var76 - var74 > 0.5F) {
                                                         --var76;
                                                         var79 = 1;
                                                         if (var7 && -var76 + var74 > 0.5F) {
                                                            var79 = 2;
                                                            ++var76;
                                                         }
                                                      } else if (-var76 + var74 > 0.5F) {
                                                         var79 = 2;
                                                         ++var76;
                                                      }

                                                      if (!(-var74 + var78 > 0.5F)) {
                                                         if (!(-var78 + var74 > 0.5F)) {
                                                            break label3533;
                                                         }

                                                         ++var78;
                                                         var80 = 2;
                                                         if (!var7) {
                                                            break label3533;
                                                         }
                                                      }

                                                      --var78;
                                                      var80 = 1;
                                                      if (!var7) {
                                                         break label3533;
                                                      }

                                                      if (!(-var73 + var77 > 0.5F)) {
                                                         if (var73 - var77 > 0.5F) {
                                                            var80 = 2;
                                                            ++var77;
                                                            if (var7) {
                                                               --var77;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         --var77;
                                                         var80 = 1;
                                                      }
                                                   } else if (!(-var73 + var77 > 0.5F)) {
                                                      if (var73 - var77 > 0.5F) {
                                                         var80 = 2;
                                                         ++var77;
                                                         if (var7) {
                                                            --var77;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      --var77;
                                                      var80 = 1;
                                                   }

                                                   if (var75 - var73 > 0.5F) {
                                                      var79 = 1;
                                                      --var75;
                                                      if (!var7) {
                                                         break label3533;
                                                      }
                                                   }

                                                   if (!(-var75 + var73 > 0.5F)) {
                                                      break label3533;
                                                   }

                                                   ++var75;
                                                   var79 = 2;
                                                   if (!var7) {
                                                      break label3533;
                                                   }
                                                }

                                                var109 = (float)arg1.field2361[var69] / 1024.0F;
                                                class456.method3568(var86, var89, arg1.field2371[var83], (byte)-126, var87, var90, arg1.field2357[var83], var109, class766.field11311, var88, var91, arg1.field2387[var83]);
                                                var74 = class766.field11311[1];
                                                var73 = class766.field11311[0];
                                                class456.method3568(var86, var89, arg1.field2371[var84], (byte)-112, var87, var90, arg1.field2357[var84], var109, class766.field11311, var88, var91, arg1.field2387[var84]);
                                                var76 = class766.field11311[1];
                                                var75 = class766.field11311[0];
                                                class456.method3568(var86, var89, arg1.field2371[var85], (byte)-119, var87, var90, arg1.field2357[var85], var109, class766.field11311, var88, var91, arg1.field2387[var85]);
                                                var78 = class766.field11311[1];
                                                var77 = class766.field11311[0];
                                                var110 = var109 / 2.0F;
                                                if ((var90 & 1) == 0) {
                                                   if (!(var110 < -var73 + var77)) {
                                                      if (var110 < -var77 + var73) {
                                                         var77 += var109;
                                                         var80 = 2;
                                                         if (var7) {
                                                            var80 = 1;
                                                            var77 -= var109;
                                                         }
                                                      }
                                                   } else {
                                                      var80 = 1;
                                                      var77 -= var109;
                                                   }

                                                   if (var75 - var73 > var110) {
                                                      var79 = 1;
                                                      var75 -= var109;
                                                      if (!var7) {
                                                         break label3533;
                                                      }
                                                   }

                                                   if (!(-var75 + var73 > var110)) {
                                                      break label3533;
                                                   }

                                                   var75 += var109;
                                                   var79 = 2;
                                                   if (!var7) {
                                                      break label3533;
                                                   }

                                                   if (!(var110 < -var74 + var76)) {
                                                      if (var110 < -var76 + var74) {
                                                         var79 = 2;
                                                         var76 += var109;
                                                         if (var7) {
                                                            var79 = 1;
                                                            var76 -= var109;
                                                         }
                                                      }
                                                   } else {
                                                      var79 = 1;
                                                      var76 -= var109;
                                                   }
                                                } else if (!(var110 < -var74 + var76)) {
                                                   if (var110 < -var76 + var74) {
                                                      var79 = 2;
                                                      var76 += var109;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var76 -= var109;
                                                      }
                                                   }
                                                } else {
                                                   var79 = 1;
                                                   var76 -= var109;
                                                }

                                                if (!(var110 < -var74 + var78)) {
                                                   if (var110 < -var78 + var74) {
                                                      var80 = 2;
                                                      var78 += var109;
                                                      if (var7) {
                                                         var78 -= var109;
                                                         var80 = 1;
                                                         if (var7) {
                                                            var111 = arg1.field2372[var67];
                                                            var112 = arg1.field2368[var67];
                                                            var113 = arg1.field2405[var67];
                                                            var114 = arg1.field2406[var69];
                                                            var115 = arg1.field2386[var69];
                                                            var116 = arg1.field2397[var69];
                                                            var117 = (float)arg1.field2387[var114];
                                                            var118 = (float)arg1.field2357[var114];
                                                            var119 = (float)arg1.field2371[var114];
                                                            var120 = (float)arg1.field2387[var115] - var117;
                                                            var121 = (float)arg1.field2357[var115] - var118;
                                                            var122 = (float)arg1.field2371[var115] - var119;
                                                            var123 = (float)arg1.field2387[var116] - var117;
                                                            var124 = (float)arg1.field2357[var116] - var118;
                                                            var125 = (float)arg1.field2371[var116] - var119;
                                                            var126 = (float)arg1.field2387[var111] - var117;
                                                            var127 = (float)arg1.field2357[var111] - var118;
                                                            var128 = (float)arg1.field2371[var111] - var119;
                                                            var129 = (float)arg1.field2387[var112] + -var117;
                                                            var130 = (float)arg1.field2357[var112] + -var118;
                                                            var131 = (float)arg1.field2371[var112] + -var119;
                                                            var132 = (float)arg1.field2387[var113] - var117;
                                                            var133 = (float)arg1.field2357[var113] - var118;
                                                            var134 = (float)arg1.field2371[var113] - var119;
                                                            var135 = var121 * var125 + -(var122 * var124);
                                                            var136 = var122 * var123 + -(var120 * var125);
                                                            var137 = var120 * var124 + -(var121 * var123);
                                                            var138 = var124 * var137 - var125 * var136;
                                                            var139 = var125 * var135 - var123 * var137;
                                                            var140 = var123 * var136 + -(var124 * var135);
                                                            var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                            var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                            var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                            var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                            var142 = var121 * var137 + -(var122 * var136);
                                                            var143 = var120 * var136 + -(var121 * var135);
                                                            var144 = var122 * var135 - var120 * var137;
                                                            var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                                            var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                                            var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                                            var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                                            if (var7) {
                                                               var79 = 1;
                                                               var77 = 0.0F;
                                                               var74 = 1.0F;
                                                               var76 = 1.0F;
                                                               var80 = 2;
                                                               var75 = 1.0F;
                                                               var78 = 0.0F;
                                                               var73 = 0.0F;
                                                            }
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var78 -= var109;
                                                   var80 = 1;
                                                   if (var7) {
                                                      var111 = arg1.field2372[var67];
                                                      var112 = arg1.field2368[var67];
                                                      var113 = arg1.field2405[var67];
                                                      var114 = arg1.field2406[var69];
                                                      var115 = arg1.field2386[var69];
                                                      var116 = arg1.field2397[var69];
                                                      var117 = (float)arg1.field2387[var114];
                                                      var118 = (float)arg1.field2357[var114];
                                                      var119 = (float)arg1.field2371[var114];
                                                      var120 = (float)arg1.field2387[var115] - var117;
                                                      var121 = (float)arg1.field2357[var115] - var118;
                                                      var122 = (float)arg1.field2371[var115] - var119;
                                                      var123 = (float)arg1.field2387[var116] - var117;
                                                      var124 = (float)arg1.field2357[var116] - var118;
                                                      var125 = (float)arg1.field2371[var116] - var119;
                                                      var126 = (float)arg1.field2387[var111] - var117;
                                                      var127 = (float)arg1.field2357[var111] - var118;
                                                      var128 = (float)arg1.field2371[var111] - var119;
                                                      var129 = (float)arg1.field2387[var112] + -var117;
                                                      var130 = (float)arg1.field2357[var112] + -var118;
                                                      var131 = (float)arg1.field2371[var112] + -var119;
                                                      var132 = (float)arg1.field2387[var113] - var117;
                                                      var133 = (float)arg1.field2357[var113] - var118;
                                                      var134 = (float)arg1.field2371[var113] - var119;
                                                      var135 = var121 * var125 + -(var122 * var124);
                                                      var136 = var122 * var123 + -(var120 * var125);
                                                      var137 = var120 * var124 + -(var121 * var123);
                                                      var138 = var124 * var137 - var125 * var136;
                                                      var139 = var125 * var135 - var123 * var137;
                                                      var140 = var123 * var136 + -(var124 * var135);
                                                      var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                                      var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                                      var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                                      var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                                      var142 = var121 * var137 + -(var122 * var136);
                                                      var143 = var120 * var136 + -(var121 * var135);
                                                      var144 = var122 * var135 - var120 * var137;
                                                      var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                                      var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                                      var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                                      var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                                      if (var7) {
                                                         var79 = 1;
                                                         var77 = 0.0F;
                                                         var74 = 1.0F;
                                                         var76 = 1.0F;
                                                         var80 = 2;
                                                         var75 = 1.0F;
                                                         var78 = 0.0F;
                                                         var73 = 0.0F;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var111 = arg1.field2372[var67];
                                             var112 = arg1.field2368[var67];
                                             var113 = arg1.field2405[var67];
                                             var114 = arg1.field2406[var69];
                                             var115 = arg1.field2386[var69];
                                             var116 = arg1.field2397[var69];
                                             var117 = (float)arg1.field2387[var114];
                                             var118 = (float)arg1.field2357[var114];
                                             var119 = (float)arg1.field2371[var114];
                                             var120 = (float)arg1.field2387[var115] - var117;
                                             var121 = (float)arg1.field2357[var115] - var118;
                                             var122 = (float)arg1.field2371[var115] - var119;
                                             var123 = (float)arg1.field2387[var116] - var117;
                                             var124 = (float)arg1.field2357[var116] - var118;
                                             var125 = (float)arg1.field2371[var116] - var119;
                                             var126 = (float)arg1.field2387[var111] - var117;
                                             var127 = (float)arg1.field2357[var111] - var118;
                                             var128 = (float)arg1.field2371[var111] - var119;
                                             var129 = (float)arg1.field2387[var112] + -var117;
                                             var130 = (float)arg1.field2357[var112] + -var118;
                                             var131 = (float)arg1.field2371[var112] + -var119;
                                             var132 = (float)arg1.field2387[var113] - var117;
                                             var133 = (float)arg1.field2357[var113] - var118;
                                             var134 = (float)arg1.field2371[var113] - var119;
                                             var135 = var121 * var125 + -(var122 * var124);
                                             var136 = var122 * var123 + -(var120 * var125);
                                             var137 = var120 * var124 + -(var121 * var123);
                                             var138 = var124 * var137 - var125 * var136;
                                             var139 = var125 * var135 - var123 * var137;
                                             var140 = var123 * var136 + -(var124 * var135);
                                             var141 = 1.0F / (var122 * var140 + var120 * var138 + var121 * var139);
                                             var77 = (var134 * var140 + var132 * var138 + var133 * var139) * var141;
                                             var73 = (var128 * var140 + var126 * var138 + var127 * var139) * var141;
                                             var75 = (var131 * var140 + var129 * var138 + var130 * var139) * var141;
                                             var142 = var121 * var137 + -(var122 * var136);
                                             var143 = var120 * var136 + -(var121 * var135);
                                             var144 = var122 * var135 - var120 * var137;
                                             var145 = 1.0F / (var125 * var143 + var123 * var142 + var124 * var144);
                                             var78 = (var134 * var143 + var132 * var142 + var133 * var144) * var145;
                                             var76 = (var131 * var143 + var129 * var142 + var130 * var144) * var145;
                                             var74 = (var128 * var143 + var126 * var142 + var127 * var144) * var145;
                                             if (var7) {
                                                var79 = 1;
                                                var77 = 0.0F;
                                                var74 = 1.0F;
                                                var76 = 1.0F;
                                                var80 = 2;
                                                var75 = 1.0F;
                                                var78 = 0.0F;
                                                var73 = 0.0F;
                                             }
                                          }
                                       } else {
                                          var79 = 1;
                                          var77 = 0.0F;
                                          var74 = 1.0F;
                                          var76 = 1.0F;
                                          var80 = 2;
                                          var75 = 1.0F;
                                          var78 = 0.0F;
                                          var73 = 0.0F;
                                       }
                                    }

                                    if (arg1.field2398 == null) {
                                       var146 = 0;
                                       if (var7) {
                                          var146 = arg1.field2398[var67];
                                       }
                                    } else {
                                       var146 = arg1.field2398[var67];
                                    }

                                    if (var146 != 0) {
                                       if (var146 == 1) {
                                          var147 = var44[var67];
                                          var148 = ((long)(var68 << 8) + (long)(var81 << 24) + (long)var70 << 32) + (long)((var147.field6080 > 0 ? 1024 : 2048) + (var69 << 2) + (var147.field6081 + 256 << 12) + (var147.field6078 + 256 << 22));
                                          this.field2110[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, var148, arg1, var73, 0, arg1.field2372[var67], var74);
                                          this.field2104[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, (long)var79 + var148, arg1, var75, 0, arg1.field2368[var67], var76);
                                          this.field2088[var46] = this.method1333(8617, var147.field6080, var147.field6081, var147.field6078, (long)var80 + var148, arg1, var77, 0, arg1.field2405[var67], var78);
                                          if (var7) {
                                             var150 = (long)(var69 << 2) - -((long)(var81 << 24) - -((long)var70) + (long)(var68 << 8) << 32);
                                             var152 = arg1.field2372[var67];
                                             var153 = arg1.field2368[var67];
                                             var154 = arg1.field2405[var67];
                                             var155 = var32[var152];
                                             this.field2110[var46] = this.method1333(8617, var155.field11019, var155.field11023, var155.field11020, var150, arg1, var73, var155.field11021, var152, var74);
                                             var156 = var32[var153];
                                             this.field2104[var46] = this.method1333(8617, var156.field11019, var156.field11023, var156.field11020, (long)var79 + var150, arg1, var75, var156.field11021, var153, var76);
                                             var157 = var32[var154];
                                             this.field2088[var46] = this.method1333(8617, var157.field11019, var157.field11023, var157.field11020, (long)var80 + var150, arg1, var77, var157.field11021, var154, var78);
                                             if (arg1.field2402 != null) {
                                                this.field2155[var46] = arg1.field2402[var67];
                                             }

                                             if (arg1.field2370 != null) {
                                                this.field2150[var46] = arg1.field2370[var67];
                                             }

                                             this.field2140[var46] = arg1.field2360[var67];
                                             this.field2165[var46] = var71;
                                             ++var46;
                                          } else {
                                             if (arg1.field2402 != null) {
                                                this.field2155[var46] = arg1.field2402[var67];
                                             }

                                             if (arg1.field2370 != null) {
                                                this.field2150[var46] = arg1.field2370[var67];
                                             }

                                             this.field2140[var46] = arg1.field2360[var67];
                                             this.field2165[var46] = var71;
                                             ++var46;
                                          }
                                       } else {
                                          if (arg1.field2402 != null) {
                                             this.field2155[var46] = arg1.field2402[var67];
                                          }

                                          if (arg1.field2370 != null) {
                                             this.field2150[var46] = arg1.field2370[var67];
                                          }

                                          this.field2140[var46] = arg1.field2360[var67];
                                          this.field2165[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       var150 = (long)(var69 << 2) - -((long)(var81 << 24) - -((long)var70) + (long)(var68 << 8) << 32);
                                       var152 = arg1.field2372[var67];
                                       var153 = arg1.field2368[var67];
                                       var154 = arg1.field2405[var67];
                                       var155 = var32[var152];
                                       this.field2110[var46] = this.method1333(8617, var155.field11019, var155.field11023, var155.field11020, var150, arg1, var73, var155.field11021, var152, var74);
                                       var156 = var32[var153];
                                       this.field2104[var46] = this.method1333(8617, var156.field11019, var156.field11023, var156.field11020, (long)var79 + var150, arg1, var75, var156.field11021, var153, var76);
                                       var157 = var32[var154];
                                       this.field2088[var46] = this.method1333(8617, var157.field11019, var157.field11023, var157.field11020, (long)var80 + var150, arg1, var77, var157.field11021, var154, var78);
                                       if (arg1.field2402 != null) {
                                          this.field2155[var46] = arg1.field2402[var67];
                                       }

                                       if (arg1.field2370 != null) {
                                          this.field2150[var46] = arg1.field2370[var67];
                                       }

                                       this.field2140[var46] = arg1.field2360[var67];
                                       this.field2165[var46] = var71;
                                       ++var46;
                                    }

                                    if (this.field2144 <= var46) {
                                       var67 = 0;
                                       var68 = -10000;
                                       var158 = 0;
                                       if (!var7) {
                                          if (var7) {
                                             var159 = this.field2165[var158];
                                             if (var68 != var159) {
                                                ++var67;
                                                var68 = var159;
                                             }

                                             ++var158;
                                          }

                                          while(true) {
                                             if (~var158 <= ~this.field2136) {
                                                this.field2076 = new int[var67 + 1];
                                                var67 = 0;
                                                var68 = -10000;
                                                var170 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      var160 = this.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }

                                                   while(true) {
                                                      if (~this.field2136 >= ~var170) {
                                                         this.field2076[var67] = this.field2136;
                                                         class461.field7017 = null;
                                                         this.field2156 = class780.method5670(this.field2156, 1, this.field2196);
                                                         this.field2137 = class780.method5670(this.field2137, 1, this.field2196);
                                                         this.field2154 = class780.method5670(this.field2154, 1, this.field2196);
                                                         this.field2146 = class105.method1010(this.field2146, this.field2196, -86);
                                                         this.field2131 = class100.method973(this.field2196, this.field2131, (byte)118);
                                                         var173 = this;
                                                         if (!var7) {
                                                            this.field2195 = class100.method973(this.field2196, this.field2195, (byte)80);
                                                            if (arg1.field2376 != null && class614.method4521(arg2, this.field2116, -1)) {
                                                               this.field2107 = arg1.method1425((byte)85, false);
                                                            }

                                                            if (arg1.field2407 != null && class713.method5286(false, arg2, this.field2116)) {
                                                               this.field2083 = arg1.method1424(-15);
                                                            }

                                                            if (arg1.field2364 != null && class65.method497(arg2, -9471, this.field2116)) {
                                                               var161 = 0;
                                                               var162 = new int[256];
                                                               var163 = 0;
                                                               if (var7) {
                                                                  var164 = arg1.field2364[var9[var163]];
                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }

                                                               while(true) {
                                                                  if (~this.field2144 >= ~var163) {
                                                                     this.field2072 = new int[var161 + 1][];
                                                                     var164 = 0;
                                                                     if (!var7) {
                                                                        if (var7) {
                                                                           this.field2072[var164] = new int[var162[var164]];
                                                                           var162[var164] = 0;
                                                                           ++var164;
                                                                        }

                                                                        while(true) {
                                                                           while(var161 >= var164) {
                                                                              this.field2072[var164] = new int[var162[var164]];
                                                                              var162[var164] = 0;
                                                                              ++var164;
                                                                           }

                                                                           var165 = 0;
                                                                           if (!var7) {
                                                                              if (!var7 && ~this.field2144 >= ~var165) {
                                                                                 return;
                                                                              }

                                                                              do {
                                                                                 var166 = arg1.field2364[var9[var165]];
                                                                                 if (var166 >= 0) {
                                                                                    this.field2072[var166][var162[var166]++] = var165;
                                                                                 }

                                                                                 ++var165;
                                                                              } while(~this.field2144 < ~var165);

                                                                              return;
                                                                           }

                                                                           ++var164;
                                                                        }
                                                                     }
                                                                  } else {
                                                                     var164 = arg1.field2364[var9[var163]];
                                                                  }

                                                                  if (~var164 <= -1) {
                                                                     if (~var161 > ~var164) {
                                                                        var161 = var164;
                                                                     }

                                                                     var10002 = var162[var164]++;
                                                                  }

                                                                  ++var163;
                                                               }
                                                            }

                                                            return;
                                                         }
                                                      } else {
                                                         var173 = this;
                                                      }

                                                      var160 = var173.field2165[var170];
                                                      if (~var68 != ~var160) {
                                                         this.field2076[var67++] = var170;
                                                         var68 = var160;
                                                      }

                                                      ++var170;
                                                   }
                                                }
                                             } else {
                                                var170 = this.field2165[var158];
                                             }

                                             if (var68 != var170) {
                                                ++var67;
                                                var68 = var170;
                                             }

                                             ++var158;
                                          }
                                       }
                                    } else {
                                       var67 = var9[var46];
                                       var68 = 65535 & arg1.field2360[var67];
                                    }

                                    if (arg1.field2378 != null) {
                                       var69 = arg1.field2378[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field2402 != null) {
                                       var70 = arg1.field2402[var67] & 255;
                                       if (var7) {
                                          var70 = 0;
                                       }
                                    } else {
                                       var70 = 0;
                                    }

                                    var71 = arg1.field2358 == null ? -1 : arg1.field2358[var67];
                                    if (var71 != -1 && ~(64 & this.field2116) != -1) {
                                       var72 = var8.method1373(65535 & var71, (byte)-54);
                                       if (var72.field6934) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field2094[var41];
                           }

                           var42 = var10000;
                           this.field2094[var41] = var40;
                           var32[var41] = new class741();
                           var40 += var42;
                           ++var41;
                        }
                     }
                  } else {
                     var171 = arg1;
                  }
               }
            }

            if (var10000 != -1) {
               var11 = var8.method1373(65535 & arg1.field2358[var10], (byte)-54);
               if ((this.field2116 & 64) != 0) {
                  if (!var11.field6934) {
                     if (var11.field6942) {
                        if (var7) {
                           var9[this.field2144++] = var10;
                           ++this.field2094[arg1.field2372[var10]];
                           ++this.field2094[arg1.field2368[var10]];
                           ++this.field2094[arg1.field2405[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field2144++] = var10;
                        ++this.field2094[arg1.field2372[var10]];
                        ++this.field2094[arg1.field2368[var10]];
                        ++this.field2094[arg1.field2405[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field2144++] = var10;
                     ++this.field2094[arg1.field2372[var10]];
                     ++this.field2094[arg1.field2368[var10]];
                     ++this.field2094[arg1.field2405[var10]];
                     ++var10;
                  }
               } else if (var11.field6942) {
                  if (var7) {
                     var9[this.field2144++] = var10;
                     ++this.field2094[arg1.field2372[var10]];
                     ++this.field2094[arg1.field2368[var10]];
                     ++this.field2094[arg1.field2405[var10]];
                     ++var10;
                  } else {
                     ++var10;
                  }
               } else {
                  var9[this.field2144++] = var10;
                  ++this.field2094[arg1.field2372[var10]];
                  ++this.field2094[arg1.field2368[var10]];
                  ++this.field2094[arg1.field2405[var10]];
                  ++var10;
               }
            } else {
               var9[this.field2144++] = var10;
               ++this.field2094[arg1.field2372[var10]];
               ++this.field2094[arg1.field2368[var10]];
               ++this.field2094[arg1.field2405[var10]];
               ++var10;
            }
         }
      } catch (RuntimeException var168) {
         throw class482.method3757(var168, field2199[30] + (arg0 != null ? field2199[5] : field2199[4]) + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "()[Lqw;",
      line = 4212
   )
   public final class253[] method913() {
      try {
         ++field2095;
         return this.field2188;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[31] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "(B)V",
      line = 4220
   )
   private final void method1327(byte arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2074;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = -32768;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         int var10000;
         if (var2) {
            var10000 = this.field2197[var11];
         } else if (this.field2109 <= var11) {
            this.field2108 = (short)var7;
            this.field2190 = (short)var5;
            this.field2093 = (short)var3;
            this.field2113 = (short)var6;
            this.field2084 = (short)var8;
            this.field2142 = (short)var4;
            this.field2157 = (short)((int)(0.99D + Math.sqrt((double)var9)));
            this.field2102 = (short)((int)(0.99D + Math.sqrt((double)var10)));
            this.field2121 = true;
            var10000 = arg0;
            if (!var2) {
               if (arg0 >= -6) {
                  this.field2099 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this.field2197[var11];
         }

         while(true) {
            int var12 = var10000;
            int var13 = this.field2134[var11];
            int var14 = this.field2100[var11];
            if (var4 > var13) {
               var4 = var13;
            }

            if (~var3 < ~var12) {
               var3 = var12;
            }

            if (~var13 < ~var7) {
               var7 = var13;
            }

            if (var12 > var6) {
               var6 = var12;
            }

            if (~var5 < ~var14) {
               var5 = var14;
            }

            if (~var14 < ~var8) {
               var8 = var14;
            }

            int var15 = var12 * var12 + var14 * var14;
            if (~var9 > ~var15) {
               var9 = var15;
            }

            int var16 = var14 * var14 + var12 * var12 + var13 * var13;
            if (~var16 < ~var10) {
               var10 = var16;
            }

            ++var11;
            if (this.field2109 <= var11) {
               this.field2108 = (short)var7;
               this.field2190 = (short)var5;
               this.field2093 = (short)var3;
               this.field2113 = (short)var6;
               this.field2084 = (short)var8;
               this.field2142 = (short)var4;
               this.field2157 = (short)((int)(0.99D + Math.sqrt((double)var9)));
               this.field2102 = (short)((int)(0.99D + Math.sqrt((double)var10)));
               this.field2121 = true;
               var10000 = arg0;
               if (!var2) {
                  if (arg0 >= -6) {
                     this.field2099 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this.field2197[var11];
            }
         }
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field2199[62] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "r",
      descriptor = "()Z",
      line = 4298
   )
   public final boolean method895() {
      try {
         ++field2103;
         return this.field2158;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "d",
      descriptor = "()V",
      line = 4306
   )
   public final void method903() {
      try {
         ++field2184;
         if (this.field2196 > 0 && this.field2136 > 0) {
            this.method1320(false, -113);
            if ((this.field2145 & 16) == 0 && this.field2166.field1790 == null) {
               this.method1319(false, (byte)-112);
            }

            this.method1329(false);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[51] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "P",
      descriptor = "(IIII)V",
      line = 4323
   )
   public final void method889(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field1786;

      try {
         ++field2087;
         if (~arg0 != -1) {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 != 5) {
                        if (~arg0 != -8) {
                           if (~arg0 != -9) {
                              if (~arg0 != -11) {
                                 if (arg0 == 9) {
                                    int var40 = 0;
                                    if (var5 || ~var40 > ~this.field2130) {
                                       do {
                                          class248 var41 = this.field2099[var40];
                                          var41.field3773 = 16383 & var41.field3773 + arg1;
                                          ++var40;
                                       } while(~var40 > ~this.field2130);

                                    }
                                 }
                              } else {
                                 int var38 = 0;
                                 if (var5 || ~var38 > ~this.field2130) {
                                    do {
                                       class248 var39 = this.field2099[var38];
                                       var39.field3769 = var39.field3769 * arg1 >> 7;
                                       var39.field3772 = var39.field3772 * arg2 >> 7;
                                       ++var38;
                                    } while(~var38 > ~this.field2130);

                                 }
                              }
                           } else {
                              int var36 = 0;
                              if (var5 || ~var36 > ~this.field2130) {
                                 do {
                                    class248 var37 = this.field2099[var36];
                                    var37.field3770 += arg1;
                                    var37.field3777 += arg2;
                                    ++var36;
                                 } while(~var36 > ~this.field2130);

                              }
                           }
                        } else {
                           int var25 = 0;
                           int var33;
                           class249 var34;
                           class248 var35;
                           if (!var5 && ~var25 <= ~this.field2144) {
                              if (this.field2162 != null) {
                                 this.field2162.field6682 = null;
                              }

                              if (this.field2117 != null) {
                                 var33 = 0;
                                 if (var5 || this.field2130 > var33) {
                                    do {
                                       var34 = this.field2117[var33];
                                       var35 = this.field2099[var33];
                                       var35.field3774 = var35.field3774 & -16777216 | class228.field3503[65535 & this.field2140[var34.field3783]] & 16777215;
                                       ++var33;
                                    } while(this.field2130 > var33);
                                 }
                              }

                           } else {
                              do {
                                 int var26 = 65535 & this.field2140[var25];
                                 int var27 = var26 >> 10 & 63;
                                 int var28 = 7 & var26 >> 7;
                                 int var29 = arg2 / 4 + var28;
                                 int var30 = var26 & 127;
                                 int var31 = 63 & arg1 + var27;
                                 if (var29 >= 0) {
                                    if (~var29 < -8) {
                                       var29 = 7;
                                       if (var5) {
                                          var29 = 0;
                                       }
                                    }
                                 } else {
                                    var29 = 0;
                                 }

                                 int var32 = arg3 + var30;
                                 if (var32 >= 0) {
                                    if (~var32 < -128) {
                                       var32 = 127;
                                       if (var5) {
                                          var32 = 0;
                                       }
                                    }
                                 } else {
                                    var32 = 0;
                                 }

                                 this.field2140[var25] = (short)class119.method1087(class119.method1087(var31 << 10, var29 << 7), var32);
                                 ++var25;
                              } while(~var25 > ~this.field2144);

                              if (this.field2162 != null) {
                                 this.field2162.field6682 = null;
                              }

                              if (this.field2117 != null) {
                                 var33 = 0;
                                 if (var5 || this.field2130 > var33) {
                                    do {
                                       var34 = this.field2117[var33];
                                       var35 = this.field2099[var33];
                                       var35.field3774 = var35.field3774 & -16777216 | class228.field3503[65535 & this.field2140[var34.field3783]] & 16777215;
                                       ++var33;
                                    } while(this.field2130 > var33);
                                 }
                              }

                           }
                        }
                     } else {
                        int var20 = 0;
                        int var21;
                        if (var5) {
                           var21 = (this.field2155[var20] & 255) + arg1 * 8;
                           if (~var21 > -1) {
                              var21 = 0;
                              if (var5 && var21 > 255) {
                                 var21 = 255;
                              }
                           } else if (var21 > 255) {
                              var21 = 255;
                           }

                           this.field2155[var20] = (byte)var21;
                           ++var20;
                        }

                        while(var20 < this.field2144) {
                           var21 = (this.field2155[var20] & 255) + arg1 * 8;
                           if (~var21 > -1) {
                              var21 = 0;
                              if (var5 && var21 > 255) {
                                 var21 = 255;
                              }
                           } else if (var21 > 255) {
                              var21 = 255;
                           }

                           this.field2155[var20] = (byte)var21;
                           ++var20;
                        }

                        if (this.field2162 != null) {
                           this.field2162.field6682 = null;
                        }

                        if (this.field2117 != null) {
                           int var22 = 0;
                           if (var5 || ~this.field2130 < ~var22) {
                              do {
                                 class249 var23 = this.field2117[var22];
                                 class248 var24 = this.field2099[var22];
                                 var24.field3774 = -(255 & this.field2155[var23.field3783]) + 255 << 24 | 16777215 & var24.field3774;
                                 ++var22;
                              } while(~this.field2130 < ~var22);
                           }
                        }

                     }
                  } else {
                     int var19 = 0;
                     if (var5) {
                        this.field2197[var19] -= class728.field10876;
                        this.field2134[var19] -= class696.field10343;
                        this.field2100[var19] -= class462.field7021;
                        this.field2197[var19] = this.field2197[var19] * arg1 / 128;
                        this.field2134[var19] = this.field2134[var19] * arg2 / 128;
                        this.field2100[var19] = this.field2100[var19] * arg3 / 128;
                        this.field2197[var19] += class728.field10876;
                        this.field2134[var19] += class696.field10343;
                        this.field2100[var19] += class462.field7021;
                        ++var19;
                     }

                     while(true) {
                        while(~this.field2109 < ~var19) {
                           this.field2197[var19] -= class728.field10876;
                           this.field2134[var19] -= class696.field10343;
                           this.field2100[var19] -= class462.field7021;
                           this.field2197[var19] = this.field2197[var19] * arg1 / 128;
                           this.field2134[var19] = this.field2134[var19] * arg2 / 128;
                           this.field2100[var19] = this.field2100[var19] * arg3 / 128;
                           this.field2197[var19] += class728.field10876;
                           this.field2134[var19] += class696.field10343;
                           this.field2100[var19] += class462.field7021;
                           ++var19;
                        }

                        if (!var5) {
                           return;
                        }

                        ++var19;
                     }
                  }
               } else {
                  int var9 = 0;
                  if (var5) {
                     this.field2197[var9] -= class728.field10876;
                     this.field2134[var9] -= class696.field10343;
                     this.field2100[var9] -= class462.field7021;
                  } else if (~var9 <= ~this.field2109) {
                     if (!var5) {
                        return;
                     }
                  } else {
                     this.field2197[var9] -= class728.field10876;
                     this.field2134[var9] -= class696.field10343;
                     this.field2100[var9] -= class462.field7021;
                  }

                  while(true) {
                     if (arg3 != 0) {
                        int var10 = class83.field1196[arg3];
                        int var11 = class83.field1194[arg3];
                        int var12 = this.field2134[var9] * var10 + 16383 - -(this.field2197[var9] * var11) >> 14;
                        this.field2134[var9] = this.field2134[var9] * var11 + -(this.field2197[var9] * var10) - -16383 >> 14;
                        this.field2197[var9] = var12;
                     }

                     if (arg1 != 0) {
                        int var13 = class83.field1196[arg1];
                        int var14 = class83.field1194[arg1];
                        int var15 = this.field2134[var9] * var14 + -(this.field2100[var9] * var13) + 16383 >> 14;
                        this.field2100[var9] = this.field2134[var9] * var13 + this.field2100[var9] * var14 + 16383 >> 14;
                        this.field2134[var9] = var15;
                     }

                     if (arg2 != 0) {
                        int var16 = class83.field1196[arg2];
                        int var17 = class83.field1194[arg2];
                        int var18 = this.field2197[var9] * var17 + this.field2100[var9] * var16 + 16383 >> 14;
                        this.field2100[var9] = this.field2100[var9] * var17 + 16383 - this.field2197[var9] * var16 >> 14;
                        this.field2197[var9] = var18;
                     }

                     this.field2197[var9] += class728.field10876;
                     this.field2134[var9] += class696.field10343;
                     this.field2100[var9] += class462.field7021;
                     ++var9;
                     if (~var9 <= ~this.field2109) {
                        if (!var5) {
                           return;
                        }
                     } else {
                        this.field2197[var9] -= class728.field10876;
                        this.field2134[var9] -= class696.field10343;
                        this.field2100[var9] -= class462.field7021;
                     }
                  }
               }
            } else {
               int var8 = 0;
               if (var5) {
                  this.field2197[var8] += arg1;
                  this.field2134[var8] += arg2;
                  this.field2100[var8] += arg3;
                  ++var8;
               }

               while(true) {
                  while(~var8 > ~this.field2109) {
                     this.field2197[var8] += arg1;
                     this.field2134[var8] += arg2;
                     this.field2100[var8] += arg3;
                     ++var8;
                  }

                  if (!var5) {
                     return;
                  }

                  ++var8;
               }
            }
         } else {
            class728.field10876 = 0;
            int var6 = 0;
            class462.field7021 = 0;
            class696.field10343 = 0;
            int var7 = 0;
            if (var5) {
               class728.field10876 += this.field2197[var7];
               class696.field10343 += this.field2134[var7];
               ++var6;
               class462.field7021 += this.field2100[var7];
               ++var7;
            }

            while(true) {
               while(~this.field2109 < ~var7) {
                  class728.field10876 += this.field2197[var7];
                  class696.field10343 += this.field2134[var7];
                  ++var6;
                  class462.field7021 += this.field2100[var7];
                  ++var7;
               }

               if (!var5) {
                  if (var6 <= 0) {
                     class462.field7021 = arg3;
                     class728.field10876 = arg1;
                     class696.field10343 = arg2;
                     return;
                  }

                  class728.field10876 = class728.field10876 / var6 + arg1;
                  class696.field10343 = class696.field10343 / var6 + arg2;
                  class462.field7021 = class462.field7021 / var6 + arg3;
                  return;
               }

               class462.field7021 = var6;
               ++var7;
            }
         }
      } catch (RuntimeException var43) {
         throw class482.method3757(var43, field2199[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Lka;IIIZ)V",
      line = 4636
   )
   public final void method877(class91 param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "H",
      descriptor = "(III)V",
      line = 4904
   )
   public final void method867(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         int var5 = 0;
         if (var4) {
            if (~arg0 != -1) {
               this.field2197[var5] += arg0;
            }

            if (~arg1 != -1) {
               this.field2134[var5] += arg1;
            }

            if (~arg2 != -1) {
               this.field2100[var5] += arg2;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field2109) {
               if (~arg0 != -1) {
                  this.field2197[var5] += arg0;
               }

               if (~arg1 != -1) {
                  this.field2134[var5] += arg1;
               }

               if (~arg2 != -1) {
                  this.field2100[var5] += arg2;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            ++field2170;
            if (!var4) {
               if (this.field2198 != null) {
                  this.field2198.field6682 = null;
               }

               this.field2121 = false;
               return;
            }

            this.field2100[var5] += arg2;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2199[52] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "fa",
      descriptor = "()I",
      line = 4946
   )
   public final int method911() {
      try {
         if (!this.field2121) {
            this.method1327((byte)-27);
         }

         ++field2075;
         return this.field2142;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[38] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(ZLkf;IIIII)Z",
      line = 4960
   )
   private final boolean method1328(boolean arg0, class401 arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         ++field2191;
         class167 var9 = (class167)arg1;
         class167 var10 = this.field2187.field9647;
         float var11 = var9.field2531 * var10.field2515 + var9.field2538 * var10.field2534 + var9.field2510 * var10.field2533 + var10.field2510;
         float var12 = var9.field2531 * var10.field2541 + var9.field2538 * var10.field2513 + var9.field2510 * var10.field2530 + var10.field2538;
         class276.field4409 = var9.field2517 * var10.field2515 + var9.field2541 * var10.field2534 + var9.field2515 * var10.field2533;
         class226.field3440 = var9.field2517 * var10.field2517 + var9.field2541 * var10.field2514 + var9.field2515 * var10.field2516;
         class187.field2929 = var9.field2516 * var10.field2517 + var9.field2533 * var10.field2516 + var9.field2530 * var10.field2514;
         float var13 = var9.field2531 * var10.field2517 + var9.field2538 * var10.field2514 + var9.field2510 * var10.field2516 + var10.field2531;
         class396.field6212 = var9.field2514 * var10.field2515 + var9.field2534 * var10.field2533 + var9.field2513 * var10.field2534;
         class115.field1561 = var9.field2516 * var10.field2515 + var9.field2533 * var10.field2533 + var9.field2530 * var10.field2534;
         class13.field161 = var9.field2517 * var10.field2541 + var9.field2541 * var10.field2513 + var9.field2515 * var10.field2530;
         class766.field11309 = var9.field2514 * var10.field2541 + var9.field2534 * var10.field2530 + var9.field2513 * var10.field2513;
         class433.field6664 = var9.field2516 * var10.field2541 + var9.field2533 * var10.field2530 + var9.field2530 * var10.field2513;
         class466.field7090 = var9.field2514 * var10.field2517 + var9.field2534 * var10.field2516 + var9.field2513 * var10.field2514;
         byte var14 = 0;
         float var15 = Float.MAX_VALUE;
         float var16 = -3.4028235E38F;
         float var17 = Float.MAX_VALUE;
         float var18 = -3.4028235E38F;
         int var19 = this.field2187.field9745;
         int var20 = this.field2187.field9717;
         if (!this.field2121) {
            this.method1327((byte)-71);
         }

         int var21 = -this.field2093 + this.field2113 >> 1;
         int var22 = this.field2108 - this.field2142 >> 1;
         int var23 = -this.field2190 + this.field2084 >> 1;
         int var24 = this.field2093 + var21;
         int var25 = this.field2142 - -var22;
         int var26 = this.field2190 + var23;
         int var27 = -(var21 << arg2) + var24;
         int var28 = -(var22 << arg2) + var25;
         int var29 = -(var23 << arg2) + var26;
         int var30 = (var21 << arg2) + var24;
         int var31 = (var22 << arg2) + var25;
         class649.field9351[arg3] = var27;
         int var32 = (var23 << arg2) + var26;
         class361.field5589[0] = var28;
         class265.field4338[0] = var29;
         class649.field9351[1] = var30;
         class361.field5589[1] = var28;
         class649.field9351[2] = var27;
         class265.field4338[1] = var29;
         class361.field5589[2] = var31;
         class649.field9351[3] = var30;
         class265.field4338[2] = var29;
         class361.field5589[3] = var31;
         class265.field4338[3] = var29;
         class649.field9351[4] = var27;
         class361.field5589[4] = var28;
         class649.field9351[5] = var30;
         class265.field4338[4] = var32;
         class361.field5589[5] = var28;
         class649.field9351[6] = var27;
         class265.field4338[5] = var32;
         class361.field5589[6] = var31;
         class649.field9351[7] = var30;
         class265.field4338[6] = var32;
         class361.field5589[7] = var31;
         class265.field4338[7] = var32;
         int var33 = 0;
         float var34;
         float var35;
         float var36;
         float var37;
         float var38;
         float var39;
         float var40;
         float var41;
         if (var8) {
            var34 = (float)class265.field4338[var33];
            var35 = (float)class649.field9351[var33];
            var36 = (float)class361.field5589[var33];
            var37 = class13.field161 * var34 + class766.field11309 * var36 + class433.field6664 * var35 + var12;
            var38 = class226.field3440 * var34 + class466.field7090 * var36 + class187.field2929 * var35 + var13;
            var39 = class276.field4409 * var34 + class396.field6212 * var36 + class115.field1561 * var35 + var11;
            if ((float)this.field2187.field9753 <= var38) {
               if (arg6 > 0) {
                  var38 = (float)arg6;
               }

               var40 = (float)var19 * var39 / var38 + (float)this.field2187.field9728;
               var41 = (float)var20 * var37 / var38 + (float)this.field2187.field9713;
               if (var15 > var40) {
                  var15 = var40;
               }

               if (var16 < var40) {
                  var16 = var40;
               }

               if (var41 > var18) {
                  var18 = var41;
               }

               var14 = 1;
               if (var17 > var41) {
                  var17 = var41;
               }
            }

            ++var33;
         }

         while(true) {
            int var10000;
            if (~var33 <= -9) {
               var10000 = var14;
               if (!var8) {
                  if (var14 != 0 && (float)arg4 > var15 && (float)arg4 < var16 && (float)arg5 > var17 && var18 > (float)arg5) {
                     if (arg0) {
                        return true;
                     }

                     if (this.field2196 > this.field2187.field9763.length) {
                        this.field2187.field9766 = new int[this.field2196];
                        this.field2187.field9763 = new int[this.field2196];
                     }

                     int[] var42;
                     int[] var43;
                     label178: {
                        var42 = this.field2187.field9763;
                        var43 = this.field2187.field9766;
                        int var44 = 0;
                        if (var8) {
                           var10000 = this.field2100[var44];
                        } else if (this.field2109 <= var44) {
                           var10000 = 0;
                           if (!var8) {
                              break label178;
                           }
                        } else {
                           var10000 = this.field2100[var44];
                        }

                        while(true) {
                           label243: {
                              float var45 = (float)var10000;
                              float var46 = (float)this.field2197[var44];
                              float var47 = (float)this.field2134[var44];
                              float var48 = class276.field4409 * var45 + class396.field6212 * var47 + class115.field1561 * var46 + var11;
                              float var49 = class13.field161 * var45 + class766.field11309 * var47 + class433.field6664 * var46 + var12;
                              float var50 = class226.field3440 * var45 + class466.field7090 * var47 + class187.field2929 * var46 + var13;
                              if (!(var50 >= (float)this.field2187.field9753)) {
                                 int var51 = this.field2094[var44];
                                 int var52 = this.field2094[var44 + 1];
                                 int var53 = var51;
                                 if (var8 || ~var51 > ~var52) {
                                    do {
                                       int var54 = this.field2080[var53] + -1;
                                       if (~var54 == 0) {
                                          break;
                                       }

                                       var42[this.field2080[var53] + -1] = -999999;
                                       ++var53;
                                    } while(~var53 > ~var52);
                                 }

                                 if (!var8) {
                                    ++var44;
                                    break label243;
                                 }

                                 if (~arg6 < -1) {
                                    var50 = (float)arg6;
                                 }
                              } else if (~arg6 < -1) {
                                 var50 = (float)arg6;
                              }

                              int var55 = (int)((float)var19 * var48 / var50 + (float)this.field2187.field9728);
                              int var56 = (int)((float)var20 * var49 / var50 + (float)this.field2187.field9713);
                              int var57 = this.field2094[var44];
                              int var58 = this.field2094[var44 + 1];
                              int var59 = var57;
                              if (!var8 && var58 <= var57) {
                                 ++var44;
                              } else {
                                 while(true) {
                                    int var60 = this.field2080[var59] + -1;
                                    if (var60 == -1) {
                                       ++var44;
                                       break;
                                    }

                                    var42[var60] = var55;
                                    var43[var60] = var56;
                                    ++var59;
                                    if (var58 <= var59) {
                                       ++var44;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (this.field2109 <= var44) {
                              var10000 = 0;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              var10000 = this.field2100[var44];
                           }
                        }
                     }

                     int var61 = var10000;
                     if (var8 || ~var61 > ~this.field2144) {
                        do {
                           if (var42[this.field2110[var61]] != -999999) {
                              if (var42[this.field2104[var61]] != -999999) {
                                 if (var42[this.field2088[var61]] == -999999 && !var8) {
                                    ++var61;
                                 } else {
                                    if (this.method1322(var43[this.field2088[var61]], var42[this.field2110[var61]], var42[this.field2104[var61]], arg5, 402650904, var43[this.field2110[var61]], var42[this.field2088[var61]], var43[this.field2104[var61]], arg4)) {
                                       return true;
                                    }

                                    ++var61;
                                 }
                              } else {
                                 ++var61;
                              }
                           } else {
                              ++var61;
                           }
                        } while(~var61 > ~this.field2144);
                     }
                  }

                  return false;
               }
            } else {
               var10000 = class265.field4338[var33];
            }

            var34 = (float)var10000;
            var35 = (float)class649.field9351[var33];
            var36 = (float)class361.field5589[var33];
            var37 = class13.field161 * var34 + class766.field11309 * var36 + class433.field6664 * var35 + var12;
            var38 = class226.field3440 * var34 + class466.field7090 * var36 + class187.field2929 * var35 + var13;
            var39 = class276.field4409 * var34 + class396.field6212 * var36 + class115.field1561 * var35 + var11;
            if ((float)this.field2187.field9753 <= var38) {
               if (arg6 > 0) {
                  var38 = (float)arg6;
               }

               var40 = (float)var19 * var39 / var38 + (float)this.field2187.field9728;
               var41 = (float)var20 * var37 / var38 + (float)this.field2187.field9713;
               if (var15 > var40) {
                  var15 = var40;
               }

               if (var16 < var40) {
                  var16 = var40;
               }

               if (var41 > var18) {
                  var18 = var41;
               }

               var14 = 1;
               if (var17 > var41) {
                  var17 = var41;
               }
            }

            ++var33;
         }
      } catch (RuntimeException var63) {
         throw class482.method3757(var63, field2199[55] + arg0 + ',' + (arg1 != null ? field2199[5] : field2199[4]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "v",
      descriptor = "()V",
      line = 5204
   )
   public final void method904() {
      boolean var1 = client.field1786;

      try {
         int var2 = 0;
         if (var1) {
            this.field2100[var2] = -this.field2100[var2];
            ++var2;
         }

         while(true) {
            while(this.field2109 > var2) {
               this.field2100[var2] = -this.field2100[var2];
               ++var2;
            }

            ++field2128;
            int var3 = 0;
            if (!var1) {
               if (var1) {
                  this.field2154[var3] = (short)(-this.field2154[var3]);
                  ++var3;
               }

               while(true) {
                  while(~var3 > ~this.field2196) {
                     this.field2154[var3] = (short)(-this.field2154[var3]);
                     ++var3;
                  }

                  int var4 = 0;
                  if (!var1) {
                     short var5;
                     if (var1) {
                        var5 = this.field2110[var4];
                        this.field2110[var4] = this.field2088[var4];
                        this.field2088[var4] = var5;
                        ++var4;
                     }

                     while(true) {
                        class146 var10000;
                        if (~this.field2144 >= ~var4) {
                           var10000 = this;
                           if (!var1) {
                              if (this.field2138 == null && this.field2162 != null) {
                                 this.field2162.field6682 = null;
                              }

                              if (this.field2138 != null) {
                                 this.field2138.field6682 = null;
                              }

                              if (this.field2198 != null) {
                                 this.field2198.field6682 = null;
                              }

                              this.field2121 = false;
                              if (this.field2166 != null) {
                                 this.field2166.field1790 = null;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = this;
                        }

                        var5 = var10000.field2110[var4];
                        this.field2110[var4] = this.field2088[var4];
                        this.field2088[var4] = var5;
                        ++var4;
                     }
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2199[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Z)V",
      line = 5256
   )
   private final void method1329(boolean arg0) {
      boolean var2 = client.field1786;

      try {
         ++field2172;
         if (this.field2179) {
            this.field2179 = arg0;
            if (this.field2182 == null && this.field2188 == null && this.field2117 == null && !class546.method4156(this.field2116, -14112, this.field2125)) {
               boolean var3 = false;
               boolean var4 = false;
               boolean var5 = false;
               if (this.field2197 != null && !class224.method1948(this.field2116, this.field2125, 13981)) {
                  label299: {
                     if (this.field2198 != null && this.field2198.field6682 == null) {
                        this.field2179 = true;
                        if (!var2) {
                           break label299;
                        }
                     }

                     var3 = true;
                     if (!this.field2121) {
                        this.method1327((byte)-118);
                     }
                  }
               }

               if (this.field2134 != null && !class57.method423(this.field2116, this.field2125, 458752)) {
                  label307: {
                     if (this.field2198 == null || this.field2198.field6682 != null) {
                        if (!this.field2121) {
                           this.method1327((byte)-44);
                        }

                        var4 = true;
                        if (!var2) {
                           break label307;
                        }
                     }

                     this.field2179 = true;
                  }
               }

               if (this.field2100 != null && !class151.method1378(this.field2125, -122, this.field2116)) {
                  label303: {
                     if (this.field2198 != null && this.field2198.field6682 == null) {
                        this.field2179 = true;
                        if (!var2) {
                           break label303;
                        }
                     }

                     var5 = true;
                     if (!this.field2121) {
                        this.method1327((byte)-128);
                     }
                  }
               }

               if (var5) {
                  this.field2100 = null;
               }

               if (var4) {
                  this.field2134 = null;
               }

               if (var3) {
                  this.field2197 = null;
               }
            }

            if (this.field2080 != null && this.field2197 == null && this.field2134 == null && this.field2100 == null) {
               this.field2080 = null;
               this.field2094 = null;
            }

            if (this.field2146 != null && !class540.method4130(true, this.field2125, this.field2116)) {
               label295: {
                  if (this.field2138 == null) {
                     if (this.field2162 != null && this.field2162.field6682 == null) {
                        this.field2179 = true;
                        if (!var2) {
                           break label295;
                        }
                     }

                     this.field2156 = this.field2137 = this.field2154 = null;
                     this.field2146 = null;
                     if (!var2) {
                        break label295;
                     }
                  }

                  if (this.field2138.field6682 == null) {
                     this.field2179 = true;
                     if (!var2) {
                        break label295;
                     }
                  }

                  this.field2156 = this.field2137 = this.field2154 = null;
                  this.field2146 = null;
               }
            }

            if (this.field2140 != null && !class642.method4685(4, this.field2125, this.field2116)) {
               label228: {
                  if (this.field2162 != null && this.field2162.field6682 == null) {
                     this.field2179 = true;
                     if (!var2) {
                        break label228;
                     }
                  }

                  this.field2140 = null;
               }
            }

            if (this.field2155 != null && !class100.method972(-40, this.field2125, this.field2116)) {
               label308: {
                  if (this.field2162 == null || this.field2162.field6682 != null) {
                     this.field2155 = null;
                     if (!var2) {
                        break label308;
                     }
                  }

                  this.field2179 = true;
               }
            }

            if (this.field2131 != null && !class296.method2489(94, this.field2125, this.field2116)) {
               label210: {
                  if (this.field2189 != null && this.field2189.field6682 == null) {
                     this.field2179 = true;
                     if (!var2) {
                        break label210;
                     }
                  }

                  this.field2131 = this.field2195 = null;
               }
            }

            if (this.field2165 != null && !class65.method496(this.field2116, 119, this.field2125)) {
               label202: {
                  if (this.field2162 != null && this.field2162.field6682 == null) {
                     this.field2179 = true;
                     if (!var2) {
                        break label202;
                     }
                  }

                  this.field2165 = null;
               }
            }

            if (this.field2110 != null && !class801.method5773(this.field2125, -9358, this.field2116)) {
               label310: {
                  if (this.field2166 != null && this.field2166.field1790 == null || this.field2162 != null && this.field2162.field6682 == null) {
                     this.field2179 = true;
                     if (!var2) {
                        break label310;
                     }
                  }

                  this.field2110 = this.field2104 = this.field2088 = null;
               }
            }

            if (this.field2072 != null && !class65.method497(this.field2125, -9471, this.field2116)) {
               this.field2150 = null;
               this.field2072 = null;
            }

            if (this.field2107 != null && !class614.method4521(this.field2125, this.field2116, -1)) {
               this.field2107 = null;
               this.field2161 = null;
            }

            if (this.field2083 != null && !class713.method5286(false, this.field2125, this.field2116)) {
               this.field2083 = null;
            }

            if (this.field2076 != null && ~(2048 & this.field2125) == -1 && ~(262144 & this.field2125) == -1) {
               this.field2076 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2199[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IBSII)I",
      line = 5455
   )
   private final int method1330(int arg0, byte arg1, short arg2, int arg3, int arg4) {
      boolean var6 = client.field1786;

      try {
         ++field2086;
         int var7 = class228.field3503[class115.method1067(arg3, arg0, 123)];
         if (arg2 != -1) {
            class453 var8 = this.field2187.field8891.method1373(65535 & arg2, (byte)-54);
            int var9 = var8.field6930 & 255;
            if (~var9 != -1) {
               label64: {
                  int var10;
                  label62: {
                     if (arg0 < 0) {
                        var10 = 0;
                        if (!var6) {
                           break label62;
                        }
                     }

                     if (arg0 <= 127) {
                        var10 = arg0 * 131586;
                        if (!var6) {
                           break label62;
                        }
                     }

                     var10 = 16777215;
                  }

                  if (var9 != 256) {
                     int var12 = -var9 + 256;
                     var7 = ((16711935 & var10) * var9 - -((16711935 & var7) * var12) & -16711936) + (16711680 & (65280 & var7) * var12 + (65280 & var10) * var9) >> 8;
                     if (!var6) {
                        break label64;
                     }
                  }

                  var7 = var10;
               }
            }

            int var13 = var8.field6935 & 255;
            if (~var13 != -1) {
               var13 += 256;
               int var14 = (var7 >> 16 & 255) * var13;
               if (~var14 < -65536) {
                  var14 = 65535;
               }

               int var15 = ((var7 & 65280) >> 8) * var13;
               if (var15 > 65535) {
                  var15 = 65535;
               }

               int var16 = (255 & var7) * var13;
               if (~var16 < -65536) {
                  var16 = 65535;
               }

               var7 = (var15 & 65280) + (((1359019776 & var14) << 8) - -(var16 >> 8));
            }
         }

         return arg4 > -95 ? 67 : (var7 << 8) - (arg1 & 255) - -255;
      } catch (RuntimeException var18) {
         throw class482.method3757(var18, field2199[33] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "p",
      descriptor = "(IILs;Ls;III)V",
      line = 5528
   )
   public final void method917(int arg0, int arg1, class271 arg2, class271 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field1786;

      try {
         if (!this.field2121) {
            this.method1327((byte)-36);
         }

         ++field2112;
         int var9 = this.field2093 + arg4;
         int var10 = this.field2113 + arg4;
         int var11 = arg6 - -this.field2190;
         int var12 = this.field2084 + arg6;
         if (~arg0 != -2 && ~arg0 != -3 && arg0 != 3 && ~arg0 != -6 || ~var9 <= -1 && ~(arg2.field4377 + var10 >> arg2.field4375) > ~arg2.field4383 && var11 >= 0 && ~arg2.field4379 < ~(arg2.field4377 + var12 >> arg2.field4375)) {
            if (arg0 != 4 && arg0 != 5) {
               int var13 = var9 >> arg2.field4375;
               int var14 = var10 + -1 + arg2.field4377 >> arg2.field4375;
               int var15 = var11 >> arg2.field4375;
               int var16 = arg2.field4377 + var12 + -1 >> arg2.field4375;
               if (~arg5 == ~arg2.method2313(-115, var13, var15) && ~arg2.method2313(-120, var14, var15) == ~arg5 && ~arg2.method2313(-126, var13, var16) == ~arg5 && ~arg2.method2313(-118, var14, var16) == ~arg5) {
                  return;
               }
            } else {
               if (arg3 == null) {
                  return;
               }

               if (var9 < 0 || ~arg3.field4383 >= ~(arg3.field4377 + var10 >> arg3.field4375) || var11 < 0 || arg3.field4377 + var12 >> arg3.field4375 >= arg3.field4379) {
                  return;
               }
            }

            int var33;
            if (arg0 == 1) {
               var33 = 0;
               if (var8 || ~var33 > ~this.field2109) {
                  do {
                     this.field2134[var33] = -arg5 + this.field2134[var33] + arg2.method2312(this.field2197[var33] - -arg4, this.field2100[var33] + arg6, -123);
                     ++var33;
                  } while(~var33 > ~this.field2109);
               }
            } else {
               label262: {
                  if (arg0 == 2) {
                     short var17 = this.field2142;
                     if (~var17 == -1) {
                        return;
                     }

                     int var18 = 0;
                     if (var8 || ~this.field2109 < ~var18) {
                        do {
                           int var19 = (this.field2134[var18] << 16) / var17;
                           if (var19 < arg1) {
                              this.field2134[var18] -= -((-arg5 + arg2.method2312(this.field2197[var18] + arg4, this.field2100[var18] - -arg6, -58)) * (-var19 + arg1) / arg1);
                           }

                           ++var18;
                        } while(~this.field2109 < ~var18);
                     }

                     if (!var8) {
                        break label262;
                     }
                  }

                  if (~arg0 != -4) {
                     if (arg0 == 4) {
                        int var20 = -this.field2142 + this.field2108;
                        int var21 = 0;
                        if (var8) {
                           this.field2134[var21] = var20 + this.field2134[var21] + (arg3.method2312(this.field2197[var21] - -arg4, this.field2100[var21] - -arg6, 58) - arg5);
                           ++var21;
                        }

                        while(true) {
                           while(~this.field2109 < ~var21) {
                              this.field2134[var21] = var20 + this.field2134[var21] + (arg3.method2312(this.field2197[var21] - -arg4, this.field2100[var21] - -arg6, 58) - arg5);
                              ++var21;
                           }

                           if (!var8) {
                              if (!var8) {
                                 break label262;
                              }
                              break;
                           }

                           ++var21;
                        }
                     }

                     if (arg0 != 5) {
                        break label262;
                     }

                     int var22 = -this.field2142 + this.field2108;
                     int var23 = 0;
                     if (var8 || var23 < this.field2109) {
                        do {
                           int var24 = this.field2197[var23] + arg4;
                           int var25 = this.field2100[var23] + arg6;
                           int var26 = arg2.method2312(var24, var25, 116);
                           int var27 = arg3.method2312(var24, var25, 97);
                           int var28 = var26 - arg1 + -var27;
                           this.field2134[var23] = ((this.field2134[var23] << 8) / var22 * var28 >> 8) - arg5 + var26;
                           ++var23;
                        } while(var23 < this.field2109);
                     }

                     if (!var8) {
                        break label262;
                     }
                  }

                  int var29 = (255 & arg1) * 4;
                  int var30 = (255 & arg1 >> 8) * 4;
                  int var31 = (arg1 >> 16 & 255) << 6;
                  int var32 = arg1 >> 24 << 6 & 16320;
                  if (-(var29 >> 1) + arg4 >= 0 && arg2.field4383 << arg2.field4375 > (var29 >> 1) - -arg2.field4377 + arg4 && ~(arg6 - (var30 >> 1)) <= -1 && ~(arg2.field4379 << arg2.field4375) < ~((var30 >> 1) + arg2.field4377 + arg6)) {
                     this.method898(true, arg4, arg2, var29, var32, var30, arg5, var31, arg6);
                     if (!var8) {
                        break label262;
                     }

                     var33 = 0;
                     if (!var8 && ~var33 <= ~this.field2109) {
                        break label262;
                     }

                     while(true) {
                        this.field2134[var33] = -arg5 + this.field2134[var33] + arg2.method2312(this.field2197[var33] - -arg4, this.field2100[var33] + arg6, -123);
                        ++var33;
                        if (~var33 <= ~this.field2109) {
                           break label262;
                        }
                     }
                  }

                  return;
               }
            }

            this.field2121 = false;
            if (this.field2198 != null) {
               this.field2198.field6682 = null;
            }
         }
      } catch (RuntimeException var35) {
         throw class482.method3757(var35, field2199[40] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2199[5] : field2199[4]) + ',' + (arg3 != null ? field2199[5] : field2199[4]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "ma",
      descriptor = "()I",
      line = 5699
   )
   public final int method919() {
      try {
         ++field2089;
         if (!this.field2121) {
            this.method1327((byte)-82);
         }

         return this.field2102;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[17] + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IILkf;ZI)Z",
      line = 5712
   )
   public final boolean method886(int arg0, int arg1, class401 arg2, boolean arg3, int arg4) {
      try {
         ++field2122;
         return this.method1328(arg3, arg2, arg4, 0, arg0, arg1, -1);
      } catch (RuntimeException var7) {
         throw class482.method3757(var7, field2199[46] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2199[5] : field2199[4]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "c",
      descriptor = "(I)V",
      line = 5721
   )
   public static void method1331(int arg0) {
      try {
         field2183 = null;
         if (arg0 != 13692) {
            method1318(18, (byte)102);
         }

         field2073 = null;
         field2177 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field2199[50] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(Loda;I)V",
      line = 5737
   )
   private final void method1332(class630 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!iw",
      name = "a",
      descriptor = "(IIIIJLnga;FIIF)S",
      line = 5840
   )
   private final short method1333(int arg0, int arg1, int arg2, int arg3, long arg4, class159 arg5, float arg6, int arg7, int arg8, float arg9) {
      boolean var12 = client.field1786;

      try {
         ++field2132;
         int var13 = this.field2094[arg8];
         int var14 = this.field2094[arg8 + 1];
         int var15 = 0;
         if (arg0 != 8617) {
            this.method874(36);
         }

         int var16 = var13;
         short var10000;
         if (var12) {
            var10000 = this.field2080[var13];
         } else if (var14 <= var13) {
            this.field2080[var15] = (short)(this.field2196 + 1);
            class461.field7017[var15] = arg4;
            this.field2156[this.field2196] = (short)arg1;
            this.field2137[this.field2196] = (short)arg2;
            this.field2154[this.field2196] = (short)arg3;
            this.field2146[this.field2196] = (byte)arg7;
            this.field2131[this.field2196] = arg6;
            this.field2195[this.field2196] = arg9;
            var10000 = (short)(this.field2196++);
            if (!var12) {
               return var10000;
            }
         } else {
            var10000 = this.field2080[var13];
         }

         do {
            while(true) {
               short var17 = var10000;
               if (var17 == 0) {
                  var15 = var16;
                  if (!var12) {
                     this.field2080[var16] = (short)(this.field2196 + 1);
                     class461.field7017[var16] = arg4;
                     this.field2156[this.field2196] = (short)arg1;
                     this.field2137[this.field2196] = (short)arg2;
                     this.field2154[this.field2196] = (short)arg3;
                     this.field2146[this.field2196] = (byte)arg7;
                     this.field2131[this.field2196] = arg6;
                     this.field2195[this.field2196] = arg9;
                     var10000 = (short)(this.field2196++);
                     break;
                  }

                  if (~class461.field7017[var16] == ~arg4) {
                     return (short)(var17 + -1);
                  }

                  ++var16;
               } else {
                  if (~class461.field7017[var16] == ~arg4) {
                     return (short)(var17 + -1);
                  }

                  ++var16;
               }

               if (var14 <= var16) {
                  this.field2080[var15] = (short)(this.field2196 + 1);
                  class461.field7017[var15] = arg4;
                  this.field2156[this.field2196] = (short)arg1;
                  this.field2137[this.field2196] = (short)arg2;
                  this.field2154[this.field2196] = (short)arg3;
                  this.field2146[this.field2196] = (byte)arg7;
                  this.field2131[this.field2196] = arg6;
                  this.field2195[this.field2196] = arg9;
                  var10000 = (short)(this.field2196++);
                  if (!var12) {
                     return var10000;
                  }
               } else {
                  var10000 = this.field2080[var16];
               }
            }
         } while(var12);

         return var10000;
      } catch (RuntimeException var19) {
         throw class482.method3757(var19, field2199[12] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field2199[5] : field2199[4]) + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1334(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1335(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 104;
            break;
         case 2:
            var10005 = 96;
            break;
         case 3:
            var10005 = 59;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
