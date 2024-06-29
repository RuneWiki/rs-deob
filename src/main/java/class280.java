import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!jaa")
public class class280 extends class673 {
   @OriginalMember(
      owner = "client!jaa",
      name = "s",
      descriptor = "[B"
   )
   public byte[] field3574;
   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3579 = new String[]{method2210(method2209("-w+8\f")), method2210(method2209("<8d8M?7lbO~")), method2210(method2209("8,iz")), method2210(method2209("<8d82~")), method2210(method2209("<8d83~")), method2210(method2209("<8d85~")), method2210(method2209("<8d84~")), method2210(method2209("<8d80~"))};
   @OriginalMember(
      owner = "client!jaa",
      name = "r",
      descriptor = "Lifa;"
   )
   public static class75 field3571 = new class75(4, 3);
   @OriginalMember(
      owner = "client!jaa",
      name = "q",
      descriptor = "Laka;"
   )
   public static class418 field3577 = new class418(7, 6);
   @OriginalMember(
      owner = "client!jaa",
      name = "m",
      descriptor = "[I"
   )
   public static int[] field3578 = null;
   @OriginalMember(
      owner = "client!jaa",
      name = "p",
      descriptor = "I"
   )
   public static int field3572;
   @OriginalMember(
      owner = "client!jaa",
      name = "o",
      descriptor = "I"
   )
   public static int field3573;
   @OriginalMember(
      owner = "client!jaa",
      name = "l",
      descriptor = "I"
   )
   public static int field3575;
   @OriginalMember(
      owner = "client!jaa",
      name = "n",
      descriptor = "I"
   )
   public static int field3576;

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2204(byte arg0) {
      try {
         field3571 = null;
         field3577 = null;
         field3578 = null;
         if (arg0 != -37) {
            method2207(-125);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3579[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(IIIIIII)Z"
   )
   public static final boolean method2205(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3576;
         int var7 = arg4 - -arg3;
         int var8 = arg2 + arg5;
         if (arg1 >= -108) {
            return true;
         } else {
            int var9 = arg0 - -arg6;
            if (!class281.method2217(var8, arg4, var9, arg0, var7, var8, var9, var8, (byte)67, arg4)) {
               return false;
            } else if (!class281.method2217(var8, var7, var9, arg0, var7, var8, arg0, var8, (byte)67, arg4)) {
               return false;
            } else {
               if (class649.field9697 > arg4) {
                  if (!class281.method2217(var8, arg4, var9, var9, arg4, var8, arg0, arg5, (byte)67, arg4)) {
                     return false;
                  }

                  if (!class281.method2217(var8, arg4, arg0, var9, arg4, arg5, arg0, arg5, (byte)67, arg4)) {
                     return false;
                  }
               } else {
                  if (!class281.method2217(var8, var7, var9, var9, var7, var8, arg0, arg5, (byte)67, var7)) {
                     return false;
                  }

                  if (!class281.method2217(var8, var7, arg0, var9, var7, arg5, arg0, arg5, (byte)67, var7)) {
                     return false;
                  }
               }

               if (class323.field4423 <= arg0) {
                  if (!class281.method2217(var8, arg4, var9, var9, var7, var8, var9, arg5, (byte)67, arg4)) {
                     return false;
                  }

                  if (!class281.method2217(var8, var7, var9, var9, var7, arg5, var9, arg5, (byte)67, arg4)) {
                     return false;
                  }
               } else {
                  if (!class281.method2217(var8, arg4, arg0, arg0, var7, var8, arg0, arg5, (byte)67, arg4)) {
                     return false;
                  }

                  if (!class281.method2217(var8, var7, arg0, arg0, var7, arg5, arg0, arg5, (byte)67, arg4)) {
                     return false;
                  }
               }

               return true;
            }
         }
      } catch (RuntimeException var11) {
         throw class93.method866(var11, field3579[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(IIIIIII)I"
   )
   public static final int method2206(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6) {
      try {
         ++field3572;
         int var10 = arg4 & 3;
         if (~(arg6 & 1) == -2) {
            int var7 = arg1;
            arg1 = arg2;
            arg2 = var7;
         }

         if (~var10 == -1) {
            return arg5;
         } else if (var10 == 1) {
            return -arg0 + 7 + -arg1 - -1;
         } else {
            return ~var10 == arg3 ? -arg2 - -1 + -arg5 + 7 : arg0;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field3579[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2207(int arg0) {
      try {
         ++field3573;
         class618.field9103 = null;
         class146.field1831 = null;
         if (arg0 < 87) {
            method2208(88);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field3579[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "b",
      descriptor = "(I)V"
   )
   public static final void method2208(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field3575;
         class49.method371(87, (long)class413.field5678, class629.field9294);
         if (class661.field9817 != -1) {
            class249.method1978(arg0 + 44104, class661.field9817);
         }

         if (arg0 == -18779) {
            int var2 = 0;
            if (var1) {
               if (class485.field6750[var2]) {
                  class626.field9246[var2] = true;
               }

               class708.field10409[var2] = class485.field6750[var2];
               class485.field6750[var2] = false;
               ++var2;
            }

            while(true) {
               int var10000;
               if (class121.field1604 <= var2) {
                  class737.field10800 = class413.field5678;
                  var10000 = ~class661.field9817;
                  if (!var1) {
                     if (var10000 != 0) {
                        class121.field1604 = 0;
                        class738.method5358(arg0 ^ 11400);
                     }

                     class629.field9294.method443();
                     class595.method4428(class629.field9294, 38);
                     int var3 = class567.method4260(23876);
                     if (var3 == -1) {
                        var3 = class436.field5949;
                     }

                     if (~var3 == 0) {
                        var3 = class707.field10402;
                     }

                     class95.method882(var3, 2);
                     class173.field2238 = 0;
                     return;
                  }
               } else {
                  var10000 = class485.field6750[var2];
               }

               if (var10000 != 0) {
                  class626.field9246[var2] = true;
               }

               class708.field10409[var2] = class485.field6750[var2];
               class485.field6750[var2] = false;
               ++var2;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field3579[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "<init>",
      descriptor = "([B)V"
   )
   public class280(byte[] arg0) {
      try {
         this.field3574 = arg0;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field3579[1] + (arg0 != null ? field3579[0] : field3579[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2209(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 113);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!jaa",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2210(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 89;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 22;
            break;
         default:
            var10005 = 113;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
