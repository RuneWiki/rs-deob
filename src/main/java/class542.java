import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nga")
public class class542 extends class141 {
   @OriginalMember(
      owner = "client!nga",
      name = "r",
      descriptor = "Z"
   )
   private boolean field7776;
   @OriginalMember(
      owner = "client!nga",
      name = "B",
      descriptor = "Z"
   )
   private boolean field7786;
   @OriginalMember(
      owner = "client!nga",
      name = "v",
      descriptor = "[Lofa;"
   )
   private class349[] field7784;
   @OriginalMember(
      owner = "client!nga",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7789 = new String[]{method3903(method3902("#\u0007_<=e")), method3903(method3902("#\u0007_<;e")), method3903(method3902("#\u0007_<8e")), method3903(method3902("#\u0007_<>e")), method3903(method3902("#\u0015R~")), method3903(method3902("6N\u0010<\u0001")), method3903(method3902("#\u0007_<5e")), method3903(method3902("#\u0007_<4e")), method3903(method3902("#\u0007_<:e")), method3903(method3902("#\u0007_<?e")), method3903(method3902("#\u0007_<@$\u000eWfBe")), method3903(method3902("#\u0007_<9e"))};
   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "J"
   )
   public static long field7782 = -1L;
   @OriginalMember(
      owner = "client!nga",
      name = "x",
      descriptor = "I"
   )
   public static int field7783 = 1339;
   @OriginalMember(
      owner = "client!nga",
      name = "o",
      descriptor = "I"
   )
   public static int field7787 = 0;
   @OriginalMember(
      owner = "client!nga",
      name = "m",
      descriptor = "I"
   )
   public static int field7773;
   @OriginalMember(
      owner = "client!nga",
      name = "A",
      descriptor = "I"
   )
   public static int field7774;
   @OriginalMember(
      owner = "client!nga",
      name = "q",
      descriptor = "I"
   )
   public static int field7775;
   @OriginalMember(
      owner = "client!nga",
      name = "p",
      descriptor = "I"
   )
   public static int field7777;
   @OriginalMember(
      owner = "client!nga",
      name = "s",
      descriptor = "I"
   )
   public static int field7778;
   @OriginalMember(
      owner = "client!nga",
      name = "u",
      descriptor = "I"
   )
   public static int field7779;
   @OriginalMember(
      owner = "client!nga",
      name = "t",
      descriptor = "I"
   )
   public static int field7780;
   @OriginalMember(
      owner = "client!nga",
      name = "w",
      descriptor = "I"
   )
   public static int field7781;
   @OriginalMember(
      owner = "client!nga",
      name = "n",
      descriptor = "I"
   )
   public static int field7785;
   @OriginalMember(
      owner = "client!nga",
      name = "y",
      descriptor = "I"
   )
   public static int field7788;

   @OriginalMember(
      owner = "client!nga",
      name = "<init>",
      descriptor = "(Lsc;)V",
      line = 141
   )
   public class542(class369 arg0) {
      boolean var2 = client.field4360;
      super(arg0);
      this.field7776 = false;

      try {
         if (arg0.field5324) {
            this.field7786 = arg0.field5307 < 3;
            int var3 = this.field7786 ? 48 : 127;
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int[][] var6 = new int[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && ~var8 <= -65) {
               this.field7784 = new class349[3];
               this.field7784[0] = super.field1801.method2609(var5, false, 64, false);
               this.field7784[1] = super.field1801.method2609(var6, false, 64, false);
               this.field7784[2] = super.field1801.method2609(var4, false, 64, false);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var9 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float)var8 * 2.0F / 64.0F + -1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var10 * var10 + 1.0F)));
                        float var13 = var11 * var12;
                        float var14 = var10 * var12;
                        int var15 = 0;
                        float var16;
                        byte var17;
                        byte var18;
                        byte var19;
                        int var22;
                        int var23;
                        int var24;
                        if (var2) {
                           if (~var15 == -1) {
                              var16 = -var14;
                              if (var2) {
                                 if (var15 != 1) {
                                    if (var15 != 2) {
                                       if (var15 != 3) {
                                          if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                   if (var2) {
                                                      var16 = var13;
                                                      if (var2) {
                                                         var16 = var14;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var13;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = var14;
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 } else {
                                    var16 = var14;
                                 }
                              }
                           } else if (var15 != 1) {
                              if (var15 != 2) {
                                 if (var15 != 3) {
                                    if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var13;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var13;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = -var13;
                                    if (var2) {
                                       var16 = var13;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 }
                              } else {
                                 var16 = var13;
                                 if (var2) {
                                    var16 = var14;
                                 }
                              }
                           } else {
                              var16 = var14;
                           }

                           if (!(var16 > 0.0F)) {
                              var17 = 0;
                              var18 = 0;
                              var19 = 0;
                              if (var2) {
                                 var24 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                                 var5[var15][var7] = var24 << 24;
                                 var6[var15][var7] = var23 << 24;
                                 var4[var15][var7] = var22 << 24;
                                 ++var15;
                              } else {
                                 var5[var15][var7] = var19 << 24;
                                 var6[var15][var7] = var18 << 24;
                                 var4[var15][var7] = var17 << 24;
                                 ++var15;
                              }
                           } else {
                              var24 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                              var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                              var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                              var5[var15][var7] = var24 << 24;
                              var6[var15][var7] = var23 << 24;
                              var4[var15][var7] = var22 << 24;
                              ++var15;
                           }
                        }

                        while(true) {
                           while(var15 < 6) {
                              if (~var15 == -1) {
                                 var16 = -var14;
                                 if (var2) {
                                    if (var15 != 1) {
                                       if (var15 != 2) {
                                          if (var15 != 3) {
                                             if (var15 != 4) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                      if (var2) {
                                                         var16 = var13;
                                                         if (var2) {
                                                            var16 = var14;
                                                         }
                                                      }
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                   if (var2) {
                                                      var16 = var13;
                                                      if (var2) {
                                                         var16 = var14;
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var13;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var13;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    } else {
                                       var16 = var14;
                                    }
                                 }
                              } else if (var15 != 1) {
                                 if (var15 != 2) {
                                    if (var15 != 3) {
                                       if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var13;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = var14;
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var13;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = -var13;
                                       if (var2) {
                                          var16 = var13;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var13;
                                    if (var2) {
                                       var16 = var14;
                                    }
                                 }
                              } else {
                                 var16 = var14;
                              }

                              if (!(var16 > 0.0F)) {
                                 var17 = 0;
                                 var18 = 0;
                                 var19 = 0;
                                 if (var2) {
                                    var24 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                                    var5[var15][var7] = var24 << 24;
                                    var6[var15][var7] = var23 << 24;
                                    var4[var15][var7] = var22 << 24;
                                    ++var15;
                                 } else {
                                    var5[var15][var7] = var19 << 24;
                                    var6[var15][var7] = var18 << 24;
                                    var4[var15][var7] = var17 << 24;
                                    ++var15;
                                 }
                              } else {
                                 var24 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                                 var5[var15][var7] = var24 << 24;
                                 var6[var15][var7] = var23 << 24;
                                 var4[var15][var7] = var22 << 24;
                                 ++var15;
                              }
                           }

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           if (var15 != 1) {
                              if (var15 != 2) {
                                 if (var15 != 3) {
                                    if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var13;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var13;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = -var13;
                                    if (var2) {
                                       var16 = var13;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 }
                              } else {
                                 var16 = var13;
                                 if (var2) {
                                    var16 = var14;
                                 }
                              }
                           } else {
                              var16 = var14;
                           }

                           if (!(var16 > 0.0F)) {
                              var17 = 0;
                              var18 = 0;
                              var19 = 0;
                              if (var2) {
                                 var24 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                                 var5[var15][var7] = var24 << 24;
                                 var6[var15][var7] = var23 << 24;
                                 var4[var15][var7] = var22 << 24;
                                 ++var15;
                              } else {
                                 var5[var15][var7] = var19 << 24;
                                 var6[var15][var7] = var18 << 24;
                                 var4[var15][var7] = var17 << 24;
                                 ++var15;
                              }
                           } else {
                              var24 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                              var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                              var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                              var5[var15][var7] = var24 << 24;
                              var6[var15][var7] = var23 << 24;
                              var4[var15][var7] = var22 << 24;
                              ++var15;
                           }
                        }
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(~var8 > -65);

               this.field7784 = new class349[3];
               this.field7784[0] = super.field1801.method2609(var5, false, 64, false);
               this.field7784[1] = super.field1801.method2609(var6, false, 64, false);
               this.field7784[2] = super.field1801.method2609(var4, false, 64, false);
            }
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field7789[10] + (arg0 != null ? field7789[5] : field7789[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(BLsga;Lsga;)V",
      line = 10
   )
   public static final void method3899(byte arg0, class76 arg1, class76 arg2) {
      try {
         if (arg2.field946 != null) {
            arg2.method693((byte)-90);
         }

         ++field7788;
         arg2.field950 = arg1.field950;
         if (arg0 != -33) {
            field7783 = 114;
         }

         arg2.field946 = arg1;
         arg2.field946.field950 = arg2;
         arg2.field950.field946 = arg2;
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7789[8] + arg0 + ',' + (arg1 != null ? field7789[5] : field7789[4]) + ',' + (arg2 != null ? field7789[5] : field7789[4]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(ZII)V",
      line = 30
   )
   public static final void method3900(boolean arg0, int arg1, int arg2) {
      try {
         label20: {
            if (!arg0) {
               class200.method1584(class374.field5408, arg1, -1);
               if (!client.field4360) {
                  break label20;
               }
            }

            class447 var3 = class40.method350(class475.field6834, class430.field6150.field106, true);
            var3.field6359.method1185(arg1, true);
            class430.field6150.method55(13256, var3);
         }

         if (arg2 < -22) {
            ++field7775;
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7789[7] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(ZZ)V",
      line = 53
   )
   public final void method311(boolean arg0, boolean arg1) {
      try {
         super.field1801.method2745(-30, class458.field6587, class603.field8872);
         ++field7780;
         if (arg0) {
            method3901(19, -87, 57);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7789[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "f",
      descriptor = "(B)V",
      line = 64
   )
   public final void method307(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field7778;
         if (arg0 < 102) {
            field7781 = 35;
         }

         label36: {
            if (!this.field7776) {
               super.field1801.method2787(class10.field93, (byte)-51, 0);
               if (!var2) {
                  break label36;
               }
            }

            label25: {
               super.field1801.method2763(1, -96);
               super.field1801.method2804((class205)null, -2);
               super.field1801.method2607((byte)-17, class435.field6233);
               super.field1801.method2794((byte)-122);
               if (this.field7786) {
                  super.field1801.method2745(-30, class458.field6587, class458.field6587);
                  super.field1801.method2814(0, class10.field93, true);
                  super.field1801.method2787(class10.field93, (byte)-51, 0);
                  if (!var2) {
                     break label25;
                  }
               }

               super.field1801.method2745(-30, class458.field6587, class458.field6587);
               super.field1801.method2814(0, class10.field93, true);
               super.field1801.method2763(2, -66);
               super.field1801.method2745(-30, class458.field6587, class458.field6587);
               super.field1801.method2814(0, class10.field93, true);
               super.field1801.method2814(1, class706.field10312, true);
               super.field1801.method2787(class10.field93, (byte)-51, 0);
               super.field1801.method2804((class205)null, -2);
            }

            super.field1801.method2763(0, -127);
            this.field7776 = false;
         }

         super.field1801.method2745(-30, class458.field6587, class458.field6587);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7789[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "(III)V",
      line = 105
   )
   public static final void method3901(int arg0, int arg1, int arg2) {
      try {
         class236.field3290 = arg0;
         if (arg2 <= -50) {
            class392.field5678 = arg1;
            ++field7773;
            if (class614.field9025 != 0) {
               if (class614.field9025 == 1) {
                  class50.field658 = class392.field5678 / class347.field4686 - -2 + class616.field9073;
                  class131.field1670 = class236.field3290 / class88.field1146 + 2 - -class377.field5452;
                  class790.field11596 = class88.field1146 * class131.field1670;
                  class752.field11122 = class50.field658 * class347.field4686;
                  class756.field11203 = -class236.field3290 + class790.field11596 >> 1;
                  class241.field3354 = class752.field11122 - class392.field5678 >> 1;
                  return;
               }

               if (class614.field9025 == 2) {
                  class790.field11596 = class236.field3290;
                  class752.field11122 = class392.field5678;
                  return;
               }
            } else {
               class790.field11596 = class236.field3290 - -(class756.field11203 * 2);
               class752.field11122 = class241.field3354 * 2 + class392.field5678;
            }

         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field7789[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(Lm;II)V",
      line = 252
   )
   public final void method310(class205 arg0, int arg1, int arg2) {
      try {
         if (arg2 != 0) {
            this.method307((byte)-82);
         }

         super.field1801.method2804(arg0, -2);
         ++field7774;
         super.field1801.method2747((byte)-81, arg1);
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7789[3] + (arg0 != null ? field7789[5] : field7789[4]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "b",
      descriptor = "(ZZ)V",
      line = 267
   )
   public final void method309(boolean arg0, boolean arg1) {
      boolean var3 = client.field4360;

      try {
         label41: {
            if (this.field7784 == null || !arg1) {
               super.field1801.method2787(class691.field10171, (byte)-51, 0);
               if (!var3) {
                  break label41;
               }
            }

            label27: {
               super.field1801.method2763(1, -83);
               super.field1801.method2607((byte)-52, class647.field9458);
               class716 var4 = super.field1801.method2821((byte)80);
               var4.method1224(1024);
               super.field1801.method2778((byte)-113, class505.field7325);
               if (!this.field7786) {
                  super.field1801.method2745(-30, class603.field8872, class458.field6587);
                  super.field1801.method2814(0, class706.field10312, true);
                  super.field1801.method2763(2, -64);
                  super.field1801.method2745(-30, class358.field4889, class603.field8872);
                  super.field1801.method2814(0, class706.field10312, true);
                  super.field1801.method2635(class706.field10312, 1, -124, true, false);
                  super.field1801.method2787(class691.field10171, (byte)-51, 0);
                  super.field1801.method2804(super.field1801.field5259, -2);
                  if (!var3) {
                     break label27;
                  }
               }

               super.field1801.method2745(-30, class358.field4889, class603.field8872);
               super.field1801.method2635(class10.field93, 0, -125, true, false);
               super.field1801.method2787(class691.field10171, (byte)-51, 0);
            }

            super.field1801.method2763(0, -120);
            this.field7776 = true;
         }

         ++field7779;
         if (arg0) {
            this.method313(false);
         }
      } catch (RuntimeException var6) {
         throw class237.method1823(var6, field7789[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(Z)Z",
      line = 309
   )
   public final boolean method313(boolean arg0) {
      try {
         ++field7777;
         if (!arg0) {
            field7783 = 85;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field7789[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "a",
      descriptor = "(III)V",
      line = 321
   )
   public final void method317(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 0) {
            method3901(-17, 33, 84);
         }

         if (this.field7776) {
            super.field1801.method2763(1, -111);
            super.field1801.method2804(this.field7784[arg2 + -1], -2);
            super.field1801.method2763(0, -97);
         }

         ++field7785;
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field7789[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3902(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 124);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nga",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3903(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 77;
            break;
         case 1:
            var10005 = 96;
            break;
         case 2:
            var10005 = 62;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 124;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
