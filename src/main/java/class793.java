import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wia")
public class class793 {
   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11618 = new String[]{method5719(method5718("U2\n}(\n")), method5719(method5718("p\u0018Qs")), method5719(method5718("U2\n})\n")), method5719(method5718("U2\n}+\n"))};
   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "Leg;"
   )
   public static class118 field11616 = new class118(84, 9);
   @OriginalMember(
      owner = "client!wia",
      name = "c",
      descriptor = "I"
   )
   public static int field11615;
   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "I"
   )
   public static int field11617;

   @OriginalMember(
      owner = "client!wia",
      name = "b",
      descriptor = "(I)V",
      line = 3
   )
   public static void method5715(int arg0) {
      try {
         if (arg0 != 4) {
            field11616 = null;
         }

         field11616 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11618[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "c",
      descriptor = "(I)V",
      line = 17
   )
   public static final void method5716(int arg0) {
      boolean var1 = client.field4360;

      try {
         ++field11615;
         if (class300.field4107.field6413.method3360(109) == 2) {
            byte var2 = (byte)(class154.field2197 - 4 & 255);
            int var3 = class154.field2197 % class644.field9403;
            if (arg0 >= -57) {
               field11616 = null;
            }

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
                  class706.field10315[var4][var3][var5] = var2;
                  ++var5;
               }
            } else {
               if (~var4 <= -5) {
                  var10000 = class561.field8019;
                  if (!var1) {
                     if (var10000 == 3) {
                        return;
                     }

                     var6 = 0;
                     if (var1) {
                        class115.field1427[var6] = -1000000;
                        class18.field206[var6] = 1000000;
                        class457.field6526[var6] = 0;
                        class336.field4576[var6] = 1000000;
                        class441.field6283[var6] = 0;
                        ++var6;
                     }

                     while(true) {
                        while(var6 < 2) {
                           class115.field1427[var6] = -1000000;
                           class18.field206[var6] = 1000000;
                           class457.field6526[var6] = 0;
                           class336.field4576[var6] = 1000000;
                           class441.field6283[var6] = 0;
                           ++var6;
                        }

                        var7 = class564.field8045.field10694;
                        var8 = class564.field8045.field10693;
                        if (!var1) {
                           if (class380.field5481 != 1 && class744.field10854 == -1) {
                              var19 = class102.method851(class561.field8019, (byte)127, class224.field3188, class782.field11465);
                              if (var19 - class421.field6021 < 3200 && ~(class613.field9016[class561.field8019][class224.field3188 >> 9][class782.field11465 >> 9] & 4) != -1) {
                                 class135.method1071(class782.field11465 >> 9, false, class224.field3188 >> 9, 1, class663.field9659, (byte)11);
                                 return;
                              }
                           } else {
                              if (class380.field5481 != 1) {
                                 var7 = class744.field10854;
                                 var8 = class25.field376;
                              }

                              if (~(4 & class613.field9016[class561.field8019][var7 >> 9][var8 >> 9]) != -1) {
                                 class135.method1071(var8 >> 9, false, var7 >> 9, 0, class663.field9659, (byte)11);
                              }

                              if (class207.field2966 < 2560) {
                                 label350: {
                                    var9 = class224.field3188 >> 9;
                                    var10 = class782.field11465 >> 9;
                                    var11 = var7 >> 9;
                                    var12 = var8 >> 9;
                                    if (~var9 > ~var11) {
                                       var13 = var11 - var9;
                                       if (!var1) {
                                          break label350;
                                       }
                                    }

                                    var13 = var9 - var11;
                                 }

                                 label360: {
                                    if (~var12 >= ~var10) {
                                       var14 = var10 - var12;
                                       if (!var1) {
                                          break label360;
                                       }
                                    }

                                    var14 = -var10 + var12;
                                 }

                                 if ((var13 != 0 || ~var14 != -1) && ~(-class644.field9403) > ~var13 && ~var13 > ~class644.field9403 && var14 > -class337.field4594 && var14 < class337.field4594) {
                                    if (var14 < var13) {
                                       var17 = var14 * 65536 / var13;
                                       var18 = 32768;
                                       if (var1) {
                                          var10000 = ~var11;
                                          var10001 = ~var9;
                                       } else {
                                          if (~var9 == ~var11) {
                                             return;
                                          }

                                          var10000 = ~var11;
                                          var10001 = ~var9;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var10000 >= var10001) {
                                                if (~var9 < ~var11) {
                                                   --var9;
                                                   if (var1) {
                                                      ++var9;
                                                   }
                                                }
                                             } else {
                                                ++var9;
                                             }

                                             if ((4 & class613.field9016[class561.field8019][var9][var10]) != 0) {
                                                class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                                return;
                                             }

                                             var18 += var17;
                                             if (~var18 > -65537) {
                                                break;
                                             }

                                             var10000 = ~var12;
                                             var10001 = ~var10;
                                             if (!var1) {
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

                                                var18 -= 65536;
                                                if ((4 & class613.field9016[class561.field8019][var9][var10]) != 0) {
                                                   class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                                   return;
                                                }
                                                break;
                                             }
                                          }

                                          if (~var9 == ~var11) {
                                             return;
                                          }

                                          var10000 = ~var11;
                                          var10001 = ~var9;
                                       }
                                    }

                                    var15 = var13 * 65536 / var14;
                                    var16 = 32768;
                                    if (var1) {
                                       var10000 = var10;
                                       var10001 = var12;
                                    } else {
                                       if (~var10 == ~var12) {
                                          return;
                                       }

                                       var10000 = var10;
                                       var10001 = var12;
                                    }

                                    while(true) {
                                       while(true) {
                                          if (var10000 < var10001) {
                                             ++var10;
                                             if (var1 && ~var10 < ~var12) {
                                                --var10;
                                             }
                                          } else if (~var10 < ~var12) {
                                             --var10;
                                          }

                                          if (~(4 & class613.field9016[class561.field8019][var9][var10]) != -1) {
                                             class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                             return;
                                          }

                                          var16 += var15;
                                          if (~var16 > -65537) {
                                             break;
                                          }

                                          var10000 = var11;
                                          var10001 = var9;
                                          if (!var1) {
                                             if (var11 > var9) {
                                                ++var9;
                                                if (var1 && ~var11 > ~var9) {
                                                   --var9;
                                                }
                                             } else if (~var11 > ~var9) {
                                                --var9;
                                             }

                                             var16 -= 65536;
                                             if ((4 & class613.field9016[class561.field8019][var9][var10]) != 0) {
                                                class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                                return;
                                             }
                                             break;
                                          }
                                       }

                                       if (~var10 == ~var12) {
                                          return;
                                       }

                                       var10000 = var10;
                                       var10001 = var12;
                                    }
                                 }

                                 class668.method4876(-98, field11618[1] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class672.field9740 + "," + class533.field7595, (Throwable)null);
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
                  class706.field10315[var4][var3][var5] = var2;
                  ++var5;
               }
            }

            while(true) {
               while(~class337.field4594 < ~var5) {
                  class706.field10315[var4][var3][var5] = var2;
                  ++var5;
               }

               if (!var1) {
                  ++var4;
                  if (~var4 <= -5) {
                     var10000 = class561.field8019;
                     if (!var1) {
                        if (var10000 == 3) {
                           return;
                        }

                        var6 = 0;
                        if (var1) {
                           class115.field1427[var6] = -1000000;
                           class18.field206[var6] = 1000000;
                           class457.field6526[var6] = 0;
                           class336.field4576[var6] = 1000000;
                           class441.field6283[var6] = 0;
                           ++var6;
                        }

                        while(true) {
                           while(var6 < 2) {
                              class115.field1427[var6] = -1000000;
                              class18.field206[var6] = 1000000;
                              class457.field6526[var6] = 0;
                              class336.field4576[var6] = 1000000;
                              class441.field6283[var6] = 0;
                              ++var6;
                           }

                           var7 = class564.field8045.field10694;
                           var8 = class564.field8045.field10693;
                           if (!var1) {
                              if (class380.field5481 != 1 && class744.field10854 == -1) {
                                 var19 = class102.method851(class561.field8019, (byte)127, class224.field3188, class782.field11465);
                                 if (var19 - class421.field6021 < 3200 && ~(class613.field9016[class561.field8019][class224.field3188 >> 9][class782.field11465 >> 9] & 4) != -1) {
                                    class135.method1071(class782.field11465 >> 9, false, class224.field3188 >> 9, 1, class663.field9659, (byte)11);
                                    return;
                                 }
                              } else {
                                 if (class380.field5481 != 1) {
                                    var7 = class744.field10854;
                                    var8 = class25.field376;
                                 }

                                 if (~(4 & class613.field9016[class561.field8019][var7 >> 9][var8 >> 9]) != -1) {
                                    class135.method1071(var8 >> 9, false, var7 >> 9, 0, class663.field9659, (byte)11);
                                 }

                                 if (class207.field2966 < 2560) {
                                    label216: {
                                       var9 = class224.field3188 >> 9;
                                       var10 = class782.field11465 >> 9;
                                       var11 = var7 >> 9;
                                       var12 = var8 >> 9;
                                       if (~var9 > ~var11) {
                                          var13 = var11 - var9;
                                          if (!var1) {
                                             break label216;
                                          }
                                       }

                                       var13 = var9 - var11;
                                    }

                                    label211: {
                                       if (~var12 >= ~var10) {
                                          var14 = var10 - var12;
                                          if (!var1) {
                                             break label211;
                                          }
                                       }

                                       var14 = -var10 + var12;
                                    }

                                    if ((var13 != 0 || ~var14 != -1) && ~(-class644.field9403) > ~var13 && ~var13 > ~class644.field9403 && var14 > -class337.field4594 && var14 < class337.field4594) {
                                       if (var14 < var13) {
                                          var17 = var14 * 65536 / var13;
                                          var18 = 32768;
                                          if (var1) {
                                             var10000 = ~var11;
                                             var10001 = ~var9;
                                          } else {
                                             if (~var9 == ~var11) {
                                                return;
                                             }

                                             var10000 = ~var11;
                                             var10001 = ~var9;
                                          }

                                          while(true) {
                                             while(true) {
                                                if (var10000 >= var10001) {
                                                   if (~var9 < ~var11) {
                                                      --var9;
                                                      if (var1) {
                                                         ++var9;
                                                      }
                                                   }
                                                } else {
                                                   ++var9;
                                                }

                                                if ((4 & class613.field9016[class561.field8019][var9][var10]) != 0) {
                                                   class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                                   return;
                                                }

                                                var18 += var17;
                                                if (~var18 > -65537) {
                                                   break;
                                                }

                                                var10000 = ~var12;
                                                var10001 = ~var10;
                                                if (!var1) {
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

                                                   var18 -= 65536;
                                                   if ((4 & class613.field9016[class561.field8019][var9][var10]) != 0) {
                                                      class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                                      return;
                                                   }
                                                   break;
                                                }
                                             }

                                             if (~var9 == ~var11) {
                                                return;
                                             }

                                             var10000 = ~var11;
                                             var10001 = ~var9;
                                          }
                                       }

                                       var15 = var13 * 65536 / var14;
                                       var16 = 32768;
                                       if (var1) {
                                          var10000 = var10;
                                          var10001 = var12;
                                       } else {
                                          if (~var10 == ~var12) {
                                             return;
                                          }

                                          var10000 = var10;
                                          var10001 = var12;
                                       }

                                       while(true) {
                                          while(true) {
                                             if (var10000 < var10001) {
                                                ++var10;
                                                if (var1 && ~var10 < ~var12) {
                                                   --var10;
                                                }
                                             } else if (~var10 < ~var12) {
                                                --var10;
                                             }

                                             if (~(4 & class613.field9016[class561.field8019][var9][var10]) != -1) {
                                                class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                                return;
                                             }

                                             var16 += var15;
                                             if (~var16 > -65537) {
                                                break;
                                             }

                                             var10000 = var11;
                                             var10001 = var9;
                                             if (!var1) {
                                                if (var11 > var9) {
                                                   ++var9;
                                                   if (var1 && ~var11 > ~var9) {
                                                      --var9;
                                                   }
                                                } else if (~var11 > ~var9) {
                                                   --var9;
                                                }

                                                var16 -= 65536;
                                                if ((4 & class613.field9016[class561.field8019][var9][var10]) != 0) {
                                                   class135.method1071(var10, false, var9, 1, class663.field9659, (byte)11);
                                                   return;
                                                }
                                                break;
                                             }
                                          }

                                          if (~var10 == ~var12) {
                                             return;
                                          }

                                          var10000 = var10;
                                          var10001 = var12;
                                       }
                                    }

                                    class668.method4876(-98, field11618[1] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class672.field9740 + "," + class533.field7595, (Throwable)null);
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
                     class706.field10315[var4][var3][var5] = var2;
                     ++var5;
                  }
               } else {
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field11618[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "a",
      descriptor = "(I)V",
      line = 220
   )
   public static final void method5717(int arg0) {
      try {
         ++field11617;
         int var1 = 0;
         if (class300.field4107.field6431.method824(95) == 1) {
            int var2 = var1 | 1;
            int var3 = var2 | 16;
            int var4 = var3 | 32;
            int var5 = var4 | 2;
            var1 = var5 | 4;
         }

         if (class300.field4107.field6434.method1454(-56) == 0) {
            var1 |= 64;
         }

         class718.method5218(-90, var1);
         class387.field5618.method3984(var1, (byte)-123);
         if (arg0 != 5539) {
            field11616 = null;
         }

         class468.field6728.method2262(false, var1);
         class195.field2761.method1735(-4874, var1);
         class478.field6875.method1950(-101, var1);
         class494.method3585(var1, (byte)-62);
         class611.method4444(var1, (byte)122);
         class609.method4433(var1, 0);
         class238.method1831(var1, false);
         class606.method4412(-9114);
      } catch (RuntimeException var7) {
         throw class237.method1823(var7, field11618[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5718(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 106);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wia",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5719(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 34;
            break;
         case 1:
            var10005 = 91;
            break;
         case 2:
            var10005 = 107;
            break;
         case 3:
            var10005 = 83;
            break;
         default:
            var10005 = 106;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
