import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!tq")
public class class658 extends class757 {
   @OriginalMember(
      owner = "client!tq",
      name = "l",
      descriptor = "Z"
   )
   private boolean field9396;
   @OriginalMember(
      owner = "client!tq",
      name = "q",
      descriptor = "Z"
   )
   private boolean field9395;
   @OriginalMember(
      owner = "client!tq",
      name = "j",
      descriptor = "[Lfh;"
   )
   private class681[] field9391;
   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field9401 = new String[]{method4782(method4781("\u001e#II\u0005")), method4782(method4781("\u001e#IJ\u0005")), method4782(method4781("\u001e#IN\u0005")), method4782(method4781("\u001e#IH\u0005")), method4782(method4781("\u001e#ID\u0005")), method4782(method4781("\u001e#IO\u0005")), method4782(method4781("\u0011|I\"P")), method4782(method4781("\u0004'\u000b`")), method4782(method4781("\u001e#IM\u0005")), method4782(method4781("\u001e#IE\u0005")), method4782(method4781("\u001e#IK\u0005")), method4782(method4781("\u001e#I0D\u0004;\u00132\u0005"))};
   @OriginalMember(
      owner = "client!tq",
      name = "h",
      descriptor = "Lbga;"
   )
   public static class378 field9389 = new class378(44, 4);
   @OriginalMember(
      owner = "client!tq",
      name = "e",
      descriptor = "Lbga;"
   )
   public static class378 field9397 = new class378(47, 4);
   @OriginalMember(
      owner = "client!tq",
      name = "i",
      descriptor = "I"
   )
   public static int field9386;
   @OriginalMember(
      owner = "client!tq",
      name = "r",
      descriptor = "I"
   )
   public static int field9387;
   @OriginalMember(
      owner = "client!tq",
      name = "m",
      descriptor = "I"
   )
   public static int field9388;
   @OriginalMember(
      owner = "client!tq",
      name = "g",
      descriptor = "I"
   )
   public static int field9390;
   @OriginalMember(
      owner = "client!tq",
      name = "p",
      descriptor = "I"
   )
   public static int field9392;
   @OriginalMember(
      owner = "client!tq",
      name = "k",
      descriptor = "I"
   )
   public static int field9394;
   @OriginalMember(
      owner = "client!tq",
      name = "f",
      descriptor = "I"
   )
   public static int field9398;
   @OriginalMember(
      owner = "client!tq",
      name = "o",
      descriptor = "I"
   )
   public static int field9399;
   @OriginalMember(
      owner = "client!tq",
      name = "n",
      descriptor = "I"
   )
   public static int field9400;
   @OriginalMember(
      owner = "client!tq",
      name = "s",
      descriptor = "Laga;"
   )
   private class697 field9393;

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method385(boolean arg0, int arg1) {
      try {
         super.field10974.method4862(7681, 8448, arg1 ^ 432);
         ++field9386;
         if (arg1 != 500) {
            field9397 = null;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9401[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(BILmd;)V"
   )
   public final void method387(byte arg0, int arg1, class573 arg2) {
      try {
         ++field9399;
         super.field10974.method4848(false, arg2);
         if (arg0 != -96) {
            this.method4778(-43);
         }

         super.field10974.method4879(0, arg1);
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9401[8] + arg0 + ',' + arg1 + ',' + (arg2 != null ? field9401[6] : field9401[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method391(int arg0, boolean arg1) {
      try {
         label35: {
            if (this.field9393 == null || !arg1) {
               super.field10974.method4906((byte)26, 770, 0, 34168);
               if (!client.field4273) {
                  break label35;
               }
            }

            if (!this.field9395) {
               super.field10974.method4841(2, 33984);
               super.field10974.method4848(false, super.field10974.field9800);
               super.field10974.method4841(0, 33984);
            }

            this.field9393.method5070('\u0000', 4);
            this.field9396 = true;
         }

         if (arg0 >= 24) {
            ++field9388;
         }
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9401[5] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "(I)Z"
   )
   public final boolean method392(int arg0) {
      try {
         if (arg0 <= 110) {
            this.field9391 = null;
         }

         ++field9390;
         return true;
      } catch (RuntimeException var3) {
         throw class534.method3846(var3, field9401[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method4778(int arg0) {
      boolean var2 = client.field4273;

      try {
         label30: {
            ++field9394;
            this.field9393 = new class697(super.field10974, 2);
            this.field9393.method5069(125, 0);
            super.field10974.method4841(1, 33984);
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
            if (this.field9395) {
               super.field10974.method4862(7681, 260, 30);
               super.field10974.method4901(770, 0, 5890, 5);
               super.field10974.method4906((byte)26, 770, 0, 34167);
               if (!var2) {
                  break label30;
               }
            }

            super.field10974.method4862(8448, 7681, 36);
            super.field10974.method4901(768, 0, 34168, 5);
            super.field10974.method4841(2, 33984);
            super.field10974.method4862(7681, 260, 115);
            super.field10974.method4901(768, 0, 34168, 5);
            super.field10974.method4901(770, 1, 34168, 5);
            super.field10974.method4906((byte)26, 770, 0, 34167);
         }

         super.field10974.method4841(0, 33984);
         this.field9393.method5068((byte)119);
         this.field9393.method5069(112, 1);
         super.field10974.method4841(1, 33984);
         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         OpenGL.glDisable(3170);
         OpenGL.glMatrixMode(5890);
         if (arg0 < 1) {
            this.method388((byte)-3);
         }

         label24: {
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (!this.field9395) {
               super.field10974.method4862(8448, 8448, 33);
               super.field10974.method4901(768, 0, 5890, 5);
               super.field10974.method4841(2, 33984);
               super.field10974.method4862(8448, 8448, 112);
               super.field10974.method4901(768, 0, 5890, 5);
               super.field10974.method4901(768, 1, 34168, 5);
               super.field10974.method4906((byte)26, 770, 0, 5890);
               if (!var2) {
                  break label24;
               }
            }

            super.field10974.method4862(8448, 8448, 41);
            super.field10974.method4901(768, 0, 5890, 5);
            super.field10974.method4906((byte)26, 770, 0, 5890);
         }

         super.field10974.method4841(0, 33984);
         this.field9393.method5068((byte)119);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9401[4] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(B)V"
   )
   public final void method388(byte arg0) {
      try {
         label24: {
            ++field9387;
            if (!this.field9396) {
               super.field10974.method4906((byte)26, 770, 0, 5890);
               if (!client.field4273) {
                  break label24;
               }
            }

            if (!this.field9395) {
               super.field10974.method4841(2, 33984);
               super.field10974.method4848(false, (class573)null);
            }

            super.field10974.method4841(1, 33984);
            super.field10974.method4848(false, (class573)null);
            super.field10974.method4841(0, 33984);
            this.field9393.method5070('\u0001', 4);
            this.field9396 = false;
         }

         super.field10974.method4862(8448, 8448, 105);
         int var2 = -87 / ((48 - arg0) / 63);
      } catch (RuntimeException var4) {
         throw class534.method3846(var4, field9401[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method386(int arg0, int arg1, int arg2) {
      try {
         ++field9392;
         if (this.field9396) {
            super.field10974.method4841(1, 33984);
            super.field10974.method4848(false, this.field9391[arg0 + -1]);
            super.field10974.method4841(0, 33984);
         }

         if (arg1 >= -118) {
            this.method385(false, -122);
         }
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9401[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "b",
      descriptor = "(III)Z"
   )
   public static final boolean method4779(int arg0, int arg1, int arg2) {
      try {
         ++field9398;
         int var3 = -84 / ((arg0 - 54) / 41);
         return ~(16 & arg2) != -1;
      } catch (RuntimeException var5) {
         throw class534.method3846(var5, field9401[10] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4780(int arg0) {
      try {
         field9397 = null;
         if (arg0 != 768) {
            field9400 = 123;
         }

         field9389 = null;
      } catch (RuntimeException var2) {
         throw class534.method3846(var2, field9401[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "<init>",
      descriptor = "(Lor;)V"
   )
   public class658(class670 arg0) {
      boolean var2 = client.field4273;
      super(arg0);
      this.field9396 = false;

      try {
         if (arg0.field9781) {
            this.field9395 = ~arg0.field9763 > -4;
            int var3 = this.field9395 ? 48 : 127;
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            byte[][] var6 = new byte[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && var8 >= 64) {
               this.field9391 = new class681[3];
               this.field9391[0] = new class681(super.field10974, 6406, 64, false, var5, 6406);
               this.field9391[1] = new class681(super.field10974, 6406, 64, false, var6, 6406);
               this.field9391[2] = new class681(super.field10974, 6406, 64, false, var4, 6406);
               this.method4778(91);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || var9 < 64) {
                     do {
                        float var10 = (float)var8 * 2.0F / 64.0F - 1.0F;
                        float var11 = (float)var9 * 2.0F / 64.0F - 1.0F;
                        float var12 = (float)(1.0D / Math.sqrt((double)(var10 * var10 + var11 * var11 + 1.0F)));
                        float var13 = var11 * var12;
                        float var14 = var10 * var12;
                        int var15 = 0;
                        float var16;
                        int var17;
                        int var18;
                        int var19;
                        if (var2) {
                           if (~var15 == -1) {
                              var16 = -var13;
                              if (var2) {
                                 if (var15 != 1) {
                                    if (var15 != 2) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (~var15 != -5) {
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
                                       } else if (~var15 != -5) {
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

                                 if (var16 > 0.0F) {
                                    var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                    var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                              if (var15 != 1) {
                                 if (var15 != 2) {
                                    if (~var15 == -4) {
                                       var16 = -var14;
                                       if (var2) {
                                          if (~var15 != -5) {
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
                                    } else if (~var15 != -5) {
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

                              if (var16 > 0.0F) {
                                 var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                           while(var15 < 6) {
                              if (~var15 == -1) {
                                 var16 = -var13;
                                 if (var2) {
                                    if (var15 != 1) {
                                       if (var15 != 2) {
                                          if (~var15 == -4) {
                                             var16 = -var14;
                                             if (var2) {
                                                if (~var15 != -5) {
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
                                          } else if (~var15 != -5) {
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

                                    if (var16 > 0.0F) {
                                       var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                       var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                       var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                                 if (var15 != 1) {
                                    if (var15 != 2) {
                                       if (~var15 == -4) {
                                          var16 = -var14;
                                          if (var2) {
                                             if (~var15 != -5) {
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
                                       } else if (~var15 != -5) {
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

                                 if (var16 > 0.0F) {
                                    var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                    var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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

                           if (var15 != 1) {
                              if (var15 != 2) {
                                 if (~var15 == -4) {
                                    var16 = -var14;
                                    if (var2) {
                                       if (~var15 != -5) {
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
                                 } else if (~var15 != -5) {
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

                           if (var16 > 0.0F) {
                              var17 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                              var18 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
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
                     } while(var9 < 64);
                  }

                  ++var8;
               } while(var8 < 64);

               this.field9391 = new class681[3];
               this.field9391[0] = new class681(super.field10974, 6406, 64, false, var5, 6406);
               this.field9391[1] = new class681(super.field10974, 6406, 64, false, var6, 6406);
               this.field9391[2] = new class681(super.field10974, 6406, 64, false, var4, 6406);
               this.method4778(91);
            }
         }
      } catch (RuntimeException var21) {
         throw class534.method3846(var21, field9401[11] + (arg0 != null ? field9401[6] : field9401[7]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4781(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 45);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!tq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4782(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 106;
            break;
         case 1:
            var10005 = 82;
            break;
         case 2:
            var10005 = 103;
            break;
         case 3:
            var10005 = 12;
            break;
         default:
            var10005 = 45;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
