import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!be")
public class class41 extends class305 {
   @OriginalMember(
      owner = "client!be",
      name = "y",
      descriptor = "Leka;"
   )
   public class488 field959;
   @OriginalMember(
      owner = "client!be",
      name = "A",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field963 = new String[]{method485(method484("\\_y\u0003")), method485(method484("I\u0004;Aj")), method485(method484("PO;S~\\CaQ?")), method485(method484("PO;.?"))};
   @OriginalMember(
      owner = "client!be",
      name = "v",
      descriptor = "Lgh;"
   )
   public static class572 field958 = new class572(9, 7);
   @OriginalMember(
      owner = "client!be",
      name = "x",
      descriptor = "I"
   )
   public static int field962 = 0;
   @OriginalMember(
      owner = "client!be",
      name = "w",
      descriptor = "I"
   )
   public static int field960;
   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "[I"
   )
   public static int[] field961;

   @OriginalMember(
      owner = "client!be",
      name = "<init>",
      descriptor = "(Leka;)V",
      line = 11
   )
   public class41(class488 arg0) {
      try {
         this.field959 = arg0;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field963[2] + (arg0 != null ? field963[1] : field963[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "a",
      descriptor = "(I)V",
      line = 24
   )
   public static void method483(int arg0) {
      try {
         field961 = null;
         field958 = null;
         if (arg0 != 7) {
            method483(-63);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field963[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method484(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!be",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method485(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 42;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 111;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
