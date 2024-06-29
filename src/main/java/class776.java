import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!qc")
public class class776 extends class14 {
   @OriginalMember(
      owner = "client!qc",
      name = "p",
      descriptor = "Z"
   )
   private boolean field11379;
   @OriginalMember(
      owner = "client!qc",
      name = "r",
      descriptor = "Z"
   )
   private boolean field11376;
   @OriginalMember(
      owner = "client!qc",
      name = "w",
      descriptor = "[Lwfa;"
   )
   private class212[] field11377;
   @OriginalMember(
      owner = "client!qc",
      name = "C",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field11389 = new String[]{method5597(method5596(")%LB\u007f")), method5597(method5596("#hL)*")), method5597(method5596("63\u000ek")), method5597(method5596(")%L@\u007f")), method5597(method5596(")%LN\u007f")), method5597(method5596(")%LD\u007f")), method5597(method5596(")%LE\u007f")), method5597(method5596(")%LO\u007f")), method5597(method5596(")%L;>6/\u00169\u007f")), method5597(method5596(")%LF\u007f")), method5597(method5596(")%LM\u007f"))};
   @OriginalMember(
      owner = "client!qc",
      name = "u",
      descriptor = "I"
   )
   public static int field11383 = 1401;
   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "Leg;"
   )
   public static class118 field11375 = new class118(115, 0);
   @OriginalMember(
      owner = "client!qc",
      name = "q",
      descriptor = "[I"
   )
   public static int[] field11386 = new int[]{16, 32, 64, 128};
   @OriginalMember(
      owner = "client!qc",
      name = "x",
      descriptor = "[F"
   )
   public static float[] field11385 = new float[4];
   @OriginalMember(
      owner = "client!qc",
      name = "m",
      descriptor = "I"
   )
   public static int field11373;
   @OriginalMember(
      owner = "client!qc",
      name = "s",
      descriptor = "I"
   )
   public static int field11374;
   @OriginalMember(
      owner = "client!qc",
      name = "v",
      descriptor = "I"
   )
   public static int field11380;
   @OriginalMember(
      owner = "client!qc",
      name = "y",
      descriptor = "I"
   )
   public static int field11381;
   @OriginalMember(
      owner = "client!qc",
      name = "A",
      descriptor = "I"
   )
   public static int field11382;
   @OriginalMember(
      owner = "client!qc",
      name = "o",
      descriptor = "I"
   )
   public static int field11384;
   @OriginalMember(
      owner = "client!qc",
      name = "B",
      descriptor = "I"
   )
   public static int field11387;
   @OriginalMember(
      owner = "client!qc",
      name = "t",
      descriptor = "I"
   )
   public static int field11388;
   @OriginalMember(
      owner = "client!qc",
      name = "n",
      descriptor = "Lcf;"
   )
   private class631 field11378;

   @OriginalMember(
      owner = "client!qc",
      name = "<init>",
      descriptor = "(Lea;)V",
      line = 3
   )
   public class776(class573 arg0) {
      boolean var2 = client.field4360;
      super(arg0);
      this.field11379 = false;

      try {
         if (arg0.field8413) {
            this.field11376 = arg0.field8422 < 3;
            int var3 = this.field11376 ? 48 : 127;
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            byte[][] var6 = new byte[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && var8 >= 64) {
               this.field11377 = new class212[3];
               this.field11377[0] = new class212(super.field157, 6406, 64, false, var5, 6406);
               this.field11377[1] = new class212(super.field157, 6406, 64, false, var6, 6406);
               this.field11377[2] = new class212(super.field157, 6406, 64, false, var4, 6406);
               this.method5594((byte)18);
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
                           if (var15 == 0) {
                              var16 = -var13;
                              if (var2) {
                                 if (var15 != 1) {
                                    if (var15 != 2) {
                                       if (var15 == 3) {
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
                                       var5[var15][var7] = (byte)var24;
                                       var6[var15][var7] = (byte)var23;
                                       var4[var15][var7] = (byte)var22;
                                       ++var15;
                                    } else {
                                       var5[var15][var7] = (byte)var19;
                                       var6[var15][var7] = (byte)var18;
                                       var4[var15][var7] = (byte)var17;
                                       ++var15;
                                    }
                                 } else {
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = (byte)var24;
                                    var6[var15][var7] = (byte)var23;
                                    var4[var15][var7] = (byte)var22;
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
                                    var5[var15][var7] = (byte)var24;
                                    var6[var15][var7] = (byte)var23;
                                    var4[var15][var7] = (byte)var22;
                                    ++var15;
                                 } else {
                                    var5[var15][var7] = (byte)var19;
                                    var6[var15][var7] = (byte)var18;
                                    var4[var15][var7] = (byte)var17;
                                    ++var15;
                                 }
                              } else {
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 var5[var15][var7] = (byte)var24;
                                 var6[var15][var7] = (byte)var23;
                                 var4[var15][var7] = (byte)var22;
                                 ++var15;
                              }
                           } else {
                              if (var15 != 1) {
                                 if (var15 != 2) {
                                    if (var15 == 3) {
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
                                    var5[var15][var7] = (byte)var24;
                                    var6[var15][var7] = (byte)var23;
                                    var4[var15][var7] = (byte)var22;
                                    ++var15;
                                 } else {
                                    var5[var15][var7] = (byte)var19;
                                    var6[var15][var7] = (byte)var18;
                                    var4[var15][var7] = (byte)var17;
                                    ++var15;
                                 }
                              } else {
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 var5[var15][var7] = (byte)var24;
                                 var6[var15][var7] = (byte)var23;
                                 var4[var15][var7] = (byte)var22;
                                 ++var15;
                              }
                           }
                        }

                        while(true) {
                           while(~var15 > -7) {
                              if (var15 == 0) {
                                 var16 = -var13;
                                 if (var2) {
                                    if (var15 != 1) {
                                       if (var15 != 2) {
                                          if (var15 == 3) {
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
                                          var5[var15][var7] = (byte)var24;
                                          var6[var15][var7] = (byte)var23;
                                          var4[var15][var7] = (byte)var22;
                                          ++var15;
                                       } else {
                                          var5[var15][var7] = (byte)var19;
                                          var6[var15][var7] = (byte)var18;
                                          var4[var15][var7] = (byte)var17;
                                          ++var15;
                                       }
                                    } else {
                                       var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                       var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                       var5[var15][var7] = (byte)var24;
                                       var6[var15][var7] = (byte)var23;
                                       var4[var15][var7] = (byte)var22;
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
                                       var5[var15][var7] = (byte)var24;
                                       var6[var15][var7] = (byte)var23;
                                       var4[var15][var7] = (byte)var22;
                                       ++var15;
                                    } else {
                                       var5[var15][var7] = (byte)var19;
                                       var6[var15][var7] = (byte)var18;
                                       var4[var15][var7] = (byte)var17;
                                       ++var15;
                                    }
                                 } else {
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = (byte)var24;
                                    var6[var15][var7] = (byte)var23;
                                    var4[var15][var7] = (byte)var22;
                                    ++var15;
                                 }
                              } else {
                                 if (var15 != 1) {
                                    if (var15 != 2) {
                                       if (var15 == 3) {
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
                                       var5[var15][var7] = (byte)var24;
                                       var6[var15][var7] = (byte)var23;
                                       var4[var15][var7] = (byte)var22;
                                       ++var15;
                                    } else {
                                       var5[var15][var7] = (byte)var19;
                                       var6[var15][var7] = (byte)var18;
                                       var4[var15][var7] = (byte)var17;
                                       ++var15;
                                    }
                                 } else {
                                    var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = (byte)var24;
                                    var6[var15][var7] = (byte)var23;
                                    var4[var15][var7] = (byte)var22;
                                    ++var15;
                                 }
                              }
                           }

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           if (var15 != 1) {
                              if (var15 != 2) {
                                 if (var15 == 3) {
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
                                 var5[var15][var7] = (byte)var24;
                                 var6[var15][var7] = (byte)var23;
                                 var4[var15][var7] = (byte)var22;
                                 ++var15;
                              } else {
                                 var5[var15][var7] = (byte)var19;
                                 var6[var15][var7] = (byte)var18;
                                 var4[var15][var7] = (byte)var17;
                                 ++var15;
                              }
                           } else {
                              var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                              var23 = (int)(Math.pow((double)var16, 36.0D) * (double)var3);
                              var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                              var5[var15][var7] = (byte)var24;
                              var6[var15][var7] = (byte)var23;
                              var4[var15][var7] = (byte)var22;
                              ++var15;
                           }
                        }
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(var8 < 64);

               this.field11377 = new class212[3];
               this.field11377[0] = new class212(super.field157, 6406, 64, false, var5, 6406);
               this.field11377[1] = new class212(super.field157, 6406, 64, false, var6, 6406);
               this.field11377[2] = new class212(super.field157, 6406, 64, false, var4, 6406);
               this.method5594((byte)18);
            }
         }
      } catch (RuntimeException var21) {
         throw class237.method1823(var21, field11389[8] + (arg0 != null ? field11389[1] : field11389[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(I)Z",
      line = 120
   )
   public final boolean method87(int arg0) {
      try {
         ++field11387;
         return arg0 > -49 ? true : true;
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11389[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(B)V",
      line = 131
   )
   private final void method5594(byte arg0) {
      boolean var2 = client.field4360;

      try {
         ++field11388;
         this.field11378 = new class631(super.field157, 2);
         this.field11378.method4569(0, (byte)-84);
         super.field157.method4112((byte)-90, 1);
         OpenGL.glTexGeni(8192, 9472, 34065);
         OpenGL.glTexGeni(8193, 9472, 34065);
         OpenGL.glTexGeni(8194, 9472, 34065);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         OpenGL.glEnable(3170);
         if (arg0 != 18) {
            field11386 = null;
         }

         label29: {
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (this.field11376) {
               super.field157.method4117(260, 7681, -1);
               super.field157.method4096(0, (byte)15, 5890, 770);
               super.field157.method4141(false, 0, 770, 34167);
               if (!var2) {
                  break label29;
               }
            }

            super.field157.method4117(7681, 8448, arg0 ^ -19);
            super.field157.method4096(0, (byte)15, 34168, 768);
            super.field157.method4112((byte)102, 2);
            super.field157.method4117(260, 7681, -1);
            super.field157.method4096(0, (byte)15, 34168, 768);
            super.field157.method4096(1, (byte)15, 34168, 770);
            super.field157.method4141(false, 0, 770, 34167);
         }

         label24: {
            super.field157.method4112((byte)-61, 0);
            this.field11378.method4570(256);
            this.field11378.method4569(1, (byte)-110);
            super.field157.method4112((byte)112, 1);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field11376) {
               super.field157.method4117(8448, 8448, -1);
               super.field157.method4096(0, (byte)15, 5890, 768);
               super.field157.method4112((byte)123, 2);
               super.field157.method4117(8448, 8448, -1);
               super.field157.method4096(0, (byte)15, 5890, 768);
               super.field157.method4096(1, (byte)15, 34168, 768);
               super.field157.method4141(false, 0, 770, 5890);
               if (!var2) {
                  break label24;
               }
            }

            super.field157.method4117(8448, 8448, -1);
            super.field157.method4096(0, (byte)15, 5890, 768);
            super.field157.method4141(false, 0, 770, 5890);
         }

         super.field157.method4112((byte)-9, 0);
         this.field11378.method4570(arg0 ^ 274);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11389[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(BLsl;I)V",
      line = 201
   )
   public final void method86(byte arg0, class486 arg1, int arg2) {
      try {
         super.field157.method4107(-121, arg1);
         ++field11374;
         super.field157.method4134(arg2, 2);
         if (arg0 < 75) {
            this.method87(78);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11389[3] + arg0 + ',' + (arg1 != null ? field11389[1] : field11389[2]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "c",
      descriptor = "(I)V",
      line = 215
   )
   public static void method5595(int arg0) {
      try {
         if (arg0 != 64) {
            method5595(-37);
         }

         field11385 = null;
         field11375 = null;
         field11386 = null;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field11389[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(ZI)V",
      line = 228
   )
   public final void method84(boolean arg0, int arg1) {
      try {
         ++field11382;
         if (arg1 != 13254) {
            this.method86((byte)-58, (class486)null, 95);
         }

         if (this.field11378 != null && arg0) {
            if (!this.field11376) {
               super.field157.method4112((byte)127, 2);
               super.field157.method4107(-127, super.field157.field8454);
               super.field157.method4112((byte)113, 0);
            }

            this.field11378.method4571(false, '\u0000');
            this.field11379 = true;
         } else {
            super.field157.method4141(false, 0, 770, 34168);
         }
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11389[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "b",
      descriptor = "(I)V",
      line = 260
   )
   public final void method85(int arg0) {
      try {
         ++field11380;
         if (arg0 != 17328) {
            field11383 = 96;
         }

         label29: {
            if (!this.field11379) {
               super.field157.method4141(false, 0, 770, 5890);
               if (!client.field4360) {
                  break label29;
               }
            }

            if (!this.field11376) {
               super.field157.method4112((byte)107, 2);
               super.field157.method4107(-118, (class486)null);
            }

            super.field157.method4112((byte)110, 1);
            super.field157.method4107(37, (class486)null);
            super.field157.method4112((byte)-87, 0);
            this.field11378.method4571(false, '\u0001');
            this.field11379 = false;
         }

         super.field157.method4117(8448, 8448, -1);
      } catch (RuntimeException var3) {
         throw class237.method1823(var3, field11389[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(III)V",
      line = 289
   )
   public final void method82(int arg0, int arg1, int arg2) {
      try {
         if (this.field11379) {
            super.field157.method4112((byte)114, 1);
            super.field157.method4107(99, this.field11377[arg1 + -1]);
            super.field157.method4112((byte)-10, 0);
         }

         ++field11373;
         if (arg0 != 13880) {
            this.method84(true, 25);
         }
      } catch (RuntimeException var5) {
         throw class237.method1823(var5, field11389[5] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "a",
      descriptor = "(IZ)V",
      line = 316
   )
   public final void method88(int arg0, boolean arg1) {
      try {
         ++field11384;
         if (arg0 != 16) {
            field11375 = null;
         }

         super.field157.method4117(8448, 7681, arg0 + -17);
      } catch (RuntimeException var4) {
         throw class237.method1823(var4, field11389[9] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method5596(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 87);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!qc",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method5597(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 88;
            break;
         case 1:
            var10005 = 70;
            break;
         case 2:
            var10005 = 98;
            break;
         case 3:
            var10005 = 7;
            break;
         default:
            var10005 = 87;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
