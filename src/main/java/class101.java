import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vf")
public class class101 {
   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1325 = method910(method909("RwQ},"));
   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "I"
   )
   public static int field1323;
   @OriginalMember(
      owner = "client!vf",
      name = "b",
      descriptor = "I"
   )
   public static int field1324;

   @OriginalMember(
      owner = "client!vf",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method908(int arg0) {
      try {
         client.field1479 = new class142[50];
         ++field1323;
         class128.field1640 = arg0;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field1325 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method909(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 4);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vf",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method910(char[] arg0) {
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
            var10005 = 17;
            break;
         case 2:
            var10005 = 127;
            break;
         case 3:
            var10005 = 60;
            break;
         default:
            var10005 = 4;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
