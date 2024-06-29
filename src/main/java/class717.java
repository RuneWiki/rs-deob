import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vm")
public class class717 {
   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10513 = method5216(method5215(" \u0012eE\f"));
   @OriginalMember(
      owner = "client!vm",
      name = "g",
      descriptor = "Lod;"
   )
   public static class536 field10510 = new class536();
   @OriginalMember(
      owner = "client!vm",
      name = "b",
      descriptor = "I"
   )
   public int field10508;
   @OriginalMember(
      owner = "client!vm",
      name = "d",
      descriptor = "Lui;"
   )
   public static class241 field10512;
   @OriginalMember(
      owner = "client!vm",
      name = "f",
      descriptor = "Ldt;"
   )
   public class253 field10506;
   @OriginalMember(
      owner = "client!vm",
      name = "c",
      descriptor = "Lkg;"
   )
   public static class286 field10509;
   @OriginalMember(
      owner = "client!vm",
      name = "e",
      descriptor = "Lhb;"
   )
   public static class759 field10511;
   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "[I"
   )
   public int[] field10507;

   @OriginalMember(
      owner = "client!vm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5214(int arg0) {
      try {
         field10512 = null;
         field10510 = null;
         field10511 = null;
         if (arg0 != 7412) {
            field10512 = null;
         }

         field10509 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10513 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5215(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5216(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 4;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
