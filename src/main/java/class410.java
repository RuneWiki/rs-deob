import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bj")
public class class410 {
   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6013 = new String[]{method3211(method3210("H@p\r\u001d")), method3211(method3210("H@p\u000e\u001d")), method3211(method3210("H@p\u000f\u001d"))};
   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "Lbga;"
   )
   public static class398 field6010 = new class398(8);
   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "I"
   )
   public static int field6011;
   @OriginalMember(
      owner = "client!bj",
      name = "c",
      descriptor = "I"
   )
   public static int field6012;

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(IIII)V"
   )
   public static final void method3207(int arg0, int arg1, int arg2, int arg3) {
      try {
         ++field6011;
         if (arg0 != -30125) {
            field6010 = null;
         }

         label43: {
            int var6 = arg2 * class476.field6870.field9111.method3775(arg0 ^ 30158) >> 8;
            if (arg1 == -1 && !class253.field3843) {
               class299.method2486((byte)-125);
               if (!client.field10022) {
                  break label43;
               }
            }

            if (arg1 != -1 && (class24.field344 != arg1 || !class578.method4270(65535)) && var6 != 0 && !class253.field3843) {
               class267.method2285(var6, arg1, false, arg3, class580.field8166, 0, 4789);
               class108.method1060(false);
            }
         }

         if (~class24.field344 != ~arg1) {
            class337.field4990 = null;
         }

         class24.field344 = arg1;
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6013[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method3208(boolean arg0) {
      try {
         if (!arg0) {
            method3207(-55, -114, -54, -80);
         }

         field6010 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6013[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "b",
      descriptor = "(Z)Z"
   )
   public static final boolean method3209(boolean arg0) {
      try {
         if (!arg0) {
            return false;
         } else {
            ++field6012;

            try {
               class495 var1 = new class495();
               byte[] var2 = var1.method3757(class23.field335, 87);
               class119.method1186(var2, 112);
               return true;
            } catch (Exception var4) {
               return false;
            }
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field6013[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3210(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3211(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 42;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 76;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
