import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!af")
public class class40 {
   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field550 = new String[]{method305(method304("'~M\r/")), method305(method304("2%\u000fO")), method305(method304("=6Maz")), method305(method304("=6M`z"))};
   @OriginalMember(
      owner = "client!af",
      name = "b",
      descriptor = "Lrca;"
   )
   public static class37 field546 = new class37();
   @OriginalMember(
      owner = "client!af",
      name = "c",
      descriptor = "I"
   )
   public static int field547;
   @OriginalMember(
      owner = "client!af",
      name = "d",
      descriptor = "I"
   )
   public static int field549;
   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "[S"
   )
   public static short[] field548;

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(IIILon;Lon;)V"
   )
   public static final void method301(int arg0, int arg1, int arg2, class762 arg3, class762 arg4) {
      class731 var5 = class254.method2039(arg0, arg1, arg2);
      if (var5 != null) {
         var5.field10655 = arg3;
         var5.field10651 = arg4;
         int var6 = class659.field9815 == class569.field8364 ? 1 : 0;
         if (arg3.method69((byte)95)) {
            if (arg3.method67(703)) {
               arg3.field10469 = class217.field2753[var6];
               class217.field2753[var6] = arg3;
            } else {
               arg3.field10469 = class127.field1637[var6];
               class127.field1637[var6] = arg3;
               class323.field4420 = true;
            }
         } else {
            arg3.field10469 = class500.field6970[var6];
            class500.field6970[var6] = arg3;
         }

         if (arg4 != null) {
            if (arg4.method69((byte)102)) {
               if (arg4.method67(703)) {
                  arg4.field10469 = class217.field2753[var6];
                  class217.field2753[var6] = arg4;
                  return;
               }

               arg4.field10469 = class127.field1637[var6];
               class127.field1637[var6] = arg4;
               class323.field4420 = true;
               return;
            }

            arg4.field10469 = class500.field6970[var6];
            class500.field6970[var6] = arg4;
         }
      }

   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method302(byte arg0) {
      try {
         if (arg0 < 46) {
            method302((byte)-77);
         }

         field548 = null;
         field546 = null;
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field550[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "a",
      descriptor = "(IIILww;)Lkv;"
   )
   public static final class19 method303(int arg0, int arg1, int arg2, class339 arg3) {
      try {
         if (arg2 > -57) {
            field548 = null;
         }

         ++field547;
         byte[] var4 = arg3.method2697(arg0, arg1, false);
         return var4 == null ? null : new class19(var4);
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field550[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field550[0] : field550[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method304(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 82);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!af",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method305(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 92;
            break;
         case 1:
            var10005 = 80;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 35;
            break;
         default:
            var10005 = 82;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
