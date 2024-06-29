import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jn")
public class class527 {
   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7462 = new String[]{method3956(method3955("xU)\u0006L")), method3956(method3955("xU)\u0003L")), method3956(method3955("xU)\u0000L")), method3956(method3955("xU)\u0001L"))};
   @OriginalMember(
      owner = "client!jn",
      name = "f",
      descriptor = "Lfm;"
   )
   public static class164 field7457 = new class164(28, 1);
   @OriginalMember(
      owner = "client!jn",
      name = "h",
      descriptor = "[I"
   )
   public static int[] field7458 = new int[3];
   @OriginalMember(
      owner = "client!jn",
      name = "b",
      descriptor = "I"
   )
   public static int field7459 = 0;
   @OriginalMember(
      owner = "client!jn",
      name = "e",
      descriptor = "B"
   )
   public static byte field7460;
   @OriginalMember(
      owner = "client!jn",
      name = "c",
      descriptor = "I"
   )
   public static int field7454;
   @OriginalMember(
      owner = "client!jn",
      name = "d",
      descriptor = "I"
   )
   public static int field7455;
   @OriginalMember(
      owner = "client!jn",
      name = "g",
      descriptor = "I"
   )
   public static int field7456;
   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "Ldr;"
   )
   public static class242 field7461;

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method3951(int arg0, int arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         int var4 = 79 / ((arg1 - 59) / 41);
         ++field7455;
         int var6;
         if (~arg2 > ~arg0) {
            int var5 = arg2;
            arg2 = arg0;
            arg0 = var5;
            if (var3) {
               var6 = arg2 % var5;
               arg2 = var5;
               arg0 = var6;
            }
         }

         while(true) {
            int var10000;
            if (arg0 == 0) {
               var10000 = arg2;
               if (!var3) {
                  return arg2;
               }
            } else {
               var10000 = arg2 % arg0;
            }

            var6 = var10000;
            arg2 = arg0;
            arg0 = var6;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field7462[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(IC)Z"
   )
   public static final boolean method3952(int arg0, char arg1) {
      try {
         if (arg0 > -32) {
            field7461 = null;
         }

         ++field7454;
         if (arg1 >= ' ' && arg1 <= '~') {
            return true;
         } else if (arg1 >= 160 && ~arg1 >= -256) {
            return true;
         } else {
            return ~arg1 == -8365 || arg1 == 338 || ~arg1 == -8213 || ~arg1 == -340 || ~arg1 == -377;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field7462[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(Z)Z"
   )
   public static final boolean method3953(boolean arg0) {
      try {
         ++field7456;
         if (arg0) {
            return true;
         } else {
            return ~class687.field9909 < -1;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7462[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3954(int arg0) {
      try {
         field7458 = null;
         field7457 = null;
         field7461 = null;
         if (arg0 != -8365) {
            method3951(-26, -68, -32);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field7462[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3955(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 100);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3956(char[] arg0) {
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
            var10005 = 59;
            break;
         case 2:
            var10005 = 7;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 100;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
