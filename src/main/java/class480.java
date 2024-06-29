import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oja")
public class class480 {
   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6888 = method3496(method3495("g=m\u001aP "));
   @OriginalMember(
      owner = "client!oja",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field6886 = new class118(0, -2);
   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "F"
   )
   public static float field6887 = 0.0F;

   @OriginalMember(
      owner = "client!oja",
      name = "a",
      descriptor = "(I)V",
      line = 14
   )
   public static void method3494(int arg0) {
      try {
         if (arg0 > -65) {
            field6886 = null;
         }

         field6886 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field6888 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3495(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 17);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3496(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 87;
            break;
         case 2:
            var10005 = 12;
            break;
         case 3:
            var10005 = 52;
            break;
         default:
            var10005 = 17;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
