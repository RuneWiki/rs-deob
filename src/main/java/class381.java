import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!vh")
public class class381 extends class268 {
   @OriginalMember(
      owner = "client!vh",
      name = "w",
      descriptor = "Lod;"
   )
   public class536 field5336 = new class536();
   @OriginalMember(
      owner = "client!vh",
      name = "t",
      descriptor = "Lkg;"
   )
   public class286 field5340 = new class286();
   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "Ldl;"
   )
   private class69 field5329;
   @OriginalMember(
      owner = "client!vh",
      name = "B",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5341 = new String[]{method2935(method2934("8\u0003-k3")), method2935(method2934("5E-\u0006f")), method2935(method2934(" \u001eoD")), method2935(method2934("8\u0003-i3")), method2935(method2934("8\u0003-m3")), method2935(method2934("8\u0003-`3")), method2935(method2934("8\u0003-n3")), method2935(method2934("8\u0003-a3")), method2935(method2934("8\u0003-\u0014r \u0002w\u00163")), method2935(method2934("8\u0003-j3")), method2935(method2934("8\u0003-c3")), method2935(method2934("8\u0003-b3"))};
   @OriginalMember(
      owner = "client!vh",
      name = "o",
      descriptor = "Lnc;"
   )
   public static class26 field5334 = null;
   @OriginalMember(
      owner = "client!vh",
      name = "p",
      descriptor = "Lbga;"
   )
   public static class378 field5327 = new class378(58, -1);
   @OriginalMember(
      owner = "client!vh",
      name = "x",
      descriptor = "I"
   )
   public static int field5328;
   @OriginalMember(
      owner = "client!vh",
      name = "u",
      descriptor = "I"
   )
   public static int field5330;
   @OriginalMember(
      owner = "client!vh",
      name = "v",
      descriptor = "I"
   )
   public static int field5331;
   @OriginalMember(
      owner = "client!vh",
      name = "q",
      descriptor = "I"
   )
   public static int field5332;
   @OriginalMember(
      owner = "client!vh",
      name = "r",
      descriptor = "I"
   )
   public static int field5333;
   @OriginalMember(
      owner = "client!vh",
      name = "s",
      descriptor = "I"
   )
   public static int field5335;
   @OriginalMember(
      owner = "client!vh",
      name = "y",
      descriptor = "I"
   )
   public static int field5337;
   @OriginalMember(
      owner = "client!vh",
      name = "A",
      descriptor = "I"
   )
   public static int field5338;
   @OriginalMember(
      owner = "client!vh",
      name = "n",
      descriptor = "I"
   )
   public static int field5339;

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(B)I"
   )
   public static final int method2930(byte arg0) {
      boolean var1 = client.field4273;

      try {
         ++field5339;
         if (arg0 != -27) {
            return 122;
         } else {
            if (class602.field8398 == null) {
               if (!class666.field9473 && class717.field10512 != null) {
                  return class717.field10512.field2996;
               }

               int var2 = class242.field3026.method1581(69);
               int var3 = class242.field3026.method1572(false);
               if (class107.field1366) {
                  if (class441.field6118 < var2 && var2 < class67.field776 + class441.field6118) {
                     int var4 = -1;
                     int var5 = 0;
                     int var6;
                     int var7;
                     if (var1) {
                        if (class336.field4817) {
                           var6 = class604.field8417 - (-(var5 * 16) + -33);
                           if (~var3 < ~(var6 + -13)) {
                              if (~var3 >= ~(var6 + 3)) {
                                 var4 = var5;
                                 if (var1) {
                                    var7 = class604.field8417 + 31 + var5 * 16;
                                    if (var7 + -13 < var3 && ~var3 >= ~(var7 + 3)) {
                                       var4 = var5;
                                    }

                                    ++var5;
                                 } else {
                                    ++var5;
                                 }
                              } else {
                                 ++var5;
                              }
                           } else {
                              ++var5;
                           }
                        } else {
                           var7 = class604.field8417 + 31 + var5 * 16;
                           if (var7 + -13 < var3 && ~var3 >= ~(var7 + 3)) {
                              var4 = var5;
                           }

                           ++var5;
                        }
                     }

                     label421:
                     while(true) {
                        while(~var5 > ~class432.field6026) {
                           if (class336.field4817) {
                              var6 = class604.field8417 - (-(var5 * 16) + -33);
                              if (~var3 < ~(var6 + -13)) {
                                 if (~var3 >= ~(var6 + 3)) {
                                    var4 = var5;
                                    if (var1) {
                                       var7 = class604.field8417 + 31 + var5 * 16;
                                       if (var7 + -13 < var3 && ~var3 >= ~(var7 + 3)) {
                                          var4 = var5;
                                       }

                                       ++var5;
                                    } else {
                                       ++var5;
                                    }
                                 } else {
                                    ++var5;
                                 }
                              } else {
                                 ++var5;
                              }
                           } else {
                              var7 = class604.field8417 + 31 + var5 * 16;
                              if (var7 + -13 < var3 && ~var3 >= ~(var7 + 3)) {
                                 var4 = var5;
                              }

                              ++var5;
                           }
                        }

                        if (!var1) {
                           if (var4 == -1) {
                              return -1;
                           }

                           int var8 = 0;
                           class432 var9 = new class432(class193.field2360);
                           class85 var10 = (class85)var9.method3232(false);
                           if (var1) {
                              if (var8++ == var4) {
                                 return ((class241)var10.field1105.field7496.field7453).field2996;
                              }

                              var10 = (class85)var9.method3234(arg0 + -97);
                           }

                           while(true) {
                              while(var10 != null) {
                                 if (var8++ == var4) {
                                    return ((class241)var10.field1105.field7496.field7453).field2996;
                                 }

                                 var10 = (class85)var9.method3234(arg0 + -97);
                              }

                              if (!var1) {
                                 if (!var1) {
                                    return -1;
                                 }
                                 break label421;
                              }

                              var10 = (class85)var9.method3234(arg0 + -97);
                           }
                        }

                        var7 = var4 + -1;
                        if (var7 + -13 < var3 && ~var3 >= ~(var7 + 3)) {
                           var4 = var5;
                        }

                        ++var5;
                     }
                  }

                  if (class423.field5947 == null || var2 <= class46.field535 || ~var2 <= ~(class46.field535 + class275.field3671)) {
                     return -1;
                  }

                  int var11;
                  int var10000;
                  label298: {
                     var11 = -1;
                     int var12 = 0;
                     if (var1) {
                        var10000 = class336.field4817;
                     } else if (~var12 <= ~class423.field5947.field1099) {
                        var10000 = ~var11;
                        if (!var1) {
                           break label298;
                        }
                     } else {
                        var10000 = class336.field4817;
                     }

                     while(true) {
                        int var14;
                        if (var10000 != 0) {
                           int var13 = class594.field8244 - -(var12 * 16) + 33;
                           if (~(var13 + -13) > ~var3) {
                              if (~var3 >= ~(var13 + 3)) {
                                 var11 = var12;
                                 if (var1) {
                                    var14 = var12 * 16 + (class594.field8244 - -31);
                                    if (~(var14 + -13) > ~var3 && var14 + 3 >= var3) {
                                       var11 = var12;
                                    }

                                    ++var12;
                                 } else {
                                    ++var12;
                                 }
                              } else {
                                 ++var12;
                              }
                           } else {
                              ++var12;
                           }
                        } else {
                           var14 = var12 * 16 + (class594.field8244 - -31);
                           if (~(var14 + -13) > ~var3 && var14 + 3 >= var3) {
                              var11 = var12;
                           }

                           ++var12;
                        }

                        if (~var12 <= ~class423.field5947.field1099) {
                           var10000 = ~var11;
                           if (!var1) {
                              break;
                           }
                        } else {
                           var10000 = class336.field4817;
                        }
                     }
                  }

                  if (var10000 == 0) {
                     return -1;
                  }

                  int var15 = 0;
                  class432 var16 = new class432(class423.field5947.field1105);
                  class241 var17 = (class241)var16.method3232(false);
                  if (var1) {
                     if (~(var15++) == ~var11) {
                        return var17.field2996;
                     }

                     var17 = (class241)var16.method3234(-128);
                  }

                  while(true) {
                     while(var17 != null) {
                        if (~(var15++) == ~var11) {
                           return var17.field2996;
                        }

                        var17 = (class241)var16.method3234(-128);
                     }

                     if (!var1) {
                        if (!var1) {
                           return -1;
                        }
                        break;
                     }

                     var17 = (class241)var16.method3234(-128);
                  }
               }

               if (~var2 < ~class441.field6118 && var2 < class67.field776 + class441.field6118) {
                  int var18 = -1;
                  int var19 = 0;
                  int var20;
                  int var21;
                  if (var1) {
                     if (class336.field4817) {
                        var20 = (-var19 + class234.field2899 + -1) * 16 + 33 + class604.field8417;
                        if (var3 > var20 + -13) {
                           if (var20 + 3 >= var3) {
                              var18 = var19;
                              if (var1) {
                                 var21 = (class234.field2899 - var19 + -1) * 16 + class604.field8417 + 31;
                                 if (~(var21 - 13) > ~var3 && var21 + 3 >= var3) {
                                    var18 = var19;
                                 }

                                 ++var19;
                              } else {
                                 ++var19;
                              }
                           } else {
                              ++var19;
                           }
                        } else {
                           ++var19;
                        }
                     } else {
                        var21 = (class234.field2899 - var19 + -1) * 16 + class604.field8417 + 31;
                        if (~(var21 - 13) > ~var3 && var21 + 3 >= var3) {
                           var18 = var19;
                        }

                        ++var19;
                     }
                  }

                  while(true) {
                     while(~var19 > ~class234.field2899) {
                        if (class336.field4817) {
                           var20 = (-var19 + class234.field2899 + -1) * 16 + 33 + class604.field8417;
                           if (var3 > var20 + -13) {
                              if (var20 + 3 >= var3) {
                                 var18 = var19;
                                 if (var1) {
                                    var21 = (class234.field2899 - var19 + -1) * 16 + class604.field8417 + 31;
                                    if (~(var21 - 13) > ~var3 && var21 + 3 >= var3) {
                                       var18 = var19;
                                    }

                                    ++var19;
                                 } else {
                                    ++var19;
                                 }
                              } else {
                                 ++var19;
                              }
                           } else {
                              ++var19;
                           }
                        } else {
                           var21 = (class234.field2899 - var19 + -1) * 16 + class604.field8417 + 31;
                           if (~(var21 - 13) > ~var3 && var21 + 3 >= var3) {
                              var18 = var19;
                           }

                           ++var19;
                        }
                     }

                     if (!var1) {
                        if (var18 != -1) {
                           int var22 = 0;
                           class279 var23 = new class279(class280.field3738);
                           class241 var24 = (class241)var23.method2117((byte)-2);
                           if (var1 || var24 != null) {
                              do {
                                 if (~var18 == ~(var22++)) {
                                    return var24.field2996;
                                 }

                                 var24 = (class241)var23.method2120((byte)119);
                              } while(var24 != null);
                           }
                        }
                        break;
                     }

                     var21 = var18 + -1;
                     if (~(var21 - 13) > ~var3 && var21 + 3 >= var3) {
                        var18 = var19;
                     }

                     ++var19;
                  }
               }
            }

            return -1;
         }
      } catch (RuntimeException var26) {
         throw class534.method3846(var26, field5341[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "([III)V"
   )
   public final void method669(int[] param1, int param2, int param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "()Lfga;"
   )
   public final class268 method650() {
      try {
         ++field5331;
         class384 var1 = (class384)this.field5336.method3855(113);
         if (var1 == null) {
            return null;
         } else {
            return var1.field5380 != null ? var1.field5380 : this.method649();
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5341[9] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "([ILoka;IIII)V"
   )
   private final void method2931(int[] arg0, class384 arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var7 = client.field4273;

      try {
         ++field5333;
         if (arg2 != -29455) {
            this.field5340 = null;
         }

         if (~(this.field5329.field844[arg1.field5372] & 4) != -1 && ~arg1.field5377 > -1) {
            int var8 = this.field5329.field839[arg1.field5372] / class556.field7644;

            while(true) {
               int var9 = (1048575 - -var8 + -arg1.field5396) / var8;
               if (~arg5 > ~var9) {
                  break;
               }

               arg1.field5380.method669(arg0, arg3, var9);
               arg3 += var9;
               arg1.field5396 += var8 * var9 - 1048576;
               arg5 -= var9;
               int var10 = class556.field7644 / 100;
               int var11 = 262144 / var8;
               if (~var10 < ~var11) {
                  var10 = var11;
               }

               class783 var12;
               label62: {
                  var12 = arg1.field5380;
                  if (this.field5329.field816[arg1.field5372] != 0) {
                     arg1.field5380 = class783.method5643(arg1.field5374, var12.method5638(), 0, var12.method5621());
                     this.field5329.method652(arg1, ~arg1.field5379.field2462[arg1.field5371] > -1, arg2 + 29463);
                     arg1.field5380.method5630(var10, var12.method5627());
                     if (!var7) {
                        break label62;
                     }
                  }

                  arg1.field5380 = class783.method5643(arg1.field5374, var12.method5638(), var12.method5627(), var12.method5621());
               }

               if (~arg1.field5379.field2462[arg1.field5371] > -1) {
                  arg1.field5380.method5618(-1);
               }

               var12.method5640(var10);
               var12.method669(arg0, arg3, -arg3 + arg4);
               if (var12.method5629()) {
                  this.field5340.method2173(var12);
                  if (var7) {
                     return;
                  }

                  if (var7) {
                     break;
                  }
               }
            }

            arg1.field5396 += arg5 * var8;
         }

         arg1.field5380.method669(arg0, arg3, arg5);
      } catch (RuntimeException var14) {
         throw class534.method3846(var14, field5341[7] + (arg0 != null ? field5341[1] : field5341[2]) + ',' + (arg1 != null ? field5341[1] : field5341[2]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "()Lfga;"
   )
   public final class268 method649() {
      boolean var1 = client.field4273;

      try {
         ++field5335;

         while(true) {
            class384 var2 = (class384)this.field5336.method3866((byte)122);
            if (var2 == null) {
               return null;
            }

            class783 var10000 = var2.field5380;

            while(var10000 != null) {
               var10000 = var2.field5380;
               if (!var1) {
                  return var10000;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field5341[6] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(Loka;II)V"
   )
   private final void method2932(class384 arg0, int arg1, int arg2) {
      try {
         ++field5328;
         if (arg1 != 100) {
            field5327 = null;
         }

         if ((this.field5329.field844[arg0.field5372] & 4) != 0 && arg0.field5377 < 0) {
            int var4 = this.field5329.field839[arg0.field5372] / class556.field7644;
            int var5 = (var4 + 1048575 + -arg0.field5396) / var4;
            arg0.field5396 = 1048575 & arg2 * var4 + arg0.field5396;
            if (~var5 >= ~arg2) {
               label41: {
                  if (~this.field5329.field816[arg0.field5372] != -1) {
                     arg0.field5380 = class783.method5643(arg0.field5374, arg0.field5380.method5638(), 0, arg0.field5380.method5621());
                     this.field5329.method652(arg0, ~arg0.field5379.field2462[arg0.field5371] > -1, 8);
                     if (!client.field4273) {
                        break label41;
                     }
                  }

                  arg0.field5380 = class783.method5643(arg0.field5374, arg0.field5380.method5638(), arg0.field5380.method5627(), arg0.field5380.method5621());
               }

               if (~arg0.field5379.field2462[arg0.field5371] > -1) {
                  arg0.field5380.method5618(-1);
               }

               arg2 = arg0.field5396 / var4;
            }
         }

         arg0.field5380.method684(arg2);
      } catch (RuntimeException var7) {
         throw class534.method3846(var7, field5341[5] + (arg0 != null ? field5341[1] : field5341[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "c",
      descriptor = "()I"
   )
   public final int method668() {
      try {
         ++field5330;
         return 0;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5341[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method684(int param1) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!vh",
      name = "b",
      descriptor = "(I)V"
   )
   public static void method2933(int arg0) {
      try {
         if (arg0 < 44) {
            field5327 = null;
         }

         field5327 = null;
         field5334 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field5341[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "<init>",
      descriptor = "(Ldl;)V"
   )
   public class381(class69 arg0) {
      try {
         this.field5329 = arg0;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field5341[8] + (arg0 != null ? field5341[1] : field5341[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2934(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 27);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!vh",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2935(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 78;
            break;
         case 1:
            var10005 = 107;
            break;
         case 2:
            var10005 = 3;
            break;
         case 3:
            var10005 = 40;
            break;
         default:
            var10005 = 27;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
