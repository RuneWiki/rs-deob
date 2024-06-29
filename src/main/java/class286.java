import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wfa")
public class class286 {
   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4293 = new String[]{method2383(method2382("yF\u0019=\u0019&")), method2383(method2382("`U\u0014\u007f")), method2383(method2382("u\u000eV=%")), method2383(method2382("yF\u0019=\u001a&"))};
   @OriginalMember(
      owner = "client!wfa",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field4290 = false;
   @OriginalMember(
      owner = "client!wfa",
      name = "b",
      descriptor = "I"
   )
   public static int field4289;
   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "I"
   )
   public static int field4291;
   @OriginalMember(
      owner = "client!wfa",
      name = "c",
      descriptor = "Ljava/lang/String;"
   )
   public static String field4292;

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2380(int arg0) {
      try {
         field4292 = null;
         if (arg0 != 22852) {
            method2381(-12, (class358)null);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4293[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "a",
      descriptor = "(ILoga;)Z"
   )
   public static final boolean method2381(int arg0, class358 arg1) {
      try {
         if (arg0 <= 86) {
            method2381(49, (class358)null);
         }

         ++field4291;
         return arg1 == null ? false : class216.method1865(arg1.field5297, arg1.field5290, arg1.field5294 - arg1.field5290, arg1.field5296 - arg1.field5297, -arg1.field5289 + arg1.field5286, arg1.field5289, 67);
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4293[3] + arg0 + ',' + (arg1 != null ? field4293[2] : field4293[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2382(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 88);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2383(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 32;
            break;
         case 2:
            var10005 = 120;
            break;
         case 3:
            var10005 = 19;
            break;
         default:
            var10005 = 88;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
