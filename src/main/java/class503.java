import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lia")
public class class503 {
   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7470 = new String[]{method3752(method3751("C`mDB\u0007")), method3752(method3751("C`mDA\u0007"))};
   @OriginalMember(
      owner = "client!lia",
      name = "b",
      descriptor = "[J"
   )
   public static long[] field7465 = new long[256];
   @OriginalMember(
      owner = "client!lia",
      name = "f",
      descriptor = "[Ldk;"
   )
   public static class536[] field7468;
   @OriginalMember(
      owner = "client!lia",
      name = "d",
      descriptor = "Ldw;"
   )
   public static class748 field7469;
   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "I"
   )
   public static int field7464;
   @OriginalMember(
      owner = "client!lia",
      name = "e",
      descriptor = "I"
   )
   public static int field7466;
   @OriginalMember(
      owner = "client!lia",
      name = "c",
      descriptor = "I"
   )
   public static int field7467;

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3749(int arg0) {
      try {
         field7465 = null;
         field7469 = null;
         if (arg0 == 37) {
            field7468 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7470[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lia",
      name = "a",
      descriptor = "(Z)I"
   )
   public static final int method3750(boolean arg0) {
      try {
         ++field7467;
         if ((double)class329.field4680 == 3.0D) {
            return 37;
         } else if ((double)class329.field4680 == 4.0D) {
            return 50;
         } else if ((double)class329.field4680 == 6.0D) {
            return 75;
         } else if ((double)class329.field4680 == 8.0D) {
            return 100;
         } else {
            if (!arg0) {
               method3749(18);
            }

            return 200;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7470[0] + arg0 + ')');
      }
   }

   static {
      for(int var0 = 0; var0 < 256; ++var0) {
         long var1 = (long)var0;

         for(int var3 = 0; ~var3 > -9; ++var3) {
            if (~(1L & var1) == -2L) {
               var1 = -3932672073523589310L ^ var1 >>> 1;
            } else {
               var1 >>>= 1;
            }
         }

         field7465[var0] = var1;
      }

      field7468 = new class536[37];
      field7469 = new class748(128, 4);
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3751(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 3);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3752(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 47;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 106;
            break;
         default:
            var10005 = 3;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
