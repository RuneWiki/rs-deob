import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eia")
public class class252 {
   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3607 = new String[]{method2040(method2039("\u001eSI`GS")), method2040(method2039("\u001eSI`FS")), method2040(method2039("\u0016[K")), method2040(method2039("\fSF")), method2040(method2039("\u0013[^+l\u001e\f")), method2040(method2039("\u0013[^+c\u0012HM(j\u0003")), method2040(method2039("\u001eSI`DS")), method2040(method2039("\u0015OD\"")), method2040(method2039("\u0000\u0014\u0006`x"))};
   @OriginalMember(
      owner = "client!eia",
      name = "e",
      descriptor = "I"
   )
   public static int field3602;
   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "I"
   )
   public static int field3605;
   @OriginalMember(
      owner = "client!eia",
      name = "b",
      descriptor = "Lhq;"
   )
   public static class166 field3601;
   @OriginalMember(
      owner = "client!eia",
      name = "f",
      descriptor = "Ldfa;"
   )
   public static class173 field3603;
   @OriginalMember(
      owner = "client!eia",
      name = "d",
      descriptor = "Lmh;"
   )
   public static class656 field3604;
   @OriginalMember(
      owner = "client!eia",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field3606;

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(Ljava/lang/String;ZZLoo;ZLjava/lang/String;)V"
   )
   public static final void method2036(String arg0, boolean arg1, boolean arg2, class651 arg3, boolean arg4, String arg5) {
      try {
         ++field3602;
         if (!arg2) {
            if (!arg1) {
               class39.method475(arg3, 9226, arg0, 3);
            } else {
               if (class651.field9433.startsWith(field3607[3]) && arg3.field9456) {
                  String var6 = null;
                  if (class514.field7493 != null) {
                     var6 = class514.field7493.getParameter(field3607[4]);
                  }

                  if (var6 == null || !var6.equals("1")) {
                     class789 var7 = class39.method475(arg3, 9226, arg0, 0);
                     client.field4557 = arg3;
                     class285.field3970 = var7;
                     class39.field936 = arg0;
                     return;
                  }
               }

               if (class651.field9433.startsWith(field3607[2])) {
                  String var8 = null;
                  if (class514.field7493 != null) {
                     var8 = class514.field7493.getParameter(field3607[5]);
                  }

                  if (var8 != null && var8.equals("1") && arg4) {
                     class397.method3061(arg0, arg5, 1, arg3, -1);
                     return;
                  }
               }

               class39.method475(arg3, 9226, arg0, 2);
            }
         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3607[6] + (arg0 != null ? field3607[8] : field3607[7]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field3607[8] : field3607[7]) + ',' + arg4 + ',' + (arg5 != null ? field3607[8] : field3607[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2037(boolean arg0) {
      try {
         if (!arg0) {
            method2038(97, -19, 53, -104, 33, -14, 71, -29, -124, -106);
         }

         field3603 = null;
         field3604 = null;
         field3601 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3607[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "a",
      descriptor = "(IIIIIIIIII)Z"
   )
   public static final boolean method2038(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, int arg9) {
      try {
         ++field3605;
         if (!class295.method2308(arg9, 23948, arg4, arg2)) {
            return false;
         } else {
            int var20 = class320.field4609[0];
            if (arg6 != -30465) {
               field3604 = null;
            }

            int var14 = class320.field4609[2];
            int var16 = class320.field4609[1];
            if (!class295.method2308(arg1, arg6 ^ -10893, arg5, arg3)) {
               return false;
            } else {
               int var15 = class320.field4609[2];
               int var17 = class320.field4609[1];
               int var13 = class320.field4609[0];
               if (!class295.method2308(arg7, 23948, arg8, arg0)) {
                  return false;
               } else {
                  int var18 = class320.field4609[0];
                  int var12 = class320.field4609[2];
                  int var19 = class320.field4609[1];
                  return class375.method2935(var17, var12, var20, var16, var18, -102, var13, var14, var19, var15);
               }
            }
         }
      } catch (RuntimeException var11) {
         throw class608.method4462(var11, field3607[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + arg9 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2039(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 5);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2040(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 123;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 40;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 5;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
