import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ee")
public class class706 extends class3 {
   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10318 = method5140(method5139("\u0004*?7#"));
   @OriginalMember(
      owner = "client!ee",
      name = "m",
      descriptor = "Ltn;"
   )
   public static class95 field10312 = new class95();
   @OriginalMember(
      owner = "client!ee",
      name = "k",
      descriptor = "F"
   )
   public static float field10314 = 1.0F;
   @OriginalMember(
      owner = "client!ee",
      name = "p",
      descriptor = "I"
   )
   public int field10309;
   @OriginalMember(
      owner = "client!ee",
      name = "j",
      descriptor = "I"
   )
   public int field10311;
   @OriginalMember(
      owner = "client!ee",
      name = "r",
      descriptor = "I"
   )
   public int field10313;
   @OriginalMember(
      owner = "client!ee",
      name = "o",
      descriptor = "I"
   )
   public int field10317;
   @OriginalMember(
      owner = "client!ee",
      name = "l",
      descriptor = "Lcl;"
   )
   public class279 field10316;
   @OriginalMember(
      owner = "client!ee",
      name = "q",
      descriptor = "Lew;"
   )
   public static class521 field10310;
   @OriginalMember(
      owner = "client!ee",
      name = "n",
      descriptor = "[[[B"
   )
   public static byte[][][] field10315;

   @OriginalMember(
      owner = "client!ee",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5138(int arg0) {
      try {
         int var1 = 113 % ((-51 - arg0) / 61);
         field10312 = null;
         field10315 = null;
         field10310 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field10318 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5139(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ee",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5140(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 97;
            break;
         case 1:
            var10005 = 79;
            break;
         case 2:
            var10005 = 17;
            break;
         case 3:
            var10005 = 118;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
