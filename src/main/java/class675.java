import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pl")
public class class675 {
   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9901 = new String[]{method4937(method4936("Jr\rPM")), method4937(method4936("A0\r<\u0018")), method4937(method4936("TkO~")), method4937(method4936("Jr\rQM")), method4937(method4936("Jr\rSM")), method4937(method4936("Jr\rVM"))};
   @OriginalMember(
      owner = "client!pl",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field9895 = true;
   @OriginalMember(
      owner = "client!pl",
      name = "c",
      descriptor = "Z"
   )
   public static boolean field9896 = false;
   @OriginalMember(
      owner = "client!pl",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field9900 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "I"
   )
   public static int field9897;
   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "I"
   )
   public static int field9898;
   @OriginalMember(
      owner = "client!pl",
      name = "f",
      descriptor = "I"
   )
   public static int field9899;

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method4932(int arg0) {
      try {
         field9900 = null;
         if (arg0 != 12002) {
            method4934(-42);
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field9901[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method4933(int arg0, int arg1, int arg2) {
      try {
         ++field9898;
         if (arg0 < 53) {
            method4932(67);
         }

         return (~(arg1 & 8192) != -1 | class450.method3392((byte)-61, arg1, arg2) | class528.method3956(arg2, -26287, arg1)) & class172.method1543(arg1, (byte)79, arg2);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9901[4] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "b",
      descriptor = "(I)Luca;"
   )
   public static final class536 method4934(int arg0) {
      boolean var1 = client.field4564;

      try {
         ++field9899;
         if (arg0 != 15295) {
            return null;
         } else {
            class536 var2 = (class536)class51.field1055.method5680(false);
            if (var2 != null) {
               var2.method154(-125);
               var2.method2385(117);
               return var2;
            } else {
               label33:
               while(true) {
                  class536 var3 = (class536)class195.field2947.method5680(false);
                  if (var3 == null) {
                     return null;
                  }

                  class536 var10000 = var3;

                  do {
                     if (var10000.method4019((byte)-126) > class57.method650(arg0 + -15195)) {
                        return null;
                     }

                     var3.method154(arg0 + -15406);
                     var3.method2385(117);
                     if (~(var3.field4416 & Long.MIN_VALUE) == -1L) {
                        continue label33;
                     }

                     var10000 = var3;
                  } while(var1);

                  return var3;
               }
            }
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9901[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "a",
      descriptor = "(IIIBZILhw;)V"
   )
   public static final void method4935(int arg0, int arg1, int arg2, byte arg3, boolean arg4, int arg5, class141 arg6) {
      try {
         ++field9897;
         class435.field6292 = arg5;
         class203.field3034 = 1;
         class537.field7822 = arg0;
         class710.field10318 = arg6;
         class548.field7918 = null;
         class233.field3405 = arg4;
         class217.field3288 = arg1;
         class167.field2626 = arg2;
         if (arg3 != 19) {
            field9900 = null;
         }
      } catch (RuntimeException var8) {
         throw class608.method4462(var8, field9901[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field9901[1] : field9901[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4936(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 101);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4937(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 58;
            break;
         case 1:
            var10005 = 30;
            break;
         case 2:
            var10005 = 35;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 101;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
