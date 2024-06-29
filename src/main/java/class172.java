import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!pha")
public class class172 extends class242 {
   @OriginalMember(
      owner = "client!pha",
      name = "s",
      descriptor = "Z"
   )
   private boolean field2668;
   @OriginalMember(
      owner = "client!pha",
      name = "r",
      descriptor = "Z"
   )
   private boolean field2661;
   @OriginalMember(
      owner = "client!pha",
      name = "y",
      descriptor = "[Lnd;"
   )
   private class568[] field2659;
   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field2670 = new String[]{method1545(method1544("r\u0018\u0017J#*")), method1545(method1544("r\u0018\u0017J)*")), method1545(method1544("r\u0018\u0017J,*")), method1545(method1544("r\u0018\u0017J&*")), method1545(method1544("r\u0018\u0017J%*")), method1545(method1544("r\u0018\u0017JWk\u001e\u001f\u0010U*")), method1545(method1544("l\u0005\u001a\b")), method1545(method1544("y^XJ\u0016")), method1545(method1544("r\u0018\u0017J**")), method1545(method1544("r\u0018\u0017J/*")), method1545(method1544("r\u0018\u0017J\"*"))};
   @OriginalMember(
      owner = "client!pha",
      name = "n",
      descriptor = "Lgh;"
   )
   public static class572 field2665 = new class572(61, -1);
   @OriginalMember(
      owner = "client!pha",
      name = "u",
      descriptor = "I"
   )
   public static int field2658;
   @OriginalMember(
      owner = "client!pha",
      name = "o",
      descriptor = "I"
   )
   public static int field2662;
   @OriginalMember(
      owner = "client!pha",
      name = "p",
      descriptor = "I"
   )
   public static int field2663;
   @OriginalMember(
      owner = "client!pha",
      name = "v",
      descriptor = "I"
   )
   public static int field2664;
   @OriginalMember(
      owner = "client!pha",
      name = "q",
      descriptor = "I"
   )
   public static int field2666;
   @OriginalMember(
      owner = "client!pha",
      name = "t",
      descriptor = "I"
   )
   public static int field2667;
   @OriginalMember(
      owner = "client!pha",
      name = "w",
      descriptor = "I"
   )
   public static int field2669;
   @OriginalMember(
      owner = "client!pha",
      name = "x",
      descriptor = "[I"
   )
   public static int[] field2660;

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IIB)V"
   )
   public final void method65(int arg0, int arg1, byte arg2) {
      try {
         if (this.field2668) {
            super.field3498.method2767((byte)-112, 1);
            super.field3498.method2806(false, this.field2659[arg0 + -1]);
            super.field3498.method2767((byte)-112, 0);
         }

         if (arg2 > -64) {
            field2660 = null;
         }

         ++field2663;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2670[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "f",
      descriptor = "(I)V"
   )
   public final void method68(int arg0) {
      boolean var2 = client.field4564;

      try {
         label26: {
            if (this.field2668) {
               label23: {
                  super.field3498.method2767((byte)-112, 1);
                  super.field3498.method2806(false, (class47)null);
                  super.field3498.method1173(class479.field6977, 13);
                  super.field3498.method2744(false);
                  if (this.field2661) {
                     super.field3498.method2761(class621.field9036, (byte)-69, class621.field9036);
                     super.field3498.method2779(8, 0, class540.field7850);
                     super.field3498.method2783(3592, class540.field7850, 0);
                     if (!var2) {
                        break label23;
                     }
                  }

                  super.field3498.method2761(class621.field9036, (byte)-69, class621.field9036);
                  super.field3498.method2779(8, 0, class540.field7850);
                  super.field3498.method2767((byte)-112, 2);
                  super.field3498.method2761(class621.field9036, (byte)-69, class621.field9036);
                  super.field3498.method2779(8, 0, class540.field7850);
                  super.field3498.method2779(8, 1, class315.field4537);
                  super.field3498.method2783(3592, class540.field7850, 0);
                  super.field3498.method2806(false, (class47)null);
               }

               super.field3498.method2767((byte)-112, 0);
               this.field2668 = false;
               if (!var2) {
                  break label26;
               }
            }

            super.field3498.method2783(3592, class540.field7850, 0);
         }

         int var3 = -60 / ((27 - arg0) / 34);
         ++field2667;
         super.field3498.method2761(class621.field9036, (byte)-69, class621.field9036);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2670[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method72(boolean arg0, int arg1) {
      boolean var3 = client.field4564;

      try {
         if (arg1 != -29461) {
            this.field2668 = true;
         }

         label41: {
            if (this.field2659 == null || !arg0) {
               super.field3498.method2783(3592, class701.field10248, 0);
               if (!var3) {
                  break label41;
               }
            }

            label26: {
               super.field3498.method2767((byte)-112, 1);
               super.field3498.method1173(class692.field10145, 13);
               class104 var4 = super.field3498.method2776((byte)97);
               var4.method1002(1024);
               super.field3498.method2765(class608.field8730, 140);
               if (!this.field2661) {
                  super.field3498.method2761(class641.field9348, (byte)-69, class621.field9036);
                  super.field3498.method2779(arg1 ^ -29469, 0, class315.field4537);
                  super.field3498.method2767((byte)-112, 2);
                  super.field3498.method2761(class345.field4912, (byte)-69, class641.field9348);
                  super.field3498.method2779(8, 0, class315.field4537);
                  super.field3498.method1177(false, 1, true, class315.field4537, -86);
                  super.field3498.method2783(3592, class701.field10248, 0);
                  super.field3498.method2806(false, super.field3498.field5295);
                  if (!var3) {
                     break label26;
                  }
               }

               super.field3498.method2761(class345.field4912, (byte)-69, class641.field9348);
               super.field3498.method1177(false, 0, true, class540.field7850, -113);
               super.field3498.method2783(3592, class701.field10248, 0);
            }

            super.field3498.method2767((byte)-112, 0);
            this.field2668 = true;
         }

         ++field2666;
      } catch (RuntimeException var6) {
         throw class608.method4462(var6, field2670[0] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "g",
      descriptor = "(I)V"
   )
   public static void method1542(int arg0) {
      try {
         field2660 = null;
         field2665 = null;
         if (arg0 != -1) {
            field2660 = null;
         }
      } catch (RuntimeException var2) {
         throw class608.method4462(var2, field2670[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IILbt;)V"
   )
   public final void method73(int arg0, int arg1, class47 arg2) {
      try {
         ++field2662;
         super.field3498.method2806(false, arg2);
         if (arg1 < 12) {
            method1543(-123, (byte)-45, 53);
         }

         super.field3498.method2738(-72, arg0);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2670[10] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field2670[7] : field2670[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "<init>",
      descriptor = "(Lcs;)V"
   )
   public class172(class357 arg0) {
      boolean var2 = client.field4564;
      super(arg0);
      this.field2668 = false;

      try {
         if (arg0.field5293) {
            this.field2661 = arg0.field5318 < 3;
            int var3 = !this.field2661 ? 127 : 48;
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int[][] var6 = new int[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && ~var8 <= -65) {
               this.field2659 = new class568[3];
               this.field2659[0] = super.field3498.method1209(64, 1, false, var5);
               this.field2659[1] = super.field3498.method1209(64, 1, false, var6);
               this.field2659[2] = super.field3498.method1209(64, 1, false, var4);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var8 * 2.0F / 64.0F + -1.0F;
                        float var11 = (float)var9 * 2.0F / 64.0F - 1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + 1.0F)));
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
                              var16 = -var13;
                              if (var2) {
                                 if (~var15 == -2) {
                                    var16 = var13;
                                    if (var2) {
                                       if (~var15 == -3) {
                                          var16 = var14;
                                          if (var2) {
                                             if (var15 != 3) {
                                                if (~var15 != -5) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                } else {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             } else {
                                                var16 = -var14;
                                             }
                                          }
                                       } else if (var15 != 3) {
                                          if (~var15 != -5) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var14;
                                       }
                                    }
                                 } else if (~var15 == -3) {
                                    var16 = var14;
                                    if (var2) {
                                       if (var15 != 3) {
                                          if (~var15 != -5) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var14;
                                       }
                                    }
                                 } else if (var15 != 3) {
                                    if (~var15 != -5) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var14;
                                       }
                                    }
                                 } else {
                                    var16 = -var14;
                                 }

                                 if (!(var16 > 0.0F)) {
                                    var17 = 0;
                                    var18 = 0;
                                    var19 = 0;
                                    if (var2) {
                                       var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                       var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = var24 << 24;
                                    var6[var15][var7] = var23 << 24;
                                    var4[var15][var7] = var22 << 24;
                                    ++var15;
                                 }
                              } else if (!(var16 > 0.0F)) {
                                 var17 = 0;
                                 var18 = 0;
                                 var19 = 0;
                                 if (var2) {
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 var5[var15][var7] = var24 << 24;
                                 var6[var15][var7] = var23 << 24;
                                 var4[var15][var7] = var22 << 24;
                                 ++var15;
                              }
                           } else {
                              if (~var15 == -2) {
                                 var16 = var13;
                                 if (var2) {
                                    if (~var15 == -3) {
                                       var16 = var14;
                                       if (var2) {
                                          if (var15 != 3) {
                                             if (~var15 != -5) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var14;
                                          }
                                       }
                                    } else if (var15 != 3) {
                                       if (~var15 != -5) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    } else {
                                       var16 = -var14;
                                    }
                                 }
                              } else if (~var15 == -3) {
                                 var16 = var14;
                                 if (var2) {
                                    if (var15 != 3) {
                                       if (~var15 != -5) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    } else {
                                       var16 = -var14;
                                    }
                                 }
                              } else if (var15 != 3) {
                                 if (~var15 != -5) {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var14;
                                       }
                                    }
                                 } else {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = -var14;
                                    }
                                 }
                              } else {
                                 var16 = -var14;
                              }

                              if (!(var16 > 0.0F)) {
                                 var17 = 0;
                                 var18 = 0;
                                 var19 = 0;
                                 if (var2) {
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 var5[var15][var7] = var24 << 24;
                                 var6[var15][var7] = var23 << 24;
                                 var4[var15][var7] = var22 << 24;
                                 ++var15;
                              }
                           }
                        }

                        while(true) {
                           while(var15 < 6) {
                              if (~var15 == -1) {
                                 var16 = -var13;
                                 if (var2) {
                                    if (~var15 == -2) {
                                       var16 = var13;
                                       if (var2) {
                                          if (~var15 == -3) {
                                             var16 = var14;
                                             if (var2) {
                                                if (var15 != 3) {
                                                   if (~var15 != -5) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = var12;
                                                         if (var2) {
                                                            var16 = -var14;
                                                         }
                                                      }
                                                   } else {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else if (var15 != 3) {
                                             if (~var15 != -5) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var14;
                                          }
                                       }
                                    } else if (~var15 == -3) {
                                       var16 = var14;
                                       if (var2) {
                                          if (var15 != 3) {
                                             if (~var15 != -5) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var14;
                                          }
                                       }
                                    } else if (var15 != 3) {
                                       if (~var15 != -5) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    } else {
                                       var16 = -var14;
                                    }

                                    if (!(var16 > 0.0F)) {
                                       var17 = 0;
                                       var18 = 0;
                                       var19 = 0;
                                       if (var2) {
                                          var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                          var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                          var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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
                                       var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                       var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                       var5[var15][var7] = var24 << 24;
                                       var6[var15][var7] = var23 << 24;
                                       var4[var15][var7] = var22 << 24;
                                       ++var15;
                                    }
                                 } else if (!(var16 > 0.0F)) {
                                    var17 = 0;
                                    var18 = 0;
                                    var19 = 0;
                                    if (var2) {
                                       var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                       var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = var24 << 24;
                                    var6[var15][var7] = var23 << 24;
                                    var4[var15][var7] = var22 << 24;
                                    ++var15;
                                 }
                              } else {
                                 if (~var15 == -2) {
                                    var16 = var13;
                                    if (var2) {
                                       if (~var15 == -3) {
                                          var16 = var14;
                                          if (var2) {
                                             if (var15 != 3) {
                                                if (~var15 != -5) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                } else {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             } else {
                                                var16 = -var14;
                                             }
                                          }
                                       } else if (var15 != 3) {
                                          if (~var15 != -5) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var14;
                                       }
                                    }
                                 } else if (~var15 == -3) {
                                    var16 = var14;
                                    if (var2) {
                                       if (var15 != 3) {
                                          if (~var15 != -5) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var14;
                                       }
                                    }
                                 } else if (var15 != 3) {
                                    if (~var15 != -5) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var14;
                                       }
                                    }
                                 } else {
                                    var16 = -var14;
                                 }

                                 if (!(var16 > 0.0F)) {
                                    var17 = 0;
                                    var18 = 0;
                                    var19 = 0;
                                    if (var2) {
                                       var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                       var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = var24 << 24;
                                    var6[var15][var7] = var23 << 24;
                                    var4[var15][var7] = var22 << 24;
                                    ++var15;
                                 }
                              }
                           }

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           if (~var15 == -2) {
                              var16 = var13;
                              if (var2) {
                                 if (~var15 == -3) {
                                    var16 = var14;
                                    if (var2) {
                                       if (var15 != 3) {
                                          if (~var15 != -5) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var14;
                                       }
                                    }
                                 } else if (var15 != 3) {
                                    if (~var15 != -5) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var14;
                                       }
                                    }
                                 } else {
                                    var16 = -var14;
                                 }
                              }
                           } else if (~var15 == -3) {
                              var16 = var14;
                              if (var2) {
                                 if (var15 != 3) {
                                    if (~var15 != -5) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var14;
                                       }
                                    }
                                 } else {
                                    var16 = -var14;
                                 }
                              }
                           } else if (var15 != 3) {
                              if (~var15 != -5) {
                                 var16 = -var12;
                                 if (var2) {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = -var14;
                                    }
                                 }
                              } else {
                                 var16 = var12;
                                 if (var2) {
                                    var16 = -var14;
                                 }
                              }
                           } else {
                              var16 = -var14;
                           }

                           if (!(var16 > 0.0F)) {
                              var17 = 0;
                              var18 = 0;
                              var19 = 0;
                              if (var2) {
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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
                              var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                              var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                              var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
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

               this.field2659 = new class568[3];
               this.field2659[0] = super.field3498.method1209(64, 1, false, var5);
               this.field2659[1] = super.field3498.method1209(64, 1, false, var6);
               this.field2659[2] = super.field3498.method1209(64, 1, false, var4);
            }
         }
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field2670[5] + (arg0 != null ? field2670[7] : field2670[6]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method70(boolean arg0, boolean arg1) {
      try {
         ++field2658;
         if (!arg0) {
            field2665 = null;
         }

         super.field3498.method2761(class621.field9036, (byte)-69, class641.field9348);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field2670[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "a",
      descriptor = "(IBI)Z"
   )
   public static final boolean method1543(int arg0, byte arg1, int arg2) {
      try {
         ++field2669;
         int var3 = 78 / ((-52 - arg1) / 59);
         return (arg0 & 2048) != 0 && ~(arg2 & 55) != -1;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field2670[3] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "e",
      descriptor = "(I)Z"
   )
   public final boolean method69(int arg0) {
      try {
         if (arg0 != 30453) {
            return false;
         } else {
            ++field2664;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field2670[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method1544(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 107);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!pha",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method1545(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 2;
            break;
         case 1:
            var10005 = 112;
            break;
         case 2:
            var10005 = 118;
            break;
         case 3:
            var10005 = 100;
            break;
         default:
            var10005 = 107;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
