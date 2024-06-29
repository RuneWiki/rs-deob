import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ed")
public class class736 {
   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10746 = new String[]{method5339(method5338("|n\u0003\u001d\u001a")), method5339(method5338("|n\u0003\u001e\u001a"))};
   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "I"
   )
   public static int field10745;

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method5336(byte arg0) {
      try {
         if (class614.field8576 != null) {
            class614.field8576.method55(117);
         }

         if (arg0 == 96) {
            ++field10745;
            if (class7.field62 != null) {
               class7.field62.method55(116);
            }
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field10746[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "a",
      descriptor = "(ZZ)Z"
   )
   public static boolean method5337(boolean arg0, boolean arg1) {
      try {
         return arg0 | arg1;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field10746[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5338(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ed",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5339(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 25;
            break;
         case 1:
            var10005 = 10;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 92;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
