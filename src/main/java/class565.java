import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nk")
public class class565 {
   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8388 = new String[]{method4263(method4262("\u0001MYaz")), method4263(method4262("\u0001MYbz"))};
   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "Luk;"
   )
   public static class498 field8385 = new class498(23, 4);
   @OriginalMember(
      owner = "client!nk",
      name = "c",
      descriptor = "Lfja;"
   )
   public static class4 field8387 = new class4();
   @OriginalMember(
      owner = "client!nk",
      name = "b",
      descriptor = "I"
   )
   public static int field8386;

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4260(int arg0) {
      try {
         if (arg0 > -2) {
            field8385 = null;
         }

         field8385 = null;
         field8387 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8388[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "a",
      descriptor = "(IB)I"
   )
   public static final int method4261(int arg0, byte arg1) {
      try {
         ++field8386;
         if (arg1 > -26) {
            method4261(32, (byte)72);
         }

         return 127 & arg0;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8388[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4262(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4263(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 111;
            break;
         case 1:
            var10005 = 38;
            break;
         case 2:
            var10005 = 119;
            break;
         case 3:
            var10005 = 32;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
