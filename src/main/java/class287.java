import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class287 extends class428 {
   @OriginalMember(
      owner = "client!tja",
      name = "x",
      descriptor = "I"
   )
   public int field3965;
   @OriginalMember(
      owner = "client!tja",
      name = "n",
      descriptor = "I"
   )
   public int field3969;
   @OriginalMember(
      owner = "client!tja",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3977 = new String[]{method2176(method2175("h\u0003;Yq4")), method2176(method2175("h\u0003;Y\nu\u00073\u0003\b4")), method2176(method2175("h\u0003;Yr4")), method2176(method2175("h\u0003;Ys4")), method2176(method2175("h\u0003;Yw4")), method2176(method2175("h\u0003;Yt4")), method2176(method2175("h\u0003;Y~4")), method2176(method2175("h\u0003;Yu4")), method2176(method2175("h\u0003;Yp4"))};
   @OriginalMember(
      owner = "client!tja",
      name = "o",
      descriptor = "I"
   )
   public static int field3966 = -1;
   @OriginalMember(
      owner = "client!tja",
      name = "v",
      descriptor = "I"
   )
   public static int field3963 = 1;
   @OriginalMember(
      owner = "client!tja",
      name = "t",
      descriptor = "[[F"
   )
   public static float[][] field3973 = new float[][]{{-0.333333F, -0.333333F, -0.333333F}, {0.333333F, -0.333333F, -0.333333F}, {-0.333333F, 0.333333F, -0.333333F}, {0.333333F, 0.333333F, -0.333333F}, {-0.333333F, -0.333333F, 0.333333F}, {0.333333F, -0.333333F, 0.333333F}, {-0.333333F, 0.333333F, 0.333333F}, {0.333333F, 0.333333F, 0.333333F}};
   @OriginalMember(
      owner = "client!tja",
      name = "u",
      descriptor = "I"
   )
   public static int field3967;
   @OriginalMember(
      owner = "client!tja",
      name = "s",
      descriptor = "I"
   )
   public static int field3968;
   @OriginalMember(
      owner = "client!tja",
      name = "q",
      descriptor = "I"
   )
   public static int field3970;
   @OriginalMember(
      owner = "client!tja",
      name = "m",
      descriptor = "I"
   )
   public static int field3972;
   @OriginalMember(
      owner = "client!tja",
      name = "r",
      descriptor = "I"
   )
   public static int field3974;
   @OriginalMember(
      owner = "client!tja",
      name = "w",
      descriptor = "I"
   )
   public static int field3975;
   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "I"
   )
   public static int field3976;
   @OriginalMember(
      owner = "client!tja",
      name = "p",
      descriptor = "Lkf;"
   )
   public static class266 field3971;
   @OriginalMember(
      owner = "client!tja",
      name = "y",
      descriptor = "[I"
   )
   public static int[] field3964;

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(B)I"
   )
   public final int method2167(byte arg0) {
      try {
         if (arg0 != -111) {
            this.method2171(126);
         }

         ++field3972;
         return class330.method2439(this.field3965, arg0 ^ 24);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3977[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2168(int arg0) {
      try {
         field3971 = null;
         field3973 = null;
         field3964 = null;
         if (arg0 != -1) {
            field3966 = -88;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3977[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(II)Z"
   )
   public final boolean method2169(int arg0, int arg1) {
      try {
         if (arg0 != -1) {
            return false;
         } else {
            ++field3976;
            return ~(1 & this.field3965 >> arg1 + 1) != -1;
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3977[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2170(int arg0) {
      try {
         ++field3967;
         class295.field4069.method731(0);
         if (arg0 != -1) {
            method2170(120);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3977[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "d",
      descriptor = "(I)Z"
   )
   public final boolean method2171(int arg0) {
      try {
         if (arg0 != 1) {
            this.method2172((byte)-14);
         }

         ++field3968;
         return ~(1 & this.field3965 >> 21) != -1;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3977[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "b",
      descriptor = "(B)I"
   )
   public final int method2172(byte arg0) {
      try {
         if (arg0 <= 69) {
            this.method2169(70, -63);
         }

         ++field3970;
         return 7 & this.field3965 >> 18;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3977[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "g",
      descriptor = "(I)Z"
   )
   public final boolean method2173(int arg0) {
      try {
         ++field3975;
         if (arg0 != -1247933578) {
            method2170(-33);
         }

         return (1 & this.field3965 >> 22) != 0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3977[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class287(int arg0, int arg1) {
      try {
         this.field3965 = arg0;
         this.field3969 = arg1;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field3977[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "c",
      descriptor = "(I)Z"
   )
   public final boolean method2174(int arg0) {
      try {
         if (arg0 != -18890) {
            return false;
         } else {
            ++field3974;
            return ~(1 & this.field3965) != -1;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3977[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2175(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2176(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 105;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 119;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
