import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tg")
public class class241 extends class759 {
   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3485 = method1969(method1968("APt\u0004\u000f"));
   @OriginalMember(
      owner = "client!tg",
      name = "h",
      descriptor = "I"
   )
   public static int field3483 = 0;
   @OriginalMember(
      owner = "client!tg",
      name = "g",
      descriptor = "I"
   )
   public static int field3484;

   @OriginalMember(
      owner = "client!tg",
      name = "b",
      descriptor = "(I)V",
      line = 18
   )
   public static final void method1967(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field3484;
         int var2 = class158.field2525;
         int[] var3 = class442.field6446;
         int var4 = arg0;
         if (var1 || var2 > arg0) {
            do {
               class457 var5 = class458.field6723[var3[var4]];
               if (var5 != null) {
                  class183.method1613(var5, (byte)-3, var5.method3438(false));
               }

               ++var4;
            } while(var2 > var4);

         }
      } catch (RuntimeException var7) {
         throw class608.method4462(var7, field3485 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1968(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 39);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tg",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1969(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 90;
            break;
         case 3:
            var10005 = 69;
            break;
         default:
            var10005 = 39;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
