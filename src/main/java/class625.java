import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!av")
public class class625 extends class515 {
   @OriginalMember(
      owner = "client!av",
      name = "r",
      descriptor = "Z"
   )
   private boolean field8934;
   @OriginalMember(
      owner = "client!av",
      name = "h",
      descriptor = "Z"
   )
   private boolean field8919;
   @OriginalMember(
      owner = "client!av",
      name = "o",
      descriptor = "[Lcfa;"
   )
   private class763[] field8923;
   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field8935 = new String[]{method4604(method4603("*l9\u001d\u0015")), method4604(method4603("*l9\u0017\u0015")), method4604(method4603("*l9\u0010\u0015")), method4604(method4603("%o{9")), method4604(method4603("*l9\u0016\u0015")), method4604(method4603("049{@")), method4604(method4603("*l9\u0019\u0015")), method4604(method4603("*l9\u0013\u0015")), method4604(method4603("*l9\u001f\u0015")), method4604(method4603("*l9\u0014\u0015")), method4604(method4603("*l9\u001e\u0015")), method4604(method4603("*l9iT%sck\u0015")), method4604(method4603("*l9\u0011\u0015")), method4604(method4603("*l9\u001c\u0015")), method4604(method4603("*l9\u0012\u0015"))};
   @OriginalMember(
      owner = "client!av",
      name = "p",
      descriptor = "I"
   )
   public static int field8920;
   @OriginalMember(
      owner = "client!av",
      name = "l",
      descriptor = "I"
   )
   public static int field8921;
   @OriginalMember(
      owner = "client!av",
      name = "m",
      descriptor = "I"
   )
   public static int field8922;
   @OriginalMember(
      owner = "client!av",
      name = "f",
      descriptor = "I"
   )
   public static int field8924;
   @OriginalMember(
      owner = "client!av",
      name = "n",
      descriptor = "I"
   )
   public static int field8925;
   @OriginalMember(
      owner = "client!av",
      name = "g",
      descriptor = "I"
   )
   public static int field8927;
   @OriginalMember(
      owner = "client!av",
      name = "s",
      descriptor = "I"
   )
   public static int field8929;
   @OriginalMember(
      owner = "client!av",
      name = "q",
      descriptor = "I"
   )
   public static int field8930;
   @OriginalMember(
      owner = "client!av",
      name = "i",
      descriptor = "I"
   )
   public static int field8931;
   @OriginalMember(
      owner = "client!av",
      name = "u",
      descriptor = "I"
   )
   public static int field8932;
   @OriginalMember(
      owner = "client!av",
      name = "j",
      descriptor = "I"
   )
   public static int field8933;
   @OriginalMember(
      owner = "client!av",
      name = "t",
      descriptor = "Lsa;"
   )
   public static class39 field8928;
   @OriginalMember(
      owner = "client!av",
      name = "k",
      descriptor = "Lgca;"
   )
   private class50 field8926;

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(I)Z"
   )
   public final boolean method135(int arg0) {
      try {
         ++field8920;
         if (arg0 != 19455) {
            method4602((class17)null, -125);
         }

         return true;
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8935[7] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(IIZILsa;II)V"
   )
   public static final void method4597(int arg0, int arg1, boolean arg2, int arg3, class39 arg4, int arg5, int arg6) {
      try {
         class705.field10146 = arg2;
         class487.field6949 = 1;
         if (arg5 < -39) {
            class790.field11504 = arg3;
            class681.field9845 = arg1;
            class10.field165 = arg6;
            class438.field6424 = arg0;
            ++field8924;
            class778.field11344 = null;
            class563.field8019 = arg4;
         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8935[8] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + (arg4 != null ? field8935[5] : field8935[3]) + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(IBI)V"
   )
   public final void method137(int arg0, byte arg1, int arg2) {
      try {
         ++field8925;
         int var4 = 15 / ((arg1 - -57) / 60);
         if (this.field8934) {
            super.field7307.method4958(1, false);
            super.field7307.method4906(-2, this.field8923[arg2 + -1]);
            super.field7307.method4958(0, false);
         }
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8935[2] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(ILln;I)V"
   )
   public final void method131(int arg0, class719 arg1, int arg2) {
      try {
         int var4 = -86 / ((arg0 - -44) / 41);
         ++field8932;
         super.field7307.method4906(-2, arg1);
         super.field7307.method4947(false, arg2);
      } catch (RuntimeException var6) {
         throw class612.method4503(var6, field8935[9] + arg0 + ',' + (arg1 != null ? field8935[5] : field8935[3]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "d",
      descriptor = "(I)V"
   )
   public static void method4598(int arg0) {
      try {
         field8928 = null;
         if (arg0 != 127) {
            method4600((class91)null, (byte)18);
         }
      } catch (RuntimeException var2) {
         throw class612.method4503(var2, field8935[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(ILjava/lang/String;)V"
   )
   public static final void method4599(int arg0, String arg1) {
      try {
         ++field8922;
         if (class361.field5338 != null) {
            ++class674.field9442;
            class242 var2 = class735.method5318(-125);
            class381 var3 = class801.method5775(class667.field9380, 0, var2.field3718);
            if (arg0 > -108) {
               method4600((class91)null, (byte)-114);
            }

            var3.field5570.method656((byte)-111, class519.method3880(false, arg1));
            var3.field5570.method658(arg1, -119);
            var2.method2111(14024, var3);
         }
      } catch (RuntimeException var5) {
         throw class612.method4503(var5, field8935[14] + arg0 + ',' + (arg1 != null ? field8935[5] : field8935[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(Ljga;B)V"
   )
   public static final void method4600(class91 arg0, byte arg1) {
      try {
         if (arg1 < 55) {
            method4598(5);
         }

         ++field8931;
         if (class399.field5925 == arg0.field1418) {
            if (class117.field1849.field2402 == null) {
               arg0.field1396 = 0;
               arg0.field1364 = 0;
            } else {
               arg0.field1380 = 150;
               arg0.field1379 = 2047 & (int)(Math.sin((double)class51.field770 / 40.0D) * 256.0D);
               arg0.field1396 = class394.field5731;
               arg0.field1489 = 5;
               arg0.field1364 = class627.method4611(class117.field1849.field2402, (byte)-123);
               class258 var2 = class117.field1849.field5801;
               if (var2 != null) {
                  if (arg0.field1337 == null) {
                     arg0.field1337 = new class80();
                  }

                  arg0.field1350 = var2.method2218(false);
                  arg0.field1337.method2210(var2, -1);
               } else {
                  arg0.field1337 = null;
               }
            }
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8935[6] + (arg0 != null ? field8935[5] : field8935[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "c",
      descriptor = "(I)V"
   )
   private final void method4601(int arg0) {
      boolean var2 = client.field10022;

      try {
         label30: {
            this.field8926 = new class50(super.field7307, 2);
            ++field8933;
            this.field8926.method544(0, 57);
            super.field7307.method4958(1, false);
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
            if (this.field8919) {
               super.field7307.method4931(260, 7681, 0);
               super.field7307.method4909(5890, 770, 0, (byte)73);
               super.field7307.method4933(770, 34167, 0, true);
               if (!var2) {
                  break label30;
               }
            }

            super.field7307.method4931(7681, 8448, 0);
            super.field7307.method4909(34168, 768, 0, (byte)-102);
            super.field7307.method4958(2, false);
            super.field7307.method4931(260, 7681, 0);
            super.field7307.method4909(34168, 768, 0, (byte)29);
            super.field7307.method4909(34168, 770, 1, (byte)-120);
            super.field7307.method4933(770, 34167, 0, true);
         }

         super.field7307.method4958(0, false);
         this.field8926.method545((byte)93);
         this.field8926.method544(1, 97);
         super.field7307.method4958(1, false);
         if (arg0 == -5236) {
            label24: {
               OpenGL.glDisable(3168);
               OpenGL.glDisable(3169);
               OpenGL.glDisable(3170);
               OpenGL.glMatrixMode(5890);
               OpenGL.glLoadIdentity();
               OpenGL.glMatrixMode(5888);
               if (!this.field8919) {
                  super.field7307.method4931(8448, 8448, 0);
                  super.field7307.method4909(5890, 768, 0, (byte)-127);
                  super.field7307.method4958(2, false);
                  super.field7307.method4931(8448, 8448, 0);
                  super.field7307.method4909(5890, 768, 0, (byte)18);
                  super.field7307.method4909(34168, 768, 1, (byte)-109);
                  super.field7307.method4933(770, 5890, 0, true);
                  if (!var2) {
                     break label24;
                  }
               }

               super.field7307.method4931(8448, 8448, 0);
               super.field7307.method4909(5890, 768, 0, (byte)-101);
               super.field7307.method4933(770, 5890, 0, true);
            }

            super.field7307.method4958(0, false);
            this.field8926.method545((byte)93);
         }
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8935[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method136(boolean arg0, int arg1) {
      try {
         label27: {
            if (this.field8926 != null && arg0) {
               if (!this.field8919) {
                  super.field7307.method4958(2, false);
                  super.field7307.method4906(arg1 + -5, super.field7307.field9719);
                  super.field7307.method4958(0, false);
               }

               this.field8926.method547('\u0000', true);
               this.field8934 = true;
               if (!client.field10022) {
                  break label27;
               }
            }

            super.field7307.method4933(770, 34168, 0, true);
         }

         if (arg1 != 3) {
            field8928 = null;
         }

         ++field8929;
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8935[1] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "<init>",
      descriptor = "(Laea;)V"
   )
   public class625(class678 arg0) {
      boolean var2 = client.field10022;
      super(arg0);
      this.field8934 = false;

      try {
         if (arg0.field9819) {
            this.field8919 = ~arg0.field9811 > -4;
            int var3 = this.field8919 ? 48 : 127;
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            byte[][] var6 = new byte[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (!var2 && ~var8 <= -65) {
               this.field8923 = new class763[3];
               this.field8923[0] = new class763(super.field7307, 6406, 64, false, var5, 6406);
               this.field8923[1] = new class763(super.field7307, 6406, 64, false, var6, 6406);
               this.field8923[2] = new class763(super.field7307, 6406, 64, false, var4, 6406);
               this.method4601(-5236);
            } else {
               do {
                  int var9 = 0;
                  if (var2 || ~var9 > -65) {
                     do {
                        float var10 = (float)var9 * 2.0F / 64.0F + -1.0F;
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
                           if (var15 != 0) {
                              if (var15 == 1) {
                                 var16 = var14;
                                 if (var2) {
                                    if (~var15 != -3) {
                                       if (~var15 == -4) {
                                          var16 = -var13;
                                          if (var2) {
                                             if (var15 == 4) {
                                                var16 = var12;
                                                if (var2) {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                      if (var2) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             } else {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             }
                                          }
                                       } else if (var15 == 4) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                       if (var2) {
                                          var16 = -var14;
                                       }
                                    }
                                 }
                              } else if (~var15 != -3) {
                                 if (~var15 == -4) {
                                    var16 = -var13;
                                    if (var2) {
                                       if (var15 == 4) {
                                          var16 = var12;
                                          if (var2) {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       }
                                    }
                                 } else if (var15 == 4) {
                                    var16 = var12;
                                    if (var2) {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var13;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = -var12;
                                    if (var2) {
                                       var16 = var13;
                                       if (var2) {
                                          var16 = -var14;
                                       }
                                    }
                                 }
                              } else {
                                 var16 = var13;
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
                                 var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
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
                              var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                              var5[var15][var7] = (byte)var24;
                              var6[var15][var7] = (byte)var23;
                              var4[var15][var7] = (byte)var22;
                              ++var15;
                           }
                        }

                        while(true) {
                           while(var15 < 6) {
                              if (var15 != 0) {
                                 if (var15 == 1) {
                                    var16 = var14;
                                    if (var2) {
                                       if (~var15 != -3) {
                                          if (~var15 == -4) {
                                             var16 = -var13;
                                             if (var2) {
                                                if (var15 == 4) {
                                                   var16 = var12;
                                                   if (var2) {
                                                      var16 = -var12;
                                                      if (var2) {
                                                         var16 = var13;
                                                         if (var2) {
                                                            var16 = -var14;
                                                         }
                                                      }
                                                   }
                                                } else {
                                                   var16 = -var12;
                                                   if (var2) {
                                                      var16 = var13;
                                                      if (var2) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             }
                                          } else if (var15 == 4) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = var13;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    }
                                 } else if (~var15 != -3) {
                                    if (~var15 == -4) {
                                       var16 = -var13;
                                       if (var2) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2) {
                                                var16 = -var12;
                                                if (var2) {
                                                   var16 = var13;
                                                   if (var2) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2) {
                                                var16 = var13;
                                                if (var2) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       }
                                    } else if (var15 == 4) {
                                       var16 = var12;
                                       if (var2) {
                                          var16 = -var12;
                                          if (var2) {
                                             var16 = var13;
                                             if (var2) {
                                                var16 = -var14;
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = -var12;
                                       if (var2) {
                                          var16 = var13;
                                          if (var2) {
                                             var16 = -var14;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var13;
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
                                    var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
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
                                 var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                                 var5[var15][var7] = (byte)var24;
                                 var6[var15][var7] = (byte)var23;
                                 var4[var15][var7] = (byte)var22;
                                 ++var15;
                              }
                           }

                           ++var7;
                           if (!var2) {
                              ++var9;
                              break;
                           }

                           var16 = -var14;
                           if (!(var16 > 0.0F)) {
                              var17 = 0;
                              var18 = 0;
                              var19 = 0;
                              if (var2) {
                                 var24 = (int)((double)var3 * Math.pow((double)var16, 96.0D));
                                 var23 = (int)((double)var3 * Math.pow((double)var16, 36.0D));
                                 var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
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
                              var22 = (int)(Math.pow((double)var16, 12.0D) * (double)var3);
                              var5[var15][var7] = (byte)var24;
                              var6[var15][var7] = (byte)var23;
                              var4[var15][var7] = (byte)var22;
                              ++var15;
                           }
                        }
                     } while(~var9 > -65);
                  }

                  ++var8;
               } while(~var8 > -65);

               this.field8923 = new class763[3];
               this.field8923[0] = new class763(super.field7307, 6406, 64, false, var5, 6406);
               this.field8923[1] = new class763(super.field7307, 6406, 64, false, var6, 6406);
               this.field8923[2] = new class763(super.field7307, 6406, 64, false, var4, 6406);
               this.method4601(-5236);
            }
         }
      } catch (RuntimeException var21) {
         throw class612.method4503(var21, field8935[11] + (arg0 != null ? field8935[5] : field8935[3]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(Lha;I)V"
   )
   public static final void method4602(class17 arg0, int arg1) {
      boolean var2 = client.field10022;

      try {
         ++field8921;
         class61.field873 = new class24[class556.field7901.length];
         int var3 = arg1;
         if (var2 || ~arg1 > ~class556.field7901.length) {
            do {
               int var4 = class556.field7901[var3];
               class440 var5 = class604.method4453(var4, 29306, class793.field11535);
               class216 var6 = arg0.method170(var5, class433.method3381(class222.field3159, var4), true);
               class61.field873[var3] = new class24(var6, var5);
               ++var3;
            } while(~var3 > ~class556.field7901.length);

         }
      } catch (RuntimeException var8) {
         throw class612.method4503(var8, field8935[4] + (arg0 != null ? field8935[5] : field8935[3]) + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(IZ)V"
   )
   public final void method132(int arg0, boolean arg1) {
      try {
         ++field8930;
         if (arg0 != -15) {
            this.field8923 = null;
         }

         super.field7307.method4931(8448, 7681, arg0 + 15);
      } catch (RuntimeException var4) {
         throw class612.method4503(var4, field8935[13] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "a",
      descriptor = "(Z)V"
   )
   public final void method133(boolean arg0) {
      try {
         label24: {
            if (this.field8934) {
               if (!this.field8919) {
                  super.field7307.method4958(2, false);
                  super.field7307.method4906(-2, (class719)null);
               }

               super.field7307.method4958(1, arg0);
               super.field7307.method4906(-2, (class719)null);
               super.field7307.method4958(0, false);
               this.field8926.method547('\u0001', true);
               this.field8934 = false;
               if (!client.field10022) {
                  break label24;
               }
            }

            super.field7307.method4933(770, 5890, 0, true);
         }

         ++field8927;
         super.field7307.method4931(8448, 8448, 0);
         if (arg0) {
            this.field8934 = false;
         }
      } catch (RuntimeException var3) {
         throw class612.method4503(var3, field8935[0] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method4603(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 61);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!av",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method4604(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 75;
            break;
         case 1:
            var10005 = 26;
            break;
         case 2:
            var10005 = 23;
            break;
         case 3:
            var10005 = 85;
            break;
         default:
            var10005 = 61;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
