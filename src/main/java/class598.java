import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ul")
public class class598 {
   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8803 = new String[]{method4380(method4379("U-;\u0003\f")), method4380(method4379("U-;\u0000\f"))};
   @OriginalMember(
      owner = "client!ul",
      name = "d",
      descriptor = "I"
   )
   public static int field8799;
   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "I"
   )
   public static int field8800;
   @OriginalMember(
      owner = "client!ul",
      name = "c",
      descriptor = "I"
   )
   public static int field8801;
   @OriginalMember(
      owner = "client!ul",
      name = "b",
      descriptor = "I"
   )
   public static int field8802;

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(ZI)Lnn;"
   )
   public static final class436 method4377(boolean arg0, int arg1) {
      int var2 = client.field4530;

      try {
         if (!arg0) {
            return null;
         } else {
            ++field8799;
            class436[] var3 = class140.method1182((byte)-55);
            int var4 = 0;
            if (var2 == 0 && ~var4 <= ~var3.length) {
               return null;
            } else {
               do {
                  class436 var5 = var3[var4];
                  if (~var5.field6656 == ~arg1) {
                     return var5;
                  }

                  ++var4;
               } while(~var4 > ~var3.length);

               return null;
            }
         }
      } catch (RuntimeException var7) {
         throw class670.method4877(var7, field8803[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method4378(int arg0, byte arg1, int arg2) {
      try {
         if (arg1 != -64) {
            field8800 = -74;
         }

         ++field8801;
         if (arg0 >= 0 && arg2 >= 0 && class65.field797[1].length > arg0 && class65.field797[1][arg0].length > arg2) {
            return (class65.field797[1][arg0][arg2] & 2) != 0;
         } else {
            return false;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field8803[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4379(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ul",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4380(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 65;
            break;
         case 2:
            var10005 = 21;
            break;
         case 3:
            var10005 = 66;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
