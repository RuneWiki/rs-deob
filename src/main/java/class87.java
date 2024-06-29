import java.util.Calendar;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jv")
public class class87 {
   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1428 = new String[]{method856(method855("KMj\u00145")), method856(method855("KMj\u00175"))};
   @OriginalMember(
      owner = "client!jv",
      name = "b",
      descriptor = "Ljava/lang/String;"
   )
   public static String field1426 = null;
   @OriginalMember(
      owner = "client!jv",
      name = "c",
      descriptor = "I"
   )
   public static int field1425;
   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "I"
   )
   public static int field1427;

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(IIJZ)Ljava/lang/String;",
      line = 10
   )
   public static final String method853(int arg0, int arg1, long arg2, boolean arg3) {
      try {
         if (arg1 > -42) {
            return null;
         } else {
            Calendar var5;
            label21: {
               ++field1427;
               if (arg3) {
                  class164.method1496(30401, arg2);
                  var5 = class62.field1158;
                  if (!client.field4564) {
                     break label21;
                  }
               }

               class62.method673(arg2, (byte)24);
               var5 = class62.field1161;
            }

            int var6 = var5.get(5);
            int var7 = var5.get(2);
            int var8 = var5.get(1);
            int var9 = var5.get(11);
            int var10 = var5.get(12);
            return ~arg0 == -4 ? class752.method5447(arg2, 123, arg3, arg0) : Integer.toString(var6 / 10) + var6 % 10 + "-" + class459.field6726[arg0][var7] + "-" + var8 + " " + var9 / 10 + var9 % 10 + ":" + var10 / 10 + var10 % 10;
         }
      } catch (RuntimeException var12) {
         throw class608.method4462(var12, field1428[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "a",
      descriptor = "(B)V",
      line = 47
   )
   public static void method854(byte arg0) {
      try {
         field1426 = null;
         if (arg0 != -127) {
            method854((byte)-116);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field1428[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method855(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 29);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jv",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method856(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 68;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 29;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
