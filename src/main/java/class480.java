import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class480 extends class294 {
   @OriginalMember(
      owner = "client!nm",
      name = "n",
      descriptor = "I"
   )
   public int field7297;
   @OriginalMember(
      owner = "client!nm",
      name = "q",
      descriptor = "I"
   )
   public int field7294;
   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7298 = new String[]{method3732(method3731(",+\u0001'P")), method3732(method3731(",+\u0001Z\u0011,/[XP"))};
   @OriginalMember(
      owner = "client!nm",
      name = "m",
      descriptor = "I"
   )
   public static int field7293 = 64;
   @OriginalMember(
      owner = "client!nm",
      name = "p",
      descriptor = "Z"
   )
   public static boolean field7295 = false;
   @OriginalMember(
      owner = "client!nm",
      name = "o",
      descriptor = "I"
   )
   public static int field7296;

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method3730(int arg0, int arg1) {
      try {
         int var2 = 52 / ((-76 - arg0) / 38);
         ++field7296;
         return ~arg1 == -3 || ~arg1 == -4;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7298[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class480(int arg0, int arg1) {
      try {
         this.field7297 = arg1;
         this.field7294 = arg0;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7298[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3731(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 120);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3732(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 66;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 47;
            break;
         case 3:
            var10005 = 102;
            break;
         default:
            var10005 = 120;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
