import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!aba")
public class class189 extends class264 {
   @OriginalMember(
      owner = "client!aba",
      name = "G",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2699 = new String[]{method1501(method1500("*r3B\\c")), method1501(method1500("*r3BZc")), method1501(method1500("%e>\u0000")), method1501(method1500("0>|Bb")), method1501(method1500("k,;\u0001xv")), method1501(method1500("*r3B]c")), method1501(method1500("*r3BXc")), method1501(method1500("*r3B^c")), method1501(method1500("*r3B[c")), method1501(method1500("*r3BWc")), method1501(method1500("*r3BYc"))};
   @OriginalMember(
      owner = "client!aba",
      name = "N",
      descriptor = "Lhp;"
   )
   public static class348 field2695 = new class348();
   @OriginalMember(
      owner = "client!aba",
      name = "L",
      descriptor = "I"
   )
   public static int field2691;
   @OriginalMember(
      owner = "client!aba",
      name = "I",
      descriptor = "I"
   )
   public static int field2692;
   @OriginalMember(
      owner = "client!aba",
      name = "K",
      descriptor = "I"
   )
   public static int field2693;
   @OriginalMember(
      owner = "client!aba",
      name = "M",
      descriptor = "I"
   )
   public static int field2694;
   @OriginalMember(
      owner = "client!aba",
      name = "F",
      descriptor = "I"
   )
   public static int field2696;
   @OriginalMember(
      owner = "client!aba",
      name = "J",
      descriptor = "I"
   )
   public static int field2697;
   @OriginalMember(
      owner = "client!aba",
      name = "H",
      descriptor = "I"
   )
   public static int field2698;

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(ILha;I)V",
      line = 3
   )
   public static final void method1495(int arg0, class66 arg1, int arg2) {
      boolean var3 = client.field4360;

      try {
         ++field2698;
         if (class696.field10207 && class273.field3754) {
            if (class175.field2411) {
               class700.field10248 = class456.field6489.method394(-16005);
            }

            class428.field6129 = 0;
            class20.field225 = 0;
            class216.field3088 = 0;
            if (arg2 >= -93) {
               method1498((int[])null, true);
            }

            int[] var4 = arg1.method558();
            class253.field3450 = (int)((float)var4[2] / 3.0F);
            class433.field6212 = (int)((float)var4[3] / 3.0F);
            arg1.method546(class280.field3895);
            if (~((int)((float)class280.field3895[0] / 3.0F)) != ~class533.field7596 || ~((int)((float)class280.field3895[1] / 3.0F)) != ~class408.field5905) {
               class533.field7596 = (int)((float)class280.field3895[0] / 3.0F);
               class408.field5905 = (int)((float)class280.field3895[1] / 3.0F);
               class778.field11407 = class533.field7596 >> 1;
               class139.field1774 = new int[class533.field7596 * class408.field5905];
               class610.field8958 = class408.field5905 >> 1;
            }

            class628.field9223 = arg1.method600();
            class787.field11559 = 0;
            int var5 = 0;
            if (var3) {
               class695.method5063((byte)0, arg1, arg0, class67.field818[var5]);
               ++var5;
            }

            while(true) {
               while(class545.field7817 > var5) {
                  class695.method5063((byte)0, arg1, arg0, class67.field818[var5]);
                  ++var5;
               }

               int var6 = 0;
               if (!var3) {
                  if (var3) {
                     class695.method5063((byte)0, arg1, arg0, class740.field10795[var6]);
                     ++var6;
                  }

                  while(true) {
                     while(var6 < class288.field4000) {
                        class695.method5063((byte)0, arg1, arg0, class740.field10795[var6]);
                        ++var6;
                     }

                     int var7 = 0;
                     if (!var3) {
                        if (var3) {
                           class695.method5063((byte)0, arg1, arg0, class484.field6923[var7]);
                           ++var7;
                        }

                        while(true) {
                           int var10000;
                           if (class562.field8027 <= var7) {
                              class330.field4497 = 0;
                              var10000 = class787.field11559;
                              if (!var3) {
                                 if (var10000 > 0) {
                                    int var8 = class139.field1774.length;
                                    int var9 = -var8 + var8 & 7;
                                    int var10 = 0;
                                    if (var3) {
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                    }

                                    while(true) {
                                       while(var9 > var10) {
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                          class139.field1774[var10++] = Integer.MAX_VALUE;
                                       }

                                       if (!var3) {
                                          if (var3) {
                                             class139.field1774[var10++] = Integer.MAX_VALUE;
                                          }

                                          while(~var8 < ~var10) {
                                             class139.field1774[var10++] = Integer.MAX_VALUE;
                                          }

                                          class73.field903 = 1;
                                          int var11 = 0;
                                          if (var3 || ~class787.field11559 < ~var11) {
                                             do {
                                                class311 var12 = class443.field6309[var11];
                                                class172.method1397((byte)-94, var12.field4267[0], var12.field4264[3], var12.field4263[1], var12.field4263[0], var12.field4267[3], var12.field4267[1], var12.field4264[1], var12.field4263[3], var12.field4264[0]);
                                                class172.method1397((byte)-94, var12.field4267[1], var12.field4264[3], var12.field4263[2], var12.field4263[1], var12.field4267[3], var12.field4267[2], var12.field4264[2], var12.field4263[3], var12.field4264[1]);
                                                ++var11;
                                             } while(~class787.field11559 < ~var11);
                                          }

                                          class73.field903 = 2;
                                          break;
                                       }

                                       class139.field1774[var10++] = Integer.MAX_VALUE;
                                    }
                                 }

                                 if (class175.field2411) {
                                    class31.field443 = class456.field6489.method394(-16005) - class700.field10248;
                                    return;
                                 }

                                 return;
                              }
                           } else {
                              var10000 = 0;
                           }

                           class695.method5063((byte)var10000, arg1, arg0, class484.field6923[var7]);
                           ++var7;
                        }
                     }

                     ++var6;
                  }
               }

               ++var5;
            }
         } else {
            class787.field11559 = 0;
         }
      } catch (RuntimeException var14) {
         throw class237.method1823(var14, field2699[10] + arg0 + ',' + (arg1 != null ? field2699[3] : field2699[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "b",
      descriptor = "(III)V",
      line = 107
   )
   private final void method1496(int arg0, int arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field2697;
         int var5 = class258.field3496[arg0];
         if (arg2 > 96) {
            label121: {
               int var6 = class666.field9668[arg1];
               float var7 = (float)Math.atan2((double)(var5 + -2048), (double)(var6 + -2048));
               if ((double)var7 >= -3.141592653589793D && (double)var7 <= -2.356194490192345D) {
                  class161.field2295 = arg1;
                  class102.field1308 = arg0;
                  if (!var4) {
                     break label121;
                  }
               }

               if ((double)var7 <= -1.5707963267948966D && (double)var7 >= -2.356194490192345D) {
                  class102.field1308 = arg1;
                  class161.field2295 = arg0;
                  if (!var4) {
                     break label121;
                  }
               }

               if (!((double)var7 <= -0.7853981633974483D) || !((double)var7 >= -1.5707963267948966D)) {
                  if (!(var7 <= 0.0F) || !((double)var7 >= -0.7853981633974483D)) {
                     if (!(var7 >= 0.0F) || !((double)var7 <= 0.7853981633974483D)) {
                        if (!((double)var7 >= 0.7853981633974483D) || !((double)var7 <= 1.5707963267948966D)) {
                           if (!((double)var7 >= 1.5707963267948966D) || !((double)var7 <= 2.356194490192345D)) {
                              if (!((double)var7 >= 2.356194490192345D) || !((double)var7 <= 3.141592653589793D)) {
                                 break label121;
                              }

                              class161.field2295 = arg1;
                              class102.field1308 = -arg0 + class430.field6152;
                              if (!var4) {
                                 break label121;
                              }
                           }

                           class161.field2295 = -arg0 + class20.field234;
                           class102.field1308 = arg1;
                           if (!var4) {
                              break label121;
                           }
                        }

                        class102.field1308 = -arg1 + class430.field6152;
                        class161.field2295 = class20.field234 - arg0;
                        if (!var4) {
                           break label121;
                        }
                     }

                     class102.field1308 = -arg0 + class430.field6152;
                     class161.field2295 = -arg1 + class20.field234;
                     if (!var4) {
                        break label121;
                     }
                  }

                  class161.field2295 = class20.field234 - arg1;
                  class102.field1308 = arg0;
                  if (!var4) {
                     break label121;
                  }
               }

               class161.field2295 = arg0;
               class102.field1308 = class430.field6152 - arg1;
            }

            class161.field2295 &= class220.field3144;
            class102.field1308 &= class78.field967;
         }
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field2699[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "b",
      descriptor = "(B)V",
      line = 182
   )
   public static final void method1497(byte arg0) {
      try {
         ++field2691;
         if (arg0 <= 40) {
            method1495(-62, (class66)null, -98);
         }

         if (!class11.field123) {
            class718.field10477 += (-class718.field10477 + -24.0F) / 2.0F;
            class444.field6311 = true;
            class11.field123 = true;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2699[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "([IZ)Ljava/lang/String;",
      line = 199
   )
   public static final String method1498(int[] arg0, boolean arg1) {
      boolean var2 = client.field4360;

      try {
         ++field2694;
         StringBuffer var3 = new StringBuffer();
         int var4 = class754.field11174;
         int var5 = 0;
         if (!var2 && ~arg0.length >= ~var5) {
            if (!arg1) {
               field2695 = null;
            }

            return var3.toString();
         } else {
            do {
               class362 var6 = class741.field10810.method2476(arg0[var5], (byte)-98);
               if (~var6.field4946 != 0) {
                  class492 var7 = (class492)class685.field10094.method725(0, (long)var6.field4946);
                  if (var7 == null) {
                     class439 var8 = class439.method3239(class281.field3904, var6.field4946, 0);
                     if (var8 != null) {
                        var7 = class383.field5543.method500(var8, true);
                        class685.field10094.method723(0, (long)var6.field4946, var7);
                     }
                  }

                  if (var7 != null) {
                     class352.field4735[var4] = var7;
                     var3.append(field2699[4]).append(var4).append(">");
                     ++var4;
                  }
               }

               ++var5;
            } while(~arg0.length < ~var5);

            if (!arg1) {
               field2695 = null;
            }

            return var3.toString();
         }
      } catch (RuntimeException var10) {
         throw class237.method1823(var10, field2699[1] + (arg0 != null ? field2699[3] : field2699[2]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(IB)[[I",
      line = 250
   )
   public final int[][] method4(int arg0, byte arg1) {
      boolean var3 = client.field4360;

      try {
         ++field2692;
         int[][] var4 = super.field3634.method4362((byte)116, arg0);
         if (arg1 >= -117) {
            field2695 = null;
         }

         if (super.field3634.field8828) {
            int[] var5 = var4[0];
            int[] var6 = var4[1];
            int[] var7 = var4[2];
            int var8 = 0;
            if (var3 || class430.field6152 > var8) {
               do {
                  this.method1496(var8, arg0, 118);
                  int[][] var9 = this.method2015(0, (byte)76, class161.field2295);
                  var5[var8] = var9[0][class102.field1308];
                  var6[var8] = var9[1][class102.field1308];
                  var7[var8] = var9[2][class102.field1308];
                  ++var8;
               } while(class430.field6152 > var8);
            }
         }

         return var4;
      } catch (RuntimeException var11) {
         throw class237.method1823(var11, field2699[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "d",
      descriptor = "(I)V",
      line = 297
   )
   public static void method1499(int arg0) {
      try {
         field2695 = null;
         if (arg0 != 0) {
            field2695 = null;
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field2699[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(ILwf;I)V",
      line = 308
   )
   public final void method3(int arg0, class147 arg1, int arg2) {
      try {
         if (~arg0 == -1) {
            super.field3637 = ~arg1.method1143(-15465) == -2;
         }

         if (arg2 <= 49) {
            field2695 = null;
         }

         ++field2696;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field2699[7] + arg0 + ',' + (arg1 != null ? field2699[3] : field2699[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "a",
      descriptor = "(II)[I",
      line = 325
   )
   public final int[] method6(int arg0, int arg1) {
      boolean var3 = client.field4360;

      try {
         int var4 = 73 / ((arg1 - 24) / 44);
         ++field2693;
         int[] var5 = super.field3641.method3079(-14361, arg0);
         if (super.field3641.field5922) {
            int var6 = 0;
            if (var3 || class430.field6152 > var6) {
               do {
                  this.method1496(var6, arg0, 110);
                  int[] var7 = this.method2019(0, -27804, class161.field2295);
                  var5[var6] = var7[class102.field1308];
                  ++var6;
               } while(class430.field6152 > var6);
            }
         }

         return var5;
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field2699[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!aba",
      name = "<init>",
      descriptor = "()V",
      line = 357
   )
   public class189() {
      super(1, false);
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1500(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 31);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!aba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1501(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 16;
            break;
         case 2:
            var10005 = 82;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 31;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
