import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tja")
public class class287 extends class567 {
   @OriginalMember(
      owner = "client!tja",
      name = "t",
      descriptor = "Z"
   )
   private boolean field3805;
   @OriginalMember(
      owner = "client!tja",
      name = "u",
      descriptor = "Z"
   )
   private boolean field3806;
   @OriginalMember(
      owner = "client!tja",
      name = "w",
      descriptor = "[Leea;"
   )
   private class142[] field3800;
   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field3808 = new String[]{method2179(method2178("JBD<9\u0016")), method2179(method2178("E\u0006\u000b<\u0000")), method2179(method2178("P]I~")), method2179(method2178("JBD<?\u0016")), method2179(method2178("JBD<8\u0016")), method2179(method2178("JBD<>\u0016")), method2179(method2178("JBD<7\u0016")), method2179(method2178("JBD<<\u0016")), method2179(method2178("JBD<;\u0016")), method2179(method2178("JBD<:\u0016")), method2179(method2178("JBD<AWFLfC\u0016"))};
   @OriginalMember(
      owner = "client!tja",
      name = "s",
      descriptor = "Lafa;"
   )
   public static class365 field3797 = new class365(4, 1);
   @OriginalMember(
      owner = "client!tja",
      name = "p",
      descriptor = "I"
   )
   public static int field3798;
   @OriginalMember(
      owner = "client!tja",
      name = "r",
      descriptor = "I"
   )
   public static int field3799;
   @OriginalMember(
      owner = "client!tja",
      name = "q",
      descriptor = "I"
   )
   public static int field3801;
   @OriginalMember(
      owner = "client!tja",
      name = "x",
      descriptor = "I"
   )
   public static int field3802;
   @OriginalMember(
      owner = "client!tja",
      name = "o",
      descriptor = "I"
   )
   public static int field3803;
   @OriginalMember(
      owner = "client!tja",
      name = "v",
      descriptor = "I"
   )
   public static int field3804;
   @OriginalMember(
      owner = "client!tja",
      name = "y",
      descriptor = "I"
   )
   public static int field3807;

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method1(int arg0, boolean arg1) {
      try {
         super.field7728.method2587(class535.field7314, 42, class449.field6203);
         if (arg0 != -1309) {
            this.field3800 = null;
         }

         ++field3802;
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3808[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(ZLho;I)V"
   )
   public final void method8(boolean arg0, class159 arg1, int arg2) {
      try {
         if (arg0) {
            ++field3801;
            super.field7728.method2581(arg1, -123);
            super.field7728.method2593(0, arg2);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field3808[3] + arg0 + ',' + (arg1 != null ? field3808[1] : field3808[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "g",
      descriptor = "(I)V"
   )
   public final void method3(int arg0) {
      boolean var2 = client.field4273;

      try {
         if (arg0 != 0) {
            this.field3800 = null;
         }

         label29: {
            if (this.field3805) {
               label26: {
                  super.field7728.method2506(1, arg0 ^ 87);
                  super.field7728.method2581((class159)null, 122);
                  super.field7728.method2583(class346.field4961, (byte)15);
                  super.field7728.method2524((byte)-60);
                  if (this.field3806) {
                     super.field7728.method2587(class449.field6203, -99, class449.field6203);
                     super.field7728.method2547(0, class550.field7513, 0);
                     super.field7728.method2592(0, class550.field7513, 0);
                     if (!var2) {
                        break label26;
                     }
                  }

                  super.field7728.method2587(class449.field6203, arg0 + 98, class449.field6203);
                  super.field7728.method2547(0, class550.field7513, arg0);
                  super.field7728.method2506(2, 87);
                  super.field7728.method2587(class449.field6203, 48, class449.field6203);
                  super.field7728.method2547(0, class550.field7513, 0);
                  super.field7728.method2547(1, class529.field7261, 0);
                  super.field7728.method2592(0, class550.field7513, arg0);
                  super.field7728.method2581((class159)null, 27);
               }

               super.field7728.method2506(0, -56);
               this.field3805 = false;
               if (!var2) {
                  break label29;
               }
            }

            super.field7728.method2592(0, class550.field7513, 0);
         }

         ++field3798;
         super.field7728.method2587(class449.field6203, 51, class449.field6203);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field3808[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(IILqh;)Ljk;"
   )
   public static final class663 method2176(int arg0, int arg1, class74 arg2) {
      try {
         ++field3804;
         byte[] var3 = arg2.method733(arg0, (byte)-71);
         int var4 = -107 / ((-38 - arg1) / 47);
         return var3 == null ? null : new class663(var3);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3808[5] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field3808[1] : field3808[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "h",
      descriptor = "(I)V"
   )
   public static void method2177(int arg0) {
      try {
         if (arg0 != 0) {
            field3797 = null;
         }

         field3797 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field3808[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "<init>",
      descriptor = "(Lce;)V"
   )
   public class287(class327 arg0) {
      boolean var2 = client.field4273;
      super(arg0);
      this.field3805 = false;

      try {
         if (arg0.field4593) {
            this.field3806 = arg0.field4643 < 3;
            int var3 = this.field3806 ? 48 : 127;
            int[][] var4 = new int[6][4096];
            int[][] var5 = new int[6][4096];
            int[][] var6 = new int[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && var8 >= 64) {
               this.field3800 = new class142[3];
               this.field3800[0] = super.field7728.method2569(false, var5, 64, 101);
               this.field3800[1] = super.field7728.method2569(false, var6, 64, 124);
               this.field3800[2] = super.field7728.method2569(false, var4, 64, -13);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var9 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float)var8 * 2.0F / 64.0F + -1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var10 * var10 + 1.0F)));
                        float var13 = var10 * var12;
                        float var14 = var11 * var12;
                        int var15 = 0;
                        float var16;
                        byte var17;
                        byte var18;
                        byte var19;
                        int var22;
                        int var23;
                        int var24;
                        if (var2) {
                           if (var15 == 0) {
                              var16 = -var13;
                              if (var2) {
                                 if (~var15 != -2) {
                                    if (~var15 != -3) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (var15 != 4) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          }
                                       } else if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var12;
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

                                 if (!(var16 > 0.0F)) {
                                    var17 = 0;
                                    var18 = 0;
                                    var19 = 0;
                                    if (var2) {
                                       var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 var5[var15][var7] = var24 << 24;
                                 var6[var15][var7] = var23 << 24;
                                 var4[var15][var7] = var22 << 24;
                                 ++var15;
                              }
                           } else {
                              if (~var15 != -2) {
                                 if (~var15 != -3) {
                                    if (~var15 == -4) {
                                       var16 = -var14;
                                       if (var2) {
                                          if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       }
                                    } else if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var14;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var12;
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

                              if (!(var16 > 0.0F)) {
                                 var17 = 0;
                                 var18 = 0;
                                 var19 = 0;
                                 if (var2) {
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                              if (var15 == 0) {
                                 var16 = -var13;
                                 if (var2) {
                                    if (~var15 != -2) {
                                       if (~var15 != -3) {
                                          if (~var15 == -4) {
                                             var16 = -var14;
                                             if (var2) {
                                                if (var15 != 4) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = var14;
                                                         if (var2) {
                                                            var16 = var13;
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                }
                                             }
                                          } else if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = var12;
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

                                    if (!(var16 > 0.0F)) {
                                       var17 = 0;
                                       var18 = 0;
                                       var19 = 0;
                                       if (var2) {
                                          var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                          var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                       var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                       var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = var24 << 24;
                                    var6[var15][var7] = var23 << 24;
                                    var4[var15][var7] = var22 << 24;
                                    ++var15;
                                 }
                              } else {
                                 if (~var15 != -2) {
                                    if (~var15 != -3) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (var15 != 4) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var14;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          }
                                       } else if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var12;
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

                                 if (!(var16 > 0.0F)) {
                                    var17 = 0;
                                    var18 = 0;
                                    var19 = 0;
                                    if (var2) {
                                       var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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

                           if (~var15 != -2) {
                              if (~var15 != -3) {
                                 if (~var15 == -4) {
                                    var16 = -var14;
                                    if (var2) {
                                       if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var14;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var14;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    }
                                 } else if (var15 != 4) {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = var14;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var12;
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

                           if (!(var16 > 0.0F)) {
                              var17 = 0;
                              var18 = 0;
                              var19 = 0;
                              if (var2) {
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
                              var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
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
               } while(var8 < 64);

               this.field3800 = new class142[3];
               this.field3800[0] = super.field7728.method2569(false, var5, 64, 101);
               this.field3800[1] = super.field7728.method2569(false, var6, 64, 124);
               this.field3800[2] = super.field7728.method2569(false, var4, 64, -13);
            }
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field3808[10] + (arg0 != null ? field3808[1] : field3808[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method7(boolean arg0, int arg1) {
      boolean var3 = client.field4273;

      try {
         label32: {
            if (this.field3800 != null && arg0) {
               label28: {
                  super.field7728.method2506(1, -51);
                  super.field7728.method2583(class219.field2733, (byte)40);
                  class251 var4 = super.field7728.method2527(arg1 ^ -10326);
                  var4.method150(1024);
                  super.field7728.method2503((byte)10, class517.field7092);
                  if (this.field3806) {
                     super.field7728.method2587(class535.field7314, -98, class59.field623);
                     super.field7728.method2517(class550.field7513, -1, 0, true, false);
                     super.field7728.method2592(0, class544.field7429, 0);
                     if (!var3) {
                        break label28;
                     }
                  }

                  super.field7728.method2587(class449.field6203, -107, class535.field7314);
                  super.field7728.method2547(0, class529.field7261, 0);
                  super.field7728.method2506(2, -35);
                  super.field7728.method2587(class535.field7314, -101, class59.field623);
                  super.field7728.method2547(0, class529.field7261, 0);
                  super.field7728.method2517(class529.field7261, arg1 + -10287, 1, true, false);
                  super.field7728.method2592(0, class544.field7429, 0);
                  super.field7728.method2581(super.field7728.field4660, arg1 ^ 10294);
               }

               super.field7728.method2506(0, 127);
               this.field3805 = true;
               if (!var3) {
                  break label32;
               }
            }

            super.field7728.method2592(0, class544.field7429, 0);
         }

         ++field3803;
         if (arg1 != 10286) {
            this.method3(116);
         }
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3808[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(B)Z"
   )
   public final boolean method11(byte arg0) {
      try {
         if (arg0 >= -64) {
            return false;
         } else {
            ++field3799;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field3808[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method9(int arg0, int arg1, int arg2) {
      try {
         if (this.field3805) {
            super.field7728.method2506(1, -68);
            super.field7728.method2581(this.field3800[arg2 + -1], 126);
            super.field7728.method2506(0, 0);
         }

         ++field3807;
         int var4 = 73 / ((63 - arg1) / 58);
      } catch (RuntimeException var6) {
         throw class534.method3846(var6, field3808[8] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2178(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 125);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tja",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2179(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 62;
            break;
         case 1:
            var10005 = 40;
            break;
         case 2:
            var10005 = 37;
            break;
         case 3:
            var10005 = 18;
            break;
         default:
            var10005 = 125;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
