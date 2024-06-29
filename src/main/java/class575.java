import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!kga")
public class class575 extends class546 {
   @OriginalMember(
      owner = "client!kga",
      name = "u",
      descriptor = "Lib;"
   )
   public class163 field7908;
   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7914 = new String[]{method4141(method4140("I?87\u0000K60m\u0002\n")), method4141(method4140("L-5u")), method4141(method4140("Yvw7A")), method4141(method4140("I?87}\n"))};
   @OriginalMember(
      owner = "client!kga",
      name = "x",
      descriptor = "Lnw;"
   )
   public static class616 field7909 = new class616(74, -1);
   @OriginalMember(
      owner = "client!kga",
      name = "w",
      descriptor = "I"
   )
   public static int field7911 = -1;
   @OriginalMember(
      owner = "client!kga",
      name = "v",
      descriptor = "I"
   )
   public static int field7913 = 0;
   @OriginalMember(
      owner = "client!kga",
      name = "t",
      descriptor = "I"
   )
   public static int field7910;
   @OriginalMember(
      owner = "client!kga",
      name = "y",
      descriptor = "Lhh;"
   )
   public static class139 field7912;

   @OriginalMember(
      owner = "client!kga",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4139(int arg0) {
      try {
         int var1 = -93 / ((arg0 - 27) / 36);
         field7909 = null;
         field7912 = null;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7914[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "<init>",
      descriptor = "(Lib;)V"
   )
   public class575(class163 arg0) {
      try {
         this.field7908 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field7914[0] + (arg0 != null ? field7914[2] : field7914[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4140(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 60);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!kga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4141(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 89;
            break;
         case 3:
            var10005 = 25;
            break;
         default:
            var10005 = 60;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
