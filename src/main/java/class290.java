import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ch")
public class class290 {
   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4581 = new String[]{method2452(method2451("\np=K}")), method2452(method2451("\np=J}")), method2452(method2451("\np=I}")), method2452(method2451("\np=M}"))};
   @OriginalMember(
      owner = "client!ch",
      name = "f",
      descriptor = "I"
   )
   public static int field4577 = 0;
   @OriginalMember(
      owner = "client!ch",
      name = "e",
      descriptor = "[I"
   )
   public static int[] field4579 = new int[32];
   @OriginalMember(
      owner = "client!ch",
      name = "c",
      descriptor = "B"
   )
   public static byte field4576;
   @OriginalMember(
      owner = "client!ch",
      name = "d",
      descriptor = "I"
   )
   public static int field4575;
   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "I"
   )
   public static int field4578;
   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "I"
   )
   public static int field4580;

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(ILs;)V"
   )
   public static final void method2446(int arg0, class271 arg1) {
      class385.field6076[arg0] = arg1;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "b",
      descriptor = "(Z)V"
   )
   public static final void method2447(boolean arg0) {
      try {
         ++field4580;
         class595.field8750 = class407.method3265(2048, 0.4F, 8, arg0, 8, -78, 4, 35);
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4581[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(Z)V"
   )
   public static void method2448(boolean arg0) {
      try {
         field4579 = null;
         if (arg0) {
            field4579 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field4581[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method2449(int arg0, int arg1, int arg2) {
      try {
         ++field4575;
         int var3 = 119 / ((arg0 - 77) / 37);
         return (16 & arg2) != 0;
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field4581[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "a",
      descriptor = "(IB)Z"
   )
   public static final boolean method2450(int arg0, byte arg1) {
      try {
         ++field4578;
         if (arg1 <= 63) {
            field4576 = -33;
         }

         return arg0 == 1 || arg0 == 3 || arg0 == 5;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field4581[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2451(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 85);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ch",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2452(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 105;
            break;
         case 1:
            var10005 = 24;
            break;
         case 2:
            var10005 = 19;
            break;
         case 3:
            var10005 = 8;
            break;
         default:
            var10005 = 85;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
