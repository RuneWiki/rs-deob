import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!g")
public class class167 {
   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "Ljava/lang/String;"
   )
   private static final String field2344 = method1376(method1375("#\u0014T8"));
   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "I"
   )
   public static int field2343 = 0;
   @OriginalMember(
      owner = "client!g",
      name = "b",
      descriptor = "I"
   )
   public static int field2342;

   @OriginalMember(
      owner = "client!g",
      name = "a",
      descriptor = "(BII)V",
      line = 8
   )
   public static final void method1374(byte arg0, int arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         if (class4.field38 != 0) {
            label41: {
               if (~arg2 <= -1) {
                  class352.field4733[arg2] = arg1;
                  if (!var3) {
                     break label41;
                  }
               }

               int var4 = 0;
               if (var3 || var4 < 16) {
                  do {
                     class352.field4733[var4] = arg1;
                     ++var4;
                  } while(var4 < 16);
               }
            }
         }

         if (arg0 == -13) {
            ++field2342;
            class270.field3737.method4246(0, arg1, arg2);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field2344 + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1375(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 25);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!g",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1376(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 68;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 16;
            break;
         default:
            var10005 = 25;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
