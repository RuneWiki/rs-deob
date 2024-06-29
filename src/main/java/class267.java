import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ok")
public class class267 {
   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3711 = new String[]{method2070(method2069("(3I_o")), method2070(method2069("(3I\\o")), method2070(method2069("(3I^o"))};
   @OriginalMember(
      owner = "client!ok",
      name = "d",
      descriptor = "Lll;"
   )
   public static class387 field3707 = new class387();
   @OriginalMember(
      owner = "client!ok",
      name = "e",
      descriptor = "Lek;"
   )
   public static class536 field3709 = new class536(13, 15);
   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "I"
   )
   public static int field3706;
   @OriginalMember(
      owner = "client!ok",
      name = "b",
      descriptor = "I"
   )
   public static int field3708;
   @OriginalMember(
      owner = "client!ok",
      name = "c",
      descriptor = "Lkf;"
   )
   public static class266 field3710;

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(IB)I",
      line = 6
   )
   public static final int method2066(int arg0, byte arg1) {
      try {
         ++field3708;
         if (~arg0 > -97) {
            return 0;
         } else if (arg0 < 128) {
            return 2;
         } else {
            if (arg1 > -122) {
               method2067(-63);
            }

            return 3;
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3711[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(I)V",
      line = 24
   )
   public static void method2067(int arg0) {
      try {
         field3709 = null;
         field3710 = null;
         int var1 = -82 / ((arg0 - 52) / 59);
         field3707 = null;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3711[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "a",
      descriptor = "(IZ)V",
      line = 39
   )
   public static final void method2068(int arg0, boolean arg1) {
      try {
         ++field3706;
         if (arg0 == 3) {
            class395.method2993(class692.field10185, class237.field3310, arg1, class185.field2623, 31821);
         }
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field3711[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2069(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 71);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ok",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2070(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 71;
            break;
         case 1:
            var10005 = 88;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 29;
            break;
         default:
            var10005 = 71;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
