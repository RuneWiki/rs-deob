import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kc")
public abstract class class143 extends class22 {
   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2346 = method1360(method1359("Q(\u0011'\u0007"));
   @OriginalMember(
      owner = "client!kc",
      name = "k",
      descriptor = "Luw;"
   )
   public static class435 field2344 = new class435(52, -1);
   @OriginalMember(
      owner = "client!kc",
      name = "j",
      descriptor = "[Lgi;"
   )
   public static class705[] field2345;

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(Lan;I)V"
   )
   public abstract void method456(class25 arg0, int arg1);

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(Luda;B)V"
   )
   public abstract void method457(class473 arg0, byte arg1);

   @OriginalMember(
      owner = "client!kc",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1358(int arg0) {
      try {
         field2344 = null;
         int var1 = -74 % ((arg0 - -67) / 55);
         field2345 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2346 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1359(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 47);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1360(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 75;
            break;
         case 2:
            var10005 = 63;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 47;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
