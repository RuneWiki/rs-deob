import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!iha")
public class class707 {
   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10403 = new String[]{method5173(method5172("{!OP\u0000:")), method5173(method5172("|<B\u0012")), method5173(method5172("ig\u0000P<")), method5173(method5172("{!OP\u0002:")), method5173(method5172("{!OP\u0003:")), method5173(method5172("{!OP\u0005:"))};
   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "Lcba;"
   )
   public static class95 field10401 = new class95();
   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "I"
   )
   public static int field10402 = -1;
   @OriginalMember(
      owner = "client!iha",
      name = "e",
      descriptor = "I"
   )
   public static int field10398;
   @OriginalMember(
      owner = "client!iha",
      name = "d",
      descriptor = "I"
   )
   public static int field10399;
   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "I"
   )
   public static int field10400;

   @OriginalMember(
      owner = "client!iha",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method5168(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field10400;
         if (arg0 == 0) {
            if (class629.field9294 != null) {
               if (class28.field416) {
                  class188.method1577((byte)-51);
               }

               class422.field5749.method297(0);
               class469.method3563();
               class598.method4450(true);
               class695.method5064(arg0);
               class371.method2935(-3545);
               class70.method694(0);
               if (class676.field9996 != null) {
                  class676.field9996.method3558((byte)-25);
               }

               class439.method3388(1);
               class230.method1829((byte)58);
               class714.method5216(false);
               class318.method2512(false);
               class359.method2833(arg0 ^ 75, false);
               int var2 = 0;
               if (var1 || ~var2 > -2049) {
                  do {
                     class783 var3 = class59.field771[var2];
                     if (var3 == null) {
                        ++var2;
                     } else {
                        int var4 = 0;
                        if (var1) {
                           var3.field203[var4] = null;
                           ++var4;
                        }

                        while(var4 < var3.field203.length) {
                           var3.field203[var4] = null;
                           ++var4;
                        }

                        ++var2;
                     }
                  } while(~var2 > -2049);
               }

               int var5 = 0;
               if (!var1 && var5 >= class418.field5713) {
                  class216.field2745 = null;
                  class428.field5818 = null;
                  class629.field9294.method3649(false);
                  class629.field9294 = null;
               } else {
                  do {
                     class81 var6 = class332.field4584[var5].field5654;
                     if (var6 == null) {
                        ++var5;
                     } else {
                        int var7 = 0;
                        if (var1) {
                           var6.field203[var7] = null;
                           ++var7;
                        }

                        while(var7 < var6.field203.length) {
                           var6.field203[var7] = null;
                           ++var7;
                        }

                        ++var5;
                     }
                  } while(var5 < class418.field5713);

                  class216.field2745 = null;
                  class428.field5818 = null;
                  class629.field9294.method3649(false);
                  class629.field9294 = null;
               }
            }
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field10403[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method5169(int arg0) {
      try {
         field10401 = null;
         if (arg0 <= 16) {
            field10402 = -62;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field10403[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(I)Lgea;"
   )
   public static final class66 method5170(int arg0) {
      try {
         ++field10399;
         class66 var1 = class471.method3574(true);
         var1.method596((byte)-46, (long)arg0);
         var1.method595(-15010, class130.field1666);
         var1.method596((byte)-46, class10.field235);
         var1.method596((byte)-46, class504.field7016);
         var1.method605(class783.field11414, class458.field6305, 119);
         return var1;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10403[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "a",
      descriptor = "(Ljava/lang/String;I)Z"
   )
   public static final boolean method5171(String arg0, int arg1) {
      try {
         ++field10398;
         return arg1 >= -41 ? false : class502.method3795(10, true, (byte)35, arg0);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field10403[0] + (arg0 != null ? field10403[2] : field10403[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5172(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 65);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!iha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5173(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 126;
            break;
         default:
            var10005 = 65;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
