import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ou")
public class class293 implements class290 {
   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4029 = new String[]{method2360(method2359("O8CD\u007f")), method2360(method2359("N8\u0001k")), method2360(method2359("[cC)*")), method2360(method2359("r\u000eW'")), method2360(method2359("O8CC\u007f")), method2360(method2359("O8CE\u007f")), method2360(method2359("O8CF\u007f"))};
   @OriginalMember(
      owner = "client!ou",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field4025 = new float[16];
   @OriginalMember(
      owner = "client!ou",
      name = "b",
      descriptor = "I"
   )
   public static int field4024;
   @OriginalMember(
      owner = "client!ou",
      name = "e",
      descriptor = "I"
   )
   public static int field4026;
   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "I"
   )
   public static int field4027;
   @OriginalMember(
      owner = "client!ou",
      name = "d",
      descriptor = "I"
   )
   public static int field4028;

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(B)V"
   )
   public static void method2356(byte arg0) {
      try {
         field4025 = null;
         if (arg0 > -3) {
            field4025 = null;
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field4029[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(Lfea;B[IJ)Ljava/lang/String;"
   )
   public final String method2347(class681 arg0, byte arg1, int[] arg2, long arg3) {
      try {
         ++field4027;
         if (arg1 >= -26) {
            method2358(-71);
         }

         if (class163.field2067 == arg0) {
            class380 var6 = class78.field1064.method4770(arg2[0], 0);
            return var6.method3018(38, (int)arg3);
         } else if (class613.field9023 != arg0 && class77.field1025 != arg0) {
            return class459.field6313 != arg0 && class649.field9692 != arg0 && class201.field2550 != arg0 ? null : class78.field1064.method4770(arg2[0], 0).method3018(96, (int)arg3);
         } else {
            class546 var7 = class166.field2126.method5576((int)arg3, (byte)-70);
            return var7.field8056;
         }
      } catch (RuntimeException var9) {
         throw class93.method866(var9, field4029[5] + (arg0 != null ? field4029[2] : field4029[1]) + ',' + arg1 + ',' + (arg2 != null ? field4029[2] : field4029[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(II[BI)[B"
   )
   public static final byte[] method2357(int arg0, int arg1, byte[] arg2, int arg3) {
      try {
         ++field4026;
         int var4 = -88 / ((arg3 - -30) / 46);
         byte[] var5 = new byte[arg1];
         class349.method2762(arg2, arg0, var5, 0, arg1);
         return var5;
      } catch (RuntimeException var7) {
         throw class93.method866(var7, field4029[0] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field4029[2] : field4029[1]) + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "a",
      descriptor = "(I)V"
   )
   public static final void method2358(int arg0) {
      boolean var1 = client.field1481;

      try {
         ++field4024;
         if (~class757.field11093.field11018.method204(-18033) == -3) {
            if (arg0 == 12790) {
               byte var2 = (byte)(255 & class188.field2389 + -4);
               int var3 = class188.field2389 % class273.field3491;
               int var4 = 0;
               int var5;
               int var6;
               int var7;
               int var8;
               int var9;
               int var10;
               int var11;
               int var12;
               int var13;
               int var14;
               int var15;
               int var10000;
               int var16;
               int var17;
               int var10001;
               int var18;
               int var19;
               if (var1) {
                  var5 = 0;
                  if (var1) {
                     class755.field11063[var4][var3][var5] = var2;
                     ++var5;
                  }
               } else {
                  if (var4 >= 4) {
                     var10000 = ~class674.field9984;
                     if (!var1) {
                        if (var10000 == -4) {
                           return;
                        }

                        var6 = 0;
                        if (var1) {
                           class156.field2019[var6] = -1000000;
                           class248.field3133[var6] = 1000000;
                           class499.field6959[var6] = 0;
                           class576.field8546[var6] = 1000000;
                           class44.field573[var6] = 0;
                           ++var6;
                        }

                        while(true) {
                           while(var6 < 2) {
                              class156.field2019[var6] = -1000000;
                              class248.field3133[var6] = 1000000;
                              class499.field6959[var6] = 0;
                              class576.field8546[var6] = 1000000;
                              class44.field573[var6] = 0;
                              ++var6;
                           }

                           var7 = class204.field2593.field10467;
                           var8 = class204.field2593.field10468;
                           if (!var1) {
                              if (class784.field11454 != 1 && class81.field1137 == -1) {
                                 var19 = class215.method1757(class160.field2051, false, class674.field9984, class168.field2195);
                                 if (var19 - class546.field8031 < 3200 && ~(class245.field3092[class674.field9984][class160.field2051 >> 9][class168.field2195 >> 9] & 4) != -1) {
                                    class278.method2196(false, 1, class160.field2051 >> 9, class168.field2195 >> 9, class548.field8080, (byte)65);
                                    return;
                                 }
                              } else {
                                 if (~class784.field11454 != -2) {
                                    var8 = class574.field8442;
                                    var7 = class81.field1137;
                                 }

                                 if ((class245.field3092[class674.field9984][var7 >> 9][var8 >> 9] & 4) != 0) {
                                    class278.method2196(false, 0, var7 >> 9, var8 >> 9, class548.field8080, (byte)87);
                                 }

                                 if (~class653.field9755 > -2561) {
                                    label344: {
                                       var9 = class160.field2051 >> 9;
                                       var10 = class168.field2195 >> 9;
                                       var11 = var7 >> 9;
                                       var12 = var8 >> 9;
                                       if (var11 <= var9) {
                                          var13 = -var11 + var9;
                                          if (!var1) {
                                             break label344;
                                          }
                                       }

                                       var13 = var11 - var9;
                                    }

                                    label354: {
                                       if (var10 >= var12) {
                                          var14 = -var12 + var10;
                                          if (!var1) {
                                             break label354;
                                          }
                                       }

                                       var14 = -var10 + var12;
                                    }

                                    if ((var13 != 0 || var14 != 0) && ~(-class273.field3491) > ~var13 && ~var13 > ~class273.field3491 && var14 > -class211.field2689 && class211.field2689 > var14) {
                                       if (var13 <= var14) {
                                          var17 = var13 * 65536 / var14;
                                          var18 = 32768;
                                          if (var1) {
                                             var10000 = var10;
                                             var10001 = var12;
                                          } else {
                                             if (var10 == var12) {
                                                return;
                                             }

                                             var10000 = var10;
                                             var10001 = var12;
                                          }

                                          while(true) {
                                             while(true) {
                                                if (var10000 >= var10001) {
                                                   if (~var12 > ~var10) {
                                                      --var10;
                                                      if (var1) {
                                                         ++var10;
                                                      }
                                                   }
                                                } else {
                                                   ++var10;
                                                }

                                                if ((class245.field3092[class674.field9984][var9][var10] & 4) != 0) {
                                                   class278.method2196(false, 1, var9, var10, class548.field8080, (byte)43);
                                                   return;
                                                }

                                                var18 += var17;
                                                if (~var18 > -65537) {
                                                   break;
                                                }

                                                var18 -= 65536;
                                                var10000 = var11;
                                                var10001 = var9;
                                                if (!var1) {
                                                   if (var11 <= var9) {
                                                      if (~var9 < ~var11) {
                                                         --var9;
                                                         if (var1) {
                                                            ++var9;
                                                         }
                                                      }
                                                   } else {
                                                      ++var9;
                                                   }

                                                   if (~(4 & class245.field3092[class674.field9984][var9][var10]) != -1) {
                                                      class278.method2196(false, 1, var9, var10, class548.field8080, (byte)73);
                                                      return;
                                                   }
                                                   break;
                                                }
                                             }

                                             if (var10 == var12) {
                                                return;
                                             }

                                             var10000 = var10;
                                             var10001 = var12;
                                          }
                                       }

                                       var15 = var14 * 65536 / var13;
                                       var16 = 32768;
                                       if (var1) {
                                          var10000 = ~var9;
                                          var10001 = ~var11;
                                       } else {
                                          if (var9 == var11) {
                                             return;
                                          }

                                          var10000 = ~var9;
                                          var10001 = ~var11;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var10000 <= var10001) {
                                                if (var11 < var9) {
                                                   --var9;
                                                   if (var1) {
                                                      ++var9;
                                                   }
                                                }
                                             } else {
                                                ++var9;
                                             }

                                             if (~(class245.field3092[class674.field9984][var9][var10] & 4) != -1) {
                                                class278.method2196(false, 1, var9, var10, class548.field8080, (byte)91);
                                                return;
                                             }

                                             var16 += var15;
                                             if (var16 < 65536) {
                                                break;
                                             }

                                             var16 -= 65536;
                                             var10000 = ~var12;
                                             var10001 = ~var10;
                                             if (!var1) {
                                                if (var10000 >= var10001) {
                                                   if (~var10 < ~var12) {
                                                      --var10;
                                                      if (var1) {
                                                         ++var10;
                                                      }
                                                   }
                                                } else {
                                                   ++var10;
                                                }

                                                if (~(4 & class245.field3092[class674.field9984][var9][var10]) != -1) {
                                                   class278.method2196(false, 1, var9, var10, class548.field8080, (byte)41);
                                                   return;
                                                }
                                                break;
                                             }
                                          }

                                          if (var9 == var11) {
                                             return;
                                          }

                                          var10000 = ~var9;
                                          var10001 = ~var11;
                                       }
                                    }

                                    class668.method4877((byte)127, (Throwable)null, field4029[3] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class539.field7889 + "," + class353.field4940);
                                    return;
                                 }
                              }

                              return;
                           }

                           ++var6;
                        }
                     }
                  } else {
                     var10000 = 0;
                  }

                  var5 = var10000;
                  if (var1) {
                     class755.field11063[var4][var3][var5] = var2;
                     ++var5;
                  }
               }

               while(true) {
                  while(class211.field2689 > var5) {
                     class755.field11063[var4][var3][var5] = var2;
                     ++var5;
                  }

                  if (!var1) {
                     ++var4;
                     if (var4 >= 4) {
                        var10000 = ~class674.field9984;
                        if (!var1) {
                           if (var10000 == -4) {
                              return;
                           }

                           var6 = 0;
                           if (var1) {
                              class156.field2019[var6] = -1000000;
                              class248.field3133[var6] = 1000000;
                              class499.field6959[var6] = 0;
                              class576.field8546[var6] = 1000000;
                              class44.field573[var6] = 0;
                              ++var6;
                           }

                           while(true) {
                              while(var6 < 2) {
                                 class156.field2019[var6] = -1000000;
                                 class248.field3133[var6] = 1000000;
                                 class499.field6959[var6] = 0;
                                 class576.field8546[var6] = 1000000;
                                 class44.field573[var6] = 0;
                                 ++var6;
                              }

                              var7 = class204.field2593.field10467;
                              var8 = class204.field2593.field10468;
                              if (!var1) {
                                 if (class784.field11454 != 1 && class81.field1137 == -1) {
                                    var19 = class215.method1757(class160.field2051, false, class674.field9984, class168.field2195);
                                    if (var19 - class546.field8031 < 3200 && ~(class245.field3092[class674.field9984][class160.field2051 >> 9][class168.field2195 >> 9] & 4) != -1) {
                                       class278.method2196(false, 1, class160.field2051 >> 9, class168.field2195 >> 9, class548.field8080, (byte)65);
                                       return;
                                    }
                                 } else {
                                    if (~class784.field11454 != -2) {
                                       var8 = class574.field8442;
                                       var7 = class81.field1137;
                                    }

                                    if ((class245.field3092[class674.field9984][var7 >> 9][var8 >> 9] & 4) != 0) {
                                       class278.method2196(false, 0, var7 >> 9, var8 >> 9, class548.field8080, (byte)87);
                                    }

                                    if (~class653.field9755 > -2561) {
                                       label210: {
                                          var9 = class160.field2051 >> 9;
                                          var10 = class168.field2195 >> 9;
                                          var11 = var7 >> 9;
                                          var12 = var8 >> 9;
                                          if (var11 <= var9) {
                                             var13 = -var11 + var9;
                                             if (!var1) {
                                                break label210;
                                             }
                                          }

                                          var13 = var11 - var9;
                                       }

                                       label205: {
                                          if (var10 >= var12) {
                                             var14 = -var12 + var10;
                                             if (!var1) {
                                                break label205;
                                             }
                                          }

                                          var14 = -var10 + var12;
                                       }

                                       if ((var13 != 0 || var14 != 0) && ~(-class273.field3491) > ~var13 && ~var13 > ~class273.field3491 && var14 > -class211.field2689 && class211.field2689 > var14) {
                                          if (var13 <= var14) {
                                             var17 = var13 * 65536 / var14;
                                             var18 = 32768;
                                             if (var1) {
                                                var10000 = var10;
                                                var10001 = var12;
                                             } else {
                                                if (var10 == var12) {
                                                   return;
                                                }

                                                var10000 = var10;
                                                var10001 = var12;
                                             }

                                             while(true) {
                                                while(true) {
                                                   if (var10000 >= var10001) {
                                                      if (~var12 > ~var10) {
                                                         --var10;
                                                         if (var1) {
                                                            ++var10;
                                                         }
                                                      }
                                                   } else {
                                                      ++var10;
                                                   }

                                                   if ((class245.field3092[class674.field9984][var9][var10] & 4) != 0) {
                                                      class278.method2196(false, 1, var9, var10, class548.field8080, (byte)43);
                                                      return;
                                                   }

                                                   var18 += var17;
                                                   if (~var18 > -65537) {
                                                      break;
                                                   }

                                                   var18 -= 65536;
                                                   var10000 = var11;
                                                   var10001 = var9;
                                                   if (!var1) {
                                                      if (var11 <= var9) {
                                                         if (~var9 < ~var11) {
                                                            --var9;
                                                            if (var1) {
                                                               ++var9;
                                                            }
                                                         }
                                                      } else {
                                                         ++var9;
                                                      }

                                                      if (~(4 & class245.field3092[class674.field9984][var9][var10]) != -1) {
                                                         class278.method2196(false, 1, var9, var10, class548.field8080, (byte)73);
                                                         return;
                                                      }
                                                      break;
                                                   }
                                                }

                                                if (var10 == var12) {
                                                   return;
                                                }

                                                var10000 = var10;
                                                var10001 = var12;
                                             }
                                          }

                                          var15 = var14 * 65536 / var13;
                                          var16 = 32768;
                                          if (var1) {
                                             var10000 = ~var9;
                                             var10001 = ~var11;
                                          } else {
                                             if (var9 == var11) {
                                                return;
                                             }

                                             var10000 = ~var9;
                                             var10001 = ~var11;
                                          }

                                          while(true) {
                                             while(true) {
                                                if (var10000 <= var10001) {
                                                   if (var11 < var9) {
                                                      --var9;
                                                      if (var1) {
                                                         ++var9;
                                                      }
                                                   }
                                                } else {
                                                   ++var9;
                                                }

                                                if (~(class245.field3092[class674.field9984][var9][var10] & 4) != -1) {
                                                   class278.method2196(false, 1, var9, var10, class548.field8080, (byte)91);
                                                   return;
                                                }

                                                var16 += var15;
                                                if (var16 < 65536) {
                                                   break;
                                                }

                                                var16 -= 65536;
                                                var10000 = ~var12;
                                                var10001 = ~var10;
                                                if (!var1) {
                                                   if (var10000 >= var10001) {
                                                      if (~var10 < ~var12) {
                                                         --var10;
                                                         if (var1) {
                                                            ++var10;
                                                         }
                                                      }
                                                   } else {
                                                      ++var10;
                                                   }

                                                   if (~(4 & class245.field3092[class674.field9984][var9][var10]) != -1) {
                                                      class278.method2196(false, 1, var9, var10, class548.field8080, (byte)41);
                                                      return;
                                                   }
                                                   break;
                                                }
                                             }

                                             if (var9 == var11) {
                                                return;
                                             }

                                             var10000 = ~var9;
                                             var10001 = ~var11;
                                          }
                                       }

                                       class668.method4877((byte)127, (Throwable)null, field4029[3] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class539.field7889 + "," + class353.field4940);
                                       return;
                                    }
                                 }

                                 return;
                              }

                              ++var6;
                           }
                        }
                     } else {
                        var10000 = 0;
                     }

                     var5 = var10000;
                     if (var1) {
                        class755.field11063[var4][var3][var5] = var2;
                        ++var5;
                     }
                  } else {
                     ++var5;
                  }
               }
            }
         }
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field4029[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2359(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ou",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2360(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 32;
            break;
         case 1:
            var10005 = 77;
            break;
         case 2:
            var10005 = 109;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
