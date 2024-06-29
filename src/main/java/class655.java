import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sp")
public class class655 {
   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9790 = new String[]{method4830(method4829("1Z\u000fN")), method4830(method4829(",_Mc}")), method4830(method4829("$\u0001M\f(")), method4830(method4829(",_M`}"))};
   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "Lhr;"
   )
   public static class666 field9787 = new class666();
   @OriginalMember(
      owner = "client!sp",
      name = "b",
      descriptor = "[I"
   )
   public static int[] field9788 = new int[]{-1, -1, 1, 1};
   @OriginalMember(
      owner = "client!sp",
      name = "c",
      descriptor = "I"
   )
   public static int field9789 = -1;
   @OriginalMember(
      owner = "client!sp",
      name = "d",
      descriptor = "I"
   )
   public static int field9786;

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(B[BZ)V",
      line = 3
   )
   public static final void method4827(byte arg0, byte[] arg1, boolean arg2) {
      boolean var3 = client.field1786;

      try {
         if (arg0 < 106) {
            field9789 = 89;
         }

         ++field9786;
         if (class342.field5199 == null) {
            class342.field5199 = new class354(20000);
         }

         class342.field5199.method2858(arg1.length, 427497672, 0, arg1);
         if (arg2) {
            class721.method5333(true, class342.field5199.field5428);
            class529.field8026 = new class433[class556.field8295];
            int var4 = 0;
            int var5 = class576.field8526;
            class433 var6;
            if (var3) {
               var6 = class452.method3546(var5, false);
               if (var6 != null) {
                  class529.field8026[var4++] = var6;
               }

               ++var5;
            }

            while(true) {
               int var10000;
               if (class766.field11319 < var5) {
                  class250.field3796 = false;
                  var10000 = 14080;
                  if (!var3) {
                     class390.field6137 = class162.method1442(14080);
                     class342.field5199 = null;
                     return;
                  }
               } else {
                  var10000 = var5;
               }

               var6 = class452.method3546(var10000, false);
               if (var6 != null) {
                  class529.field8026[var4++] = var6;
               }

               ++var5;
            }
         }
      } catch (RuntimeException var8) {
         throw class482.method3757(var8, field9790[1] + arg0 + ',' + (arg1 != null ? field9790[2] : field9790[0]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "a",
      descriptor = "(I)V",
      line = 50
   )
   public static void method4828(int arg0) {
      try {
         int var1 = 20 / ((arg0 - 60) / 37);
         field9788 = null;
         field9787 = null;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field9790[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4829(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4830(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 95;
            break;
         case 1:
            var10005 = 47;
            break;
         case 2:
            var10005 = 99;
            break;
         case 3:
            var10005 = 34;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
