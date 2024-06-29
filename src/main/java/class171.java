import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jh")
public class class171 {
   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2385 = method1396(method1395("\u0006\u000b\u001d\u001fZ"));
   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2383 = new int[256];
   @OriginalMember(
      owner = "client!jh",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field2384;

   @OriginalMember(
      owner = "client!jh",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method1394(boolean arg0) {
      try {
         if (arg0) {
            method1394(false);
         }

         field2383 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2385 + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; ~var0 > -257; ++var0) {
         int var1 = var0;

         for(int var2 = 0; ~var2 > -9; ++var2) {
            if ((1 & var1) == 1) {
               var1 = var1 >>> 1 ^ -306674912;
            } else {
               var1 >>>= 1;
            }
         }

         field2383[var0] = var1;
      }

      field2384 = true;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1395(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 114);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1396(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 108;
            break;
         case 1:
            var10005 = 99;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 114;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
