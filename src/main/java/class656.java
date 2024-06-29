import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!go")
public class class656 {
   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9597 = new String[]{method4804(method4803("Yp\u0002u\u001cmk^h\u001dY7")), method4804(method4803("Yp\u0002@["))};
   @OriginalMember(
      owner = "client!go",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field9594 = new class118(121, 1);
   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "I"
   )
   public static int field9595;
   @OriginalMember(
      owner = "client!go",
      name = "c",
      descriptor = "I"
   )
   public static int field9596;

   @OriginalMember(
      owner = "client!go",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4802(int arg0) {
      try {
         field9594 = null;
         if (arg0 <= 10) {
            method4802(6);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9597[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9595;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field9597[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4803(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 115);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!go",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4804(char[] arg0) {
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
            var10005 = 31;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 115;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
