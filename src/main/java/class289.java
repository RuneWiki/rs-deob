import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!up")
public class class289 {
   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field4057 = new String[]{method2202(method2201(",u\u0013.\u0006")), method2202(method2201(",u\u0013-\u0006")), method2202(method2201("\u000bF\u0007L")), method2202(method2201(",u\u0013/\u0006"))};
   @OriginalMember(
      owner = "client!up",
      name = "g",
      descriptor = "[Ljava/lang/String;"
   )
   public static String[] field4050 = new String[100];
   @OriginalMember(
      owner = "client!up",
      name = "d",
      descriptor = "I"
   )
   public static int field4052 = 0;
   @OriginalMember(
      owner = "client!up",
      name = "c",
      descriptor = "[F"
   )
   public static float[] field4055 = new float[]{1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F, 0.0F, 0.0F, 1.0F};
   @OriginalMember(
      owner = "client!up",
      name = "b",
      descriptor = "Lqo;"
   )
   public static class24 field4054 = new class24(method2202(method2201(">dP\t\u001a")), method2202(method2201("\u001edP\t\u000em")), 3);
   @OriginalMember(
      owner = "client!up",
      name = "f",
      descriptor = "F"
   )
   public static float field4056;
   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "I"
   )
   public static int field4049;
   @OriginalMember(
      owner = "client!up",
      name = "h",
      descriptor = "I"
   )
   public static int field4051;
   @OriginalMember(
      owner = "client!up",
      name = "e",
      descriptor = "I"
   )
   public static int field4053;

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(B)V",
      line = 14
   )
   public static void method2198(byte arg0) {
      try {
         field4055 = null;
         field4054 = null;
         field4050 = null;
         if (arg0 != -125) {
            method2199(false);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field4057[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(Z)V",
      line = 29
   )
   public static final void method2199(boolean arg0) {
      int var1 = client.field4530;

      try {
         ++field4049;
         if (class261.field3566.field9442.method1403(113) == 2) {
            byte var2 = (byte)(255 & class213.field2703 + -4);
            int var3 = class213.field2703 % class323.field4603;
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
            if (var1 != 0) {
               var5 = 0;
               if (var1 != 0) {
                  class393.field5962[var4][var3][var5] = var2;
                  ++var5;
               }
            } else {
               if (var4 >= 4) {
                  var10000 = ~class551.field8158;
                  if (var1 == 0) {
                     if (var10000 == -4) {
                        return;
                     }

                     if (arg0) {
                        return;
                     }

                     var6 = 0;
                     if (var1 != 0) {
                        class748.field11096[var6] = -1000000;
                        class507.field7489[var6] = 1000000;
                        class36.field394[var6] = 0;
                        class115.field1383[var6] = 1000000;
                        class465.field6982[var6] = 0;
                        ++var6;
                     }

                     while(true) {
                        while(var6 < 2) {
                           class748.field11096[var6] = -1000000;
                           class507.field7489[var6] = 1000000;
                           class36.field394[var6] = 0;
                           class115.field1383[var6] = 1000000;
                           class465.field6982[var6] = 0;
                           ++var6;
                        }

                        var7 = class693.field10418.field9003;
                        var8 = class693.field10418.field9007;
                        if (var1 == 0) {
                           if (~class675.field10142 != -2 && ~class57.field717 == 0) {
                              var19 = class368.method2858(class232.field2947, (byte)-11, class731.field10844, class551.field8158);
                              if (~(-class733.field10871 + var19) > -3201 && (class65.field797[class551.field8158][class731.field10844 >> 9][class232.field2947 >> 9] & 4) != 0) {
                                 class704.method5120(class353.field5360, true, false, class232.field2947 >> 9, 1, class731.field10844 >> 9);
                                 return;
                              }
                           } else {
                              if (~class675.field10142 != -2) {
                                 var8 = class387.field5919;
                                 var7 = class57.field717;
                              }

                              if ((4 & class65.field797[class551.field8158][var7 >> 9][var8 >> 9]) != 0) {
                                 class704.method5120(class353.field5360, true, false, var8 >> 9, 0, var7 >> 9);
                              }

                              if (~class713.field10637 > -2561) {
                                 label367: {
                                    var9 = class731.field10844 >> 9;
                                    var10 = class232.field2947 >> 9;
                                    var11 = var7 >> 9;
                                    var12 = var8 >> 9;
                                    if (~var9 > ~var11) {
                                       var13 = -var9 + var11;
                                       if (var1 == 0) {
                                          break label367;
                                       }
                                    }

                                    var13 = var9 - var11;
                                 }

                                 label377: {
                                    if (~var12 >= ~var10) {
                                       var14 = -var12 + var10;
                                       if (var1 == 0) {
                                          break label377;
                                       }
                                    }

                                    var14 = -var10 + var12;
                                 }

                                 if ((~var13 != -1 || ~var14 != -1) && var13 > -class323.field4603 && ~var13 > ~class323.field4603 && -class178.field2197 < var14 && var14 < class178.field2197) {
                                    if (~var14 <= ~var13) {
                                       var17 = var13 * 65536 / var14;
                                       var18 = 32768;
                                       if (var1 != 0) {
                                          var10000 = ~var10;
                                          var10001 = ~var12;
                                       } else {
                                          if (~var10 == ~var12) {
                                             return;
                                          }

                                          var10000 = ~var10;
                                          var10001 = ~var12;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var10000 > var10001) {
                                                ++var10;
                                                if (var1 != 0 && var12 < var10) {
                                                   --var10;
                                                }
                                             } else if (var12 < var10) {
                                                --var10;
                                             }

                                             if ((class65.field797[class551.field8158][var9][var10] & 4) != 0) {
                                                class704.method5120(class353.field5360, true, false, var10, 1, var9);
                                                return;
                                             }

                                             var18 += var17;
                                             if (~var18 > -65537) {
                                                break;
                                             }

                                             var10000 = ~var9;
                                             var10001 = ~var11;
                                             if (var1 == 0) {
                                                if (var10000 <= var10001) {
                                                   if (~var9 < ~var11) {
                                                      --var9;
                                                      if (var1 != 0) {
                                                         ++var9;
                                                      }
                                                   }
                                                } else {
                                                   ++var9;
                                                }

                                                var18 -= 65536;
                                                if ((class65.field797[class551.field8158][var9][var10] & 4) != 0) {
                                                   class704.method5120(class353.field5360, !arg0, false, var10, 1, var9);
                                                   return;
                                                }
                                                break;
                                             }
                                          }

                                          if (~var10 == ~var12) {
                                             return;
                                          }

                                          var10000 = ~var10;
                                          var10001 = ~var12;
                                       }
                                    }

                                    var15 = var14 * 65536 / var13;
                                    var16 = 32768;
                                    if (var1 != 0) {
                                       var10000 = ~var11;
                                       var10001 = ~var9;
                                    } else {
                                       if (var9 == var11) {
                                          return;
                                       }

                                       var10000 = ~var11;
                                       var10001 = ~var9;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (var10000 >= var10001) {
                                             if (var11 < var9) {
                                                --var9;
                                                if (var1 != 0) {
                                                   ++var9;
                                                }
                                             }
                                          } else {
                                             ++var9;
                                          }

                                          if (~(class65.field797[class551.field8158][var9][var10] & 4) != -1) {
                                             class704.method5120(class353.field5360, !arg0, false, var10, 1, var9);
                                             return;
                                          }

                                          var16 += var15;
                                          if (var16 < 65536) {
                                             break;
                                          }

                                          var10000 = var12;
                                          var10001 = var10;
                                          if (var1 == 0) {
                                             if (var12 <= var10) {
                                                if (~var10 < ~var12) {
                                                   --var10;
                                                   if (var1 != 0) {
                                                      ++var10;
                                                   }
                                                }
                                             } else {
                                                ++var10;
                                             }

                                             var16 -= 65536;
                                             if (~(class65.field797[class551.field8158][var9][var10] & 4) != -1) {
                                                class704.method5120(class353.field5360, true, false, var10, 1, var9);
                                                return;
                                             }
                                             break;
                                          }
                                       }

                                       if (var9 == var11) {
                                          return;
                                       }

                                       var10000 = ~var11;
                                       var10001 = ~var9;
                                    }
                                 }

                                 class238.method1776(-15, (Throwable)null, field4057[2] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class718.field10676 + "," + class669.field10064);
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
               if (var1 != 0) {
                  class393.field5962[var4][var3][var5] = var2;
                  ++var5;
               }
            }

            while(true) {
               while(class178.field2197 > var5) {
                  class393.field5962[var4][var3][var5] = var2;
                  ++var5;
               }

               if (var1 == 0) {
                  ++var4;
                  if (var4 >= 4) {
                     var10000 = ~class551.field8158;
                     if (var1 == 0) {
                        if (var10000 == -4) {
                           return;
                        }

                        if (arg0) {
                           return;
                        }

                        var6 = 0;
                        if (var1 != 0) {
                           class748.field11096[var6] = -1000000;
                           class507.field7489[var6] = 1000000;
                           class36.field394[var6] = 0;
                           class115.field1383[var6] = 1000000;
                           class465.field6982[var6] = 0;
                           ++var6;
                        }

                        while(true) {
                           while(var6 < 2) {
                              class748.field11096[var6] = -1000000;
                              class507.field7489[var6] = 1000000;
                              class36.field394[var6] = 0;
                              class115.field1383[var6] = 1000000;
                              class465.field6982[var6] = 0;
                              ++var6;
                           }

                           var7 = class693.field10418.field9003;
                           var8 = class693.field10418.field9007;
                           if (var1 == 0) {
                              if (~class675.field10142 != -2 && ~class57.field717 == 0) {
                                 var19 = class368.method2858(class232.field2947, (byte)-11, class731.field10844, class551.field8158);
                                 if (~(-class733.field10871 + var19) > -3201 && (class65.field797[class551.field8158][class731.field10844 >> 9][class232.field2947 >> 9] & 4) != 0) {
                                    class704.method5120(class353.field5360, true, false, class232.field2947 >> 9, 1, class731.field10844 >> 9);
                                    return;
                                 }
                              } else {
                                 if (~class675.field10142 != -2) {
                                    var8 = class387.field5919;
                                    var7 = class57.field717;
                                 }

                                 if ((4 & class65.field797[class551.field8158][var7 >> 9][var8 >> 9]) != 0) {
                                    class704.method5120(class353.field5360, true, false, var8 >> 9, 0, var7 >> 9);
                                 }

                                 if (~class713.field10637 > -2561) {
                                    label225: {
                                       var9 = class731.field10844 >> 9;
                                       var10 = class232.field2947 >> 9;
                                       var11 = var7 >> 9;
                                       var12 = var8 >> 9;
                                       if (~var9 > ~var11) {
                                          var13 = -var9 + var11;
                                          if (var1 == 0) {
                                             break label225;
                                          }
                                       }

                                       var13 = var9 - var11;
                                    }

                                    label220: {
                                       if (~var12 >= ~var10) {
                                          var14 = -var12 + var10;
                                          if (var1 == 0) {
                                             break label220;
                                          }
                                       }

                                       var14 = -var10 + var12;
                                    }

                                    if ((~var13 != -1 || ~var14 != -1) && var13 > -class323.field4603 && ~var13 > ~class323.field4603 && -class178.field2197 < var14 && var14 < class178.field2197) {
                                       if (~var14 <= ~var13) {
                                          var17 = var13 * 65536 / var14;
                                          var18 = 32768;
                                          if (var1 != 0) {
                                             var10000 = ~var10;
                                             var10001 = ~var12;
                                          } else {
                                             if (~var10 == ~var12) {
                                                return;
                                             }

                                             var10000 = ~var10;
                                             var10001 = ~var12;
                                          }

                                          while(true) {
                                             while(true) {
                                                if (var10000 > var10001) {
                                                   ++var10;
                                                   if (var1 != 0 && var12 < var10) {
                                                      --var10;
                                                   }
                                                } else if (var12 < var10) {
                                                   --var10;
                                                }

                                                if ((class65.field797[class551.field8158][var9][var10] & 4) != 0) {
                                                   class704.method5120(class353.field5360, true, false, var10, 1, var9);
                                                   return;
                                                }

                                                var18 += var17;
                                                if (~var18 > -65537) {
                                                   break;
                                                }

                                                var10000 = ~var9;
                                                var10001 = ~var11;
                                                if (var1 == 0) {
                                                   if (var10000 <= var10001) {
                                                      if (~var9 < ~var11) {
                                                         --var9;
                                                         if (var1 != 0) {
                                                            ++var9;
                                                         }
                                                      }
                                                   } else {
                                                      ++var9;
                                                   }

                                                   var18 -= 65536;
                                                   if ((class65.field797[class551.field8158][var9][var10] & 4) != 0) {
                                                      class704.method5120(class353.field5360, !arg0, false, var10, 1, var9);
                                                      return;
                                                   }
                                                   break;
                                                }
                                             }

                                             if (~var10 == ~var12) {
                                                return;
                                             }

                                             var10000 = ~var10;
                                             var10001 = ~var12;
                                          }
                                       }

                                       var15 = var14 * 65536 / var13;
                                       var16 = 32768;
                                       if (var1 != 0) {
                                          var10000 = ~var11;
                                          var10001 = ~var9;
                                       } else {
                                          if (var9 == var11) {
                                             return;
                                          }

                                          var10000 = ~var11;
                                          var10001 = ~var9;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var10000 >= var10001) {
                                                if (var11 < var9) {
                                                   --var9;
                                                   if (var1 != 0) {
                                                      ++var9;
                                                   }
                                                }
                                             } else {
                                                ++var9;
                                             }

                                             if (~(class65.field797[class551.field8158][var9][var10] & 4) != -1) {
                                                class704.method5120(class353.field5360, !arg0, false, var10, 1, var9);
                                                return;
                                             }

                                             var16 += var15;
                                             if (var16 < 65536) {
                                                break;
                                             }

                                             var10000 = var12;
                                             var10001 = var10;
                                             if (var1 == 0) {
                                                if (var12 <= var10) {
                                                   if (~var10 < ~var12) {
                                                      --var10;
                                                      if (var1 != 0) {
                                                         ++var10;
                                                      }
                                                   }
                                                } else {
                                                   ++var10;
                                                }

                                                var16 -= 65536;
                                                if (~(class65.field797[class551.field8158][var9][var10] & 4) != -1) {
                                                   class704.method5120(class353.field5360, true, false, var10, 1, var9);
                                                   return;
                                                }
                                                break;
                                             }
                                          }

                                          if (var9 == var11) {
                                             return;
                                          }

                                          var10000 = ~var11;
                                          var10001 = ~var9;
                                       }
                                    }

                                    class238.method1776(-15, (Throwable)null, field4057[2] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class718.field10676 + "," + class669.field10064);
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
                  if (var1 != 0) {
                     class393.field5962[var4][var3][var5] = var2;
                     ++var5;
                  }
               } else {
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field4057[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "a",
      descriptor = "(IIZ)Ldc;",
      line = 238
   )
   public static final class5 method2200(int arg0, int arg1, boolean arg2) {
      try {
         if (arg1 != 0) {
            method2199(false);
         }

         ++field4053;
         long var3 = (long)(arg0 | (!arg2 ? 0 : Integer.MIN_VALUE));
         return (class5)class488.field7220.method5681(var3, -1);
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field4057[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2201(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 46);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!up",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2202(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 5;
            break;
         case 2:
            var10005 = 61;
            break;
         case 3:
            var10005 = 108;
            break;
         default:
            var10005 = 46;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
