import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ls")
public class class783 extends class575 {
   @OriginalMember(
      owner = "client!ls",
      name = "r",
      descriptor = "Z"
   )
   private boolean field11404;
   @OriginalMember(
      owner = "client!ls",
      name = "l",
      descriptor = "Z"
   )
   private boolean field11407;
   @OriginalMember(
      owner = "client!ls",
      name = "p",
      descriptor = "[Lcca;"
   )
   private class293[] field11403;
   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11414 = new String[]{method5657(method5656(":)`pJ")), method5657(method5656(":)`gJ")), method5657(method5656(":)`rJ")), method5657(method5656(":)`qJ")), method5657(method5656(":)`wJ")), method5657(method5656(":)`tJ")), method5657(method5656(":)`sJ")), method5657(method5656("-t`\u001b\u001f")), method5657(method5656(":)`vJ")), method5657(method5656("8/\"Y")), method5657(method5656(":)`\t\u000b83:\u000bJ")), method5657(method5656(":)`aJ")), method5657(method5656(":)`fJ"))};
   @OriginalMember(
      owner = "client!ls",
      name = "u",
      descriptor = "[I"
   )
   public static int[] field11408 = new int[]{104, 120, 136, 168};
   @OriginalMember(
      owner = "client!ls",
      name = "m",
      descriptor = "I"
   )
   public static int field11400;
   @OriginalMember(
      owner = "client!ls",
      name = "w",
      descriptor = "I"
   )
   public static int field11401;
   @OriginalMember(
      owner = "client!ls",
      name = "n",
      descriptor = "I"
   )
   public static int field11402;
   @OriginalMember(
      owner = "client!ls",
      name = "x",
      descriptor = "I"
   )
   public static int field11405;
   @OriginalMember(
      owner = "client!ls",
      name = "v",
      descriptor = "I"
   )
   public static int field11406;
   @OriginalMember(
      owner = "client!ls",
      name = "t",
      descriptor = "I"
   )
   public static int field11409;
   @OriginalMember(
      owner = "client!ls",
      name = "o",
      descriptor = "I"
   )
   public static int field11410;
   @OriginalMember(
      owner = "client!ls",
      name = "y",
      descriptor = "I"
   )
   public static int field11411;
   @OriginalMember(
      owner = "client!ls",
      name = "s",
      descriptor = "I"
   )
   public static int field11412;
   @OriginalMember(
      owner = "client!ls",
      name = "q",
      descriptor = "J"
   )
   public static long field11413;

   @OriginalMember(
      owner = "client!ls",
      name = "d",
      descriptor = "(Z)V"
   )
   public static void method5652(boolean arg0) {
      try {
         if (arg0) {
            field11408 = null;
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field11414[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "c",
      descriptor = "(Z)V"
   )
   public final void method85(boolean arg0) {
      boolean var2 = client.field10022;

      try {
         label30: {
            if (this.field11404) {
               label27: {
                  super.field8129.method1953(115, 1);
                  super.field8129.method1943(0, (class683)null);
                  super.field8129.method1259(class725.field10360, (byte)124);
                  super.field8129.method1958(0);
                  if (this.field11407) {
                     super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
                     super.field8129.method2009(0, 0, class339.field5001);
                     super.field8129.method1937(class339.field5001, 0, 0);
                     if (!var2) {
                        break label27;
                     }
                  }

                  super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
                  super.field8129.method2009(0, 0, class339.field5001);
                  super.field8129.method1953(107, 2);
                  super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
                  super.field8129.method2009(0, 0, class339.field5001);
                  super.field8129.method2009(0, 1, class77.field1238);
                  super.field8129.method1937(class339.field5001, 0, 0);
                  super.field8129.method1943(0, (class683)null);
               }

               super.field8129.method1953(96, 0);
               this.field11404 = false;
               if (!var2) {
                  break label30;
               }
            }

            super.field8129.method1937(class339.field5001, 0, 0);
         }

         ++field11409;
         super.field8129.method1945((byte)-86, class561.field7986, class561.field7986);
         if (arg0) {
            this.field11403 = null;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11414[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "<init>",
      descriptor = "(Ldaa;)V"
   )
   public class783(class226 arg0) {
      boolean var2 = client.field10022;
      super(arg0);
      this.field11404 = false;

      try {
         if (arg0.field3414) {
            this.field11407 = ~arg0.field3455 > -4;
            int var3 = this.field11407 ? 48 : 127;
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int[][] var6 = new int[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && ~var8 <= -65) {
               this.field11403 = new class293[3];
               this.field11403[0] = super.field8129.method1269(0, var5, 64, false);
               this.field11403[1] = super.field8129.method1269(0, var6, 64, false);
               this.field11403[2] = super.field8129.method1269(0, var4, 64, false);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var9 * 2.0F / 64.0F + -1.0F;
                        float var11 = (float)var8 * 2.0F / 64.0F - 1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var10 * var10 + 1.0F)));
                        float var13 = var10 * var12;
                        float var14 = var11 * var12;
                        int var15 = 0;
                        float var16;
                        int var17;
                        int var18;
                        int var19;
                        if (var2) {
                           if (var15 == 0) {
                              var16 = -var13;
                              if (var2) {
                                 if (~var15 != -2) {
                                    if (~var15 != -3) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          }
                                       } else if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var14;
                                       if (var2) {
                                          var16 = var13;
                                       }
                                    }
                                 } else {
                                    var16 = var13;
                                 }

                                 if (var16 > 0.0F) {
                                    var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    if (var2) {
                                       var19 = 0;
                                       var18 = 0;
                                       var17 = 0;
                                    }
                                 } else {
                                    var19 = 0;
                                    var18 = 0;
                                    var17 = 0;
                                 }

                                 var5[var15][var7] = var17 << 24;
                                 var6[var15][var7] = var18 << 24;
                                 var4[var15][var7] = var19 << 24;
                                 ++var15;
                              } else {
                                 if (var16 > 0.0F) {
                                    var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    if (var2) {
                                       var19 = 0;
                                       var18 = 0;
                                       var17 = 0;
                                    }
                                 } else {
                                    var19 = 0;
                                    var18 = 0;
                                    var17 = 0;
                                 }

                                 var5[var15][var7] = var17 << 24;
                                 var6[var15][var7] = var18 << 24;
                                 var4[var15][var7] = var19 << 24;
                                 ++var15;
                              }
                           } else {
                              if (~var15 != -2) {
                                 if (~var15 != -3) {
                                    if (~var15 == -4) {
                                       var16 = -var14;
                                       if (var2) {
                                          if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       }
                                    } else if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var14;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var14;
                                    if (var2) {
                                       var16 = var13;
                                    }
                                 }
                              } else {
                                 var16 = var13;
                              }

                              if (var16 > 0.0F) {
                                 var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 if (var2) {
                                    var19 = 0;
                                    var18 = 0;
                                    var17 = 0;
                                 }
                              } else {
                                 var19 = 0;
                                 var18 = 0;
                                 var17 = 0;
                              }

                              var5[var15][var7] = var17 << 24;
                              var6[var15][var7] = var18 << 24;
                              var4[var15][var7] = var19 << 24;
                              ++var15;
                           }
                        }

                        while(true) {
                           while(var15 < 6) {
                              if (var15 == 0) {
                                 var16 = -var13;
                                 if (var2) {
                                    if (~var15 != -2) {
                                       if (~var15 != -3) {
                                          if (~var15 == -4) {
                                             var16 = -var14;
                                             if (var2) {
                                                if (~var15 == -5) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = var14;
                                                         if (var2) {
                                                            var16 = var13;
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                }
                                             }
                                          } else if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var14;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                    }

                                    if (var16 > 0.0F) {
                                       var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                       var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                       if (var2) {
                                          var19 = 0;
                                          var18 = 0;
                                          var17 = 0;
                                       }
                                    } else {
                                       var19 = 0;
                                       var18 = 0;
                                       var17 = 0;
                                    }

                                    var5[var15][var7] = var17 << 24;
                                    var6[var15][var7] = var18 << 24;
                                    var4[var15][var7] = var19 << 24;
                                    ++var15;
                                 } else {
                                    if (var16 > 0.0F) {
                                       var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                       var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                       if (var2) {
                                          var19 = 0;
                                          var18 = 0;
                                          var17 = 0;
                                       }
                                    } else {
                                       var19 = 0;
                                       var18 = 0;
                                       var17 = 0;
                                    }

                                    var5[var15][var7] = var17 << 24;
                                    var6[var15][var7] = var18 << 24;
                                    var4[var15][var7] = var19 << 24;
                                    ++var15;
                                 }
                              } else {
                                 if (~var15 != -2) {
                                    if (~var15 != -3) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          }
                                       } else if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var14;
                                       if (var2) {
                                          var16 = var13;
                                       }
                                    }
                                 } else {
                                    var16 = var13;
                                 }

                                 if (var16 > 0.0F) {
                                    var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    if (var2) {
                                       var19 = 0;
                                       var18 = 0;
                                       var17 = 0;
                                    }
                                 } else {
                                    var19 = 0;
                                    var18 = 0;
                                    var17 = 0;
                                 }

                                 var5[var15][var7] = var17 << 24;
                                 var6[var15][var7] = var18 << 24;
                                 var4[var15][var7] = var19 << 24;
                                 ++var15;
                              }
                           }

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           if (~var15 != -2) {
                              if (~var15 != -3) {
                                 if (~var15 == -4) {
                                    var16 = -var14;
                                    if (var2) {
                                       if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    }
                                 } else if (~var15 == -5) {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var14;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var14;
                                       if (var2) {
                                          var16 = var13;
                                       }
                                    }
                                 }
                              } else {
                                 var16 = var14;
                                 if (var2) {
                                    var16 = var13;
                                 }
                              }
                           } else {
                              var16 = var13;
                           }

                           if (var16 > 0.0F) {
                              var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                              var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                              var19 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                              if (var2) {
                                 var19 = 0;
                                 var18 = 0;
                                 var17 = 0;
                              }
                           } else {
                              var19 = 0;
                              var18 = 0;
                              var17 = 0;
                           }

                           var5[var15][var7] = var17 << 24;
                           var6[var15][var7] = var18 << 24;
                           var4[var15][var7] = var19 << 24;
                           ++var15;
                        }
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(~var8 > -65);

               this.field11403 = new class293[3];
               this.field11403[0] = super.field8129.method1269(0, var5, 64, false);
               this.field11403[1] = super.field8129.method1269(0, var6, 64, false);
               this.field11403[2] = super.field8129.method1269(0, var4, 64, false);
            }
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field11414[10] + (arg0 != null ? field11414[7] : field11414[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method86(int arg0) {
      try {
         if (arg0 != 15385) {
            return false;
         } else {
            ++field11405;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11414[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method84(int arg0, int arg1, byte arg2) {
      try {
         if (this.field11404) {
            super.field8129.method1953(96, 1);
            super.field8129.method1943(0, this.field11403[arg1 + -1]);
            super.field8129.method1953(-116, 0);
         }

         if (arg2 >= 61) {
            ++field11410;
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11414[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "c",
      descriptor = "(B)V"
   )
   public static final void method5653(byte arg0) {
      boolean var1 = client.field10022;

      try {
         class211 var2 = (class211)class142.field2268.method5225(true);
         if (var1) {
            if (~var2.field3008 < -2) {
               var2.field3008 = 0;
               class144.field2280.method1050(arg0 + -99, var2, ((class272)var2.field3011.field10341.field1553).field4155);
               var2.field3011.method5222((byte)-63);
            }

            var2 = (class211)class142.field2268.method5227(-17856);
         }

         while(true) {
            int var10000;
            byte var10001;
            if (var2 == null) {
               ++field11401;
               class687.field9909 = 0;
               class444.field6480 = 0;
               class594.field8377.method2237(arg0 ^ 64);
               class524.field7418.method3096(-115);
               class142.field2268.method5222((byte)-63);
               var10000 = arg0;
               var10001 = 14;
               if (!var1) {
                  if (arg0 != 14) {
                     method5652(false);
                  }

                  class678.field9669 = false;
                  return;
               }
            } else {
               var10000 = ~var2.field3008;
               var10001 = -2;
            }

            if (var10000 < var10001) {
               var2.field3008 = 0;
               class144.field2280.method1050(arg0 + -99, var2, ((class272)var2.field3011.field10341.field1553).field4155);
               var2.field3011.method5222((byte)-63);
            }

            var2 = (class211)class142.field2268.method5227(-17856);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11414[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(III)I"
   )
   public static final int method5654(int arg0, int arg1, int arg2) {
      boolean var3 = client.field10022;

      try {
         ++field11412;
         if (arg2 != 20285) {
            field11408 = null;
         }

         byte var4;
         label42: {
            if (~arg0 < -20001) {
               class664.method4828(true);
               var4 = 4;
               if (!var3) {
                  break label42;
               }
            }

            if (~arg0 < -10001) {
               var4 = 3;
               class156.method1491(1);
               if (!var3) {
                  break label42;
               }
            }

            if (~arg0 >= -5001) {
               class194.method1708(true, 0);
               var4 = 1;
               if (!var3) {
                  break label42;
               }
            }

            class542.method4042(0);
            var4 = 2;
         }

         if (~class476.field6870.field9109.method4676(-81) != ~arg1) {
            class476.field6870.method4707(arg1, false, class476.field6870.field9103);
            class508.method3828(1, false, arg1);
         }

         class737.method5332(0);
         return var4;
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11414[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method87(boolean arg0, boolean arg1) {
      boolean var3 = client.field10022;

      try {
         label41: {
            ++field11411;
            if (this.field11403 == null || !arg0) {
               super.field8129.method1937(class151.field2323, 0, 0);
               if (!var3) {
                  break label41;
               }
            }

            label27: {
               super.field8129.method1953(106, 1);
               super.field8129.method1259(class263.field4025, (byte)123);
               class522 var4 = super.field8129.method1992((byte)84);
               var4.method324(1024);
               super.field8129.method2015(class303.field4584, (byte)127);
               if (this.field11407) {
                  super.field8129.method1945((byte)-86, class74.field1189, class717.field10280);
                  super.field8129.method1239(2, class339.field5001, 0, true, false);
                  super.field8129.method1937(class151.field2323, 0, 0);
                  if (!var3) {
                     break label27;
                  }
               }

               super.field8129.method1945((byte)-86, class561.field7986, class74.field1189);
               super.field8129.method2009(0, 0, class77.field1238);
               super.field8129.method1953(103, 2);
               super.field8129.method1945((byte)-86, class74.field1189, class717.field10280);
               super.field8129.method2009(0, 0, class77.field1238);
               super.field8129.method1239(2, class77.field1238, 1, true, false);
               super.field8129.method1937(class151.field2323, 0, 0);
               super.field8129.method1943(0, super.field8129.field3409);
            }

            super.field8129.method1953(123, 0);
            this.field11404 = true;
         }

         if (!arg1) {
            this.method82(true, (byte)-117);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field11414[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(IZLqf;)V"
   )
   public final void method88(int arg0, boolean arg1, class683 arg2) {
      try {
         ++field11402;
         if (arg1) {
            super.field8129.method1943(0, arg2);
            super.field8129.method1966(arg0, -5);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field11414[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field11414[7] : field11414[9]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method82(boolean arg0, byte arg1) {
      try {
         ++field11400;
         super.field8129.method1945((byte)-86, class74.field1189, class561.field7986);
         if (arg1 != 23) {
            this.field11404 = true;
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field11414[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "a",
      descriptor = "(II)Z"
   )
   public static final boolean method5655(int arg0, int arg1) {
      try {
         ++field11406;
         if (arg1 != 0) {
            field11408 = null;
         }

         return ~arg0 == -4 || arg0 == 4 || ~arg0 == -6 || ~arg0 == -7;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field11414[2] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5656(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 98);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ls",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5657(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 86;
            break;
         case 1:
            var10005 = 90;
            break;
         case 2:
            var10005 = 78;
            break;
         case 3:
            var10005 = 53;
            break;
         default:
            var10005 = 98;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
