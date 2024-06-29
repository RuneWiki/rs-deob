import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pp")
public class class412 {
   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6318 = new String[]{method3150(method3149("\\\u000e\u001bq\u0011")), method3150(method3149("\\\u000e\u001br\u0011"))};
   @OriginalMember(
      owner = "client!pp",
      name = "e",
      descriptor = "I"
   )
   public static int field6315 = -50;
   @OriginalMember(
      owner = "client!pp",
      name = "d",
      descriptor = "Lsd;"
   )
   public static class101 field6313 = new class101(4, -2);
   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "I"
   )
   public static int field6317 = -1;
   @OriginalMember(
      owner = "client!pp",
      name = "b",
      descriptor = "I"
   )
   public static int field6312;
   @OriginalMember(
      owner = "client!pp",
      name = "c",
      descriptor = "I"
   )
   public static int field6314;
   @OriginalMember(
      owner = "client!pp",
      name = "f",
      descriptor = "I"
   )
   public static int field6316;

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(IIIIIII)V"
   )
   public static final void method3147(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      int var7 = client.field4530;

      try {
         ++field6316;
         class263[] var8 = class594.field8758;
         int var9 = 0;
         if (var7 == 0 && ~var8.length >= ~var9) {
            if (arg5 != 10) {
               field6317 = -83;
            }
         } else {
            do {
               class263 var10 = var8[var9];
               if (var10 != null) {
                  if (var10.field3593 != 2 && var7 == 0) {
                     ++var9;
                  } else {
                     class260.method1972(var10.field3601 * 2, arg6, var10.field3590, var10.field3597, arg3 >> 1, var10.field3591, (byte)87, arg2 >> 1, arg1);
                     if (class152.field1902[0] > -1 && class314.field4488 % 20 < 10) {
                        class396 var11 = class178.field2198[var10.field3596];
                        int var12 = arg4 - -class152.field1902[0] - 12;
                        int var13 = class152.field1902[1] + arg0 + -28;
                        var11.method3035(var12, var13);
                        class458.method3442(var11.method1975() + var13, 26306, var13, var12, var11.method1971() + var12);
                     }

                     ++var9;
                  }
               } else {
                  ++var9;
               }
            } while(~var8.length < ~var9);

            if (arg5 != 10) {
               field6317 = -83;
            }
         }
      } catch (RuntimeException var15) {
         throw class670.method4877(var15, field6318[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method3148(byte arg0) {
      try {
         if (arg0 < -25) {
            field6313 = null;
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field6318[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3149(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 57);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pp",
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
            var10005 = 44;
            break;
         case 1:
            var10005 = 126;
            break;
         case 2:
            var10005 = 53;
            break;
         case 3:
            var10005 = 48;
            break;
         default:
            var10005 = 57;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
