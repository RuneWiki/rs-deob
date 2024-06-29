import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lha")
public class class691 extends class67 {
   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field10268 = new String[]{method5093(method5092("~\fLGS:")), method5093(method5092("~\fLGP:")), method5093(method5092("~\fLGR:")), method5093(method5092("~\fLGQ:")), method5093(method5092("~\fLGU:")), method5093(method5092("~\fLGT:")), method5093(method5092("@'\u0017I")), method5093(method5092("~\fLGV:")), method5093(method5092("~\fLG_:"))};
   @OriginalMember(
      owner = "client!lha",
      name = "v",
      descriptor = "Luk;"
   )
   public static class498 field10256 = new class498(78, 7);
   @OriginalMember(
      owner = "client!lha",
      name = "r",
      descriptor = "Lgv;"
   )
   public static class12 field10260 = new class12(method5093(method5092("[*y+RF%")), method5093(method5092("}\u0002K\u0000tw")), method5093(method5092("M\rC\u001duw\u0010L")), 6);
   @OriginalMember(
      owner = "client!lha",
      name = "n",
      descriptor = "I"
   )
   public static int field10257;
   @OriginalMember(
      owner = "client!lha",
      name = "t",
      descriptor = "I"
   )
   public static int field10258;
   @OriginalMember(
      owner = "client!lha",
      name = "m",
      descriptor = "I"
   )
   public static int field10259;
   @OriginalMember(
      owner = "client!lha",
      name = "q",
      descriptor = "I"
   )
   public static int field10261;
   @OriginalMember(
      owner = "client!lha",
      name = "l",
      descriptor = "I"
   )
   public static int field10262;
   @OriginalMember(
      owner = "client!lha",
      name = "p",
      descriptor = "I"
   )
   public static int field10263;
   @OriginalMember(
      owner = "client!lha",
      name = "o",
      descriptor = "I"
   )
   public static int field10265;
   @OriginalMember(
      owner = "client!lha",
      name = "k",
      descriptor = "I"
   )
   public static int field10266;
   @OriginalMember(
      owner = "client!lha",
      name = "s",
      descriptor = "I"
   )
   public static int field10267;
   @OriginalMember(
      owner = "client!lha",
      name = "u",
      descriptor = "Lkf;"
   )
   public static class401 field10264;

   @OriginalMember(
      owner = "client!lha",
      name = "d",
      descriptor = "(I)V",
      line = 4
   )
   public static void method5088(int arg0) {
      try {
         field10264 = null;
         field10260 = null;
         field10256 = null;
         if (arg0 != 512) {
            method5088(-16);
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field10268[3] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "c",
      descriptor = "(I)V",
      line = 16
   )
   public static final void method5089(int arg0) {
      boolean var1 = client.field1786;

      try {
         ++field10265;
         if (class687.field10213.field501.method5090(480102311) == 2) {
            byte var2 = (byte)(255 & class801.field11657 + -4);
            int var3 = class801.field11657 % class513.field7828;
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
            int var10001;
            int var17;
            int var18;
            int var19;
            if (var1) {
               var5 = 0;
               if (var1) {
                  class303.field4736[var4][var3][var5] = var2;
                  ++var5;
               }
            } else {
               if (~var4 <= -5) {
                  var10000 = ~class464.field7054;
                  if (!var1) {
                     if (var10000 == -4) {
                        return;
                     }

                     var6 = 0;
                     if (var1) {
                        class525.field8007[var6] = -1000000;
                        class547.field8201[var6] = 1000000;
                        class305.field4774[var6] = 0;
                        class33.field412[var6] = 1000000;
                        class666.field9972[var6] = 0;
                        ++var6;
                     }

                     while(true) {
                        while(var6 < 2) {
                           class525.field8007[var6] = -1000000;
                           class547.field8201[var6] = 1000000;
                           class305.field4774[var6] = 0;
                           class33.field412[var6] = 1000000;
                           class666.field9972[var6] = 0;
                           ++var6;
                        }

                        var7 = class476.field7251.field1505;
                        var8 = class476.field7251.field1494;
                        if (!var1) {
                           if (class648.field9340 != 1 && ~class697.field10346 == 0) {
                              var19 = class477.method3711(class464.field7054, class401.field6288, (byte)0, field10259);
                              if (~(-class653.field9780 + var19) > -3201 && ~(class757.field11211[class464.field7054][class401.field6288 >> 9][field10259 >> 9] & 4) != -1) {
                                 class481.method3733(false, 1, false, field10259 >> 9, class711.field10694, class401.field6288 >> 9);
                              }
                           } else {
                              if (~class648.field9340 != -2) {
                                 var8 = class572.field8464;
                                 var7 = class697.field10346;
                              }

                              if (~(4 & class757.field11211[class464.field7054][var7 >> 9][var8 >> 9]) != -1) {
                                 class481.method3733(false, 0, false, var8 >> 9, class711.field10694, var7 >> 9);
                              }

                              if (class703.field10589 < 2560) {
                                 label806: {
                                    label460: {
                                       var9 = class401.field6288 >> 9;
                                       var10 = field10259 >> 9;
                                       var11 = var7 >> 9;
                                       var12 = var8 >> 9;
                                       if (~var9 <= ~var11) {
                                          var13 = -var11 + var9;
                                          if (!var1) {
                                             break label460;
                                          }
                                       }

                                       var13 = var11 - var9;
                                    }

                                    label470: {
                                       if (~var12 < ~var10) {
                                          var14 = var12 - var10;
                                          if (!var1) {
                                             break label470;
                                          }
                                       }

                                       var14 = -var12 + var10;
                                    }

                                    if (~var13 == -1 && ~var14 == -1 || ~var13 >= ~(-class513.field7828) || ~var13 <= ~class513.field7828 || ~(-class475.field7230) <= ~var14 || ~var14 <= ~class475.field7230) {
                                       class281.method2349(1, field10268[6] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class120.field1694 + "," + class119.field1606, (Throwable)null);
                                       return;
                                    }

                                    if (~var13 < ~var14) {
                                       label508: {
                                          var15 = var14 * 65536 / var13;
                                          var16 = 32768;
                                          if (var1) {
                                             var10000 = var11;
                                             var10001 = var9;
                                          } else {
                                             if (var9 == var11) {
                                                break label508;
                                             }

                                             var10000 = var11;
                                             var10001 = var9;
                                          }

                                          while(true) {
                                             while(true) {
                                                if (var10000 > var10001) {
                                                   ++var9;
                                                   if (var1 && var9 > var11) {
                                                      --var9;
                                                   }
                                                } else if (var9 > var11) {
                                                   --var9;
                                                }

                                                if (~(4 & class757.field11211[class464.field7054][var9][var10]) != -1) {
                                                   class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                   if (!var1) {
                                                      break label806;
                                                   }
                                                }

                                                var16 += var15;
                                                if (~var16 > -65537) {
                                                   break;
                                                }

                                                var10000 = var10;
                                                var10001 = var12;
                                                if (!var1) {
                                                   if (var10 >= var12) {
                                                      if (var10 > var12) {
                                                         --var10;
                                                         if (var1) {
                                                            ++var10;
                                                         }
                                                      }
                                                   } else {
                                                      ++var10;
                                                   }

                                                   var16 -= 65536;
                                                   if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                                      class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                      if (!var1) {
                                                         break label806;
                                                      }
                                                   }
                                                   break;
                                                }
                                             }

                                             if (var9 == var11) {
                                                break;
                                             }

                                             var10000 = var11;
                                             var10001 = var9;
                                          }
                                       }

                                       if (!var1) {
                                          break label806;
                                       }
                                    }

                                    var17 = var13 * 65536 / var14;
                                    var18 = 32768;
                                    if (var1) {
                                       if (var10 < var12) {
                                          ++var10;
                                          if (var1 && ~var10 < ~var12) {
                                             --var10;
                                          }
                                       } else if (~var10 < ~var12) {
                                          --var10;
                                       }

                                       if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                          class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                          if (!var1) {
                                             break label806;
                                          }
                                       }
                                    } else {
                                       if (~var10 == ~var12) {
                                          if (!var1) {
                                             break label806;
                                          }

                                          var19 = class477.method3711(class464.field7054, class401.field6288, (byte)0, field10259);
                                          if (~(-class653.field9780 + var19) > -3201 && ~(class757.field11211[class464.field7054][class401.field6288 >> 9][field10259 >> 9] & 4) != -1) {
                                             class481.method3733(false, 1, false, field10259 >> 9, class711.field10694, class401.field6288 >> 9);
                                          }
                                          break label806;
                                       }

                                       if (var10 < var12) {
                                          ++var10;
                                          if (var1 && ~var10 < ~var12) {
                                             --var10;
                                          }
                                       } else if (~var10 < ~var12) {
                                          --var10;
                                       }

                                       if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                          class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                          if (!var1) {
                                             break label806;
                                          }
                                       }
                                    }

                                    label585:
                                    while(true) {
                                       while(true) {
                                          var18 += var17;
                                          if (var18 >= 65536) {
                                             var10000 = ~var9;
                                             var10001 = ~var11;
                                             if (var1) {
                                                if (var10000 < var10001) {
                                                   ++var10;
                                                   if (var1 && ~var10 < ~var12) {
                                                      --var10;
                                                   }
                                                } else if (~var10 < ~var12) {
                                                   --var10;
                                                }

                                                if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                                   class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                   if (!var1) {
                                                      break label585;
                                                   }
                                                }
                                                continue;
                                             }

                                             if (var10000 <= var10001) {
                                                if (var9 > var11) {
                                                   --var9;
                                                   if (var1) {
                                                      ++var9;
                                                   }
                                                }
                                             } else {
                                                ++var9;
                                             }

                                             var18 -= 65536;
                                             if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                                class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                if (!var1) {
                                                   break label585;
                                                }
                                             }
                                          }

                                          if (~var10 == ~var12) {
                                             if (!var1) {
                                                break label585;
                                             }

                                             var19 = class477.method3711(class464.field7054, class401.field6288, (byte)0, field10259);
                                             if (~(-class653.field9780 + var19) > -3201 && ~(class757.field11211[class464.field7054][class401.field6288 >> 9][field10259 >> 9] & 4) != -1) {
                                                class481.method3733(false, 1, false, field10259 >> 9, class711.field10694, class401.field6288 >> 9);
                                             }
                                             break label585;
                                          }

                                          if (var10 < var12) {
                                             ++var10;
                                             if (var1 && ~var10 < ~var12) {
                                                --var10;
                                             }
                                          } else if (~var10 < ~var12) {
                                             --var10;
                                          }

                                          if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                             class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                             if (!var1) {
                                                break label585;
                                             }
                                          }
                                       }
                                    }
                                 }
                              }
                           }

                           if (arg0 != 16218) {
                              field10260 = null;
                              return;
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
                  class303.field4736[var4][var3][var5] = var2;
                  ++var5;
               }
            }

            while(true) {
               while(var5 < class475.field7230) {
                  class303.field4736[var4][var3][var5] = var2;
                  ++var5;
               }

               if (!var1) {
                  ++var4;
                  if (~var4 <= -5) {
                     var10000 = ~class464.field7054;
                     if (!var1) {
                        if (var10000 == -4) {
                           return;
                        }

                        var6 = 0;
                        if (var1) {
                           class525.field8007[var6] = -1000000;
                           class547.field8201[var6] = 1000000;
                           class305.field4774[var6] = 0;
                           class33.field412[var6] = 1000000;
                           class666.field9972[var6] = 0;
                           ++var6;
                        }

                        while(true) {
                           while(var6 < 2) {
                              class525.field8007[var6] = -1000000;
                              class547.field8201[var6] = 1000000;
                              class305.field4774[var6] = 0;
                              class33.field412[var6] = 1000000;
                              class666.field9972[var6] = 0;
                              ++var6;
                           }

                           var7 = class476.field7251.field1505;
                           var8 = class476.field7251.field1494;
                           if (!var1) {
                              if (class648.field9340 != 1 && ~class697.field10346 == 0) {
                                 var19 = class477.method3711(class464.field7054, class401.field6288, (byte)0, field10259);
                                 if (~(-class653.field9780 + var19) > -3201 && ~(class757.field11211[class464.field7054][class401.field6288 >> 9][field10259 >> 9] & 4) != -1) {
                                    class481.method3733(false, 1, false, field10259 >> 9, class711.field10694, class401.field6288 >> 9);
                                 }
                              } else {
                                 if (~class648.field9340 != -2) {
                                    var8 = class572.field8464;
                                    var7 = class697.field10346;
                                 }

                                 if (~(4 & class757.field11211[class464.field7054][var7 >> 9][var8 >> 9]) != -1) {
                                    class481.method3733(false, 0, false, var8 >> 9, class711.field10694, var7 >> 9);
                                 }

                                 if (class703.field10589 < 2560) {
                                    label808: {
                                       label326: {
                                          var9 = class401.field6288 >> 9;
                                          var10 = field10259 >> 9;
                                          var11 = var7 >> 9;
                                          var12 = var8 >> 9;
                                          if (~var9 <= ~var11) {
                                             var13 = -var11 + var9;
                                             if (!var1) {
                                                break label326;
                                             }
                                          }

                                          var13 = var11 - var9;
                                       }

                                       label321: {
                                          if (~var12 < ~var10) {
                                             var14 = var12 - var10;
                                             if (!var1) {
                                                break label321;
                                             }
                                          }

                                          var14 = -var12 + var10;
                                       }

                                       if (~var13 == -1 && ~var14 == -1 || ~var13 >= ~(-class513.field7828) || ~var13 <= ~class513.field7828 || ~(-class475.field7230) <= ~var14 || ~var14 <= ~class475.field7230) {
                                          class281.method2349(1, field10268[6] + var9 + "," + var10 + " " + var11 + "," + var12 + " " + class120.field1694 + "," + class119.field1606, (Throwable)null);
                                          return;
                                       }

                                       if (~var13 < ~var14) {
                                          label192: {
                                             var15 = var14 * 65536 / var13;
                                             var16 = 32768;
                                             if (var1) {
                                                var10000 = var11;
                                                var10001 = var9;
                                             } else {
                                                if (var9 == var11) {
                                                   break label192;
                                                }

                                                var10000 = var11;
                                                var10001 = var9;
                                             }

                                             while(true) {
                                                while(true) {
                                                   if (var10000 > var10001) {
                                                      ++var9;
                                                      if (var1 && var9 > var11) {
                                                         --var9;
                                                      }
                                                   } else if (var9 > var11) {
                                                      --var9;
                                                   }

                                                   if (~(4 & class757.field11211[class464.field7054][var9][var10]) != -1) {
                                                      class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                      if (!var1) {
                                                         break label808;
                                                      }
                                                   }

                                                   var16 += var15;
                                                   if (~var16 > -65537) {
                                                      break;
                                                   }

                                                   var10000 = var10;
                                                   var10001 = var12;
                                                   if (!var1) {
                                                      if (var10 >= var12) {
                                                         if (var10 > var12) {
                                                            --var10;
                                                            if (var1) {
                                                               ++var10;
                                                            }
                                                         }
                                                      } else {
                                                         ++var10;
                                                      }

                                                      var16 -= 65536;
                                                      if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                                         class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                         if (!var1) {
                                                            break label808;
                                                         }
                                                      }
                                                      break;
                                                   }
                                                }

                                                if (var9 == var11) {
                                                   break;
                                                }

                                                var10000 = var11;
                                                var10001 = var9;
                                             }
                                          }

                                          if (!var1) {
                                             break label808;
                                          }
                                       }

                                       var17 = var13 * 65536 / var14;
                                       var18 = 32768;
                                       if (var1) {
                                          if (var10 < var12) {
                                             ++var10;
                                             if (var1 && ~var10 < ~var12) {
                                                --var10;
                                             }
                                          } else if (~var10 < ~var12) {
                                             --var10;
                                          }

                                          if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                             class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                             if (!var1) {
                                                break label808;
                                             }
                                          }
                                       } else {
                                          if (~var10 == ~var12) {
                                             if (!var1) {
                                                break label808;
                                             }

                                             var19 = class477.method3711(class464.field7054, class401.field6288, (byte)0, field10259);
                                             if (~(-class653.field9780 + var19) > -3201 && ~(class757.field11211[class464.field7054][class401.field6288 >> 9][field10259 >> 9] & 4) != -1) {
                                                class481.method3733(false, 1, false, field10259 >> 9, class711.field10694, class401.field6288 >> 9);
                                             }
                                             break label808;
                                          }

                                          if (var10 < var12) {
                                             ++var10;
                                             if (var1 && ~var10 < ~var12) {
                                                --var10;
                                             }
                                          } else if (~var10 < ~var12) {
                                             --var10;
                                          }

                                          if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                             class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                             if (!var1) {
                                                break label808;
                                             }
                                          }
                                       }

                                       label313:
                                       while(true) {
                                          while(true) {
                                             var18 += var17;
                                             if (var18 >= 65536) {
                                                var10000 = ~var9;
                                                var10001 = ~var11;
                                                if (var1) {
                                                   if (var10000 < var10001) {
                                                      ++var10;
                                                      if (var1 && ~var10 < ~var12) {
                                                         --var10;
                                                      }
                                                   } else if (~var10 < ~var12) {
                                                      --var10;
                                                   }

                                                   if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                                      class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                      if (!var1) {
                                                         break label313;
                                                      }
                                                   }
                                                   continue;
                                                }

                                                if (var10000 <= var10001) {
                                                   if (var9 > var11) {
                                                      --var9;
                                                      if (var1) {
                                                         ++var9;
                                                      }
                                                   }
                                                } else {
                                                   ++var9;
                                                }

                                                var18 -= 65536;
                                                if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                                   class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                   if (!var1) {
                                                      break label313;
                                                   }
                                                }
                                             }

                                             if (~var10 == ~var12) {
                                                if (!var1) {
                                                   break label313;
                                                }

                                                var19 = class477.method3711(class464.field7054, class401.field6288, (byte)0, field10259);
                                                if (~(-class653.field9780 + var19) > -3201 && ~(class757.field11211[class464.field7054][class401.field6288 >> 9][field10259 >> 9] & 4) != -1) {
                                                   class481.method3733(false, 1, false, field10259 >> 9, class711.field10694, class401.field6288 >> 9);
                                                }
                                                break label313;
                                             }

                                             if (var10 < var12) {
                                                ++var10;
                                                if (var1 && ~var10 < ~var12) {
                                                   --var10;
                                                }
                                             } else if (~var10 < ~var12) {
                                                --var10;
                                             }

                                             if ((class757.field11211[class464.field7054][var9][var10] & 4) != 0) {
                                                class481.method3733(false, 1, false, var10, class711.field10694, var9);
                                                if (!var1) {
                                                   break label313;
                                                }
                                             }
                                          }
                                       }
                                    }
                                 }
                              }

                              if (arg0 != 16218) {
                                 field10260 = null;
                                 return;
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
                     class303.field4736[var4][var3][var5] = var2;
                     ++var5;
                  }
               } else {
                  ++var5;
               }
            }
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field10268[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "b",
      descriptor = "(I)I",
      line = 219
   )
   public final int method162(int arg0) {
      try {
         if (arg0 != 0) {
            field10259 = -124;
         }

         ++field10263;
         return 2;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10268[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(II)I",
      line = 231
   )
   public final int method161(int arg0, int arg1) {
      try {
         if (arg1 >= -74) {
            return -9;
         } else {
            ++field10266;
            return 1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10268[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(B)V",
      line = 246
   )
   public final void method158(byte arg0) {
      try {
         ++field10267;
         if (super.field881.field512.method5525((byte)5) && super.field877 == 2) {
            super.field877 = 1;
         }

         if (~super.field877 > -1 || super.field877 > 2) {
            super.field877 = this.method162(0);
         }

         if (arg0 != -69) {
            field10260 = null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10268[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "<init>",
      descriptor = "(Lmp;)V",
      line = 266
   )
   public class691(class41 arg0) {
      super(arg0);
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(IZ)V",
      line = 272
   )
   public final void method165(int arg0, boolean arg1) {
      try {
         ++field10257;
         super.field877 = arg0;
         if (!arg1) {
            this.method165(83, false);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field10268[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "e",
      descriptor = "(I)I",
      line = 286
   )
   public final int method5090(int arg0) {
      try {
         ++field10258;
         if (arg0 != 480102311) {
            method5088(-94);
         }

         return super.field877;
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field10268[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "a",
      descriptor = "(IIIZI)V",
      line = 298
   )
   public static final void method5091(int arg0, int arg1, int arg2, boolean arg3, int arg4) {
      boolean var5 = client.field1786;

      try {
         ++field10262;
         class168 var6 = (class168)class327.field4982.method4972((byte)-84);
         if (var5) {
            class92.method929(arg4, var6, 0, arg1, arg2, arg0);
            var6 = (class168)class327.field4982.method4975((byte)91);
         }

         while(true) {
            while(var6 != null) {
               class92.method929(arg4, var6, 0, arg1, arg2, arg0);
               var6 = (class168)class327.field4982.method4975((byte)91);
            }

            class168 var7 = (class168)class497.field7567.method4972((byte)-84);
            if (!var5) {
               class168 var14;
               byte var10000;
               label180: {
                  if (var5) {
                     var10000 = 1;
                  } else if (var7 == null) {
                     var14 = (class168)class211.field3195.method3139(-30);
                     var10000 = arg3;
                     if (!var5) {
                        break label180;
                     }
                  } else {
                     var10000 = 1;
                  }

                  while(true) {
                     byte var8 = var10000;
                     class228 var9 = var7.field2562.method1089(true);
                     int var10 = var7.field2562.field1616.method2995((byte)104);
                     if (var10 != -1) {
                        if (!var7.field2562.field1656) {
                           label152: {
                              if (~var9.field3515 != ~var10 && var9.field3495 != var10 && var9.field3509 != var10 && var9.field3488 != var10) {
                                 if (var9.field3505 != var10 && ~var9.field3481 != ~var10 && ~var9.field3460 != ~var10 && ~var9.field3478 != ~var10) {
                                    break label152;
                                 }

                                 var8 = 3;
                                 if (!var5) {
                                    break label152;
                                 }
                              }

                              var8 = 2;
                              if (var5) {
                                 var8 = 0;
                              }
                           }
                        } else {
                           var8 = 0;
                        }
                     } else {
                        var8 = 0;
                     }

                     if (~var7.field2556 != ~var8) {
                        label278: {
                           int var11 = class281.method2352(0, var7.field2562);
                           class344 var12 = var7.field2562.field7072;
                           if (var12.field5221 != null) {
                              var12 = var12.method2782((byte)-123, class45.field599);
                           }

                           if (var12 == null || var11 == -1) {
                              var7.field2556 = var8;
                              var7.field2552 = false;
                              var7.field2549 = -1;
                              if (!var5) {
                                 break label278;
                              }
                           }

                           if (var7.field2549 == var11 && !var7.field2552 != var12.field5231) {
                              var7.field2553 = var12.field5257;
                              var7.field2556 = var8;
                              if (!var5) {
                                 break label278;
                              }
                           }

                           boolean var13;
                           label169: {
                              var13 = false;
                              if (var7.field2557 == null) {
                                 var13 = true;
                                 if (!var5) {
                                    break label169;
                                 }
                              }

                              var7.field2553 -= 512;
                              if (~var7.field2553 >= -1) {
                                 class426.field6579.method4704(var7.field2557);
                                 var13 = true;
                                 var7.field2557 = null;
                              }
                           }

                           if (var13) {
                              var7.field2548 = null;
                              var7.field2549 = var11;
                              var7.field2553 = var12.field5257;
                              var7.field2551 = null;
                              var7.field2556 = var8;
                              var7.field2552 = var12.field5231;
                           }
                        }
                     }

                     var7.field2576 = var7.field2562.field1505;
                     var7.field2559 = var7.field2562.field1505 - -(var7.field2562.method61((byte)70) << 8);
                     var7.field2566 = var7.field2562.field1494;
                     var7.field2547 = var7.field2562.field1494 - -(var7.field2562.method61((byte)70) << 8);
                     class92.method929(arg4, var7, 0, arg1, arg2, arg0);
                     var7 = (class168)class497.field7567.method4975((byte)122);
                     if (var7 == null) {
                        var14 = (class168)class211.field3195.method3139(-30);
                        var10000 = arg3;
                        if (!var5) {
                           break;
                        }
                     } else {
                        var10000 = 1;
                     }
                  }
               }

               if (var10000 != 1) {
                  method5089(5);
                  if (!var5 && var14 == null) {
                     return;
                  }
               } else if (var14 == null) {
                  return;
               }

               do {
                  byte var15 = 1;
                  class228 var16 = var14.field2555.method1089(true);
                  int var17 = var14.field2555.field1616.method2995((byte)104);
                  if (~var17 != 0) {
                     if (var14.field2555.field1656) {
                        var15 = 0;
                     } else {
                        label279: {
                           if (var16.field3515 == var17 || var16.field3495 == var17 || var16.field3509 == var17 || var16.field3488 == var17) {
                              var15 = 2;
                              if (!var5) {
                                 break label279;
                              }
                           }

                           if (var16.field3505 == var17 || var16.field3481 == var17 || ~var16.field3460 == ~var17 || var16.field3478 == var17) {
                              var15 = 3;
                              if (var5) {
                                 var15 = 0;
                              }
                           }
                        }
                     }
                  } else {
                     var15 = 0;
                  }

                  if (~var14.field2556 != ~var15) {
                     label271: {
                        int var18 = class437.method3439(var14.field2555, -1);
                        if (~var14.field2549 == ~var18 && !var14.field2552 == !var14.field2555.field104) {
                           var14.field2556 = var15;
                           var14.field2553 = var14.field2555.field117;
                           if (!var5) {
                              break label271;
                           }
                        }

                        boolean var19;
                        label230: {
                           var19 = false;
                           if (var14.field2557 == null) {
                              var19 = true;
                              if (!var5) {
                                 break label230;
                              }
                           }

                           var14.field2553 -= 512;
                           if (~var14.field2553 >= -1) {
                              class426.field6579.method4704(var14.field2557);
                              var14.field2557 = null;
                              var19 = true;
                           }
                        }

                        if (var19) {
                           var14.field2551 = null;
                           var14.field2553 = var14.field2555.field117;
                           var14.field2556 = var15;
                           var14.field2552 = var14.field2555.field104;
                           var14.field2548 = null;
                           var14.field2549 = var18;
                        }
                     }
                  }

                  var14.field2576 = var14.field2555.field1505;
                  var14.field2559 = var14.field2555.field1505 + (var14.field2555.method61((byte)70) << 8);
                  var14.field2566 = var14.field2555.field1494;
                  var14.field2547 = var14.field2555.field1494 - -(var14.field2555.method61((byte)70) << 8);
                  class92.method929(arg4, var14, 0, arg1, arg2, arg0);
                  var14 = (class168)class211.field3195.method3147(-21068);
               } while(var14 != null);

               return;
            }

            var6 = (class168)class327.field4982.method4975((byte)91);
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field10268[0] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lha",
      name = "<init>",
      descriptor = "(ILmp;)V",
      line = 477
   )
   public class691(int arg0, class41 arg1) {
      super(arg0, arg1);
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5092(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 23);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5093(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 18;
            break;
         case 1:
            var10005 = 100;
            break;
         case 2:
            var10005 = 45;
            break;
         case 3:
            var10005 = 105;
            break;
         default:
            var10005 = 23;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
