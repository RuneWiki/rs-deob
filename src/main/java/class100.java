import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!dba")
public class class100 extends class529 {
   @OriginalMember(
      owner = "client!dba",
      name = "p",
      descriptor = "Z"
   )
   private boolean field1217;
   @OriginalMember(
      owner = "client!dba",
      name = "n",
      descriptor = "Z"
   )
   private boolean field1229;
   @OriginalMember(
      owner = "client!dba",
      name = "i",
      descriptor = "[Lvu;"
   )
   private class355[] field1228;
   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field1234 = new String[]{method882(method881("$\u000e$ \nh")), method882(method881("$\u000e$ \u0001h")), method882(method881("$\u000e$ \rh")), method882(method881(";Bk ?")), method882(method881("$\u000e$ \u0006h")), method882(method881(".\u0019)b")), method882(method881("$\u000e$ \u0000h")), method882(method881("$\u000e$ \u0005h")), method882(method881("$\u000e$ \bh")), method882(method881("$\u000e$ \u000bh")), method882(method881("$\u000e$ \u0003h")), method882(method881("$\u000e$ \u000fh")), method882(method881("$\u000e$ \fh")), method882(method881("$\u000e$ ~)\u0002,z|h")), method882(method881("$\u000e$ \u0007h")), method882(method881("$\u000e$ \u0004h"))};
   @OriginalMember(
      owner = "client!dba",
      name = "v",
      descriptor = "[Ldm;"
   )
   public static class58[] field1214 = new class58[100];
   @OriginalMember(
      owner = "client!dba",
      name = "y",
      descriptor = "I"
   )
   public static int field1232 = 100;
   @OriginalMember(
      owner = "client!dba",
      name = "d",
      descriptor = "Z"
   )
   public static boolean field1230 = false;
   @OriginalMember(
      owner = "client!dba",
      name = "w",
      descriptor = "Z"
   )
   public static boolean field1220 = false;
   @OriginalMember(
      owner = "client!dba",
      name = "s",
      descriptor = "I"
   )
   public static int field1212;
   @OriginalMember(
      owner = "client!dba",
      name = "t",
      descriptor = "I"
   )
   public static int field1213;
   @OriginalMember(
      owner = "client!dba",
      name = "l",
      descriptor = "I"
   )
   public static int field1215;
   @OriginalMember(
      owner = "client!dba",
      name = "h",
      descriptor = "I"
   )
   public static int field1218;
   @OriginalMember(
      owner = "client!dba",
      name = "j",
      descriptor = "I"
   )
   public static int field1219;
   @OriginalMember(
      owner = "client!dba",
      name = "o",
      descriptor = "I"
   )
   public static int field1221;
   @OriginalMember(
      owner = "client!dba",
      name = "k",
      descriptor = "I"
   )
   public static int field1222;
   @OriginalMember(
      owner = "client!dba",
      name = "u",
      descriptor = "I"
   )
   public static int field1223;
   @OriginalMember(
      owner = "client!dba",
      name = "r",
      descriptor = "I"
   )
   public static int field1224;
   @OriginalMember(
      owner = "client!dba",
      name = "x",
      descriptor = "I"
   )
   public static int field1226;
   @OriginalMember(
      owner = "client!dba",
      name = "f",
      descriptor = "I"
   )
   public static int field1227;
   @OriginalMember(
      owner = "client!dba",
      name = "q",
      descriptor = "I"
   )
   public static int field1233;
   @OriginalMember(
      owner = "client!dba",
      name = "e",
      descriptor = "Lll;"
   )
   private class383 field1231;
   @OriginalMember(
      owner = "client!dba",
      name = "m",
      descriptor = "Leaa;"
   )
   public static class526 field1225;
   @OriginalMember(
      owner = "client!dba",
      name = "g",
      descriptor = "Lum;"
   )
   public static class550 field1216;

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(III)Z",
      line = 3
   )
   public static final boolean method868(int arg0, int arg1, int arg2) {
      try {
         if (arg0 != -1) {
            field1225 = null;
         }

         ++field1226;
         return ~(33 & arg2) != -1;
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1234[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Z)V",
      line = 20
   )
   private final void method869(boolean arg0) {
      int var2 = client.field4530;

      try {
         label26: {
            this.field1231 = new class383(super.field7700, 2);
            ++field1219;
            this.field1231.method2949(arg0, 0);
            super.field7700.method4828(1, (byte)66);
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
            if (!this.field1229) {
               super.field7700.method4849(8448, 34161, 7681);
               super.field7700.method4814(7681, 0, 34168, 768);
               super.field7700.method4828(2, (byte)66);
               super.field7700.method4849(7681, 34161, 260);
               super.field7700.method4814(7681, 0, 34168, 768);
               super.field7700.method4814(7681, 1, 34168, 770);
               super.field7700.method4823(34167, 0, 770, (byte)104);
               if (var2 == 0) {
                  break label26;
               }
            }

            super.field7700.method4849(7681, 34161, 260);
            super.field7700.method4814(7681, 0, 5890, 770);
            super.field7700.method4823(34167, 0, 770, (byte)113);
         }

         label21: {
            super.field7700.method4828(0, (byte)66);
            this.field1231.method2946(407554050);
            this.field1231.method2949(false, 1);
            super.field7700.method4828(1, (byte)66);
            OpenGL.glDisable(3168);
            OpenGL.glDisable(3169);
            OpenGL.glDisable(3170);
            OpenGL.glMatrixMode(5890);
            OpenGL.glLoadIdentity();
            OpenGL.glMatrixMode(5888);
            if (this.field1229) {
               super.field7700.method4849(8448, 34161, 8448);
               super.field7700.method4814(7681, 0, 5890, 768);
               super.field7700.method4823(5890, 0, 770, (byte)64);
               if (var2 == 0) {
                  break label21;
               }
            }

            super.field7700.method4849(8448, 34161, 8448);
            super.field7700.method4814(7681, 0, 5890, 768);
            super.field7700.method4828(2, (byte)66);
            super.field7700.method4849(8448, 34161, 8448);
            super.field7700.method4814(7681, 0, 5890, 768);
            super.field7700.method4814(7681, 1, 34168, 768);
            super.field7700.method4823(5890, 0, 770, (byte)50);
         }

         super.field7700.method4828(0, (byte)66);
         this.field1231.method2946(407554050);
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1234[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(ILbca;I)V",
      line = 86
   )
   public final void method870(int arg0, class689 arg1, int arg2) {
      try {
         super.field7700.method4818((byte)53, arg1);
         ++field1222;
         super.field7700.method4796(false, arg0);
         if (arg2 != -1) {
            field1230 = true;
         }
      } catch (RuntimeException var5) {
         throw class670.method4877(var5, field1234[6] + arg0 + ',' + (arg1 != null ? field1234[3] : field1234[5]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(III)V",
      line = 100
   )
   public final void method871(int arg0, int arg1, int arg2) {
      try {
         ++field1212;
         int var4 = -73 % ((arg1 - 75) / 37);
         if (this.field1217) {
            super.field7700.method4828(1, (byte)66);
            super.field7700.method4818((byte)118, this.field1228[arg0 + -1]);
            super.field7700.method4828(0, (byte)66);
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1234[0] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "<init>",
      descriptor = "(Lck;)V",
      line = 118
   )
   public class100(class667 arg0) {
      int var2 = client.field4530;
      super(arg0);
      this.field1217 = false;

      try {
         if (arg0.field10026) {
            this.field1229 = ~arg0.field10020 > -4;
            int var3 = !this.field1229 ? 127 : 48;
            byte[][] var4 = new byte[6][4096];
            byte[][] var5 = new byte[6][4096];
            byte[][] var6 = new byte[6][4096];
            int var7 = 0;
            int var8 = 0;
            if (var2 == 0 && var8 >= 64) {
               this.field1228 = new class355[3];
               this.field1228[0] = new class355(super.field7700, 6406, 64, false, var5, 6406);
               this.field1228[1] = new class355(super.field7700, 6406, 64, false, var6, 6406);
               this.field1228[2] = new class355(super.field7700, 6406, 64, false, var4, 6406);
               this.method869(false);
            } else {
               do {
                  int var9 = 0;
                  if (var2 != 0 || var9 < 64) {
                     do {
                        label297: {
                           float var10 = (float)var9 * 2.0F / 64.0F + -1.0F;
                           float var11 = (float)var8 * 2.0F / 64.0F - 1.0F;
                           float var12 = (float)(1.0D / Math.sqrt((double)(var11 * var11 + var10 * var10 + 1.0F)));
                           float var13 = var11 * var12;
                           float var14 = var10 * var12;
                           int var15 = 0;
                           float var16;
                           if (var2 != 0) {
                              if (var15 != 0) {
                                 if (var15 != 1) {
                                    if (var15 != 2) {
                                       if (~var15 != -4) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2 != 0) {
                                                var16 = -var12;
                                                if (var2 != 0) {
                                                   var16 = -var13;
                                                   if (var2 != 0) {
                                                      var16 = var13;
                                                      if (var2 != 0) {
                                                         var16 = var14;
                                                         if (var2 != 0) {
                                                            var16 = -var14;
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2 != 0) {
                                                var16 = -var13;
                                                if (var2 != 0) {
                                                   var16 = var13;
                                                   if (var2 != 0) {
                                                      var16 = var14;
                                                      if (var2 != 0) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                          if (var2 != 0) {
                                             var16 = var13;
                                             if (var2 != 0) {
                                                var16 = var14;
                                                if (var2 != 0) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                       if (var2 != 0) {
                                          var16 = var14;
                                          if (var2 != 0) {
                                             var16 = -var14;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var14;
                                    if (var2 != 0) {
                                       var16 = -var14;
                                    }
                                 }
                              } else {
                                 var16 = -var14;
                              }
                           } else if (var15 >= 6) {
                              ++var7;
                              if (var2 == 0) {
                                 break label297;
                              }

                              var16 = -var14;
                           } else if (var15 != 0) {
                              if (var15 != 1) {
                                 if (var15 != 2) {
                                    if (~var15 != -4) {
                                       if (var15 == 4) {
                                          var16 = var12;
                                          if (var2 != 0) {
                                             var16 = -var12;
                                             if (var2 != 0) {
                                                var16 = -var13;
                                                if (var2 != 0) {
                                                   var16 = var13;
                                                   if (var2 != 0) {
                                                      var16 = var14;
                                                      if (var2 != 0) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var12;
                                          if (var2 != 0) {
                                             var16 = -var13;
                                             if (var2 != 0) {
                                                var16 = var13;
                                                if (var2 != 0) {
                                                   var16 = var14;
                                                   if (var2 != 0) {
                                                      var16 = -var14;
                                                   }
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = -var13;
                                       if (var2 != 0) {
                                          var16 = var13;
                                          if (var2 != 0) {
                                             var16 = var14;
                                             if (var2 != 0) {
                                                var16 = -var14;
                                             }
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var13;
                                    if (var2 != 0) {
                                       var16 = var14;
                                       if (var2 != 0) {
                                          var16 = -var14;
                                       }
                                    }
                                 }
                              } else {
                                 var16 = var14;
                                 if (var2 != 0) {
                                    var16 = -var14;
                                 }
                              }
                           } else {
                              var16 = -var14;
                           }

                           while(true) {
                              int var22;
                              int var23;
                              int var24;
                              if (!(var16 > 0.0F)) {
                                 byte var17 = 0;
                                 byte var18 = 0;
                                 byte var19 = 0;
                                 if (var2 != 0) {
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

                              if (var15 >= 6) {
                                 ++var7;
                                 if (var2 == 0) {
                                    break;
                                 }

                                 var16 = -var14;
                              } else if (var15 != 0) {
                                 if (var15 != 1) {
                                    if (var15 != 2) {
                                       if (~var15 != -4) {
                                          if (var15 == 4) {
                                             var16 = var12;
                                             if (var2 != 0) {
                                                var16 = -var12;
                                                if (var2 != 0) {
                                                   var16 = -var13;
                                                   if (var2 != 0) {
                                                      var16 = var13;
                                                      if (var2 != 0) {
                                                         var16 = var14;
                                                         if (var2 != 0) {
                                                            var16 = -var14;
                                                         }
                                                      }
                                                   }
                                                }
                                             }
                                          } else {
                                             var16 = -var12;
                                             if (var2 != 0) {
                                                var16 = -var13;
                                                if (var2 != 0) {
                                                   var16 = var13;
                                                   if (var2 != 0) {
                                                      var16 = var14;
                                                      if (var2 != 0) {
                                                         var16 = -var14;
                                                      }
                                                   }
                                                }
                                             }
                                          }
                                       } else {
                                          var16 = -var13;
                                          if (var2 != 0) {
                                             var16 = var13;
                                             if (var2 != 0) {
                                                var16 = var14;
                                                if (var2 != 0) {
                                                   var16 = -var14;
                                                }
                                             }
                                          }
                                       }
                                    } else {
                                       var16 = var13;
                                       if (var2 != 0) {
                                          var16 = var14;
                                          if (var2 != 0) {
                                             var16 = -var14;
                                          }
                                       }
                                    }
                                 } else {
                                    var16 = var14;
                                    if (var2 != 0) {
                                       var16 = -var14;
                                    }
                                 }
                              } else {
                                 var16 = -var14;
                              }
                           }
                        }

                        ++var9;
                     } while(var9 < 64);
                  }

                  ++var8;
               } while(var8 < 64);

               this.field1228 = new class355[3];
               this.field1228[0] = new class355(super.field7700, 6406, 64, false, var5, 6406);
               this.field1228[1] = new class355(super.field7700, 6406, 64, false, var6, 6406);
               this.field1228[2] = new class355(super.field7700, 6406, 64, false, var4, 6406);
               this.method869(false);
            }
         }
      } catch (RuntimeException var21) {
         throw class670.method4877(var21, field1234[13] + (arg0 != null ? field1234[3] : field1234[5]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(IZ)V",
      line = 229
   )
   public final void method872(int arg0, boolean arg1) {
      try {
         ++field1224;
         super.field7700.method4849(7681, 34161, 8448);
         if (arg0 < 12) {
            this.method874(-76);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1234[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "c",
      descriptor = "(I)Z",
      line = 240
   )
   public final boolean method873(int arg0) {
      try {
         if (arg0 != 0) {
            return false;
         } else {
            ++field1213;
            return true;
         }
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1234[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(I)V",
      line = 251
   )
   public final void method874(int arg0) {
      try {
         if (arg0 != 1) {
            method879((byte)111);
         }

         label29: {
            ++field1227;
            if (!this.field1217) {
               super.field7700.method4823(5890, 0, 770, (byte)124);
               if (client.field4530 == 0) {
                  break label29;
               }
            }

            if (!this.field1229) {
               super.field7700.method4828(2, (byte)66);
               super.field7700.method4818((byte)-105, (class689)null);
            }

            super.field7700.method4828(1, (byte)66);
            super.field7700.method4818((byte)121, (class689)null);
            super.field7700.method4828(0, (byte)66);
            this.field1231.method2948('\u0001', (byte)-69);
            this.field1217 = false;
         }

         super.field7700.method4849(8448, 34161, 8448);
      } catch (RuntimeException var3) {
         throw class670.method4877(var3, field1234[14] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(Z)V",
      line = 279
   )
   public static final void method875(boolean arg0) {
      try {
         ++field1215;
         class467 var1 = (class467)class356.field5394.method4071((byte)127);
         boolean var2 = class331.field4741 != null || ~class298.field4257 < -1;
         int var3 = var1.method3490(-97);
         int var4 = var1.method3491(-5);
         if (var2) {
            class3.field63 = 1;
         }

         label28: {
            if (var2) {
               class710.field10596 = class585.field8681;
               if (client.field4530 == 0) {
                  break label28;
               }
            }

            class230.method1737((byte)111, var3, class585.field8681, var4);
         }

         if (!arg0) {
            field1225 = null;
         }
      } catch (RuntimeException var6) {
         throw class670.method4877(var6, field1234[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(Ljj;IILhg;)V",
      line = 313
   )
   public static final void method876(class128 param0, int param1, int param2, class719 param3) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!dba",
      name = "d",
      descriptor = "(I)V",
      line = 426
   )
   public static final void method877(int arg0) {
      int var1 = client.field4530;

      try {
         ++field1218;
         class287.field4026 = 0;
         int var2 = 0;
         if (var1 != 0) {
            class496.field7338[var2] = null;
            class790.field11482[var2] = 1;
            class252.field3369[var2] = null;
            ++var2;
         }

         while(true) {
            while(~var2 > -2049) {
               class496.field7338[var2] = null;
               class790.field11482[var2] = 1;
               class252.field3369[var2] = null;
               ++var2;
            }

            if (var1 == 0) {
               if (arg0 != 17538) {
                  method877(-57);
                  return;
               }

               return;
            }

            ++var2;
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1234[12] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(IZ)V",
      line = 452
   )
   public final void method878(int arg0, boolean arg1) {
      try {
         label27: {
            if (this.field1231 != null && arg1) {
               if (!this.field1229) {
                  super.field7700.method4828(2, (byte)66);
                  super.field7700.method4818((byte)20, super.field7700.field10004);
                  super.field7700.method4828(0, (byte)66);
               }

               this.field1231.method2948('\u0000', (byte)-69);
               this.field1217 = true;
               if (client.field4530 == 0) {
                  break label27;
               }
            }

            super.field7700.method4823(34168, 0, 770, (byte)118);
         }

         ++field1221;
         if (arg0 != 0) {
            this.method870(24, (class689)null, -105);
         }
      } catch (RuntimeException var4) {
         throw class670.method4877(var4, field1234[15] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "a",
      descriptor = "(B)[Lsd;",
      line = 484
   )
   public static final class101[] method879(byte arg0) {
      try {
         if (arg0 != 124) {
            method880((byte)18);
         }

         ++field1223;
         return new class101[]{class122.field1483, class152.field1915, class691.field10403, class243.field3104, class412.field6313, class401.field6153, class192.field2422, class62.field771, class791.field11504, class697.field10472, class163.field2048, class388.field5933, class132.field1649, class580.field8591, class127.field1525, class764.field11228, class757.field11161, class150.field1885, class763.field11217, class42.field450, class769.field11272, class188.field2344, class637.field9256, class76.field971, class789.field11468, class534.field7799, class207.field2648, class397.field6107, class501.field7433, class69.field867, class642.field9357, class729.field10837, class119.field1450, class442.field6731, class506.field7473, class380.field5841, class785.field11436, class555.field8221, class187.field2340, class311.field4422, class587.field8696, class140.field1804, class48.field581, class628.field9147, class630.field9165, class519.field7559, class140.field1803, class64.field790, class79.field982, class682.field10239, class323.field4596, class312.field4455, class616.field9009, class442.field6737, class554.field8211, class643.field9367, class791.field11495, class362.field5452, class34.field376, class87.field1050, class541.field7880, class674.field10130, class45.field483, class300.field4283, class311.field4426, class589.field8712, class286.field4019, class372.field5659, class573.field8534, class232.field2952, class487.field7206, class768.field11263, class443.field6747, class456.field6921, class125.field1518, class128.field1598, class335.field4794, class302.field4306, class157.field1991, class23.field248, class520.field7566, class667.field9769, class699.field10496, class262.field3584, class407.field6217, class748.field11087, class518.field7551, class777.field11350, class196.field2432, class428.field6537, class192.field2390, class66.field808, class749.field11103, class525.field7632, class622.field9070, class793.field11564, class212.field2692, class281.field3907, class595.field8774, class595.field8763, class557.field8347, class349.field5298, class73.field928, class573.field8530, class248.field3325, class626.field9100, class544.field7919, class687.field10322, class462.field6965, class324.field4608, class658.field9550, class10.field144, class197.field2443, class656.field9525, class115.field1380, class703.field10530, class68.field851, class106.field1290, class360.field5428, class171.field2121, class15.field183, class296.field4110, class173.field2159, class11.field151, class675.field10140, class695.field10446, class405.field6209, class117.field1426, class331.field4750, class50.field604, class349.field5297, class634.field9232, class1.field25, class15.field185, class301.field4289};
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1234[2] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "b",
      descriptor = "(B)V",
      line = 495
   )
   public static void method880(byte arg0) {
      try {
         field1216 = null;
         field1214 = null;
         field1225 = null;
         if (arg0 < 22) {
            method875(false);
         }
      } catch (RuntimeException var2) {
         throw class670.method4877(var2, field1234[1] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method881(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 66);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!dba",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method882(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 64;
            break;
         case 1:
            var10005 = 108;
            break;
         case 2:
            var10005 = 69;
            break;
         case 3:
            var10005 = 14;
            break;
         default:
            var10005 = 66;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
