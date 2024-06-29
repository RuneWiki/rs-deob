import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ts")
public class class565 {
   @OriginalMember(
      owner = "client!ts",
      name = "d",
      descriptor = "I"
   )
   public int field7710 = -1;
   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field7715 = method4056(method4055("}k_Oq"));
   @OriginalMember(
      owner = "client!ts",
      name = "i",
      descriptor = "Z"
   )
   public static boolean field7705 = false;
   @OriginalMember(
      owner = "client!ts",
      name = "e",
      descriptor = "I"
   )
   public int field7704;
   @OriginalMember(
      owner = "client!ts",
      name = "h",
      descriptor = "I"
   )
   public int field7706;
   @OriginalMember(
      owner = "client!ts",
      name = "k",
      descriptor = "I"
   )
   public int field7707;
   @OriginalMember(
      owner = "client!ts",
      name = "c",
      descriptor = "I"
   )
   public int field7708;
   @OriginalMember(
      owner = "client!ts",
      name = "b",
      descriptor = "I"
   )
   public int field7709;
   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "I"
   )
   public int field7711;
   @OriginalMember(
      owner = "client!ts",
      name = "g",
      descriptor = "I"
   )
   public int field7713;
   @OriginalMember(
      owner = "client!ts",
      name = "j",
      descriptor = "I"
   )
   public int field7714;
   @OriginalMember(
      owner = "client!ts",
      name = "f",
      descriptor = "Ljn;"
   )
   public static class752 field7712;

   @OriginalMember(
      owner = "client!ts",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4054(int arg0) {
      try {
         field7712 = null;
         if (arg0 < 117) {
            field7705 = false;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field7715 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4055(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ts",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4056(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 9;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 113;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
