import java.awt.Frame;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bm")
public class class123 {
   @OriginalMember(
      owner = "client!bm",
      name = "n",
      descriptor = "Lgw;"
   )
   private class179 field1959 = new class179(64);
   @OriginalMember(
      owner = "client!bm",
      name = "f",
      descriptor = "Lhw;"
   )
   public class141 field1966;
   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "Lhw;"
   )
   private class141 field1964;
   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1972 = new String[]{method1149(method1148("Y=IJ[")), method1149(method1148("@~I'\u000e")), method1149(method1148("Lf\u000b\b")), method1149(method1148("@~I%\u000e")), method1149(method1148("\u000f>YD")), method1149(method1148("@~I\"\u000e")), method1149(method1148("@~I#\u000e")), method1149(method1148("@~I&\u000e")), method1149(method1148("@~I \u000e")), method1149(method1148("@~IXOLz\u0013Z\u000e")), method1149(method1148("@~I!\u000e"))};
   @OriginalMember(
      owner = "client!bm",
      name = "g",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1965 = null;
   @OriginalMember(
      owner = "client!bm",
      name = "m",
      descriptor = "[Leh;"
   )
   public static class377[] field1969 = new class377[50];
   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "I"
   )
   public static int field1958;
   @OriginalMember(
      owner = "client!bm",
      name = "j",
      descriptor = "I"
   )
   public static int field1960;
   @OriginalMember(
      owner = "client!bm",
      name = "h",
      descriptor = "I"
   )
   public static int field1961;
   @OriginalMember(
      owner = "client!bm",
      name = "d",
      descriptor = "I"
   )
   public static int field1962;
   @OriginalMember(
      owner = "client!bm",
      name = "i",
      descriptor = "I"
   )
   public static int field1963;
   @OriginalMember(
      owner = "client!bm",
      name = "l",
      descriptor = "I"
   )
   public static int field1967;
   @OriginalMember(
      owner = "client!bm",
      name = "e",
      descriptor = "I"
   )
   public static int field1970;
   @OriginalMember(
      owner = "client!bm",
      name = "c",
      descriptor = "Lhw;"
   )
   public static class141 field1968;
   @OriginalMember(
      owner = "client!bm",
      name = "k",
      descriptor = "Ljava/awt/Frame;"
   )
   public static Frame field1971;

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(IZ)V",
      line = 3
   )
   public static final void method1141(int arg0, boolean arg1) {
      try {
         ++field1967;
         if (arg0 != class304.field4406.length()) {
            class622.method4561(field1972[4] + class304.field4406, (byte)93);
            class741.method5343(class304.field4406, ~arg0, arg1, false);
            if (!arg1) {
               class304.field4406 = "";
               class588.field8497 = 0;
            }

            class718.field10373 = 0;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field1972[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "(I)V",
      line = 27
   )
   public final void method1142(int arg0) {
      try {
         ++field1962;
         class179 var2 = this.field1959;
         synchronized(this.field1959) {
            this.field1959.method1591((byte)58);
            if (arg0 != 19824) {
               this.method1143((byte)-17);
            }

         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1972[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(B)V",
      line = 40
   )
   public final void method1143(byte arg0) {
      try {
         ++field1963;
         if (arg0 <= -29) {
            class179 var2 = this.field1959;
            synchronized(this.field1959) {
               this.field1959.method1589((byte)46);
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1972[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(BI)Llh;",
      line = 58
   )
   public final class550 method1144(byte arg0, int arg1) {
      try {
         ++field1970;
         class179 var3 = this.field1959;
         class550 var4;
         synchronized(this.field1959) {
            var4 = (class550)this.field1959.method1584((long)arg1, 1);
         }

         if (var4 != null) {
            return var4;
         } else {
            class141 var5 = this.field1964;
            byte[] var6;
            synchronized(this.field1964) {
               var6 = this.field1964.method1347((byte)127, 3, arg1);
            }

            class550 var7 = new class550();
            int var8 = 60 / ((-56 - arg0) / 38);
            var7.field7939 = this;
            if (var6 != null) {
               var7.method4096((byte)39, new class473(var6));
            }

            class179 var9 = this.field1959;
            synchronized(this.field1959) {
               this.field1959.method1581((long)arg1, 0, var7);
               return var7;
            }
         }
      } catch (RuntimeException var14) {
         throw class608.method4462(var14, field1972[10] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(I)V",
      line = 97
   )
   public static void method1145(int arg0) {
      try {
         field1965 = null;
         if (arg0 != -1) {
            method1145(-1);
         }

         field1968 = null;
         field1971 = null;
         field1969 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1972[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "<init>",
      descriptor = "(Lca;ILhw;Lhw;)V",
      line = 157
   )
   public class123(class320 arg0, int arg1, class141 arg2, class141 arg3) {
      try {
         this.field1966 = arg3;
         this.field1964 = arg2;
         this.field1964.method1346(3, 0);
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1972[9] + (arg0 != null ? field1972[0] : field1972[2]) + ',' + arg1 + ',' + (arg2 != null ? field1972[0] : field1972[2]) + ',' + (arg3 != null ? field1972[0] : field1972[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "b",
      descriptor = "(IZ)V",
      line = 113
   )
   public final void method1146(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.field1966 = null;
         }

         ++field1960;
         class179 var3 = this.field1959;
         synchronized(this.field1959) {
            this.field1959.method1579(124, arg0);
         }
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field1972[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "a",
      descriptor = "(Luda;I)V",
      line = 128
   )
   public static final void method1147(class473 arg0, int arg1) {
      boolean var2 = client.field4564;

      try {
         ++field1958;
         if (arg1 != -65536) {
            field1968 = null;
         }

         int var3 = 0;
         if (var2 || ~class194.field2936 < ~var3) {
            do {
               int var4 = arg0.method3586(arg1 ^ -65413);
               int var5 = arg0.method3565(true);
               if (~var5 == -65536) {
                  var5 = -1;
               }

               if (class604.field8700[var4] != null) {
                  class604.field8700[var4].field9585 = var5;
               }

               ++var3;
            } while(~class194.field2936 < ~var3);

         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field1972[1] + (arg0 != null ? field1972[0] : field1972[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1148(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 38);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1149(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 19;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 38;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
