import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!lp")
public class class416 {
   @OriginalMember(
      owner = "client!lp",
      name = "i",
      descriptor = "I"
   )
   public int field5990;
   @OriginalMember(
      owner = "client!lp",
      name = "b",
      descriptor = "I"
   )
   public int field5996;
   @OriginalMember(
      owner = "client!lp",
      name = "g",
      descriptor = "I"
   )
   public int field5989;
   @OriginalMember(
      owner = "client!lp",
      name = "j",
      descriptor = "I"
   )
   public int field5994;
   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5997 = new String[]{method3115(method3114("bN(\u0017G")), method3115(method3114("`Kj:")), method3115(method3114("bN(\u0014G")), method3115(method3114("u\u0010(x\u0012")), method3115(method3114("bN(\u0012G")), method3115(method3114("bN(\u0010G")), method3115(method3114("bN(\u0011G")), method3115(method3114("bN(\u0013G")), method3115(method3114("bN(j\u0006`WrhG")), method3115(method3114("bN(\u0015G"))};
   @OriginalMember(
      owner = "client!lp",
      name = "d",
      descriptor = "[F"
   )
   public static float[] field5986 = new float[2];
   @OriginalMember(
      owner = "client!lp",
      name = "e",
      descriptor = "Lwv;"
   )
   public static class37 field5993 = new class37(16);
   @OriginalMember(
      owner = "client!lp",
      name = "l",
      descriptor = "I"
   )
   public static int field5985;
   @OriginalMember(
      owner = "client!lp",
      name = "h",
      descriptor = "I"
   )
   public static int field5987;
   @OriginalMember(
      owner = "client!lp",
      name = "k",
      descriptor = "I"
   )
   public static int field5988;
   @OriginalMember(
      owner = "client!lp",
      name = "c",
      descriptor = "I"
   )
   public static int field5991;
   @OriginalMember(
      owner = "client!lp",
      name = "f",
      descriptor = "I"
   )
   public static int field5992;
   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "I"
   )
   public static int field5995;

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(IIIIBII)V",
      line = 8
   )
   public static final void method3107(int arg0, int arg1, int arg2, int arg3, byte arg4, int arg5, int arg6) {
      try {
         label30: {
            if (class457.field6528 > -arg2 + arg1 || ~class348.field4702 > ~(arg1 + arg2) || arg3 - arg2 < class245.field3374 || arg2 + arg3 > class699.field10237) {
               class504.method3656(14864, arg5, arg6, arg0, arg1, arg3, arg2);
               if (!client.field4360) {
                  break label30;
               }
            }

            class380.method2872(arg5, arg0, arg2, 2, arg6, arg1, arg3);
         }

         ++field5988;
         int var7 = 17 % ((32 - arg4) / 32);
      } catch (RuntimeException var9) {
         throw class237.method1823(var9, field5997[6] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(IZ)Llp;",
      line = 29
   )
   public final class416 method3108(int arg0, boolean arg1) {
      try {
         if (!arg1) {
            this.method3108(-101, false);
         }

         ++field5995;
         return new class416(this.field5990, arg0, this.field5989, this.field5994);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5997[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(Lwf;I)Lqj;",
      line = 41
   )
   public static final class538 method3109(class147 arg0, int arg1) {
      try {
         if (arg1 != 2) {
            field5986 = null;
         }

         ++field5992;
         int var2 = arg0.method1211(-26166);
         return new class538(var2);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field5997[9] + (arg0 != null ? field5997[3] : field5997[1]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(IBIII)V",
      line = 54
   )
   public static final void method3110(int arg0, byte arg1, int arg2, int arg3, int arg4) {
      boolean var5 = client.field4360;

      try {
         ++field5987;
         class460 var6 = (class460)class522.field7503.method2933(2);
         if (var5) {
            class111.method906(arg0, arg4, arg3, arg2, -371769232, var6);
            var6 = (class460)class522.field7503.method2940(false);
         }

         while(true) {
            while(var6 != null) {
               class111.method906(arg0, arg4, arg3, arg2, -371769232, var6);
               var6 = (class460)class522.field7503.method2940(false);
            }

            class460 var7 = (class460)class119.field1488.method2933(2);
            if (!var5) {
               byte var8;
               class425 var9;
               class460 var13;
               byte var14;
               class425 var15;
               byte var10000;
               int var16;
               boolean var17;
               if (var5) {
                  var8 = 1;
                  var9 = var7.field6624.method2119(false);
                  if (~var7.field6624.field3879 != 0) {
                     if (!var7.field6624.field3791) {
                        if (var7.field6624.field3879 != var9.field6066) {
                           if (~var7.field6624.field3879 != ~var9.field6095) {
                              if (~var7.field6624.field3879 != ~var9.field6093) {
                                 if (var7.field6624.field3879 != var9.field6060) {
                                    if (~var7.field6624.field3879 != ~var9.field6069) {
                                       if (var7.field6624.field3879 != var9.field6059) {
                                          if (var7.field6624.field3879 != var9.field6097) {
                                             if (~var7.field6624.field3879 == ~var9.field6074) {
                                                var8 = 3;
                                                if (var5) {
                                                   var8 = 2;
                                                   if (var5) {
                                                      var8 = 0;
                                                   }
                                                }
                                             }
                                          } else {
                                             var8 = 3;
                                             if (var5) {
                                                var8 = 2;
                                                if (var5) {
                                                   var8 = 0;
                                                }
                                             }
                                          }
                                       } else {
                                          var8 = 3;
                                          if (var5) {
                                             var8 = 2;
                                             if (var5) {
                                                var8 = 0;
                                             }
                                          }
                                       }
                                    } else {
                                       var8 = 3;
                                       if (var5) {
                                          var8 = 2;
                                          if (var5) {
                                             var8 = 0;
                                          }
                                       }
                                    }
                                 } else {
                                    var8 = 2;
                                    if (var5) {
                                       var8 = 0;
                                    }
                                 }
                              } else {
                                 var8 = 2;
                                 if (var5) {
                                    var8 = 0;
                                 }
                              }
                           } else {
                              var8 = 2;
                              if (var5) {
                                 var8 = 0;
                              }
                           }
                        } else {
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
               } else {
                  if (var7 == null) {
                     var10000 = arg1;
                     if (!var5) {
                        if (arg1 >= -117) {
                           method3110(0, (byte)-76, -60, -61, 44);
                        }

                        var13 = (class460)class9.field89.method328(1745388291);
                        if (!var5 && var13 == null) {
                           return;
                        }

                        do {
                           label655: {
                              var14 = 1;
                              var15 = var13.field6626.method2119(false);
                              if (var13.field6626.field3879 != -1 && !var13.field6626.field3791) {
                                 if (var13.field6626.field3879 == var15.field6066 || ~var13.field6626.field3879 == ~var15.field6095 || var13.field6626.field3879 == var15.field6093 || var13.field6626.field3879 == var15.field6060) {
                                    var14 = 2;
                                    if (!var5) {
                                       break label655;
                                    }
                                 }

                                 if (~var13.field6626.field3879 != ~var15.field6069 && var13.field6626.field3879 != var15.field6059 && ~var13.field6626.field3879 != ~var15.field6097 && ~var13.field6626.field3879 != ~var15.field6074) {
                                    break label655;
                                 }

                                 var14 = 3;
                                 if (!var5) {
                                    break label655;
                                 }
                              }

                              var14 = 0;
                           }

                           if (~var13.field6631 != ~var14) {
                              label858: {
                                 var16 = class566.method4032(var13.field6626, -1);
                                 if (var13.field6611 == var16 && var13.field6615 != !var13.field6626.field1551) {
                                    var13.field6607 = var13.field6626.field1553;
                                    var13.field6631 = var14;
                                    if (!var5) {
                                       break label858;
                                    }
                                 }

                                 label718: {
                                    var17 = false;
                                    if (var13.field6614 == null) {
                                       var17 = true;
                                       if (!var5) {
                                          break label718;
                                       }
                                    }

                                    var13.field6607 -= 512;
                                    if (~var13.field6607 >= -1) {
                                       class280.field3897.method4815(var13.field6614);
                                       var17 = true;
                                       var13.field6614 = null;
                                    }
                                 }

                                 if (var17) {
                                    var13.field6621 = null;
                                    var13.field6609 = null;
                                    var13.field6615 = var13.field6626.field1551;
                                    var13.field6607 = var13.field6626.field1553;
                                    var13.field6631 = var14;
                                    var13.field6611 = var16;
                                 }
                              }
                           }

                           var13.field6628 = var13.field6626.field10694;
                           var13.field6620 = var13.field6626.field10694 - -(var13.field6626.method972(-1) << 8);
                           var13.field6618 = var13.field6626.field10693;
                           var13.field6605 = var13.field6626.field10693 + (var13.field6626.method972(-1) << 8);
                           class111.method906(arg0, arg4, arg3, arg2, -371769232, var13);
                           var13 = (class460)class9.field89.method325(-4629);
                        } while(var13 != null);

                        return;
                     }
                  } else {
                     var10000 = 1;
                  }

                  var8 = var10000;
                  var9 = var7.field6624.method2119(false);
                  if (~var7.field6624.field3879 != 0) {
                     if (!var7.field6624.field3791) {
                        if (var7.field6624.field3879 != var9.field6066) {
                           if (~var7.field6624.field3879 != ~var9.field6095) {
                              if (~var7.field6624.field3879 != ~var9.field6093) {
                                 if (var7.field6624.field3879 != var9.field6060) {
                                    if (~var7.field6624.field3879 != ~var9.field6069) {
                                       if (var7.field6624.field3879 != var9.field6059) {
                                          if (var7.field6624.field3879 != var9.field6097) {
                                             if (~var7.field6624.field3879 == ~var9.field6074) {
                                                var8 = 3;
                                                if (var5) {
                                                   var8 = 2;
                                                   if (var5) {
                                                      var8 = 0;
                                                   }
                                                }
                                             }
                                          } else {
                                             var8 = 3;
                                             if (var5) {
                                                var8 = 2;
                                                if (var5) {
                                                   var8 = 0;
                                                }
                                             }
                                          }
                                       } else {
                                          var8 = 3;
                                          if (var5) {
                                             var8 = 2;
                                             if (var5) {
                                                var8 = 0;
                                             }
                                          }
                                       }
                                    } else {
                                       var8 = 3;
                                       if (var5) {
                                          var8 = 2;
                                          if (var5) {
                                             var8 = 0;
                                          }
                                       }
                                    }
                                 } else {
                                    var8 = 2;
                                    if (var5) {
                                       var8 = 0;
                                    }
                                 }
                              } else {
                                 var8 = 2;
                                 if (var5) {
                                    var8 = 0;
                                 }
                              }
                           } else {
                              var8 = 2;
                              if (var5) {
                                 var8 = 0;
                              }
                           }
                        } else {
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
               }

               while(true) {
                  if (~var7.field6631 != ~var8) {
                     int var10 = class262.method1999((byte)-89, var7.field6624);
                     class745 var11 = var7.field6624.field7333;
                     if (var11.field10912 != null) {
                        var11 = var11.method5405(class21.field248, 105);
                     }

                     boolean var12;
                     if (var11 != null) {
                        if (var10 == -1) {
                           var7.field6631 = var8;
                           var7.field6615 = false;
                           var7.field6611 = -1;
                           if (var5) {
                              if (var7.field6611 == var10) {
                                 if (!var7.field6615 == !var11.field10859) {
                                    var7.field6607 = var11.field10880;
                                    var7.field6631 = var8;
                                    if (var5) {
                                       var12 = false;
                                       if (var7.field6614 == null) {
                                          var12 = true;
                                          if (var5) {
                                             var7.field6607 -= 512;
                                             if (~var7.field6607 >= -1) {
                                                class280.field3897.method4815(var7.field6614);
                                                var12 = true;
                                                var7.field6614 = null;
                                             }
                                          }
                                       } else {
                                          var7.field6607 -= 512;
                                          if (~var7.field6607 >= -1) {
                                             class280.field3897.method4815(var7.field6614);
                                             var12 = true;
                                             var7.field6614 = null;
                                          }
                                       }

                                       if (var12) {
                                          var7.field6609 = null;
                                          var7.field6615 = var11.field10859;
                                          var7.field6631 = var8;
                                          var7.field6621 = null;
                                          var7.field6611 = var10;
                                          var7.field6607 = var11.field10880;
                                       }

                                       var7.field6628 = var7.field6624.field10694;
                                       var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                       var7.field6618 = var7.field6624.field10693;
                                       var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                       class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                       var7 = (class460)class119.field1488.method2940(false);
                                    } else {
                                       var7.field6628 = var7.field6624.field10694;
                                       var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                       var7.field6618 = var7.field6624.field10693;
                                       var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                       class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                       var7 = (class460)class119.field1488.method2940(false);
                                    }
                                 } else {
                                    var12 = false;
                                    if (var7.field6614 == null) {
                                       var12 = true;
                                       if (var5) {
                                          var7.field6607 -= 512;
                                          if (~var7.field6607 >= -1) {
                                             class280.field3897.method4815(var7.field6614);
                                             var12 = true;
                                             var7.field6614 = null;
                                          }
                                       }
                                    } else {
                                       var7.field6607 -= 512;
                                       if (~var7.field6607 >= -1) {
                                          class280.field3897.method4815(var7.field6614);
                                          var12 = true;
                                          var7.field6614 = null;
                                       }
                                    }

                                    if (var12) {
                                       var7.field6609 = null;
                                       var7.field6615 = var11.field10859;
                                       var7.field6631 = var8;
                                       var7.field6621 = null;
                                       var7.field6611 = var10;
                                       var7.field6607 = var11.field10880;
                                    }

                                    var7.field6628 = var7.field6624.field10694;
                                    var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                    var7.field6618 = var7.field6624.field10693;
                                    var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                    class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                    var7 = (class460)class119.field1488.method2940(false);
                                 }
                              } else {
                                 var12 = false;
                                 if (var7.field6614 == null) {
                                    var12 = true;
                                    if (var5) {
                                       var7.field6607 -= 512;
                                       if (~var7.field6607 >= -1) {
                                          class280.field3897.method4815(var7.field6614);
                                          var12 = true;
                                          var7.field6614 = null;
                                       }
                                    }
                                 } else {
                                    var7.field6607 -= 512;
                                    if (~var7.field6607 >= -1) {
                                       class280.field3897.method4815(var7.field6614);
                                       var12 = true;
                                       var7.field6614 = null;
                                    }
                                 }

                                 if (var12) {
                                    var7.field6609 = null;
                                    var7.field6615 = var11.field10859;
                                    var7.field6631 = var8;
                                    var7.field6621 = null;
                                    var7.field6611 = var10;
                                    var7.field6607 = var11.field10880;
                                 }

                                 var7.field6628 = var7.field6624.field10694;
                                 var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                 var7.field6618 = var7.field6624.field10693;
                                 var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                 class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                 var7 = (class460)class119.field1488.method2940(false);
                              }
                           } else {
                              var7.field6628 = var7.field6624.field10694;
                              var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                              var7.field6618 = var7.field6624.field10693;
                              var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                              class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                              var7 = (class460)class119.field1488.method2940(false);
                           }
                        } else if (var7.field6611 == var10) {
                           if (!var7.field6615 == !var11.field10859) {
                              var7.field6607 = var11.field10880;
                              var7.field6631 = var8;
                              if (var5) {
                                 var12 = false;
                                 if (var7.field6614 == null) {
                                    var12 = true;
                                    if (var5) {
                                       var7.field6607 -= 512;
                                       if (~var7.field6607 >= -1) {
                                          class280.field3897.method4815(var7.field6614);
                                          var12 = true;
                                          var7.field6614 = null;
                                       }
                                    }
                                 } else {
                                    var7.field6607 -= 512;
                                    if (~var7.field6607 >= -1) {
                                       class280.field3897.method4815(var7.field6614);
                                       var12 = true;
                                       var7.field6614 = null;
                                    }
                                 }

                                 if (var12) {
                                    var7.field6609 = null;
                                    var7.field6615 = var11.field10859;
                                    var7.field6631 = var8;
                                    var7.field6621 = null;
                                    var7.field6611 = var10;
                                    var7.field6607 = var11.field10880;
                                 }

                                 var7.field6628 = var7.field6624.field10694;
                                 var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                 var7.field6618 = var7.field6624.field10693;
                                 var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                 class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                 var7 = (class460)class119.field1488.method2940(false);
                              } else {
                                 var7.field6628 = var7.field6624.field10694;
                                 var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                 var7.field6618 = var7.field6624.field10693;
                                 var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                 class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                 var7 = (class460)class119.field1488.method2940(false);
                              }
                           } else {
                              var12 = false;
                              if (var7.field6614 == null) {
                                 var12 = true;
                                 if (var5) {
                                    var7.field6607 -= 512;
                                    if (~var7.field6607 >= -1) {
                                       class280.field3897.method4815(var7.field6614);
                                       var12 = true;
                                       var7.field6614 = null;
                                    }
                                 }
                              } else {
                                 var7.field6607 -= 512;
                                 if (~var7.field6607 >= -1) {
                                    class280.field3897.method4815(var7.field6614);
                                    var12 = true;
                                    var7.field6614 = null;
                                 }
                              }

                              if (var12) {
                                 var7.field6609 = null;
                                 var7.field6615 = var11.field10859;
                                 var7.field6631 = var8;
                                 var7.field6621 = null;
                                 var7.field6611 = var10;
                                 var7.field6607 = var11.field10880;
                              }

                              var7.field6628 = var7.field6624.field10694;
                              var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                              var7.field6618 = var7.field6624.field10693;
                              var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                              class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                              var7 = (class460)class119.field1488.method2940(false);
                           }
                        } else {
                           var12 = false;
                           if (var7.field6614 == null) {
                              var12 = true;
                              if (var5) {
                                 var7.field6607 -= 512;
                                 if (~var7.field6607 >= -1) {
                                    class280.field3897.method4815(var7.field6614);
                                    var12 = true;
                                    var7.field6614 = null;
                                 }
                              }
                           } else {
                              var7.field6607 -= 512;
                              if (~var7.field6607 >= -1) {
                                 class280.field3897.method4815(var7.field6614);
                                 var12 = true;
                                 var7.field6614 = null;
                              }
                           }

                           if (var12) {
                              var7.field6609 = null;
                              var7.field6615 = var11.field10859;
                              var7.field6631 = var8;
                              var7.field6621 = null;
                              var7.field6611 = var10;
                              var7.field6607 = var11.field10880;
                           }

                           var7.field6628 = var7.field6624.field10694;
                           var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                           var7.field6618 = var7.field6624.field10693;
                           var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                           class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                           var7 = (class460)class119.field1488.method2940(false);
                        }
                     } else {
                        var7.field6631 = var8;
                        var7.field6615 = false;
                        var7.field6611 = -1;
                        if (var5) {
                           if (var7.field6611 == var10) {
                              if (!var7.field6615 == !var11.field10859) {
                                 var7.field6607 = var11.field10880;
                                 var7.field6631 = var8;
                                 if (var5) {
                                    var12 = false;
                                    if (var7.field6614 == null) {
                                       var12 = true;
                                       if (var5) {
                                          var7.field6607 -= 512;
                                          if (~var7.field6607 >= -1) {
                                             class280.field3897.method4815(var7.field6614);
                                             var12 = true;
                                             var7.field6614 = null;
                                          }
                                       }
                                    } else {
                                       var7.field6607 -= 512;
                                       if (~var7.field6607 >= -1) {
                                          class280.field3897.method4815(var7.field6614);
                                          var12 = true;
                                          var7.field6614 = null;
                                       }
                                    }

                                    if (var12) {
                                       var7.field6609 = null;
                                       var7.field6615 = var11.field10859;
                                       var7.field6631 = var8;
                                       var7.field6621 = null;
                                       var7.field6611 = var10;
                                       var7.field6607 = var11.field10880;
                                    }

                                    var7.field6628 = var7.field6624.field10694;
                                    var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                    var7.field6618 = var7.field6624.field10693;
                                    var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                    class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                    var7 = (class460)class119.field1488.method2940(false);
                                 } else {
                                    var7.field6628 = var7.field6624.field10694;
                                    var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                    var7.field6618 = var7.field6624.field10693;
                                    var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                    class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                    var7 = (class460)class119.field1488.method2940(false);
                                 }
                              } else {
                                 var12 = false;
                                 if (var7.field6614 == null) {
                                    var12 = true;
                                    if (var5) {
                                       var7.field6607 -= 512;
                                       if (~var7.field6607 >= -1) {
                                          class280.field3897.method4815(var7.field6614);
                                          var12 = true;
                                          var7.field6614 = null;
                                       }
                                    }
                                 } else {
                                    var7.field6607 -= 512;
                                    if (~var7.field6607 >= -1) {
                                       class280.field3897.method4815(var7.field6614);
                                       var12 = true;
                                       var7.field6614 = null;
                                    }
                                 }

                                 if (var12) {
                                    var7.field6609 = null;
                                    var7.field6615 = var11.field10859;
                                    var7.field6631 = var8;
                                    var7.field6621 = null;
                                    var7.field6611 = var10;
                                    var7.field6607 = var11.field10880;
                                 }

                                 var7.field6628 = var7.field6624.field10694;
                                 var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                                 var7.field6618 = var7.field6624.field10693;
                                 var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                                 class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                                 var7 = (class460)class119.field1488.method2940(false);
                              }
                           } else {
                              var12 = false;
                              if (var7.field6614 == null) {
                                 var12 = true;
                                 if (var5) {
                                    var7.field6607 -= 512;
                                    if (~var7.field6607 >= -1) {
                                       class280.field3897.method4815(var7.field6614);
                                       var12 = true;
                                       var7.field6614 = null;
                                    }
                                 }
                              } else {
                                 var7.field6607 -= 512;
                                 if (~var7.field6607 >= -1) {
                                    class280.field3897.method4815(var7.field6614);
                                    var12 = true;
                                    var7.field6614 = null;
                                 }
                              }

                              if (var12) {
                                 var7.field6609 = null;
                                 var7.field6615 = var11.field10859;
                                 var7.field6631 = var8;
                                 var7.field6621 = null;
                                 var7.field6611 = var10;
                                 var7.field6607 = var11.field10880;
                              }

                              var7.field6628 = var7.field6624.field10694;
                              var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                              var7.field6618 = var7.field6624.field10693;
                              var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                              class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                              var7 = (class460)class119.field1488.method2940(false);
                           }
                        } else {
                           var7.field6628 = var7.field6624.field10694;
                           var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                           var7.field6618 = var7.field6624.field10693;
                           var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                           class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                           var7 = (class460)class119.field1488.method2940(false);
                        }
                     }
                  } else {
                     var7.field6628 = var7.field6624.field10694;
                     var7.field6620 = var7.field6624.field10694 - -(var7.field6624.method972(-1) << 8);
                     var7.field6618 = var7.field6624.field10693;
                     var7.field6605 = var7.field6624.field10693 + (var7.field6624.method972(-1) << 8);
                     class111.method906(arg0, arg4, arg3, arg2, -371769232, var7);
                     var7 = (class460)class119.field1488.method2940(false);
                  }

                  if (var7 == null) {
                     var10000 = arg1;
                     if (!var5) {
                        if (arg1 >= -117) {
                           method3110(0, (byte)-76, -60, -61, 44);
                        }

                        var13 = (class460)class9.field89.method328(1745388291);
                        if (!var5 && var13 == null) {
                           return;
                        }

                        do {
                           label149: {
                              var14 = 1;
                              var15 = var13.field6626.method2119(false);
                              if (var13.field6626.field3879 != -1 && !var13.field6626.field3791) {
                                 if (var13.field6626.field3879 == var15.field6066 || ~var13.field6626.field3879 == ~var15.field6095 || var13.field6626.field3879 == var15.field6093 || var13.field6626.field3879 == var15.field6060) {
                                    var14 = 2;
                                    if (!var5) {
                                       break label149;
                                    }
                                 }

                                 if (~var13.field6626.field3879 != ~var15.field6069 && var13.field6626.field3879 != var15.field6059 && ~var13.field6626.field3879 != ~var15.field6097 && ~var13.field6626.field3879 != ~var15.field6074) {
                                    break label149;
                                 }

                                 var14 = 3;
                                 if (!var5) {
                                    break label149;
                                 }
                              }

                              var14 = 0;
                           }

                           if (~var13.field6631 != ~var14) {
                              label873: {
                                 var16 = class566.method4032(var13.field6626, -1);
                                 if (var13.field6611 == var16 && var13.field6615 != !var13.field6626.field1551) {
                                    var13.field6607 = var13.field6626.field1553;
                                    var13.field6631 = var14;
                                    if (!var5) {
                                       break label873;
                                    }
                                 }

                                 label161: {
                                    var17 = false;
                                    if (var13.field6614 == null) {
                                       var17 = true;
                                       if (!var5) {
                                          break label161;
                                       }
                                    }

                                    var13.field6607 -= 512;
                                    if (~var13.field6607 >= -1) {
                                       class280.field3897.method4815(var13.field6614);
                                       var17 = true;
                                       var13.field6614 = null;
                                    }
                                 }

                                 if (var17) {
                                    var13.field6621 = null;
                                    var13.field6609 = null;
                                    var13.field6615 = var13.field6626.field1551;
                                    var13.field6607 = var13.field6626.field1553;
                                    var13.field6631 = var14;
                                    var13.field6611 = var16;
                                 }
                              }
                           }

                           var13.field6628 = var13.field6626.field10694;
                           var13.field6620 = var13.field6626.field10694 - -(var13.field6626.method972(-1) << 8);
                           var13.field6618 = var13.field6626.field10693;
                           var13.field6605 = var13.field6626.field10693 + (var13.field6626.method972(-1) << 8);
                           class111.method906(arg0, arg4, arg3, arg2, -371769232, var13);
                           var13 = (class460)class9.field89.method325(-4629);
                        } while(var13 != null);

                        return;
                     }
                  } else {
                     var10000 = 1;
                  }

                  var8 = var10000;
                  var9 = var7.field6624.method2119(false);
                  if (~var7.field6624.field3879 != 0) {
                     if (!var7.field6624.field3791) {
                        if (var7.field6624.field3879 != var9.field6066) {
                           if (~var7.field6624.field3879 != ~var9.field6095) {
                              if (~var7.field6624.field3879 != ~var9.field6093) {
                                 if (var7.field6624.field3879 != var9.field6060) {
                                    if (~var7.field6624.field3879 != ~var9.field6069) {
                                       if (var7.field6624.field3879 != var9.field6059) {
                                          if (var7.field6624.field3879 != var9.field6097) {
                                             if (~var7.field6624.field3879 == ~var9.field6074) {
                                                var8 = 3;
                                                if (var5) {
                                                   var8 = 2;
                                                   if (var5) {
                                                      var8 = 0;
                                                   }
                                                }
                                             }
                                          } else {
                                             var8 = 3;
                                             if (var5) {
                                                var8 = 2;
                                                if (var5) {
                                                   var8 = 0;
                                                }
                                             }
                                          }
                                       } else {
                                          var8 = 3;
                                          if (var5) {
                                             var8 = 2;
                                             if (var5) {
                                                var8 = 0;
                                             }
                                          }
                                       }
                                    } else {
                                       var8 = 3;
                                       if (var5) {
                                          var8 = 2;
                                          if (var5) {
                                             var8 = 0;
                                          }
                                       }
                                    }
                                 } else {
                                    var8 = 2;
                                    if (var5) {
                                       var8 = 0;
                                    }
                                 }
                              } else {
                                 var8 = 2;
                                 if (var5) {
                                    var8 = 0;
                                 }
                              }
                           } else {
                              var8 = 2;
                              if (var5) {
                                 var8 = 0;
                              }
                           }
                        } else {
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
               }
            }

            var6 = (class460)class522.field7503.method2940(false);
         }
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field5997[5] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "([Ljava/lang/Object;II[JB)V",
      line = 237
   )
   public static final void method3111(Object[] param0, int param1, int param2, long[] param3, byte param4) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(III)V",
      line = 295
   )
   public static final void method3112(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 19712) {
            field5993 = null;
         }

         ++field5985;
         class755 var3 = class317.method2325((long)arg1 << 32 | (long)arg2, 117, 19);
         var3.method5481(-92);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field5997[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "a",
      descriptor = "(I)V",
      line = 308
   )
   public static void method3113(int arg0) {
      try {
         if (arg0 != 1) {
            method3109((class147)null, -73);
         }

         field5986 = null;
         field5993 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5997[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "<init>",
      descriptor = "(IIII)V",
      line = 318
   )
   public class416(int arg0, int arg1, int arg2, int arg3) {
      try {
         this.field5990 = arg0;
         this.field5996 = arg1;
         this.field5989 = arg2;
         this.field5994 = arg3;
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field5997[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ')');
      }
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3114(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 111);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!lp",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3115(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 14;
            break;
         case 1:
            var10005 = 62;
            break;
         case 2:
            var10005 = 6;
            break;
         case 3:
            var10005 = 86;
            break;
         default:
            var10005 = 111;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
