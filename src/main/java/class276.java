import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qca")
public class class276 extends class294 {
   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4411 = method2330(method2329("UPBp\u001a\f"));
   @OriginalMember(
      owner = "client!qca",
      name = "o",
      descriptor = "Lnaa;"
   )
   public static class113 field4405 = new class113(58, -1);
   @OriginalMember(
      owner = "client!qca",
      name = "q",
      descriptor = "I"
   )
   public static int field4408 = 0;
   @OriginalMember(
      owner = "client!qca",
      name = "m",
      descriptor = "Luk;"
   )
   public static class498 field4407 = new class498(44, -2);
   @OriginalMember(
      owner = "client!qca",
      name = "n",
      descriptor = "F"
   )
   public static float field4409;
   @OriginalMember(
      owner = "client!qca",
      name = "p",
      descriptor = "I"
   )
   public int field4404;
   @OriginalMember(
      owner = "client!qca",
      name = "r",
      descriptor = "I"
   )
   public int field4406;
   @OriginalMember(
      owner = "client!qca",
      name = "s",
      descriptor = "[I"
   )
   public static int[] field4410;

   @OriginalMember(
      owner = "client!qca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2328(int arg0) {
      try {
         field4405 = null;
         if (arg0 != -1) {
            field4407 = null;
         }

         field4407 = null;
         field4410 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4411 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2329(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 91);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2330(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 51;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 94;
            break;
         default:
            var10005 = 91;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
