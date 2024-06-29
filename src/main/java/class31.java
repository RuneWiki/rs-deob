import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dv")
public class class31 extends class96 {
   @OriginalMember(
      owner = "client!dv",
      name = "t",
      descriptor = "Lej;"
   )
   public class394 field439;
   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field442 = new String[]{method371(method370("\u001dm\\n\b")), method371(method370("\u00025\\|\u001c\b*\u0006~]")), method371(method370("\b6\u001e,")), method371(method370("\u00025\\\u0001]"))};
   @OriginalMember(
      owner = "client!dv",
      name = "s",
      descriptor = "Lsr;"
   )
   public static class78 field438 = new class78(4);
   @OriginalMember(
      owner = "client!dv",
      name = "r",
      descriptor = "F"
   )
   public static float field441;
   @OriginalMember(
      owner = "client!dv",
      name = "q",
      descriptor = "[Lma;"
   )
   public static class148[] field440;

   @OriginalMember(
      owner = "client!dv",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method369(int arg0) {
      try {
         field440 = null;
         field438 = null;
         if (arg0 != 4) {
            method369(-52);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field442[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "<init>",
      descriptor = "(Lej;)V"
   )
   public class31(class394 arg0) {
      try {
         this.field439 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field442[1] + (arg0 != null ? field442[0] : field442[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method370(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 117);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method371(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 67;
            break;
         case 2:
            var10005 = 114;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 117;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
