import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!np")
public class class769 {
   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11339 = new String[]{method5618(method5617("Jsh\u0002h")), method5618(method5617("Jsh\u0001h"))};
   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "Lnaa;"
   )
   public static class113 field11338 = new class113(46, 7);
   @OriginalMember(
      owner = "client!np",
      name = "c",
      descriptor = "I"
   )
   public static int field11336;
   @OriginalMember(
      owner = "client!np",
      name = "b",
      descriptor = "Z"
   )
   public static boolean field11337;

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(II)Ljw;",
      line = 13
   )
   public static final class779 method5615(int arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field11336;
         if (arg1 < 2) {
            return null;
         } else {
            class779[] var3 = class106.method1017(-13578);
            int var4 = 0;
            if (var2) {
               if (~var3[var4].field11413 == ~arg0) {
                  return var3[var4];
               }

               ++var4;
            }

            while(true) {
               while(var4 < var3.length) {
                  if (~var3[var4].field11413 == ~arg0) {
                     return var3[var4];
                  }

                  ++var4;
               }

               if (!var2) {
                  return null;
               }

               ++var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class482.method3757(var6, field11339[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "a",
      descriptor = "(I)V",
      line = 40
   )
   public static void method5616(int arg0) {
      try {
         if (arg0 != 1) {
            method5615(49, -73);
         }

         field11338 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field11339[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5617(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 64);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!np",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5618(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 36;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 70;
            break;
         case 3:
            var10005 = 67;
            break;
         default:
            var10005 = 64;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
