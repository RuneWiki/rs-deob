import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ada")
public class class171 extends class370 {
   @OriginalMember(
      owner = "client!ada",
      name = "U",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2657 = new String[]{method1541(method1540("\u0003\tD7*#E")), method1541(method1540("\u0003\tD7+#E"))};
   @OriginalMember(
      owner = "client!ada",
      name = "T",
      descriptor = "[B"
   )
   public static byte[] field2656 = new byte[2048];
   @OriginalMember(
      owner = "client!ada",
      name = "S",
      descriptor = "I"
   )
   public static int field2653;
   @OriginalMember(
      owner = "client!ada",
      name = "Q",
      descriptor = "I"
   )
   public static int field2654;
   @OriginalMember(
      owner = "client!ada",
      name = "R",
      descriptor = "I"
   )
   public static int field2655;
   @OriginalMember(
      owner = "client!ada",
      name = "P",
      descriptor = "[Lvca;"
   )
   public static class294[] field2652;

   @OriginalMember(
      owner = "client!ada",
      name = "a",
      descriptor = "(BI)Z"
   )
   public static final boolean method1538(byte arg0, int arg1) {
      try {
         ++field2654;
         int var2 = arg0 & 255;
         if (~var2 == arg1) {
            return false;
         } else {
            return ~var2 > -129 || var2 >= 160 || ~class685.field10078[var2 + -128] != -1;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2657[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "c",
      descriptor = "(I)V"
   )
   public static void method1539(int arg0) {
      try {
         if (arg0 == 29751) {
            field2656 = null;
            field2652 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2657[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1540(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 105);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ada",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1541(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 98;
            break;
         case 1:
            var10005 = 109;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 105;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
