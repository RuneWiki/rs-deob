import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!cha")
public class class227 {
   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2912 = new String[]{method1718(method1717("B:dn)N\u0001q24O5-")), method1718(method1717("O'i,")), method1718(method1717("B:dn\u001e\t")), method1718(method1717("Z|+n ")), method1718(method1717("B:dn\u001f\t"))};
   @OriginalMember(
      owner = "client!cha",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field2907 = false;
   @OriginalMember(
      owner = "client!cha",
      name = "b",
      descriptor = "I"
   )
   public static int field2908;
   @OriginalMember(
      owner = "client!cha",
      name = "c",
      descriptor = "I"
   )
   public static int field2909;
   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "I"
   )
   public static int field2910;
   @OriginalMember(
      owner = "client!cha",
      name = "e",
      descriptor = "I"
   )
   public static int field2911;

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(IIIIIIIBILega;I)Z"
   )
   public static final boolean method1714(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, byte arg7, int arg8, class739 arg9, int arg10) {
      int var11 = client.field4530;

      try {
         ++field2910;
         byte var14 = 64;
         byte var15 = 64;
         int var16 = arg1 - var14;
         int var17 = -var15 + arg10;
         if (arg7 < 17) {
            return true;
         } else {
            class213.field2700[var14][var15] = 99;
            class130.field1621[var14][var15] = 0;
            byte var18 = 0;
            int var19 = 0;
            class473.field7063[var18] = arg1;
            byte var10001 = var18;
            int var28 = var18 + 1;
            class427.field6526[var10001] = arg10;
            int[][] var20 = arg9.field10979;
            if (var11 == 0 && ~var28 == ~var19) {
               class260.field3535 = arg1;
               class751.field11116 = arg10;
               return false;
            } else {
               int var12;
               int var13;
               label218:
               do {
                  var13 = class427.field6526[var19];
                  var12 = class473.field7063[var19];
                  int var21 = var13 - var17;
                  int var22 = -arg9.field10981 + var12;
                  var19 = 4095 & var19 + 1;
                  int var23 = var12 - var16;
                  int var24 = -arg9.field10962 + var13;
                  int var25 = arg6;
                  int var10000 = arg6;
                  byte var29 = -4;

                  do {
                     if (var10000 != var29) {
                        if (var25 != -3) {
                           if (var25 != -2) {
                              if (~var25 != 0) {
                                 label205: {
                                    if (var25 != 0 && ~var25 != -2 && ~var25 != -3 && ~var25 != -4) {
                                       if (~var25 != -10) {
                                          if (arg9.method5378(var12, 1, arg3, arg4, var13, -1, arg6, arg5)) {
                                             class751.field11116 = var13;
                                             class260.field3535 = var12;
                                             return true;
                                          }
                                          break label205;
                                       }

                                       if (var11 != 0) {
                                          if (~arg5 == ~var12 && ~arg4 == ~var13) {
                                             class751.field11116 = var13;
                                             class260.field3535 = var12;
                                             return true;
                                          }
                                          break label205;
                                       }
                                    }

                                    if (arg9.method5391(arg3, arg5, 1, var13, arg4, arg6, 2, var12)) {
                                       class751.field11116 = var13;
                                       class260.field3535 = var12;
                                       return true;
                                    }
                                 }
                              } else if (arg9.method5393(arg4, var13, arg2, arg8, arg0, var12, 1, arg5, -5289)) {
                                 class751.field11116 = var13;
                                 class260.field3535 = var12;
                                 return true;
                              }
                           } else if (arg9.method5386(1, arg0, arg2, 1, arg4, var13, (byte)101, var12, arg5, arg8)) {
                              class260.field3535 = var12;
                              class751.field11116 = var13;
                              return true;
                           }
                        } else if (class568.method4207((byte)127, arg4, 1, arg5, var12, arg8, 1, arg0, var13)) {
                           class751.field11116 = var13;
                           class260.field3535 = var12;
                           return true;
                        }
                     } else if (~arg5 == ~var12 && ~arg4 == ~var13) {
                        class751.field11116 = var13;
                        class260.field3535 = var12;
                        return true;
                     }

                     var25 = class130.field1621[var23][var21] + 1;
                     if (var23 > 0 && ~class213.field2700[var23 + -1][var21] == -1 && ~(var20[var22 + -1][var24] & 1109655552) == -1) {
                        class473.field7063[var28] = var12 + -1;
                        class427.field6526[var28] = var13;
                        class213.field2700[var23 + -1][var21] = 2;
                        var28 = 4095 & var28 + 1;
                        class130.field1621[var23 + -1][var21] = var25;
                     }

                     if (~var23 > -128 && ~class213.field2700[var23 + 1][var21] == -1 && ~(1612972032 & var20[var22 - -1][var24]) == -1) {
                        class473.field7063[var28] = var12 + 1;
                        class427.field6526[var28] = var13;
                        class213.field2700[var23 + 1][var21] = 8;
                        var28 = 4095 & var28 + 1;
                        class130.field1621[var23 + 1][var21] = var25;
                     }

                     if (~var21 < -1 && class213.field2700[var23][var21 + -1] == 0 && (var20[var22][var24 + -1] & 1084489728) == 0) {
                        class473.field7063[var28] = var12;
                        class427.field6526[var28] = var13 + -1;
                        class213.field2700[var23][var21 + -1] = 1;
                        var28 = 4095 & var28 - -1;
                        class130.field1621[var23][var21 + -1] = var25;
                     }

                     if (~var21 > -128 && class213.field2700[var23][var21 + 1] == 0 && (1210318848 & var20[var22][var24 - -1]) == 0) {
                        class473.field7063[var28] = var12;
                        class427.field6526[var28] = var13 + 1;
                        var28 = var28 + 1 & 4095;
                        class213.field2700[var23][var21 - -1] = 4;
                        class130.field1621[var23][var21 + 1] = var25;
                     }

                     if (var23 > 0 && var21 > 0 && ~class213.field2700[var23 + -1][var21 + -1] == -1 && ~(1134821376 & var20[var22 + -1][var24 + -1]) == -1 && (1109655552 & var20[var22 - 1][var24]) == 0 && ~(1084489728 & var20[var22][var24 + -1]) == -1) {
                        class473.field7063[var28] = var12 + -1;
                        class427.field6526[var28] = var13 + -1;
                        var28 = 4095 & var28 + 1;
                        class213.field2700[var23 + -1][var21 + -1] = 3;
                        class130.field1621[var23 + -1][var21 + -1] = var25;
                     }

                     if (~var23 > -128 && var21 > 0 && class213.field2700[var23 + 1][var21 + -1] == 0 && ~(1625554944 & var20[var22 + 1][var24 + -1]) == -1 && ~(var20[var22 + 1][var24] & 1612972032) == -1 && ~(1084489728 & var20[var22][var24 + -1]) == -1) {
                        class473.field7063[var28] = var12 + 1;
                        class427.field6526[var28] = var13 + -1;
                        var28 = 4095 & var28 + 1;
                        class213.field2700[var23 + 1][var21 + -1] = 9;
                        class130.field1621[var23 + 1][var21 - 1] = var25;
                     }

                     if (var23 > 0 && ~var21 > -128 && ~class213.field2700[var23 - 1][var21 + 1] == -1 && ~(var20[var22 + -1][var24 + 1] & 1310982144) == -1 && (var20[var22 - 1][var24] & 1109655552) == 0 && ~(1210318848 & var20[var22][var24 + 1]) == -1) {
                        class473.field7063[var28] = var12 + -1;
                        class427.field6526[var28] = var13 + 1;
                        var28 = 4095 & var28 + 1;
                        class213.field2700[var23 + -1][var21 - -1] = 6;
                        class130.field1621[var23 + -1][var21 + 1] = var25;
                     }

                     if (var23 >= 127) {
                        continue label218;
                     }

                     var10000 = var21;
                     var29 = 127;
                  } while(var11 != 0);

                  if (var21 < 127 && ~class213.field2700[var23 + 1][var21 - -1] == -1 && (var20[var22 + 1][var24 + 1] & 2015625216) == 0 && (1612972032 & var20[var22 + 1][var24]) == 0 && ~(1210318848 & var20[var22][var24 + 1]) == -1) {
                     class473.field7063[var28] = var12 + 1;
                     class427.field6526[var28] = var13 + 1;
                     class213.field2700[var23 + 1][var21 + 1] = 12;
                     var28 = var28 + 1 & 4095;
                     class130.field1621[var23 + 1][var21 + 1] = var25;
                  }
               } while(~var28 != ~var19);

               class260.field3535 = var12;
               class751.field11116 = var13;
               return false;
            }
         }
      } catch (RuntimeException var27) {
         throw class670.method4877(var27, field2912[2] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ',' + (arg9 != null ? field2912[3] : field2912[1]) + ',' + arg10 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "toString",
      descriptor = "()Ljava/lang/String;"
   )
   public final String toString() {
      try {
         ++field2908;
         throw new IllegalStateException();
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field2912[0] + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(Lr;III[Z)Z"
   )
   public static final boolean method1715(class193 arg0, int arg1, int arg2, int arg3, boolean[] arg4) {
      boolean var5 = false;
      if (class650.field9484 != class377.field5711) {
         int var6 = class147.field1843[arg1].method2236((byte)111, arg2, arg3);

         for(int var7 = 0; var7 <= arg1; ++var7) {
            class293 var8 = class147.field1843[var7];
            if (var8 != null) {
               int var9 = var6 - var8.method2236((byte)113, arg2, arg3);
               if (arg4 != null) {
                  arg4[var7] = var8.method770(arg0, arg2, var9, arg3, 0, false);
                  if (!arg4[var7]) {
                     continue;
                  }
               }

               var8.method775(arg0, arg2, var9, arg3, 0, false);
               var5 = true;
            }
         }
      }

      return var5;
   }

   @OriginalMember(
      owner = "client!cha",
      name = "a",
      descriptor = "(II)I"
   )
   public static final int method1716(int arg0, int arg1) {
      int var2 = client.field4530;

      try {
         if (arg1 != 1) {
            return 24;
         } else {
            byte var3;
            label42: {
               ++field2909;
               if (arg0 > 12000) {
                  var3 = 4;
                  class379.method2927((byte)-75);
                  if (var2 == 0) {
                     break label42;
                  }
               }

               if (~arg0 < -5001) {
                  var3 = 3;
                  class30.method216(-113);
                  if (var2 == 0) {
                     break label42;
                  }
               }

               if (~arg0 < -2001) {
                  var3 = 2;
                  class492.method3645((byte)116);
                  if (var2 == 0) {
                     break label42;
                  }
               }

               class564.method4172(arg1 + -8520, true);
               var3 = 1;
            }

            if (~class261.field3566.field9464.method4225(arg1 ^ 104) != -3) {
               class261.field3566.method4677(class261.field3566.field9465, 60, 2);
               class428.method3261(false, -128, 2);
            }

            class471.method3510((byte)118);
            return var3;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field2912[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1717(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 93);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!cha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1718(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 33;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 64;
            break;
         default:
            var10005 = 93;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
