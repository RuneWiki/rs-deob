import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tea")
public class class252 {
   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3440 = method1929(method1928("%EC\tZy"));
   @OriginalMember(
      owner = "client!tea",
      name = "b",
      descriptor = "Loi;"
   )
   public static class80 field3435 = new class80(4);
   @OriginalMember(
      owner = "client!tea",
      name = "c",
      descriptor = "[I"
   )
   public static int[] field3437 = new int[32];
   @OriginalMember(
      owner = "client!tea",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field3438;
   @OriginalMember(
      owner = "client!tea",
      name = "d",
      descriptor = "I"
   )
   public static int field3439;
   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "Lkf;"
   )
   public static class266 field3436;

   @OriginalMember(
      owner = "client!tea",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method1927(byte arg0) {
      try {
         field3436 = null;
         if (arg0 >= 107) {
            field3435 = null;
            field3437 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field3440 + arg0 + ')');
      }
   }

   static {
      int var0 = 2;

      for(int var1 = 0; var1 < 32; ++var1) {
         field3437[var1] = var0 + -1;
         var0 += var0;
      }

      field3438 = false;
      field3439 = 0;
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1928(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1929(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 81;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 39;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
