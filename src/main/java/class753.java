import jaclib.memory.Stream;
import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cp")
public class class753 extends class495 {
   @OriginalMember(
      owner = "client!cp",
      name = "tc",
      descriptor = "I"
   )
   private int field10862 = 0;
   @OriginalMember(
      owner = "client!cp",
      name = "fb",
      descriptor = "I"
   )
   private int field10889 = 0;
   @OriginalMember(
      owner = "client!cp",
      name = "B",
      descriptor = "I"
   )
   private int field10903 = 0;
   @OriginalMember(
      owner = "client!cp",
      name = "xc",
      descriptor = "Z"
   )
   private boolean field10880 = false;
   @OriginalMember(
      owner = "client!cp",
      name = "H",
      descriptor = "Z"
   )
   private boolean field10831 = false;
   @OriginalMember(
      owner = "client!cp",
      name = "u",
      descriptor = "I"
   )
   private int field10928 = 0;
   @OriginalMember(
      owner = "client!cp",
      name = "N",
      descriptor = "Z"
   )
   private boolean field10858 = false;
   @OriginalMember(
      owner = "client!cp",
      name = "s",
      descriptor = "Z"
   )
   private boolean field10931 = true;
   @OriginalMember(
      owner = "client!cp",
      name = "V",
      descriptor = "I"
   )
   private int field10939 = 0;
   @OriginalMember(
      owner = "client!cp",
      name = "yb",
      descriptor = "Lrk;"
   )
   private class35 field10832;
   @OriginalMember(
      owner = "client!cp",
      name = "lc",
      descriptor = "Ljia;"
   )
   private class642 field10844;
   @OriginalMember(
      owner = "client!cp",
      name = "t",
      descriptor = "Ljia;"
   )
   private class642 field10925;
   @OriginalMember(
      owner = "client!cp",
      name = "mc",
      descriptor = "Ljia;"
   )
   private class642 field10864;
   @OriginalMember(
      owner = "client!cp",
      name = "gc",
      descriptor = "Ljia;"
   )
   private class642 field10894;
   @OriginalMember(
      owner = "client!cp",
      name = "X",
      descriptor = "Lla;"
   )
   private class474 field10932;
   @OriginalMember(
      owner = "client!cp",
      name = "xb",
      descriptor = "I"
   )
   private int field10882;
   @OriginalMember(
      owner = "client!cp",
      name = "p",
      descriptor = "I"
   )
   private int field10899;
   @OriginalMember(
      owner = "client!cp",
      name = "Qb",
      descriptor = "[I"
   )
   private int[] field10869;
   @OriginalMember(
      owner = "client!cp",
      name = "zb",
      descriptor = "[I"
   )
   private int[] field10870;
   @OriginalMember(
      owner = "client!cp",
      name = "Kb",
      descriptor = "[S"
   )
   private short[] field10909;
   @OriginalMember(
      owner = "client!cp",
      name = "nb",
      descriptor = "[I"
   )
   private int[] field10854;
   @OriginalMember(
      owner = "client!cp",
      name = "ic",
      descriptor = "[I"
   )
   private int[] field10901;
   @OriginalMember(
      owner = "client!cp",
      name = "jb",
      descriptor = "[Ltf;"
   )
   private class309[] field10876;
   @OriginalMember(
      owner = "client!cp",
      name = "rb",
      descriptor = "[Llu;"
   )
   private class740[] field10941;
   @OriginalMember(
      owner = "client!cp",
      name = "Bb",
      descriptor = "I"
   )
   private int field10900;
   @OriginalMember(
      owner = "client!cp",
      name = "Vb",
      descriptor = "[Lgt;"
   )
   private class478[] field10836;
   @OriginalMember(
      owner = "client!cp",
      name = "kc",
      descriptor = "[Lvb;"
   )
   private class205[] field10935;
   @OriginalMember(
      owner = "client!cp",
      name = "Fb",
      descriptor = "[S"
   )
   private short[] field10902;
   @OriginalMember(
      owner = "client!cp",
      name = "Ac",
      descriptor = "[B"
   )
   private byte[] field10878;
   @OriginalMember(
      owner = "client!cp",
      name = "Hb",
      descriptor = "[B"
   )
   private byte[] field10855;
   @OriginalMember(
      owner = "client!cp",
      name = "Ab",
      descriptor = "[S"
   )
   private short[] field10892;
   @OriginalMember(
      owner = "client!cp",
      name = "yc",
      descriptor = "[S"
   )
   private short[] field10846;
   @OriginalMember(
      owner = "client!cp",
      name = "v",
      descriptor = "[F"
   )
   private float[] field10944;
   @OriginalMember(
      owner = "client!cp",
      name = "Bc",
      descriptor = "[S"
   )
   private short[] field10885;
   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "S"
   )
   private short field10948;
   @OriginalMember(
      owner = "client!cp",
      name = "uc",
      descriptor = "[F"
   )
   private float[] field10938;
   @OriginalMember(
      owner = "client!cp",
      name = "fc",
      descriptor = "[S"
   )
   private short[] field10859;
   @OriginalMember(
      owner = "client!cp",
      name = "Zb",
      descriptor = "[S"
   )
   private short[] field10852;
   @OriginalMember(
      owner = "client!cp",
      name = "wb",
      descriptor = "[S"
   )
   private short[] field10947;
   @OriginalMember(
      owner = "client!cp",
      name = "Db",
      descriptor = "[S"
   )
   private short[] field10833;
   @OriginalMember(
      owner = "client!cp",
      name = "tb",
      descriptor = "[S"
   )
   private short[] field10897;
   @OriginalMember(
      owner = "client!cp",
      name = "x",
      descriptor = "S"
   )
   private short field10949;
   @OriginalMember(
      owner = "client!cp",
      name = "Lb",
      descriptor = "[S"
   )
   private short[] field10835;
   @OriginalMember(
      owner = "client!cp",
      name = "sb",
      descriptor = "[I"
   )
   private int[] field10912;
   @OriginalMember(
      owner = "client!cp",
      name = "O",
      descriptor = "[[I"
   )
   private int[][] field10898;
   @OriginalMember(
      owner = "client!cp",
      name = "Z",
      descriptor = "[[I"
   )
   private int[][] field10860;
   @OriginalMember(
      owner = "client!cp",
      name = "M",
      descriptor = "[[I"
   )
   private int[][] field10904;
   @OriginalMember(
      owner = "client!cp",
      name = "F",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10952 = new String[]{method5465(method5464("\u0007\u007f3#qL")), method5465(method5464("\u0007\u007f3.qL")), method5465(method5464("\u0007\u007f3\u00048")), method5465(method5464("\u0007\u007f3=qL")), method5465(method5464("\u0007\u007f3\u000fQL")), method5465(method5464("\u0007\u007f3\u00198")), method5465(method5464("\u0007\u007f3\u000bQL")), method5465(method5464("\u0007\u007f3,qL")), method5465(method5464("\u0007\u007f3$qL")), method5465(method5464("\nzq&")), method5465(method5464("\u0007\u007f3\u0019QL")), method5465(method5464("\u001f!3dm")), method5465(method5464("\u0007\u007f3\u001aQL")), method5465(method5464("\u0007\u007f3!8")), method5465(method5464("\u0007\u007f3\u0005QL")), method5465(method5464("\u0007\u007f3\u00078")), method5465(method5464("\u0007\u007f3\u001c8")), method5465(method5464("\u0007\u007f3\u00028")), method5465(method5464("\u0007\u007f3\u00188")), method5465(method5464("\u0007\u007f3\u000eQL")), method5465(method5464("\u0007\u007f3?qL")), method5465(method5464("\u0007\u007f3+qL")), method5465(method5464("\u0007\u007f3\u001e8")), method5465(method5464("\u0007\u007f398")), method5465(method5464("\u0007\u007f3+8")), method5465(method5464("\u0007\u007f3\u001d8")), method5465(method5464("\u0007\u007f3\u001a8")), method5465(method5464("\u0007\u007f3\r8")), method5465(method5464("\u0007\u007f3:8")), method5465(method5464("\u0007\u007f3\u00068")), method5465(method5464("\u0007\u007f30qL")), method5465(method5464("\u0007\u007f3\u0003QL")), method5465(method5464("\u0007\u007f3\u0007QL")), method5465(method5464("\u0007\u007f3\u0004QL")), method5465(method5464("\u0007\u007f3\rQL")), method5465(method5464("\u0007\u007f3\u00018")), method5465(method5464("\u0007\u007f3\u001dQL")), method5465(method5464("\u0007\u007f3\t8")), method5465(method5464("\u0007\u007f3(qL")), method5465(method5464("\u0007\u007f3\bQL")), method5465(method5464("\u0007\u007f3\u00008")), method5465(method5464("\u0007\u007f3\u0018QL")), method5465(method5464("\u0007\u007f3\f8")), method5465(method5464("\u0007\u007f3\u001b8")), method5465(method5464("\u0007\u007f3\fQL")), method5465(method5464("\u0007\u007f3\tQL")), method5465(method5464("\u0007\u007f3\u000e8")), method5465(method5464("\u0007\u007f3\u001f8")), method5465(method5464("\u0007\u007f3\u00038")), method5465(method5464("\u0007\u007f3\u001eQL")), method5465(method5464("\u0007\u007f388")), method5465(method5464("\u0007\u007f3'qL")), method5465(method5464("\u0007\u007f3\u00058")), method5465(method5464("\u0007\u007f3\u0006QL")), method5465(method5464("\u0007\u007f3\u001cQL")), method5465(method5464("\u0007\u007f3\u0000QL")), method5465(method5464("\u0007\u007f3\u000f8")), method5465(method5464("\u0007\u007f3vy\nfit8")), method5465(method5464("\u0007\u007f3<8")), method5465(method5464("\u0007\u007f3\b8")), method5465(method5464("\u0007\u007f3\u0001QL")), method5465(method5464("\u0007\u007f3\u000b8")), method5465(method5464("\u0007\u007f3\u0002QL"))};
   @OriginalMember(
      owner = "client!cp",
      name = "P",
      descriptor = "B"
   )
   private byte field10945;
   @OriginalMember(
      owner = "client!cp",
      name = "Wb",
      descriptor = "I"
   )
   public static int field10834;
   @OriginalMember(
      owner = "client!cp",
      name = "mb",
      descriptor = "I"
   )
   public static int field10837;
   @OriginalMember(
      owner = "client!cp",
      name = "w",
      descriptor = "I"
   )
   public static int field10838;
   @OriginalMember(
      owner = "client!cp",
      name = "A",
      descriptor = "I"
   )
   public static int field10840;
   @OriginalMember(
      owner = "client!cp",
      name = "C",
      descriptor = "I"
   )
   public static int field10841;
   @OriginalMember(
      owner = "client!cp",
      name = "sc",
      descriptor = "I"
   )
   public static int field10842;
   @OriginalMember(
      owner = "client!cp",
      name = "L",
      descriptor = "I"
   )
   public static int field10843;
   @OriginalMember(
      owner = "client!cp",
      name = "ac",
      descriptor = "I"
   )
   public static int field10845;
   @OriginalMember(
      owner = "client!cp",
      name = "q",
      descriptor = "I"
   )
   public static int field10847;
   @OriginalMember(
      owner = "client!cp",
      name = "Pb",
      descriptor = "I"
   )
   public static int field10849;
   @OriginalMember(
      owner = "client!cp",
      name = "ec",
      descriptor = "I"
   )
   public static int field10850;
   @OriginalMember(
      owner = "client!cp",
      name = "S",
      descriptor = "I"
   )
   public static int field10851;
   @OriginalMember(
      owner = "client!cp",
      name = "Sb",
      descriptor = "I"
   )
   public static int field10853;
   @OriginalMember(
      owner = "client!cp",
      name = "Ub",
      descriptor = "I"
   )
   public static int field10856;
   @OriginalMember(
      owner = "client!cp",
      name = "Jb",
      descriptor = "I"
   )
   public static int field10857;
   @OriginalMember(
      owner = "client!cp",
      name = "Ec",
      descriptor = "I"
   )
   public static int field10861;
   @OriginalMember(
      owner = "client!cp",
      name = "Y",
      descriptor = "I"
   )
   public static int field10863;
   @OriginalMember(
      owner = "client!cp",
      name = "Rb",
      descriptor = "I"
   )
   public static int field10865;
   @OriginalMember(
      owner = "client!cp",
      name = "Cc",
      descriptor = "I"
   )
   public static int field10866;
   @OriginalMember(
      owner = "client!cp",
      name = "Yb",
      descriptor = "I"
   )
   public static int field10867;
   @OriginalMember(
      owner = "client!cp",
      name = "Tb",
      descriptor = "I"
   )
   public static int field10868;
   @OriginalMember(
      owner = "client!cp",
      name = "cb",
      descriptor = "I"
   )
   public static int field10871;
   @OriginalMember(
      owner = "client!cp",
      name = "D",
      descriptor = "I"
   )
   public static int field10872;
   @OriginalMember(
      owner = "client!cp",
      name = "Dc",
      descriptor = "I"
   )
   public static int field10873;
   @OriginalMember(
      owner = "client!cp",
      name = "vc",
      descriptor = "I"
   )
   public static int field10874;
   @OriginalMember(
      owner = "client!cp",
      name = "rc",
      descriptor = "I"
   )
   public static int field10877;
   @OriginalMember(
      owner = "client!cp",
      name = "hb",
      descriptor = "I"
   )
   public static int field10879;
   @OriginalMember(
      owner = "client!cp",
      name = "ib",
      descriptor = "I"
   )
   public static int field10883;
   @OriginalMember(
      owner = "client!cp",
      name = "ob",
      descriptor = "I"
   )
   public static int field10886;
   @OriginalMember(
      owner = "client!cp",
      name = "eb",
      descriptor = "I"
   )
   public static int field10887;
   @OriginalMember(
      owner = "client!cp",
      name = "gb",
      descriptor = "I"
   )
   public static int field10888;
   @OriginalMember(
      owner = "client!cp",
      name = "Xb",
      descriptor = "I"
   )
   public static int field10890;
   @OriginalMember(
      owner = "client!cp",
      name = "Gb",
      descriptor = "I"
   )
   public static int field10891;
   @OriginalMember(
      owner = "client!cp",
      name = "zc",
      descriptor = "I"
   )
   public static int field10893;
   @OriginalMember(
      owner = "client!cp",
      name = "Nb",
      descriptor = "I"
   )
   public static int field10895;
   @OriginalMember(
      owner = "client!cp",
      name = "bc",
      descriptor = "I"
   )
   public static int field10905;
   @OriginalMember(
      owner = "client!cp",
      name = "T",
      descriptor = "I"
   )
   public static int field10906;
   @OriginalMember(
      owner = "client!cp",
      name = "kb",
      descriptor = "I"
   )
   public static int field10908;
   @OriginalMember(
      owner = "client!cp",
      name = "Q",
      descriptor = "I"
   )
   public static int field10910;
   @OriginalMember(
      owner = "client!cp",
      name = "Fc",
      descriptor = "I"
   )
   public static int field10911;
   @OriginalMember(
      owner = "client!cp",
      name = "Gc",
      descriptor = "I"
   )
   public static int field10913;
   @OriginalMember(
      owner = "client!cp",
      name = "r",
      descriptor = "I"
   )
   public static int field10914;
   @OriginalMember(
      owner = "client!cp",
      name = "qc",
      descriptor = "I"
   )
   public static int field10915;
   @OriginalMember(
      owner = "client!cp",
      name = "J",
      descriptor = "I"
   )
   public static int field10916;
   @OriginalMember(
      owner = "client!cp",
      name = "R",
      descriptor = "I"
   )
   public static int field10918;
   @OriginalMember(
      owner = "client!cp",
      name = "E",
      descriptor = "I"
   )
   public static int field10920;
   @OriginalMember(
      owner = "client!cp",
      name = "W",
      descriptor = "I"
   )
   public static int field10923;
   @OriginalMember(
      owner = "client!cp",
      name = "ab",
      descriptor = "I"
   )
   public static int field10924;
   @OriginalMember(
      owner = "client!cp",
      name = "hc",
      descriptor = "I"
   )
   public static int field10927;
   @OriginalMember(
      owner = "client!cp",
      name = "nc",
      descriptor = "I"
   )
   public static int field10929;
   @OriginalMember(
      owner = "client!cp",
      name = "K",
      descriptor = "I"
   )
   public static int field10930;
   @OriginalMember(
      owner = "client!cp",
      name = "qb",
      descriptor = "I"
   )
   public static int field10933;
   @OriginalMember(
      owner = "client!cp",
      name = "dc",
      descriptor = "I"
   )
   public static int field10934;
   @OriginalMember(
      owner = "client!cp",
      name = "lb",
      descriptor = "I"
   )
   public static int field10936;
   @OriginalMember(
      owner = "client!cp",
      name = "vb",
      descriptor = "I"
   )
   public static int field10937;
   @OriginalMember(
      owner = "client!cp",
      name = "bb",
      descriptor = "I"
   )
   public static int field10940;
   @OriginalMember(
      owner = "client!cp",
      name = "cc",
      descriptor = "I"
   )
   public static int field10942;
   @OriginalMember(
      owner = "client!cp",
      name = "Mb",
      descriptor = "I"
   )
   public static int field10943;
   @OriginalMember(
      owner = "client!cp",
      name = "G",
      descriptor = "I"
   )
   public static int field10946;
   @OriginalMember(
      owner = "client!cp",
      name = "I",
      descriptor = "I"
   )
   public static int field10950;
   @OriginalMember(
      owner = "client!cp",
      name = "wc",
      descriptor = "I"
   )
   public static int field10951;
   @OriginalMember(
      owner = "client!cp",
      name = "oc",
      descriptor = "Lhw;"
   )
   public static class141 field10848;
   @OriginalMember(
      owner = "client!cp",
      name = "db",
      descriptor = "Llia;"
   )
   private class501 field10896;
   @OriginalMember(
      owner = "client!cp",
      name = "Cb",
      descriptor = "Lee;"
   )
   private class703 field10922;
   @OriginalMember(
      owner = "client!cp",
      name = "Ob",
      descriptor = "Lpv;"
   )
   private class77 field10907;
   @OriginalMember(
      owner = "client!cp",
      name = "pc",
      descriptor = "S"
   )
   private short field10839;
   @OriginalMember(
      owner = "client!cp",
      name = "jc",
      descriptor = "S"
   )
   private short field10875;
   @OriginalMember(
      owner = "client!cp",
      name = "U",
      descriptor = "S"
   )
   private short field10881;
   @OriginalMember(
      owner = "client!cp",
      name = "Eb",
      descriptor = "S"
   )
   private short field10884;
   @OriginalMember(
      owner = "client!cp",
      name = "ub",
      descriptor = "S"
   )
   private short field10917;
   @OriginalMember(
      owner = "client!cp",
      name = "y",
      descriptor = "S"
   )
   private short field10919;
   @OriginalMember(
      owner = "client!cp",
      name = "pb",
      descriptor = "S"
   )
   private short field10921;
   @OriginalMember(
      owner = "client!cp",
      name = "Ib",
      descriptor = "S"
   )
   private short field10926;

   @OriginalMember(
      owner = "client!cp",
      name = "NA",
      descriptor = "()Z",
      line = 13
   )
   public final boolean method542() {
      boolean var1 = client.field4564;

      try {
         ++field10849;
         if (this.field10898 == null) {
            return false;
         } else {
            int var2 = 0;
            if (var1) {
               this.field10901[var2] <<= 4;
               this.field10854[var2] <<= 4;
               this.field10870[var2] <<= 4;
               ++var2;
            }

            while(true) {
               while(var2 < this.field10903) {
                  this.field10901[var2] <<= 4;
                  this.field10854[var2] <<= 4;
                  this.field10870[var2] <<= 4;
                  ++var2;
               }

               class572.field8271 = 0;
               class440.field6424 = 0;
               class154.field2449 = 0;
               if (!var1) {
                  return true;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10952[33] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "RA",
      descriptor = "()I",
      line = 43
   )
   public final int method531() {
      try {
         ++field10934;
         if (!this.field10858) {
            this.method5455(-32768);
         }

         return this.field10917;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[41] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(ZZ)V",
      line = 55
   )
   private final void method5451(boolean arg0, boolean arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10847;
         if (arg0) {
            this.method5452(-61, (byte)65, -37, (short)77, 29);
         }

         label80: {
            if (~this.field10832.field845.field6889.length > ~(this.field10889 * 6)) {
               this.field10832.field845 = new class543((this.field10889 - -100) * 6);
               if (!var3) {
                  break label80;
               }
            }

            this.field10832.field845.field6907 = 0;
         }

         class543 var4 = this.field10832.field845;
         int var5;
         if (this.field10832.field807) {
            var5 = 0;
            if (var3) {
               var4.method3550(this.field10852[var5], 29620);
               var4.method3550(this.field10859[var5], 29620);
               var4.method3550(this.field10897[var5], 29620);
               ++var5;
            }

            while(true) {
               while(~this.field10889 < ~var5) {
                  var4.method3550(this.field10852[var5], 29620);
                  var4.method3550(this.field10859[var5], 29620);
                  var4.method3550(this.field10897[var5], 29620);
                  ++var5;
               }

               if (!var3) {
                  if (var3) {
                     var5 = 0;
                     if (var3) {
                        var4.method3582(78, this.field10852[var5]);
                        var4.method3582(-105, this.field10859[var5]);
                        var4.method3582(111, this.field10897[var5]);
                        ++var5;
                     }
                  } else {
                     if (!var3) {
                        if (~var4.field6907 == -1) {
                           return;
                        }

                        label115: {
                           if (arg1) {
                              label123: {
                                 if (this.field10922 != null) {
                                    this.field10922.method1488(var4.field6889, 5123, -15857, var4.field6907);
                                    if (!var3) {
                                       break label123;
                                    }
                                 }

                                 this.field10922 = this.field10832.method345(25589, var4.field6907, var4.field6889, 5123, true);
                              }

                              this.field10932.field6929 = this.field10922;
                              if (!var3) {
                                 break label115;
                              }
                           }

                           this.field10932.field6929 = this.field10832.method345(25589, var4.field6907, var4.field6889, 5123, false);
                        }

                        if (!arg1) {
                           this.field10931 = true;
                           return;
                        }

                        return;
                     }

                     var4.method3582(111, this.field10897[var5]);
                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var3) {
               var4.method3582(78, this.field10852[var5]);
               var4.method3582(-105, this.field10859[var5]);
               var4.method3582(111, this.field10897[var5]);
               ++var5;
            }
         }

         while(true) {
            while(this.field10889 > var5) {
               var4.method3582(78, this.field10852[var5]);
               var4.method3582(-105, this.field10859[var5]);
               var4.method3582(111, this.field10897[var5]);
               ++var5;
            }

            if (!var3) {
               if (~var4.field6907 == -1) {
                  return;
               }

               label54: {
                  if (arg1) {
                     label51: {
                        if (this.field10922 != null) {
                           this.field10922.method1488(var4.field6889, 5123, -15857, var4.field6907);
                           if (!var3) {
                              break label51;
                           }
                        }

                        this.field10922 = this.field10832.method345(25589, var4.field6907, var4.field6889, 5123, true);
                     }

                     this.field10932.field6929 = this.field10922;
                     if (!var3) {
                        break label54;
                     }
                  }

                  this.field10932.field6929 = this.field10832.method345(25589, var4.field6907, var4.field6889, 5123, false);
               }

               if (!arg1) {
                  this.field10931 = true;
                  return;
               }

               return;
            }

            var4.method3582(111, this.field10897[var5]);
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10952[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "C",
      descriptor = "(I)V",
      line = 121
   )
   public final void method506(int arg0) {
      try {
         ++field10879;
         this.field10948 = (short)arg0;
         if (this.field10894 != null) {
            this.field10894.field9358 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10952[37] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(I[IIIIIZ)V",
      line = 136
   )
   public final void method505(int arg0, int[] arg1, int arg2, int arg3, int arg4, int arg5, boolean arg6) {
      boolean var8 = client.field4564;

      try {
         ++field10841;
         int var9 = arg1.length;
         int var10000;
         int var110;
         int var111;
         int var112;
         if (arg0 != 0) {
            if (arg0 != 1) {
               if (~arg0 != -3) {
                  if (~arg0 != -4) {
                     if (arg0 == 5) {
                        if (this.field10904 != null) {
                           int var69 = 0;
                           if (var8 || ~var69 > ~var9) {
                              do {
                                 int var70 = arg1[var69];
                                 if (this.field10904.length <= var70) {
                                    ++var69;
                                 } else {
                                    int[] var71 = this.field10904[var70];
                                    int var72 = 0;
                                    if (var8) {
                                       var10000 = var71[var72];
                                    } else if (~var71.length >= ~var72) {
                                       var10000 = var71.length;
                                       if (!var8) {
                                          if (var10000 > 0 && this.field10894 != null) {
                                             this.field10894.field9358 = null;
                                          }

                                          ++var69;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var71[var72];
                                    }

                                    while(true) {
                                       int var73 = var10000;
                                       int var74 = (this.field10855[var73] & 255) - -(arg2 * 8);
                                       if (~var74 > -1) {
                                          var74 = 0;
                                          if (var8 && ~var74 < -256) {
                                             var74 = 255;
                                          }
                                       } else if (~var74 < -256) {
                                          var74 = 255;
                                       }

                                       this.field10855[var73] = (byte)var74;
                                       ++var72;
                                       if (~var71.length >= ~var72) {
                                          var10000 = var71.length;
                                          if (!var8) {
                                             if (var10000 > 0 && this.field10894 != null) {
                                                this.field10894.field9358 = null;
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

                           if (this.field10836 != null) {
                              int var75 = 0;
                              if (var8 || var75 < this.field10900) {
                                 do {
                                    class478 var76 = this.field10836[var75];
                                    class205 var77 = this.field10935[var75];
                                    var77.field3060 = var77.field3060 & 16777215 | -(255 & this.field10855[var76.field6965]) + 255 << 24;
                                    ++var75;
                                 } while(var75 < this.field10900);
                              }
                           }
                        }

                     } else if (~arg0 == -8) {
                        if (this.field10904 != null) {
                           int var78 = 0;
                           if (var8 || ~var78 > ~var9) {
                              do {
                                 int var79 = arg1[var78];
                                 if (var79 >= this.field10904.length) {
                                    ++var78;
                                 } else {
                                    int[] var80 = this.field10904[var79];
                                    int var81 = 0;
                                    if (var8) {
                                       var10000 = var80[var81];
                                    } else if (~var81 <= ~var80.length) {
                                       var10000 = ~var80.length;
                                       if (!var8) {
                                          if (var10000 < -1 && this.field10894 != null) {
                                             this.field10894.field9358 = null;
                                          }

                                          ++var78;
                                          continue;
                                       }
                                    } else {
                                       var10000 = var80[var81];
                                    }

                                    while(true) {
                                       int var82 = var10000;
                                       int var83 = this.field10835[var82] & 65535;
                                       int var84 = (var83 & 64894) >> 10;
                                       int var85 = var83 >> 7 & 7;
                                       int var86 = 127 & var83;
                                       int var87 = arg2 + var84 & 63;
                                       int var88 = arg3 / 4 + var85;
                                       if (~var88 > -1) {
                                          var88 = 0;
                                          if (var8 && ~var88 < -8) {
                                             var88 = 7;
                                          }
                                       } else if (~var88 < -8) {
                                          var88 = 7;
                                       }

                                       int var89 = arg4 + var86;
                                       if (~var89 <= -1) {
                                          if (var89 > 127) {
                                             var89 = 127;
                                             if (var8) {
                                                var89 = 0;
                                             }
                                          }
                                       } else {
                                          var89 = 0;
                                       }

                                       this.field10835[var82] = (short)class93.method899(var89, class93.method899(var88 << 7, var87 << 10));
                                       ++var81;
                                       if (~var81 <= ~var80.length) {
                                          var10000 = ~var80.length;
                                          if (!var8) {
                                             if (var10000 < -1 && this.field10894 != null) {
                                                this.field10894.field9358 = null;
                                             }

                                             ++var78;
                                             break;
                                          }
                                       } else {
                                          var10000 = var80[var81];
                                       }
                                    }
                                 }
                              } while(~var78 > ~var9);
                           }

                           if (this.field10836 != null) {
                              int var90 = 0;
                              if (var8 || ~this.field10900 < ~var90) {
                                 do {
                                    class478 var91 = this.field10836[var90];
                                    class205 var92 = this.field10935[var90];
                                    var92.field3060 = class451.field6600[this.field10835[var91.field6965] & 65535] & 16777215 | var92.field3060 & -16777216;
                                    ++var90;
                                 } while(~this.field10900 < ~var90);
                              }
                           }
                        }

                     } else if (arg0 == 8) {
                        if (this.field10860 != null) {
                           int var93 = 0;
                           if (var8 || ~var93 > ~var9) {
                              do {
                                 int var94 = arg1[var93];
                                 if (this.field10860.length <= var94) {
                                    ++var93;
                                 } else {
                                    int[] var95 = this.field10860[var94];
                                    int var96 = 0;
                                    if (!var8 && ~var96 <= ~var95.length) {
                                       ++var93;
                                    } else {
                                       do {
                                          class205 var97 = this.field10935[var95[var96]];
                                          var97.field3051 += arg3;
                                          var97.field3056 += arg2;
                                          ++var96;
                                       } while(~var96 > ~var95.length);

                                       ++var93;
                                    }
                                 }
                              } while(~var93 > ~var9);
                           }
                        }

                     } else if (~arg0 == -11) {
                        if (this.field10860 != null) {
                           int var98 = 0;
                           if (var8 || ~var98 > ~var9) {
                              do {
                                 int var99 = arg1[var98];
                                 if (~this.field10860.length >= ~var99) {
                                    ++var98;
                                 } else {
                                    int[] var100 = this.field10860[var99];
                                    int var101 = 0;
                                    if (!var8 && var101 >= var100.length) {
                                       ++var98;
                                    } else {
                                       do {
                                          class205 var102 = this.field10935[var100[var101]];
                                          var102.field3054 = var102.field3054 * arg3 >> 7;
                                          var102.field3059 = var102.field3059 * arg2 >> 7;
                                          ++var101;
                                       } while(var101 < var100.length);

                                       ++var98;
                                    }
                                 }
                              } while(~var98 > ~var9);
                           }
                        }

                     } else if (arg0 == 9) {
                        if (this.field10860 != null) {
                           int var103 = 0;
                           if (var8 || var9 > var103) {
                              do {
                                 int var104 = arg1[var103];
                                 if (~var104 <= ~this.field10860.length) {
                                    ++var103;
                                 } else {
                                    int[] var105 = this.field10860[var104];
                                    int var106 = 0;
                                    if (!var8 && ~var106 <= ~var105.length) {
                                       ++var103;
                                    } else {
                                       do {
                                          class205 var107 = this.field10935[var105[var106]];
                                          var107.field3053 = 16383 & var107.field3053 + arg2;
                                          ++var106;
                                       } while(~var106 > ~var105.length);

                                       ++var103;
                                    }
                                 }
                              } while(var9 > var103);
                           }
                        }

                     }
                  } else {
                     int var64 = 0;
                     if (var8 || ~var9 < ~var64) {
                        do {
                           int var65 = arg1[var64];
                           if (~this.field10898.length >= ~var65) {
                              ++var64;
                           } else {
                              int[] var66 = this.field10898[var65];
                              int var67 = 0;
                              if (!var8 && ~var67 <= ~var66.length) {
                                 ++var64;
                              } else {
                                 do {
                                    int var68 = var66[var67];
                                    this.field10901[var68] -= class572.field8271;
                                    this.field10854[var68] -= class440.field6424;
                                    this.field10870[var68] -= class154.field2449;
                                    this.field10901[var68] = this.field10901[var68] * arg2 >> 7;
                                    this.field10854[var68] = this.field10854[var68] * arg3 >> 7;
                                    this.field10870[var68] = this.field10870[var68] * arg4 >> 7;
                                    this.field10901[var68] += class572.field8271;
                                    this.field10854[var68] += class440.field6424;
                                    this.field10870[var68] += class154.field2449;
                                    ++var67;
                                 } while(~var67 > ~var66.length);

                                 ++var64;
                              }
                           }
                        } while(~var9 < ~var64);

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
                           if (var8 || var46 < var9) {
                              do {
                                 var47 = arg1[var46];
                                 if (~this.field10898.length >= ~var47) {
                                    ++var46;
                                 } else {
                                    var48 = this.field10898[var47];
                                    var49 = 0;
                                    if (!var8 && var48.length <= var49) {
                                       ++var46;
                                    } else {
                                       label638:
                                       do {
                                          var50 = var48[var49];
                                          var51 = this.field10869[var50];
                                          var52 = this.field10869[var50 - -1];
                                          var53 = var51;
                                          if (!var8 && var52 <= var51) {
                                             ++var49;
                                          } else {
                                             do {
                                                var54 = this.field10833[var53] + -1;
                                                if (~var54 == 0) {
                                                   ++var49;
                                                   continue label638;
                                                }

                                                if (~arg4 != -1) {
                                                   var55 = class593.field8539[arg4];
                                                   var56 = class593.field8548[arg4];
                                                   var57 = this.field10902[var54] * var55 - -(this.field10846[var54] * var56) + 16383 >> 14;
                                                   this.field10902[var54] = (short)(this.field10902[var54] * var56 + -(this.field10846[var54] * var55) + 16383 >> 14);
                                                   this.field10846[var54] = (short)var57;
                                                }

                                                if (arg2 != 0) {
                                                   var58 = class593.field8539[arg2];
                                                   var59 = class593.field8548[arg2];
                                                   var60 = this.field10902[var54] * var59 + 16383 + -(this.field10892[var54] * var58) >> 14;
                                                   this.field10892[var54] = (short)(this.field10902[var54] * var58 + this.field10892[var54] * var59 - -16383 >> 14);
                                                   this.field10902[var54] = (short)var60;
                                                }

                                                if (arg3 != 0) {
                                                   var61 = class593.field8539[arg3];
                                                   var62 = class593.field8548[arg3];
                                                   var63 = this.field10846[var54] * var62 + this.field10892[var54] * var61 + 16383 >> 14;
                                                   this.field10892[var54] = (short)(this.field10892[var54] * var62 + 16383 + -(this.field10846[var54] * var61) >> 14);
                                                   this.field10846[var54] = (short)var63;
                                                }

                                                ++var53;
                                             } while(var52 > var53);

                                             ++var49;
                                          }
                                       } while(var48.length > var49);

                                       ++var46;
                                    }
                                 }
                              } while(var46 < var9);
                           }

                           if (this.field10864 == null && this.field10894 != null) {
                              this.field10894.field9358 = null;
                           }

                           if (this.field10864 != null) {
                              this.field10864.field9358 = null;
                           }
                        }

                        return;
                     }
                  } else {
                     var10000 = arg1[var21];
                  }

                  while(true) {
                     int var22 = var10000;
                     if (var22 >= this.field10898.length) {
                        ++var21;
                     } else {
                        label839: {
                           int[] var23 = this.field10898[var22];
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
                           if (~(1 & arg5) == -1) {
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
                                 this.field10901[var25] -= class572.field8271;
                                 this.field10854[var25] -= class440.field6424;
                                 this.field10870[var25] -= class154.field2449;
                                 if (~arg4 != -1) {
                                    var26 = class593.field8539[arg4];
                                    var27 = class593.field8548[arg4];
                                    var28 = this.field10854[var25] * var26 - -(this.field10901[var25] * var27) - -16383 >> 14;
                                    this.field10854[var25] = this.field10854[var25] * var27 + -(this.field10901[var25] * var26) + 16383 >> 14;
                                    this.field10901[var25] = var28;
                                 }

                                 if (arg2 != 0) {
                                    var29 = class593.field8539[arg2];
                                    var30 = class593.field8548[arg2];
                                    var31 = this.field10854[var25] * var30 + 16383 + -(this.field10870[var25] * var29) >> 14;
                                    this.field10870[var25] = this.field10870[var25] * var30 + this.field10854[var25] * var29 + 16383 >> 14;
                                    this.field10854[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class593.field8539[arg3];
                                    var33 = class593.field8548[arg3];
                                    var34 = this.field10870[var25] * var32 + this.field10901[var25] * var33 + 16383 >> 14;
                                    this.field10870[var25] = this.field10870[var25] * var33 - this.field10901[var25] * var32 + 16383 >> 14;
                                    this.field10901[var25] = var34;
                                 }

                                 this.field10901[var25] += class572.field8271;
                                 this.field10854[var25] += class440.field6424;
                                 this.field10870[var25] += class154.field2449;
                                 ++var24;
                              }

                              while(var23.length > var24) {
                                 var25 = var23[var24];
                                 this.field10901[var25] -= class572.field8271;
                                 this.field10854[var25] -= class440.field6424;
                                 this.field10870[var25] -= class154.field2449;
                                 if (~arg4 != -1) {
                                    var26 = class593.field8539[arg4];
                                    var27 = class593.field8548[arg4];
                                    var28 = this.field10854[var25] * var26 - -(this.field10901[var25] * var27) - -16383 >> 14;
                                    this.field10854[var25] = this.field10854[var25] * var27 + -(this.field10901[var25] * var26) + 16383 >> 14;
                                    this.field10901[var25] = var28;
                                 }

                                 if (arg2 != 0) {
                                    var29 = class593.field8539[arg2];
                                    var30 = class593.field8548[arg2];
                                    var31 = this.field10854[var25] * var30 + 16383 + -(this.field10870[var25] * var29) >> 14;
                                    this.field10870[var25] = this.field10870[var25] * var30 + this.field10854[var25] * var29 + 16383 >> 14;
                                    this.field10854[var25] = var31;
                                 }

                                 if (arg3 != 0) {
                                    var32 = class593.field8539[arg3];
                                    var33 = class593.field8548[arg3];
                                    var34 = this.field10870[var25] * var32 + this.field10901[var25] * var33 + 16383 >> 14;
                                    this.field10870[var25] = this.field10870[var25] * var33 - this.field10901[var25] * var32 + 16383 >> 14;
                                    this.field10901[var25] = var34;
                                 }

                                 this.field10901[var25] += class572.field8271;
                                 this.field10854[var25] += class440.field6424;
                                 this.field10870[var25] += class154.field2449;
                                 ++var24;
                              }

                              if (!var8) {
                                 ++var21;
                                 break label839;
                              }

                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field10901[var36] -= class572.field8271;
                                 this.field10854[var36] -= class440.field6424;
                                 this.field10870[var36] -= class154.field2449;
                                 if (arg2 != 0) {
                                    var37 = class593.field8539[arg2];
                                    var38 = class593.field8548[arg2];
                                    var39 = this.field10854[var36] * var38 + -(this.field10870[var36] * var37) + 16383 >> 14;
                                    this.field10870[var36] = this.field10870[var36] * var38 + this.field10854[var36] * var37 + 16383 >> 14;
                                    this.field10854[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class593.field8539[arg4];
                                    var41 = class593.field8548[arg4];
                                    var42 = this.field10854[var36] * var40 + this.field10901[var36] * var41 + 16383 >> 14;
                                    this.field10854[var36] = this.field10854[var36] * var41 + -(this.field10901[var36] * var40) + 16383 >> 14;
                                    this.field10901[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class593.field8539[arg3];
                                    var44 = class593.field8548[arg3];
                                    var45 = this.field10870[var36] * var43 - -(this.field10901[var36] * var44) + 16383 >> 14;
                                    this.field10870[var36] = this.field10870[var36] * var44 + (-(this.field10901[var36] * var43) - -16383) >> 14;
                                    this.field10901[var36] = var45;
                                 }

                                 this.field10901[var36] += class572.field8271;
                                 this.field10854[var36] += class440.field6424;
                                 this.field10870[var36] += class154.field2449;
                                 ++var35;
                              }
                           } else {
                              var35 = 0;
                              if (var8) {
                                 var36 = var23[var35];
                                 this.field10901[var36] -= class572.field8271;
                                 this.field10854[var36] -= class440.field6424;
                                 this.field10870[var36] -= class154.field2449;
                                 if (arg2 != 0) {
                                    var37 = class593.field8539[arg2];
                                    var38 = class593.field8548[arg2];
                                    var39 = this.field10854[var36] * var38 + -(this.field10870[var36] * var37) + 16383 >> 14;
                                    this.field10870[var36] = this.field10870[var36] * var38 + this.field10854[var36] * var37 + 16383 >> 14;
                                    this.field10854[var36] = var39;
                                 }

                                 if (~arg4 != -1) {
                                    var40 = class593.field8539[arg4];
                                    var41 = class593.field8548[arg4];
                                    var42 = this.field10854[var36] * var40 + this.field10901[var36] * var41 + 16383 >> 14;
                                    this.field10854[var36] = this.field10854[var36] * var41 + -(this.field10901[var36] * var40) + 16383 >> 14;
                                    this.field10901[var36] = var42;
                                 }

                                 if (arg3 != 0) {
                                    var43 = class593.field8539[arg3];
                                    var44 = class593.field8548[arg3];
                                    var45 = this.field10870[var36] * var43 - -(this.field10901[var36] * var44) + 16383 >> 14;
                                    this.field10870[var36] = this.field10870[var36] * var44 + (-(this.field10901[var36] * var43) - -16383) >> 14;
                                    this.field10901[var36] = var45;
                                 }

                                 this.field10901[var36] += class572.field8271;
                                 this.field10854[var36] += class440.field6424;
                                 this.field10870[var36] += class154.field2449;
                                 ++var35;
                              }
                           }

                           while(var23.length > var35) {
                              var36 = var23[var35];
                              this.field10901[var36] -= class572.field8271;
                              this.field10854[var36] -= class440.field6424;
                              this.field10870[var36] -= class154.field2449;
                              if (arg2 != 0) {
                                 var37 = class593.field8539[arg2];
                                 var38 = class593.field8548[arg2];
                                 var39 = this.field10854[var36] * var38 + -(this.field10870[var36] * var37) + 16383 >> 14;
                                 this.field10870[var36] = this.field10870[var36] * var38 + this.field10854[var36] * var37 + 16383 >> 14;
                                 this.field10854[var36] = var39;
                              }

                              if (~arg4 != -1) {
                                 var40 = class593.field8539[arg4];
                                 var41 = class593.field8548[arg4];
                                 var42 = this.field10854[var36] * var40 + this.field10901[var36] * var41 + 16383 >> 14;
                                 this.field10854[var36] = this.field10854[var36] * var41 + -(this.field10901[var36] * var40) + 16383 >> 14;
                                 this.field10901[var36] = var42;
                              }

                              if (arg3 != 0) {
                                 var43 = class593.field8539[arg3];
                                 var44 = class593.field8548[arg3];
                                 var45 = this.field10870[var36] * var43 - -(this.field10901[var36] * var44) + 16383 >> 14;
                                 this.field10870[var36] = this.field10870[var36] * var44 + (-(this.field10901[var36] * var43) - -16383) >> 14;
                                 this.field10901[var36] = var45;
                              }

                              this.field10901[var36] += class572.field8271;
                              this.field10854[var36] += class440.field6424;
                              this.field10870[var36] += class154.field2449;
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
                              if (var8 || var46 < var9) {
                                 do {
                                    var47 = arg1[var46];
                                    if (~this.field10898.length >= ~var47) {
                                       ++var46;
                                    } else {
                                       var48 = this.field10898[var47];
                                       var49 = 0;
                                       if (!var8 && var48.length <= var49) {
                                          ++var46;
                                       } else {
                                          label266:
                                          do {
                                             var50 = var48[var49];
                                             var51 = this.field10869[var50];
                                             var52 = this.field10869[var50 - -1];
                                             var53 = var51;
                                             if (!var8 && var52 <= var51) {
                                                ++var49;
                                             } else {
                                                do {
                                                   var54 = this.field10833[var53] + -1;
                                                   if (~var54 == 0) {
                                                      ++var49;
                                                      continue label266;
                                                   }

                                                   if (~arg4 != -1) {
                                                      var55 = class593.field8539[arg4];
                                                      var56 = class593.field8548[arg4];
                                                      var57 = this.field10902[var54] * var55 - -(this.field10846[var54] * var56) + 16383 >> 14;
                                                      this.field10902[var54] = (short)(this.field10902[var54] * var56 + -(this.field10846[var54] * var55) + 16383 >> 14);
                                                      this.field10846[var54] = (short)var57;
                                                   }

                                                   if (arg2 != 0) {
                                                      var58 = class593.field8539[arg2];
                                                      var59 = class593.field8548[arg2];
                                                      var60 = this.field10902[var54] * var59 + 16383 + -(this.field10892[var54] * var58) >> 14;
                                                      this.field10892[var54] = (short)(this.field10902[var54] * var58 + this.field10892[var54] * var59 - -16383 >> 14);
                                                      this.field10902[var54] = (short)var60;
                                                   }

                                                   if (arg3 != 0) {
                                                      var61 = class593.field8539[arg3];
                                                      var62 = class593.field8548[arg3];
                                                      var63 = this.field10846[var54] * var62 + this.field10892[var54] * var61 + 16383 >> 14;
                                                      this.field10892[var54] = (short)(this.field10892[var54] * var62 + 16383 + -(this.field10846[var54] * var61) >> 14);
                                                      this.field10846[var54] = (short)var63;
                                                   }

                                                   ++var53;
                                                } while(var52 > var53);

                                                ++var49;
                                             }
                                          } while(var48.length > var49);

                                          ++var46;
                                       }
                                    }
                                 } while(var46 < var9);
                              }

                              if (this.field10864 == null && this.field10894 != null) {
                                 this.field10894.field9358 = null;
                              }

                              if (this.field10864 != null) {
                                 this.field10864.field9358 = null;
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
               var110 = arg2 << 4;
               var111 = arg3 << 4;
               var112 = arg4 << 4;
               int var16 = 0;
               if (var8 || var9 > var16) {
                  do {
                     int var17 = arg1[var16];
                     if (this.field10898.length <= var17) {
                        ++var16;
                     } else {
                        int[] var18 = this.field10898[var17];
                        int var19 = 0;
                        if (!var8 && var18.length <= var19) {
                           ++var16;
                        } else {
                           do {
                              int var20 = var18[var19];
                              this.field10901[var20] += var110;
                              this.field10854[var20] += var111;
                              this.field10870[var20] += var112;
                              ++var19;
                           } while(var18.length > var19);

                           ++var16;
                        }
                     }
                  } while(var9 > var16);

               }
            }
         } else {
            var110 = arg2 << 4;
            var111 = arg3 << 4;
            var112 = arg4 << 4;
            class572.field8271 = 0;
            int var10 = 0;
            class154.field2449 = 0;
            class440.field6424 = 0;
            int var11 = 0;
            if (var8) {
               var10000 = arg1[var11];
            } else if (~var11 <= ~var9) {
               var10000 = var10;
               if (!var8) {
                  if (var10 > 0) {
                     class572.field8271 = class572.field8271 / var10 + var110;
                     class440.field6424 = class440.field6424 / var10 + var111;
                     class154.field2449 = class154.field2449 / var10 - -var112;
                     return;
                  }

                  class154.field2449 = var112;
                  class572.field8271 = var110;
                  class440.field6424 = var111;
                  return;
               }
            } else {
               var10000 = arg1[var11];
            }

            while(true) {
               int var12 = var10000;
               if (~var12 <= ~this.field10898.length) {
                  ++var11;
               } else {
                  int[] var13 = this.field10898[var12];
                  int var14 = 0;
                  int var15;
                  if (var8) {
                     var15 = var13[var14];
                     class572.field8271 += this.field10901[var15];
                     class440.field6424 += this.field10854[var15];
                     ++var10;
                     class154.field2449 += this.field10870[var15];
                     ++var14;
                  }

                  while(~var13.length < ~var14) {
                     var15 = var13[var14];
                     class572.field8271 += this.field10901[var15];
                     class440.field6424 += this.field10854[var15];
                     ++var10;
                     class154.field2449 += this.field10870[var15];
                     ++var14;
                  }

                  ++var11;
               }

               if (~var11 <= ~var9) {
                  var10000 = var10;
                  if (!var8) {
                     if (var10 > 0) {
                        class572.field8271 = class572.field8271 / var10 + var110;
                        class440.field6424 = class440.field6424 / var10 + var111;
                        class154.field2449 = class154.field2449 / var10 - -var112;
                        return;
                     }

                     class154.field2449 = var112;
                     class572.field8271 = var110;
                     class440.field6424 = var111;
                     return;
                  }
               } else {
                  var10000 = arg1[var11];
               }
            }
         }
      } catch (RuntimeException var109) {
         throw class608.method4462(var109, field10952[39] + arg0 + ',' + (arg1 != null ? field10952[11] : field10952[9]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "p",
      descriptor = "(IILs;Ls;III)V",
      line = 788
   )
   public final void method520(int arg0, int arg1, class293 arg2, class293 arg3, int arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         if (!this.field10858) {
            this.method5455(-32768);
         }

         ++field10842;
         int var9 = this.field10875 + arg4;
         int var10 = this.field10917 + arg4;
         int var11 = this.field10884 + arg6;
         int var12 = this.field10919 + arg6;
         if (~arg0 != -2 && ~arg0 != -3 && ~arg0 != -4 && arg0 != 5 || var9 >= 0 && arg2.field4083 + var10 >> arg2.field4081 < arg2.field4080 && ~var11 <= -1 && arg2.field4083 + var12 >> arg2.field4081 < arg2.field4077) {
            if (arg0 != 4 && arg0 != 5) {
               int var13 = var9 >> arg2.field4081;
               int var14 = -1 - (-arg2.field4083 - var10) >> arg2.field4081;
               int var15 = var11 >> arg2.field4081;
               int var16 = var12 - -arg2.field4083 - 1 >> arg2.field4081;
               if (arg5 == arg2.method2289(var13, var15, (byte)114) && ~arg5 == ~arg2.method2289(var14, var15, (byte)126) && arg5 == arg2.method2289(var13, var16, (byte)126) && ~arg2.method2289(var14, var16, (byte)120) == ~arg5) {
                  return;
               }
            } else {
               if (arg3 == null) {
                  return;
               }

               if (var9 < 0 || ~(arg3.field4083 + var10 >> arg3.field4081) <= ~arg3.field4080 || var11 < 0 || arg3.field4083 + var12 >> arg3.field4081 >= arg3.field4077) {
                  return;
               }
            }

            label233: {
               if (arg0 == 1) {
                  int var17 = 0;
                  if (var8) {
                     this.field10854[var17] = this.field10854[var17] + arg2.method2287(-100, this.field10870[var17] + arg6, this.field10901[var17] - -arg4) + -arg5;
                     ++var17;
                  }

                  while(true) {
                     while(~this.field10862 < ~var17) {
                        this.field10854[var17] = this.field10854[var17] + arg2.method2287(-100, this.field10870[var17] + arg6, this.field10901[var17] - -arg4) + -arg5;
                        ++var17;
                     }

                     if (!var8) {
                        if (!var8) {
                           break label233;
                        }
                        break;
                     }

                     ++var17;
                  }
               }

               if (arg0 == 2) {
                  short var18 = this.field10839;
                  if (~var18 == -1) {
                     return;
                  }

                  int var19 = 0;
                  if (var8 || this.field10862 > var19) {
                     do {
                        int var20 = (this.field10854[var19] << 16) / var18;
                        if (~arg1 < ~var20) {
                           this.field10854[var19] += (-arg5 + arg2.method2287(56, this.field10870[var19] + arg6, this.field10901[var19] + arg4)) * (-var20 + arg1) / arg1;
                        }

                        ++var19;
                     } while(this.field10862 > var19);
                  }

                  if (!var8) {
                     break label233;
                  }
               }

               if (arg0 == 3) {
                  int var21 = (255 & arg1) * 4;
                  int var22 = (arg1 >> 8 & 255) * 4;
                  int var23 = (255 & arg1 >> 16) << 6;
                  int var24 = arg1 >> 24 << 6 & 16320;
                  if (~(-(var21 >> 1) + arg4) > -1 || arg2.field4080 << arg2.field4081 <= arg4 - -(var21 >> 1) - -arg2.field4083 || arg6 - (var22 >> 1) < 0 || ~((var22 >> 1) + arg2.field4083 + arg6) <= ~(arg2.field4077 << arg2.field4081)) {
                     return;
                  }

                  this.method3734(var24, var23, (byte)-74, arg4, var21, var22, arg5, arg6, arg2);
                  if (!var8) {
                     break label233;
                  }
               }

               if (arg0 != 4) {
                  if (arg0 != 5) {
                     break label233;
                  }

                  int var25 = -this.field10839 + this.field10881;
                  int var26 = 0;
                  if (var8 || this.field10862 > var26) {
                     do {
                        int var27 = this.field10901[var26] + arg4;
                        int var28 = this.field10870[var26] + arg6;
                        int var29 = arg2.method2287(86, var28, var27);
                        int var30 = arg3.method2287(47, var28, var27);
                        int var31 = -var30 + var29 + -arg1;
                        this.field10854[var26] = ((this.field10854[var26] << 8) / var25 * var31 >> 8) + -arg5 + var29;
                        ++var26;
                     } while(this.field10862 > var26);
                  }

                  if (!var8) {
                     break label233;
                  }
               }

               int var32 = -this.field10839 + this.field10881;
               int var33 = 0;
               if (var8 || this.field10862 > var33) {
                  do {
                     this.field10854[var33] = this.field10854[var33] + -arg5 + arg3.method2287(-80, this.field10870[var33] + arg6, this.field10901[var33] - -arg4) - -var32;
                     ++var33;
                  } while(this.field10862 > var33);
               }
            }

            this.field10858 = false;
            if (this.field10844 != null) {
               this.field10844.field9358 = null;
            }
         }
      } catch (RuntimeException var35) {
         throw class608.method4462(var35, field10952[28] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10952[11] : field10952[9]) + ',' + (arg3 != null ? field10952[11] : field10952[9]) + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IBISI)I",
      line = 954
   )
   private final int method5452(int arg0, byte arg1, int arg2, short arg3, int arg4) {
      boolean var6 = client.field4564;

      try {
         if (arg4 != -12) {
            this.method515();
         }

         ++field10910;
         int var7 = class451.field6600[class5.method35(arg2, arg4 + -107, arg0)];
         if (arg3 != -1) {
            class693 var8 = this.field10832.field1192.method1456(-8988, arg3 & 65535);
            int var9 = var8.field10154 & 255;
            if (var9 != 0) {
               label62: {
                  int var10;
                  label50: {
                     if (~arg2 <= -1) {
                        if (~arg2 < -128) {
                           var10 = 16777215;
                           if (!var6) {
                              break label50;
                           }
                        }

                        var10 = arg2 * 131586;
                        if (!var6) {
                           break label50;
                        }
                     }

                     var10 = 0;
                  }

                  if (var9 != 256) {
                     int var12 = 256 - var9;
                     var7 = (16711680 & (var7 & 65280) * var12 + (65280 & var10) * var9) + ((16711935 & var7) * var12 + (var10 & 16711935) * var9 & -16711936) >> 8;
                     if (!var6) {
                        break label62;
                     }
                  }

                  var7 = var10;
               }
            }

            int var13 = var8.field10170 & 255;
            if (var13 != 0) {
               var13 += 256;
               int var14 = ((16711680 & var7) >> 16) * var13;
               if (var14 > 65535) {
                  var14 = 65535;
               }

               int var15 = ((var7 & 65280) >> 8) * var13;
               if (~var15 < -65536) {
                  var15 = 65535;
               }

               int var16 = (255 & var7) * var13;
               if (~var16 < -65536) {
                  var16 = 65535;
               }

               var7 = ((-1644101888 & var14) << 8) - (-(var16 >> 8) + -(var15 & 65280));
            }
         }

         return (var7 << 8) + -(arg1 & 255) + 255;
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field10952[61] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "na",
      descriptor = "()I",
      line = 1026
   )
   public final int method553() {
      try {
         if (!this.field10858) {
            this.method5455(-32768);
         }

         ++field10923;
         return this.field10921;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[8] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "O",
      descriptor = "(III)V",
      line = 1039
   )
   public final void method512(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         int var5 = 0;
         if (var4) {
            if (~arg0 != -129) {
               this.field10901[var5] = this.field10901[var5] * arg0 >> 7;
            }

            if (~arg1 != -129) {
               this.field10854[var5] = this.field10854[var5] * arg1 >> 7;
            }

            if (~arg2 != -129) {
               this.field10870[var5] = this.field10870[var5] * arg2 >> 7;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field10862) {
               if (~arg0 != -129) {
                  this.field10901[var5] = this.field10901[var5] * arg0 >> 7;
               }

               if (~arg1 != -129) {
                  this.field10854[var5] = this.field10854[var5] * arg1 >> 7;
               }

               if (~arg2 != -129) {
                  this.field10870[var5] = this.field10870[var5] * arg2 >> 7;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            ++field10856;
            if (!var4) {
               if (this.field10844 != null) {
                  this.field10844.field9358 = null;
               }

               this.field10858 = false;
               return;
            }

            this.field10870[var5] = this.field10870[var5] * arg2 >> 7;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10952[52] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "s",
      descriptor = "(I)V",
      line = 1070
   )
   public final void method530(int arg0) {
      try {
         this.field10899 = arg0;
         ++field10924;
         if (this.field10896 != null && (65536 & this.field10899) == 0) {
            this.field10878 = this.field10896.field7299;
            this.field10902 = this.field10896.field7301;
            this.field10892 = this.field10896.field7300;
            this.field10846 = this.field10896.field7297;
            this.field10896 = null;
         }

         this.field10931 = true;
         this.method5458((byte)103);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10952[23] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "()[Llu;",
      line = 1097
   )
   public final class740[] method539() {
      try {
         ++field10863;
         return this.field10941;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[5] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(ZI)V",
      line = 1105
   )
   private final void method5453(boolean arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10883;
         boolean var4 = this.field10894 != null && this.field10894.field9358 == null;
         boolean var5 = this.field10864 != null && this.field10864.field9358 == null;
         boolean var6 = this.field10844 != null && this.field10844.field9358 == null;
         boolean var7 = this.field10925 != null && this.field10925.field9358 == null;
         if (arg0) {
            var4 &= (2 & this.field10945) != 0;
            var5 &= (4 & this.field10945) != 0;
            var6 &= (1 & this.field10945) != 0;
            var7 &= ~(this.field10945 & 8) != -1;
         }

         byte var8 = 0;
         byte var9 = 0;
         byte var10 = 0;
         byte var11 = 0;
         byte var12 = 0;
         if (var6) {
            var9 = var8;
            var8 = (byte)(var8 + 12);
         }

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
            label491: {
               if (this.field10832.field845.field6889.length >= this.field10928 * var8) {
                  this.field10832.field845.field6907 = 0;
                  if (!var3) {
                     break label491;
                  }
               }

               this.field10832.field845 = new class543((this.field10928 + 100) * var8);
            }

            class543 var13 = this.field10832.field845;
            if (var6) {
               label526: {
                  if (!this.field10832.field807) {
                     int var14 = 0;
                     if (var3 || ~var14 > ~this.field10862) {
                        label481:
                        do {
                           int var15 = Stream.floatToRawIntBits((float)this.field10901[var14]);
                           int var16 = Stream.floatToRawIntBits((float)this.field10854[var14]);
                           int var17 = Stream.floatToRawIntBits((float)this.field10870[var14]);
                           int var18 = this.field10869[var14];
                           int var19 = this.field10869[var14 - -1];
                           int var20 = var18;
                           if (!var3 && var19 <= var18) {
                              ++var14;
                           } else {
                              do {
                                 int var21 = this.field10833[var20] + -1;
                                 if (var21 == -1) {
                                    ++var14;
                                    continue label481;
                                 }

                                 var13.field6907 = var8 * var21;
                                 var13.method3561((byte)-67, var15);
                                 var13.method3561((byte)-67, var16);
                                 var13.method3561((byte)-67, var17);
                                 ++var20;
                              } while(var19 > var20);

                              ++var14;
                           }
                        } while(~var14 > ~this.field10862);
                     }

                     if (!var3) {
                        break label526;
                     }
                  }

                  int var22 = 0;
                  if (var3 || ~var22 > ~this.field10862) {
                     label455:
                     do {
                        int var23 = Stream.floatToRawIntBits((float)this.field10901[var22]);
                        int var24 = Stream.floatToRawIntBits((float)this.field10854[var22]);
                        int var25 = Stream.floatToRawIntBits((float)this.field10870[var22]);
                        int var26 = this.field10869[var22];
                        int var27 = this.field10869[var22 + 1];
                        int var28 = var26;
                        if (!var3 && var26 >= var27) {
                           ++var22;
                        } else {
                           do {
                              int var29 = this.field10833[var28] + -1;
                              if (var29 == -1) {
                                 ++var22;
                                 continue label455;
                              }

                              var13.field6907 = var8 * var29;
                              var13.method3540(var23, 898075920);
                              var13.method3540(var24, arg1 + 898083459);
                              var13.method3540(var25, arg1 ^ -898076771);
                              ++var28;
                           } while(var28 < var27);

                           ++var22;
                        }
                     } while(~var22 > ~this.field10862);
                  }
               }
            }

            if (var4) {
               label529: {
                  if (this.field10864 == null) {
                     short[] var30;
                     short[] var31;
                     byte[] var32;
                     short[] var33;
                     label427: {
                        if (this.field10896 == null) {
                           var30 = this.field10902;
                           var31 = this.field10892;
                           var32 = this.field10878;
                           var33 = this.field10846;
                           if (!var3) {
                              break label427;
                           }
                        }

                        var32 = this.field10896.field7299;
                        var30 = this.field10896.field7301;
                        var33 = this.field10896.field7297;
                        var31 = this.field10896.field7300;
                     }

                     float var34 = this.field10832.field830[0];
                     float var35 = this.field10832.field830[1];
                     float var36 = this.field10832.field830[2];
                     float var37 = this.field10832.field862;
                     float var38 = this.field10832.field826 * 768.0F / (float)this.field10949;
                     float var39 = this.field10832.field773 * 768.0F / (float)this.field10949;
                     int var40 = 0;
                     if (var3 || ~this.field10939 < ~var40) {
                        do {
                           float var42;
                           short var43;
                           float var44;
                           float var45;
                           float var47;
                           label407: {
                              int var41 = this.method5452(this.field10835[var40], this.field10855[var40], this.field10948, this.field10947[var40], -12);
                              var42 = (float)(var41 >>> 24) * this.field10832.field858;
                              var43 = this.field10852[var40];
                              var44 = (float)(255 & var41 >> 16) * this.field10832.field780;
                              var45 = (float)(255 & var41 >> 8) * this.field10832.field856;
                              short var46 = (short)var32[var43];
                              if (~var46 == -1) {
                                 var47 = ((float)var31[var43] * var36 + (float)var30[var43] * var35 + (float)var33[var43] * var34) * 0.0026041667F;
                                 if (!var3) {
                                    break label407;
                                 }
                              }

                              var47 = ((float)var31[var43] * var36 + (float)var30[var43] * var35 + (float)var33[var43] * var34) / (float)(var46 * 256);
                           }

                           float var48 = (!(var47 < 0.0F) ? var38 : var39) * var47 + var37;
                           int var49 = (int)(var42 * var48);
                           if (var49 >= 0) {
                              if (~var49 < -256) {
                                 var49 = 255;
                                 if (var3) {
                                    var49 = 0;
                                 }
                              }
                           } else {
                              var49 = 0;
                           }

                           int var50 = (int)(var44 * var48);
                           int var51 = (int)(var45 * var48);
                           if (~var50 > -1) {
                              var50 = 0;
                              if (var3 && ~var50 < -256) {
                                 var50 = 255;
                              }
                           } else if (~var50 < -256) {
                              var50 = 255;
                           }

                           var13.field6907 = var10 - -(var8 * var43);
                           if (var51 >= 0) {
                              if (var51 > 255) {
                                 var51 = 255;
                                 if (var3) {
                                    var51 = 0;
                                 }
                              }
                           } else {
                              var51 = 0;
                           }

                           short var52;
                           float var54;
                           label412: {
                              var13.method3571(arg1 ^ -7566, var49);
                              var13.method3571(255, var50);
                              var13.method3571(arg1 ^ -7566, var51);
                              var13.method3571(255, -(this.field10855[var40] & 255) + 255);
                              var52 = this.field10859[var40];
                              short var53 = (short)var32[var52];
                              if (~var53 != -1) {
                                 var54 = ((float)var31[var52] * var36 + (float)var30[var52] * var35 + (float)var33[var52] * var34) / (float)(var53 * 256);
                                 if (!var3) {
                                    break label412;
                                 }
                              }

                              var54 = ((float)var31[var52] * var36 + (float)var30[var52] * var35 + (float)var33[var52] * var34) * 0.0026041667F;
                           }

                           float var55 = var54 * (var54 < 0.0F ? var39 : var38) + var37;
                           int var56 = (int)(var42 * var55);
                           if (~var56 <= -1) {
                              if (~var56 < -256) {
                                 var56 = 255;
                                 if (var3) {
                                    var56 = 0;
                                 }
                              }
                           } else {
                              var56 = 0;
                           }

                           int var57 = (int)(var44 * var55);
                           if (~var57 > -1) {
                              var57 = 0;
                              if (var3 && var57 > 255) {
                                 var57 = 255;
                              }
                           } else if (var57 > 255) {
                              var57 = 255;
                           }

                           int var58 = (int)(var45 * var55);
                           if (~var58 > -1) {
                              var58 = 0;
                              if (var3 && ~var58 < -256) {
                                 var58 = 255;
                              }
                           } else if (~var58 < -256) {
                              var58 = 255;
                           }

                           short var59;
                           float var61;
                           label418: {
                              var13.field6907 = var8 * var52 + var10;
                              var13.method3571(255, var56);
                              var13.method3571(255, var57);
                              var13.method3571(255, var58);
                              var13.method3571(255, -(this.field10855[var40] & 255) + 255);
                              var59 = this.field10897[var40];
                              short var60 = (short)var32[var59];
                              if (~var60 == -1) {
                                 var61 = ((float)var31[var59] * var36 + (float)var30[var59] * var35 + (float)var33[var59] * var34) * 0.0026041667F;
                                 if (!var3) {
                                    break label418;
                                 }
                              }

                              var61 = ((float)var31[var59] * var36 + (float)var30[var59] * var35 + (float)var33[var59] * var34) / (float)(var60 * 256);
                           }

                           float var62 = var61 * (var61 < 0.0F ? var39 : var38) + var37;
                           int var63 = (int)(var42 * var62);
                           int var64 = (int)(var44 * var62);
                           if (var63 >= 0) {
                              if (var63 > 255) {
                                 var63 = 255;
                                 if (var3) {
                                    var63 = 0;
                                 }
                              }
                           } else {
                              var63 = 0;
                           }

                           if (~var64 <= -1) {
                              if (var64 > 255) {
                                 var64 = 255;
                                 if (var3) {
                                    var64 = 0;
                                 }
                              }
                           } else {
                              var64 = 0;
                           }

                           int var65 = (int)(var45 * var62);
                           var13.field6907 = var8 * var59 + var10;
                           if (~var65 <= -1) {
                              if (~var65 < -256) {
                                 var65 = 255;
                                 if (var3) {
                                    var65 = 0;
                                 }
                              }
                           } else {
                              var65 = 0;
                           }

                           var13.method3571(arg1 + 7794, var63);
                           var13.method3571(arg1 + 7794, var64);
                           var13.method3571(255, var65);
                           var13.method3571(255, -(this.field10855[var40] & 255) + 255);
                           ++var40;
                        } while(~this.field10939 < ~var40);
                     }

                     if (!var3) {
                        break label529;
                     }
                  }

                  int var66 = 0;
                  if (var3 || ~var66 > ~this.field10939) {
                     do {
                        int var67 = this.method5452(this.field10835[var66], this.field10855[var66], this.field10948, this.field10947[var66], -12);
                        var13.field6907 = this.field10852[var66] * var8 + var10;
                        var13.method3540(var67, 898075920);
                        var13.field6907 = var10 - -(this.field10859[var66] * var8);
                        var13.method3540(var67, 898075920);
                        var13.field6907 = this.field10897[var66] * var8 + var10;
                        var13.method3540(var67, arg1 ^ -898076771);
                        ++var66;
                     } while(~var66 > ~this.field10939);
                  }
               }
            }

            if (var5) {
               label532: {
                  short[] var68;
                  short[] var69;
                  short[] var70;
                  byte[] var71;
                  label321: {
                     if (this.field10896 == null) {
                        var68 = this.field10892;
                        var69 = this.field10902;
                        var70 = this.field10846;
                        var71 = this.field10878;
                        if (!var3) {
                           break label321;
                        }
                     }

                     var71 = this.field10896.field7299;
                     var68 = this.field10896.field7300;
                     var70 = this.field10896.field7297;
                     var69 = this.field10896.field7301;
                  }

                  float var72 = 3.0F / (float)this.field10949;
                  float var73 = 3.0F / (float)(this.field10949 - -(this.field10949 / 2));
                  var13.field6907 = var11;
                  if (this.field10832.field807) {
                     int var74 = 0;
                     if (var3 || ~this.field10928 < ~var74) {
                        do {
                           label311: {
                              int var75 = 255 & var71[var74];
                              if (var75 == 0) {
                                 var13.method4064(-788993200, (float)var70[var74] * var73);
                                 var13.method4064(-788993200, (float)var69[var74] * var73);
                                 var13.method4064(-788993200, (float)var68[var74] * var73);
                                 if (!var3) {
                                    break label311;
                                 }
                              }

                              float var76 = var72 / (float)var75;
                              var13.method4064(arg1 + -788985661, (float)var70[var74] * var76);
                              var13.method4064(-788993200, (float)var69[var74] * var76);
                              var13.method4064(-788993200, (float)var68[var74] * var76);
                           }

                           var13.field6907 += var8 + -12;
                           ++var74;
                        } while(~this.field10928 < ~var74);
                     }

                     if (!var3) {
                        break label532;
                     }
                  }

                  int var77 = 0;
                  if (var3 || ~var77 > ~this.field10928) {
                     do {
                        label295: {
                           int var78 = 255 & var71[var77];
                           if (~var78 == -1) {
                              var13.method4061((byte)-108, (float)var70[var77] * var73);
                              var13.method4061((byte)-42, (float)var69[var77] * var73);
                              var13.method4061((byte)-65, (float)var68[var77] * var73);
                              if (!var3) {
                                 break label295;
                              }
                           }

                           float var79 = var72 / (float)var78;
                           var13.method4061((byte)-37, (float)var70[var77] * var79);
                           var13.method4061((byte)-77, (float)var69[var77] * var79);
                           var13.method4061((byte)-73, (float)var68[var77] * var79);
                        }

                        var13.field6907 += var8 + -12;
                        ++var77;
                     } while(~var77 > ~this.field10928);
                  }
               }
            }

            if (var7) {
               label535: {
                  var13.field6907 = var12;
                  if (this.field10832.field807) {
                     int var80 = 0;
                     if (var3) {
                        var13.method4064(arg1 + -788985661, this.field10944[var80]);
                        var13.method4064(-788993200, this.field10938[var80]);
                        var13.field6907 += var8 + -8;
                        ++var80;
                     }

                     while(true) {
                        while(~this.field10928 < ~var80) {
                           var13.method4064(arg1 + -788985661, this.field10944[var80]);
                           var13.method4064(-788993200, this.field10938[var80]);
                           var13.field6907 += var8 + -8;
                           ++var80;
                        }

                        if (!var3) {
                           if (!var3) {
                              break label535;
                           }
                           break;
                        }

                        ++var80;
                     }
                  }

                  int var81 = 0;
                  if (var3 || ~this.field10928 < ~var81) {
                     do {
                        var13.method4061((byte)-113, this.field10944[var81]);
                        var13.method4061((byte)-117, this.field10938[var81]);
                        var13.field6907 += var8 + -8;
                        ++var81;
                     } while(~this.field10928 < ~var81);
                  }
               }
            }

            var13.field6907 = this.field10928 * var8;
            if (arg1 != -7539) {
               this.field10899 = 83;
            }

            class77 var82;
            label247: {
               if (arg0) {
                  label244: {
                     if (this.field10907 == null) {
                        this.field10907 = this.field10832.method285(true, var13.field6907, var13.field6889, var8, -19795);
                        if (!var3) {
                           break label244;
                        }
                     }

                     this.field10907.method797(var13.field6889, var8, var13.field6907, 14180);
                  }

                  var82 = this.field10907;
                  this.field10945 = 0;
                  if (!var3) {
                     break label247;
                  }
               }

               var82 = this.field10832.method285(false, var13.field6907, var13.field6889, var8, -19795);
               this.field10931 = true;
            }

            if (var6) {
               this.field10844.field9357 = var9;
               this.field10844.field9358 = var82;
            }

            if (var7) {
               this.field10925.field9357 = var12;
               this.field10925.field9358 = var82;
            }

            if (var4) {
               this.field10894.field9358 = var82;
               this.field10894.field9357 = var10;
            }

            if (var5) {
               this.field10864.field9358 = var82;
               this.field10864.field9357 = var11;
            }
         }
      } catch (RuntimeException var84) {
         throw class608.method4462(var84, field10952[25] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "WA",
      descriptor = "()I",
      line = 1620
   )
   public final int method504() {
      try {
         ++field10834;
         return this.field10948;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[36] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "k",
      descriptor = "(I)V",
      line = 1628
   )
   public final void method543(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10877;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         int var6;
         if (var2) {
            var6 = this.field10901[var5] * var4 + this.field10870[var5] * var3 >> 14;
            this.field10870[var5] = this.field10870[var5] * var4 + -(this.field10901[var5] * var3) >> 14;
            this.field10901[var5] = var6;
            ++var5;
         }

         while(true) {
            while(~this.field10862 < ~var5) {
               var6 = this.field10901[var5] * var4 + this.field10870[var5] * var3 >> 14;
               this.field10870[var5] = this.field10870[var5] * var4 + -(this.field10901[var5] * var3) >> 14;
               this.field10901[var5] = var6;
               ++var5;
            }

            int var7 = 0;
            if (!var2) {
               if (!var2 && this.field10928 <= var7) {
                  if (this.field10864 == null && this.field10894 != null) {
                     this.field10894.field9358 = null;
                  }

                  if (this.field10864 != null) {
                     this.field10864.field9358 = null;
                  }

                  if (this.field10844 != null) {
                     this.field10844.field9358 = null;
                  }

                  this.field10858 = false;
                  return;
               } else {
                  do {
                     int var8 = this.field10892[var7] * var3 + this.field10846[var7] * var4 >> 14;
                     this.field10892[var7] = (short)(this.field10892[var7] * var4 + -(this.field10846[var7] * var3) >> 14);
                     this.field10846[var7] = (short)var8;
                     ++var7;
                  } while(this.field10928 > var7);

                  if (this.field10864 == null && this.field10894 != null) {
                     this.field10894.field9358 = null;
                  }

                  if (this.field10864 != null) {
                     this.field10864.field9358 = null;
                  }

                  if (this.field10844 != null) {
                     this.field10844.field9358 = null;
                  }

                  this.field10858 = false;
                  return;
               }
            }

            ++var5;
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field10952[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "d",
      descriptor = "()Z",
      line = 1676
   )
   public final boolean method529() {
      boolean var1 = client.field4564;

      try {
         ++field10950;
         if (this.field10947 == null) {
            return true;
         } else {
            int var2 = 0;
            if (var1) {
               if (~this.field10947[var2] != 0 && !this.field10832.field1192.method1455(this.field10947[var2], 9777)) {
                  return false;
               }

               ++var2;
            }

            while(true) {
               int var10000;
               if (var2 >= this.field10947.length) {
                  var10000 = 1;
                  if (!var1) {
                     return true;
                  }
               } else {
                  var10000 = ~this.field10947[var2];
               }

               if (var10000 != 0 && !this.field10832.field1192.method1455(this.field10947[var2], 9777)) {
                  return false;
               }

               ++var2;
            }
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10952[49] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(Lrk;)V",
      line = 5726
   )
   public class753(class35 arg0) {
      try {
         this.field10832 = arg0;
         this.field10844 = new class642((class77)null, 5126, 3, 0);
         this.field10925 = new class642((class77)null, 5126, 2, 0);
         this.field10864 = new class642((class77)null, 5126, 3, 0);
         this.field10894 = new class642((class77)null, 5121, 4, 0);
         this.field10932 = new class474();
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10952[57] + (arg0 != null ? field10952[11] : field10952[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "<init>",
      descriptor = "(Lrk;Lph;IIII)V",
      line = 5739
   )
   public class753(class35 param1, class668 param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Ldfa;Lija;II)V",
      line = 1703
   )
   public final void method552(class173 arg0, class362 arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field10886;
         if (this.field10928 != 0) {
            class558 var6 = this.field10832.field757;
            if (!this.field10858) {
               this.method5455(-32768);
            }

            class558 var7;
            float var10;
            float var11;
            label93: {
               var7 = (class558)arg0;
               class524.field7669 = var6.field8098 * var7.field8109 + var6.field8130 * var7.field8102 + var6.field8110 * var7.field8093 + var6.field8109;
               class366.field5442 = var6.field8098 * var7.field8110 + var6.field8130 * var7.field8103 + var6.field8110 * var7.field8095;
               float var8 = (float)this.field10839 * class366.field5442 + class524.field7669;
               float var9 = (float)this.field10881 * class366.field5442 + class524.field7669;
               if (var9 < var8) {
                  var10 = var9 - (float)this.field10921;
                  var11 = (float)this.field10921 + var8;
                  if (!var5) {
                     break label93;
                  }
               }

               var10 = var8 - (float)this.field10921;
               var11 = (float)this.field10921 + var9;
            }

            if (!(var10 >= this.field10832.field854)) {
               if (!((float)this.field10832.field829 >= var11)) {
                  float var14;
                  float var15;
                  label85: {
                     class251.field3596 = var6.field8127 * var7.field8109 + var6.field8103 * var7.field8093 + var6.field8099 * var7.field8102 + var6.field8102;
                     class306.field4425 = var6.field8127 * var7.field8110 + var6.field8103 * var7.field8095 + var6.field8099 * var7.field8103;
                     float var12 = (float)this.field10839 * class306.field4425 + class251.field3596;
                     float var13 = (float)this.field10881 * class306.field4425 + class251.field3596;
                     if (var13 < var12) {
                        var14 = (var13 - (float)this.field10921) * (float)this.field10832.field803;
                        var15 = ((float)this.field10921 + var12) * (float)this.field10832.field803;
                        if (!var5) {
                           break label85;
                        }
                     }

                     var14 = ((float)(-this.field10921) + var12) * (float)this.field10832.field803;
                     var15 = ((float)this.field10921 + var13) * (float)this.field10832.field803;
                  }

                  if (!(this.field10832.field806 <= var14 / (float)arg2)) {
                     if (!(this.field10832.field786 >= var15 / (float)arg2)) {
                        float var18;
                        float var19;
                        label77: {
                           class127.field2130 = var6.field8118 * var7.field8109 + var6.field8123 * var7.field8102 + var6.field8095 * var7.field8093 + var6.field8093;
                           class340.field4840 = var6.field8118 * var7.field8110 + var6.field8123 * var7.field8103 + var6.field8095 * var7.field8095;
                           float var16 = (float)this.field10839 * class340.field4840 + class127.field2130;
                           float var17 = (float)this.field10881 * class340.field4840 + class127.field2130;
                           if (!(var17 < var16)) {
                              var18 = ((float)this.field10921 + var17) * (float)this.field10832.field834;
                              var19 = ((float)(-this.field10921) + var16) * (float)this.field10832.field834;
                              if (!var5) {
                                 break label77;
                              }
                           }

                           var18 = ((float)this.field10921 + var16) * (float)this.field10832.field834;
                           var19 = ((float)(-this.field10921) + var17) * (float)this.field10832.field834;
                        }

                        if (!(var19 / (float)arg2 >= this.field10832.field866)) {
                           if (!(this.field10832.field841 >= var18 / (float)arg2)) {
                              if (arg1 != null || this.field10836 != null) {
                                 class247.field3543 = var6.field8127 * var7.field8098 + var6.field8103 * var7.field8118 + var6.field8099 * var7.field8127;
                                 class211.field3156 = var6.field8098 * var7.field8098 + var6.field8130 * var7.field8127 + var6.field8110 * var7.field8118;
                                 class170.field2647 = var6.field8127 * var7.field8130 + var6.field8103 * var7.field8123 + var6.field8099 * var7.field8099;
                                 class275.field3897 = var6.field8118 * var7.field8130 + var6.field8123 * var7.field8099 + var6.field8095 * var7.field8123;
                                 class29.field456 = var6.field8098 * var7.field8130 + var6.field8130 * var7.field8099 + var6.field8110 * var7.field8123;
                                 class331.field4738 = var6.field8118 * var7.field8098 + var6.field8123 * var7.field8127 + var6.field8095 * var7.field8118;
                              }

                              if (arg1 != null) {
                                 int var20 = this.field10917 + this.field10875 >> 1;
                                 int var21 = this.field10919 + this.field10884 >> 1;
                                 int var22 = (int)((float)var21 * class247.field3543 + (float)this.field10839 * class306.field4425 + (float)var20 * class170.field2647 + class251.field3596);
                                 int var23 = (int)((float)var21 * class331.field4738 + (float)this.field10839 * class340.field4840 + (float)var20 * class275.field3897 + class127.field2130);
                                 int var24 = (int)((float)var21 * class211.field3156 + (float)this.field10839 * class366.field5442 + (float)var20 * class29.field456 + class524.field7669);
                                 int var25 = (int)((float)var21 * class247.field3543 + (float)this.field10881 * class306.field4425 + (float)var20 * class170.field2647 + class251.field3596);
                                 int var26 = (int)((float)var21 * class331.field4738 + (float)this.field10881 * class340.field4840 + (float)var20 * class275.field3897 + class127.field2130);
                                 arg1.field5411 = this.field10832.field803 * var22 / arg2 + this.field10832.field861;
                                 arg1.field5410 = this.field10832.field800 - -(this.field10832.field834 * var26 / arg2);
                                 arg1.field5407 = this.field10832.field803 * var25 / arg2 + this.field10832.field861;
                                 arg1.field5408 = this.field10832.field834 * var23 / arg2 + this.field10832.field800;
                                 int var27 = (int)((float)var21 * class211.field3156 + (float)this.field10881 * class366.field5442 + (float)var20 * class29.field456 + class524.field7669);
                                 if (this.field10832.field829 <= var24 || this.field10832.field829 <= var27) {
                                    arg1.field5409 = (this.field10921 + var22) * this.field10832.field803 / arg2 + this.field10832.field861 - arg1.field5411;
                                    arg1.field5406 = true;
                                 }
                              }

                              this.field10832.method362((float)arg2, -1);
                              this.field10832.method305(1);
                              this.field10832.method435(true, var7);
                              this.method5456((byte)-85);
                              this.field10832.method401(-22939);
                              this.method5461((byte)-125);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var29) {
         throw class608.method4462(var29, field10952[40] + (arg0 != null ? field10952[11] : field10952[9]) + ',' + (arg1 != null ? field10952[11] : field10952[9]) + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(I)V",
      line = 1851
   )
   public final void method513(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10943;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         if (!var2 && ~this.field10862 >= ~var5) {
            this.field10858 = false;
            if (this.field10844 != null) {
               this.field10844.field9358 = null;
            }
         } else {
            do {
               int var6 = this.field10901[var5] * var4 + this.field10870[var5] * var3 >> 14;
               this.field10870[var5] = this.field10870[var5] * var4 + -(this.field10901[var5] * var3) >> 14;
               this.field10901[var5] = var6;
               ++var5;
            } while(~this.field10862 < ~var5);

            this.field10858 = false;
            if (this.field10844 != null) {
               this.field10844.field9358 = null;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10952[24] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "v",
      descriptor = "()V",
      line = 1884
   )
   public final void method509() {
      boolean var1 = client.field4564;

      try {
         ++field10843;
         int var2 = 0;
         if (var1) {
            this.field10870[var2] = -this.field10870[var2];
            ++var2;
         }

         while(true) {
            while(this.field10862 > var2) {
               this.field10870[var2] = -this.field10870[var2];
               ++var2;
            }

            int var3 = 0;
            if (!var1) {
               if (var1) {
                  this.field10892[var3] = (short)(-this.field10892[var3]);
                  ++var3;
               }

               while(true) {
                  while(~var3 > ~this.field10928) {
                     this.field10892[var3] = (short)(-this.field10892[var3]);
                     ++var3;
                  }

                  int var4 = 0;
                  if (!var1) {
                     short var5;
                     if (var1) {
                        var5 = this.field10852[var4];
                        this.field10852[var4] = this.field10897[var4];
                        this.field10897[var4] = var5;
                        ++var4;
                     }

                     while(true) {
                        class753 var10000;
                        if (~this.field10939 >= ~var4) {
                           var10000 = this;
                           if (!var1) {
                              if (this.field10864 == null && this.field10894 != null) {
                                 this.field10894.field9358 = null;
                              }

                              if (this.field10864 != null) {
                                 this.field10864.field9358 = null;
                              }

                              if (this.field10932 != null) {
                                 this.field10932.field6929 = null;
                              }

                              this.field10858 = false;
                              if (this.field10844 != null) {
                                 this.field10844.field9358 = null;
                                 return;
                              }

                              return;
                           }
                        } else {
                           var10000 = this;
                        }

                        var5 = var10000.field10852[var4];
                        this.field10852[var4] = this.field10897[var4];
                        this.field10897[var4] = var5;
                        ++var4;
                     }
                  }

                  ++var3;
               }
            }

            ++var2;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10952[58] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "()V",
      line = 1938
   )
   public final void method544() {
      try {
         ++field10918;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[60] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "G",
      descriptor = "()I",
      line = 1945
   )
   public final int method546() {
      try {
         if (!this.field10858) {
            this.method5455(-32768);
         }

         ++field10871;
         return this.field10919;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[27] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(ZIIILdfa;II)Z",
      line = 1957
   )
   private final boolean method5454(boolean arg0, int arg1, int arg2, int arg3, class173 arg4, int arg5, int arg6) {
      boolean var8 = client.field4564;

      try {
         ++field10872;
         class558 var9 = (class558)arg4;
         class558 var10 = this.field10832.field757;
         float var11 = var9.field8109 * var10.field8127 + var9.field8102 * var10.field8099 + var9.field8093 * var10.field8103 + var10.field8102;
         int var12 = 1 / ((arg1 - 20) / 37);
         float var13 = var9.field8109 * var10.field8118 + var9.field8102 * var10.field8123 + var9.field8093 * var10.field8095 + var10.field8093;
         float var14 = var9.field8109 * var10.field8098 + var9.field8102 * var10.field8130 + var9.field8093 * var10.field8110 + var10.field8109;
         class275.field3897 = var9.field8130 * var10.field8118 + var9.field8123 * var10.field8095 + var9.field8099 * var10.field8123;
         class366.field5442 = var9.field8110 * var10.field8098 + var9.field8103 * var10.field8130 + var9.field8095 * var10.field8110;
         class170.field2647 = var9.field8130 * var10.field8127 + var9.field8123 * var10.field8103 + var9.field8099 * var10.field8099;
         class306.field4425 = var9.field8110 * var10.field8127 + var9.field8103 * var10.field8099 + var9.field8095 * var10.field8103;
         class29.field456 = var9.field8130 * var10.field8098 + var9.field8123 * var10.field8110 + var9.field8099 * var10.field8130;
         class340.field4840 = var9.field8110 * var10.field8118 + var9.field8103 * var10.field8123 + var9.field8095 * var10.field8095;
         class331.field4738 = var9.field8098 * var10.field8118 + var9.field8127 * var10.field8123 + var9.field8118 * var10.field8095;
         class247.field3543 = var9.field8098 * var10.field8127 + var9.field8127 * var10.field8099 + var9.field8118 * var10.field8103;
         class211.field3156 = var9.field8098 * var10.field8098 + var9.field8127 * var10.field8130 + var9.field8118 * var10.field8110;
         byte var15 = 0;
         float var16 = Float.MAX_VALUE;
         float var17 = -3.4028235E38F;
         float var18 = Float.MAX_VALUE;
         float var19 = -3.4028235E38F;
         int var20 = this.field10832.field803;
         int var21 = this.field10832.field834;
         if (!this.field10858) {
            this.method5455(-32768);
         }

         int var22 = -this.field10875 + this.field10917 >> 1;
         int var23 = -this.field10839 + this.field10881 >> 1;
         int var24 = -this.field10884 + this.field10919 >> 1;
         int var25 = this.field10875 + var22;
         int var26 = this.field10839 - -var23;
         int var27 = this.field10884 + var24;
         int var28 = -(var22 << arg3) + var25;
         int var29 = -(var23 << arg3) + var26;
         int var30 = var27 - (var24 << arg3);
         int var31 = (var22 << arg3) + var25;
         int var32 = (var23 << arg3) + var26;
         class535.field7794[0] = var28;
         int var33 = (var24 << arg3) + var27;
         class622.field9079[0] = var29;
         class33.field491[0] = var30;
         class535.field7794[1] = var31;
         class622.field9079[1] = var29;
         class535.field7794[2] = var28;
         class33.field491[1] = var30;
         class622.field9079[2] = var32;
         class33.field491[2] = var30;
         class535.field7794[3] = var31;
         class622.field9079[3] = var32;
         class33.field491[3] = var30;
         class535.field7794[4] = var28;
         class622.field9079[4] = var29;
         class535.field7794[5] = var31;
         class33.field491[4] = var33;
         class622.field9079[5] = var29;
         class535.field7794[6] = var28;
         class33.field491[5] = var33;
         class622.field9079[6] = var32;
         class33.field491[6] = var33;
         class535.field7794[7] = var31;
         class622.field9079[7] = var32;
         class33.field491[7] = var33;
         int var34 = 0;
         float var35;
         float var36;
         float var37;
         float var38;
         float var39;
         float var40;
         float var41;
         float var42;
         if (var8) {
            var35 = (float)class535.field7794[var34];
            var36 = (float)class33.field491[var34];
            var37 = (float)class622.field9079[var34];
            var38 = class331.field4738 * var36 + class340.field4840 * var37 + class275.field3897 * var35 + var13;
            var39 = class211.field3156 * var36 + class366.field5442 * var37 + class29.field456 * var35 + var14;
            var40 = class247.field3543 * var36 + class306.field4425 * var37 + class170.field2647 * var35 + var11;
            if ((float)this.field10832.field829 <= var39) {
               if (arg5 > 0) {
                  var39 = (float)arg5;
               }

               var41 = (float)var20 * var40 / var39 + (float)this.field10832.field861;
               if (var16 > var41) {
                  var16 = var41;
               }

               var42 = (float)var21 * var38 / var39 + (float)this.field10832.field800;
               if (var41 > var17) {
                  var17 = var41;
               }

               var15 = 1;
               if (var42 < var18) {
                  var18 = var42;
               }

               if (var42 > var19) {
                  var19 = var42;
               }
            }

            ++var34;
         }

         while(true) {
            int var10000;
            if (~var34 <= -9) {
               var10000 = var15;
               if (!var8) {
                  if (var15 != 0 && (float)arg2 > var16 && var17 > (float)arg2 && var18 < (float)arg6 && var19 > (float)arg6) {
                     if (arg0) {
                        return true;
                     }

                     if (this.field10928 > this.field10832.field875.length) {
                        this.field10832.field878 = new int[this.field10928];
                        this.field10832.field875 = new int[this.field10928];
                     }

                     int[] var43;
                     int[] var44;
                     label178: {
                        var43 = this.field10832.field875;
                        var44 = this.field10832.field878;
                        int var45 = 0;
                        if (var8) {
                           var10000 = this.field10901[var45];
                        } else if (var45 >= this.field10862) {
                           var10000 = 0;
                           if (!var8) {
                              break label178;
                           }
                        } else {
                           var10000 = this.field10901[var45];
                        }

                        while(true) {
                           label243: {
                              float var46 = (float)var10000;
                              float var47 = (float)this.field10870[var45];
                              float var48 = (float)this.field10854[var45];
                              float var49 = class247.field3543 * var47 + class306.field4425 * var48 + class170.field2647 * var46 + var11;
                              float var50 = class331.field4738 * var47 + class340.field4840 * var48 + class275.field3897 * var46 + var13;
                              float var51 = class211.field3156 * var47 + class366.field5442 * var48 + class29.field456 * var46 + var14;
                              if (!((float)this.field10832.field829 <= var51)) {
                                 int var52 = this.field10869[var45];
                                 int var53 = this.field10869[var45 + 1];
                                 int var54 = var52;
                                 if (var8 || var53 > var52) {
                                    do {
                                       int var55 = this.field10833[var54] + -1;
                                       if (var55 == -1) {
                                          break;
                                       }

                                       var43[this.field10833[var54] + -1] = -999999;
                                       ++var54;
                                    } while(var53 > var54);
                                 }

                                 if (!var8) {
                                    ++var45;
                                    break label243;
                                 }

                                 if (arg5 > 0) {
                                    var51 = (float)arg5;
                                 }
                              } else if (arg5 > 0) {
                                 var51 = (float)arg5;
                              }

                              int var56 = (int)((float)var20 * var49 / var51 + (float)this.field10832.field861);
                              int var57 = (int)((float)var21 * var50 / var51 + (float)this.field10832.field800);
                              int var58 = this.field10869[var45];
                              int var59 = this.field10869[var45 + 1];
                              int var60 = var58;
                              if (!var8 && ~var58 <= ~var59) {
                                 ++var45;
                              } else {
                                 while(true) {
                                    int var61 = this.field10833[var60] + -1;
                                    if (~var61 == 0) {
                                       ++var45;
                                       break;
                                    }

                                    var43[var61] = var56;
                                    var44[var61] = var57;
                                    ++var60;
                                    if (~var60 <= ~var59) {
                                       ++var45;
                                       break;
                                    }
                                 }
                              }
                           }

                           if (var45 >= this.field10862) {
                              var10000 = 0;
                              if (!var8) {
                                 break;
                              }
                           } else {
                              var10000 = this.field10901[var45];
                           }
                        }
                     }

                     int var62 = var10000;
                     if (var8 || ~this.field10939 < ~var62) {
                        do {
                           if (var43[this.field10852[var62]] != -999999) {
                              if (var43[this.field10859[var62]] != -999999) {
                                 if (var43[this.field10897[var62]] == -999999 && !var8) {
                                    ++var62;
                                 } else {
                                    if (this.method5462(var43[this.field10852[var62]], var44[this.field10859[var62]], arg6, var44[this.field10852[var62]], var43[this.field10859[var62]], var44[this.field10897[var62]], var43[this.field10897[var62]], arg2, (byte)-107)) {
                                       return true;
                                    }

                                    ++var62;
                                 }
                              } else {
                                 ++var62;
                              }
                           } else {
                              ++var62;
                           }
                        } while(~this.field10939 < ~var62);
                     }
                  }

                  return false;
               }
            } else {
               var10000 = class535.field7794[var34];
            }

            var35 = (float)var10000;
            var36 = (float)class33.field491[var34];
            var37 = (float)class622.field9079[var34];
            var38 = class331.field4738 * var36 + class340.field4840 * var37 + class275.field3897 * var35 + var13;
            var39 = class211.field3156 * var36 + class366.field5442 * var37 + class29.field456 * var35 + var14;
            var40 = class247.field3543 * var36 + class306.field4425 * var37 + class170.field2647 * var35 + var11;
            if ((float)this.field10832.field829 <= var39) {
               if (arg5 > 0) {
                  var39 = (float)arg5;
               }

               var41 = (float)var20 * var40 / var39 + (float)this.field10832.field861;
               if (var16 > var41) {
                  var16 = var41;
               }

               var42 = (float)var21 * var38 / var39 + (float)this.field10832.field800;
               if (var41 > var17) {
                  var17 = var41;
               }

               var15 = 1;
               if (var42 < var18) {
                  var18 = var42;
               }

               if (var42 > var19) {
                  var19 = var42;
               }
            }

            ++var34;
         }
      } catch (RuntimeException var64) {
         throw class608.method4462(var64, field10952[18] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field10952[11] : field10952[9]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(BIZ)Lka;",
      line = 2200
   )
   public final class495 method549(byte arg0, int arg1, boolean arg2) {
      boolean var4 = client.field4564;

      try {
         ++field10868;
         class753 var5;
         class753 var6;
         if (~arg0 == -2) {
            var5 = this.field10832.field776;
            var6 = this.field10832.field788;
            if (!var4) {
               return this.method5463(~arg0 != -1, 103, arg2, var6, arg1, var5);
            }
         }

         if (arg0 == 2) {
            var6 = this.field10832.field770;
            var5 = this.field10832.field846;
            if (!var4) {
               return this.method5463(~arg0 != -1, 103, arg2, var6, arg1, var5);
            }
         }

         if (~arg0 == -4) {
            var5 = this.field10832.field852;
            var6 = this.field10832.field825;
            if (!var4) {
               return this.method5463(~arg0 != -1, 103, arg2, var6, arg1, var5);
            }
         }

         if (arg0 == 4) {
            var6 = this.field10832.field796;
            var5 = this.field10832.field870;
            if (!var4) {
               return this.method5463(~arg0 != -1, 103, arg2, var6, arg1, var5);
            }
         }

         if (arg0 != 5) {
            var6 = var5 = new class753(this.field10832);
            if (!var4) {
               return this.method5463(~arg0 != -1, 103, arg2, var6, arg1, var5);
            }
         }

         var6 = this.field10832.field843;
         var5 = this.field10832.field766;
         return this.method5463(~arg0 != -1, 103, arg2, var6, arg1, var5);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10952[12] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "e",
      descriptor = "()V",
      line = 2252
   )
   public final void method508() {
      try {
         ++field10857;
         if (this.field10928 > 0 && ~this.field10889 < -1) {
            this.method5453(false, -7539);
            if (~(16 & this.field10945) == -1 && this.field10932.field6929 == null) {
               this.method5451(false, false);
            }

            this.method5458((byte)86);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[22] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "(I)V",
      line = 2270
   )
   private final void method5455(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10914;
         int var3 = 32767;
         int var4 = 32767;
         int var5 = 32767;
         int var6 = -32768;
         int var7 = -32768;
         int var8 = arg0;
         int var9 = 0;
         int var10 = 0;
         int var11 = 0;
         class753 var10000;
         if (var2) {
            var10000 = this;
         } else if (~this.field10862 >= ~var11) {
            this.field10839 = (short)var4;
            this.field10881 = (short)var7;
            this.field10884 = (short)var5;
            this.field10917 = (short)var6;
            this.field10919 = (short)arg0;
            this.field10875 = (short)var3;
            this.field10921 = (short)((int)(Math.sqrt((double)var9) + 0.99D));
            this.field10926 = (short)((int)(Math.sqrt((double)var10) + 0.99D));
            var10000 = this;
            if (!var2) {
               this.field10858 = true;
               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var12 = var10000.field10901[var11];
            int var13 = this.field10854[var11];
            if (var13 > var7) {
               var7 = var13;
            }

            if (~var6 > ~var12) {
               var6 = var12;
            }

            if (~var3 < ~var12) {
               var3 = var12;
            }

            int var14 = this.field10870[var11];
            if (~var13 > ~var4) {
               var4 = var13;
            }

            if (var5 > var14) {
               var5 = var14;
            }

            if (~var8 > ~var14) {
               var8 = var14;
            }

            int var15 = var12 * var12 + var14 * var14;
            if (~var9 > ~var15) {
               var9 = var15;
            }

            int var16 = var14 * var14 + var12 * var12 + var13 * var13;
            if (~var10 > ~var16) {
               var10 = var16;
            }

            ++var11;
            if (~this.field10862 >= ~var11) {
               this.field10839 = (short)var4;
               this.field10881 = (short)var7;
               this.field10884 = (short)var5;
               this.field10917 = (short)var6;
               this.field10919 = (short)var8;
               this.field10875 = (short)var3;
               this.field10921 = (short)((int)(Math.sqrt((double)var9) + 0.99D));
               this.field10926 = (short)((int)(Math.sqrt((double)var10) + 0.99D));
               var10000 = this;
               if (!var2) {
                  this.field10858 = true;
                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var18) {
         throw class608.method4462(var18, field10952[43] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "EA",
      descriptor = "()I",
      line = 2353
   )
   public final int method507() {
      try {
         ++field10851;
         if (!this.field10858) {
            this.method5455(-32768);
         }

         return this.field10881;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "LA",
      descriptor = "(I)V",
      line = 2369
   )
   public final void method534(int arg0) {
      try {
         ++field10853;
         if (this.field10894 != null) {
            this.field10894.field9358 = null;
         }

         this.field10949 = (short)arg0;
         if (this.field10864 != null) {
            this.field10864.field9358 = null;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field10952[53] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "H",
      descriptor = "(III)V",
      line = 2386
   )
   public final void method514(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         int var5 = 0;
         if (var4) {
            if (arg0 != 0) {
               this.field10901[var5] += arg0;
            }

            if (arg1 != 0) {
               this.field10854[var5] += arg1;
            }

            if (arg2 != 0) {
               this.field10870[var5] += arg2;
               ++var5;
            } else {
               ++var5;
            }
         }

         while(true) {
            while(this.field10862 > var5) {
               if (arg0 != 0) {
                  this.field10901[var5] += arg0;
               }

               if (arg1 != 0) {
                  this.field10854[var5] += arg1;
               }

               if (arg2 != 0) {
                  this.field10870[var5] += arg2;
                  ++var5;
               } else {
                  ++var5;
               }
            }

            ++field10874;
            if (!var4) {
               if (this.field10844 != null) {
                  this.field10844.field9358 = null;
               }

               this.field10858 = false;
               return;
            }

            this.field10870[var5] += arg2;
            ++var5;
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10952[17] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "r",
      descriptor = "()Z",
      line = 2420
   )
   public final boolean method536() {
      try {
         ++field10908;
         return this.field10831;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[50] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "P",
      descriptor = "(IIII)V",
      line = 2428
   )
   public final void method518(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         ++field10867;
         if (~arg0 != -1) {
            if (~arg0 != -2) {
               if (arg0 != 2) {
                  if (arg0 != 3) {
                     if (arg0 != 5) {
                        if (~arg0 != -8) {
                           if (arg0 != 8) {
                              if (arg0 != 10) {
                                 if (arg0 == 9) {
                                    int var40 = 0;
                                    if (var5 || ~var40 > ~this.field10900) {
                                       do {
                                          class205 var41 = this.field10935[var40];
                                          var41.field3053 = 16383 & var41.field3053 + arg1;
                                          ++var40;
                                       } while(~var40 > ~this.field10900);

                                    }
                                 }
                              } else {
                                 int var38 = 0;
                                 if (var5 || this.field10900 > var38) {
                                    do {
                                       class205 var39 = this.field10935[var38];
                                       var39.field3059 = var39.field3059 * arg1 >> 7;
                                       var39.field3054 = var39.field3054 * arg2 >> 7;
                                       ++var38;
                                    } while(this.field10900 > var38);

                                 }
                              }
                           } else {
                              int var36 = 0;
                              if (var5 || ~this.field10900 < ~var36) {
                                 do {
                                    class205 var37 = this.field10935[var36];
                                    var37.field3051 += arg2;
                                    var37.field3056 += arg1;
                                    ++var36;
                                 } while(~this.field10900 < ~var36);

                              }
                           }
                        } else {
                           int var25 = 0;
                           int var33;
                           class478 var34;
                           class205 var35;
                           if (!var5 && ~var25 <= ~this.field10939) {
                              if (this.field10894 != null) {
                                 this.field10894.field9358 = null;
                              }

                              if (this.field10836 != null) {
                                 var33 = 0;
                                 if (var5 || this.field10900 > var33) {
                                    do {
                                       var34 = this.field10836[var33];
                                       var35 = this.field10935[var33];
                                       var35.field3060 = class451.field6600[this.field10835[var34.field6965] & 65535] & 16777215 | -16777216 & var35.field3060;
                                       ++var33;
                                    } while(this.field10900 > var33);
                                 }
                              }

                           } else {
                              do {
                                 int var26 = 65535 & this.field10835[var25];
                                 int var27 = 63 & var26 >> 10;
                                 int var28 = var26 >> 7 & 7;
                                 int var29 = var26 & 127;
                                 int var30 = 63 & arg1 + var27;
                                 int var31 = arg2 / 4 + var28;
                                 if (var31 >= 0) {
                                    if (~var31 < -8) {
                                       var31 = 7;
                                       if (var5) {
                                          var31 = 0;
                                       }
                                    }
                                 } else {
                                    var31 = 0;
                                 }

                                 int var32 = arg3 + var29;
                                 if (~var32 > -1) {
                                    var32 = 0;
                                    if (var5 && var32 > 127) {
                                       var32 = 127;
                                    }
                                 } else if (var32 > 127) {
                                    var32 = 127;
                                 }

                                 this.field10835[var25] = (short)class93.method899(class93.method899(var31 << 7, var30 << 10), var32);
                                 ++var25;
                              } while(~var25 > ~this.field10939);

                              if (this.field10894 != null) {
                                 this.field10894.field9358 = null;
                              }

                              if (this.field10836 != null) {
                                 var33 = 0;
                                 if (var5 || this.field10900 > var33) {
                                    do {
                                       var34 = this.field10836[var33];
                                       var35 = this.field10935[var33];
                                       var35.field3060 = class451.field6600[this.field10835[var34.field6965] & 65535] & 16777215 | -16777216 & var35.field3060;
                                       ++var33;
                                    } while(this.field10900 > var33);
                                 }
                              }

                           }
                        }
                     } else {
                        int var20 = 0;
                        int var21;
                        if (var5) {
                           var21 = (this.field10855[var20] & 255) - -(arg1 * 8);
                           if (var21 < 0) {
                              var21 = 0;
                              if (var5 && var21 > 255) {
                                 var21 = 255;
                              }
                           } else if (var21 > 255) {
                              var21 = 255;
                           }

                           this.field10855[var20] = (byte)var21;
                           ++var20;
                        }

                        while(true) {
                           class753 var10000;
                           if (this.field10939 <= var20) {
                              var10000 = this;
                              if (!var5) {
                                 if (this.field10894 != null) {
                                    this.field10894.field9358 = null;
                                 }

                                 if (this.field10836 != null) {
                                    int var22 = 0;
                                    if (var5 || this.field10900 > var22) {
                                       do {
                                          class478 var23 = this.field10836[var22];
                                          class205 var24 = this.field10935[var22];
                                          var24.field3060 = 16777215 & var24.field3060 | -(255 & this.field10855[var23.field6965]) + 255 << 24;
                                          ++var22;
                                       } while(this.field10900 > var22);
                                    }
                                 }

                                 return;
                              }
                           } else {
                              var10000 = this;
                           }

                           var21 = (var10000.field10855[var20] & 255) - -(arg1 * 8);
                           if (var21 < 0) {
                              var21 = 0;
                              if (var5 && var21 > 255) {
                                 var21 = 255;
                              }
                           } else if (var21 > 255) {
                              var21 = 255;
                           }

                           this.field10855[var20] = (byte)var21;
                           ++var20;
                        }
                     }
                  } else {
                     int var19 = 0;
                     if (var5) {
                        this.field10901[var19] -= class572.field8271;
                        this.field10854[var19] -= class440.field6424;
                        this.field10870[var19] -= class154.field2449;
                        this.field10901[var19] = this.field10901[var19] * arg1 / 128;
                        this.field10854[var19] = this.field10854[var19] * arg2 / 128;
                        this.field10870[var19] = this.field10870[var19] * arg3 / 128;
                        this.field10901[var19] += class572.field8271;
                        this.field10854[var19] += class440.field6424;
                        this.field10870[var19] += class154.field2449;
                        ++var19;
                     }

                     while(true) {
                        while(this.field10862 > var19) {
                           this.field10901[var19] -= class572.field8271;
                           this.field10854[var19] -= class440.field6424;
                           this.field10870[var19] -= class154.field2449;
                           this.field10901[var19] = this.field10901[var19] * arg1 / 128;
                           this.field10854[var19] = this.field10854[var19] * arg2 / 128;
                           this.field10870[var19] = this.field10870[var19] * arg3 / 128;
                           this.field10901[var19] += class572.field8271;
                           this.field10854[var19] += class440.field6424;
                           this.field10870[var19] += class154.field2449;
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
                     this.field10901[var9] -= class572.field8271;
                     this.field10854[var9] -= class440.field6424;
                     this.field10870[var9] -= class154.field2449;
                  } else if (~this.field10862 >= ~var9) {
                     if (!var5) {
                        return;
                     }
                  } else {
                     this.field10901[var9] -= class572.field8271;
                     this.field10854[var9] -= class440.field6424;
                     this.field10870[var9] -= class154.field2449;
                  }

                  while(true) {
                     if (~arg3 != -1) {
                        int var10 = class593.field8539[arg3];
                        int var11 = class593.field8548[arg3];
                        int var12 = this.field10901[var9] * var11 + this.field10854[var9] * var10 + 16383 >> 14;
                        this.field10854[var9] = this.field10854[var9] * var11 + -(this.field10901[var9] * var10) + 16383 >> 14;
                        this.field10901[var9] = var12;
                     }

                     if (~arg1 != -1) {
                        int var13 = class593.field8539[arg1];
                        int var14 = class593.field8548[arg1];
                        int var15 = this.field10854[var9] * var14 - -16383 + -(this.field10870[var9] * var13) >> 14;
                        this.field10870[var9] = this.field10854[var9] * var13 + 16383 - -(this.field10870[var9] * var14) >> 14;
                        this.field10854[var9] = var15;
                     }

                     if (arg2 != 0) {
                        int var16 = class593.field8539[arg2];
                        int var17 = class593.field8548[arg2];
                        int var18 = this.field10901[var9] * var17 + this.field10870[var9] * var16 + 16383 >> 14;
                        this.field10870[var9] = this.field10870[var9] * var17 + -(this.field10901[var9] * var16) + 16383 >> 14;
                        this.field10901[var9] = var18;
                     }

                     this.field10901[var9] += class572.field8271;
                     this.field10854[var9] += class440.field6424;
                     this.field10870[var9] += class154.field2449;
                     ++var9;
                     if (~this.field10862 >= ~var9) {
                        if (!var5) {
                           return;
                        }
                     } else {
                        this.field10901[var9] -= class572.field8271;
                        this.field10854[var9] -= class440.field6424;
                        this.field10870[var9] -= class154.field2449;
                     }
                  }
               }
            } else {
               int var8 = 0;
               if (var5) {
                  this.field10901[var8] += arg1;
                  this.field10854[var8] += arg2;
                  this.field10870[var8] += arg3;
                  ++var8;
               }

               while(true) {
                  while(var8 < this.field10862) {
                     this.field10901[var8] += arg1;
                     this.field10854[var8] += arg2;
                     this.field10870[var8] += arg3;
                     ++var8;
                  }

                  if (!var5) {
                     return;
                  }

                  ++var8;
               }
            }
         } else {
            class440.field6424 = 0;
            int var6 = 0;
            class154.field2449 = 0;
            class572.field8271 = 0;
            int var7 = 0;
            if (var5) {
               class572.field8271 += this.field10901[var7];
               class440.field6424 += this.field10854[var7];
               class154.field2449 += this.field10870[var7];
               ++var6;
               ++var7;
            }

            while(true) {
               while(~this.field10862 < ~var7) {
                  class572.field8271 += this.field10901[var7];
                  class440.field6424 += this.field10854[var7];
                  class154.field2449 += this.field10870[var7];
                  ++var6;
                  ++var7;
               }

               if (!var5) {
                  if (var6 > 0) {
                     class154.field2449 = class154.field2449 / var6 + arg3;
                     class440.field6424 = class440.field6424 / var6 - -arg2;
                     class572.field8271 = class572.field8271 / var6 + arg1;
                     return;
                  }

                  class572.field8271 = arg1;
                  class440.field6424 = arg2;
                  class154.field2449 = arg3;
                  return;
               }

               class154.field2449 = var6++;
               ++var7;
            }
         }
      } catch (RuntimeException var43) {
         throw class608.method4462(var43, field10952[26] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "d",
      descriptor = "(B)V",
      line = 2734
   )
   private final void method5456(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10915;
         if (this.field10889 != 0) {
            if (arg0 < -58) {
               if (~this.field10945 != -1) {
                  this.method5453(true, -7539);
               }

               this.method5453(false, -7539);
               if (this.field10932 != null) {
                  if (this.field10932.field6929 == null) {
                     this.method5451(false, (this.field10945 & 16) != 0);
                  }

                  if (this.field10932.field6929 != null) {
                     this.field10832.method282(this.field10864 != null, -8);
                     this.field10832.method423((byte)40, this.field10894, this.field10925, this.field10864, this.field10844);
                     int var3 = this.field10912.length + -1;
                     int var4 = 0;
                     if (var2 || var4 < var3) {
                        do {
                           int var5 = this.field10912[var4];
                           int var6 = this.field10912[var4 + 1];
                           int var7 = this.field10947[var5] & 65535;
                           if (var7 == 65535) {
                              var7 = -1;
                           }

                           this.field10832.method355(this.field10864 != null, -88, var7);
                           this.field10832.method384(this.field10932.field6929, (-var5 + var6) * 3, (byte)-94, var5 * 3, 4);
                           ++var4;
                        } while(var4 < var3);
                     }
                  }
               }

               this.method5458((byte)96);
            }
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10952[34] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Lfi;Z)V",
      line = 2790
   )
   private final void method5457(class580 param1, boolean param2) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cp",
      name = "wa",
      descriptor = "()V",
      line = 2877
   )
   public final void method511() {
      boolean var1 = client.field4564;

      try {
         ++field10888;
         int var2 = 0;
         if (var1) {
            this.field10901[var2] = this.field10901[var2] + 7 >> 4;
            this.field10854[var2] = this.field10854[var2] + 7 >> 4;
            this.field10870[var2] = this.field10870[var2] + 7 >> 4;
            ++var2;
         }

         while(true) {
            while(var2 < this.field10903) {
               this.field10901[var2] = this.field10901[var2] + 7 >> 4;
               this.field10854[var2] = this.field10854[var2] + 7 >> 4;
               this.field10870[var2] = this.field10870[var2] + 7 >> 4;
               ++var2;
            }

            if (!var1) {
               if (this.field10844 != null) {
                  this.field10844.field9358 = null;
               }

               this.field10858 = false;
               return;
            }

            this.field10870[var2] = this.field10870[var2] + 7 >> 4;
            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field10952[3] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Ldfa;Lija;I)V",
      line = 2902
   )
   public final void method503(class173 arg0, class362 arg1, int arg2) {
      boolean var4 = client.field4564;

      try {
         ++field10905;
         if (~this.field10928 != -1) {
            class558 var5 = this.field10832.field757;
            class558 var6 = (class558)arg0;
            if (!this.field10858) {
               this.method5455(-32768);
            }

            float var9;
            float var10;
            label140: {
               class366.field5442 = var5.field8098 * var6.field8110 + var5.field8130 * var6.field8103 + var5.field8110 * var6.field8095;
               class524.field7669 = var5.field8098 * var6.field8109 + var5.field8130 * var6.field8102 + var5.field8110 * var6.field8093 + var5.field8109;
               float var7 = (float)this.field10839 * class366.field5442 + class524.field7669;
               float var8 = (float)this.field10881 * class366.field5442 + class524.field7669;
               if (!(var8 < var7)) {
                  var9 = (float)this.field10921 + var8;
                  var10 = (float)(-this.field10921) + var7;
                  if (!var4) {
                     break label140;
                  }
               }

               var9 = (float)this.field10921 + var7;
               var10 = var8 - (float)this.field10921;
            }

            if (!(var10 >= this.field10832.field823)) {
               if (!((float)this.field10832.field829 >= var9)) {
                  float var13;
                  float var14;
                  label132: {
                     class251.field3596 = var5.field8127 * var6.field8109 + var5.field8103 * var6.field8093 + var5.field8099 * var6.field8102 + var5.field8102;
                     class306.field4425 = var5.field8127 * var6.field8110 + var5.field8103 * var6.field8095 + var5.field8099 * var6.field8103;
                     float var11 = (float)this.field10839 * class306.field4425 + class251.field3596;
                     float var12 = (float)this.field10881 * class306.field4425 + class251.field3596;
                     if (!(var12 < var11)) {
                        var13 = ((float)this.field10921 + var12) * (float)this.field10832.field803;
                        var14 = ((float)(-this.field10921) + var11) * (float)this.field10832.field803;
                        if (!var4) {
                           break label132;
                        }
                     }

                     var13 = ((float)this.field10921 + var11) * (float)this.field10832.field803;
                     var14 = ((float)(-this.field10921) + var12) * (float)this.field10832.field803;
                  }

                  if (!(this.field10832.field806 <= var14 / var9)) {
                     if (!(var13 / var9 <= this.field10832.field786)) {
                        float var17;
                        float var18;
                        label124: {
                           class340.field4840 = var5.field8118 * var6.field8110 + var5.field8123 * var6.field8103 + var5.field8095 * var6.field8095;
                           class127.field2130 = var5.field8118 * var6.field8109 + var5.field8123 * var6.field8102 + var5.field8095 * var6.field8093 + var5.field8093;
                           float var15 = (float)this.field10839 * class340.field4840 + class127.field2130;
                           float var16 = (float)this.field10881 * class340.field4840 + class127.field2130;
                           if (var16 < var15) {
                              var17 = ((float)this.field10921 + var15) * (float)this.field10832.field834;
                              var18 = ((float)(-this.field10921) + var16) * (float)this.field10832.field834;
                              if (!var4) {
                                 break label124;
                              }
                           }

                           var18 = (var15 - (float)this.field10921) * (float)this.field10832.field834;
                           var17 = ((float)this.field10921 + var16) * (float)this.field10832.field834;
                        }

                        if (!(var18 / var9 >= this.field10832.field866)) {
                           if (!(this.field10832.field841 >= var17 / var9)) {
                              if (arg1 != null || this.field10836 != null) {
                                 class211.field3156 = var5.field8098 * var6.field8098 + var5.field8130 * var6.field8127 + var5.field8110 * var6.field8118;
                                 class247.field3543 = var5.field8127 * var6.field8098 + var5.field8103 * var6.field8118 + var5.field8099 * var6.field8127;
                                 class275.field3897 = var5.field8118 * var6.field8130 + var5.field8123 * var6.field8099 + var5.field8095 * var6.field8123;
                                 class170.field2647 = var5.field8127 * var6.field8130 + var5.field8103 * var6.field8123 + var5.field8099 * var6.field8099;
                                 class29.field456 = var5.field8098 * var6.field8130 + var5.field8130 * var6.field8099 + var5.field8110 * var6.field8123;
                                 class331.field4738 = var5.field8118 * var6.field8098 + var5.field8123 * var6.field8127 + var5.field8095 * var6.field8118;
                              }

                              if (arg1 != null) {
                                 boolean var19;
                                 boolean var20;
                                 int var21;
                                 int var22;
                                 int var23;
                                 int var24;
                                 int var25;
                                 label109: {
                                    var19 = false;
                                    var20 = true;
                                    var21 = this.field10875 - -this.field10917 >> 1;
                                    var22 = this.field10919 + this.field10884 >> 1;
                                    var23 = (int)((float)var22 * class247.field3543 + (float)this.field10839 * class306.field4425 + (float)var21 * class170.field2647 + class251.field3596);
                                    var24 = (int)((float)var22 * class331.field4738 + (float)this.field10839 * class340.field4840 + (float)var21 * class275.field3897 + class127.field2130);
                                    var25 = (int)((float)var22 * class211.field3156 + (float)this.field10839 * class366.field5442 + (float)var21 * class29.field456 + class524.field7669);
                                    if (var25 < this.field10832.field829) {
                                       var19 = true;
                                       if (!var4) {
                                          break label109;
                                       }
                                    }

                                    arg1.field5408 = this.field10832.field834 * var24 / var25 + this.field10832.field800;
                                    arg1.field5411 = this.field10832.field803 * var23 / var25 + this.field10832.field861;
                                 }

                                 int var26;
                                 int var27;
                                 int var28;
                                 label104: {
                                    var26 = (int)((float)var22 * class247.field3543 + (float)this.field10881 * class306.field4425 + (float)var21 * class170.field2647 + class251.field3596);
                                    var27 = (int)((float)var22 * class331.field4738 + (float)this.field10881 * class340.field4840 + (float)var21 * class275.field3897 + class127.field2130);
                                    var28 = (int)((float)var22 * class211.field3156 + (float)this.field10881 * class366.field5442 + (float)var21 * class29.field456 + class524.field7669);
                                    if (~this.field10832.field829 >= ~var28) {
                                       arg1.field5407 = this.field10832.field861 - -(this.field10832.field803 * var26 / var28);
                                       arg1.field5410 = this.field10832.field834 * var27 / var28 + this.field10832.field800;
                                       if (!var4) {
                                          break label104;
                                       }
                                    }

                                    var19 = true;
                                 }

                                 if (var19) {
                                    label158: {
                                       if (~var25 > ~this.field10832.field829 && var28 < this.field10832.field829) {
                                          var20 = false;
                                          if (!var4) {
                                             break label158;
                                          }
                                       }

                                       if (this.field10832.field829 <= var25) {
                                          if (~var28 <= ~this.field10832.field829) {
                                             break label158;
                                          }

                                          int var29 = (-this.field10832.field829 + var25 << 16) / (-var28 + var25);
                                          int var30 = ((var23 - var26) * var29 >> 16) + var23;
                                          arg1.field5411 = this.field10832.field803 * var30 / this.field10832.field829 + this.field10832.field861;
                                          int var31 = var24 - -((-var27 + var24) * var29 >> 16);
                                          arg1.field5408 = this.field10832.field834 * var31 / this.field10832.field829 + this.field10832.field800;
                                          if (!var4) {
                                             break label158;
                                          }
                                       }

                                       int var32 = (var28 - this.field10832.field829 << 16) / (var28 - var25);
                                       int var33 = var26 - -((var26 - var23) * var32 >> 16);
                                       arg1.field5411 = this.field10832.field803 * var33 / this.field10832.field829 + this.field10832.field861;
                                       int var34 = ((-var24 + var27) * var32 >> 16) + var27;
                                       arg1.field5408 = this.field10832.field834 * var34 / this.field10832.field829 + this.field10832.field800;
                                    }
                                 }

                                 if (var20) {
                                    label85: {
                                       if (var25 <= var28) {
                                          arg1.field5409 = (this.field10921 + var26) * this.field10832.field803 / var28 + this.field10832.field861 + -arg1.field5407;
                                          if (!var4) {
                                             break label85;
                                          }
                                       }

                                       arg1.field5409 = -arg1.field5411 + this.field10832.field861 - -((this.field10921 + var23) * this.field10832.field803 / var25);
                                    }

                                    arg1.field5406 = true;
                                 }
                              }

                              this.field10832.method370(119);
                              this.field10832.method435(true, var6);
                              this.method5456((byte)-127);
                              this.field10832.method401(-22939);
                              this.method5461((byte)-126);
                           }
                        }
                     }
                  }
               }
            }
         }
      } catch (RuntimeException var36) {
         throw class608.method4462(var36, field10952[10] + (arg0 != null ? field10952[11] : field10952[9]) + ',' + (arg1 != null ? field10952[11] : field10952[9]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IIII)V",
      line = 3102
   )
   public final void method522(int arg0, int arg1, int arg2, int arg3) {
      boolean var5 = client.field4564;

      try {
         int var6 = 0;
         int var7;
         int var8;
         int var9;
         int var10;
         if (var5) {
            var7 = 65535 & this.field10835[var6];
            var8 = (var7 & 65066) >> 10;
            var9 = (var7 & 920) >> 7;
            if (~arg0 != 0) {
               var8 += (-var8 + arg0) * arg3 >> 7;
            }

            if (arg1 != -1) {
               var9 += (-var9 + arg1) * arg3 >> 7;
            }

            var10 = var7 & 127;
            if (~arg2 != 0) {
               var10 -= -((-var10 + arg2) * arg3 >> 7);
            }

            this.field10835[var6] = (short)class93.method899(class93.method899(var9 << 7, var8 << 10), var10);
            ++var6;
         }

         while(true) {
            int var10000;
            if (~var6 <= ~this.field10939) {
               var10000 = field10865 + 1;
               if (!var5) {
                  field10865 = var10000;
                  if (this.field10836 != null) {
                     int var11 = 0;
                     if (var5 || ~this.field10900 < ~var11) {
                        do {
                           class478 var12 = this.field10836[var11];
                           class205 var13 = this.field10935[var11];
                           var13.field3060 = 16777215 & class451.field6600[65535 & this.field10835[var12.field6965]] | var13.field3060 & -16777216;
                           ++var11;
                        } while(~this.field10900 < ~var11);
                     }
                  }

                  if (this.field10894 != null) {
                     this.field10894.field9358 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = 65535 & this.field10835[var6];
            }

            var7 = var10000;
            var8 = (var7 & 65066) >> 10;
            var9 = (var7 & 920) >> 7;
            if (~arg0 != 0) {
               var8 += (-var8 + arg0) * arg3 >> 7;
            }

            if (arg1 != -1) {
               var9 += (-var9 + arg1) * arg3 >> 7;
            }

            var10 = var7 & 127;
            if (~arg2 != 0) {
               var10 -= -((-var10 + arg2) * arg3 >> 7);
            }

            this.field10835[var6] = (short)class93.method899(class93.method899(var9 << 7, var8 << 10), var10);
            ++var6;
         }
      } catch (RuntimeException var15) {
         throw class608.method4462(var15, field10952[56] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "aa",
      descriptor = "(SS)V",
      line = 3160
   )
   public final void method502(short arg0, short arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10930;
         class160 var4 = this.field10832.field1192;
         int var5 = 0;
         if (var3) {
            if (~this.field10947[var5] == ~arg0) {
               this.field10947[var5] = arg1;
            }

            ++var5;
         }

         while(true) {
            while(~var5 > ~this.field10939) {
               if (~this.field10947[var5] == ~arg0) {
                  this.field10947[var5] = arg1;
               }

               ++var5;
            }

            byte var6 = 0;
            byte var7 = 0;
            if (!var3) {
               if (arg0 != -1) {
                  class693 var8 = var4.method1456(-8988, 65535 & arg0);
                  var6 = var8.field10154;
                  var7 = var8.field10170;
               }

               byte var9 = 0;
               byte var10 = 0;
               if (~arg1 != 0) {
                  class693 var11 = var4.method1456(-8988, arg1 & 65535);
                  var10 = var11.field10170;
                  var9 = var11.field10154;
                  if (~var11.field10152 != -1 || var11.field10173 != 0) {
                     this.field10831 = true;
                  }
               }

               if (var7 != var10 | ~var6 != ~var9) {
                  if (this.field10836 != null) {
                     int var12 = 0;
                     if (var3 || var12 < this.field10900) {
                        do {
                           class478 var13 = this.field10836[var12];
                           class205 var14 = this.field10935[var12];
                           var14.field3060 = -16777216 & var14.field3060 | 16777215 & class451.field6600[65535 & this.field10835[var13.field6965]];
                           ++var12;
                        } while(var12 < this.field10900);
                     }
                  }

                  if (this.field10894 != null) {
                     this.field10894.field9358 = null;
                     return;
                  }
               }

               return;
            }

            if (arg0 == -1) {
               this.field10947[var5] = arg1;
            }

            ++var5;
         }
      } catch (RuntimeException var16) {
         throw class608.method4462(var16, field10952[21] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Ldfa;IZ)V",
      line = 3236
   )
   public final void method519(class173 param1, int param2, boolean param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(B)V",
      line = 3274
   )
   private final void method5458(byte arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10916;
         if (this.field10931) {
            this.field10931 = false;
            if (this.field10876 == null && this.field10941 == null && this.field10836 == null && !class440.method3314(this.field10882, this.field10899, true)) {
               boolean var3 = false;
               boolean var4 = false;
               if (this.field10901 != null && !class465.method3486(this.field10882, this.field10899, (byte)78)) {
                  label312: {
                     if (this.field10844 != null && this.field10844.field9358 == null) {
                        this.field10931 = true;
                        if (!var2) {
                           break label312;
                        }
                     }

                     var3 = true;
                     if (!this.field10858) {
                        this.method5455(-32768);
                     }
                  }
               }

               boolean var5 = false;
               if (this.field10854 != null && !class386.method2996(this.field10882, this.field10899, (byte)23)) {
                  label322: {
                     if (this.field10844 == null || this.field10844.field9358 != null) {
                        if (!this.field10858) {
                           this.method5455(-32768);
                        }

                        var4 = true;
                        if (!var2) {
                           break label322;
                        }
                     }

                     this.field10931 = true;
                  }
               }

               if (this.field10870 != null && !class533.method3990(this.field10882, this.field10899, -12356)) {
                  label323: {
                     if (this.field10844 == null || this.field10844.field9358 != null) {
                        var5 = true;
                        if (this.field10858) {
                           break label323;
                        }

                        this.method5455(-32768);
                        if (!var2) {
                           break label323;
                        }
                     }

                     this.field10931 = true;
                  }
               }

               if (var3) {
                  this.field10901 = null;
               }

               if (var5) {
                  this.field10870 = null;
               }

               if (var4) {
                  this.field10854 = null;
               }
            }

            if (this.field10833 != null && this.field10901 == null && this.field10854 == null && this.field10870 == null) {
               this.field10833 = null;
               this.field10869 = null;
            }

            if (this.field10878 != null && !class265.method2116(this.field10899, false, this.field10882)) {
               label308: {
                  if (this.field10864 != null) {
                     if (this.field10864.field9358 == null) {
                        this.field10931 = true;
                        if (!var2) {
                           break label308;
                        }
                     }

                     this.field10878 = null;
                     this.field10846 = this.field10902 = this.field10892 = null;
                     if (!var2) {
                        break label308;
                     }
                  }

                  if (this.field10894 != null && this.field10894.field9358 == null) {
                     this.field10931 = true;
                     if (!var2) {
                        break label308;
                     }
                  }

                  this.field10846 = this.field10902 = this.field10892 = null;
                  this.field10878 = null;
               }
            }

            if (this.field10835 != null && !class443.method3335(this.field10899, (byte)98, this.field10882)) {
               label324: {
                  if (this.field10894 == null || this.field10894.field9358 != null) {
                     this.field10835 = null;
                     if (!var2) {
                        break label324;
                     }
                  }

                  this.field10931 = true;
               }
            }

            if (this.field10855 != null && !class206.method1749(7002, this.field10882, this.field10899)) {
               label325: {
                  if (this.field10894 == null || this.field10894.field9358 != null) {
                     this.field10855 = null;
                     if (!var2) {
                        break label325;
                     }
                  }

                  this.field10931 = true;
               }
            }

            if (this.field10944 != null && !class234.method1926(this.field10899, this.field10882, 65)) {
               label326: {
                  if (this.field10925 == null || this.field10925.field9358 != null) {
                     this.field10944 = this.field10938 = null;
                     if (!var2) {
                        break label326;
                     }
                  }

                  this.field10931 = true;
               }
            }

            if (this.field10947 != null && !class488.method3684(false, this.field10899, this.field10882)) {
               label327: {
                  if (this.field10894 == null || this.field10894.field9358 != null) {
                     this.field10947 = null;
                     if (!var2) {
                        break label327;
                     }
                  }

                  this.field10931 = true;
               }
            }

            if (this.field10852 != null && !class786.method5664((byte)-84, this.field10882, this.field10899)) {
               label328: {
                  if ((this.field10932 == null || this.field10932.field6929 != null) && (this.field10894 == null || this.field10894.field9358 != null)) {
                     this.field10852 = this.field10859 = this.field10897 = null;
                     if (!var2) {
                        break label328;
                     }
                  }

                  this.field10931 = true;
               }
            }

            if (this.field10904 != null && !class301.method2351(this.field10899, true, this.field10882)) {
               this.field10904 = null;
               this.field10885 = null;
            }

            if (arg0 >= 77) {
               if (this.field10898 != null && !class680.method4962(this.field10899, this.field10882, (byte)93)) {
                  this.field10898 = null;
                  this.field10909 = null;
               }

               if (this.field10860 != null && !class446.method3362(this.field10899, this.field10882, -32)) {
                  this.field10860 = null;
               }

               if (this.field10912 != null && ~(2048 & this.field10899) == -1 && ~(262144 & this.field10899) == -1) {
                  this.field10912 = null;
               }
            }
         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10952[55] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "VA",
      descriptor = "(I)V",
      line = 3466
   )
   public final void method538(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10838;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         class753 var10000;
         if (var2) {
            var10000 = this;
         } else if (this.field10862 <= var5) {
            this.field10858 = false;
            var10000 = this;
            if (!var2) {
               if (this.field10844 != null) {
                  this.field10844.field9358 = null;
                  return;
               }

               return;
            }
         } else {
            var10000 = this;
         }

         while(true) {
            int var6 = var10000.field10901[var5] * var4 + this.field10854[var5] * var3 >> 14;
            this.field10854[var5] = this.field10854[var5] * var4 + -(this.field10901[var5] * var3) >> 14;
            this.field10901[var5] = var6;
            ++var5;
            if (this.field10862 <= var5) {
               this.field10858 = false;
               var10000 = this;
               if (!var2) {
                  if (this.field10844 != null) {
                     this.field10844.field9358 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10952[54] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "FA",
      descriptor = "(I)V",
      line = 3500
   )
   public final void method524(int arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10946;
         int var3 = class593.field8539[arg0];
         int var4 = class593.field8548[arg0];
         int var5 = 0;
         if (!var2 && ~this.field10862 >= ~var5) {
            if (this.field10844 != null) {
               this.field10844.field9358 = null;
            }

            this.field10858 = false;
         } else {
            do {
               int var6 = this.field10854[var5] * var4 + -(this.field10870[var5] * var3) >> 14;
               this.field10870[var5] = this.field10870[var5] * var4 + this.field10854[var5] * var3 >> 14;
               this.field10854[var5] = var6;
               ++var5;
            } while(~this.field10862 < ~var5);

            if (this.field10844 != null) {
               this.field10844.field9358 = null;
            }

            this.field10858 = false;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10952[44] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "f",
      descriptor = "()[Ltf;",
      line = 3531
   )
   public final class309[] method515() {
      try {
         ++field10850;
         return this.field10876;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[59] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "fa",
      descriptor = "()I",
      line = 3539
   )
   public final int method540() {
      try {
         ++field10837;
         if (!this.field10858) {
            this.method5455(-32768);
         }

         return this.field10839;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[7] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "V",
      descriptor = "()I",
      line = 3551
   )
   public final int method528() {
      try {
         ++field10840;
         if (!this.field10858) {
            this.method5455(-32768);
         }

         return this.field10875;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[16] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Lph;IIJFFIIII)S",
      line = 3562
   )
   private final short method5459(class668 arg0, int arg1, int arg2, long arg3, float arg4, float arg5, int arg6, int arg7, int arg8, int arg9) {
      boolean var12 = client.field4564;

      try {
         ++field10927;
         int var13 = this.field10869[arg8];
         int var14 = this.field10869[arg2 + arg8];
         int var15 = 0;
         int var16 = var13;
         short var10000;
         if (var12) {
            var10000 = this.field10833[var13];
         } else if (var14 <= var13) {
            this.field10833[var15] = (short)(this.field10928 + 1);
            class279.field3919[var15] = arg3;
            this.field10846[this.field10928] = (short)arg9;
            this.field10902[this.field10928] = (short)arg6;
            this.field10892[this.field10928] = (short)arg7;
            this.field10878[this.field10928] = (byte)arg1;
            this.field10944[this.field10928] = arg5;
            this.field10938[this.field10928] = arg4;
            var10000 = (short)(this.field10928++);
            if (!var12) {
               return var10000;
            }
         } else {
            var10000 = this.field10833[var13];
         }

         do {
            while(true) {
               short var17 = var10000;
               if (~var17 == -1) {
                  var15 = var16;
                  if (!var12) {
                     this.field10833[var16] = (short)(this.field10928 + 1);
                     class279.field3919[var16] = arg3;
                     this.field10846[this.field10928] = (short)arg9;
                     this.field10902[this.field10928] = (short)arg6;
                     this.field10892[this.field10928] = (short)arg7;
                     this.field10878[this.field10928] = (byte)arg1;
                     this.field10944[this.field10928] = arg5;
                     this.field10938[this.field10928] = arg4;
                     var10000 = (short)(this.field10928++);
                     break;
                  }

                  if (~class279.field3919[var16] == ~arg3) {
                     return (short)(var17 - 1);
                  }

                  ++var16;
               } else {
                  if (~class279.field3919[var16] == ~arg3) {
                     return (short)(var17 - 1);
                  }

                  ++var16;
               }

               if (var14 <= var16) {
                  this.field10833[var15] = (short)(this.field10928 + 1);
                  class279.field3919[var15] = arg3;
                  this.field10846[this.field10928] = (short)arg9;
                  this.field10902[this.field10928] = (short)arg6;
                  this.field10892[this.field10928] = (short)arg7;
                  this.field10878[this.field10928] = (byte)arg1;
                  this.field10944[this.field10928] = arg5;
                  this.field10938[this.field10928] = arg4;
                  var10000 = (short)(this.field10928++);
                  if (!var12) {
                     return var10000;
                  }
               } else {
                  var10000 = this.field10833[var16];
               }
            }
         } while(var12);

         return var10000;
      } catch (RuntimeException var19) {
         throw class608.method4462(var19, field10952[32] + (arg0 != null ? field10952[11] : field10952[9]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "(B)V",
      line = 3607
   )
   public static void method5460(byte arg0) {
      try {
         if (arg0 >= 35) {
            field10848 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IILdfa;ZI)Z",
      line = 3617
   )
   public final boolean method521(int arg0, int arg1, class173 arg2, boolean arg3, int arg4) {
      try {
         ++field10893;
         return this.method5454(arg3, 104, arg0, arg4, arg2, -1, arg1);
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field10952[45] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10952[11] : field10952[9]) + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "ma",
      descriptor = "()I",
      line = 3636
   )
   public final int method548() {
      try {
         ++field10861;
         if (!this.field10858) {
            this.method5455(-32768);
         }

         return this.field10926;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[51] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "F",
      descriptor = "()Z",
      line = 3649
   )
   public final boolean method516() {
      try {
         ++field10920;
         return this.field10880;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[42] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "I",
      descriptor = "(I[IIIIZI[I)V",
      line = 3661
   )
   public final void method550(int arg0, int[] arg1, int arg2, int arg3, int arg4, boolean arg5, int arg6, int[] arg7) {
      boolean var9 = client.field4564;

      try {
         ++field10940;
         int var10 = arg1.length;
         int var10000;
         if (~arg0 != -1) {
            if (~arg0 == -2) {
               if (arg7 != null) {
                  int var17 = arg7[1] * arg3 + 8192 + arg7[0] * arg2 + arg7[2] * arg4 >> 14;
                  int var18 = arg7[5] * arg4 + arg7[4] * arg3 + arg7[3] * arg2 + 8192 >> 14;
                  int var19 = arg7[8] * arg4 + arg7[6] * arg2 - -(arg7[7] * arg3) + 8192 >> 14;
                  arg4 = var19;
                  arg2 = var17;
                  arg3 = var18;
               }

               arg2 <<= 4;
               arg3 <<= 4;
               arg4 <<= 4;
               int var20 = 0;
               if (var9 || var10 > var20) {
                  do {
                     int var21 = arg1[var20];
                     if (this.field10898.length <= var21) {
                        ++var20;
                     } else {
                        int[] var22 = this.field10898[var21];
                        int var23 = 0;
                        if (!var9 && var23 >= var22.length) {
                           ++var20;
                        } else {
                           do {
                              int var24 = var22[var23];
                              if (this.field10909 != null && (this.field10909[var24] & arg6) == 0) {
                                 ++var23;
                              } else {
                                 this.field10901[var24] += arg2;
                                 this.field10854[var24] += arg3;
                                 this.field10870[var24] += arg4;
                                 ++var23;
                              }
                           } while(var23 < var22.length);

                           ++var20;
                        }
                     }
                  } while(var10 > var20);

               }
            } else if (~arg0 == -3) {
               if (arg7 == null) {
                  label436: {
                     int var25 = 0;
                     if (var9) {
                        var10000 = arg1[var25];
                     } else if (var25 >= var10) {
                        var10000 = arg5;
                        if (!var9) {
                           break label436;
                        }
                     } else {
                        var10000 = arg1[var25];
                     }

                     while(true) {
                        int var26 = var10000;
                        if (var26 >= this.field10898.length) {
                           ++var25;
                        } else {
                           int[] var27 = this.field10898[var26];
                           int var28 = 0;
                           if (!var9 && ~var28 <= ~var27.length) {
                              ++var25;
                           } else {
                              while(true) {
                                 int var29 = var27[var28];
                                 if (this.field10909 != null && (arg6 & this.field10909[var29]) == 0) {
                                    ++var28;
                                 } else {
                                    this.field10901[var29] -= class572.field8271;
                                    this.field10854[var29] -= class440.field6424;
                                    this.field10870[var29] -= class154.field2449;
                                    if (arg4 != 0) {
                                       int var30 = class593.field8539[arg4];
                                       int var31 = class593.field8548[arg4];
                                       int var32 = this.field10901[var29] * var31 + this.field10854[var29] * var30 + 16383 >> 14;
                                       this.field10854[var29] = this.field10854[var29] * var31 + -(this.field10901[var29] * var30) + 16383 >> 14;
                                       this.field10901[var29] = var32;
                                    }

                                    if (~arg2 != -1) {
                                       int var33 = class593.field8539[arg2];
                                       int var34 = class593.field8548[arg2];
                                       int var35 = this.field10854[var29] * var34 - this.field10870[var29] * var33 + 16383 >> 14;
                                       this.field10870[var29] = this.field10854[var29] * var33 - -(this.field10870[var29] * var34) + 16383 >> 14;
                                       this.field10854[var29] = var35;
                                    }

                                    if (~arg3 != -1) {
                                       int var36 = class593.field8539[arg3];
                                       int var37 = class593.field8548[arg3];
                                       int var38 = this.field10901[var29] * var37 + (this.field10870[var29] * var36 - -16383) >> 14;
                                       this.field10870[var29] = this.field10870[var29] * var37 - this.field10901[var29] * var36 + 16383 >> 14;
                                       this.field10901[var29] = var38;
                                    }

                                    this.field10901[var29] += class572.field8271;
                                    this.field10854[var29] += class440.field6424;
                                    this.field10870[var29] += class154.field2449;
                                    ++var28;
                                 }

                                 if (~var28 <= ~var27.length) {
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
                     if (var9 || ~var10 < ~var39) {
                        do {
                           int var40 = arg1[var39];
                           if (~var40 <= ~this.field10898.length) {
                              ++var39;
                           } else {
                              int[] var41 = this.field10898[var40];
                              int var42 = 0;
                              if (!var9 && var42 >= var41.length) {
                                 ++var39;
                              } else {
                                 label389:
                                 do {
                                    int var43 = var41[var42];
                                    if (this.field10909 != null && ~(this.field10909[var43] & arg6) == -1) {
                                       ++var42;
                                    } else {
                                       int var44 = this.field10869[var43];
                                       int var45 = this.field10869[var43 + 1];
                                       int var46 = var44;
                                       if (!var9 && ~var45 >= ~var44) {
                                          ++var42;
                                       } else {
                                          do {
                                             int var47 = this.field10833[var46] - 1;
                                             if (~var47 == 0) {
                                                ++var42;
                                                continue label389;
                                             }

                                             if (arg4 != 0) {
                                                int var48 = class593.field8539[arg4];
                                                int var49 = class593.field8548[arg4];
                                                int var50 = this.field10902[var47] * var48 + this.field10846[var47] * var49 + 16383 >> 14;
                                                this.field10902[var47] = (short)(this.field10902[var47] * var49 + 16383 + -(this.field10846[var47] * var48) >> 14);
                                                this.field10846[var47] = (short)var50;
                                             }

                                             if (~arg2 != -1) {
                                                int var51 = class593.field8539[arg2];
                                                int var52 = class593.field8548[arg2];
                                                int var53 = this.field10902[var47] * var52 - this.field10892[var47] * var51 + 16383 >> 14;
                                                this.field10892[var47] = (short)(this.field10902[var47] * var51 + this.field10892[var47] * var52 - -16383 >> 14);
                                                this.field10902[var47] = (short)var53;
                                             }

                                             if (arg3 != 0) {
                                                int var54 = class593.field8539[arg3];
                                                int var55 = class593.field8548[arg3];
                                                int var56 = this.field10892[var47] * var54 + this.field10846[var47] * var55 - -16383 >> 14;
                                                this.field10892[var47] = (short)(this.field10892[var47] * var55 + -(this.field10846[var47] * var54) + 16383 >> 14);
                                                this.field10846[var47] = (short)var56;
                                             }

                                             ++var46;
                                          } while(~var45 < ~var46);

                                          ++var42;
                                       }
                                    }
                                 } while(var42 < var41.length);

                                 ++var39;
                              }
                           }
                        } while(~var10 < ~var39);
                     }

                     if (this.field10864 == null && this.field10894 != null) {
                        this.field10894.field9358 = null;
                     }

                     if (this.field10864 != null) {
                        this.field10864.field9358 = null;
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
                  if (class752.field10826) {
                     int var63 = arg7[3] * class440.field6424 + arg7[6] * class154.field2449 + arg7[0] * class572.field8271 + 8192 >> 14;
                     int var64 = arg7[1] * class572.field8271 + arg7[7] * class154.field2449 + arg7[4] * class440.field6424 + 8192 >> 14;
                     int var65 = arg7[8] * class154.field2449 + arg7[5] * class440.field6424 + arg7[2] * class572.field8271 + 8192 >> 14;
                     int var66 = var60 + var63;
                     int var67 = var61 + var64;
                     int var68 = var62 + var65;
                     class572.field8271 = var66;
                     class440.field6424 = var67;
                     class752.field10826 = false;
                     class154.field2449 = var68;
                  }

                  int[] var84;
                  int var86;
                  int var91;
                  int var93;
                  int[] var94;
                  int var95;
                  label590: {
                     int[] var69 = new int[9];
                     int var70 = class593.field8548[arg2];
                     int var71 = class593.field8539[arg2];
                     int var72 = class593.field8548[arg3];
                     int var73 = class593.field8539[arg3];
                     int var74 = class593.field8548[arg4];
                     int var75 = class593.field8539[arg4];
                     int var76 = var71 * var74 + 8192 >> 14;
                     int var77 = var71 * var75 + 8192 >> 14;
                     var69[4] = var70 * var74 + 8192 >> 14;
                     var69[0] = var72 * var74 + var73 * var77 + 8192 >> 14;
                     var69[6] = -var73 * var74 + 8192 - -(var72 * var77) >> 14;
                     var69[2] = var70 * var73 + 8192 >> 14;
                     var69[8] = var70 * var72 + 8192 >> 14;
                     var69[3] = var70 * var75 + 8192 >> 14;
                     var69[7] = var72 * var76 + var73 * var75 + 8192 >> 14;
                     var69[1] = -var72 * var75 + var73 * var76 + 8192 >> 14;
                     var69[5] = -var71;
                     int var78 = var69[1] * -class440.field6424 + var69[2] * -class154.field2449 + var69[0] * -class572.field8271 - -8192 >> 14;
                     int var79 = var69[5] * -class154.field2449 + 8192 + var69[4] * -class440.field6424 + var69[3] * -class572.field8271 >> 14;
                     int var80 = var69[6] * -class572.field8271 + (var69[7] * -class440.field6424 - -(var69[8] * -class154.field2449)) - -8192 >> 14;
                     int var81 = class572.field8271 + var78;
                     int var82 = var79 - -class440.field6424;
                     int var83 = class154.field2449 + var80;
                     var84 = new int[9];
                     int var85 = 0;
                     int var89;
                     int var90;
                     int var92;
                     if (var9) {
                        var86 = 0;
                     } else if (var85 >= 3) {
                        var89 = var69[2] * var62 + (var69[0] * var60 - -(var69[1] * var61)) - -8192 >> 14;
                        var90 = var69[5] * var62 + 8192 + var69[3] * var60 + var69[4] * var61 >> 14;
                        var91 = var82 + var90;
                        var92 = var69[8] * var62 + var69[6] * var60 + var69[7] * var61 + 8192 >> 14;
                        var86 = var81 + var89;
                        var93 = var83 + var92;
                        var94 = new int[9];
                        var95 = 0;
                        if (!var9) {
                           break label590;
                        }
                     } else {
                        var86 = 0;
                     }

                     while(true) {
                        label587: {
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
                                 break label587;
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

                              var84[var85 * 3 - -var86] = var87 - -8192 >> 14;
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
                        if (var85 >= 3) {
                           var89 = var69[2] * var62 + (var69[0] * var60 - -(var69[1] * var61)) - -8192 >> 14;
                           var90 = var69[5] * var62 + 8192 + var69[3] * var60 + var69[4] * var61 >> 14;
                           var91 = var82 + var90;
                           var92 = var69[8] * var62 + var69[6] * var60 + var69[7] * var61 + 8192 >> 14;
                           var86 = var81 + var89;
                           var93 = var83 + var92;
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
                  label529: {
                     int var99;
                     int var100;
                     int var101;
                     if (var9) {
                        var96 = 0;
                     } else if (var95 >= 3) {
                        var99 = arg7[0] * var86 - -(arg7[1] * var91) + 8192 - -(arg7[2] * var93) >> 14;
                        var100 = arg7[5] * var93 + arg7[4] * var91 + arg7[3] * var86 + 8192 >> 14;
                        var101 = arg7[7] * var91 + arg7[6] * var86 + arg7[8] * var93 + 8192 >> 14;
                        var102 = var58 + var100;
                        var96 = var57 + var99;
                        var103 = var59 + var101;
                        var104 = 0;
                        if (!var9) {
                           break label529;
                        }
                     } else {
                        var96 = 0;
                     }

                     while(true) {
                        label526: {
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
                              if (var96 >= 3) {
                                 break label526;
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

                              var94[var95 * 3 - -var96] = var97 + 8192 >> 14;
                              if (!var9) {
                                 ++var96;
                                 if (var96 >= 3) {
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
                        if (var95 >= 3) {
                           var99 = arg7[0] * var86 - -(arg7[1] * var91) + 8192 - -(arg7[2] * var93) >> 14;
                           var100 = arg7[5] * var93 + arg7[4] * var91 + arg7[3] * var86 + 8192 >> 14;
                           var101 = arg7[7] * var91 + arg7[6] * var86 + arg7[8] * var93 + 8192 >> 14;
                           var102 = var58 + var100;
                           var96 = var57 + var99;
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

                  if (var9 || ~var104 > ~var10) {
                     do {
                        int var105 = arg1[var104];
                        if (~this.field10898.length >= ~var105) {
                           ++var104;
                        } else {
                           int[] var106 = this.field10898[var105];
                           int var107 = 0;
                           if (!var9 && var107 >= var106.length) {
                              ++var104;
                           } else {
                              do {
                                 int var108 = var106[var107];
                                 if (this.field10909 != null && ~(this.field10909[var108] & arg6) == -1) {
                                    ++var107;
                                 } else {
                                    int var109 = this.field10901[var108] * var94[0] + 8192 - -(this.field10854[var108] * var94[1]) - -(this.field10870[var108] * var94[2]) >> 14;
                                    int var110 = this.field10901[var108] * var94[3] + this.field10854[var108] * var94[4] + this.field10870[var108] * var94[5] + 8192 >> 14;
                                    int var111 = this.field10870[var108] * var94[8] + this.field10901[var108] * var94[6] + this.field10854[var108] * var94[7] - -8192 >> 14;
                                    int var112 = var96 + var109;
                                    int var113 = var102 + var110;
                                    this.field10901[var108] = var112;
                                    int var114 = var103 + var111;
                                    this.field10854[var108] = var113;
                                    this.field10870[var108] = var114;
                                    ++var107;
                                 }
                              } while(var107 < var106.length);

                              ++var104;
                           }
                        }
                     } while(~var104 > ~var10);
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
                  if (class752.field10826) {
                     int var126 = arg7[0] * class572.field8271 + 8192 - (-(arg7[3] * class440.field6424) + -(arg7[6] * class154.field2449)) >> 14;
                     int var127 = arg7[7] * class154.field2449 + arg7[4] * class440.field6424 + arg7[1] * class572.field8271 - -8192 >> 14;
                     int var128 = var124 + var127;
                     int var129 = arg7[2] * class572.field8271 + 8192 - (-(arg7[5] * class440.field6424) - arg7[8] * class154.field2449) >> 14;
                     int var130 = var123 + var126;
                     class440.field6424 = var128;
                     class572.field8271 = var130;
                     int var131 = var125 + var129;
                     class154.field2449 = var131;
                     class752.field10826 = false;
                  }

                  int[] var148;
                  int var150;
                  int var156;
                  int var157;
                  int var158;
                  label656: {
                     int var132 = arg2 << 15 >> 7;
                     int var133 = arg3 << 15 >> 7;
                     int var134 = arg4 << 15 >> 7;
                     int var135 = -class572.field8271 * var132 - -8192 >> 14;
                     int var136 = -class440.field6424 * var133 - -8192 >> 14;
                     int var137 = -class154.field2449 * var134 - -8192 >> 14;
                     int var138 = class572.field8271 + var135;
                     int var139 = var136 - -class440.field6424;
                     int var140 = class154.field2449 + var137;
                     int[] var141 = new int[]{arg7[0] * var132 - -8192 >> 14, arg7[3] * var132 - -8192 >> 14, arg7[6] * var132 + 8192 >> 14, arg7[1] * var133 + 8192 >> 14, arg7[4] * var133 + 8192 >> 14, arg7[7] * var133 + 8192 >> 14, arg7[2] * var134 + 8192 >> 14, arg7[5] * var134 + 8192 >> 14, arg7[8] * var134 + 8192 >> 14};
                     int var142 = var123 * var132 - -8192 >> 14;
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
                     } else if (~var149 <= -4) {
                        var153 = arg7[0] * var146 + arg7[1] * var144 + arg7[2] * var147 + 8192 >> 14;
                        var154 = arg7[4] * var144 + arg7[5] * var147 + arg7[3] * var146 - -8192 >> 14;
                        var155 = arg7[7] * var144 + (arg7[6] * var146 - -(arg7[8] * var147)) + 8192 >> 14;
                        var156 = var121 + var154;
                        var150 = var120 + var153;
                        var157 = var122 + var155;
                        var158 = 0;
                        if (!var9) {
                           break label656;
                        }
                     } else {
                        var150 = 0;
                     }

                     while(true) {
                        label653: {
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
                                 break label653;
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

                              var148[var149 * 3 + var150] = var151 + 8192 >> 14;
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
                        if (~var149 <= -4) {
                           var153 = arg7[0] * var146 + arg7[1] * var144 + arg7[2] * var147 + 8192 >> 14;
                           var154 = arg7[4] * var144 + arg7[5] * var147 + arg7[3] * var146 - -8192 >> 14;
                           var155 = arg7[7] * var144 + (arg7[6] * var146 - -(arg7[8] * var147)) + 8192 >> 14;
                           var156 = var121 + var154;
                           var150 = var120 + var153;
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

                  if (var9 || var10 > var158) {
                     do {
                        int var159 = arg1[var158];
                        if (this.field10898.length <= var159) {
                           ++var158;
                        } else {
                           int[] var160 = this.field10898[var159];
                           int var161 = 0;
                           if (!var9 && var160.length <= var161) {
                              ++var158;
                           } else {
                              do {
                                 int var162 = var160[var161];
                                 if (this.field10909 != null && ~(arg6 & this.field10909[var162]) == -1) {
                                    ++var161;
                                 } else {
                                    int var163 = this.field10870[var162] * var148[2] + (this.field10901[var162] * var148[0] - -(this.field10854[var162] * var148[1])) - -8192 >> 14;
                                    int var164 = this.field10901[var162] * var148[3] + this.field10854[var162] * var148[4] - -(this.field10870[var162] * var148[5]) + 8192 >> 14;
                                    int var165 = var156 + var164;
                                    int var166 = this.field10901[var162] * var148[6] + this.field10854[var162] * var148[7] - -(this.field10870[var162] * var148[8]) + 8192 >> 14;
                                    int var167 = var150 + var163;
                                    int var168 = var157 + var166;
                                    this.field10901[var162] = var167;
                                    this.field10854[var162] = var165;
                                    this.field10870[var162] = var168;
                                    ++var161;
                                 }
                              } while(var160.length > var161);

                              ++var158;
                           }
                        }
                     } while(var10 > var158);

                  }
               } else {
                  int var115 = 0;
                  if (var9 || var115 < var10) {
                     do {
                        int var116 = arg1[var115];
                        if (~var116 <= ~this.field10898.length) {
                           ++var115;
                        } else {
                           int[] var117 = this.field10898[var116];
                           int var118 = 0;
                           if (!var9 && ~var118 <= ~var117.length) {
                              ++var115;
                           } else {
                              do {
                                 int var119 = var117[var118];
                                 if (this.field10909 != null && ~(arg6 & this.field10909[var119]) == -1) {
                                    ++var118;
                                 } else {
                                    this.field10901[var119] -= class572.field8271;
                                    this.field10854[var119] -= class440.field6424;
                                    this.field10870[var119] -= class154.field2449;
                                    this.field10901[var119] = this.field10901[var119] * arg2 >> 7;
                                    this.field10854[var119] = this.field10854[var119] * arg3 >> 7;
                                    this.field10870[var119] = this.field10870[var119] * arg4 >> 7;
                                    this.field10901[var119] += class572.field8271;
                                    this.field10854[var119] += class440.field6424;
                                    this.field10870[var119] += class154.field2449;
                                    ++var118;
                                 }
                              } while(~var118 > ~var117.length);

                              ++var115;
                           }
                        }
                     } while(var115 < var10);

                  }
               }
            } else if (arg0 == 5) {
               if (this.field10904 != null) {
                  int var169 = 0;
                  if (var9 || var10 > var169) {
                     do {
                        int var170 = arg1[var169];
                        if (var170 >= this.field10904.length) {
                           ++var169;
                        } else {
                           int[] var171 = this.field10904[var170];
                           int var172 = 0;
                           if (!var9 && var172 >= var171.length) {
                              ++var169;
                           } else {
                              do {
                                 int var173 = var171[var172];
                                 if (this.field10885 != null && (this.field10885[var173] & arg6) == 0) {
                                    ++var172;
                                 } else {
                                    int var174 = (255 & this.field10855[var173]) + arg2 * 8;
                                    if (var174 >= 0) {
                                       if (var174 > 255) {
                                          var174 = 255;
                                          if (var9) {
                                             var174 = 0;
                                          }
                                       }
                                    } else {
                                       var174 = 0;
                                    }

                                    this.field10855[var173] = (byte)var174;
                                    if (this.field10894 != null) {
                                       this.field10894.field9358 = null;
                                    }

                                    ++var172;
                                 }
                              } while(var172 < var171.length);

                              ++var169;
                           }
                        }
                     } while(var10 > var169);
                  }

                  if (this.field10836 != null) {
                     int var175 = 0;
                     if (var9 || ~var175 > ~this.field10900) {
                        do {
                           class478 var176 = this.field10836[var175];
                           class205 var177 = this.field10935[var175];
                           var177.field3060 = var177.field3060 & 16777215 | 255 - (255 & this.field10855[var176.field6965]) << 24;
                           ++var175;
                        } while(~var175 > ~this.field10900);
                     }
                  }
               }

            } else if (arg0 == 7) {
               if (this.field10904 != null) {
                  int var178 = 0;
                  if (var9 || var10 > var178) {
                     do {
                        int var179 = arg1[var178];
                        if (var179 >= this.field10904.length) {
                           ++var178;
                        } else {
                           int[] var180 = this.field10904[var179];
                           int var181 = 0;
                           if (!var9 && ~var180.length >= ~var181) {
                              ++var178;
                           } else {
                              do {
                                 int var182 = var180[var181];
                                 if (this.field10885 != null && (arg6 & this.field10885[var182]) == 0) {
                                    ++var181;
                                 } else {
                                    int var183 = 65535 & this.field10835[var182];
                                    int var184 = var183 >> 10 & 63;
                                    int var185 = var183 >> 7 & 7;
                                    int var186 = arg3 / 4 + var185;
                                    int var187 = 127 & var183;
                                    int var188 = arg2 + var184 & 63;
                                    if (var186 < 0) {
                                       var186 = 0;
                                       if (var9 && var186 > 7) {
                                          var186 = 7;
                                       }
                                    } else if (var186 > 7) {
                                       var186 = 7;
                                    }

                                    int var189 = arg4 + var187;
                                    if (~var189 > -1) {
                                       var189 = 0;
                                       if (var9 && ~var189 < -128) {
                                          var189 = 127;
                                       }
                                    } else if (~var189 < -128) {
                                       var189 = 127;
                                    }

                                    this.field10835[var182] = (short)class93.method899(class93.method899(var188 << 10, var186 << 7), var189);
                                    if (this.field10894 != null) {
                                       this.field10894.field9358 = null;
                                    }

                                    ++var181;
                                 }
                              } while(~var180.length < ~var181);

                              ++var178;
                           }
                        }
                     } while(var10 > var178);
                  }

                  if (this.field10836 != null) {
                     int var190 = 0;
                     if (var9 || this.field10900 > var190) {
                        do {
                           class478 var191 = this.field10836[var190];
                           class205 var192 = this.field10935[var190];
                           var192.field3060 = class451.field6600[this.field10835[var191.field6965] & 65535] & 16777215 | var192.field3060 & -16777216;
                           ++var190;
                        } while(this.field10900 > var190);
                     }
                  }
               }

            } else if (~arg0 == -9) {
               if (this.field10860 != null) {
                  int var193 = 0;
                  if (var9 || var193 < var10) {
                     do {
                        int var194 = arg1[var193];
                        if (this.field10860.length <= var194) {
                           ++var193;
                        } else {
                           int[] var195 = this.field10860[var194];
                           int var196 = 0;
                           if (!var9 && var195.length <= var196) {
                              ++var193;
                           } else {
                              do {
                                 class205 var197 = this.field10935[var195[var196]];
                                 var197.field3056 += arg2;
                                 var197.field3051 += arg3;
                                 ++var196;
                              } while(var195.length > var196);

                              ++var193;
                           }
                        }
                     } while(var193 < var10);
                  }
               }

            } else if (arg0 == 10) {
               if (this.field10860 != null) {
                  int var198 = 0;
                  if (var9 || ~var10 < ~var198) {
                     do {
                        int var199 = arg1[var198];
                        if (this.field10860.length <= var199) {
                           ++var198;
                        } else {
                           int[] var200 = this.field10860[var199];
                           int var201 = 0;
                           if (!var9 && ~var201 <= ~var200.length) {
                              ++var198;
                           } else {
                              do {
                                 class205 var202 = this.field10935[var200[var201]];
                                 var202.field3059 = var202.field3059 * arg2 >> 7;
                                 var202.field3054 = var202.field3054 * arg3 >> 7;
                                 ++var201;
                              } while(~var201 > ~var200.length);

                              ++var198;
                           }
                        }
                     } while(~var10 < ~var198);
                  }
               }

            } else if (~arg0 == -10) {
               if (this.field10860 != null) {
                  int var203 = 0;
                  if (var9 || ~var10 < ~var203) {
                     do {
                        int var204 = arg1[var203];
                        if (~this.field10860.length >= ~var204) {
                           ++var203;
                        } else {
                           int[] var205 = this.field10860[var204];
                           int var206 = 0;
                           if (!var9 && ~var206 <= ~var205.length) {
                              ++var203;
                           } else {
                              do {
                                 class205 var207 = this.field10935[var205[var206]];
                                 var207.field3053 = 16383 & var207.field3053 + arg2;
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
            arg4 <<= 4;
            arg2 <<= 4;
            class440.field6424 = 0;
            class572.field8271 = 0;
            class154.field2449 = 0;
            int var11 = 0;
            int var12 = 0;
            if (var9) {
               var10000 = arg1[var12];
            } else if (~var10 >= ~var12) {
               var10000 = ~var11;
               if (!var9) {
                  if (var10000 < -1) {
                     class440.field6424 = class440.field6424 / var11 - -arg3;
                     class752.field10826 = true;
                     class572.field8271 = class572.field8271 / var11 + arg2;
                     class154.field2449 = class154.field2449 / var11 + arg4;
                     return;
                  }

                  class572.field8271 = arg2;
                  class440.field6424 = arg3;
                  class154.field2449 = arg4;
                  return;
               }
            } else {
               var10000 = arg1[var12];
            }

            while(true) {
               int var13 = var10000;
               if (this.field10898.length <= var13) {
                  ++var12;
               } else {
                  int[] var14 = this.field10898[var13];
                  int var15 = 0;
                  int var16;
                  if (var9) {
                     var16 = var14[var15];
                     if (this.field10909 != null) {
                        if (~(arg6 & this.field10909[var16]) != -1) {
                           class572.field8271 += this.field10901[var16];
                           class440.field6424 += this.field10854[var16];
                           class154.field2449 += this.field10870[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class572.field8271 += this.field10901[var16];
                        class440.field6424 += this.field10854[var16];
                        class154.field2449 += this.field10870[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  while(var15 < var14.length) {
                     var16 = var14[var15];
                     if (this.field10909 != null) {
                        if (~(arg6 & this.field10909[var16]) != -1) {
                           class572.field8271 += this.field10901[var16];
                           class440.field6424 += this.field10854[var16];
                           class154.field2449 += this.field10870[var16];
                           ++var11;
                           ++var15;
                        } else {
                           ++var15;
                        }
                     } else {
                        class572.field8271 += this.field10901[var16];
                        class440.field6424 += this.field10854[var16];
                        class154.field2449 += this.field10870[var16];
                        ++var11;
                        ++var15;
                     }
                  }

                  ++var12;
               }

               if (~var10 >= ~var12) {
                  var10000 = ~var11;
                  if (!var9) {
                     if (var10000 < -1) {
                        class440.field6424 = class440.field6424 / var11 - -arg3;
                        class752.field10826 = true;
                        class572.field8271 = class572.field8271 / var11 + arg2;
                        class154.field2449 = class154.field2449 / var11 + arg4;
                        return;
                     }

                     class572.field8271 = arg2;
                     class440.field6424 = arg3;
                     class154.field2449 = arg4;
                     return;
                  }
               } else {
                  var10000 = arg1[var12];
               }
            }
         }
      } catch (RuntimeException var209) {
         throw class608.method4462(var209, field10952[48] + arg0 + ',' + (arg1 != null ? field10952[11] : field10952[9]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + (arg7 != null ? field10952[11] : field10952[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "c",
      descriptor = "()V",
      line = 4643
   )
   public final void method523() {
      try {
         ++field10933;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[29] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "b",
      descriptor = "(B)V",
      line = 4656
   )
   private final void method5461(byte arg0) {
      boolean var2 = client.field4564;

      try {
         int var3 = -46 / ((arg0 - -26) / 52);
         ++field10890;
         if (this.field10836 != null) {
            class558 var4 = this.field10832.field723;
            this.field10832.method436(31);
            this.field10832.method316(!this.field10880);
            this.field10832.method282(false, -8);
            this.field10832.method423((byte)-123, (class642)null, this.field10832.field817, (class642)null, this.field10832.field763);
            int var5 = 0;
            class753 var10000;
            if (var2) {
               var10000 = this;
            } else if (this.field10900 <= var5) {
               this.field10832.method316(true);
               var10000 = this;
               if (!var2) {
                  this.field10832.method401(-22939);
                  return;
               }
            } else {
               var10000 = this;
            }

            while(true) {
               class478 var6 = var10000.field10836[var5];
               class205 var7 = this.field10935[var5];
               if (var6.field6966 && this.field10832.method410()) {
                  ++var5;
               } else {
                  float var8 = (float)(this.field10901[var6.field6967] + this.field10901[var6.field6959] + this.field10901[var6.field6962]) * 0.3333333F;
                  float var9 = (float)(this.field10854[var6.field6967] - (-this.field10854[var6.field6962] + -this.field10854[var6.field6959])) * 0.3333333F;
                  float var10 = (float)(this.field10870[var6.field6967] + this.field10870[var6.field6959] + this.field10870[var6.field6962]) * 0.3333333F;
                  float var11 = class247.field3543 * var10 + class306.field4425 * var9 + class170.field2647 * var8 + class251.field3596;
                  float var12 = class331.field4738 * var10 + class340.field4840 * var9 + class275.field3897 * var8 + class127.field2130;
                  float var13 = class211.field3156 * var10 + class366.field5442 * var9 + class29.field456 * var8 + class524.field7669;
                  float var14 = (float)(1.0D / Math.sqrt((double)(var13 * var13 + var11 * var11 + var12 * var12))) * (float)var6.field6969;
                  var4.method4164(var12 * var14 + ((float)var7.field3051 - var12), (byte)-124, var6.field6972 * var7.field3059 >> 7, var6.field6973 * var7.field3054 >> 7, var13 * var14 + -var13, (float)var7.field3056 + var11 + -(var11 * var14), var7.field3053);
                  this.field10832.method388(var4, (byte)-36);
                  int var15 = var7.field3060;
                  OpenGL.glColor4ub((byte)(var15 >> 16), (byte)(var15 >> 8), (byte)var15, (byte)(var15 >> 24));
                  this.field10832.method335(0, var6.field6961);
                  this.field10832.method288(-3, var6.field6968);
                  this.field10832.method302(4, 0, 7, 121);
                  ++var5;
               }

               if (this.field10900 <= var5) {
                  this.field10832.method316(true);
                  var10000 = this;
                  if (!var2) {
                     this.field10832.method401(-22939);
                     return;
                  }
               } else {
                  var10000 = this;
               }
            }
         }
      } catch (RuntimeException var17) {
         throw class608.method4462(var17, field10952[47] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IIIIIIIIB)Z",
      line = 4719
   )
   private final boolean method5462(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, byte arg8) {
      try {
         ++field10942;
         if (~arg2 > ~arg3 && ~arg1 < ~arg2 && ~arg5 < ~arg2) {
            return false;
         } else if (~arg2 < ~arg3 && ~arg2 < ~arg1 && ~arg5 > ~arg2) {
            return false;
         } else if (~arg7 > ~arg0 && ~arg4 < ~arg7 && ~arg7 > ~arg6) {
            return false;
         } else if (~arg0 > ~arg7 && arg4 < arg7 && ~arg7 < ~arg6) {
            return false;
         } else {
            int var10 = -1 % ((-31 - arg8) / 46);
            return true;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10952[35] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "ua",
      descriptor = "()I",
      line = 4747
   )
   public final int method510() {
      try {
         ++field10951;
         return this.field10899;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[20] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "HA",
      descriptor = "()I",
      line = 4765
   )
   public final int method517() {
      try {
         ++field10911;
         if (!this.field10858) {
            this.method5455(-32768);
         }

         return this.field10884;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[62] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(ZIZLcp;ILcp;)Lka;",
      line = 4781
   )
   private final class495 method5463(boolean arg0, int arg1, boolean arg2, class753 arg3, int arg4, class753 arg5) {
      boolean var7 = client.field4564;

      try {
         label610: {
            if (~(arg4 & 256) == -1) {
               arg3.field10880 = this.field10880;
               if (!var7) {
                  break label610;
               }
            }

            arg3.field10880 = true;
         }

         label605: {
            ++field10913;
            arg3.field10948 = this.field10948;
            arg3.field10945 = 0;
            arg3.field10939 = this.field10939;
            arg3.field10831 = this.field10831;
            arg3.field10889 = this.field10889;
            arg3.field10900 = this.field10900;
            arg3.field10928 = this.field10928;
            arg3.field10949 = this.field10949;
            arg3.field10862 = this.field10862;
            arg3.field10899 = arg4;
            arg3.field10882 = this.field10882;
            arg3.field10903 = this.field10903;
            boolean var8 = class440.method3313(this.field10882, 79, arg4);
            boolean var9 = class498.method3753(-47, this.field10882, arg4);
            boolean var10 = class269.method2133(this.field10882, -81, arg4);
            boolean var11 = var10 | var8 | var9;
            if (var11) {
               label655: {
                  if (!var8) {
                     arg3.field10901 = this.field10901;
                     if (!var7) {
                        break label655;
                     }
                  }

                  if (arg5.field10901 == null || ~this.field10903 < ~arg5.field10901.length) {
                     arg3.field10901 = arg5.field10901 = new int[this.field10903];
                     if (!var7) {
                        break label655;
                     }
                  }

                  arg3.field10901 = arg5.field10901;
               }

               label617: {
                  if (!var9) {
                     arg3.field10854 = this.field10854;
                     if (!var7) {
                        break label617;
                     }
                  }

                  if (arg5.field10854 != null && arg5.field10854.length >= this.field10903) {
                     arg3.field10854 = arg5.field10854;
                     if (!var7) {
                        break label617;
                     }
                  }

                  arg3.field10854 = arg5.field10854 = new int[this.field10903];
               }

               label656: {
                  if (!var10) {
                     arg3.field10870 = this.field10870;
                     if (!var7) {
                        break label656;
                     }
                  }

                  if (arg5.field10870 == null || ~this.field10903 < ~arg5.field10870.length) {
                     arg3.field10870 = arg5.field10870 = new int[this.field10903];
                     if (!var7) {
                        break label656;
                     }
                  }

                  arg3.field10870 = arg5.field10870;
               }

               label571: {
                  int var12 = 0;
                  if (var7) {
                     if (var8) {
                        arg3.field10901[var12] = this.field10901[var12];
                     }
                  } else if (~var12 <= ~this.field10903) {
                     if (!var7) {
                        break label571;
                     }
                  } else if (var8) {
                     arg3.field10901[var12] = this.field10901[var12];
                  }

                  while(true) {
                     if (var9) {
                        arg3.field10854[var12] = this.field10854[var12];
                     }

                     if (var10) {
                        arg3.field10870[var12] = this.field10870[var12];
                     }

                     ++var12;
                     if (~var12 <= ~this.field10903) {
                        if (!var7) {
                           break;
                        }
                     } else if (var8) {
                        arg3.field10901[var12] = this.field10901[var12];
                     }
                  }
               }

               if (!var7) {
                  break label605;
               }
            }

            arg3.field10854 = this.field10854;
            arg3.field10901 = this.field10901;
            arg3.field10870 = this.field10870;
         }

         label620: {
            if (class417.method3182(arg4, true, this.field10882)) {
               if (arg0) {
                  arg3.field10945 = (byte)(arg3.field10945 | 1);
               }

               arg3.field10844 = arg5.field10844;
               arg3.field10844.field9358 = this.field10844.field9358;
               arg3.field10844.field9357 = this.field10844.field9357;
               if (!var7) {
                  break label620;
               }
            }

            if (class443.method3336(this.field10882, arg4, 121)) {
               arg3.field10844 = this.field10844;
               if (!var7) {
                  break label620;
               }
            }

            arg3.field10844 = null;
         }

         label621: {
            if (!class90.method888(arg4, 121, this.field10882)) {
               arg3.field10835 = this.field10835;
               if (!var7) {
                  break label621;
               }
            }

            label657: {
               if (arg5.field10835 == null || ~this.field10939 < ~arg5.field10835.length) {
                  arg3.field10835 = arg5.field10835 = new short[this.field10939];
                  if (!var7) {
                     break label657;
                  }
               }

               arg3.field10835 = arg5.field10835;
            }

            int var13 = 0;
            if (var7 || ~var13 > ~this.field10939) {
               do {
                  arg3.field10835[var13] = this.field10835[var13];
                  ++var13;
               } while(~var13 > ~this.field10939);
            }
         }

         label513: {
            if (class192.method1676(arg4, false, this.field10882)) {
               label510: {
                  if (arg5.field10855 != null && this.field10939 <= arg5.field10855.length) {
                     arg3.field10855 = arg5.field10855;
                     if (!var7) {
                        break label510;
                     }
                  }

                  arg3.field10855 = arg5.field10855 = new byte[this.field10939];
               }

               int var14 = 0;
               if (var7) {
                  arg3.field10855[var14] = this.field10855[var14];
                  ++var14;
               }

               while(true) {
                  while(this.field10939 > var14) {
                     arg3.field10855[var14] = this.field10855[var14];
                     ++var14;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label513;
                     }
                     break;
                  }

                  ++var14;
               }
            }

            arg3.field10855 = this.field10855;
         }

         label625: {
            if (!class455.method3422(71, arg4, this.field10882)) {
               if (!class416.method3178(this.field10882, -1, arg4)) {
                  arg3.field10894 = null;
                  if (!var7) {
                     break label625;
                  }
               }

               arg3.field10894 = this.field10894;
               if (!var7) {
                  break label625;
               }
            }

            if (arg0) {
               arg3.field10945 = (byte)(arg3.field10945 | 2);
            }

            arg3.field10894 = arg5.field10894;
            arg3.field10894.field9357 = this.field10894.field9357;
            arg3.field10894.field9358 = this.field10894.field9358;
         }

         label626: {
            if (!class450.method3392((byte)-61, arg4, this.field10882)) {
               arg3.field10846 = this.field10846;
               arg3.field10892 = this.field10892;
               arg3.field10902 = this.field10902;
               arg3.field10878 = this.field10878;
               arg3.field10896 = this.field10896;
               if (!var7) {
                  break label626;
               }
            }

            label651: {
               if (arg5.field10846 == null || this.field10928 > arg5.field10846.length) {
                  int var15 = this.field10928;
                  arg3.field10846 = arg5.field10846 = new short[var15];
                  arg3.field10902 = arg5.field10902 = new short[var15];
                  arg3.field10892 = arg5.field10892 = new short[var15];
                  if (!var7) {
                     break label651;
                  }
               }

               arg3.field10902 = arg5.field10902;
               arg3.field10846 = arg5.field10846;
               arg3.field10892 = arg5.field10892;
            }

            label627: {
               if (this.field10896 != null) {
                  if (arg5.field10896 == null) {
                     arg5.field10896 = new class501();
                  }

                  class501 var16 = arg3.field10896 = arg5.field10896;
                  if (var16.field7297 == null || var16.field7297.length < this.field10928) {
                     int var17 = this.field10928;
                     var16.field7299 = new byte[var17];
                     var16.field7297 = new short[var17];
                     var16.field7300 = new short[var17];
                     var16.field7301 = new short[var17];
                  }

                  int var18 = 0;
                  if (var7) {
                     arg3.field10846[var18] = this.field10846[var18];
                     arg3.field10902[var18] = this.field10902[var18];
                     arg3.field10892[var18] = this.field10892[var18];
                     var16.field7297[var18] = this.field10896.field7297[var18];
                     var16.field7301[var18] = this.field10896.field7301[var18];
                     var16.field7300[var18] = this.field10896.field7300[var18];
                     var16.field7299[var18] = this.field10896.field7299[var18];
                     ++var18;
                  }

                  while(true) {
                     while(var18 < this.field10928) {
                        arg3.field10846[var18] = this.field10846[var18];
                        arg3.field10902[var18] = this.field10902[var18];
                        arg3.field10892[var18] = this.field10892[var18];
                        var16.field7297[var18] = this.field10896.field7297[var18];
                        var16.field7301[var18] = this.field10896.field7301[var18];
                        var16.field7300[var18] = this.field10896.field7300[var18];
                        var16.field7299[var18] = this.field10896.field7299[var18];
                        ++var18;
                     }

                     if (!var7) {
                        if (!var7) {
                           break label627;
                        }
                        break;
                     }

                     ++var18;
                  }
               }

               int var19 = 0;
               if (var7 || var19 < this.field10928) {
                  do {
                     arg3.field10846[var19] = this.field10846[var19];
                     arg3.field10902[var19] = this.field10902[var19];
                     arg3.field10892[var19] = this.field10892[var19];
                     ++var19;
                  } while(var19 < this.field10928);
               }
            }

            arg3.field10878 = this.field10878;
         }

         label631: {
            if (!class675.method4933(97, arg4, this.field10882)) {
               if (class172.method1543(arg4, (byte)-128, this.field10882)) {
                  arg3.field10864 = this.field10864;
                  if (!var7) {
                     break label631;
                  }
               }

               arg3.field10864 = null;
               if (!var7) {
                  break label631;
               }
            }

            arg3.field10864 = arg5.field10864;
            if (arg0) {
               arg3.field10945 = (byte)(arg3.field10945 | 4);
            }

            arg3.field10864.field9357 = this.field10864.field9357;
            arg3.field10864.field9358 = this.field10864.field9358;
         }

         label413: {
            if (class28.method204(this.field10882, arg4, (byte)21)) {
               label658: {
                  if (arg5.field10944 == null || ~this.field10939 < ~arg5.field10944.length) {
                     int var20 = this.field10928;
                     arg3.field10944 = arg5.field10944 = new float[var20];
                     arg3.field10938 = arg5.field10938 = new float[var20];
                     if (!var7) {
                        break label658;
                     }
                  }

                  arg3.field10944 = arg5.field10944;
                  arg3.field10938 = arg5.field10938;
               }

               int var21 = 0;
               if (var7) {
                  arg3.field10944[var21] = this.field10944[var21];
                  arg3.field10938[var21] = this.field10938[var21];
                  ++var21;
               }

               while(true) {
                  while(~this.field10928 < ~var21) {
                     arg3.field10944[var21] = this.field10944[var21];
                     arg3.field10938[var21] = this.field10938[var21];
                     ++var21;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label413;
                     }
                     break;
                  }

                  ++var21;
               }
            }

            arg3.field10938 = this.field10938;
            arg3.field10944 = this.field10944;
         }

         label635: {
            if (!class543.method4063(this.field10882, arg4, 67)) {
               if (class57.method647(this.field10882, 100, arg4)) {
                  arg3.field10925 = this.field10925;
                  if (!var7) {
                     break label635;
                  }
               }

               arg3.field10925 = null;
               if (!var7) {
                  break label635;
               }
            }

            if (arg0) {
               arg3.field10945 = (byte)(arg3.field10945 | 8);
            }

            arg3.field10925 = arg5.field10925;
            arg3.field10925.field9358 = this.field10925.field9358;
            arg3.field10925.field9357 = this.field10925.field9357;
         }

         if (arg1 < 5) {
            this.method5455(28);
         }

         label371: {
            if (class250.method2026((byte)105, this.field10882, arg4)) {
               label368: {
                  if (arg5.field10852 != null && ~arg5.field10852.length <= ~this.field10939) {
                     arg3.field10859 = arg5.field10859;
                     arg3.field10852 = arg5.field10852;
                     arg3.field10897 = arg5.field10897;
                     if (!var7) {
                        break label368;
                     }
                  }

                  int var22 = this.field10939;
                  arg3.field10852 = arg5.field10852 = new short[var22];
                  arg3.field10859 = arg5.field10859 = new short[var22];
                  arg3.field10897 = arg5.field10897 = new short[var22];
               }

               int var23 = 0;
               if (var7) {
                  arg3.field10852[var23] = this.field10852[var23];
                  arg3.field10859[var23] = this.field10859[var23];
                  arg3.field10897[var23] = this.field10897[var23];
                  ++var23;
               }

               while(true) {
                  while(~var23 > ~this.field10939) {
                     arg3.field10852[var23] = this.field10852[var23];
                     arg3.field10859[var23] = this.field10859[var23];
                     arg3.field10897[var23] = this.field10897[var23];
                     ++var23;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label371;
                     }
                     break;
                  }

                  ++var23;
               }
            }

            arg3.field10897 = this.field10897;
            arg3.field10859 = this.field10859;
            arg3.field10852 = this.field10852;
         }

         label639: {
            if (class292.method2274((byte)102, this.field10882, arg4)) {
               if (arg0) {
                  arg3.field10945 = (byte)(arg3.field10945 | 16);
               }

               arg3.field10932 = arg5.field10932;
               arg3.field10932.field6929 = this.field10932.field6929;
               if (!var7) {
                  break label639;
               }
            }

            if (!class321.method2502(-16941, this.field10882, arg4)) {
               arg3.field10932 = null;
               if (!var7) {
                  break label639;
               }
            }

            arg3.field10932 = this.field10932;
         }

         label640: {
            if (!class116.method1104(this.field10882, 32768, arg4)) {
               arg3.field10947 = this.field10947;
               if (!var7) {
                  break label640;
               }
            }

            label325: {
               if (arg5.field10947 != null && ~arg5.field10947.length <= ~this.field10939) {
                  arg3.field10947 = arg5.field10947;
                  if (!var7) {
                     break label325;
                  }
               }

               int var24 = this.field10939;
               arg3.field10947 = arg5.field10947 = new short[var24];
            }

            int var25 = 0;
            if (var7 || this.field10939 > var25) {
               do {
                  arg3.field10947[var25] = this.field10947[var25];
                  ++var25;
               } while(this.field10939 > var25);
            }
         }

         label654: {
            if (!class277.method2175(arg4, this.field10882, (byte)127)) {
               arg3.field10935 = this.field10935;
               if (!var7) {
                  break label654;
               }
            }

            if (arg5.field10935 == null || arg5.field10935.length < this.field10900) {
               int var26 = this.field10900;
               arg3.field10935 = arg5.field10935 = new class205[var26];
               int var27 = 0;
               if (var7) {
                  arg3.field10935[var27] = this.field10935[var27].method1745((byte)-123);
                  ++var27;
               }

               while(true) {
                  while(~this.field10900 < ~var27) {
                     arg3.field10935[var27] = this.field10935[var27].method1745((byte)-123);
                     ++var27;
                  }

                  if (!var7) {
                     if (!var7) {
                        break label654;
                     }
                     break;
                  }

                  ++var27;
               }
            }

            arg3.field10935 = arg5.field10935;
            int var28 = 0;
            if (var7 || var28 < this.field10900) {
               do {
                  arg3.field10935[var28].method1744(128, this.field10935[var28]);
                  ++var28;
               } while(var28 < this.field10900);
            }
         }

         label269: {
            arg3.field10885 = this.field10885;
            if (this.field10858) {
               arg3.field10919 = this.field10919;
               arg3.field10926 = this.field10926;
               arg3.field10858 = true;
               arg3.field10839 = this.field10839;
               arg3.field10921 = this.field10921;
               arg3.field10917 = this.field10917;
               arg3.field10875 = this.field10875;
               arg3.field10884 = this.field10884;
               arg3.field10881 = this.field10881;
               if (!var7) {
                  break label269;
               }
            }

            arg3.field10858 = false;
         }

         arg3.field10912 = this.field10912;
         arg3.field10909 = this.field10909;
         arg3.field10836 = this.field10836;
         arg3.field10876 = this.field10876;
         arg3.field10833 = this.field10833;
         arg3.field10898 = this.field10898;
         arg3.field10904 = this.field10904;
         arg3.field10941 = this.field10941;
         arg3.field10860 = this.field10860;
         arg3.field10869 = this.field10869;
         return arg3;
      } catch (RuntimeException var30) {
         throw class608.method4462(var30, field10952[15] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field10952[11] : field10952[9]) + ',' + arg4 + ',' + (arg5 != null ? field10952[11] : field10952[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(IILdfa;ZII)Z",
      line = 5260
   )
   public final boolean method551(int arg0, int arg1, class173 arg2, boolean arg3, int arg4, int arg5) {
      try {
         ++field10937;
         return this.method5454(arg3, -50, arg0, arg4, arg2, arg5, arg1);
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field10952[19] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field10952[11] : field10952[9]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "da",
      descriptor = "()I",
      line = 5271
   )
   public final int method535() {
      try {
         ++field10891;
         return this.field10949;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field10952[1] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Lka;IIIZ)V",
      line = 5292
   )
   public final void method533(class495 param1, int param2, int param3, int param4, boolean param5) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!cp",
      name = "a",
      descriptor = "(Ldfa;)V",
      line = 5559
   )
   public final void method554(class173 arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10936;
         class558 var3 = (class558)arg0;
         if (this.field10876 != null) {
            int var4 = 0;
            if (var2 || this.field10876.length > var4) {
               do {
                  class309 var5 = this.field10876[var4];
                  class309 var6 = var5;
                  if (var5.field4443 != null) {
                     var6 = var5.field4443;
                  }

                  var6.field4454 = (int)((float)this.field10870[var5.field4459] * var3.field8127 + (float)this.field10901[var5.field4459] * var3.field8099 + (float)this.field10854[var5.field4459] * var3.field8103 + var3.field8102);
                  var6.field4452 = (int)((float)this.field10870[var5.field4459] * var3.field8118 + (float)this.field10901[var5.field4459] * var3.field8123 + (float)this.field10854[var5.field4459] * var3.field8095 + var3.field8093);
                  var6.field4442 = (int)((float)this.field10870[var5.field4459] * var3.field8098 + (float)this.field10901[var5.field4459] * var3.field8130 + (float)this.field10854[var5.field4459] * var3.field8110 + var3.field8109);
                  var6.field4444 = (int)((float)this.field10870[var5.field4451] * var3.field8127 + (float)this.field10901[var5.field4451] * var3.field8099 + (float)this.field10854[var5.field4451] * var3.field8103 + var3.field8102);
                  var6.field4450 = (int)((float)this.field10870[var5.field4451] * var3.field8118 + (float)this.field10901[var5.field4451] * var3.field8123 + (float)this.field10854[var5.field4451] * var3.field8095 + var3.field8093);
                  var6.field4453 = (int)((float)this.field10870[var5.field4451] * var3.field8098 + (float)this.field10901[var5.field4451] * var3.field8130 + (float)this.field10854[var5.field4451] * var3.field8110 + var3.field8109);
                  var6.field4447 = (int)((float)this.field10870[var5.field4455] * var3.field8127 + (float)this.field10901[var5.field4455] * var3.field8099 + (float)this.field10854[var5.field4455] * var3.field8103 + var3.field8102);
                  var6.field4458 = (int)((float)this.field10870[var5.field4455] * var3.field8118 + (float)this.field10901[var5.field4455] * var3.field8123 + (float)this.field10854[var5.field4455] * var3.field8095 + var3.field8093);
                  var6.field4449 = (int)((float)this.field10870[var5.field4455] * var3.field8098 + (float)this.field10901[var5.field4455] * var3.field8130 + (float)this.field10854[var5.field4455] * var3.field8110 + var3.field8109);
                  ++var4;
               } while(this.field10876.length > var4);
            }
         }

         if (this.field10941 != null) {
            int var7 = 0;
            if (var2 || ~this.field10941.length < ~var7) {
               do {
                  class740 var8 = this.field10941[var7];
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

                  var9.field10654 = (int)((float)this.field10870[var8.field10651] * var3.field8127 + (float)this.field10901[var8.field10651] * var3.field8099 + (float)this.field10854[var8.field10651] * var3.field8103 + var3.field8102);
                  var9.field10662 = (int)((float)this.field10870[var8.field10651] * var3.field8118 + (float)this.field10901[var8.field10651] * var3.field8123 + (float)this.field10854[var8.field10651] * var3.field8095 + var3.field8093);
                  var9.field10652 = (int)((float)this.field10870[var8.field10651] * var3.field8098 + (float)this.field10901[var8.field10651] * var3.field8130 + (float)this.field10854[var8.field10651] * var3.field8110 + var3.field8109);
                  ++var7;
               } while(~this.field10941.length < ~var7);

            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field10952[14] + (arg0 != null ? field10952[11] : field10952[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "ba",
      descriptor = "(Lr;)Lr;",
      line = 5623
   )
   public final class192 method547(class192 arg0) {
      boolean var2 = client.field4564;

      try {
         ++field10895;
         if (this.field10928 == 0) {
            return null;
         } else {
            if (!this.field10858) {
               this.method5455(-32768);
            }

            int var3;
            int var4;
            label48: {
               if (~this.field10832.field793 >= -1) {
                  var3 = -(this.field10832.field793 * this.field10839 >> 8) + this.field10875 >> this.field10832.field726;
                  var4 = -(this.field10832.field793 * this.field10881 >> 8) + this.field10917 >> this.field10832.field726;
                  if (!var2) {
                     break label48;
                  }
               }

               var3 = this.field10875 - (this.field10832.field793 * this.field10881 >> 8) >> this.field10832.field726;
               var4 = -(this.field10832.field793 * this.field10839 >> 8) + this.field10917 >> this.field10832.field726;
            }

            int var5;
            int var6;
            label43: {
               if (this.field10832.field860 <= 0) {
                  var5 = -(this.field10832.field860 * this.field10839 >> 8) + this.field10884 >> this.field10832.field726;
                  var6 = -(this.field10832.field860 * this.field10881 >> 8) + this.field10919 >> this.field10832.field726;
                  if (!var2) {
                     break label43;
                  }
               }

               var5 = this.field10884 - (this.field10832.field860 * this.field10881 >> 8) >> this.field10832.field726;
               var6 = -(this.field10832.field860 * this.field10839 >> 8) + this.field10919 >> this.field10832.field726;
            }

            class580 var10;
            label60: {
               int var7 = var4 - var3 + 1;
               int var8 = var6 + 1 + -var5;
               class580 var9 = (class580)arg0;
               if (var9 == null || !var9.method4276(var8, 104, var7)) {
                  var10 = new class580(this.field10832, var7, var8);
                  if (!var2) {
                     break label60;
                  }
               }

               var10 = var9;
               var9.method4270((byte)36);
            }

            var10.method4274(var4, -10, var5, var6, var3);
            this.method5457(var10, false);
            return var10;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field10952[38] + (arg0 != null ? field10952[11] : field10952[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "ia",
      descriptor = "(SS)V",
      line = 5686
   )
   public final void method526(short arg0, short arg1) {
      boolean var3 = client.field4564;

      try {
         ++field10929;
         int var4 = 0;
         if (var3) {
            if (this.field10835[var4] == arg0) {
               this.field10835[var4] = arg1;
            }

            ++var4;
         }

         while(true) {
            class753 var10000;
            if (var4 >= this.field10939) {
               var10000 = this;
               if (!var3) {
                  if (this.field10836 != null) {
                     int var5 = 0;
                     if (var3 || this.field10900 > var5) {
                        do {
                           class478 var6 = this.field10836[var5];
                           class205 var7 = this.field10935[var5];
                           var7.field3060 = 16777215 & class451.field6600[65535 & this.field10835[var6.field6965]] | -16777216 & var7.field3060;
                           ++var5;
                        } while(this.field10900 > var5);
                     }
                  }

                  if (this.field10894 != null) {
                     this.field10894.field9358 = null;
                     return;
                  }

                  return;
               }
            } else {
               var10000 = this;
            }

            if (var10000.field10835[var4] == arg0) {
               this.field10835[var4] = arg1;
            }

            ++var4;
         }
      } catch (RuntimeException var9) {
         throw class608.method4462(var9, field10952[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5464(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 16);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5465(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 100;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 29;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 16;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
