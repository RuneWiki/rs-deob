import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oga")
public class class503 {
   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6899 = new String[]{method3634(method3633("G.c\u0014f\u0000")), method3634(method3633("F<nV")), method3634(method3633("Sg,\u0014Y")), method3634(method3633("G.c\u0014e\u0000")), method3634(method3633("]%")), method3634(method3633("G.c\u0014g\u0000")), method3634(method3633("]$")), method3634(method3633("G.c\u0014`\u0000"))};
   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "Lbga;"
   )
   public static class378 field6896 = new class378(62, -2);
   @OriginalMember(
      owner = "client!oga",
      name = "f",
      descriptor = "I"
   )
   public int field6893;
   @OriginalMember(
      owner = "client!oga",
      name = "c",
      descriptor = "I"
   )
   public static int field6894;
   @OriginalMember(
      owner = "client!oga",
      name = "b",
      descriptor = "I"
   )
   public static int field6895;
   @OriginalMember(
      owner = "client!oga",
      name = "e",
      descriptor = "I"
   )
   public static int field6897;
   @OriginalMember(
      owner = "client!oga",
      name = "d",
      descriptor = "Ljava/lang/String;"
   )
   public String field6898;

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method3629(int arg0) {
      boolean var1 = client.field4273;

      try {
         int var2;
         int var3;
         int var7;
         label79: {
            class350.method2763((byte)87, class674.field9907.field8435.method5180((byte)-76));
            ++field6895;
            var2 = (class752.field10921 >> 3) + (class737.field10747 >> 12);
            class239.field2981 = class278.field3709.field1001 = 0;
            var3 = (class532.field7284 >> 12) + (class17.field237 >> 3);
            class278.field3709.method3056(8, 109, 8);
            byte var4 = 18;
            class777.field11309 = new byte[var4][];
            class178.field2213 = new int[var4][4];
            class239.field2982 = new byte[var4][];
            class527.field7205 = new byte[var4][];
            class777.field11300 = new int[var4];
            class548.field7491 = new int[var4];
            class794.field11597 = new int[var4];
            class125.field1565 = new byte[var4][];
            class12.field142 = new int[var4];
            class740.field10786 = new int[var4];
            class215.field2661 = new int[var4];
            class325.field4367 = new byte[var4][];
            int var5 = 0;
            int var6 = (-(class507.field7030 >> 4) + var2) / 8;
            if (var1) {
               var7 = (-(class215.field2667 >> 4) + var3) / 8;
            } else if (((class507.field7030 >> 4) + var2) / 8 < var6) {
               var7 = var5;
               if (!var1) {
                  break label79;
               }
            } else {
               var7 = (-(class215.field2667 >> 4) + var3) / 8;
            }

            while(true) {
               if (var1 || var7 <= ((class215.field2667 >> 4) + var3) / 8) {
                  do {
                     int var8 = (var6 << 8) + var7;
                     class794.field11597[var5] = var8;
                     class777.field11300[var5] = class95.field1264.method740(-1, "m" + var6 + "_" + var7);
                     class548.field7491[var5] = class95.field1264.method740(class168.method1321(arg0, 1364485943), "l" + var6 + "_" + var7);
                     class740.field10786[var5] = class95.field1264.method740(-1, "n" + var6 + "_" + var7);
                     class12.field142[var5] = class95.field1264.method740(arg0 + 1364485943, field6899[6] + var6 + "_" + var7);
                     class215.field2661[var5] = class95.field1264.method740(-1, field6899[4] + var6 + "_" + var7);
                     if (~class740.field10786[var5] == 0) {
                        class777.field11300[var5] = -1;
                        class548.field7491[var5] = -1;
                        class12.field142[var5] = -1;
                        class215.field2661[var5] = -1;
                     }

                     ++var5;
                     ++var7;
                  } while(var7 <= ((class215.field2667 >> 4) + var3) / 8);
               }

               ++var6;
               if (((class507.field7030 >> 4) + var2) / 8 < var6) {
                  var7 = var5;
                  if (!var1) {
                     break;
                  }
               } else {
                  var7 = (-(class215.field2667 >> 4) + var3) / 8;
               }
            }
         }

         if (var1) {
            class740.field10786[var7] = -1;
            class777.field11300[var7] = -1;
            class548.field7491[var7] = -1;
            class12.field142[var7] = -1;
            class215.field2661[var7] = -1;
            ++var7;
         }

         while(true) {
            while(~class740.field10786.length < ~var7) {
               class740.field10786[var7] = -1;
               class777.field11300[var7] = -1;
               class548.field7491[var7] = -1;
               class12.field142[var7] = -1;
               class215.field2661[var7] = -1;
               ++var7;
            }

            if (!var1) {
               byte var9;
               if (class445.field6162 != 3) {
                  label108: {
                     if (class445.field6162 == 9) {
                        var9 = 10;
                        if (!var1) {
                           break label108;
                        }
                     }

                     if (~class445.field6162 == -8) {
                        var9 = 8;
                        if (!var1) {
                           break label108;
                        }
                     }

                     throw new RuntimeException("");
                  }
               } else {
                  var9 = 4;
               }

               class778.method5571(var3, false, var9, var2, false);
               if (arg0 != -1364485944) {
                  field6896 = null;
                  return;
               }

               return;
            }

            ++var7;
         }
      } catch (RuntimeException var11) {
         throw class534.method3846(var11, field6899[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(IIIIIIIII)V"
   )
   public static final void method3630(int arg0, int arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      boolean var9 = client.field4273;

      try {
         ++field6897;
         if (!class603.method4400(2, arg5)) {
            if (arg6 != -1) {
               class244.field3057[arg6] = true;
            } else {
               int var10 = 0;
               if (var9) {
                  class244.field3057[var10] = true;
                  ++var10;
               }

               while(true) {
                  while(~var10 > -101) {
                     class244.field3057[var10] = true;
                     ++var10;
                  }

                  if (!var9) {
                     return;
                  }

                  ++var10;
               }
            }
         } else {
            int var11 = 0;
            int var12 = 0;
            int var13 = 0;
            int var14 = 0;
            int var15 = 0;
            if (arg2 > 73) {
               if (class775.field11283) {
                  var13 = class366.field5164;
                  var14 = class290.field3837;
                  var12 = class529.field7263;
                  var15 = class206.field2535;
                  var11 = class534.field7300;
                  class206.field2535 = 1;
               }

               label91: {
                  if (class549.field7503[arg5] == null) {
                     class445.method3303(arg6, arg7, arg1, arg4, arg8, (byte)-79, arg6 < 0, -1, arg3, arg0, class468.field6451[arg5]);
                     if (!var9) {
                        break label91;
                     }
                  }

                  class445.method3303(arg6, arg7, arg1, arg4, arg8, (byte)112, arg6 < 0, -1, arg3, arg0, class549.field7503[arg5]);
               }

               if (class775.field11283) {
                  if (arg6 >= 0 && ~class206.field2535 == -3) {
                     class534.method3842(0, class366.field5164, class290.field3837, class529.field7263, class534.field7300);
                  }

                  class529.field7263 = var12;
                  class290.field3837 = var14;
                  class534.field7300 = var11;
                  class206.field2535 = var15;
                  class366.field5164 = var13;
               }
            }
         }
      } catch (RuntimeException var17) {
         throw class534.method3846(var17, field6899[7] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "a",
      descriptor = "(Lha;II)V"
   )
   public static final void method3631(class65 arg0, int arg1, int arg2) {
      boolean var3 = client.field4273;

      try {
         ++field6894;
         if (class233.field2888 && class480.field6633) {
            if (class501.field6884) {
               class790.field11561 = class573.field7893.method978(10766);
            }

            class666.field9475 = 0;
            if (arg2 <= -18) {
               class163.field2096 = 0;
               class517.field7091 = 0;
               int[] var4 = arg0.method599();
               class348.field4997 = (int)((float)var4[2] / 3.0F);
               class213.field2655 = (int)((float)var4[3] / 3.0F);
               arg0.method571(class438.field6070);
               if (~((int)((float)class438.field6070[0] / 3.0F)) != ~class243.field3041 || ~((int)((float)class438.field6070[1] / 3.0F)) != ~class696.field10168) {
                  class696.field10168 = (int)((float)class438.field6070[1] / 3.0F);
                  class243.field3041 = (int)((float)class438.field6070[0] / 3.0F);
                  class793.field11583 = new int[class696.field10168 * class243.field3041];
                  class254.field3235 = class696.field10168 >> 1;
                  class390.field5451 = class243.field3041 >> 1;
               }

               class338.field4846 = arg0.method507();
               class523.field7165 = 0;
               int var5 = 0;
               if (var3) {
                  class697.method5066(arg0, -124, class625.field8733[var5], arg1);
                  ++var5;
               }

               while(true) {
                  while(~class642.field9026 < ~var5) {
                     class697.method5066(arg0, -124, class625.field8733[var5], arg1);
                     ++var5;
                  }

                  int var6 = 0;
                  if (!var3) {
                     if (var3) {
                        class697.method5066(arg0, -113, class795.field11617[var6], arg1);
                        ++var6;
                     }

                     while(true) {
                        while(var6 < class623.field8695) {
                           class697.method5066(arg0, -113, class795.field11617[var6], arg1);
                           ++var6;
                        }

                        int var7 = 0;
                        if (!var3) {
                           if (var3) {
                              class697.method5066(arg0, -97, class397.field5579[var7], arg1);
                              ++var7;
                           }

                           while(true) {
                              while(~var7 > ~class28.field350) {
                                 class697.method5066(arg0, -97, class397.field5579[var7], arg1);
                                 ++var7;
                              }

                              class111.field1406 = 0;
                              if (!var3) {
                                 if (~class523.field7165 < -1) {
                                    int var8 = class793.field11583.length;
                                    int var9 = 7 & -var8 + var8;
                                    int var10 = 0;
                                    if (var3) {
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                    }

                                    while(true) {
                                       while(var10 < var9) {
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                          class793.field11583[var10++] = Integer.MAX_VALUE;
                                       }

                                       if (!var3) {
                                          if (var3) {
                                             class793.field11583[var10++] = Integer.MAX_VALUE;
                                          }

                                          while(~var10 > ~var8) {
                                             class793.field11583[var10++] = Integer.MAX_VALUE;
                                          }

                                          class100.field1286 = 1;
                                          int var11 = 0;
                                          if (var3 || var11 < class523.field7165) {
                                             do {
                                                class777 var12 = class614.field8580[var11];
                                                class533.method3838(var12.field11303[0], var12.field11303[3], var12.field11308[3], var12.field11307[3], var12.field11303[1], var12.field11308[0], var12.field11307[1], var12.field11308[1], var12.field11307[0], 0);
                                                class533.method3838(var12.field11303[1], var12.field11303[3], var12.field11308[3], var12.field11307[3], var12.field11303[2], var12.field11308[1], var12.field11307[2], var12.field11308[2], var12.field11307[1], 0);
                                                ++var11;
                                             } while(var11 < class523.field7165);
                                          }

                                          class100.field1286 = 2;
                                          break;
                                       }

                                       class793.field11583[var10++] = Integer.MAX_VALUE;
                                    }
                                 }

                                 if (class501.field6884) {
                                    class241.field2999 = class573.field7893.method978(10766) + -class790.field11561;
                                    return;
                                 }

                                 return;
                              }

                              ++var7;
                           }
                        }

                        ++var6;
                     }
                  }

                  ++var5;
               }
            }
         } else {
            class523.field7165 = 0;
         }
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field6899[0] + (arg0 != null ? field6899[2] : field6899[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method3632(int arg0) {
      try {
         field6896 = null;
         if (arg0 != -6304) {
            method3632(-31);
         }
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field6899[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3633(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 36);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3634(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 40;
            break;
         case 1:
            var10005 = 73;
            break;
         case 2:
            var10005 = 2;
            break;
         case 3:
            var10005 = 58;
            break;
         default:
            var10005 = 36;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
