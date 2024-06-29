import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public class class554 implements class490 {
   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "Lrr;"
   )
   private class678 field8278;
   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "Ljava/lang/String;"
   )
   private String field8277;
   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8284 = new String[]{method4209(method4208("\u0014QK\u000f\u001e")), method4209(method4208("\u0014QK\n\u001e")), method4209(method4208("\bO\t\"")), method4209(method4208("\u001d\u0014K`K")), method4209(method4208("\u0014QKr_\bS\u0011p\u001e")), method4209(method4208("\u0014QK\r\u001e"))};
   @OriginalMember(
      owner = "client!rk",
      name = "c",
      descriptor = "Luk;"
   )
   public static class498 field8279 = new class498(131, 2);
   @OriginalMember(
      owner = "client!rk",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field8283 = new int[]{1, 4, 1, 2};
   @OriginalMember(
      owner = "client!rk",
      name = "g",
      descriptor = "I"
   )
   public static int field8281 = -1;
   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "I"
   )
   public static int field8280;
   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "I"
   )
   public static int field8282;

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(Z)V",
      line = 5
   )
   public static void method4207(boolean arg0) {
      try {
         field8279 = null;
         if (!arg0) {
            field8283 = null;
         }

         field8283 = null;
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8284[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "<init>",
      descriptor = "(Lrr;Ljava/lang/String;)V",
      line = 16
   )
   public class554(class678 arg0, String arg1) {
      try {
         this.field8278 = arg0;
         this.field8277 = arg1;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8284[4] + (arg0 != null ? field8284[3] : field8284[2]) + ',' + (arg1 != null ? field8284[3] : field8284[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(I)Lhba;",
      line = 25
   )
   public final class430 method3794(int arg0) {
      try {
         if (arg0 != 13943) {
            return null;
         } else {
            ++field8280;
            return class430.field6636;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8284[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(I)I",
      line = 37
   )
   public final int method3797(int arg0) {
      try {
         ++field8282;
         if (this.field8278.method5001(this.field8277, true)) {
            return 100;
         } else {
            if (arg0 <= 62) {
               method4207(true);
            }

            return 0;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8284[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4208(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 54);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4209(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 102;
            break;
         case 1:
            var10005 = 58;
            break;
         case 2:
            var10005 = 101;
            break;
         case 3:
            var10005 = 78;
            break;
         default:
            var10005 = 54;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
