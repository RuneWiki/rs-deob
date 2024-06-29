import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!eha")
public class class96 {
   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1190 = new String[]{method852(method851("#2*4In")), method852(method851("=te4v")), method852(method851("(/'v")), method852(method851("#2*4Jn"))};
   @OriginalMember(
      owner = "client!eha",
      name = "c",
      descriptor = "I"
   )
   public static int field1187 = -1;
   @OriginalMember(
      owner = "client!eha",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field1189 = new int[250];
   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "I"
   )
   public static int field1186;
   @OriginalMember(
      owner = "client!eha",
      name = "b",
      descriptor = "I"
   )
   public static int field1188;

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(Ljj;B)Lqd;",
      line = 8
   )
   public static final class472 method849(class128 arg0, byte arg1) {
      try {
         ++field1188;
         class472 var2 = new class472();
         if (arg1 != -87) {
            method850(-62);
         }

         var2.field7059 = arg0.method1038((byte)-121);
         var2.field7054 = class761.field11185.method1682(var2.field7059, 1);
         return var2;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1190[3] + (arg0 != null ? field1190[1] : field1190[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "a",
      descriptor = "(I)V",
      line = 26
   )
   public static void method850(int arg0) {
      try {
         if (arg0 == 250) {
            field1189 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1190[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method851(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 11);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!eha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method852(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 70;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 75;
            break;
         case 3:
            var10005 = 26;
            break;
         default:
            var10005 = 11;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
