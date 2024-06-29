import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tba")
public class class462 {
   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6725 = new String[]{method3566(method3565("T`V6\u0013\b")), method3566(method3565("Nw[t")), method3566(method3565("[,\u00196/")), method3566(method3565("T`V6\u0010\b"))};
   @OriginalMember(
      owner = "client!tba",
      name = "b",
      descriptor = "I"
   )
   public static int field6723 = 1;
   @OriginalMember(
      owner = "client!tba",
      name = "c",
      descriptor = "I"
   )
   public static int field6720;
   @OriginalMember(
      owner = "client!tba",
      name = "e",
      descriptor = "I"
   )
   public static int field6724;
   @OriginalMember(
      owner = "client!tba",
      name = "d",
      descriptor = "Lma;"
   )
   public static class148 field6721;
   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field6722;

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3563(byte arg0) {
      try {
         field6721 = null;
         if (arg0 < 72) {
            field6722 = null;
         }

         field6722 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6725[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "a",
      descriptor = "(ILsa;ZLjava/lang/String;)Lcc;"
   )
   public static final class790 method3564(int arg0, class39 arg1, boolean arg2, String arg3) {
      boolean var4 = client.field10022;

      try {
         ++field6720;
         int var5 = arg1.method443(arg3, arg0 ^ 27828);
         if (var5 == -1) {
            return new class790(0);
         } else if (arg0 != 27812) {
            return null;
         } else {
            int[] var6 = arg1.method446((byte)-120, var5);
            class790 var7 = new class790(var6.length);
            int var8 = 0;
            int var9 = 0;
            class65 var10;
            int var11;
            int var12;
            int var13;
            class790 var10000;
            if (var4) {
               var10 = new class65(arg1.method460((byte)-11, var6[var9++], var5));
               var11 = var10.method701(255);
               var12 = var10.method685(-2);
               var13 = var10.method665(false);
               if (!arg2) {
                  if (var13 != 1) {
                     var7.field11513[var8] = var11;
                     var7.field11501[var8] = var12;
                     ++var8;
                     if (var4) {
                        --var7.field11503;
                        var10000 = var7;
                     } else {
                        var10000 = var7;
                     }
                  } else {
                     --var7.field11503;
                     var10000 = var7;
                  }
               } else {
                  var7.field11513[var8] = var11;
                  var7.field11501[var8] = var12;
                  ++var8;
                  if (var4) {
                     --var7.field11503;
                     var10000 = var7;
                  } else {
                     var10000 = var7;
                  }
               }
            } else {
               var10000 = var7;
            }

            do {
               while(~var10000.field11503 < ~var8) {
                  var10 = new class65(arg1.method460((byte)-11, var6[var9++], var5));
                  var11 = var10.method701(255);
                  var12 = var10.method685(-2);
                  var13 = var10.method665(false);
                  if (!arg2) {
                     if (var13 != 1) {
                        var7.field11513[var8] = var11;
                        var7.field11501[var8] = var12;
                        ++var8;
                        if (var4) {
                           --var7.field11503;
                           var10000 = var7;
                        } else {
                           var10000 = var7;
                        }
                     } else {
                        --var7.field11503;
                        var10000 = var7;
                     }
                  } else {
                     var7.field11513[var8] = var11;
                     var7.field11501[var8] = var12;
                     ++var8;
                     if (var4) {
                        --var7.field11503;
                        var10000 = var7;
                     } else {
                        var10000 = var7;
                     }
                  }
               }

               var10000 = var7;
            } while(var4);

            return var7;
         }
      } catch (RuntimeException var15) {
         throw class612.method4503(var15, field6725[3] + arg0 + ',' + (arg1 != null ? field6725[2] : field6725[1]) + ',' + arg2 + ',' + (arg3 != null ? field6725[2] : field6725[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3565(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3566(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 2;
            break;
         case 2:
            var10005 = 55;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
