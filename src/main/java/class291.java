import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class291 {
   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4026 = method2191(method2190("%A8_\\"));
   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "Lqca;"
   )
   public static class127 field4020 = new class127(3, 2);
   @OriginalMember(
      owner = "client!up",
      name = "f",
      descriptor = "Leg;"
   )
   public static class118 field4024 = new class118(113, 4);
   @OriginalMember(
      owner = "client!up",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field4025 = false;
   @OriginalMember(
      owner = "client!up",
      name = "c",
      descriptor = "I"
   )
   public int field4019;
   @OriginalMember(
      owner = "client!up",
      name = "d",
      descriptor = "I"
   )
   public int field4021;
   @OriginalMember(
      owner = "client!up",
      name = "g",
      descriptor = "I"
   )
   public int field4022;
   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "I"
   )
   public int field4023;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2189(int arg0) {
      try {
         field4020 = null;
         field4024 = null;
         if (arg0 != 3) {
            method2189(-32);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field4026 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2190(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 116);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2191(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 30;
            break;
         default:
            var10005 = 116;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
