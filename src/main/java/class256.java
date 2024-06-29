import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!uha")
public class class256 {
   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3277 = new String[]{method1964(method1963("+A\u0003ALv")), method1964(method1963("+A\u0003AOv")), method1964(method1963("+A\u0003AMv"))};
   @OriginalMember(
      owner = "client!uha",
      name = "c",
      descriptor = "I"
   )
   public static int field3272 = 0;
   @OriginalMember(
      owner = "client!uha",
      name = "e",
      descriptor = "I"
   )
   public static int field3273;
   @OriginalMember(
      owner = "client!uha",
      name = "b",
      descriptor = "I"
   )
   public static int field3274;
   @OriginalMember(
      owner = "client!uha",
      name = "f",
      descriptor = "I"
   )
   public static int field3276;
   @OriginalMember(
      owner = "client!uha",
      name = "d",
      descriptor = "Ljd;"
   )
   public static class242 field3271;
   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "[S"
   )
   public static short[] field3275;

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method1960(int arg0, int arg1, int arg2) {
      try {
         int var3 = 101 / (-arg1 / 34);
         ++field3276;
         return ~(arg2 & 33) != -1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3277[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(ZC)Z"
   )
   public static final boolean method1961(boolean arg0, char arg1) {
      try {
         if (arg0) {
            method1962(true);
         }

         ++field3273;
         return ~arg1 <= -66 && arg1 <= 'Z' || arg1 >= 'a' && arg1 <= 'z';
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3277[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1962(boolean arg0) {
      try {
         field3271 = null;
         field3275 = null;
         if (!arg0) {
            field3272 = 68;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3277[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1963(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!uha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1964(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 94;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
