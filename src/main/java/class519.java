import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lm")
public class class519 {
   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7898 = new String[]{method4008(method4007(" r\u0007_")), method4008(method4007("\"jEr\u0015")), method4008(method4007("5)E\u001d@"))};
   @OriginalMember(
      owner = "client!lm",
      name = "b",
      descriptor = "I"
   )
   public static int field7895 = 0;
   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "I"
   )
   public static int field7897 = 0;
   @OriginalMember(
      owner = "client!lm",
      name = "c",
      descriptor = "I"
   )
   public static int field7896;

   @OriginalMember(
      owner = "client!lm",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V"
   )
   public static final void method4006(String arg0, int arg1) {
      boolean var2 = client.field1786;

      try {
         ++field7896;
         if (class552.field8264 && ~(class441.field6793 & 24) != -1) {
            boolean var3 = false;
            int var4 = class728.field10861;
            int[] var5 = class17.field223;
            if (arg1 == -1) {
               int var6 = 0;
               if (var2 || ~var4 < ~var6) {
                  do {
                     class9 var7 = class484.field7370[var5[var6]];
                     if (var7.field67 != null) {
                        if (!var7.field67.equalsIgnoreCase(arg0)) {
                           ++var6;
                        } else if ((class476.field7251 != var7 || ~(16 & class441.field6793) == -1) && ~(class441.field6793 & 8) == -1) {
                           ++var6;
                        } else {
                           ++class348.field5323;
                           class577 var8 = class218.method1888(class292.field4610, 88, class510.field7801.field361);
                           var8.field8531.method2874((byte)-23, class105.field1459);
                           var8.field8531.method2870(-32768, 0);
                           var8.field8531.method2874((byte)-23, var5[var6]);
                           var8.field8531.method2874((byte)-23, class449.field6882);
                           var8.field8531.method2866(class175.field2750, true);
                           class510.field7801.method211(var8, 116);
                           var3 = true;
                           class679.method5031(var7.method61((byte)70), 0, var7.field1683[0], var7.method61((byte)70), (byte)-38, -2, var7.field1685[0], 0, true);
                           if (!var2) {
                              break;
                           }

                           ++var6;
                        }
                     } else {
                        ++var6;
                     }
                  } while(~var4 < ~var6);
               }

               if (!var3) {
                  class23.method170(4, 0, class499.field7609.method3875(class493.field7455, 115) + arg0);
               }

               if (class552.field8264) {
                  class411.method3292(2827);
               }
            }
         }
      } catch (RuntimeException var10) {
         throw class482.method3757(var10, field7898[1] + (arg0 != null ? field7898[2] : field7898[0]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4007(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lm",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4008(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 7;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 51;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
