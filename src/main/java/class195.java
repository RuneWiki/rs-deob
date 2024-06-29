import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!we")
public class class195 {
   @OriginalMember(
      owner = "client!we",
      name = "f",
      descriptor = "[[I"
   )
   private int[][] field2823;
   @OriginalMember(
      owner = "client!we",
      name = "g",
      descriptor = "I"
   )
   private int field2821;
   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "I"
   )
   private int field2820;
   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2826 = new String[]{method1719(method1718("\u001d9")), method1719(method1718("\u001d8")), method1719(method1718("\u001f0RY<")), method1719(method1718("\u0006 \u0010t")), method1719(method1718("\u001f0RZ<")), method1719(method1718("\u0013{R6i")), method1719(method1718("\u001f0R$}\u0006<\b&<")), method1719(method1718("\u001f0R\\<")), method1719(method1718("\u001f0R^<")), method1719(method1718("\u001f0R]<")), method1719(method1718("\u001f0R[<"))};
   @OriginalMember(
      owner = "client!we",
      name = "d",
      descriptor = "F"
   )
   public static float field2818;
   @OriginalMember(
      owner = "client!we",
      name = "i",
      descriptor = "I"
   )
   public static int field2816;
   @OriginalMember(
      owner = "client!we",
      name = "c",
      descriptor = "I"
   )
   public static int field2817;
   @OriginalMember(
      owner = "client!we",
      name = "j",
      descriptor = "I"
   )
   public static int field2822;
   @OriginalMember(
      owner = "client!we",
      name = "h",
      descriptor = "I"
   )
   public static int field2824;
   @OriginalMember(
      owner = "client!we",
      name = "e",
      descriptor = "I"
   )
   public static int field2825;
   @OriginalMember(
      owner = "client!we",
      name = "b",
      descriptor = "Lpb;"
   )
   public static class142 field2819;

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "([SI)[S"
   )
   public final short[] method1712(short[] arg0, int arg1) {
      boolean var3 = client.field10022;

      try {
         ++field2824;
         if (arg1 != 31654) {
            return null;
         } else {
            if (this.field2823 != null) {
               int var4;
               int[] var5;
               int var9;
               label102: {
                  var4 = (int)((long)arg0.length * (long)this.field2821 / (long)this.field2820) + 14;
                  var5 = new int[var4];
                  int var6 = 0;
                  int var7 = 0;
                  int var8 = 0;
                  if (var3) {
                     var9 = arg0[var8];
                  } else if (var8 >= arg0.length) {
                     arg0 = new short[var4];
                     var9 = 0;
                     if (!var3) {
                        break label102;
                     }
                  } else {
                     var9 = arg0[var8];
                  }

                  label101:
                  while(true) {
                     int[] var10 = this.field2823[var7];
                     int var11 = 0;
                     if (var3) {
                        var5[var6 + var11] += var10[var11] * var9 >> 2;
                        ++var11;
                     }

                     while(true) {
                        while(var11 < 14) {
                           var5[var6 + var11] += var10[var11] * var9 >> 2;
                           ++var11;
                        }

                        int var12 = this.field2821 + var7;
                        int var13 = var12 / this.field2820;
                        var7 = var12 - this.field2820 * var13;
                        var6 += var13;
                        if (!var3) {
                           ++var8;
                           if (var8 >= arg0.length) {
                              arg0 = new short[var4];
                              var9 = 0;
                              if (!var3) {
                                 break label101;
                              }
                           } else {
                              var9 = arg0[var8];
                           }
                           break;
                        }

                        ++var11;
                     }
                  }
               }

               if (var3 || var9 < var4) {
                  do {
                     int var14 = var5[var9] - -8192 >> 14;
                     if (var14 < -32768) {
                        arg0[var9] = -32768;
                        if (!var3) {
                           ++var9;
                           continue;
                        }
                     }

                     if (var14 > 32767) {
                        arg0[var9] = 32767;
                        if (var3) {
                           arg0[var9] = (short)var14;
                           ++var9;
                        } else {
                           ++var9;
                        }
                     } else {
                        arg0[var9] = (short)var14;
                        ++var9;
                     }
                  } while(var9 < var4);
               }
            }

            return arg0;
         }
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field2826[4] + (arg0 != null ? field2826[5] : field2826[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(II)I"
   )
   public final int method1713(int arg0, int arg1) {
      try {
         if (arg1 != 28729) {
            this.method1715(-105, (byte)-61);
         }

         ++field2822;
         if (this.field2823 != null) {
            arg0 = (int)((long)this.field2821 * (long)arg0 / (long)this.field2820) + 6;
         }

         return arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2826[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(B)V"
   )
   public static final void method1714(byte arg0) {
      boolean var1 = client.field10022;

      try {
         ++field2817;
         class408 var2 = class745.field10605.field3719;
         int var3 = var2.method685(-2);
         class22.field325 = var2.method693((byte)114);
         boolean var4 = var2.method693((byte)114) == 1;
         if (arg0 < -48) {
            int var5 = var2.method697(2);
            int var6 = var2.method693((byte)114);
            class204.method1770(-102);
            class69.method729(var6, (byte)53);
            var2.method3190((byte)113);
            int var7 = 0;
            int var8;
            int var11;
            int var12;
            int var13;
            int var14;
            int var15;
            int var10000;
            int var16;
            int var17;
            int var18;
            int var19;
            int var20;
            int var21;
            if (var1) {
               var8 = 0;
            } else if (var7 >= 4) {
               var2.method3192((byte)59);
               var8 = (class745.field10605.field3721 - var2.field945) / 16;
               class701.field10107 = new int[var8][4];
               var11 = 0;
               if (!var1) {
                  label275: {
                     if (var1) {
                        var12 = 0;
                        if (var1) {
                           class701.field10107[var11][var12] = var2.method701(255);
                           ++var12;
                        }
                     } else {
                        if (~var8 >= ~var11) {
                           class626.field8942 = new int[var8];
                           class387.field5648 = null;
                           class251.field3825 = new int[var8];
                           class277.field4198 = new byte[var8][];
                           class460.field6709 = new int[var8];
                           class16.field220 = new byte[var8][];
                           class65.field897 = new int[var8];
                           class168.field2520 = new byte[var8][];
                           class320.field4776 = null;
                           class282.field4260 = new int[var8];
                           class51.field762 = new byte[var8][];
                           var8 = 0;
                           var12 = 0;
                           if (!var1) {
                              break label275;
                           }
                        } else {
                           var12 = 0;
                        }

                        if (var1) {
                           class701.field10107[var11][var12] = var2.method701(255);
                           ++var12;
                        }
                     }

                     while(true) {
                        while(var12 < 4) {
                           class701.field10107[var11][var12] = var2.method701(255);
                           ++var12;
                        }

                        if (!var1) {
                           ++var11;
                           if (~var8 >= ~var11) {
                              class626.field8942 = new int[var8];
                              class387.field5648 = null;
                              class251.field3825 = new int[var8];
                              class277.field4198 = new byte[var8][];
                              class460.field6709 = new int[var8];
                              class16.field220 = new byte[var8][];
                              class65.field897 = new int[var8];
                              class168.field2520 = new byte[var8][];
                              class320.field4776 = null;
                              class282.field4260 = new int[var8];
                              class51.field762 = new byte[var8][];
                              var8 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class701.field10107[var11][var12] = var2.method701(255);
                              ++var12;
                           }
                        } else {
                           ++var12;
                        }
                     }
                  }

                  if (var1) {
                     var10000 = 0;
                  } else if (~var12 <= -5) {
                     var10000 = var3;
                     if (!var1) {
                        class240.method2107(var3, 12, var4, var5, (byte)65);
                        return;
                     }
                  } else {
                     var10000 = 0;
                  }

                  while(true) {
                     var13 = var10000;
                     if (var1 || class234.field3626 >> 3 > var13) {
                        do {
                           var14 = 0;
                           if (var1 || var14 < class209.field2989 >> 3) {
                              label375:
                              do {
                                 var15 = class479.field6893[var12][var13][var14];
                                 if (var15 == -1) {
                                    ++var14;
                                 } else {
                                    var16 = var15 >> 14 & 1023;
                                    var17 = (var15 & 16378) >> 3;
                                    var18 = (var16 / 8 << 8) + var17 / 8;
                                    var19 = 0;
                                    if (var1) {
                                       var10000 = class460.field6709[var19];
                                    } else if (var8 <= var19) {
                                       var10000 = ~var18;
                                       if (!var1) {
                                          if (var10000 != 0) {
                                             class460.field6709[var8] = var18;
                                             var20 = var18 >> 8 & 255;
                                             var21 = 255 & var18;
                                             class626.field8942[var8] = class488.field6962.method443("m" + var20 + "_" + var21, 16);
                                             class282.field4260[var8] = class488.field6962.method443("l" + var20 + "_" + var21, 16);
                                             class65.field897[var8] = class488.field6962.method443(field2826[1] + var20 + "_" + var21, 16);
                                             class251.field3825[var8] = class488.field6962.method443(field2826[0] + var20 + "_" + var21, 16);
                                             ++var8;
                                          }

                                          ++var14;
                                          continue;
                                       }
                                    } else {
                                       var10000 = class460.field6709[var19];
                                    }

                                    do {
                                       while(true) {
                                          if (var10000 == var18) {
                                             var18 = -1;
                                             if (!var1) {
                                                var10000 = ~var18;
                                                break;
                                             }

                                             ++var19;
                                          } else {
                                             ++var19;
                                          }

                                          if (var8 <= var19) {
                                             var10000 = ~var18;
                                             if (!var1) {
                                                if (var10000 != 0) {
                                                   class460.field6709[var8] = var18;
                                                   var20 = var18 >> 8 & 255;
                                                   var21 = 255 & var18;
                                                   class626.field8942[var8] = class488.field6962.method443("m" + var20 + "_" + var21, 16);
                                                   class282.field4260[var8] = class488.field6962.method443("l" + var20 + "_" + var21, 16);
                                                   class65.field897[var8] = class488.field6962.method443(field2826[1] + var20 + "_" + var21, 16);
                                                   class251.field3825[var8] = class488.field6962.method443(field2826[0] + var20 + "_" + var21, 16);
                                                   ++var8;
                                                }

                                                ++var14;
                                                continue label375;
                                             }
                                          } else {
                                             var10000 = class460.field6709[var19];
                                          }
                                       }
                                    } while(var1);

                                    if (var10000 != 0) {
                                       class460.field6709[var8] = var18;
                                       var20 = var18 >> 8 & 255;
                                       var21 = 255 & var18;
                                       class626.field8942[var8] = class488.field6962.method443("m" + var20 + "_" + var21, 16);
                                       class282.field4260[var8] = class488.field6962.method443("l" + var20 + "_" + var21, 16);
                                       class65.field897[var8] = class488.field6962.method443(field2826[1] + var20 + "_" + var21, 16);
                                       class251.field3825[var8] = class488.field6962.method443(field2826[0] + var20 + "_" + var21, 16);
                                       ++var8;
                                    }

                                    ++var14;
                                 }
                              } while(var14 < class209.field2989 >> 3);
                           }

                           ++var13;
                        } while(class234.field3626 >> 3 > var13);
                     }

                     ++var12;
                     if (~var12 <= -5) {
                        var10000 = var3;
                        if (!var1) {
                           class240.method2107(var3, 12, var4, var5, (byte)65);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }
                  }
               }
            } else {
               var8 = 0;
            }

            while(true) {
               label510: {
                  int var9;
                  int var10;
                  if (var1) {
                     var9 = 0;
                     if (var1) {
                        var10 = var2.method3195(113, 1);
                        if (~var10 == -2) {
                           class479.field6893[var7][var8][var9] = var2.method3195(118, 26);
                           if (var1) {
                              class479.field6893[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class479.field6893[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }
                  } else {
                     if (~(class234.field3626 >> 3) >= ~var8) {
                        break label510;
                     }

                     var9 = 0;
                     if (var1) {
                        var10 = var2.method3195(113, 1);
                        if (~var10 == -2) {
                           class479.field6893[var7][var8][var9] = var2.method3195(118, 26);
                           if (var1) {
                              class479.field6893[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class479.field6893[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }
                  }

                  while(true) {
                     while(class209.field2989 >> 3 > var9) {
                        var10 = var2.method3195(113, 1);
                        if (~var10 == -2) {
                           class479.field6893[var7][var8][var9] = var2.method3195(118, 26);
                           if (var1) {
                              class479.field6893[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class479.field6893[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }

                     ++var8;
                     if (~(class234.field3626 >> 3) >= ~var8) {
                        break;
                     }

                     var9 = 0;
                     if (var1) {
                        var10 = var2.method3195(113, 1);
                        if (~var10 == -2) {
                           class479.field6893[var7][var8][var9] = var2.method3195(118, 26);
                           if (var1) {
                              class479.field6893[var7][var8][var9] = -1;
                              ++var9;
                           } else {
                              ++var9;
                           }
                        } else {
                           class479.field6893[var7][var8][var9] = -1;
                           ++var9;
                        }
                     }
                  }
               }

               ++var7;
               if (var7 >= 4) {
                  var2.method3192((byte)59);
                  var8 = (class745.field10605.field3721 - var2.field945) / 16;
                  class701.field10107 = new int[var8][4];
                  var11 = 0;
                  if (!var1) {
                     label119: {
                        if (var1) {
                           var12 = 0;
                           if (var1) {
                              class701.field10107[var11][var12] = var2.method701(255);
                              ++var12;
                           }
                        } else {
                           if (~var8 >= ~var11) {
                              class626.field8942 = new int[var8];
                              class387.field5648 = null;
                              class251.field3825 = new int[var8];
                              class277.field4198 = new byte[var8][];
                              class460.field6709 = new int[var8];
                              class16.field220 = new byte[var8][];
                              class65.field897 = new int[var8];
                              class168.field2520 = new byte[var8][];
                              class320.field4776 = null;
                              class282.field4260 = new int[var8];
                              class51.field762 = new byte[var8][];
                              var8 = 0;
                              var12 = 0;
                              if (!var1) {
                                 break label119;
                              }
                           } else {
                              var12 = 0;
                           }

                           if (var1) {
                              class701.field10107[var11][var12] = var2.method701(255);
                              ++var12;
                           }
                        }

                        while(true) {
                           while(var12 < 4) {
                              class701.field10107[var11][var12] = var2.method701(255);
                              ++var12;
                           }

                           if (!var1) {
                              ++var11;
                              if (~var8 >= ~var11) {
                                 class626.field8942 = new int[var8];
                                 class387.field5648 = null;
                                 class251.field3825 = new int[var8];
                                 class277.field4198 = new byte[var8][];
                                 class460.field6709 = new int[var8];
                                 class16.field220 = new byte[var8][];
                                 class65.field897 = new int[var8];
                                 class168.field2520 = new byte[var8][];
                                 class320.field4776 = null;
                                 class282.field4260 = new int[var8];
                                 class51.field762 = new byte[var8][];
                                 var8 = 0;
                                 var12 = 0;
                                 if (!var1) {
                                    break;
                                 }
                              } else {
                                 var12 = 0;
                              }

                              if (var1) {
                                 class701.field10107[var11][var12] = var2.method701(255);
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        }
                     }

                     if (var1) {
                        var10000 = 0;
                     } else if (~var12 <= -5) {
                        var10000 = var3;
                        if (!var1) {
                           class240.method2107(var3, 12, var4, var5, (byte)65);
                           return;
                        }
                     } else {
                        var10000 = 0;
                     }

                     while(true) {
                        var13 = var10000;
                        if (var1 || class234.field3626 >> 3 > var13) {
                           do {
                              var14 = 0;
                              if (var1 || var14 < class209.field2989 >> 3) {
                                 label201:
                                 do {
                                    var15 = class479.field6893[var12][var13][var14];
                                    if (var15 == -1) {
                                       ++var14;
                                    } else {
                                       var16 = var15 >> 14 & 1023;
                                       var17 = (var15 & 16378) >> 3;
                                       var18 = (var16 / 8 << 8) + var17 / 8;
                                       var19 = 0;
                                       if (var1) {
                                          var10000 = class460.field6709[var19];
                                       } else if (var8 <= var19) {
                                          var10000 = ~var18;
                                          if (!var1) {
                                             if (var10000 != 0) {
                                                class460.field6709[var8] = var18;
                                                var20 = var18 >> 8 & 255;
                                                var21 = 255 & var18;
                                                class626.field8942[var8] = class488.field6962.method443("m" + var20 + "_" + var21, 16);
                                                class282.field4260[var8] = class488.field6962.method443("l" + var20 + "_" + var21, 16);
                                                class65.field897[var8] = class488.field6962.method443(field2826[1] + var20 + "_" + var21, 16);
                                                class251.field3825[var8] = class488.field6962.method443(field2826[0] + var20 + "_" + var21, 16);
                                                ++var8;
                                             }

                                             ++var14;
                                             continue;
                                          }
                                       } else {
                                          var10000 = class460.field6709[var19];
                                       }

                                       do {
                                          while(true) {
                                             if (var10000 == var18) {
                                                var18 = -1;
                                                if (!var1) {
                                                   var10000 = ~var18;
                                                   break;
                                                }

                                                ++var19;
                                             } else {
                                                ++var19;
                                             }

                                             if (var8 <= var19) {
                                                var10000 = ~var18;
                                                if (!var1) {
                                                   if (var10000 != 0) {
                                                      class460.field6709[var8] = var18;
                                                      var20 = var18 >> 8 & 255;
                                                      var21 = 255 & var18;
                                                      class626.field8942[var8] = class488.field6962.method443("m" + var20 + "_" + var21, 16);
                                                      class282.field4260[var8] = class488.field6962.method443("l" + var20 + "_" + var21, 16);
                                                      class65.field897[var8] = class488.field6962.method443(field2826[1] + var20 + "_" + var21, 16);
                                                      class251.field3825[var8] = class488.field6962.method443(field2826[0] + var20 + "_" + var21, 16);
                                                      ++var8;
                                                   }

                                                   ++var14;
                                                   continue label201;
                                                }
                                             } else {
                                                var10000 = class460.field6709[var19];
                                             }
                                          }
                                       } while(var1);

                                       if (var10000 != 0) {
                                          class460.field6709[var8] = var18;
                                          var20 = var18 >> 8 & 255;
                                          var21 = 255 & var18;
                                          class626.field8942[var8] = class488.field6962.method443("m" + var20 + "_" + var21, 16);
                                          class282.field4260[var8] = class488.field6962.method443("l" + var20 + "_" + var21, 16);
                                          class65.field897[var8] = class488.field6962.method443(field2826[1] + var20 + "_" + var21, 16);
                                          class251.field3825[var8] = class488.field6962.method443(field2826[0] + var20 + "_" + var21, 16);
                                          ++var8;
                                       }

                                       ++var14;
                                    }
                                 } while(var14 < class209.field2989 >> 3);
                              }

                              ++var13;
                           } while(class234.field3626 >> 3 > var13);
                        }

                        ++var12;
                        if (~var12 <= -5) {
                           var10000 = var3;
                           if (!var1) {
                              class240.method2107(var3, 12, var4, var5, (byte)65);
                              return;
                           }
                        } else {
                           var10000 = 0;
                        }
                     }
                  }
               } else {
                  var8 = 0;
               }
            }
         }
      } catch (RuntimeException var23) {
         throw class612.method4503(var23, field2826[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(IB)I"
   )
   public final int method1715(int arg0, byte arg1) {
      try {
         if (this.field2823 != null) {
            arg0 = (int)((long)this.field2821 * (long)arg0 / (long)this.field2820);
         }

         ++field2816;
         return arg1 > -81 ? 116 : arg0;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field2826[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(I[B)[B"
   )
   public final byte[] method1716(int arg0, byte[] arg1) {
      boolean var3 = client.field10022;

      try {
         if (arg0 != -12904) {
            this.field2821 = -18;
         }

         if (this.field2823 != null) {
            int var4;
            int[] var5;
            int var9;
            label102: {
               var4 = (int)((long)arg1.length * (long)this.field2821 / (long)this.field2820) + 14;
               var5 = new int[var4];
               int var6 = 0;
               int var7 = 0;
               int var8 = 0;
               if (var3) {
                  var9 = arg1[var8];
               } else if (~arg1.length >= ~var8) {
                  arg1 = new byte[var4];
                  var9 = 0;
                  if (!var3) {
                     break label102;
                  }
               } else {
                  var9 = arg1[var8];
               }

               label101:
               while(true) {
                  int[] var10 = this.field2823[var7];
                  int var11 = 0;
                  if (var3) {
                     var5[var6 + var11] += var10[var11] * var9;
                     ++var11;
                  }

                  while(true) {
                     while(var11 < 14) {
                        var5[var6 + var11] += var10[var11] * var9;
                        ++var11;
                     }

                     int var12 = this.field2821 + var7;
                     int var13 = var12 / this.field2820;
                     var6 += var13;
                     var7 = var12 - this.field2820 * var13;
                     if (!var3) {
                        ++var8;
                        if (~arg1.length >= ~var8) {
                           arg1 = new byte[var4];
                           var9 = 0;
                           if (!var3) {
                              break label101;
                           }
                        } else {
                           var9 = arg1[var8];
                        }
                        break;
                     }

                     ++var11;
                  }
               }
            }

            if (var3 || var9 < var4) {
               do {
                  int var14 = var5[var9] - -32768 >> 16;
                  if (~var14 > 127) {
                     arg1[var9] = -128;
                     if (!var3) {
                        ++var9;
                        continue;
                     }
                  }

                  if (~var14 >= -128) {
                     arg1[var9] = (byte)var14;
                     if (var3) {
                        arg1[var9] = 127;
                        ++var9;
                     } else {
                        ++var9;
                     }
                  } else {
                     arg1[var9] = 127;
                     ++var9;
                  }
               } while(var9 < var4);
            }
         }

         ++field2825;
         return arg1;
      } catch (RuntimeException var16) {
         throw class612.method4503(var16, field2826[10] + arg0 + ',' + (arg1 != null ? field2826[5] : field2826[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "<init>",
      descriptor = "(II)V"
   )
   public class195(int arg0, int arg1) {
      boolean var3 = client.field10022;
      super();

      try {
         if (~arg0 != ~arg1) {
            int var4 = class527.method3951(arg1, -19, arg0);
            int var22 = arg1 / var4;
            int var21 = arg0 / var4;
            this.field2823 = new int[var21][14];
            this.field2821 = var22;
            this.field2820 = var21;
            int var5 = 0;
            if (var3 || var5 < var21) {
               do {
                  int[] var6 = this.field2823[var5];
                  double var7 = (double)var5 / (double)var21 + 6.0D;
                  int var9 = (int)Math.floor(var7 + -7.0D + 1.0D);
                  if (var9 < 0) {
                     var9 = 0;
                  }

                  int var10 = (int)Math.ceil(var7 + 7.0D);
                  if (~var10 < -15) {
                     var10 = 14;
                  }

                  double var11 = (double)var22 / (double)var21;
                  if (var3 || var9 < var10) {
                     do {
                        double var13 = ((double)var9 + -var7) * 3.141592653589793D;
                        double var15 = var11;
                        if (var13 < -1.0E-4D || var13 > 1.0E-4D) {
                           var15 = var11 * (Math.sin(var13) / var13);
                        }

                        double var17 = var15 * (0.54D + 0.46D * Math.cos(((double)var9 + -var7) * 0.2243994752564138D));
                        var6[var9] = (int)Math.floor(var17 * 65536.0D + 0.5D);
                        ++var9;
                     } while(var9 < var10);
                  }

                  ++var5;
               } while(var5 < var21);

            }
         }
      } catch (RuntimeException var20) {
         throw class612.method4503(var20, field2826[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method1717(int arg0) {
      try {
         if (arg0 != 25526) {
            method1717(39);
         }

         field2819 = null;
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field2826[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1718(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 20);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!we",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1719(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 104;
            break;
         case 1:
            var10005 = 85;
            break;
         case 2:
            var10005 = 124;
            break;
         case 3:
            var10005 = 24;
            break;
         default:
            var10005 = 20;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
