import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oaa")
public class class302 {
   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field4217 = method2356(method2355("\n\u001b1\u007f~M"));
   @OriginalMember(
      owner = "client!oaa",
      name = "c",
      descriptor = "I"
   )
   public static int field4214 = -1;
   @OriginalMember(
      owner = "client!oaa",
      name = "b",
      descriptor = "I"
   )
   public static int field4215;
   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "I"
   )
   public static int field4216;

   @OriginalMember(
      owner = "client!oaa",
      name = "a",
      descriptor = "(I)V",
      line = 13
   )
   public static final void method2354(int arg0) {
      try {
         class201.field3007.method160(true);
         ++field4215;
         if (arg0 > -71) {
            method2354(34);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field4217 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2355(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 63);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2356(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 122;
            break;
         case 2:
            var10005 = 80;
            break;
         case 3:
            var10005 = 81;
            break;
         default:
            var10005 = 63;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
