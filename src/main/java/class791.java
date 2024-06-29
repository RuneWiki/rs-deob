import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rw")
public abstract class class791 {
   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field11602 = method5708(method5707("Lop#\r"));
   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "Leg;"
   )
   public static class118 field11601 = new class118(48, 6);

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "([FZIIIFIFFIF)V"
   )
   public abstract void method2734(float[] arg0, boolean arg1, int arg2, int arg3, int arg4, float arg5, int arg6, float arg7, float arg8, int arg9, float arg10);

   @OriginalMember(
      owner = "client!rw",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method5706(int arg0) {
      try {
         field11601 = null;
         if (arg0 != 48) {
            method5706(-6);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11602 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5707(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 37);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5708(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 37;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
