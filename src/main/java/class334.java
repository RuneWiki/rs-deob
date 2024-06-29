import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cd")
public class class334 {
   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4793 = method2657(method2656("Q&\u000ek?"));
   @OriginalMember(
      owner = "client!cd",
      name = "g",
      descriptor = "I"
   )
   public static int field4786 = 0;
   @OriginalMember(
      owner = "client!cd",
      name = "b",
      descriptor = "I"
   )
   public static int field4788 = 7000;
   @OriginalMember(
      owner = "client!cd",
      name = "h",
      descriptor = "I"
   )
   public static int field4784 = field4788;
   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "Lhg;"
   )
   public static class722 field4792;
   @OriginalMember(
      owner = "client!cd",
      name = "d",
      descriptor = "Lqh;"
   )
   public static class74 field4789;
   @OriginalMember(
      owner = "client!cd",
      name = "f",
      descriptor = "[B"
   )
   public byte[] field4787;
   @OriginalMember(
      owner = "client!cd",
      name = "e",
      descriptor = "[S"
   )
   public short[] field4785;
   @OriginalMember(
      owner = "client!cd",
      name = "i",
      descriptor = "[S"
   )
   public short[] field4790;
   @OriginalMember(
      owner = "client!cd",
      name = "c",
      descriptor = "[S"
   )
   public short[] field4791;

   @OriginalMember(
      owner = "client!cd",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2655(int arg0) {
      try {
         if (arg0 != 0) {
            method2655(-123);
         }

         field4792 = null;
         field4789 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field4793 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2656(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2657(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 66;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 42;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
