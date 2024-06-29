import jaclib.memory.Buffer;
import jaclib.memory.Stream;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nw")
public class class610 extends class495 {
   @OriginalMember(
      owner = "client!nw",
      name = "Zb",
      descriptor = "[I"
   )
   private int[] field8857;
   @OriginalMember(
      owner = "client!nw",
      name = "M",
      descriptor = "I"
   )
   private int field8851;
   @OriginalMember(
      owner = "client!nw",
      name = "gc",
      descriptor = "I"
   )
   private int field8815;
   @OriginalMember(
      owner = "client!nw",
      name = "v",
      descriptor = "I"
   )
   private int field8863;
   @OriginalMember(
      owner = "client!nw",
      name = "ec",
      descriptor = "I"
   )
   private int field8840;
   @OriginalMember(
      owner = "client!nw",
      name = "yc",
      descriptor = "Z"
   )
   private boolean field8832;
   @OriginalMember(
      owner = "client!nw",
      name = "fb",
      descriptor = "Z"
   )
   private boolean field8861;
   @OriginalMember(
      owner = "client!nw",
      name = "qb",
      descriptor = "I"
   )
   private int field8838;
   @OriginalMember(
      owner = "client!nw",
      name = "T",
      descriptor = "[I"
   )
   private int[] field8791;
   @OriginalMember(
      owner = "client!nw",
      name = "Bb",
      descriptor = "[I"
   )
   private int[] field8787;
   @OriginalMember(
      owner = "client!nw",
      name = "eb",
      descriptor = "[I"
   )
   private int[] field8796;
   @OriginalMember(
      owner = "client!nw",
      name = "fc",
      descriptor = "[S"
   )
   private short[] field8772;
   @OriginalMember(
      owner = "client!nw",
      name = "Lb",
      descriptor = "I"
   )
   private int field8757;
   @OriginalMember(
      owner = "client!nw",
      name = "hc",
      descriptor = "[Ltf;"
   )
   private class309[] field8780;
   @OriginalMember(
      owner = "client!nw",
      name = "zc",
      descriptor = "[Llu;"
   )
   private class740[] field8868;
   @OriginalMember(
      owner = "client!nw",
      name = "R",
      descriptor = "I"
   )
   private int field8759;
   @OriginalMember(
      owner = "client!nw",
      name = "bb",
      descriptor = "[Lng;"
   )
   private class358[] field8820;
   @OriginalMember(
      owner = "client!nw",
      name = "Ac",
      descriptor = "[Lpb;"
   )
   private class680[] field8845;
   @OriginalMember(
      owner = "client!nw",
      name = "Eb",
      descriptor = "[F"
   )
   private float[] field8827;
   @OriginalMember(
      owner = "client!nw",
      name = "w",
      descriptor = "[S"
   )
   private short[] field8836;
   @OriginalMember(
      owner = "client!nw",
      name = "Ub",
      descriptor = "S"
   )
   private short field8751;
   @OriginalMember(
      owner = "client!nw",
      name = "jb",
      descriptor = "[S"
   )
   private short[] field8847;
   @OriginalMember(
      owner = "client!nw",
      name = "u",
      descriptor = "[S"
   )
   private short[] field8775;
   @OriginalMember(
      owner = "client!nw",
      name = "oc",
      descriptor = "[B"
   )
   private byte[] field8854;
   @OriginalMember(
      owner = "client!nw",
      name = "K",
      descriptor = "[S"
   )
   private short[] field8798;
   @OriginalMember(
      owner = "client!nw",
      name = "Yb",
      descriptor = "[S"
   )
   private short[] field8758;
   @OriginalMember(
      owner = "client!nw",
      name = "S",
      descriptor = "[B"
   )
   private byte[] field8821;
   @OriginalMember(
      owner = "client!nw",
      name = "kb",
      descriptor = "[S"
   )
   private short[] field8789;
   @OriginalMember(
      owner = "client!nw",
      name = "ac",
      descriptor = "[S"
   )
   private short[] field8856;
   @OriginalMember(
      owner = "client!nw",
      name = "Z",
      descriptor = "[S"
   )
   private short[] field8850;
   @OriginalMember(
      owner = "client!nw",
      name = "Sb",
      descriptor = "[F"
   )
   private float[] field8860;
   @OriginalMember(
      owner = "client!nw",
      name = "tb",
      descriptor = "[S"
   )
   private short[] field8833;
   @OriginalMember(
      owner = "client!nw",
      name = "yb",
      descriptor = "S"
   )
   private short field8779;
   @OriginalMember(
      owner = "client!nw",
      name = "Ab",
      descriptor = "[S"
   )
   private short[] field8752;
   @OriginalMember(
      owner = "client!nw",
      name = "cc",
      descriptor = "[S"
   )
   private short[] field8814;
   @OriginalMember(
      owner = "client!nw",
      name = "W",
      descriptor = "[S"
   )
   private short[] field8831;
   @OriginalMember(
      owner = "client!nw",
      name = "J",
      descriptor = "[I"
   )
   private int[] field8809;
   @OriginalMember(
      owner = "client!nw",
      name = "wb",
      descriptor = "[I"
   )
   private int[] field8807;
   @OriginalMember(
      owner = "client!nw",
      name = "O",
      descriptor = "[I"
   )
   private int[] field8865;
   @OriginalMember(
      owner = "client!nw",
      name = "zb",
      descriptor = "I"
   )
   private int field8813;
   @OriginalMember(
      owner = "client!nw",
      name = "cb",
      descriptor = "[[I"
   )
   private int[][] field8774;
   @OriginalMember(
      owner = "client!nw",
      name = "nb",
      descriptor = "[[I"
   )
   private int[][] field8822;
   @OriginalMember(
      owner = "client!nw",
      name = "db",
      descriptor = "[[I"
   )
   private int[][] field8747;
   @OriginalMember(
      owner = "client!nw",
      name = "xb",
      descriptor = "Z"
   )
   private boolean field8760;
   @OriginalMember(
      owner = "client!nw",
      name = "qc",
      descriptor = "Z"
   )
   private boolean field8764;
   @OriginalMember(
      owner = "client!nw",
      name = "Qb",
      descriptor = "Z"
   )
   private boolean field8841;
   @OriginalMember(
      owner = "client!nw",
      name = "lb",
      descriptor = "Lcs;"
   )
   private class357 field8835;
   @OriginalMember(
      owner = "client!nw",
      name = "Cb",
      descriptor = "Ljd;"
   )
   private class240 field8867;
   @OriginalMember(
      owner = "client!nw",
      name = "B",
      descriptor = "Ljd;"
   )
   private class240 field8828;
   @OriginalMember(
      owner = "client!nw",
      name = "L",
      descriptor = "Ljd;"
   )
   private class240 field8755;
   @OriginalMember(
      owner = "client!nw",
      name = "p",
      descriptor = "Ljd;"
   )
   private class240 field8866;
   @OriginalMember(
      owner = "client!nw",
      name = "xc",
      descriptor = "Ltfa;"
   )
   private class36 field8746;
   @OriginalMember(
      owner = "client!nw",
      name = "Jc",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8869 = new String[]{method4487(method4486("3?DNb")), method4487(method4486("3?DWb")), method4487(method4486("&fD67")), method4487(method4486("3=\u0006t")), method4487(method4486("3?DQb")), method4487(method4486("3?D~+u")), method4487(method4486("3?D[\u000bu")), method4487(method4486("3?DSb")), method4487(method4486("3?Djb")), method4487(method4486("3?D]b")), method4487(method4486("3?DU\u000bu")), method4487(method4486("3?DR\u000bu")), method4487(method4486("3?DW\u000bu")), method4487(method4486("3?D$#3!\u001e&b")), method4487(method4486("3?DZ\bu")), method4487(method4486("3?DL\u000bu")), method4487(method4486("3?DY\bu")), method4487(method4486("3?Dyb")), method4487(method4486("3?D]\u000bu")), method4487(method4486("3?DS\u000bu")), method4487(method4486("3?D_\u000bu")), method4487(method4486("3?DPb")), method4487(method4486("3?Dnb")), method4487(method4486("3?DRb")), method4487(method4486("3?D[b")), method4487(method4486("3?DTb")), method4487(method4486("3?Do+u")), method4487(method4486("3?Dhb")), method4487(method4486("3?DVb")), method4487(method4486("3?D\\\u000bu")), method4487(method4486("3?Db+u")), method4487(method4486("3?DLb")), method4487(method4486("3?DN\u000bu")), method4487(method4486("3?D|+u")), method4487(method4486("3?DO\u000bu")), method4487(method4486("3?DHb")), method4487(method4486("3?DIb")), method4487(method4486("3?DM\u000bu")), method4487(method4486("3?Dz+u")), method4487(method4486("3?Dy+u")), method4487(method4486("3?DMb")), method4487(method4486("3?Dm+u")), method4487(method4486("3?DV\u000bu")), method4487(method4486("3?DUb")), method4487(method4486("3?DKb")), method4487(method4486("3?D^\u000bu")), method4487(method4486("3?Dsb")), method4487(method4486("3?DOb")), method4487(method4486("3?DT\u000bu")), method4487(method4486("3?DZb")), method4487(method4486("3?DY\u000bu")), method4487(method4486("3?Dv+u")), method4487(method4486("3?DI\u000bu")), method4487(method4486("3?D_b")), method4487(method4486("3?DZ\u000bu")), method4487(method4486("3?DK\u000bu")), method4487(method4486("3?D^b")), method4487(method4486("3?DQ\u000bu")), method4487(method4486("3?Du+u")), method4487(method4486("3?DYb")), method4487(method4486("3?DP\u000bu")), method4487(method4486("3?Dkb")), method4487(method4486("3?Dq+u")), method4487(method4486("3?DJ\u000bu")), method4487(method4486("3?DH\u000bu")), method4487(method4486("3?D\\b"))};
   @OriginalMember(
      owner = "client!nw",
      name = "Mb",
      descriptor = "I"
   )
   public static int field8745;
   @OriginalMember(
      owner = "client!nw",
      name = "ic",
      descriptor = "I"
   )
   public static int field8748;
   @OriginalMember(
      owner = "client!nw",
      name = "Hc",
      descriptor = "I"
   )
   public static int field8749;
   @OriginalMember(
      owner = "client!nw",
      name = "Bc",
      descriptor = "I"
   )
   public static int field8750;
   @OriginalMember(
      owner = "client!nw",
      name = "jc",
      descriptor = "I"
   )
   public static int field8753;
   @OriginalMember(
      owner = "client!nw",
      name = "gb",
      descriptor = "I"
   )
   private int field8754;
   @OriginalMember(
      owner = "client!nw",
      name = "mc",
      descriptor = "I"
   )
   public static int field8756;
   @OriginalMember(
      owner = "client!nw",
      name = "X",
      descriptor = "I"
   )
   public static int field8761;
   @OriginalMember(
      owner = "client!nw",
      name = "sc",
      descriptor = "I"
   )
   public static int field8762;
   @OriginalMember(
      owner = "client!nw",
      name = "Xb",
      descriptor = "I"
   )
   public static int field8763;
   @OriginalMember(
      owner = "client!nw",
      name = "pc",
      descriptor = "I"
   )
   public static int field8765;
   @OriginalMember(
      owner = "client!nw",
      name = "pb",
      descriptor = "I"
   )
   private int field8766;
   @OriginalMember(
      owner = "client!nw",
      name = "Ec",
      descriptor = "I"
   )
   public static int field8767;
   @OriginalMember(
      owner = "client!nw",
      name = "Fc",
      descriptor = "I"
   )
   public static int field8768;
   @OriginalMember(
      owner = "client!nw",
      name = "sb",
      descriptor = "I"
   )
   public static int field8769;
   @OriginalMember(
      owner = "client!nw",
      name = "Vb",
      descriptor = "I"
   )
   public static int field8770;
   @OriginalMember(
      owner = "client!nw",
      name = "Kb",
      descriptor = "I"
   )
   public static int field8771;
   @OriginalMember(
      owner = "client!nw",
      name = "Wb",
      descriptor = "I"
   )
   public static int field8773;
   @OriginalMember(
      owner = "client!nw",
      name = "Rb",
      descriptor = "I"
   )
   public static int field8776;
   @OriginalMember(
      owner = "client!nw",
      name = "bc",
      descriptor = "I"
   )
   public static int field8777;
   @OriginalMember(
      owner = "client!nw",
      name = "hb",
      descriptor = "I"
   )
   private int field8778;
   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "I"
   )
   public static int field8781;
   @OriginalMember(
      owner = "client!nw",
      name = "Nb",
      descriptor = "I"
   )
   public static int field8782;
   @OriginalMember(
      owner = "client!nw",
      name = "rb",
      descriptor = "I"
   )
   public static int field8783;
   @OriginalMember(
      owner = "client!nw",
      name = "Gb",
      descriptor = "I"
   )
   public static int field8784;
   @OriginalMember(
      owner = "client!nw",
      name = "P",
      descriptor = "I"
   )
   private int field8785;
   @OriginalMember(
      owner = "client!nw",
      name = "E",
      descriptor = "I"
   )
   public static int field8786;
   @OriginalMember(
      owner = "client!nw",
      name = "G",
      descriptor = "I"
   )
   private int field8788;
   @OriginalMember(
      owner = "client!nw",
      name = "Dc",
      descriptor = "I"
   )
   public static int field8790;
   @OriginalMember(
      owner = "client!nw",
      name = "wc",
      descriptor = "I"
   )
   public static int field8792;
   @OriginalMember(
      owner = "client!nw",
      name = "H",
      descriptor = "I"
   )
   public static int field8793;
   @OriginalMember(
      owner = "client!nw",
      name = "Jb",
      descriptor = "I"
   )
   public static int field8794;
   @OriginalMember(
      owner = "client!nw",
      name = "V",
      descriptor = "I"
   )
   public static int field8797;
   @OriginalMember(
      owner = "client!nw",
      name = "I",
      descriptor = "I"
   )
   public static int field8799;
   @OriginalMember(
      owner = "client!nw",
      name = "Cc",
      descriptor = "I"
   )
   public static int field8800;
   @OriginalMember(
      owner = "client!nw",
      name = "lc",
      descriptor = "I"
   )
   public static int field8801;
   @OriginalMember(
      owner = "client!nw",
      name = "Fb",
      descriptor = "I"
   )
   public static int field8802;
   @OriginalMember(
      owner = "client!nw",
      name = "A",
      descriptor = "I"
   )
   private int field8803;
   @OriginalMember(
      owner = "client!nw",
      name = "ab",
      descriptor = "I"
   )
   public static int field8804;
   @OriginalMember(
      owner = "client!nw",
      name = "t",
      descriptor = "I"
   )
   public static int field8805;
   @OriginalMember(
      owner = "client!nw",
      name = "uc",
      descriptor = "I"
   )
   public static int field8806;
   @OriginalMember(
      owner = "client!nw",
      name = "y",
      descriptor = "I"
   )
   public static int field8808;
   @OriginalMember(
      owner = "client!nw",
      name = "rc",
      descriptor = "I"
   )
   private int field8810;
   @OriginalMember(
      owner = "client!nw",
      name = "Ic",
      descriptor = "I"
   )
   public static int field8811;
   @OriginalMember(
      owner = "client!nw",
      name = "s",
      descriptor = "I"
   )
   public static int field8812;
   @OriginalMember(
      owner = "client!nw",
      name = "C",
      descriptor = "I"
   )
   public static int field8816;
   @OriginalMember(
      owner = "client!nw",
      name = "Db",
      descriptor = "I"
   )
   public static int field8817;
   @OriginalMember(
      owner = "client!nw",
      name = "Hb",
      descriptor = "I"
   )
   private int field8818;
   @OriginalMember(
      owner = "client!nw",
      name = "Gc",
      descriptor = "I"
   )
   public static int field8819;
   @OriginalMember(
      owner = "client!nw",
      name = "nc",
      descriptor = "I"
   )
   public static int field8823;
   @OriginalMember(
      owner = "client!nw",
      name = "dc",
      descriptor = "I"
   )
   public static int field8824;
   @OriginalMember(
      owner = "client!nw",
      name = "Tb",
      descriptor = "I"
   )
   public static int field8825;
   @OriginalMember(
      owner = "client!nw",
      name = "Pb",
      descriptor = "I"
   )
   public static int field8826;
   @OriginalMember(
      owner = "client!nw",
      name = "kc",
      descriptor = "I"
   )
   public static int field8829;
   @OriginalMember(
      owner = "client!nw",
      name = "D",
      descriptor = "I"
   )
   public static int field8830;
   @OriginalMember(
      owner = "client!nw",
      name = "ub",
      descriptor = "I"
   )
   public static int field8834;
   @OriginalMember(
      owner = "client!nw",
      name = "r",
      descriptor = "I"
   )
   public static int field8837;
   @OriginalMember(
      owner = "client!nw",
      name = "tc",
      descriptor = "I"
   )
   public static int field8839;
   @OriginalMember(
      owner = "client!nw",
      name = "F",
      descriptor = "I"
   )
   public static int field8842;
   @OriginalMember(
      owner = "client!nw",
      name = "Q",
      descriptor = "I"
   )
   public static int field8843;
   @OriginalMember(
      owner = "client!nw",
      name = "vc",
      descriptor = "I"
   )
   public static int field8844;
   @OriginalMember(
      owner = "client!nw",
      name = "Ob",
      descriptor = "I"
   )
   public static int field8846;
   @OriginalMember(
      owner = "client!nw",
      name = "q",
      descriptor = "I"
   )
   public static int field8848;
   @OriginalMember(
      owner = "client!nw",
      name = "N",
      descriptor = "I"
   )
   public static int field8849;
   @OriginalMember(
      owner = "client!nw",
      name = "mb",
      descriptor = "I"
   )
   public static int field8852;
   @OriginalMember(
      owner = "client!nw",
      name = "vb",
      descriptor = "I"
   )
   public static int field8853;
   @OriginalMember(
      owner = "client!nw",
      name = "x",
      descriptor = "I"
   )
   public static int field8855;
   @OriginalMember(
      owner = "client!nw",
      name = "Ib",
      descriptor = "I"
   )
   public static int field8858;
   @OriginalMember(
      owner = "client!nw",
      name = "Y",
      descriptor = "I"
   )
   public static int field8859;
   @OriginalMember(
      owner = "client!nw",
      name = "ib",
      descriptor = "I"
   )
   public static int field8862;
   @OriginalMember(
      owner = "client!nw",
      name = "ob",
      descriptor = "I"
   )
   public static int field8864;
   @OriginalMember(
      owner = "client!nw",
      name = "U",
      descriptor = "Liv;"
   )
   private class106 field8795;

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(IIII)V",
      line = 3
   )
   public final void method522(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field8769;
         int var6 = 0;
         int var11;
         class680 var12;
         class358 var13;
         if (!var5 && var6 >= this.field8815) {
            if (this.field8845 != null) {
               var11 = 0;
               if (var5 || ~this.field8759 < ~var11) {
                  do {
                     var12 = this.field8845[var11];
                     var13 = this.field8820[var11];
                     var13.field5359 = 16777215 & class451.field6600[this.field8831[var12.field9968] & 65535] | var13.field5359 & -16777216;
                     ++var11;
                  } while(~this.field8759 < ~var11);
               }
            }

            this.method4472((byte)-126);
         } else {
            do {
               int var7 = 65535 & this.field8831[var6];
               int var8 = 63 & var7 >> 10;
               int var9 = (var7 & 954) >> 7;
               if (arg1 != -1) {
                  var9 += (-var9 + arg1) * arg3 >> 7;
               }

               if (arg0 != -1) {
                  var8 -= -((arg0 - var8) * arg3 >> 7);
               }

               int var10 = 127 & var7;
               if (arg2 != -1) {
                  var10 += (-var10 + arg2) * arg3 >> 7;
               }

               this.field8831[var6] = (short)class93.method899(class93.method899(var8 << 10, var9 << 7), var10);
               ++var6;
            } while(var6 < this.field8815);

            if (this.field8845 != null) {
               var11 = 0;
               if (var5 || ~this.field8759 < ~var11) {
                  do {
                     var12 = this.field8845[var11];
                     var13 = this.field8820[var11];
                     var13.field5359 = 16777215 & class451.field6600[this.field8831[var12.field9968] & 65535] | var13.field5359 & -16777216;
                     ++var11;
                  } while(~this.field8759 < ~var11);
               }
            }

            this.method4472((byte)-126);
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field8869[9] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(ZLnw;BIZLnw;)Lka;",
      line = 58
   )
   private final class495 method4470(boolean arg0, class610 arg1, byte arg2, int arg3, boolean arg4, class610 arg5) {
      boolean var7 = client.field4564;

      try {
         label569: {
            if (~(arg3 & 256) != -1) {
               arg1.field8832 = true;
               if (!var7) {
                  break label569;
               }
            }

            arg1.field8832 = this.field8832;
         }

         arg1.field8840 = arg3;
         arg1.field8759 = this.field8759;
         arg1.field8813 = this.field8813;
         arg1.field8815 = this.field8815;
         arg1.field8751 = this.field8751;
         arg1.field8838 = this.field8838;
         arg1.field8757 = this.field8757;
         arg1.field8861 = this.field8861;
         ++field8862;
         arg1.field8779 = this.field8779;
         if (arg2 > -55) {
            this.field8856 = null;
         }

         label574: {
            arg1.field8863 = this.field8863;
            arg1.field8851 = this.field8851;
            boolean var8 = class670.method4906(this.field8851, 17464, arg3);
            boolean var9 = class413.method3155(arg3, this.field8851, -1);
            boolean var10 = class340.method2634(this.field8851, arg3, -117);
            boolean var11 = var8 | var9 | var10;
            if (!var11) {
               arg1.field8787 = this.field8787;
               arg1.field8791 = this.field8791;
               arg1.field8796 = this.field8796;
               if (!var7) {
                  break label574;
               }
            }

            label575: {
               if (!var8) {
                  arg1.field8787 = this.field8787;
                  if (!var7) {
                     break label575;
                  }
               }

               if (arg5.field8787 != null && arg5.field8787.length >= this.field8757) {
                  arg1.field8787 = arg5.field8787;
                  if (!var7) {
                     break label575;
                  }
               }

               arg1.field8787 = arg5.field8787 = new int[this.field8757];
            }

            label549: {
               if (var9) {
                  if (arg5.field8796 != null && arg5.field8796.length >= this.field8757) {
                     arg1.field8796 = arg5.field8796;
                     if (!var7) {
                        break label549;
                     }
                  }

                  arg1.field8796 = arg5.field8796 = new int[this.field8757];
                  if (!var7) {
                     break label549;
                  }
               }

               arg1.field8796 = this.field8796;
            }

            label609: {
               if (!var10) {
                  arg1.field8791 = this.field8791;
                  if (!var7) {
                     break label609;
                  }
               }

               if (arg5.field8791 == null || this.field8757 > arg5.field8791.length) {
                  arg1.field8791 = arg5.field8791 = new int[this.field8757];
                  if (!var7) {
                     break label609;
                  }
               }

               arg1.field8791 = arg5.field8791;
            }

            int var12 = 0;
            if (var7 || this.field8757 > var12) {
               do {
                  if (var8) {
                     arg1.field8787[var12] = this.field8787[var12];
                  }

                  if (var9) {
                     arg1.field8796[var12] = this.field8796[var12];
                  }

                  if (var10) {
                     arg1.field8791[var12] = this.field8791[var12];
                  }

                  ++var12;
               } while(this.field8757 > var12);
            }
         }

         label520: {
            if (!class624.method4571(arg3, this.field8851, -67)) {
               if (!class641.method4697(this.field8851, arg3, -1)) {
                  arg1.field8867 = null;
                  if (!var7) {
                     break label520;
                  }
               }

               arg1.field8867 = this.field8867;
               if (!var7) {
                  break label520;
               }
            }

            arg1.field8867 = arg5.field8867;
            arg1.field8867.field3478 = true;
            arg1.field8867.field3480 = this.field8867.field3480;
            arg1.field8867.field3479 = this.field8867.field3479;
         }

         label578: {
            if (!class190.method1655(arg3, this.field8851, (byte)62)) {
               arg1.field8831 = this.field8831;
               if (!var7) {
                  break label578;
               }
            }

            label610: {
               if (arg5.field8831 == null || this.field8815 > arg5.field8831.length) {
                  arg1.field8831 = arg5.field8831 = new short[this.field8815];
                  if (!var7) {
                     break label610;
                  }
               }

               arg1.field8831 = arg5.field8831;
            }

            int var13 = 0;
            if (var7 || ~this.field8815 < ~var13) {
               do {
                  arg1.field8831[var13] = this.field8831[var13];
                  ++var13;
               } while(~this.field8815 < ~var13);
            }
         }

         label490: {
            if (class594.method4387(true, this.field8851, arg3)) {
               label487: {
                  if (arg5.field8821 != null && arg5.field8821.length >= this.field8815) {
                     arg1.field8821 = arg5.field8821;
                     if (!var7) {
                        break label487;
                     }
                  }

                  arg1.field8821 = arg5.field8821 = new byte[this.field8815];
               }

               int var14 = 0;
               if (var7) {
                  arg1.field8821[var14] = this.field8821[var14];
                  ++var14;
               }

               while(true) {
                  while(~var14 > ~this.field8815) {
                     arg1.field8821[var14] = this.field8821[var14];
                     ++var14;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label490;
                     }
                     break;
                  }

                  ++var14;
               }
            }

            arg1.field8821 = this.field8821;
         }

         label582: {
            if (class383.method2980(arg3, 0, this.field8851)) {
               arg1.field8755 = arg5.field8755;
               arg1.field8755.field3478 = true;
               arg1.field8755.field3480 = this.field8755.field3480;
               arg1.field8755.field3479 = this.field8755.field3479;
               if (!var7) {
                  break label582;
               }
            }

            if (!class27.method191(arg3, (byte)-125, this.field8851)) {
               arg1.field8755 = null;
               if (!var7) {
                  break label582;
               }
            }

            arg1.field8755 = this.field8755;
         }

         label450: {
            if (class4.method28(arg3, (byte)-43, this.field8851)) {
               label447: {
                  if (arg5.field8833 != null && ~arg5.field8833.length <= ~this.field8813) {
                     arg1.field8752 = arg5.field8752;
                     arg1.field8833 = arg5.field8833;
                     arg1.field8850 = arg5.field8850;
                     if (!var7) {
                        break label447;
                     }
                  }

                  int var15 = this.field8813;
                  arg1.field8850 = arg5.field8850 = new short[var15];
                  arg1.field8752 = arg5.field8752 = new short[var15];
                  arg1.field8833 = arg5.field8833 = new short[var15];
               }

               label612: {
                  if (this.field8795 == null) {
                     arg1.field8795 = null;
                     int var16 = 0;
                     if (var7) {
                        arg1.field8833[var16] = this.field8833[var16];
                        arg1.field8752[var16] = this.field8752[var16];
                        arg1.field8850[var16] = this.field8850[var16];
                        ++var16;
                     }

                     while(true) {
                        while(~this.field8813 < ~var16) {
                           arg1.field8833[var16] = this.field8833[var16];
                           arg1.field8752[var16] = this.field8752[var16];
                           arg1.field8850[var16] = this.field8850[var16];
                           ++var16;
                        }

                        if (!var7) {
                           if (!var7) {
                              break label612;
                           }
                           break;
                        }

                        ++var16;
                     }
                  }

                  if (arg5.field8795 == null) {
                     arg5.field8795 = new class106();
                  }

                  class106 var17 = arg1.field8795 = arg5.field8795;
                  if (var17.field1757 == null || ~this.field8813 < ~var17.field1757.length) {
                     int var18 = this.field8813;
                     var17.field1762 = new byte[var18];
                     var17.field1764 = new short[var18];
                     var17.field1759 = new short[var18];
                     var17.field1757 = new short[var18];
                  }

                  int var19 = 0;
                  if (var7 || ~this.field8813 < ~var19) {
                     do {
                        arg1.field8833[var19] = this.field8833[var19];
                        arg1.field8752[var19] = this.field8752[var19];
                        arg1.field8850[var19] = this.field8850[var19];
                        var17.field1757[var19] = this.field8795.field1757[var19];
                        var17.field1759[var19] = this.field8795.field1759[var19];
                        var17.field1764[var19] = this.field8795.field1764[var19];
                        var17.field1762[var19] = this.field8795.field1762[var19];
                        ++var19;
                     } while(~this.field8813 < ~var19);
                  }
               }

               arg1.field8854 = this.field8854;
               if (!var7) {
                  break label450;
               }
            }

            arg1.field8850 = this.field8850;
            arg1.field8752 = this.field8752;
            arg1.field8833 = this.field8833;
            arg1.field8854 = this.field8854;
            arg1.field8795 = this.field8795;
         }

         label588: {
            if (class139.method1298((byte)-123, arg3, this.field8851)) {
               arg1.field8866 = arg5.field8866;
               arg1.field8866.field3478 = true;
               arg1.field8866.field3480 = this.field8866.field3480;
               arg1.field8866.field3479 = this.field8866.field3479;
               if (!var7) {
                  break label588;
               }
            }

            if (!class577.method4262(arg3, 0, this.field8851)) {
               arg1.field8866 = null;
               if (!var7) {
                  break label588;
               }
            }

            arg1.field8866 = this.field8866;
         }

         label589: {
            if (!class641.method4695(arg3, -2, this.field8851)) {
               arg1.field8827 = this.field8827;
               arg1.field8860 = this.field8860;
               if (!var7) {
                  break label589;
               }
            }

            label384: {
               if (arg5.field8860 != null && this.field8815 <= arg5.field8860.length) {
                  arg1.field8860 = arg5.field8860;
                  arg1.field8827 = arg5.field8827;
                  if (!var7) {
                     break label384;
                  }
               }

               int var20 = this.field8813;
               arg1.field8860 = arg5.field8860 = new float[var20];
               arg1.field8827 = arg5.field8827 = new float[var20];
            }

            int var21 = 0;
            if (var7 || ~this.field8813 < ~var21) {
               do {
                  arg1.field8860[var21] = this.field8860[var21];
                  arg1.field8827[var21] = this.field8827[var21];
                  ++var21;
               } while(~this.field8813 < ~var21);
            }
         }

         label369: {
            if (!class679.method4956(arg3, -105, this.field8851)) {
               if (class238.method1950(125, arg3, this.field8851)) {
                  arg1.field8828 = this.field8828;
                  if (!var7) {
                     break label369;
                  }
               }

               arg1.field8828 = null;
               if (!var7) {
                  break label369;
               }
            }

            arg1.field8828 = arg5.field8828;
            arg1.field8828.field3480 = this.field8828.field3480;
            arg1.field8828.field3478 = true;
            arg1.field8828.field3479 = this.field8828.field3479;
         }

         label590: {
            if (!class764.method5527((byte)-56, this.field8851, arg3)) {
               arg1.field8836 = this.field8836;
               arg1.field8856 = this.field8856;
               arg1.field8798 = this.field8798;
               if (!var7) {
                  break label590;
               }
            }

            label356: {
               if (arg5.field8856 != null && this.field8815 <= arg5.field8856.length) {
                  arg1.field8836 = arg5.field8836;
                  arg1.field8798 = arg5.field8798;
                  arg1.field8856 = arg5.field8856;
                  if (!var7) {
                     break label356;
                  }
               }

               int var22 = this.field8815;
               arg1.field8798 = arg5.field8798 = new short[var22];
               arg1.field8836 = arg5.field8836 = new short[var22];
               arg1.field8856 = arg5.field8856 = new short[var22];
            }

            int var23 = 0;
            if (var7 || var23 < this.field8815) {
               do {
                  arg1.field8856[var23] = this.field8856[var23];
                  arg1.field8836[var23] = this.field8836[var23];
                  arg1.field8798[var23] = this.field8798[var23];
                  ++var23;
               } while(var23 < this.field8815);
            }
         }

         label341: {
            if (!class330.method2552(this.field8851, arg3, -1)) {
               if (!class609.method4467(arg3, 22311, this.field8851)) {
                  arg1.field8746 = null;
                  if (!var7) {
                     break label341;
                  }
               }

               arg1.field8746 = this.field8746;
               if (!var7) {
                  break label341;
               }
            }

            arg1.field8746 = arg5.field8746;
            arg1.field8746.field884 = this.field8746.field884;
            arg1.field8746.field887 = true;
            arg1.field8746.field886 = this.field8746.field886;
         }

         label333: {
            if (class51.method615(arg3, this.field8851, 32768)) {
               label611: {
                  if (arg5.field8758 == null || arg5.field8758.length < this.field8815) {
                     int var24 = this.field8815;
                     arg1.field8758 = arg5.field8758 = new short[var24];
                     if (!var7) {
                        break label611;
                     }
                  }

                  arg1.field8758 = arg5.field8758;
               }

               int var25 = 0;
               if (var7) {
                  arg1.field8758[var25] = this.field8758[var25];
                  ++var25;
               }

               while(true) {
                  while(~var25 > ~this.field8815) {
                     arg1.field8758[var25] = this.field8758[var25];
                     ++var25;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label333;
                     }
                     break;
                  }

                  ++var25;
               }
            }

            arg1.field8758 = this.field8758;
         }

         label300: {
            if (class1.method3(arg3, this.field8851, true)) {
               if (arg5.field8820 != null && arg5.field8820.length >= this.field8759) {
                  arg1.field8820 = arg5.field8820;
                  int var26 = 0;
                  if (var7) {
                     arg1.field8820[var26].method2815(this.field8820[var26], (byte)-127);
                     ++var26;
                  }

                  while(true) {
                     while(~var26 > ~this.field8759) {
                        arg1.field8820[var26].method2815(this.field8820[var26], (byte)-127);
                        ++var26;
                     }

                     if (!var7) {
                        if (!var7) {
                           break label300;
                        }
                        break;
                     }

                     ++var26;
                  }
               }

               int var27 = this.field8759;
               arg1.field8820 = arg5.field8820 = new class358[var27];
               int var28 = 0;
               if (var7) {
                  arg1.field8820[var28] = this.field8820[var28].method2817(-90);
                  ++var28;
               }

               while(true) {
                  while(~this.field8759 < ~var28) {
                     arg1.field8820[var28] = this.field8820[var28].method2817(-90);
                     ++var28;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label300;
                     }
                     break;
                  }

                  ++var28;
               }
            }

            arg1.field8820 = this.field8820;
         }

         label249: {
            arg1.field8789 = this.field8789;
            arg1.field8774 = this.field8774;
            if (this.field8760) {
               arg1.field8754 = this.field8754;
               arg1.field8760 = true;
               arg1.field8803 = this.field8803;
               arg1.field8810 = this.field8810;
               arg1.field8785 = this.field8785;
               arg1.field8788 = this.field8788;
               arg1.field8766 = this.field8766;
               arg1.field8818 = this.field8818;
               arg1.field8778 = this.field8778;
               if (!var7) {
                  break label249;
               }
            }

            arg1.field8760 = false;
         }

         arg1.field8847 = this.field8847;
         arg1.field8780 = this.field8780;
         arg1.field8822 = this.field8822;
         arg1.field8809 = this.field8809;
         arg1.field8772 = this.field8772;
         arg1.field8845 = this.field8845;
         arg1.field8868 = this.field8868;
         arg1.field8747 = this.field8747;
         arg1.field8807 = this.field8807;
         arg1.field8857 = this.field8857;
         arg1.field8775 = this.field8775;
         arg1.field8814 = this.field8814;
         arg1.field8865 = this.field8865;
         return arg1;
      } catch (RuntimeException var30) {
         throw class608.method4462(var30, field8869[14] + arg0 + ',' + (arg1 != null ? field8869[2] : field8869[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + (arg5 != null ? field8869[2] : field8869[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "LA",
      descriptor = "(I)V",
      line = 519
   )
   public final void method534(int arg0) {
      try {
         this.field8751 = (short)arg0;
         ++field8808;
         this.method4473(-106);
         this.method4471(-15824);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[48] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Ldfa;IZ)V",
      line = 532
   )
   public final void method519(class173 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nw",
      name = "I",
      descriptor = "(I[IIIIZI[I)V",
      line = 563
   )
   public final void method550(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      boolean var9 = client.field4564;

      try {
         ++field8748;
         int var10 = arg1.length;
         int var10000;
         if (arg0 != 0) {
            if (~arg0 == -2) {
               if (arg7 != null) {
                  int var17 = arg7[1] * arg3 + arg7[0] * arg2 - -(arg7[2] * arg4) + 8192 >> 14;
                  int var18 = arg7[3] * arg2 - -(arg7[4] * arg3) + arg7[5] * arg4 + 8192 >> 14;
                  int var19 = arg7[7] * arg3 + (arg7[6] * arg2 - -(arg7[8] * arg4)) + 8192 >> 14;
                  arg2 = var17;
                  arg4 = var19;
                  arg3 = var18;
               }

               arg4 <<= 4;
               arg2 <<= 4;
               arg3 <<= 4;
               int var20 = 0;
               if (var9 || ~var10 < ~var20) {
                  do {
                     int var21 = arg1[var20];
                     if (this.field8774.length <= var21) {
                        ++var20;
                     } else {
                        int[] var22 = this.field8774[var21];
                        int var23 = 0;
                        if (!var9 && ~var22.length >= ~var23) {
                           ++var20;
                        } else {
                           do {
                              int var24 = var22[var23];
                              if (this.field8772 != null && (this.field8772[var24] & arg6) == 0) {
                                 ++var23;
                              } else {
                                 this.field8787[var24] += arg2;
                                 this.field8796[var24] += arg3;
                                 this.field8791[var24] += arg4;
                                 ++var23;
                              }
                           } while(~var22.length < ~var23);

                           ++var20;
                        }
                     }
                  } while(~var10 < ~var20);

               }
            } else if (~arg0 == -3) {
               if (arg7 != null) {
                  int var57 = arg7[9] << 4;
                  int var58 = arg7[10] << 4;
                  int var59 = arg7[11] << 4;
                  int var60 = arg7[12] << 4;
                  int var61 = arg7[13] << 4;
                  int var62 = arg7[14] << 4;
                  if (class438.field6323) {
                     int var63 = arg7[3] * class728.field10473 + arg7[0] * class93.field1515 + arg7[6] * class730.field10500 + 8192 >> 14;
                     int var64 = arg7[4] * class728.field10473 + arg7[1] * class93.field1515 + (arg7[7] * class730.field10500 - -8192) >> 14;
                     int var65 = var60 + var63;
                     int var66 = var61 + var64;
                     int var67 = arg7[5] * class728.field10473 + arg7[2] * class93.field1515 + arg7[8] * class730.field10500 + 8192 >> 14;
                     class728.field10473 = var66;
                     int var68 = var62 + var67;
                     class93.field1515 = var65;
                     class438.field6323 = false;
                     class730.field10500 = var68;
                  }

                  int[] var84;
                  int var86;
                  int var92;
                  int var93;
                  int[] var94;
                  int var95;
                  label517: {
                     int[] var69 = new int[9];
                     int var70 = class593.field8548[arg2];
                     int var71 = class593.field8539[arg2];
                     int var72 = class593.field8548[arg3];
                     int var73 = class593.field8539[arg3];
                     int var74 = class593.field8548[arg4];
                     int var75 = class593.field8539[arg4];
                     int var76 = var71 * var74 + 8192 >> 14;
                     int var77 = var71 * var75 + 8192 >> 14;
                     var69[6] = -var73 * var74 + var72 * var77 + 8192 >> 14;
                     var69[4] = var70 * var74 + 8192 >> 14;
                     var69[1] = -var72 * var75 + var73 * var76 + 8192 >> 14;
                     var69[3] = var70 * var75 + 8192 >> 14;
                     var69[2] = var70 * var73 + 8192 >> 14;
                     var69[5] = -var71;
                     var69[7] = var72 * var76 + var73 * var75 + 8192 >> 14;
                     var69[8] = var70 * var72 - -8192 >> 14;
                     var69[0] = var72 * var74 - (-(var73 * var77) - 8192) >> 14;
                     int var78 = var69[1] * -class728.field10473 + (var69[0] * -class93.field1515 - -(var69[2] * -class730.field10500)) + 8192 >> 14;
                     int var79 = var69[5] * -class730.field10500 + var69[3] * -class93.field1515 + var69[4] * -class728.field10473 - -8192 >> 14;
                     int var80 = var69[7] * -class728.field10473 + var69[6] * -class93.field1515 + var69[8] * -class730.field10500 + 8192 >> 14;
                     int var81 = class93.field1515 + var78;
                     int var82 = class728.field10473 + var79;
                     int var83 = var80 - -class730.field10500;
                     var84 = new int[9];
                     int var85 = 0;
                     int var89;
                     int var90;
                     int var91;
                     if (var9) {
                        var86 = 0;
                     } else if (~var85 <= -4) {
                        var89 = var69[1] * var61 + var69[0] * var60 + var69[2] * var62 - -8192 >> 14;
                        var90 = var69[4] * var61 - -8192 + var69[5] * var62 + var69[3] * var60 >> 14;
                        var86 = var81 + var89;
                        var91 = var69[7] * var61 - -(var69[8] * var62) + var69[6] * var60 + 8192 >> 14;
                        var92 = var82 + var90;
                        var93 = var83 + var91;
                        var94 = new int[9];
                        var95 = 0;
                        if (!var9) {
                           break label517;
                        }
                     } else {
                        var86 = 0;
                     }

                     while(true) {
                        label514: {
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
                              if (var86 >= 3) {
                                 break label514;
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
                                 if (var86 >= 3) {
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
                           var89 = var69[1] * var61 + var69[0] * var60 + var69[2] * var62 - -8192 >> 14;
                           var90 = var69[4] * var61 - -8192 + var69[5] * var62 + var69[3] * var60 >> 14;
                           var86 = var81 + var89;
                           var91 = var69[7] * var61 - -(var69[8] * var62) + var69[6] * var60 + 8192 >> 14;
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
                  label456: {
                     int var99;
                     int var100;
                     int var101;
                     if (var9) {
                        var96 = 0;
                     } else if (var95 >= 3) {
                        var99 = arg7[0] * var86 - (-(arg7[1] * var92) + -(arg7[2] * var93)) + 8192 >> 14;
                        var100 = arg7[5] * var93 + arg7[3] * var86 - -(arg7[4] * var92) + 8192 >> 14;
                        var101 = arg7[7] * var92 - -(arg7[8] * var93) + arg7[6] * var86 + 8192 >> 14;
                        var96 = var57 + var99;
                        var102 = var58 + var100;
                        var103 = var59 + var101;
                        var104 = 0;
                        if (!var9) {
                           break label456;
                        }
                     } else {
                        var96 = 0;
                     }

                     while(true) {
                        label453: {
                           int var97;
                           int var98;
                           if (var9) {
                              var97 = 0;
                              var98 = 0;
                              if (var9) {
                                 var97 += var84[var96 - -(var98 * 3)] * arg7[var95 * 3 + var98];
                                 ++var98;
                              }
                           } else {
                              if (~var96 <= -4) {
                                 break label453;
                              }

                              var97 = 0;
                              var98 = 0;
                              if (var9) {
                                 var97 += var84[var96 - -(var98 * 3)] * arg7[var95 * 3 + var98];
                                 ++var98;
                              }
                           }

                           while(true) {
                              while(var98 < 3) {
                                 var97 += var84[var96 - -(var98 * 3)] * arg7[var95 * 3 + var98];
                                 ++var98;
                              }

                              var94[var95 * 3 - -var96] = var97 + 8192 >> 14;
                              if (!var9) {
                                 ++var96;
                                 if (~var96 <= -4) {
                                    break;
                                 }

                                 var97 = 0;
                                 var98 = 0;
                                 if (var9) {
                                    var97 += var84[var96 - -(var98 * 3)] * arg7[var95 * 3 + var98];
                                    ++var98;
                                 }
                              } else {
                                 ++var98;
                              }
                           }
                        }

                        ++var95;
                        if (var95 >= 3) {
                           var99 = arg7[0] * var86 - (-(arg7[1] * var92) + -(arg7[2] * var93)) + 8192 >> 14;
                           var100 = arg7[5] * var93 + arg7[3] * var86 - -(arg7[4] * var92) + 8192 >> 14;
                           var101 = arg7[7] * var92 - -(arg7[8] * var93) + arg7[6] * var86 + 8192 >> 14;
                           var96 = var57 + var99;
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

                  if (var9 || var10 > var104) {
                     do {
                        int var105 = arg1[var104];
                        if (var105 >= this.field8774.length) {
                           ++var104;
                        } else {
                           int[] var106 = this.field8774[var105];
                           int var107 = 0;
                           if (!var9 && var106.length <= var107) {
                              ++var104;
                           } else {
                              do {
                                 int var108 = var106[var107];
                                 if (this.field8772 != null && (this.field8772[var108] & arg6) == 0) {
                                    ++var107;
                                 } else {
                                    int var109 = this.field8796[var108] * var94[1] + this.field8791[var108] * var94[2] + this.field8787[var108] * var94[0] + 8192 >> 14;
                                    int var110 = this.field8787[var108] * var94[3] - -(this.field8796[var108] * var94[4]) - (-(this.field8791[var108] * var94[5]) - 8192) >> 14;
                                    int var111 = var96 + var109;
                                    int var112 = var102 + var110;
                                    int var113 = this.field8796[var108] * var94[7] + this.field8787[var108] * var94[6] - -(this.field8791[var108] * var94[8]) + 8192 >> 14;
                                    this.field8787[var108] = var111;
                                    int var114 = var103 + var113;
                                    this.field8796[var108] = var112;
                                    this.field8791[var108] = var114;
                                    ++var107;
                                 }
                              } while(var106.length > var107);

                              ++var104;
                           }
                        }
                     } while(var10 > var104);
                  }
               } else {
                  int var25 = 0;
                  int var39;
                  int var40;
                  int[] var41;
                  int var42;
                  int var43;
                  int var44;
                  int var45;
                  int var46;
                  int var47;
                  int var48;
                  int var49;
                  int var50;
                  int var51;
                  int var52;
                  int var53;
                  int var54;
                  int var55;
                  int var56;
                  if (var9) {
                     var10000 = arg1[var25];
                  } else if (~var25 <= ~var10) {
                     var10000 = arg5;
                     if (!var9) {
                        if (arg5 == 0) {
                           return;
                        }

                        var39 = 0;
                        if (!var9 && var10 <= var39) {
                           this.method4471(-15824);
                           return;
                        }

                        do {
                           var40 = arg1[var39];
                           if (this.field8774.length <= var40) {
                              ++var39;
                           } else {
                              var41 = this.field8774[var40];
                              var42 = 0;
                              if (!var9 && ~var41.length >= ~var42) {
                                 ++var39;
                              } else {
                                 label695:
                                 do {
                                    var43 = var41[var42];
                                    if (this.field8772 != null && ~(this.field8772[var43] & arg6) == -1) {
                                       ++var42;
                                    } else {
                                       var44 = this.field8857[var43];
                                       var45 = this.field8857[var43 + 1];
                                       var46 = var44;
                                       if (!var9 && ~var44 <= ~var45) {
                                          ++var42;
                                       } else {
                                          do {
                                             var47 = this.field8775[var46] + -1;
                                             if (~var47 == 0) {
                                                ++var42;
                                                continue label695;
                                             }

                                             if (~arg4 != -1) {
                                                var48 = class593.field8539[arg4];
                                                var49 = class593.field8548[arg4];
                                                var50 = this.field8752[var47] * var48 + this.field8833[var47] * var49 + 16383 >> 14;
                                                this.field8752[var47] = (short)(this.field8752[var47] * var49 + 16383 + -(this.field8833[var47] * var48) >> 14);
                                                this.field8833[var47] = (short)var50;
                                             }

                                             if (~arg2 != -1) {
                                                var51 = class593.field8539[arg2];
                                                var52 = class593.field8548[arg2];
                                                var53 = this.field8752[var47] * var52 + -(this.field8850[var47] * var51) + 16383 >> 14;
                                                this.field8850[var47] = (short)(this.field8850[var47] * var52 + this.field8752[var47] * var51 + 16383 >> 14);
                                                this.field8752[var47] = (short)var53;
                                             }

                                             if (~arg3 != -1) {
                                                var54 = class593.field8539[arg3];
                                                var55 = class593.field8548[arg3];
                                                var56 = this.field8850[var47] * var54 + this.field8833[var47] * var55 + 16383 >> 14;
                                                this.field8850[var47] = (short)(this.field8850[var47] * var55 - -16383 + -(this.field8833[var47] * var54) >> 14);
                                                this.field8833[var47] = (short)var56;
                                             }

                                             ++var46;
                                          } while(~var46 > ~var45);

                                          ++var42;
                                       }
                                    }
                                 } while(~var41.length < ~var42);

                                 ++var39;
                              }
                           }
                        } while(var10 > var39);

                        this.method4471(-15824);
                        return;
                     }
                  } else {
                     var10000 = arg1[var25];
                  }

                  while(true) {
                     int var26 = var10000;
                     if (~this.field8774.length >= ~var26) {
                        ++var25;
                     } else {
                        int[] var27 = this.field8774[var26];
                        int var28 = 0;
                        int var29;
                        int var30;
                        int var31;
                        int var32;
                        int var33;
                        int var34;
                        int var35;
                        int var36;
                        int var37;
                        int var38;
                        if (var9) {
                           var29 = var27[var28];
                           if (this.field8772 != null) {
                              if ((this.field8772[var29] & arg6) != 0) {
                                 this.field8787[var29] -= class93.field1515;
                                 this.field8796[var29] -= class728.field10473;
                                 this.field8791[var29] -= class730.field10500;
                                 if (~arg4 != -1) {
                                    var30 = class593.field8539[arg4];
                                    var31 = class593.field8548[arg4];
                                    var32 = this.field8796[var29] * var30 + this.field8787[var29] * var31 + 16383 >> 14;
                                    this.field8796[var29] = this.field8796[var29] * var31 + -(this.field8787[var29] * var30) + 16383 >> 14;
                                    this.field8787[var29] = var32;
                                 }

                                 if (~arg2 != -1) {
                                    var33 = class593.field8539[arg2];
                                    var34 = class593.field8548[arg2];
                                    var35 = this.field8796[var29] * var34 + 16383 + -(this.field8791[var29] * var33) >> 14;
                                    this.field8791[var29] = this.field8796[var29] * var33 + this.field8791[var29] * var34 + 16383 >> 14;
                                    this.field8796[var29] = var35;
                                 }

                                 if (arg3 != 0) {
                                    var36 = class593.field8539[arg3];
                                    var37 = class593.field8548[arg3];
                                    var38 = this.field8791[var29] * var36 - -(this.field8787[var29] * var37) + 16383 >> 14;
                                    this.field8791[var29] = this.field8791[var29] * var37 + -(this.field8787[var29] * var36) + 16383 >> 14;
                                    this.field8787[var29] = var38;
                                 }

                                 this.field8787[var29] += class93.field1515;
                                 this.field8796[var29] += class728.field10473;
                                 this.field8791[var29] += class730.field10500;
                                 ++var28;
                              } else {
                                 ++var28;
                              }
                           } else {
                              this.field8787[var29] -= class93.field1515;
                              this.field8796[var29] -= class728.field10473;
                              this.field8791[var29] -= class730.field10500;
                              if (~arg4 != -1) {
                                 var30 = class593.field8539[arg4];
                                 var31 = class593.field8548[arg4];
                                 var32 = this.field8796[var29] * var30 + this.field8787[var29] * var31 + 16383 >> 14;
                                 this.field8796[var29] = this.field8796[var29] * var31 + -(this.field8787[var29] * var30) + 16383 >> 14;
                                 this.field8787[var29] = var32;
                              }

                              if (~arg2 != -1) {
                                 var33 = class593.field8539[arg2];
                                 var34 = class593.field8548[arg2];
                                 var35 = this.field8796[var29] * var34 + 16383 + -(this.field8791[var29] * var33) >> 14;
                                 this.field8791[var29] = this.field8796[var29] * var33 + this.field8791[var29] * var34 + 16383 >> 14;
                                 this.field8796[var29] = var35;
                              }

                              if (arg3 != 0) {
                                 var36 = class593.field8539[arg3];
                                 var37 = class593.field8548[arg3];
                                 var38 = this.field8791[var29] * var36 - -(this.field8787[var29] * var37) + 16383 >> 14;
                                 this.field8791[var29] = this.field8791[var29] * var37 + -(this.field8787[var29] * var36) + 16383 >> 14;
                                 this.field8787[var29] = var38;
                              }

                              this.field8787[var29] += class93.field1515;
                              this.field8796[var29] += class728.field10473;
                              this.field8791[var29] += class730.field10500;
                              ++var28;
                           }
                        }

                        while(var27.length > var28) {
                           var29 = var27[var28];
                           if (this.field8772 != null) {
                              if ((this.field8772[var29] & arg6) != 0) {
                                 this.field8787[var29] -= class93.field1515;
                                 this.field8796[var29] -= class728.field10473;
                                 this.field8791[var29] -= class730.field10500;
                                 if (~arg4 != -1) {
                                    var30 = class593.field8539[arg4];
                                    var31 = class593.field8548[arg4];
                                    var32 = this.field8796[var29] * var30 + this.field8787[var29] * var31 + 16383 >> 14;
                                    this.field8796[var29] = this.field8796[var29] * var31 + -(this.field8787[var29] * var30) + 16383 >> 14;
                                    this.field8787[var29] = var32;
                                 }

                                 if (~arg2 != -1) {
                                    var33 = class593.field8539[arg2];
                                    var34 = class593.field8548[arg2];
                                    var35 = this.field8796[var29] * var34 + 16383 + -(this.field8791[var29] * var33) >> 14;
                                    this.field8791[var29] = this.field8796[var29] * var33 + this.field8791[var29] * var34 + 16383 >> 14;
                                    this.field8796[var29] = var35;
                                 }

                                 if (arg3 != 0) {
                                    var36 = class593.field8539[arg3];
                                    var37 = class593.field8548[arg3];
                                    var38 = this.field8791[var29] * var36 - -(this.field8787[var29] * var37) + 16383 >> 14;
                                    this.field8791[var29] = this.field8791[var29] * var37 + -(this.field8787[var29] * var36) + 16383 >> 14;
                                    this.field8787[var29] = var38;
                                 }

                                 this.field8787[var29] += class93.field1515;
                                 this.field8796[var29] += class728.field10473;
                                 this.field8791[var29] += class730.field10500;
                                 ++var28;
                              } else {
                                 ++var28;
                              }
                           } else {
                              this.field8787[var29] -= class93.field1515;
                              this.field8796[var29] -= class728.field10473;
                              this.field8791[var29] -= class730.field10500;
                              if (~arg4 != -1) {
                                 var30 = class593.field8539[arg4];
                                 var31 = class593.field8548[arg4];
                                 var32 = this.field8796[var29] * var30 + this.field8787[var29] * var31 + 16383 >> 14;
                                 this.field8796[var29] = this.field8796[var29] * var31 + -(this.field8787[var29] * var30) + 16383 >> 14;
                                 this.field8787[var29] = var32;
                              }

                              if (~arg2 != -1) {
                                 var33 = class593.field8539[arg2];
                                 var34 = class593.field8548[arg2];
                                 var35 = this.field8796[var29] * var34 + 16383 + -(this.field8791[var29] * var33) >> 14;
                                 this.field8791[var29] = this.field8796[var29] * var33 + this.field8791[var29] * var34 + 16383 >> 14;
                                 this.field8796[var29] = var35;
                              }

                              if (arg3 != 0) {
                                 var36 = class593.field8539[arg3];
                                 var37 = class593.field8548[arg3];
                                 var38 = this.field8791[var29] * var36 - -(this.field8787[var29] * var37) + 16383 >> 14;
                                 this.field8791[var29] = this.field8791[var29] * var37 + -(this.field8787[var29] * var36) + 16383 >> 14;
                                 this.field8787[var29] = var38;
                              }

                              this.field8787[var29] += class93.field1515;
                              this.field8796[var29] += class728.field10473;
                              this.field8791[var29] += class730.field10500;
                              ++var28;
                           }
                        }

                        ++var25;
                     }

                     if (~var25 <= ~var10) {
                        var10000 = arg5;
                        if (!var9) {
                           if (arg5 == 0) {
                              break;
                           }

                           var39 = 0;
                           if (!var9 && var10 <= var39) {
                              this.method4471(-15824);
                              return;
                           }

                           do {
                              var40 = arg1[var39];
                              if (this.field8774.length <= var40) {
                                 ++var39;
                              } else {
                                 var41 = this.field8774[var40];
                                 var42 = 0;
                                 if (!var9 && ~var41.length >= ~var42) {
                                    ++var39;
                                 } else {
                                    label566:
                                    do {
                                       var43 = var41[var42];
                                       if (this.field8772 != null && ~(this.field8772[var43] & arg6) == -1) {
                                          ++var42;
                                       } else {
                                          var44 = this.field8857[var43];
                                          var45 = this.field8857[var43 + 1];
                                          var46 = var44;
                                          if (!var9 && ~var44 <= ~var45) {
                                             ++var42;
                                          } else {
                                             do {
                                                var47 = this.field8775[var46] + -1;
                                                if (~var47 == 0) {
                                                   ++var42;
                                                   continue label566;
                                                }

                                                if (~arg4 != -1) {
                                                   var48 = class593.field8539[arg4];
                                                   var49 = class593.field8548[arg4];
                                                   var50 = this.field8752[var47] * var48 + this.field8833[var47] * var49 + 16383 >> 14;
                                                   this.field8752[var47] = (short)(this.field8752[var47] * var49 + 16383 + -(this.field8833[var47] * var48) >> 14);
                                                   this.field8833[var47] = (short)var50;
                                                }

                                                if (~arg2 != -1) {
                                                   var51 = class593.field8539[arg2];
                                                   var52 = class593.field8548[arg2];
                                                   var53 = this.field8752[var47] * var52 + -(this.field8850[var47] * var51) + 16383 >> 14;
                                                   this.field8850[var47] = (short)(this.field8850[var47] * var52 + this.field8752[var47] * var51 + 16383 >> 14);
                                                   this.field8752[var47] = (short)var53;
                                                }

                                                if (~arg3 != -1) {
                                                   var54 = class593.field8539[arg3];
                                                   var55 = class593.field8548[arg3];
                                                   var56 = this.field8850[var47] * var54 + this.field8833[var47] * var55 + 16383 >> 14;
                                                   this.field8850[var47] = (short)(this.field8850[var47] * var55 - -16383 + -(this.field8833[var47] * var54) >> 14);
                                                   this.field8833[var47] = (short)var56;
                                                }

                                                ++var46;
                                             } while(~var46 > ~var45);

                                             ++var42;
                                          }
                                       }
                                    } while(~var41.length < ~var42);

                                    ++var39;
                                 }
                              }
                           } while(var10 > var39);

                           this.method4471(-15824);
                           return;
                        }
                     } else {
                        var10000 = arg1[var25];
                     }
                  }
               }

            } else if (arg0 == 3) {
               if (arg7 != null) {
                  int var115 = arg7[9] << 4;
                  int var116 = arg7[10] << 4;
                  int var117 = arg7[11] << 4;
                  int var118 = arg7[12] << 4;
                  int var119 = arg7[13] << 4;
                  int var120 = arg7[14] << 4;
                  if (class438.field6323) {
                     int var121 = arg7[6] * class730.field10500 + (arg7[0] * class93.field1515 - -(arg7[3] * class728.field10473)) + 8192 >> 14;
                     int var122 = arg7[1] * class93.field1515 - (-(arg7[4] * class728.field10473) + -(arg7[7] * class730.field10500)) + 8192 >> 14;
                     int var123 = var119 + var122;
                     int var124 = var118 + var121;
                     int var125 = arg7[2] * class93.field1515 + arg7[5] * class728.field10473 + arg7[8] * class730.field10500 + 8192 >> 14;
                     int var126 = var120 + var125;
                     class728.field10473 = var123;
                     class93.field1515 = var124;
                     class438.field6323 = false;
                     class730.field10500 = var126;
                  }

                  int[] var143;
                  int var145;
                  int var151;
                  int var152;
                  int var153;
                  label840: {
                     int var127 = arg2 << 15 >> 7;
                     int var128 = arg3 << 15 >> 7;
                     int var129 = arg4 << 15 >> 7;
                     int var130 = -class93.field1515 * var127 - -8192 >> 14;
                     int var131 = -class728.field10473 * var128 + 8192 >> 14;
                     int var132 = -class730.field10500 * var129 + 8192 >> 14;
                     int var133 = var130 - -class93.field1515;
                     int var134 = var131 - -class728.field10473;
                     int var135 = class730.field10500 + var132;
                     int[] var136 = new int[]{arg7[0] * var127 + 8192 >> 14, arg7[3] * var127 + 8192 >> 14, arg7[6] * var127 + 8192 >> 14, arg7[1] * var128 + 8192 >> 14, arg7[4] * var128 + 8192 >> 14, arg7[7] * var128 - -8192 >> 14, arg7[2] * var129 - -8192 >> 14, arg7[5] * var129 + 8192 >> 14, arg7[8] * var129 + 8192 >> 14};
                     int var137 = var118 * var127 + 8192 >> 14;
                     int var138 = var119 * var128 + 8192 >> 14;
                     int var139 = var133 + var137;
                     int var140 = var120 * var129 + 8192 >> 14;
                     int var141 = var134 + var138;
                     int var142 = var135 + var140;
                     var143 = new int[9];
                     int var144 = 0;
                     int var148;
                     int var149;
                     int var150;
                     if (var9) {
                        var145 = 0;
                     } else if (var144 >= 3) {
                        var148 = arg7[2] * var142 + (arg7[0] * var139 - -(arg7[1] * var141) - -8192) >> 14;
                        var149 = arg7[3] * var139 + arg7[4] * var141 + arg7[5] * var142 + 8192 >> 14;
                        var150 = arg7[7] * var141 + arg7[6] * var139 - (-(arg7[8] * var142) + -8192) >> 14;
                        var145 = var115 + var148;
                        var151 = var116 + var149;
                        var152 = var117 + var150;
                        var153 = 0;
                        if (!var9) {
                           break label840;
                        }
                     } else {
                        var145 = 0;
                     }

                     while(true) {
                        label837: {
                           int var146;
                           int var147;
                           if (var9) {
                              var146 = 0;
                              var147 = 0;
                              if (var9) {
                                 var146 += var136[var145 - -(var147 * 3)] * arg7[var144 * 3 + var147];
                                 ++var147;
                              }
                           } else {
                              if (var145 >= 3) {
                                 break label837;
                              }

                              var146 = 0;
                              var147 = 0;
                              if (var9) {
                                 var146 += var136[var145 - -(var147 * 3)] * arg7[var144 * 3 + var147];
                                 ++var147;
                              }
                           }

                           while(true) {
                              while(var147 < 3) {
                                 var146 += var136[var145 - -(var147 * 3)] * arg7[var144 * 3 + var147];
                                 ++var147;
                              }

                              var143[var144 * 3 - -var145] = var146 + 8192 >> 14;
                              if (!var9) {
                                 ++var145;
                                 if (var145 >= 3) {
                                    break;
                                 }

                                 var146 = 0;
                                 var147 = 0;
                                 if (var9) {
                                    var146 += var136[var145 - -(var147 * 3)] * arg7[var144 * 3 + var147];
                                    ++var147;
                                 }
                              } else {
                                 ++var147;
                              }
                           }
                        }

                        ++var144;
                        if (var144 >= 3) {
                           var148 = arg7[2] * var142 + (arg7[0] * var139 - -(arg7[1] * var141) - -8192) >> 14;
                           var149 = arg7[3] * var139 + arg7[4] * var141 + arg7[5] * var142 + 8192 >> 14;
                           var150 = arg7[7] * var141 + arg7[6] * var139 - (-(arg7[8] * var142) + -8192) >> 14;
                           var145 = var115 + var148;
                           var151 = var116 + var149;
                           var152 = var117 + var150;
                           var153 = 0;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var145 = 0;
                        }
                     }
                  }

                  if (var9 || ~var10 < ~var153) {
                     do {
                        int var154 = arg1[var153];
                        if (~this.field8774.length >= ~var154) {
                           ++var153;
                        } else {
                           int[] var155 = this.field8774[var154];
                           int var156 = 0;
                           if (!var9 && ~var155.length >= ~var156) {
                              ++var153;
                           } else {
                              do {
                                 int var157 = var155[var156];
                                 if (this.field8772 != null && (this.field8772[var157] & arg6) == 0) {
                                    ++var156;
                                 } else {
                                    int var158 = this.field8787[var157] * var143[0] + this.field8796[var157] * var143[1] + this.field8791[var157] * var143[2] - -8192 >> 14;
                                    int var159 = this.field8791[var157] * var143[5] + this.field8787[var157] * var143[3] + 8192 - -(this.field8796[var157] * var143[4]) >> 14;
                                    int var160 = var145 + var158;
                                    int var161 = this.field8791[var157] * var143[8] + (this.field8787[var157] * var143[6] - (-(this.field8796[var157] * var143[7]) - 8192)) >> 14;
                                    int var162 = var151 + var159;
                                    this.field8787[var157] = var160;
                                    int var163 = var152 + var161;
                                    this.field8796[var157] = var162;
                                    this.field8791[var157] = var163;
                                    ++var156;
                                 }
                              } while(~var155.length < ~var156);

                              ++var153;
                           }
                        }
                     } while(~var10 < ~var153);

                  }
               } else {
                  int var164 = 0;
                  if (var9 || ~var164 > ~var10) {
                     do {
                        int var165 = arg1[var164];
                        if (~this.field8774.length >= ~var165) {
                           ++var164;
                        } else {
                           int[] var166 = this.field8774[var165];
                           int var167 = 0;
                           if (!var9 && ~var166.length >= ~var167) {
                              ++var164;
                           } else {
                              do {
                                 int var168 = var166[var167];
                                 if (this.field8772 != null && ~(this.field8772[var168] & arg6) == -1) {
                                    ++var167;
                                 } else {
                                    this.field8787[var168] -= class93.field1515;
                                    this.field8796[var168] -= class728.field10473;
                                    this.field8791[var168] -= class730.field10500;
                                    this.field8787[var168] = this.field8787[var168] * arg2 >> 7;
                                    this.field8796[var168] = this.field8796[var168] * arg3 >> 7;
                                    this.field8791[var168] = this.field8791[var168] * arg4 >> 7;
                                    this.field8787[var168] += class93.field1515;
                                    this.field8796[var168] += class728.field10473;
                                    this.field8791[var168] += class730.field10500;
                                    ++var167;
                                 }
                              } while(~var166.length < ~var167);

                              ++var164;
                           }
                        }
                     } while(~var164 > ~var10);

                  }
               }
            } else if (arg0 == 5) {
               if (this.field8747 != null) {
                  label996: {
                     int var169 = 0;
                     int var170 = 0;
                     if (var9) {
                        var10000 = arg1[var170];
                     } else if (var170 >= var10) {
                        var10000 = var169;
                        if (!var9) {
                           break label996;
                        }
                     } else {
                        var10000 = arg1[var170];
                     }

                     while(true) {
                        int var171 = var10000;
                        if (var171 >= this.field8747.length) {
                           ++var170;
                        } else {
                           label1313: {
                              int[] var172 = this.field8747[var171];
                              int var173 = 0;
                              if (var9) {
                                 var10000 = var172[var173];
                              } else if (var172.length <= var173) {
                                 var10000 = var169;
                                 if (!var9) {
                                    var169 |= var172.length <= 0 ? 0 : 1;
                                    ++var170;
                                    break label1313;
                                 }
                              } else {
                                 var10000 = var172[var173];
                              }

                              while(true) {
                                 int var174 = var10000;
                                 if (this.field8814 != null && ~(this.field8814[var174] & arg6) == -1) {
                                    ++var173;
                                 } else {
                                    int var175 = (this.field8821[var174] & 255) + arg2 * 8;
                                    if (~var175 > -1) {
                                       var175 = 0;
                                       if (var9 && var175 > 255) {
                                          var175 = 255;
                                       }
                                    } else if (var175 > 255) {
                                       var175 = 255;
                                    }

                                    this.field8821[var174] = (byte)var175;
                                    ++var173;
                                 }

                                 if (var172.length <= var173) {
                                    var10000 = var169;
                                    if (!var9) {
                                       var169 |= var172.length <= 0 ? 0 : 1;
                                       ++var170;
                                       break;
                                    }
                                 } else {
                                    var10000 = var172[var173];
                                 }
                              }
                           }
                        }

                        if (var170 >= var10) {
                           var10000 = var169;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var10000 = arg1[var170];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     if (this.field8845 != null) {
                        int var176 = 0;
                        if (var9 || var176 < this.field8759) {
                           do {
                              class680 var177 = this.field8845[var176];
                              class358 var178 = this.field8820[var176];
                              var178.field5359 = 16777215 & var178.field5359 | -(255 & this.field8821[var177.field9968]) + 255 << 24;
                              ++var176;
                           } while(var176 < this.field8759);
                        }
                     }

                     this.method4472((byte)-126);
                  }
               }

            } else if (~arg0 == -8) {
               if (this.field8747 != null) {
                  label1091: {
                     int var179 = 0;
                     int var180 = 0;
                     if (var9) {
                        var10000 = arg1[var180];
                     } else if (var10 <= var180) {
                        var10000 = var179;
                        if (!var9) {
                           break label1091;
                        }
                     } else {
                        var10000 = arg1[var180];
                     }

                     while(true) {
                        int var181 = var10000;
                        if (this.field8747.length <= var181) {
                           ++var180;
                        } else {
                           label1319: {
                              int[] var182 = this.field8747[var181];
                              int var183 = 0;
                              if (var9) {
                                 var10000 = var182[var183];
                              } else if (~var182.length >= ~var183) {
                                 var10000 = var179;
                                 if (!var9) {
                                    var179 |= ~var182.length >= -1 ? 0 : 1;
                                    ++var180;
                                    break label1319;
                                 }
                              } else {
                                 var10000 = var182[var183];
                              }

                              while(true) {
                                 int var184 = var10000;
                                 if (this.field8814 != null && (arg6 & this.field8814[var184]) == 0) {
                                    ++var183;
                                 } else {
                                    int var185 = 65535 & this.field8831[var184];
                                    int var186 = (65304 & var185) >> 10;
                                    int var187 = (var185 & 907) >> 7;
                                    int var188 = 63 & arg2 + var186;
                                    int var189 = var185 & 127;
                                    int var190 = arg3 / 4 + var187;
                                    int var191 = arg4 + var189;
                                    if (var190 < 0) {
                                       var190 = 0;
                                       if (var9 && var190 > 7) {
                                          var190 = 7;
                                       }
                                    } else if (var190 > 7) {
                                       var190 = 7;
                                    }

                                    if (var191 < 0) {
                                       var191 = 0;
                                       if (var9 && var191 > 127) {
                                          var191 = 127;
                                       }
                                    } else if (var191 > 127) {
                                       var191 = 127;
                                    }

                                    this.field8831[var184] = (short)class93.method899(class93.method899(var188 << 10, var190 << 7), var191);
                                    ++var183;
                                 }

                                 if (~var182.length >= ~var183) {
                                    var10000 = var179;
                                    if (!var9) {
                                       var179 |= ~var182.length >= -1 ? 0 : 1;
                                       ++var180;
                                       break;
                                    }
                                 } else {
                                    var10000 = var182[var183];
                                 }
                              }
                           }
                        }

                        if (var10 <= var180) {
                           var10000 = var179;
                           if (!var9) {
                              break;
                           }
                        } else {
                           var10000 = arg1[var180];
                        }
                     }
                  }

                  if (var10000 != 0) {
                     if (this.field8845 != null) {
                        int var192 = 0;
                        if (var9 || ~var192 > ~this.field8759) {
                           do {
                              class680 var193 = this.field8845[var192];
                              class358 var194 = this.field8820[var192];
                              var194.field5359 = -16777216 & var194.field5359 | 16777215 & class451.field6600[this.field8831[var193.field9968] & 65535];
                              ++var192;
                           } while(~var192 > ~this.field8759);
                        }
                     }

                     this.method4472((byte)-126);
                  }
               }

            } else if (arg0 == 8) {
               if (this.field8822 != null) {
                  int var195 = 0;
                  if (var9 || var195 < var10) {
                     do {
                        int var196 = arg1[var195];
                        if (~this.field8822.length >= ~var196) {
                           ++var195;
                        } else {
                           int[] var197 = this.field8822[var196];
                           int var198 = 0;
                           if (!var9 && ~var197.length >= ~var198) {
                              ++var195;
                           } else {
                              do {
                                 class358 var199 = this.field8820[var197[var198]];
                                 var199.field5353 += arg2;
                                 var199.field5356 += arg3;
                                 ++var198;
                              } while(~var197.length < ~var198);

                              ++var195;
                           }
                        }
                     } while(var195 < var10);
                  }
               }

            } else if (~arg0 == -11) {
               if (this.field8822 != null) {
                  int var200 = 0;
                  if (var9 || ~var200 > ~var10) {
                     do {
                        int var201 = arg1[var200];
                        if (~this.field8822.length >= ~var201) {
                           ++var200;
                        } else {
                           int[] var202 = this.field8822[var201];
                           int var203 = 0;
                           if (!var9 && ~var202.length >= ~var203) {
                              ++var200;
                           } else {
                              do {
                                 class358 var204 = this.field8820[var202[var203]];
                                 var204.field5363 = var204.field5363 * arg2 >> 7;
                                 var204.field5355 = var204.field5355 * arg3 >> 7;
                                 ++var203;
                              } while(~var202.length < ~var203);

                              ++var200;
                           }
                        }
                     } while(~var200 > ~var10);
                  }
               }

            } else if (arg0 == 9) {
               if (this.field8822 != null) {
                  int var205 = 0;
                  if (var9 || ~var10 < ~var205) {
                     do {
                        int var206 = arg1[var205];
                        if (this.field8822.length <= var206) {
                           ++var205;
                        } else {
                           int[] var207 = this.field8822[var206];
                           int var208 = 0;
                           if (!var9 && ~var207.length >= ~var208) {
                              ++var205;
                           } else {
                              do {
                                 class358 var209 = this.field8820[var207[var208]];
                                 var209.field5354 = 16383 & var209.field5354 + arg2;
                                 ++var208;
                              } while(~var207.length < ~var208);

                              ++var205;
                           }
                        }
                     } while(~var10 < ~var205);
                  }
               }

            }
         } else {
            arg4 <<= 4;
            arg2 <<= 4;
            arg3 <<= 4;
            class730.field10500 = 0;
            class93.field1515 = 0;
            class728.field10473 = 0;
            int var11 = 0;
            int var12 = 0;
            if (var9) {
               var10000 = arg1[var12];
            } else if (~var12 <= ~var10) {
               var10000 = var11;
               if (!var9) {
                  if (var11 <= 0) {
                     class728.field10473 = arg3;
                     class730.field10500 = arg4;
                     class93.field1515 = arg2;
                     return;
                  }

                  class438.field6323 = true;
                  class730.field10500 = class730.field10500 / var11 + arg4;
                  class93.field1515 = class93.field1515 / var11 + arg2;
                  class728.field10473 = class728.field10473 / var11 + arg3;
                  return;
               }
            } else {
               var10000 = arg1[var12];
            }

            while(true) {
               int var13 = var10000;
               if (~this.field8774.length >= ~var13) {
                  ++var12;
               } else {
                  int[] var14 = this.field8774[var13];
                  int var15 = 0;
                  int var16;
                  if (var9) {
                     var16 = var14[var15];
                     if (this.field8772 != null) {
                        if ((arg6 & this.field8772[var16]) != 0) {
                           class93.field1515 += this.field8787[var16];
                           class728.field10473 += this.field8796[var16];
                           class730.field10500 += this.field8791[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class93.field1515 += this.field8787[var16];
                        class728.field10473 += this.field8796[var16];
                        class730.field10500 += this.field8791[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  while(var15 < var14.length) {
                     var16 = var14[var15];
                     if (this.field8772 != null) {
                        if ((arg6 & this.field8772[var16]) != 0) {
                           class93.field1515 += this.field8787[var16];
                           class728.field10473 += this.field8796[var16];
                           class730.field10500 += this.field8791[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class93.field1515 += this.field8787[var16];
                        class728.field10473 += this.field8796[var16];
                        class730.field10500 += this.field8791[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (~var12 <= ~var10) {
                  var10000 = var11;
                  if (!var9) {
                     if (var11 <= 0) {
                        class728.field10473 = arg3;
                        class730.field10500 = arg4;
                        class93.field1515 = arg2;
                        return;
                     }

                     class438.field6323 = true;
                     class730.field10500 = class730.field10500 / var11 + arg4;
                     class93.field1515 = class93.field1515 / var11 + arg2;
                     class728.field10473 = class728.field10473 / var11 + arg3;
                     return;
                  }
               } else {
                  var10000 = arg1[var12];
               }
            }
         }
      } catch (RuntimeException var211) {
         throw class608.method4462(var211, field8869[4] + arg0 + ',' + (arg1 != null ? field8869[2] : field8869[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field8869[2] : field8869[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "NA",
      descriptor = "()Z",
      line = 1557
   )
   public final boolean method542() {
      boolean var1 = client.field4564;

      try {
         ++field8802;
         if (this.field8774 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var1) {
               this.field8787[var2] <<= 4;
               this.field8796[var2] <<= 4;
               this.field8791[var2] <<= 4;
               ++var2;
            }

            while(true) {
               while(~var2 > ~this.field8757) {
                  this.field8787[var2] <<= 4;
                  this.field8796[var2] <<= 4;
                  this.field8791[var2] <<= 4;
                  ++var2;
               }

               class93.field1515 = 0;
               class730.field10500 = 0;
               class728.field10473 = 0;
               if (!var1) {
                  return true;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8869[42] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "ba",
      descriptor = "(Lr;)Lr;",
      line = 1587
   )
   public final class192 method547(class192 arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8781;
         if (~this.field8813 == -1) {
            return null;
         } else {
            if (!this.field8760) {
               this.method4482(-32768);
            }

            int var3;
            int var4;
            label48: {
               if (this.field8835.field5275 > 0) {
                  var3 = -(this.field8835.field5275 * this.field8785 >> 8) + this.field8778 >> this.field8835.field5226;
                  var4 = this.field8803 - (this.field8835.field5275 * this.field8754 >> 8) >> this.field8835.field5226;
                  if (!var2) {
                     break label48;
                  }
               }

               var3 = -(this.field8835.field5275 * this.field8754 >> 8) + this.field8778 >> this.field8835.field5226;
               var4 = -(this.field8835.field5275 * this.field8785 >> 8) + this.field8803 >> this.field8835.field5226;
            }

            int var5;
            int var6;
            label43: {
               if (~this.field8835.field5303 >= -1) {
                  var5 = this.field8818 - (this.field8835.field5303 * this.field8754 >> 8) >> this.field8835.field5226;
                  var6 = -(this.field8835.field5303 * this.field8785 >> 8) + this.field8810 >> this.field8835.field5226;
                  if (!var2) {
                     break label43;
                  }
               }

               var5 = -(this.field8835.field5303 * this.field8785 >> 8) + this.field8818 >> this.field8835.field5226;
               var6 = -(this.field8835.field5303 * this.field8754 >> 8) + this.field8810 >> this.field8835.field5226;
            }

            class125 var10;
            label60: {
               int var7 = -var3 - -1 + var4;
               int var8 = var6 - (var5 + -1);
               class125 var9 = (class125)arg0;
               if (var9 == null || !var9.method1216((byte)105, var8, var7)) {
                  var10 = new class125(this.field8835, var7, var8);
                  if (!var2) {
                     break label60;
                  }
               }

               var10 = var9;
               var9.method1215(-1);
            }

            var10.method1219(var3, var6, var5, var4, 121);
            this.method4479(var10, -295);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field8869[38] + (arg0 != null ? field8869[2] : field8869[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "G",
      descriptor = "()I",
      line = 1646
   )
   public final int method546() {
      try {
         if (!this.field8760) {
            this.method4482(-32768);
         }

         ++field8848;
         return this.field8810;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[53] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "e",
      descriptor = "()V",
      line = 1659
   )
   public final void method508() {
      try {
         ++field8804;
         if (this.field8813 > 0 && this.field8863 > 0) {
            this.method4475(true);
            this.method4481((byte)-114);
            this.method4480(true);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[31] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "ma",
      descriptor = "()I",
      line = 1675
   )
   public final int method548() {
      try {
         ++field8745;
         if (!this.field8760) {
            this.method4482(-32768);
         }

         return this.field8788;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(BIZ)Lka;",
      line = 1690
   )
   public final class495 method549(byte arg0, int arg1, boolean arg2) {
      boolean var4 = client.field4564;

      try {
         ++field8771;
         class610 var5;
         class610 var6;
         if (arg0 == 1) {
            var5 = this.field8835.field5336;
            var6 = this.field8835.field5346;
            if (!var4) {
               return this.method4470(arg0 != 0, var5, (byte)-75, arg1, arg2, var6);
            }
         }

         if (arg0 != 2) {
            if (~arg0 != -4) {
               if (arg0 == 4) {
                  var6 = this.field8835.field5339;
                  var5 = this.field8835.field5328;
                  if (!var4) {
                     return this.method4470(arg0 != 0, var5, (byte)-75, arg1, arg2, var6);
                  }
               }

               if (~arg0 != -6) {
                  var5 = var6 = new class610(this.field8835, 0, 0, true, false);
                  if (!var4) {
                     return this.method4470(arg0 != 0, var5, (byte)-75, arg1, arg2, var6);
                  }
               }

               var5 = this.field8835.field5327;
               var6 = this.field8835.field5343;
               if (!var4) {
                  return this.method4470(arg0 != 0, var5, (byte)-75, arg1, arg2, var6);
               }
            }

            var6 = this.field8835.field5340;
            var5 = this.field8835.field5329;
            if (!var4) {
               return this.method4470(arg0 != 0, var5, (byte)-75, arg1, arg2, var6);
            }
         }

         var6 = this.field8835.field5338;
         var5 = this.field8835.field5333;
         return this.method4470(arg0 != 0, var5, (byte)-75, arg1, arg2, var6);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8869[64] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "g",
      descriptor = "(I)V",
      line = 1738
   )
   private final void method4471(int arg0) {
      try {
         if (arg0 == -15824) {
            label26: {
               if ((this.field8851 & 55) == 0) {
                  if (this.field8755 == null) {
                     break label26;
                  }

                  this.field8755.field3479 = false;
                  if (!client.field4564) {
                     break label26;
                  }
               }

               if (this.field8866 != null) {
                  this.field8866.field3479 = false;
               }
            }

            ++field8846;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[50] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "c",
      descriptor = "(B)V",
      line = 1767
   )
   private final void method4472(byte arg0) {
      try {
         ++field8859;
         if (arg0 != -126) {
            this.field8868 = null;
         }

         if (this.field8755 != null) {
            this.field8755.field3479 = false;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "<init>",
      descriptor = "(Lcs;IIZZ)V",
      line = 6289
   )
   public class610(class357 arg0, int arg1, int arg2, boolean arg3, boolean arg4) {
      this.field8760 = false;
      this.field8757 = 0;
      this.field8815 = 0;
      this.field8764 = true;
      this.field8832 = false;
      this.field8813 = 0;
      this.field8841 = false;
      this.field8838 = 0;
      this.field8861 = false;
      this.field8863 = 0;

      try {
         this.field8851 = arg2;
         this.field8841 = arg4;
         this.field8835 = arg0;
         this.field8840 = arg1;
         if (arg3 || class641.method4697(this.field8851, this.field8840, -1)) {
            this.field8867 = new class240(class624.method4571(this.field8840, this.field8851, -48));
         }

         if (arg3 || class238.method1950(105, this.field8840, this.field8851)) {
            this.field8828 = new class240(class679.method4956(this.field8840, -94, this.field8851));
         }

         if (arg3 || class27.method191(this.field8840, (byte)-118, this.field8851)) {
            this.field8755 = new class240(class383.method2980(this.field8840, 0, this.field8851));
         }

         if (arg3 || class577.method4262(this.field8840, 0, this.field8851)) {
            this.field8866 = new class240(class139.method1298((byte)-123, this.field8840, this.field8851));
         }

         if (arg3 || class609.method4467(this.field8840, 22311, this.field8851)) {
            this.field8746 = new class36(class330.method2552(this.field8851, this.field8840, -1));
         }

      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8869[13] + (arg0 != null ? field8869[2] : field8869[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "f",
      descriptor = "(I)V",
      line = 1785
   )
   private final void method4473(int arg0) {
      try {
         if (this.field8867 != null) {
            this.field8867.field3479 = false;
         }

         if (arg0 < -77) {
            ++field8794;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[16] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "fa",
      descriptor = "()I",
      line = 1804
   )
   public final int method540() {
      try {
         if (!this.field8760) {
            this.method4482(-32768);
         }

         ++field8786;
         return this.field8754;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "H",
      descriptor = "(III)V",
      line = 1817
   )
   public final void method514(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(I[IIIIIZ)V",
      line = 1848
   )
   public final void method505(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      boolean var8 = client.field4564;

      try {
         ++field8777;
         int var9 = arg1.length;
         int var10000;
         int var112;
         int var113;
         int var114;
         if (~arg0 != -1) {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  if (arg0 != 3) {
                     if (arg0 == 5) {
                        if (this.field8747 != null) {
                           label354: {
                              int var69 = 0;
                              int var70 = 0;
                              if (var8) {
                                 var10000 = arg1[var70];
                              } else if (~var9 >= ~var70) {
                                 var10000 = var69;
                                 if (!var8) {
                                    break label354;
                                 }
                              } else {
                                 var10000 = arg1[var70];
                              }

                              while(true) {
                                 int var71 = var10000;
                                 if (~this.field8747.length >= ~var71) {
                                    ++var70;
                                 } else {
                                    label853: {
                                       int[] var72 = this.field8747[var71];
                                       int var73 = 0;
                                       if (var8) {
                                          var10000 = var72[var73];
                                       } else if (~var73 <= ~var72.length) {
                                          var10000 = var69;
                                          if (!var8) {
                                             var69 |= ~var72.length >= -1 ? 0 : 1;
                                             ++var70;
                                             break label853;
                                          }
                                       } else {
                                          var10000 = var72[var73];
                                       }

                                       while(true) {
                                          int var74 = var10000;
                                          int var75 = (this.field8821[var74] & 255) + arg2 * 8;
                                          if (var75 < 0) {
                                             short var115 = 0;
                                             if (var8) {
                                                if (~var115 < -256) {
                                                   var115 = 255;
                                                }

                                                this.field8821[var74] = (byte)var115;
                                                ++var73;
                                             } else {
                                                this.field8821[var74] = (byte)var115;
                                                ++var73;
                                             }
                                          } else {
                                             if (~var75 < -256) {
                                                var75 = 255;
                                             }

                                             this.field8821[var74] = (byte)var75;
                                             ++var73;
                                          }

                                          if (~var73 <= ~var72.length) {
                                             var10000 = var69;
                                             if (!var8) {
                                                var69 |= ~var72.length >= -1 ? 0 : 1;
                                                ++var70;
                                                break;
                                             }
                                          } else {
                                             var10000 = var72[var73];
                                          }
                                       }
                                    }
                                 }

                                 if (~var9 >= ~var70) {
                                    var10000 = var69;
                                    if (!var8) {
                                       break;
                                    }
                                 } else {
                                    var10000 = arg1[var70];
                                 }
                              }
                           }

                           if (var10000 != 0) {
                              if (this.field8845 != null) {
                                 int var76 = 0;
                                 if (var8 || var76 < this.field8759) {
                                    do {
                                       class680 var77 = this.field8845[var76];
                                       class358 var78 = this.field8820[var76];
                                       var78.field5359 = -(this.field8821[var77.field9968] & 255) + 255 << 24 | var78.field5359 & 16777215;
                                       ++var76;
                                    } while(var76 < this.field8759);
                                 }
                              }

                              this.method4472((byte)-126);
                           }
                        }

                     } else if (~arg0 == -8) {
                        if (this.field8747 != null) {
                           label437: {
                              int var79 = 0;
                              int var80 = 0;
                              if (var8) {
                                 var10000 = arg1[var80];
                              } else if (var80 >= var9) {
                                 var10000 = var79;
                                 if (!var8) {
                                    break label437;
                                 }
                              } else {
                                 var10000 = arg1[var80];
                              }

                              while(true) {
                                 int var81 = var10000;
                                 if (~var81 <= ~this.field8747.length) {
                                    ++var80;
                                 } else {
                                    label859: {
                                       int[] var82 = this.field8747[var81];
                                       int var83 = 0;
                                       if (var8) {
                                          var10000 = var82[var83];
                                       } else if (~var83 <= ~var82.length) {
                                          var10000 = var79;
                                          if (!var8) {
                                             var79 |= var82.length <= 0 ? 0 : 1;
                                             ++var80;
                                             break label859;
                                          }
                                       } else {
                                          var10000 = var82[var83];
                                       }

                                       while(true) {
                                          int var84 = var10000;
                                          int var85 = this.field8831[var84] & 65535;
                                          int var86 = 63 & var85 >> 10;
                                          int var87 = 7 & var85 >> 7;
                                          int var88 = var85 & 127;
                                          int var89 = arg3 / 4 + var87;
                                          int var90 = 63 & arg2 + var86;
                                          int var91 = arg4 + var88;
                                          if (var89 >= 0) {
                                             if (var89 > 7) {
                                                var89 = 7;
                                                if (var8) {
                                                   var89 = 0;
                                                }
                                             }
                                          } else {
                                             var89 = 0;
                                          }

                                          if (var91 >= 0) {
                                             if (~var91 < -128) {
                                                var91 = 127;
                                                if (var8) {
                                                   var91 = 0;
                                                }
                                             }
                                          } else {
                                             var91 = 0;
                                          }

                                          this.field8831[var84] = (short)class93.method899(class93.method899(var89 << 7, var90 << 10), var91);
                                          ++var83;
                                          if (~var83 <= ~var82.length) {
                                             var10000 = var79;
                                             if (!var8) {
                                                var79 |= var82.length <= 0 ? 0 : 1;
                                                ++var80;
                                                break;
                                             }
                                          } else {
                                             var10000 = var82[var83];
                                          }
                                       }
                                    }
                                 }

                                 if (var80 >= var9) {
                                    var10000 = var79;
                                    if (!var8) {
                                       break;
                                    }
                                 } else {
                                    var10000 = arg1[var80];
                                 }
                              }
                           }

                           if (var10000 != 0) {
                              if (this.field8845 != null) {
                                 int var92 = 0;
                                 if (var8 || ~var92 > ~this.field8759) {
                                    do {
                                       class680 var93 = this.field8845[var92];
                                       class358 var94 = this.field8820[var92];
                                       var94.field5359 = var94.field5359 & -16777216 | 16777215 & class451.field6600[this.field8831[var93.field9968] & 65535];
                                       ++var92;
                                    } while(~var92 > ~this.field8759);
                                 }
                              }

                              this.method4472((byte)-126);
                           }
                        }

                     } else if (arg0 == 8) {
                        if (this.field8822 != null) {
                           int var95 = 0;
                           if (var8 || var9 > var95) {
                              do {
                                 int var96 = arg1[var95];
                                 if (var96 >= this.field8822.length) {
                                    ++var95;
                                 } else {
                                    int[] var97 = this.field8822[var96];
                                    int var98 = 0;
                                    if (!var8 && var97.length <= var98) {
                                       ++var95;
                                    } else {
                                       do {
                                          class358 var99 = this.field8820[var97[var98]];
                                          var99.field5353 += arg2;
                                          var99.field5356 += arg3;
                                          ++var98;
                                       } while(var97.length > var98);

                                       ++var95;
                                    }
                                 }
                              } while(var9 > var95);
                           }
                        }

                     } else if (arg0 == 10) {
                        if (this.field8822 != null) {
                           int var100 = 0;
                           if (var8 || ~var9 < ~var100) {
                              do {
                                 int var101 = arg1[var100];
                                 if (~var101 <= ~this.field8822.length) {
                                    ++var100;
                                 } else {
                                    int[] var102 = this.field8822[var101];
                                    int var103 = 0;
                                    if (!var8 && ~var103 <= ~var102.length) {
                                       ++var100;
                                    } else {
                                       do {
                                          class358 var104 = this.field8820[var102[var103]];
                                          var104.field5363 = var104.field5363 * arg2 >> 7;
                                          var104.field5355 = var104.field5355 * arg3 >> 7;
                                          ++var103;
                                       } while(~var103 > ~var102.length);

                                       ++var100;
                                    }
                                 }
                              } while(~var9 < ~var100);
                           }
                        }

                     } else if (~arg0 == -10) {
                        if (this.field8822 != null) {
                           int var105 = 0;
                           if (var8 || var9 > var105) {
                              do {
                                 int var106 = arg1[var105];
                                 if (var106 >= this.field8822.length) {
                                    ++var105;
                                 } else {
                                    int[] var107 = this.field8822[var106];
                                    int var108 = 0;
                                    if (!var8 && var108 >= var107.length) {
                                       ++var105;
                                    } else {
                                       do {
                                          class358 var109 = this.field8820[var107[var108]];
                                          var109.field5354 = var109.field5354 + arg2 & 16383;
                                          ++var108;
                                       } while(var108 < var107.length);

                                       ++var105;
                                    }
                                 }
                              } while(var9 > var105);
                           }
                        }

                     }
                  } else {
                     int var64 = 0;
                     if (var8 || var64 < var9) {
                        do {
                           int var65 = arg1[var64];
                           if (~var65 <= ~this.field8774.length) {
                              ++var64;
                           } else {
                              int[] var66 = this.field8774[var65];
                              int var67 = 0;
                              if (!var8 && var66.length <= var67) {
                                 ++var64;
                              } else {
                                 do {
                                    int var68 = var66[var67];
                                    this.field8787[var68] -= class93.field1515;
                                    this.field8796[var68] -= class728.field10473;
                                    this.field8791[var68] -= class730.field10500;
                                    this.field8787[var68] = this.field8787[var68] * arg2 >> 7;
                                    this.field8796[var68] = this.field8796[var68] * arg3 >> 7;
                                    this.field8791[var68] = this.field8791[var68] * arg4 >> 7;
                                    this.field8787[var68] += class93.field1515;
                                    this.field8796[var68] += class728.field10473;
                                    this.field8791[var68] += class730.field10500;
                                    ++var67;
                                 } while(var66.length > var67);

                                 ++var64;
                              }
                           }
                        } while(var64 < var9);

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
                  } else if (var9 <= var21) {
                     var10000 = arg6;
                     if (!var8) {
                        if (arg6 != 0) {
                           var46 = 0;
                           if (var8 || ~var46 > ~var9) {
                              do {
                                 var47 = arg1[var46];
                                 if (~var47 <= ~this.field8774.length) {
                                    ++var46;
                                 } else {
                                    var48 = this.field8774[var47];
                                    var49 = 0;
                                    if (!var8 && var49 >= var48.length) {
                                       ++var46;
                                    } else {
                                       label669:
                                       do {
                                          var50 = var48[var49];
                                          var51 = this.field8857[var50];
                                          var52 = this.field8857[var50 + 1];
                                          var53 = var51;
                                          if (!var8 && var52 <= var51) {
                                             ++var49;
                                          } else {
                                             do {
                                                var54 = this.field8775[var53] - 1;
                                                if (var54 == -1) {
                                                   ++var49;
                                                   continue label669;
                                                }

                                                if (arg4 != 0) {
                                                   var55 = class593.field8539[arg4];
                                                   var56 = class593.field8548[arg4];
                                                   var57 = this.field8752[var54] * var55 + this.field8833[var54] * var56 + 16383 >> 14;
                                                   this.field8752[var54] = (short)(this.field8752[var54] * var56 + -(this.field8833[var54] * var55) + 16383 >> 14);
                                                   this.field8833[var54] = (short)var57;
                                                }

                                                if (arg2 != 0) {
                                                   var58 = class593.field8539[arg2];
                                                   var59 = class593.field8548[arg2];
                                                   var60 = this.field8752[var54] * var59 - this.field8850[var54] * var58 + 16383 >> 14;
                                                   this.field8850[var54] = (short)(this.field8752[var54] * var58 + this.field8850[var54] * var59 + 16383 >> 14);
                                                   this.field8752[var54] = (short)var60;
                                                }

                                                if (arg3 != 0) {
                                                   var61 = class593.field8539[arg3];
                                                   var62 = class593.field8548[arg3];
                                                   var63 = this.field8850[var54] * var61 + this.field8833[var54] * var62 + 16383 >> 14;
                                                   this.field8850[var54] = (short)(this.field8850[var54] * var62 + 16383 + -(this.field8833[var54] * var61) >> 14);
                                                   this.field8833[var54] = (short)var63;
                                                }

                                                ++var53;
                                             } while(var52 > var53);

                                             ++var49;
                                          }
                                       } while(var49 < var48.length);

                                       ++var46;
                                    }
                                 }
                              } while(~var46 > ~var9);
                           }

                           this.method4471(-15824);
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var21];
                  }

                  while(true) {
                     int var22 = var10000;
                     if (~var22 <= ~this.field8774.length) {
                        ++var21;
                     } else {
                        label870: {
                           int[] var23 = this.field8774[var22];
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
                           if ((arg5 & 1) == 0) {
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
                                 this.field8787[var25] -= class93.field1515;
                                 this.field8796[var25] -= class728.field10473;
                                 this.field8791[var25] -= class730.field10500;
                                 if (~arg4 != -1) {
                                    var26 = class593.field8539[arg4];
                                    var27 = class593.field8548[arg4];
                                    var28 = this.field8796[var25] * var26 + this.field8787[var25] * var27 + 16383 >> 14;
                                    this.field8796[var25] = this.field8796[var25] * var27 - this.field8787[var25] * var26 + 16383 >> 14;
                                    this.field8787[var25] = var28;
                                 }

                                 if (arg2 != 0) {
                                    var29 = class593.field8539[arg2];
                                    var30 = class593.field8548[arg2];
                                    var31 = this.field8796[var25] * var30 - this.field8791[var25] * var29 + 16383 >> 14;
                                    this.field8791[var25] = this.field8791[var25] * var30 + this.field8796[var25] * var29 + 16383 >> 14;
                                    this.field8796[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class593.field8539[arg3];
                                    var33 = class593.field8548[arg3];
                                    var34 = this.field8791[var25] * var32 + this.field8787[var25] * var33 - -16383 >> 14;
                                    this.field8791[var25] = this.field8791[var25] * var33 + -(this.field8787[var25] * var32) + 16383 >> 14;
                                    this.field8787[var25] = var34;
                                 }

                                 this.field8787[var25] += class93.field1515;
                                 this.field8796[var25] += class728.field10473;
                                 this.field8791[var25] += class730.field10500;
                                 ++var24;
                              }

                              while(~var23.length < ~var24) {
                                 var25 = var23[var24];
                                 this.field8787[var25] -= class93.field1515;
                                 this.field8796[var25] -= class728.field10473;
                                 this.field8791[var25] -= class730.field10500;
                                 if (~arg4 != -1) {
                                    var26 = class593.field8539[arg4];
                                    var27 = class593.field8548[arg4];
                                    var28 = this.field8796[var25] * var26 + this.field8787[var25] * var27 + 16383 >> 14;
                                    this.field8796[var25] = this.field8796[var25] * var27 - this.field8787[var25] * var26 + 16383 >> 14;
                                    this.field8787[var25] = var28;
                                 }

                                 if (arg2 != 0) {
                                    var29 = class593.field8539[arg2];
                                    var30 = class593.field8548[arg2];
                                    var31 = this.field8796[var25] * var30 - this.field8791[var25] * var29 + 16383 >> 14;
                                    this.field8791[var25] = this.field8791[var25] * var30 + this.field8796[var25] * var29 + 16383 >> 14;
                                    this.field8796[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class593.field8539[arg3];
                                    var33 = class593.field8548[arg3];
                                    var34 = this.field8791[var25] * var32 + this.field8787[var25] * var33 - -16383 >> 14;
                                    this.field8791[var25] = this.field8791[var25] * var33 + -(this.field8787[var25] * var32) + 16383 >> 14;
                                    this.field8787[var25] = var34;
                                 }

                                 this.field8787[var25] += class93.field1515;
                                 this.field8796[var25] += class728.field10473;
                                 this.field8791[var25] += class730.field10500;
                                 ++var24;
                              }

                              if (!var8) {
                                 ++var21;
                                 break label870;
                              }

                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field8787[var36] -= class93.field1515;
                                 this.field8796[var36] -= class728.field10473;
                                 this.field8791[var36] -= class730.field10500;
                                 if (~arg2 != -1) {
                                    var37 = class593.field8539[arg2];
                                    var38 = class593.field8548[arg2];
                                    var39 = this.field8796[var36] * var38 + 16383 + -(this.field8791[var36] * var37) >> 14;
                                    this.field8791[var36] = this.field8796[var36] * var37 + 16383 - -(this.field8791[var36] * var38) >> 14;
                                    this.field8796[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class593.field8539[arg4];
                                    var41 = class593.field8548[arg4];
                                    var42 = this.field8796[var36] * var40 + this.field8787[var36] * var41 - -16383 >> 14;
                                    this.field8796[var36] = this.field8796[var36] * var41 - this.field8787[var36] * var40 + 16383 >> 14;
                                    this.field8787[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class593.field8539[arg3];
                                    var44 = class593.field8548[arg3];
                                    var45 = this.field8791[var36] * var43 + (this.field8787[var36] * var44 - -16383) >> 14;
                                    this.field8791[var36] = this.field8791[var36] * var44 - this.field8787[var36] * var43 - -16383 >> 14;
                                    this.field8787[var36] = var45;
                                 }

                                 this.field8787[var36] += class93.field1515;
                                 this.field8796[var36] += class728.field10473;
                                 this.field8791[var36] += class730.field10500;
                                 ++var35;
                              }
                           } else {
                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field8787[var36] -= class93.field1515;
                                 this.field8796[var36] -= class728.field10473;
                                 this.field8791[var36] -= class730.field10500;
                                 if (~arg2 != -1) {
                                    var37 = class593.field8539[arg2];
                                    var38 = class593.field8548[arg2];
                                    var39 = this.field8796[var36] * var38 + 16383 + -(this.field8791[var36] * var37) >> 14;
                                    this.field8791[var36] = this.field8796[var36] * var37 + 16383 - -(this.field8791[var36] * var38) >> 14;
                                    this.field8796[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class593.field8539[arg4];
                                    var41 = class593.field8548[arg4];
                                    var42 = this.field8796[var36] * var40 + this.field8787[var36] * var41 - -16383 >> 14;
                                    this.field8796[var36] = this.field8796[var36] * var41 - this.field8787[var36] * var40 + 16383 >> 14;
                                    this.field8787[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class593.field8539[arg3];
                                    var44 = class593.field8548[arg3];
                                    var45 = this.field8791[var36] * var43 + (this.field8787[var36] * var44 - -16383) >> 14;
                                    this.field8791[var36] = this.field8791[var36] * var44 - this.field8787[var36] * var43 - -16383 >> 14;
                                    this.field8787[var36] = var45;
                                 }

                                 this.field8787[var36] += class93.field1515;
                                 this.field8796[var36] += class728.field10473;
                                 this.field8791[var36] += class730.field10500;
                                 ++var35;
                              }
                           }

                           while(~var23.length < ~var35) {
                              var36 = var23[var35];
                              this.field8787[var36] -= class93.field1515;
                              this.field8796[var36] -= class728.field10473;
                              this.field8791[var36] -= class730.field10500;
                              if (~arg2 != -1) {
                                 var37 = class593.field8539[arg2];
                                 var38 = class593.field8548[arg2];
                                 var39 = this.field8796[var36] * var38 + 16383 + -(this.field8791[var36] * var37) >> 14;
                                 this.field8791[var36] = this.field8796[var36] * var37 + 16383 - -(this.field8791[var36] * var38) >> 14;
                                 this.field8796[var36] = var39;
                              }

                              if (~arg4 != -1) {
                                 var40 = class593.field8539[arg4];
                                 var41 = class593.field8548[arg4];
                                 var42 = this.field8796[var36] * var40 + this.field8787[var36] * var41 - -16383 >> 14;
                                 this.field8796[var36] = this.field8796[var36] * var41 - this.field8787[var36] * var40 + 16383 >> 14;
                                 this.field8787[var36] = var42;
                              }

                              if (arg3 != 0) {
                                 var43 = class593.field8539[arg3];
                                 var44 = class593.field8548[arg3];
                                 var45 = this.field8791[var36] * var43 + (this.field8787[var36] * var44 - -16383) >> 14;
                                 this.field8791[var36] = this.field8791[var36] * var44 - this.field8787[var36] * var43 - -16383 >> 14;
                                 this.field8787[var36] = var45;
                              }

                              this.field8787[var36] += class93.field1515;
                              this.field8796[var36] += class728.field10473;
                              this.field8791[var36] += class730.field10500;
                              ++var35;
                           }

                           ++var21;
                        }
                     }

                     if (var9 <= var21) {
                        var10000 = arg6;
                        if (!var8) {
                           if (arg6 != 0) {
                              var46 = 0;
                              if (var8 || ~var46 > ~var9) {
                                 do {
                                    var47 = arg1[var46];
                                    if (~var47 <= ~this.field8774.length) {
                                       ++var46;
                                    } else {
                                       var48 = this.field8774[var47];
                                       var49 = 0;
                                       if (!var8 && var49 >= var48.length) {
                                          ++var46;
                                       } else {
                                          label265:
                                          do {
                                             var50 = var48[var49];
                                             var51 = this.field8857[var50];
                                             var52 = this.field8857[var50 + 1];
                                             var53 = var51;
                                             if (!var8 && var52 <= var51) {
                                                ++var49;
                                             } else {
                                                do {
                                                   var54 = this.field8775[var53] - 1;
                                                   if (var54 == -1) {
                                                      ++var49;
                                                      continue label265;
                                                   }

                                                   if (arg4 != 0) {
                                                      var55 = class593.field8539[arg4];
                                                      var56 = class593.field8548[arg4];
                                                      var57 = this.field8752[var54] * var55 + this.field8833[var54] * var56 + 16383 >> 14;
                                                      this.field8752[var54] = (short)(this.field8752[var54] * var56 + -(this.field8833[var54] * var55) + 16383 >> 14);
                                                      this.field8833[var54] = (short)var57;
                                                   }

                                                   if (arg2 != 0) {
                                                      var58 = class593.field8539[arg2];
                                                      var59 = class593.field8548[arg2];
                                                      var60 = this.field8752[var54] * var59 - this.field8850[var54] * var58 + 16383 >> 14;
                                                      this.field8850[var54] = (short)(this.field8752[var54] * var58 + this.field8850[var54] * var59 + 16383 >> 14);
                                                      this.field8752[var54] = (short)var60;
                                                   }

                                                   if (arg3 != 0) {
                                                      var61 = class593.field8539[arg3];
                                                      var62 = class593.field8548[arg3];
                                                      var63 = this.field8850[var54] * var61 + this.field8833[var54] * var62 + 16383 >> 14;
                                                      this.field8850[var54] = (short)(this.field8850[var54] * var62 + 16383 + -(this.field8833[var54] * var61) >> 14);
                                                      this.field8833[var54] = (short)var63;
                                                   }

                                                   ++var53;
                                                } while(var52 > var53);

                                                ++var49;
                                             }
                                          } while(var49 < var48.length);

                                          ++var46;
                                       }
                                    }
                                 } while(~var46 > ~var9);
                              }

                              this.method4471(-15824);
                           }

                           return;
                        }
                     } else {
                        var10000 = arg1[var21];
                     }
                  }
               }
            } else {
               var113 = arg3 << 4;
               var114 = arg4 << 4;
               var112 = arg2 << 4;
               int var16 = 0;
               if (var8 || var16 < var9) {
                  do {
                     int var17 = arg1[var16];
                     if (this.field8774.length <= var17) {
                        ++var16;
                     } else {
                        int[] var18 = this.field8774[var17];
                        int var19 = 0;
                        if (!var8 && ~var19 <= ~var18.length) {
                           ++var16;
                        } else {
                           do {
                              int var20 = var18[var19];
                              this.field8787[var20] += var112;
                              this.field8796[var20] += var113;
                              this.field8791[var20] += var114;
                              ++var19;
                           } while(~var19 > ~var18.length);

                           ++var16;
                        }
                     }
                  } while(var16 < var9);

               }
            }
         } else {
            var114 = arg4 << 4;
            var113 = arg3 << 4;
            var112 = arg2 << 4;
            class730.field10500 = 0;
            class93.field1515 = 0;
            class728.field10473 = 0;
            int var10 = 0;
            int var11 = 0;
            if (var8) {
               var10000 = arg1[var11];
            } else if (var11 >= var9) {
               var10000 = var10;
               if (!var8) {
                  if (var10 > 0) {
                     class730.field10500 = class730.field10500 / var10 + var114;
                     class728.field10473 = class728.field10473 / var10 + var113;
                     class93.field1515 = class93.field1515 / var10 - -var112;
                     return;
                  }

                  class93.field1515 = var112;
                  class730.field10500 = var114;
                  class728.field10473 = var113;
                  return;
               }
            } else {
               var10000 = arg1[var11];
            }

            while(true) {
               int var12 = var10000;
               if (this.field8774.length <= var12) {
                  ++var11;
               } else {
                  int[] var13 = this.field8774[var12];
                  int var14 = 0;
                  int var15;
                  if (var8) {
                     var15 = var13[var14];
                     class93.field1515 += this.field8787[var15];
                     class728.field10473 += this.field8796[var15];
                     ++var10;
                     class730.field10500 += this.field8791[var15];
                     ++var14;
                  }

                  while(~var14 > ~var13.length) {
                     var15 = var13[var14];
                     class93.field1515 += this.field8787[var15];
                     class728.field10473 += this.field8796[var15];
                     ++var10;
                     class730.field10500 += this.field8791[var15];
                     ++var14;
                  }

                  ++var11;
               }

               if (var11 >= var9) {
                  var10000 = var10;
                  if (!var8) {
                     if (var10 > 0) {
                        class730.field10500 = class730.field10500 / var10 + var114;
                        class728.field10473 = class728.field10473 / var10 + var113;
                        class93.field1515 = class93.field1515 / var10 - -var112;
                        return;
                     }

                     class93.field1515 = var112;
                     class730.field10500 = var114;
                     class728.field10473 = var113;
                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var111) {
         throw class608.method4462(var111, field8869[54] + arg0 + ',' + (arg1 != null ? field8869[2] : field8869[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "P",
      descriptor = "(IIII)V",
      line = 2508
   )
   public final void method518(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field8823;
         if (~arg0 != -1) {
            if (arg0 != 1) {
               if (arg0 != 2) {
                  if (arg0 != 3) {
                     if (~arg0 != -6) {
                        if (~arg0 != -8) {
                           if (arg0 != 8) {
                              if (~arg0 != -11) {
                                 if (~arg0 == -10) {
                                    int var40 = 0;
                                    if (var5 || var40 < this.field8759) {
                                       do {
                                          class358 var41 = this.field8820[var40];
                                          var41.field5354 = 16383 & var41.field5354 + arg1;
                                          ++var40;
                                       } while(var40 < this.field8759);

                                    }
                                 }
                              } else {
                                 int var38 = 0;
                                 if (var5 || var38 < this.field8759) {
                                    do {
                                       class358 var39 = this.field8820[var38];
                                       var39.field5355 = var39.field5355 * arg2 >> 7;
                                       var39.field5363 = var39.field5363 * arg1 >> 7;
                                       ++var38;
                                    } while(var38 < this.field8759);

                                 }
                              }
                           } else {
                              int var36 = 0;
                              if (var5 || this.field8759 > var36) {
                                 do {
                                    class358 var37 = this.field8820[var36];
                                    var37.field5353 += arg1;
                                    var37.field5356 += arg2;
                                    ++var36;
                                 } while(this.field8759 > var36);

                              }
                           }
                        } else {
                           int var25 = 0;
                           int var33;
                           class680 var34;
                           class358 var35;
                           if (!var5 && ~var25 <= ~this.field8815) {
                              if (this.field8845 != null) {
                                 var33 = 0;
                                 if (var5 || var33 < this.field8759) {
                                    do {
                                       var34 = this.field8845[var33];
                                       var35 = this.field8820[var33];
                                       var35.field5359 = -16777216 & var35.field5359 | 16777215 & class451.field6600[65535 & this.field8831[var34.field9968]];
                                       ++var33;
                                    } while(var33 < this.field8759);
                                 }
                              }

                              this.method4472((byte)-126);
                           } else {
                              do {
                                 int var26 = 65535 & this.field8831[var25];
                                 int var27 = var26 >> 10 & 63;
                                 int var28 = (var26 & 1000) >> 7;
                                 int var29 = arg2 / 4 + var28;
                                 int var30 = 127 & var26;
                                 int var31 = 63 & arg1 + var27;
                                 if (~var29 > -1) {
                                    var29 = 0;
                                    if (var5 && var29 > 7) {
                                       var29 = 7;
                                    }
                                 } else if (var29 > 7) {
                                    var29 = 7;
                                 }

                                 int var32 = arg3 + var30;
                                 if (var32 < 0) {
                                    var32 = 0;
                                    if (var5 && ~var32 < -128) {
                                       var32 = 127;
                                    }
                                 } else if (~var32 < -128) {
                                    var32 = 127;
                                 }

                                 this.field8831[var25] = (short)class93.method899(class93.method899(var29 << 7, var31 << 10), var32);
                                 ++var25;
                              } while(~var25 > ~this.field8815);

                              if (this.field8845 != null) {
                                 var33 = 0;
                                 if (var5 || var33 < this.field8759) {
                                    do {
                                       var34 = this.field8845[var33];
                                       var35 = this.field8820[var33];
                                       var35.field5359 = -16777216 & var35.field5359 | 16777215 & class451.field6600[65535 & this.field8831[var34.field9968]];
                                       ++var33;
                                    } while(var33 < this.field8759);
                                 }
                              }

                              this.method4472((byte)-126);
                           }
                        }
                     } else {
                        int var20 = 0;
                        int var21;
                        if (var5) {
                           var21 = (255 & this.field8821[var20]) - -(arg1 * 8);
                           if (var21 < 0) {
                              var21 = 0;
                              if (var5 && var21 > 255) {
                                 var21 = 255;
                              }
                           } else if (var21 > 255) {
                              var21 = 255;
                           }

                           this.field8821[var20] = (byte)var21;
                           ++var20;
                        }

                        while(var20 < this.field8815) {
                           var21 = (255 & this.field8821[var20]) - -(arg1 * 8);
                           if (var21 < 0) {
                              var21 = 0;
                              if (var5 && var21 > 255) {
                                 var21 = 255;
                              }
                           } else if (var21 > 255) {
                              var21 = 255;
                           }

                           this.field8821[var20] = (byte)var21;
                           ++var20;
                        }

                        if (this.field8845 != null) {
                           int var22 = 0;
                           if (var5 || ~this.field8759 < ~var22) {
                              do {
                                 class680 var23 = this.field8845[var22];
                                 class358 var24 = this.field8820[var22];
                                 var24.field5359 = -(255 & this.field8821[var23.field9968]) + 255 << 24 | var24.field5359 & 16777215;
                                 ++var22;
                              } while(~this.field8759 < ~var22);
                           }
                        }

                        this.method4472((byte)-126);
                     }
                  } else {
                     int var19 = 0;
                     if (var5) {
                        this.field8787[var19] -= class93.field1515;
                        this.field8796[var19] -= class728.field10473;
                        this.field8791[var19] -= class730.field10500;
                        this.field8787[var19] = this.field8787[var19] * arg1 / 128;
                        this.field8796[var19] = this.field8796[var19] * arg2 / 128;
                        this.field8791[var19] = this.field8791[var19] * arg3 / 128;
                        this.field8787[var19] += class93.field1515;
                        this.field8796[var19] += class728.field10473;
                        this.field8791[var19] += class730.field10500;
                        ++var19;
                     }

                     while(true) {
                        while(var19 < this.field8838) {
                           this.field8787[var19] -= class93.field1515;
                           this.field8796[var19] -= class728.field10473;
                           this.field8791[var19] -= class730.field10500;
                           this.field8787[var19] = this.field8787[var19] * arg1 / 128;
                           this.field8796[var19] = this.field8796[var19] * arg2 / 128;
                           this.field8791[var19] = this.field8791[var19] * arg3 / 128;
                           this.field8787[var19] += class93.field1515;
                           this.field8796[var19] += class728.field10473;
                           this.field8791[var19] += class730.field10500;
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
                     this.field8787[var9] -= class93.field1515;
                     this.field8796[var9] -= class728.field10473;
                     this.field8791[var9] -= class730.field10500;
                  } else if (var9 >= this.field8838) {
                     if (!var5) {
                        return;
                     }
                  } else {
                     this.field8787[var9] -= class93.field1515;
                     this.field8796[var9] -= class728.field10473;
                     this.field8791[var9] -= class730.field10500;
                  }

                  while(true) {
                     if (arg3 != 0) {
                        int var10 = class593.field8539[arg3];
                        int var11 = class593.field8548[arg3];
                        int var12 = this.field8796[var9] * var10 + this.field8787[var9] * var11 - -16383 >> 14;
                        this.field8796[var9] = this.field8796[var9] * var11 + -(this.field8787[var9] * var10) + 16383 >> 14;
                        this.field8787[var9] = var12;
                     }

                     if (~arg1 != -1) {
                        int var13 = class593.field8539[arg1];
                        int var14 = class593.field8548[arg1];
                        int var15 = this.field8796[var9] * var14 + -(this.field8791[var9] * var13) + 16383 >> 14;
                        this.field8791[var9] = this.field8791[var9] * var14 + (this.field8796[var9] * var13 - -16383) >> 14;
                        this.field8796[var9] = var15;
                     }

                     if (~arg2 != -1) {
                        int var16 = class593.field8539[arg2];
                        int var17 = class593.field8548[arg2];
                        int var18 = this.field8791[var9] * var16 + this.field8787[var9] * var17 + 16383 >> 14;
                        this.field8791[var9] = this.field8791[var9] * var17 + -(this.field8787[var9] * var16) + 16383 >> 14;
                        this.field8787[var9] = var18;
                     }

                     this.field8787[var9] += class93.field1515;
                     this.field8796[var9] += class728.field10473;
                     this.field8791[var9] += class730.field10500;
                     ++var9;
                     if (var9 >= this.field8838) {
                        if (!var5) {
                           return;
                        }
                     } else {
                        this.field8787[var9] -= class93.field1515;
                        this.field8796[var9] -= class728.field10473;
                        this.field8791[var9] -= class730.field10500;
                     }
                  }
               }
            } else {
               int var8 = 0;
               if (var5) {
                  this.field8787[var8] += arg1;
                  this.field8796[var8] += arg2;
                  this.field8791[var8] += arg3;
                  ++var8;
               }

               while(true) {
                  while(this.field8838 > var8) {
                     this.field8787[var8] += arg1;
                     this.field8796[var8] += arg2;
                     this.field8791[var8] += arg3;
                     ++var8;
                  }

                  if (!var5) {
                     return;
                  }

                  ++var8;
               }
            }
         } else {
            class730.field10500 = 0;
            int var6 = 0;
            class728.field10473 = 0;
            class93.field1515 = 0;
            int var7 = 0;
            if (var5) {
               class93.field1515 += this.field8787[var7];
               class728.field10473 += this.field8796[var7];
               ++var6;
               class730.field10500 += this.field8791[var7];
               ++var7;
            }

            while(true) {
               while(~var7 > ~this.field8838) {
                  class93.field1515 += this.field8787[var7];
                  class728.field10473 += this.field8796[var7];
                  ++var6;
                  class730.field10500 += this.field8791[var7];
                  ++var7;
               }

               int var10000 = ~var6;
               if (!var5) {
                  if (var10000 >= -1) {
                     class93.field1515 = arg1;
                     class728.field10473 = arg2;
                     class730.field10500 = arg3;
                     return;
                  }

                  class728.field10473 = class728.field10473 / var6 + arg2;
                  class93.field1515 = class93.field1515 / var6 + arg1;
                  class730.field10500 = class730.field10500 / var6 + arg3;
                  return;
               }

               class730.field10500 = var10000 + -1;
               ++var7;
            }
         }
      } catch (RuntimeException var43) {
         throw class608.method4462(var43, field8869[35] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "v",
      descriptor = "()V",
      line = 2811
   )
   public final void method509() {
      boolean var1 = client.field4564;

      try {
         ++field8783;
         int var2 = 0;
         if (var1) {
            this.field8791[var2] = -this.field8791[var2];
            ++var2;
         }

         while(true) {
            while(~var2 > ~this.field8838) {
               this.field8791[var2] = -this.field8791[var2];
               ++var2;
            }

            int var3 = 0;
            if (!var1) {
               if (var1) {
                  this.field8850[var3] = (short)(-this.field8850[var3]);
                  ++var3;
               }

               while(true) {
                  while(var3 < this.field8813) {
                     this.field8850[var3] = (short)(-this.field8850[var3]);
                     ++var3;
                  }

                  int var4 = 0;
                  if (!var1) {
                     short var5;
                     if (var1) {
                        var5 = this.field8856[var4];
                        this.field8856[var4] = this.field8798[var4];
                        this.field8798[var4] = var5;
                        ++var4;
                     }

                     while(true) {
                        class610 var10000;
                        if (~this.field8815 >= ~var4) {
                           this.method4473(-84);
                           this.method4471(-15824);
                           this.method4484((byte)118);
                           var10000 = this;
                           if (!var1) {
                              this.field8760 = false;
                              return;
                           }
                        } else {
                           var10000 = this;
                        }

                        var5 = var10000.field8856[var4];
                        this.field8856[var4] = this.field8798[var4];
                        this.field8798[var4] = var5;
                        ++var4;
                     }
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8869[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "c",
      descriptor = "()V",
      line = 2853
   )
   public final void method523() {
      try {
         ++field8763;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[25] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "O",
      descriptor = "(III)V",
      line = 2863
   )
   public final void method512(int param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nw",
      name = "<init>",
      descriptor = "(Lcs;Lph;IIII)V",
      line = 2891
   )
   public class610(class357 arg0, class668 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4564;
      this(arg0, arg2, arg5, true, false);

      try {
         class160 var8 = arg0.field1192;
         this.field8857 = new int[arg1.field9708 + 1];
         int[] var9 = new int[arg1.field9736];
         int var10 = 0;
         class693 var11;
         if (var7) {
            if (arg1.field9705 != null) {
               if (arg1.field9705[var10] != 2) {
                  if (arg1.field9688 != null) {
                     if (~arg1.field9688[var10] != 0) {
                        var11 = var8.method1456(-8988, 65535 & arg1.field9688[var10]);
                        if ((64 & this.field8851) != 0) {
                           if (!var11.field10175) {
                              if (var11.field10172) {
                                 if (var7) {
                                    var9[this.field8815++] = var10;
                                    ++this.field8857[arg1.field9737[var10]];
                                    ++this.field8857[arg1.field9734[var10]];
                                    ++this.field8857[arg1.field9732[var10]];
                                    ++var10;
                                 } else {
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field8815++] = var10;
                                 ++this.field8857[arg1.field9737[var10]];
                                 ++this.field8857[arg1.field9734[var10]];
                                 ++this.field8857[arg1.field9732[var10]];
                                 ++var10;
                              }
                           } else {
                              var9[this.field8815++] = var10;
                              ++this.field8857[arg1.field9737[var10]];
                              ++this.field8857[arg1.field9734[var10]];
                              ++this.field8857[arg1.field9732[var10]];
                              ++var10;
                           }
                        } else if (var11.field10172) {
                           if (var7) {
                              var9[this.field8815++] = var10;
                              ++this.field8857[arg1.field9737[var10]];
                              ++this.field8857[arg1.field9734[var10]];
                              ++this.field8857[arg1.field9732[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field8815++] = var10;
                           ++this.field8857[arg1.field9737[var10]];
                           ++this.field8857[arg1.field9734[var10]];
                           ++this.field8857[arg1.field9732[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field8815++] = var10;
                        ++this.field8857[arg1.field9737[var10]];
                        ++this.field8857[arg1.field9734[var10]];
                        ++this.field8857[arg1.field9732[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field8815++] = var10;
                     ++this.field8857[arg1.field9737[var10]];
                     ++this.field8857[arg1.field9734[var10]];
                     ++this.field8857[arg1.field9732[var10]];
                     ++var10;
                  }
               } else {
                  ++var10;
               }
            } else if (arg1.field9688 != null) {
               if (~arg1.field9688[var10] != 0) {
                  var11 = var8.method1456(-8988, 65535 & arg1.field9688[var10]);
                  if ((64 & this.field8851) != 0) {
                     if (!var11.field10175) {
                        if (var11.field10172) {
                           if (var7) {
                              var9[this.field8815++] = var10;
                              ++this.field8857[arg1.field9737[var10]];
                              ++this.field8857[arg1.field9734[var10]];
                              ++this.field8857[arg1.field9732[var10]];
                              ++var10;
                           } else {
                              ++var10;
                           }
                        } else {
                           var9[this.field8815++] = var10;
                           ++this.field8857[arg1.field9737[var10]];
                           ++this.field8857[arg1.field9734[var10]];
                           ++this.field8857[arg1.field9732[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field8815++] = var10;
                        ++this.field8857[arg1.field9737[var10]];
                        ++this.field8857[arg1.field9734[var10]];
                        ++this.field8857[arg1.field9732[var10]];
                        ++var10;
                     }
                  } else if (var11.field10172) {
                     if (var7) {
                        var9[this.field8815++] = var10;
                        ++this.field8857[arg1.field9737[var10]];
                        ++this.field8857[arg1.field9734[var10]];
                        ++this.field8857[arg1.field9732[var10]];
                        ++var10;
                     } else {
                        ++var10;
                     }
                  } else {
                     var9[this.field8815++] = var10;
                     ++this.field8857[arg1.field9737[var10]];
                     ++this.field8857[arg1.field9734[var10]];
                     ++this.field8857[arg1.field9732[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field8815++] = var10;
                  ++this.field8857[arg1.field9737[var10]];
                  ++this.field8857[arg1.field9734[var10]];
                  ++this.field8857[arg1.field9732[var10]];
                  ++var10;
               }
            } else {
               var9[this.field8815++] = var10;
               ++this.field8857[arg1.field9737[var10]];
               ++this.field8857[arg1.field9734[var10]];
               ++this.field8857[arg1.field9732[var10]];
               ++var10;
            }
         }

         while(true) {
            while(~arg1.field9736 < ~var10) {
               if (arg1.field9705 != null) {
                  if (arg1.field9705[var10] != 2) {
                     if (arg1.field9688 != null) {
                        if (~arg1.field9688[var10] != 0) {
                           var11 = var8.method1456(-8988, 65535 & arg1.field9688[var10]);
                           if ((64 & this.field8851) != 0) {
                              if (!var11.field10175) {
                                 if (var11.field10172) {
                                    if (var7) {
                                       var9[this.field8815++] = var10;
                                       ++this.field8857[arg1.field9737[var10]];
                                       ++this.field8857[arg1.field9734[var10]];
                                       ++this.field8857[arg1.field9732[var10]];
                                       ++var10;
                                    } else {
                                       ++var10;
                                    }
                                 } else {
                                    var9[this.field8815++] = var10;
                                    ++this.field8857[arg1.field9737[var10]];
                                    ++this.field8857[arg1.field9734[var10]];
                                    ++this.field8857[arg1.field9732[var10]];
                                    ++var10;
                                 }
                              } else {
                                 var9[this.field8815++] = var10;
                                 ++this.field8857[arg1.field9737[var10]];
                                 ++this.field8857[arg1.field9734[var10]];
                                 ++this.field8857[arg1.field9732[var10]];
                                 ++var10;
                              }
                           } else if (var11.field10172) {
                              if (var7) {
                                 var9[this.field8815++] = var10;
                                 ++this.field8857[arg1.field9737[var10]];
                                 ++this.field8857[arg1.field9734[var10]];
                                 ++this.field8857[arg1.field9732[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field8815++] = var10;
                              ++this.field8857[arg1.field9737[var10]];
                              ++this.field8857[arg1.field9734[var10]];
                              ++this.field8857[arg1.field9732[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field8815++] = var10;
                           ++this.field8857[arg1.field9737[var10]];
                           ++this.field8857[arg1.field9734[var10]];
                           ++this.field8857[arg1.field9732[var10]];
                           ++var10;
                        }
                     } else {
                        var9[this.field8815++] = var10;
                        ++this.field8857[arg1.field9737[var10]];
                        ++this.field8857[arg1.field9734[var10]];
                        ++this.field8857[arg1.field9732[var10]];
                        ++var10;
                     }
                  } else {
                     ++var10;
                  }
               } else if (arg1.field9688 != null) {
                  if (~arg1.field9688[var10] != 0) {
                     var11 = var8.method1456(-8988, 65535 & arg1.field9688[var10]);
                     if ((64 & this.field8851) != 0) {
                        if (!var11.field10175) {
                           if (var11.field10172) {
                              if (var7) {
                                 var9[this.field8815++] = var10;
                                 ++this.field8857[arg1.field9737[var10]];
                                 ++this.field8857[arg1.field9734[var10]];
                                 ++this.field8857[arg1.field9732[var10]];
                                 ++var10;
                              } else {
                                 ++var10;
                              }
                           } else {
                              var9[this.field8815++] = var10;
                              ++this.field8857[arg1.field9737[var10]];
                              ++this.field8857[arg1.field9734[var10]];
                              ++this.field8857[arg1.field9732[var10]];
                              ++var10;
                           }
                        } else {
                           var9[this.field8815++] = var10;
                           ++this.field8857[arg1.field9737[var10]];
                           ++this.field8857[arg1.field9734[var10]];
                           ++this.field8857[arg1.field9732[var10]];
                           ++var10;
                        }
                     } else if (var11.field10172) {
                        if (var7) {
                           var9[this.field8815++] = var10;
                           ++this.field8857[arg1.field9737[var10]];
                           ++this.field8857[arg1.field9734[var10]];
                           ++this.field8857[arg1.field9732[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field8815++] = var10;
                        ++this.field8857[arg1.field9737[var10]];
                        ++this.field8857[arg1.field9734[var10]];
                        ++this.field8857[arg1.field9732[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field8815++] = var10;
                     ++this.field8857[arg1.field9737[var10]];
                     ++this.field8857[arg1.field9734[var10]];
                     ++this.field8857[arg1.field9732[var10]];
                     ++var10;
                  }
               } else {
                  var9[this.field8815++] = var10;
                  ++this.field8857[arg1.field9737[var10]];
                  ++this.field8857[arg1.field9734[var10]];
                  ++this.field8857[arg1.field9732[var10]];
                  ++var10;
               }
            }

            this.field8863 = this.field8815;
            long[] var12 = new long[this.field8815];
            int var10000 = this.field8840 & 256;
            if (!var7) {
               label1309: {
                  boolean var13 = var10000 != 0;
                  int var14 = 0;
                  if (var7) {
                     var10000 = var9[var14];
                  } else if (var14 >= this.field8815) {
                     class460.method3456(var12, (byte)124, var9);
                     this.field8838 = arg1.field9708;
                     this.field8791 = arg1.field9689;
                     this.field8787 = arg1.field9726;
                     this.field8796 = arg1.field9706;
                     this.field8772 = arg1.field9681;
                     this.field8757 = arg1.field9717;
                     this.field8780 = arg1.field9712;
                     var10000 = this.field8838;
                     if (!var7) {
                        break label1309;
                     }
                  } else {
                     var10000 = var9[var14];
                  }

                  while(true) {
                     label4084: {
                        int var15 = var10000;
                        class693 var16 = null;
                        int var17 = 0;
                        byte var18 = 0;
                        byte var19 = 0;
                        byte var20 = 0;
                        if (arg1.field9680 != null) {
                           boolean var21 = false;
                           int var22 = 0;
                           class44 var23;
                           class53 var24;
                           class693 var25;
                           if (var7) {
                              var23 = arg1.field9680[var22];
                              if (~var23.field991 == ~var15) {
                                 var24 = class626.method4587((byte)-127, var23.field989);
                                 if (var24.field1094) {
                                    var21 = true;
                                 }

                                 if (var24.field1097 != -1) {
                                    var25 = var8.method1456(-8988, var24.field1097);
                                    if (~var25.field10155 == -3) {
                                       this.field8832 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           while(~arg1.field9680.length < ~var22) {
                              var23 = arg1.field9680[var22];
                              if (~var23.field991 == ~var15) {
                                 var24 = class626.method4587((byte)-127, var23.field989);
                                 if (var24.field1094) {
                                    var21 = true;
                                 }

                                 if (var24.field1097 != -1) {
                                    var25 = var8.method1456(-8988, var24.field1097);
                                    if (~var25.field10155 == -3) {
                                       this.field8832 = true;
                                    }
                                 }
                              }

                              ++var22;
                           }

                           if (var21) {
                              var12[var14] = Long.MAX_VALUE;
                              --this.field8863;
                              if (!var7) {
                                 ++var14;
                                 break label4084;
                              }
                           }
                        }

                        short var26 = -1;
                        if (arg1.field9688 != null) {
                           var26 = arg1.field9688[var15];
                           if (~var26 != 0) {
                              var16 = var8.method1456(-8988, 65535 & var26);
                              if ((64 & this.field8851) != 0) {
                                 if (!var16.field10175) {
                                    var19 = var16.field10167;
                                    var20 = var16.field10164;
                                    if (var7) {
                                       var16 = null;
                                       var26 = -1;
                                    }
                                 } else {
                                    var16 = null;
                                    var26 = -1;
                                 }
                              } else {
                                 var19 = var16.field10167;
                                 var20 = var16.field10164;
                                 if (var7) {
                                    var16 = null;
                                    var26 = -1;
                                 }
                              }
                           }
                        }

                        boolean var27 = arg1.field9721 != null ? (arg1.field9721[var15] == 0 ? (var16 != null ? var16.field10155 != 0 : false) : true) : (var16 != null ? var16.field10155 != 0 : false);
                        if (!var13) {
                           if (var27 && arg1.field9727 != null) {
                              var17 += arg1.field9727[var15] << 17;
                           }
                        } else if (arg1.field9727 != null) {
                           var17 += arg1.field9727[var15] << 17;
                        }

                        if (var27) {
                           var17 += 65536;
                        }

                        int var28 = ((255 & var19) << 8) + var17;
                        int var29 = ((var26 & 65535) << 16) + var18;
                        int var30 = (255 & var20) + var28;
                        int var31 = (var14 & 65535) + var29;
                        var12[var14] = ((long)var30 << 32) + (long)var31;
                        this.field8861 |= var16 != null ? (var16.field10152 == 0 ? ~var16.field10173 != -1 : true) : false;
                        this.field8832 |= var27;
                        ++var14;
                     }

                     if (var14 >= this.field8815) {
                        class460.method3456(var12, (byte)124, var9);
                        this.field8838 = arg1.field9708;
                        this.field8791 = arg1.field9689;
                        this.field8787 = arg1.field9726;
                        this.field8796 = arg1.field9706;
                        this.field8772 = arg1.field9681;
                        this.field8757 = arg1.field9717;
                        this.field8780 = arg1.field9712;
                        var10000 = this.field8838;
                        if (!var7) {
                           break;
                        }
                     } else {
                        var10000 = var9[var14];
                     }
                  }
               }

               class195[] var32 = new class195[var10000];
               this.field8868 = arg1.field9687;
               int var10002;
               int var33;
               int var40;
               int var41;
               int var42;
               class243 var43;
               class388[] var44;
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
               class388 var63;
               class195 var64;
               class195 var65;
               class195 var66;
               int var67;
               int var68;
               int var69;
               int var70;
               short var71;
               class693 var72;
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
               short var86;
               short var87;
               short var88;
               float var89;
               float var90;
               float var91;
               float var92;
               float var93;
               float var94;
               float var95;
               float var96;
               float var97;
               float var98;
               float var99;
               float var100;
               float var101;
               float var102;
               float var103;
               float var104;
               float var105;
               float var106;
               float var107;
               float var108;
               float var109;
               float var110;
               float var111;
               float var112;
               float var113;
               float var114;
               float var115;
               float var116;
               float var117;
               short var118;
               short var119;
               short var120;
               int var121;
               int var122;
               int var123;
               float[] var124;
               byte var125;
               float var126;
               float var127;
               float var128;
               int var129;
               int var130;
               int var131;
               int var132;
               int var133;
               int var134;
               int var135;
               int var136;
               int var137;
               float var138;
               float var139;
               float var140;
               float var141;
               float var142;
               float var143;
               float var144;
               float var145;
               byte var146;
               class388 var147;
               long var148;
               long var150;
               short var152;
               short var153;
               short var154;
               class195 var155;
               class195 var156;
               class195 var157;
               int var158;
               int var159;
               int var160;
               short var161;
               short var162;
               int var163;
               short var164;
               short var165;
               short var166;
               short var167;
               int var168;
               int[] var169;
               int var170;
               int var171;
               int var172;
               int var173;
               byte var176;
               int var177;
               class668 var178;
               byte var179;
               class610 var180;
               if (arg1.field9680 != null) {
                  this.field8759 = arg1.field9680.length;
                  this.field8820 = new class358[this.field8759];
                  this.field8845 = new class680[this.field8759];
                  var33 = 0;
                  if (var7) {
                     var178 = arg1;
                  } else if (var33 >= this.field8759) {
                     var33 = this.field8815 * 3;
                     this.field8827 = new float[var33];
                     this.field8836 = new short[this.field8815];
                     this.field8751 = (short)arg4;
                     this.field8847 = new short[var33];
                     this.field8775 = new short[var33];
                     class650.field9428 = new long[var33];
                     this.field8854 = new byte[var33];
                     this.field8798 = new short[this.field8815];
                     this.field8758 = new short[this.field8815];
                     this.field8821 = new byte[this.field8815];
                     this.field8789 = new short[var33];
                     this.field8856 = new short[this.field8815];
                     this.field8850 = new short[var33];
                     this.field8860 = new float[var33];
                     this.field8833 = new short[var33];
                     this.field8779 = (short)arg3;
                     this.field8752 = new short[var33];
                     var178 = arg1;
                     if (!var7) {
                        if (arg1.field9730 != null) {
                           this.field8814 = new short[this.field8815];
                        }

                        this.field8831 = new short[this.field8815];
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field8857[var41];
                           this.field8857[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class195();
                           ++var41;
                        }

                        while(true) {
                           if (~var41 <= ~arg1.field9708) {
                              this.field8857[arg1.field9708] = var40;
                              var43 = class98.method929(this.field8815, var9, arg1, (byte)117);
                              var44 = new class388[arg1.field9736];
                              var10000 = 0;
                              if (!var7) {
                                 label2556: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field9737[var45];
                                    } else if (~arg1.field9736 >= ~var45) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label2556;
                                       }
                                    } else {
                                       var46 = arg1.field9737[var45];
                                    }

                                    label2559:
                                    while(true) {
                                       var47 = arg1.field9734[var45];
                                       var48 = arg1.field9732[var45];
                                       var49 = this.field8787[var47] - this.field8787[var46];
                                       var50 = this.field8796[var47] - this.field8796[var46];
                                       var51 = this.field8791[var47] - this.field8791[var46];
                                       var52 = this.field8787[var48] + -this.field8787[var46];
                                       var53 = this.field8796[var48] + -this.field8796[var46];
                                       var54 = this.field8791[var48] + -this.field8791[var46];
                                       var55 = var50 * var54 + -(var51 * var53);
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 + -(var50 * var52);
                                       if (var7) {
                                          var55 >>= 1;
                                          var57 >>= 1;
                                          var56 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                if (var7) {
                                                   var56 >>= 8192;
                                                   continue;
                                                }

                                                if (var56 <= 8192 && var57 <= 8192 && ~var55 <= 8191 && ~var56 <= 8191 && ~var57 <= 8191) {
                                                   var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                   if (~var58 >= -1) {
                                                      var176 = 1;
                                                      var59 = var57 * 256 / var176;
                                                      var60 = var56 * 256 / var176;
                                                      var61 = var55 * 256 / var176;
                                                      var179 = arg1.field9705 == null ? 0 : arg1.field9705[var45];
                                                   } else {
                                                      var59 = var57 * 256 / var58;
                                                      var60 = var56 * 256 / var58;
                                                      var61 = var55 * 256 / var58;
                                                      var179 = arg1.field9705 == null ? 0 : arg1.field9705[var45];
                                                   }

                                                   label4091: {
                                                      var62 = var179;
                                                      if (~var62 != -1) {
                                                         if (var62 != 1) {
                                                            ++var45;
                                                            break label4091;
                                                         }

                                                         var63 = var44[var45] = new class388();
                                                         var63.field5737 = var59;
                                                         var63.field5735 = var60;
                                                         var63.field5736 = var61;
                                                         if (!var7) {
                                                            ++var45;
                                                            break label4091;
                                                         }
                                                      }

                                                      var64 = var32[var46];
                                                      ++var64.field2951;
                                                      var64.field2944 += var60;
                                                      var64.field2945 += var61;
                                                      var64.field2946 += var59;
                                                      var65 = var32[var47];
                                                      ++var65.field2951;
                                                      var65.field2946 += var59;
                                                      var65.field2945 += var61;
                                                      var65.field2944 += var60;
                                                      var66 = var32[var48];
                                                      var66.field2944 += var60;
                                                      var66.field2946 += var59;
                                                      var66.field2945 += var61;
                                                      ++var66.field2951;
                                                      ++var45;
                                                   }

                                                   if (~arg1.field9736 >= ~var45) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label2559;
                                                      }
                                                   } else {
                                                      var46 = arg1.field9737[var45];
                                                   }
                                                   continue label2559;
                                                }
                                             }

                                             var55 >>= 1;
                                             var57 >>= 1;
                                             var56 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = arg1.field9715[var67] & 65535;
                                    if (arg1.field9719 != null) {
                                       var69 = arg1.field9719[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field9721 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field9721[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field9721[var67] & 255;
                                    }

                                    var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                    if (var71 != -1 && (64 & this.field8851) != 0) {
                                       var72 = var8.method1456(-8988, var71 & 65535);
                                       if (var72.field10175) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (~var46 <= ~this.field8815) {
                                       var10000 = ~this.field8863;
                                       if (!var7) {
                                          if (var10000 < -1) {
                                             var158 = 1;
                                             var159 = this.field8758[0];
                                             var160 = 0;
                                             if (var7) {
                                                var161 = this.field8758[var160];
                                                if (~var159 != ~var161) {
                                                   ++var158;
                                                   var159 = var161;
                                                }

                                                ++var160;
                                             }

                                             while(true) {
                                                if (var160 >= this.field8863) {
                                                   this.field8809 = new int[var158 + 1];
                                                   this.field8807 = new int[var158];
                                                   this.field8865 = new int[var158];
                                                   this.field8809[0] = 0;
                                                   var177 = this.field8813;
                                                   var159 = this.field8758[0];
                                                   var158 = 0;
                                                   var162 = 0;
                                                   var163 = 0;
                                                   if (!var7) {
                                                      label2763: {
                                                         if (var7) {
                                                            var180 = this;
                                                         } else if (var163 >= this.field8863) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            var180 = this;
                                                            if (!var7) {
                                                               break label2763;
                                                            }
                                                         } else {
                                                            var180 = this;
                                                         }

                                                         while(true) {
                                                            var164 = var180.field8758[var163];
                                                            if (var159 != var164) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               ++var158;
                                                               this.field8809[var158] = var163;
                                                               var159 = var164;
                                                               var162 = 0;
                                                               var177 = this.field8813;
                                                            }

                                                            var165 = this.field8856[var163];
                                                            if (~var162 > ~var165) {
                                                               var162 = var165;
                                                            }

                                                            if (var177 > var165) {
                                                               var177 = var165;
                                                            }

                                                            var166 = this.field8836[var163];
                                                            if (var162 < var166) {
                                                               var162 = var166;
                                                            }

                                                            if (~var177 < ~var166) {
                                                               var177 = var166;
                                                            }

                                                            var167 = this.field8798[var163];
                                                            if (~var167 < ~var162) {
                                                               var162 = var167;
                                                            }

                                                            if (~var177 < ~var167) {
                                                               var177 = var167;
                                                            }

                                                            ++var163;
                                                            if (var163 >= this.field8863) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               var180 = this;
                                                               if (!var7) {
                                                                  break;
                                                               }
                                                            } else {
                                                               var180 = this;
                                                            }
                                                         }
                                                      }

                                                      ++var158;
                                                      var180.field8809[var158] = this.field8863;
                                                      break;
                                                   }
                                                } else {
                                                   var177 = this.field8758[var160];
                                                }

                                                if (~var159 != ~var177) {
                                                   ++var158;
                                                   var159 = var177;
                                                }

                                                ++var160;
                                             }
                                          }

                                          class650.field9428 = null;
                                          this.field8789 = class647.method4751(this.field8813, -29427, this.field8789);
                                          this.field8847 = class647.method4751(this.field8813, -29427, this.field8847);
                                          this.field8833 = class647.method4751(this.field8813, -29427, this.field8833);
                                          this.field8752 = class647.method4751(this.field8813, -29427, this.field8752);
                                          this.field8850 = class647.method4751(this.field8813, -29427, this.field8850);
                                          this.field8854 = class573.method4245(this.field8854, (byte)115, this.field8813);
                                          this.field8860 = class5.method41(false, this.field8860, this.field8813);
                                          this.field8827 = class5.method41(false, this.field8827, this.field8813);
                                          if (arg1.field9697 != null && class109.method1044(arg2, 118, this.field8851)) {
                                             this.field8774 = arg1.method4879((byte)111, false);
                                          }

                                          if (arg1.field9680 != null && class250.method2028(arg2, true, this.field8851)) {
                                             this.field8822 = arg1.method4871((byte)-88);
                                          }

                                          if (arg1.field9711 != null && class490.method3703(arg2, this.field8851, (byte)-55)) {
                                             var168 = 0;
                                             var169 = new int[256];
                                             var170 = 0;
                                             if (var7) {
                                                var171 = arg1.field9711[var9[var170]];
                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }

                                             while(true) {
                                                if (var170 >= this.field8815) {
                                                   this.field8747 = new int[var168 + 1][];
                                                   var171 = 0;
                                                   if (!var7) {
                                                      if (var7) {
                                                         this.field8747[var171] = new int[var169[var171]];
                                                         var169[var171] = 0;
                                                         ++var171;
                                                      }

                                                      while(true) {
                                                         while(~var168 <= ~var171) {
                                                            this.field8747[var171] = new int[var169[var171]];
                                                            var169[var171] = 0;
                                                            ++var171;
                                                         }

                                                         var172 = 0;
                                                         if (!var7) {
                                                            if (!var7 && ~this.field8815 >= ~var172) {
                                                               return;
                                                            }

                                                            do {
                                                               var173 = arg1.field9711[var9[var172]];
                                                               if (~var173 <= -1) {
                                                                  this.field8747[var173][var169[var173]++] = var172;
                                                               }

                                                               ++var172;
                                                            } while(~this.field8815 < ~var172);

                                                            return;
                                                         }

                                                         ++var171;
                                                      }
                                                   }
                                                } else {
                                                   var171 = arg1.field9711[var9[var170]];
                                                }

                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }
                                          }

                                          return;
                                       }
                                    } else {
                                       var10000 = var9[var46];
                                    }

                                    var67 = var10000;
                                    var68 = arg1.field9715[var67] & 65535;
                                    if (arg1.field9719 != null) {
                                       var69 = arg1.field9719[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field9721 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field9721[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field9721[var67] & 255;
                                    }

                                    var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                    if (var71 != -1 && (64 & this.field8851) != 0) {
                                       var72 = var8.method1456(-8988, var71 & 65535);
                                       if (var72.field10175) {
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
                                    if (~var71 != 0) {
                                       label4216: {
                                          if (~var69 == 0) {
                                             var76 = 1.0F;
                                             var73 = 0.0F;
                                             var77 = 0.0F;
                                             var75 = 1.0F;
                                             var74 = 1.0F;
                                             var78 = 0.0F;
                                             var80 = 2;
                                             var79 = 1;
                                             if (!var7) {
                                                break label4216;
                                             }
                                          }

                                          var69 &= 255;
                                          var82 = arg1.field9709[var69];
                                          if (var82 == 0) {
                                             var83 = arg1.field9737[var67];
                                             var84 = arg1.field9734[var67];
                                             var85 = arg1.field9732[var67];
                                             var86 = arg1.field9707[var69];
                                             var87 = arg1.field9723[var69];
                                             var88 = arg1.field9693[var69];
                                             var89 = (float)arg1.field9726[var86];
                                             var90 = (float)arg1.field9706[var86];
                                             var91 = (float)arg1.field9689[var86];
                                             var92 = (float)arg1.field9726[var87] + -var89;
                                             var93 = (float)arg1.field9706[var87] - var90;
                                             var94 = (float)arg1.field9689[var87] + -var91;
                                             var95 = (float)arg1.field9726[var88] - var89;
                                             var96 = (float)arg1.field9706[var88] - var90;
                                             var97 = (float)arg1.field9689[var88] - var91;
                                             var98 = (float)arg1.field9726[var83] - var89;
                                             var99 = (float)arg1.field9706[var83] - var90;
                                             var100 = (float)arg1.field9689[var83] + -var91;
                                             var101 = (float)arg1.field9726[var84] - var89;
                                             var102 = (float)arg1.field9706[var84] + -var90;
                                             var103 = (float)arg1.field9689[var84] + -var91;
                                             var104 = (float)arg1.field9726[var85] - var89;
                                             var105 = (float)arg1.field9706[var85] - var90;
                                             var106 = (float)arg1.field9689[var85] - var91;
                                             var107 = var93 * var97 + -(var94 * var96);
                                             var108 = var94 * var95 - var92 * var97;
                                             var109 = var92 * var96 + -(var93 * var95);
                                             var110 = var96 * var109 + -(var97 * var108);
                                             var111 = var97 * var107 + -(var95 * var109);
                                             var112 = var95 * var108 + -(var96 * var107);
                                             var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                             var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                             var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                             var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                             var114 = var94 * var107 + -(var92 * var109);
                                             var115 = var92 * var108 - var93 * var107;
                                             var116 = var93 * var109 + -(var94 * var108);
                                             var117 = 1.0F / (var97 * var115 + var95 * var116 + var96 * var114);
                                             var78 = (var106 * var115 + var104 * var116 + var105 * var114) * var117;
                                             var74 = (var100 * var115 + var98 * var116 + var99 * var114) * var117;
                                             var76 = (var103 * var115 + var101 * var116 + var102 * var114) * var117;
                                             if (!var7) {
                                                break label4216;
                                             }
                                          }

                                          var118 = arg1.field9737[var67];
                                          var119 = arg1.field9734[var67];
                                          var120 = arg1.field9732[var67];
                                          var121 = var43.field3506[var69];
                                          var122 = var43.field3503[var69];
                                          var123 = var43.field3505[var69];
                                          var124 = var43.field3502[var69];
                                          var125 = arg1.field9733[var69];
                                          var126 = (float)arg1.field9701[var69] / 256.0F;
                                          if (var82 != 1) {
                                             label3017: {
                                                if (~var82 != -3) {
                                                   if (var82 != 3) {
                                                      break label3017;
                                                   }

                                                   class481.method3638(arg1.field9689[var118], arg1.field9706[var118], var122, class401.field5895, var124, var126, var125, arg1.field9726[var118], var121, (byte)113, var123);
                                                   var74 = class401.field5895[1];
                                                   var73 = class401.field5895[0];
                                                   class481.method3638(arg1.field9689[var119], arg1.field9706[var119], var122, class401.field5895, var124, var126, var125, arg1.field9726[var119], var121, (byte)-120, var123);
                                                   var75 = class401.field5895[0];
                                                   var76 = class401.field5895[1];
                                                   class481.method3638(arg1.field9689[var120], arg1.field9706[var120], var122, class401.field5895, var124, var126, var125, arg1.field9726[var120], var121, (byte)111, var123);
                                                   var77 = class401.field5895[0];
                                                   var78 = class401.field5895[1];
                                                   if ((1 & var125) != 0) {
                                                      if (!(var76 - var74 > 0.5F)) {
                                                         if (var74 - var76 > 0.5F) {
                                                            var79 = 2;
                                                            ++var76;
                                                            if (var7) {
                                                               var79 = 1;
                                                               --var76;
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         --var76;
                                                      }

                                                      if (var78 - var74 > 0.5F) {
                                                         --var78;
                                                         var80 = 1;
                                                         if (!var7) {
                                                            break label3017;
                                                         }
                                                      }

                                                      if (!(-var78 + var74 > 0.5F)) {
                                                         break label3017;
                                                      }

                                                      var80 = 2;
                                                      ++var78;
                                                      if (!var7) {
                                                         break label3017;
                                                      }

                                                      if (var75 - var73 > 0.5F) {
                                                         var79 = 1;
                                                         --var75;
                                                         if (var7 && var73 - var75 > 0.5F) {
                                                            var79 = 2;
                                                            ++var75;
                                                         }
                                                      } else if (var73 - var75 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }
                                                   } else if (var75 - var73 > 0.5F) {
                                                      var79 = 1;
                                                      --var75;
                                                      if (var7 && var73 - var75 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }
                                                   } else if (var73 - var75 > 0.5F) {
                                                      var79 = 2;
                                                      ++var75;
                                                   }

                                                   if (!(-var73 + var77 > 0.5F)) {
                                                      if (!(-var77 + var73 > 0.5F)) {
                                                         break label3017;
                                                      }

                                                      var80 = 2;
                                                      ++var77;
                                                      if (!var7) {
                                                         break label3017;
                                                      }
                                                   }

                                                   --var77;
                                                   var80 = 1;
                                                   if (!var7) {
                                                      break label3017;
                                                   }
                                                }

                                                var127 = (float)arg1.field9684[var69] / 256.0F;
                                                var128 = (float)arg1.field9725[var69] / 256.0F;
                                                var129 = arg1.field9726[var119] - arg1.field9726[var118];
                                                var130 = arg1.field9706[var119] + -arg1.field9706[var118];
                                                var131 = arg1.field9689[var119] - arg1.field9689[var118];
                                                var132 = arg1.field9726[var120] - arg1.field9726[var118];
                                                var133 = arg1.field9706[var120] + -arg1.field9706[var118];
                                                var134 = arg1.field9689[var120] + -arg1.field9689[var118];
                                                var135 = var130 * var134 - var131 * var133;
                                                var136 = var131 * var132 - var129 * var134;
                                                var137 = var129 * var133 + -(var130 * var132);
                                                var138 = 64.0F / (float)arg1.field9722[var69];
                                                var139 = 64.0F / (float)arg1.field9724[var69];
                                                var140 = 64.0F / (float)arg1.field9731[var69];
                                                var141 = (var124[2] * (float)var137 + var124[1] * (float)var136 + var124[0] * (float)var135) / var138;
                                                var142 = (var124[5] * (float)var137 + var124[3] * (float)var135 + var124[4] * (float)var136) / var139;
                                                var143 = (var124[8] * (float)var137 + var124[7] * (float)var136 + var124[6] * (float)var135) / var140;
                                                var81 = class484.method3660(var143, var142, var141, (byte)-52);
                                                class152.method1412(arg1.field9726[var118], var121, var126, (byte)-118, var127, arg1.field9706[var118], var122, var123, var125, var81, arg1.field9689[var118], class401.field5895, var124, var128);
                                                var74 = class401.field5895[1];
                                                var73 = class401.field5895[0];
                                                class152.method1412(arg1.field9726[var119], var121, var126, (byte)34, var127, arg1.field9706[var119], var122, var123, var125, var81, arg1.field9689[var119], class401.field5895, var124, var128);
                                                var76 = class401.field5895[1];
                                                var75 = class401.field5895[0];
                                                class152.method1412(arg1.field9726[var120], var121, var126, (byte)58, var127, arg1.field9706[var120], var122, var123, var125, var81, arg1.field9689[var120], class401.field5895, var124, var128);
                                                var77 = class401.field5895[0];
                                                var78 = class401.field5895[1];
                                                if (var7) {
                                                   var144 = (float)arg1.field9731[var69] / 1024.0F;
                                                   class318.method2487(var122, var124, var121, var123, arg1.field9706[var118], var125, var126, (byte)-125, arg1.field9726[var118], var144, class401.field5895, arg1.field9689[var118]);
                                                   var74 = class401.field5895[1];
                                                   var73 = class401.field5895[0];
                                                   class318.method2487(var122, var124, var121, var123, arg1.field9706[var119], var125, var126, (byte)-128, arg1.field9726[var119], var144, class401.field5895, arg1.field9689[var119]);
                                                   var76 = class401.field5895[1];
                                                   var75 = class401.field5895[0];
                                                   class318.method2487(var122, var124, var121, var123, arg1.field9706[var120], var125, var126, (byte)-126, arg1.field9726[var120], var144, class401.field5895, arg1.field9689[var120]);
                                                   var77 = class401.field5895[0];
                                                   var78 = class401.field5895[1];
                                                   var145 = var144 / 2.0F;
                                                   if ((1 & var125) != 0) {
                                                      if (!(-var74 + var76 > var145)) {
                                                         if (var145 < -var76 + var74) {
                                                            var76 += var144;
                                                            var79 = 2;
                                                            if (var7) {
                                                               var76 -= var144;
                                                               var79 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var76 -= var144;
                                                         var79 = 1;
                                                      }

                                                      if (var78 - var74 > var145) {
                                                         var78 -= var144;
                                                         var80 = 1;
                                                         if (var7 && var145 < -var78 + var74) {
                                                            var78 += var144;
                                                            var80 = 2;
                                                            if (var7) {
                                                               if (!(var77 - var73 > var145)) {
                                                                  if (var145 < -var77 + var73) {
                                                                     var80 = 2;
                                                                     var77 += var144;
                                                                     if (var7) {
                                                                        var77 -= var144;
                                                                        var80 = 1;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var77 -= var144;
                                                                  var80 = 1;
                                                               }

                                                               if (var75 - var73 > var145) {
                                                                  var79 = 1;
                                                                  var75 -= var144;
                                                                  if (var7 && var145 < var73 - var75) {
                                                                     var79 = 2;
                                                                     var75 += var144;
                                                                  }
                                                               } else if (var145 < var73 - var75) {
                                                                  var79 = 2;
                                                                  var75 += var144;
                                                               }
                                                            }
                                                         }
                                                      } else if (var145 < -var78 + var74) {
                                                         var78 += var144;
                                                         var80 = 2;
                                                         if (var7) {
                                                            if (!(var77 - var73 > var145)) {
                                                               if (var145 < -var77 + var73) {
                                                                  var80 = 2;
                                                                  var77 += var144;
                                                                  if (var7) {
                                                                     var77 -= var144;
                                                                     var80 = 1;
                                                                  }
                                                               }
                                                            } else {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }

                                                            if (var75 - var73 > var145) {
                                                               var79 = 1;
                                                               var75 -= var144;
                                                               if (var7 && var145 < var73 - var75) {
                                                                  var79 = 2;
                                                                  var75 += var144;
                                                               }
                                                            } else if (var145 < var73 - var75) {
                                                               var79 = 2;
                                                               var75 += var144;
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      if (!(var77 - var73 > var145)) {
                                                         if (var145 < -var77 + var73) {
                                                            var80 = 2;
                                                            var77 += var144;
                                                            if (var7) {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var77 -= var144;
                                                         var80 = 1;
                                                      }

                                                      if (var75 - var73 > var145) {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7 && var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      } else if (var145 < var73 - var75) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var144 = (float)arg1.field9731[var69] / 1024.0F;
                                             class318.method2487(var122, var124, var121, var123, arg1.field9706[var118], var125, var126, (byte)-125, arg1.field9726[var118], var144, class401.field5895, arg1.field9689[var118]);
                                             var74 = class401.field5895[1];
                                             var73 = class401.field5895[0];
                                             class318.method2487(var122, var124, var121, var123, arg1.field9706[var119], var125, var126, (byte)-128, arg1.field9726[var119], var144, class401.field5895, arg1.field9689[var119]);
                                             var76 = class401.field5895[1];
                                             var75 = class401.field5895[0];
                                             class318.method2487(var122, var124, var121, var123, arg1.field9706[var120], var125, var126, (byte)-126, arg1.field9726[var120], var144, class401.field5895, arg1.field9689[var120]);
                                             var77 = class401.field5895[0];
                                             var78 = class401.field5895[1];
                                             var145 = var144 / 2.0F;
                                             if ((1 & var125) != 0) {
                                                if (!(-var74 + var76 > var145)) {
                                                   if (var145 < -var76 + var74) {
                                                      var76 += var144;
                                                      var79 = 2;
                                                      if (var7) {
                                                         var76 -= var144;
                                                         var79 = 1;
                                                      }
                                                   }
                                                } else {
                                                   var76 -= var144;
                                                   var79 = 1;
                                                }

                                                if (var78 - var74 > var145) {
                                                   var78 -= var144;
                                                   var80 = 1;
                                                   if (var7 && var145 < -var78 + var74) {
                                                      var78 += var144;
                                                      var80 = 2;
                                                      if (var7) {
                                                         if (!(var77 - var73 > var145)) {
                                                            if (var145 < -var77 + var73) {
                                                               var80 = 2;
                                                               var77 += var144;
                                                               if (var7) {
                                                                  var77 -= var144;
                                                                  var80 = 1;
                                                               }
                                                            }
                                                         } else {
                                                            var77 -= var144;
                                                            var80 = 1;
                                                         }

                                                         if (var75 - var73 > var145) {
                                                            var79 = 1;
                                                            var75 -= var144;
                                                            if (var7 && var145 < var73 - var75) {
                                                               var79 = 2;
                                                               var75 += var144;
                                                            }
                                                         } else if (var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      }
                                                   }
                                                } else if (var145 < -var78 + var74) {
                                                   var78 += var144;
                                                   var80 = 2;
                                                   if (var7) {
                                                      if (!(var77 - var73 > var145)) {
                                                         if (var145 < -var77 + var73) {
                                                            var80 = 2;
                                                            var77 += var144;
                                                            if (var7) {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var77 -= var144;
                                                         var80 = 1;
                                                      }

                                                      if (var75 - var73 > var145) {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7 && var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      } else if (var145 < var73 - var75) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                      }
                                                   }
                                                }
                                             } else {
                                                if (!(var77 - var73 > var145)) {
                                                   if (var145 < -var77 + var73) {
                                                      var80 = 2;
                                                      var77 += var144;
                                                      if (var7) {
                                                         var77 -= var144;
                                                         var80 = 1;
                                                      }
                                                   }
                                                } else {
                                                   var77 -= var144;
                                                   var80 = 1;
                                                }

                                                if (var75 - var73 > var145) {
                                                   var79 = 1;
                                                   var75 -= var144;
                                                   if (var7 && var145 < var73 - var75) {
                                                      var79 = 2;
                                                      var75 += var144;
                                                   }
                                                } else if (var145 < var73 - var75) {
                                                   var79 = 2;
                                                   var75 += var144;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    if (arg1.field9705 == null) {
                                       var146 = 0;
                                       if (var7) {
                                          var146 = arg1.field9705[var67];
                                       }
                                    } else {
                                       var146 = arg1.field9705[var67];
                                    }

                                    if (~var146 != -1) {
                                       if (~var146 == -2) {
                                          var147 = var44[var67];
                                          var148 = (long)((var69 << 2) - (-(~var147.field5736 < -1 ? 1024 : 2048) + (-(var147.field5735 + 256 << 12) - (var147.field5737 + 256 << 22)))) + ((long)(var81 << 24) - (-((long)(var68 << 8)) - (long)var70) << 32);
                                          this.field8856[var46] = this.method4483(var147.field5736, var74, var148, arg1, 12, 0, var73, var147.field5735, var46, arg1.field9737[var67], var147.field5737);
                                          this.field8836[var46] = this.method4483(var147.field5736, var76, (long)var79 + var148, arg1, 12, 0, var75, var147.field5735, var46, arg1.field9734[var67], var147.field5737);
                                          this.field8798[var46] = this.method4483(var147.field5736, var78, (long)var80 + var148, arg1, 12, 0, var77, var147.field5735, var46, arg1.field9732[var67], var147.field5737);
                                          if (var7) {
                                             var150 = (long)(var69 << 2) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                             var152 = arg1.field9737[var67];
                                             var153 = arg1.field9734[var67];
                                             var154 = arg1.field9732[var67];
                                             var155 = var32[var152];
                                             this.field8856[var46] = this.method4483(var155.field2945, var74, var150, arg1, 12, var155.field2951, var73, var155.field2944, var46, var152, var155.field2946);
                                             var156 = var32[var153];
                                             this.field8836[var46] = this.method4483(var156.field2945, var76, (long)var79 + var150, arg1, 12, var156.field2951, var75, var156.field2944, var46, var153, var156.field2946);
                                             var157 = var32[var154];
                                             this.field8798[var46] = this.method4483(var157.field2945, var78, (long)var80 + var150, arg1, 12, var157.field2951, var77, var157.field2944, var46, var154, var157.field2946);
                                             if (arg1.field9721 != null) {
                                                this.field8821[var46] = arg1.field9721[var67];
                                             }

                                             if (arg1.field9730 != null) {
                                                this.field8814[var46] = arg1.field9730[var67];
                                             }

                                             this.field8831[var46] = arg1.field9715[var67];
                                             this.field8758[var46] = var71;
                                             ++var46;
                                          } else {
                                             if (arg1.field9721 != null) {
                                                this.field8821[var46] = arg1.field9721[var67];
                                             }

                                             if (arg1.field9730 != null) {
                                                this.field8814[var46] = arg1.field9730[var67];
                                             }

                                             this.field8831[var46] = arg1.field9715[var67];
                                             this.field8758[var46] = var71;
                                             ++var46;
                                          }
                                       } else {
                                          if (arg1.field9721 != null) {
                                             this.field8821[var46] = arg1.field9721[var67];
                                          }

                                          if (arg1.field9730 != null) {
                                             this.field8814[var46] = arg1.field9730[var67];
                                          }

                                          this.field8831[var46] = arg1.field9715[var67];
                                          this.field8758[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       var150 = (long)(var69 << 2) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                       var152 = arg1.field9737[var67];
                                       var153 = arg1.field9734[var67];
                                       var154 = arg1.field9732[var67];
                                       var155 = var32[var152];
                                       this.field8856[var46] = this.method4483(var155.field2945, var74, var150, arg1, 12, var155.field2951, var73, var155.field2944, var46, var152, var155.field2946);
                                       var156 = var32[var153];
                                       this.field8836[var46] = this.method4483(var156.field2945, var76, (long)var79 + var150, arg1, 12, var156.field2951, var75, var156.field2944, var46, var153, var156.field2946);
                                       var157 = var32[var154];
                                       this.field8798[var46] = this.method4483(var157.field2945, var78, (long)var80 + var150, arg1, 12, var157.field2951, var77, var157.field2944, var46, var154, var157.field2946);
                                       if (arg1.field9721 != null) {
                                          this.field8821[var46] = arg1.field9721[var67];
                                       }

                                       if (arg1.field9730 != null) {
                                          this.field8814[var46] = arg1.field9730[var67];
                                       }

                                       this.field8831[var46] = arg1.field9715[var67];
                                       this.field8758[var46] = var71;
                                       ++var46;
                                    }

                                    if (~var46 <= ~this.field8815) {
                                       var10000 = ~this.field8863;
                                       if (!var7) {
                                          if (var10000 < -1) {
                                             var158 = 1;
                                             var159 = this.field8758[0];
                                             var160 = 0;
                                             if (var7) {
                                                var161 = this.field8758[var160];
                                                if (~var159 != ~var161) {
                                                   ++var158;
                                                   var159 = var161;
                                                }

                                                ++var160;
                                             }

                                             while(true) {
                                                if (var160 >= this.field8863) {
                                                   this.field8809 = new int[var158 + 1];
                                                   this.field8807 = new int[var158];
                                                   this.field8865 = new int[var158];
                                                   this.field8809[0] = 0;
                                                   var177 = this.field8813;
                                                   var159 = this.field8758[0];
                                                   var158 = 0;
                                                   var162 = 0;
                                                   var163 = 0;
                                                   if (!var7) {
                                                      label3496: {
                                                         if (var7) {
                                                            var180 = this;
                                                         } else if (var163 >= this.field8863) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            var180 = this;
                                                            if (!var7) {
                                                               break label3496;
                                                            }
                                                         } else {
                                                            var180 = this;
                                                         }

                                                         while(true) {
                                                            var164 = var180.field8758[var163];
                                                            if (var159 != var164) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               ++var158;
                                                               this.field8809[var158] = var163;
                                                               var159 = var164;
                                                               var162 = 0;
                                                               var177 = this.field8813;
                                                            }

                                                            var165 = this.field8856[var163];
                                                            if (~var162 > ~var165) {
                                                               var162 = var165;
                                                            }

                                                            if (var177 > var165) {
                                                               var177 = var165;
                                                            }

                                                            var166 = this.field8836[var163];
                                                            if (var162 < var166) {
                                                               var162 = var166;
                                                            }

                                                            if (~var177 < ~var166) {
                                                               var177 = var166;
                                                            }

                                                            var167 = this.field8798[var163];
                                                            if (~var167 < ~var162) {
                                                               var162 = var167;
                                                            }

                                                            if (~var177 < ~var167) {
                                                               var177 = var167;
                                                            }

                                                            ++var163;
                                                            if (var163 >= this.field8863) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               var180 = this;
                                                               if (!var7) {
                                                                  break;
                                                               }
                                                            } else {
                                                               var180 = this;
                                                            }
                                                         }
                                                      }

                                                      ++var158;
                                                      var180.field8809[var158] = this.field8863;
                                                      break;
                                                   }
                                                } else {
                                                   var177 = this.field8758[var160];
                                                }

                                                if (~var159 != ~var177) {
                                                   ++var158;
                                                   var159 = var177;
                                                }

                                                ++var160;
                                             }
                                          }

                                          class650.field9428 = null;
                                          this.field8789 = class647.method4751(this.field8813, -29427, this.field8789);
                                          this.field8847 = class647.method4751(this.field8813, -29427, this.field8847);
                                          this.field8833 = class647.method4751(this.field8813, -29427, this.field8833);
                                          this.field8752 = class647.method4751(this.field8813, -29427, this.field8752);
                                          this.field8850 = class647.method4751(this.field8813, -29427, this.field8850);
                                          this.field8854 = class573.method4245(this.field8854, (byte)115, this.field8813);
                                          this.field8860 = class5.method41(false, this.field8860, this.field8813);
                                          this.field8827 = class5.method41(false, this.field8827, this.field8813);
                                          if (arg1.field9697 != null && class109.method1044(arg2, 118, this.field8851)) {
                                             this.field8774 = arg1.method4879((byte)111, false);
                                          }

                                          if (arg1.field9680 != null && class250.method2028(arg2, true, this.field8851)) {
                                             this.field8822 = arg1.method4871((byte)-88);
                                          }

                                          if (arg1.field9711 != null && class490.method3703(arg2, this.field8851, (byte)-55)) {
                                             var168 = 0;
                                             var169 = new int[256];
                                             var170 = 0;
                                             if (var7) {
                                                var171 = arg1.field9711[var9[var170]];
                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }

                                             while(true) {
                                                if (var170 >= this.field8815) {
                                                   this.field8747 = new int[var168 + 1][];
                                                   var171 = 0;
                                                   if (!var7) {
                                                      if (var7) {
                                                         this.field8747[var171] = new int[var169[var171]];
                                                         var169[var171] = 0;
                                                         ++var171;
                                                      }

                                                      while(true) {
                                                         while(~var168 <= ~var171) {
                                                            this.field8747[var171] = new int[var169[var171]];
                                                            var169[var171] = 0;
                                                            ++var171;
                                                         }

                                                         var172 = 0;
                                                         if (!var7) {
                                                            if (!var7 && ~this.field8815 >= ~var172) {
                                                               return;
                                                            }

                                                            do {
                                                               var173 = arg1.field9711[var9[var172]];
                                                               if (~var173 <= -1) {
                                                                  this.field8747[var173][var169[var173]++] = var172;
                                                               }

                                                               ++var172;
                                                            } while(~this.field8815 < ~var172);

                                                            return;
                                                         }

                                                         ++var171;
                                                      }
                                                   }
                                                } else {
                                                   var171 = arg1.field9711[var9[var170]];
                                                }

                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }
                                          }

                                          return;
                                       }
                                    } else {
                                       var10000 = var9[var46];
                                    }

                                    var67 = var10000;
                                    var68 = arg1.field9715[var67] & 65535;
                                    if (arg1.field9719 != null) {
                                       var69 = arg1.field9719[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field9721 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field9721[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field9721[var67] & 255;
                                    }

                                    var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                    if (var71 != -1 && (64 & this.field8851) != 0) {
                                       var72 = var8.method1456(-8988, var71 & 65535);
                                       if (var72.field10175) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field8857[var41];
                           }

                           var42 = var10000;
                           this.field8857[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class195();
                           ++var41;
                        }
                     }
                  } else {
                     var178 = arg1;
                  }
               } else {
                  var33 = this.field8815 * 3;
                  this.field8827 = new float[var33];
                  this.field8836 = new short[this.field8815];
                  this.field8751 = (short)arg4;
                  this.field8847 = new short[var33];
                  this.field8775 = new short[var33];
                  class650.field9428 = new long[var33];
                  this.field8854 = new byte[var33];
                  this.field8798 = new short[this.field8815];
                  this.field8758 = new short[this.field8815];
                  this.field8821 = new byte[this.field8815];
                  this.field8789 = new short[var33];
                  this.field8856 = new short[this.field8815];
                  this.field8850 = new short[var33];
                  this.field8860 = new float[var33];
                  this.field8833 = new short[var33];
                  this.field8779 = (short)arg3;
                  this.field8752 = new short[var33];
                  var178 = arg1;
                  if (!var7) {
                     if (arg1.field9730 != null) {
                        this.field8814 = new short[this.field8815];
                     }

                     this.field8831 = new short[this.field8815];
                     var40 = 0;
                     var41 = 0;
                     if (var7) {
                        var42 = this.field8857[var41];
                        this.field8857[var41] = var40;
                        var40 += var42;
                        var32[var41] = new class195();
                        ++var41;
                     }

                     while(true) {
                        if (~var41 <= ~arg1.field9708) {
                           this.field8857[arg1.field9708] = var40;
                           var43 = class98.method929(this.field8815, var9, arg1, (byte)117);
                           var44 = new class388[arg1.field9736];
                           var10000 = 0;
                           if (!var7) {
                              label1350: {
                                 var45 = 0;
                                 if (var7) {
                                    var46 = arg1.field9737[var45];
                                 } else if (~arg1.field9736 >= ~var45) {
                                    var46 = 0;
                                    if (!var7) {
                                       break label1350;
                                    }
                                 } else {
                                    var46 = arg1.field9737[var45];
                                 }

                                 label1353:
                                 while(true) {
                                    var47 = arg1.field9734[var45];
                                    var48 = arg1.field9732[var45];
                                    var49 = this.field8787[var47] - this.field8787[var46];
                                    var50 = this.field8796[var47] - this.field8796[var46];
                                    var51 = this.field8791[var47] - this.field8791[var46];
                                    var52 = this.field8787[var48] + -this.field8787[var46];
                                    var53 = this.field8796[var48] + -this.field8796[var46];
                                    var54 = this.field8791[var48] + -this.field8791[var46];
                                    var55 = var50 * var54 + -(var51 * var53);
                                    var56 = var51 * var52 - var49 * var54;
                                    var57 = var49 * var53 + -(var50 * var52);
                                    if (var7) {
                                       var55 >>= 1;
                                       var57 >>= 1;
                                       var56 >>= 1;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (~var55 >= -8193) {
                                             if (var7) {
                                                var56 >>= 8192;
                                                continue;
                                             }

                                             if (var56 <= 8192 && var57 <= 8192 && ~var55 <= 8191 && ~var56 <= 8191 && ~var57 <= 8191) {
                                                var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                if (~var58 >= -1) {
                                                   var176 = 1;
                                                   var59 = var57 * 256 / var176;
                                                   var60 = var56 * 256 / var176;
                                                   var61 = var55 * 256 / var176;
                                                   var179 = arg1.field9705 == null ? 0 : arg1.field9705[var45];
                                                } else {
                                                   var59 = var57 * 256 / var58;
                                                   var60 = var56 * 256 / var58;
                                                   var61 = var55 * 256 / var58;
                                                   var179 = arg1.field9705 == null ? 0 : arg1.field9705[var45];
                                                }

                                                label4130: {
                                                   var62 = var179;
                                                   if (~var62 != -1) {
                                                      if (var62 != 1) {
                                                         ++var45;
                                                         break label4130;
                                                      }

                                                      var63 = var44[var45] = new class388();
                                                      var63.field5737 = var59;
                                                      var63.field5735 = var60;
                                                      var63.field5736 = var61;
                                                      if (!var7) {
                                                         ++var45;
                                                         break label4130;
                                                      }
                                                   }

                                                   var64 = var32[var46];
                                                   ++var64.field2951;
                                                   var64.field2944 += var60;
                                                   var64.field2945 += var61;
                                                   var64.field2946 += var59;
                                                   var65 = var32[var47];
                                                   ++var65.field2951;
                                                   var65.field2946 += var59;
                                                   var65.field2945 += var61;
                                                   var65.field2944 += var60;
                                                   var66 = var32[var48];
                                                   var66.field2944 += var60;
                                                   var66.field2946 += var59;
                                                   var66.field2945 += var61;
                                                   ++var66.field2951;
                                                   ++var45;
                                                }

                                                if (~arg1.field9736 >= ~var45) {
                                                   var46 = 0;
                                                   if (!var7) {
                                                      break label1353;
                                                   }
                                                } else {
                                                   var46 = arg1.field9737[var45];
                                                }
                                                continue label1353;
                                             }
                                          }

                                          var55 >>= 1;
                                          var57 >>= 1;
                                          var56 >>= 1;
                                       }
                                    }
                                 }
                              }

                              if (var7) {
                                 var67 = var9[var46];
                                 var68 = arg1.field9715[var67] & 65535;
                                 if (arg1.field9719 != null) {
                                    var69 = arg1.field9719[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field9721 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = arg1.field9721[var67] & 255;
                                    }
                                 } else {
                                    var70 = arg1.field9721[var67] & 255;
                                 }

                                 var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                 if (var71 != -1 && (64 & this.field8851) != 0) {
                                    var72 = var8.method1456(-8988, var71 & 65535);
                                    if (var72.field10175) {
                                       var71 = -1;
                                    }
                                 }
                              } else {
                                 if (~var46 <= ~this.field8815) {
                                    var10000 = ~this.field8863;
                                    if (!var7) {
                                       if (var10000 < -1) {
                                          var158 = 1;
                                          var159 = this.field8758[0];
                                          var160 = 0;
                                          if (var7) {
                                             var161 = this.field8758[var160];
                                             if (~var159 != ~var161) {
                                                ++var158;
                                                var159 = var161;
                                             }

                                             ++var160;
                                          }

                                          while(true) {
                                             if (var160 >= this.field8863) {
                                                this.field8809 = new int[var158 + 1];
                                                this.field8807 = new int[var158];
                                                this.field8865 = new int[var158];
                                                this.field8809[0] = 0;
                                                var177 = this.field8813;
                                                var159 = this.field8758[0];
                                                var158 = 0;
                                                var162 = 0;
                                                var163 = 0;
                                                if (!var7) {
                                                   label1557: {
                                                      if (var7) {
                                                         var180 = this;
                                                      } else if (var163 >= this.field8863) {
                                                         this.field8807[var158] = var177;
                                                         this.field8865[var158] = -var177 + var162 + 1;
                                                         var180 = this;
                                                         if (!var7) {
                                                            break label1557;
                                                         }
                                                      } else {
                                                         var180 = this;
                                                      }

                                                      while(true) {
                                                         var164 = var180.field8758[var163];
                                                         if (var159 != var164) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            ++var158;
                                                            this.field8809[var158] = var163;
                                                            var159 = var164;
                                                            var162 = 0;
                                                            var177 = this.field8813;
                                                         }

                                                         var165 = this.field8856[var163];
                                                         if (~var162 > ~var165) {
                                                            var162 = var165;
                                                         }

                                                         if (var177 > var165) {
                                                            var177 = var165;
                                                         }

                                                         var166 = this.field8836[var163];
                                                         if (var162 < var166) {
                                                            var162 = var166;
                                                         }

                                                         if (~var177 < ~var166) {
                                                            var177 = var166;
                                                         }

                                                         var167 = this.field8798[var163];
                                                         if (~var167 < ~var162) {
                                                            var162 = var167;
                                                         }

                                                         if (~var177 < ~var167) {
                                                            var177 = var167;
                                                         }

                                                         ++var163;
                                                         if (var163 >= this.field8863) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            var180 = this;
                                                            if (!var7) {
                                                               break;
                                                            }
                                                         } else {
                                                            var180 = this;
                                                         }
                                                      }
                                                   }

                                                   ++var158;
                                                   var180.field8809[var158] = this.field8863;
                                                   break;
                                                }
                                             } else {
                                                var177 = this.field8758[var160];
                                             }

                                             if (~var159 != ~var177) {
                                                ++var158;
                                                var159 = var177;
                                             }

                                             ++var160;
                                          }
                                       }

                                       class650.field9428 = null;
                                       this.field8789 = class647.method4751(this.field8813, -29427, this.field8789);
                                       this.field8847 = class647.method4751(this.field8813, -29427, this.field8847);
                                       this.field8833 = class647.method4751(this.field8813, -29427, this.field8833);
                                       this.field8752 = class647.method4751(this.field8813, -29427, this.field8752);
                                       this.field8850 = class647.method4751(this.field8813, -29427, this.field8850);
                                       this.field8854 = class573.method4245(this.field8854, (byte)115, this.field8813);
                                       this.field8860 = class5.method41(false, this.field8860, this.field8813);
                                       this.field8827 = class5.method41(false, this.field8827, this.field8813);
                                       if (arg1.field9697 != null && class109.method1044(arg2, 118, this.field8851)) {
                                          this.field8774 = arg1.method4879((byte)111, false);
                                       }

                                       if (arg1.field9680 != null && class250.method2028(arg2, true, this.field8851)) {
                                          this.field8822 = arg1.method4871((byte)-88);
                                       }

                                       if (arg1.field9711 != null && class490.method3703(arg2, this.field8851, (byte)-55)) {
                                          var168 = 0;
                                          var169 = new int[256];
                                          var170 = 0;
                                          if (var7) {
                                             var171 = arg1.field9711[var9[var170]];
                                             if (~var171 <= -1) {
                                                var10002 = var169[var171]++;
                                                if (~var171 < ~var168) {
                                                   var168 = var171;
                                                }
                                             }

                                             ++var170;
                                          }

                                          while(true) {
                                             if (var170 >= this.field8815) {
                                                this.field8747 = new int[var168 + 1][];
                                                var171 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      this.field8747[var171] = new int[var169[var171]];
                                                      var169[var171] = 0;
                                                      ++var171;
                                                   }

                                                   while(true) {
                                                      while(~var168 <= ~var171) {
                                                         this.field8747[var171] = new int[var169[var171]];
                                                         var169[var171] = 0;
                                                         ++var171;
                                                      }

                                                      var172 = 0;
                                                      if (!var7) {
                                                         if (!var7 && ~this.field8815 >= ~var172) {
                                                            return;
                                                         }

                                                         do {
                                                            var173 = arg1.field9711[var9[var172]];
                                                            if (~var173 <= -1) {
                                                               this.field8747[var173][var169[var173]++] = var172;
                                                            }

                                                            ++var172;
                                                         } while(~this.field8815 < ~var172);

                                                         return;
                                                      }

                                                      ++var171;
                                                   }
                                                }
                                             } else {
                                                var171 = arg1.field9711[var9[var170]];
                                             }

                                             if (~var171 <= -1) {
                                                var10002 = var169[var171]++;
                                                if (~var171 < ~var168) {
                                                   var168 = var171;
                                                }
                                             }

                                             ++var170;
                                          }
                                       }

                                       return;
                                    }
                                 } else {
                                    var10000 = var9[var46];
                                 }

                                 var67 = var10000;
                                 var68 = arg1.field9715[var67] & 65535;
                                 if (arg1.field9719 != null) {
                                    var69 = arg1.field9719[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field9721 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = arg1.field9721[var67] & 255;
                                    }
                                 } else {
                                    var70 = arg1.field9721[var67] & 255;
                                 }

                                 var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                 if (var71 != -1 && (64 & this.field8851) != 0) {
                                    var72 = var8.method1456(-8988, var71 & 65535);
                                    if (var72.field10175) {
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
                                 if (~var71 != 0) {
                                    label4223: {
                                       if (~var69 == 0) {
                                          var76 = 1.0F;
                                          var73 = 0.0F;
                                          var77 = 0.0F;
                                          var75 = 1.0F;
                                          var74 = 1.0F;
                                          var78 = 0.0F;
                                          var80 = 2;
                                          var79 = 1;
                                          if (!var7) {
                                             break label4223;
                                          }
                                       }

                                       var69 &= 255;
                                       var82 = arg1.field9709[var69];
                                       if (var82 == 0) {
                                          var83 = arg1.field9737[var67];
                                          var84 = arg1.field9734[var67];
                                          var85 = arg1.field9732[var67];
                                          var86 = arg1.field9707[var69];
                                          var87 = arg1.field9723[var69];
                                          var88 = arg1.field9693[var69];
                                          var89 = (float)arg1.field9726[var86];
                                          var90 = (float)arg1.field9706[var86];
                                          var91 = (float)arg1.field9689[var86];
                                          var92 = (float)arg1.field9726[var87] + -var89;
                                          var93 = (float)arg1.field9706[var87] - var90;
                                          var94 = (float)arg1.field9689[var87] + -var91;
                                          var95 = (float)arg1.field9726[var88] - var89;
                                          var96 = (float)arg1.field9706[var88] - var90;
                                          var97 = (float)arg1.field9689[var88] - var91;
                                          var98 = (float)arg1.field9726[var83] - var89;
                                          var99 = (float)arg1.field9706[var83] - var90;
                                          var100 = (float)arg1.field9689[var83] + -var91;
                                          var101 = (float)arg1.field9726[var84] - var89;
                                          var102 = (float)arg1.field9706[var84] + -var90;
                                          var103 = (float)arg1.field9689[var84] + -var91;
                                          var104 = (float)arg1.field9726[var85] - var89;
                                          var105 = (float)arg1.field9706[var85] - var90;
                                          var106 = (float)arg1.field9689[var85] - var91;
                                          var107 = var93 * var97 + -(var94 * var96);
                                          var108 = var94 * var95 - var92 * var97;
                                          var109 = var92 * var96 + -(var93 * var95);
                                          var110 = var96 * var109 + -(var97 * var108);
                                          var111 = var97 * var107 + -(var95 * var109);
                                          var112 = var95 * var108 + -(var96 * var107);
                                          var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                          var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                          var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                          var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                          var114 = var94 * var107 + -(var92 * var109);
                                          var115 = var92 * var108 - var93 * var107;
                                          var116 = var93 * var109 + -(var94 * var108);
                                          var117 = 1.0F / (var97 * var115 + var95 * var116 + var96 * var114);
                                          var78 = (var106 * var115 + var104 * var116 + var105 * var114) * var117;
                                          var74 = (var100 * var115 + var98 * var116 + var99 * var114) * var117;
                                          var76 = (var103 * var115 + var101 * var116 + var102 * var114) * var117;
                                          if (!var7) {
                                             break label4223;
                                          }
                                       }

                                       var118 = arg1.field9737[var67];
                                       var119 = arg1.field9734[var67];
                                       var120 = arg1.field9732[var67];
                                       var121 = var43.field3506[var69];
                                       var122 = var43.field3503[var69];
                                       var123 = var43.field3505[var69];
                                       var124 = var43.field3502[var69];
                                       var125 = arg1.field9733[var69];
                                       var126 = (float)arg1.field9701[var69] / 256.0F;
                                       if (var82 != 1) {
                                          label1811: {
                                             if (~var82 != -3) {
                                                if (var82 != 3) {
                                                   break label1811;
                                                }

                                                class481.method3638(arg1.field9689[var118], arg1.field9706[var118], var122, class401.field5895, var124, var126, var125, arg1.field9726[var118], var121, (byte)113, var123);
                                                var74 = class401.field5895[1];
                                                var73 = class401.field5895[0];
                                                class481.method3638(arg1.field9689[var119], arg1.field9706[var119], var122, class401.field5895, var124, var126, var125, arg1.field9726[var119], var121, (byte)-120, var123);
                                                var75 = class401.field5895[0];
                                                var76 = class401.field5895[1];
                                                class481.method3638(arg1.field9689[var120], arg1.field9706[var120], var122, class401.field5895, var124, var126, var125, arg1.field9726[var120], var121, (byte)111, var123);
                                                var77 = class401.field5895[0];
                                                var78 = class401.field5895[1];
                                                if ((1 & var125) != 0) {
                                                   if (!(var76 - var74 > 0.5F)) {
                                                      if (var74 - var76 > 0.5F) {
                                                         var79 = 2;
                                                         ++var76;
                                                         if (var7) {
                                                            var79 = 1;
                                                            --var76;
                                                         }
                                                      }
                                                   } else {
                                                      var79 = 1;
                                                      --var76;
                                                   }

                                                   if (var78 - var74 > 0.5F) {
                                                      --var78;
                                                      var80 = 1;
                                                      if (!var7) {
                                                         break label1811;
                                                      }
                                                   }

                                                   if (!(-var78 + var74 > 0.5F)) {
                                                      break label1811;
                                                   }

                                                   var80 = 2;
                                                   ++var78;
                                                   if (!var7) {
                                                      break label1811;
                                                   }

                                                   if (var75 - var73 > 0.5F) {
                                                      var79 = 1;
                                                      --var75;
                                                      if (var7 && var73 - var75 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }
                                                   } else if (var73 - var75 > 0.5F) {
                                                      var79 = 2;
                                                      ++var75;
                                                   }
                                                } else if (var75 - var73 > 0.5F) {
                                                   var79 = 1;
                                                   --var75;
                                                   if (var7 && var73 - var75 > 0.5F) {
                                                      var79 = 2;
                                                      ++var75;
                                                   }
                                                } else if (var73 - var75 > 0.5F) {
                                                   var79 = 2;
                                                   ++var75;
                                                }

                                                if (!(-var73 + var77 > 0.5F)) {
                                                   if (!(-var77 + var73 > 0.5F)) {
                                                      break label1811;
                                                   }

                                                   var80 = 2;
                                                   ++var77;
                                                   if (!var7) {
                                                      break label1811;
                                                   }
                                                }

                                                --var77;
                                                var80 = 1;
                                                if (!var7) {
                                                   break label1811;
                                                }
                                             }

                                             var127 = (float)arg1.field9684[var69] / 256.0F;
                                             var128 = (float)arg1.field9725[var69] / 256.0F;
                                             var129 = arg1.field9726[var119] - arg1.field9726[var118];
                                             var130 = arg1.field9706[var119] + -arg1.field9706[var118];
                                             var131 = arg1.field9689[var119] - arg1.field9689[var118];
                                             var132 = arg1.field9726[var120] - arg1.field9726[var118];
                                             var133 = arg1.field9706[var120] + -arg1.field9706[var118];
                                             var134 = arg1.field9689[var120] + -arg1.field9689[var118];
                                             var135 = var130 * var134 - var131 * var133;
                                             var136 = var131 * var132 - var129 * var134;
                                             var137 = var129 * var133 + -(var130 * var132);
                                             var138 = 64.0F / (float)arg1.field9722[var69];
                                             var139 = 64.0F / (float)arg1.field9724[var69];
                                             var140 = 64.0F / (float)arg1.field9731[var69];
                                             var141 = (var124[2] * (float)var137 + var124[1] * (float)var136 + var124[0] * (float)var135) / var138;
                                             var142 = (var124[5] * (float)var137 + var124[3] * (float)var135 + var124[4] * (float)var136) / var139;
                                             var143 = (var124[8] * (float)var137 + var124[7] * (float)var136 + var124[6] * (float)var135) / var140;
                                             var81 = class484.method3660(var143, var142, var141, (byte)-52);
                                             class152.method1412(arg1.field9726[var118], var121, var126, (byte)-118, var127, arg1.field9706[var118], var122, var123, var125, var81, arg1.field9689[var118], class401.field5895, var124, var128);
                                             var74 = class401.field5895[1];
                                             var73 = class401.field5895[0];
                                             class152.method1412(arg1.field9726[var119], var121, var126, (byte)34, var127, arg1.field9706[var119], var122, var123, var125, var81, arg1.field9689[var119], class401.field5895, var124, var128);
                                             var76 = class401.field5895[1];
                                             var75 = class401.field5895[0];
                                             class152.method1412(arg1.field9726[var120], var121, var126, (byte)58, var127, arg1.field9706[var120], var122, var123, var125, var81, arg1.field9689[var120], class401.field5895, var124, var128);
                                             var77 = class401.field5895[0];
                                             var78 = class401.field5895[1];
                                             if (var7) {
                                                var144 = (float)arg1.field9731[var69] / 1024.0F;
                                                class318.method2487(var122, var124, var121, var123, arg1.field9706[var118], var125, var126, (byte)-125, arg1.field9726[var118], var144, class401.field5895, arg1.field9689[var118]);
                                                var74 = class401.field5895[1];
                                                var73 = class401.field5895[0];
                                                class318.method2487(var122, var124, var121, var123, arg1.field9706[var119], var125, var126, (byte)-128, arg1.field9726[var119], var144, class401.field5895, arg1.field9689[var119]);
                                                var76 = class401.field5895[1];
                                                var75 = class401.field5895[0];
                                                class318.method2487(var122, var124, var121, var123, arg1.field9706[var120], var125, var126, (byte)-126, arg1.field9726[var120], var144, class401.field5895, arg1.field9689[var120]);
                                                var77 = class401.field5895[0];
                                                var78 = class401.field5895[1];
                                                var145 = var144 / 2.0F;
                                                if ((1 & var125) != 0) {
                                                   if (!(-var74 + var76 > var145)) {
                                                      if (var145 < -var76 + var74) {
                                                         var76 += var144;
                                                         var79 = 2;
                                                         if (var7) {
                                                            var76 -= var144;
                                                            var79 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var76 -= var144;
                                                      var79 = 1;
                                                   }

                                                   if (var78 - var74 > var145) {
                                                      var78 -= var144;
                                                      var80 = 1;
                                                      if (var7 && var145 < -var78 + var74) {
                                                         var78 += var144;
                                                         var80 = 2;
                                                         if (var7) {
                                                            if (!(var77 - var73 > var145)) {
                                                               if (var145 < -var77 + var73) {
                                                                  var80 = 2;
                                                                  var77 += var144;
                                                                  if (var7) {
                                                                     var77 -= var144;
                                                                     var80 = 1;
                                                                  }
                                                               }
                                                            } else {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }

                                                            if (var75 - var73 > var145) {
                                                               var79 = 1;
                                                               var75 -= var144;
                                                               if (var7 && var145 < var73 - var75) {
                                                                  var79 = 2;
                                                                  var75 += var144;
                                                               }
                                                            } else if (var145 < var73 - var75) {
                                                               var79 = 2;
                                                               var75 += var144;
                                                            }
                                                         }
                                                      }
                                                   } else if (var145 < -var78 + var74) {
                                                      var78 += var144;
                                                      var80 = 2;
                                                      if (var7) {
                                                         if (!(var77 - var73 > var145)) {
                                                            if (var145 < -var77 + var73) {
                                                               var80 = 2;
                                                               var77 += var144;
                                                               if (var7) {
                                                                  var77 -= var144;
                                                                  var80 = 1;
                                                               }
                                                            }
                                                         } else {
                                                            var77 -= var144;
                                                            var80 = 1;
                                                         }

                                                         if (var75 - var73 > var145) {
                                                            var79 = 1;
                                                            var75 -= var144;
                                                            if (var7 && var145 < var73 - var75) {
                                                               var79 = 2;
                                                               var75 += var144;
                                                            }
                                                         } else if (var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   if (!(var77 - var73 > var145)) {
                                                      if (var145 < -var77 + var73) {
                                                         var80 = 2;
                                                         var77 += var144;
                                                         if (var7) {
                                                            var77 -= var144;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var77 -= var144;
                                                      var80 = 1;
                                                   }

                                                   if (var75 - var73 > var145) {
                                                      var79 = 1;
                                                      var75 -= var144;
                                                      if (var7 && var145 < var73 - var75) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                      }
                                                   } else if (var145 < var73 - var75) {
                                                      var79 = 2;
                                                      var75 += var144;
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var144 = (float)arg1.field9731[var69] / 1024.0F;
                                          class318.method2487(var122, var124, var121, var123, arg1.field9706[var118], var125, var126, (byte)-125, arg1.field9726[var118], var144, class401.field5895, arg1.field9689[var118]);
                                          var74 = class401.field5895[1];
                                          var73 = class401.field5895[0];
                                          class318.method2487(var122, var124, var121, var123, arg1.field9706[var119], var125, var126, (byte)-128, arg1.field9726[var119], var144, class401.field5895, arg1.field9689[var119]);
                                          var76 = class401.field5895[1];
                                          var75 = class401.field5895[0];
                                          class318.method2487(var122, var124, var121, var123, arg1.field9706[var120], var125, var126, (byte)-126, arg1.field9726[var120], var144, class401.field5895, arg1.field9689[var120]);
                                          var77 = class401.field5895[0];
                                          var78 = class401.field5895[1];
                                          var145 = var144 / 2.0F;
                                          if ((1 & var125) != 0) {
                                             if (!(-var74 + var76 > var145)) {
                                                if (var145 < -var76 + var74) {
                                                   var76 += var144;
                                                   var79 = 2;
                                                   if (var7) {
                                                      var76 -= var144;
                                                      var79 = 1;
                                                   }
                                                }
                                             } else {
                                                var76 -= var144;
                                                var79 = 1;
                                             }

                                             if (var78 - var74 > var145) {
                                                var78 -= var144;
                                                var80 = 1;
                                                if (var7 && var145 < -var78 + var74) {
                                                   var78 += var144;
                                                   var80 = 2;
                                                   if (var7) {
                                                      if (!(var77 - var73 > var145)) {
                                                         if (var145 < -var77 + var73) {
                                                            var80 = 2;
                                                            var77 += var144;
                                                            if (var7) {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var77 -= var144;
                                                         var80 = 1;
                                                      }

                                                      if (var75 - var73 > var145) {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7 && var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      } else if (var145 < var73 - var75) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                      }
                                                   }
                                                }
                                             } else if (var145 < -var78 + var74) {
                                                var78 += var144;
                                                var80 = 2;
                                                if (var7) {
                                                   if (!(var77 - var73 > var145)) {
                                                      if (var145 < -var77 + var73) {
                                                         var80 = 2;
                                                         var77 += var144;
                                                         if (var7) {
                                                            var77 -= var144;
                                                            var80 = 1;
                                                         }
                                                      }
                                                   } else {
                                                      var77 -= var144;
                                                      var80 = 1;
                                                   }

                                                   if (var75 - var73 > var145) {
                                                      var79 = 1;
                                                      var75 -= var144;
                                                      if (var7 && var145 < var73 - var75) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                      }
                                                   } else if (var145 < var73 - var75) {
                                                      var79 = 2;
                                                      var75 += var144;
                                                   }
                                                }
                                             }
                                          } else {
                                             if (!(var77 - var73 > var145)) {
                                                if (var145 < -var77 + var73) {
                                                   var80 = 2;
                                                   var77 += var144;
                                                   if (var7) {
                                                      var77 -= var144;
                                                      var80 = 1;
                                                   }
                                                }
                                             } else {
                                                var77 -= var144;
                                                var80 = 1;
                                             }

                                             if (var75 - var73 > var145) {
                                                var79 = 1;
                                                var75 -= var144;
                                                if (var7 && var145 < var73 - var75) {
                                                   var79 = 2;
                                                   var75 += var144;
                                                }
                                             } else if (var145 < var73 - var75) {
                                                var79 = 2;
                                                var75 += var144;
                                             }
                                          }
                                       }
                                    }
                                 }

                                 if (arg1.field9705 == null) {
                                    var146 = 0;
                                    if (var7) {
                                       var146 = arg1.field9705[var67];
                                    }
                                 } else {
                                    var146 = arg1.field9705[var67];
                                 }

                                 if (~var146 != -1) {
                                    if (~var146 == -2) {
                                       var147 = var44[var67];
                                       var148 = (long)((var69 << 2) - (-(~var147.field5736 < -1 ? 1024 : 2048) + (-(var147.field5735 + 256 << 12) - (var147.field5737 + 256 << 22)))) + ((long)(var81 << 24) - (-((long)(var68 << 8)) - (long)var70) << 32);
                                       this.field8856[var46] = this.method4483(var147.field5736, var74, var148, arg1, 12, 0, var73, var147.field5735, var46, arg1.field9737[var67], var147.field5737);
                                       this.field8836[var46] = this.method4483(var147.field5736, var76, (long)var79 + var148, arg1, 12, 0, var75, var147.field5735, var46, arg1.field9734[var67], var147.field5737);
                                       this.field8798[var46] = this.method4483(var147.field5736, var78, (long)var80 + var148, arg1, 12, 0, var77, var147.field5735, var46, arg1.field9732[var67], var147.field5737);
                                       if (var7) {
                                          var150 = (long)(var69 << 2) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                          var152 = arg1.field9737[var67];
                                          var153 = arg1.field9734[var67];
                                          var154 = arg1.field9732[var67];
                                          var155 = var32[var152];
                                          this.field8856[var46] = this.method4483(var155.field2945, var74, var150, arg1, 12, var155.field2951, var73, var155.field2944, var46, var152, var155.field2946);
                                          var156 = var32[var153];
                                          this.field8836[var46] = this.method4483(var156.field2945, var76, (long)var79 + var150, arg1, 12, var156.field2951, var75, var156.field2944, var46, var153, var156.field2946);
                                          var157 = var32[var154];
                                          this.field8798[var46] = this.method4483(var157.field2945, var78, (long)var80 + var150, arg1, 12, var157.field2951, var77, var157.field2944, var46, var154, var157.field2946);
                                          if (arg1.field9721 != null) {
                                             this.field8821[var46] = arg1.field9721[var67];
                                          }

                                          if (arg1.field9730 != null) {
                                             this.field8814[var46] = arg1.field9730[var67];
                                          }

                                          this.field8831[var46] = arg1.field9715[var67];
                                          this.field8758[var46] = var71;
                                          ++var46;
                                       } else {
                                          if (arg1.field9721 != null) {
                                             this.field8821[var46] = arg1.field9721[var67];
                                          }

                                          if (arg1.field9730 != null) {
                                             this.field8814[var46] = arg1.field9730[var67];
                                          }

                                          this.field8831[var46] = arg1.field9715[var67];
                                          this.field8758[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       if (arg1.field9721 != null) {
                                          this.field8821[var46] = arg1.field9721[var67];
                                       }

                                       if (arg1.field9730 != null) {
                                          this.field8814[var46] = arg1.field9730[var67];
                                       }

                                       this.field8831[var46] = arg1.field9715[var67];
                                       this.field8758[var46] = var71;
                                       ++var46;
                                    }
                                 } else {
                                    var150 = (long)(var69 << 2) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                    var152 = arg1.field9737[var67];
                                    var153 = arg1.field9734[var67];
                                    var154 = arg1.field9732[var67];
                                    var155 = var32[var152];
                                    this.field8856[var46] = this.method4483(var155.field2945, var74, var150, arg1, 12, var155.field2951, var73, var155.field2944, var46, var152, var155.field2946);
                                    var156 = var32[var153];
                                    this.field8836[var46] = this.method4483(var156.field2945, var76, (long)var79 + var150, arg1, 12, var156.field2951, var75, var156.field2944, var46, var153, var156.field2946);
                                    var157 = var32[var154];
                                    this.field8798[var46] = this.method4483(var157.field2945, var78, (long)var80 + var150, arg1, 12, var157.field2951, var77, var157.field2944, var46, var154, var157.field2946);
                                    if (arg1.field9721 != null) {
                                       this.field8821[var46] = arg1.field9721[var67];
                                    }

                                    if (arg1.field9730 != null) {
                                       this.field8814[var46] = arg1.field9730[var67];
                                    }

                                    this.field8831[var46] = arg1.field9715[var67];
                                    this.field8758[var46] = var71;
                                    ++var46;
                                 }

                                 if (~var46 <= ~this.field8815) {
                                    var10000 = ~this.field8863;
                                    if (!var7) {
                                       if (var10000 < -1) {
                                          var158 = 1;
                                          var159 = this.field8758[0];
                                          var160 = 0;
                                          if (var7) {
                                             var161 = this.field8758[var160];
                                             if (~var159 != ~var161) {
                                                ++var158;
                                                var159 = var161;
                                             }

                                             ++var160;
                                          }

                                          while(true) {
                                             if (var160 >= this.field8863) {
                                                this.field8809 = new int[var158 + 1];
                                                this.field8807 = new int[var158];
                                                this.field8865 = new int[var158];
                                                this.field8809[0] = 0;
                                                var177 = this.field8813;
                                                var159 = this.field8758[0];
                                                var158 = 0;
                                                var162 = 0;
                                                var163 = 0;
                                                if (!var7) {
                                                   label2290: {
                                                      if (var7) {
                                                         var180 = this;
                                                      } else if (var163 >= this.field8863) {
                                                         this.field8807[var158] = var177;
                                                         this.field8865[var158] = -var177 + var162 + 1;
                                                         var180 = this;
                                                         if (!var7) {
                                                            break label2290;
                                                         }
                                                      } else {
                                                         var180 = this;
                                                      }

                                                      while(true) {
                                                         var164 = var180.field8758[var163];
                                                         if (var159 != var164) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            ++var158;
                                                            this.field8809[var158] = var163;
                                                            var159 = var164;
                                                            var162 = 0;
                                                            var177 = this.field8813;
                                                         }

                                                         var165 = this.field8856[var163];
                                                         if (~var162 > ~var165) {
                                                            var162 = var165;
                                                         }

                                                         if (var177 > var165) {
                                                            var177 = var165;
                                                         }

                                                         var166 = this.field8836[var163];
                                                         if (var162 < var166) {
                                                            var162 = var166;
                                                         }

                                                         if (~var177 < ~var166) {
                                                            var177 = var166;
                                                         }

                                                         var167 = this.field8798[var163];
                                                         if (~var167 < ~var162) {
                                                            var162 = var167;
                                                         }

                                                         if (~var177 < ~var167) {
                                                            var177 = var167;
                                                         }

                                                         ++var163;
                                                         if (var163 >= this.field8863) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            var180 = this;
                                                            if (!var7) {
                                                               break;
                                                            }
                                                         } else {
                                                            var180 = this;
                                                         }
                                                      }
                                                   }

                                                   ++var158;
                                                   var180.field8809[var158] = this.field8863;
                                                   break;
                                                }
                                             } else {
                                                var177 = this.field8758[var160];
                                             }

                                             if (~var159 != ~var177) {
                                                ++var158;
                                                var159 = var177;
                                             }

                                             ++var160;
                                          }
                                       }

                                       class650.field9428 = null;
                                       this.field8789 = class647.method4751(this.field8813, -29427, this.field8789);
                                       this.field8847 = class647.method4751(this.field8813, -29427, this.field8847);
                                       this.field8833 = class647.method4751(this.field8813, -29427, this.field8833);
                                       this.field8752 = class647.method4751(this.field8813, -29427, this.field8752);
                                       this.field8850 = class647.method4751(this.field8813, -29427, this.field8850);
                                       this.field8854 = class573.method4245(this.field8854, (byte)115, this.field8813);
                                       this.field8860 = class5.method41(false, this.field8860, this.field8813);
                                       this.field8827 = class5.method41(false, this.field8827, this.field8813);
                                       if (arg1.field9697 != null && class109.method1044(arg2, 118, this.field8851)) {
                                          this.field8774 = arg1.method4879((byte)111, false);
                                       }

                                       if (arg1.field9680 != null && class250.method2028(arg2, true, this.field8851)) {
                                          this.field8822 = arg1.method4871((byte)-88);
                                       }

                                       if (arg1.field9711 != null && class490.method3703(arg2, this.field8851, (byte)-55)) {
                                          var168 = 0;
                                          var169 = new int[256];
                                          var170 = 0;
                                          if (var7) {
                                             var171 = arg1.field9711[var9[var170]];
                                             if (~var171 <= -1) {
                                                var10002 = var169[var171]++;
                                                if (~var171 < ~var168) {
                                                   var168 = var171;
                                                }
                                             }

                                             ++var170;
                                          }

                                          while(true) {
                                             if (var170 >= this.field8815) {
                                                this.field8747 = new int[var168 + 1][];
                                                var171 = 0;
                                                if (!var7) {
                                                   if (var7) {
                                                      this.field8747[var171] = new int[var169[var171]];
                                                      var169[var171] = 0;
                                                      ++var171;
                                                   }

                                                   while(true) {
                                                      while(~var168 <= ~var171) {
                                                         this.field8747[var171] = new int[var169[var171]];
                                                         var169[var171] = 0;
                                                         ++var171;
                                                      }

                                                      var172 = 0;
                                                      if (!var7) {
                                                         if (!var7 && ~this.field8815 >= ~var172) {
                                                            return;
                                                         }

                                                         do {
                                                            var173 = arg1.field9711[var9[var172]];
                                                            if (~var173 <= -1) {
                                                               this.field8747[var173][var169[var173]++] = var172;
                                                            }

                                                            ++var172;
                                                         } while(~this.field8815 < ~var172);

                                                         return;
                                                      }

                                                      ++var171;
                                                   }
                                                }
                                             } else {
                                                var171 = arg1.field9711[var9[var170]];
                                             }

                                             if (~var171 <= -1) {
                                                var10002 = var169[var171]++;
                                                if (~var171 < ~var168) {
                                                   var168 = var171;
                                                }
                                             }

                                             ++var170;
                                          }
                                       }

                                       return;
                                    }
                                 } else {
                                    var10000 = var9[var46];
                                 }

                                 var67 = var10000;
                                 var68 = arg1.field9715[var67] & 65535;
                                 if (arg1.field9719 != null) {
                                    var69 = arg1.field9719[var67];
                                    if (var7) {
                                       var69 = -1;
                                    }
                                 } else {
                                    var69 = -1;
                                 }

                                 if (arg1.field9721 == null) {
                                    var70 = 0;
                                    if (var7) {
                                       var70 = arg1.field9721[var67] & 255;
                                    }
                                 } else {
                                    var70 = arg1.field9721[var67] & 255;
                                 }

                                 var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                 if (var71 != -1 && (64 & this.field8851) != 0) {
                                    var72 = var8.method1456(-8988, var71 & 65535);
                                    if (var72.field10175) {
                                       var71 = -1;
                                    }
                                 }
                              }
                           }
                        } else {
                           var10000 = this.field8857[var41];
                        }

                        var42 = var10000;
                        this.field8857[var41] = var40;
                        var40 += var42;
                        var32[var41] = new class195();
                        ++var41;
                     }
                  }
               }

               while(true) {
                  int var10001;
                  class44 var34;
                  class53 var35;
                  int var36;
                  label3751: {
                     var34 = var178.field9680[var33];
                     var35 = class626.method4587((byte)-127, var34.field989);
                     var36 = -1;
                     int var37 = 0;
                     if (var7) {
                        var10000 = ~var9[var37];
                        var10001 = ~var34.field991;
                     } else if (~this.field8815 >= ~var37) {
                        var10000 = var36;
                        var10001 = -1;
                        if (!var7) {
                           break label3751;
                        }
                     } else {
                        var10000 = ~var9[var37];
                        var10001 = ~var34.field991;
                     }

                     label3750:
                     do {
                        while(true) {
                           if (var10000 == var10001) {
                              var36 = var37;
                              if (!var7) {
                                 var10000 = var37;
                                 var10001 = -1;
                                 break;
                              }

                              ++var37;
                           } else {
                              ++var37;
                           }

                           if (~this.field8815 >= ~var37) {
                              var10000 = var36;
                              var10001 = -1;
                              if (!var7) {
                                 break label3750;
                              }
                           } else {
                              var10000 = ~var9[var37];
                              var10001 = ~var34.field991;
                           }
                        }
                     } while(var7);
                  }

                  if (var10000 == var10001) {
                     throw new RuntimeException();
                  }

                  int var38 = class451.field6600[arg1.field9715[var34.field991] & 65535] & 16777215;
                  int var39 = var38 | 255 + -(arg1.field9721 != null ? arg1.field9721[var34.field991] : 0) << 24;
                  this.field8845[var33] = new class680(var36, arg1.field9737[var34.field991], arg1.field9734[var34.field991], arg1.field9732[var34.field991], var35.field1090, var35.field1095, var35.field1097, var35.field1092, var35.field1096, var35.field1094, var35.field1088, var34.field990);
                  this.field8820[var33] = new class358(var39);
                  ++var33;
                  if (var33 >= this.field8759) {
                     var33 = this.field8815 * 3;
                     this.field8827 = new float[var33];
                     this.field8836 = new short[this.field8815];
                     this.field8751 = (short)arg4;
                     this.field8847 = new short[var33];
                     this.field8775 = new short[var33];
                     class650.field9428 = new long[var33];
                     this.field8854 = new byte[var33];
                     this.field8798 = new short[this.field8815];
                     this.field8758 = new short[this.field8815];
                     this.field8821 = new byte[this.field8815];
                     this.field8789 = new short[var33];
                     this.field8856 = new short[this.field8815];
                     this.field8850 = new short[var33];
                     this.field8860 = new float[var33];
                     this.field8833 = new short[var33];
                     this.field8779 = (short)arg3;
                     this.field8752 = new short[var33];
                     var178 = arg1;
                     if (!var7) {
                        if (arg1.field9730 != null) {
                           this.field8814 = new short[this.field8815];
                        }

                        this.field8831 = new short[this.field8815];
                        var40 = 0;
                        var41 = 0;
                        if (var7) {
                           var42 = this.field8857[var41];
                           this.field8857[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class195();
                           ++var41;
                        }

                        while(true) {
                           if (~var41 <= ~arg1.field9708) {
                              this.field8857[arg1.field9708] = var40;
                              var43 = class98.method929(this.field8815, var9, arg1, (byte)117);
                              var44 = new class388[arg1.field9736];
                              var10000 = 0;
                              if (!var7) {
                                 label518: {
                                    var45 = 0;
                                    if (var7) {
                                       var46 = arg1.field9737[var45];
                                    } else if (~arg1.field9736 >= ~var45) {
                                       var46 = 0;
                                       if (!var7) {
                                          break label518;
                                       }
                                    } else {
                                       var46 = arg1.field9737[var45];
                                    }

                                    label517:
                                    while(true) {
                                       var47 = arg1.field9734[var45];
                                       var48 = arg1.field9732[var45];
                                       var49 = this.field8787[var47] - this.field8787[var46];
                                       var50 = this.field8796[var47] - this.field8796[var46];
                                       var51 = this.field8791[var47] - this.field8791[var46];
                                       var52 = this.field8787[var48] + -this.field8787[var46];
                                       var53 = this.field8796[var48] + -this.field8796[var46];
                                       var54 = this.field8791[var48] + -this.field8791[var46];
                                       var55 = var50 * var54 + -(var51 * var53);
                                       var56 = var51 * var52 - var49 * var54;
                                       var57 = var49 * var53 + -(var50 * var52);
                                       if (var7) {
                                          var55 >>= 1;
                                          var57 >>= 1;
                                          var56 >>= 1;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (~var55 >= -8193) {
                                                if (var7) {
                                                   var56 >>= 8192;
                                                   continue;
                                                }

                                                if (var56 <= 8192 && var57 <= 8192 && ~var55 <= 8191 && ~var56 <= 8191 && ~var57 <= 8191) {
                                                   var58 = (int)Math.sqrt((double)(var57 * var57 + var55 * var55 + var56 * var56));
                                                   if (~var58 >= -1) {
                                                      var176 = 1;
                                                      var59 = var57 * 256 / var176;
                                                      var60 = var56 * 256 / var176;
                                                      var61 = var55 * 256 / var176;
                                                      var179 = arg1.field9705 == null ? 0 : arg1.field9705[var45];
                                                   } else {
                                                      var59 = var57 * 256 / var58;
                                                      var60 = var56 * 256 / var58;
                                                      var61 = var55 * 256 / var58;
                                                      var179 = arg1.field9705 == null ? 0 : arg1.field9705[var45];
                                                   }

                                                   label4170: {
                                                      var62 = var179;
                                                      if (~var62 != -1) {
                                                         if (var62 != 1) {
                                                            ++var45;
                                                            break label4170;
                                                         }

                                                         var63 = var44[var45] = new class388();
                                                         var63.field5737 = var59;
                                                         var63.field5735 = var60;
                                                         var63.field5736 = var61;
                                                         if (!var7) {
                                                            ++var45;
                                                            break label4170;
                                                         }
                                                      }

                                                      var64 = var32[var46];
                                                      ++var64.field2951;
                                                      var64.field2944 += var60;
                                                      var64.field2945 += var61;
                                                      var64.field2946 += var59;
                                                      var65 = var32[var47];
                                                      ++var65.field2951;
                                                      var65.field2946 += var59;
                                                      var65.field2945 += var61;
                                                      var65.field2944 += var60;
                                                      var66 = var32[var48];
                                                      var66.field2944 += var60;
                                                      var66.field2946 += var59;
                                                      var66.field2945 += var61;
                                                      ++var66.field2951;
                                                      ++var45;
                                                   }

                                                   if (~arg1.field9736 >= ~var45) {
                                                      var46 = 0;
                                                      if (!var7) {
                                                         break label517;
                                                      }
                                                   } else {
                                                      var46 = arg1.field9737[var45];
                                                   }
                                                   continue label517;
                                                }
                                             }

                                             var55 >>= 1;
                                             var57 >>= 1;
                                             var56 >>= 1;
                                          }
                                       }
                                    }
                                 }

                                 if (var7) {
                                    var67 = var9[var46];
                                    var68 = arg1.field9715[var67] & 65535;
                                    if (arg1.field9719 != null) {
                                       var69 = arg1.field9719[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field9721 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field9721[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field9721[var67] & 255;
                                    }

                                    var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                    if (var71 != -1 && (64 & this.field8851) != 0) {
                                       var72 = var8.method1456(-8988, var71 & 65535);
                                       if (var72.field10175) {
                                          var71 = -1;
                                       }
                                    }
                                 } else {
                                    if (~var46 <= ~this.field8815) {
                                       var10000 = ~this.field8863;
                                       if (!var7) {
                                          if (var10000 < -1) {
                                             var158 = 1;
                                             var159 = this.field8758[0];
                                             var160 = 0;
                                             if (var7) {
                                                var161 = this.field8758[var160];
                                                if (~var159 != ~var161) {
                                                   ++var158;
                                                   var159 = var161;
                                                }

                                                ++var160;
                                             }

                                             while(true) {
                                                if (var160 >= this.field8863) {
                                                   this.field8809 = new int[var158 + 1];
                                                   this.field8807 = new int[var158];
                                                   this.field8865 = new int[var158];
                                                   this.field8809[0] = 0;
                                                   var177 = this.field8813;
                                                   var159 = this.field8758[0];
                                                   var158 = 0;
                                                   var162 = 0;
                                                   var163 = 0;
                                                   if (!var7) {
                                                      label926: {
                                                         if (var7) {
                                                            var180 = this;
                                                         } else if (var163 >= this.field8863) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            var180 = this;
                                                            if (!var7) {
                                                               break label926;
                                                            }
                                                         } else {
                                                            var180 = this;
                                                         }

                                                         while(true) {
                                                            var164 = var180.field8758[var163];
                                                            if (var159 != var164) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               ++var158;
                                                               this.field8809[var158] = var163;
                                                               var159 = var164;
                                                               var162 = 0;
                                                               var177 = this.field8813;
                                                            }

                                                            var165 = this.field8856[var163];
                                                            if (~var162 > ~var165) {
                                                               var162 = var165;
                                                            }

                                                            if (var177 > var165) {
                                                               var177 = var165;
                                                            }

                                                            var166 = this.field8836[var163];
                                                            if (var162 < var166) {
                                                               var162 = var166;
                                                            }

                                                            if (~var177 < ~var166) {
                                                               var177 = var166;
                                                            }

                                                            var167 = this.field8798[var163];
                                                            if (~var167 < ~var162) {
                                                               var162 = var167;
                                                            }

                                                            if (~var177 < ~var167) {
                                                               var177 = var167;
                                                            }

                                                            ++var163;
                                                            if (var163 >= this.field8863) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               var180 = this;
                                                               if (!var7) {
                                                                  break;
                                                               }
                                                            } else {
                                                               var180 = this;
                                                            }
                                                         }
                                                      }

                                                      ++var158;
                                                      var180.field8809[var158] = this.field8863;
                                                      break;
                                                   }
                                                } else {
                                                   var177 = this.field8758[var160];
                                                }

                                                if (~var159 != ~var177) {
                                                   ++var158;
                                                   var159 = var177;
                                                }

                                                ++var160;
                                             }
                                          }

                                          class650.field9428 = null;
                                          this.field8789 = class647.method4751(this.field8813, -29427, this.field8789);
                                          this.field8847 = class647.method4751(this.field8813, -29427, this.field8847);
                                          this.field8833 = class647.method4751(this.field8813, -29427, this.field8833);
                                          this.field8752 = class647.method4751(this.field8813, -29427, this.field8752);
                                          this.field8850 = class647.method4751(this.field8813, -29427, this.field8850);
                                          this.field8854 = class573.method4245(this.field8854, (byte)115, this.field8813);
                                          this.field8860 = class5.method41(false, this.field8860, this.field8813);
                                          this.field8827 = class5.method41(false, this.field8827, this.field8813);
                                          if (arg1.field9697 != null && class109.method1044(arg2, 118, this.field8851)) {
                                             this.field8774 = arg1.method4879((byte)111, false);
                                          }

                                          if (arg1.field9680 != null && class250.method2028(arg2, true, this.field8851)) {
                                             this.field8822 = arg1.method4871((byte)-88);
                                          }

                                          if (arg1.field9711 != null && class490.method3703(arg2, this.field8851, (byte)-55)) {
                                             var168 = 0;
                                             var169 = new int[256];
                                             var170 = 0;
                                             if (var7) {
                                                var171 = arg1.field9711[var9[var170]];
                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }

                                             while(true) {
                                                if (var170 >= this.field8815) {
                                                   this.field8747 = new int[var168 + 1][];
                                                   var171 = 0;
                                                   if (!var7) {
                                                      if (var7) {
                                                         this.field8747[var171] = new int[var169[var171]];
                                                         var169[var171] = 0;
                                                         ++var171;
                                                      }

                                                      while(true) {
                                                         while(~var168 <= ~var171) {
                                                            this.field8747[var171] = new int[var169[var171]];
                                                            var169[var171] = 0;
                                                            ++var171;
                                                         }

                                                         var172 = 0;
                                                         if (!var7) {
                                                            if (!var7 && ~this.field8815 >= ~var172) {
                                                               return;
                                                            }

                                                            do {
                                                               var173 = arg1.field9711[var9[var172]];
                                                               if (~var173 <= -1) {
                                                                  this.field8747[var173][var169[var173]++] = var172;
                                                               }

                                                               ++var172;
                                                            } while(~this.field8815 < ~var172);

                                                            return;
                                                         }

                                                         ++var171;
                                                      }
                                                   }
                                                } else {
                                                   var171 = arg1.field9711[var9[var170]];
                                                }

                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }
                                          }

                                          return;
                                       }
                                    } else {
                                       var10000 = var9[var46];
                                    }

                                    var67 = var10000;
                                    var68 = arg1.field9715[var67] & 65535;
                                    if (arg1.field9719 != null) {
                                       var69 = arg1.field9719[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field9721 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field9721[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field9721[var67] & 255;
                                    }

                                    var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                    if (var71 != -1 && (64 & this.field8851) != 0) {
                                       var72 = var8.method1456(-8988, var71 & 65535);
                                       if (var72.field10175) {
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
                                    if (~var71 != 0) {
                                       label4230: {
                                          if (~var69 == 0) {
                                             var76 = 1.0F;
                                             var73 = 0.0F;
                                             var77 = 0.0F;
                                             var75 = 1.0F;
                                             var74 = 1.0F;
                                             var78 = 0.0F;
                                             var80 = 2;
                                             var79 = 1;
                                             if (!var7) {
                                                break label4230;
                                             }
                                          }

                                          var69 &= 255;
                                          var82 = arg1.field9709[var69];
                                          if (var82 == 0) {
                                             var83 = arg1.field9737[var67];
                                             var84 = arg1.field9734[var67];
                                             var85 = arg1.field9732[var67];
                                             var86 = arg1.field9707[var69];
                                             var87 = arg1.field9723[var69];
                                             var88 = arg1.field9693[var69];
                                             var89 = (float)arg1.field9726[var86];
                                             var90 = (float)arg1.field9706[var86];
                                             var91 = (float)arg1.field9689[var86];
                                             var92 = (float)arg1.field9726[var87] + -var89;
                                             var93 = (float)arg1.field9706[var87] - var90;
                                             var94 = (float)arg1.field9689[var87] + -var91;
                                             var95 = (float)arg1.field9726[var88] - var89;
                                             var96 = (float)arg1.field9706[var88] - var90;
                                             var97 = (float)arg1.field9689[var88] - var91;
                                             var98 = (float)arg1.field9726[var83] - var89;
                                             var99 = (float)arg1.field9706[var83] - var90;
                                             var100 = (float)arg1.field9689[var83] + -var91;
                                             var101 = (float)arg1.field9726[var84] - var89;
                                             var102 = (float)arg1.field9706[var84] + -var90;
                                             var103 = (float)arg1.field9689[var84] + -var91;
                                             var104 = (float)arg1.field9726[var85] - var89;
                                             var105 = (float)arg1.field9706[var85] - var90;
                                             var106 = (float)arg1.field9689[var85] - var91;
                                             var107 = var93 * var97 + -(var94 * var96);
                                             var108 = var94 * var95 - var92 * var97;
                                             var109 = var92 * var96 + -(var93 * var95);
                                             var110 = var96 * var109 + -(var97 * var108);
                                             var111 = var97 * var107 + -(var95 * var109);
                                             var112 = var95 * var108 + -(var96 * var107);
                                             var113 = 1.0F / (var94 * var112 + var92 * var110 + var93 * var111);
                                             var75 = (var103 * var112 + var101 * var110 + var102 * var111) * var113;
                                             var77 = (var106 * var112 + var104 * var110 + var105 * var111) * var113;
                                             var73 = (var100 * var112 + var98 * var110 + var99 * var111) * var113;
                                             var114 = var94 * var107 + -(var92 * var109);
                                             var115 = var92 * var108 - var93 * var107;
                                             var116 = var93 * var109 + -(var94 * var108);
                                             var117 = 1.0F / (var97 * var115 + var95 * var116 + var96 * var114);
                                             var78 = (var106 * var115 + var104 * var116 + var105 * var114) * var117;
                                             var74 = (var100 * var115 + var98 * var116 + var99 * var114) * var117;
                                             var76 = (var103 * var115 + var101 * var116 + var102 * var114) * var117;
                                             if (!var7) {
                                                break label4230;
                                             }
                                          }

                                          var118 = arg1.field9737[var67];
                                          var119 = arg1.field9734[var67];
                                          var120 = arg1.field9732[var67];
                                          var121 = var43.field3506[var69];
                                          var122 = var43.field3503[var69];
                                          var123 = var43.field3505[var69];
                                          var124 = var43.field3502[var69];
                                          var125 = arg1.field9733[var69];
                                          var126 = (float)arg1.field9701[var69] / 256.0F;
                                          if (var82 != 1) {
                                             label1177: {
                                                if (~var82 != -3) {
                                                   if (var82 != 3) {
                                                      break label1177;
                                                   }

                                                   class481.method3638(arg1.field9689[var118], arg1.field9706[var118], var122, class401.field5895, var124, var126, var125, arg1.field9726[var118], var121, (byte)113, var123);
                                                   var74 = class401.field5895[1];
                                                   var73 = class401.field5895[0];
                                                   class481.method3638(arg1.field9689[var119], arg1.field9706[var119], var122, class401.field5895, var124, var126, var125, arg1.field9726[var119], var121, (byte)-120, var123);
                                                   var75 = class401.field5895[0];
                                                   var76 = class401.field5895[1];
                                                   class481.method3638(arg1.field9689[var120], arg1.field9706[var120], var122, class401.field5895, var124, var126, var125, arg1.field9726[var120], var121, (byte)111, var123);
                                                   var77 = class401.field5895[0];
                                                   var78 = class401.field5895[1];
                                                   if ((1 & var125) != 0) {
                                                      if (!(var76 - var74 > 0.5F)) {
                                                         if (var74 - var76 > 0.5F) {
                                                            var79 = 2;
                                                            ++var76;
                                                            if (var7) {
                                                               var79 = 1;
                                                               --var76;
                                                            }
                                                         }
                                                      } else {
                                                         var79 = 1;
                                                         --var76;
                                                      }

                                                      if (var78 - var74 > 0.5F) {
                                                         --var78;
                                                         var80 = 1;
                                                         if (!var7) {
                                                            break label1177;
                                                         }
                                                      }

                                                      if (!(-var78 + var74 > 0.5F)) {
                                                         break label1177;
                                                      }

                                                      var80 = 2;
                                                      ++var78;
                                                      if (!var7) {
                                                         break label1177;
                                                      }

                                                      if (var75 - var73 > 0.5F) {
                                                         var79 = 1;
                                                         --var75;
                                                         if (var7 && var73 - var75 > 0.5F) {
                                                            var79 = 2;
                                                            ++var75;
                                                         }
                                                      } else if (var73 - var75 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }
                                                   } else if (var75 - var73 > 0.5F) {
                                                      var79 = 1;
                                                      --var75;
                                                      if (var7 && var73 - var75 > 0.5F) {
                                                         var79 = 2;
                                                         ++var75;
                                                      }
                                                   } else if (var73 - var75 > 0.5F) {
                                                      var79 = 2;
                                                      ++var75;
                                                   }

                                                   if (!(-var73 + var77 > 0.5F)) {
                                                      if (!(-var77 + var73 > 0.5F)) {
                                                         break label1177;
                                                      }

                                                      var80 = 2;
                                                      ++var77;
                                                      if (!var7) {
                                                         break label1177;
                                                      }
                                                   }

                                                   --var77;
                                                   var80 = 1;
                                                   if (!var7) {
                                                      break label1177;
                                                   }
                                                }

                                                var127 = (float)arg1.field9684[var69] / 256.0F;
                                                var128 = (float)arg1.field9725[var69] / 256.0F;
                                                var129 = arg1.field9726[var119] - arg1.field9726[var118];
                                                var130 = arg1.field9706[var119] + -arg1.field9706[var118];
                                                var131 = arg1.field9689[var119] - arg1.field9689[var118];
                                                var132 = arg1.field9726[var120] - arg1.field9726[var118];
                                                var133 = arg1.field9706[var120] + -arg1.field9706[var118];
                                                var134 = arg1.field9689[var120] + -arg1.field9689[var118];
                                                var135 = var130 * var134 - var131 * var133;
                                                var136 = var131 * var132 - var129 * var134;
                                                var137 = var129 * var133 + -(var130 * var132);
                                                var138 = 64.0F / (float)arg1.field9722[var69];
                                                var139 = 64.0F / (float)arg1.field9724[var69];
                                                var140 = 64.0F / (float)arg1.field9731[var69];
                                                var141 = (var124[2] * (float)var137 + var124[1] * (float)var136 + var124[0] * (float)var135) / var138;
                                                var142 = (var124[5] * (float)var137 + var124[3] * (float)var135 + var124[4] * (float)var136) / var139;
                                                var143 = (var124[8] * (float)var137 + var124[7] * (float)var136 + var124[6] * (float)var135) / var140;
                                                var81 = class484.method3660(var143, var142, var141, (byte)-52);
                                                class152.method1412(arg1.field9726[var118], var121, var126, (byte)-118, var127, arg1.field9706[var118], var122, var123, var125, var81, arg1.field9689[var118], class401.field5895, var124, var128);
                                                var74 = class401.field5895[1];
                                                var73 = class401.field5895[0];
                                                class152.method1412(arg1.field9726[var119], var121, var126, (byte)34, var127, arg1.field9706[var119], var122, var123, var125, var81, arg1.field9689[var119], class401.field5895, var124, var128);
                                                var76 = class401.field5895[1];
                                                var75 = class401.field5895[0];
                                                class152.method1412(arg1.field9726[var120], var121, var126, (byte)58, var127, arg1.field9706[var120], var122, var123, var125, var81, arg1.field9689[var120], class401.field5895, var124, var128);
                                                var77 = class401.field5895[0];
                                                var78 = class401.field5895[1];
                                                if (var7) {
                                                   var144 = (float)arg1.field9731[var69] / 1024.0F;
                                                   class318.method2487(var122, var124, var121, var123, arg1.field9706[var118], var125, var126, (byte)-125, arg1.field9726[var118], var144, class401.field5895, arg1.field9689[var118]);
                                                   var74 = class401.field5895[1];
                                                   var73 = class401.field5895[0];
                                                   class318.method2487(var122, var124, var121, var123, arg1.field9706[var119], var125, var126, (byte)-128, arg1.field9726[var119], var144, class401.field5895, arg1.field9689[var119]);
                                                   var76 = class401.field5895[1];
                                                   var75 = class401.field5895[0];
                                                   class318.method2487(var122, var124, var121, var123, arg1.field9706[var120], var125, var126, (byte)-126, arg1.field9726[var120], var144, class401.field5895, arg1.field9689[var120]);
                                                   var77 = class401.field5895[0];
                                                   var78 = class401.field5895[1];
                                                   var145 = var144 / 2.0F;
                                                   if ((1 & var125) != 0) {
                                                      if (!(-var74 + var76 > var145)) {
                                                         if (var145 < -var76 + var74) {
                                                            var76 += var144;
                                                            var79 = 2;
                                                            if (var7) {
                                                               var76 -= var144;
                                                               var79 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var76 -= var144;
                                                         var79 = 1;
                                                      }

                                                      if (var78 - var74 > var145) {
                                                         var78 -= var144;
                                                         var80 = 1;
                                                         if (var7 && var145 < -var78 + var74) {
                                                            var78 += var144;
                                                            var80 = 2;
                                                            if (var7) {
                                                               if (!(var77 - var73 > var145)) {
                                                                  if (var145 < -var77 + var73) {
                                                                     var80 = 2;
                                                                     var77 += var144;
                                                                     if (var7) {
                                                                        var77 -= var144;
                                                                        var80 = 1;
                                                                     }
                                                                  }
                                                               } else {
                                                                  var77 -= var144;
                                                                  var80 = 1;
                                                               }

                                                               if (var75 - var73 > var145) {
                                                                  var79 = 1;
                                                                  var75 -= var144;
                                                                  if (var7 && var145 < var73 - var75) {
                                                                     var79 = 2;
                                                                     var75 += var144;
                                                                  }
                                                               } else if (var145 < var73 - var75) {
                                                                  var79 = 2;
                                                                  var75 += var144;
                                                               }
                                                            }
                                                         }
                                                      } else if (var145 < -var78 + var74) {
                                                         var78 += var144;
                                                         var80 = 2;
                                                         if (var7) {
                                                            if (!(var77 - var73 > var145)) {
                                                               if (var145 < -var77 + var73) {
                                                                  var80 = 2;
                                                                  var77 += var144;
                                                                  if (var7) {
                                                                     var77 -= var144;
                                                                     var80 = 1;
                                                                  }
                                                               }
                                                            } else {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }

                                                            if (var75 - var73 > var145) {
                                                               var79 = 1;
                                                               var75 -= var144;
                                                               if (var7 && var145 < var73 - var75) {
                                                                  var79 = 2;
                                                                  var75 += var144;
                                                               }
                                                            } else if (var145 < var73 - var75) {
                                                               var79 = 2;
                                                               var75 += var144;
                                                            }
                                                         }
                                                      }
                                                   } else {
                                                      if (!(var77 - var73 > var145)) {
                                                         if (var145 < -var77 + var73) {
                                                            var80 = 2;
                                                            var77 += var144;
                                                            if (var7) {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var77 -= var144;
                                                         var80 = 1;
                                                      }

                                                      if (var75 - var73 > var145) {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7 && var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      } else if (var145 < var73 - var75) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var144 = (float)arg1.field9731[var69] / 1024.0F;
                                             class318.method2487(var122, var124, var121, var123, arg1.field9706[var118], var125, var126, (byte)-125, arg1.field9726[var118], var144, class401.field5895, arg1.field9689[var118]);
                                             var74 = class401.field5895[1];
                                             var73 = class401.field5895[0];
                                             class318.method2487(var122, var124, var121, var123, arg1.field9706[var119], var125, var126, (byte)-128, arg1.field9726[var119], var144, class401.field5895, arg1.field9689[var119]);
                                             var76 = class401.field5895[1];
                                             var75 = class401.field5895[0];
                                             class318.method2487(var122, var124, var121, var123, arg1.field9706[var120], var125, var126, (byte)-126, arg1.field9726[var120], var144, class401.field5895, arg1.field9689[var120]);
                                             var77 = class401.field5895[0];
                                             var78 = class401.field5895[1];
                                             var145 = var144 / 2.0F;
                                             if ((1 & var125) != 0) {
                                                if (!(-var74 + var76 > var145)) {
                                                   if (var145 < -var76 + var74) {
                                                      var76 += var144;
                                                      var79 = 2;
                                                      if (var7) {
                                                         var76 -= var144;
                                                         var79 = 1;
                                                      }
                                                   }
                                                } else {
                                                   var76 -= var144;
                                                   var79 = 1;
                                                }

                                                if (var78 - var74 > var145) {
                                                   var78 -= var144;
                                                   var80 = 1;
                                                   if (var7 && var145 < -var78 + var74) {
                                                      var78 += var144;
                                                      var80 = 2;
                                                      if (var7) {
                                                         if (!(var77 - var73 > var145)) {
                                                            if (var145 < -var77 + var73) {
                                                               var80 = 2;
                                                               var77 += var144;
                                                               if (var7) {
                                                                  var77 -= var144;
                                                                  var80 = 1;
                                                               }
                                                            }
                                                         } else {
                                                            var77 -= var144;
                                                            var80 = 1;
                                                         }

                                                         if (var75 - var73 > var145) {
                                                            var79 = 1;
                                                            var75 -= var144;
                                                            if (var7 && var145 < var73 - var75) {
                                                               var79 = 2;
                                                               var75 += var144;
                                                            }
                                                         } else if (var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      }
                                                   }
                                                } else if (var145 < -var78 + var74) {
                                                   var78 += var144;
                                                   var80 = 2;
                                                   if (var7) {
                                                      if (!(var77 - var73 > var145)) {
                                                         if (var145 < -var77 + var73) {
                                                            var80 = 2;
                                                            var77 += var144;
                                                            if (var7) {
                                                               var77 -= var144;
                                                               var80 = 1;
                                                            }
                                                         }
                                                      } else {
                                                         var77 -= var144;
                                                         var80 = 1;
                                                      }

                                                      if (var75 - var73 > var145) {
                                                         var79 = 1;
                                                         var75 -= var144;
                                                         if (var7 && var145 < var73 - var75) {
                                                            var79 = 2;
                                                            var75 += var144;
                                                         }
                                                      } else if (var145 < var73 - var75) {
                                                         var79 = 2;
                                                         var75 += var144;
                                                      }
                                                   }
                                                }
                                             } else {
                                                if (!(var77 - var73 > var145)) {
                                                   if (var145 < -var77 + var73) {
                                                      var80 = 2;
                                                      var77 += var144;
                                                      if (var7) {
                                                         var77 -= var144;
                                                         var80 = 1;
                                                      }
                                                   }
                                                } else {
                                                   var77 -= var144;
                                                   var80 = 1;
                                                }

                                                if (var75 - var73 > var145) {
                                                   var79 = 1;
                                                   var75 -= var144;
                                                   if (var7 && var145 < var73 - var75) {
                                                      var79 = 2;
                                                      var75 += var144;
                                                   }
                                                } else if (var145 < var73 - var75) {
                                                   var79 = 2;
                                                   var75 += var144;
                                                }
                                             }
                                          }
                                       }
                                    }

                                    if (arg1.field9705 == null) {
                                       var146 = 0;
                                       if (var7) {
                                          var146 = arg1.field9705[var67];
                                       }
                                    } else {
                                       var146 = arg1.field9705[var67];
                                    }

                                    if (~var146 != -1) {
                                       if (~var146 == -2) {
                                          var147 = var44[var67];
                                          var148 = (long)((var69 << 2) - (-(~var147.field5736 < -1 ? 1024 : 2048) + (-(var147.field5735 + 256 << 12) - (var147.field5737 + 256 << 22)))) + ((long)(var81 << 24) - (-((long)(var68 << 8)) - (long)var70) << 32);
                                          this.field8856[var46] = this.method4483(var147.field5736, var74, var148, arg1, 12, 0, var73, var147.field5735, var46, arg1.field9737[var67], var147.field5737);
                                          this.field8836[var46] = this.method4483(var147.field5736, var76, (long)var79 + var148, arg1, 12, 0, var75, var147.field5735, var46, arg1.field9734[var67], var147.field5737);
                                          this.field8798[var46] = this.method4483(var147.field5736, var78, (long)var80 + var148, arg1, 12, 0, var77, var147.field5735, var46, arg1.field9732[var67], var147.field5737);
                                          if (var7) {
                                             var150 = (long)(var69 << 2) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                             var152 = arg1.field9737[var67];
                                             var153 = arg1.field9734[var67];
                                             var154 = arg1.field9732[var67];
                                             var155 = var32[var152];
                                             this.field8856[var46] = this.method4483(var155.field2945, var74, var150, arg1, 12, var155.field2951, var73, var155.field2944, var46, var152, var155.field2946);
                                             var156 = var32[var153];
                                             this.field8836[var46] = this.method4483(var156.field2945, var76, (long)var79 + var150, arg1, 12, var156.field2951, var75, var156.field2944, var46, var153, var156.field2946);
                                             var157 = var32[var154];
                                             this.field8798[var46] = this.method4483(var157.field2945, var78, (long)var80 + var150, arg1, 12, var157.field2951, var77, var157.field2944, var46, var154, var157.field2946);
                                             if (arg1.field9721 != null) {
                                                this.field8821[var46] = arg1.field9721[var67];
                                             }

                                             if (arg1.field9730 != null) {
                                                this.field8814[var46] = arg1.field9730[var67];
                                             }

                                             this.field8831[var46] = arg1.field9715[var67];
                                             this.field8758[var46] = var71;
                                             ++var46;
                                          } else {
                                             if (arg1.field9721 != null) {
                                                this.field8821[var46] = arg1.field9721[var67];
                                             }

                                             if (arg1.field9730 != null) {
                                                this.field8814[var46] = arg1.field9730[var67];
                                             }

                                             this.field8831[var46] = arg1.field9715[var67];
                                             this.field8758[var46] = var71;
                                             ++var46;
                                          }
                                       } else {
                                          if (arg1.field9721 != null) {
                                             this.field8821[var46] = arg1.field9721[var67];
                                          }

                                          if (arg1.field9730 != null) {
                                             this.field8814[var46] = arg1.field9730[var67];
                                          }

                                          this.field8831[var46] = arg1.field9715[var67];
                                          this.field8758[var46] = var71;
                                          ++var46;
                                       }
                                    } else {
                                       var150 = (long)(var69 << 2) - -((long)(var68 << 8) + (long)var70 + (long)(var81 << 24) << 32);
                                       var152 = arg1.field9737[var67];
                                       var153 = arg1.field9734[var67];
                                       var154 = arg1.field9732[var67];
                                       var155 = var32[var152];
                                       this.field8856[var46] = this.method4483(var155.field2945, var74, var150, arg1, 12, var155.field2951, var73, var155.field2944, var46, var152, var155.field2946);
                                       var156 = var32[var153];
                                       this.field8836[var46] = this.method4483(var156.field2945, var76, (long)var79 + var150, arg1, 12, var156.field2951, var75, var156.field2944, var46, var153, var156.field2946);
                                       var157 = var32[var154];
                                       this.field8798[var46] = this.method4483(var157.field2945, var78, (long)var80 + var150, arg1, 12, var157.field2951, var77, var157.field2944, var46, var154, var157.field2946);
                                       if (arg1.field9721 != null) {
                                          this.field8821[var46] = arg1.field9721[var67];
                                       }

                                       if (arg1.field9730 != null) {
                                          this.field8814[var46] = arg1.field9730[var67];
                                       }

                                       this.field8831[var46] = arg1.field9715[var67];
                                       this.field8758[var46] = var71;
                                       ++var46;
                                    }

                                    if (~var46 <= ~this.field8815) {
                                       var10000 = ~this.field8863;
                                       if (!var7) {
                                          if (var10000 < -1) {
                                             var158 = 1;
                                             var159 = this.field8758[0];
                                             var160 = 0;
                                             if (var7) {
                                                var161 = this.field8758[var160];
                                                if (~var159 != ~var161) {
                                                   ++var158;
                                                   var159 = var161;
                                                }

                                                ++var160;
                                             }

                                             while(true) {
                                                if (var160 >= this.field8863) {
                                                   this.field8809 = new int[var158 + 1];
                                                   this.field8807 = new int[var158];
                                                   this.field8865 = new int[var158];
                                                   this.field8809[0] = 0;
                                                   var177 = this.field8813;
                                                   var159 = this.field8758[0];
                                                   var158 = 0;
                                                   var162 = 0;
                                                   var163 = 0;
                                                   if (!var7) {
                                                      label432: {
                                                         if (var7) {
                                                            var180 = this;
                                                         } else if (var163 >= this.field8863) {
                                                            this.field8807[var158] = var177;
                                                            this.field8865[var158] = -var177 + var162 + 1;
                                                            var180 = this;
                                                            if (!var7) {
                                                               break label432;
                                                            }
                                                         } else {
                                                            var180 = this;
                                                         }

                                                         while(true) {
                                                            var164 = var180.field8758[var163];
                                                            if (var159 != var164) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               ++var158;
                                                               this.field8809[var158] = var163;
                                                               var159 = var164;
                                                               var162 = 0;
                                                               var177 = this.field8813;
                                                            }

                                                            var165 = this.field8856[var163];
                                                            if (~var162 > ~var165) {
                                                               var162 = var165;
                                                            }

                                                            if (var177 > var165) {
                                                               var177 = var165;
                                                            }

                                                            var166 = this.field8836[var163];
                                                            if (var162 < var166) {
                                                               var162 = var166;
                                                            }

                                                            if (~var177 < ~var166) {
                                                               var177 = var166;
                                                            }

                                                            var167 = this.field8798[var163];
                                                            if (~var167 < ~var162) {
                                                               var162 = var167;
                                                            }

                                                            if (~var177 < ~var167) {
                                                               var177 = var167;
                                                            }

                                                            ++var163;
                                                            if (var163 >= this.field8863) {
                                                               this.field8807[var158] = var177;
                                                               this.field8865[var158] = -var177 + var162 + 1;
                                                               var180 = this;
                                                               if (!var7) {
                                                                  break;
                                                               }
                                                            } else {
                                                               var180 = this;
                                                            }
                                                         }
                                                      }

                                                      ++var158;
                                                      var180.field8809[var158] = this.field8863;
                                                      break;
                                                   }
                                                } else {
                                                   var177 = this.field8758[var160];
                                                }

                                                if (~var159 != ~var177) {
                                                   ++var158;
                                                   var159 = var177;
                                                }

                                                ++var160;
                                             }
                                          }

                                          class650.field9428 = null;
                                          this.field8789 = class647.method4751(this.field8813, -29427, this.field8789);
                                          this.field8847 = class647.method4751(this.field8813, -29427, this.field8847);
                                          this.field8833 = class647.method4751(this.field8813, -29427, this.field8833);
                                          this.field8752 = class647.method4751(this.field8813, -29427, this.field8752);
                                          this.field8850 = class647.method4751(this.field8813, -29427, this.field8850);
                                          this.field8854 = class573.method4245(this.field8854, (byte)115, this.field8813);
                                          this.field8860 = class5.method41(false, this.field8860, this.field8813);
                                          this.field8827 = class5.method41(false, this.field8827, this.field8813);
                                          if (arg1.field9697 != null && class109.method1044(arg2, 118, this.field8851)) {
                                             this.field8774 = arg1.method4879((byte)111, false);
                                          }

                                          if (arg1.field9680 != null && class250.method2028(arg2, true, this.field8851)) {
                                             this.field8822 = arg1.method4871((byte)-88);
                                          }

                                          if (arg1.field9711 != null && class490.method3703(arg2, this.field8851, (byte)-55)) {
                                             var168 = 0;
                                             var169 = new int[256];
                                             var170 = 0;
                                             if (var7) {
                                                var171 = arg1.field9711[var9[var170]];
                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }

                                             while(true) {
                                                if (var170 >= this.field8815) {
                                                   this.field8747 = new int[var168 + 1][];
                                                   var171 = 0;
                                                   if (!var7) {
                                                      if (var7) {
                                                         this.field8747[var171] = new int[var169[var171]];
                                                         var169[var171] = 0;
                                                         ++var171;
                                                      }

                                                      while(true) {
                                                         while(~var168 <= ~var171) {
                                                            this.field8747[var171] = new int[var169[var171]];
                                                            var169[var171] = 0;
                                                            ++var171;
                                                         }

                                                         var172 = 0;
                                                         if (!var7) {
                                                            if (!var7 && ~this.field8815 >= ~var172) {
                                                               return;
                                                            }

                                                            do {
                                                               var173 = arg1.field9711[var9[var172]];
                                                               if (~var173 <= -1) {
                                                                  this.field8747[var173][var169[var173]++] = var172;
                                                               }

                                                               ++var172;
                                                            } while(~this.field8815 < ~var172);

                                                            return;
                                                         }

                                                         ++var171;
                                                      }
                                                   }
                                                } else {
                                                   var171 = arg1.field9711[var9[var170]];
                                                }

                                                if (~var171 <= -1) {
                                                   var10002 = var169[var171]++;
                                                   if (~var171 < ~var168) {
                                                      var168 = var171;
                                                   }
                                                }

                                                ++var170;
                                             }
                                          }

                                          return;
                                       }
                                    } else {
                                       var10000 = var9[var46];
                                    }

                                    var67 = var10000;
                                    var68 = arg1.field9715[var67] & 65535;
                                    if (arg1.field9719 != null) {
                                       var69 = arg1.field9719[var67];
                                       if (var7) {
                                          var69 = -1;
                                       }
                                    } else {
                                       var69 = -1;
                                    }

                                    if (arg1.field9721 == null) {
                                       var70 = 0;
                                       if (var7) {
                                          var70 = arg1.field9721[var67] & 255;
                                       }
                                    } else {
                                       var70 = arg1.field9721[var67] & 255;
                                    }

                                    var71 = arg1.field9688 == null ? -1 : arg1.field9688[var67];
                                    if (var71 != -1 && (64 & this.field8851) != 0) {
                                       var72 = var8.method1456(-8988, var71 & 65535);
                                       if (var72.field10175) {
                                          var71 = -1;
                                       }
                                    }
                                 }
                              }
                           } else {
                              var10000 = this.field8857[var41];
                           }

                           var42 = var10000;
                           this.field8857[var41] = var40;
                           var40 += var42;
                           var32[var41] = new class195();
                           ++var41;
                        }
                     }
                  } else {
                     var178 = arg1;
                  }
               }
            }

            if (var10000 != 0) {
               var11 = var8.method1456(-8988, 65535 & arg1.field9688[var10]);
               if ((64 & this.field8851) != 0) {
                  if (!var11.field10175) {
                     if (var11.field10172) {
                        if (var7) {
                           var9[this.field8815++] = var10;
                           ++this.field8857[arg1.field9737[var10]];
                           ++this.field8857[arg1.field9734[var10]];
                           ++this.field8857[arg1.field9732[var10]];
                           ++var10;
                        } else {
                           ++var10;
                        }
                     } else {
                        var9[this.field8815++] = var10;
                        ++this.field8857[arg1.field9737[var10]];
                        ++this.field8857[arg1.field9734[var10]];
                        ++this.field8857[arg1.field9732[var10]];
                        ++var10;
                     }
                  } else {
                     var9[this.field8815++] = var10;
                     ++this.field8857[arg1.field9737[var10]];
                     ++this.field8857[arg1.field9734[var10]];
                     ++this.field8857[arg1.field9732[var10]];
                     ++var10;
                  }
               } else if (var11.field10172) {
                  if (var7) {
                     var9[this.field8815++] = var10;
                     ++this.field8857[arg1.field9737[var10]];
                     ++this.field8857[arg1.field9734[var10]];
                     ++this.field8857[arg1.field9732[var10]];
                     ++var10;
                  } else {
                     ++var10;
                  }
               } else {
                  var9[this.field8815++] = var10;
                  ++this.field8857[arg1.field9737[var10]];
                  ++this.field8857[arg1.field9734[var10]];
                  ++this.field8857[arg1.field9732[var10]];
                  ++var10;
               }
            } else {
               var9[this.field8815++] = var10;
               ++this.field8857[arg1.field9737[var10]];
               ++this.field8857[arg1.field9734[var10]];
               ++this.field8857[arg1.field9732[var10]];
               ++var10;
            }
         }
      } catch (RuntimeException var175) {
         throw class608.method4462(var175, field8869[13] + (arg0 != null ? field8869[2] : field8869[3]) + ',' + (arg1 != null ? field8869[2] : field8869[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "ia",
      descriptor = "(SS)V",
      line = 3796
   )
   public final void method526(short arg0, short arg1) {
      boolean var3 = client.field4564;

      try {
         int var4 = 0;
         if (var3) {
            if (this.field8831[var4] == arg0) {
               this.field8831[var4] = arg1;
            }

            ++var4;
         }

         while(true) {
            class610 var10000;
            if (~var4 <= ~this.field8815) {
               ++field8826;
               var10000 = this;
               if (!var3) {
                  if (this.field8845 != null) {
                     int var5 = 0;
                     if (var3 || this.field8759 > var5) {
                        do {
                           class680 var6 = this.field8845[var5];
                           class358 var7 = this.field8820[var5];
                           var7.field5359 = -16777216 & var7.field5359 | class451.field6600[this.field8831[var6.field9968] & 65535] & 16777215;
                           ++var5;
                        } while(this.field8759 > var5);
                     }
                  }

                  this.method4472((byte)-126);
                  return;
               }
            } else {
               var10000 = this;
            }

            if (var10000.field8831[var4] == arg0) {
               this.field8831[var4] = arg1;
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8869[62] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "f",
      descriptor = "()[Ltf;",
      line = 3835
   )
   public final class309[] method515() {
      try {
         ++field8761;
         return this.field8780;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[49] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "EA",
      descriptor = "()I",
      line = 3843
   )
   public final int method507() {
      try {
         ++field8852;
         if (!this.field8760) {
            this.method4482(-32768);
         }

         return this.field8785;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[18] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "WA",
      descriptor = "()I",
      line = 3854
   )
   public final int method504() {
      try {
         ++field8800;
         return this.field8779;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[34] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "F",
      descriptor = "()Z",
      line = 3864
   )
   public final boolean method516() {
      try {
         ++field8842;
         return this.field8832;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[56] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(I)V",
      line = 3872
   )
   public final void method513(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8834;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         class610 var10000;
         if (var2) {
            var10000 = this;
         } else if (this.field8838 <= var5) {
            this.method4473(-99);
            var10000 = this;
            if (!var2) {
               this.field8760 = false;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field8791[var5] * var3 - -(this.field8787[var5] * var4) >> 14;
            this.field8791[var5] = this.field8791[var5] * var4 - this.field8787[var5] * var3 >> 14;
            this.field8787[var5] = var6;
            ++var5;
            if (this.field8838 <= var5) {
               this.method4473(-99);
               var10000 = this;
               if (!var2) {
                  this.field8760 = false;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8869[17] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Ldfa;IIZIII)Z",
      line = 3905
   )
   private final boolean method4474(class173 arg0, int arg1, int arg2, boolean arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field8776;
         class104 var9 = (class104)arg0;
         class104 var10 = this.field8835.field5219;
         float var11 = var9.field1706 * var10.field1724 + var9.field1740 * var10.field1732 + var9.field1705 * var10.field1717 + var10.field1705;
         float var12 = var9.field1706 * var10.field1726 + var9.field1740 * var10.field1729 + var9.field1705 * var10.field1730 + var10.field1740;
         float var13 = var9.field1706 * var10.field1694 + var9.field1740 * var10.field1713 + var9.field1705 * var10.field1733 + var10.field1706;
         class672.field9857 = var9.field1733 * var10.field1726 + var9.field1730 * var10.field1729 + var9.field1717 * var10.field1730;
         class304.field4405 = var9.field1694 * var10.field1724 + var9.field1726 * var10.field1732 + var9.field1724 * var10.field1717;
         class783.field11462 = var9.field1713 * var10.field1724 + var9.field1732 * var10.field1717 + var9.field1729 * var10.field1732;
         class360.field5392 = var9.field1733 * var10.field1724 + var9.field1730 * var10.field1732 + var9.field1717 * var10.field1717;
         class353.field4996 = var9.field1733 * var10.field1694 + var9.field1730 * var10.field1713 + var9.field1717 * var10.field1733;
         class558.field8129 = var9.field1694 * var10.field1694 + var9.field1726 * var10.field1713 + var9.field1724 * var10.field1733;
         class522.field7655 = var9.field1713 * var10.field1694 + var9.field1732 * var10.field1733 + var9.field1729 * var10.field1713;
         class499.field7293 = var9.field1694 * var10.field1726 + var9.field1726 * var10.field1729 + var9.field1724 * var10.field1730;
         class479.field6991 = var9.field1713 * var10.field1726 + var9.field1732 * var10.field1730 + var9.field1729 * var10.field1729;
         byte var14 = 0;
         float var15 = Float.MAX_VALUE;
         float var16 = -3.4028235E38F;
         float var17 = Float.MAX_VALUE;
         float var18 = -3.4028235E38F;
         int var19 = this.field8835.field5302;
         int var20 = this.field8835.field5307;
         if (!this.field8760) {
            this.method4482(arg6 ^ 32767);
         }

         int var21 = -this.field8778 + this.field8803 >> 1;
         int var22 = -this.field8754 + this.field8785 >> 1;
         int var23 = -this.field8818 + this.field8810 >> 1;
         int var24 = this.field8778 - -var21;
         int var25 = this.field8754 - -var22;
         int var26 = this.field8818 + var23;
         int var27 = -(var21 << arg5) + var24;
         int var28 = -(var22 << arg5) + var25;
         int var29 = -(var23 << arg5) + var26;
         int var30 = var24 - -(var21 << arg5);
         int var31 = (var22 << arg5) + var25;
         if (arg6 != -1) {
            return true;
         } else {
            client.field4556[0] = var27;
            int var32 = var26 - -(var23 << arg5);
            class317.field4574[0] = var28;
            class18.field321[0] = var29;
            client.field4556[1] = var30;
            class317.field4574[1] = var28;
            class18.field321[1] = var29;
            client.field4556[2] = var27;
            class317.field4574[2] = var31;
            client.field4556[3] = var30;
            class18.field321[2] = var29;
            class317.field4574[3] = var31;
            class18.field321[3] = var29;
            client.field4556[4] = var27;
            class317.field4574[4] = var28;
            class18.field321[4] = var32;
            client.field4556[5] = var30;
            class317.field4574[5] = var28;
            class18.field321[5] = var32;
            client.field4556[6] = var27;
            class317.field4574[6] = var31;
            client.field4556[7] = var30;
            class18.field321[6] = var32;
            class317.field4574[7] = var31;
            class18.field321[7] = var32;
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
               var34 = (float)class18.field321[var33];
               var35 = (float)client.field4556[var33];
               var36 = (float)class317.field4574[var33];
               var37 = class499.field7293 * var34 + class672.field9857 * var35 + class479.field6991 * var36 + var12;
               var38 = class304.field4405 * var34 + class783.field11462 * var36 + class360.field5392 * var35 + var11;
               var39 = class558.field8129 * var34 + class522.field7655 * var36 + class353.field4996 * var35 + var13;
               if ((float)this.field8835.field5288 <= var39) {
                  if (arg2 > 0) {
                     var39 = (float)arg2;
                  }

                  var40 = (float)var19 * var38 / var39 + (float)this.field8835.field5291;
                  if (var40 > var16) {
                     var16 = var40;
                  }

                  var41 = (float)var20 * var37 / var39 + (float)this.field8835.field5304;
                  if (var15 > var40) {
                     var15 = var40;
                  }

                  if (var41 > var18) {
                     var18 = var41;
                  }

                  if (var41 < var17) {
                     var17 = var41;
                  }

                  var14 = 1;
               }

               ++var33;
            }

            while(true) {
               int var10000;
               if (~var33 <= -9) {
                  var10000 = var14;
                  if (!var8) {
                     if (var14 != 0 && var15 < (float)arg1 && var16 > (float)arg1 && var17 < (float)arg4 && (float)arg4 < var18) {
                        if (arg3) {
                           return true;
                        }

                        if (class179.field2764.length < this.field8813) {
                           class780.field11435 = new int[this.field8813];
                           class179.field2764 = new int[this.field8813];
                        }

                        label182: {
                           int var42 = 0;
                           if (var8) {
                              var10000 = this.field8787[var42];
                           } else if (~var42 <= ~this.field8838) {
                              var10000 = 0;
                              if (!var8) {
                                 break label182;
                              }
                           } else {
                              var10000 = this.field8787[var42];
                           }

                           while(true) {
                              label252: {
                                 float var43 = (float)var10000;
                                 float var44 = (float)this.field8791[var42];
                                 float var45 = (float)this.field8796[var42];
                                 float var46 = class558.field8129 * var44 + class522.field7655 * var45 + class353.field4996 * var43 + var13;
                                 float var47 = class499.field7293 * var44 + class672.field9857 * var43 + class479.field6991 * var45 + var12;
                                 float var48 = class304.field4405 * var44 + class783.field11462 * var45 + class360.field5392 * var43 + var11;
                                 if (!((float)this.field8835.field5288 <= var46)) {
                                    int var49 = this.field8857[var42];
                                    int var50 = this.field8857[var42 - -1];
                                    int var51 = var49;
                                    if (var8 || var50 > var49) {
                                       do {
                                          int var52 = this.field8775[var51] + -1;
                                          if (~var52 == 0) {
                                             break;
                                          }

                                          class179.field2764[this.field8775[var51] + -1] = -999999;
                                          ++var51;
                                       } while(var50 > var51);
                                    }

                                    if (!var8) {
                                       ++var42;
                                       break label252;
                                    }

                                    if (~arg2 < -1) {
                                       var46 = (float)arg2;
                                    }
                                 } else if (~arg2 < -1) {
                                    var46 = (float)arg2;
                                 }

                                 int var53 = (int)((float)var19 * var48 / var46 + (float)this.field8835.field5291);
                                 int var54 = (int)((float)var20 * var47 / var46 + (float)this.field8835.field5304);
                                 int var55 = this.field8857[var42];
                                 int var56 = this.field8857[var42 + 1];
                                 int var57 = var55;
                                 if (!var8 && var55 >= var56) {
                                    ++var42;
                                 } else {
                                    while(true) {
                                       int var58 = this.field8775[var57] + -1;
                                       if (var58 == -1) {
                                          ++var42;
                                          break;
                                       }

                                       class179.field2764[var58] = var53;
                                       class780.field11435[var58] = var54;
                                       ++var57;
                                       if (var57 >= var56) {
                                          ++var42;
                                          break;
                                       }
                                    }
                                 }
                              }

                              if (~var42 <= ~this.field8838) {
                                 var10000 = 0;
                                 if (!var8) {
                                    break;
                                 }
                              } else {
                                 var10000 = this.field8787[var42];
                              }
                           }
                        }

                        int var59 = var10000;
                        if (var8 || ~this.field8815 < ~var59) {
                           do {
                              if (class179.field2764[this.field8856[var59]] != -999999) {
                                 if (class179.field2764[this.field8836[var59]] != -999999) {
                                    if (class179.field2764[this.field8798[var59]] == -999999 && !var8) {
                                       ++var59;
                                    } else {
                                       if (this.method4477(0, arg1, arg4, class780.field11435[this.field8836[var59]], class780.field11435[this.field8856[var59]], class179.field2764[this.field8856[var59]], class179.field2764[this.field8798[var59]], class179.field2764[this.field8836[var59]], class780.field11435[this.field8798[var59]])) {
                                          return true;
                                       }

                                       ++var59;
                                    }
                                 } else {
                                    ++var59;
                                 }
                              } else {
                                 ++var59;
                              }
                           } while(~this.field8815 < ~var59);
                        }
                     }

                     return false;
                  }
               } else {
                  var10000 = class18.field321[var33];
               }

               var34 = (float)var10000;
               var35 = (float)client.field4556[var33];
               var36 = (float)class317.field4574[var33];
               var37 = class499.field7293 * var34 + class672.field9857 * var35 + class479.field6991 * var36 + var12;
               var38 = class304.field4405 * var34 + class783.field11462 * var36 + class360.field5392 * var35 + var11;
               var39 = class558.field8129 * var34 + class522.field7655 * var36 + class353.field4996 * var35 + var13;
               if ((float)this.field8835.field5288 <= var39) {
                  if (arg2 > 0) {
                     var39 = (float)arg2;
                  }

                  var40 = (float)var19 * var38 / var39 + (float)this.field8835.field5291;
                  if (var40 > var16) {
                     var16 = var40;
                  }

                  var41 = (float)var20 * var37 / var39 + (float)this.field8835.field5304;
                  if (var15 > var40) {
                     var15 = var40;
                  }

                  if (var41 > var18) {
                     var18 = var41;
                  }

                  if (var41 < var17) {
                     var17 = var41;
                  }

                  var14 = 1;
               }

               ++var33;
            }
         }
      } catch (RuntimeException var61) {
         throw class608.method4462(var61, field8869[36] + (arg0 != null ? field8869[2] : field8869[3]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Ldfa;Lija;I)V",
      line = 4151
   )
   public final void method503(class173 arg0, class362 arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         ++field8843;
         if (~this.field8813 != -1) {
            class104 var5 = this.field8835.field5219;
            class104 var6 = (class104)arg0;
            if (!this.field8760) {
               this.method4482(-32768);
            }

            float var9;
            float var10;
            label137: {
               class522.field7655 = var5.field1694 * var6.field1713 + var5.field1733 * var6.field1732 + var5.field1713 * var6.field1729;
               class654.field9530 = var5.field1694 * var6.field1706 + var5.field1733 * var6.field1705 + var5.field1713 * var6.field1740 + var5.field1706;
               float var7 = (float)this.field8754 * class522.field7655 + class654.field9530;
               float var8 = (float)this.field8785 * class522.field7655 + class654.field9530;
               if (!(var7 > var8)) {
                  var9 = (float)this.field8766 + var8;
                  var10 = (float)(-this.field8766) + var7;
                  if (!var4) {
                     break label137;
                  }
               }

               var9 = (float)this.field8766 + var7;
               var10 = var8 - (float)this.field8766;
            }

            if (!(var10 >= this.field8835.field5283)) {
               if (!((float)this.field8835.field5288 >= var9)) {
                  float var13;
                  float var14;
                  label129: {
                     class783.field11462 = var5.field1724 * var6.field1713 + var5.field1732 * var6.field1729 + var5.field1717 * var6.field1732;
                     class63.field1164 = var5.field1724 * var6.field1706 + var5.field1732 * var6.field1740 + var5.field1717 * var6.field1705 + var5.field1705;
                     float var11 = (float)this.field8754 * class783.field11462 + class63.field1164;
                     float var12 = (float)this.field8785 * class783.field11462 + class63.field1164;
                     if (!(var12 < var11)) {
                        var13 = ((float)(-this.field8766) + var11) * (float)this.field8835.field5302;
                        var14 = ((float)this.field8766 + var12) * (float)this.field8835.field5302;
                        if (!var4) {
                           break label129;
                        }
                     }

                     var13 = (var12 - (float)this.field8766) * (float)this.field8835.field5302;
                     var14 = ((float)this.field8766 + var11) * (float)this.field8835.field5302;
                  }

                  if (!(this.field8835.field5243 <= var13 / var9)) {
                     if (!(this.field8835.field5289 >= var14 / var9)) {
                        float var17;
                        float var18;
                        label121: {
                           class479.field6991 = var5.field1726 * var6.field1713 + var5.field1730 * var6.field1732 + var5.field1729 * var6.field1729;
                           class250.field3582 = var5.field1726 * var6.field1706 + var5.field1730 * var6.field1705 + var5.field1729 * var6.field1740 + var5.field1740;
                           float var15 = (float)this.field8754 * class479.field6991 + class250.field3582;
                           float var16 = (float)this.field8785 * class479.field6991 + class250.field3582;
                           if (!(var16 < var15)) {
                              var17 = (var15 - (float)this.field8766) * (float)this.field8835.field5307;
                              var18 = ((float)this.field8766 + var16) * (float)this.field8835.field5307;
                              if (!var4) {
                                 break label121;
                              }
                           }

                           var17 = (var16 - (float)this.field8766) * (float)this.field8835.field5307;
                           var18 = ((float)this.field8766 + var15) * (float)this.field8835.field5307;
                        }

                        if (!(var17 / var9 >= this.field8835.field5311)) {
                           if (!(this.field8835.field5277 >= var18 / var9)) {
                              if (arg1 != null || this.field8845 != null) {
                                 class499.field7293 = var5.field1726 * var6.field1694 + var5.field1730 * var6.field1724 + var5.field1729 * var6.field1726;
                                 class360.field5392 = var5.field1724 * var6.field1733 + var5.field1732 * var6.field1730 + var5.field1717 * var6.field1717;
                                 class672.field9857 = var5.field1726 * var6.field1733 + var5.field1730 * var6.field1717 + var5.field1729 * var6.field1730;
                                 class353.field4996 = var5.field1694 * var6.field1733 + var5.field1733 * var6.field1717 + var5.field1713 * var6.field1730;
                                 class558.field8129 = var5.field1694 * var6.field1694 + var5.field1733 * var6.field1724 + var5.field1713 * var6.field1726;
                                 class304.field4405 = var5.field1724 * var6.field1694 + var5.field1732 * var6.field1726 + var5.field1717 * var6.field1724;
                              }

                              if (arg1 != null) {
                                 boolean var19;
                                 boolean var20;
                                 int var21;
                                 int var22;
                                 int var23;
                                 int var24;
                                 int var25;
                                 label106: {
                                    var19 = false;
                                    var20 = true;
                                    var21 = this.field8778 - -this.field8803 >> 1;
                                    var22 = this.field8818 + this.field8810 >> 1;
                                    var23 = (int)((float)var22 * class304.field4405 + (float)this.field8754 * class783.field11462 + (float)var21 * class360.field5392 + class63.field1164);
                                    var24 = (int)((float)var22 * class499.field7293 + (float)this.field8754 * class479.field6991 + (float)var21 * class672.field9857 + class250.field3582);
                                    var25 = (int)((float)var22 * class558.field8129 + (float)this.field8754 * class522.field7655 + (float)var21 * class353.field4996 + class654.field9530);
                                    if (~var25 <= ~this.field8835.field5288) {
                                       arg1.field5408 = this.field8835.field5304 - -(this.field8835.field5307 * var24 / var25);
                                       arg1.field5411 = this.field8835.field5302 * var23 / var25 + this.field8835.field5291;
                                       if (!var4) {
                                          break label106;
                                       }
                                    }

                                    var19 = true;
                                 }

                                 int var26;
                                 int var27;
                                 int var28;
                                 label101: {
                                    var26 = (int)((float)var22 * class304.field4405 + (float)this.field8785 * class783.field11462 + (float)var21 * class360.field5392 + class63.field1164);
                                    var27 = (int)((float)var22 * class499.field7293 + (float)this.field8785 * class479.field6991 + (float)var21 * class672.field9857 + class250.field3582);
                                    var28 = (int)((float)var22 * class558.field8129 + (float)this.field8785 * class522.field7655 + (float)var21 * class353.field4996 + class654.field9530);
                                    if (~this.field8835.field5288 < ~var28) {
                                       var19 = true;
                                       if (!var4) {
                                          break label101;
                                       }
                                    }

                                    arg1.field5410 = this.field8835.field5304 - -(this.field8835.field5307 * var27 / var28);
                                    arg1.field5407 = this.field8835.field5291 - -(this.field8835.field5302 * var26 / var28);
                                 }

                                 if (var19) {
                                    label155: {
                                       if (~this.field8835.field5288 < ~var25 && var28 < this.field8835.field5288) {
                                          var20 = false;
                                          if (!var4) {
                                             break label155;
                                          }
                                       }

                                       if (var25 < this.field8835.field5288) {
                                          int var29 = (-this.field8835.field5288 + var28 << 16) / (-var25 + var28);
                                          int var30 = ((-var23 + var26) * var29 >> 16) + var26;
                                          int var31 = ((var27 - var24) * var29 >> 16) + var27;
                                          arg1.field5411 = this.field8835.field5302 * var30 / this.field8835.field5288 + this.field8835.field5291;
                                          arg1.field5408 = this.field8835.field5307 * var31 / this.field8835.field5288 + this.field8835.field5304;
                                          if (!var4) {
                                             break label155;
                                          }
                                       }

                                       if (~var28 > ~this.field8835.field5288) {
                                          int var32 = (-this.field8835.field5288 + var25 << 16) / (-var28 + var25);
                                          int var33 = ((-var26 + var23) * var32 >> 16) + var23;
                                          int var34 = ((-var27 + var24) * var32 >> 16) + var24;
                                          arg1.field5411 = this.field8835.field5302 * var33 / this.field8835.field5288 + this.field8835.field5291;
                                          arg1.field5408 = this.field8835.field5304 - -(this.field8835.field5307 * var34 / this.field8835.field5288);
                                       }
                                    }
                                 }

                                 if (var20) {
                                    label85: {
                                       arg1.field5406 = true;
                                       if (var25 > var28) {
                                          arg1.field5409 = this.field8835.field5291 - -((var23 - -this.field8766) * this.field8835.field5302 / var25) + -arg1.field5411;
                                          if (!var4) {
                                             break label85;
                                          }
                                       }

                                       arg1.field5409 = -arg1.field5407 + this.field8835.field5291 - -((this.field8766 + var26) * this.field8835.field5302 / var28);
                                    }
                                 }
                              }

                              this.field8835.method2742(64);
                              this.field8835.method2743(var6, (byte)-97);
                              this.method4476(920574152);
                              this.method4485(false);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var36) {
         throw class608.method4462(var36, field8869[55] + (arg0 != null ? field8869[2] : field8869[3]) + ',' + (arg1 != null ? field8869[2] : field8869[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(IILdfa;ZII)Z",
      line = 4350
   )
   public final boolean method551(int arg0, int arg1, class173 arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field8829;
         return this.method4474(arg2, arg0, arg5, arg3, arg1, arg4, -1);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8869[29] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8869[2] : field8869[3]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "da",
      descriptor = "()I",
      line = 4358
   )
   public final int method535() {
      try {
         ++field8793;
         return this.field8751;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[33] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Z)Z",
      line = 4368
   )
   private final boolean method4475(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8812;
         boolean var3 = !this.field8755.field3479;
         boolean var4 = ~(55 & this.field8851) != -1 && !this.field8866.field3479;
         boolean var5 = !this.field8867.field3479;
         boolean var6 = !this.field8828.field3479;
         if (!var5 && !var3 && !var4 && !var6) {
            return true;
         } else {
            boolean var7 = arg0;
            if (var5) {
               label165: {
                  if (this.field8867.field3473 == null) {
                     this.field8867.field3473 = this.field8835.method1194((byte)72, this.field8841);
                  }

                  class102 var8 = this.field8867.field3473;
                  var8.method568(22407, 12, this.field8813 * 12);
                  Buffer var9 = var8.method567(true, (byte)49);
                  if (var9 != null) {
                     this.field8835.field5116.copyPositions(this.field8787, this.field8796, this.field8791, this.field8789, 0, 12, this.field8813, var9.getAddress());
                     if (var8.method569(1571)) {
                        this.field8867.field3479 = true;
                        this.field8867.field3480 = var8;
                        if (!var2) {
                           break label165;
                        }
                     }

                     var7 = false;
                     if (!var2) {
                        break label165;
                     }
                  }

                  var7 = false;
               }
            }

            if (var3) {
               label166: {
                  if (this.field8755.field3473 == null) {
                     this.field8755.field3473 = this.field8835.method1194((byte)21, this.field8841);
                  }

                  class102 var10 = this.field8755.field3473;
                  var10.method568(22407, 4, this.field8813 * 4);
                  Buffer var11 = var10.method567(true, (byte)49);
                  if (var11 != null) {
                     label138: {
                        if (~(this.field8851 & 55) == -1) {
                           short[] var12;
                           short[] var13;
                           short[] var14;
                           byte[] var15;
                           label135: {
                              if (this.field8795 != null) {
                                 var12 = this.field8795.field1764;
                                 var13 = this.field8795.field1759;
                                 var14 = this.field8795.field1757;
                                 var15 = this.field8795.field1762;
                                 if (!var2) {
                                    break label135;
                                 }
                              }

                              var14 = this.field8833;
                              var13 = this.field8752;
                              var12 = this.field8850;
                              var15 = this.field8854;
                           }

                           this.field8835.field5116.copyLighting(this.field8831, this.field8821, this.field8758, var14, var13, var12, var15, this.field8779, this.field8751, this.field8847, 0, 4, this.field8813, var11.getAddress());
                           if (!var2) {
                              break label138;
                           }
                        }

                        this.field8835.field5116.copyColours(this.field8831, this.field8821, this.field8758, this.field8779, this.field8847, 0, 4, this.field8813, var11.getAddress());
                     }

                     if (!var10.method569(1571)) {
                        var7 = false;
                        if (!var2) {
                           break label166;
                        }
                     }

                     this.field8755.field3479 = true;
                     this.field8755.field3480 = var10;
                     if (!var2) {
                        break label166;
                     }
                  }

                  var7 = false;
               }
            }

            if (var4) {
               label168: {
                  if (this.field8866.field3473 == null) {
                     this.field8866.field3473 = this.field8835.method1194((byte)28, this.field8841);
                  }

                  class102 var16 = this.field8866.field3473;
                  var16.method568(22407, 12, this.field8813 * 12);
                  Buffer var17 = var16.method567(true, (byte)49);
                  if (var17 == null) {
                     var7 = false;
                     if (!var2) {
                        break label168;
                     }
                  }

                  short[] var18;
                  short[] var19;
                  byte[] var20;
                  short[] var21;
                  label116: {
                     if (this.field8795 != null) {
                        var18 = this.field8795.field1759;
                        var19 = this.field8795.field1764;
                        var20 = this.field8795.field1762;
                        var21 = this.field8795.field1757;
                        if (!var2) {
                           break label116;
                        }
                     }

                     var20 = this.field8854;
                     var21 = this.field8833;
                     var19 = this.field8850;
                     var18 = this.field8752;
                  }

                  this.field8835.field5116.copyNormals(var21, var18, var19, var20, 3.0F / (float)this.field8751, 3.0F / (float)(this.field8751 / 2 + this.field8751), 0, 12, this.field8813, var17.getAddress());
                  if (var16.method569(1571)) {
                     this.field8866.field3479 = true;
                     this.field8866.field3480 = var16;
                     if (!var2) {
                        break label168;
                     }
                  }

                  var7 = false;
               }
            }

            if (var6) {
               if (this.field8828.field3473 == null) {
                  this.field8828.field3473 = this.field8835.method1194((byte)89, this.field8841);
               }

               class102 var22 = this.field8828.field3473;
               var22.method568(22407, 8, this.field8813 * 8);
               Buffer var23 = var22.method567(true, (byte)49);
               if (var23 == null) {
                  var7 = false;
                  if (!var2) {
                     return var7;
                  }
               }

               this.field8835.field5116.copyTexCoords(this.field8860, this.field8827, 0, 8, this.field8813, var23.getAddress());
               if (var22.method569(1571)) {
                  this.field8828.field3479 = true;
                  this.field8828.field3480 = var22;
                  if (!var2) {
                     return var7;
                  }
               }

               var7 = false;
            }

            return var7;
         }
      } catch (RuntimeException var25) {
         throw class608.method4462(var25, field8869[20] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "e",
      descriptor = "(I)V",
      line = 4561
   )
   private final void method4476(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8811;
         if (arg0 != 920574152) {
            this.field8828 = null;
         }

         if (this.field8863 != 0) {
            if (this.method4475(true) && this.method4481((byte)-114)) {
               boolean var3;
               label41: {
                  this.field8835.method1202(0, this.field8867.field3480, 10);
                  this.field8835.method1202(1, this.field8755.field3480, 10);
                  this.field8835.method1202(2, this.field8828.field3480, arg0 + -920574142);
                  if ((this.field8851 & 55) != 0) {
                     var3 = true;
                     this.field8835.method2802(arg0 + -920574146, true);
                     this.field8835.method1202(3, this.field8866.field3480, arg0 ^ 920574146);
                     this.field8835.method1166((byte)121, this.field8835.field5331);
                     if (!var2) {
                        break label41;
                     }
                  }

                  this.field8835.method2802(6, false);
                  var3 = false;
                  this.field8835.method1166((byte)121, this.field8835.field5335);
               }

               int var4 = 0;
               if (var2 || this.field8807.length > var4) {
                  do {
                     int var5 = this.field8809[var4];
                     int var6 = this.field8809[var4 + 1];
                     int var7 = 65535 & this.field8758[var5];
                     if (var7 == 65535) {
                        var7 = -1;
                     }

                     this.field8835.method2757(var3, (byte)20, var7, true);
                     this.field8835.method1175(this.field8807[var4], var5 * 3, this.field8746.field884, 0, -var5 + var6, class421.field6132, this.field8865[var4]);
                     ++var4;
                  } while(this.field8807.length > var4);
               }
            }

            this.method4480(true);
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field8869[59] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "()[Llu;",
      line = 4622
   )
   public final class740[] method539() {
      try {
         ++field8839;
         return this.field8868;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[44] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "HA",
      descriptor = "()I",
      line = 4635
   )
   public final int method517() {
      try {
         if (!this.field8760) {
            this.method4482(-32768);
         }

         ++field8770;
         return this.field8818;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[60] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "ua",
      descriptor = "()I",
      line = 4654
   )
   public final int method510() {
      try {
         ++field8784;
         return this.field8840;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[41] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(IILdfa;ZI)Z",
      line = 4662
   )
   public final boolean method521(int arg0, int arg1, class173 arg2, boolean arg3, int arg4) {
      try {
         ++field8765;
         return this.method4474(arg2, arg0, -1, arg3, arg1, arg4, -1);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8869[6] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8869[2] : field8869[3]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "s",
      descriptor = "(I)V",
      line = 4670
   )
   public final void method530(int arg0) {
      try {
         if (this.field8867 != null) {
            this.field8867.field3478 = class624.method4571(arg0, this.field8851, -56);
         }

         ++field8756;
         if (this.field8828 != null) {
            this.field8828.field3478 = class679.method4956(arg0, -106, this.field8851);
         }

         if (this.field8755 != null) {
            this.field8755.field3478 = class383.method2980(arg0, 0, this.field8851);
         }

         if (this.field8866 != null) {
            this.field8866.field3478 = class139.method1298((byte)-123, arg0, this.field8851);
         }

         this.field8840 = arg0;
         this.field8764 = true;
         if (this.field8795 != null && (65536 & this.field8840) == 0) {
            this.field8752 = this.field8795.field1759;
            this.field8833 = this.field8795.field1757;
            this.field8854 = this.field8795.field1762;
            this.field8850 = this.field8795.field1764;
            this.field8795 = null;
         }

         this.method4480(true);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[61] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "()V",
      line = 4714
   )
   public final void method544() {
      try {
         ++field8768;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[19] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(IIIIIIIII)Z",
      line = 4721
   )
   private final boolean method4477(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field8782;
            if (arg2 < arg4 && arg2 < arg3 && arg8 > arg2) {
               return false;
            } else if (~arg4 > ~arg2 && ~arg2 < ~arg3 && ~arg2 < ~arg8) {
               return false;
            } else if (~arg1 > ~arg5 && ~arg7 < ~arg1 && ~arg6 < ~arg1) {
               return false;
            } else {
               return arg1 <= arg5 || arg7 >= arg1 || arg6 >= arg1;
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8869[40] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "C",
      descriptor = "(I)V",
      line = 4747
   )
   public final void method506(int arg0) {
      try {
         ++field8817;
         this.field8779 = (short)arg0;
         this.method4472((byte)-126);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "RA",
      descriptor = "()I",
      line = 4758
   )
   public final int method531() {
      try {
         ++field8864;
         if (!this.field8760) {
            this.method4482(-32768);
         }

         return this.field8803;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[63] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "wa",
      descriptor = "()V",
      line = 4771
   )
   public final void method511() {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nw",
      name = "aa",
      descriptor = "(SS)V",
      line = 4797
   )
   public final void method502(short arg0, short arg1) {
      boolean var3 = client.field4564;

      try {
         ++field8801;
         class160 var4 = this.field8835.field1192;
         int var5 = 0;
         if (var3) {
            if (arg0 == this.field8758[var5]) {
               this.field8758[var5] = arg1;
            }

            ++var5;
         }

         while(true) {
            int var10000;
            if (var5 >= this.field8815) {
               byte var6 = 0;
               byte var7 = 0;
               var10000 = ~arg0;
               if (!var3) {
                  if (var10000 != 0) {
                     class693 var8 = var4.method1456(-8988, 65535 & arg0);
                     var7 = var8.field10170;
                     var6 = var8.field10154;
                  }

                  byte var9 = 0;
                  byte var10 = 0;
                  if (~arg1 != 0) {
                     class693 var11 = var4.method1456(-8988, 65535 & arg1);
                     var10 = var11.field10170;
                     var9 = var11.field10154;
                     if (~var11.field10152 != -1 || var11.field10173 != 0) {
                        this.field8861 = true;
                     }
                  }

                  if (!(~var7 != ~var10 | ~var6 != ~var9)) {
                     return;
                  }

                  if (this.field8845 != null) {
                     int var12 = 0;
                     if (var3 || this.field8759 > var12) {
                        do {
                           class680 var13 = this.field8845[var12];
                           class358 var14 = this.field8820[var12];
                           var14.field5359 = 16777215 & class451.field6600[65535 & this.field8831[var13.field9968]] | var14.field5359 & -16777216;
                           ++var12;
                        } while(this.field8759 > var12);
                     }
                  }

                  this.method4472((byte)-126);
                  return;
               }
            } else {
               var10000 = arg0;
            }

            if (var10000 == this.field8758[var5]) {
               this.field8758[var5] = arg1;
            }

            ++var5;
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field8869[39] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "k",
      descriptor = "(I)V",
      line = 4869
   )
   public final void method543(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8797;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         int var6;
         if (var2) {
            var6 = this.field8791[var5] * var3 + this.field8787[var5] * var4 >> 14;
            this.field8791[var5] = this.field8791[var5] * var4 + -(this.field8787[var5] * var3) >> 14;
            this.field8787[var5] = var6;
            ++var5;
         }

         while(true) {
            while(~var5 > ~this.field8838) {
               var6 = this.field8791[var5] * var3 + this.field8787[var5] * var4 >> 14;
               this.field8791[var5] = this.field8791[var5] * var4 + -(this.field8787[var5] * var3) >> 14;
               this.field8787[var5] = var6;
               ++var5;
            }

            int var7 = 0;
            if (!var2) {
               if (!var2 && ~this.field8813 >= ~var7) {
                  this.method4473(-78);
                  this.method4471(-15824);
                  this.field8760 = false;
                  return;
               } else {
                  do {
                     int var8 = this.field8850[var7] * var3 - -(this.field8833[var7] * var4) >> 14;
                     this.field8850[var7] = (short)(this.field8850[var7] * var4 + -(this.field8833[var7] * var3) >> 14);
                     this.field8833[var7] = (short)var8;
                     ++var7;
                  } while(~this.field8813 < ~var7);

                  this.method4473(-78);
                  this.method4471(-15824);
                  this.field8760 = false;
                  return;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field8869[46] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "r",
      descriptor = "()Z",
      line = 4910
   )
   public final boolean method536() {
      try {
         ++field8858;
         return this.field8861;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "d",
      descriptor = "()Z",
      line = 4926
   )
   public final boolean method529() {
      boolean var1 = client.field4564;

      try {
         ++field8844;
         if (this.field8758 == null) {
            return true;
         } else {
            int var2 = 0;
            if (var1) {
               if (this.field8758[var2] != -1 && !this.field8835.field1192.method1455(this.field8758[var2], 9777)) {
                  return false;
               }

               ++var2;
            }

            while(true) {
               short var10000;
               if (~var2 <= ~this.field8758.length) {
                  var10000 = 1;
                  if (!var1) {
                     return true;
                  }
               } else {
                  var10000 = this.field8758[var2];
               }

               if (var10000 != -1 && !this.field8835.field1192.method1455(this.field8758[var2], 9777)) {
                  return false;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field8869[15] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "d",
      descriptor = "(I)V",
      line = 4950
   )
   public final void method4478(int arg0) {
      try {
         ++field8805;
         if (this.field8867 != null) {
            this.field8867.method1962((byte)-75);
         }

         if (arg0 == 16383) {
            if (this.field8828 != null) {
               this.field8828.method1962((byte)-75);
            }

            if (this.field8755 != null) {
               this.field8755.method1962((byte)-75);
            }

            if (this.field8866 != null) {
               this.field8866.method1962((byte)-75);
            }

            if (this.field8746 != null) {
               this.field8746.method451(arg0 ^ 16341);
            }
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[52] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Llfa;I)V",
      line = 4982
   )
   private final void method4479(class125 param1, int param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "(Z)V",
      line = 5070
   )
   private final void method4480(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8824;
         if (this.field8764) {
            this.field8764 = false;
            if (this.field8780 == null && this.field8868 == null && this.field8845 == null && !class488.method3688(this.field8851, this.field8840, -1455014487)) {
               boolean var3 = false;
               boolean var4 = false;
               boolean var5 = false;
               if (this.field8787 != null && !class668.method4884(this.field8840, 115, this.field8851)) {
                  label351: {
                     if (this.field8867 != null && !this.field8867.method1964(false)) {
                        this.field8764 = true;
                        if (!var2) {
                           break label351;
                        }
                     }

                     if (!this.field8760) {
                        this.method4482(-32768);
                     }

                     var3 = true;
                  }
               }

               if (this.field8796 != null && !class267.method2125(this.field8840, 113, this.field8851)) {
                  label361: {
                     if (this.field8867 == null || this.field8867.method1964(false)) {
                        if (!this.field8760) {
                           this.method4482(-32768);
                        }

                        var4 = true;
                        if (!var2) {
                           break label361;
                        }
                     }

                     this.field8764 = true;
                  }
               }

               if (this.field8791 != null && !class209.method1780(-94, this.field8851, this.field8840)) {
                  label355: {
                     if (this.field8867 != null && !this.field8867.method1964(false)) {
                        this.field8764 = true;
                        if (!var2) {
                           break label355;
                        }
                     }

                     if (!this.field8760) {
                        this.method4482(-32768);
                     }

                     var5 = true;
                  }
               }

               if (var3) {
                  this.field8787 = null;
               }

               if (var5) {
                  this.field8791 = null;
               }

               if (var4) {
                  this.field8796 = null;
               }
            }

            if (this.field8775 != null && this.field8787 == null && this.field8796 == null && this.field8791 == null) {
               this.field8775 = null;
               this.field8857 = null;
            }

            if (this.field8854 != null && !class528.method3953(this.field8851, this.field8840, (byte)-55)) {
               label294: {
                  label293: {
                     boolean var10000;
                     if (~(this.field8851 & 55) == -1) {
                        if (this.field8755 == null || this.field8755.method1964(false)) {
                           break label293;
                        }

                        var10000 = false;
                     } else {
                        if (this.field8866 == null || this.field8866.method1964(false)) {
                           break label293;
                        }

                        var10000 = false;
                     }

                     if (!var10000) {
                        this.field8764 = true;
                        if (!var2) {
                           break label294;
                        }
                     }
                  }

                  this.field8854 = null;
                  this.field8833 = this.field8752 = this.field8850 = null;
               }
            }

            if (this.field8831 != null && !class72.method763(0, this.field8840, this.field8851)) {
               label362: {
                  if (this.field8755 == null || this.field8755.method1964(false)) {
                     this.field8831 = null;
                     if (!var2) {
                        break label362;
                     }
                  }

                  this.field8764 = true;
               }
            }

            if (this.field8821 != null && !class440.method3317(this.field8840, (byte)56, this.field8851)) {
               label266: {
                  if (this.field8755 != null && !this.field8755.method1964(false)) {
                     this.field8764 = true;
                     if (!var2) {
                        break label266;
                     }
                  }

                  this.field8821 = null;
               }
            }

            if (this.field8860 != null && !class244.method1982(this.field8840, 714646727, this.field8851)) {
               label363: {
                  if (this.field8828 == null || this.field8828.method1964(false)) {
                     this.field8860 = this.field8827 = null;
                     if (!var2) {
                        break label363;
                     }
                  }

                  this.field8764 = true;
               }
            }

            if (this.field8758 != null && !class318.method2488(this.field8851, this.field8840, false)) {
               label248: {
                  if (this.field8755 != null && !this.field8755.method1964(false)) {
                     this.field8764 = true;
                     if (!var2) {
                        break label248;
                     }
                  }

                  this.field8758 = null;
               }
            }

            if (this.field8856 != null && !class534.method4000(this.field8851, 124, this.field8840)) {
               label364: {
                  if ((this.field8746 == null || this.field8746.method447(100)) && (this.field8755 == null || this.field8755.method1964(!arg0))) {
                     this.field8856 = this.field8836 = this.field8798 = null;
                     if (!var2) {
                        break label364;
                     }
                  }

                  this.field8764 = true;
               }
            }

            if (this.field8789 != null) {
               label365: {
                  if (this.field8867 == null || this.field8867.method1964(false)) {
                     this.field8789 = null;
                     if (!var2) {
                        break label365;
                     }
                  }

                  this.field8764 = true;
               }
            }

            if (this.field8847 != null) {
               label217: {
                  if (this.field8755 != null && !this.field8755.method1964(false)) {
                     this.field8764 = true;
                     if (!var2) {
                        break label217;
                     }
                  }

                  this.field8847 = null;
               }
            }

            if (this.field8747 != null && !class490.method3703(this.field8840, this.field8851, (byte)-55)) {
               this.field8814 = null;
               this.field8747 = null;
            }

            if (this.field8774 != null && !class109.method1044(this.field8840, 104, this.field8851)) {
               this.field8774 = null;
               this.field8772 = null;
            }

            if (this.field8822 != null && !class250.method2028(this.field8840, arg0, this.field8851)) {
               this.field8822 = null;
            }

            if (!arg0) {
               this.method4474((class173)null, 16, -28, false, -62, 45, 102);
            }

            if (this.field8809 != null && ~(this.field8840 & 2048) == -1 && ~(262144 & this.field8840) == -1) {
               this.field8807 = null;
               this.field8865 = null;
               this.field8809 = null;
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field8869[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(B)Z",
      line = 5278
   )
   private final boolean method4481(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8753;
         if (arg0 != -114) {
            return true;
         } else if (this.field8746.field886) {
            return true;
         } else {
            if (this.field8746.field891 == null) {
               this.field8746.field891 = this.field8835.method1205(this.field8841, 0);
            }

            class280 var3 = this.field8746.field891;
            var3.method2189(27288, this.field8863 * 6);
            Buffer var4 = var3.method2188((byte)-46, true);
            if (var4 != null) {
               label83: {
                  Stream var5;
                  int var6;
                  label82: {
                     var5 = this.field8835.method2759((byte)37, var4);
                     if (Stream.method5090()) {
                        var6 = 0;
                        if (var2) {
                           var5.method5094(this.field8856[var6]);
                           var5.method5094(this.field8836[var6]);
                           var5.method5094(this.field8798[var6]);
                           ++var6;
                        }

                        while(true) {
                           while(var6 < this.field8863) {
                              var5.method5094(this.field8856[var6]);
                              var5.method5094(this.field8836[var6]);
                              var5.method5094(this.field8798[var6]);
                              ++var6;
                           }

                           if (!var2) {
                              if (!var2) {
                                 var5.method5086();
                                 if (!var2) {
                                    break label83;
                                 }

                                 ++var6;
                                 break label82;
                              }
                              break;
                           }

                           ++var6;
                        }
                     }

                     var6 = 0;
                     if (var2) {
                        var5.method5093(this.field8856[var6]);
                        var5.method5093(this.field8836[var6]);
                        var5.method5093(this.field8798[var6]);
                        ++var6;
                     }
                  }

                  while(true) {
                     while(this.field8863 > var6) {
                        var5.method5093(this.field8856[var6]);
                        var5.method5093(this.field8836[var6]);
                        var5.method5093(this.field8798[var6]);
                        ++var6;
                     }

                     var5.method5086();
                     if (!var2) {
                        break;
                     }

                     ++var6;
                  }
               }

               if (var3.method2190(arg0 + -27894)) {
                  this.field8764 = true;
                  this.field8746.field886 = true;
                  this.field8746.field884 = var3;
                  return true;
               }
            }

            return false;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8869[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "V",
      descriptor = "()I",
      line = 5347
   )
   public final int method528() {
      try {
         if (!this.field8760) {
            this.method4482(-32768);
         }

         ++field8762;
         return this.field8778;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "na",
      descriptor = "()I",
      line = 5365
   )
   public final int method553() {
      try {
         if (!this.field8760) {
            this.method4482(-32768);
         }

         ++field8837;
         return this.field8766;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8869[51] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "c",
      descriptor = "(I)V",
      line = 5377
   )
   private final void method4482(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8825;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = arg0;
         int var7 = -32768;
         int var8 = -32768;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         class610 var10000;
         if (var2) {
            var10000 = this;
         } else if (~var11 <= ~this.field8838) {
            this.field8818 = var5;
            this.field8754 = var4;
            this.field8785 = var7;
            this.field8778 = var3;
            this.field8803 = arg0;
            this.field8810 = var8;
            this.field8766 = (int)(0.99D + Math.sqrt((double)var9));
            this.field8788 = (int)(0.99D + Math.sqrt((double)var10));
            var10000 = this;
            if (!var2) {
               this.field8760 = true;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var12 = var10000.field8787[var11];
            int var13 = this.field8796[var11];
            if (var6 < var12) {
               var6 = var12;
            }

            if (~var12 > ~var3) {
               var3 = var12;
            }

            int var14 = this.field8791[var11];
            if (~var4 < ~var13) {
               var4 = var13;
            }

            if (~var13 < ~var7) {
               var7 = var13;
            }

            if (var5 > var14) {
               var5 = var14;
            }

            if (~var14 < ~var8) {
               var8 = var14;
            }

            int var15 = var12 * var12 + var14 * var14;
            if (~var15 < ~var9) {
               var9 = var15;
            }

            int var16 = var13 * var13 + (var12 * var12 - -(var14 * var14));
            if (~var10 > ~var16) {
               var10 = var16;
            }

            ++var11;
            if (~var11 <= ~this.field8838) {
               this.field8818 = var5;
               this.field8754 = var4;
               this.field8785 = var7;
               this.field8778 = var3;
               this.field8803 = var6;
               this.field8810 = var8;
               this.field8766 = (int)(0.99D + Math.sqrt((double)var9));
               this.field8788 = (int)(0.99D + Math.sqrt((double)var10));
               var10000 = this;
               if (!var2) {
                  this.field8760 = true;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field8869[28] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(IFJLph;IIFIIII)S",
      line = 5453
   )
   private final short method4483(int arg0, float arg1, long arg2, class668 arg3, int arg4, int arg5, float arg6, int arg7, int arg8, int arg9, int arg10) {
      boolean var13 = client.field4564;

      try {
         ++field8792;
         int var14 = this.field8857[arg9];
         int var15 = this.field8857[arg9 + 1];
         if (arg4 != 12) {
            return 9;
         } else {
            int var16 = 0;
            int var17 = var14;
            short var10000;
            if (var13) {
               var10000 = this.field8775[var14];
            } else if (var14 >= var15) {
               this.field8775[var16] = (short)(this.field8813 + 1);
               class650.field9428[var16] = arg2;
               this.field8847[this.field8813] = (short)arg8;
               this.field8789[this.field8813] = (short)arg9;
               this.field8833[this.field8813] = (short)arg0;
               this.field8752[this.field8813] = (short)arg7;
               this.field8850[this.field8813] = (short)arg10;
               this.field8854[this.field8813] = (byte)arg5;
               this.field8860[this.field8813] = arg6;
               this.field8827[this.field8813] = arg1;
               var10000 = (short)(this.field8813++);
               if (!var13) {
                  return var10000;
               }
            } else {
               var10000 = this.field8775[var14];
            }

            do {
               while(true) {
                  short var18 = var10000;
                  if (~var18 == -1) {
                     var16 = var17;
                     if (!var13) {
                        this.field8775[var17] = (short)(this.field8813 + 1);
                        class650.field9428[var17] = arg2;
                        this.field8847[this.field8813] = (short)arg8;
                        this.field8789[this.field8813] = (short)arg9;
                        this.field8833[this.field8813] = (short)arg0;
                        this.field8752[this.field8813] = (short)arg7;
                        this.field8850[this.field8813] = (short)arg10;
                        this.field8854[this.field8813] = (byte)arg5;
                        this.field8860[this.field8813] = arg6;
                        this.field8827[this.field8813] = arg1;
                        var10000 = (short)(this.field8813++);
                        break;
                     }

                     if (~class650.field9428[var17] == ~arg2) {
                        return (short)(var18 - 1);
                     }

                     ++var17;
                  } else {
                     if (~class650.field9428[var17] == ~arg2) {
                        return (short)(var18 - 1);
                     }

                     ++var17;
                  }

                  if (var17 >= var15) {
                     this.field8775[var16] = (short)(this.field8813 + 1);
                     class650.field9428[var16] = arg2;
                     this.field8847[this.field8813] = (short)arg8;
                     this.field8789[this.field8813] = (short)arg9;
                     this.field8833[this.field8813] = (short)arg0;
                     this.field8752[this.field8813] = (short)arg7;
                     this.field8850[this.field8813] = (short)arg10;
                     this.field8854[this.field8813] = (byte)arg5;
                     this.field8860[this.field8813] = arg6;
                     this.field8827[this.field8813] = arg1;
                     var10000 = (short)(this.field8813++);
                     if (!var13) {
                        return var10000;
                     }
                  } else {
                     var10000 = this.field8775[var17];
                  }
               }
            } while(var13);

            return var10000;
         }
      } catch (RuntimeException var20) {
         throw class608.method4462(var20, field8869[65] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field8869[2] : field8869[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Ldfa;)V",
      line = 5501
   )
   public final void method554(class173 arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8806;
         class104 var3 = (class104)arg0;
         if (this.field8780 != null) {
            int var4 = 0;
            if (var2 || ~this.field8780.length < ~var4) {
               do {
                  class309 var5 = this.field8780[var4];
                  class309 var6 = var5;
                  if (var5.field4443 != null) {
                     var6 = var5.field4443;
                  }

                  var6.field4454 = (int)((float)this.field8791[var5.field4459] * var3.field1724 + (float)this.field8796[var5.field4459] * var3.field1732 + (float)this.field8787[var5.field4459] * var3.field1717 + var3.field1705);
                  var6.field4452 = (int)((float)this.field8791[var5.field4459] * var3.field1726 + (float)this.field8796[var5.field4459] * var3.field1729 + (float)this.field8787[var5.field4459] * var3.field1730 + var3.field1740);
                  var6.field4442 = (int)((float)this.field8791[var5.field4459] * var3.field1694 + (float)this.field8796[var5.field4459] * var3.field1713 + (float)this.field8787[var5.field4459] * var3.field1733 + var3.field1706);
                  var6.field4444 = (int)((float)this.field8791[var5.field4451] * var3.field1724 + (float)this.field8796[var5.field4451] * var3.field1732 + (float)this.field8787[var5.field4451] * var3.field1717 + var3.field1705);
                  var6.field4450 = (int)((float)this.field8791[var5.field4451] * var3.field1726 + (float)this.field8796[var5.field4451] * var3.field1729 + (float)this.field8787[var5.field4451] * var3.field1730 + var3.field1740);
                  var6.field4453 = (int)((float)this.field8791[var5.field4451] * var3.field1694 + (float)this.field8796[var5.field4451] * var3.field1713 + (float)this.field8787[var5.field4451] * var3.field1733 + var3.field1706);
                  var6.field4447 = (int)((float)this.field8791[var5.field4455] * var3.field1724 + (float)this.field8796[var5.field4455] * var3.field1732 + (float)this.field8787[var5.field4455] * var3.field1717 + var3.field1705);
                  var6.field4458 = (int)((float)this.field8791[var5.field4455] * var3.field1726 + (float)this.field8796[var5.field4455] * var3.field1729 + (float)this.field8787[var5.field4455] * var3.field1730 + var3.field1740);
                  var6.field4449 = (int)((float)this.field8791[var5.field4455] * var3.field1694 + (float)this.field8796[var5.field4455] * var3.field1713 + (float)this.field8787[var5.field4455] * var3.field1733 + var3.field1706);
                  ++var4;
               } while(~this.field8780.length < ~var4);
            }
         }

         if (this.field8868 != null) {
            int var7 = 0;
            if (var2 || ~var7 > ~this.field8868.length) {
               do {
                  class740 var8 = this.field8868[var7];
                  class740 var9 = var8;
                  if (var8.field10656 != null) {
                     var9 = var8.field10656;
                  }

                  if (var8.field10657 != null) {
                     var8.field10657.method982(var3);
                     if (var2) {
                        var8.field10657 = var3.method999();
                     }
                  } else {
                     var8.field10657 = var3.method999();
                  }

                  var9.field10654 = (int)((float)this.field8791[var8.field10651] * var3.field1724 + (float)this.field8796[var8.field10651] * var3.field1732 + (float)this.field8787[var8.field10651] * var3.field1717 + var3.field1705);
                  var9.field10662 = (int)((float)this.field8791[var8.field10651] * var3.field1726 + (float)this.field8796[var8.field10651] * var3.field1729 + (float)this.field8787[var8.field10651] * var3.field1730 + var3.field1740);
                  var9.field10652 = (int)((float)this.field8791[var8.field10651] * var3.field1694 + (float)this.field8796[var8.field10651] * var3.field1713 + (float)this.field8787[var8.field10651] * var3.field1733 + var3.field1706);
                  ++var7;
               } while(~var7 > ~this.field8868.length);

            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field8869[12] + (arg0 != null ? field8869[2] : field8869[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "VA",
      descriptor = "(I)V",
      line = 5568
   )
   public final void method538(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8773;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         if (!var2 && ~var5 <= ~this.field8838) {
            this.method4473(-84);
            this.field8760 = false;
         } else {
            do {
               int var6 = this.field8796[var5] * var3 + this.field8787[var5] * var4 >> 14;
               this.field8796[var5] = this.field8796[var5] * var4 - this.field8787[var5] * var3 >> 14;
               this.field8787[var5] = var6;
               ++var5;
            } while(~var5 > ~this.field8838);

            this.method4473(-84);
            this.field8760 = false;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8869[32] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "FA",
      descriptor = "(I)V",
      line = 5597
   )
   public final void method524(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8750;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         class610 var10000;
         if (var2) {
            var10000 = this;
         } else if (var5 >= this.field8838) {
            this.method4473(-78);
            var10000 = this;
            if (!var2) {
               this.field8760 = false;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field8796[var5] * var4 + -(this.field8791[var5] * var3) >> 14;
            this.field8791[var5] = this.field8796[var5] * var3 + this.field8791[var5] * var4 >> 14;
            this.field8796[var5] = var6;
            ++var5;
            if (var5 >= this.field8838) {
               this.method4473(-78);
               var10000 = this;
               if (!var2) {
                  this.field8760 = false;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field8869[45] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "p",
      descriptor = "(IILs;Ls;III)V",
      line = 5626
   )
   public final void method520(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field8849;
         if (!this.field8760) {
            this.method4482(-32768);
         }

         int var9 = this.field8778 + arg4;
         int var10 = this.field8803 + arg4;
         int var11 = arg6 - -this.field8818;
         int var12 = this.field8810 + arg6;
         if (~arg0 != -2 && arg0 != 2 && arg0 != 3 && ~arg0 != -6 || ~var9 <= -1 && ~arg2.field4080 < ~(arg2.field4083 + var10 >> arg2.field4081) && ~var11 <= -1 && ~arg2.field4077 < ~(arg2.field4083 + var12 >> arg2.field4081)) {
            if (~arg0 != -5 && arg0 != 5) {
               int var13 = var9 >> arg2.field4081;
               int var14 = arg2.field4083 - 1 + var10 >> arg2.field4081;
               int var15 = var11 >> arg2.field4081;
               int var16 = arg2.field4083 + var12 + -1 >> arg2.field4081;
               if (~arg2.method2289(var13, var15, (byte)118) == ~arg5 && arg2.method2289(var14, var15, (byte)111) == arg5 && ~arg2.method2289(var13, var16, (byte)127) == ~arg5 && ~arg2.method2289(var14, var16, (byte)120) == ~arg5) {
                  return;
               }
            } else {
               if (arg3 == null) {
                  return;
               }

               if (~var9 > -1 || ~arg3.field4080 >= ~(var10 - -arg3.field4083 >> arg3.field4081) || var11 < 0 || arg3.field4077 <= var12 - -arg3.field4083 >> arg3.field4081) {
                  return;
               }
            }

            label261: {
               if (arg0 == 1) {
                  int var17 = 0;
                  if (var8) {
                     this.field8796[var17] = -arg5 + this.field8796[var17] + arg2.method2287(-82, this.field8791[var17] + arg6, this.field8787[var17] - -arg4);
                     ++var17;
                  }

                  while(true) {
                     while(~var17 > ~this.field8838) {
                        this.field8796[var17] = -arg5 + this.field8796[var17] + arg2.method2287(-82, this.field8791[var17] + arg6, this.field8787[var17] - -arg4);
                        ++var17;
                     }

                     if (!var8) {
                        if (!var8) {
                           break label261;
                        }
                        break;
                     }

                     ++var17;
                  }
               }

               if (~arg0 != -3) {
                  if (arg0 == 3) {
                     int var18 = (arg1 & 255) * 4;
                     int var19 = ((arg1 & 65399) >> 8) * 4;
                     int var20 = (arg1 >> 16 & 255) << 6;
                     int var21 = (255 & arg1 >> 24) << 6;
                     if (~(-(var18 >> 1) + arg4) > -1 || ~(arg4 - -(var18 >> 1) + arg2.field4083) <= ~(arg2.field4080 << arg2.field4081) || arg6 - (var19 >> 1) < 0 || ~((var19 >> 1) + arg6 - -arg2.field4083) <= ~(arg2.field4077 << arg2.field4081)) {
                        return;
                     }

                     this.method3734(var21, var20, (byte)-89, arg4, var18, var19, arg5, arg6, arg2);
                     if (!var8) {
                        break label261;
                     }
                  }

                  if (arg0 != 4) {
                     if (arg0 != 5) {
                        break label261;
                     }

                     int var22 = -this.field8754 + this.field8785;
                     int var23 = 0;
                     if (!var8 && this.field8838 <= var23) {
                        if (!var8) {
                           break label261;
                        }
                     } else {
                        while(true) {
                           int var24 = this.field8787[var23] + arg4;
                           int var25 = this.field8791[var23] + arg6;
                           int var26 = arg2.method2287(48, var25, var24);
                           int var27 = arg3.method2287(83, var25, var24);
                           int var28 = -arg1 + var26 - var27;
                           this.field8796[var23] = ((this.field8796[var23] << 8) / var22 * var28 >> 8) + (-arg5 - -var26);
                           ++var23;
                           if (this.field8838 <= var23) {
                              if (!var8) {
                                 break label261;
                              }
                              break;
                           }
                        }
                     }
                  }

                  int var29 = this.field8785 - this.field8754;
                  int var30 = 0;
                  if (var8) {
                     this.field8796[var30] = var29 + (this.field8796[var30] - arg5 - -arg3.method2287(85, this.field8791[var30] + arg6, this.field8787[var30] + arg4));
                     ++var30;
                  }

                  while(true) {
                     while(var30 < this.field8838) {
                        this.field8796[var30] = var29 + (this.field8796[var30] - arg5 - -arg3.method2287(85, this.field8791[var30] + arg6, this.field8787[var30] + arg4));
                        ++var30;
                     }

                     if (!var8) {
                        if (!var8) {
                           break label261;
                        }
                        break;
                     }

                     ++var30;
                  }
               }

               int var31 = this.field8754;
               if (~var31 == -1) {
                  return;
               }

               int var32 = 0;
               if (var8 || var32 < this.field8838) {
                  do {
                     int var33 = (this.field8796[var32] << 16) / var31;
                     if (~arg1 < ~var33) {
                        this.field8796[var32] += (arg1 - var33) * (-arg5 + arg2.method2287(75, this.field8791[var32] + arg6, this.field8787[var32] - -arg4)) / arg1;
                     }

                     ++var32;
                  } while(var32 < this.field8838);
               }
            }

            this.method4473(-101);
            this.field8760 = false;
         }
      } catch (RuntimeException var35) {
         throw class608.method4462(var35, field8869[27] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field8869[2] : field8869[3]) + ',' + (arg3 != null ? field8869[2] : field8869[3]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "b",
      descriptor = "(B)V",
      line = 5777
   )
   private final void method4484(byte arg0) {
      try {
         ++field8749;
         if (this.field8746 != null) {
            this.field8746.field886 = false;
         }

         if (arg0 != 118) {
            this.field8775 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8869[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Ldfa;Lija;II)V",
      line = 5802
   )
   public final void method552(class173 arg0, class362 arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field8855;
         if (~this.field8813 != -1) {
            class104 var6 = this.field8835.field5219;
            if (!this.field8760) {
               this.method4482(-32768);
            }

            class104 var7;
            float var10;
            float var11;
            label93: {
               var7 = (class104)arg0;
               class654.field9530 = var6.field1694 * var7.field1706 + var6.field1733 * var7.field1705 + var6.field1713 * var7.field1740 + var6.field1706;
               class522.field7655 = var6.field1694 * var7.field1713 + var6.field1733 * var7.field1732 + var6.field1713 * var7.field1729;
               float var8 = (float)this.field8754 * class522.field7655 + class654.field9530;
               float var9 = (float)this.field8785 * class522.field7655 + class654.field9530;
               if (var8 > var9) {
                  var10 = (float)this.field8766 + var8;
                  var11 = var9 - (float)this.field8766;
                  if (!var5) {
                     break label93;
                  }
               }

               var11 = (float)(-this.field8766) + var8;
               var10 = (float)this.field8766 + var9;
            }

            if (!(var11 >= this.field8835.field5235)) {
               if (!(var10 <= (float)this.field8835.field5288)) {
                  float var14;
                  float var15;
                  label85: {
                     class63.field1164 = var6.field1724 * var7.field1706 + var6.field1732 * var7.field1740 + var6.field1717 * var7.field1705 + var6.field1705;
                     class783.field11462 = var6.field1724 * var7.field1713 + var6.field1732 * var7.field1729 + var6.field1717 * var7.field1732;
                     float var12 = (float)this.field8754 * class783.field11462 + class63.field1164;
                     float var13 = (float)this.field8785 * class783.field11462 + class63.field1164;
                     if (var12 > var13) {
                        var14 = ((float)(-this.field8766) + var13) * (float)this.field8835.field5302;
                        var15 = ((float)this.field8766 + var12) * (float)this.field8835.field5302;
                        if (!var5) {
                           break label85;
                        }
                     }

                     var14 = ((float)(-this.field8766) + var12) * (float)this.field8835.field5302;
                     var15 = ((float)this.field8766 + var13) * (float)this.field8835.field5302;
                  }

                  if (!(var14 / (float)arg2 >= this.field8835.field5243)) {
                     if (!(var15 / (float)arg2 <= this.field8835.field5289)) {
                        float var18;
                        float var19;
                        label77: {
                           class479.field6991 = var6.field1726 * var7.field1713 + var6.field1730 * var7.field1732 + var6.field1729 * var7.field1729;
                           class250.field3582 = var6.field1726 * var7.field1706 + var6.field1730 * var7.field1705 + var6.field1729 * var7.field1740 + var6.field1740;
                           float var16 = (float)this.field8754 * class479.field6991 + class250.field3582;
                           float var17 = (float)this.field8785 * class479.field6991 + class250.field3582;
                           if (var17 < var16) {
                              var18 = (var17 - (float)this.field8766) * (float)this.field8835.field5307;
                              var19 = ((float)this.field8766 + var16) * (float)this.field8835.field5307;
                              if (!var5) {
                                 break label77;
                              }
                           }

                           var18 = ((float)(-this.field8766) + var16) * (float)this.field8835.field5307;
                           var19 = ((float)this.field8766 + var17) * (float)this.field8835.field5307;
                        }

                        if (!(this.field8835.field5311 <= var18 / (float)arg2)) {
                           if (!(var19 / (float)arg2 <= this.field8835.field5277)) {
                              if (arg1 != null || this.field8845 != null) {
                                 class353.field4996 = var6.field1694 * var7.field1733 + var6.field1733 * var7.field1717 + var6.field1713 * var7.field1730;
                                 class360.field5392 = var6.field1724 * var7.field1733 + var6.field1732 * var7.field1730 + var6.field1717 * var7.field1717;
                                 class304.field4405 = var6.field1724 * var7.field1694 + var6.field1732 * var7.field1726 + var6.field1717 * var7.field1724;
                                 class672.field9857 = var6.field1726 * var7.field1733 + var6.field1730 * var7.field1717 + var6.field1729 * var7.field1730;
                                 class558.field8129 = var6.field1694 * var7.field1694 + var6.field1733 * var7.field1724 + var6.field1713 * var7.field1726;
                                 class499.field7293 = var6.field1726 * var7.field1694 + var6.field1730 * var7.field1724 + var6.field1729 * var7.field1726;
                              }

                              if (arg1 != null) {
                                 int var20 = this.field8803 + this.field8778 >> 1;
                                 int var21 = this.field8818 + this.field8810 >> 1;
                                 int var22 = (int)((float)var21 * class304.field4405 + (float)this.field8754 * class783.field11462 + (float)var20 * class360.field5392 + class63.field1164);
                                 int var23 = (int)((float)var21 * class499.field7293 + (float)this.field8754 * class479.field6991 + (float)var20 * class672.field9857 + class250.field3582);
                                 int var24 = (int)((float)var21 * class558.field8129 + (float)this.field8754 * class522.field7655 + (float)var20 * class353.field4996 + class654.field9530);
                                 int var25 = (int)((float)var21 * class304.field4405 + (float)this.field8785 * class783.field11462 + (float)var20 * class360.field5392 + class63.field1164);
                                 int var26 = (int)((float)var21 * class499.field7293 + (float)this.field8785 * class479.field6991 + (float)var20 * class672.field9857 + class250.field3582);
                                 arg1.field5407 = this.field8835.field5302 * var25 / arg2 + this.field8835.field5291;
                                 arg1.field5408 = this.field8835.field5307 * var23 / arg2 + this.field8835.field5304;
                                 int var27 = (int)((float)var21 * class558.field8129 + (float)this.field8785 * class522.field7655 + (float)var20 * class353.field4996 + class654.field9530);
                                 arg1.field5410 = this.field8835.field5304 - -(this.field8835.field5307 * var26 / arg2);
                                 arg1.field5411 = this.field8835.field5302 * var22 / arg2 + this.field8835.field5291;
                                 if (~var24 <= ~this.field8835.field5288 || ~var27 <= ~this.field8835.field5288) {
                                    arg1.field5406 = true;
                                    arg1.field5409 = this.field8835.field5291 - (-((this.field8766 + var22) * this.field8835.field5302 / arg2) + arg1.field5411);
                                 }
                              }

                              this.field8835.method2751((byte)76, (float)arg2);
                              this.field8835.method2799(-123);
                              this.field8835.method2743(var7, (byte)-82);
                              this.method4476(920574152);
                              this.method4485(false);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field8869[23] + (arg0 != null ? field8869[2] : field8869[3]) + ',' + (arg1 != null ? field8869[2] : field8869[3]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "a",
      descriptor = "(Lka;IIIZ)V",
      line = 5948
   )
   public final void method533(class495 param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!nw",
      name = "c",
      descriptor = "(Z)V",
      line = 6222
   )
   private final void method4485(boolean arg0) {
      boolean var2 = client.field4564;

      try {
         ++field8816;
         if (arg0) {
            this.field8833 = null;
         }

         if (this.field8845 != null) {
            this.field8835.method316(!this.field8832);
            this.field8835.method2802(6, false);
            this.field8835.method2779(8, 1, class295.field4119);
            this.field8835.method2783(3592, class295.field4119, 1);
            int var3 = 0;
            class610 var10000;
            if (var2) {
               var10000 = this;
            } else if (var3 >= this.field8759) {
               this.field8835.method2783(3592, class315.field4537, 1);
               this.field8835.method2779(8, 1, class315.field4537);
               var10000 = this;
               if (!var2) {
                  this.field8835.method316(true);
                  return;
               }
            } else {
               var10000 = this;
            }

            while(true) {
               class680 var4 = var10000.field8845[var3];
               class358 var5 = this.field8820[var3];
               if (var4.field9978 && this.field8835.method410()) {
                  ++var3;
               } else {
                  float var6 = (float)(this.field8787[var4.field9977] - (-this.field8787[var4.field9975] + -this.field8787[var4.field9967])) * 0.3333333F;
                  float var7 = (float)(this.field8796[var4.field9975] - -this.field8796[var4.field9967] + this.field8796[var4.field9977]) * 0.3333333F;
                  float var8 = (float)(this.field8791[var4.field9977] + this.field8791[var4.field9975] + this.field8791[var4.field9967]) * 0.3333333F;
                  float var9 = class304.field4405 * var8 + class783.field11462 * var7 + class360.field5392 * var6 + class63.field1164;
                  float var10 = class499.field7293 * var8 + class672.field9857 * var6 + class479.field6991 * var7 + class250.field3582;
                  float var11 = class558.field8129 * var8 + class522.field7655 * var7 + class353.field4996 * var6 + class654.field9530;
                  float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var9 * var9 + var10 * var10))) * (float)var4.field9970;
                  class104 var13 = this.field8835.method2755(0);
                  var13.method1013(1, -(var11 * var12) + var11, (float)var5.field5356 + var10 - var10 * var12, var5.field5354, var4.field9969 * var5.field5363 >> 7, (float)var5.field5353 + var9 + -(var9 * var12), var4.field9979 * var5.field5355 >> 7);
                  var13.method980(0, this.field8835.field5220);
                  this.field8835.method2746((byte)69);
                  int var14 = var5.field5359;
                  this.field8835.method2757(false, (byte)20, var4.field9972, false);
                  this.field8835.method2748(var4.field9965, (byte)-21);
                  this.field8835.method2754(var14, (byte)-60);
                  this.field8835.method2777(121);
                  ++var3;
               }

               if (var3 >= this.field8759) {
                  this.field8835.method2783(3592, class315.field4537, 1);
                  this.field8835.method2779(8, 1, class315.field4537);
                  var10000 = this;
                  if (!var2) {
                     this.field8835.method316(true);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field8869[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4486(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 74);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4487(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 93;
            break;
         case 1:
            var10005 = 72;
            break;
         case 2:
            var10005 = 106;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 74;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
