import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dl")
public class class69 {
   @OriginalMember(
      owner = "client!dl",
      name = "c",
      descriptor = "Lhw;"
   )
   private class141 field1243;
   @OriginalMember(
      owner = "client!dl",
      name = "e",
      descriptor = "I"
   )
   public int field1242;
   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1246 = new String[]{method744(method743("/EP\u0007}")), method744(method743("/EPz<%@\nx}")), method744(method743("%\\\u0012*")), method744(method743("0\u0007Ph("))};
   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "Lws;"
   )
   public static class374 field1241 = new class374(8);
   @OriginalMember(
      owner = "client!dl",
      name = "b",
      descriptor = "I"
   )
   public static int field1245 = 0;
   @OriginalMember(
      owner = "client!dl",
      name = "d",
      descriptor = "Lgh;"
   )
   public static class572 field1244 = new class572(75, -2);

   @OriginalMember(
      owner = "client!dl",
      name = "a",
      descriptor = "(B)V",
      line = 9
   )
   public static void method742(byte arg0) {
      try {
         field1241 = null;
         if (arg0 <= 126) {
            field1241 = null;
         }

         field1244 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1246[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "<init>",
      descriptor = "(Lca;ILhw;)V",
      line = 35
   )
   public class69(class320 arg0, int arg1, class141 arg2) {
      new class179(64);

      try {
         this.field1243 = arg2;
         this.field1242 = this.field1243.method1346(15, 0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field1246[1] + (arg0 != null ? field1246[3] : field1246[2]) + ',' + arg1 + ',' + (arg2 != null ? field1246[3] : field1246[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method743(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method744(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 41;
            break;
         case 2:
            var10005 = 126;
            break;
         case 3:
            var10005 = 70;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
