import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gp")
public class class53 {
   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field678 = new String[]{method420(method419("Xl8J_")), method420(method419("Xl8I_"))};
   @OriginalMember(
      owner = "client!gp",
      name = "d",
      descriptor = "I"
   )
   public static int field674 = -1;
   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "Lwv;"
   )
   public static class37 field677 = new class37(16);
   @OriginalMember(
      owner = "client!gp",
      name = "b",
      descriptor = "I"
   )
   public static int field675;
   @OriginalMember(
      owner = "client!gp",
      name = "c",
      descriptor = "I"
   )
   public static int field676;

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method417(int arg0) {
      try {
         field677 = null;
         if (arg0 != -9883) {
            method418(true, -9, 99, -126, 67, -112, (byte)90, 48, 84);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field678[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "a",
      descriptor = "(ZIIIIIBII)Z"
   )
   public static final boolean method418(boolean arg0, int arg1, int arg2, int arg3, int arg4, int arg5, byte arg6, int arg7, int arg8) {
      try {
         ++field675;
         int var9 = class564.field8045.field3888[0];
         int var10 = 48 % ((arg6 - -25) / 53);
         int var11 = class564.field8045.field3884[0];
         if (~var9 <= -1 && ~var9 > ~class644.field9403 && ~var11 <= -1 && var11 < class337.field4594) {
            if (~arg3 <= -1 && ~class644.field9403 < ~arg3 && ~arg4 <= -1 && ~class337.field4594 < ~arg4) {
               int var12 = class45.method378(arg2, class180.field2543, arg4, arg5, class767.field11309[class564.field8045.field10701], arg0, arg8, var11, arg1, arg7, class196.field2773, var9, (byte)112, class564.field8045.method972(-1), arg3);
               if (~var12 > -2) {
                  return false;
               } else {
                  class755.field11185 = class180.field2543[var12 - 1];
                  class140.field1791 = class196.field2773[var12 - 1];
                  class651.field9542 = false;
                  class561.method4013(-14954);
                  return true;
               }
            } else {
               return false;
            }
         } else {
            return false;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field678[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method419(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 119);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method420(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 63;
            break;
         case 1:
            var10005 = 28;
            break;
         case 2:
            var10005 = 22;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 119;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
