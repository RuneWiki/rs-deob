import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ma")
public class class721 {
   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10800 = new String[]{method5336(method5335("\u0004Ag[Z")), method5336(method5335("\u0007U%~")), method5336(method5335("\u0012\u000eg<\u000f")), method5336(method5335("\u0004AgZZ")), method5336(method5335("\u0004AgXZ"))};
   @OriginalMember(
      owner = "client!ma",
      name = "d",
      descriptor = "[Z"
   )
   public static boolean[] field10798 = new boolean[100];
   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field10795 = false;
   @OriginalMember(
      owner = "client!ma",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field10799 = new class498(118, 4);
   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "I"
   )
   public static int field10796;
   @OriginalMember(
      owner = "client!ma",
      name = "e",
      descriptor = "I"
   )
   public static int field10797;

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method5331(int arg0, byte arg1) {
      try {
         if (arg1 != 50) {
            return true;
         } else {
            ++field10797;
            return ~arg0 == -7 || ~arg0 == -31 || arg0 == 25 || ~arg0 == -49 || ~arg0 == -24 || arg0 == 10 || arg0 == 46;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10800[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5332(int arg0) {
      try {
         if (arg0 != 100) {
            field10795 = true;
         }

         field10798 = null;
         field10799 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10800[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "a",
      descriptor = "(Z[B)Z"
   )
   public static final boolean method5333(boolean arg0, byte[] arg1) {
      try {
         ++field10796;
         if (!arg0) {
            return false;
         } else {
            class354 var2 = new class354(arg1);
            int var3 = var2.method2855(-31007);
            if (var3 != 2) {
               return false;
            } else {
               boolean var4 = ~var2.method2855(-31007) == -2;
               if (var4) {
                  class286.method2384(var2, (byte)-118);
               }

               client.method1157((byte)37, var2);
               return true;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field10800[0] + arg0 + ',' + (arg1 != null ? field10800[2] : field10800[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ma",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method5334(int arg0) {
      class454.field6948 = arg0;
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5335(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ma",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5336(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
