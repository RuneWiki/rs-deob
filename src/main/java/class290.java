import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vja")
public class class290 {
   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field3839 = method2188(method2187("`C@qY>"));
   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "I"
   )
   public static int field3832;
   @OriginalMember(
      owner = "client!vja",
      name = "c",
      descriptor = "I"
   )
   public int field3833;
   @OriginalMember(
      owner = "client!vja",
      name = "e",
      descriptor = "I"
   )
   public int field3834;
   @OriginalMember(
      owner = "client!vja",
      name = "g",
      descriptor = "I"
   )
   public int field3835;
   @OriginalMember(
      owner = "client!vja",
      name = "d",
      descriptor = "I"
   )
   public int field3836;
   @OriginalMember(
      owner = "client!vja",
      name = "b",
      descriptor = "I"
   )
   public static int field3837;
   @OriginalMember(
      owner = "client!vja",
      name = "f",
      descriptor = "I"
   )
   public static int field3838;

   @OriginalMember(
      owner = "client!vja",
      name = "a",
      descriptor = "(I)Ldl;"
   )
   public static final class69 method2186(int arg0) {
      try {
         ++field3832;
         return arg0 < 124 ? null : class131.field1647;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3839 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2187(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2188(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 33;
            break;
         case 3:
            var10005 = 95;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
