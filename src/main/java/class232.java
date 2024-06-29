import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nt")
public class class232 {
   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3402 = new String[]{method1920(method1919("fmZB0")), method1920(method1919("fl\u0018m")), method1920(method1919("s7Z/e")), method1920(method1919("fmZC0")), method1920(method1919("fmZ@0"))};
   @OriginalMember(
      owner = "client!nt",
      name = "e",
      descriptor = "Z"
   )
   public static boolean field3401 = false;
   @OriginalMember(
      owner = "client!nt",
      name = "c",
      descriptor = "Luw;"
   )
   public static class435 field3398 = new class435(71, -1);
   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "F"
   )
   public static float field3399;
   @OriginalMember(
      owner = "client!nt",
      name = "d",
      descriptor = "I"
   )
   public static int field3397;
   @OriginalMember(
      owner = "client!nt",
      name = "b",
      descriptor = "I"
   )
   public static int field3400;

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(B)V",
      line = 3
   )
   public static void method1916(byte arg0) {
      try {
         int var1 = -30 / ((-13 - arg0) / 53);
         field3398 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field3402[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "([Ljava/lang/Object;[II)V",
      line = 15
   )
   public static final void method1917(Object[] arg0, int[] arg1, int arg2) {
      try {
         class234.method1924(arg1.length + -1, 0, arg1, arg0, 5944);
         if (arg2 != -31647) {
            method1918(87, -99, -2, -106, -123, 31, 77, 35, (class628)null, 67, 59);
         }

         ++field3400;
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field3402[4] + (arg0 != null ? field3402[2] : field3402[1]) + ',' + (arg1 != null ? field3402[2] : field3402[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "a",
      descriptor = "(IIIIIIIILcf;II)Z",
      line = 33
   )
   public static final boolean method1918(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, class628 arg8, int arg9, int arg10) {
      boolean var11 = client.field4564;

      try {
         ++field3397;
         if (arg2 != 1) {
            field3401 = true;
         }

         byte var14 = 64;
         byte var15 = 64;
         int var16 = arg0 - var14;
         class451.field6590[var14][var15] = 99;
         int var17 = arg7 - var15;
         class202.field3023[var14][var15] = 0;
         byte var18 = 0;
         int var19 = 0;
         class128.field2142[var18] = arg0;
         int var28 = var18 + 1;
         class530.field7715[var18] = arg7;
         int[][] var20 = arg8.field9137;
         if (!var11 && var28 == var19) {
            class256.field3634 = arg7;
            class218.field3300 = arg0;
            return false;
         } else {
            int var12;
            int var13;
            label218:
            do {
               var12 = class128.field2142[var19];
               var13 = class530.field7715[var19];
               int var21 = -var16 + var12;
               int var22 = var13 - arg8.field9147;
               var19 = 4095 & var19 + 1;
               int var23 = -var17 + var13;
               int var24 = -arg8.field9143 + var12;
               int var25 = arg10;
               int var10000 = arg10;
               byte var29 = -4;

               do {
                  if (var10000 != var29) {
                     if (var25 != -3) {
                        if (~var25 != 1) {
                           if (~var25 != 0) {
                              label205: {
                                 if (~var25 != -1 && ~var25 != -2 && ~var25 != -3 && var25 != 3) {
                                    if (var25 != 9) {
                                       if (arg8.method4612(arg6, var13, var12, arg4, arg10, 110, arg9, 1)) {
                                          class256.field3634 = var13;
                                          class218.field3300 = var12;
                                          return true;
                                       }
                                       break label205;
                                    }

                                    if (var11) {
                                       if (~arg6 == ~var12 && arg9 == var13) {
                                          class218.field3300 = var12;
                                          class256.field3634 = var13;
                                          return true;
                                       }
                                       break label205;
                                    }
                                 }

                                 if (arg8.method4614(arg6, arg10, arg9, 1, arg4, var13, arg2 + 22065, var12)) {
                                    class256.field3634 = var13;
                                    class218.field3300 = var12;
                                    return true;
                                 }
                              }
                           } else if (arg8.method4604(arg9, (byte)-119, arg3, var12, var13, arg6, 1, arg5, arg1)) {
                              class256.field3634 = var13;
                              class218.field3300 = var12;
                              return true;
                           }
                        } else if (arg8.method4606(arg1, 1, arg5, var13, 1, arg9, arg3, arg6, var12, (byte)51)) {
                           class218.field3300 = var12;
                           class256.field3634 = var13;
                           return true;
                        }
                     } else if (class595.method4398(arg6, -1, 1, var12, arg9, arg1, arg3, 1, var13)) {
                        class256.field3634 = var13;
                        class218.field3300 = var12;
                        return true;
                     }
                  } else if (~arg6 == ~var12 && arg9 == var13) {
                     class218.field3300 = var12;
                     class256.field3634 = var13;
                     return true;
                  }

                  var25 = class202.field3023[var21][var23] + 1;
                  if (var21 > 0 && class451.field6590[var21 + -1][var23] == 0 && (1109655552 & var20[var24 + -1][var22]) == 0) {
                     class128.field2142[var28] = var12 + -1;
                     class530.field7715[var28] = var13;
                     class451.field6590[var21 - 1][var23] = 2;
                     var28 = var28 + 1 & 4095;
                     class202.field3023[var21 + -1][var23] = var25;
                  }

                  if (var21 < 127 && ~class451.field6590[var21 + 1][var23] == -1 && ~(var20[var24 + 1][var22] & 1612972032) == -1) {
                     class128.field2142[var28] = var12 + 1;
                     class530.field7715[var28] = var13;
                     var28 = 4095 & var28 - -1;
                     class451.field6590[var21 + 1][var23] = 8;
                     class202.field3023[var21 + 1][var23] = var25;
                  }

                  if (var23 > 0 && ~class451.field6590[var21][var23 + -1] == -1 && ~(1084489728 & var20[var24][var22 + -1]) == -1) {
                     class128.field2142[var28] = var12;
                     class530.field7715[var28] = var13 + -1;
                     class451.field6590[var21][var23 + -1] = 1;
                     var28 = 4095 & var28 - -1;
                     class202.field3023[var21][var23 + -1] = var25;
                  }

                  if (var23 < 127 && ~class451.field6590[var21][var23 + 1] == -1 && ~(var20[var24][var22 + 1] & 1210318848) == -1) {
                     class128.field2142[var28] = var12;
                     class530.field7715[var28] = var13 + 1;
                     var28 = var28 + 1 & 4095;
                     class451.field6590[var21][var23 + 1] = 4;
                     class202.field3023[var21][var23 + 1] = var25;
                  }

                  if (~var21 < -1 && ~var23 < -1 && class451.field6590[var21 - 1][var23 + -1] == 0 && ~(1134821376 & var20[var24 + -1][var22 + -1]) == -1 && (var20[var24 + -1][var22] & 1109655552) == 0 && (var20[var24][var22 + -1] & 1084489728) == 0) {
                     class128.field2142[var28] = var12 - 1;
                     class530.field7715[var28] = var13 + -1;
                     var28 = 4095 & var28 + 1;
                     class451.field6590[var21 - 1][var23 + -1] = 3;
                     class202.field3023[var21 + -1][var23 + -1] = var25;
                  }

                  if (~var21 > -128 && var23 > 0 && ~class451.field6590[var21 + 1][var23 - 1] == -1 && ~(var20[var24 + 1][var22 + -1] & 1625554944) == -1 && ~(1612972032 & var20[var24 + 1][var22]) == -1 && ~(var20[var24][var22 + -1] & 1084489728) == -1) {
                     class128.field2142[var28] = var12 - -1;
                     class530.field7715[var28] = var13 + -1;
                     class451.field6590[var21 + 1][var23 - 1] = 9;
                     var28 = var28 + 1 & 4095;
                     class202.field3023[var21 - -1][var23 + -1] = var25;
                  }

                  if (~var21 < -1 && ~var23 > -128 && ~class451.field6590[var21 + -1][var23 - -1] == -1 && (1310982144 & var20[var24 + -1][var22 + 1]) == 0 && (1109655552 & var20[var24 - 1][var22]) == 0 && (var20[var24][var22 + 1] & 1210318848) == 0) {
                     class128.field2142[var28] = var12 + -1;
                     class530.field7715[var28] = var13 - -1;
                     var28 = var28 + 1 & 4095;
                     class451.field6590[var21 - 1][var23 + 1] = 6;
                     class202.field3023[var21 + -1][var23 - -1] = var25;
                  }

                  if (~var21 <= -128) {
                     continue label218;
                  }

                  var10000 = ~var23;
                  var29 = -128;
               } while(var11);

               if (var10000 > -128 && class451.field6590[var21 + 1][var23 + 1] == 0 && ~(2015625216 & var20[var24 + 1][var22 + 1]) == -1 && ~(var20[var24 - -1][var22] & 1612972032) == -1 && (var20[var24][var22 + 1] & 1210318848) == 0) {
                  class128.field2142[var28] = var12 + 1;
                  class530.field7715[var28] = var13 + 1;
                  class451.field6590[var21 + 1][var23 + 1] = 12;
                  var28 = 4095 & var28 + 1;
                  class202.field3023[var21 - -1][var23 + 1] = var25;
               }
            } while(var28 != var19);

            class256.field3634 = var13;
            class218.field3300 = var12;
            return false;
         }
      } catch (RuntimeException var27) {
         throw class608.method4462(var27, field3402[3] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + (arg8 != null ? field3402[2] : field3402[1]) + ',' + arg9 + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1919(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 24);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nt",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1920(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 8;
            break;
         case 1:
            var10005 = 25;
            break;
         case 2:
            var10005 = 116;
            break;
         case 3:
            var10005 = 1;
            break;
         default:
            var10005 = 24;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
