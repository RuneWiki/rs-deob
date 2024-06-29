import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!nn")
public class class73 extends class125 {
   @OriginalMember(
      owner = "client!nn",
      name = "o",
      descriptor = "Z"
   )
   private boolean field972;
   @OriginalMember(
      owner = "client!nn",
      name = "j",
      descriptor = "Z"
   )
   private boolean field963;
   @OriginalMember(
      owner = "client!nn",
      name = "l",
      descriptor = "[Lph;"
   )
   private class789[] field965;
   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field973 = new String[]{method713(method712("l\u000f{D!")), method713(method712("l\u000f{H!")), method713(method712("l\u00149a")), method713(method712("l\u000f{I!")), method713(method712("yO{#t")), method713(method712("l\u000f{N!")), method713(method712("l\u000f{K!")), method713(method712("l\u000f{L!")), method713(method712("l\u000f{O!")), method713(method712("l\u000f{1`l\b!3!")), method713(method712("l\u000f{E!")), method713(method712("l\u000f{J!")), method713(method712("l\u000f{G!"))};
   @OriginalMember(
      owner = "client!nn",
      name = "p",
      descriptor = "I"
   )
   public static int field959;
   @OriginalMember(
      owner = "client!nn",
      name = "s",
      descriptor = "I"
   )
   public static int field960;
   @OriginalMember(
      owner = "client!nn",
      name = "m",
      descriptor = "I"
   )
   public static int field961;
   @OriginalMember(
      owner = "client!nn",
      name = "f",
      descriptor = "I"
   )
   public static int field962;
   @OriginalMember(
      owner = "client!nn",
      name = "k",
      descriptor = "I"
   )
   public static int field964;
   @OriginalMember(
      owner = "client!nn",
      name = "i",
      descriptor = "I"
   )
   public static int field966;
   @OriginalMember(
      owner = "client!nn",
      name = "q",
      descriptor = "I"
   )
   public static int field967;
   @OriginalMember(
      owner = "client!nn",
      name = "h",
      descriptor = "I"
   )
   public static int field969;
   @OriginalMember(
      owner = "client!nn",
      name = "r",
      descriptor = "I"
   )
   public static int field970;
   @OriginalMember(
      owner = "client!nn",
      name = "g",
      descriptor = "I"
   )
   public static int field971;
   @OriginalMember(
      owner = "client!nn",
      name = "n",
      descriptor = "Ljea;"
   )
   private class249 field968;

   @OriginalMember(
      owner = "client!nn",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method708(int arg0) {
      boolean var2 = client.field1481;

      try {
         label30: {
            ++field969;
            this.field968 = new class249(super.field1630, 2);
            this.field968.method1977(4864, 0);
            super.field1630.method3988(-128, 1);
            OpenGL.glTexGeni(8192, 9472, 34065);
            OpenGL.glTexGeni(8193, 9472, 34065);
            OpenGL.glTexGeni(8194, 9472, 34065);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (this.field963) {
               super.field1630.method4022(7681, 34161, 260);
               super.field1630.method3959(-99, 770, 5890, 0);
               super.field1630.method3969(0, 34167, (byte)-128, 770);
               if (!var2) {
                  break label30;
               }
            }

            super.field1630.method4022(8448, 34161, 7681);
            super.field1630.method3959(-95, 768, 34168, 0);
            super.field1630.method3988(-128, 2);
            super.field1630.method4022(7681, arg0 + 25713, 260);
            super.field1630.method3959(arg0 ^ -8567, 768, 34168, 0);
            super.field1630.method3959(-115, 770, 34168, 1);
            super.field1630.method3969(0, 34167, (byte)-120, 770);
         }

         super.field1630.method3988(-128, 0);
         this.field968.method1976(-108);
         this.field968.method1977(arg0 + -3584, 1);
         super.field1630.method3988(-128, 1);
         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         OpenGL.glDisable(3170);
         OpenGL.glMatrixMode(5890);
         OpenGL.glLoadIdentity();
         OpenGL.glMatrixMode(5888);
         if (arg0 != 8448) {
            this.field963 = false;
         }

         label24: {
            if (!this.field963) {
               super.field1630.method4022(8448, 34161, 8448);
               super.field1630.method3959(-85, 768, 5890, 0);
               super.field1630.method3988(-128, 2);
               super.field1630.method4022(8448, arg0 ^ 42097, 8448);
               super.field1630.method3959(-100, 768, 5890, 0);
               super.field1630.method3959(-54, 768, 34168, 1);
               super.field1630.method3969(0, 5890, (byte)-123, 770);
               if (!var2) {
                  break label24;
               }
            }

            super.field1630.method4022(8448, arg0 + 25713, 8448);
            super.field1630.method3959(-93, 768, 5890, 0);
            super.field1630.method3969(0, 5890, (byte)-121, 770);
         }

         super.field1630.method3988(-128, 0);
         this.field968.method1976(arg0 ^ -8564);
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field973[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(BIIII)Z"
   )
   public static final boolean method709(byte arg0, int arg1, int arg2, int arg3, int arg4) {
      try {
         if (arg0 != 41) {
            return false;
         } else {
            ++field962;
            if (class613.field9018 && class78.field1042) {
               if (~class516.field7237 > -101) {
                  return false;
               } else if (!class725.method5252(arg3, arg1, arg4, -1)) {
                  return false;
               } else {
                  int var5 = arg4 << class783.field11447;
                  int var6 = arg3 << class783.field11447;
                  if (class280.method2205(var6, arg0 + -155, arg2, class15.field276, var5, class659.field9815[arg1].method3284(-1, arg4, arg3), class15.field276)) {
                     ++class159.field2042;
                     return true;
                  } else {
                     return false;
                  }
               }
            } else {
               return false;
            }
         }
      } catch (RuntimeException var8) {
         throw class93.method866(var8, field973[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(Lll;II)V"
   )
   public final void method345(class549 arg0, int arg1, int arg2) {
      try {
         ++field961;
         super.field1630.method4006(arg0, (byte)-122);
         super.field1630.method4009(arg2, 1);
         if (arg1 != -23385) {
            this.field965 = null;
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field973[3] + (arg0 != null ? field973[4] : field973[2]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "b",
      descriptor = "(Z)Z"
   )
   public final boolean method347(boolean arg0) {
      try {
         ++field967;
         return arg0 ? true : true;
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field973[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(ZII)V"
   )
   public static final void method710(boolean arg0, int arg1, int arg2) {
      try {
         ++field966;
         class197.field2522 = arg2;
         if (!arg0) {
            class429.field5829 = arg1;
            if (~class175.field2258 == -1) {
               class713.field10470 = class136.field1722 * 2 + class197.field2522;
               class345.field4735 = class113.field1509 * 2 + class429.field5829;
            } else if (~class175.field2258 == -2) {
               class674.field9985 = class429.field5829 / class139.field1759 + class293.field4028 + 2;
               class32.field475 = class197.field2522 / class390.field5409 + 2 + class727.field10611;
               class713.field10470 = class390.field5409 * class32.field475;
               class345.field4735 = class674.field9985 * class139.field1759;
               class113.field1509 = class345.field4735 - class429.field5829 >> 1;
               class136.field1722 = class713.field10470 - class197.field2522 >> 1;
            } else if (class175.field2258 == 2) {
               class345.field4735 = class429.field5829;
               class713.field10470 = class197.field2522;
            }
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field973[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "<init>",
      descriptor = "(Liu;)V"
   )
   public class73(class530 arg0) {
      boolean var2 = client.field1481;
      super(arg0);
      this.field972 = false;

      try {
         if (arg0.field7697) {
            this.field963 = arg0.field7717 < 3;
            int var3 = !this.field963 ? 127 : 48;
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            byte[][] var6 = new byte[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && ~var8 <= -65) {
               this.field965 = new class789[3];
               this.field965[0] = new class789(super.field1630, 6406, 64, false, var5, 6406);
               this.field965[1] = new class789(super.field1630, 6406, 64, false, var6, 6406);
               this.field965[2] = new class789(super.field1630, 6406, 64, false, var4, 6406);
               this.method708(8448);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || var9 < 64) {
                     do {
                        float var10 = (float)var9 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float)var8 * 2.0F / 64.0F - 1.0F;
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
                                 if (var15 == 1) {
                                    var16 = var14;
                                    if (var2) {
                                       if (var15 != 2) {
                                          if (var15 == 3) {
                                             var16 = -var13;
                                             if (var2) {
                                                if (var15 != 4) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                } else {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          } else if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       } else {
                                          var16 = var13;
                                       }
                                    }
                                 } else if (var15 != 2) {
                                    if (var15 == 3) {
                                       var16 = -var13;
                                       if (var2) {
                                          if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    } else if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
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
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                 var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                 var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                 var5[var15][var7] = (byte)var24;
                                 var6[var15][var7] = (byte)var23;
                                 var4[var15][var7] = (byte)var22;
                                 ++var15;
                              }
                           } else {
                              if (var15 == 1) {
                                 var16 = var14;
                                 if (var2) {
                                    if (var15 != 2) {
                                       if (var15 == 3) {
                                          var16 = -var13;
                                          if (var2) {
                                             if (var15 != 4) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                    }
                                 }
                              } else if (var15 != 2) {
                                 if (var15 == 3) {
                                    var16 = -var13;
                                    if (var2) {
                                       if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       } else {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    }
                                 } else if (var15 != 4) {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = var13;
                                       }
                                    }
                                 } else {
                                    var16 = var12;
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
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                 var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                              if (~var15 == -1) {
                                 var16 = -var14;
                                 if (var2) {
                                    if (var15 == 1) {
                                       var16 = var14;
                                       if (var2) {
                                          if (var15 != 2) {
                                             if (var15 == 3) {
                                                var16 = -var13;
                                                if (var2) {
                                                   if (var15 != 4) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = var12;
                                                         if (var2) {
                                                            var16 = var13;
                                                         }
                                                      }
                                                   } else {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                }
                                             } else if (var15 != 4) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          } else {
                                             var16 = var13;
                                          }
                                       }
                                    } else if (var15 != 2) {
                                       if (var15 == 3) {
                                          var16 = -var13;
                                          if (var2) {
                                             if (var15 != 4) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             } else {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          }
                                       } else if (var15 != 4) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       } else {
                                          var16 = var12;
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
                                          var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                    var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                                    var5[var15][var7] = (byte)var24;
                                    var6[var15][var7] = (byte)var23;
                                    var4[var15][var7] = (byte)var22;
                                    ++var15;
                                 }
                              } else {
                                 if (var15 == 1) {
                                    var16 = var14;
                                    if (var2) {
                                       if (var15 != 2) {
                                          if (var15 == 3) {
                                             var16 = -var13;
                                             if (var2) {
                                                if (var15 != 4) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = var13;
                                                      }
                                                   }
                                                } else {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                   }
                                                }
                                             }
                                          } else if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       } else {
                                          var16 = var13;
                                       }
                                    }
                                 } else if (var15 != 2) {
                                    if (var15 == 3) {
                                       var16 = -var13;
                                       if (var2) {
                                          if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    } else if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
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
                                       var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                    var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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

                           if (var15 == 1) {
                              var16 = var14;
                              if (var2) {
                                 if (var15 != 2) {
                                    if (var15 == 3) {
                                       var16 = -var13;
                                       if (var2) {
                                          if (var15 != 4) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = var13;
                                                }
                                             }
                                          } else {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = var13;
                                             }
                                          }
                                       }
                                    } else if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = var13;
                                       }
                                    }
                                 } else {
                                    var16 = var13;
                                 }
                              }
                           } else if (var15 != 2) {
                              if (var15 == 3) {
                                 var16 = -var13;
                                 if (var2) {
                                    if (var15 != 4) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = var13;
                                          }
                                       }
                                    } else {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = var13;
                                       }
                                    }
                                 }
                              } else if (var15 != 4) {
                                 var16 = -var12;
                                 if (var2) {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = var13;
                                    }
                                 }
                              } else {
                                 var16 = var12;
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
                                 var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                              var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                              var22 = (int)((double)var3 * Math.pow((double)var16, 12.0D));
                              var5[var15][var7] = (byte)var24;
                              var6[var15][var7] = (byte)var23;
                              var4[var15][var7] = (byte)var22;
                              ++var15;
                           }
                        }
                     } while(var9 < 64);
                  }

                  ++var8;
               } while(~var8 > -65);

               this.field965 = new class789[3];
               this.field965[0] = new class789(super.field1630, 6406, 64, false, var5, 6406);
               this.field965[1] = new class789(super.field1630, 6406, 64, false, var6, 6406);
               this.field965[2] = new class789(super.field1630, 6406, 64, false, var4, 6406);
               this.method708(8448);
            }
         }
      } catch (RuntimeException var21) {
         throw class93.method866(var21, field973[9] + (arg0 != null ? field973[4] : field973[2]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(IB)V"
   )
   public static final void method711(int arg0, byte arg1) {
      boolean var2 = client.field1481;

      try {
         ++field959;
         if (~class562.field8268 != ~arg0) {
            class273.field3491 = class211.field2689 = class213.field2709[arg0];
            class482.method3664(2);
            class9.field191 = new int[class273.field3491][class211.field2689];
            class28.field417 = new int[class273.field3491][class211.field2689];
            class276.field3527 = new int[4][class273.field3491 >> 3][class211.field2689 >> 3];
            int var3 = 0;
            if (var2) {
               class324.field4438[var3] = class274.method2166(class273.field3491, (byte)103, class211.field2689);
               ++var3;
            }

            while(true) {
               while(var3 < 4) {
                  class324.field4438[var3] = class274.method2166(class273.field3491, (byte)103, class211.field2689);
                  ++var3;
               }

               class755.field11063 = new byte[4][class273.field3491][class211.field2689];
               if (!var2) {
                  if (arg1 >= -107) {
                     return;
                  }

                  class791.method5714(class211.field2689, class273.field3491, 116, 4);
                  class754.method5464(class211.field2689 >> 3, class273.field3491 >> 3, class629.field9294, (byte)-104);
                  class562.field8268 = arg0;
                  return;
               }

               ++var3;
            }
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field973[11] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method341(int arg0, int arg1, int arg2) {
      try {
         if (arg0 >= -125) {
            this.method708(-31);
         }

         ++field960;
         if (this.field972) {
            super.field1630.method3988(-128, 1);
            super.field1630.method4006(this.field965[arg2 + -1], (byte)-127);
            super.field1630.method3988(-128, 0);
         }
      } catch (RuntimeException var5) {
         throw class93.method866(var5, field973[6] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method346(boolean arg0, boolean arg1) {
      try {
         super.field1630.method4022(7681, 34161, 8448);
         ++field964;
         if (!arg0) {
            this.field968 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field973[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method343(boolean arg0, int arg1) {
      try {
         label35: {
            ++field970;
            if (this.field968 == null || !arg0) {
               super.field1630.method3969(0, 34168, (byte)-113, 770);
               if (!client.field1481) {
                  break label35;
               }
            }

            if (!this.field963) {
               super.field1630.method3988(arg1 ^ -125, 2);
               super.field1630.method4006(super.field1630.field7784, (byte)22);
               super.field1630.method3988(-128, 0);
            }

            this.field968.method1979('\u0000', -1);
            this.field972 = true;
         }

         if (arg1 != 3) {
            this.field965 = null;
         }
      } catch (RuntimeException var4) {
         throw class93.method866(var4, field973[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "a",
      descriptor = "(I)V"
   )
   public final void method340(int arg0) {
      try {
         ++field971;
         if (arg0 != 5) {
            this.field968 = null;
         }

         label23: {
            if (this.field972) {
               if (!this.field963) {
                  super.field1630.method3988(-128, 2);
                  super.field1630.method4006((class549)null, (byte)-17);
               }

               super.field1630.method3988(-128, 1);
               super.field1630.method4006((class549)null, (byte)106);
               super.field1630.method3988(-128, 0);
               this.field968.method1979('\u0001', arg0 ^ -6);
               this.field972 = false;
               if (!client.field1481) {
                  break label23;
               }
            }

            super.field1630.method3969(0, 5890, (byte)-128, 770);
         }

         super.field1630.method4022(8448, 34161, 8448);
      } catch (RuntimeException var3) {
         throw class93.method866(var3, field973[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method712(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 9);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!nn",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method713(char[] arg0) {
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
            var10005 = 97;
            break;
         case 2:
            var10005 = 85;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 9;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
