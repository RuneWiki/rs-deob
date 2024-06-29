import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!rk")
public abstract class class445 extends class96 {
   @OriginalMember(
      owner = "client!rk",
      name = "s",
      descriptor = "Z"
   )
   public volatile boolean field6490 = true;
   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6497 = new String[]{method3456(method3455("@Gp\u0011\u0019")), method3456(method3455("@Gp\u0014\u0019")), method3456(method3455("\\Y2>")), method3456(method3455("I\u0002p|L")), method3456(method3455("@Gp\u0013\u0019")), method3456(method3455("@Gp\u0010\u0019"))};
   @OriginalMember(
      owner = "client!rk",
      name = "r",
      descriptor = "Lhha;"
   )
   public static class724 field6496 = new class724(49, 16);
   @OriginalMember(
      owner = "client!rk",
      name = "v",
      descriptor = "I"
   )
   public static int field6492;
   @OriginalMember(
      owner = "client!rk",
      name = "w",
      descriptor = "I"
   )
   public static int field6494;
   @OriginalMember(
      owner = "client!rk",
      name = "u",
      descriptor = "I"
   )
   public static int field6495;
   @OriginalMember(
      owner = "client!rk",
      name = "q",
      descriptor = "Z"
   )
   public boolean field6491;
   @OriginalMember(
      owner = "client!rk",
      name = "t",
      descriptor = "Z"
   )
   public boolean field6493;

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(III)Z"
   )
   public static final boolean method3451(int arg0, int arg1, int arg2) {
      try {
         if (arg1 != -29018) {
            field6496 = null;
         }

         ++field6492;
         return (52 & arg2) != 0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field6497[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "f",
      descriptor = "(I)V"
   )
   public static void method3452(int arg0) {
      try {
         field6496 = null;
         if (arg0 != -30071) {
            method3454((byte)24);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field6497[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(I)[B"
   )
   public abstract byte[] method552(int arg0);

   @OriginalMember(
      owner = "client!rk",
      name = "a",
      descriptor = "(IIIIIIIIILbc;I)Z"
   )
   public static final boolean method3453(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8, class663 arg9, int arg10) {
      boolean var11 = client.field10022;

      try {
         ++field6495;
         int var12 = arg3;
         int var13 = arg6;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = -var14 + arg3;
         int var17 = -var15 + arg6;
         class182.field2674[var14][var15] = 99;
         class646.field9094[var14][var15] = 0;
         byte var18 = 0;
         class182.field2678[var18] = arg3;
         int var19 = 0;
         byte var10001 = var18;
         int var28 = var18 + 1;
         class386.field5627[var10001] = arg6;
         int[][] var20 = arg9.field9352;
         if (arg1 != 4095) {
            return true;
         } else {
            while(true) {
               label220:
               while(~var28 != ~var19) {
                  var12 = class182.field2678[var19];
                  var13 = class386.field5627[var19];
                  var19 = 4095 & var19 + 1;
                  int var21 = -var17 + var13;
                  int var22 = -var16 + var12;
                  int var23 = var12 - arg9.field9344;
                  int var24 = -arg9.field9348 + var13;
                  int var25 = arg7;
                  int var10000 = arg7;
                  byte var29 = -4;

                  do {
                     label215: {
                        label214: {
                           if (var10000 != var29) {
                              if (~var25 == 2) {
                                 if (class380.method2965(arg8, 2, arg0, 2, arg5, var12, var13, arg2, true)) {
                                    class622.field8888 = var13;
                                    class188.field2771 = var12;
                                    return true;
                                 }
                                 break label215;
                              }

                              if (~var25 == 1) {
                                 if (arg9.method4814(var12, arg8, 2, var13, arg2, arg10, 2, arg0, arg5, (byte)-118)) {
                                    class188.field2771 = var12;
                                    class622.field8888 = var13;
                                    return true;
                                 }
                                 break label215;
                              }

                              if (var25 == -1) {
                                 if (arg9.method4817(arg8, arg5, var13, arg10, arg2, 2665, 2, arg0, var12)) {
                                    class188.field2771 = var12;
                                    class622.field8888 = var13;
                                    return true;
                                 }
                                 break label215;
                              }

                              if (var25 == 0 || var25 == 1 || var25 == 2 || ~var25 == -4) {
                                 break label214;
                              }

                              if (var25 != 9) {
                                 if (arg9.method4807(arg4, arg7, var13, arg2, arg0, 2, var12, arg1 + -4167)) {
                                    class188.field2771 = var12;
                                    class622.field8888 = var13;
                                    return true;
                                 }
                                 break label215;
                              }

                              if (!var11) {
                                 break label214;
                              }
                           }

                           if (arg2 == var12 && ~arg0 == ~var13) {
                              class188.field2771 = var12;
                              class622.field8888 = var13;
                              return true;
                           }
                           break label215;
                        }

                        if (arg9.method4813(arg2, arg0, 2, var13, arg7, arg1 ^ 3462, arg4, var12)) {
                           class622.field8888 = var13;
                           class188.field2771 = var12;
                           return true;
                        }
                     }

                     var25 = class646.field9094[var22][var21] + 1;
                     if (~var22 < -1 && class182.field2674[var22 + -1][var21] == 0 && (var20[var23 - 1][var24] & 1134821376) == 0 && (var20[var23 + -1][var24 + 1] & 1310982144) == 0) {
                        class182.field2678[var28] = var12 + -1;
                        class386.field5627[var28] = var13;
                        class182.field2674[var22 - 1][var21] = 2;
                        var28 = var28 + 1 & 4095;
                        class646.field9094[var22 - 1][var21] = var25;
                     }

                     if (~var22 > -127 && class182.field2674[var22 + 1][var21] == 0 && (1625554944 & var20[var23 + 2][var24]) == 0 && ~(2015625216 & var20[var23 - -2][var24 + 1]) == -1) {
                        class182.field2678[var28] = var12 + 1;
                        class386.field5627[var28] = var13;
                        var28 = var28 - -1 & 4095;
                        class182.field2674[var22 - -1][var21] = 8;
                        class646.field9094[var22 + 1][var21] = var25;
                     }

                     if (var21 > 0 && ~class182.field2674[var22][var21 - 1] == -1 && (1134821376 & var20[var23][var24 + -1]) == 0 && ~(1625554944 & var20[var23 + 1][var24 + -1]) == -1) {
                        class182.field2678[var28] = var12;
                        class386.field5627[var28] = var13 + -1;
                        var28 = 4095 & var28 + 1;
                        class182.field2674[var22][var21 + -1] = 1;
                        class646.field9094[var22][var21 + -1] = var25;
                     }

                     if (var21 < 126 && ~class182.field2674[var22][var21 + 1] == -1 && ~(var20[var23][var24 - -2] & 1310982144) == -1 && ~(2015625216 & var20[var23 - -1][var24 + 2]) == -1) {
                        class182.field2678[var28] = var12;
                        class386.field5627[var28] = var13 + 1;
                        var28 = 4095 & var28 - -1;
                        class182.field2674[var22][var21 + 1] = 4;
                        class646.field9094[var22][var21 - -1] = var25;
                     }

                     if (~var22 < -1 && ~var21 < -1 && class182.field2674[var22 + -1][var21 + -1] == 0 && ~(1336147968 & var20[var23 - 1][var24]) == -1 && (1134821376 & var20[var23 + -1][var24 + -1]) == 0 && ~(1675886592 & var20[var23][var24 + -1]) == -1) {
                        class182.field2678[var28] = var12 + -1;
                        class386.field5627[var28] = var13 + -1;
                        var28 = 4095 & var28 - -1;
                        class182.field2674[var22 + -1][var21 + -1] = 3;
                        class646.field9094[var22 - 1][var21 - 1] = var25;
                     }

                     if (var22 < 126 && var21 > 0 && ~class182.field2674[var22 + 1][var21 + -1] == -1 && (var20[var23 + 1][var24 + -1] & 1675886592) == 0 && (var20[var23 + 2][var24 - 1] & 1625554944) == 0 && (var20[var23 + 2][var24] & 2028208128) == 0) {
                        class182.field2678[var28] = var12 + 1;
                        class386.field5627[var28] = var13 - 1;
                        class182.field2674[var22 + 1][var21 + -1] = 9;
                        var28 = 4095 & var28 - -1;
                        class646.field9094[var22 + 1][var21 + -1] = var25;
                     }

                     if (var22 > 0 && ~var21 > -127 && class182.field2674[var22 + -1][var21 + 1] == 0 && (1336147968 & var20[var23 - 1][var24 + 1]) == 0 && ~(var20[var23 + -1][var24 + 2] & 1310982144) == -1 && ~(2116288512 & var20[var23][var24 + 2]) == -1) {
                        class182.field2678[var28] = var12 + -1;
                        class386.field5627[var28] = var13 + 1;
                        class182.field2674[var22 + -1][var21 + 1] = 6;
                        var28 = var28 - -1 & 4095;
                        class646.field9094[var22 + -1][var21 + 1] = var25;
                     }

                     if (~var22 <= -127) {
                        continue label220;
                     }

                     var10000 = var21;
                     var29 = 126;
                  } while(var11);

                  if (var21 < 126 && ~class182.field2674[var22 + 1][var21 + 1] == -1 && (var20[var23 - -1][var24 - -2] & 2116288512) == 0 && ~(2015625216 & var20[var23 + 2][var24 + 2]) == -1 && (var20[var23 - -2][var24 - -1] & 2028208128) == 0) {
                     class182.field2678[var28] = var12 + 1;
                     class386.field5627[var28] = var13 - -1;
                     var28 = 4095 & var28 - -1;
                     class182.field2674[var22 - -1][var21 + 1] = 12;
                     class646.field9094[var22 - -1][var21 + 1] = var25;
                  }
               }

               class622.field8888 = var13;
               class188.field2771 = var12;
               return false;
            }
         }
      } catch (RuntimeException var27) {
         throw class612.method4503(var27, field6497[1] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field6497[3] : field6497[2]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "e",
      descriptor = "(I)I"
   )
   public abstract int method550(int arg0);

   @OriginalMember(
      owner = "client!rk",
      name = "b",
      descriptor = "(B)Lgfa;"
   )
   public static final class111 method3454(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field6494;
         class111 var2 = (class111)class236.field3650.method5225(true);
         if (var2 != null) {
            var2.method2140((byte)-104);
            var2.method962(false);
            return var2;
         } else {
            int var3 = -99 % ((-36 - arg0) / 32);

            label31:
            while(true) {
               class111 var4 = (class111)class37.field541.method5225(true);
               if (var4 == null) {
                  return null;
               }

               class111 var10000 = var4;

               do {
                  if (var10000.method1086((byte)110) > class604.method4452(-106)) {
                     return null;
                  }

                  var4.method2140((byte)-113);
                  var4.method962(false);
                  if ((var4.field1548 & Long.MIN_VALUE) == 0L) {
                     continue label31;
                  }

                  var10000 = var4;
               } while(var1);

               return var4;
            }
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field6497[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3455(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 49);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!rk",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3456(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 50;
            break;
         case 1:
            var10005 = 44;
            break;
         case 2:
            var10005 = 94;
            break;
         case 3:
            var10005 = 82;
            break;
         default:
            var10005 = 49;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
