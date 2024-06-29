import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qj")
public class class538 implements class518 {
   @OriginalMember(
      owner = "client!qj",
      name = "g",
      descriptor = "I"
   )
   public int field7679;
   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7682 = new String[]{method3879(method3878("t\u001f2H\u0019")), method3879(method3878("t\u001f26Xk\u001ch4\u0019")), method3879(method3878("t\u001f2K\u0019"))};
   @OriginalMember(
      owner = "client!qj",
      name = "c",
      descriptor = "I"
   )
   public static int field7675 = -1;
   @OriginalMember(
      owner = "client!qj",
      name = "b",
      descriptor = "Lek;"
   )
   public static class536 field7677 = new class536(16, 3);
   @OriginalMember(
      owner = "client!qj",
      name = "f",
      descriptor = "Z"
   )
   public static boolean field7680 = false;
   @OriginalMember(
      owner = "client!qj",
      name = "d",
      descriptor = "I"
   )
   public static int field7681 = -1;
   @OriginalMember(
      owner = "client!qj",
      name = "e",
      descriptor = "I"
   )
   public static int field7678;
   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "[Ldha;"
   )
   public static class85[] field7676;

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(B)Lqca;"
   )
   public final class127 method993(byte arg0) {
      try {
         if (arg0 != -48) {
            field7677 = null;
         }

         ++field7678;
         return class592.field8711;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7682[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3877(int arg0) {
      try {
         if (arg0 != -17252) {
            method3877(12);
         }

         field7676 = null;
         field7677 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field7682[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class538(int arg0) {
      try {
         this.field7679 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7682[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3878(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3879(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 5;
            break;
         case 1:
            var10005 = 117;
            break;
         case 2:
            var10005 = 28;
            break;
         case 3:
            var10005 = 10;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
