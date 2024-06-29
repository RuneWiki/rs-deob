import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class197 implements class517 {
   @OriginalMember(
      owner = "client!pha",
      name = "h",
      descriptor = "Ljava/lang/String;"
   )
   private String field2517;
   @OriginalMember(
      owner = "client!pha",
      name = "c",
      descriptor = "Lww;"
   )
   private class339 field2518;
   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2524 = new String[]{method1643(method1642("\u00115\u0000#s")), method1643(method1642("\u0004nBa")), method1643(method1642("\u001asO#2\u0003uGy0B")), method1643(method1642("\u001asO#MB")), method1643(method1642("\u001asO#LB")), method1643(method1642("\u001asO#KB")), method1643(method1642("\u001asO#OB")), method1643(method1642("\u001asO#JB"))};
   @OriginalMember(
      owner = "client!pha",
      name = "g",
      descriptor = "Laka;"
   )
   public static class418 field2520 = new class418(70, -1);
   @OriginalMember(
      owner = "client!pha",
      name = "e",
      descriptor = "I"
   )
   public static int field2516;
   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "I"
   )
   public static int field2519;
   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "I"
   )
   public static int field2521;
   @OriginalMember(
      owner = "client!pha",
      name = "d",
      descriptor = "I"
   )
   public static int field2522;
   @OriginalMember(
      owner = "client!pha",
      name = "f",
      descriptor = "I"
   )
   public static int field2523;

   @OriginalMember(
      owner = "client!pha",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1637(int arg0) {
      try {
         field2520 = null;
         if (arg0 != -1772136607) {
            field2520 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field2524[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "b",
      descriptor = "(I)I"
   )
   public final int method1638(int arg0) {
      try {
         if (arg0 != 13053) {
            return 78;
         } else {
            ++field2521;
            return this.field2518.method2696(255, this.field2517) ? 100 : this.field2518.method2693(arg0 ^ 13053, this.field2517);
         }
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2524[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method1639(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      boolean var7 = client.field1481;

      try {
         ++field2516;
         class337[] var8 = class570.field8383;
         if (arg3 <= -116) {
            int var9 = 0;
            if (var7 || ~var9 > ~var8.length) {
               do {
                  class337 var10 = var8[var9];
                  if (var10 != null) {
                     if (var10.field4618 != 2 && !var7) {
                        ++var9;
                     } else {
                        class59.method539(arg2, 862696096, arg6, arg4 >> 1, var10.field4617, var10.field4614 * 2, var10.field4615, var10.field4610, arg0 >> 1);
                        if (class489.field6820[0] > -1 && class413.field5678 % 20 < 10) {
                           class648 var11 = class754.field11050[var10.field4616];
                           int var12 = class489.field6820[0] + arg1 + -12;
                           int var13 = class489.field6820[1] - 28 + arg5;
                           var11.method4760(var12, var13);
                           class762.method5522(var11.method2406() + var12, var13, var13 + var11.method2396(), -124, var12);
                        }

                        ++var9;
                     }
                  } else {
                     ++var9;
                  }
               } while(~var9 > ~var8.length);

            }
         }
      } catch (RuntimeException var15) {
         throw class93.method866(var15, field2524[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(BLmb;)V"
   )
   public static final void method1640(byte arg0, class431 arg1) {
      boolean var2 = client.field1481;

      try {
         ++field2519;
         if (arg0 != 24) {
            method1640((byte)31, (class431)null);
         }

         int var3 = 0;
         if (var2 || ~class417.field5707 < ~var3) {
            do {
               int var4 = class487.field6801[var3];
               class783 var5 = class59.field771[var4];
               int var6 = arg1.method640(arg0 ^ 231);
               if ((var6 & 8) != 0) {
                  var6 += arg1.method640(255) << 8;
               }

               if ((var6 & 16384) != 0) {
                  var6 += arg1.method640(255) << 16;
               }

               class624.method4618(var4, arg1, var6, 128, var5);
               ++var3;
            } while(~class417.field5707 < ~var3);

         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field2524[5] + arg0 + ',' + (arg1 != null ? field2524[0] : field2524[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(I)Ltg;"
   )
   public final class374 method1641(int arg0) {
      try {
         if (arg0 != -23257) {
            field2520 = null;
         }

         ++field2523;
         return class374.field5232;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field2524[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "<init>",
      descriptor = "(Lww;Ljava/lang/String;)V"
   )
   public class197(class339 arg0, String arg1) {
      try {
         this.field2517 = arg1;
         this.field2518 = arg0;
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field2524[2] + (arg0 != null ? field2524[0] : field2524[1]) + ',' + (arg1 != null ? field2524[0] : field2524[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1642(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1643(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 27;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
