import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qs")
public class class633 {
   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8960 = new String[]{method4599(method4598("\u000b\f\u0000\u000e\u0001")), method4599(method4598("\u000b\f\u0000\r\u0001"))};
   @OriginalMember(
      owner = "client!qs",
      name = "c",
      descriptor = "I"
   )
   public static int field8954 = -1;
   @OriginalMember(
      owner = "client!qs",
      name = "e",
      descriptor = "I"
   )
   public static int field8955 = 0;
   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "Lnw;"
   )
   public static class616 field8956 = new class616(31, 4);
   @OriginalMember(
      owner = "client!qs",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field8959 = new int[6];
   @OriginalMember(
      owner = "client!qs",
      name = "d",
      descriptor = "I"
   )
   public static int field8957;
   @OriginalMember(
      owner = "client!qs",
      name = "b",
      descriptor = "Lha;"
   )
   public static class65 field8958;

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4596(int arg0) {
      try {
         if (arg0 >= -90) {
            method4597((byte)-2);
         }

         field8959 = null;
         field8956 = null;
         field8958 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8960[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "a",
      descriptor = "(B)[Ldg;"
   )
   public static final class436[] method4597(byte arg0) {
      try {
         if (arg0 > -24) {
            method4596(42);
         }

         ++field8957;
         return new class436[]{class304.field4027, class668.field9492, class146.field1928, class603.field8404, class5.field30, class234.field2895, class216.field2688};
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8960[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4598(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 41);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qs",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4599(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 127;
            break;
         case 2:
            var10005 = 46;
            break;
         case 3:
            var10005 = 79;
            break;
         default:
            var10005 = 41;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
