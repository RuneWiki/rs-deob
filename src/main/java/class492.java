import jaggl.OpenGL;
import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!wl")
public class class492 extends class416 {
   @OriginalMember(
      owner = "client!wl",
      name = "l",
      descriptor = "Lwfa;"
   )
   private class786 field7442;
   @OriginalMember(
      owner = "client!wl",
      name = "q",
      descriptor = "Luf;"
   )
   private class701 field7441;
   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field7448 = new String[]{method3813(method3812("Nk\u0002#H")), method3813(method3812("[0@a")), method3813(method3812("B)\u0002G\u001d")), method3813(method3812("Q/")), method3813(method3812("B)\u0002J\u001d")), method3813(method3812("B)\u0002K\u001d")), method3813(method3812("B)\u00021\\[,X3\u001d")), method3813(method3812("B)\u0002E\u001d")), method3813(method3812("B)\u0002L\u001d")), method3813(method3812("B)\u0002H\u001d")), method3813(method3812("B)\u0002N\u001d")), method3813(method3812("B)\u0002I\u001d")), method3813(method3812("B)\u0002O\u001d")), method3813(method3812("B)\u0002D\u001d")), method3813(method3812("T\"M"))};
   @OriginalMember(
      owner = "client!wl",
      name = "o",
      descriptor = "I"
   )
   public static int field7434 = 0;
   @OriginalMember(
      owner = "client!wl",
      name = "d",
      descriptor = "I"
   )
   public static int field7433;
   @OriginalMember(
      owner = "client!wl",
      name = "m",
      descriptor = "I"
   )
   public static int field7435;
   @OriginalMember(
      owner = "client!wl",
      name = "j",
      descriptor = "I"
   )
   public static int field7437;
   @OriginalMember(
      owner = "client!wl",
      name = "i",
      descriptor = "I"
   )
   public static int field7438;
   @OriginalMember(
      owner = "client!wl",
      name = "e",
      descriptor = "I"
   )
   public static int field7439;
   @OriginalMember(
      owner = "client!wl",
      name = "n",
      descriptor = "I"
   )
   public static int field7440;
   @OriginalMember(
      owner = "client!wl",
      name = "f",
      descriptor = "I"
   )
   public static int field7443;
   @OriginalMember(
      owner = "client!wl",
      name = "h",
      descriptor = "I"
   )
   public static int field7444;
   @OriginalMember(
      owner = "client!wl",
      name = "r",
      descriptor = "I"
   )
   public static int field7445;
   // $FF: synthetic field
   @OriginalMember(
      owner = "client!wl",
      name = "p",
      descriptor = "Ljava/lang/Class;"
   )
   public static Class field7447;
   @OriginalMember(
      owner = "client!wl",
      name = "g",
      descriptor = "Z"
   )
   public static boolean field7436;
   @OriginalMember(
      owner = "client!wl",
      name = "k",
      descriptor = "[Ljq;"
   )
   public static class672[] field7446;

   @OriginalMember(
      owner = "client!wl",
      name = "b",
      descriptor = "(B)Z"
   )
   public final boolean method1830(byte arg0) {
      try {
         int var2 = -60 % ((-8 - arg0) / 57);
         ++field7444;
         return true;
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7448[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "d",
      descriptor = "(B)Lsja;"
   )
   public static final class671 method3807(byte arg0) {
      try {
         ++field7445;
         if (arg0 < 3) {
            method3808(-117, (class610)null, 103, 120, 94, 17, -53, 8, 94);
         }

         try {
            return (class671)Class.forName(field7448[14]).newInstance();
         } catch (Throwable var2) {
            return null;
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7448[13] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(Lvda;IB)V"
   )
   public final void method1826(class799 arg0, int arg1, byte arg2) {
      try {
         ++field7438;
         super.field6445.method4792(-26367, arg0);
         if (arg2 >= -29) {
            field7434 = -69;
         }

         super.field6445.method4765(arg1, (byte)-3);
      } catch (RuntimeException var5) {
         throw class482.method3757(var5, field7448[5] + (arg0 != null ? field7448[0] : field7448[1]) + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "c",
      descriptor = "(B)V"
   )
   public final void method1827(byte arg0) {
      try {
         ++field7437;
         this.field7441.method5160((byte)-76, '\u0001');
         super.field6445.method4787(-46, 1);
         super.field6445.method4792(-26367, (class799)null);
         if (arg0 == 77) {
            super.field6445.method4787(-127, 0);
         }
      } catch (RuntimeException var3) {
         throw class482.method3757(var3, field7448[11] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(ZZ)V"
   )
   public final void method1828(boolean arg0, boolean arg1) {
      try {
         ++field7440;
         if (arg0) {
            this.method1827((byte)-78);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7448[12] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(ILha;IIIIIII)V"
   )
   public static final void method3808(int arg0, class610 arg1, int arg2, int arg3, int arg4, int arg5, int arg6, int arg7, int arg8) {
      try {
         ++field7443;
         class434 var9 = (class434)class471.method3661(arg8, arg7, arg5);
         if (var9 != null) {
            class333 var10 = class102.field1434.method1411(var9.method236((byte)-11), -124);
            int var11 = 3 & var9.method231((byte)-42);
            int var12 = var9.method237(28440);
            if (var10.field5107 == -1) {
               int var13 = arg2;
               if (~var10.field5071 < -1) {
                  var13 = arg6;
               }

               if (var12 == 0 || var12 == 2) {
                  if (~var11 != -1) {
                     if (var11 == 1) {
                        arg1.method4498(arg4, arg0, var13, 123, 4);
                     } else if (~var11 != -3) {
                        if (~var11 == -4) {
                           arg1.method4498(arg4 + 3, arg0, var13, 124, 4);
                        }
                     } else {
                        arg1.method4492(arg0 + 3, arg4, 4, var13, (byte)-36);
                     }
                  } else {
                     arg1.method4492(arg0, arg4, 4, var13, (byte)-36);
                  }
               }

               if (var12 == 3) {
                  if (var11 != 0) {
                     if (~var11 == -2) {
                        arg1.method4502(arg0 - -3, 0, var13, 1, arg4, 1);
                     } else if (var11 == 2) {
                        arg1.method4502(arg0 + 3, 0, var13, 1, arg4 + 3, 1);
                     } else if (var11 == 3) {
                        arg1.method4502(arg0, 0, var13, 1, arg4 - -3, 1);
                     }
                  } else {
                     arg1.method4502(arg0, arg3 + -1, var13, 1, arg4, 1);
                  }
               }

               if (~var12 == -3) {
                  if (var11 == 0) {
                     arg1.method4498(arg4, arg0, var13, 123, 4);
                  } else if (~var11 == -2) {
                     arg1.method4492(arg0 - -3, arg4, 4, var13, (byte)-36);
                  } else if (~var11 != -3) {
                     if (~var11 == -4) {
                        arg1.method4492(arg0, arg4, 4, var13, (byte)-36);
                     }
                  } else {
                     arg1.method4498(arg4 + 3, arg0, var13, 127, 4);
                  }
               }
            } else {
               class564.method4254(arg4, var10, arg3 + -97, arg0, var11, arg1);
            }
         }

         class434 var14 = (class434)class288.method2404(arg8, arg7, arg5, field7447 != null ? field7447 : (field7447 = method3811(field7448[3])));
         if (var14 != null) {
            class333 var15 = class102.field1434.method1411(var14.method236((byte)-11), arg3 ^ -82);
            int var16 = 3 & var14.method231((byte)-42);
            int var17 = var14.method237(28440);
            if (~var15.field5107 == 0) {
               if (~var17 == -10) {
                  int var18 = -1118482;
                  if (~var15.field5071 < -1) {
                     var18 = -1179648;
                  }

                  if (~var16 != -1 && ~var16 != -3) {
                     arg1.method4497(var18, arg0 + 3, arg3, arg4 + 3, arg4, arg0);
                  } else {
                     arg1.method4497(var18, arg0 + 3, 1, arg4, arg4 + 3, arg0);
                  }
               }
            } else {
               class564.method4254(arg4, var15, arg3 + -20, arg0, var16, arg1);
            }
         }

         class434 var19 = (class434)class269.method2302(arg8, arg7, arg5);
         if (var19 != null) {
            class333 var20 = class102.field1434.method1411(var19.method236((byte)-11), -110);
            int var21 = 3 & var19.method231((byte)-42);
            if (var20.field5107 != -1) {
               class564.method4254(arg4, var20, -60, arg0, var21, arg1);
            }
         }

         if (arg3 != 1) {
            field7436 = false;
         }
      } catch (RuntimeException var23) {
         throw class482.method3757(var23, field7448[2] + arg0 + ',' + (arg1 != null ? field7448[0] : field7448[1]) + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ',' + arg7 + ',' + arg8 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(ZI)V"
   )
   public final void method1831(boolean arg0, int arg1) {
      try {
         if (arg1 != 3211) {
            method3809(77);
         }

         ++field7439;
         this.field7441.method5160((byte)-76, '\u0000');
         if (this.field7442.field11530) {
            super.field6445.method4787(arg1 ^ -3273, 1);
            super.field6445.method4792(-26367, this.field7442.field11525);
            super.field6445.method4787(-80, 0);
         }
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7448[7] + arg0 + ',' + arg1 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(I)V"
   )
   public static void method3809(int arg0) {
      try {
         if (arg0 == 2) {
            field7446 = null;
         }
      } catch (RuntimeException var2) {
         throw class482.method3757(var2, field7448[10] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "<init>",
      descriptor = "(Lc;Lwfa;)V"
   )
   public class492(class652 arg0, class786 arg1) {
      super(arg0);

      try {
         this.field7442 = arg1;
         this.field7441 = new class701(arg0, 2);
         this.field7441.method5162(0, -6177);
         super.field6445.method4787(-49, 1);
         if (this.field7442.field11530) {
            OpenGL.glTexGeni(8194, 9472, 9217);
            OpenGL.glEnable(3170);
         }

         OpenGL.glTexGeni(8192, 9472, 9216);
         OpenGL.glTexGeni(8193, 9472, 9216);
         OpenGL.glEnable(3168);
         OpenGL.glEnable(3169);
         super.field6445.method4787(-93, 0);
         this.field7441.method5163(-3623);
         this.field7441.method5162(1, -6177);
         super.field6445.method4787(-109, 1);
         if (this.field7442.field11530) {
            OpenGL.glDisable(3170);
         }

         OpenGL.glDisable(3168);
         OpenGL.glDisable(3169);
         super.field6445.method4787(-105, 0);
         this.field7441.method5163(-3623);
      } catch (RuntimeException var4) {
         throw class482.method3757(var4, field7448[6] + (arg0 != null ? field7448[0] : field7448[1]) + ',' + (arg1 != null ? field7448[0] : field7448[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(IZIIII)V"
   )
   public static final void method3810(int arg0, boolean arg1, int arg2, int arg3, int arg4, int arg5) {
      boolean var6 = client.field1786;

      try {
         ++field7433;
         if (class711.field10694 == null) {
            class351.field5356.method4502(arg0, 0, -16777216, arg5, arg3, arg4);
         } else if (~class476.field7251.field1505 <= -1 && ~class476.field7251.field1505 > ~(class513.field7828 * 512) && ~class476.field7251.field1494 <= -1 && ~class476.field7251.field1494 > ~(class475.field7230 * 512)) {
            ++class801.field11657;
            if (class476.field7251 != null && class476.field7251.field1505 + -((class476.field7251.method61((byte)70) + -1) * 256) >> 9 == class745.field11066 && ~(class476.field7251.field1494 + -((class476.field7251.method61((byte)70) - 1) * 256) >> 9) == ~class581.field8579) {
               class581.field8579 = -1;
               class745.field11066 = -1;
               class218.method1882(true);
            }

            class200.method1757(-106);
            if (!arg1) {
               class199.method1754(-27140);
            }

            int var22;
            int var23;
            int var24;
            int var25;
            label278: {
               class263.method2284((byte)121);
               class330.method2692(arg0, true, arg2 + 1180160, arg5, arg3, arg4);
               class591.field8709 = class591.field8708;
               var23 = class445.field6840;
               var25 = class250.field3801;
               var24 = class735.field10947;
               var22 = class708.field10660;
               if (~class648.field9340 != -2) {
                  if (class648.field9340 != 4) {
                     if (~class648.field9340 != -6) {
                        break label278;
                     }

                     class27.method194(var24, (byte)125);
                     if (!var6) {
                        break label278;
                     }
                  }

                  int var7 = (int)class357.field5520;
                  if (class243.field3685 >> 8 > var7) {
                     var7 = class243.field3685 >> 8;
                  }

                  if (class514.field7831[4] && ~(class294.field4661[4] + 128) < ~var7) {
                     var7 = class294.field4661[4] + 128;
                  }

                  int var8 = 16383 & (int)class417.field6456;
                  class355.method2906(var8, var24, (var7 >> 3) * 3 + 600 << 2, (byte)96, class149.field2262, class674.field10031, -200 + class477.method3711(class464.field7054, class640.field9280, (byte)0, class520.field7902), var7);
                  if (!var6) {
                     break label278;
                  }
               }

               int var9 = (int)class357.field5520;
               if (~(class243.field3685 >> 8) < ~var9) {
                  var9 = class243.field3685 >> 8;
               }

               if (class514.field7831[4] && class294.field4661[4] + 128 > var9) {
                  var9 = class294.field4661[4] + 128;
               }

               int var10 = (int)class417.field6456 + class37.field454 & 16383;
               class355.method2906(var10, var24, (var9 >> 3) * 3 + 600 << 2, (byte)96, class149.field2262, class674.field10031, class477.method3711(class464.field7054, class476.field7251.field1505, (byte)0, class476.field7251.field1494) + -200, var9);
            }

            int var11 = class401.field6288;
            if (arg2 == -1179648) {
               int var12 = class653.field9780;
               int var13 = class691.field10259;
               int var14 = class703.field10589;
               int var15 = class317.field4895;
               int var16 = 0;
               int var17;
               if (var6) {
                  if (class514.field7831[var16]) {
                     var17 = (int)(Math.random() * (double)(class510.field7802[var16] * 2 + 1) - (double)class510.field7802[var16] + Math.sin((double)class37.field445[var16] / 100.0D * (double)class486.field7388[var16]) * (double)class294.field4661[var16]);
                     if (var16 == 4) {
                        class703.field10589 += var17;
                        if (class703.field10589 < 1024) {
                           class703.field10589 = 1024;
                           if (var6 && class703.field10589 > 3072) {
                              class703.field10589 = 3072;
                           }
                        } else if (class703.field10589 > 3072) {
                           class703.field10589 = 3072;
                        }
                     }

                     if (~var16 == -2) {
                        class653.field9780 += var17 << 2;
                     }

                     if (var16 == 3) {
                        class317.field4895 = 16383 & class317.field4895 + var17;
                     }

                     if (~var16 == -3) {
                        class691.field10259 += var17 << 2;
                     }

                     if (~var16 == -1) {
                        class401.field6288 += var17 << 2;
                     }

                     ++var16;
                  } else {
                     ++var16;
                  }
               }

               while(true) {
                  int var10000;
                  if (~var16 <= -6) {
                     var10000 = class401.field6288;
                     if (!var6) {
                        if (var10000 < 0) {
                           class401.field6288 = 0;
                        }

                        if (class401.field6288 > (class247.field3734 << 9) + -1) {
                           class401.field6288 = (class247.field3734 << 9) - 1;
                        }

                        if (~class691.field10259 > -1) {
                           class691.field10259 = 0;
                        }

                        if (~((class365.field5634 << 9) + -1) > ~class691.field10259) {
                           class691.field10259 = (class365.field5634 << 9) + -1;
                        }

                        label282: {
                           class691.method5089(arg2 + 1195866);
                           class351.field5356.method629(var22, var23, var22 + var25, var23 - -var24);
                           class753.method5528(-26506, true);
                           int var18 = class607.field8855;
                           class187.field2925.method1556(class401.field6288, class653.field9780, class691.field10259, 16383 & -class703.field10589, -class317.field4895 & 16383, -class674.field10029 & 16383);
                           class351.field5356.method688(class187.field2925);
                           class351.field5356.method639(var25 / 2 + var22, var24 / 2 + var23, class98.field1379 << 1, class98.field1379 << 1);
                           if (class281.field4472) {
                              class368.method3014(class607.field8855, false);
                              if (~class692.field10302 != ~class591.field8709) {
                                 class67.field884 = true;
                              }

                              class692.field10302 = class591.field8709;
                              class351.field5356.method590(var18);
                              class351.field5356.method655();
                              if (!var6) {
                                 break label282;
                              }
                           }

                           if (class354.field5400 == null) {
                              class351.field5356.method590(var18);
                              class351.field5356.method655();
                              if (!var6) {
                                 break label282;
                              }
                           }

                           class351.field5356.method679(1.0F);
                           class351.field5356.method656(16777215, 0.0F, 0.0F, 1.0F, 0.0F, 0.0F);
                           class354.field5400.method3394(var25, var24, class674.field10029, class317.field4895, var22, class703.field10589, var23, class351.field5356, false, var18, class153.field2291 << 3, true, -5549);
                        }

                        label283: {
                           class532.method4095(arg2 + 1179573);
                           class156.method1406(class98.field1379 << 1, var25 / 2 + var22, class98.field1379 << 1, var24 / 2 + var23, 0);
                           class582.method4349(class691.field10259, class401.field6288, 16383 & -class317.field4895, class653.field9780, 16383 & -class674.field10029, arg2 + 1179648, 16383 & -class703.field10589);
                           class523.method4038(-99);
                           byte var19 = ~class687.field10213.field501.method5090(arg2 + 481281959) == -3 ? (byte)class801.field11657 : 1;
                           if (!class281.field4472) {
                              class315.method2615(class308.field4801, class401.field6288, class653.field9780, class691.field10259, class303.field4736, class525.field8007, class547.field8201, class305.field4774, class666.field9972, class33.field412, class476.field7251.field1506 + 1, var19, class476.field7251.field1505 >> 9, class476.field7251.field1494 >> 9, class687.field10213.field519.method5030(480102311) == 0, true, !class334.field5143 ? -1 : class591.field8709, 0, false);
                              if (!var6) {
                                 break label283;
                              }
                           }

                           class665.method4912(16383 & -class703.field10589, 16383 & -class317.field4895, (byte)104, 16383 & -class674.field10029);
                           class705.method5200(class653.field9780, class666.field9972, class476.field7251.field1505 >> 9, true, class525.field8007, class476.field7251.field1494 >> 9, class33.field412, class691.field10259, class401.field6288, class305.field4774, 0, class591.field8709, class476.field7251.field1506 - -1, class308.field4801, class547.field8201, class303.field4736, ~class687.field10213.field519.method5030(arg2 + 481281959) == -1, var19);
                        }

                        class532.method4095(-70);
                        if (class342.field5204 == 11) {
                           class475.method3695(256, var22, arg2 + -221911487, var23, var25, 256, var24);
                           class105.method1012(var23, 256, var25, 256, var24, 2, var22);
                           class540.method4131(256, var22, var25, 124, 256, var24, var23);
                           class53.method358(var22, 32601, var25, var23, var24);
                        }

                        class48.method338();
                        class703.field10589 = var14;
                        class691.field10259 = var13;
                        class401.field6288 = var11;
                        class317.field4895 = var15;
                        class653.field9780 = var12;
                        if (class718.field10764 && ~class522.field7958.method1856(arg2 + 1179731) == -1) {
                           class718.field10764 = false;
                        }

                        if (class718.field10764) {
                           class351.field5356.method4502(var22, 0, -16777216, var25, var23, var24);
                           class255.method2160(class577.field8538, 16, class351.field5356, false, class499.field7600.method3875(class493.field7455, arg2 ^ -1179532), class564.field8381);
                        }

                        class753.method5528(-26506, false);
                        return;
                     }
                  } else {
                     var10000 = class514.field7831[var16];
                  }

                  if (var10000 != 0) {
                     var17 = (int)(Math.random() * (double)(class510.field7802[var16] * 2 + 1) - (double)class510.field7802[var16] + Math.sin((double)class37.field445[var16] / 100.0D * (double)class486.field7388[var16]) * (double)class294.field4661[var16]);
                     if (var16 == 4) {
                        class703.field10589 += var17;
                        if (class703.field10589 < 1024) {
                           class703.field10589 = 1024;
                           if (var6 && class703.field10589 > 3072) {
                              class703.field10589 = 3072;
                           }
                        } else if (class703.field10589 > 3072) {
                           class703.field10589 = 3072;
                        }
                     }

                     if (~var16 == -2) {
                        class653.field9780 += var17 << 2;
                     }

                     if (var16 == 3) {
                        class317.field4895 = 16383 & class317.field4895 + var17;
                     }

                     if (~var16 == -3) {
                        class691.field10259 += var17 << 2;
                     }

                     if (~var16 == -1) {
                        class401.field6288 += var17 << 2;
                     }

                     ++var16;
                  } else {
                     ++var16;
                  }
               }
            }
         } else {
            class351.field5356.method4502(arg0, 0, -16777216, arg5, arg3, arg4);
         }
      } catch (RuntimeException var21) {
         throw class482.method3757(var21, field7448[4] + arg0 + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(III)V"
   )
   public final void method1833(int arg0, int arg1, int arg2) {
      boolean var4 = client.field1786;

      try {
         ++field7435;
         float var5 = (float)((arg2 & 3) + 1) * -5.0E-4F;
         float var6 = (float)((arg2 >> 3 & 3) + 1) * 5.0E-4F;
         if (arg1 > -90) {
            this.field7441 = null;
         }

         float var7;
         label37: {
            var7 = (arg2 & 64) == 0 ? 4.8828125E-4F : 9.765625E-4F;
            super.field6445.method4787(-91, 1);
            boolean var8 = (arg2 & 128) != 0;
            if (!var8) {
               class603.field8816[2] = var7;
               class603.field8816[0] = 0.0F;
               class603.field8816[1] = 0.0F;
               class603.field8816[3] = 0.0F;
               if (!var4) {
                  break label37;
               }
            }

            class603.field8816[1] = 0.0F;
            class603.field8816[3] = 0.0F;
            class603.field8816[0] = var7;
            class603.field8816[2] = 0.0F;
         }

         label32: {
            OpenGL.glTexGenfv(8192, 9474, class603.field8816, 0);
            class603.field8816[1] = var7;
            class603.field8816[0] = 0.0F;
            class603.field8816[2] = 0.0F;
            class603.field8816[3] = (float)super.field6445.field9615 * var5 % 1.0F;
            OpenGL.glTexGenfv(8193, 9474, class603.field8816, 0);
            if (this.field7442.field11530) {
               class603.field8816[1] = 0.0F;
               class603.field8816[2] = 0.0F;
               class603.field8816[0] = 0.0F;
               class603.field8816[3] = (float)super.field6445.field9615 * var6 % 1.0F;
               OpenGL.glTexGenfv(8194, 9473, class603.field8816, 0);
               if (!var4) {
                  break label32;
               }
            }

            int var9 = (int)((float)super.field6445.field9615 * var6 * 16.0F);
            super.field6445.method4792(-26367, this.field7442.field11526[var9 % 16]);
         }

         super.field6445.method4787(-35, 0);
      } catch (RuntimeException var11) {
         throw class482.method3757(var11, field7448[9] + arg0 + ',' + arg1 + ',' + arg2 + ')');
      }
   }

   // $FF: synthetic method
   @OriginalMember(
      owner = "client!wl",
      name = "a",
      descriptor = "(Ljava/lang/String;)Ljava/lang/Class;"
   )
   public static Class method3811(String arg0) {
      try {
         return Class.forName(arg0);
      } catch (ClassNotFoundException var2) {
         throw new NoClassDefFoundError(var2.getMessage());
      }
   }

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method3812(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 53);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!wl",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method3813(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 53;
            break;
         case 1:
            var10005 = 69;
            break;
         case 2:
            var10005 = 44;
            break;
         case 3:
            var10005 = 13;
            break;
         default:
            var10005 = 53;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
