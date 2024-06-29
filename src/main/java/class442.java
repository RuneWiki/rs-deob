import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vda")
public class class442 {
   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6468 = new String[]{method3439(method3438(".Hud\u001fp")), method3439(method3438("#\u0002:d#")), method3439(method3438(".Hud\u001cp")), method3439(method3438("6Yx&")), method3439(method3438(".Hud\u001dp")), method3439(method3438("b\f"))};
   @OriginalMember(
      owner = "client!vda",
      name = "b",
      descriptor = "I"
   )
   public static int field6465;
   @OriginalMember(
      owner = "client!vda",
      name = "c",
      descriptor = "I"
   )
   public static int field6466;
   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "Lsa;"
   )
   public static class39 field6467;

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3435(int arg0) {
      try {
         if (arg0 >= -113) {
            field6467 = null;
         }

         field6467 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6468[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(Z[Ljava/lang/String;)[Ljava/lang/String;"
   )
   public static final String[] method3436(boolean arg0, String[] arg1) {
      boolean var2 = client.field10022;

      try {
         if (arg0) {
            field6467 = null;
         }

         ++field6466;
         String[] var3 = new String[5];
         int var4 = 0;
         if (var2) {
            var3[var4] = var4 + field6468[5];
            if (arg1 != null && arg1[var4] != null) {
               var3[var4] = var3[var4] + arg1[var4];
            }

            ++var4;
         }

         while(true) {
            String[] var10000;
            if (~var4 <= -6) {
               var10000 = var3;
               if (!var2) {
                  return var3;
               }
            } else {
               var3[var4] = var4 + field6468[5];
               var10000 = arg1;
            }

            if (var10000 != null && arg1[var4] != null) {
               var3[var4] = var3[var4] + arg1[var4];
            }

            ++var4;
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6468[4] + arg0 + ',' + (arg1 != null ? field6468[1] : field6468[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "a",
      descriptor = "(ILcu;)Lvj;"
   )
   public static final class283 method3437(int arg0, class65 arg1) {
      try {
         ++field6465;
         int var2 = arg1.method665(false);
         class634 var3 = class108.method1059(-23386)[arg1.method665(false)];
         class730 var4 = class196.method1721(89)[arg1.method665(false)];
         int var5 = arg1.method655((byte)113);
         int var6 = arg1.method655((byte)108);
         if (arg0 < 63) {
            field6467 = null;
         }

         int var7 = arg1.method685(-2);
         int var8 = arg1.method685(-2);
         int var9 = arg1.method701(255);
         int var10 = arg1.method701(255);
         int var11 = arg1.method701(255);
         boolean var12 = arg1.method665(false) == 1;
         return new class283(var2, var3, var4, var5, var6, var7, var8, var9, var10, var11, var12);
      } catch (RuntimeException var14) {
         throw class612.method4503(var14, field6468[2] + arg0 + ',' + (arg1 != null ? field6468[1] : field6468[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3438(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 94);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vda",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3439(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 20;
            break;
         case 3:
            var10005 = 74;
            break;
         default:
            var10005 = 94;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
