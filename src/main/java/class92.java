import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!fca")
public class class92 {
   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1235 = new String[]{method872(method871("}jd\u0011O3")), method872(method871("u|iS")), method872(method871("`'+\u0011s")), method872(method871("}jd\u0011L3"))};
   @OriginalMember(
      owner = "client!fca",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field1229 = false;
   @OriginalMember(
      owner = "client!fca",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field1233 = false;
   @OriginalMember(
      owner = "client!fca",
      name = "f",
      descriptor = "I"
   )
   public static int field1231 = 2;
   @OriginalMember(
      owner = "client!fca",
      name = "e",
      descriptor = "I"
   )
   public static int field1234;
   @OriginalMember(
      owner = "client!fca",
      name = "d",
      descriptor = "Lkh;"
   )
   public static class17 field1230;
   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "Lqh;"
   )
   public static class74 field1232;

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method869(int arg0) {
      try {
         if (arg0 >= -38) {
            field1231 = 20;
         }

         field1230 = null;
         field1232 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field1235[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "a",
      descriptor = "(ILui;)Ljava/lang/String;"
   )
   public static final String method870(int arg0, class241 arg1) {
      try {
         ++field1234;
         if (arg0 != -2545) {
            field1230 = null;
         }

         if (arg1.field3000 != null && ~arg1.field3000.length() != -1) {
            return arg1.field3011 != null && arg1.field3011.length() > 0 ? arg1.field3007 + class551.field7553.method3980(class494.field6787, true) + arg1.field3011 + class551.field7553.method3980(class494.field6787, true) + arg1.field3000 : arg1.field3007 + class551.field7553.method3980(class494.field6787, true) + arg1.field3000;
         } else {
            return arg1.field3011 != null && arg1.field3011.length() > 0 ? arg1.field3007 + class551.field7553.method3980(class494.field6787, true) + arg1.field3011 : arg1.field3007;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field1235[0] + arg0 + ',' + (arg1 != null ? field1235[2] : field1235[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method871(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 14);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!fca",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method872(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 9;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 63;
            break;
         default:
            var10005 = 14;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
