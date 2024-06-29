import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!mw")
public class class482 extends class393 {
   @OriginalMember(
      owner = "client!mw",
      name = "v",
      descriptor = "Z"
   )
   private boolean field6699;
   @OriginalMember(
      owner = "client!mw",
      name = "p",
      descriptor = "Z"
   )
   private boolean field6693;
   @OriginalMember(
      owner = "client!mw",
      name = "s",
      descriptor = "[Ltt;"
   )
   private class531[] field6697;
   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field6706 = new String[]{method3666(method3665("PV\u001d=\u001a")), method3666(method3665("PV\u001d:\u001a")), method3666(method3665("ST_\u0015")), method3666(method3665("F\u000f\u001dWO")), method3666(method3665("PV\u001dE[SHGG\u001a")), method3666(method3665("PV\u001d3\u001a")), method3666(method3665("PV\u001d0\u001a")), method3666(method3665("PV\u001d2\u001a")), method3666(method3665("PV\u001d)\u001a")), method3666(method3665("PV\u001d7\u001a")), method3666(method3665("PV\u001d>\u001a")), method3666(method3665("PV\u001d<\u001a"))};
   @OriginalMember(
      owner = "client!mw",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field6696 = new int[]{-1, 8192, 0, -1, 12288, 10240, 14336, -1, 4096, 6144, 2048};
   @OriginalMember(
      owner = "client!mw",
      name = "l",
      descriptor = "I"
   )
   public static int field6691 = 0;
   @OriginalMember(
      owner = "client!mw",
      name = "k",
      descriptor = "I"
   )
   public static int field6692;
   @OriginalMember(
      owner = "client!mw",
      name = "t",
      descriptor = "I"
   )
   public static int field6694;
   @OriginalMember(
      owner = "client!mw",
      name = "w",
      descriptor = "I"
   )
   public static int field6695;
   @OriginalMember(
      owner = "client!mw",
      name = "q",
      descriptor = "I"
   )
   public static int field6698;
   @OriginalMember(
      owner = "client!mw",
      name = "o",
      descriptor = "I"
   )
   public static int field6700;
   @OriginalMember(
      owner = "client!mw",
      name = "u",
      descriptor = "I"
   )
   public static int field6701;
   @OriginalMember(
      owner = "client!mw",
      name = "m",
      descriptor = "I"
   )
   public static int field6702;
   @OriginalMember(
      owner = "client!mw",
      name = "n",
      descriptor = "I"
   )
   public static int field6703;
   @OriginalMember(
      owner = "client!mw",
      name = "j",
      descriptor = "I"
   )
   public static int field6704;
   @OriginalMember(
      owner = "client!mw",
      name = "r",
      descriptor = "I"
   )
   public static int field6705;

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(Lvba;II)V"
   )
   public final void method1461(class421 arg0, int arg1, int arg2) {
      try {
         ++field6695;
         super.field5438.method2265(arg0, (byte)96);
         if (arg1 < 84) {
            this.method1464(51, true);
         }

         super.field5438.method2240(-4, arg2);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6706[5] + (arg0 != null ? field6706[3] : field6706[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1464(int arg0, boolean arg1) {
      try {
         ++field6703;
         if (arg0 == 29404) {
            super.field5438.method2231(class231.field2873, class318.field4380, (byte)124);
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field6706[6] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "d",
      descriptor = "(B)V"
   )
   public final void method1457(byte arg0) {
      boolean var2 = client.field1481;

      try {
         label31: {
            ++field6694;
            int var3 = -85 % ((arg0 - 22) / 63);
            if (!this.field6699) {
               super.field5438.method2211((byte)-122, class363.field5039, 0);
               if (!var2) {
                  break label31;
               }
            }

            label22: {
               super.field5438.method2238(9, 1);
               super.field5438.method2265((class421)null, (byte)65);
               super.field5438.method1428(class628.field9271, (byte)89);
               super.field5438.method2282(false);
               if (!this.field6693) {
                  super.field5438.method2231(class231.field2873, class231.field2873, (byte)-89);
                  super.field5438.method2288((byte)-10, class363.field5039, 0);
                  super.field5438.method2238(9, 2);
                  super.field5438.method2231(class231.field2873, class231.field2873, (byte)-111);
                  super.field5438.method2288((byte)-10, class363.field5039, 0);
                  super.field5438.method2288((byte)-10, class48.field640, 1);
                  super.field5438.method2211((byte)115, class363.field5039, 0);
                  super.field5438.method2265((class421)null, (byte)87);
                  if (!var2) {
                     break label22;
                  }
               }

               super.field5438.method2231(class231.field2873, class231.field2873, (byte)-73);
               super.field5438.method2288((byte)-10, class363.field5039, 0);
               super.field5438.method2211((byte)127, class363.field5039, 0);
            }

            super.field5438.method2238(9, 0);
            this.field6699 = false;
         }

         super.field5438.method2231(class231.field2873, class231.field2873, (byte)80);
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6706[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "c",
      descriptor = "(I)V"
   )
   public static final void method3662(int arg0) {
      try {
         if (arg0 <= 80) {
            field6696 = null;
         }

         class373.field5222.method3187(-23825);
         ++field6704;
         class151.field1879.method3187(-23825);
         class390.field5406.method3187(-23825);
         class266.field3370.method3187(-23825);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6706[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "<init>",
      descriptor = "(Lfm;)V"
   )
   public class482(class281 arg0) {
      boolean var2 = client.field1481;
      super(arg0);
      this.field6699 = false;

      try {
         if (arg0.field3789) {
            this.field6693 = arg0.field3829 < 3;
            int var3 = !this.field6693 ? 127 : 48;
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int[][] var6 = new int[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && var8 >= 64) {
               this.field6697 = new class531[3];
               this.field6697[0] = super.field5438.method1427(false, -8, 64, var5);
               this.field6697[1] = super.field5438.method1427(false, -8, 64, var6);
               this.field6697[2] = super.field5438.method1427(false, -8, 64, var4);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || var9 < 64) {
                     do {
                        float var10 = (float)var8 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float)var9 * 2.0F / 64.0F + -1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + 1.0F)));
                        float var13 = var11 * var12;
                        float var14 = var10 * var12;
                        int var15 = 0;
                        float var16;
                        int var17;
                        int var18;
                        int var19;
                        if (var2) {
                           if (var15 != 0) {
                              if (~var15 != -2) {
                                 if (~var15 == -3) {
                                    var16 = var14;
                                    if (var2) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (var15 != 4) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                      if (var2) {
                                                         var16 = -var13;
                                                      }
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             }
                                          }
                                       } else if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       }
                                    }
                                 } else if (~var15 == -4) {
                                    var16 = -var14;
                                    if (var2) {
                                       if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       }
                                    }
                                 } else if (var15 != 4) {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = var13;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = var13;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 }
                              } else {
                                 var16 = var13;
                                 if (var2) {
                                    var16 = -var13;
                                 }
                              }
                           } else {
                              var16 = -var13;
                           }

                           if (var16 > 0.0F) {
                              var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                              var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                              var19 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
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

                        while(true) {
                           while(~var15 > -7) {
                              if (var15 != 0) {
                                 if (~var15 != -2) {
                                    if (~var15 == -3) {
                                       var16 = var14;
                                       if (var2) {
                                          if (~var15 == -4) {
                                             var16 = -var14;
                                             if (var2) {
                                                if (var15 != 4) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = var13;
                                                         if (var2) {
                                                            var16 = -var13;
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                      if (var2) {
                                                         var16 = -var13;
                                                      }
                                                   }
                                                }
                                             }
                                          } else if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          }
                                       }
                                    } else if (~var15 == -4) {
                                       var16 = -var14;
                                       if (var2) {
                                          if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          }
                                       }
                                    } else if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = var13;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var13;
                                    if (var2) {
                                       var16 = -var13;
                                    }
                                 }
                              } else {
                                 var16 = -var13;
                              }

                              if (var16 > 0.0F) {
                                 var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                                 var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var19 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
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

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           var16 = -var13;
                           if (var16 > 0.0F) {
                              var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
                              var18 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                              var19 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
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
                     } while(var9 < 64);
                  }

                  ++var8;
               } while(var8 < 64);

               this.field6697 = new class531[3];
               this.field6697[0] = super.field5438.method1427(false, -8, 64, var5);
               this.field6697[1] = super.field5438.method1427(false, -8, 64, var6);
               this.field6697[2] = super.field5438.method1427(false, -8, 64, var4);
            }
         }
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field6706[4] + (arg0 != null ? field6706[3] : field6706[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "f",
      descriptor = "(B)V"
   )
   public static void method3663(byte arg0) {
      try {
         field6696 = null;
         if (arg0 < 123) {
            method3662(-106);
         }
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6706[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "d",
      descriptor = "(I)V"
   )
   public static final void method3664(int arg0) {
      try {
         class370.field5153 = 200;
         ++field6698;
         class373.field5225 = (int)((double)class273.field3491 * 34.46D);
         class373.field5225 <<= arg0;
         if (class629.field9294.method455()) {
            class373.field5225 += 512;
         }

         class442.method3404(false, 4096);
      } catch (RuntimeException var2) {
         throw class93.method866(var2, field6706[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1462(int arg0, int arg1, int arg2) {
      try {
         if (this.field6699) {
            super.field5438.method2238(arg1 ^ 7320, 1);
            super.field5438.method2265(this.field6697[arg0 + -1], (byte)123);
            super.field5438.method2238(arg1 ^ 7320, 0);
         }

         if (arg1 != 7313) {
            this.field6693 = true;
         }

         ++field6705;
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field6706[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(ZB)V"
   )
   public final void method1459(boolean arg0, byte arg1) {
      boolean var3 = client.field1481;

      try {
         label32: {
            if (this.field6697 != null && arg0) {
               label28: {
                  super.field5438.method2238(9, 1);
                  super.field5438.method1428(class167.field2159, (byte)57);
                  class620 var4 = super.field5438.method2264((byte)91);
                  var4.method859(1024);
                  super.field5438.method2223(false, class644.field9663);
                  if (!this.field6693) {
                     super.field5438.method2231(class318.field4380, class231.field2873, (byte)51);
                     super.field5438.method2288((byte)-10, class48.field640, 0);
                     super.field5438.method2238(9, 2);
                     super.field5438.method2231(class242.field3052, class318.field4380, (byte)-109);
                     super.field5438.method2288((byte)-10, class48.field640, 0);
                     super.field5438.method1409(false, true, class48.field640, 1, -73);
                     super.field5438.method2211((byte)80, class733.field10690, 0);
                     super.field5438.method2265(super.field5438.field3878, (byte)-65);
                     if (!var3) {
                        break label28;
                     }
                  }

                  super.field5438.method2231(class242.field3052, class318.field4380, (byte)-122);
                  super.field5438.method1409(false, true, class363.field5039, 0, -125);
                  super.field5438.method2211((byte)70, class733.field10690, 0);
               }

               super.field5438.method2238(9, 0);
               this.field6699 = true;
               if (!var3) {
                  break label32;
               }
            }

            super.field5438.method2211((byte)-126, class733.field10690, 0);
         }

         ++field6700;
         if (arg1 != 32) {
            field6691 = -78;
         }
      } catch (RuntimeException var6) {
         throw class93.method866(var6, field6706[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "a",
      descriptor = "(Z)Z"
   )
   public final boolean method1460(boolean arg0) {
      try {
         ++field6702;
         if (arg0) {
            this.field6693 = false;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field6706[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3665(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!mw",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3666(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 61;
            break;
         case 1:
            var10005 = 33;
            break;
         case 2:
            var10005 = 51;
            break;
         case 3:
            var10005 = 121;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
