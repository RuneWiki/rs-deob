import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bha")
public abstract class class604 extends class172 {
   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8419 = new String[]{method4406(method4405("!Vi\u0018\bk")), method4406(method4405("!Vi\u0018\tk"))};
   @OriginalMember(
      owner = "client!bha",
      name = "i",
      descriptor = "Lnw;"
   )
   public static class616 field8415 = new class616(52, 5);
   @OriginalMember(
      owner = "client!bha",
      name = "f",
      descriptor = "Z"
   )
   public static volatile boolean field8416 = true;
   @OriginalMember(
      owner = "client!bha",
      name = "h",
      descriptor = "I"
   )
   public static int field8414;
   @OriginalMember(
      owner = "client!bha",
      name = "j",
      descriptor = "I"
   )
   public static int field8417;
   @OriginalMember(
      owner = "client!bha",
      name = "g",
      descriptor = "Leq;"
   )
   public static class223 field8418;

   @OriginalMember(
      owner = "client!bha",
      name = "c",
      descriptor = "(I)Lfh;"
   )
   public abstract class681 method1910(int arg0);

   @OriginalMember(
      owner = "client!bha",
      name = "a",
      descriptor = "(II)V"
   )
   public static final void method4403(int arg0, int arg1) {
      try {
         if (arg1 != -5651) {
            field8418 = null;
         }

         class590 var2 = class588.field8104;
         synchronized(class588.field8104) {
            class588.field8104.method4234(2, arg0);
         }

         ++field8414;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field8419[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method4404(int arg0) {
      try {
         if (arg0 > -101) {
            method4403(-49, -73);
         }

         field8418 = null;
         field8415 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field8419[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4405(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 77);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4406(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 67;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 8;
            break;
         case 3:
            var10005 = 54;
            break;
         default:
            var10005 = 77;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
