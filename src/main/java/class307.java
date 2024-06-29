import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tha")
public class class307 {
   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4435 = method2403(method2402("r\\i;\u0015."));
   @OriginalMember(
      owner = "client!tha",
      name = "b",
      descriptor = "Lhm;"
   )
   public static class230 field4433 = new class230(12, 0, 1, 0);
   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "Lgba;"
   )
   public static class694 field4434;

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2400(int arg0) {
      try {
         field4433 = null;
         field4434 = null;
         if (arg0 <= 60) {
            field4434 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4435 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tha",
      name = "a",
      descriptor = "()V"
   )
   public static final void method2401() {
      class612.method4498(1, class323.field4655);
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2402(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 84);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2403(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 6;
            break;
         case 1:
            var10005 = 52;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 21;
            break;
         default:
            var10005 = 84;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
