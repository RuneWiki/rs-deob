import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!gr")
public class class288 extends class247 {
   @OriginalMember(
      owner = "client!gr",
      name = "j",
      descriptor = "I"
   )
   public int field4298;
   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4301 = new String[]{method2391(method2390("\u0002gg\u0013=")), method2391(method2390("\u000b`%>")), method2391(method2390("\u0002gg\u0010=")), method2391(method2390("\u001e;g|h")), method2391(method2390("\u0002ggn|\u000b|=l="))};
   @OriginalMember(
      owner = "client!gr",
      name = "l",
      descriptor = "[I"
   )
   public static int[] field4300 = new int[2];
   @OriginalMember(
      owner = "client!gr",
      name = "k",
      descriptor = "I"
   )
   public static int field4299;

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method2388(int arg0) {
      try {
         field4300 = null;
         if (arg0 != -1280) {
            field4300 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field4301[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "<init>",
      descriptor = "()V"
   )
   public class288() {
   }

   @OriginalMember(
      owner = "client!gr",
      name = "<init>",
      descriptor = "(I)V"
   )
   public class288(int arg0) {
      try {
         this.field4298 = arg0;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4301[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "a",
      descriptor = "(BLhj;)I"
   )
   public static final int method2389(byte arg0, class670 arg1) {
      try {
         ++field4299;
         if (arg0 < 11) {
            field4300 = null;
         }

         if (class339.field5001 != arg1) {
            if (class151.field2323 == arg1) {
               return 34167;
            } else if (class77.field1238 == arg1) {
               return 34168;
            } else if (class172.field2572 == arg1) {
               return 34166;
            } else {
               throw new IllegalArgumentException();
            }
         } else {
            return 5890;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field4301[2] + arg0 + ',' + (arg1 != null ? field4301[3] : field4301[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2390(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 21);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!gr",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2391(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 101;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 73;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 21;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
