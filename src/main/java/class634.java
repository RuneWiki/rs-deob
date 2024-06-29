import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!ji")
public class class634 extends class316 {
   @OriginalMember(
      owner = "client!ji",
      name = "l",
      descriptor = "Z"
   )
   private boolean field9252;
   @OriginalMember(
      owner = "client!ji",
      name = "e",
      descriptor = "Z"
   )
   private boolean field9244;
   @OriginalMember(
      owner = "client!ji",
      name = "q",
      descriptor = "[Lma;"
   )
   private class14[] field9250;
   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9257 = new String[]{method4655(method4654("#/i\u0007")), method4655(method4654("'3+.)")), method4655(method4654("6t+E|")), method4655(method4654("'3+))")), method4655(method4654("'3+*)")), method4655(method4654("'3+#)")), method4655(method4654("'3+,)")), method4655(method4654("'3+-)")), method4655(method4654("'3+/)")), method4655(method4654("'3+()")), method4655(method4654("'3+Wh#3qU)")), method4655(method4654("'3+\")"))};
   @OriginalMember(
      owner = "client!ji",
      name = "g",
      descriptor = "[I"
   )
   public static int[] field9240 = new int[]{4, 2, 1, 1, 2, 2, 3, 1, 3, 3, 3, 2, 0};
   @OriginalMember(
      owner = "client!ji",
      name = "c",
      descriptor = "Lqia;"
   )
   public static class23 field9243 = new class23(64);
   @OriginalMember(
      owner = "client!ji",
      name = "p",
      descriptor = "Lgh;"
   )
   public static class572 field9254 = new class572(50, -2);
   @OriginalMember(
      owner = "client!ji",
      name = "u",
      descriptor = "I"
   )
   public static int field9238;
   @OriginalMember(
      owner = "client!ji",
      name = "m",
      descriptor = "I"
   )
   public static int field9239;
   @OriginalMember(
      owner = "client!ji",
      name = "s",
      descriptor = "I"
   )
   public static int field9241;
   @OriginalMember(
      owner = "client!ji",
      name = "f",
      descriptor = "I"
   )
   public static int field9242;
   @OriginalMember(
      owner = "client!ji",
      name = "o",
      descriptor = "I"
   )
   public static int field9245;
   @OriginalMember(
      owner = "client!ji",
      name = "n",
      descriptor = "I"
   )
   public static int field9247;
   @OriginalMember(
      owner = "client!ji",
      name = "h",
      descriptor = "I"
   )
   public static int field9248;
   @OriginalMember(
      owner = "client!ji",
      name = "d",
      descriptor = "I"
   )
   public static int field9249;
   @OriginalMember(
      owner = "client!ji",
      name = "k",
      descriptor = "I"
   )
   public static int field9251;
   @OriginalMember(
      owner = "client!ji",
      name = "r",
      descriptor = "Laj;"
   )
   public static class330 field9256;
   @OriginalMember(
      owner = "client!ji",
      name = "t",
      descriptor = "Llt;"
   )
   private class702 field9253;
   @OriginalMember(
      owner = "client!ji",
      name = "j",
      descriptor = "[I"
   )
   public static int[] field9255;
   @OriginalMember(
      owner = "client!ji",
      name = "i",
      descriptor = "[[B"
   )
   public static byte[][] field9246;

   @OriginalMember(
      owner = "client!ji",
      name = "c",
      descriptor = "(I)V",
      line = 7
   )
   public static final void method4651(int param0) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(III)V",
      line = 29
   )
   public final void method810(int arg0, int arg1, int arg2) {
      try {
         ++field9247;
         if (this.field9252) {
            super.field4567.method259(32, 1);
            super.field4567.method252(this.field9250[arg0 + -1], (byte)-84);
            super.field4567.method259(32, 0);
         }

         if (arg2 != 0) {
            this.field9253 = null;
         }
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9257[11] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(B)V",
      line = 50
   )
   private final void method4652(byte arg0) {
      boolean var2 = client.field4564;

      try {
         label26: {
            this.field9253 = new class702(super.field4567, 2);
            ++field9249;
            this.field9253.method5116((byte)111, 0);
            super.field4567.method259(32, 1);
            OpenGL.glTexGeni(8192, 9472, 34065);
            OpenGL.glTexGeni(8193, 9472, 34065);
            int var3 = -72 / ((arg0 - -10) / 33);
            OpenGL.glTexGeni(8194, 9472, 34065);
            OpenGL.glEnable(3168);
            OpenGL.glEnable(3169);
            OpenGL.glEnable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glRotatef(22.5F, 1.0F, 0.0F, 0.0F);
            OpenGL.glMatrixMode(5888);
            if (!this.field9244) {
               super.field4567.method314(7681, 96, 8448);
               super.field4567.method262(0, 768, 8960, 34168);
               super.field4567.method259(32, 2);
               super.field4567.method314(260, -36, 7681);
               super.field4567.method262(0, 768, 8960, 34168);
               super.field4567.method262(1, 770, 8960, 34168);
               super.field4567.method387(0, 34184, 34167, 770);
               if (!var2) {
                  break label26;
               }
            }

            super.field4567.method314(260, -78, 7681);
            super.field4567.method262(0, 770, 8960, 5890);
            super.field4567.method387(0, 34184, 34167, 770);
         }

         label21: {
            super.field4567.method259(32, 0);
            this.field9253.method5115((byte)-113);
            this.field9253.method5116((byte)111, 1);
            super.field4567.method259(32, 1);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field9244) {
               super.field4567.method314(8448, 126, 8448);
               super.field4567.method262(0, 768, 8960, 5890);
               super.field4567.method387(0, 34184, 5890, 770);
               if (!var2) {
                  break label21;
               }
            }

            super.field4567.method314(8448, 122, 8448);
            super.field4567.method262(0, 768, 8960, 5890);
            super.field4567.method259(32, 2);
            super.field4567.method314(8448, 85, 8448);
            super.field4567.method262(0, 768, 8960, 5890);
            super.field4567.method262(1, 768, 8960, 34168);
            super.field4567.method387(0, 34184, 5890, 770);
         }

         super.field4567.method259(32, 0);
         this.field9253.method5115((byte)-49);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9257[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "(I)Z",
      line = 118
   )
   public final boolean method807(int arg0) {
      try {
         ++field9248;
         if (arg0 != -18913) {
            field9256 = null;
         }

         return true;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9257[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(BZ)V",
      line = 129
   )
   public final void method806(byte arg0, boolean arg1) {
      try {
         label30: {
            if (this.field9253 == null || !arg1) {
               super.field4567.method387(0, 34184, 34168, 770);
               if (!client.field4564) {
                  break label30;
               }
            }

            if (!this.field9244) {
               super.field4567.method259(32, 2);
               super.field4567.method252(super.field4567.field819, (byte)-7);
               super.field4567.method259(32, 0);
            }

            this.field9253.method5117('\u0000', 5);
            this.field9252 = true;
         }

         int var3 = 119 / ((-44 - arg0) / 38);
         ++field9239;
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9257[4] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "<init>",
      descriptor = "(Lrk;)V",
      line = 162
   )
   public class634(class35 arg0) {
      boolean var2 = client.field4564;
      super(arg0);
      this.field9252 = false;

      try {
         if (arg0.field769) {
            this.field9244 = arg0.field808 < 3;
            int var3 = this.field9244 ? 48 : 127;
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            byte[][] var6 = new byte[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && ~var8 <= -65) {
               this.field9250 = new class14[3];
               this.field9250[0] = new class14(super.field4567, 6406, 64, false, var5, 6406);
               this.field9250[1] = new class14(super.field4567, 6406, 64, false, var6, 6406);
               this.field9250[2] = new class14(super.field4567, 6406, 64, false, var4, 6406);
               this.method4652((byte)-69);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var8 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float)var9 * 2.0F / 64.0F - 1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + 1.0F)));
                        float var13 = var10 * var12;
                        float var14 = var11 * var12;
                        int var15 = 0;
                        float var16;
                        int var17;
                        int var18;
                        int var19;
                        if (var2) {
                           if (~var15 == -1) {
                              var16 = -var14;
                              if (var2) {
                                 if (~var15 != -2) {
                                    if (~var15 == -3) {
                                       var16 = var13;
                                       if (var2) {
                                          if (var15 == 3) {
                                             var16 = -var13;
                                             if (var2) {
                                                if (~var15 == -5) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = var14;
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                   }
                                                }
                                             }
                                          } else if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    } else if (var15 == 3) {
                                       var16 = -var13;
                                       if (var2) {
                                          if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    } else if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 } else {
                                    var16 = var14;
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

                                 var5[var15][var7] = (byte)var17;
                                 var6[var15][var7] = (byte)var18;
                                 var4[var15][var7] = (byte)var19;
                                 ++var15;
                              } else {
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

                                 var5[var15][var7] = (byte)var17;
                                 var6[var15][var7] = (byte)var18;
                                 var4[var15][var7] = (byte)var19;
                                 ++var15;
                              }
                           } else {
                              if (~var15 != -2) {
                                 if (~var15 == -3) {
                                    var16 = var13;
                                    if (var2) {
                                       if (var15 == 3) {
                                          var16 = -var13;
                                          if (var2) {
                                             if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          }
                                       } else if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    }
                                 } else if (var15 == 3) {
                                    var16 = -var13;
                                    if (var2) {
                                       if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    }
                                 } else if (~var15 == -5) {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 } else {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var14;
                                    }
                                 }
                              } else {
                                 var16 = var14;
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

                              var5[var15][var7] = (byte)var17;
                              var6[var15][var7] = (byte)var18;
                              var4[var15][var7] = (byte)var19;
                              ++var15;
                           }
                        }

                        while(true) {
                           while(~var15 > -7) {
                              if (~var15 == -1) {
                                 var16 = -var14;
                                 if (var2) {
                                    if (~var15 != -2) {
                                       if (~var15 == -3) {
                                          var16 = var13;
                                          if (var2) {
                                             if (var15 == 3) {
                                                var16 = -var13;
                                                if (var2) {
                                                   if (~var15 == -5) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = -var12;
                                                         if (var2) {
                                                            var16 = var14;
                                                         }
                                                      }
                                                   } else {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = var14;
                                                      }
                                                   }
                                                }
                                             } else if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          }
                                       } else if (var15 == 3) {
                                          var16 = -var13;
                                          if (var2) {
                                             if (~var15 == -5) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          }
                                       } else if (~var15 == -5) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    } else {
                                       var16 = var14;
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

                                    var5[var15][var7] = (byte)var17;
                                    var6[var15][var7] = (byte)var18;
                                    var4[var15][var7] = (byte)var19;
                                    ++var15;
                                 } else {
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

                                    var5[var15][var7] = (byte)var17;
                                    var6[var15][var7] = (byte)var18;
                                    var4[var15][var7] = (byte)var19;
                                    ++var15;
                                 }
                              } else {
                                 if (~var15 != -2) {
                                    if (~var15 == -3) {
                                       var16 = var13;
                                       if (var2) {
                                          if (var15 == 3) {
                                             var16 = -var13;
                                             if (var2) {
                                                if (~var15 == -5) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = var14;
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var14;
                                                   }
                                                }
                                             }
                                          } else if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    } else if (var15 == 3) {
                                       var16 = -var13;
                                       if (var2) {
                                          if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    } else if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 } else {
                                    var16 = var14;
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

                                 var5[var15][var7] = (byte)var17;
                                 var6[var15][var7] = (byte)var18;
                                 var4[var15][var7] = (byte)var19;
                                 ++var15;
                              }
                           }

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           if (~var15 != -2) {
                              if (~var15 == -3) {
                                 var16 = var13;
                                 if (var2) {
                                    if (var15 == 3) {
                                       var16 = -var13;
                                       if (var2) {
                                          if (~var15 == -5) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var14;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var14;
                                             }
                                          }
                                       }
                                    } else if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 }
                              } else if (var15 == 3) {
                                 var16 = -var13;
                                 if (var2) {
                                    if (~var15 == -5) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var14;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var14;
                                       }
                                    }
                                 }
                              } else if (~var15 == -5) {
                                 var16 = var12;
                                 if (var2) {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var14;
                                    }
                                 }
                              } else {
                                 var16 = -var12;
                                 if (var2) {
                                    var16 = var14;
                                 }
                              }
                           } else {
                              var16 = var14;
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

                           var5[var15][var7] = (byte)var17;
                           var6[var15][var7] = (byte)var18;
                           var4[var15][var7] = (byte)var19;
                           ++var15;
                        }
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(~var8 > -65);

               this.field9250 = new class14[3];
               this.field9250[0] = new class14(super.field4567, 6406, 64, false, var5, 6406);
               this.field9250[1] = new class14(super.field4567, 6406, 64, false, var6, 6406);
               this.field9250[2] = new class14(super.field4567, 6406, 64, false, var4, 6406);
               this.method4652((byte)-69);
            }
         }
      } catch (RuntimeException var21) {
         throw class608.method4462(var21, field9257[10] + (arg0 != null ? field9257[2] : field9257[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(IILufa;)V",
      line = 279
   )
   public final void method804(int arg0, int arg1, class707 arg2) {
      try {
         if (arg0 != 0) {
            this.field9253 = null;
         }

         ++field9245;
         super.field4567.method252(arg2, (byte)-18);
         super.field4567.method322(-36, arg1);
      } catch (RuntimeException var5) {
         throw class608.method4462(var5, field9257[1] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9257[2] : field9257[0]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "a",
      descriptor = "(I)V",
      line = 291
   )
   public final void method805(int arg0) {
      try {
         label24: {
            if (!this.field9252) {
               super.field4567.method387(0, 34184, 5890, 770);
               if (!client.field4564) {
                  break label24;
               }
            }

            if (!this.field9244) {
               super.field4567.method259(32, 2);
               super.field4567.method252((class707)null, (byte)-99);
            }

            super.field4567.method259(32, 1);
            super.field4567.method252((class707)null, (byte)-91);
            super.field4567.method259(32, 0);
            this.field9253.method5117('\u0001', 5);
            this.field9252 = false;
         }

         int var2 = 50 % ((arg0 - -18) / 63);
         ++field9238;
         super.field4567.method314(8448, 93, 8448);
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9257[6] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "(BZ)V",
      line = 319
   )
   public final void method811(byte arg0, boolean arg1) {
      try {
         super.field4567.method314(8448, -94, 7681);
         if (arg0 == 51) {
            ++field9241;
         }
      } catch (RuntimeException var4) {
         throw class608.method4462(var4, field9257[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "b",
      descriptor = "(B)V",
      line = 331
   )
   public static void method4653(byte arg0) {
      try {
         int var1 = -26 % ((arg0 - 54) / 48);
         field9246 = null;
         field9240 = null;
         field9254 = null;
         field9243 = null;
         field9255 = null;
         field9256 = null;
      } catch (RuntimeException var3) {
         throw class608.method4462(var3, field9257[5] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4654(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 1);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!ji",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4655(char[] arg0) {
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
            var10005 = 90;
            break;
         case 2:
            var10005 = 5;
            break;
         case 3:
            var10005 = 107;
            break;
         default:
            var10005 = 1;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
