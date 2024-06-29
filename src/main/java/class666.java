import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!hr")
public class class666 {
   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9976 = new String[]{method4922(method4921("/'S\u0014n\u0014!\u000f\to }")), method4922(method4921("/'S\")")), method4922(method4921("/'S!)"))};
   @OriginalMember(
      owner = "client!hr",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field9972 = new int[2];
   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "Lsn;"
   )
   public static class675 field9971 = new class675();
   @OriginalMember(
      owner = "client!hr",
      name = "e",
      descriptor = "Luk;"
   )
   public static class498 field9974 = new class498(46, 9);
   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "I"
   )
   public static int field9970;
   @OriginalMember(
      owner = "client!hr",
      name = "d",
      descriptor = "I"
   )
   public static int field9973;
   @OriginalMember(
      owner = "client!hr",
      name = "c",
      descriptor = "I"
   )
   public static int field9975;

   @OriginalMember(
      owner = "client!hr",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field9970;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9976[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "a",
      descriptor = "(B)[Lgea;"
   )
   public static final class750[] method4919(byte arg0) {
      try {
         ++field9973;
         return arg0 != 91 ? null : new class750[]{class68.field888, class58.field712, class389.field6105};
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9976[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "b",
      descriptor = "(B)V"
   )
   public static void method4920(byte arg0) {
      try {
         field9971 = null;
         field9974 = null;
         field9972 = null;
         if (arg0 != -97) {
            method4919((byte)84);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field9976[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4921(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!hr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4922(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 125;
            break;
         case 3:
            var10005 = 96;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
