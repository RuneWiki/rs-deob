import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wp")
public class class190 {
   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2373 = new String[]{method1478(method1477("P\bc3R")), method1478(method1477("P\bc0R"))};
   @OriginalMember(
      owner = "client!wp",
      name = "c",
      descriptor = "Lsda;"
   )
   public static class269 field2370 = new class269(54, 1);
   @OriginalMember(
      owner = "client!wp",
      name = "b",
      descriptor = "I"
   )
   public static int field2371;
   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "[I"
   )
   public static int[] field2372;

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(I)V",
      line = 12
   )
   public static void method1475(int arg0) {
      try {
         field2370 = null;
         if (arg0 != -2820) {
            field2370 = null;
         }

         field2372 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2373[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "a",
      descriptor = "(B)V",
      line = 23
   )
   public static final void method1476(byte arg0) {
      int var1 = client.field4530;

      try {
         ++field2371;
         class7 var2 = null;

         try {
            var2 = class719.method5199(8, "2");
            class128 var3 = new class128(class668.field10057 * 6 + 3);
            var3.method1085(1, (byte)-11);
            var3.method1103(class668.field10057, -83);
            int var4 = 0;
            if (var1 != 0) {
               if (class491.field7260[var4]) {
                  var3.method1103(var4, arg0 ^ 101);
                  var3.method1094(-40, class732.field10855[var4]);
               }

               ++var4;
            }

            while(true) {
               byte var10000;
               if (~class732.field10855.length >= ~var4) {
                  var10000 = arg0;
                  if (var1 == 0) {
                     if (arg0 != -63) {
                        field2370 = null;
                     }

                     var2.method62(var3.field1552, 0, (byte)-35, var3.field1590);
                     break;
                  }
               } else {
                  var10000 = class491.field7260[var4];
               }

               if (var10000 != 0) {
                  var3.method1103(var4, arg0 ^ 101);
                  var3.method1094(-40, class732.field10855[var4]);
               }

               ++var4;
            }
         } catch (Exception var7) {
         }

         try {
            if (var2 != null) {
               var2.method60(false);
            }
         } catch (Exception var6) {
         }

         class4.field77 = class188.method1462(true);
         class173.field2161 = false;
      } catch (RuntimeException var8) {
         throw class670.method4877(var8, field2373[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1477(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 122);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1478(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 39;
            break;
         case 1:
            var10005 = 120;
            break;
         case 2:
            var10005 = 77;
            break;
         case 3:
            var10005 = 114;
            break;
         default:
            var10005 = 122;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
