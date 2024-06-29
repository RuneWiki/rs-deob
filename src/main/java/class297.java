import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rs")
public abstract class class297 {
   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4418 = method2478(method2477("_(K\u000f\u0001"));
   @OriginalMember(
      owner = "client!rs",
      name = "b",
      descriptor = "J"
   )
   public static long field4414 = (long)(9.999999999E9D * Math.random());
   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "Lhf;"
   )
   public static class198 field4417 = new class198("", 17);
   @OriginalMember(
      owner = "client!rs",
      name = "c",
      descriptor = "I"
   )
   public static int field4416;
   @OriginalMember(
      owner = "client!rs",
      name = "d",
      descriptor = "Lsa;"
   )
   public static class39 field4415;

   @OriginalMember(
      owner = "client!rs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2476(int arg0) {
      try {
         field4415 = null;
         if (arg0 <= 103) {
            field4416 = 118;
         }

         field4417 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4418 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 45;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
