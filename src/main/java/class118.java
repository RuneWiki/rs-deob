import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ra")
public class class118 {
   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1446 = new String[]{method1006(method1005("\u00173J\u001cC")), method1006(method1005("\u00173J\u001fC"))};
   @OriginalMember(
      owner = "client!ra",
      name = "e",
      descriptor = "Lod;"
   )
   public static class536 field1439 = new class536();
   @OriginalMember(
      owner = "client!ra",
      name = "b",
      descriptor = "Lsq;"
   )
   public static class190 field1442 = new class190();
   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "I"
   )
   public static int field1444 = 0;
   @OriginalMember(
      owner = "client!ra",
      name = "g",
      descriptor = "Lbga;"
   )
   public static class378 field1445 = new class378(100, 8);
   @OriginalMember(
      owner = "client!ra",
      name = "c",
      descriptor = "I"
   )
   public static int field1440;
   @OriginalMember(
      owner = "client!ra",
      name = "d",
      descriptor = "I"
   )
   public static int field1441;
   @OriginalMember(
      owner = "client!ra",
      name = "f",
      descriptor = "I"
   )
   public static int field1443;

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method1003(int arg0, int arg1) {
      try {
         ++field1441;
         if (arg0 != -32614) {
            method1004(-61);
         }

         return arg1 != 1 && ~arg1 != -8;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1446[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1004(int arg0) {
      try {
         field1439 = null;
         if (arg0 == -16032) {
            field1445 = null;
            field1442 = null;
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1446[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1005(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ra",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1006(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 100;
            break;
         case 3:
            var10005 = 93;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
