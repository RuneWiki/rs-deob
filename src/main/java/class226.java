import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!sba")
public class class226 {
   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3349 = new String[]{method1889(method1888("hY\u0003ub3")), method1889(method1888("hY\u0003ua3")), method1889(method1888("`\u0015Lu^")), method1889(method1888("uN\u000e7")), method1889(method1888("hY\u0003u`3"))};
   @OriginalMember(
      owner = "client!sba",
      name = "c",
      descriptor = "Lbda;"
   )
   public static class529 field3345 = new class529(0, 0);
   @OriginalMember(
      owner = "client!sba",
      name = "b",
      descriptor = "Lhea;"
   )
   public static class443 field3348 = new class443();
   @OriginalMember(
      owner = "client!sba",
      name = "e",
      descriptor = "I"
   )
   public static int field3344;
   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "I"
   )
   public static int field3346;
   @OriginalMember(
      owner = "client!sba",
      name = "d",
      descriptor = "[I"
   )
   public static int[] field3347;

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1885(int arg0) {
      try {
         field3348 = null;
         if (arg0 != -22324) {
            field3347 = null;
         }

         field3347 = null;
         field3345 = null;
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field3349[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(CZ)I"
   )
   public static final int method1886(char arg0, boolean arg1) {
      try {
         if (arg1) {
            field3348 = null;
         }

         ++field3346;
         return arg0 >= 0 && arg0 < class294.field4095.length ? class294.field4095[arg0] : -1;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3349[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "a",
      descriptor = "(ILjfa;ZIZ)V"
   )
   public static final void method1887(int arg0, class303 arg1, boolean arg2, int arg3, boolean arg4) {
      boolean var5 = client.field4564;

      try {
         int var6;
         int var7;
         label117: {
            ++field3344;
            var6 = arg1.field4308;
            var7 = arg1.field4226;
            if (arg1.field4258 != 0) {
               if (~arg1.field4258 != -2) {
                  if (arg1.field4258 != 2) {
                     break label117;
                  }

                  arg1.field4308 = arg1.field4321 * arg3 >> 14;
                  if (!var5) {
                     break label117;
                  }
               }

               arg1.field4308 = arg3 - arg1.field4321;
               if (!var5) {
                  break label117;
               }
            }

            arg1.field4308 = arg1.field4321;
         }

         label122: {
            if (arg1.field4378 == 0) {
               arg1.field4226 = arg1.field4281;
               if (!var5) {
                  break label122;
               }
            }

            if (arg1.field4378 == 1) {
               arg1.field4226 = -arg1.field4281 + arg0;
               if (!var5) {
                  break label122;
               }
            }

            if (arg1.field4378 == 2) {
               arg1.field4226 = arg1.field4281 * arg0 >> 14;
            }
         }

         if (arg1.field4258 == 4) {
            arg1.field4308 = arg1.field4284 * arg1.field4226 / arg1.field4239;
         }

         if (arg1.field4378 == 4) {
            arg1.field4226 = arg1.field4308 * arg1.field4239 / arg1.field4284;
         }

         if (class589.field8508 && (client.method2454(arg1).field10311 != 0 || ~arg1.field4270 == -1)) {
            label127: {
               if (arg1.field4226 < 5 && ~arg1.field4308 > -6) {
                  arg1.field4308 = 5;
                  arg1.field4226 = 5;
                  if (!var5) {
                     break label127;
                  }
               }

               if (arg1.field4226 <= 0) {
                  arg1.field4226 = 5;
               }

               if (arg1.field4308 <= 0) {
                  arg1.field4308 = 5;
               }
            }
         }

         if (class440.field6428 == arg1.field4364) {
            class312.field4495 = arg1;
         }

         if (arg2) {
            method1885(-87);
         }

         if (arg4 && arg1.field4377 != null) {
            if (arg1.field4308 != var6 || ~arg1.field4226 != ~var7) {
               class227 var8 = new class227();
               var8.field3360 = arg1;
               var8.field3352 = arg1.field4377;
               class686.field10086.method2585(var8, 106);
            }

         }
      } catch (RuntimeException var10) {
         throw class608.method4462(var10, field3349[1] + arg0 + ',' + (arg1 != null ? field3349[2] : field3349[3]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1888(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 35);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!sba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1889(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 27;
            break;
         case 1:
            var10005 = 59;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 91;
            break;
         default:
            var10005 = 35;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
