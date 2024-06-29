import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cj")
public class class724 {
   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field10604 = method5260(method5259("\u0014$*\u0018S"));
   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "I"
   )
   public static int field10603;

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(Lr;III[Z)V"
   )
   public static final void method5257(class194 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      if (class93.field1241 != class73.field900) {
         int var5 = class144.field1906[arg1].method2220(121, arg2, arg3);

         for(int var6 = 0; var6 <= arg1; ++var6) {
            if (arg4 == null || arg4[var6]) {
               class295 var7 = class144.field1906[var6];
               if (var7 != null) {
                  var7.method1669(arg0, arg2, var5 - var7.method2220(119, arg2, arg3), arg3, 0, false);
               }
            }
         }
      }

   }

   @OriginalMember(
      owner = "client!cj",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method5258(int arg0, int arg1, int arg2) {
      try {
         ++field10603;
         if (arg1 != 0) {
            return false;
         } else {
            return ~(2048 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field10604 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5259(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 123);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5260(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 119;
            break;
         case 1:
            var10005 = 78;
            break;
         case 2:
            var10005 = 4;
            break;
         case 3:
            var10005 = 90;
            break;
         default:
            var10005 = 123;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
