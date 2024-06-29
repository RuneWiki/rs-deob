import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wj")
public class class412 {
   @OriginalMember(
      owner = "client!wj",
      name = "h",
      descriptor = "I"
   )
   public int field6034;
   @OriginalMember(
      owner = "client!wj",
      name = "b",
      descriptor = "Lbba;"
   )
   private class124 field6030;
   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6037 = new String[]{method3150(method3149("xs\u000em\u0001axLb\u0012j1")), method3150(method3149("xs\u000eJ@")), method3150(method3149("xs\u000eI@")), method3150(method3149("t7\u000e%\u0015")), method3150(method3149("xs\u000e7\u0001apT5@")), method3150(method3149("alLg"))};
   @OriginalMember(
      owner = "client!wj",
      name = "g",
      descriptor = "I"
   )
   public static int field6029 = 0;
   @OriginalMember(
      owner = "client!wj",
      name = "f",
      descriptor = "[I"
   )
   public static int[] field6036 = new int[3];
   @OriginalMember(
      owner = "client!wj",
      name = "d",
      descriptor = "I"
   )
   public static int field6031;
   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "I"
   )
   public static int field6032;
   @OriginalMember(
      owner = "client!wj",
      name = "e",
      descriptor = "I"
   )
   public static int field6035;
   @OriginalMember(
      owner = "client!wj",
      name = "c",
      descriptor = "Loo;"
   )
   public static class651 field6033;

   @OriginalMember(
      owner = "client!wj",
      name = "finalize",
      descriptor = "()V"
   )
   protected final void finalize() throws Throwable {
      try {
         ++field6031;
         this.field6030.method1198(1, this.field6034);
         super.finalize();
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6037[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3147(int arg0) {
      try {
         if (arg0 != 0) {
            method3147(95);
         }

         field6033 = null;
         field6036 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field6037[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method3148(int arg0, byte arg1) {
      try {
         ++field6035;
         if (arg0 < 0 || arg0 > 2) {
            arg0 = 0;
         }

         int var2 = -18 % ((5 - arg1) / 41);
         class231.field3395 = arg0;
         class401.field5896 = new class42[class665.field9663[class231.field3395] - -1];
         class463.field6774 = 0;
         class76.field1338 = 0;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field6037[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "<init>",
      descriptor = "(Lbba;II)V"
   )
   public class412(class124 arg0, int arg1, int arg2) {
      try {
         this.field6034 = arg2;
         this.field6030 = arg0;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field6037[4] + (arg0 != null ? field6037[3] : field6037[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3149(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 104);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wj",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3150(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 15;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 32;
            break;
         case 3:
            var10005 = 11;
            break;
         default:
            var10005 = 104;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
