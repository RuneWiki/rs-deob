import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cfa")
public class class181 extends class428 {
   @OriginalMember(
      owner = "client!cfa",
      name = "m",
      descriptor = "Ljava/lang/String;"
   )
   public String field2546;
   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2547 = new String[]{method1443(method1442(":_=\u0019o0W5Cmq")), method1443(method1442("\"\u0017r\u0019.")), method1443(method1442("7L0[")), method1443(method1442(":_=\u0019\u0012q"))};
   @OriginalMember(
      owner = "client!cfa",
      name = "n",
      descriptor = "Lwc;"
   )
   public static class74 field2545;

   @OriginalMember(
      owner = "client!cfa",
      name = "<init>",
      descriptor = "()V",
      line = 6
   )
   public class181() {
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "a",
      descriptor = "(B)V",
      line = 10
   )
   public static void method1441(byte arg0) {
      try {
         field2545 = null;
         int var1 = 40 % ((26 - arg0) / 54);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2547[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "<init>",
      descriptor = "(Ljava/lang/String;)V",
      line = 18
   )
   public class181(String arg0) {
      try {
         this.field2546 = arg0;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field2547[0] + (arg0 != null ? field2547[1] : field2547[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1442(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 83);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cfa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1443(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 57;
            break;
         case 2:
            var10005 = 92;
            break;
         case 3:
            var10005 = 55;
            break;
         default:
            var10005 = 83;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
