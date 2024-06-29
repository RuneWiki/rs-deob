import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wca")
public class class486 {
   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6945 = method3703(method3702("D@j7(\u001b"));
   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "I"
   )
   public static int field6944 = 0;
   @OriginalMember(
      owner = "client!wca",
      name = "b",
      descriptor = "Lnd;"
   )
   public static class785 field6943;

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(Lr;III[Z)Z"
   )
   public static final boolean method3700(class412 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      boolean var5 = false;
      if (class634.field8989 != class225.field3197) {
         int var6 = class558.field7922[arg1].method5401(arg2, true, arg3);

         for(int var7 = 0; var7 <= arg1; ++var7) {
            class751 var8 = class558.field7922[var7];
            if (var8 != null) {
               int var9 = var6 - var8.method5401(arg2, true, arg3);
               if (arg4 != null) {
                  arg4[var7] = var8.method52(arg0, arg2, var9, arg3, 0, false);
                  if (!arg4[var7]) {
                     continue;
                  }
               }

               var8.method49(arg0, arg2, var9, arg3, 0, false);
               var5 = true;
            }
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3701(int arg0) {
      try {
         if (arg0 == 0) {
            field6943 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6945 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3702(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3703(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 51;
            break;
         case 1:
            var10005 = 35;
            break;
         case 2:
            var10005 = 11;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
