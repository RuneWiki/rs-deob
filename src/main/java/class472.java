import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qd")
public class class472 {
   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7061 = new String[]{method3518(method3517("ggbFF")), method3518(method3517("ggbEF")), method3518(method3517("xv k")), method3518(method3517("ggbDF")), method3518(method3517("m-b)\u0013"))};
   @OriginalMember(
      owner = "client!qd",
      name = "c",
      descriptor = "Lpia;"
   )
   public static class102 field7056 = new class102("", 15);
   @OriginalMember(
      owner = "client!qd",
      name = "h",
      descriptor = "I"
   )
   public static int field7053;
   @OriginalMember(
      owner = "client!qd",
      name = "g",
      descriptor = "I"
   )
   public static int field7057;
   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "I"
   )
   public static int field7058;
   @OriginalMember(
      owner = "client!qd",
      name = "e",
      descriptor = "I"
   )
   public int field7059;
   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "I"
   )
   public static int field7060;
   @OriginalMember(
      owner = "client!qd",
      name = "d",
      descriptor = "Lmaa;"
   )
   public class496 field7054;
   @OriginalMember(
      owner = "client!qd",
      name = "f",
      descriptor = "[I"
   )
   public int[] field7055;

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(B)Ljava/lang/String;",
      line = 3
   )
   public static final String method3514(byte arg0) {
      try {
         ++field7058;
         if (!class750.field11111 && class585.field8681 != null) {
            return arg0 != 44 ? null : class585.field8681.field4323;
         } else {
            return "";
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7061[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "b",
      descriptor = "(B)V",
      line = 17
   )
   public static void method3515(byte arg0) {
      try {
         field7056 = null;
         if (arg0 <= 126) {
            method3514((byte)110);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field7061[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "a",
      descriptor = "(Ljava/lang/String;I)V",
      line = 34
   )
   public static final void method3516(String arg0, int arg1) {
      int var2 = client.field4530;

      try {
         ++field7053;
         if (class367.field5530 && ~(class427.field6529 & 24) != -1) {
            boolean var3 = false;
            int var4 = class287.field4026;
            if (arg1 != -7492) {
               field7060 = -27;
            }

            int[] var5 = class33.field372;
            int var6 = 0;
            if (var2 != 0 || ~var6 > ~var4) {
               do {
                  class687 var7 = class661.field9578[var5[var6]];
                  if (var7.field10332 != null) {
                     if (!var7.field10332.equalsIgnoreCase(arg0)) {
                        ++var6;
                     } else {
                        if (class693.field10418 != var7 || ~(class427.field6529 & 16) == -1) {
                           if (var7 == null) {
                              ++var6;
                              continue;
                           }

                           if ((class427.field6529 & 8) == 0) {
                              ++var6;
                              continue;
                           }
                        }

                        ++class541.field7890;
                        class180 var8 = class486.method3603(class790.field11476, (byte)-116, class48.field583);
                        var8.field2211.method1051((byte)-120, class200.field2500);
                        var8.field2211.method1079(class192.field2407, 1856);
                        var8.field2211.method1096((byte)-107, var5[var6]);
                        var8.field2211.method1081(128, class209.field2658);
                        var8.field2211.method1085(0, (byte)-11);
                        class763.method5527(false, var8);
                        class105.method899(var7.method3046(-15), 0, true, -2, var7.field6114[0], 0, 0, var7.method3046(114), var7.field6116[0]);
                        var3 = true;
                        if (var2 == 0) {
                           break;
                        }

                        ++var6;
                     }
                  } else {
                     ++var6;
                  }
               } while(~var6 > ~var4);
            }

            if (!var3) {
               class324.method2449(class204.field2585.method1562((byte)-77, class728.field10827) + arg0, 4, arg1 + 34993);
            }

            if (class367.field5530) {
               class8.method76(30687);
            }
         }
      } catch (RuntimeException var10) {
         throw class670.method4877(var10, field7061[3] + (arg0 != null ? field7061[4] : field7061[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3517(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 110);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qd",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3518(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 22;
            break;
         case 1:
            var10005 = 3;
            break;
         case 2:
            var10005 = 76;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 110;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
