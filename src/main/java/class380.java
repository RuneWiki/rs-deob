import org.openrs2.deob.annotation.OriginalClass;
import org.openrs2.deob.annotation.OriginalMember;

@OriginalClass("client!oq")
public class class380 extends class76 {
   @OriginalMember(
      owner = "client!oq",
      name = "N",
      descriptor = "[I"
   )
   private int[] field5482;
   @OriginalMember(
      owner = "client!oq",
      name = "D",
      descriptor = "[I"
   )
   private int[] field5469;
   @OriginalMember(
      owner = "client!oq",
      name = "P",
      descriptor = "Lae;"
   )
   private class264 field5471;
   @OriginalMember(
      owner = "client!oq",
      name = "C",
      descriptor = "Lae;"
   )
   private class264 field5472;
   @OriginalMember(
      owner = "client!oq",
      name = "L",
      descriptor = "Lae;"
   )
   private class264 field5478;
   @OriginalMember(
      owner = "client!oq",
      name = "F",
      descriptor = "[Lae;"
   )
   private class264[] field5474;
   @OriginalMember(
      owner = "client!oq",
      name = "O",
      descriptor = "[Ljava/lang/String;"
   )
   private static final String[] field5484 = new String[]{method2877(method2876("\f}\f5\u0010")), method2877(method2876("\ryN\u001d")), method2877(method2876("\u0018\"\f_E")), method2877(method2876("\f}\f3\u0010")), method2877(method2876("\f}\fMQ\reVO\u0010")), method2877(method2876("\f}\f7\u0010")), method2877(method2876("\f}\f0\u0010")), method2877(method2876("\f}\f6\u0010")), method2877(method2876("\f}\f4\u0010")), method2877(method2876("\f}\f2\u0010"))};
   @OriginalMember(
      owner = "client!oq",
      name = "B",
      descriptor = "Z"
   )
   public static boolean field5468 = false;
   @OriginalMember(
      owner = "client!oq",
      name = "J",
      descriptor = "[Lrv;"
   )
   public static class121[] field5483 = new class121[2048];
   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "I"
   )
   public static int field5470;
   @OriginalMember(
      owner = "client!oq",
      name = "G",
      descriptor = "I"
   )
   public static int field5473;
   @OriginalMember(
      owner = "client!oq",
      name = "M",
      descriptor = "I"
   )
   public static int field5475;
   @OriginalMember(
      owner = "client!oq",
      name = "K",
      descriptor = "I"
   )
   public static int field5476;
   @OriginalMember(
      owner = "client!oq",
      name = "I",
      descriptor = "I"
   )
   public static int field5477;
   @OriginalMember(
      owner = "client!oq",
      name = "A",
      descriptor = "I"
   )
   public static int field5479;
   @OriginalMember(
      owner = "client!oq",
      name = "E",
      descriptor = "I"
   )
   public static int field5480;
   @OriginalMember(
      owner = "client!oq",
      name = "H",
      descriptor = "I"
   )
   public static int field5481;

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Z)V",
      line = 9
   )
   public static final void method2869(boolean arg0) {
      try {
         ++field5470;
         if (class230.field3233 != null) {
            class660.field9618 = new class749();
            if (!arg0) {
               field5481 = 57;
            }

            class660.field9618.method5432(class249.field3428, class230.field3233.field2630, class230.field3233.field2633.method1437(class608.field8920, 50), 90, class230.field3233);
            class319.field4375 = new Thread(class660.field9618, "");
            class319.field4375.start();
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5484[8] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Ld;BZIDZLkf;I)[I",
      line = 28
   )
   public final int[] method2870(class162 arg0, byte arg1, boolean arg2, int arg3, double arg4, boolean arg5, class266 arg6, int arg7) {
      boolean var10 = client.field4360;

      try {
         class350.field4713 = arg0;
         class80.field1027 = arg6;
         ++field5476;
         int var11 = 0;
         if (var10) {
            this.field5474[var11].method2016(arg7, (byte)-124, arg3);
            ++var11;
         }

         while(true) {
            while(~this.field5474.length < ~var11) {
               this.field5474[var11].method2016(arg7, (byte)-124, arg3);
               ++var11;
            }

            class690.method5037((byte)64, arg4);
            class109.method884((byte)-22, arg7, arg3);
            int[] var12 = new int[arg3 * arg7];
            if (!var10) {
               int var13;
               byte var14;
               int var15;
               label215: {
                  if (arg2) {
                     var13 = -1;
                     var14 = -1;
                     var15 = arg3 - 1;
                     if (!var10) {
                        break label215;
                     }
                  }

                  var13 = arg3;
                  var15 = 0;
                  var14 = 1;
               }

               int var31;
               label191: {
                  int var16 = 0;
                  int var17 = 0;
                  int[][] var18;
                  int[] var19;
                  int[] var20;
                  int[] var21;
                  int[] var22;
                  if (var10) {
                     if (!this.field5472.field3637) {
                        var18 = this.field5472.method4(var17, (byte)-120);
                        var19 = var18[0];
                        var20 = var18[2];
                        var21 = var18[1];
                        if (var10) {
                           var22 = this.field5472.method6(var17, -27);
                           var19 = var22;
                           var20 = var22;
                           var21 = var22;
                           if (arg5) {
                              var16 = var17;
                           }
                        } else if (arg5) {
                           var16 = var17;
                        }
                     } else {
                        var22 = this.field5472.method6(var17, -27);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg5) {
                           var16 = var17;
                        }
                     }
                  } else if (var17 >= arg7) {
                     var31 = 0;
                     if (!var10) {
                        break label191;
                     }

                     var22 = this.field5472.method6(var17, -27);
                     var19 = var22;
                     var20 = var22;
                     var21 = var22;
                     if (arg5) {
                        var16 = var17;
                     }
                  } else if (!this.field5472.field3637) {
                     var18 = this.field5472.method4(var17, (byte)-120);
                     var19 = var18[0];
                     var20 = var18[2];
                     var21 = var18[1];
                     if (var10) {
                        var22 = this.field5472.method6(var17, -27);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg5) {
                           var16 = var17;
                        }
                     } else if (arg5) {
                        var16 = var17;
                     }
                  } else {
                     var22 = this.field5472.method6(var17, -27);
                     var19 = var22;
                     var20 = var22;
                     var21 = var22;
                     if (arg5) {
                        var16 = var17;
                     }
                  }

                  while(true) {
                     int var23 = var15;
                     if (var10 || var13 != var15) {
                        do {
                           int var24 = var19[var23] >> 4;
                           if (~var24 < -256) {
                              var24 = 255;
                           }

                           if (~var24 > -1) {
                              var24 = 0;
                           }

                           int var25 = var21[var23] >> 4;
                           if (~var25 < -256) {
                              var25 = 255;
                           }

                           if (var25 < 0) {
                              var25 = 0;
                           }

                           int var26 = var20[var23] >> 4;
                           if (~var26 < -256) {
                              var26 = 255;
                           }

                           if (var26 < 0) {
                              var26 = 0;
                           }

                           int var27 = class631.field9251[var25];
                           int var28 = class631.field9251[var24];
                           int var29 = class631.field9251[var26];
                           int var30 = (var28 << 16) + var29 - -(var27 << 8);
                           if (var30 != 0) {
                              var30 |= -16777216;
                           }

                           var12[var16++] = var30;
                           if (arg5) {
                              var16 += arg3 + -1;
                           }

                           var23 += var14;
                        } while(var13 != var23);
                     }

                     ++var17;
                     if (var17 >= arg7) {
                        var31 = 0;
                        if (!var10) {
                           break;
                        }

                        var22 = this.field5472.method6(var17, -27);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg5) {
                           var16 = var17;
                        }
                     } else if (!this.field5472.field3637) {
                        var18 = this.field5472.method4(var17, (byte)-120);
                        var19 = var18[0];
                        var20 = var18[2];
                        var21 = var18[1];
                        if (var10) {
                           var22 = this.field5472.method6(var17, -27);
                           var19 = var22;
                           var20 = var22;
                           var21 = var22;
                           if (arg5) {
                              var16 = var17;
                           }
                        } else if (arg5) {
                           var16 = var17;
                        }
                     } else {
                        var22 = this.field5472.method6(var17, -27);
                        var19 = var22;
                        var20 = var22;
                        var21 = var22;
                        if (arg5) {
                           var16 = var17;
                        }
                     }
                  }
               }

               if (var10) {
                  this.field5474[var31].method379(123);
                  ++var31;
               }

               while(true) {
                  while(this.field5474.length > var31) {
                     this.field5474[var31].method379(123);
                     ++var31;
                  }

                  int var32 = 33 % ((-85 - arg1) / 33);
                  if (!var10) {
                     return var12;
                  }

                  ++var31;
               }
            }

            ++var11;
         }
      } catch (RuntimeException var34) {
         throw class237.method1823(var34, field5484[5] + (arg0 != null ? field5484[2] : field5484[1]) + ',' + arg1 + ',' + arg2 + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + (arg6 != null ? field5484[2] : field5484[1]) + ',' + arg7 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "c",
      descriptor = "(Z)V",
      line = 161
   )
   public static void method2871(boolean arg0) {
      try {
         field5483 = null;
         if (!arg0) {
            method2872(69, 100, 4, 35, -11, 15, 127);
         }
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5484[9] + arg0 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(IIIIIII)V",
      line = 171
   )
   public static final void method2872(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
      // $FF: Couldn't be decompiled
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(ZLd;Lkf;DIIB)[I",
      line = 305
   )
   public final int[] method2873(boolean arg0, class162 arg1, class266 arg2, double arg3, int arg4, int arg5, byte arg6) {
      boolean var9 = client.field4360;

      try {
         class350.field4713 = arg1;
         class80.field1027 = arg2;
         ++field5473;
         int var10 = 0;
         if (var9) {
            this.field5474[var10].method2016(arg4, (byte)-124, arg5);
            ++var10;
         }

         while(true) {
            while(var10 < this.field5474.length) {
               this.field5474[var10].method2016(arg4, (byte)-124, arg5);
               ++var10;
            }

            class690.method5037((byte)64, arg3);
            class109.method884((byte)-22, arg4, arg5);
            int[] var11 = new int[arg4 * arg5];
            int var12 = 0;
            if (!var9) {
               if (arg6 >= -84) {
                  method2869(true);
               }

               int var28;
               label533: {
                  int var13 = 0;
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  int[] var17;
                  int[][] var18;
                  int[] var19;
                  if (var9) {
                     if (this.field5472.field3637) {
                        var14 = this.field5472.method6(var13, -124);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field5472.method4(var13, (byte)-118);
                           var16 = var18[2];
                           var17 = var18[1];
                           var15 = var18[0];
                           if (arg0) {
                              var12 = var13;
                           }

                           if (this.field5478.field3637) {
                              var19 = this.field5478.method6(var13, -90);
                              if (var9) {
                                 var19 = this.field5478.method4(var13, (byte)-123)[0];
                              }
                           } else {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        } else {
                           if (arg0) {
                              var12 = var13;
                           }

                           if (this.field5478.field3637) {
                              var19 = this.field5478.method6(var13, -90);
                              if (var9) {
                                 var19 = this.field5478.method4(var13, (byte)-123)[0];
                              }
                           } else {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        }
                     } else {
                        var18 = this.field5472.method4(var13, (byte)-118);
                        var16 = var18[2];
                        var17 = var18[1];
                        var15 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (this.field5478.field3637) {
                           var19 = this.field5478.method6(var13, -90);
                           if (var9) {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        } else {
                           var19 = this.field5478.method4(var13, (byte)-123)[0];
                        }
                     }
                  } else if (arg4 <= var13) {
                     var28 = 0;
                     if (!var9) {
                        break label533;
                     }

                     var18 = this.field5472.method4(var13, (byte)-118);
                     var16 = var18[2];
                     var17 = var18[1];
                     var15 = var18[0];
                     if (arg0) {
                        var12 = var13;
                     }

                     if (this.field5478.field3637) {
                        var19 = this.field5478.method6(var13, -90);
                        if (var9) {
                           var19 = this.field5478.method4(var13, (byte)-123)[0];
                        }
                     } else {
                        var19 = this.field5478.method4(var13, (byte)-123)[0];
                     }
                  } else if (this.field5472.field3637) {
                     var14 = this.field5472.method6(var13, -124);
                     var15 = var14;
                     var16 = var14;
                     var17 = var14;
                     if (var9) {
                        var18 = this.field5472.method4(var13, (byte)-118);
                        var16 = var18[2];
                        var17 = var18[1];
                        var15 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (this.field5478.field3637) {
                           var19 = this.field5478.method6(var13, -90);
                           if (var9) {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        } else {
                           var19 = this.field5478.method4(var13, (byte)-123)[0];
                        }
                     } else {
                        if (arg0) {
                           var12 = var13;
                        }

                        if (this.field5478.field3637) {
                           var19 = this.field5478.method6(var13, -90);
                           if (var9) {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        } else {
                           var19 = this.field5478.method4(var13, (byte)-123)[0];
                        }
                     }
                  } else {
                     var18 = this.field5472.method4(var13, (byte)-118);
                     var16 = var18[2];
                     var17 = var18[1];
                     var15 = var18[0];
                     if (arg0) {
                        var12 = var13;
                     }

                     if (this.field5478.field3637) {
                        var19 = this.field5478.method6(var13, -90);
                        if (var9) {
                           var19 = this.field5478.method4(var13, (byte)-123)[0];
                        }
                     } else {
                        var19 = this.field5478.method4(var13, (byte)-123)[0];
                     }
                  }

                  while(true) {
                     int var20 = arg5 + -1;
                     int var21;
                     int var22;
                     int var23;
                     int var24;
                     int var25;
                     int var26;
                     int var27;
                     byte var31;
                     if (var9) {
                        var21 = var15[var20] >> 4;
                        if (var21 > 255) {
                           var21 = 255;
                           if (var21 < 0) {
                              var21 = 0;
                           }
                        } else if (var21 < 0) {
                           var21 = 0;
                        }

                        var22 = var17[var20] >> 4;
                        if (var22 > 255) {
                           var22 = 255;
                           if (~var22 > -1) {
                              var22 = 0;
                           }
                        } else if (~var22 > -1) {
                           var22 = 0;
                        }

                        var23 = var16[var20] >> 4;
                        if (~var23 < -256) {
                           var23 = 255;
                           var24 = class631.field9251[var22];
                           if (~var23 > -1) {
                              var23 = 0;
                           }
                        } else {
                           var24 = class631.field9251[var22];
                           if (~var23 > -1) {
                              var23 = 0;
                           }
                        }

                        var25 = class631.field9251[var21];
                        var26 = class631.field9251[var23];
                        if (~var25 == -1) {
                           if (var24 == 0) {
                              if (~var26 != -1) {
                                 var27 = var19[var20] >> 4;
                                 if (~var27 < -256) {
                                    var27 = 255;
                                 }

                                 if (var27 < 0) {
                                    var27 = 0;
                                    if (var9) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                                 if (arg0) {
                                    var12 += arg5 + -1;
                                 }

                                 --var20;
                              } else {
                                 var31 = 0;
                                 var11[var12++] = (var24 << 8) + (var25 << 16) + (var31 << 24) + var26;
                                 if (arg0) {
                                    var12 += arg5 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (~var27 < -256) {
                                 var27 = 255;
                              }

                              if (var27 < 0) {
                                 var27 = 0;
                                 if (var9) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                              if (arg0) {
                                 var12 += arg5 + -1;
                              }

                              --var20;
                           }
                        } else {
                           var27 = var19[var20] >> 4;
                           if (~var27 < -256) {
                              var27 = 255;
                           }

                           if (var27 < 0) {
                              var27 = 0;
                              if (var9) {
                                 var27 = 0;
                              }
                           }

                           var11[var12++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                           if (arg0) {
                              var12 += arg5 + -1;
                           }

                           --var20;
                        }
                     }

                     while(~var20 <= -1) {
                        var21 = var15[var20] >> 4;
                        if (var21 > 255) {
                           var21 = 255;
                           if (var21 < 0) {
                              var21 = 0;
                           }
                        } else if (var21 < 0) {
                           var21 = 0;
                        }

                        var22 = var17[var20] >> 4;
                        if (var22 > 255) {
                           var22 = 255;
                           if (~var22 > -1) {
                              var22 = 0;
                           }
                        } else if (~var22 > -1) {
                           var22 = 0;
                        }

                        var23 = var16[var20] >> 4;
                        if (~var23 < -256) {
                           var23 = 255;
                           var24 = class631.field9251[var22];
                           if (~var23 > -1) {
                              var23 = 0;
                           }
                        } else {
                           var24 = class631.field9251[var22];
                           if (~var23 > -1) {
                              var23 = 0;
                           }
                        }

                        var25 = class631.field9251[var21];
                        var26 = class631.field9251[var23];
                        if (~var25 == -1) {
                           if (var24 == 0) {
                              if (~var26 != -1) {
                                 var27 = var19[var20] >> 4;
                                 if (~var27 < -256) {
                                    var27 = 255;
                                 }

                                 if (var27 < 0) {
                                    var27 = 0;
                                    if (var9) {
                                       var27 = 0;
                                    }
                                 }

                                 var11[var12++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                                 if (arg0) {
                                    var12 += arg5 + -1;
                                 }

                                 --var20;
                              } else {
                                 var31 = 0;
                                 var11[var12++] = (var24 << 8) + (var25 << 16) + (var31 << 24) + var26;
                                 if (arg0) {
                                    var12 += arg5 + -1;
                                 }

                                 --var20;
                              }
                           } else {
                              var27 = var19[var20] >> 4;
                              if (~var27 < -256) {
                                 var27 = 255;
                              }

                              if (var27 < 0) {
                                 var27 = 0;
                                 if (var9) {
                                    var27 = 0;
                                 }
                              }

                              var11[var12++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                              if (arg0) {
                                 var12 += arg5 + -1;
                              }

                              --var20;
                           }
                        } else {
                           var27 = var19[var20] >> 4;
                           if (~var27 < -256) {
                              var27 = 255;
                           }

                           if (var27 < 0) {
                              var27 = 0;
                              if (var9) {
                                 var27 = 0;
                              }
                           }

                           var11[var12++] = (var24 << 8) + (var25 << 16) + (var27 << 24) + var26;
                           if (arg0) {
                              var12 += arg5 + -1;
                           }

                           --var20;
                        }
                     }

                     ++var13;
                     if (arg4 <= var13) {
                        var28 = 0;
                        if (!var9) {
                           break;
                        }

                        var18 = this.field5472.method4(var13, (byte)-118);
                        var16 = var18[2];
                        var17 = var18[1];
                        var15 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (this.field5478.field3637) {
                           var19 = this.field5478.method6(var13, -90);
                           if (var9) {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        } else {
                           var19 = this.field5478.method4(var13, (byte)-123)[0];
                        }
                     } else if (this.field5472.field3637) {
                        var14 = this.field5472.method6(var13, -124);
                        var15 = var14;
                        var16 = var14;
                        var17 = var14;
                        if (var9) {
                           var18 = this.field5472.method4(var13, (byte)-118);
                           var16 = var18[2];
                           var17 = var18[1];
                           var15 = var18[0];
                           if (arg0) {
                              var12 = var13;
                           }

                           if (this.field5478.field3637) {
                              var19 = this.field5478.method6(var13, -90);
                              if (var9) {
                                 var19 = this.field5478.method4(var13, (byte)-123)[0];
                              }
                           } else {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        } else {
                           if (arg0) {
                              var12 = var13;
                           }

                           if (this.field5478.field3637) {
                              var19 = this.field5478.method6(var13, -90);
                              if (var9) {
                                 var19 = this.field5478.method4(var13, (byte)-123)[0];
                              }
                           } else {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        }
                     } else {
                        var18 = this.field5472.method4(var13, (byte)-118);
                        var16 = var18[2];
                        var17 = var18[1];
                        var15 = var18[0];
                        if (arg0) {
                           var12 = var13;
                        }

                        if (this.field5478.field3637) {
                           var19 = this.field5478.method6(var13, -90);
                           if (var9) {
                              var19 = this.field5478.method4(var13, (byte)-123)[0];
                           }
                        } else {
                           var19 = this.field5478.method4(var13, (byte)-123)[0];
                        }
                     }
                  }
               }

               if (var9) {
                  this.field5474[var28].method379(124);
                  ++var28;
               }

               while(true) {
                  while(var28 < this.field5474.length) {
                     this.field5474[var28].method379(124);
                     ++var28;
                  }

                  if (!var9) {
                     return var11;
                  }

                  ++var28;
               }
            }

            ++var10;
         }
      } catch (RuntimeException var30) {
         throw class237.method1823(var30, field5484[3] + arg0 + ',' + (arg1 != null ? field5484[2] : field5484[1]) + ',' + (arg2 != null ? field5484[2] : field5484[1]) + ',' + arg3 + ',' + arg4 + ',' + arg5 + ',' + arg6 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Ld;IZLkf;II)[F",
      line = 439
   )
   public final float[] method2874(class162 arg0, int arg1, boolean arg2, class266 arg3, int arg4, int arg5) {
      boolean var7 = client.field4360;

      try {
         class350.field4713 = arg0;
         class80.field1027 = arg3;
         ++field5480;
         int var8 = 0;
         if (var7) {
            this.field5474[var8].method2016(arg4, (byte)-124, arg5);
            ++var8;
         }

         while(true) {
            while(var8 < this.field5474.length) {
               this.field5474[var8].method2016(arg4, (byte)-124, arg5);
               ++var8;
            }

            class109.method884((byte)-22, arg4, arg5);
            float[] var9 = new float[arg5 * 4 * arg4];
            int var10 = 0;
            int var11 = 0;
            if (!var7) {
               int var10000;
               int var22;
               if (var7) {
                  var10000 = this.field5472.field3637;
               } else if (~var11 <= ~arg4) {
                  var10000 = arg1;
                  if (!var7) {
                     if (arg1 > -1) {
                        this.method2875((class162)null, (class266)null, -114);
                     }

                     var22 = 0;
                     if (var7) {
                        this.field5474[var22].method379(119);
                        ++var22;
                     }

                     while(true) {
                        while(this.field5474.length > var22) {
                           this.field5474[var22].method379(119);
                           ++var22;
                        }

                        if (!var7) {
                           return var9;
                        }

                        ++var22;
                     }
                  }
               } else {
                  var10000 = this.field5472.field3637;
               }

               while(true) {
                  int[] var13;
                  int[] var14;
                  int[] var15;
                  int[] var16;
                  if (var10000 == 0) {
                     int[][] var12 = this.field5472.method4(var11, (byte)-122);
                     var13 = var12[0];
                     var14 = var12[1];
                     var15 = var12[2];
                     if (var7) {
                        var16 = this.field5472.method6(var11, 99);
                        var13 = var16;
                        var15 = var16;
                        var14 = var16;
                     }
                  } else {
                     var16 = this.field5472.method6(var11, 99);
                     var13 = var16;
                     var15 = var16;
                     var14 = var16;
                  }

                  int[] var17;
                  if (!this.field5478.field3637) {
                     var17 = this.field5478.method4(var11, (byte)-128)[0];
                     if (var7) {
                        var17 = this.field5478.method6(var11, 86);
                     }
                  } else {
                     var17 = this.field5478.method6(var11, 86);
                  }

                  int[] var18;
                  if (!this.field5471.field3637) {
                     var18 = this.field5471.method4(var11, (byte)-125)[0];
                     if (var7) {
                        var18 = this.field5471.method6(var11, 105);
                        if (arg2) {
                           var10 = var11 << 2;
                        }
                     } else if (arg2) {
                        var10 = var11 << 2;
                     }
                  } else {
                     var18 = this.field5471.method6(var11, 105);
                     if (arg2) {
                        var10 = var11 << 2;
                     }
                  }

                  int var19 = arg5 - 1;
                  if (var7 || var19 >= 0) {
                     do {
                        float var20 = (float)var17[var19] / 4096.0F;
                        if (!(var20 < 0.0F)) {
                           if (var20 > 1.0F) {
                              var20 = 1.0F;
                              if (var7) {
                                 var20 = 0.0F;
                              }
                           }
                        } else {
                           var20 = 0.0F;
                        }

                        float var21 = ((float)var18[var19] * 31.0F / 4096.0F + 1.0F) / 4096.0F;
                        var9[var10++] = (float)var13[var19] * var21;
                        var9[var10++] = (float)var14[var19] * var21;
                        var9[var10++] = (float)var15[var19] * var21;
                        var9[var10++] = var20;
                        if (arg2) {
                           var10 += (arg5 << 2) + -4;
                        }

                        --var19;
                     } while(var19 >= 0);
                  }

                  ++var11;
                  if (~var11 <= ~arg4) {
                     var10000 = arg1;
                     if (!var7) {
                        if (arg1 > -1) {
                           this.method2875((class162)null, (class266)null, -114);
                        }

                        var22 = 0;
                        if (var7) {
                           this.field5474[var22].method379(119);
                           ++var22;
                        }

                        while(true) {
                           while(this.field5474.length > var22) {
                              this.field5474[var22].method379(119);
                              ++var22;
                           }

                           if (!var7) {
                              return var9;
                           }

                           ++var22;
                        }
                     }
                  } else {
                     var10000 = this.field5472.field3637;
                  }
               }
            }

            ++var8;
         }
      } catch (RuntimeException var24) {
         throw class237.method1823(var24, field5484[7] + (arg0 != null ? field5484[2] : field5484[1]) + ',' + arg1 + ',' + arg2 + ',' + (arg3 != null ? field5484[2] : field5484[1]) + ',' + arg4 + ',' + arg5 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "a",
      descriptor = "(Ld;Lkf;I)Z",
      line = 553
   )
   public final boolean method2875(class162 arg0, class266 arg1, int arg2) {
      boolean var4 = client.field4360;

      try {
         ++field5477;
         int var5;
         int var6;
         if (~class590.field8701 <= -1) {
            var5 = 0;
            if (var4) {
               if (!arg1.method2036(this.field5469[var5], class590.field8701, 0)) {
                  return false;
               }

               ++var5;
            }

            while(true) {
               while(this.field5469.length > var5) {
                  if (!arg1.method2036(this.field5469[var5], class590.field8701, 0)) {
                     return false;
                  }

                  ++var5;
               }

               if (!var4) {
                  if (var4) {
                     var5 = 0;
                     if (var4) {
                        if (!arg1.method2051(this.field5469[var5], (byte)60)) {
                           return false;
                        }

                        ++var5;
                     }
                  } else {
                     if (!var4) {
                        if (arg2 > -44) {
                           this.method2875((class162)null, (class266)null, -63);
                        }

                        var6 = 0;
                        if (var4) {
                           if (!arg0.method1353(this.field5482[var6], (byte)125)) {
                              return false;
                           }

                           ++var6;
                        }

                        while(true) {
                           while(this.field5482.length > var6) {
                              if (!arg0.method1353(this.field5482[var6], (byte)125)) {
                                 return false;
                              }

                              ++var6;
                           }

                           if (!var4) {
                              return true;
                           }

                           if (false) {
                              return false;
                           }

                           ++var6;
                        }
                     }

                     if (arg2 == 0) {
                        return false;
                     }

                     ++var5;
                  }
                  break;
               }

               ++var5;
            }
         } else {
            var5 = 0;
            if (var4) {
               if (!arg1.method2051(this.field5469[var5], (byte)60)) {
                  return false;
               }

               ++var5;
            }
         }

         while(true) {
            while(~var5 > ~this.field5469.length) {
               if (!arg1.method2051(this.field5469[var5], (byte)60)) {
                  return false;
               }

               ++var5;
            }

            if (!var4) {
               if (arg2 > -44) {
                  this.method2875((class162)null, (class266)null, -63);
               }

               var6 = 0;
               if (var4) {
                  if (!arg0.method1353(this.field5482[var6], (byte)125)) {
                     return false;
                  }

                  ++var6;
               }

               while(true) {
                  while(this.field5482.length > var6) {
                     if (!arg0.method1353(this.field5482[var6], (byte)125)) {
                        return false;
                     }

                     ++var6;
                  }

                  if (!var4) {
                     return true;
                  }

                  if (false) {
                     return false;
                  }

                  ++var6;
               }
            }

            if (arg2 == 0) {
               return false;
            }

            ++var5;
         }
      } catch (RuntimeException var8) {
         throw class237.method1823(var8, field5484[6] + (arg0 != null ? field5484[2] : field5484[1]) + ',' + (arg1 != null ? field5484[2] : field5484[1]) + ',' + arg2 + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "<init>",
      descriptor = "()V",
      line = 615
   )
   public class380() {
      try {
         this.field5482 = new int[0];
         this.field5469 = new int[0];
         this.field5471 = new class103(0);
         this.field5471.field3647 = 1;
         this.field5472 = new class103();
         this.field5472.field3647 = 1;
         this.field5478 = new class103();
         this.field5474 = new class264[]{this.field5472, this.field5478, this.field5471};
         this.field5478.field3647 = 1;
      } catch (RuntimeException var2) {
         throw class237.method1823(var2, field5484[4] + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "<init>",
      descriptor = "(Lwf;)V",
      line = 631
   )
   public class380(class147 arg0) {
      boolean var2 = client.field4360;
      super();

      try {
         int var3;
         int var4;
         int var5;
         int[][] var6;
         byte var10000;
         label97: {
            var3 = arg0.method1143(-15465);
            var4 = 0;
            var5 = 0;
            this.field5474 = new class264[var3];
            var6 = new int[var3][];
            int var7 = 0;
            if (var2) {
               var10000 = 96;
            } else if (~var3 >= ~var7) {
               this.field5469 = new int[var4];
               this.field5482 = new int[var5];
               var4 = 0;
               var5 = 0;
               var10000 = 0;
               if (!var2) {
                  break label97;
               }
            } else {
               var10000 = 96;
            }

            label96:
            while(true) {
               class264 var8 = class554.method3972(var10000, arg0);
               if (var8.method382(true) >= 0) {
                  ++var4;
                  if (var8.method2014((byte)119) >= 0) {
                     ++var5;
                  }
               } else if (var8.method2014((byte)119) >= 0) {
                  ++var5;
               }

               int var9 = var8.field3648.length;
               var6[var7] = new int[var9];
               int var10 = 0;
               if (var2) {
                  var6[var7][var10] = arg0.method1143(-15465);
                  ++var10;
               }

               while(true) {
                  while(~var9 < ~var10) {
                     var6[var7][var10] = arg0.method1143(-15465);
                     ++var10;
                  }

                  this.field5474[var7] = var8;
                  if (!var2) {
                     ++var7;
                     if (~var3 >= ~var7) {
                        this.field5469 = new int[var4];
                        this.field5482 = new int[var5];
                        var4 = 0;
                        var5 = 0;
                        var10000 = 0;
                        if (!var2) {
                           break label96;
                        }
                     } else {
                        var10000 = 96;
                     }
                     break;
                  }

                  ++var10;
               }
            }
         }

         int var11 = var10000;
         class264 var12;
         int var13;
         int var14;
         Object var17;
         class380 var20;
         if (var2) {
            var12 = this.field5474[var11];
            var13 = var12.field3648.length;
            var14 = 0;
            if (var2) {
               var12.field3648[var14] = this.field5474[var6[var11][var14]];
               ++var14;
            }
         } else {
            if (~var11 <= ~var3) {
               this.field5472 = this.field5474[arg0.method1143(-15465)];
               this.field5478 = this.field5474[arg0.method1143(-15465)];
               var20 = this;
               if (!var2) {
                  this.field5471 = this.field5474[arg0.method1143(-15465)];
                  var17 = null;
                  return;
               }
            } else {
               var20 = this;
            }

            var12 = var20.field5474[var11];
            var13 = var12.field3648.length;
            var14 = 0;
            if (var2) {
               var12.field3648[var14] = this.field5474[var6[var11][var14]];
               ++var14;
            }
         }

         while(true) {
            while(~var13 < ~var14) {
               var12.field3648[var14] = this.field5474[var6[var11][var14]];
               ++var14;
            }

            int var15 = var12.method382(true);
            int var16 = var12.method2014((byte)-108);
            if (!var2) {
               if (var15 > 0) {
                  this.field5469[var4++] = var15;
               }

               if (~var16 < -1) {
                  this.field5482[var5++] = var16;
               }

               var6[var11] = null;
               ++var11;
               if (~var11 <= ~var3) {
                  this.field5472 = this.field5474[arg0.method1143(-15465)];
                  this.field5478 = this.field5474[arg0.method1143(-15465)];
                  var20 = this;
                  if (!var2) {
                     this.field5471 = this.field5474[arg0.method1143(-15465)];
                     var17 = null;
                     return;
                  }
               } else {
                  var20 = this;
               }

               var12 = var20.field5474[var11];
               var13 = var12.field3648.length;
               var14 = 0;
               if (var2) {
                  var12.field3648[var14] = this.field5474[var6[var11][var14]];
                  ++var14;
               }
            } else {
               ++var14;
            }
         }
      } catch (RuntimeException var19) {
         throw class237.method1823(var19, field5484[4] + (arg0 != null ? field5484[2] : field5484[1]) + ')');
      }
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "(Ljava/lang/String;)[C"
   )
   private static char[] method2876(String arg0) {
      char[] var10000 = arg0.toCharArray();
      if (var10000.length < 2) {
         var10000[0] = (char)(var10000[0] ^ 56);
      }

      return var10000;
   }

   @OriginalMember(
      owner = "client!oq",
      name = "z",
      descriptor = "([C)Ljava/lang/String;"
   )
   private static String method2877(char[] arg0) {
      int var10002 = arg0.length;
      char[] var10001 = arg0;
      int var10000 = var10002;

      for(int var1 = 0; var10000 > var1; ++var1) {
         char var10004 = var10001[var1];
         byte var10005;
         switch(var1 % 5) {
         case 0:
            var10005 = 99;
            break;
         case 1:
            var10005 = 12;
            break;
         case 2:
            var10005 = 34;
            break;
         case 3:
            var10005 = 113;
            break;
         default:
            var10005 = 56;
         }

         var10001[var1] = (char)(var10004 ^ var10005);
      }

      return (new String(var10001)).intern();
   }
}
