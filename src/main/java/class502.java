import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nm")
public class class502 {
   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6892 = new String[]{method3628(method3627(">\\\u00145\u0003\u0003EH(\u00027\u0019")), method3628(method3627(">\\\u0014\u0000D"))};
   @OriginalMember(
      owner = "client!nm",
      name = "d",
      descriptor = "Lbga;"
   )
   public static class378 field6888 = new class378(54, 6);
   @OriginalMember(
      owner = "client!nm",
      name = "c",
      descriptor = "I"
   )
   public static int field6890 = 1407;
   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class378 field6891 = new class378(136, -2);
   @OriginalMember(
      owner = "client!nm",
      name = "b",
      descriptor = "I"
   )
   public static int field6889;

   @OriginalMember(
      owner = "client!nm",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3626(int arg0) {
      try {
         int var1 = 32 / ((arg0 - -14) / 37);
         field6891 = null;
         field6888 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field6892[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field6889;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6892[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3627(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 108);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3628(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 80;
            break;
         case 1:
            var10005 = 49;
            break;
         case 2:
            var10005 = 58;
            break;
         case 3:
            var10005 = 65;
            break;
         default:
            var10005 = 108;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
