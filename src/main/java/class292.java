import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mm")
public class class292 {
   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4079 = new String[]{method2233(method2232("\u0017E+\nn")), method2233(method2232("\u0014]i'")), method2233(method2232("\u0001\u0006+e;")), method2233(method2232("\u0017E+\tn")), method2233(method2232("\u0017E+\u000fn")), method2233(method2232("\u0017E+\bn"))};
   @OriginalMember(
      owner = "client!mm",
      name = "d",
      descriptor = "Lwia;"
   )
   public static class791 field4074 = new class791(16);
   @OriginalMember(
      owner = "client!mm",
      name = "b",
      descriptor = "I"
   )
   public static int field4073;
   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "I"
   )
   public static int field4075;
   @OriginalMember(
      owner = "client!mm",
      name = "f",
      descriptor = "I"
   )
   public static int field4076;
   @OriginalMember(
      owner = "client!mm",
      name = "e",
      descriptor = "I"
   )
   public static int field4078;
   @OriginalMember(
      owner = "client!mm",
      name = "c",
      descriptor = "[[I"
   )
   public static int[][] field4077;

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(ILjfa;)V"
   )
   public static final void method2228(int param0, class303 param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2229(boolean arg0) {
      try {
         field4077 = null;
         if (arg0) {
            field4074 = null;
         }

         field4074 = null;
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4079[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(I)[Lhn;"
   )
   public static final class751[] method2230(int arg0) {
      try {
         if (arg0 != 26420) {
            return null;
         } else {
            ++field4073;
            return new class751[]{class731.field10848, class670.field10071, class208.field2650, class522.field7593, class707.field10576, class178.field2194, class762.field11193, class110.field1341, class672.field10110, class682.field10245, class63.field779, class137.field1777, class178.field2199, class783.field11418, class431.field6590};
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4079[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "a",
      descriptor = "(IIIB)V"
   )
   public static final void method2231(int arg0, int arg1, int arg2, byte arg3) {
      try {
         ++field4076;
         class403 var4 = class453.method3410((long)arg1, true, 11);
         var4.method3093(arg3 + 22067);
         var4.field6183 = arg0;
         var4.field6185 = arg2;
         if (arg3 != 77) {
            field4078 = 77;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4079[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2232(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 70);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2233(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 122;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 75;
            break;
         default:
            var10005 = 70;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
