import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jt")
public class class114 {
   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field1425 = method925(method924("&\u0010\u0002\u0013q"));
   @OriginalMember(
      owner = "client!jt",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1423 = false;
   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "I"
   )
   public static int field1424;

   @OriginalMember(
      owner = "client!jt",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method923(byte arg0) {
      try {
         ++class759.field11230;
         ++field1424;
         if (arg0 != 119) {
            field1423 = false;
         }

         class10 var1 = class292.method2192(-9730);
         class447 var2 = class40.method350(class692.field10181, var1.field106, true);
         var2.field6359.method1186(0, 0);
         var1.method55(arg0 ^ 13247, var2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field1425 + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method924(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 89);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method925(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 76;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 89;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
