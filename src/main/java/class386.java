import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!raa")
public class class386 {
   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field6082 = method3126(method3125("`Vv8c:"));
   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "I"
   )
   public int field6078;
   @OriginalMember(
      owner = "client!raa",
      name = "d",
      descriptor = "I"
   )
   public static int field6079;
   @OriginalMember(
      owner = "client!raa",
      name = "b",
      descriptor = "I"
   )
   public int field6080;
   @OriginalMember(
      owner = "client!raa",
      name = "c",
      descriptor = "I"
   )
   public int field6081;

   @OriginalMember(
      owner = "client!raa",
      name = "a",
      descriptor = "(I)V",
      line = 6
   )
   public static final void method3124(int arg0) {
      try {
         class263.field4321.method3149(-90);
         if (arg0 != -30192) {
            method3124(-33);
         }

         ++field6079;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field6082 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3125(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 34);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!raa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3126(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 55;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 34;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
