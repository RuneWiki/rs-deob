import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ea")
public class class570 {
   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8253 = new String[]{method4238(method4237("yL\u0003$l")), method4238(method4237("yL\u0003'l"))};
   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "[[B"
   )
   public static byte[][] field8251 = new byte[1000][];
   @OriginalMember(
      owner = "client!ea",
      name = "b",
      descriptor = "Luw;"
   )
   public static class435 field8252 = new class435(43, 3);
   @OriginalMember(
      owner = "client!ea",
      name = "c",
      descriptor = "I"
   )
   public static int field8250;

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4235(int arg0) {
      try {
         field8251 = null;
         if (arg0 != 3) {
            method4235(30);
         }

         field8252 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field8253[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method4236(byte arg0) {
      try {
         class625.field9095.method297((0.1F * (float)class510.field7454.field11154.method1043(false) + 0.7F) * class460.field6740);
         ++field8250;
         int var1 = -97 % ((arg0 - -19) / 34);
         class625.field9095.method337(class14.field199, class202.field3028, class527.field7685, (float)(class646.field9391 << 2), (float)(class656.field9581 << 2), (float)(class149.field2394 << 2));
         class625.field9095.method402(class749.field10810);
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field8253[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4237(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 68);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ea",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4238(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 28;
            break;
         case 1:
            var10005 = 45;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 101;
            break;
         default:
            var10005 = 68;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
