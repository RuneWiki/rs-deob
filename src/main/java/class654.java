import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class654 {
   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9518 = new String[]{method4713(method4712("B~fjJ")), method4713(method4712("B~fiJ")), method4713(method4712("Xz$D")), method4713(method4712("M!f\u0006\u001f"))};
   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "D"
   )
   public static double field9516;
   @OriginalMember(
      owner = "client!tq",
      name = "c",
      descriptor = "I"
   )
   public static int field9515;
   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "I"
   )
   public static int field9517;

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "([BB)V"
   )
   public static final synchronized void method4710(byte[] param0, byte param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(IB)[B"
   )
   public static final synchronized byte[] method4711(int arg0, byte arg1) {
      try {
         ++field9515;
         if (~arg0 == -101 && class355.field5380 > 0) {
            byte[] var2 = class450.field6840[--class355.field5380];
            class450.field6840[class355.field5380] = null;
            return var2;
         } else if (~arg0 == -5001 && class349.field5296 > 0) {
            byte[] var3 = class109.field1337[--class349.field5296];
            class109.field1337[class349.field5296] = null;
            return var3;
         } else if (arg0 == 30000 && ~class653.field9512 < -1) {
            byte[] var4 = class101.field1239[--class653.field9512];
            class101.field1239[class653.field9512] = null;
            return var4;
         } else {
            if (class177.field2187 != null) {
               for(int var5 = 0; var5 < class350.field5310.length; ++var5) {
                  if (~class350.field5310[var5] == ~arg0 && ~class224.field2871[var5] < -1) {
                     byte[] var6 = class177.field2187[var5][--class224.field2871[var5]];
                     class177.field2187[var5][class224.field2871[var5]] = null;
                     return var6;
                  }
               }
            }

            int var7 = 103 % ((arg1 - 75) / 45);
            return new byte[arg0];
         }
      } catch (RuntimeException var9) {
         throw class670.method4877(var9, field9518[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4712(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4713(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 54;
            break;
         case 1:
            var10005 = 15;
            break;
         case 2:
            var10005 = 72;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
