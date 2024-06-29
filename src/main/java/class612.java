import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!bo")
public class class612 extends class416 {
   @OriginalMember(
      owner = "client!bo",
      name = "d",
      descriptor = "Z"
   )
   private boolean field8910;
   @OriginalMember(
      owner = "client!bo",
      name = "m",
      descriptor = "Z"
   )
   private boolean field8903;
   @OriginalMember(
      owner = "client!bo",
      name = "p",
      descriptor = "[Lps;"
   )
   private class553[] field8905;
   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8912 = new String[]{method4514(method4513(";zo\u001a\u001a")), method4514(method4513(";zo\u0017\u001a")), method4514(method4513(";zo\u0015\u001a")), method4514(method4513(";zo\u0018\u001a")), method4514(method4513("\";o~O")), method4514(method4513("7`-<")), method4514(method4513(";zo\u0019\u001a")), method4514(method4513(";zol[7|5n\u001a")), method4514(method4513(";zo\u0012\u001a")), method4514(method4513(";zo\u0016\u001a")), method4514(method4513(";zo\u0011\u001a")), method4514(method4513(";zo\u0013\u001a")), method4514(method4513(";zo\u0014\u001a"))};
   @OriginalMember(
      owner = "client!bo",
      name = "h",
      descriptor = "Lnaa;"
   )
   public static class113 field8902 = new class113(25, -1);
   @OriginalMember(
      owner = "client!bo",
      name = "k",
      descriptor = "I"
   )
   public static int field8898;
   @OriginalMember(
      owner = "client!bo",
      name = "g",
      descriptor = "I"
   )
   public static int field8899;
   @OriginalMember(
      owner = "client!bo",
      name = "f",
      descriptor = "I"
   )
   public static int field8900;
   @OriginalMember(
      owner = "client!bo",
      name = "q",
      descriptor = "I"
   )
   public static int field8901;
   @OriginalMember(
      owner = "client!bo",
      name = "j",
      descriptor = "I"
   )
   public static int field8904;
   @OriginalMember(
      owner = "client!bo",
      name = "l",
      descriptor = "I"
   )
   public static int field8906;
   @OriginalMember(
      owner = "client!bo",
      name = "i",
      descriptor = "I"
   )
   public static int field8908;
   @OriginalMember(
      owner = "client!bo",
      name = "e",
      descriptor = "I"
   )
   public static int field8909;
   @OriginalMember(
      owner = "client!bo",
      name = "o",
      descriptor = "I"
   )
   public static int field8911;
   @OriginalMember(
      owner = "client!bo",
      name = "n",
      descriptor = "Luf;"
   )
   private class701 field8907;

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(III)Z",
      line = 4
   )
   public static final boolean method4509(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != 16544) {
            return false;
         } else {
            ++field8909;
            return (arg1 & 2048) != 0 && ~(55 & arg2) != -1;
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8912[1] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(Lil;I)Z",
      line = 17
   )
   public static final boolean method4510(class680 arg0, int arg1) {
      try {
         ++field8908;
         if (arg1 != 8448) {
            field8902 = null;
         }

         return arg0 == null ? false : class404.method3248(-arg0.field10143 + arg0.field10137, -arg0.field10149 + arg0.field10146, arg0.field10140, arg0.field10149, 0, arg0.field10143, arg0.field10148 - arg0.field10140);
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8912[6] + (arg0 != null ? field8912[4] : field8912[5]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(Lvda;IB)V",
      line = 33
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         super.field6445.method4792(-26367, arg0);
         ++field8899;
         super.field6445.method4765(arg1, (byte)-3);
         if (arg2 > -29) {
            this.field8910 = false;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8912[9] + (arg0 != null ? field8912[4] : field8912[5]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "c",
      descriptor = "(B)V",
      line = 47
   )
   public final void method1827(byte arg0) {
      try {
         label24: {
            if (this.field8910) {
               if (!this.field8903) {
                  super.field6445.method4787(-100, 2);
                  super.field6445.method4792(-26367, (class799)null);
               }

               super.field6445.method4787(arg0 ^ -26, 1);
               super.field6445.method4792(-26367, (class799)null);
               super.field6445.method4787(-59, 0);
               this.field8907.method5160((byte)-76, '\u0001');
               this.field8910 = false;
               if (!client.field1786) {
                  break label24;
               }
            }

            super.field6445.method4737(105, 0, 770, 5890);
         }

         if (arg0 == 77) {
            ++field8898;
            super.field6445.method4803(8448, 8448, true);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field8912[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(I)V",
      line = 75
   )
   public static void method4511(int arg0) {
      try {
         field8902 = null;
         if (arg0 != 770) {
            field8902 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field8912[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(III)V",
      line = 86
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      try {
         if (this.field8910) {
            super.field6445.method4787(-62, 1);
            super.field6445.method4792(-26367, this.field8905[arg2 + -1]);
            super.field6445.method4787(-92, 0);
         }

         ++field8904;
         if (arg1 > -90) {
            this.field8910 = false;
         }
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field8912[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(I)V",
      line = 104
   )
   private final void method4512(int arg0) {
      boolean var2 = client.field1786;

      try {
         label30: {
            this.field8907 = new class701(super.field6445, 2);
            ++field8906;
            this.field8907.method5162(0, -6177);
            super.field6445.method4787(-108, 1);
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
            if (!this.field8903) {
               super.field6445.method4803(7681, 8448, true);
               super.field6445.method4809(768, (byte)-128, 34168, 0);
               super.field6445.method4787(-70, 2);
               super.field6445.method4803(260, 7681, true);
               super.field6445.method4809(768, (byte)-128, 34168, 0);
               super.field6445.method4809(770, (byte)-128, 34168, 1);
               super.field6445.method4737(108, 0, 770, 34167);
               if (!var2) {
                  break label30;
               }
            }

            super.field6445.method4803(260, 7681, true);
            super.field6445.method4809(770, (byte)-128, 5890, 0);
            super.field6445.method4737(105, 0, 770, 34167);
         }

         super.field6445.method4787(-38, 0);
         this.field8907.method5163(-3623);
         if (arg0 < -107) {
            label24: {
               this.field8907.method5162(1, -6177);
               super.field6445.method4787(-81, 1);
               OpenGL.glDisable(3168);
               OpenGL.glDisable(3169);
               OpenGL.glDisable(3170);
               OpenGL.glMatrixMode(5890);
               OpenGL.glLoadIdentity();
               OpenGL.glMatrixMode(5888);
               if (!this.field8903) {
                  super.field6445.method4803(8448, 8448, true);
                  super.field6445.method4809(768, (byte)-128, 5890, 0);
                  super.field6445.method4787(-93, 2);
                  super.field6445.method4803(8448, 8448, true);
                  super.field6445.method4809(768, (byte)-128, 5890, 0);
                  super.field6445.method4809(768, (byte)-128, 34168, 1);
                  super.field6445.method4737(104, 0, 770, 5890);
                  if (!var2) {
                     break label24;
                  }
               }

               super.field6445.method4803(8448, 8448, true);
               super.field6445.method4809(768, (byte)-128, 5890, 0);
               super.field6445.method4737(110, 0, 770, 5890);
            }

            super.field6445.method4787(-48, 0);
            this.field8907.method5163(-3623);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8912[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(ZI)V",
      line = 173
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         label35: {
            if (this.field8907 == null || !arg0) {
               super.field6445.method4737(109, 0, 770, 34168);
               if (!client.field1786) {
                  break label35;
               }
            }

            if (!this.field8903) {
               super.field6445.method4787(-115, 2);
               super.field6445.method4792(-26367, super.field6445.field9670);
               super.field6445.method4787(arg1 + -3330, 0);
            }

            this.field8907.method5160((byte)-76, '\u0000');
            this.field8910 = true;
         }

         ++field8900;
         if (arg1 != 3211) {
            this.method1827((byte)115);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8912[3] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "<init>",
      descriptor = "(Lc;)V",
      line = 198
   )
   public class612(class652 arg0) {
      boolean var2 = client.field1786;
      super(arg0);
      this.field8910 = false;

      try {
         if (arg0.field9654) {
            this.field8903 = arg0.field9704 < 3;
            int var3 = this.field8903 ? 48 : 127;
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            byte[][] var6 = new byte[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && ~var8 <= -65) {
               this.field8905 = new class553[3];
               this.field8905[0] = new class553(super.field6445, 6406, 64, false, var5, 6406);
               this.field8905[1] = new class553(super.field6445, 6406, 64, false, var6, 6406);
               this.field8905[2] = new class553(super.field6445, 6406, 64, false, var4, 6406);
               this.method4512(-108);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var8 * 2.0F / 64.0F + -1.0F;
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
                           if (var15 == 0) {
                              var16 = -var14;
                              if (var2) {
                                 if (var15 == 1) {
                                    var16 = var14;
                                    if (var2) {
                                       if (~var15 == -3) {
                                          var16 = var13;
                                          if (var2) {
                                             if (var15 != 3) {
                                                if (var15 == 4) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = -var13;
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var13;
                                             }
                                          }
                                       } else if (var15 != 3) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                       }
                                    }
                                 } else if (~var15 == -3) {
                                    var16 = var13;
                                    if (var2) {
                                       if (var15 != 3) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                       }
                                    }
                                 } else if (var15 != 3) {
                                    if (var15 == 4) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 } else {
                                    var16 = -var13;
                                 }

                                 if (var16 > 0.0F) {
                                    var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
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
                                    var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
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
                              if (var15 == 1) {
                                 var16 = var14;
                                 if (var2) {
                                    if (~var15 == -3) {
                                       var16 = var13;
                                       if (var2) {
                                          if (var15 != 3) {
                                             if (var15 == 4) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var13;
                                          }
                                       }
                                    } else if (var15 != 3) {
                                       if (var15 == 4) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var13;
                                    }
                                 }
                              } else if (~var15 == -3) {
                                 var16 = var13;
                                 if (var2) {
                                    if (var15 != 3) {
                                       if (var15 == 4) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var13;
                                    }
                                 }
                              } else if (var15 != 3) {
                                 if (var15 == 4) {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 } else {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = -var13;
                                    }
                                 }
                              } else {
                                 var16 = -var13;
                              }

                              if (var16 > 0.0F) {
                                 var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
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
                           while(~var15 > -7) {
                              if (var15 == 0) {
                                 var16 = -var14;
                                 if (var2) {
                                    if (var15 == 1) {
                                       var16 = var14;
                                       if (var2) {
                                          if (~var15 == -3) {
                                             var16 = var13;
                                             if (var2) {
                                                if (var15 != 3) {
                                                   if (var15 == 4) {
                                                      var16 = var12;
                                                      if (var2) {
                                                         var16 = -var12;
                                                         if (var2) {
                                                            var16 = -var13;
                                                         }
                                                      }
                                                   } else {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = -var13;
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else if (var15 != 3) {
                                             if (var15 == 4) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var13;
                                          }
                                       }
                                    } else if (~var15 == -3) {
                                       var16 = var13;
                                       if (var2) {
                                          if (var15 != 3) {
                                             if (var15 == 4) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var13;
                                          }
                                       }
                                    } else if (var15 != 3) {
                                       if (var15 == 4) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var13;
                                    }

                                    if (var16 > 0.0F) {
                                       var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
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
                                       var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
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
                                 if (var15 == 1) {
                                    var16 = var14;
                                    if (var2) {
                                       if (~var15 == -3) {
                                          var16 = var13;
                                          if (var2) {
                                             if (var15 != 3) {
                                                if (var15 == 4) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = -var13;
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = -var13;
                                                   }
                                                }
                                             } else {
                                                var16 = -var13;
                                             }
                                          }
                                       } else if (var15 != 3) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                       }
                                    }
                                 } else if (~var15 == -3) {
                                    var16 = var13;
                                    if (var2) {
                                       if (var15 != 3) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                       }
                                    }
                                 } else if (var15 != 3) {
                                    if (var15 == 4) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 } else {
                                    var16 = -var13;
                                 }

                                 if (var16 > 0.0F) {
                                    var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
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

                           if (var15 == 1) {
                              var16 = var14;
                              if (var2) {
                                 if (~var15 == -3) {
                                    var16 = var13;
                                    if (var2) {
                                       if (var15 != 3) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = -var13;
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = -var13;
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                       }
                                    }
                                 } else if (var15 != 3) {
                                    if (var15 == 4) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 } else {
                                    var16 = -var13;
                                 }
                              }
                           } else if (~var15 == -3) {
                              var16 = var13;
                              if (var2) {
                                 if (var15 != 3) {
                                    if (var15 == 4) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = -var13;
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = -var13;
                                       }
                                    }
                                 } else {
                                    var16 = -var13;
                                 }
                              }
                           } else if (var15 != 3) {
                              if (var15 == 4) {
                                 var16 = var12;
                                 if (var2) {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = -var13;
                                    }
                                 }
                              } else {
                                 var16 = -var12;
                                 if (var2) {
                                    var16 = -var13;
                                 }
                              }
                           } else {
                              var16 = -var13;
                           }

                           if (var16 > 0.0F) {
                              var17 = (int)(Math.pow((double)var16, 96.0D) * (double)var3);
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
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(~var8 > -65);

               this.field8905 = new class553[3];
               this.field8905[0] = new class553(super.field6445, 6406, 64, false, var5, 6406);
               this.field8905[1] = new class553(super.field6445, 6406, 64, false, var6, 6406);
               this.field8905[2] = new class553(super.field6445, 6406, 64, false, var4, 6406);
               this.method4512(-108);
            }
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field8912[7] + (arg0 != null ? field8912[4] : field8912[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "b",
      descriptor = "(B)Z",
      line = 315
   )
   public final boolean method1830(byte arg0) {
      try {
         ++field8911;
         int var2 = 107 / ((arg0 - -8) / 57);
         return true;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8912[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "a",
      descriptor = "(ZZ)V",
      line = 329
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         ++field8901;
         if (!arg0) {
            super.field6445.method4803(8448, 7681, true);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field8912[8] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4513(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 50);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!bo",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4514(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 89;
            break;
         case 1:
            var10005 = 21;
            break;
         case 2:
            var10005 = 65;
            break;
         case 3:
            var10005 = 80;
            break;
         default:
            var10005 = 50;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
